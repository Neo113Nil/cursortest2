package xsna;

import android.util.Base64;
import android.util.Log;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSink;
import com.vk.media.recorder.impl.BufferItem;
import com.vk.media.recorder.impl.Streamer;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.regex.Matcher;
import ru.ok.android.commons.http.Http;
import ru.ok.android.webrtc.rtp.RtpSenderHelper;
import ru.ok.proto.rtmp.amf.AmfConstants;
import xsna.qom0;
import xsna.vqg0;

/* compiled from: RtspConnection.java */
/* loaded from: classes3.dex */
public final class uqg0 extends wb6 {
    public qom0.a A;
    public long B;
    public BufferItem C;
    public int D;
    public final int E;
    public long F;
    public long G;
    public final int H;
    public long I;
    public long J;
    public int K;
    public int L;
    public String M;
    public String N;
    public String O;
    public int P;
    public b s;
    public Streamer.STATUS t;
    public final vqg0 u;
    public final String v;
    public final String w;
    public final String x;
    public final byte[] y;
    public qom0.b z;

    /* compiled from: RtspConnection.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[BufferItem.FrameType.values().length];
            b = iArr;
            try {
                iArr[BufferItem.FrameType.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[BufferItem.FrameType.AUDIO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[b.values().length];
            a = iArr2;
            try {
                iArr2[b.ANNOUNCE_WAIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.SEND_NEW_ITEM.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.SEND_VIDEO_PART.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[b.OPTIONS.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[b.OPTIONS_AUTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[b.ANNOUNCE.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[b.ANNOUNCE_AUTH.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[b.SETUP_VIDEO.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[b.SETUP_AUDIO.ordinal()] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[b.RECORD.ordinal()] = 10;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RtspConnection.java */
    public static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b ANNOUNCE;
        public static final b ANNOUNCE_AUTH;
        public static final b ANNOUNCE_WAIT;
        public static final b CLOSED;
        public static final b INITIAL;
        public static final b OPTIONS;
        public static final b OPTIONS_AUTH;
        public static final b RECORD;
        public static final b SEND_NEW_ITEM;
        public static final b SEND_VIDEO_PART;
        public static final b SETUP_AUDIO;
        public static final b SETUP_VIDEO;

