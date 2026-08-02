package xsna;

import androidx.recyclerview.widget.m;
import com.vk.superapp.ui.widgets.menu.CustomMenuInfo;

/* compiled from: SuperAppItemDiffCallback.kt */
/* loaded from: classes6.dex */
public final class w8n0 extends m.e<zif0> {
    public static final w8n0 a = new w8n0();

    @Override // androidx.recyclerview.widget.m.e
    public final boolean areContentsTheSame(zif0 zif0Var, zif0 zif0Var2) {
        return zif0Var.equals(zif0Var2);
    }

    @Override // androidx.recyclerview.widget.m.e
    public final boolean areItemsTheSame(zif0 zif0Var, zif0 zif0Var2) {
        zif0 zif0Var3 = zif0Var;
        zif0 zif0Var4 = zif0Var2;
        if ((zif0Var3 instanceof a9n0) && (zif0Var4 instanceof a9n0)) {
            if ((zif0Var3 instanceof jbn0) && (zif0Var4 instanceof jbn0)) {
                CustomMenuInfo customMenuInfo = ((jbn0) zif0Var3).b;
                String str = customMenuInfo.c;
                CustomMenuInfo customMenuInfo2 = ((jbn0) zif0Var4).b;
                String str2 = customMenuInfo2.c;
                return (drm0.N(str) || drm0.N(str2)) ? epx.f(customMenuInfo.d, customMenuInfo2.d) : str.equals(str2);
            }
            if ((zif0Var3 instanceof qbn0) && (zif0Var4 instanceof qbn0)) {
                return true;
            }
            if (!(zif0Var3 instanceof lbn0) || !(zif0Var4 instanceof lbn0)) {
                return false;
            }
            CustomMenuInfo customMenuInfo3 = ((lbn0) zif0Var3).b;
            String str3 = customMenuInfo3.c;
            CustomMenuInfo customMenuInfo4 = ((lbn0) zif0Var4).b;
            String str4 = customMenuInfo4.c;
            return (drm0.N(str3) || drm0.N(str4)) ? epx.f(customMenuInfo3.d, customMenuInfo4.d) : str3.equals(str4);
        }
        if ((zif0Var3 instanceof f9n0) && (zif0Var4 instanceof f9n0)) {
            f9n0 f9n0Var = (f9n0) zif0Var3;
            f9n0 f9n0Var2 = (f9n0) zif0Var4;
            return epx.f(f9n0Var.e(), f9n0Var2.e()) && epx.f(f9n0Var.f(), f9n0Var2.f());
        }
        if ((zif0Var3 instanceof c8n0) && (zif0Var4 instanceof c8n0)) {
            return epx.f(((c8n0) zif0Var3).b, ((c8n0) zif0Var4).b);
        }
        if ((zif0Var3 instanceof fdn0) && (zif0Var4 instanceof fdn0)) {
            return true;
        }
        if ((zif0Var3 instanceof hdn0) && (zif0Var4 instanceof hdn0)) {
            return epx.f(((hdn0) zif0Var3).c, ((hdn0) zif0Var4).c);
        }
        if ((zif0Var3 instanceof c9n0) && (zif0Var4 instanceof c9n0)) {
            return true;
        }
        return ((zif0Var3 instanceof g9n0) && (zif0Var4 instanceof g9n0)) ? ((g9n0) zif0Var3).c() == ((g9n0) zif0Var4).c() : zif0Var3 == zif0Var4;
    }

    @Override // androidx.recyclerview.widget.m.e
    public final Object getChangePayload(zif0 zif0Var, zif0 zif0Var2) {
        return zif0Var2;
    }
}
