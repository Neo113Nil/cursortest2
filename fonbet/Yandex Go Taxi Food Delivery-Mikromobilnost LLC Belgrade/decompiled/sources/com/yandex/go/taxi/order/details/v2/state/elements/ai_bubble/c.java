package com.yandex.go.taxi.order.details.v2.state.elements.ai_bubble;

import android.graphics.drawable.BitmapDrawable;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$AiBubble;
import defpackage.g92;
import defpackage.ibk0;
import defpackage.ijk0;
import defpackage.jgv;
import defpackage.jkk0;
import defpackage.ny61;
import defpackage.obk0;
import defpackage.pbk0;
import defpackage.pkf;
import defpackage.sqs0;
import defpackage.yjk0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes14.dex */
public final class c {
    public final jgv a;
    public final jkk0 b;
    public final e c;
    public final ru.yandex.taxi.widget.c d;
    public final sqs0 e;

    public c(jgv jgvVar, jkk0 jkk0Var, e eVar, ru.yandex.taxi.widget.c cVar, sqs0 sqs0Var) {
        this.a = jgvVar;
        this.b = jkk0Var;
        this.c = eVar;
        this.d = cVar;
        this.e = sqs0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(RideCardItemDto$AiBubble.Content content, ContinuationImpl continuationImpl) {
        RideCardAiBubbleItemDataSource$mapContent$1 rideCardAiBubbleItemDataSource$mapContent$1;
        int i;
        if (continuationImpl instanceof RideCardAiBubbleItemDataSource$mapContent$1) {
            rideCardAiBubbleItemDataSource$mapContent$1 = (RideCardAiBubbleItemDataSource$mapContent$1) continuationImpl;
            int i2 = rideCardAiBubbleItemDataSource$mapContent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardAiBubbleItemDataSource$mapContent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = rideCardAiBubbleItemDataSource$mapContent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardAiBubbleItemDataSource$mapContent$1.label;
                CharSequence charSequence = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    FormattedText formattedText = content.a;
                    if (formattedText != null) {
                        rideCardAiBubbleItemDataSource$mapContent$1.L$0 = null;
                        rideCardAiBubbleItemDataSource$mapContent$1.L$1 = null;
                        rideCardAiBubbleItemDataSource$mapContent$1.label = 1;
                        obj = ru.yandex.taxi.widget.c.i(this.d, formattedText, null, rideCardAiBubbleItemDataSource$mapContent$1, 30);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return new obk0(charSequence);
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                charSequence = (CharSequence) obj;
                return new obk0(charSequence);
            }
        }
        rideCardAiBubbleItemDataSource$mapContent$1 = new RideCardAiBubbleItemDataSource$mapContent$1(this, continuationImpl);
        Object obj2 = rideCardAiBubbleItemDataSource$mapContent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardAiBubbleItemDataSource$mapContent$1.label;
        CharSequence charSequence2 = null;
        if (i != 0) {
        }
        charSequence2 = (CharSequence) obj2;
        return new obk0(charSequence2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0081, code lost:
    
        if (r12 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(RideCardItemDto$AiBubble.Title title, ContinuationImpl continuationImpl) {
        RideCardAiBubbleItemDataSource$mapTitle$1 rideCardAiBubbleItemDataSource$mapTitle$1;
        int i;
        CharSequence charSequence;
        String a;
        BitmapDrawable bitmapDrawable;
        Object obj;
        String str;
        CharSequence charSequence2;
        if (continuationImpl instanceof RideCardAiBubbleItemDataSource$mapTitle$1) {
            rideCardAiBubbleItemDataSource$mapTitle$1 = (RideCardAiBubbleItemDataSource$mapTitle$1) continuationImpl;
            int i2 = rideCardAiBubbleItemDataSource$mapTitle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardAiBubbleItemDataSource$mapTitle$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = rideCardAiBubbleItemDataSource$mapTitle$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardAiBubbleItemDataSource$mapTitle$1.label;
                e eVar = this.c;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    FormattedText formattedText = title.b;
                    if (formattedText == null) {
                        charSequence = null;
                        a = this.a.a(title.a);
                        if (a == null) {
                            bitmapDrawable = null;
                            if (a == null) {
                            }
                            return new pbk0(pkf.g(bitmapDrawable, a, null), charSequence);
                        }
                        rideCardAiBubbleItemDataSource$mapTitle$1.L$0 = null;
                        rideCardAiBubbleItemDataSource$mapTitle$1.L$1 = charSequence;
                        rideCardAiBubbleItemDataSource$mapTitle$1.L$2 = a;
                        rideCardAiBubbleItemDataSource$mapTitle$1.L$3 = a;
                        rideCardAiBubbleItemDataSource$mapTitle$1.label = 2;
                        Object o = e.o(eVar, a, null, rideCardAiBubbleItemDataSource$mapTitle$1, 14);
                        if (o != coroutineSingletons) {
                            obj = o;
                            str = a;
                            bitmapDrawable = (BitmapDrawable) obj;
                            if (bitmapDrawable == null) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    rideCardAiBubbleItemDataSource$mapTitle$1.L$0 = title;
                    rideCardAiBubbleItemDataSource$mapTitle$1.L$1 = null;
                    rideCardAiBubbleItemDataSource$mapTitle$1.label = 1;
                    obj2 = ru.yandex.taxi.widget.c.i(this.d, formattedText, null, rideCardAiBubbleItemDataSource$mapTitle$1, 30);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            a = (String) rideCardAiBubbleItemDataSource$mapTitle$1.L$2;
                            charSequence2 = (CharSequence) rideCardAiBubbleItemDataSource$mapTitle$1.L$1;
                            kotlin.b.b(obj2);
                            bitmapDrawable = (BitmapDrawable) obj2;
                            charSequence = charSequence2;
                            if (a == null) {
                                a = "ai_bubble_image";
                            }
                            return new pbk0(pkf.g(bitmapDrawable, a, null), charSequence);
                        }
                        a = (String) rideCardAiBubbleItemDataSource$mapTitle$1.L$3;
                        str = (String) rideCardAiBubbleItemDataSource$mapTitle$1.L$2;
                        CharSequence charSequence3 = (CharSequence) rideCardAiBubbleItemDataSource$mapTitle$1.L$1;
                        kotlin.b.b(obj2);
                        obj = obj2;
                        charSequence = charSequence3;
                        bitmapDrawable = (BitmapDrawable) obj;
                        if (bitmapDrawable == null) {
                            a = str;
                            if (a == null) {
                            }
                            return new pbk0(pkf.g(bitmapDrawable, a, null), charSequence);
                        }
                        rideCardAiBubbleItemDataSource$mapTitle$1.L$0 = null;
                        rideCardAiBubbleItemDataSource$mapTitle$1.L$1 = charSequence;
                        rideCardAiBubbleItemDataSource$mapTitle$1.L$2 = str;
                        rideCardAiBubbleItemDataSource$mapTitle$1.L$3 = null;
                        rideCardAiBubbleItemDataSource$mapTitle$1.label = 3;
                        Object k = e.k(eVar, a, null, rideCardAiBubbleItemDataSource$mapTitle$1, 14);
                        if (k != coroutineSingletons) {
                            CharSequence charSequence4 = charSequence;
                            obj2 = k;
                            a = str;
                            charSequence2 = charSequence4;
                            bitmapDrawable = (BitmapDrawable) obj2;
                            charSequence = charSequence2;
                            if (a == null) {
                            }
                            return new pbk0(pkf.g(bitmapDrawable, a, null), charSequence);
                        }
                        return coroutineSingletons;
                    }
                    title = (RideCardItemDto$AiBubble.Title) rideCardAiBubbleItemDataSource$mapTitle$1.L$0;
                    kotlin.b.b(obj2);
                }
                charSequence = (CharSequence) obj2;
                a = this.a.a(title.a);
                if (a == null) {
                }
            }
        }
        rideCardAiBubbleItemDataSource$mapTitle$1 = new RideCardAiBubbleItemDataSource$mapTitle$1(this, continuationImpl);
        Object obj22 = rideCardAiBubbleItemDataSource$mapTitle$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardAiBubbleItemDataSource$mapTitle$1.label;
        e eVar2 = this.c;
        if (i != 0) {
        }
        charSequence = (CharSequence) obj22;
        a = this.a.a(title.a);
        if (a == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(RideCardItemDto$AiBubble rideCardItemDto$AiBubble, ContinuationImpl continuationImpl) {
        RideCardAiBubbleItemDataSource$stateFlow$1 rideCardAiBubbleItemDataSource$stateFlow$1;
        Object obj;
        int i;
        ibk0 ibk0Var;
        Object a;
        RideCardItemDto$AiBubble rideCardItemDto$AiBubble2;
        pbk0 pbk0Var;
        ibk0 ibk0Var2;
        if (continuationImpl instanceof RideCardAiBubbleItemDataSource$stateFlow$1) {
            rideCardAiBubbleItemDataSource$stateFlow$1 = (RideCardAiBubbleItemDataSource$stateFlow$1) continuationImpl;
            int i2 = rideCardAiBubbleItemDataSource$stateFlow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardAiBubbleItemDataSource$stateFlow$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = rideCardAiBubbleItemDataSource$stateFlow$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardAiBubbleItemDataSource$stateFlow$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (!ijk0.b(rideCardItemDto$AiBubble)) {
                        return new g92(2, new yjk0(rideCardItemDto$AiBubble.a));
                    }
                    ibk0 ibk0Var3 = (ibk0) this.e.a(rideCardItemDto$AiBubble.e);
                    RideCardItemDto$AiBubble.Title title = rideCardItemDto$AiBubble.c;
                    rideCardAiBubbleItemDataSource$stateFlow$1.L$0 = rideCardItemDto$AiBubble;
                    rideCardAiBubbleItemDataSource$stateFlow$1.L$1 = ibk0Var3;
                    rideCardAiBubbleItemDataSource$stateFlow$1.label = 1;
                    Object b = b(title, rideCardAiBubbleItemDataSource$stateFlow$1);
                    if (b != obj) {
                        ibk0Var = ibk0Var3;
                        obj2 = b;
                    }
                    return obj;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pbk0 pbk0Var2 = (pbk0) rideCardAiBubbleItemDataSource$stateFlow$1.L$2;
                    ibk0 ibk0Var4 = (ibk0) rideCardAiBubbleItemDataSource$stateFlow$1.L$1;
                    RideCardItemDto$AiBubble rideCardItemDto$AiBubble3 = (RideCardItemDto$AiBubble) rideCardAiBubbleItemDataSource$stateFlow$1.L$0;
                    kotlin.b.b(obj2);
                    pbk0Var = pbk0Var2;
                    rideCardItemDto$AiBubble2 = rideCardItemDto$AiBubble3;
                    ibk0Var2 = ibk0Var4;
                    return new b(kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.I(this.b.b, new RideCardAiBubbleItemDataSource$mapButtons$1(rideCardItemDto$AiBubble2.f, null))), rideCardItemDto$AiBubble2, pbk0Var, (obk0) obj2, ibk0Var2);
                }
                ibk0 ibk0Var5 = (ibk0) rideCardAiBubbleItemDataSource$stateFlow$1.L$1;
                RideCardItemDto$AiBubble rideCardItemDto$AiBubble4 = (RideCardItemDto$AiBubble) rideCardAiBubbleItemDataSource$stateFlow$1.L$0;
                kotlin.b.b(obj2);
                ibk0Var = ibk0Var5;
                rideCardItemDto$AiBubble = rideCardItemDto$AiBubble4;
                pbk0 pbk0Var3 = (pbk0) obj2;
                RideCardItemDto$AiBubble.Content content = rideCardItemDto$AiBubble.d;
                rideCardAiBubbleItemDataSource$stateFlow$1.L$0 = rideCardItemDto$AiBubble;
                rideCardAiBubbleItemDataSource$stateFlow$1.L$1 = ibk0Var;
                rideCardAiBubbleItemDataSource$stateFlow$1.L$2 = pbk0Var3;
                rideCardAiBubbleItemDataSource$stateFlow$1.label = 2;
                a = a(content, rideCardAiBubbleItemDataSource$stateFlow$1);
                if (a != obj) {
                    rideCardItemDto$AiBubble2 = rideCardItemDto$AiBubble;
                    pbk0Var = pbk0Var3;
                    obj2 = a;
                    ibk0Var2 = ibk0Var;
                    return new b(kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.I(this.b.b, new RideCardAiBubbleItemDataSource$mapButtons$1(rideCardItemDto$AiBubble2.f, null))), rideCardItemDto$AiBubble2, pbk0Var, (obk0) obj2, ibk0Var2);
                }
                return obj;
            }
        }
        rideCardAiBubbleItemDataSource$stateFlow$1 = new RideCardAiBubbleItemDataSource$stateFlow$1(this, continuationImpl);
        Object obj22 = rideCardAiBubbleItemDataSource$stateFlow$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardAiBubbleItemDataSource$stateFlow$1.label;
        if (i != 0) {
        }
        pbk0 pbk0Var32 = (pbk0) obj22;
        RideCardItemDto$AiBubble.Content content2 = rideCardItemDto$AiBubble.d;
        rideCardAiBubbleItemDataSource$stateFlow$1.L$0 = rideCardItemDto$AiBubble;
        rideCardAiBubbleItemDataSource$stateFlow$1.L$1 = ibk0Var;
        rideCardAiBubbleItemDataSource$stateFlow$1.L$2 = pbk0Var32;
        rideCardAiBubbleItemDataSource$stateFlow$1.label = 2;
        a = a(content2, rideCardAiBubbleItemDataSource$stateFlow$1);
        if (a != obj) {
        }
        return obj;
    }
}
