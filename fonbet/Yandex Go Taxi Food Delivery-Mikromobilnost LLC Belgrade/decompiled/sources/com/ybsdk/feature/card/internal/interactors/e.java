package com.ybsdk.feature.card.internal.interactors;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.card.api.CardSecondFactorHelper$Request;
import com.ybsdk.feature.settings.api.domain.SettingsItemEntity$Type;
import defpackage.ae8;
import defpackage.ayp0;
import defpackage.bq51;
import defpackage.bq8;
import defpackage.e7r0;
import defpackage.fe8;
import defpackage.gao;
import defpackage.jl40;
import defpackage.k5c;
import defpackage.mf8;
import defpackage.ny61;
import defpackage.o8r0;
import defpackage.pm5;
import defpackage.pz40;
import defpackage.qn8;
import defpackage.r8j0;
import defpackage.tcc;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.tls;
import defpackage.u8j0;
import defpackage.w511;
import defpackage.x4c;
import defpackage.xxp0;
import defpackage.yd8;
import defpackage.yxp0;
import defpackage.zxp0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class e {
    public final pm5 a;
    public final k5c b;
    public final tls c;
    public final com.ybsdk.feature.card.internal.presentation.carddetails.b d;
    public final com.ybsdk.feature.settings.internal.domain.card.a e;
    public final tfl0 f;
    public final qn8 g;

    public e(pm5 pm5Var, k5c k5cVar, tls tlsVar, com.ybsdk.feature.card.internal.presentation.carddetails.b bVar, com.ybsdk.feature.settings.internal.domain.card.a aVar, tfl0 tfl0Var, qn8 qn8Var) {
        this.a = pm5Var;
        this.b = k5cVar;
        this.c = tlsVar;
        this.d = bVar;
        this.e = aVar;
        this.f = tfl0Var;
        this.g = qn8Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0068, code lost:
    
        if (r5 == null) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(e eVar, o8r0 o8r0Var, String str, ContinuationImpl continuationImpl) {
        CardDetailsSettingsInteractor$switchToggle$2 cardDetailsSettingsInteractor$switchToggle$2;
        int i;
        Object a;
        o8r0 o8r0Var2;
        String str2;
        Throwable a2;
        pm5 pm5Var = eVar.a;
        if (continuationImpl instanceof CardDetailsSettingsInteractor$switchToggle$2) {
            cardDetailsSettingsInteractor$switchToggle$2 = (CardDetailsSettingsInteractor$switchToggle$2) continuationImpl;
            int i2 = cardDetailsSettingsInteractor$switchToggle$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardDetailsSettingsInteractor$switchToggle$2.label = i2 - Integer.MIN_VALUE;
                CardDetailsSettingsInteractor$switchToggle$2 cardDetailsSettingsInteractor$switchToggle$22 = cardDetailsSettingsInteractor$switchToggle$2;
                Object obj = cardDetailsSettingsInteractor$switchToggle$22.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardDetailsSettingsInteractor$switchToggle$22.label;
                zy11 zy11Var = zy11.a;
                String str3 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    boolean z = o8r0Var.g;
                    String str4 = o8r0Var.a;
                    boolean z2 = !z;
                    String str5 = pm5Var.a().h.a;
                    if (str5 == null) {
                        bq51 b = pm5Var.a().b();
                        str5 = b != null ? b.d : null;
                    }
                    String str6 = str5;
                    eVar.g(eVar.b(bq8.a(pm5Var.a(), null, null, false, null, null, new e7r0(str6, str4, 4), null, null, null, 16127), str4, str6, z2));
                    com.ybsdk.feature.settings.internal.domain.card.a aVar = eVar.e;
                    com.ybsdk.feature.card.internal.presentation.carddetails.b bVar = eVar.d;
                    cardDetailsSettingsInteractor$switchToggle$22.L$0 = o8r0Var;
                    cardDetailsSettingsInteractor$switchToggle$22.L$1 = str6;
                    cardDetailsSettingsInteractor$switchToggle$22.label = 1;
                    a = aVar.a(z2, o8r0Var, str, bVar, cardDetailsSettingsInteractor$switchToggle$22);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    o8r0Var2 = o8r0Var;
                    str2 = str6;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = (String) cardDetailsSettingsInteractor$switchToggle$22.L$1;
                    o8r0Var2 = (o8r0) cardDetailsSettingsInteractor$switchToggle$22.L$0;
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                }
                if (!(a instanceof Result.Failure)) {
                    ayp0 ayp0Var = (ayp0) a;
                    if (ayp0Var instanceof zxp0) {
                        ArrayList c = eVar.c(str2, (List) ((zxp0) ayp0Var).a);
                        if (c != null) {
                            eVar.g(bq8.a(pm5Var.a(), new r8j0(c, null, 14), null, false, null, null, new e7r0(str3, str3, 7), null, null, null, 16126));
                        }
                    } else if (ayp0Var instanceof xxp0) {
                        eVar.g(bq8.a(pm5Var.a(), null, null, false, null, null, e7r0.a(pm5Var.a().h, o8r0Var2), null, null, null, 16127));
                        qn8 qn8Var = eVar.g;
                        if (o8r0Var2.c == null) {
                            Text.Empty empty = Text.Empty.INSTANCE;
                        }
                        eVar.f.h(((mf8) qn8Var).b(((xxp0) ayp0Var).a, CardSecondFactorHelper$Request.SETTINGS));
                    } else {
                        if (!(ayp0Var instanceof yxp0)) {
                            w511.b();
                            return null;
                        }
                        eVar.d(o8r0Var2, "Change setting error - denied: " + ayp0Var, null);
                    }
                }
                a2 = Result.a(a);
                if (a2 != null) {
                    eVar.d(o8r0Var2, "Change setting error - failed: " + o8r0Var2, a2);
                }
                return zy11Var;
            }
        }
        cardDetailsSettingsInteractor$switchToggle$2 = new CardDetailsSettingsInteractor$switchToggle$2(eVar, continuationImpl);
        CardDetailsSettingsInteractor$switchToggle$2 cardDetailsSettingsInteractor$switchToggle$222 = cardDetailsSettingsInteractor$switchToggle$2;
        Object obj2 = cardDetailsSettingsInteractor$switchToggle$222.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardDetailsSettingsInteractor$switchToggle$222.label;
        zy11 zy11Var2 = zy11.a;
        String str32 = null;
        if (i != 0) {
        }
        if (!(a instanceof Result.Failure)) {
        }
        a2 = Result.a(a);
        if (a2 != null) {
        }
        return zy11Var2;
    }

    public final bq8 b(bq8 bq8Var, String str, String str2, boolean z) {
        bq51 bq51Var;
        List list;
        Object obj;
        u8j0 u8j0Var = this.a.a().a;
        if (u8j0Var == null || (list = (List) u8j0Var.a()) == null) {
            bq51Var = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof yd8) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((yd8) it.next()).a);
            }
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (jl40.l(((bq51) obj).d, str2)) {
                    break;
                }
            }
            bq51Var = (bq51) obj;
        }
        if (bq51Var == null) {
            x4c.g("There is no changing card with id and state", null, "id=" + str2 + ", state=" + bq8Var, null, 10);
            return bq8Var;
        }
        List<o8r0> list2 = bq51Var.n;
        ArrayList arrayList3 = new ArrayList(tcc.n(list2, 10));
        for (o8r0 o8r0Var : list2) {
            if (o8r0Var.b == SettingsItemEntity$Type.SWITCH && jl40.l(o8r0Var.a, str)) {
                o8r0Var = o8r0.a(o8r0Var, null, false, z, null, 4031);
            }
            arrayList3.add(o8r0Var);
        }
        ArrayList c = c(str2, arrayList3);
        return c != null ? bq8.a(bq8Var, new r8j0(c, null, 14), null, false, null, null, null, null, null, null, 16382) : bq8Var;
    }

    public final ArrayList c(String str, List list) {
        List list2;
        Iterator it;
        u8j0 u8j0Var = this.a.a().a;
        if (u8j0Var == null || (list2 = (List) u8j0Var.a()) == null) {
            return null;
        }
        List list3 = list2;
        ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            Object obj = (ae8) it2.next();
            if (obj instanceof yd8) {
                bq51 bq51Var = ((yd8) obj).a;
                if (jl40.l(bq51Var.d, str)) {
                    it = it2;
                    obj = new yd8(new bq51(bq51Var.a, bq51Var.b, bq51Var.c, bq51Var.d, bq51Var.e, bq51Var.f, bq51Var.g, bq51Var.h, bq51Var.i, bq51Var.j, bq51Var.k, bq51Var.l, bq51Var.m, list, bq51Var.o, bq51Var.p));
                    arrayList.add(obj);
                    it2 = it;
                }
            }
            it = it2;
            arrayList.add(obj);
            it2 = it;
        }
        return arrayList;
    }

    public final void d(o8r0 o8r0Var, String str, Throwable th) {
        f(o8r0Var);
        this.c.invoke(new fe8(gao.e(null, null, th, 3)));
        x4c.g("Exception during handleError() in CardDetailsSettingsInteractor", th, str, null, 8);
    }

    public final void e(String str) {
        o8r0 o8r0Var = this.a.a().h.c;
        if (o8r0Var == null) {
            x4c.g("provideVerificationToken: settingWaitingFor2fa is null unexpectedly", null, null, null, 14);
        } else {
            tje.N(this.b, null, null, new CardDetailsSettingsInteractor$provideVerificationToken$1$1(this, o8r0Var, str, null), 3);
        }
    }

    public final void f(o8r0 o8r0Var) {
        pm5 pm5Var = this.a;
        String str = pm5Var.a().h.a;
        String str2 = null;
        if (str != null) {
            g(b(bq8.a(pm5Var.a(), null, null, false, null, null, new e7r0(str2, str2, 7), null, null, null, 16127), o8r0Var.a, str, o8r0Var.g));
            return;
        }
        x4c.g("Changing setting of unknown card", null, "state=" + this, null, 10);
    }

    public final void g(bq8 bq8Var) {
        r0 r0Var;
        Object value;
        pz40 Y = ((com.ybsdk.feature.card.internal.presentation.carddetails.b) this.a.b).Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, bq8Var));
    }

    public final void h(o8r0 o8r0Var) {
        tje.N(this.b, null, null, new CardDetailsSettingsInteractor$switchToggle$1(this, o8r0Var, null), 3);
    }
}