        static {
            b bVar = new b("INITIAL", 0);
            INITIAL = bVar;
            b bVar2 = new b("OPTIONS", 1);
            OPTIONS = bVar2;
            b bVar3 = new b("OPTIONS_AUTH", 2);
            OPTIONS_AUTH = bVar3;
            b bVar4 = new b("ANNOUNCE_WAIT", 3);
            ANNOUNCE_WAIT = bVar4;
            b bVar5 = new b("ANNOUNCE", 4);
            ANNOUNCE = bVar5;
            b bVar6 = new b("ANNOUNCE_AUTH", 5);
            ANNOUNCE_AUTH = bVar6;
            b bVar7 = new b("SETUP_VIDEO", 6);
            SETUP_VIDEO = bVar7;
            b bVar8 = new b("SETUP_AUDIO", 7);
            SETUP_AUDIO = bVar8;
            b bVar9 = new b("RECORD", 8);
            RECORD = bVar9;
            b bVar10 = new b("SEND_NEW_ITEM", 9);
            SEND_NEW_ITEM = bVar10;
            b bVar11 = new b("SEND_VIDEO_PART", 10);
            SEND_VIDEO_PART = bVar11;
            b bVar12 = new b("CLOSED", 11);
            CLOSED = bVar12;
            $VALUES = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    public uqg0(g4j g4jVar, int i, Streamer.MODE mode, String str, String str2, int i2, String str3, String str4) throws IOException {
        super(g4jVar, i, mode, str2, i2, CacheDataSink.DEFAULT_BUFFER_SIZE, null);
        this.y = new byte[32];
        this.B = 0L;
        this.D = -1;
        this.E = new Random().nextInt();
        this.F = -1L;
        this.G = -1L;
        this.H = new Random().nextInt();
        this.I = -1L;
        this.J = -1L;
        this.K = 0;
        this.L = 0;
        this.P = 1;
        this.v = str;
        this.w = str3;
        this.x = str4;
        this.s = b.INITIAL;
        this.t = Streamer.STATUS.CONN_FAIL;
        vqg0 vqg0Var = new vqg0();
        vqg0Var.b = vqg0.b.INTERLEAVED;
        vqg0Var.c = 0;
        vqg0Var.d = Boolean.FALSE;
        vqg0Var.e = new HashMap<>();
        this.u = vqg0Var;
    }

    public static long q(BufferItem bufferItem, int i) {
        return (i * bufferItem.d) / 1000000;
    }

    @Override // xsna.wb6
    public final synchronized void b() {
        b bVar = this.s;
        b bVar2 = b.CLOSED;
        if (bVar != bVar2) {
            this.s = bVar2;
            super.b();
            d(Streamer.CONNECTION_STATE.DISCONNECTED, this.t);
        }
    }

    @Override // xsna.wb6
    public final void e() {
        this.t = Streamer.STATUS.UNKNOWN_FAIL;
        d(Streamer.CONNECTION_STATE.CONNECTED, Streamer.STATUS.SUCCESS);
        v();
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x00e3, code lost:
    
        r4 = -1;
     */
    @Override // xsna.wb6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(ByteBuffer byteBuffer) {
        Boolean bool;
        Boolean bool2;
        byte[] array = byteBuffer.array();
        int position = byteBuffer.position();
        vqg0 vqg0Var = this.u;
        HashMap<String, String> hashMap = vqg0Var.e;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (position > 0) {
                int i3 = vqg0.a.a[vqg0Var.b.ordinal()];
                if (i3 == 1) {
                    vqg0Var.a = -1;
                    hashMap.clear();
                    vqg0Var.c = 0;
                    if (position < 4) {
                        break;
                    }
                    if (array[i2] != 82 || array[i2 + 1] != 84 || array[i2 + 2] != 83 || array[i2 + 3] != 80) {
                        break;
                    }
                    vqg0Var.b = vqg0.b.STATUS_LINE;
                } else if (i3 == 2) {
                    StringBuilder sb = new StringBuilder();
                    int a2 = vqg0.a(i2, position, sb, array);
                    if (-1 == a2) {
                        break;
                    }
                    i2 += a2;
                    Matcher matcher = vqg0.f.matcher(sb.toString());
                    if (matcher.find()) {
                        vqg0Var.a = Integer.parseInt(matcher.group(1));
                        matcher.group(2);
                        bool2 = Boolean.TRUE;
                    } else {
                        bool2 = Boolean.FALSE;
                    }
                    if (!bool2.booleanValue()) {
                        Log.e("RtspParser", "unable to parse status line: " + ((Object) sb));
                        vqg0Var.b = vqg0.b.INTERLEAVED;
                        break;
                    }
                    vqg0Var.b = vqg0.b.HDR_LINE;
                } else if (i3 == 3) {
                    StringBuilder sb2 = new StringBuilder();
                    int a3 = vqg0.a(i2, position, sb2, array);
                    if (-1 == a3) {
                        break;
                    }
                    i2 += a3;
                    if (sb2.length() > 0) {
                        Matcher matcher2 = vqg0.g.matcher(sb2.toString());
                        if (matcher2.find()) {
                            String trim = matcher2.group(1).trim();
                            String trim2 = matcher2.group(2).trim();
                            if (trim.equalsIgnoreCase(Http.Header.CONTENT_LENGTH)) {
                                vqg0Var.c = Integer.parseInt(trim2);
                            } else if (trim.equalsIgnoreCase("WWW-Authenticate")) {
                                int indexOf = trim2.indexOf(" ");
                                if (-1 != indexOf) {
                                    String substring = trim2.substring(0, indexOf);
                                    String trim3 = trim2.substring(indexOf + 1).trim();
                                    if (substring.equalsIgnoreCase("Digest")) {
                                        vqg0Var.b("WWW-Authenticate-Digest", trim3);
                                    } else if (substring.equalsIgnoreCase("Basic")) {
                                        vqg0Var.b("WWW-Authenticate-Basic", trim3);
                                    } else {
                                        bool = Boolean.TRUE;
                                    }
                                }
                            } else {
                                hashMap.put(trim.toUpperCase(), trim2);
                            }
                            bool = Boolean.TRUE;
                        } else {
                            bool = Boolean.FALSE;
                        }
                        if (!bool.booleanValue()) {
                            Log.e("RtspParser", "unable to parse header line: " + ((Object) sb2));
                            vqg0Var.b = vqg0.b.INTERLEAVED;
                            break;
                        }
                    } else {
                        if (vqg0Var.c <= 0) {
                            vqg0Var.d = Boolean.TRUE;
                            vqg0Var.b = vqg0.b.INTERLEAVED;
                            break;
                        }
                        vqg0Var.b = vqg0.b.BODY;
                    }
                } else if (i3 == 4) {
                    int i4 = vqg0Var.c;
                    if (position >= i4) {
                        i = i2 + i4;
                        vqg0Var.d = Boolean.TRUE;
                        vqg0Var.b = vqg0.b.INTERLEAVED;
                    }
                }
            } else {
                break;
            }
        }
        i = i2;
        if (i < 0) {
            Log.e("RtspConnection", "failed to parse rtsp");
            b();
            return byteBuffer.position();
        }
        if (vqg0Var.d.booleanValue()) {
            String str = vqg0Var.e.get("WWW-Authenticate-Digest-realm".toUpperCase());
            String str2 = vqg0Var.e.get("WWW-Authenticate-Digest-nonce".toUpperCase());
            if (str != null && str2 != null) {
                this.N = str;
                this.M = str2;
            }
            String str3 = vqg0Var.e.get("WWW-Authenticate-Basic-realm".toUpperCase());
            if (str3 != null) {
                this.O = str3;
            }
            int i5 = a.a[this.s.ordinal()];
            Streamer.MODE mode = this.b;
            switch (i5) {
                case 2:
                case 3:
                    int i6 = vqg0Var.a;
                    if (200 != i6) {
                        if (401 == i6) {
                            this.t = Streamer.STATUS.AUTH_FAIL;
                        }
                        b();
                        break;
                    }
                    break;
                case 4:
                    if (401 == vqg0Var.a) {
                        v();
                        this.s = b.OPTIONS_AUTH;
                        return i;
                    }
                case 5:
                    int i7 = vqg0Var.a;
                    if (200 == i7) {
                        d(Streamer.CONNECTION_STATE.SETUP, Streamer.STATUS.SUCCESS);
                        t();
                        return i;
                    }
                    if (401 == i7) {
                        this.t = Streamer.STATUS.AUTH_FAIL;
                    }
                    b();
                    return i;
                case 6:
                    if (401 == vqg0Var.a) {
                        s();
                        this.s = b.ANNOUNCE_AUTH;
                        return i;
                    }
                case 7:
                    int i8 = vqg0Var.a;
                    if (200 != i8) {
                        if (401 == i8) {
                            this.t = Streamer.STATUS.AUTH_FAIL;
                        }
                        b();
                        return i;
                    }
                    if (mode == Streamer.MODE.AUDIO_ONLY) {
                        x();
                        this.s = b.SETUP_AUDIO;
                        return i;
                    }
                    StringBuilder b2 = ho8.b(fo8.a(i5s.a(new StringBuilder("SETUP "), this.v, "/streamid=0 RTSP/1.0\r\n"), "Transport: RTP/AVP/TCP;unicast;interleaved=0-1;mode=record\r\n"), "CSeq: ");
                    int i9 = this.P;
                    this.P = i9 + 1;
                    StringBuilder b3 = ho8.b(h5s.c(i9, "\r\n", b2), "User-Agent: UA-com.vk.media\r\n");
                    this.c.getClass();
                    StringBuilder e = fw3.e(b3.toString());
                    e.append(r());
                    StringBuilder e2 = fw3.e(e.toString());
                    e2.append(p("SETUP"));
                    try {
                        j(fo8.a(e2.toString(), "\r\n"));
                    } catch (IOException e3) {
                        Log.e("RtspConnection", Log.getStackTraceString(e3));
                        b();
                    }
                    this.s = b.SETUP_VIDEO;
                    return i;
                case 8:
                    int i10 = vqg0Var.a;
                    if (200 != i10) {
                        if (401 == i10) {
                            this.t = Streamer.STATUS.AUTH_FAIL;
                        }
                        b();
                        return i;
                    }
                    if (mode == Streamer.MODE.VIDEO_ONLY) {
                        w();
                        this.s = b.RECORD;
                        return i;
                    }
                    x();
                    this.s = b.SETUP_AUDIO;
                    return i;
                case 9:
                    int i11 = vqg0Var.a;
                    if (200 == i11) {
                        w();
                        this.s = b.RECORD;
                        return i;
                    }
                    if (401 == i11) {
                        this.t = Streamer.STATUS.AUTH_FAIL;
                    }
                    b();
                    return i;
                case 10:
                    int i12 = vqg0Var.a;
                    if (200 == i12) {
                        d(Streamer.CONNECTION_STATE.RECORD, Streamer.STATUS.SUCCESS);
                        this.s = b.SEND_NEW_ITEM;
                        return i;
                    }
                    if (401 == i12) {
                        this.t = Streamer.STATUS.AUTH_FAIL;
                    }
                    b();
                    return i;
                default:
                    b();
                    return i;
            }
        }
        return i;
    }

