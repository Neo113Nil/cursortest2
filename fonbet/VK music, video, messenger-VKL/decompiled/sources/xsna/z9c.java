package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.libvideo.live.impl.fragment.VideoLiveFragment;
import xsna.bqx0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class z9c implements u080 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z9c(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.u080
    public final bqx0 b(View view, bqx0 bqx0Var) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                View view2 = (View) obj;
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = wqx0.a(bqx0Var);
                view2.setLayoutParams(marginLayoutParams);
                return bqx0Var;
            case 1:
                int i2 = VideoLiveFragment.i0;
                bqx0.q qVar = bqx0Var.a;
                h4x a = h4x.a(qVar.j(519), qVar.i(8));
                int i3 = ((ViewGroup) ((View) obj)).getResources().getConfiguration().orientation == 2 ? 0 : a.b;
                awt0.x(view, 0, i3, 0, a.d, 5);
                return new bqx0(qVar.r(0, i3, 0, a.d));
            default:
                sjd sjdVar = (sjd) obj;
                see seeVar = sjdVar.k;
                seeVar.getClass();
                seeVar.c = wqx0.a(bqx0Var);
                seeVar.a();
                int a2 = wqx0.a(bqx0Var);
                sjdVar.m = a2;
                if (sjdVar.c.c) {
                    f4m.t(a2, sjdVar.d);
                }
                sjdVar.l.c(sjdVar.m, sjdVar.e);
                return bqx0.b;
        }
    }
}
