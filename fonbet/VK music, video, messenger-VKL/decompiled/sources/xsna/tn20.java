package xsna;

import android.view.View;
import android.widget.LinearLayout;
import com.google.android.flexbox.FlexboxLayout;
import xsna.kb70;
import xsna.us2;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class tn20 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ tn20(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
        this.h = obj6;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i;
        tra0 tra0Var;
        String str;
        switch (this.b) {
            case 0:
                us2 us2Var = (us2) this.c;
                frv0 frv0Var = (frv0) this.d;
                wjo0 wjo0Var = (wjo0) this.e;
                String str2 = (String) this.f;
                ztm0 ztm0Var = (ztm0) obj;
                o6j o6jVar = (o6j) obj2;
                zo10 zo10Var = (zo10) j5g.Y(ztm0Var.t1(vh70.Align, new jai(758071477, new x4a(5, (kb70.d) this.g, (izs) this.h), true)));
                long j = o6jVar.a;
                tra0 N = zo10Var.N(j);
                if (us2Var != null) {
                    String str3 = us2Var.c;
                    i = 0;
                    ljo0 a = wjo0.a(wjo0Var, str2, frv0Var.a, 1, o6j.b(0, o6jVar.a, (int) ((o6j.i(j) - N.b) - ztm0Var.I0(6)), 0, 0, 13), 972);
                    if (a.e()) {
                        int c = a.b.c(0, false);
                        while (true) {
                            str = str3;
                            if (c >= 0 && !ro.j(str.charAt(c))) {
                                c--;
                                str3 = str;
                            }
                        }
                        if (c != -1) {
                            us2.b bVar = new us2.b();
                            int i2 = c + 1;
                            bVar.h(us2Var.subSequence(0, i2));
                            bVar.g("\n");
                            bVar.h(us2Var.subSequence(i2, str.length()));
                            us2Var = bVar.n();
                        } else {
                            us2.b bVar2 = new us2.b();
                            bVar2.g("\n");
                            bVar2.h(us2Var);
                            us2Var = bVar2.n();
                        }
                    }
                    tra0Var = ((zo10) j5g.Y(ztm0Var.t1(vh70.Text, new jai(1282927012, new bta(5, us2Var, frv0Var), true)))).N(j);
                } else {
                    i = 0;
                    tra0Var = null;
                }
                return ztm0Var.Q(o6j.i(j), Math.max(N.c, tra0Var != null ? tra0Var.c : i), jgp.b, new c5(tra0Var, N, o6jVar, 5));
            default:
                LinearLayout linearLayout = (LinearLayout) this.c;
                View view = (View) this.d;
                View view2 = (View) this.e;
                q3l0 q3l0Var = (q3l0) this.f;
                FlexboxLayout flexboxLayout = (FlexboxLayout) this.g;
                View view3 = (View) this.h;
                ((Integer) obj).intValue();
                ((Integer) obj2).intValue();
                int max = Math.max(0, linearLayout.getMeasuredHeight() - ((int) linearLayout.getTranslationY()));
                f4m.q(max, view);
                int measuredHeight = view2.getMeasuredHeight() - (view.getMeasuredHeight() + max);
                if (measuredHeight > flexboxLayout.getMeasuredHeight() + q3l0Var.d.getMeasuredHeight()) {
                    bwt0.c0(measuredHeight, view3);
                } else {
                    bwt0.c0(-2, view3);
                }
                return s3q0.a;
        }
    }
}