    @Override // xsna.wb6
    public final void g() {
        int i = a.a[this.s.ordinal()];
        if (i == 1) {
            t();
            return;
        }
        if (i == 2) {
            u();
            return;
        }
        if (i != 3) {
            return;
        }
        do {
            int i2 = this.D;
            BufferItem bufferItem = this.C;
            if (i2 >= bufferItem.c.length) {
                this.s = b.SEND_NEW_ITEM;
                u();
                return;
            } else {
                int y = y(bufferItem, i2);
                if (y <= 0) {
                    Log.e("RtspConnection", "failed to send video part");
                    return;
                }
                this.D += y;
            }
        } while (c() <= 0);
        this.s = b.SEND_VIDEO_PART;
    }

    public final boolean o(int i, int i2, long j, long j2) {
        byte[] bArr = this.y;
        Arrays.fill(bArr, (byte) 0);
        bArr[0] = 36;
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((28 >> 8) & 255);
        bArr[3] = (byte) (28 & 255);
        bArr[4] = (byte) (bArr[4] | 128);
        bArr[5] = (byte) (bArr[5] | 200);
        bArr[6] = (byte) 0;
        bArr[7] = (byte) 6;
        bArr[8] = (byte) ((i2 >> 24) & 255);
        bArr[9] = (byte) ((i2 >> 16) & 255);
        bArr[10] = (byte) ((i2 >> 8) & 255);
        bArr[11] = (byte) (i2 & 255);
        bArr[12] = (byte) ((j >> 56) & 255);
        bArr[13] = (byte) ((j >> 48) & 255);
        bArr[14] = (byte) ((j >> 40) & 255);
        bArr[15] = (byte) ((j >> 32) & 255);
        bArr[16] = (byte) ((j >> 24) & 255);
        bArr[17] = (byte) ((j >> 16) & 255);
        bArr[18] = (byte) ((j >> 8) & 255);
        bArr[19] = (byte) (j & 255);
        bArr[20] = (byte) ((j2 >> 24) & 255);
        bArr[21] = (byte) ((j2 >> 16) & 255);
        bArr[22] = (byte) ((j2 >> 8) & 255);
        bArr[23] = (byte) (j2 & 255);
        try {
            a(0, 32, bArr);
            return true;
        } catch (Exception e) {
            Log.e("RtspConnection", Log.getStackTraceString(e));
            return false;
        }
    }

