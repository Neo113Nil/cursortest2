package com.yandex.go.taxi.order.details.v1.elements.upsell;

import android.graphics.drawable.Drawable;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.totw.TotwUpsellResponse;
import com.yandex.go.taxi.order.models.api.totw.g;
import defpackage.b8j;
import defpackage.c8j;
import defpackage.gbk0;
import defpackage.hbk0;
import defpackage.ibk0;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.qoh;
import defpackage.qv10;
import defpackage.s9k0;
import defpackage.tje;
import defpackage.tse;
import defpackage.v7j;
import defpackage.w511;
import defpackage.wls;
import defpackage.x7j;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ld8j;", "<anonymous>", "(Ltse;)Ld8j;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v1.elements.upsell.DetailsCardUpsellStateMapper$map$2", f = "DetailsCardUpsellStateMapper.kt", l = {40, 41, 42}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class DetailsCardUpsellStateMapper$map$2 extends SuspendLambda implements wls {
    final /* synthetic */ TotwUpsellResponse $upsell;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    final /* synthetic */ x7j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsCardUpsellStateMapper$map$2(TotwUpsellResponse totwUpsellResponse, x7j x7jVar, Continuation continuation) {
        super(2, continuation);
        this.$upsell = totwUpsellResponse;
        this.this$0 = x7jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DetailsCardUpsellStateMapper$map$2 detailsCardUpsellStateMapper$map$2 = new DetailsCardUpsellStateMapper$map$2(this.$upsell, this.this$0, continuation);
        detailsCardUpsellStateMapper$map$2.L$0 = obj;
        return detailsCardUpsellStateMapper$map$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DetailsCardUpsellStateMapper$map$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0180  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        ibk0 ibk0Var;
        noh nohVar;
        String str;
        ibk0 ibk0Var2;
        CharSequence charSequence;
        ibk0 ibk0Var3;
        String str2;
        Object k;
        CharSequence charSequence2;
        String str3;
        ibk0 ibk0Var4;
        CharSequence charSequence3;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            TotwUpsellResponse totwUpsellResponse = this.$upsell;
            TotwUpsellResponse.Card card = totwUpsellResponse.b;
            if (card != null) {
                x7j x7jVar = this.this$0;
                String str4 = totwUpsellResponse.a;
                int i2 = totwUpsellResponse.c;
                boolean z = totwUpsellResponse.d;
                boolean z2 = false;
                boolean z3 = qv10.d("pref_shown_count", str4, ((v7j) x7jVar.c.b).a, 0) > i2;
                TaxiOrder b = ((o2y0) x7jVar.c.w).b();
                if (z) {
                    Set set = b.l.R;
                    if (!(set instanceof Collection) || !set.isEmpty()) {
                        Iterator it = set.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (jl40.l((String) it.next(), str4)) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                }
                if (!z3 && !z2) {
                    qoh h2 = tje.h(tseVar, null, null, new DetailsCardUpsellStateMapper$map$2$title$1(this.this$0, card, null), 3);
                    h = tje.h(tseVar, null, null, new DetailsCardUpsellStateMapper$map$2$subtitle$1(this.this$0, card, null), 3);
                    qoh h3 = tje.h(tseVar, null, null, new DetailsCardUpsellStateMapper$map$2$icon$1(this.this$0, card, null), 3);
                    TotwUpsellResponse totwUpsellResponse2 = this.$upsell;
                    com.yandex.go.taxi.order.models.api.totw.b bVar = totwUpsellResponse2.e;
                    if (bVar instanceof TotwUpsellResponse.Deeplink) {
                        ibk0Var = new gbk0(new hbk0(totwUpsellResponse2.a, totwUpsellResponse2.d), ((TotwUpsellResponse.Deeplink) bVar).a);
                    } else {
                        if (!(bVar instanceof g)) {
                            w511.b();
                            return null;
                        }
                        ibk0Var = s9k0.a;
                    }
                    String str5 = totwUpsellResponse2.a;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = h;
                    this.L$4 = h3;
                    this.L$5 = ibk0Var;
                    this.L$6 = str5;
                    this.label = 1;
                    obj = h2.s(this);
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (obj != coroutineSingletons) {
                        nohVar = h3;
                        str = str5;
                        ibk0Var2 = ibk0Var;
                    }
                    return coroutineSingletons;
                }
            }
            return c8j.a;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                CharSequence charSequence4 = (CharSequence) this.L$8;
                CharSequence charSequence5 = (CharSequence) this.L$7;
                String str6 = (String) this.L$6;
                ibk0 ibk0Var5 = (ibk0) this.L$5;
                b.b(obj);
                charSequence3 = charSequence5;
                str3 = str6;
                ibk0Var4 = ibk0Var5;
                charSequence2 = charSequence4;
                TotwUpsellResponse totwUpsellResponse3 = this.$upsell;
                return new b8j(str3, charSequence3, charSequence2, (Drawable) obj, ibk0Var4, totwUpsellResponse3.c, totwUpsellResponse3.d);
            }
            charSequence = (CharSequence) this.L$7;
            str2 = (String) this.L$6;
            ibk0Var3 = (ibk0) this.L$5;
            nohVar = (noh) this.L$4;
            b.b(obj);
            CharSequence charSequence6 = (CharSequence) obj;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = ibk0Var3;
            this.L$6 = str2;
            this.L$7 = charSequence;
            this.L$8 = charSequence6;
            this.label = 3;
            k = nohVar.k(this);
            if (k != coroutineSingletons) {
                charSequence2 = charSequence6;
                obj = k;
                str3 = str2;
                ibk0Var4 = ibk0Var3;
                charSequence3 = charSequence;
                TotwUpsellResponse totwUpsellResponse32 = this.$upsell;
                return new b8j(str3, charSequence3, charSequence2, (Drawable) obj, ibk0Var4, totwUpsellResponse32.c, totwUpsellResponse32.d);
            }
            return coroutineSingletons;
        }
        str = (String) this.L$6;
        ibk0Var2 = (ibk0) this.L$5;
        nohVar = (noh) this.L$4;
        h = (noh) this.L$3;
        b.b(obj);
        CharSequence charSequence7 = (CharSequence) obj;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = nohVar;
        this.L$5 = ibk0Var2;
        this.L$6 = str;
        this.L$7 = charSequence7;
        this.label = 2;
        Object k2 = h.k(this);
        if (k2 != coroutineSingletons) {
            String str7 = str;
            charSequence = charSequence7;
            obj = k2;
            ibk0Var3 = ibk0Var2;
            str2 = str7;
            CharSequence charSequence62 = (CharSequence) obj;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = ibk0Var3;
            this.L$6 = str2;
            this.L$7 = charSequence;
            this.L$8 = charSequence62;
            this.label = 3;
            k = nohVar.k(this);
            if (k != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
