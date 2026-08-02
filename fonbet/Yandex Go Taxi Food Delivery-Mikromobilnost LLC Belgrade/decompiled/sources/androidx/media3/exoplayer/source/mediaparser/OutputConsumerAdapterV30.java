package androidx.media3.exoplayer.source.mediaparser;

import android.media.DrmInitData;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaParser;
import android.media.MediaParser$InputReader;
import android.media.MediaParser$OutputConsumer;
import android.util.Pair;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.a;
import com.google.common.collect.ImmutableList;
import defpackage.cgh;
import defpackage.d5p;
import defpackage.eh20;
import defpackage.f001;
import defpackage.f7q0;
import defpackage.f7s;
import defpackage.g001;
import defpackage.jfc;
import defpackage.jy80;
import defpackage.kfc;
import defpackage.kju0;
import defpackage.lk91;
import defpackage.ny61;
import defpackage.qb4;
import defpackage.qsb;
import defpackage.sez0;
import defpackage.tw21;
import defpackage.zc60;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.webrtc.MediaStreamTrack;
import ru.CryptoPro.JCP.tools.HexString;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes10.dex */
public final class OutputConsumerAdapterV30 implements MediaParser$OutputConsumer {
    private static final String MEDIA_FORMAT_KEY_CHUNK_INDEX_DURATIONS = "chunk-index-long-us-durations";
    private static final String MEDIA_FORMAT_KEY_CHUNK_INDEX_OFFSETS = "chunk-index-long-offsets";
    private static final String MEDIA_FORMAT_KEY_CHUNK_INDEX_SIZES = "chunk-index-int-sizes";
    private static final String MEDIA_FORMAT_KEY_CHUNK_INDEX_TIMES = "chunk-index-long-us-times";
    private static final String MEDIA_FORMAT_KEY_TRACK_TYPE = "track-type-string";
    private static final Pattern REGEX_CRYPTO_INFO_PATTERN;
    private static final Pair<MediaParser.SeekPoint, MediaParser.SeekPoint> SEEK_POINT_PAIR_START;
    private static final String TAG = "OConsumerAdapterV30";
    private String containerMimeType;
    private MediaParser.SeekMap dummySeekMap;
    private final boolean expectDummySeekMap;
    private d5p extractorOutput;
    private qsb lastChunkIndex;
    private final ArrayList<f001> lastOutputCryptoDatas;
    private final ArrayList<MediaCodec.CryptoInfo> lastReceivedCryptoInfos;
    private MediaParser.SeekMap lastSeekMap;
    private List<a> muxedCaptionFormats;
    private int primaryTrackIndex;
    private final a primaryTrackManifestFormat;
    private final int primaryTrackType;
    private long sampleTimestampUpperLimitFilterUs;
    private final jy80 scratchDataReaderAdapter;
    private boolean seekingDisabled;
    private sez0 timestampAdjuster;
    private final ArrayList<a> trackFormats;
    private final ArrayList<g001> trackOutputs;
    private boolean tracksEnded;
    private boolean tracksFoundCalled;

    static {
        MediaParser.SeekPoint seekPoint;
        MediaParser.SeekPoint seekPoint2;
        seekPoint = MediaParser.SeekPoint.START;
        seekPoint2 = MediaParser.SeekPoint.START;
        SEEK_POINT_PAIR_START = Pair.create(seekPoint, seekPoint2);
        REGEX_CRYPTO_INFO_PATTERN = Pattern.compile("pattern \\(encrypt: (\\d+), skip: (\\d+)\\)");
    }

    public OutputConsumerAdapterV30(a aVar, int i, boolean z) {
        this.expectDummySeekMap = z;
        this.primaryTrackManifestFormat = aVar;
        this.primaryTrackType = i;
        this.trackOutputs = new ArrayList<>();
        this.trackFormats = new ArrayList<>();
        this.lastReceivedCryptoInfos = new ArrayList<>();
        this.lastOutputCryptoDatas = new ArrayList<>();
        this.scratchDataReaderAdapter = new jy80();
        this.extractorOutput = new zc60();
        this.sampleTimestampUpperLimitFilterUs = -9223372036854775807L;
        this.muxedCaptionFormats = ImmutableList.p();
    }

    private void ensureSpaceForTrackIndex(int i) {
        for (int size = this.trackOutputs.size(); size <= i; size++) {
            this.trackOutputs.add(null);
            this.trackFormats.add(null);
            this.lastReceivedCryptoInfos.add(null);
            this.lastOutputCryptoDatas.add(null);
        }
    }

