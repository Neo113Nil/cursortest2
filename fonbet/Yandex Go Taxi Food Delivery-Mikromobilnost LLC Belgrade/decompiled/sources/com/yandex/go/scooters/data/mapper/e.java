package com.yandex.go.scooters.data.mapper;

import android.content.Context;
import android.net.Uri;
import com.yandex.go.scooters.data.model.ScootersSubscriptionLegalInfoDto;
import com.yandex.go.scooters.data.model.ScootersSubscriptionUpsaleBadgeDto;
import com.yandex.go.scooters.data.model.ScootersSubscriptionUpsaleButtonDto;
import com.yandex.go.scooters.data.model.ScootersSubscriptionUpsaleWindowDto;
import com.yandex.go.scooters.data.model.Subscription;
import com.yandex.go.scooters.data.model.SubscriptionPromoblock;
import defpackage.bvf0;
import defpackage.cxo0;
import defpackage.dxo0;
import defpackage.exo0;
import defpackage.f9s;
import defpackage.fef;
import defpackage.frl0;
import defpackage.fxo0;
import defpackage.kdc;
import defpackage.ny61;
import defpackage.odn0;
import defpackage.pdc;
import defpackage.s8o;
import defpackage.ufu;
import defpackage.wwo0;
import defpackage.xdf;
import defpackage.xzo0;
import defpackage.yzo0;
import defpackage.zzo0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.scooters.domain.q;

/* loaded from: classes13.dex */
public final class e {
    public final Context a;
    public final pdc b;
    public final xdf c;
    public final q d;
    public final ru.yandex.taxi.widget.c e;