    public final String p(String str) {
        String str2 = this.v;
        String str3 = this.N;
        String str4 = this.x;
        String str5 = this.w;
        if (str3 == null || this.M == null) {
            if (this.O == null) {
                return "";
            }
            try {
                return "Authorization: Basic " + Base64.encodeToString((str5 + StringUtils.PROCESS_POSTFIX_DELIMITER + str4).getBytes(C.ASCII_NAME), 2) + "\r\n";
            } catch (UnsupportedEncodingException e) {
                Log.e("RtspConnection", Log.getStackTraceString(e));
                return "";
            }
        }
        try {
            String c = l3r0.c(l3r0.c(str5 + StringUtils.PROCESS_POSTFIX_DELIMITER + this.N + StringUtils.PROCESS_POSTFIX_DELIMITER + str4) + StringUtils.PROCESS_POSTFIX_DELIMITER + this.M + StringUtils.PROCESS_POSTFIX_DELIMITER + l3r0.c(str + StringUtils.PROCESS_POSTFIX_DELIMITER + str2));
            return ((((("Authorization: Digest username=\"" + str5 + "\"") + ",realm=\"" + this.N + "\"") + ",nonce=\"" + this.M + "\"") + ",uri=\"" + str2 + "\"") + ",response=\"" + c + "\"") + "\r\n";
        } catch (Exception e2) {
            Log.e("RtspConnection", Log.getStackTraceString(e2));
            return "";
        }
    }

    public final String r() {
        String str = this.u.e.get("Session".toUpperCase());
        return (str == null || str.isEmpty()) ? "" : zr.a("Session: ", str, "\r\n");
    }

