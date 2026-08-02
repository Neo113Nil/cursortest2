package xsna;

import android.app.Activity;
import android.content.Intent;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.NoWhenBranchMatchedException;
import xsna.ey60;
import xsna.gh3;
import xsna.ogb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class vg3 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vg3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                zg3 zg3Var = (zg3) this.c;
                ogb.a aVar = (ogb.a) obj;
                ogb.a aVar2 = (ogb.a) obj2;
                zg3Var.getClass();
                boolean z = aVar.a.isEmpty() && aVar.f;
                boolean z2 = (aVar2.f && aVar2.a.isEmpty()) ? false : true;
                if (z && z2) {
                    zg3Var.n(gh3.a.a);
                }
                return aVar2;
            case 1:
                ((Integer) obj2).getClass();
                iog.a((gzs) this.c, (androidx.compose.runtime.a) obj, ne7.I(7));
                return s3q0.a;
            case 2:
                ((Activity) this.c).startActivityForResult((Intent) obj, ((Integer) obj2).intValue());
                return s3q0.a;
            case 3:
                ((Integer) obj2).getClass();
                ((zmr) this.c).a(ne7.I(7), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 4:
                uvj uvjVar = (uvj) obj;
                return uvjVar.m(myc0.h(uvjVar.f, null, null, new com.vk.profile.community.members.impl.ui.f((com.vk.profile.community.members.impl.ui.k) obj2, uvjVar, (a220) this.c, null), 3));
            case 5:
                qy60 qy60Var = (qy60) this.c;
                rui ruiVar = (rui) obj;
                nn50 nn50Var = (nn50) obj2;
                final f64 a = ruiVar.a(new py60(qy60Var.b, qy60Var.n, qy60Var, qy60Var.k, nn50Var));
                rvu rvuVar = qy60Var.j;
                es60 es60Var = qy60Var.m;
                final f64 a2 = ruiVar.a(new x5o0(es60Var, rvuVar, nn50Var));
                final f64 a3 = ruiVar.a(new gx60(es60Var, rvuVar, nn50Var));
                final f64 a4 = ruiVar.a(new z5o0(es60Var, rvuVar, nn50Var));
                final f64 a5 = ruiVar.a(new y5o0(es60Var, rvuVar, nn50Var));
                final f64 a6 = ruiVar.a(new b6o0(es60Var, rvuVar, nn50Var));
                final f64 a7 = ruiVar.a(new fx60(es60Var, rvuVar, nn50Var));
                final f64 a8 = ruiVar.a(new ty60(es60Var, qy60Var.l, rvuVar, nn50Var));
                ruiVar.b = new wzs() { // from class: xsna.zx60
                    @Override // xsna.wzs
                    public final Object invoke(Object obj3, Object obj4) {
                        qk50 qk50Var = (qk50) obj3;
                        ey60 ey60Var = (ey60) obj4;
                        if (ey60Var instanceof ey60.b) {
                            return qk50Var.a(f64.this, ey60Var);
                        }
                        if (ey60Var instanceof gy60) {
                            return qk50Var.a(a2, ey60Var);
                        }
                        if (ey60Var instanceof iy60) {
                            return qk50Var.a(a4, ey60Var);
                        }
                        if (ey60Var instanceof fy60) {
                            return qk50Var.a(a3, ey60Var);
                        }
                        if (ey60Var instanceof hy60) {
                            return qk50Var.a(a5, ey60Var);
                        }
                        if (ey60Var instanceof jy60) {
                            return qk50Var.a(a6, ey60Var);
                        }
                        if (ey60Var instanceof ey60.a) {
                            return qk50Var.a(a7, ey60Var);
                        }
                        if (ey60Var instanceof ey60.c) {
                            return qk50Var.a(a8, ey60Var);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                };
                return s3q0.a;
            case 6:
                ((ks80) this.c).b.remove((String) obj2);
                ((ohk0) obj).c("onPlayerEnded");
                return s3q0.a;
            case 7:
                ((Integer) obj2).getClass();
                ((koh0) this.c).o(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 8:
                ((Integer) obj2).getClass();
                ((i8s0) this.c).b(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            default:
                ggu0 ggu0Var = (ggu0) this.c;
                ViewGroup viewGroup = (ViewGroup) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                tdr0 m = ggu0Var.m();
                fvv0 fvv0Var = m.b;
                if ((!fvv0Var.S() && !booleanValue) || !m.a.A()) {
                    return viewGroup;
                }
                if (fvv0Var.v() == null && fvv0Var.o() && booleanValue) {
                    m.b(viewGroup);
                    return viewGroup;
                }
                yfu0 a9 = m.c().a(m.d.o());
                if (a9 == null) {
                    return viewGroup;
                }
                if (booleanValue) {
                    m.j = a9;
                } else {
                    m.i = a9;
                }
                if (fvv0Var.o() && booleanValue) {
                    m.b(viewGroup);
                    return viewGroup;
                }
                if (m.c().d()) {
                    m.a(viewGroup, a9);
                    return viewGroup;
                }
                LinearLayout linearLayout = new LinearLayout(((ggu0) m.f.c).b);
                linearLayout.setOrientation(1);
                linearLayout.addView(a9);
                linearLayout.addView(viewGroup, -1, -1);
                return linearLayout;
        }
    }

    public /* synthetic */ vg3(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