    public e(Context context, pdc pdcVar, xdf xdfVar, q qVar, ru.yandex.taxi.widget.c cVar) {
        this.a = context;
        this.b = pdcVar;
        this.c = xdfVar;
        this.d = qVar;
        this.e = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(e eVar, SubscriptionPromoblock.Badge badge, fef fefVar, ContinuationImpl continuationImpl) {
        ScootersSubscriptionMapper$mapPromoblockBadge$1 scootersSubscriptionMapper$mapPromoblockBadge$1;
        int i;
        String str;
        kdc b;
        int i2;
        eVar.getClass();
        if (continuationImpl instanceof ScootersSubscriptionMapper$mapPromoblockBadge$1) {
            scootersSubscriptionMapper$mapPromoblockBadge$1 = (ScootersSubscriptionMapper$mapPromoblockBadge$1) continuationImpl;
            int i3 = scootersSubscriptionMapper$mapPromoblockBadge$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                scootersSubscriptionMapper$mapPromoblockBadge$1.label = i3 - Integer.MIN_VALUE;
                ScootersSubscriptionMapper$mapPromoblockBadge$1 scootersSubscriptionMapper$mapPromoblockBadge$12 = scootersSubscriptionMapper$mapPromoblockBadge$1;
                Object obj = scootersSubscriptionMapper$mapPromoblockBadge$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersSubscriptionMapper$mapPromoblockBadge$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (badge.b.a.isEmpty() || (str = badge.a) == null || (b = ((ufu) eVar.b).b(str)) == null) {
                        return null;
                    }
                    int m = s8o.m(b, eVar.a);
                    ru.yandex.taxi.widget.c cVar = eVar.e;
                    FormattedText c = f9s.c(eVar.c, fefVar, badge.b);
                    scootersSubscriptionMapper$mapPromoblockBadge$12.L$0 = null;
                    scootersSubscriptionMapper$mapPromoblockBadge$12.L$1 = null;
                    scootersSubscriptionMapper$mapPromoblockBadge$12.I$0 = m;
                    scootersSubscriptionMapper$mapPromoblockBadge$12.label = 1;
                    Object e = ru.yandex.taxi.widget.c.e(cVar, c, null, false, scootersSubscriptionMapper$mapPromoblockBadge$12, 30);
                    if (e == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = e;
                    i2 = m;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = scootersSubscriptionMapper$mapPromoblockBadge$12.I$0;
                    kotlin.b.b(obj);
                }
                return new cxo0(i2, (CharSequence) obj);
            }
        }
        scootersSubscriptionMapper$mapPromoblockBadge$1 = new ScootersSubscriptionMapper$mapPromoblockBadge$1(eVar, continuationImpl);
        ScootersSubscriptionMapper$mapPromoblockBadge$1 scootersSubscriptionMapper$mapPromoblockBadge$122 = scootersSubscriptionMapper$mapPromoblockBadge$1;
        Object obj2 = scootersSubscriptionMapper$mapPromoblockBadge$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSubscriptionMapper$mapPromoblockBadge$122.label;
        if (i != 0) {
        }
        return new cxo0(i2, (CharSequence) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(e eVar, Subscription subscription, fef fefVar, ContinuationImpl continuationImpl) {
        ScootersSubscriptionMapper$mapPromoblockSubscription$1 scootersSubscriptionMapper$mapPromoblockSubscription$1;
        int i;
        SubscriptionPromoblock subscriptionPromoblock;
        fef fefVar2;
        odn0 odn0Var;
        q qVar = eVar.d;
        if (continuationImpl instanceof ScootersSubscriptionMapper$mapPromoblockSubscription$1) {
            scootersSubscriptionMapper$mapPromoblockSubscription$1 = (ScootersSubscriptionMapper$mapPromoblockSubscription$1) continuationImpl;
            int i2 = scootersSubscriptionMapper$mapPromoblockSubscription$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersSubscriptionMapper$mapPromoblockSubscription$1.label = i2 - Integer.MIN_VALUE;
                ScootersSubscriptionMapper$mapPromoblockSubscription$1 scootersSubscriptionMapper$mapPromoblockSubscription$12 = scootersSubscriptionMapper$mapPromoblockSubscription$1;
                Object obj = scootersSubscriptionMapper$mapPromoblockSubscription$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersSubscriptionMapper$mapPromoblockSubscription$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    subscriptionPromoblock = subscription.a;
                    if (subscriptionPromoblock != null) {
                        String str = subscriptionPromoblock.b;
                        if (str.length() != 0 && !subscriptionPromoblock.c.a.isEmpty()) {
                            Uri parse = Uri.parse(str);
                            scootersSubscriptionMapper$mapPromoblockSubscription$12.L$0 = null;
                            scootersSubscriptionMapper$mapPromoblockSubscription$12.L$1 = fefVar;
                            scootersSubscriptionMapper$mapPromoblockSubscription$12.L$2 = subscriptionPromoblock;
                            scootersSubscriptionMapper$mapPromoblockSubscription$12.L$3 = null;
                            scootersSubscriptionMapper$mapPromoblockSubscription$12.label = 1;
                            obj = qVar.p(parse, scootersSubscriptionMapper$mapPromoblockSubscription$12);
                            if (obj != coroutineSingletons) {
                                fefVar2 = fefVar;
                            }
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                subscriptionPromoblock = (SubscriptionPromoblock) scootersSubscriptionMapper$mapPromoblockSubscription$12.L$2;
                fefVar2 = (fef) scootersSubscriptionMapper$mapPromoblockSubscription$12.L$1;
                kotlin.b.b(obj);
                odn0Var = (odn0) obj;
                if (odn0Var != null) {
                    qVar.getClass();
                    wwo0 p = frl0.t.p(odn0Var.a);
                    if (p != null) {
                        ScootersSubscriptionMapper$mapPromoblockSubscription$2 scootersSubscriptionMapper$mapPromoblockSubscription$2 = new ScootersSubscriptionMapper$mapPromoblockSubscription$2(p, subscriptionPromoblock, eVar, fefVar2, null);
                        scootersSubscriptionMapper$mapPromoblockSubscription$12.L$0 = null;
                        scootersSubscriptionMapper$mapPromoblockSubscription$12.L$1 = null;
                        scootersSubscriptionMapper$mapPromoblockSubscription$12.L$2 = null;
                        scootersSubscriptionMapper$mapPromoblockSubscription$12.L$3 = null;
                        scootersSubscriptionMapper$mapPromoblockSubscription$12.L$4 = null;
                        scootersSubscriptionMapper$mapPromoblockSubscription$12.L$5 = null;
                        scootersSubscriptionMapper$mapPromoblockSubscription$12.label = 2;
                        Object n = bvf0.n(scootersSubscriptionMapper$mapPromoblockSubscription$2, scootersSubscriptionMapper$mapPromoblockSubscription$12);
                        return n == coroutineSingletons ? coroutineSingletons : n;
                    }
                }
                return null;
            }
        }
        scootersSubscriptionMapper$mapPromoblockSubscription$1 = new ScootersSubscriptionMapper$mapPromoblockSubscription$1(eVar, continuationImpl);
        ScootersSubscriptionMapper$mapPromoblockSubscription$1 scootersSubscriptionMapper$mapPromoblockSubscription$122 = scootersSubscriptionMapper$mapPromoblockSubscription$1;
        Object obj2 = scootersSubscriptionMapper$mapPromoblockSubscription$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSubscriptionMapper$mapPromoblockSubscription$122.label;
        if (i != 0) {
        }
        odn0Var = (odn0) obj2;
        if (odn0Var != null) {
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0062, code lost:
    
        if (r10 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(e eVar, SubscriptionPromoblock.Toggle toggle, fef fefVar, ContinuationImpl continuationImpl) {
        ScootersSubscriptionMapper$mapPromoblockToggle$1 scootersSubscriptionMapper$mapPromoblockToggle$1;
        int i;
        dxo0 dxo0Var;
        dxo0 dxo0Var2;
        eVar.getClass();
        if (continuationImpl instanceof ScootersSubscriptionMapper$mapPromoblockToggle$1) {
            scootersSubscriptionMapper$mapPromoblockToggle$1 = (ScootersSubscriptionMapper$mapPromoblockToggle$1) continuationImpl;
            int i2 = scootersSubscriptionMapper$mapPromoblockToggle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersSubscriptionMapper$mapPromoblockToggle$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersSubscriptionMapper$mapPromoblockToggle$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersSubscriptionMapper$mapPromoblockToggle$1.label;
                exo0 exo0Var = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    SubscriptionPromoblock.Toggle.Button button = toggle.a;
                    if (button != null) {
                        scootersSubscriptionMapper$mapPromoblockToggle$1.L$0 = toggle;
                        scootersSubscriptionMapper$mapPromoblockToggle$1.L$1 = fefVar;
                        scootersSubscriptionMapper$mapPromoblockToggle$1.label = 1;
                        obj = eVar.g(button, fefVar, scootersSubscriptionMapper$mapPromoblockToggle$1);
                    }
                    return null;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dxo0Var2 = (dxo0) scootersSubscriptionMapper$mapPromoblockToggle$1.L$3;
                    kotlin.b.b(obj);
                    exo0Var = (exo0) obj;
                    dxo0Var = dxo0Var2;
                    return new fxo0(dxo0Var, exo0Var);
                }
                fefVar = (fef) scootersSubscriptionMapper$mapPromoblockToggle$1.L$1;
                toggle = (SubscriptionPromoblock.Toggle) scootersSubscriptionMapper$mapPromoblockToggle$1.L$0;
                kotlin.b.b(obj);
                dxo0Var = (dxo0) obj;
                if (dxo0Var != null) {
                    SubscriptionPromoblock.Toggle.LegalInfo legalInfo = toggle.b;
                    if (legalInfo != null) {
                        scootersSubscriptionMapper$mapPromoblockToggle$1.L$0 = null;
                        scootersSubscriptionMapper$mapPromoblockToggle$1.L$1 = null;
                        scootersSubscriptionMapper$mapPromoblockToggle$1.L$2 = null;
                        scootersSubscriptionMapper$mapPromoblockToggle$1.L$3 = dxo0Var;
                        scootersSubscriptionMapper$mapPromoblockToggle$1.label = 2;
                        Object h = eVar.h(legalInfo, fefVar, scootersSubscriptionMapper$mapPromoblockToggle$1);
                        if (h != obj2) {
                            obj = h;
                            dxo0Var2 = dxo0Var;
                            exo0Var = (exo0) obj;
                            dxo0Var = dxo0Var2;
                        }
                        return obj2;
                    }
                    return new fxo0(dxo0Var, exo0Var);
                }
                return null;
            }
        }
        scootersSubscriptionMapper$mapPromoblockToggle$1 = new ScootersSubscriptionMapper$mapPromoblockToggle$1(eVar, continuationImpl);
        Object obj3 = scootersSubscriptionMapper$mapPromoblockToggle$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSubscriptionMapper$mapPromoblockToggle$1.label;
        exo0 exo0Var2 = null;
        if (i != 0) {
        }
        dxo0Var = (dxo0) obj3;
        if (dxo0Var != null) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(e eVar, ScootersSubscriptionUpsaleBadgeDto scootersSubscriptionUpsaleBadgeDto, fef fefVar, ContinuationImpl continuationImpl) {
        ScootersSubscriptionMapper$mapSubscriptionUpsaleBadge$1 scootersSubscriptionMapper$mapSubscriptionUpsaleBadge$1;
        int i;
        String str;
        String str2;
        eVar.getClass();
        if (continuationImpl instanceof ScootersSubscriptionMapper$mapSubscriptionUpsaleBadge$1) {
            scootersSubscriptionMapper$mapSubscriptionUpsaleBadge$1 = (ScootersSubscriptionMapper$mapSubscriptionUpsaleBadge$1) continuationImpl;
            int i2 = scootersSubscriptionMapper$mapSubscriptionUpsaleBadge$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersSubscriptionMapper$mapSubscriptionUpsaleBadge$1.label = i2 - Integer.MIN_VALUE;
                ScootersSubscriptionMapper$mapSubscriptionUpsaleBadge$1 scootersSubscriptionMapper$mapSubscriptionUpsaleBadge$12 = scootersSubscriptionMapper$mapSubscriptionUpsaleBadge$1;
                Object obj = scootersSubscriptionMapper$mapSubscriptionUpsaleBadge$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersSubscriptionMapper$mapSubscriptionUpsaleBadge$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (scootersSubscriptionUpsaleBadgeDto.a.a.isEmpty() || (str = scootersSubscriptionUpsaleBadgeDto.b) == null) {
                        return null;
                    }
                    ru.yandex.taxi.widget.c cVar = eVar.e;
                    FormattedText c = f9s.c(eVar.c, fefVar, scootersSubscriptionUpsaleBadgeDto.a);
                    scootersSubscriptionMapper$mapSubscriptionUpsaleBadge$12.L$0 = null;
                    scootersSubscriptionMapper$mapSubscriptionUpsaleBadge$12.L$1 = null;
                    scootersSubscriptionMapper$mapSubscriptionUpsaleBadge$12.L$2 = str;
                    scootersSubscriptionMapper$mapSubscriptionUpsaleBadge$12.label = 1;
                    Object e = ru.yandex.taxi.widget.c.e(cVar, c, null, false, scootersSubscriptionMapper$mapSubscriptionUpsaleBadge$12, 30);
                    if (e == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = e;
                    str2 = str;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = (String) scootersSubscriptionMapper$mapSubscriptionUpsaleBadge$12.L$2;
                    kotlin.b.b(obj);
                }
                return new xzo0((CharSequence) obj, str2);
            }
        }
        scootersSubscriptionMapper$mapSubscriptionUpsaleBadge$1 = new ScootersSubscriptionMapper$mapSubscriptionUpsaleBadge$1(eVar, continuationImpl);
        ScootersSubscriptionMapper$mapSubscriptionUpsaleBadge$1 scootersSubscriptionMapper$mapSubscriptionUpsaleBadge$122 = scootersSubscriptionMapper$mapSubscriptionUpsaleBadge$1;
        Object obj2 = scootersSubscriptionMapper$mapSubscriptionUpsaleBadge$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSubscriptionMapper$mapSubscriptionUpsaleBadge$122.label;
        if (i != 0) {
        }
        return new xzo0((CharSequence) obj2, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(e eVar, ScootersSubscriptionLegalInfoDto scootersSubscriptionLegalInfoDto, ContinuationImpl continuationImpl) {
        ScootersSubscriptionMapper$mapSubscriptionUpsaleLegalInfo$1 scootersSubscriptionMapper$mapSubscriptionUpsaleLegalInfo$1;
        int i;
        eVar.getClass();
        if (continuationImpl instanceof ScootersSubscriptionMapper$mapSubscriptionUpsaleLegalInfo$1) {
            scootersSubscriptionMapper$mapSubscriptionUpsaleLegalInfo$1 = (ScootersSubscriptionMapper$mapSubscriptionUpsaleLegalInfo$1) continuationImpl;
            int i2 = scootersSubscriptionMapper$mapSubscriptionUpsaleLegalInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersSubscriptionMapper$mapSubscriptionUpsaleLegalInfo$1.label = i2 - Integer.MIN_VALUE;
                ScootersSubscriptionMapper$mapSubscriptionUpsaleLegalInfo$1 scootersSubscriptionMapper$mapSubscriptionUpsaleLegalInfo$12 = scootersSubscriptionMapper$mapSubscriptionUpsaleLegalInfo$1;
                Object obj = scootersSubscriptionMapper$mapSubscriptionUpsaleLegalInfo$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersSubscriptionMapper$mapSubscriptionUpsaleLegalInfo$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (scootersSubscriptionLegalInfoDto.a.a.isEmpty() || scootersSubscriptionLegalInfoDto.b.length() == 0) {
                        return null;
                    }
                    ru.yandex.taxi.widget.c cVar = eVar.e;
                    FormattedText formattedText = scootersSubscriptionLegalInfoDto.a;
                    scootersSubscriptionMapper$mapSubscriptionUpsaleLegalInfo$12.L$0 = scootersSubscriptionLegalInfoDto;
                    scootersSubscriptionMapper$mapSubscriptionUpsaleLegalInfo$12.label = 1;
                    obj = ru.yandex.taxi.widget.c.e(cVar, formattedText, null, false, scootersSubscriptionMapper$mapSubscriptionUpsaleLegalInfo$12, 30);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    scootersSubscriptionLegalInfoDto = (ScootersSubscriptionLegalInfoDto) scootersSubscriptionMapper$mapSubscriptionUpsaleLegalInfo$12.L$0;
                    kotlin.b.b(obj);
                }
                return new zzo0((CharSequence) obj, scootersSubscriptionLegalInfoDto.b);
            }
        }
        scootersSubscriptionMapper$mapSubscriptionUpsaleLegalInfo$1 = new ScootersSubscriptionMapper$mapSubscriptionUpsaleLegalInfo$1(eVar, continuationImpl);
        ScootersSubscriptionMapper$mapSubscriptionUpsaleLegalInfo$1 scootersSubscriptionMapper$mapSubscriptionUpsaleLegalInfo$122 = scootersSubscriptionMapper$mapSubscriptionUpsaleLegalInfo$1;
        Object obj2 = scootersSubscriptionMapper$mapSubscriptionUpsaleLegalInfo$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSubscriptionMapper$mapSubscriptionUpsaleLegalInfo$122.label;
        if (i != 0) {
        }
        return new zzo0((CharSequence) obj2, scootersSubscriptionLegalInfoDto.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(e eVar, ScootersSubscriptionUpsaleWindowDto scootersSubscriptionUpsaleWindowDto, fef fefVar, ContinuationImpl continuationImpl) {
        ScootersSubscriptionMapper$mapSubscriptionUpsaleWindow$1 scootersSubscriptionMapper$mapSubscriptionUpsaleWindow$1;
        ScootersSubscriptionMapper$mapSubscriptionUpsaleWindow$1 scootersSubscriptionMapper$mapSubscriptionUpsaleWindow$12;
        Object obj;
        int i;
        ScootersSubscriptionUpsaleButtonDto scootersSubscriptionUpsaleButtonDto;
        ScootersSubscriptionUpsaleWindowDto scootersSubscriptionUpsaleWindowDto2;
        fef fefVar2;
        yzo0 yzo0Var;
        ScootersSubscriptionUpsaleButtonDto scootersSubscriptionUpsaleButtonDto2;
        Object i2;
        fef fefVar3;
        ScootersSubscriptionUpsaleWindowDto scootersSubscriptionUpsaleWindowDto3;
        yzo0 yzo0Var2;
        eVar.getClass();
        if (continuationImpl instanceof ScootersSubscriptionMapper$mapSubscriptionUpsaleWindow$1) {
            scootersSubscriptionMapper$mapSubscriptionUpsaleWindow$1 = (ScootersSubscriptionMapper$mapSubscriptionUpsaleWindow$1) continuationImpl;
            int i3 = scootersSubscriptionMapper$mapSubscriptionUpsaleWindow$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                scootersSubscriptionMapper$mapSubscriptionUpsaleWindow$1.label = i3 - Integer.MIN_VALUE;
                scootersSubscriptionMapper$mapSubscriptionUpsaleWindow$12 = scootersSubscriptionMapper$mapSubscriptionUpsaleWindow$1;
                Object obj2 = scootersSubscriptionMapper$mapSubscriptionUpsaleWindow$12.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersSubscriptionMapper$mapSubscriptionUpsaleWindow$12.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (!scootersSubscriptionUpsaleWindowDto.a.a.isEmpty() && !scootersSubscriptionUpsaleWindowDto.c.a.isEmpty() && (scootersSubscriptionUpsaleButtonDto = scootersSubscriptionUpsaleWindowDto.f) != null) {
                        scootersSubscriptionMapper$mapSubscriptionUpsaleWindow$12.L$0 = scootersSubscriptionUpsaleWindowDto;
                        scootersSubscriptionMapper$mapSubscriptionUpsaleWindow$12.L$1 = fefVar;
                        scootersSubscriptionMapper$mapSubscriptionUpsaleWindow$12.label = 1;
                        obj2 = eVar.i(scootersSubscriptionUpsaleButtonDto, fefVar, scootersSubscriptionMapper$mapSubscriptionUpsaleWindow$12);
                        if (obj2 != obj) {
                            scootersSubscriptionUpsaleWindowDto2 = scootersSubscriptionUpsaleWindowDto;
                            fefVar2 = fefVar;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return obj2;
                    }
                    yzo0 yzo0Var3 = (yzo0) scootersSubscriptionMapper$mapSubscriptionUpsaleWindow$12.L$2;
                    fef fefVar4 = (fef) scootersSubscriptionMapper$mapSubscriptionUpsaleWindow$12.L$1;
                    ScootersSubscriptionUpsaleWindowDto scootersSubscriptionUpsaleWindowDto4 = (ScootersSubscriptionUpsaleWindowDto) scootersSubscriptionMapper$mapSubscriptionUpsaleWindow$12.L$0;
                    kotlin.b.b(obj2);
                    fefVar3 = fefVar4;
                    scootersSubscriptionUpsaleWindowDto3 = scootersSubscriptionUpsaleWindowDto4;
                    i2 = obj2;
                    yzo0Var = yzo0Var3;
                    yzo0Var2 = (yzo0) i2;
                    if (yzo0Var2 != null) {
                        ScootersSubscriptionMapper$mapSubscriptionUpsaleWindow$2 scootersSubscriptionMapper$mapSubscriptionUpsaleWindow$2 = new ScootersSubscriptionMapper$mapSubscriptionUpsaleWindow$2(scootersSubscriptionUpsaleWindowDto3, yzo0Var, yzo0Var2, eVar, fefVar3, null);
                        scootersSubscriptionMapper$mapSubscriptionUpsaleWindow$12.L$0 = null;
                        scootersSubscriptionMapper$mapSubscriptionUpsaleWindow$12.L$1 = null;
                        scootersSubscriptionMapper$mapSubscriptionUpsaleWindow$12.L$2 = null;
                        scootersSubscriptionMapper$mapSubscriptionUpsaleWindow$12.L$3 = null;
                        scootersSubscriptionMapper$mapSubscriptionUpsaleWindow$12.label = 3;
                        Object n = bvf0.n(scootersSubscriptionMapper$mapSubscriptionUpsaleWindow$2, scootersSubscriptionMapper$mapSubscriptionUpsaleWindow$12);
                        return n == obj ? obj : n;
                    }
                    return null;
                }
                fef fefVar5 = (fef) scootersSubscriptionMapper$mapSubscriptionUpsaleWindow$12.L$1;
                ScootersSubscriptionUpsaleWindowDto scootersSubscriptionUpsaleWindowDto5 = (ScootersSubscriptionUpsaleWindowDto) scootersSubscriptionMapper$mapSubscriptionUpsaleWindow$12.L$0;
                kotlin.b.b(obj2);
                fefVar2 = fefVar5;
                scootersSubscriptionUpsaleWindowDto2 = scootersSubscriptionUpsaleWindowDto5;
                yzo0Var = (yzo0) obj2;
                if (yzo0Var != null && (scootersSubscriptionUpsaleButtonDto2 = scootersSubscriptionUpsaleWindowDto2.g) != null) {
                    scootersSubscriptionMapper$mapSubscriptionUpsaleWindow$12.L$0 = scootersSubscriptionUpsaleWindowDto2;
                    scootersSubscriptionMapper$mapSubscriptionUpsaleWindow$12.L$1 = fefVar2;
                    scootersSubscriptionMapper$mapSubscriptionUpsaleWindow$12.L$2 = yzo0Var;
                    scootersSubscriptionMapper$mapSubscriptionUpsaleWindow$12.label = 2;
                    i2 = eVar.i(scootersSubscriptionUpsaleButtonDto2, fefVar2, scootersSubscriptionMapper$mapSubscriptionUpsaleWindow$12);
                    if (i2 != obj) {
                        fefVar3 = fefVar2;
                        scootersSubscriptionUpsaleWindowDto3 = scootersSubscriptionUpsaleWindowDto2;
                        yzo0Var2 = (yzo0) i2;
                        if (yzo0Var2 != null) {
                        }
                    }
                }
                return null;
            }
        }
        scootersSubscriptionMapper$mapSubscriptionUpsaleWindow$1 = new ScootersSubscriptionMapper$mapSubscriptionUpsaleWindow$1(eVar, continuationImpl);
        scootersSubscriptionMapper$mapSubscriptionUpsaleWindow$12 = scootersSubscriptionMapper$mapSubscriptionUpsaleWindow$1;
        Object obj22 = scootersSubscriptionMapper$mapSubscriptionUpsaleWindow$12.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSubscriptionMapper$mapSubscriptionUpsaleWindow$12.label;
        if (i != 0) {
        }
        yzo0Var = (yzo0) obj22;
        if (yzo0Var != null) {
            scootersSubscriptionMapper$mapSubscriptionUpsaleWindow$12.L$0 = scootersSubscriptionUpsaleWindowDto2;
            scootersSubscriptionMapper$mapSubscriptionUpsaleWindow$12.L$1 = fefVar2;
            scootersSubscriptionMapper$mapSubscriptionUpsaleWindow$12.L$2 = yzo0Var;
            scootersSubscriptionMapper$mapSubscriptionUpsaleWindow$12.label = 2;
            i2 = eVar.i(scootersSubscriptionUpsaleButtonDto2, fefVar2, scootersSubscriptionMapper$mapSubscriptionUpsaleWindow$12);
            if (i2 != obj) {
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
    
        if (r14 == r0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(SubscriptionPromoblock.Toggle.Button button, fef fefVar, ContinuationImpl continuationImpl) {
        ScootersSubscriptionMapper$mapEnabledBookingButton$1 scootersSubscriptionMapper$mapEnabledBookingButton$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object e;
        CharSequence charSequence;
        if (continuationImpl instanceof ScootersSubscriptionMapper$mapEnabledBookingButton$1) {
            scootersSubscriptionMapper$mapEnabledBookingButton$1 = (ScootersSubscriptionMapper$mapEnabledBookingButton$1) continuationImpl;
            int i2 = scootersSubscriptionMapper$mapEnabledBookingButton$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersSubscriptionMapper$mapEnabledBookingButton$1.label = i2 - Integer.MIN_VALUE;
                ScootersSubscriptionMapper$mapEnabledBookingButton$1 scootersSubscriptionMapper$mapEnabledBookingButton$12 = scootersSubscriptionMapper$mapEnabledBookingButton$1;
                Object obj = scootersSubscriptionMapper$mapEnabledBookingButton$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersSubscriptionMapper$mapEnabledBookingButton$12.label;
                xdf xdfVar = this.c;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (button.a.a.isEmpty()) {
                        return null;
                    }
                    FormattedText c = f9s.c(xdfVar, fefVar, button.a);
                    scootersSubscriptionMapper$mapEnabledBookingButton$12.L$0 = button;
                    scootersSubscriptionMapper$mapEnabledBookingButton$12.L$1 = fefVar;
                    scootersSubscriptionMapper$mapEnabledBookingButton$12.label = 1;
                    obj = ru.yandex.taxi.widget.c.e(this.e, c, null, false, scootersSubscriptionMapper$mapEnabledBookingButton$12, 30);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        charSequence = (CharSequence) scootersSubscriptionMapper$mapEnabledBookingButton$12.L$2;
                        kotlin.b.b(obj);
                        return new dxo0(charSequence, (CharSequence) obj);
                    }
                    fefVar = (fef) scootersSubscriptionMapper$mapEnabledBookingButton$12.L$1;
                    button = (SubscriptionPromoblock.Toggle.Button) scootersSubscriptionMapper$mapEnabledBookingButton$12.L$0;
                    kotlin.b.b(obj);
                }
                CharSequence charSequence2 = (CharSequence) obj;
                FormattedText c2 = f9s.c(xdfVar, fefVar, button.b);
                scootersSubscriptionMapper$mapEnabledBookingButton$12.L$0 = null;
                scootersSubscriptionMapper$mapEnabledBookingButton$12.L$1 = null;
                scootersSubscriptionMapper$mapEnabledBookingButton$12.L$2 = charSequence2;
                scootersSubscriptionMapper$mapEnabledBookingButton$12.label = 2;
                e = ru.yandex.taxi.widget.c.e(this.e, c2, null, false, scootersSubscriptionMapper$mapEnabledBookingButton$12, 30);
                if (e != coroutineSingletons) {
                    obj = e;
                    charSequence = charSequence2;
                    return new dxo0(charSequence, (CharSequence) obj);
                }
                return coroutineSingletons;
            }
        }
        scootersSubscriptionMapper$mapEnabledBookingButton$1 = new ScootersSubscriptionMapper$mapEnabledBookingButton$1(this, continuationImpl);
        ScootersSubscriptionMapper$mapEnabledBookingButton$1 scootersSubscriptionMapper$mapEnabledBookingButton$122 = scootersSubscriptionMapper$mapEnabledBookingButton$1;
        Object obj2 = scootersSubscriptionMapper$mapEnabledBookingButton$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSubscriptionMapper$mapEnabledBookingButton$122.label;
        xdf xdfVar2 = this.c;
        if (i != 0) {
        }
        CharSequence charSequence22 = (CharSequence) obj2;
        FormattedText c22 = f9s.c(xdfVar2, fefVar, button.b);
        scootersSubscriptionMapper$mapEnabledBookingButton$122.L$0 = null;
        scootersSubscriptionMapper$mapEnabledBookingButton$122.L$1 = null;
        scootersSubscriptionMapper$mapEnabledBookingButton$122.L$2 = charSequence22;
        scootersSubscriptionMapper$mapEnabledBookingButton$122.label = 2;
        e = ru.yandex.taxi.widget.c.e(this.e, c22, null, false, scootersSubscriptionMapper$mapEnabledBookingButton$122, 30);
        if (e != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(SubscriptionPromoblock.Toggle.LegalInfo legalInfo, fef fefVar, ContinuationImpl continuationImpl) {
        ScootersSubscriptionMapper$mapEnabledLegalInfo$1 scootersSubscriptionMapper$mapEnabledLegalInfo$1;
        int i;
        if (continuationImpl instanceof ScootersSubscriptionMapper$mapEnabledLegalInfo$1) {
            scootersSubscriptionMapper$mapEnabledLegalInfo$1 = (ScootersSubscriptionMapper$mapEnabledLegalInfo$1) continuationImpl;
            int i2 = scootersSubscriptionMapper$mapEnabledLegalInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersSubscriptionMapper$mapEnabledLegalInfo$1.label = i2 - Integer.MIN_VALUE;
                ScootersSubscriptionMapper$mapEnabledLegalInfo$1 scootersSubscriptionMapper$mapEnabledLegalInfo$12 = scootersSubscriptionMapper$mapEnabledLegalInfo$1;
                Object obj = scootersSubscriptionMapper$mapEnabledLegalInfo$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersSubscriptionMapper$mapEnabledLegalInfo$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (legalInfo.a.a.isEmpty() || legalInfo.b.length() == 0) {
                        return null;
                    }
                    FormattedText c = f9s.c(this.c, fefVar, legalInfo.a);
                    scootersSubscriptionMapper$mapEnabledLegalInfo$12.L$0 = legalInfo;
                    scootersSubscriptionMapper$mapEnabledLegalInfo$12.L$1 = null;
                    scootersSubscriptionMapper$mapEnabledLegalInfo$12.label = 1;
                    obj = ru.yandex.taxi.widget.c.e(this.e, c, null, false, scootersSubscriptionMapper$mapEnabledLegalInfo$12, 30);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    legalInfo = (SubscriptionPromoblock.Toggle.LegalInfo) scootersSubscriptionMapper$mapEnabledLegalInfo$12.L$0;
                    kotlin.b.b(obj);
                }
                return new exo0((CharSequence) obj, legalInfo.b);
            }
        }
        scootersSubscriptionMapper$mapEnabledLegalInfo$1 = new ScootersSubscriptionMapper$mapEnabledLegalInfo$1(this, continuationImpl);
        ScootersSubscriptionMapper$mapEnabledLegalInfo$1 scootersSubscriptionMapper$mapEnabledLegalInfo$122 = scootersSubscriptionMapper$mapEnabledLegalInfo$1;
        Object obj2 = scootersSubscriptionMapper$mapEnabledLegalInfo$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSubscriptionMapper$mapEnabledLegalInfo$122.label;
        if (i != 0) {
        }
        return new exo0((CharSequence) obj2, legalInfo.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
    
        if (r14 == r0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(ScootersSubscriptionUpsaleButtonDto scootersSubscriptionUpsaleButtonDto, fef fefVar, ContinuationImpl continuationImpl) {
        ScootersSubscriptionMapper$mapSubscriptionUpsaleButton$1 scootersSubscriptionMapper$mapSubscriptionUpsaleButton$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object e;
        CharSequence charSequence;
        if (continuationImpl instanceof ScootersSubscriptionMapper$mapSubscriptionUpsaleButton$1) {
            scootersSubscriptionMapper$mapSubscriptionUpsaleButton$1 = (ScootersSubscriptionMapper$mapSubscriptionUpsaleButton$1) continuationImpl;
            int i2 = scootersSubscriptionMapper$mapSubscriptionUpsaleButton$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersSubscriptionMapper$mapSubscriptionUpsaleButton$1.label = i2 - Integer.MIN_VALUE;
                ScootersSubscriptionMapper$mapSubscriptionUpsaleButton$1 scootersSubscriptionMapper$mapSubscriptionUpsaleButton$12 = scootersSubscriptionMapper$mapSubscriptionUpsaleButton$1;
                Object obj = scootersSubscriptionMapper$mapSubscriptionUpsaleButton$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersSubscriptionMapper$mapSubscriptionUpsaleButton$12.label;
                xdf xdfVar = this.c;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (scootersSubscriptionUpsaleButtonDto.a.a.isEmpty()) {
                        return null;
                    }
                    FormattedText c = f9s.c(xdfVar, fefVar, scootersSubscriptionUpsaleButtonDto.a);
                    scootersSubscriptionMapper$mapSubscriptionUpsaleButton$12.L$0 = scootersSubscriptionUpsaleButtonDto;
                    scootersSubscriptionMapper$mapSubscriptionUpsaleButton$12.L$1 = fefVar;
                    scootersSubscriptionMapper$mapSubscriptionUpsaleButton$12.label = 1;
                    obj = ru.yandex.taxi.widget.c.e(this.e, c, null, false, scootersSubscriptionMapper$mapSubscriptionUpsaleButton$12, 30);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        charSequence = (CharSequence) scootersSubscriptionMapper$mapSubscriptionUpsaleButton$12.L$2;
                        kotlin.b.b(obj);
                        return new yzo0(charSequence, (CharSequence) obj);
                    }
                    fefVar = (fef) scootersSubscriptionMapper$mapSubscriptionUpsaleButton$12.L$1;
                    scootersSubscriptionUpsaleButtonDto = (ScootersSubscriptionUpsaleButtonDto) scootersSubscriptionMapper$mapSubscriptionUpsaleButton$12.L$0;
                    kotlin.b.b(obj);
                }
                CharSequence charSequence2 = (CharSequence) obj;
                FormattedText c2 = f9s.c(xdfVar, fefVar, scootersSubscriptionUpsaleButtonDto.b);
                scootersSubscriptionMapper$mapSubscriptionUpsaleButton$12.L$0 = null;
                scootersSubscriptionMapper$mapSubscriptionUpsaleButton$12.L$1 = null;
                scootersSubscriptionMapper$mapSubscriptionUpsaleButton$12.L$2 = charSequence2;
                scootersSubscriptionMapper$mapSubscriptionUpsaleButton$12.label = 2;
                e = ru.yandex.taxi.widget.c.e(this.e, c2, null, false, scootersSubscriptionMapper$mapSubscriptionUpsaleButton$12, 30);
                if (e != coroutineSingletons) {
                    obj = e;
                    charSequence = charSequence2;
                    return new yzo0(charSequence, (CharSequence) obj);
                }
                return coroutineSingletons;
            }
        }
        scootersSubscriptionMapper$mapSubscriptionUpsaleButton$1 = new ScootersSubscriptionMapper$mapSubscriptionUpsaleButton$1(this, continuationImpl);
        ScootersSubscriptionMapper$mapSubscriptionUpsaleButton$1 scootersSubscriptionMapper$mapSubscriptionUpsaleButton$122 = scootersSubscriptionMapper$mapSubscriptionUpsaleButton$1;
        Object obj2 = scootersSubscriptionMapper$mapSubscriptionUpsaleButton$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSubscriptionMapper$mapSubscriptionUpsaleButton$122.label;
        xdf xdfVar2 = this.c;
        if (i != 0) {
        }
        CharSequence charSequence22 = (CharSequence) obj2;
        FormattedText c22 = f9s.c(xdfVar2, fefVar, scootersSubscriptionUpsaleButtonDto.b);
        scootersSubscriptionMapper$mapSubscriptionUpsaleButton$122.L$0 = null;
        scootersSubscriptionMapper$mapSubscriptionUpsaleButton$122.L$1 = null;
        scootersSubscriptionMapper$mapSubscriptionUpsaleButton$122.L$2 = charSequence22;
        scootersSubscriptionMapper$mapSubscriptionUpsaleButton$122.label = 2;
        e = ru.yandex.taxi.widget.c.e(this.e, c22, null, false, scootersSubscriptionMapper$mapSubscriptionUpsaleButton$122, 30);
        if (e != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
