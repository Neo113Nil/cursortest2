package com.yandex.go.chargers.feedback;

import android.content.Context;
import com.yandex.go.chargers.notification.ChargersNotification;
import defpackage.an8;
import defpackage.awa;
import defpackage.c29;
import defpackage.c6a;
import defpackage.d130;
import defpackage.e6a;
import defpackage.j6a;
import defpackage.jl40;
import defpackage.k7x0;
import defpackage.m7x0;
import defpackage.m950;
import defpackage.mu5;
import defpackage.n0a;
import defpackage.nar;
import defpackage.ny61;
import defpackage.od9;
import defpackage.pgd;
import defpackage.pma;
import defpackage.rxf;
import defpackage.sls;
import defpackage.sy60;
import defpackage.tca;
import defpackage.tje;
import defpackage.uma;
import defpackage.vca;
import defpackage.w030;
import defpackage.wfd;
import defpackage.xma;
import defpackage.yvf0;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes12.dex */
public final class c extends pgd {
    public final Context F;
    public final k7x0 G;
    public final d130 H;
    public final ru.yandex.taxi.widget.c I;
    public final rxf J;
    public final rxf K;
    public final xma L;
    public final awa M;
    public final com.yandex.go.chargers.feedback.ui.c N;
    public final an8 O;
    public final yvf0 P;
    public final com.yandex.go.chargers.data.b Q;
    public final c29 R;
    public final mu5 S;

