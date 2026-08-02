package xsna;

import com.vk.stickers.views.animation.VKAnimationView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class d7r0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ VKAnimationView c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ d7r0(int i, VKAnimationView vKAnimationView, boolean z) {
        this.b = i;
        this.c = vKAnimationView;
        this.d = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        int i = this.b;
        VKAnimationView vKAnimationView = this.c;
        if (i > 0) {
            int i2 = VKAnimationView.w;
            rsg0.y0(new lil0(i), null, null, 3).subscribe(new f7r0(new e7r0(i, vKAnimationView, this.d), 0), new tk40(new gib0(vKAnimationView, 19), 22));
        } else {
            a780 a780Var = vKAnimationView.p;
            if (a780Var != null) {
                a780Var.a();
            }
        }
        com.vk.metrics.eventtracking.b.a.a(th);
        return s3q0.a;
    }
}
