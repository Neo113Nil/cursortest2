package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;

/* compiled from: Serializers.kt */
/* loaded from: classes8.dex */
public final /* synthetic */ class gni0 {
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0068, code lost:
    
        if (r6 != null) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final KSerializer<Object> a(de deVar, vcy vcyVar, boolean z) {
        KSerializer<? extends Object> kSerializer;
        KSerializer kSerializer2;
        KSerializer tub0Var;
        dcy q = fvr.q(vcyVar);
        boolean g = vcyVar.g();
        List<wcy> d = vcyVar.d();
        ArrayList arrayList = new ArrayList(c5g.u(d, 10));
        Iterator<T> it = d.iterator();
        while (it.hasNext()) {
            vcy vcyVar2 = ((wcy) it.next()).b;
            if (vcyVar2 == null) {
                throw new IllegalArgumentException(("Star projections in type arguments are not allowed, but had " + vcyVar2).toString());
            }
            arrayList.add(vcyVar2);
        }
        if (arrayList.isEmpty()) {
            if (!rta0.c(q) || deVar.X(q, EmptyList.b) == null) {
                kSerializer = !g ? fni0.a.b(q) : fni0.b.b(q);
                if (kSerializer == null) {
                    return kSerializer;
                }
                if (arrayList.isEmpty()) {
                    kSerializer2 = s1v.q(q);
                    if (kSerializer2 == null && (kSerializer2 = deVar.X(q, EmptyList.b)) == null) {
                        if (rta0.c(q)) {
                            tub0Var = new tub0(q);
                            kSerializer2 = tub0Var;
                        }
                        kSerializer2 = null;
                    }
                    if (kSerializer2 != null) {
                        return g ? xn8.a(kSerializer2) : kSerializer2;
                    }
                } else {
                    ArrayList r = s1v.r(deVar, arrayList, z);
                    if (r != null) {
                        KSerializer n = s1v.n(q, r, new oqh0(arrayList, 3));
                        if (n == null) {
                            kSerializer2 = deVar.X(q, r);
                            if (kSerializer2 == null) {
                                if (rta0.c(q)) {
                                    tub0Var = new tub0(q);
                                    kSerializer2 = tub0Var;
                                }
                                kSerializer2 = null;
                            }
                        } else {
                            kSerializer2 = n;
                        }
                        if (kSerializer2 != null) {
                        }
                    }
                }
                return null;
            }
            kSerializer = null;
            if (kSerializer == null) {
            }
        } else {
            if (!deVar.Y()) {
                Object a = !g ? fni0.c.a(q, arrayList) : fni0.d.a(q, arrayList);
                if (a instanceof Result.Failure) {
                    a = null;
                }
                kSerializer = (KSerializer) a;
                if (kSerializer == null) {
                }
            }
            kSerializer = null;
            if (kSerializer == null) {
            }
        }
    }
}