    private static int getFlag(MediaFormat mediaFormat, String str, int i) {
        if (mediaFormat.getInteger(str, 0) != 0) {
            return i;
        }
        return 0;
    }

    private static List<byte[]> getInitializationData(MediaFormat mediaFormat) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            StringBuilder sb = new StringBuilder("csd-");
            int i2 = i + 1;
            sb.append(i);
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer(sb.toString());
            if (byteBuffer == null) {
                return arrayList;
            }
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            arrayList.add(bArr);
            i = i2;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static String getMimeType(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -2063506020:
                if (str.equals("android.media.mediaparser.Mp4Parser")) {
                    c = 0;
                    break;
                }
                break;
            case -1870824006:
                if (str.equals("android.media.mediaparser.OggParser")) {
                    c = 1;
                    break;
                }
                break;
            case -1566427438:
                if (str.equals("android.media.mediaparser.TsParser")) {
                    c = 2;
                    break;
                }
                break;
            case -900207883:
                if (str.equals("android.media.mediaparser.AdtsParser")) {
                    c = 3;
                    break;
                }
                break;
            case -589864617:
                if (str.equals("android.media.mediaparser.WavParser")) {
                    c = 4;
                    break;
                }
                break;
            case 52265814:
                if (str.equals("android.media.mediaparser.PsParser")) {
                    c = 5;
                    break;
                }
                break;
            case 116768877:
                if (str.equals("android.media.mediaparser.FragmentedMp4Parser")) {
                    c = 6;
                    break;
                }
                break;
            case 376876796:
                if (str.equals("android.media.mediaparser.Ac3Parser")) {
                    c = 7;
                    break;
                }
                break;
            case 703268017:
                if (str.equals("android.media.mediaparser.AmrParser")) {
                    c = '\b';
                    break;
                }
                break;
            case 768643067:
                if (str.equals("android.media.mediaparser.FlacParser")) {
                    c = '\t';
                    break;
                }
                break;
            case 965962719:
                if (str.equals("android.media.mediaparser.MatroskaParser")) {
                    c = '\n';
                    break;
                }
                break;
            case 1264380477:
                if (str.equals("android.media.mediaparser.Ac4Parser")) {
                    c = 11;
                    break;
                }
                break;
            case 1343957595:
                if (str.equals("android.media.mediaparser.Mp3Parser")) {
                    c = '\f';
                    break;
                }
                break;
            case 2063134683:
                if (str.equals("android.media.mediaparser.FlvParser")) {
                    c = HexString.LF;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 6:
                return "video/mp4";
            case 1:
                return "audio/ogg";
            case 2:
                return "video/mp2t";
            case 3:
                return "audio/mp4a-latm";
            case 4:
                return "audio/raw";
            case 5:
                return "video/mp2p";
            case 7:
                return "audio/ac3";
            case '\b':
                return "audio/amr";
            case '\t':
                return "audio/flac";
            case '\n':
                return "video/webm";
            case 11:
                return "audio/ac4";
            case '\f':
                return "audio/mpeg";
            case '\r':
                return "video/x-flv";
            default:
                ny61.g("Illegal parser name: ".concat(str));
                return null;
        }
    }

    private static int getSelectionFlags(MediaFormat mediaFormat) {
        return getFlag(mediaFormat, "is-forced-subtitle", 2) | getFlag(mediaFormat, "is-autoselect", 4) | getFlag(mediaFormat, "is-default", 1);
    }

    private void maybeEndTracks() {
        if (!this.tracksFoundCalled || this.tracksEnded) {
            return;
        }
        int size = this.trackOutputs.size();
        for (int i = 0; i < size; i++) {
            if (this.trackOutputs.get(i) == null) {
                return;
            }
        }
        this.extractorOutput.A();
        this.tracksEnded = true;
    }

