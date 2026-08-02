package xsna;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.common.a;
import com.coremedia.iso.boxes.ChunkOffset64BitBox;
import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.DataEntryUrlBox;
import com.coremedia.iso.boxes.DataInformationBox;
import com.coremedia.iso.boxes.DataReferenceBox;
import com.coremedia.iso.boxes.EditBox;
import com.coremedia.iso.boxes.EditListBox;
import com.coremedia.iso.boxes.FileTypeBox;
import com.coremedia.iso.boxes.HandlerBox;
import com.coremedia.iso.boxes.MediaBox;
import com.coremedia.iso.boxes.MediaHeaderBox;
import com.coremedia.iso.boxes.MediaInformationBox;
import com.coremedia.iso.boxes.MetaBox;
import com.coremedia.iso.boxes.MovieBox;
import com.coremedia.iso.boxes.MovieHeaderBox;
import com.coremedia.iso.boxes.NullMediaHeaderBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SampleSizeBox;
import com.coremedia.iso.boxes.SampleTableBox;
import com.coremedia.iso.boxes.SampleToChunkBox;
import com.coremedia.iso.boxes.SoundMediaHeaderBox;
import com.coremedia.iso.boxes.SyncSampleBox;
import com.coremedia.iso.boxes.TimeToSampleBox;
import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.TrackHeaderBox;
import com.coremedia.iso.boxes.UserDataBox;
import com.coremedia.iso.boxes.VideoMediaHeaderBox;
import com.coremedia.iso.boxes.apple.AppleItemListBox;
import com.coremedia.iso.boxes.fragment.TrackExtendsBox;
import com.coremedia.iso.boxes.sampleentry.AmrSpecificBox;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.facebook.soloader.MinElf;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.googlecode.mp4parser.boxes.apple.PixelAspectRationAtom;
import com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mp4parser.iso14496.part15.AvcConfigurationBox;
import com.mp4parser.iso14496.part15.HevcConfigurationBox;
import io.jsonwebtoken.JwtParser;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.webrtc.stat.call.methods.call_stat.OutgoingAudioStatistics;
import ru.ok.gl.tf.Tensorflow;
import ru.ok.proto.rtmp.amf.AmfConstants;
import xsna.rt50;

/* compiled from: Boxes.java */
/* loaded from: classes12.dex */
public final class ya8 {
    public static final com.google.common.collect.g a = ImmutableList.s((byte) -66, (byte) 122, (byte) -49, (byte) -53, (byte) -105, (byte) -87, (byte) 66, (byte) -24, (byte) -100, (byte) 113, (byte) -103, (byte) -108, (byte) -111, (byte) -29, (byte) -81, (byte) -84);

