package xsna;

import android.app.Application;
import android.content.pm.PackageManager;
import com.vk.dto.common.id.UserId;
import com.vk.silentauth.SilentAuthInfo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptyList;
import xsna.c2r0;
import xsna.pgn0;

/* compiled from: SilentAuthBinderImpl.kt */
/* loaded from: classes5.dex */
public final class tmj0 extends kov {
    public final Application a;
    public final PackageManager b;

    public tmj0(Application application, PackageManager packageManager) {
        attachInterface(this, "com.vk.silentauth.ISilentAuthInfoProvider");
        this.a = application;
        this.b = packageManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List f(int i, String str, String str2, String str3, String str4, String str5) {
        ArrayList arrayList;
        Throwable th;
        ArrayList arrayList2;
        Object obj;
        Object obj2;
        wdx0 wdx0Var = e370.f;
        if (wdx0Var == null) {
            wdx0Var = null;
        }
        int i2 = pgn0.a.a;
        UserId userId = wdx0Var.c().b;
        boolean z = str2 == null;
        cnj0 cnj0Var = h5i0.a;
        Application application = this.a;
        if (cnj0Var != null) {
            List<UserId> a = cnj0Var.a();
            List<c2r0.b> h = ((yui) r55.j()).h(application, true);
            ArrayList arrayList3 = new ArrayList(c5g.u(h, 10));
            Iterator<T> it = h.iterator();
            while (it.hasNext()) {
                arrayList3.add(((c2r0.b) it.next()).d());
            }
            Iterable H0 = j5g.H0(arrayList3, 10);
            if (H0 == null) {
                H0 = EmptyList.b;
            }
            ArrayList u0 = j5g.u0(H0, a);
            HashSet hashSet = new HashSet();
            arrayList = new ArrayList();
            Iterator it2 = u0.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (hashSet.add(Long.valueOf(((UserId) next).b))) {
                    arrayList.add(next);
                }
            }
        } else {
            arrayList = null;
        }
        if (!z) {
            wdx0 wdx0Var2 = e370.f;
            if (wdx0Var2 == null) {
                wdx0Var2 = null;
            }
            if (wdx0Var2.k() || (arrayList != null && !arrayList.isEmpty())) {
                long currentTimeMillis = System.currentTimeMillis();
                List list = arrayList;
                if (arrayList == null) {
                    list = EmptyList.b;
                }
                vdx0 vdx0Var = e370.e;
                if (vdx0Var == null) {
                    vdx0Var = null;
                }
                wfn0 e = vdx0Var.e();
                String valueOf = String.valueOf(currentTimeMillis);
                cnj0 cnj0Var2 = h5i0.a;
                if (cnj0Var2 != null) {
                    List<UserId> a2 = cnj0Var2.a();
                    List<c2r0.b> h2 = ((yui) r55.j()).h(application, true);
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj3 : h2) {
                        c2r0.b bVar = (c2r0.b) obj3;
                        Iterator<T> it3 = a2.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it3.next();
                            if (bVar.d().b == ((UserId) obj2).b) {
                                break;
                            }
                        }
                        if (obj2 == null) {
                            arrayList4.add(obj3);
                        }
                    }
                    th = null;
                    ArrayList arrayList5 = new ArrayList(c5g.u(arrayList4, 10));
                    Iterator it4 = arrayList4.iterator();
                    while (it4.hasNext()) {
                        arrayList5.add(((c2r0.b) it4.next()).a());
                    }
                    arrayList2 = arrayList5;
                } else {
                    th = null;
                    arrayList2 = null;
                }
                j35 j35Var = (j35) e.w(i, str, valueOf, str2, str4, arrayList2, str5).c();
                ArrayList arrayList6 = j35Var.a;
                ArrayList arrayList7 = j35Var.b;
                ArrayList arrayList8 = new ArrayList(list);
                for (h65 h65Var : j5g.y0(arrayList7)) {
                    Iterator it5 = arrayList6.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            obj = th;
                            break;
                        }
                        obj = it5.next();
                        if (((i65) obj).a == h65Var.a) {
                            break;
                        }
                    }
                    if (obj == null) {
                        arrayList8.remove(h65Var.a);
                    }
                }
                List D0 = j5g.D0(new smj0(), arrayList6);
                ArrayList arrayList9 = new ArrayList(c5g.u(D0, 10));
                int i3 = 0;
                for (Object obj4 : D0) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        e43.t();
                        throw th;
                    }
                    arrayList9.add(new i65(i3, ((i65) obj4).b));
                    i3 = i4;
                }
                ArrayList arrayList10 = new ArrayList(c5g.u(arrayList9, 10));
                Iterator it6 = arrayList9.iterator();
                while (it6.hasNext()) {
                    i65 i65Var = (i65) it6.next();
                    j65 j65Var = i65Var.b;
                    int i5 = i65Var.a;
                    Integer num = j65Var.e;
                    String str6 = j65Var.j;
                    long intValue = num != null ? num.intValue() : 0L;
                    long millis = intValue > 0 ? TimeUnit.SECONDS.toMillis(intValue) + currentTimeMillis : -1L;
                    Integer num2 = i65Var.b.o;
                    Integer valueOf2 = num2 != null ? Integer.valueOf((list.size() - i5) + num2.intValue()) : th;
                    UserId userId2 = arrayList8.isEmpty() ? userId : (UserId) arrayList8.get(i5);
                    String str7 = j65Var.d;
                    String str8 = str7 == null ? "" : str7;
                    String str9 = j65Var.a;
                    String str10 = j65Var.b;
                    String str11 = j65Var.g;
                    String str12 = (str11 == null || drm0.N(str11)) ? str6 == null ? "" : str6 : str11;
                    String str13 = j65Var.h;
                    String str14 = (str13 == null || drm0.N(str13)) ? str6 == null ? "" : str6 : str13;
                    String str15 = j65Var.i;
                    String str16 = (str15 == null || drm0.N(str15)) ? str6 == null ? "" : str6 : str15;
                    String str17 = j65Var.c;
                    String str18 = j65Var.k;
                    String str19 = str18 == null ? "" : str18;
                    int intValue2 = valueOf2 != 0 ? valueOf2.intValue() : 0;
                    String str20 = j65Var.m;
                    arrayList10.add(new SilentAuthInfo(userId2, str8, str9, millis, str10, str12, str14, str16, str17, str19, null, null, intValue2, str20 == null ? "" : str20, null, null, dgn0.b().b, j65Var.p, 52224, null));
                }
                return arrayList10;
            }
        }
        return EmptyList.b;
    }
}