    private boolean maybeObtainChunkIndex(MediaFormat mediaFormat) {
        ByteBuffer byteBuffer = mediaFormat.getByteBuffer(MEDIA_FORMAT_KEY_CHUNK_INDEX_SIZES);
        if (byteBuffer == null) {
            return false;
        }
        IntBuffer asIntBuffer = byteBuffer.asIntBuffer();
        ByteBuffer byteBuffer2 = mediaFormat.getByteBuffer(MEDIA_FORMAT_KEY_CHUNK_INDEX_OFFSETS);
        byteBuffer2.getClass();
        LongBuffer asLongBuffer = byteBuffer2.asLongBuffer();
        ByteBuffer byteBuffer3 = mediaFormat.getByteBuffer(MEDIA_FORMAT_KEY_CHUNK_INDEX_DURATIONS);
        byteBuffer3.getClass();
        LongBuffer asLongBuffer2 = byteBuffer3.asLongBuffer();
        ByteBuffer byteBuffer4 = mediaFormat.getByteBuffer(MEDIA_FORMAT_KEY_CHUNK_INDEX_TIMES);
        byteBuffer4.getClass();
        LongBuffer asLongBuffer3 = byteBuffer4.asLongBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        long[] jArr = new long[asLongBuffer.remaining()];
        long[] jArr2 = new long[asLongBuffer2.remaining()];
        long[] jArr3 = new long[asLongBuffer3.remaining()];
        asIntBuffer.get(iArr);
        asLongBuffer.get(jArr);
        asLongBuffer2.get(jArr2);
        asLongBuffer3.get(jArr3);
        qsb qsbVar = new qsb(iArr, jArr, jArr2, jArr3);
        this.lastChunkIndex = qsbVar;
        this.extractorOutput.w(qsbVar);
        return true;
    }

    private f001 toExoPlayerCryptoData(int i, MediaCodec.CryptoInfo cryptoInfo) {
        int i2;
        int i3;
        if (cryptoInfo == null) {
            return null;
        }
        if (this.lastReceivedCryptoInfos.get(i) == cryptoInfo) {
            f001 f001Var = this.lastOutputCryptoDatas.get(i);
            f001Var.getClass();
            return f001Var;
        }
        try {
            Matcher matcher = REGEX_CRYPTO_INFO_PATTERN.matcher(cryptoInfo.toString());
            matcher.find();
            String group = matcher.group(1);
            int i4 = tw21.a;
            i2 = Integer.parseInt(group);
            i3 = Integer.parseInt(matcher.group(2));
        } catch (RuntimeException e) {
            lk91.f(TAG, "Unexpected error while parsing CryptoInfo: " + cryptoInfo, e);
            i2 = 0;
            i3 = 0;
        }
        f001 f001Var2 = new f001(cryptoInfo.mode, i2, i3, cryptoInfo.key);
        this.lastReceivedCryptoInfos.set(i, cryptoInfo);
        this.lastOutputCryptoDatas.set(i, f001Var2);
        return f001Var2;
    }

    private static DrmInitData toExoPlayerDrmInitData(String str, android.media.DrmInitData drmInitData) {
        int schemeInitDataCount;
        DrmInitData.SchemeInitData schemeInitDataAt;
        UUID uuid;
        if (drmInitData == null) {
            return null;
        }
        schemeInitDataCount = drmInitData.getSchemeInitDataCount();
        DrmInitData.SchemeData[] schemeDataArr = new DrmInitData.SchemeData[schemeInitDataCount];
        for (int i = 0; i < schemeInitDataCount; i++) {
            schemeInitDataAt = drmInitData.getSchemeInitDataAt(i);
            uuid = schemeInitDataAt.uuid;
            schemeDataArr[i] = new DrmInitData.SchemeData(uuid, schemeInitDataAt.mimeType, schemeInitDataAt.data);
        }
        return new androidx.media3.common.DrmInitData(str, schemeDataArr);
    }

