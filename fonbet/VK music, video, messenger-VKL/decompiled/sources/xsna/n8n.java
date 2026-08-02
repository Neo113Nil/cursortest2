package xsna;

import com.vk.profile.design.compose.user.ViewType;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.z8n;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class n8n implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ n8n(us2 us2Var, us2 us2Var2, Integer num, uog0 uog0Var, List list, q630 q630Var, ViewType viewType, gzs gzsVar, int i) {
        this.c = us2Var;
        this.d = us2Var2;
        this.e = num;
        this.f = uog0Var;
        this.g = list;
        this.h = q630Var;
        this.i = viewType;
        this.j = gzsVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                f64 f64Var = (f64) this.c;
                f64 f64Var2 = (f64) this.d;
                f64 f64Var3 = (f64) this.e;
                f64 f64Var4 = (f64) this.f;
                f64 f64Var5 = (f64) this.g;
                f64 f64Var6 = (f64) this.h;
                f64 f64Var7 = (f64) this.i;
                f64 f64Var8 = (f64) this.j;
                qk50 qk50Var = (qk50) obj;
                z8n z8nVar = (z8n) obj2;
                if (z8nVar instanceof z8n.a) {
                    return qk50Var.a(f64Var, z8nVar);
                }
                if (z8nVar instanceof v8n) {
                    return qk50Var.a(f64Var2, z8nVar);
                }
                if (z8nVar instanceof x8n) {
                    return qk50Var.a(f64Var3, z8nVar);
                }
                if (z8nVar instanceof u8n) {
                    return qk50Var.a(f64Var4, z8nVar);
                }
                if (z8nVar instanceof w8n) {
                    return qk50Var.a(f64Var5, z8nVar);
                }
                if (z8nVar instanceof y8n) {
                    return qk50Var.a(f64Var6, z8nVar);
                }
                if (z8nVar instanceof t8n) {
                    return qk50Var.a(f64Var7, z8nVar);
                }
                if (z8nVar instanceof z8n.b.a) {
                    return qk50Var.a(f64Var8, z8nVar);
                }
                throw new NoWhenBranchMatchedException();
            default:
                ((Integer) obj2).getClass();
                zdv0.c((us2) this.c, (us2) this.d, (Integer) this.e, (uog0) this.f, (List) this.g, (q630) this.h, (ViewType) this.i, (gzs) this.j, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
        }
    }

    public /* synthetic */ n8n(f64 f64Var, f64 f64Var2, f64 f64Var3, f64 f64Var4, f64 f64Var5, f64 f64Var6, f64 f64Var7, f64 f64Var8) {
        this.c = f64Var;
        this.d = f64Var2;
        this.e = f64Var3;
        this.f = f64Var4;
        this.g = f64Var5;
        this.h = f64Var6;
        this.i = f64Var7;
        this.j = f64Var8;
    }
}
