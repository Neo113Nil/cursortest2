package xsna;

import android.content.Context;
import com.vk.video.growth.api.CommunityGrowthTrapEvent;
import com.vk.video.growth.api.CommunityGrowthTrapScreen;
import com.vk.video.growth.api.data.VideoGrowthVideoParams;
import xsna.yos0;

/* compiled from: VideoCommunityGrowthPopupControllerImpl.kt */
/* loaded from: classes6.dex */
public final class ucs0 implements qos0 {
    public final /* synthetic */ yos0.a a;
    public final /* synthetic */ zos0 b;
    public final /* synthetic */ vcs0 c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ VideoGrowthVideoParams e;
    public final /* synthetic */ String f;

    public ucs0(yos0.a aVar, zos0 zos0Var, vcs0 vcs0Var, Context context, VideoGrowthVideoParams videoGrowthVideoParams, String str) {
        this.a = aVar;
        this.b = zos0Var;
        this.c = vcs0Var;
        this.d = context;
        this.e = videoGrowthVideoParams;
        this.f = str;
    }

    @Override // xsna.qos0
    public final void a() {
        this.c.b.f(CommunityGrowthTrapScreen.GROUP, CommunityGrowthTrapEvent.MODAL);
    }

    @Override // xsna.qos0
    public final void b() {
        this.c.b.e(CommunityGrowthTrapScreen.GROUP, CommunityGrowthTrapEvent.MODAL);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    @Override // xsna.qos0
    public final void c() {
        this.a.a.invoke();
        hit0 hit0Var = this.c.c;
        zos0 zos0Var = this.b;
        hit0Var.b(this.d, zos0Var.b, zos0Var.a, this.e, this.f);
    }

    @Override // xsna.qos0
    public final void onCancel() {
        this.c.b.e(CommunityGrowthTrapScreen.GROUP, CommunityGrowthTrapEvent.MODAL);
    }
}
