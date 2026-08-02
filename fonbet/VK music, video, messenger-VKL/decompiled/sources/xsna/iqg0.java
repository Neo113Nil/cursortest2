package xsna;

import android.os.Build;
import com.mbridge.msdk.MBridgeConstans;
import one.video.player.live.proto.rtmp.ProtocolException;
import ru.ok.android.sdk.api.login.LoginRequest;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.bw1;

/* compiled from: RtmpMessages.java */
/* loaded from: classes8.dex */
public final class iqg0 extends bw1 {
    public final cw1 a = new cw1(LoginRequest.CLIENT_NAME);
    public final cw1 b = new cw1("Android/one.video.player.live/release/false/0/build0");
    public final cw1 c = new cw1("dummy.swf");
    public final cw1 d = new cw1("rtmp://127.0.0.1");
    public final vv1 e;
    public final zv1 f;
    public final zv1 g;
    public final zv1 h;
    public final zv1 i;
    public final cw1 j;
    public final cw1 k;
    public final cw1 l;
    public final cw1 m;
    public final cw1 n;

    public iqg0() {
        vv1 vv1Var = new vv1();
        vv1Var.a = false;
        this.e = vv1Var;
        this.f = new zv1(4095.0d);
        this.g = new zv1(255.0d);
        this.h = new zv1(ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
        this.i = new zv1(ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
        this.j = new cw1(Build.BRAND);
        this.k = new cw1(Build.MANUFACTURER);
        this.l = new cw1(Build.MODEL);
        this.m = new cw1("null");
        this.n = new cw1("na");
    }

    @Override // xsna.bw1
    public final void a(bw1.e eVar) throws ProtocolException {
        eVar.a(MBridgeConstans.DYNAMIC_VIEW_WX_APP, this.a);
        eVar.a("flashVer", this.b);
        eVar.a("swfUrl", this.c);
        eVar.a("tcUrl", this.d);
        eVar.a("fpad", this.e);
        eVar.a("audioCodecs", this.f);
        eVar.a("videoCodecs", this.g);
        eVar.a("objectEncoding", this.h);
        eVar.a("videoFunction", this.i);
        eVar.a("deviceBrand", this.j);
        eVar.a("deviceManufacturer", this.k);
        eVar.a("deviceModel", this.l);
        eVar.a("codecs", this.m);
        eVar.a("netType", this.n);
    }
}