    public final void s() {
        String a2;
        Streamer.MODE mode = Streamer.MODE.VIDEO_ONLY;
        Streamer.MODE mode2 = this.b;
        if (mode2 == mode || mode2 == Streamer.MODE.AUDIO_VIDEO) {
            qom0.b bVar = this.z;
            if (bVar == null) {
                b();
                return;
            }
            String b2 = l3r0.b(1, 3, bVar.a);
            qom0.b bVar2 = this.z;
            String encodeToString = Base64.encodeToString(bVar2.a, 0, bVar2.b, 2);
            qom0.b bVar3 = this.z;
            a2 = fo8.a(i5s.a(xe9.a("v=0\r\nm=video 0 RTP/AVP/TCP 96\r\na=rtpmap:96 H264/90000\r\na=fmtp:96 packetization-mode=1; sprop-parameter-sets=", encodeToString, StringUtils.COMMA, Base64.encodeToString(bVar3.c, 0, bVar3.d, 2), "; profile-level-id="), b2, "\r\n"), "a=control:streamid=0\r\n");
        } else {
            a2 = "v=0\r\n";
        }
        if (mode2 == Streamer.MODE.AUDIO_ONLY || mode2 == Streamer.MODE.AUDIO_VIDEO) {
            qom0.a aVar = this.A;
            if (aVar == null) {
                b();
                return;
            }
            String b3 = l3r0.b(0, aVar.b, aVar.a);
            qom0.a aVar2 = this.A;
            if (aVar2.c == -1) {
                int[] iArr = {96000, 88200, RtpSenderHelper.AUDIO_BITRATE_MAX, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350, -1, -1, -1};
                if (aVar2.b < 1) {
                    Log.e("RtspConnection", "failed to parse audio format params");
                    b();
                    return;
                }
                byte[] bArr = aVar2.a;
                int i = iArr[((bArr[0] & 7) << 1) | ((bArr[1] >> 7) & 1)];
                aVar2.c = i;
                if (i == -1) {
                    Log.e("RtspConnection", "failed to get sample rate, config=" + b3);
                    b();
                    return;
                }
            }
            if (aVar2.d == -1) {
                int i2 = new int[]{-1, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, -1, -1, -1, -1, -1}[(aVar2.a[1] >> 3) & 15];
                aVar2.d = i2;
                if (i2 == -1) {
                    Log.e("RtspConnection", "failed to get channel count, config=" + b3);
                    b();
                    return;
                }
            }
            StringBuilder b4 = ho8.b(fo8.a(a2, "m=audio 0 RTP/AVP/TCP 97\r\n"), "a=rtpmap:97 mpeg4-generic/");
            b4.append(this.A.c);
            b4.append(DomExceptionUtils.SEPARATOR);
            a2 = fo8.a(fw3.c(h5s.c(this.A.d, "\r\n", b4), "a=fmtp:97 profile-level-id=1;mode=AAC-hbr;sizelength=13;indexlength=3;indexdeltalength=3;config=", b3, "\r\n"), "a=control:streamid=1\r\n");
        }
        StringBuilder sb = new StringBuilder("ANNOUNCE ");
        sb.append(this.v);
        sb.append(" RTSP/1.0\r\nContent-Type: application/sdp\r\nCSeq: ");
        int i3 = this.P;
        this.P = i3 + 1;
        sb.append(i3);
        sb.append("\r\nUser-Agent: UA-com.vk.media\r\n");
        this.c.getClass();
        StringBuilder b5 = ho8.b(sb.toString(), "Content-Length: ");
        b5.append(a2.length());
        b5.append("\r\n");
        StringBuilder e = fw3.e(b5.toString());
        e.append(r());
        StringBuilder e2 = fw3.e(e.toString());
        e2.append(p("ANNOUNCE"));
        try {
            j(fo8.a(fo8.a(e2.toString(), "\r\n"), a2));
        } catch (IOException e3) {
            Log.e("RtspConnection", Log.getStackTraceString(e3));
            b();
        }
    }

