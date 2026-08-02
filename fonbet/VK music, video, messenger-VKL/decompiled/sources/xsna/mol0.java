package xsna;

import com.vk.ecomm.storefrontservices.impl.StorefrontServicesArgs;
import com.vk.ecomm.storefrontservices.impl.presentation.feature.LoadingState;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;

/* compiled from: StorefrontServicesState.kt */
/* loaded from: classes18.dex */
public final class mol0 implements lm50 {
    public final StorefrontServicesArgs b;
    public final y7p0 c;
    public final gr1 d;
    public final lsi0 e;
    public final wyh0 f;
    public final ggr g;
    public final LoadingState h;

    public mol0(StorefrontServicesArgs storefrontServicesArgs, y7p0 y7p0Var, gr1 gr1Var, lsi0 lsi0Var, wyh0 wyh0Var, ggr ggrVar, LoadingState loadingState) {
        this.b = storefrontServicesArgs;
        this.c = y7p0Var;
        this.d = gr1Var;
        this.e = lsi0Var;
        this.f = wyh0Var;
        this.g = ggrVar;
        this.h = loadingState;
    }

    public static mol0 a(mol0 mol0Var, y7p0 y7p0Var, gr1 gr1Var, lsi0 lsi0Var, wyh0 wyh0Var, ggr ggrVar, LoadingState loadingState, int i) {
        y7p0 y7p0Var2 = y7p0Var;
        StorefrontServicesArgs storefrontServicesArgs = mol0Var.b;
        if ((i & 2) != 0) {
            y7p0Var2 = mol0Var.c;
        }
        if ((i & 4) != 0) {
            gr1Var = mol0Var.d;
        }
        if ((i & 8) != 0) {
            lsi0Var = mol0Var.e;
        }
        if ((i & 16) != 0) {
            wyh0Var = mol0Var.f;
        }
        if ((i & 32) != 0) {
            ggrVar = mol0Var.g;
        }
        if ((i & 64) != 0) {
            loadingState = mol0Var.h;
        }
        if ((i & 128) != 0) {
            mol0Var.getClass();
        }
        mol0Var.getClass();
        LoadingState loadingState2 = loadingState;
        ggr ggrVar2 = ggrVar;
        wyh0 wyh0Var2 = wyh0Var;
        lsi0 lsi0Var2 = lsi0Var;
        return new mol0(storefrontServicesArgs, y7p0Var2, gr1Var, lsi0Var2, wyh0Var2, ggrVar2, loadingState2);
    }

    public final uoi0 c(long j) {
        uoi0 uoi0Var;
        wyh0 wyh0Var = this.f;
        if (wyh0Var != null && (uoi0Var = wyh0Var.a.get(Long.valueOf(j))) != null) {
            return uoi0Var;
        }
        lsi0 lsi0Var = this.e;
        if (lsi0Var != null) {
            return lsi0Var.b.get(Long.valueOf(j));
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mol0)) {
            return false;
        }
        mol0 mol0Var = (mol0) obj;
        return epx.f(this.b, mol0Var.b) && epx.f(this.c, mol0Var.c) && epx.f(this.d, mol0Var.d) && epx.f(this.e, mol0Var.e) && epx.f(this.f, mol0Var.f) && epx.f(this.g, mol0Var.g) && this.h == mol0Var.h;
    }

    public final Pair<uoi0, Integer> h(final long j) {
        Map<Long, uoi0> map;
        uoi0 uoi0Var;
        Object obj;
        int i = -1;
        Object obj2 = null;
        wyh0 wyh0Var = this.f;
        if (wyh0Var != null) {
            Iterator<Map.Entry<Long, uoi0>> it = wyh0Var.a.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Long, uoi0> next = it.next();
                long longValue = next.getKey().longValue();
                uoi0 value = next.getValue();
                i++;
                if (longValue != j) {
                    value = null;
                }
                if (value != null) {
                    obj2 = value;
                    break;
                }
            }
            if (obj2 != null) {
                return new Pair<>(obj2, Integer.valueOf(i));
            }
            throw new NoSuchElementException("No element of the map was transformed to a non-null value.");
        }
        lsi0 lsi0Var = this.e;
        if (lsi0Var != null && (uoi0Var = (map = lsi0Var.b).get(Long.valueOf(j))) != null) {
            List<fsi0> list = lsi0Var.c;
            if (list != null) {
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    fsi0 fsi0Var = (fsi0) obj;
                    boolean contains = fsi0Var.d.contains(Long.valueOf(j));
                    if (!contains) {
                        i = fsi0Var.d.size() + i;
                    }
                    if (contains) {
                        break;
                    }
                }
                fsi0 fsi0Var2 = (fsi0) obj;
                if (fsi0Var2 != null) {
                    Iterator it3 = fsi0Var2.d.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Object next2 = it3.next();
                        i++;
                        if (((Number) next2).longValue() == j) {
                            obj2 = next2;
                            break;
                        }
                    }
                }
                return new Pair<>(uoi0Var, Integer.valueOf(i));
            }
            Pair i2 = p4g.i(map.values(), new wzs() { // from class: xsna.ksi0
                @Override // xsna.wzs
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj3).intValue();
                    return Boolean.valueOf(((uoi0) obj4).i == j);
                }
            });
            if (i2 != null) {
                return new Pair<>((uoi0) i2.g(), Integer.valueOf(((Number) i2.d()).intValue()));
            }
        }
        return null;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
        gr1 gr1Var = this.d;
        int hashCode2 = (hashCode + (gr1Var == null ? 0 : gr1Var.hashCode())) * 31;
        lsi0 lsi0Var = this.e;
        int hashCode3 = (hashCode2 + (lsi0Var == null ? 0 : lsi0Var.hashCode())) * 31;
        wyh0 wyh0Var = this.f;
        return (this.h.hashCode() + ((this.g.hashCode() + ((hashCode3 + (wyh0Var != null ? wyh0Var.hashCode() : 0)) * 31)) * 31)) * 31;
    }

    public final boolean j() {
        String str = this.c.a;
        return !(str == null || str.length() == 0);
    }

    public final mol0 m(uoi0 uoi0Var) {
        List<uoi0> singletonList = Collections.singletonList(uoi0Var);
        lsi0 lsi0Var = this.e;
        lsi0 a = lsi0Var != null ? lsi0Var.a(singletonList) : null;
        wyh0 wyh0Var = this.f;
        return a(this, null, null, a, wyh0Var != null ? wyh0Var.b(singletonList) : null, null, null, 231);
    }

    public final String toString() {
        return "StorefrontServicesState(args=" + this.b + ", topBarState=" + this.c + ", albumsStateData=" + this.d + ", serviceStateData=" + this.e + ", searchStateData=" + this.f + ", filtersState=" + this.g + ", loadingState=" + this.h + ", snackBarState=null)";
    }

    public /* synthetic */ mol0(StorefrontServicesArgs storefrontServicesArgs, y7p0 y7p0Var, gr1 gr1Var, lsi0 lsi0Var, LoadingState loadingState, int i) {
        this(storefrontServicesArgs, (i & 2) != 0 ? new y7p0(null, null) : y7p0Var, (i & 4) != 0 ? null : gr1Var, (i & 8) != 0 ? null : lsi0Var, null, new ggr(null, null, null, null, null, 127), loadingState);
    }
}