    public c(Context context, k7x0 k7x0Var, d130 d130Var, ru.yandex.taxi.widget.c cVar, rxf rxfVar, rxf rxfVar2, xma xmaVar, awa awaVar, com.yandex.go.chargers.feedback.ui.c cVar2, an8 an8Var, rxf rxfVar3, com.yandex.go.chargers.data.b bVar) {
        super(0);
        this.F = context;
        this.G = k7x0Var;
        this.H = d130Var;
        this.I = cVar;
        this.J = rxfVar;
        this.K = rxfVar2;
        this.L = xmaVar;
        this.M = awaVar;
        this.N = cVar2;
        this.O = an8Var;
        this.P = rxfVar3;
        this.Q = bVar;
        this.R = new c29(7, this);
        this.S = new mu5(new od9(8, this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c3, code lost:
    
        if (r12 == r2) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object U(c cVar, vca vcaVar, List list, ContinuationImpl continuationImpl) {
        ChargersFeedbackScreenRouter$handleNotificationAction$1 chargersFeedbackScreenRouter$handleNotificationAction$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object obj;
        pma pmaVar;
        m950 a;
        String str;
        Object i2;
        m950 m950Var;
        CharSequence charSequence;
        c cVar2;
        String str2;
        cVar.getClass();
        ru.yandex.taxi.widget.c cVar3 = cVar.I;
        if (continuationImpl instanceof ChargersFeedbackScreenRouter$handleNotificationAction$1) {
            chargersFeedbackScreenRouter$handleNotificationAction$1 = (ChargersFeedbackScreenRouter$handleNotificationAction$1) continuationImpl;
            int i3 = chargersFeedbackScreenRouter$handleNotificationAction$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                chargersFeedbackScreenRouter$handleNotificationAction$1.label = i3 - Integer.MIN_VALUE;
                Object obj2 = chargersFeedbackScreenRouter$handleNotificationAction$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersFeedbackScreenRouter$handleNotificationAction$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if ((vcaVar instanceof tca) && list != null) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (jl40.l(((pma) obj).a, ((tca) vcaVar).a)) {
                                break;
                            }
                        }
                        pmaVar = (pma) obj;
                        if (pmaVar != null) {
                            a = cVar.L.a(cVar.H);
                            str = pmaVar.a;
                            FormattedText formattedText = pmaVar.c;
                            chargersFeedbackScreenRouter$handleNotificationAction$1.L$0 = null;
                            chargersFeedbackScreenRouter$handleNotificationAction$1.L$1 = null;
                            chargersFeedbackScreenRouter$handleNotificationAction$1.L$2 = pmaVar;
                            chargersFeedbackScreenRouter$handleNotificationAction$1.L$3 = str;
                            chargersFeedbackScreenRouter$handleNotificationAction$1.L$4 = a;
                            chargersFeedbackScreenRouter$handleNotificationAction$1.L$5 = cVar;
                            chargersFeedbackScreenRouter$handleNotificationAction$1.label = 1;
                            obj2 = ru.yandex.taxi.widget.c.i(cVar3, formattedText, null, chargersFeedbackScreenRouter$handleNotificationAction$1, 30);
                        }
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = (String) chargersFeedbackScreenRouter$handleNotificationAction$1.L$7;
                    charSequence = (CharSequence) chargersFeedbackScreenRouter$handleNotificationAction$1.L$6;
                    cVar2 = (c) chargersFeedbackScreenRouter$handleNotificationAction$1.L$5;
                    m950Var = (m950) chargersFeedbackScreenRouter$handleNotificationAction$1.L$4;
                    kotlin.b.b(obj2);
                    cVar2.A(m950Var, new uma(charSequence, (CharSequence) obj2, str2), sy60.Q2);
                    return zy11.a;
                }
                cVar = (c) chargersFeedbackScreenRouter$handleNotificationAction$1.L$5;
                a = (m950) chargersFeedbackScreenRouter$handleNotificationAction$1.L$4;
                str = (String) chargersFeedbackScreenRouter$handleNotificationAction$1.L$3;
                pmaVar = (pma) chargersFeedbackScreenRouter$handleNotificationAction$1.L$2;
                kotlin.b.b(obj2);
                CharSequence charSequence2 = (CharSequence) obj2;
                String str3 = pmaVar.b;
                FormattedText formattedText2 = pmaVar.d;
                chargersFeedbackScreenRouter$handleNotificationAction$1.L$0 = null;
                chargersFeedbackScreenRouter$handleNotificationAction$1.L$1 = null;
                chargersFeedbackScreenRouter$handleNotificationAction$1.L$2 = null;
                chargersFeedbackScreenRouter$handleNotificationAction$1.L$3 = str;
                chargersFeedbackScreenRouter$handleNotificationAction$1.L$4 = a;
                chargersFeedbackScreenRouter$handleNotificationAction$1.L$5 = cVar;
                chargersFeedbackScreenRouter$handleNotificationAction$1.L$6 = charSequence2;
                chargersFeedbackScreenRouter$handleNotificationAction$1.L$7 = str3;
                chargersFeedbackScreenRouter$handleNotificationAction$1.label = 2;
                i2 = ru.yandex.taxi.widget.c.i(cVar3, formattedText2, null, chargersFeedbackScreenRouter$handleNotificationAction$1, 30);
                if (i2 != coroutineSingletons) {
                    m950Var = a;
                    charSequence = charSequence2;
                    obj2 = i2;
                    cVar2 = cVar;
                    str2 = str3;
                    cVar2.A(m950Var, new uma(charSequence, (CharSequence) obj2, str2), sy60.Q2);
                    return zy11.a;
                }
                return coroutineSingletons;
            }
        }
        chargersFeedbackScreenRouter$handleNotificationAction$1 = new ChargersFeedbackScreenRouter$handleNotificationAction$1(cVar, continuationImpl);
        Object obj22 = chargersFeedbackScreenRouter$handleNotificationAction$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersFeedbackScreenRouter$handleNotificationAction$1.label;
        if (i != 0) {
        }
        CharSequence charSequence22 = (CharSequence) obj22;
        String str32 = pmaVar.b;
        FormattedText formattedText22 = pmaVar.d;
        chargersFeedbackScreenRouter$handleNotificationAction$1.L$0 = null;
        chargersFeedbackScreenRouter$handleNotificationAction$1.L$1 = null;
        chargersFeedbackScreenRouter$handleNotificationAction$1.L$2 = null;
        chargersFeedbackScreenRouter$handleNotificationAction$1.L$3 = str;
        chargersFeedbackScreenRouter$handleNotificationAction$1.L$4 = a;
        chargersFeedbackScreenRouter$handleNotificationAction$1.L$5 = cVar;
        chargersFeedbackScreenRouter$handleNotificationAction$1.L$6 = charSequence22;
        chargersFeedbackScreenRouter$handleNotificationAction$1.L$7 = str32;
        chargersFeedbackScreenRouter$handleNotificationAction$1.label = 2;
        i2 = ru.yandex.taxi.widget.c.i(cVar3, formattedText22, null, chargersFeedbackScreenRouter$handleNotificationAction$1, 30);
        if (i2 != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object V(c cVar, c6a c6aVar, b bVar, ContinuationImpl continuationImpl) {
        ChargersFeedbackScreenRouter$showNotification$1 chargersFeedbackScreenRouter$showNotification$1;
        int i;
        String str;
        e6a e6aVar;
        j6a j6aVar;
        c6a c6aVar2;
        sls slsVar;
        FormattedText formattedText;
        CharSequence charSequence;
        CharSequence charSequence2;
        sls slsVar2;
        CharSequence charSequence3;
        String str2;
        sls slsVar3;
        e6a e6aVar2;
        cVar.getClass();
        ru.yandex.taxi.widget.c cVar2 = cVar.I;
        if (continuationImpl instanceof ChargersFeedbackScreenRouter$showNotification$1) {
            chargersFeedbackScreenRouter$showNotification$1 = (ChargersFeedbackScreenRouter$showNotification$1) continuationImpl;
            int i2 = chargersFeedbackScreenRouter$showNotification$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersFeedbackScreenRouter$showNotification$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersFeedbackScreenRouter$showNotification$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersFeedbackScreenRouter$showNotification$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    j6a j6aVar2 = (j6a) cVar.P.get();
                    str = c6aVar.a;
                    String str3 = c6aVar.b;
                    e6aVar = str3 != null ? new e6a(((m7x0) cVar.G).a(str3)) : null;
                    FormattedText formattedText2 = c6aVar.c;
                    chargersFeedbackScreenRouter$showNotification$1.L$0 = c6aVar;
                    chargersFeedbackScreenRouter$showNotification$1.L$1 = bVar;
                    chargersFeedbackScreenRouter$showNotification$1.L$2 = str;
                    chargersFeedbackScreenRouter$showNotification$1.L$3 = e6aVar;
                    chargersFeedbackScreenRouter$showNotification$1.L$4 = j6aVar2;
                    chargersFeedbackScreenRouter$showNotification$1.label = 1;
                    Object i3 = ru.yandex.taxi.widget.c.i(cVar2, formattedText2, null, chargersFeedbackScreenRouter$showNotification$1, 30);
                    if (i3 != coroutineSingletons) {
                        obj = i3;
                        j6aVar = j6aVar2;
                        c6aVar2 = c6aVar;
                        slsVar = bVar;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j6aVar = (j6a) chargersFeedbackScreenRouter$showNotification$1.L$6;
                    charSequence3 = (CharSequence) chargersFeedbackScreenRouter$showNotification$1.L$4;
                    e6aVar2 = (e6a) chargersFeedbackScreenRouter$showNotification$1.L$3;
                    str2 = (String) chargersFeedbackScreenRouter$showNotification$1.L$2;
                    slsVar3 = (sls) chargersFeedbackScreenRouter$showNotification$1.L$1;
                    kotlin.b.b(obj);
                    sls slsVar4 = slsVar3;
                    str = str2;
                    charSequence2 = (CharSequence) obj;
                    slsVar2 = slsVar4;
                    charSequence = charSequence3;
                    e6aVar = e6aVar2;
                    j6aVar.getClass();
                    Context context = j6aVar.a;
                    if (str == null) {
                        str = "ChargersNotification";
                    }
                    j6aVar.a(new ChargersNotification(context, str, charSequence, charSequence2, e6aVar, j6aVar.b, slsVar2 == null ? 0 : 2), slsVar2);
                    return zy11.a;
                }
                j6aVar = (j6a) chargersFeedbackScreenRouter$showNotification$1.L$4;
                e6a e6aVar3 = (e6a) chargersFeedbackScreenRouter$showNotification$1.L$3;
                str = (String) chargersFeedbackScreenRouter$showNotification$1.L$2;
                slsVar = (sls) chargersFeedbackScreenRouter$showNotification$1.L$1;
                c6a c6aVar3 = (c6a) chargersFeedbackScreenRouter$showNotification$1.L$0;
                kotlin.b.b(obj);
                e6aVar = e6aVar3;
                c6aVar2 = c6aVar3;
                CharSequence charSequence4 = (CharSequence) obj;
                formattedText = c6aVar2.d;
                if (formattedText != null) {
                    charSequence = charSequence4;
                    charSequence2 = null;
                    slsVar2 = slsVar;
                    j6aVar.getClass();
                    Context context2 = j6aVar.a;
                    if (str == null) {
                    }
                    j6aVar.a(new ChargersNotification(context2, str, charSequence, charSequence2, e6aVar, j6aVar.b, slsVar2 == null ? 0 : 2), slsVar2);
                    return zy11.a;
                }
                chargersFeedbackScreenRouter$showNotification$1.L$0 = null;
                chargersFeedbackScreenRouter$showNotification$1.L$1 = slsVar;
                chargersFeedbackScreenRouter$showNotification$1.L$2 = str;
                chargersFeedbackScreenRouter$showNotification$1.L$3 = e6aVar;
                chargersFeedbackScreenRouter$showNotification$1.L$4 = charSequence4;
                chargersFeedbackScreenRouter$showNotification$1.L$5 = null;
                chargersFeedbackScreenRouter$showNotification$1.L$6 = j6aVar;
                chargersFeedbackScreenRouter$showNotification$1.label = 2;
                Object i4 = ru.yandex.taxi.widget.c.i(cVar2, formattedText, null, chargersFeedbackScreenRouter$showNotification$1, 30);
                if (i4 != coroutineSingletons) {
                    obj = i4;
                    charSequence3 = charSequence4;
                    str2 = str;
                    slsVar3 = slsVar;
                    e6aVar2 = e6aVar;
                    sls slsVar42 = slsVar3;
                    str = str2;
                    charSequence2 = (CharSequence) obj;
                    slsVar2 = slsVar42;
                    charSequence = charSequence3;
                    e6aVar = e6aVar2;
                    j6aVar.getClass();
                    Context context22 = j6aVar.a;
                    if (str == null) {
                    }
                    j6aVar.a(new ChargersNotification(context22, str, charSequence, charSequence2, e6aVar, j6aVar.b, slsVar2 == null ? 0 : 2), slsVar2);
                    return zy11.a;
                }
                return coroutineSingletons;
            }
        }
        chargersFeedbackScreenRouter$showNotification$1 = new ChargersFeedbackScreenRouter$showNotification$1(cVar, continuationImpl);
        Object obj2 = chargersFeedbackScreenRouter$showNotification$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersFeedbackScreenRouter$showNotification$1.label;
        if (i != 0) {
        }
        CharSequence charSequence42 = (CharSequence) obj2;
        formattedText = c6aVar2.d;
        if (formattedText != null) {
        }
    }

    @Override // defpackage.pgd, defpackage.h55
    public final void G(Object obj) {
        nar narVar = (nar) obj;
        super.G(narVar);
        tje.N(o(), null, null, new ChargersFeedbackScreenRouter$onAttach$1(this, narVar, null), 3);
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.O.q(((nar) obj).a, n0a.a, this.R);
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.S;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.H;
    }
}