    public static ByteBuffer a(androidx.media3.common.a aVar) {
        List<byte[]> list = aVar.q;
        fxc0.q(list.size() >= 2, "csd-0 and/or csd-1 not found in the format for avcC box.");
        byte[] bArr = list.get(0);
        fxc0.q(bArr.length > 0, "csd-0 is empty for avcC box.");
        byte[] bArr2 = list.get(1);
        fxc0.q(bArr2.length > 0, "csd-1 is empty for avcC box.");
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        ByteBuffer wrap2 = ByteBuffer.wrap(bArr2);
        ByteBuffer allocate = ByteBuffer.allocate(wrap2.limit() + wrap.limit() + 200);
        allocate.put((byte) 1);
        com.google.common.collect.g a2 = ts2.a(wrap);
        fxc0.q(!a2.isEmpty(), "SPS data not found in csd0 for avcC box.");
        ByteBuffer byteBuffer = (ByteBuffer) a2.get(0);
        int remaining = byteBuffer.remaining();
        byte[] bArr3 = new byte[remaining];
        byteBuffer.get(bArr3);
        byteBuffer.rewind();
        rt50.m k = rt50.k(0, remaining, bArr3);
        allocate.put((byte) k.a);
        allocate.put((byte) k.b);
        allocate.put((byte) k.c);
        allocate.put((byte) -1);
        allocate.put((byte) -31);
        allocate.putShort((short) byteBuffer.remaining());
        allocate.put(byteBuffer);
        byteBuffer.rewind();
        com.google.common.collect.g a3 = ts2.a(wrap2);
        fxc0.A(!a3.isEmpty(), "PPS data not found in csd1 for avcC box.");
        allocate.put((byte) 1);
        ByteBuffer byteBuffer2 = (ByteBuffer) a3.get(0);
        allocate.putShort((short) byteBuffer2.remaining());
        allocate.put(byteBuffer2);
        byteBuffer2.rewind();
        allocate.flip();
        return wlb0.x(AvcConfigurationBox.TYPE, allocate);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static ByteBuffer b(androidx.media3.common.a aVar) {
        char c;
        int i;
        int i2;
        ByteBuffer x;
        int i3;
        int i4;
        int i5;
        String str = aVar.n;
        List<byte[]> list = aVar.q;
        str.getClass();
        byte b = 10;
        byte b2 = 8;
        char c2 = 1;
        switch (str.hashCode()) {
            case -1851077871:
                if (str.equals("video/dolby-vision")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1664118616:
                if (str.equals(MimeTypes.VIDEO_H263)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1662735862:
                if (str.equals(com.unity3d.services.core.device.MimeTypes.VIDEO_AV1)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1606874997:
                if (str.equals(MimeTypes.AUDIO_AMR_WB)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1003765268:
                if (str.equals(MimeTypes.AUDIO_VORBIS)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 187094639:
                if (str.equals(MimeTypes.AUDIO_RAW)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1187890754:
                if (str.equals(MimeTypes.VIDEO_MP4V)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1331836563:
                if (str.equals("video/apv")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 1503095341:
                if (str.equals(MimeTypes.AUDIO_AMR_NB)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1504891608:
                if (str.equals(MimeTypes.AUDIO_OPUS)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 1599127257:
                if (str.equals(MimeTypes.VIDEO_VP9)) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                Pair<Integer, Integer> h = h(aVar);
                fxc0.t(h, "Can't identify Dolby vision profile");
                ByteBuffer k = ((Integer) h.first).intValue() <= 8 ? k(aVar) : a(aVar);
                int intValue = ((Integer) h.first).intValue();
                int intValue2 = ((Integer) h.second).intValue();
                byte[] bArr = tzf.a;
                byte[] bArr2 = new byte[24];
                if (intValue == 8) {
                    i = 4;
                    i2 = 0;
                } else if (intValue == 9) {
                    i = 2;
                    i2 = 1;
                } else {
                    i = 0;
                    i2 = 0;
                }
                bArr2[0] = 1;
                bArr2[1] = 0;
                byte b3 = (byte) ((intValue & 127) << 1);
                bArr2[2] = b3;
                bArr2[2] = (byte) ((b3 | ((intValue2 >> 5) & 1)) & 255);
                byte b4 = (byte) ((intValue2 & 31) << 3);
                bArr2[3] = b4;
                byte b5 = (byte) (b4 | 4);
                bArr2[3] = b5;
                byte b6 = b5;
                bArr2[3] = b6;
                bArr2[3] = (byte) (b6 | 1);
                byte b7 = (byte) (i << 4);
                bArr2[4] = b7;
                bArr2[4] = (byte) (b7 | (i2 << 2));
                int intValue3 = ((Integer) h.first).intValue();
                if (intValue3 == 5) {
                    x = wlb0.x("dvcC", ByteBuffer.wrap(bArr2));
                } else {
                    if (intValue3 != 8 && intValue3 != 9) {
                        throw new IllegalArgumentException(lhg.a(intValue3, "Unsupported Dolby Vision profile "));
                    }
                    x = wlb0.x("dvvC", ByteBuffer.wrap(bArr2));
                }
                return wlb0.e(k, x);
            case 1:
                ByteBuffer allocate = ByteBuffer.allocate(7);
                allocate.put("    ".getBytes(StandardCharsets.UTF_8));
                allocate.put((byte) 0);
                Pair<Integer, Integer> b8 = tzf.b(aVar);
                if (b8 == null) {
                    b8 = new Pair<>(1, 1);
                }
                allocate.put(((Integer) b8.second).byteValue());
                allocate.put(((Integer) b8.first).byteValue());
                allocate.flip();
                return wlb0.x("d263", allocate);
            case 2:
                return wlb0.x("av1C", ByteBuffer.wrap(list.get(0)));
            case 3:
                return k(aVar);
            case 4:
                return d((short) -31745);
            case 5:
            case 6:
                return f(aVar);
            case 7:
                return ByteBuffer.allocate(0);
            case '\b':
                return f(aVar);
            case '\t':
                fxc0.q(!list.isEmpty(), "csd-0 is not found in the format for apvC box");
                byte[] bArr3 = list.get(0);
                fxc0.q(bArr3.length > 0, "csd-0 is empty for apvC box.");
                ByteBuffer allocate2 = ByteBuffer.allocate(bArr3.length + 4);
                allocate2.putInt(0);
                allocate2.put(bArr3);
                allocate2.flip();
                return wlb0.x("apvC", allocate2);
            case '\n':
                return a(aVar);
            case 11:
                return d((short) -32257);
            case '\f':
                fxc0.q(!list.isEmpty(), "csd-0 not found in the format for dOps box.");
                byte[] bArr4 = list.get(0);
                fxc0.q(bArr4.length >= 8, "As csd0 contains 'OpusHead' in first 8 bytes, csd0 length should be greater than 8");
                ByteBuffer allocate3 = ByteBuffer.allocate(bArr4.length);
                allocate3.put(bArr4, 8, bArr4.length - 8);
                allocate3.flip();
                return wlb0.x("dOps", allocate3);
            case '\r':
                m6g m6gVar = aVar.D;
                fxc0.q(!list.isEmpty(), "csd-0 is not found in the format for vpcC box");
                byte[] bArr5 = list.get(0);
                fxc0.q(bArr5.length > 3, "csd-0 for vp9 is invalid.");
                if (ipx.t(bArr5) == 16777216) {
                    return wlb0.x("vpcC", ByteBuffer.wrap(bArr5));
                }
                ByteBuffer allocate4 = ByteBuffer.allocate(200);
                allocate4.putInt(C.DEFAULT_MUXED_BUFFER_SIZE);
                if (m6gVar == null || (i3 = m6gVar.b) == -1) {
                    i3 = 0;
                }
                byte b9 = 0;
                byte b10 = 0;
                for (int i6 = 0; i6 < bArr5.length; i6 += 3) {
                    byte b11 = bArr5[i6];
                    int i7 = i6 + 2;
                    if (b11 == 1) {
                        b9 = bArr5[i7];
                    } else if (b11 == 2) {
                        b = bArr5[i7];
                    } else if (b11 == 3) {
                        b2 = bArr5[i7];
                    } else if (b11 == 4) {
                        b10 = bArr5[i7];
                    }
                }
                ByteBuffer allocate5 = ByteBuffer.allocate(3);
                allocate5.put(b9);
                allocate5.put(b);
                allocate5.put((byte) ((b2 << 4) | (b10 << 1) | i3));
                allocate5.flip();
                allocate4.put(allocate5);
                if (m6gVar != null) {
                    int i8 = m6gVar.a;
                    char c3 = i8 != 2 ? i8 != 6 ? (char) 1 : '\t' : (char) 5;
                    i4 = m6g.d(m6gVar.c);
                    i5 = i8 != 2 ? i8 != 6 ? 1 : 9 : 6;
                    c2 = c3;
                } else {
                    i4 = 1;
                    i5 = 1;
                }
                allocate4.put((byte) c2);
                allocate4.put((byte) i4);
                allocate4.put((byte) i5);
                allocate4.putShort((short) 0);
                allocate4.flip();
                return wlb0.x("vpcC", allocate4);
            default:
                throw new IllegalArgumentException("Unsupported format: ".concat(str));
        }
    }

    public static String c(androidx.media3.common.a aVar) {
        String str;
        int i;
        str = aVar.n;
        i = aVar.H;
        str.getClass();
        switch (str) {
            case "video/dolby-vision":
                Pair<Integer, Integer> h = h(aVar);
                fxc0.t(h, "Dolby Vision profile and level is not found.");
                int intValue = ((Integer) h.first).intValue();
                if (intValue == 5) {
                    return "dvh1";
                }
                if (intValue == 8) {
                    return VisualSampleEntry.TYPE6;
                }
                if (intValue == 9) {
                    return VisualSampleEntry.TYPE3;
                }
                throw new IllegalArgumentException("Unsupported profile " + h.first + " for format: " + str);
            case "video/3gpp":
                return VisualSampleEntry.TYPE2;
            case "video/av01":
                return "av01";
            case "video/hevc":
                return VisualSampleEntry.TYPE6;
            case "audio/amr-wb":
                return AudioSampleEntry.TYPE2;
            case "audio/vorbis":
            case "audio/mp4a-latm":
                return AudioSampleEntry.TYPE3;
            case "audio/raw":
                if (i == 2) {
                    return "sowt";
                }
                if (i == 268435456) {
                    return "twos";
                }
                throw new IllegalArgumentException(lhg.a(i, "Unsupported PCM encoding: "));
            case "video/mp4v-es":
                return "mp4v-es";
            case "video/apv":
                return "apv1";
            case "video/avc":
                return VisualSampleEntry.TYPE3;
            case "audio/3gpp":
                return AudioSampleEntry.TYPE1;
            case "audio/opus":
                return "Opus";
            case "video/x-vnd.on2.vp9":
                return "vp09";
            default:
                throw new IllegalArgumentException("Unsupported format: ".concat(str));
        }
    }

    public static ByteBuffer d(short s) {
        ByteBuffer allocate = ByteBuffer.allocate(200);
        allocate.put("    ".getBytes(StandardCharsets.UTF_8));
        allocate.put((byte) 0);
        allocate.putShort(s);
        allocate.put((byte) 0);
        allocate.put((byte) 1);
        allocate.flip();
        return wlb0.x(AmrSpecificBox.TYPE, allocate);
    }

    public static ByteBuffer e(long j, long j2) {
        ByteBuffer allocate = ByteBuffer.allocate(20);
        allocate.putLong(j);
        allocate.putLong(j2);
        allocate.putShort((short) 1);
        allocate.putShort((short) 0);
        allocate.flip();
        return allocate;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static ByteBuffer f(androidx.media3.common.a aVar) {
        byte b;
        byte b2;
        ByteBuffer wrap;
        byte b3;
        Byte b4;
        List<byte[]> list = aVar.q;
        fxc0.q(!list.isEmpty(), "csd-0 not found in the format for esds box.");
        byte[] bArr = list.get(0);
        fxc0.q(bArr.length > 0, "csd-0 is empty for esds box.");
        String str = aVar.n;
        str.getClass();
        if (str.equals(MimeTypes.AUDIO_VORBIS)) {
            byte[] bArr2 = tzf.a;
            fxc0.q(list.size() > 1, "csd-0 and csd-1 must be present for Vorbis.");
            byte[] bArr3 = list.get(0);
            byte[] bArr4 = list.get(1);
            int length = bArr3.length;
            int length2 = bArr4.length;
            int i = length / 255;
            byte[] bArr5 = new byte[i + 1];
            Arrays.fill(bArr5, (byte) -1);
            b2 = 3;
            bArr5[i] = (byte) (length % 255);
            byte[] bArr6 = {(byte) 23};
            Arrays.fill(bArr6, (byte) -1);
            b = 1;
            wrap = ByteBuffer.allocate(i + 3 + length + 23 + length2);
            wrap.put((byte) 2);
            wrap.put(bArr5);
            wrap.put(bArr6);
            wrap.put(bArr3);
            wrap.put(new byte[]{3, 118, 111, 114, 98, 105, 115, 7, 0, 0, 0, 97, 110, 100, 114, 111, 105, 100, 0, 0, 0, 0, 1});
            wrap.put(bArr4);
            wrap.flip();
        } else {
            b = 1;
            b2 = 3;
            wrap = ByteBuffer.wrap(bArr);
        }
        int i2 = aVar.i;
        int i3 = aVar.h;
        boolean p = io20.p(str);
        int remaining = wrap.remaining();
        ByteBuffer i4 = i(remaining);
        ByteBuffer i5 = i(i4.remaining() + remaining + 14);
        ByteBuffer i6 = i(i5.remaining() + i4.remaining() + remaining + 21);
        ByteBuffer allocate = ByteBuffer.allocate(remaining + 200);
        allocate.putInt(0);
        allocate.put(b2);
        allocate.put(i6);
        allocate.putShort((short) 0);
        allocate.put(p ? (byte) 31 : (byte) 0);
        allocate.put((byte) 4);
        allocate.put(i5);
        switch (str.hashCode()) {
            case -1003765268:
                if (str.equals(MimeTypes.AUDIO_VORBIS)) {
                    b3 = 0;
                    break;
                }
                b3 = -1;
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    b3 = b;
                    break;
                }
                b3 = -1;
                break;
            case 1187890754:
                if (str.equals(MimeTypes.VIDEO_MP4V)) {
                    b3 = 2;
                    break;
                }
                b3 = -1;
                break;
            default:
                b3 = -1;
                break;
        }
        switch (b3) {
            case 0:
                b4 = (byte) -35;
                break;
            case 1:
                b4 = (byte) 64;
                break;
            case 2:
                b4 = (byte) 32;
                break;
            default:
                b4 = null;
                break;
        }
        b4.getClass();
        allocate.put(b4.byteValue());
        allocate.put((byte) ((p ? 16 : 20) | 1));
        allocate.putShort((short) (((p ? 96000 : Tensorflow.FRAME_HEIGHT) >> 8) & MinElf.PN_XNUM));
        allocate.put((byte) 0);
        if (i2 == -1) {
            i2 = 0;
        }
        allocate.putInt(i2);
        allocate.putInt(i3 != -1 ? i3 : 0);
        allocate.put((byte) 5);
        allocate.put(i4);
        allocate.put(wrap);
        wrap.rewind();
        allocate.put((byte) 6);
        allocate.put(b);
        allocate.put((byte) 2);
        allocate.flip();
        return wlb0.x(ESDescriptorBox.TYPE, allocate);
    }

    public static ByteBuffer g() {
        ArrayList arrayList = new ArrayList();
        String str = y2r0.a;
        arrayList.add(ByteBuffer.wrap("isom".getBytes(StandardCharsets.UTF_8)));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(131072);
        allocate.flip();
        arrayList.add(allocate);
        String[] strArr = {"isom", "iso2", "mp41"};
        for (int i = 0; i < 3; i++) {
            arrayList.add(ByteBuffer.wrap(strArr[i].getBytes(StandardCharsets.UTF_8)));
        }
        return wlb0.w(FileTypeBox.TYPE, arrayList);
    }

    @Nullable
    public static Pair<Integer, Integer> h(androidx.media3.common.a aVar) {
        String str = aVar.k;
        fxc0.t(str, "Codec string is null for Dolby Vision format.");
        List<String> c = vlk0.a(JwtParser.SEPARATOR_CHAR).c(str);
        if (c.size() < 3) {
            ahn.F("Invalid Dolby Vision codec string: ".concat(str));
            return null;
        }
        return Pair.create(Integer.valueOf(Integer.parseInt(c.get(1))), Integer.valueOf(Integer.parseInt(c.get(2))));
    }

    public static ByteBuffer i(int i) {
        ArrayDeque arrayDeque = new ArrayDeque();
        int i2 = 0;
        while (true) {
            arrayDeque.push(Byte.valueOf((byte) (i2 | (i & 127))));
            i >>= 7;
            if (i <= 0) {
                break;
            }
            i2 = 128;
        }
        ByteBuffer allocate = ByteBuffer.allocate(arrayDeque.size());
        while (!arrayDeque.isEmpty()) {
            allocate.put(((Byte) arrayDeque.removeFirst()).byteValue());
        }
        allocate.flip();
        return allocate;
    }

    public static ByteBuffer j(String str, String str2) {
        ByteBuffer allocate = ByteBuffer.allocate(200);
        allocate.putInt(0);
        allocate.putInt(0);
        String str3 = y2r0.a;
        Charset charset = StandardCharsets.UTF_8;
        allocate.put(str.getBytes(charset));
        allocate.putInt(0);
        allocate.putInt(0);
        allocate.putInt(0);
        allocate.put(str2.getBytes(charset));
        allocate.put((byte) 0);
        allocate.flip();
        return wlb0.x(HandlerBox.TYPE, allocate);
    }

    public static ByteBuffer k(androidx.media3.common.a aVar) {
        List<byte[]> list = aVar.q;
        fxc0.q(!list.isEmpty(), "csd-0 not found in the format for hvcC box.");
        byte[] bArr = list.get(0);
        fxc0.q(bArr.length > 0, "csd-0 is empty for hvcC box.");
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        ByteBuffer allocate = ByteBuffer.allocate(wrap.limit() + 200);
        com.google.common.collect.g a2 = ts2.a(wrap);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < a2.e; i++) {
            ByteBuffer byteBuffer = (ByteBuffer) a2.get(i);
            ByteBuffer allocate2 = ByteBuffer.allocate(byteBuffer.limit());
            int i2 = 0;
            for (int i3 = 0; i3 < byteBuffer.limit(); i3++) {
                if (byteBuffer.get(i3) != 3 || i2 < 2) {
                    allocate2.put(byteBuffer.get(i3));
                }
                i2 = byteBuffer.get(i3) == 0 ? i2 + 1 : 0;
            }
            allocate2.flip();
            arrayList.add(allocate2);
        }
        allocate.put((byte) 1);
        ByteBuffer byteBuffer2 = (ByteBuffer) arrayList.get(0);
        if (byteBuffer2.get(byteBuffer2.position()) != 64) {
            throw new IllegalArgumentException("First NALU in csd-0 is not the VPS.");
        }
        allocate.put(byteBuffer2.get(6));
        allocate.putInt(byteBuffer2.getInt(7));
        allocate.putInt(byteBuffer2.getInt(11));
        allocate.putShort(byteBuffer2.getShort(15));
        allocate.put(byteBuffer2.get(17));
        allocate.putShort((short) -4096);
        allocate.put((byte) -4);
        int i4 = a2.e;
        ByteBuffer byteBuffer3 = (ByteBuffer) a2.get(1);
        int remaining = byteBuffer3.remaining();
        byte[] bArr2 = new byte[remaining];
        byteBuffer3.get(bArr2);
        byteBuffer3.rewind();
        rt50.h i5 = rt50.i(bArr2, 0, remaining, null);
        byte b = (byte) (i5.c | 252);
        byte b2 = (byte) (i5.d | 248);
        byte b3 = (byte) (i5.e | 248);
        allocate.put(b);
        allocate.put(b2);
        allocate.put(b3);
        allocate.putShort((short) 0);
        allocate.put(AmfConstants.TYPE_XML_DOCUMENT_MARKER);
        allocate.put((byte) i4);
        for (int i6 = 0; i6 < i4; i6++) {
            ByteBuffer byteBuffer4 = (ByteBuffer) a2.get(i6);
            allocate.put((byte) ((byteBuffer4.get(0) >> 1) & 63));
            allocate.putShort((short) 1);
            allocate.putShort((short) byteBuffer4.limit());
            allocate.put(byteBuffer4);
        }
        allocate.flip();
        return wlb0.x(HevcConfigurationBox.TYPE, allocate);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0745  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0749  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0768  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0771  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x07f3  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x07cd  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x076b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0733  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01c7 A[LOOP:2: B:39:0x01c1->B:41:0x01c7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0380 A[LOOP:4: B:71:0x037a->B:73:0x0380, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0403 A[LOOP:6: B:86:0x03fd->B:88:0x0403, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ByteBuffer l(ArrayList arrayList, ki20 ki20Var) {
        ByteBuffer x;
        int i;
        ByteBuffer w;
        long j;
        String str;
        int i2;
        HashSet hashSet;
        String str2;
        ArrayList arrayList2;
        int i3;
        String str3;
        long j2;
        int i4;
        long j3;
        int i5;
        int i6;
        ByteBuffer x2;
        int i7;
        ByteBuffer allocate;
        int i8;
        ByteBuffer x3;
        ArrayList arrayList3;
        int i9;
        ByteBuffer x4;
        int i10;
        ByteBuffer x5;
        String str4;
        ByteBuffer w2;
        String str5;
        ki20 ki20Var2;
        ByteBuffer byteBuffer;
        String str6;
        int i11;
        int i12;
        int i13;
        byte[] h0;
        long j4;
        int i14;
        ByteBuffer allocate2;
        short s;
        short s2;
        ArrayList arrayList4;
        ArrayList arrayList5;
        int i15;
        int i16;
        ByteBuffer allocate3;
        ArrayList arrayList6;
        ArrayList arrayList7 = arrayList;
        yf30 yf30Var = ki20Var.d;
        HashSet hashSet2 = ki20Var.c;
        int i17 = (int) yf30Var.a;
        int i18 = (int) yf30Var.b;
        long j5 = Long.MAX_VALUE;
        for (int i19 = 0; i19 < arrayList7.size(); i19++) {
            tep0 tep0Var = (tep0) arrayList7.get(i19);
            if (!tep0Var.b.isEmpty()) {
                j5 = Math.min(((dm8) tep0Var.b.get(0)).a, j5);
            }
        }
        if (j5 == Long.MAX_VALUE) {
            j5 = -9223372036854775807L;
        }
        if (j5 == C.TIME_UNSET) {
            return ByteBuffer.allocate(0);
        }
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        int i20 = 0;
        int i21 = 1;
        long j6 = 0;
        while (true) {
            String str7 = null;
            if (i20 >= arrayList7.size()) {
                HashSet hashSet3 = hashSet2;
                ArrayList arrayList10 = arrayList8;
                int i22 = i21;
                ByteBuffer allocate4 = ByteBuffer.allocate(200);
                allocate4.putInt(0);
                allocate4.putInt(i17);
                allocate4.putInt(i18);
                allocate4.putInt(10000);
                allocate4.putInt((int) n(j6, 10000L));
                allocate4.putInt(65536);
                allocate4.putShort((short) 256);
                allocate4.putShort((short) 0);
                allocate4.putInt(0);
                allocate4.putInt(0);
                int[] iArr = {65536, 0, 0, 0, 65536, 0, 0, 0, 1073741824};
                for (int i23 = 0; i23 < 9; i23++) {
                    allocate4.putInt(iArr[i23]);
                }
                for (int i24 = 0; i24 < 6; i24++) {
                    allocate4.putInt(0);
                }
                allocate4.putInt(i22);
                allocate4.flip();
                ByteBuffer x6 = wlb0.x(MovieHeaderBox.TYPE, allocate4);
                vf30 vf30Var = ki20Var.b;
                if (vf30Var == null) {
                    x = ByteBuffer.allocate(0);
                } else {
                    Object[] objArr = {Float.valueOf(vf30Var.a), Float.valueOf(vf30Var.b)};
                    String str8 = y2r0.a;
                    String format = String.format(Locale.US, "%+.4f%+.4f/", objArr);
                    ByteBuffer allocate5 = ByteBuffer.allocate(format.length() + 4);
                    allocate5.putShort((short) (allocate5.capacity() - 4));
                    allocate5.putShort((short) 5575);
                    allocate5.put(format.getBytes(StandardCharsets.UTF_8));
                    fxc0.z(allocate5.limit() == allocate5.capacity());
                    allocate5.flip();
                    x = wlb0.x(UserDataBox.TYPE, wlb0.y(allocate5, new byte[]{-87, 120, 121, 122}));
                }
                if (hashSet3.isEmpty()) {
                    w = ByteBuffer.allocate(0);
                    i = 0;
                } else {
                    ByteBuffer j7 = j("mdta", "");
                    hashSet3.getClass();
                    ArrayList arrayList11 = new ArrayList(hashSet3);
                    int i25 = 0;
                    for (int i26 = 0; i26 < arrayList11.size(); i26++) {
                        i25 = k73.a(8, i25, ((vo10) arrayList11.get(i26)).a);
                    }
                    ByteBuffer allocate6 = ByteBuffer.allocate(i25 + 8);
                    i = 0;
                    allocate6.putInt(0);
                    allocate6.putInt(arrayList11.size());
                    for (int i27 = 0; i27 < arrayList11.size(); i27++) {
                        String str9 = ((vo10) arrayList11.get(i27)).a;
                        String str10 = y2r0.a;
                        allocate6.put(wlb0.x("mdta", ByteBuffer.wrap(str9.getBytes(StandardCharsets.UTF_8))));
                    }
                    allocate6.flip();
                    ByteBuffer x7 = wlb0.x(ApiProtocol.PARAM_KEYS, allocate6);
                    hashSet3.getClass();
                    ArrayList arrayList12 = new ArrayList(hashSet3);
                    int i28 = 0;
                    for (int i29 = 0; i29 < arrayList12.size(); i29++) {
                        i28 += ((vo10) arrayList12.get(i29)).b.length + 24;
                    }
                    ByteBuffer allocate7 = ByteBuffer.allocate(i28);
                    int i30 = 0;
                    while (i30 < arrayList12.size()) {
                        int i31 = i30 + 1;
                        vo10 vo10Var = (vo10) arrayList12.get(i30);
                        ByteBuffer allocate8 = ByteBuffer.allocate(vo10Var.b.length + 8);
                        allocate8.putInt(vo10Var.d);
                        allocate8.putInt(vo10Var.c);
                        allocate8.put(vo10Var.b);
                        allocate8.flip();
                        ByteBuffer x8 = wlb0.x("data", allocate8);
                        allocate7.putInt(x8.remaining() + 8);
                        allocate7.putInt(i31);
                        allocate7.put(x8);
                        i30 = i31;
                    }
                    allocate7.flip();
                    w = wlb0.w(MetaBox.TYPE, Arrays.asList(j7, x7, wlb0.x(AppleItemListBox.TYPE, allocate7)));
                }
                ArrayList arrayList13 = new ArrayList();
                arrayList13.add(x6);
                arrayList13.add(x);
                arrayList13.add(w);
                arrayList13.addAll(arrayList10);
                ByteBuffer w3 = wlb0.w(MovieBox.TYPE, arrayList13);
                if (ki20Var.e == null) {
                    return w3;
                }
                ByteBuffer wrap = ByteBuffer.wrap(null);
                fxc0.p(wrap.remaining() > 0 ? 1 : i);
                Object[] array = a.toArray(ImmutableCollection.b);
                int length = array.length;
                byte[] bArr = new byte[length];
                for (int i32 = i; i32 < length; i32++) {
                    Object obj = array[i32];
                    obj.getClass();
                    bArr[i32] = ((Number) obj).byteValue();
                }
                return wlb0.e(w3, wlb0.w("uuid", ImmutableList.q(ByteBuffer.wrap(bArr), wrap)));
            }
            tep0 tep0Var2 = (tep0) arrayList7.get(i20);
            if (tep0Var2.b.isEmpty()) {
                hashSet = hashSet2;
                arrayList4 = arrayList8;
                arrayList5 = arrayList9;
                j = j5;
                i2 = i20;
                i13 = i18;
                i12 = i17;
            } else {
                androidx.media3.common.a aVar = tep0Var2.a;
                ArrayList arrayList14 = tep0Var2.c;
                ArrayList arrayList15 = tep0Var2.b;
                if (Objects.equals(aVar.n, com.unity3d.services.core.device.MimeTypes.VIDEO_AV1) && aVar.q.isEmpty()) {
                    a.C0043a a2 = aVar.a();
                    byte[] bArr2 = tep0Var2.h;
                    bArr2.getClass();
                    a2.p = ImmutableList.p(bArr2);
                    aVar = new androidx.media3.common.a(a2);
                }
                String str11 = aVar.d;
                int i33 = aVar.v;
                int i34 = aVar.u;
                j = j5;
                String str12 = aVar.n;
                if (str11 != null) {
                    Locale forLanguageTag = Locale.forLanguageTag(str11);
                    if (forLanguageTag.getISO3Language().isEmpty()) {
                        str = str11;
                        i2 = i20;
                        int a3 = tep0Var2.a();
                        ArrayList arrayList16 = arrayList8;
                        ArrayList arrayList17 = arrayList9;
                        long j8 = tep0Var2.i;
                        hashSet = hashSet2;
                        str2 = str;
                        ArrayList arrayList18 = new ArrayList(arrayList15.size());
                        int i35 = i21;
                        arrayList2 = new ArrayList(arrayList15.size());
                        int i36 = i18;
                        if (arrayList15.isEmpty()) {
                            long j9 = 0;
                            int i37 = 0;
                            boolean z = false;
                            while (i37 < arrayList15.size()) {
                                int i38 = i37;
                                long j10 = ((dm8) arrayList15.get(i37)).a;
                                arrayList18.add(Long.valueOf(j10));
                                if (j10 < j9) {
                                    z = true;
                                }
                                i37 = i38 + 1;
                                j9 = j10;
                            }
                            if (z) {
                                Collections.sort(arrayList18);
                            }
                            long longValue = ((Long) arrayList18.get(0)).longValue();
                            i3 = i17;
                            int i39 = 1;
                            while (true) {
                                str3 = str12;
                                if (i39 >= arrayList18.size()) {
                                    break;
                                }
                                long longValue2 = ((Long) arrayList18.get(i39)).longValue();
                                ArrayList arrayList19 = arrayList18;
                                long n = n(longValue2 - longValue, a3);
                                fxc0.A(n <= 2147483647L, "Only 32-bit sample duration is allowed");
                                i39 = tv4.a(arrayList2, (int) n, i39, 1);
                                str12 = str3;
                                longValue = longValue2;
                                arrayList18 = arrayList19;
                            }
                            if (j8 != C.TIME_UNSET) {
                                long j11 = a3;
                                j2 = n(j8, j11) - n(longValue, j11);
                                fxc0.A(j2 <= 2147483647L, "Only 32-bit sample duration is allowed");
                            } else {
                                j2 = -1;
                            }
                            int i40 = (int) j2;
                            if (i40 == -1) {
                                i40 = arrayList2.size() < 2 ? 0 : ((Integer) sd9.k(arrayList2)).intValue();
                            }
                            arrayList2.add(Integer.valueOf(i40));
                        } else {
                            i3 = i17;
                            str3 = str12;
                        }
                        long j12 = 0;
                        for (i4 = 0; i4 < arrayList2.size(); i4++) {
                            j12 += ((Integer) arrayList2.get(i4)).intValue();
                        }
                        j3 = !arrayList15.isEmpty() ? 0L : ((dm8) arrayList15.get(0)).a;
                        long d0 = y2r0.d0(j12, 1000000L, tep0Var2.a(), RoundingMode.HALF_UP);
                        long j13 = j12;
                        if (j3 < 0) {
                            d0 -= Math.abs(j3);
                        }
                        i5 = io20.i(str3);
                        ByteBuffer allocate9 = ByteBuffer.allocate((arrayList2.size() * 8) + 200);
                        allocate9.putInt(0);
                        long j14 = j3;
                        int position = allocate9.position();
                        allocate9.putInt(0);
                        i6 = 0;
                        int i41 = -1;
                        int i42 = 0;
                        long j15 = -1;
                        while (i6 < arrayList2.size()) {
                            int intValue = ((Integer) arrayList2.get(i6)).intValue();
                            long j16 = d0;
                            int i43 = i6;
                            long j17 = intValue;
                            if (j15 != j17) {
                                i41 = allocate9.position();
                                allocate9.putInt(1);
                                allocate9.putInt(intValue);
                                i42++;
                                j15 = j17;
                            } else {
                                allocate9.putInt(i41, allocate9.getInt(i41) + 1);
                            }
                            i6 = i43 + 1;
                            d0 = j16;
                        }
                        long j18 = d0;
                        allocate9.putInt(position, i42);
                        allocate9.flip();
                        x2 = wlb0.x(TimeToSampleBox.TYPE, allocate9);
                        if (io20.p(str3)) {
                            i7 = 0;
                            allocate = ByteBuffer.allocate(0);
                        } else {
                            int a4 = tep0Var2.a();
                            ArrayList arrayList20 = new ArrayList(arrayList15.size());
                            if (arrayList15.isEmpty()) {
                                arrayList6 = arrayList20;
                            } else {
                                long j19 = ((dm8) arrayList15.get(0)).a;
                                long j20 = 0;
                                long j21 = 0;
                                boolean z2 = false;
                                int i44 = 0;
                                while (i44 < arrayList15.size()) {
                                    ArrayList arrayList21 = arrayList20;
                                    long j22 = ((dm8) arrayList15.get(i44)).a - j19;
                                    long j23 = j19;
                                    long n2 = n(j22, a4) - j20;
                                    int i45 = a4;
                                    fxc0.A(n2 <= 2147483647L, "Only 32-bit composition offset is allowed");
                                    j20 += ((Integer) arrayList2.get(i44)).intValue();
                                    arrayList21.add(Integer.valueOf((int) n2));
                                    if (j22 < j21) {
                                        z2 = true;
                                    }
                                    i44++;
                                    arrayList20 = arrayList21;
                                    j19 = j23;
                                    a4 = i45;
                                    j21 = j22;
                                }
                                arrayList6 = arrayList20;
                                if (!z2) {
                                    arrayList6.clear();
                                }
                            }
                            if (arrayList6.isEmpty()) {
                                allocate = ByteBuffer.allocate(0);
                            } else {
                                ByteBuffer allocate10 = ByteBuffer.allocate((arrayList6.size() * 8) + 8);
                                allocate10.putInt(C.DEFAULT_MUXED_BUFFER_SIZE);
                                int position2 = allocate10.position();
                                allocate10.putInt(0);
                                int i46 = 0;
                                int i47 = -1;
                                int i48 = -1;
                                for (int i49 = 0; i49 < arrayList6.size(); i49++) {
                                    int intValue2 = ((Integer) arrayList6.get(i49)).intValue();
                                    if (i47 != intValue2) {
                                        int position3 = allocate10.position();
                                        allocate10.putInt(1);
                                        allocate10.putInt(intValue2);
                                        i46++;
                                        i48 = position3;
                                        i47 = intValue2;
                                    } else {
                                        allocate10.putInt(i48, allocate10.getInt(i48) + 1);
                                    }
                                }
                                allocate10.putInt(position2, i46);
                                allocate10.flip();
                                allocate = wlb0.x(CompositionTimeToSample.TYPE, allocate10);
                            }
                            i7 = 0;
                        }
                        ByteBuffer byteBuffer2 = allocate;
                        ByteBuffer allocate11 = ByteBuffer.allocate((arrayList15.size() * 4) + 200);
                        allocate11.putInt(i7);
                        allocate11.putInt(i7);
                        allocate11.putInt(arrayList15.size());
                        for (i8 = 0; i8 < arrayList15.size(); i8++) {
                            allocate11.putInt(((dm8) arrayList15.get(i8)).b);
                        }
                        allocate11.flip();
                        x3 = wlb0.x(SampleSizeBox.TYPE, allocate11);
                        arrayList3 = tep0Var2.d;
                        ByteBuffer allocate12 = ByteBuffer.allocate((arrayList3.size() * 12) + 200);
                        allocate12.putInt(0);
                        int position4 = allocate12.position();
                        allocate12.putInt(0);
                        int i50 = 1;
                        int i51 = 0;
                        int i52 = -1;
                        for (i9 = 0; i9 < arrayList3.size(); i9++) {
                            int intValue3 = ((Integer) arrayList3.get(i9)).intValue();
                            if (intValue3 != i52) {
                                allocate12.putInt(i50);
                                allocate12.putInt(intValue3);
                                allocate12.putInt(1);
                                i51++;
                                i52 = intValue3;
                            }
                            i50++;
                        }
                        allocate12.putInt(position4, i51);
                        allocate12.flip();
                        x4 = wlb0.x(SampleToChunkBox.TYPE, allocate12);
                        ByteBuffer allocate13 = ByteBuffer.allocate((arrayList14.size() * 8) + 8);
                        allocate13.putInt(0);
                        allocate13.putInt(arrayList14.size());
                        for (i10 = 0; i10 < arrayList14.size(); i10++) {
                            allocate13.putLong(((Long) arrayList14.get(i10)).longValue());
                        }
                        allocate13.flip();
                        x5 = wlb0.x(ChunkOffset64BitBox.TYPE, allocate13);
                        if (i5 != -1 || i5 == 5) {
                            ByteBuffer allocate14 = ByteBuffer.allocate(200);
                            allocate14.putInt(0);
                            allocate14.flip();
                            ByteBuffer x9 = wlb0.x(NullMediaHeaderBox.TYPE, allocate14);
                            ByteBuffer allocate15 = ByteBuffer.allocate(200);
                            str3.getClass();
                            String str13 = y2r0.a;
                            str4 = str3;
                            byte[] bytes = str4.getBytes(StandardCharsets.UTF_8);
                            allocate15.put(bytes);
                            allocate15.put((byte) 0);
                            allocate15.put(bytes);
                            allocate15.put((byte) 0);
                            allocate15.flip();
                            w2 = wlb0.w(SampleTableBox.TYPE, Arrays.asList(m(wlb0.x("mett", allocate15)), x2, x3, x4, x5));
                            str5 = "MetaHandle";
                            ki20Var2 = ki20Var;
                            byteBuffer = x9;
                            str6 = MetaBox.TYPE;
                        } else {
                            if (i5 == 1) {
                                ByteBuffer allocate16 = ByteBuffer.allocate(200);
                                allocate16.putInt(0);
                                allocate16.putShort((short) 0);
                                allocate16.putShort((short) 0);
                                allocate16.flip();
                                ByteBuffer x10 = wlb0.x(SoundMediaHeaderBox.TYPE, allocate16);
                                String c = c(aVar);
                                ByteBuffer b = b(aVar);
                                ByteBuffer allocate17 = ByteBuffer.allocate(b.remaining() + 200);
                                allocate17.putInt(0);
                                allocate17.putShort((short) 0);
                                allocate17.putShort((short) 1);
                                allocate17.putInt(0);
                                allocate17.putInt(0);
                                allocate17.putShort((short) aVar.F);
                                allocate17.putShort((short) 16);
                                allocate17.putShort((short) 0);
                                allocate17.putShort((short) 0);
                                allocate17.putInt(aVar.G << 16);
                                allocate17.put(b);
                                allocate17.flip();
                                w2 = wlb0.w(SampleTableBox.TYPE, Arrays.asList(m(wlb0.x(c, allocate17)), x2, x3, x4, x5));
                                str6 = "soun";
                                str5 = "SoundHandle";
                                ki20Var2 = ki20Var;
                                byteBuffer = x10;
                            } else {
                                if (i5 != 2) {
                                    throw new IllegalArgumentException("Unsupported track type");
                                }
                                ByteBuffer allocate18 = ByteBuffer.allocate(200);
                                allocate18.putInt(0);
                                allocate18.putShort((short) 0);
                                allocate18.putShort((short) 0);
                                allocate18.putShort((short) 0);
                                allocate18.putShort((short) 0);
                                allocate18.flip();
                                byteBuffer = wlb0.x(VideoMediaHeaderBox.TYPE, allocate18);
                                ByteBuffer b2 = b(aVar);
                                m6g m6gVar = aVar.D;
                                String c2 = c(aVar);
                                ByteBuffer allocate19 = ByteBuffer.allocate(b2.limit() + 200);
                                allocate19.putInt(0);
                                allocate19.putShort((short) 0);
                                allocate19.putShort((short) 1);
                                allocate19.putShort((short) 0);
                                allocate19.putShort((short) 0);
                                allocate19.putInt(0);
                                allocate19.putInt(0);
                                allocate19.putInt(0);
                                allocate19.putShort(i34 != -1 ? (short) i34 : (short) 0);
                                allocate19.putShort(i33 != -1 ? (short) i33 : (short) 0);
                                allocate19.putInt(4718592);
                                allocate19.putInt(4718592);
                                allocate19.putInt(0);
                                allocate19.putShort((short) 1);
                                allocate19.putLong(0L);
                                allocate19.putLong(0L);
                                allocate19.putLong(0L);
                                allocate19.putLong(0L);
                                allocate19.putShort((short) 24);
                                allocate19.putShort((short) -1);
                                allocate19.put(b2);
                                if (m6gVar != null && c2.equals("vp09")) {
                                    byte[] bArr3 = m6gVar.d;
                                    if (bArr3 != null) {
                                        ByteBuffer allocate20 = ByteBuffer.allocate(200);
                                        allocate20.putInt(0);
                                        allocate20.put(bArr3);
                                        allocate20.flip();
                                        allocate3 = wlb0.x("SmDm", allocate20);
                                    } else {
                                        allocate3 = ByteBuffer.allocate(0);
                                    }
                                    allocate19.put(allocate3);
                                }
                                ByteBuffer allocate21 = ByteBuffer.allocate(8);
                                allocate21.putInt(65536);
                                allocate21.putInt(65536);
                                allocate21.rewind();
                                allocate19.put(wlb0.x(PixelAspectRationAtom.TYPE, allocate21));
                                if (m6gVar != null) {
                                    int i53 = m6gVar.a;
                                    ByteBuffer allocate22 = ByteBuffer.allocate(20);
                                    allocate22.put((byte) 110);
                                    allocate22.put((byte) 99);
                                    allocate22.put((byte) 108);
                                    allocate22.put((byte) 120);
                                    if (i53 != 2) {
                                        i15 = 6;
                                        i16 = i53 != 6 ? 1 : 9;
                                    } else {
                                        i15 = 6;
                                        i16 = 5;
                                    }
                                    short s3 = (short) i16;
                                    short d = (short) m6g.d(m6gVar.c);
                                    short s4 = (short) (i53 != 2 ? i53 != i15 ? 1 : 9 : 6);
                                    byte b3 = m6gVar.b == 1 ? Byte.MIN_VALUE : (byte) 0;
                                    allocate22.putShort(s3);
                                    allocate22.putShort(d);
                                    allocate22.putShort(s4);
                                    allocate22.put(b3);
                                    allocate22.flip();
                                    allocate19.put(wlb0.x("colr", allocate22));
                                }
                                allocate19.flip();
                                ByteBuffer m = m(wlb0.x(c2, allocate19));
                                ByteBuffer allocate23 = ByteBuffer.allocate((arrayList15.size() * 4) + 200);
                                allocate23.putInt(0);
                                int position5 = allocate23.position();
                                allocate23.putInt(arrayList15.size());
                                int i54 = 1;
                                int i55 = 0;
                                for (int i56 = 0; i56 < arrayList15.size(); i56++) {
                                    if ((((dm8) arrayList15.get(i56)).c & 1) > 0) {
                                        allocate23.putInt(i54);
                                        i55++;
                                    }
                                    i54++;
                                }
                                allocate23.putInt(position5, i55);
                                allocate23.flip();
                                w2 = wlb0.w(SampleTableBox.TYPE, Arrays.asList(m, x2, byteBuffer2, x3, x4, x5, wlb0.x(SyncSampleBox.TYPE, allocate23)));
                                str6 = "vide";
                                str5 = "VideoHandle";
                                ki20Var2 = ki20Var;
                            }
                            str4 = str3;
                        }
                        i11 = ki20Var2.a.a;
                        ByteBuffer allocate24 = ByteBuffer.allocate(200);
                        allocate24.putInt(7);
                        i12 = i3;
                        allocate24.putInt(i12);
                        i13 = i36;
                        allocate24.putInt(i13);
                        allocate24.putInt(i35);
                        allocate24.putInt(0);
                        ByteBuffer byteBuffer3 = w2;
                        ByteBuffer byteBuffer4 = byteBuffer;
                        allocate24.putInt((int) n(j18, 10000L));
                        allocate24.putInt(0);
                        allocate24.putInt(0);
                        allocate24.putInt(0);
                        allocate24.putShort(!io20.l(str4) ? (short) 256 : (short) 0);
                        allocate24.putShort((short) 0);
                        if (i11 != 0) {
                            h0 = y2r0.h0(65536, 0, 0, 0, 65536, 0, 0, 0, 1073741824);
                        } else if (i11 == 90) {
                            h0 = y2r0.h0(0, 65536, 0, -65536, 0, 0, 0, 0, 1073741824);
                        } else if (i11 == 180) {
                            h0 = y2r0.h0(-65536, 0, 0, 0, -65536, 0, 0, 0, 1073741824);
                        } else {
                            if (i11 != 270) {
                                throw new IllegalArgumentException(lhg.a(i11, "invalid orientation "));
                            }
                            h0 = y2r0.h0(0, -65536, 0, 65536, 0, 0, 0, 0, 1073741824);
                        }
                        allocate24.put(h0);
                        if (i34 == -1) {
                            i34 = 0;
                        }
                        if (i33 == -1) {
                            i33 = 0;
                        }
                        allocate24.putInt(i34 << 16);
                        allocate24.putInt(i33 << 16);
                        allocate24.flip();
                        ByteBuffer x11 = wlb0.x(TrackHeaderBox.TYPE, allocate24);
                        long a5 = tep0Var2.a();
                        j4 = j <= 0 ? j14 - j : j14;
                        if (j4 == 0) {
                            ByteBuffer allocate25 = ByteBuffer.allocate(50);
                            allocate25.putInt(C.DEFAULT_MUXED_BUFFER_SIZE);
                            if (j4 > 0) {
                                allocate25.putInt(2);
                                allocate25.put(e(n(j4, 10000L), -1L));
                                allocate25.put(e(n(j18, 10000L), 0L));
                            } else {
                                allocate25.putInt(1);
                                allocate25.put(e(n(j18, 10000L), n(Math.abs(j4), a5)));
                            }
                            allocate25.flip();
                            allocate2 = wlb0.x(EditBox.TYPE, wlb0.x(EditListBox.TYPE, allocate25));
                            i14 = 0;
                        } else {
                            i14 = 0;
                            allocate2 = ByteBuffer.allocate(0);
                        }
                        int a6 = tep0Var2.a();
                        ByteBuffer allocate26 = ByteBuffer.allocate(200);
                        allocate26.putInt(i14);
                        allocate26.putInt(i12);
                        allocate26.putInt(i13);
                        allocate26.putInt(a6);
                        allocate26.putInt((int) j13);
                        if (str2 != null) {
                            byte[] bytes2 = str2.getBytes(StandardCharsets.UTF_8);
                            if (bytes2.length == 3) {
                                s2 = 0;
                                s = (short) (((bytes2[2] & 31) + ((bytes2[1] & 31) << 5) + ((bytes2[0] & 31) << 10)) & OutgoingAudioStatistics.AUDIO_LEVEL_MULTIPLIER_FOR_BACKEND);
                                allocate26.putShort(s);
                                allocate26.putShort(s2);
                                allocate26.flip();
                                ByteBuffer x12 = wlb0.x(MediaHeaderBox.TYPE, allocate26);
                                ByteBuffer j24 = j(str6, str5);
                                ByteBuffer allocate27 = ByteBuffer.allocate(4);
                                allocate27.putInt(1);
                                allocate27.flip();
                                ByteBuffer[] byteBufferArr = {wlb0.x(DataEntryUrlBox.TYPE, allocate27)};
                                ByteBuffer allocate28 = ByteBuffer.allocate(8);
                                allocate28.putInt(0);
                                allocate28.putInt(1);
                                allocate28.flip();
                                ArrayList arrayList22 = new ArrayList();
                                arrayList22.add(allocate28);
                                Collections.addAll(arrayList22, byteBufferArr);
                                ByteBuffer w4 = wlb0.w(TrackBox.TYPE, Arrays.asList(x11, allocate2, wlb0.w(MediaBox.TYPE, Arrays.asList(x12, j24, wlb0.w(MediaInformationBox.TYPE, Arrays.asList(byteBuffer4, wlb0.x(DataInformationBox.TYPE, wlb0.w(DataReferenceBox.TYPE, arrayList22)), byteBuffer3))))));
                                arrayList4 = arrayList16;
                                arrayList4.add(w4);
                                j6 = Math.max(j6, j18);
                                ByteBuffer allocate29 = ByteBuffer.allocate(24);
                                allocate29.putInt(0);
                                allocate29.putInt(i35);
                                allocate29.putInt(1);
                                allocate29.putInt(0);
                                allocate29.putInt(0);
                                allocate29.putInt(0);
                                allocate29.flip();
                                arrayList5 = arrayList17;
                                arrayList5.add(wlb0.x(TrackExtendsBox.TYPE, allocate29));
                                i21 = i35 + 1;
                            }
                        }
                        s = 0;
                        s2 = 0;
                        allocate26.putShort(s);
                        allocate26.putShort(s2);
                        allocate26.flip();
                        ByteBuffer x122 = wlb0.x(MediaHeaderBox.TYPE, allocate26);
                        ByteBuffer j242 = j(str6, str5);
                        ByteBuffer allocate272 = ByteBuffer.allocate(4);
                        allocate272.putInt(1);
                        allocate272.flip();
                        ByteBuffer[] byteBufferArr2 = {wlb0.x(DataEntryUrlBox.TYPE, allocate272)};
                        ByteBuffer allocate282 = ByteBuffer.allocate(8);
                        allocate282.putInt(0);
                        allocate282.putInt(1);
                        allocate282.flip();
                        ArrayList arrayList222 = new ArrayList();
                        arrayList222.add(allocate282);
                        Collections.addAll(arrayList222, byteBufferArr2);
                        ByteBuffer w42 = wlb0.w(TrackBox.TYPE, Arrays.asList(x11, allocate2, wlb0.w(MediaBox.TYPE, Arrays.asList(x122, j242, wlb0.w(MediaInformationBox.TYPE, Arrays.asList(byteBuffer4, wlb0.x(DataInformationBox.TYPE, wlb0.w(DataReferenceBox.TYPE, arrayList222)), byteBuffer3))))));
                        arrayList4 = arrayList16;
                        arrayList4.add(w42);
                        j6 = Math.max(j6, j18);
                        ByteBuffer allocate292 = ByteBuffer.allocate(24);
                        allocate292.putInt(0);
                        allocate292.putInt(i35);
                        allocate292.putInt(1);
                        allocate292.putInt(0);
                        allocate292.putInt(0);
                        allocate292.putInt(0);
                        allocate292.flip();
                        arrayList5 = arrayList17;
                        arrayList5.add(wlb0.x(TrackExtendsBox.TYPE, allocate292));
                        i21 = i35 + 1;
                    } else {
                        str7 = forLanguageTag.getISO3Language();
                    }
                }
                i2 = i20;
                str = str7;
                int a32 = tep0Var2.a();
                ArrayList arrayList162 = arrayList8;
                ArrayList arrayList172 = arrayList9;
                long j82 = tep0Var2.i;
                hashSet = hashSet2;
                str2 = str;
                ArrayList arrayList182 = new ArrayList(arrayList15.size());
                int i352 = i21;
                arrayList2 = new ArrayList(arrayList15.size());
                int i362 = i18;
                if (arrayList15.isEmpty()) {
                }
                long j122 = 0;
                while (i4 < arrayList2.size()) {
                }
                if (!arrayList15.isEmpty()) {
                }
                long d02 = y2r0.d0(j122, 1000000L, tep0Var2.a(), RoundingMode.HALF_UP);
                long j132 = j122;
                if (j3 < 0) {
                }
                i5 = io20.i(str3);
                ByteBuffer allocate92 = ByteBuffer.allocate((arrayList2.size() * 8) + 200);
                allocate92.putInt(0);
                long j142 = j3;
                int position6 = allocate92.position();
                allocate92.putInt(0);
                i6 = 0;
                int i412 = -1;
                int i422 = 0;
                long j152 = -1;
                while (i6 < arrayList2.size()) {
                }
                long j182 = d02;
                allocate92.putInt(position6, i422);
                allocate92.flip();
                x2 = wlb0.x(TimeToSampleBox.TYPE, allocate92);
                if (io20.p(str3)) {
                }
                ByteBuffer byteBuffer22 = allocate;
                ByteBuffer allocate112 = ByteBuffer.allocate((arrayList15.size() * 4) + 200);
                allocate112.putInt(i7);
                allocate112.putInt(i7);
                allocate112.putInt(arrayList15.size());
                while (i8 < arrayList15.size()) {
                }
                allocate112.flip();
                x3 = wlb0.x(SampleSizeBox.TYPE, allocate112);
                arrayList3 = tep0Var2.d;
                ByteBuffer allocate122 = ByteBuffer.allocate((arrayList3.size() * 12) + 200);
                allocate122.putInt(0);
                int position42 = allocate122.position();
                allocate122.putInt(0);
                int i502 = 1;
                int i512 = 0;
                int i522 = -1;
                while (i9 < arrayList3.size()) {
                }
                allocate122.putInt(position42, i512);
                allocate122.flip();
                x4 = wlb0.x(SampleToChunkBox.TYPE, allocate122);
                ByteBuffer allocate132 = ByteBuffer.allocate((arrayList14.size() * 8) + 8);
                allocate132.putInt(0);
                allocate132.putInt(arrayList14.size());
                while (i10 < arrayList14.size()) {
                }
                allocate132.flip();
                x5 = wlb0.x(ChunkOffset64BitBox.TYPE, allocate132);
                if (i5 != -1) {
                }
                ByteBuffer allocate142 = ByteBuffer.allocate(200);
                allocate142.putInt(0);
                allocate142.flip();
                ByteBuffer x92 = wlb0.x(NullMediaHeaderBox.TYPE, allocate142);
                ByteBuffer allocate152 = ByteBuffer.allocate(200);
                str3.getClass();
                String str132 = y2r0.a;
                str4 = str3;
                byte[] bytes3 = str4.getBytes(StandardCharsets.UTF_8);
                allocate152.put(bytes3);
                allocate152.put((byte) 0);
                allocate152.put(bytes3);
                allocate152.put((byte) 0);
                allocate152.flip();
                w2 = wlb0.w(SampleTableBox.TYPE, Arrays.asList(m(wlb0.x("mett", allocate152)), x2, x3, x4, x5));
                str5 = "MetaHandle";
                ki20Var2 = ki20Var;
                byteBuffer = x92;
                str6 = MetaBox.TYPE;
                i11 = ki20Var2.a.a;
                ByteBuffer allocate242 = ByteBuffer.allocate(200);
                allocate242.putInt(7);
                i12 = i3;
                allocate242.putInt(i12);
                i13 = i362;
                allocate242.putInt(i13);
                allocate242.putInt(i352);
                allocate242.putInt(0);
                ByteBuffer byteBuffer32 = w2;
                ByteBuffer byteBuffer42 = byteBuffer;
                allocate242.putInt((int) n(j182, 10000L));
                allocate242.putInt(0);
                allocate242.putInt(0);
                allocate242.putInt(0);
                allocate242.putShort(!io20.l(str4) ? (short) 256 : (short) 0);
                allocate242.putShort((short) 0);
                if (i11 != 0) {
                }
                allocate242.put(h0);
                if (i34 == -1) {
                }
                if (i33 == -1) {
                }
                allocate242.putInt(i34 << 16);
                allocate242.putInt(i33 << 16);
                allocate242.flip();
                ByteBuffer x112 = wlb0.x(TrackHeaderBox.TYPE, allocate242);
                long a52 = tep0Var2.a();
                if (j <= 0) {
                }
                if (j4 == 0) {
                }
                int a62 = tep0Var2.a();
                ByteBuffer allocate262 = ByteBuffer.allocate(200);
                allocate262.putInt(i14);
                allocate262.putInt(i12);
                allocate262.putInt(i13);
                allocate262.putInt(a62);
                allocate262.putInt((int) j132);
                if (str2 != null) {
                }
                s = 0;
                s2 = 0;
                allocate262.putShort(s);
                allocate262.putShort(s2);
                allocate262.flip();
                ByteBuffer x1222 = wlb0.x(MediaHeaderBox.TYPE, allocate262);
                ByteBuffer j2422 = j(str6, str5);
                ByteBuffer allocate2722 = ByteBuffer.allocate(4);
                allocate2722.putInt(1);
                allocate2722.flip();
                ByteBuffer[] byteBufferArr22 = {wlb0.x(DataEntryUrlBox.TYPE, allocate2722)};
                ByteBuffer allocate2822 = ByteBuffer.allocate(8);
                allocate2822.putInt(0);
                allocate2822.putInt(1);
                allocate2822.flip();
                ArrayList arrayList2222 = new ArrayList();
                arrayList2222.add(allocate2822);
                Collections.addAll(arrayList2222, byteBufferArr22);
                ByteBuffer w422 = wlb0.w(TrackBox.TYPE, Arrays.asList(x112, allocate2, wlb0.w(MediaBox.TYPE, Arrays.asList(x1222, j2422, wlb0.w(MediaInformationBox.TYPE, Arrays.asList(byteBuffer42, wlb0.x(DataInformationBox.TYPE, wlb0.w(DataReferenceBox.TYPE, arrayList2222)), byteBuffer32))))));
                arrayList4 = arrayList162;
                arrayList4.add(w422);
                j6 = Math.max(j6, j182);
                ByteBuffer allocate2922 = ByteBuffer.allocate(24);
                allocate2922.putInt(0);
                allocate2922.putInt(i352);
                allocate2922.putInt(1);
                allocate2922.putInt(0);
                allocate2922.putInt(0);
                allocate2922.putInt(0);
                allocate2922.flip();
                arrayList5 = arrayList172;
                arrayList5.add(wlb0.x(TrackExtendsBox.TYPE, allocate2922));
                i21 = i352 + 1;
            }
            i20 = i2 + 1;
            arrayList7 = arrayList;
            arrayList9 = arrayList5;
            arrayList8 = arrayList4;
            i17 = i12;
            i18 = i13;
            j5 = j;
            hashSet2 = hashSet;
        }
    }

    public static ByteBuffer m(ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.limit() + 200);
        allocate.putInt(0);
        allocate.putInt(1);
        allocate.put(byteBuffer);
        allocate.flip();
        return wlb0.x(SampleDescriptionBox.TYPE, allocate);
    }

    public static long n(long j, long j2) {
        return y2r0.d0(j, j2, 1000000L, RoundingMode.HALF_UP);
    }
}
