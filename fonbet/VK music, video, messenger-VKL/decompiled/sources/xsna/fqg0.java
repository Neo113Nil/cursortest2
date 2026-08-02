package xsna;

import android.util.Log;
import androidx.annotation.Nullable;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.facebook.soloader.MinElf;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.media.recorder.impl.BufferItem;
import com.vk.media.recorder.impl.Streamer;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.NetworkInterface;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import ru.ok.android.commons.nio.charset.CharsetEncoder;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.media.api.LiveStreamStatReporter;
import xsna.qom0;

/* compiled from: RtmpConnection.java */
/* loaded from: classes3.dex */
public final class fqg0 extends wb6 {
    public final String A;
    public final byte[] B;
    public int C;
    public int D;
    public boolean E;
    public zpg0 F;
    public final HashMap<Integer, zpg0> G;
    public int H;
    public long I;
    public long J;
    public qom0.b K;
    public qom0.a L;
    public final rqg0 M;
    public final rqg0 N;
    public final rqg0 O;
    public int P;
    public BufferItem Q;
    public long R;
    public boolean S;
    public long T;
    public final Streamer.a s;
    public final int t;
    public final byte[] u;
    public double v;
    public boolean w;
    public c x;
    public Streamer.STATUS y;
    public final String z;

    /* compiled from: RtmpConnection.java */
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
            int[] iArr2 = new int[c.values().length];
            a = iArr2;
            try {
                iArr2[c.C0C1.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[c.CONNECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[c.CREATE_STREAM.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[c.PUBLISH.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[c.SEND_NEXT_ITEM.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[c.SEND_VIDEO_PART.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[c.C2.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RtmpConnection.java */
    public static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b RTMP_COMMAND_RESPONSE_CONNECT;
        public static final b RTMP_COMMAND_RESPONSE_CREATE_STREAM;
        public static final b RTMP_COMMAND_RESPONSE_PUBLISH;
        public static final b RTMP_COMMAND_RESPONSE_UNKNOWN;

        static {
            b bVar = new b("RTMP_COMMAND_RESPONSE_UNKNOWN", 0);
            RTMP_COMMAND_RESPONSE_UNKNOWN = bVar;
            b bVar2 = new b("RTMP_COMMAND_RESPONSE_CONNECT", 1);
            RTMP_COMMAND_RESPONSE_CONNECT = bVar2;
            b bVar3 = new b("RTMP_COMMAND_RESPONSE_CREATE_STREAM", 2);
            RTMP_COMMAND_RESPONSE_CREATE_STREAM = bVar3;
            b bVar4 = new b("RTMP_COMMAND_RESPONSE_PUBLISH", 3);
            RTMP_COMMAND_RESPONSE_PUBLISH = bVar4;
            $VALUES = new b[]{bVar, bVar2, bVar3, bVar4};
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RtmpConnection.java */
    public static final class c {
        private static final /* synthetic */ c[] $VALUES;
        public static final c C0C1;
        public static final c C2;
        public static final c CLOSED;
        public static final c CONNECT;
        public static final c CREATE_STREAM;
        public static final c INITIAL;
        public static final c PUBLISH;
        public static final c SEND_NEXT_ITEM;
        public static final c SEND_VIDEO_PART;

        static {
            c cVar = new c("INITIAL", 0);
            INITIAL = cVar;
            c cVar2 = new c("C0C1", 1);
            C0C1 = cVar2;
            c cVar3 = new c("C2", 2);
            C2 = cVar3;
            c cVar4 = new c("CONNECT", 3);
            CONNECT = cVar4;
            c cVar5 = new c("CREATE_STREAM", 4);
            CREATE_STREAM = cVar5;
            c cVar6 = new c("PUBLISH", 5);
            PUBLISH = cVar6;
            c cVar7 = new c("SEND_NEXT_ITEM", 6);
            SEND_NEXT_ITEM = cVar7;
            c cVar8 = new c("SEND_VIDEO_PART", 7);
            SEND_VIDEO_PART = cVar8;
            c cVar9 = new c("CLOSED", 8);
            CLOSED = cVar9;
            $VALUES = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9};
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    public fqg0(g4j g4jVar, int i, Streamer.MODE mode, Streamer.a aVar, String str, int i2, String str2, String str3, @Nullable LiveStreamStatReporter liveStreamStatReporter) throws IOException {
        super(g4jVar, i, mode, str, i2, MinElf.PN_XNUM, liveStreamStatReporter);
        this.t = MinElf.PN_XNUM;
        this.u = new byte[16];
        this.v = -1.0d;
        this.w = false;
        this.x = c.INITIAL;
        this.y = Streamer.STATUS.CONN_FAIL;
        this.B = new byte[]{3, 0, 0, 0, 0, 10, 0, 0, 1};
        this.C = 128;
        this.E = true;
        this.G = new HashMap<>();
        this.H = 0;
        this.I = 0L;
        this.J = 0L;
        this.M = new rqg0((byte) 18);
        this.N = new rqg0((byte) 8);
        this.O = new rqg0((byte) 9);
        this.P = 0;
        this.R = 0L;
        this.S = true;
        this.T = 0L;
        this.d = i;
        this.z = str2;
        this.A = str3;
        this.s = aVar;
        if (aVar.a == Streamer.AUTH.PERISCOPE) {
            this.t = 8192;
        }
    }

    public static ByteBuffer o(byte[] bArr, byte[] bArr2) {
        if (bArr.length < 4) {
            Log.e("RtmpConnection", "sps must be at least 4 bytes long");
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 11 + bArr2.length);
        allocate.put((byte) 1);
        allocate.put(bArr, 1, 3);
        allocate.put((byte) -1);
        allocate.put((byte) -31);
        allocate.put((byte) ((bArr.length >> 8) & 255));
        allocate.put((byte) (bArr.length & 255));
        allocate.put(bArr);
        allocate.put((byte) 1);
        allocate.put((byte) ((bArr2.length >> 8) & 255));
        allocate.put((byte) (bArr2.length & 255));
        allocate.put(bArr2);
        return allocate;
    }

    @Override // xsna.wb6
    public final synchronized void b() {
        try {
            c cVar = this.x;
            c cVar2 = c.CLOSED;
            if (cVar != cVar2) {
                LiveStreamStatReporter liveStreamStatReporter = this.r;
                if (liveStreamStatReporter != null) {
                    liveStreamStatReporter.streamDisconnected(this.y.toString());
                }
                if (this.y == Streamer.STATUS.AUTH_FAIL) {
                }
                this.x = cVar2;
                super.b();
                d(Streamer.CONNECTION_STATE.DISCONNECTED, this.y);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x00d1 A[Catch: IOException -> 0x00e5, TryCatch #2 {IOException -> 0x00e5, blocks: (B:5:0x0094, B:6:0x00c7, B:8:0x00d1, B:15:0x0101, B:16:0x00dc, B:18:0x00e7, B:20:0x00f0, B:22:0x00f9, B:25:0x0108), top: B:4:0x0094 }] */
    @Override // xsna.wb6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        String str;
        String str2;
        SocketAddress localAddress;
        ByteBuffer allocate;
        String str3 = "";
        LiveStreamStatReporter liveStreamStatReporter = this.r;
        if (liveStreamStatReporter != null) {
            try {
                localAddress = this.a.getLocalAddress();
            } catch (IOException e) {
                e = e;
                str = "";
            }
            if (localAddress instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) localAddress;
                InetAddress address = inetSocketAddress.getAddress();
                str = address.getHostAddress() + StringUtils.PROCESS_POSTFIX_DELIMITER + inetSocketAddress.getPort();
                try {
                    try {
                        NetworkInterface byInetAddress = NetworkInterface.getByInetAddress(address);
                        if (byInetAddress != null) {
                            str3 = byInetAddress.getName();
                        } else {
                            Log.e("RtmpConnection", "onConnect - interface unknown for " + address);
                        }
                    } catch (SocketException e2) {
                        Log.e("RtmpConnection", "onConnect - failed to get interface for address " + address, e2);
                    }
                } catch (IOException e3) {
                    e = e3;
                    Log.e("RtmpConnection", "onConnect - failed to get bound address", e);
                    str2 = str3;
                    str3 = str;
                    liveStreamStatReporter.streamConnected(str3, str2);
                    this.y = Streamer.STATUS.UNKNOWN_FAIL;
                    d(Streamer.CONNECTION_STATE.CONNECTED, Streamer.STATUS.SUCCESS);
                    allocate = ByteBuffer.allocate(1537);
                    allocate.put(this.B);
                    byte[] bArr = {(byte) (System.currentTimeMillis() / 1000), (byte) (r1 >> 8), (byte) (r1 >> 16), (byte) (r1 >> 24)};
                    int i = 0;
                    while (allocate.position() < allocate.limit()) {
                    }
                    byte[] array = allocate.array();
                    i(0, array.length, array);
                    this.x = c.C0C1;
                }
                str2 = str3;
                str3 = str;
                liveStreamStatReporter.streamConnected(str3, str2);
            } else {
                Log.e("RtmpConnection", "onConnect - unsupported type of SocketAddress: " + localAddress);
                str2 = "";
                liveStreamStatReporter.streamConnected(str3, str2);
            }
        }
        this.y = Streamer.STATUS.UNKNOWN_FAIL;
        d(Streamer.CONNECTION_STATE.CONNECTED, Streamer.STATUS.SUCCESS);
        try {
            allocate = ByteBuffer.allocate(1537);
            allocate.put(this.B);
            byte[] bArr2 = {(byte) (System.currentTimeMillis() / 1000), (byte) (r1 >> 8), (byte) (r1 >> 16), (byte) (r1 >> 24)};
            int i2 = 0;
            while (allocate.position() < allocate.limit()) {
                int i3 = i2 % 4;
                if (i3 == 0) {
                    bArr2[0] = (byte) (bArr2[1] + bArr2[2]);
                } else if (i3 == 1) {
                    bArr2[1] = (byte) (bArr2[2] + bArr2[3]);
                } else if (i3 == 2) {
                    bArr2[2] = (byte) (bArr2[0] + bArr2[1]);
                } else if (i3 == 3) {
                    bArr2[3] = (byte) (bArr2[0] + bArr2[2]);
                }
                allocate.put(bArr2);
                i2 = (i2 + 1) % 4;
            }
            byte[] array2 = allocate.array();
            i(0, array2.length, array2);
        } catch (IOException e4) {
            Log.e("RtmpConnection", Log.getStackTraceString(e4));
            b();
        }
        this.x = c.C0C1;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0103  */
    @Override // xsna.wb6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(ByteBuffer byteBuffer) {
        ByteBuffer allocate;
        Streamer.MODE mode;
        Streamer.MODE mode2;
        switch (a.a[this.x.ordinal()]) {
            case 1:
                if (byteBuffer.position() >= 3073) {
                    if (byteBuffer.array()[0] != 3) {
                        Log.e("RtmpConnection", "Invalid protocol version: " + ((int) byteBuffer.array()[0]));
                        b();
                        return 0;
                    }
                    try {
                        i(1, 1536, byteBuffer.array());
                    } catch (IOException e) {
                        Log.e("RtmpConnection", Log.getStackTraceString(e));
                        b();
                    }
                    hqg0.l(byteBuffer.position(), byteBuffer);
                    this.x = c.C2;
                    v(this.t);
                    t();
                    this.x = c.CONNECT;
                }
                return 0;
            case 2:
                q(byteBuffer);
                if (this.w) {
                    try {
                        ByteBuffer allocate2 = ByteBuffer.allocate(128);
                        hqg0.k("createStream", allocate2);
                        allocate2.put((byte) 0);
                        allocate2.putDouble(2.0d);
                        allocate2.put((byte) 5);
                        byte[] bArr = new byte[12];
                        bArr[0] = 3;
                        int position = allocate2.position();
                        bArr[4] = 0;
                        bArr[5] = 0;
                        bArr[6] = (byte) position;
                        bArr[7] = 20;
                        a(0, 12, bArr);
                        i(0, allocate2.position(), allocate2.array());
                    } catch (Exception e2) {
                        Log.e("RtmpConnection", Log.getStackTraceString(e2));
                        b();
                    }
                    this.x = c.CREATE_STREAM;
                }
                return 0;
            case 3:
                q(byteBuffer);
                if (this.w) {
                    d(Streamer.CONNECTION_STATE.SETUP, Streamer.STATUS.SUCCESS);
                    try {
                        ByteBuffer allocate3 = ByteBuffer.allocate(3072);
                        allocate3.put(new byte[12]);
                        hqg0.k("publish", allocate3);
                        allocate3.put((byte) 0);
                        allocate3.putDouble(ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
                        allocate3.put((byte) 5);
                        hqg0.k(this.A, allocate3);
                        hqg0.k("live", allocate3);
                        allocate3.put(0, (byte) 8);
                        int position2 = allocate3.position() - 12;
                        allocate3.put(4, (byte) 0);
                        allocate3.put(5, (byte) ((position2 >> 8) & 255));
                        allocate3.put(6, (byte) (position2 & 255));
                        allocate3.put(7, (byte) 20);
                        int i = (int) this.v;
                        this.M.f = i;
                        this.O.f = i;
                        this.N.f = i;
                        allocate3.put(8, (byte) i);
                        allocate3.put(9, (byte) (i >> 8));
                        allocate3.put(10, (byte) (i >> 16));
                        allocate3.put(11, (byte) (i >> 24));
                        i(0, allocate3.position(), allocate3.array());
                    } catch (Exception e3) {
                        Log.e("RtmpConnection", Log.getStackTraceString(e3));
                        b();
                    }
                    this.x = c.PUBLISH;
                }
                return 0;
            case 4:
                q(byteBuffer);
                if (this.w) {
                    LiveStreamStatReporter liveStreamStatReporter = this.r;
                    if (liveStreamStatReporter != null) {
                        liveStreamStatReporter.streamStarted();
                    }
                    try {
                        allocate = ByteBuffer.allocate(1500);
                        hqg0.k("@setDataFrame", allocate);
                        hqg0.k("onMetaData", allocate);
                        allocate.put((byte) 3);
                        mode = this.b;
                    } catch (Exception e4) {
                        Log.e("RtmpConnection", Log.getStackTraceString(e4));
                        b();
                    }
                    if (mode != Streamer.MODE.VIDEO_ONLY) {
                        if (mode == Streamer.MODE.AUDIO_VIDEO) {
                        }
                        mode2 = this.b;
                        if (mode2 != Streamer.MODE.AUDIO_ONLY || mode2 == Streamer.MODE.AUDIO_VIDEO) {
                            hqg0.j("audiosamplerate", allocate);
                            double d = this.c.l.c;
                            allocate.put((byte) 0);
                            allocate.putDouble(d);
                            hqg0.j("audiodatarate", allocate);
                            allocate.put((byte) 0);
                            allocate.putDouble(this.c.l.d / 1024.0d);
                            hqg0.j("audiosamplesize", allocate);
                            allocate.put((byte) 0);
                            allocate.putDouble(16.0d);
                            hqg0.j("stereo", allocate);
                            int i2 = this.c.l.b <= 1 ? 1 : 0;
                            allocate.put((byte) 1);
                            allocate.put((byte) i2);
                            hqg0.j("audiocodecid", allocate);
                            hqg0.k(AudioSampleEntry.TYPE3, allocate);
                        }
                        allocate.put((byte) 0);
                        allocate.put((byte) 0);
                        allocate.put((byte) 9);
                        a(0, this.M.a(allocate.position(), 0, this.u), this.u);
                        i(0, allocate.position(), allocate.array());
                        this.x = c.SEND_NEXT_ITEM;
                        d(Streamer.CONNECTION_STATE.RECORD, Streamer.STATUS.SUCCESS);
                        u();
                    }
                    qom0.b bVar = this.c.a.e;
                    this.K = bVar;
                    if (bVar == null) {
                        Log.e("RtmpConnection", "failed to get avc params, check if video capture is started");
                        b();
                    } else {
                        lsu a2 = lsu.a(bVar.b, bVar.a);
                        if (a2 == null) {
                            Log.e("RtmpConnection", "failed to get sps info");
                            b();
                        } else {
                            hqg0.j("width", allocate);
                            double d2 = a2.a;
                            allocate.put((byte) 0);
                            allocate.putDouble(d2);
                            hqg0.j("height", allocate);
                            double d3 = a2.b;
                            allocate.put((byte) 0);
                            allocate.putDouble(d3);
                            hqg0.j("videodatarate", allocate);
                            allocate.put((byte) 0);
                            allocate.putDouble(this.c.m.a / 1024.0d);
                            hqg0.j("videocodecid", allocate);
                            hqg0.k(VisualSampleEntry.TYPE3, allocate);
                            mode2 = this.b;
                            if (mode2 != Streamer.MODE.AUDIO_ONLY) {
                            }
                            hqg0.j("audiosamplerate", allocate);
                            double d4 = this.c.l.c;
                            allocate.put((byte) 0);
                            allocate.putDouble(d4);
                            hqg0.j("audiodatarate", allocate);
                            allocate.put((byte) 0);
                            allocate.putDouble(this.c.l.d / 1024.0d);
                            hqg0.j("audiosamplesize", allocate);
                            allocate.put((byte) 0);
                            allocate.putDouble(16.0d);
                            hqg0.j("stereo", allocate);
                            if (this.c.l.b <= 1) {
                            }
                            allocate.put((byte) 1);
                            allocate.put((byte) i2);
                            hqg0.j("audiocodecid", allocate);
                            hqg0.k(AudioSampleEntry.TYPE3, allocate);
                            allocate.put((byte) 0);
                            allocate.put((byte) 0);
                            allocate.put((byte) 9);
                            a(0, this.M.a(allocate.position(), 0, this.u), this.u);
                            i(0, allocate.position(), allocate.array());
                        }
                    }
                    this.x = c.SEND_NEXT_ITEM;
                    d(Streamer.CONNECTION_STATE.RECORD, Streamer.STATUS.SUCCESS);
                    u();
                }
                return 0;
            case 5:
            case 6:
                q(byteBuffer);
                return 0;
            default:
                b();
                return 0;
        }
    }

    @Override // xsna.wb6
    public final void g() {
        int i = a.a[this.x.ordinal()];
        if (i == 5) {
            u();
            return;
        }
        if (i != 6) {
            if (i != 7) {
                return;
            }
            v(this.t);
            t();
            this.x = c.CONNECT;
            return;
        }
        do {
            int i2 = this.P;
            BufferItem bufferItem = this.Q;
            if (i2 >= bufferItem.c.length) {
                this.x = c.SEND_NEXT_ITEM;
                u();
                return;
            } else {
                int w = w(bufferItem, i2);
                if (w <= 0) {
                    Log.e("RtmpConnection", "failed to send video part");
                    return;
                }
                this.P += w;
            }
        } while (c() <= 0);
        this.x = c.SEND_VIDEO_PART;
    }

    public final b p(double d) {
        int i = (int) d;
        return ((double) i) != d ? b.RTMP_COMMAND_RESPONSE_UNKNOWN : i != -1 ? i != 1 ? i != 2 ? b.RTMP_COMMAND_RESPONSE_UNKNOWN : this.x == c.CREATE_STREAM ? b.RTMP_COMMAND_RESPONSE_CREATE_STREAM : b.RTMP_COMMAND_RESPONSE_UNKNOWN : this.x == c.CONNECT ? b.RTMP_COMMAND_RESPONSE_CONNECT : b.RTMP_COMMAND_RESPONSE_UNKNOWN : this.x == c.PUBLISH ? b.RTMP_COMMAND_RESPONSE_PUBLISH : b.RTMP_COMMAND_RESPONSE_UNKNOWN;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0050 A[Catch: Exception -> 0x002d, TryCatch #1 {Exception -> 0x002d, blocks: (B:3:0x0007, B:5:0x0010, B:7:0x0014, B:9:0x001c, B:11:0x0024, B:12:0x002a, B:18:0x004c, B:14:0x0050, B:16:0x005e, B:25:0x0032, B:27:0x003a, B:31:0x0084, B:44:0x008e, B:46:0x0092, B:47:0x0096, B:33:0x009a, B:35:0x009e, B:36:0x00a3, B:38:0x00a9, B:42:0x00a1, B:50:0x00b4, B:55:0x00be, B:57:0x00c2, B:59:0x00c6, B:61:0x00cf, B:62:0x00d8, B:64:0x00e3, B:67:0x010b, B:71:0x0111, B:66:0x0105), top: B:2:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(ByteBuffer byteBuffer) {
        int i;
        HashMap<Integer, zpg0> hashMap = this.G;
        this.w = false;
        while (byteBuffer.position() > 0) {
            try {
                if (this.E) {
                    int i2 = byteBuffer.get(0) & CharsetEncoder.DEFAULT_REPLACEMENT;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            if (byteBuffer.position() < 3) {
                                return;
                            } else {
                                i = ((byteBuffer.get(1) & 255) << 8) + (byteBuffer.get(1) & 255);
                            }
                        }
                        if (i2 >= 2) {
                            b();
                            return;
                        }
                        zpg0 zpg0Var = hashMap.get(Integer.valueOf(i2));
                        this.F = zpg0Var;
                        if (zpg0Var == null) {
                            zpg0 zpg0Var2 = new zpg0();
                            zpg0Var2.a = false;
                            zpg0Var2.c = false;
                            zpg0Var2.d = true;
                            zpg0Var2.e = ByteBuffer.allocate(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                            zpg0Var2.m = true;
                            zpg0Var2.n = 0;
                            zpg0Var2.b = this;
                            zpg0Var2.l = i2;
                            this.F = zpg0Var2;
                            hashMap.put(Integer.valueOf(i2), this.F);
                        }
                    } else if (byteBuffer.position() < 2) {
                        return;
                    } else {
                        i = byteBuffer.get(1) & 255;
                    }
                    i2 = i + 64;
                    if (i2 >= 2) {
                    }
                }
                int a2 = this.F.a(byteBuffer);
                if ((a2 & 2) != 0) {
                    if ((a2 & 32) != 0) {
                        this.y = Streamer.STATUS.AUTH_FAIL;
                    }
                    b();
                    return;
                } else {
                    if ((a2 & 8) != 0) {
                        this.E = true;
                    } else {
                        this.E = false;
                    }
                    if ((a2 & 1) != 0) {
                        return;
                    } else {
                        this.H += this.F.n;
                    }
                }
            } catch (Exception e) {
                Log.e("RtmpConnection", Log.getStackTraceString(e));
                b();
                return;
            }
        }
        byteBuffer.position(0);
        int i3 = this.H;
        if (i3 > 0) {
            return;
        }
        if (i3 < 0) {
            b();
            return;
        }
        int i4 = this.D;
        if (i4 > 0) {
            long j = this.I;
            if (j >= -268435456) {
                this.I = j - this.J;
                this.J = 0L;
            }
            long j2 = this.I;
            if (j2 - this.J >= i4) {
                int i5 = (int) j2;
                byte[] bArr = new byte[12];
                bArr[0] = 2;
                bArr[6] = 4;
                bArr[7] = 3;
                byte[] bArr2 = {(byte) (i5 >> 24), (byte) (i5 >> 16), (byte) (i5 >> 8), (byte) i5};
                try {
                    a(0, 12, bArr);
                    i(0, 4, bArr2);
                    this.J = this.I;
                } catch (Exception e2) {
                    Log.e("RtmpConnection", Log.getStackTraceString(e2));
                    b();
                }
            }
        }
    }

    public final void r() {
        try {
            byte[] bArr = {-81, 0};
            qom0.a aVar = this.c.a.f;
            this.L = aVar;
            if (aVar == null) {
                Log.e("RtmpConnection", "failed to get aac params, check if audio capture is started");
                b();
                return;
            }
            a(0, this.N.a(aVar.b + 2, 0, this.u), this.u);
            a(0, 2, bArr);
            qom0.a aVar2 = this.L;
            i(0, aVar2.b, aVar2.a);
        } catch (Exception e) {
            Log.e("RtmpConnection", Log.getStackTraceString(e));
            b();
        }
    }

    public final void s() {
        try {
            qom0.b bVar = this.c.a.e;
            ByteBuffer o = o(bVar.a, bVar.c);
            a(0, this.O.a(o.position() + 5, 0, this.u), this.u);
            a(0, 5, new byte[]{23, 0, 0, 0, 0});
            i(0, o.position(), o.array());
        } catch (Exception e) {
            Log.e("RtmpConnection", Log.getStackTraceString(e));
            b();
        }
    }

    public final void t() {
        Streamer.a aVar = this.s;
        try {
            ByteBuffer allocate = ByteBuffer.allocate(3072);
            hqg0.k("connect", allocate);
            allocate.put((byte) 0);
            allocate.putDouble(1.0d);
            allocate.put((byte) 3);
            hqg0.j(MBridgeConstans.DYNAMIC_VIEW_WX_APP, allocate);
            Streamer.AUTH auth = aVar.a;
            Streamer.AUTH auth2 = Streamer.AUTH.LLNW;
            String str = this.z;
            if (auth == auth2) {
                hqg0.k(str + "?authmod=llnw&user=null", allocate);
            } else {
                hqg0.k(str, allocate);
            }
            hqg0.j("tcUrl", allocate);
            hqg0.k("rtmp://" + this.e + StringUtils.PROCESS_POSTFIX_DELIMITER + this.f + DomExceptionUtils.SEPARATOR + str, allocate);
            hqg0.j("flashVer", allocate);
            this.c.getClass();
            hqg0.k("FMLE/3.0 (compatible; UA-com.vk.media)", allocate);
            hqg0.j("fpad", allocate);
            allocate.put((byte) 1);
            allocate.put((byte) 0);
            hqg0.j("capabilities", allocate);
            allocate.put((byte) 0);
            allocate.putDouble(15.0d);
            hqg0.j("audioCodecs", allocate);
            allocate.put((byte) 0);
            allocate.putDouble(1028.0d);
            hqg0.j("videoCodecs", allocate);
            allocate.put((byte) 0);
            allocate.putDouble(128.0d);
            hqg0.j("videoFunction", allocate);
            allocate.put((byte) 0);
            allocate.putDouble(1.0d);
            allocate.put((byte) 0);
            allocate.put((byte) 0);
            allocate.put((byte) 9);
            byte[] bArr = new byte[12];
            bArr[0] = 3;
            int position = allocate.position();
            bArr[5] = (byte) (((65535 & position) >> 8) & 255);
            bArr[6] = (byte) (position & 255);
            bArr[7] = 20;
            i(0, 12, bArr);
            i(0, allocate.position(), allocate.array());
        } catch (Exception e) {
            Log.e("RtmpConnection", Log.getStackTraceString(e));
            b();
        }
    }

    public final void u() {
        while (c() <= 0) {
            BufferItem a2 = this.c.a.a(this.R);
            this.Q = a2;
            if (a2 == null) {
                return;
            }
            this.R = a2.b + 1;
            int i = a.b[a2.f.ordinal()];
            if (i == 1) {
                Streamer.MODE mode = this.b;
                Streamer.MODE mode2 = Streamer.MODE.AUDIO_VIDEO;
                if (mode == mode2 || mode == Streamer.MODE.VIDEO_ONLY) {
                    if (this.Q.a() || (this.m != 0 && this.Q.a - this.p <= 1)) {
                        n(this.Q);
                        if (this.S) {
                            this.S = false;
                            this.T = this.Q.d;
                            s();
                            if (this.b == mode2) {
                                r();
                            }
                        }
                        if (this.Q.d - this.T >= 0) {
                            if (this.K != this.c.a.e) {
                                qom0.b bVar = this.c.a.e;
                                if (bVar != null) {
                                    qom0.b bVar2 = this.K;
                                    if (bVar2 != null && !bVar2.equals(bVar)) {
                                        if (this.Q.a()) {
                                            this.K = bVar;
                                            s();
                                        } else {
                                            continue;
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            }
                            BufferItem bufferItem = this.Q;
                            byte[] bArr = this.u;
                            try {
                                long j = ((bufferItem.d - this.T) * 1000) / 1000000;
                                byte[] bArr2 = bufferItem.c;
                                int i2 = bufferItem.a() ? 1 : 2;
                                byte b2 = (byte) 0;
                                a(0, this.O.a(9 + bArr2.length, (int) j, bArr), bArr);
                                a(0, 5, new byte[]{(byte) ((i2 << 4) | 7), 1, b2, b2, b2});
                                int length = bArr2.length;
                                byte[] bArr3 = new byte[4];
                                for (int i3 = 0; i3 < 4; i3++) {
                                    bArr3[i3] = (byte) (length >> 24);
                                    length <<= 8;
                                }
                                a(0, 4, bArr3);
                            } catch (Exception e) {
                                Log.e("RtmpConnection", Log.getStackTraceString(e));
                                b();
                            }
                            this.x = c.SEND_VIDEO_PART;
                            this.P = 0;
                            do {
                                int i4 = this.P;
                                BufferItem bufferItem2 = this.Q;
                                if (i4 >= bufferItem2.c.length) {
                                    this.m++;
                                    this.x = c.SEND_NEXT_ITEM;
                                } else {
                                    int w = w(bufferItem2, i4);
                                    if (w <= 0) {
                                        Log.e("RtmpConnection", "failed to send video part");
                                        return;
                                    }
                                    this.P += w;
                                }
                            } while (c() <= 0);
                            return;
                        }
                        continue;
                    }
                }
            } else if (i != 2) {
                Log.e("RtmpConnection", "unsupported frame type " + this.Q.f);
            } else {
                Streamer.MODE mode3 = this.b;
                Streamer.MODE mode4 = Streamer.MODE.AUDIO_VIDEO;
                if (mode3 == mode4 || mode3 == Streamer.MODE.AUDIO_ONLY) {
                    m(this.Q);
                    if (this.S) {
                        this.S = false;
                        this.T = this.Q.d;
                        r();
                        if (this.b == mode4) {
                            s();
                        }
                    }
                    if (this.Q.d - this.T >= 0) {
                        if (this.L != this.c.a.f) {
                            qom0.a aVar = this.c.a.f;
                            if (aVar != null) {
                                qom0.a aVar2 = this.L;
                                if (aVar2 != null && !aVar2.equals(aVar)) {
                                    r();
                                }
                            }
                        }
                        BufferItem bufferItem3 = this.Q;
                        byte[] bArr4 = this.u;
                        try {
                            byte[] bArr5 = bufferItem3.c;
                            a(0, this.N.a(2 + bArr5.length, (int) (((bufferItem3.d - this.T) * 1000) / 1000000), bArr4), bArr4);
                            a(0, 2, new byte[]{-81, 1});
                            i(0, bArr5.length, bArr5);
                            this.k++;
                        } catch (Exception e2) {
                            Log.e("RtmpConnection", Log.getStackTraceString(e2));
                            b();
                        }
                    }
                }
            }
        }
    }

    public final void v(int i) {
        try {
            byte[] bArr = new byte[12];
            bArr[0] = 2;
            bArr[6] = 4;
            bArr[7] = 1;
            a(0, 12, bArr);
            i(0, 4, new byte[]{(byte) 0, (byte) 0, (byte) (i >> 8), (byte) i});
        } catch (Exception e) {
            Log.e("RtmpConnection", Log.getStackTraceString(e));
            b();
        }
    }

    public final int w(BufferItem bufferItem, int i) {
        int i2 = this.t;
        if (i == 0) {
            i2 -= 9;
        }
        try {
            byte[] bArr = bufferItem.c;
            int length = bArr.length - i;
            if (length <= i2) {
                i(i, length, bArr);
                return length;
            }
            a(i, i2, bArr);
            i(0, 1, new byte[]{-59});
            return i2;
        } catch (Exception e) {
            Log.e("RtmpConnection", Log.getStackTraceString(e));
            b();
            return -1;
        }
    }

    public final void x(double d, double d2) {
        int i = (int) d;
        if (i == -1) {
            if (this.x == c.PUBLISH && d2 == this.v) {
                this.w = true;
                return;
            } else {
                b();
                return;
            }
        }
        if (i == 1) {
            if (this.x != c.CONNECT) {
                b();
                return;
            } else {
                this.w = true;
                return;
            }
        }
        if (i != 2) {
            return;
        }
        if (this.x != c.CREATE_STREAM) {
            b();
        } else {
            this.v = d2;
            this.w = true;
        }
    }
}
