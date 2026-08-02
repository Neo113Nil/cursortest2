package defpackage;

import androidx.core.app.b;
import androidx.fragment.app.FragmentActivity;
import com.ybsdk.core.permissions.MultiplePermissionAllowance;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class b0b0 implements d0b0 {
    public final List a;
    public final List b;
    public final MultiplePermissionAllowance c;

    public b0b0(List list, List list2, MultiplePermissionAllowance multiplePermissionAllowance) {
        this.a = list;
        this.b = list2;
        this.c = multiplePermissionAllowance;
        if (list.containsAll(list2)) {
            return;
        }
        ny61.g("Failed requirement.");
        throw null;
    }

    @Override // defpackage.d0b0
    public final boolean a(FragmentActivity fragmentActivity) {
        int i = a0b0.a[this.c.ordinal()];
        List list = this.a;
        if (i == 1) {
            List list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (!b.M(fragmentActivity, (String) it.next())) {
                        return false;
                    }
                }
            }
            return true;
        }
        if (i == 2) {
            List list3 = list;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    if (b.M(fragmentActivity, (String) it2.next())) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (i != 3) {
            w511.b();
            return false;
        }
        List list4 = this.b;
        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
            Iterator it3 = list4.iterator();
            while (it3.hasNext()) {
                if (!b.M(fragmentActivity, (String) it3.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // defpackage.d0b0
    public final String b() {
        return this.a.toString();
    }

    @Override // defpackage.d0b0
    public final boolean c(FragmentActivity fragmentActivity) {
        int i = a0b0.a[this.c.ordinal()];
        List list = this.a;
        if (i == 1) {
            List list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (qke.h(fragmentActivity, (String) it.next()) != 0) {
                        return false;
                    }
                }
            }
            return true;
        }
        if (i == 2) {
            List list3 = list;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    if (qke.h(fragmentActivity, (String) it2.next()) == 0) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (i != 3) {
            w511.b();
            return false;
        }
        List list4 = this.b;
        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
            Iterator it3 = list4.iterator();
            while (it3.hasNext()) {
                if (qke.h(fragmentActivity, (String) it3.next()) != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0b0)) {
            return false;
        }
        b0b0 b0b0Var = (b0b0) obj;
        return jl40.l(this.a, b0b0Var.a) && jl40.l(this.b, b0b0Var.b) && this.c == b0b0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder v = qv10.v("Multiple(permissions=", this.a, ", mandatoryPermissions=", this.b, ", allowance=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public /* synthetic */ b0b0(List list, MultiplePermissionAllowance multiplePermissionAllowance, int i) {
        this(list, EmptyList.a, (i & 4) != 0 ? MultiplePermissionAllowance.ALL : multiplePermissionAllowance);
    }
}
