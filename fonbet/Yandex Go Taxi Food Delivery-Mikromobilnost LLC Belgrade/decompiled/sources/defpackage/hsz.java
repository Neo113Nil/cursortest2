package defpackage;

import android.content.SharedPreferences;
import com.yandex.payment.sdk.feature.flags.FeatureFlag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.a;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes2.dex */
public final class hsz implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ hsz(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
        this.x = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Object obj2;
        switch (this.a) {
            case 0:
                ((AtomicBoolean) this.b).set(true);
                nuz nuzVar = (nuz) this.c;
                nuzVar.d((isz) this.w);
                isz iszVar = (isz) this.x;
                synchronized (nuzVar) {
                    nuzVar.b.remove(iszVar);
                }
                return zy11.a;
            default:
                y3x y3xVar = (y3x) obj;
                mj31 mj31Var = (mj31) this.b;
                ArrayList arrayList = new ArrayList();
                wj00 wj00Var = (wj00) y3xVar;
                List m = wj00Var.m("flags");
                String h = wj00Var.h("exp_boxes");
                String str = h == null ? "" : h;
                Iterator it = m.iterator();
                while (true) {
                    xkp xkpVar = null;
                    if (it.hasNext()) {
                        try {
                            wj00 wj00Var2 = (wj00) ((y3x) it.next());
                            xkpVar = new xkp(wj00Var2.p("name"), wj00Var2.p("value"));
                        } catch (RuntimeException unused) {
                        }
                        if (xkpVar != null) {
                            arrayList.add(xkpVar);
                        }
                    } else {
                        SharedPreferences sharedPreferences = (SharedPreferences) this.c;
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            Object[] objArr = 0;
                            if (!it2.hasNext()) {
                                ((y22) this.w).b.b("exp_boxes", str);
                                rwo rwoVar = (rwo) this.x;
                                sv90 sv90Var = qv90.a;
                                String X = a.X(arrayList, null, null, null, av0.R, 31);
                                sv90Var.getClass();
                                String str2 = "Получение фичефлагов: текущие активные эксперименты = " + str + ", feature_flags_response = " + X;
                                wj00 i = vfc.i(0, "exp_boxes", str, "feature_flags_response", X);
                                i.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, str2);
                                ((y22) rwoVar).a(y891.c("get_feature_flags", i).d(null));
                                t1r t1rVar = (t1r) ((l1g) ((i3y) mj31Var.w).getValue()).e.get();
                                return ymx.j(ooa1.d(((qdh) t1rVar.c.a).b(y3xVar)), new s1r(objArr == true ? 1 : 0, t1rVar), null, 5);
                            }
                            xkp xkpVar2 = (xkp) it2.next();
                            String str3 = xkpVar2.a;
                            String str4 = xkpVar2.b;
                            Iterator<E> it3 = FeatureFlag.b().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    obj2 = it3.next();
                                    if (jl40.l(((FeatureFlag) obj2).getFlagName(), str3)) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            FeatureFlag featureFlag = (FeatureFlag) obj2;
                            if (featureFlag != null ? featureFlag.getIsSavable() : false) {
                                sharedPreferences.edit().putBoolean(str3, Boolean.parseBoolean(str4)).apply();
                            }
                            pfr.b.a(new q96(str3, 1, str4));
                        }
                    }
                }
        }
    }
}
