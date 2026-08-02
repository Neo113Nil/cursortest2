package defpackage;

import com.yandex.go.vault.flexsdk.descriptors.widget.Vault;
import com.ybsdk.feature.cashback.impl.entities.CashbackSelectorCategoryEntity;

/* loaded from: classes3.dex */
public final class a10 extends zij {
    public final /* synthetic */ int a;

    public /* synthetic */ a10(int i) {
        this.a = i;
    }

    @Override // defpackage.zij
    public final boolean a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((x00) obj).equals((x00) obj2);
            case 1:
                return ((gc5) obj).equals((gc5) obj2);
            case 2:
                return ((gc5) obj).equals((gc5) obj2);
            case 3:
                return jl40.l((qe6) obj, (qe6) obj2);
            case 4:
                return jl40.l((kpf0) obj, (kpf0) obj2);
            case 5:
                return ((s7f) obj).equals((s7f) obj2);
            case 6:
                return ((bwz0) obj).equals((bwz0) obj2);
            case 7:
                return ((gc5) obj).equals((gc5) obj2);
            case 8:
                return ((jsg) obj).equals((jsg) obj2);
            case 9:
                return false;
            case 10:
                return jl40.l((z5r0) obj, (z5r0) obj2);
            case 11:
                return ((c9m0) obj).equals((c9m0) obj2);
            case 12:
                return ((s7m0) obj).equals((s7m0) obj2);
            case 13:
                return ((gc5) obj).equals((gc5) obj2);
            case 14:
                return ((gav0) obj).equals((gav0) obj2);
            case 15:
                return ((sj01) obj).equals((sj01) obj2);
            case 16:
                return ((sqj0) obj).equals((sqj0) obj2);
            case 17:
                return ((un01) obj).equals((un01) obj2);
            case 18:
                return ((Vault) obj).a == ((Vault) obj2).a;
            default:
                return ((nry) obj).equals((nry) obj2);
        }
    }

    @Override // defpackage.zij
    public final boolean b(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                x00 x00Var = (x00) obj;
                x00 x00Var2 = (x00) obj2;
                return ((x00Var instanceof t29) && (x00Var2 instanceof t29)) ? jl40.l(((t29) x00Var).a, ((t29) x00Var2).a) : x00Var.equals(x00Var2);
            case 1:
                return ((gc5) obj).b().equals(((gc5) obj2).b());
            case 2:
                return ((gc5) obj).b().equals(((gc5) obj2).b());
            case 3:
                return jl40.l((qe6) obj, (qe6) obj2);
            case 4:
                return jl40.l(((kpf0) obj).a.a, ((kpf0) obj2).a.a);
            case 5:
                return ((s7f) obj).a((s7f) obj2);
            case 6:
                return ((bwz0) obj).equals((bwz0) obj2);
            case 7:
                return ((gc5) obj).b().equals(((gc5) obj2).b());
            case 8:
                return ((jsg) obj).a == ((jsg) obj2).a;
            case 9:
                return ((gc5) obj).b().equals(((gc5) obj2).b());
            case 10:
                z5r0 z5r0Var = (z5r0) obj;
                z5r0 z5r0Var2 = (z5r0) obj2;
                return z5r0Var.getClass().equals(z5r0Var2.getClass()) && jl40.l(z5r0Var.a(), z5r0Var2.a());
            case 11:
                return ((c9m0) obj).equals((c9m0) obj2);
            case 12:
                return jl40.l(((s7m0) obj).a, ((s7m0) obj2).a);
            case 13:
                gc5 gc5Var = (gc5) obj;
                gc5 gc5Var2 = (gc5) obj2;
                return ((gc5Var instanceof cam0) && (gc5Var2 instanceof cam0)) ? gc5Var.equals(gc5Var2) : ((gc5Var instanceof scm0) && (gc5Var2 instanceof scm0)) ? gc5Var.equals(gc5Var2) : gc5Var.b().equals(gc5Var2.b());
            case 14:
                gav0 gav0Var = (gav0) obj;
                gav0 gav0Var2 = (gav0) obj2;
                if ((gav0Var instanceof CashbackSelectorCategoryEntity) && (gav0Var2 instanceof CashbackSelectorCategoryEntity)) {
                    return jl40.l(((CashbackSelectorCategoryEntity) gav0Var).m380getCategoryIdUWxlUg(), ((CashbackSelectorCategoryEntity) gav0Var2).m380getCategoryIdUWxlUg());
                }
                if ((gav0Var instanceof acq0) && (gav0Var2 instanceof acq0)) {
                    return true;
                }
                return gav0Var.equals(gav0Var2);
            case 15:
                return ((sj01) obj).getClass().equals(((sj01) obj2).getClass());
            case 16:
                sqj0 sqj0Var = (sqj0) obj;
                sqj0 sqj0Var2 = (sqj0) obj2;
                return ((sqj0Var instanceof vqj0) && (sqj0Var2 instanceof vqj0)) ? jl40.l(((vqj0) sqj0Var).a, ((vqj0) sqj0Var2).a) : sqj0Var.getClass().equals(sqj0Var2.getClass());
            case 17:
                return ((un01) obj).equals((un01) obj2);
            case 18:
                return jl40.l((Vault) obj, (Vault) obj2);
            default:
                return ((nry) obj).equals((nry) obj2);
        }
    }

    @Override // defpackage.zij
    public /* bridge */ /* synthetic */ Object c(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 2:
                return zy11Var;
            case 7:
                return zy11Var;
            case 9:
                return zy11Var;
            case 15:
                return zy11Var;
            case 16:
                return zy11Var;
            default:
                return super.c(obj, obj2);
        }
    }
}
