package xsna;

import android.graphics.Bitmap;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: AdMotionControllerImpl.kt */
/* loaded from: classes18.dex */
public final class og0 implements pjw, q0x0, ttz0 {
    public Object b;
    public Object c;

    public /* synthetic */ og0(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // xsna.q0x0
    public io.reactivex.rxjava3.internal.operators.single.y a(UserId userId, String str) {
        Integer num = 20;
        ((uft0) this.b).getClass();
        tfx tfxVar = new tfx("video.getWatchTogetherRecommendedVideos", new hsi0(5), new vul0(4));
        tfxVar.f(num.intValue(), 0, 100, "count");
        if (str != null) {
            tfx.o(tfxVar, "start_from", str, 0, 0, 12);
        }
        tfxVar.j("extended", true);
        EmptyList emptyList = q0x0.H7;
        if (emptyList != null) {
            tfxVar.i("fields", emptyList);
        }
        return rsg0.w0(yfb.x(tfxVar)).l(new cxd0(new lzl0(this, 22), 16));
    }

    public String b(UserId userId) {
        hp e;
        k2q k2qVar = (k2q) this.c;
        String str = null;
        String a = cqm0.a(k2qVar != null ? k2qVar.a(userId) : null);
        if (a != null) {
            return a;
        }
        mp mpVar = (mp) this.b;
        if (mpVar != null && (e = mpVar.e(userId)) != null) {
            str = e.h;
        }
        return str == null ? "" : str;
    }

    public boolean c() {
        com.vk.movika.sdk.base.model.l lVar = (com.vk.movika.sdk.base.model.l) this.c;
        return (lVar != null ? (ba30) lVar.c : null) != null;
    }

    public void d() {
        Object obj;
        String str;
        Object obj2;
        Object obj3;
        mp mpVar = (mp) this.b;
        k2q k2qVar = (k2q) this.c;
        dyz0 dyz0Var = new dyz0(mpVar, k2qVar);
        if (mpVar == null || k2qVar == null) {
            EmptyList emptyList = EmptyList.b;
            return;
        }
        par0.a.getClass();
        par0.a("VK_EXCHANGE_TOKENS_SYNC_MANAGER: start sync ETs");
        List<hp> f = mpVar.f();
        if (f.isEmpty()) {
            EmptyList emptyList2 = EmptyList.b;
            return;
        }
        List<hp> list = f;
        List<h2q> A = rli0.A(rli0.j(new ulp0(new i5g(list), new mdk0(dyz0Var, 18)), new weq0(4)));
        List A2 = rli0.A(new ulp0(rli0.j(new i5g(list), new mcl0(17)), new lwp0(7)));
        ArrayList arrayList = new ArrayList();
        if (A.isEmpty() && A2.isEmpty()) {
            par0.a("VK_EXCHANGE_TOKENS_SYNC_MANAGER: lists is empty");
            return;
        }
        if (!A2.isEmpty() && A.isEmpty()) {
            for (hp hpVar : list) {
                String a = cqm0.a(hpVar.h);
                if (a != null) {
                    k2qVar.b(hpVar.a, a, false);
                }
            }
            par0.a.getClass();
            par0.a("VK_EXCHANGE_TOKENS_SYNC_MANAGER: migration data from AM in ETR");
            return;
        }
        if (A2.isEmpty() && !A.isEmpty()) {
            par0.a("VK_EXCHANGE_TOKENS_SYNC_MANAGER: migration data to AM");
            ArrayList arrayList2 = new ArrayList();
            for (Object obj4 : list) {
                if (((hp) obj4).h.length() == 0) {
                    arrayList2.add(obj4);
                }
            }
            ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((hp) it.next()).a);
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                UserId userId = (UserId) it2.next();
                String a2 = cqm0.a(k2qVar.a(userId));
                if (a2 != null) {
                    Iterator<T> it3 = list.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj3 = it3.next();
                            if (((hp) obj3).a.b == userId.b) {
                                break;
                            }
                        } else {
                            obj3 = null;
                            break;
                        }
                    }
                    hp hpVar2 = (hp) obj3;
                    if (hpVar2 != null) {
                        arrayList.add(hp.a(hpVar2, null, a2, 895));
                    }
                }
            }
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                mpVar.g((hp) it4.next());
            }
            return;
        }
        if (A.containsAll(A2) && A2.containsAll(A)) {
            par0.a("VK_EXCHANGE_TOKENS_SYNC_MANAGER: is data the same");
            return;
        }
        par0.a("VK_EXCHANGE_TOKENS_SYNC_MANAGER: match data from AM and ETR");
        for (hp hpVar3 : list) {
            Iterator it5 = A.iterator();
            while (true) {
                if (it5.hasNext()) {
                    obj2 = it5.next();
                    if (((h2q) obj2).a.b == hpVar3.a.b) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            if (((h2q) obj2) == null && hpVar3.h.length() > 0) {
                k2qVar.b(hpVar3.a, hpVar3.h, false);
            }
        }
        for (h2q h2qVar : A) {
            Iterator<T> it6 = list.iterator();
            while (true) {
                if (it6.hasNext()) {
                    obj = it6.next();
                    if (((hp) obj).a.b == h2qVar.a.b) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            hp hpVar4 = (hp) obj;
            String str2 = hpVar4 != null ? hpVar4.h : null;
            if ((str2 == null || str2.length() == 0) && hpVar4 != null && (str = h2qVar.b) != null && str.length() != 0) {
                hp a3 = hp.a(hpVar4, null, h2qVar.b, 895);
                arrayList.add(a3);
                mpVar.g(a3);
            }
        }
    }

    @Override // xsna.pjw
    public String f(int i) {
        return i > 0 ? ImageList.Eb(i, i, ((ImageList) this.b).b) : (String) this.c;
    }

    @Override // xsna.ttz0
    public void zza(Bitmap bitmap) {
        jk01 jk01Var = (jk01) this.b;
        jk01Var.b = bitmap;
        al01 al01Var = (al01) this.c;
        al01Var.n = jk01Var;
        al01Var.a();
    }
}
