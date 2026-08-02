package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.view.f;
import androidx.view.g;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.sequences.a;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes10.dex */
public final class f550 extends f implements Iterable, xfx {
    public static final /* synthetic */ int I = 0;
    public final pnt0 E;
    public int F;
    public String G;
    public String H;

    public f550(g gVar) {
        super(gVar);
        this.E = new pnt0((Object) null);
    }

    @Override // androidx.view.f
    public final d550 b(e100 e100Var) {
        return i(e100Var, false, this);
    }

    @Override // androidx.view.f
    public final void e(Context context, AttributeSet attributeSet) {
        String valueOf;
        super.e(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, l2i0.NavGraphNavigator);
        int resourceId = obtainAttributes.getResourceId(l2i0.NavGraphNavigator_startDestination, 0);
        if (resourceId == this.A) {
            vg10.c(resourceId, " cannot use the same id as the graph ", this, "Start destination ");
            return;
        }
        if (this.H != null) {
            k(null);
        }
        this.F = resourceId;
        this.G = null;
        if (resourceId <= 16777215) {
            valueOf = String.valueOf(resourceId);
        } else {
            try {
                valueOf = context.getResources().getResourceName(resourceId);
            } catch (Resources.NotFoundException unused) {
                valueOf = String.valueOf(resourceId);
            }
        }
        this.G = valueOf;
        obtainAttributes.recycle();
    }

    @Override // androidx.view.f
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof f550) || !super.equals(obj)) {
                return false;
            }
            pnt0 pnt0Var = this.E;
            int e = pnt0Var.e();
            f550 f550Var = (f550) obj;
            pnt0 pnt0Var2 = f550Var.E;
            if (e != pnt0Var2.e() || this.F != f550Var.F) {
                return false;
            }
            Iterator it = ((a7e) a.b(new rnt0(pnt0Var, 1))).iterator();
            while (it.hasNext()) {
                f fVar = (f) it.next();
                if (!fVar.equals(pnt0Var2.b(fVar.A))) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void f(f fVar) {
        int i = fVar.A;
        String str = fVar.B;
        if (i == 0 && str == null) {
            ny61.g("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
            return;
        }
        String str2 = this.B;
        if (str2 != null && jl40.l(str, str2)) {
            vg10.j("Destination ", fVar, " cannot have the same route as graph ", this);
            return;
        }
        if (i == this.A) {
            vg10.j("Destination ", fVar, " cannot have the same id as graph ", this);
            return;
        }
        pnt0 pnt0Var = this.E;
        f fVar2 = (f) pnt0Var.b(i);
        if (fVar2 == fVar) {
            return;
        }
        if (fVar.b != null) {
            ny61.r("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
            return;
        }
        if (fVar2 != null) {
            fVar2.b = null;
        }
        fVar.b = this;
        pnt0Var.d(fVar.A, fVar);
    }

    public final f g(String str, boolean z) {
        Object obj;
        f550 f550Var;
        Iterator it = ((a7e) a.b(new rnt0(this.E, 1))).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            f fVar = (f) obj;
            if (cvu0.t(fVar.B, str, false) || fVar.d(str) != null) {
                break;
            }
        }
        f fVar2 = (f) obj;
        if (fVar2 != null) {
            return fVar2;
        }
        if (!z || (f550Var = this.b) == null || evu0.J(str)) {
            return null;
        }
        return f550Var.g(str, true);
    }

    public final f h(int i, f550 f550Var, boolean z) {
        pnt0 pnt0Var = this.E;
        f fVar = (f) pnt0Var.b(i);
        if (fVar != null) {
            return fVar;
        }
        if (z) {
            Iterator it = ((a7e) a.b(new rnt0(pnt0Var, 1))).iterator();
            while (true) {
                if (!it.hasNext()) {
                    fVar = null;
                    break;
                }
                f fVar2 = (f) it.next();
                fVar = (!(fVar2 instanceof f550) || fVar2.equals(f550Var)) ? null : ((f550) fVar2).h(i, this, true);
                if (fVar != null) {
                    break;
                }
            }
        }
        if (fVar != null) {
            return fVar;
        }
        f550 f550Var2 = this.b;
        if (f550Var2 == null || f550Var2.equals(f550Var)) {
            return null;
        }
        return this.b.h(i, this, z);
    }

    @Override // androidx.view.f
    public final int hashCode() {
        int i = this.F;
        pnt0 pnt0Var = this.E;
        int e = pnt0Var.e();
        for (int i2 = 0; i2 < e; i2++) {
            i = (((i * 31) + pnt0Var.c(i2)) * 31) + ((f) pnt0Var.f(i2)).hashCode();
        }
        return i;
    }

    public final d550 i(e100 e100Var, boolean z, f550 f550Var) {
        d550 d550Var;
        d550 b = super.b(e100Var);
        ArrayList arrayList = new ArrayList();
        e550 e550Var = new e550(this);
        while (true) {
            if (!e550Var.hasNext()) {
                break;
            }
            f fVar = (f) e550Var.next();
            d550Var = jl40.l(fVar, f550Var) ? null : fVar.b(e100Var);
            if (d550Var != null) {
                arrayList.add(d550Var);
            }
        }
        d550 d550Var2 = (d550) kotlin.collections.a.c0(arrayList);
        f550 f550Var2 = this.b;
        if (f550Var2 != null && z && !f550Var2.equals(f550Var)) {
            d550Var = f550Var2.i(e100Var, true, this);
        }
        return (d550) kotlin.collections.a.c0(j73.A(new d550[]{b, d550Var2, d550Var}));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new e550(this);
    }

    public final d550 j(String str, boolean z, f550 f550Var) {
        d550 d550Var;
        d550 d = d(str);
        ArrayList arrayList = new ArrayList();
        e550 e550Var = new e550(this);
        while (true) {
            if (!e550Var.hasNext()) {
                break;
            }
            f fVar = (f) e550Var.next();
            d550Var = jl40.l(fVar, f550Var) ? null : fVar instanceof f550 ? ((f550) fVar).j(str, false, this) : fVar.d(str);
            if (d550Var != null) {
                arrayList.add(d550Var);
            }
        }
        d550 d550Var2 = (d550) kotlin.collections.a.c0(arrayList);
        f550 f550Var2 = this.b;
        if (f550Var2 != null && z && !f550Var2.equals(f550Var)) {
            d550Var = f550Var2.j(str, true, this);
        }
        return (d550) kotlin.collections.a.c0(j73.A(new d550[]{d, d550Var2, d550Var}));
    }

    public final void k(String str) {
        int hashCode;
        if (str == null) {
            hashCode = 0;
        } else if (str.equals(this.B)) {
            vg10.j("Start destination ", str, " cannot use the same route as the graph ", this);
            return;
        } else {
            if (evu0.J(str)) {
                ny61.g("Cannot have an empty start destination route");
                return;
            }
            hashCode = "android-app://androidx.navigation/".concat(str).hashCode();
        }
        this.F = hashCode;
        this.H = str;
    }

    @Override // androidx.view.f
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        String str = this.H;
        f g = (str == null || evu0.J(str)) ? null : g(str, true);
        if (g == null) {
            g = h(this.F, this, false);
        }
        sb.append(" startDestination=");
        if (g == null) {
            String str2 = this.H;
            if (str2 != null) {
                sb.append(str2);
            } else {
                String str3 = this.G;
                if (str3 != null) {
                    sb.append(str3);
                } else {
                    sb.append(HexString.STR_0x + Integer.toHexString(this.F));
                }
            }
        } else {
            sb.append("{");
            sb.append(g.toString());
            sb.append("}");
        }
        return sb.toString();
    }
}