    public final void t() {
        Streamer.MODE mode = this.b;
        if (mode == Streamer.MODE.VIDEO_ONLY || mode == Streamer.MODE.AUDIO_VIDEO) {
            qom0.b bVar = this.c.a.e;
            this.z = bVar;
            if (bVar == null) {
                this.s = b.ANNOUNCE_WAIT;
                return;
            }
        }
        Streamer.MODE mode2 = this.b;
        if (mode2 == Streamer.MODE.AUDIO_ONLY || mode2 == Streamer.MODE.AUDIO_VIDEO) {
            qom0.a aVar = this.c.a.f;
            this.A = aVar;
            if (aVar == null) {
                this.s = b.ANNOUNCE_WAIT;
                return;
            }
        }
        s();
        this.s = b.ANNOUNCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0330 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02ca A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u() {
        byte b2;
        int length;
        long j;
        int i;
        byte[] bArr;
        while (c() <= 0) {
            BufferItem a2 = this.c.a.a(this.B);
            this.C = a2;
            if (a2 == null) {
                return;
            }
            this.B = a2.b + 1;
            int i2 = a.b[a2.f.ordinal()];
            byte[] bArr2 = this.y;
            Streamer.MODE mode = this.b;
            if (i2 == 1) {
                Streamer.MODE mode2 = Streamer.MODE.AUDIO_VIDEO;
                if (mode == mode2 || mode == Streamer.MODE.VIDEO_ONLY) {
                    if (this.C.a()) {
                        j = 1000;
                    } else if (this.m != 0) {
                        j = 1000;
                        if (this.C.a - this.p > 1) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                    n(this.C);
                    BufferItem bufferItem = this.C;
                    byte[] bArr3 = bufferItem.c;
                    if (((bArr3[0] >> 7) & 1) != 0) {
                        Log.e("RtspConnection", "skip frame if fzb is set");
                    } else {
                        long j2 = this.F;
                        if (j2 == -1 && this.I == -1) {
                            long currentTimeMillis = System.currentTimeMillis();
                            long j3 = (((currentTimeMillis % j) * 4294967296L) / j) + (((currentTimeMillis / j) + 2208988800L) << 32);
                            this.F = j3;
                            bArr = bArr2;
                            long j4 = (90000 * bufferItem.d) / 1000000;
                            this.G = j4;
                            i = 90000;
                            if (o(1, this.E, j3, j4)) {
                                if (mode == mode2) {
                                    long j5 = (this.G * this.A.c) / 90000;
                                    this.J = j5;
                                    if (!o(3, this.H, this.F, j5)) {
                                        Log.e("RtspConnection", "failed to send report");
                                    }
                                }
                                if (bArr3.length + 16 >= 20000) {
                                }
                            } else {
                                Log.e("RtspConnection", "failed to send report");
                            }
                            Log.e("RtspConnection", "failed to send video report");
                            return;
                        }
                        i = 90000;
                        bArr = bArr2;
                        if (j2 == -1) {
                            long j6 = (90000 * bufferItem.d) / 1000000;
                            long j7 = this.I + (((j6 - this.G) * 4294967296L) / 90000);
                            this.F = j7;
                            this.G = j6;
                            if (!o(1, this.E, j7, j6)) {
                                Log.e("RtspConnection", "failed to send report");
                                Log.e("RtspConnection", "failed to send video report");
                                return;
                            }
                            if (bArr3.length + 16 >= 20000) {
                                this.D = 1;
                                do {
                                    int i3 = this.D;
                                    BufferItem bufferItem2 = this.C;
                                    if (i3 >= bufferItem2.c.length) {
                                        this.s = b.SEND_NEW_ITEM;
                                    } else {
                                        int y = y(bufferItem2, i3);
                                        if (y <= 0) {
                                            Log.e("RtspConnection", "failed to send video part");
                                            return;
                                        }
                                        this.D += y;
                                    }
                                } while (c() <= 0);
                                this.s = b.SEND_VIDEO_PART;
                                return;
                            }
                            BufferItem bufferItem3 = this.C;
                            wkz wkzVar = new wkz();
                            byte[] bArr4 = bArr;
                            Arrays.fill(bArr4, (byte) 0);
                            wkzVar.b = bArr4;
                            wkzVar.b(0, this.C.c.length + 12);
                            wkzVar.h();
                            byte[] bArr5 = (byte[]) wkzVar.b;
                            bArr5[5] = (byte) (bArr5[5] | 96);
                            int i4 = this.K;
                            this.K = i4 + 1;
                            wkzVar.e(i4);
                            wkzVar.d();
                            wkzVar.g((int) q(bufferItem3, i));
                            wkzVar.f(this.E);
                            try {
                                a(0, 16, bArr4);
                                byte[] bArr6 = this.C.c;
                                i(0, bArr6.length, bArr6);
                                this.m++;
                                this.s = b.SEND_NEW_ITEM;
                            } catch (Exception e) {
                                Log.e("RtspConnection", Log.getStackTraceString(e));
                                Log.e("RtspConnection", "failed to send video frame");
                                return;
                            }
                        } else {
                            if (bufferItem.a()) {
                                long j8 = (90000 * bufferItem.d) / 1000000;
                                long j9 = j8 - this.G;
                                if (j9 > 450000) {
                                    long j10 = this.F + ((j9 * 4294967296L) / 90000);
                                    this.F = j10;
                                    this.G = j8;
                                    if (!o(1, this.E, j10, j8)) {
                                        Log.e("RtspConnection", "failed to send report");
                                        Log.e("RtspConnection", "failed to send video report");
                                        return;
                                    }
                                }
                            }
                            if (bArr3.length + 16 >= 20000) {
                            }
                        }
                    }
                }
            } else if (i2 != 2) {
                Log.e("RtspConnection", "unsupported frame type " + this.C.f);
            } else {
                Streamer.MODE mode3 = Streamer.MODE.AUDIO_VIDEO;
                if (mode == mode3 || mode == Streamer.MODE.AUDIO_ONLY) {
                    BufferItem bufferItem4 = this.C;
                    long j11 = this.I;
                    if (j11 == -1 && this.F == -1) {
                        long currentTimeMillis2 = System.currentTimeMillis();
                        this.I = (((currentTimeMillis2 % 1000) * 4294967296L) / 1000) + (((currentTimeMillis2 / 1000) + 2208988800L) << 32);
                        long q = q(bufferItem4, this.A.c);
                        this.J = q;
                        if (o(3, this.H, this.I, q)) {
                            if (mode == mode3) {
                                long j12 = (this.J * 90000) / this.A.c;
                                this.G = j12;
                                if (!o(1, this.E, this.I, j12)) {
                                    Log.e("RtspConnection", "failed to send report");
                                }
                            }
                            b2 = AmfConstants.TYPE_TYPED_OBJECT_MARKER;
                            BufferItem bufferItem5 = this.C;
                            m(bufferItem5);
                            byte[] bArr7 = bufferItem5.c;
                            length = bArr7.length;
                            if (length > 2) {
                            }
                            Log.e("RtspConnection", "failed to send audio frame");
                            return;
                        }
                        Log.e("RtspConnection", "failed to send report");
                        Log.e("RtspConnection", "failed to send audio report");
                        return;
                    }
                    if (j11 != -1) {
                        b2 = AmfConstants.TYPE_TYPED_OBJECT_MARKER;
                        long q2 = q(bufferItem4, this.A.c);
                        long j13 = this.J;
                        long j14 = q2 - j13;
                        int i5 = this.A.c;
                        if (j14 > i5 * 5) {
                            long j15 = ((j14 * 4294967296L) / i5) + this.I;
                            this.I = j15;
                            long j16 = j13 + j14;
                            this.J = j16;
                            if (!o(3, this.H, j15, j16)) {
                                Log.e("RtspConnection", "failed to send report");
                                Log.e("RtspConnection", "failed to send audio report");
                                return;
                            }
                        }
                        BufferItem bufferItem52 = this.C;
                        m(bufferItem52);
                        byte[] bArr72 = bufferItem52.c;
                        length = bArr72.length;
                        if (length > 2) {
                        }
                        Log.e("RtspConnection", "failed to send audio frame");
                        return;
                    }
                    long q3 = q(bufferItem4, this.A.c);
                    long j17 = q3 - this.J;
                    long j18 = this.F;
                    int i6 = this.A.c;
                    b2 = AmfConstants.TYPE_TYPED_OBJECT_MARKER;
                    long j19 = j18 + (j17 * i6);
                    this.I = j19;
                    this.J = q3;
                    if (!o(3, this.H, j19, q3)) {
                        Log.e("RtspConnection", "failed to send report");
                        Log.e("RtspConnection", "failed to send audio report");
                        return;
                    }
                    BufferItem bufferItem522 = this.C;
                    m(bufferItem522);
                    byte[] bArr722 = bufferItem522.c;
                    length = bArr722.length;
                    if (length > 2) {
                        wkz wkzVar2 = new wkz();
                        Arrays.fill(bArr2, (byte) 0);
                        wkzVar2.b = bArr2;
                        wkzVar2.b(2, length + 16);
                        wkzVar2.h();
                        byte[] bArr8 = (byte[]) wkzVar2.b;
                        bArr8[5] = (byte) (bArr8[5] | 97);
                        int i7 = this.L;
                        this.L = i7 + 1;
                        wkzVar2.e(i7);
                        wkzVar2.d();
                        wkzVar2.g((int) ((this.A.c * bufferItem522.d) / 1000000));
                        wkzVar2.f(this.H);
                        short s = (short) length;
                        byte[] bArr9 = (byte[]) wkzVar2.b;
                        bArr9[b2] = 0;
                        bArr9[17] = b2;
                        bArr9[18] = (byte) ((s >> 5) & 255);
                        bArr9[19] = (byte) ((s << 3) & 248);
                        try {
                            a(0, 20, bArr2);
                            i(0, bArr722.length, bArr722);
                            this.k++;
                            this.s = b.SEND_NEW_ITEM;
                        } catch (Exception e2) {
                            Log.e("RtspConnection", Log.getStackTraceString(e2));
                        }
                    }
                    Log.e("RtspConnection", "failed to send audio frame");
                    return;
                }
            }
        }
    }

    public final void v() {
        StringBuilder b2 = ho8.b(i5s.a(new StringBuilder("OPTIONS "), this.v, " RTSP/1.0\r\n"), "CSeq: ");
        int i = this.P;
        this.P = i + 1;
        StringBuilder b3 = ho8.b(h5s.c(i, "\r\n", b2), "User-Agent: UA-com.vk.media\r\n");
        this.c.getClass();
        StringBuilder e = fw3.e(b3.toString());
        e.append(p("OPTIONS"));
        try {
            j(fo8.a(e.toString(), "\r\n"));
            this.s = b.OPTIONS;
        } catch (IOException e2) {
            Log.e("RtspConnection", Log.getStackTraceString(e2));
            b();
        }
    }

    public final void w() {
        StringBuilder b2 = ho8.b(fo8.a(i5s.a(new StringBuilder("RECORD "), this.v, " RTSP/1.0\r\n"), "Range: npt=0.000-\r\n"), "CSeq: ");
        int i = this.P;
        this.P = i + 1;
        StringBuilder b3 = ho8.b(h5s.c(i, "\r\n", b2), "User-Agent: UA-com.vk.media\r\n");
        this.c.getClass();
        StringBuilder e = fw3.e(b3.toString());
        e.append(r());
        StringBuilder e2 = fw3.e(e.toString());
        e2.append(p("RECORD"));
        try {
            j(fo8.a(e2.toString(), "\r\n"));
        } catch (IOException e3) {
            Log.e("RtspConnection", Log.getStackTraceString(e3));
            b();
        }
    }

    public final void x() {
        StringBuilder b2 = ho8.b(fo8.a(i5s.a(new StringBuilder("SETUP "), this.v, "/streamid=1 RTSP/1.0\r\n"), "Transport: RTP/AVP/TCP;unicast;interleaved=2-3;mode=record\r\n"), "CSeq: ");
        int i = this.P;
        this.P = i + 1;
        StringBuilder b3 = ho8.b(h5s.c(i, "\r\n", b2), "User-Agent: UA-com.vk.media\r\n");
        this.c.getClass();
        StringBuilder e = fw3.e(b3.toString());
        e.append(r());
        StringBuilder e2 = fw3.e(e.toString());
        e2.append(p("SETUP"));
        try {
            j(fo8.a(e2.toString(), "\r\n"));
        } catch (IOException e3) {
            Log.e("RtspConnection", Log.getStackTraceString(e3));
            b();
        }
    }

    public final int y(BufferItem bufferItem, int i) {
        int length = this.C.c.length;
        int i2 = length - i;
        if (i2 > 20000) {
            i2 = 20000;
        }
        wkz wkzVar = new wkz();
        byte[] bArr = this.y;
        Arrays.fill(bArr, (byte) 0);
        wkzVar.b = bArr;
        wkzVar.b(0, i2 + 14);
        wkzVar.h();
        byte[] bArr2 = (byte[]) wkzVar.b;
        bArr2[5] = (byte) (bArr2[5] | 96);
        int i3 = this.K;
        this.K = i3 + 1;
        wkzVar.e(i3);
        wkzVar.d();
        wkzVar.g((int) q(bufferItem, 90000));
        wkzVar.f(this.E);
        byte[] bArr3 = bufferItem.c;
        byte b2 = bArr3[0];
        byte b3 = (byte) ((b2 >> 5) & 3);
        byte b4 = (byte) (b2 & 31);
        byte[] bArr4 = (byte[]) wkzVar.b;
        bArr4[16] = 28;
        bArr4[16] = (byte) (((b3 & 3) << 5) | 28);
        if (i == 1) {
            wkzVar.a(b4, true, false);
        } else if (i + i2 >= length) {
            wkzVar.a(b4, false, true);
        } else {
            wkzVar.a(b4, false, false);
        }
        try {
            a(0, 18, bArr);
            i(i, i2, bArr3);
            this.m++;
            return i2;
        } catch (Exception e) {
            Log.e("RtspConnection", Log.getStackTraceString(e));
            return -1;
        }
    }
}