    private a toExoPlayerFormat(MediaParser.TrackData trackData) {
        MediaFormat mediaFormat;
        android.media.DrmInitData drmInitData;
        byte[] bArr;
        mediaFormat = trackData.mediaFormat;
        String string = mediaFormat.getString("mime");
        int integer = mediaFormat.getInteger("caption-service-number", -1);
        f7s f7sVar = new f7s();
        String string2 = mediaFormat.getString("crypto-mode-fourcc");
        drmInitData = trackData.drmInitData;
        f7sVar.q = toExoPlayerDrmInitData(string2, drmInitData);
        f7sVar.l = eh20.q(this.containerMimeType);
        f7sVar.i = mediaFormat.getInteger("bitrate", -1);
        f7sVar.C = mediaFormat.getInteger("channel-count", -1);
        kfc kfcVar = null;
        if (tw21.a >= 24) {
            int integer2 = mediaFormat.containsKey("color-standard") ? mediaFormat.getInteger("color-standard") : -1;
            int integer3 = mediaFormat.containsKey("color-range") ? mediaFormat.getInteger("color-range") : -1;
            int integer4 = mediaFormat.containsKey("color-transfer") ? mediaFormat.getInteger("color-transfer") : -1;
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
            if (byteBuffer != null) {
                bArr = new byte[byteBuffer.remaining()];
                byteBuffer.get(bArr);
            } else {
                bArr = null;
            }
            if (integer2 != 2 && integer2 != 1 && integer2 != 6 && integer2 != -1) {
                integer2 = -1;
            }
            if (integer3 != 2 && integer3 != 1 && integer3 != -1) {
                integer3 = -1;
            }
            if (integer4 != 1 && integer4 != 3 && integer4 != 6 && integer4 != 7 && integer4 != -1) {
                integer4 = -1;
            }
            if (integer2 != -1 || integer3 != -1 || integer4 != -1 || bArr != null) {
                jfc jfcVar = new jfc();
                jfcVar.a = integer2;
                jfcVar.b = integer3;
                jfcVar.c = integer4;
                jfcVar.d = bArr;
                kfcVar = jfcVar.a();
            }
        }
        f7sVar.A = kfcVar;
        f7sVar.m = eh20.q(string);
        f7sVar.j = mediaFormat.getString("codecs-string");
        f7sVar.v = mediaFormat.getFloat("frame-rate", -1.0f);
        f7sVar.t = mediaFormat.getInteger("width", -1);
        f7sVar.u = mediaFormat.getInteger("height", -1);
        f7sVar.p = getInitializationData(mediaFormat);
        f7sVar.d = mediaFormat.getString("language");
        f7sVar.n = mediaFormat.getInteger("max-input-size", -1);
        f7sVar.E = mediaFormat.getInteger("exo-pcm-encoding", -1);
        int i = 0;
        f7sVar.w = mediaFormat.getInteger("rotation-degrees", 0);
        f7sVar.D = mediaFormat.getInteger("sample-rate", -1);
        f7sVar.e = getSelectionFlags(mediaFormat);
        f7sVar.F = mediaFormat.getInteger("encoder-delay", 0);
        f7sVar.G = mediaFormat.getInteger("encoder-padding", 0);
        f7sVar.x = mediaFormat.getFloat("pixel-width-height-ratio-float", 1.0f);
        f7sVar.r = mediaFormat.getLong("subsample-offset-us-long", ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
        f7sVar.H = integer;
        while (true) {
            if (i >= this.muxedCaptionFormats.size()) {
                break;
            }
            a aVar = this.muxedCaptionFormats.get(i);
            if (Objects.equals(aVar.n, string) && aVar.I == integer) {
                f7sVar.d = aVar.d;
                f7sVar.f = aVar.f;
                f7sVar.e = aVar.e;
                f7sVar.b = aVar.b;
                f7sVar.c = ImmutableList.l(aVar.c);
                f7sVar.k = aVar.l;
                break;
            }
            i++;
        }
        return new a(f7sVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static int toTrackTypeConstant(String str) {
        char c;
        if (str == null) {
            return -1;
        }
        switch (str.hashCode()) {
            case -450004177:
                if (str.equals(kju0.j)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -284840886:
                if (str.equals("unknown")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3556653:
                if (str.equals("text")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 93166550:
                if (str.equals(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 112202875:
                if (str.equals(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                    c = 4;
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
                return 5;
            case 1:
                return -1;
            case 2:
                return 3;
            case 3:
                return 1;
            case 4:
                return 2;
            default:
                return eh20.i(str);
        }
    }

    public void disableSeeking() {
        this.seekingDisabled = true;
    }

    public qsb getChunkIndex() {
        return this.lastChunkIndex;
    }

    public MediaParser.SeekMap getDummySeekMap() {
        return this.dummySeekMap;
    }

    public a[] getSampleFormats() {
        if (!this.tracksFoundCalled) {
            return null;
        }
        a[] aVarArr = new a[this.trackFormats.size()];
        for (int i = 0; i < this.trackFormats.size(); i++) {
            a aVar = this.trackFormats.get(i);
            aVar.getClass();
            aVarArr[i] = aVar;
        }
        return aVarArr;
    }

    public Pair<MediaParser.SeekPoint, MediaParser.SeekPoint> getSeekPoints(long j) {
        Pair<MediaParser.SeekPoint, MediaParser.SeekPoint> seekPoints;
        MediaParser.SeekMap seekMap = this.lastSeekMap;
        if (seekMap == null) {
            return SEEK_POINT_PAIR_START;
        }
        seekPoints = seekMap.getSeekPoints(j);
        return seekPoints;
    }

    public void onSampleCompleted(int i, long j, int i2, int i3, int i4, MediaCodec.CryptoInfo cryptoInfo) {
        long j2 = this.sampleTimestampUpperLimitFilterUs;
        if (j2 == -9223372036854775807L || j < j2) {
            sez0 sez0Var = this.timestampAdjuster;
            if (sez0Var != null) {
                j = sez0Var.a(j);
            }
            g001 g001Var = this.trackOutputs.get(i);
            g001Var.getClass();
            g001Var.c(j, i2, i3, i4, toExoPlayerCryptoData(i, cryptoInfo));
        }
    }

    public void onSampleDataFound(int i, MediaParser$InputReader mediaParser$InputReader) throws IOException {
        long length;
        ensureSpaceForTrackIndex(i);
        this.scratchDataReaderAdapter.a = mediaParser$InputReader;
        g001 g001Var = this.trackOutputs.get(i);
        if (g001Var == null) {
            g001Var = this.extractorOutput.B(i, -1);
            this.trackOutputs.set(i, g001Var);
        }
        jy80 jy80Var = this.scratchDataReaderAdapter;
        length = mediaParser$InputReader.getLength();
        g001Var.b(jy80Var, (int) length, true);
    }

    public void onSeekMapFound(MediaParser.SeekMap seekMap) {
        long durationMicros;
        f7q0 cghVar;
        if (this.expectDummySeekMap && this.dummySeekMap == null) {
            this.dummySeekMap = seekMap;
            return;
        }
        this.lastSeekMap = seekMap;
        durationMicros = seekMap.getDurationMicros();
        d5p d5pVar = this.extractorOutput;
        if (this.seekingDisabled) {
            if (durationMicros == -2147483648L) {
                durationMicros = -9223372036854775807L;
            }
            cghVar = new qb4(durationMicros);
        } else {
            cghVar = new cgh(1, seekMap);
        }
        d5pVar.w(cghVar);
    }

    public void onTrackCountFound(int i) {
        this.tracksFoundCalled = true;
        maybeEndTracks();
    }

    public void onTrackDataFound(int i, MediaParser.TrackData trackData) {
        MediaFormat mediaFormat;
        MediaFormat mediaFormat2;
        MediaFormat mediaFormat3;
        String string;
        mediaFormat = trackData.mediaFormat;
        if (maybeObtainChunkIndex(mediaFormat)) {
            return;
        }
        ensureSpaceForTrackIndex(i);
        g001 g001Var = this.trackOutputs.get(i);
        if (g001Var == null) {
            mediaFormat2 = trackData.mediaFormat;
            String string2 = mediaFormat2.getString(MEDIA_FORMAT_KEY_TRACK_TYPE);
            if (string2 != null) {
                string = string2;
            } else {
                mediaFormat3 = trackData.mediaFormat;
                string = mediaFormat3.getString("mime");
            }
            int trackTypeConstant = toTrackTypeConstant(string);
            if (trackTypeConstant == this.primaryTrackType) {
                this.primaryTrackIndex = i;
            }
            g001 B = this.extractorOutput.B(i, trackTypeConstant);
            this.trackOutputs.set(i, B);
            if (string2 != null) {
                return;
            } else {
                g001Var = B;
            }
        }
        a exoPlayerFormat = toExoPlayerFormat(trackData);
        a aVar = this.primaryTrackManifestFormat;
        g001Var.d((aVar == null || i != this.primaryTrackIndex) ? exoPlayerFormat : exoPlayerFormat.d(aVar));
        this.trackFormats.set(i, exoPlayerFormat);
        maybeEndTracks();
    }

    public void setExtractorOutput(d5p d5pVar) {
        this.extractorOutput = d5pVar;
    }

    public void setMuxedCaptionFormats(List<a> list) {
        this.muxedCaptionFormats = list;
    }

    public void setSampleTimestampUpperLimitFilterUs(long j) {
        this.sampleTimestampUpperLimitFilterUs = j;
    }

    public void setSelectedParserName(String str) {
        this.containerMimeType = getMimeType(str);
    }

    public void setTimestampAdjuster(sez0 sez0Var) {
        this.timestampAdjuster = sez0Var;
    }

    public OutputConsumerAdapterV30() {
        this(null, -2, false);
    }
}
