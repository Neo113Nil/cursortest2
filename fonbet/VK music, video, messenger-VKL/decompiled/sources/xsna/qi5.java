package xsna;

import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.libvideo.models.videotracker.RewindType;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* compiled from: AutoPlayAdapters.kt */
/* loaded from: classes17.dex */
public final class qi5 implements kih0 {
    public static final /* synthetic */ qcy<Object>[] c;
    public final yg5 a;
    public final z6i b = new z6i(new pu(this, 9), new i8(8), new vl1(this, 7));

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(qi5.class, "videoFile", "getVideoFile()Lcom/vk/clips/sdk/shared/api/deps/video/SdkVideoFile;", 0);
        fpf0.a.getClass();
        c = new qcy[]{mutablePropertyReference1Impl};
    }

    public qi5(yg5 yg5Var) {
        this.a = yg5Var;
    }

    @Override // xsna.kih0
    public final SdkVideoFile A() {
        qcy<Object> qcyVar = c[0];
        return (SdkVideoFile) this.b.b();
    }

    @Override // xsna.kih0
    public final boolean B() {
        return this.a.B();
    }

    @Override // xsna.kih0
    public final void D() {
        this.a.D();
    }

    @Override // xsna.kih0
    public final void F() {
        this.a.F();
    }

    @Override // xsna.kih0
    public final void I() {
        this.a.I();
    }

    @Override // xsna.kih0
    public final boolean J() {
        return this.a.J();
    }

    @Override // xsna.kih0
    public final void K() {
        this.a.K();
    }

    @Override // xsna.kih0
    public final boolean M() {
        return this.a.M();
    }

    @Override // xsna.kih0
    public final void O() {
        this.a.O();
    }

    @Override // xsna.kih0
    public final boolean a() {
        return this.a.a();
    }

    @Override // xsna.kih0
    public final void c() {
        this.a.c();
    }

    @Override // xsna.kih0
    public final boolean d() {
        return this.a.d();
    }

    public final boolean equals(Object obj) {
        boolean z = obj instanceof qi5;
        yg5 yg5Var = this.a;
        return z ? epx.f(yg5Var, ((qi5) obj).a) : epx.f(yg5Var, obj);
    }

    @Override // xsna.kih0
    public final void f() {
        this.a.f();
    }

    @Override // xsna.kih0
    public final long getDuration() {
        return this.a.getDuration();
    }

    @Override // xsna.kih0
    public final long getPosition() {
        return this.a.getPosition();
    }

    @Override // xsna.kih0
    public final void h() {
        this.a.S(false);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // xsna.kih0
    public final void i() {
        rlt0 m0 = this.a.m0();
        if (m0 != null) {
            m0.i("pause", "pause");
        }
    }

    @Override // xsna.kih0
    public final boolean isPaused() {
        return this.a.isPaused();
    }

    @Override // xsna.kih0
    public final boolean isPlaying() {
        return this.a.isPlaying();
    }

    @Override // xsna.kih0
    public final boolean isPrepared() {
        return this.a.isPrepared();
    }

    @Override // xsna.kih0
    public final void j() {
        rlt0 m0 = this.a.m0();
        if (m0 != null) {
            m0.i("pause", CampaignEx.JSON_NATIVE_VIDEO_RESUME);
        }
    }

    @Override // xsna.kih0
    public final void k(SdkVideoFile sdkVideoFile) {
        qcy<Object> qcyVar = c[0];
        this.b.e.invoke(sdkVideoFile);
    }

    @Override // xsna.kih0
    public final void l(int i, int i2) {
        rlt0 m0 = this.a.m0();
        if (m0 != null) {
            m0.l(i, i2, RewindType.SLIDER);
        }
    }

    @Override // xsna.kih0
    public final void m(String str, String str2, String str3) {
        yg5 yg5Var = this.a;
        yg5Var.n0(str, str2, str3, yg5Var.V());
    }

    @Override // xsna.kih0
    public final boolean n(View view) {
        VideoTextureView videoTextureView = view instanceof VideoTextureView ? (VideoTextureView) view : null;
        if (videoTextureView == null) {
            return false;
        }
        return this.a.j0(videoTextureView);
    }

    @Override // xsna.kih0
    public final void o(lih0 lih0Var) {
        this.a.T(new int0(lih0Var, this));
    }

    @Override // xsna.kih0
    public final void p(lih0 lih0Var) {
        this.a.f0(new int0(lih0Var, this));
    }

    @Override // xsna.kih0
    public final void pause() {
        this.a.pause();
    }

    @Override // xsna.kih0
    public final void play() {
        this.a.play();
    }

    @Override // xsna.kih0
    public final void prepare() {
        this.a.G0(true);
    }

    @Override // xsna.kih0
    public final void seek(long j) {
        this.a.seek(j);
    }

    @Override // xsna.kih0
    public final void y() {
        this.a.K0(true);
    }
}
