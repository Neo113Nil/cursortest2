package com.yandex.go.scooters.data.mapper;

import android.graphics.drawable.BitmapDrawable;
import defpackage.fef;
import defpackage.h2n0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.o86;
import defpackage.qoh;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lo86;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.data.mapper.ScootersPassMapper$mapToBonusPasses$2", f = "ScootersPassMapper.kt", l = {440, 441, 442}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPassMapper$mapToBonusPasses$2 extends SuspendLambda implements wls {
    final /* synthetic */ fef $currencyRules;
    final /* synthetic */ List<h2n0.a> $passes;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPassMapper$mapToBonusPasses$2(List list, d dVar, fef fefVar, Continuation continuation) {
        super(2, continuation);
        this.$passes = list;
        this.this$0 = dVar;
        this.$currencyRules = fefVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersPassMapper$mapToBonusPasses$2 scootersPassMapper$mapToBonusPasses$2 = new ScootersPassMapper$mapToBonusPasses$2(this.$passes, this.this$0, this.$currencyRules, continuation);
        scootersPassMapper$mapToBonusPasses$2.L$0 = obj;
        return scootersPassMapper$mapToBonusPasses$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPassMapper$mapToBonusPasses$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0170, code lost:
    
        if (r8 == r2) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0185  */
    /* JADX WARN: Type inference failed for: r11v14, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0170 -> B:7:0x0173). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0176 -> B:8:0x0177). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        d dVar;
        fef fefVar;
        ArrayList arrayList;
        Iterator it;
        d dVar2;
        CharSequence charSequence;
        fef fefVar2;
        ArrayList arrayList2;
        Iterator it2;
        CharSequence charSequence2;
        noh nohVar;
        Collection collection;
        fef fefVar3;
        ArrayList arrayList3;
        Iterator it3;
        noh nohVar2;
        Object obj2;
        CharSequence charSequence3;
        Object obj3;
        ArrayList arrayList4;
        h2n0.a aVar;
        FormattedText formattedText;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            List<h2n0.a> list = this.$passes;
            dVar = this.this$0;
            fefVar = this.$currencyRules;
            arrayList = new ArrayList(tcc.n(list, 10));
            it = list.iterator();
            if (!it.hasNext()) {
            }
        } else if (i == 1) {
            collection = (Collection) this.L$10;
            nohVar = (noh) this.L$9;
            aVar = (h2n0.a) this.L$8;
            it2 = (Iterator) this.L$6;
            ?? r11 = (Collection) this.L$5;
            fefVar2 = (fef) this.L$3;
            d dVar3 = (d) this.L$2;
            kotlin.b.b(obj);
            dVar2 = dVar3;
            obj3 = obj;
            arrayList4 = r11;
            charSequence = (CharSequence) obj3;
            formattedText = aVar.b;
            if (formattedText == null) {
            }
        } else {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                collection = (Collection) this.L$12;
                CharSequence charSequence4 = (CharSequence) this.L$11;
                CharSequence charSequence5 = (CharSequence) this.L$10;
                it2 = (Iterator) this.L$6;
                ?? r112 = (Collection) this.L$5;
                fefVar2 = (fef) this.L$3;
                d dVar4 = (d) this.L$2;
                kotlin.b.b(obj);
                dVar2 = dVar4;
                charSequence = charSequence5;
                charSequence2 = charSequence4;
                Object k = obj;
                ArrayList arrayList5 = r112;
                BitmapDrawable bitmapDrawable = (BitmapDrawable) k;
                ArrayList arrayList6 = arrayList5;
                collection.add(new o86(charSequence, charSequence2, bitmapDrawable));
                it = it2;
                arrayList = arrayList6;
                fefVar = fefVar2;
                dVar = dVar2;
                if (!it.hasNext()) {
                    return arrayList;
                }
                h2n0.a aVar2 = (h2n0.a) it.next();
                String str = aVar2.c;
                qoh h = str != null ? tje.h(tseVar, null, null, new ScootersPassMapper$mapToBonusPasses$2$1$leadImage$1$1(dVar, str, null), 3) : null;
                FormattedText formattedText2 = aVar2.a;
                this.L$0 = tseVar;
                this.L$1 = null;
                this.L$2 = dVar;
                this.L$3 = fefVar;
                this.L$4 = null;
                this.L$5 = arrayList;
                this.L$6 = it;
                this.L$7 = null;
                this.L$8 = aVar2;
                this.L$9 = h;
                this.L$10 = arrayList;
                this.L$11 = null;
                this.L$12 = null;
                this.label = 1;
                obj3 = dVar.c(formattedText2, fefVar, this);
                if (obj3 != coroutineSingletons) {
                    dVar2 = dVar;
                    nohVar = h;
                    fefVar2 = fefVar;
                    aVar = aVar2;
                    ArrayList arrayList7 = arrayList;
                    it2 = it;
                    collection = arrayList7;
                    arrayList4 = arrayList7;
                    charSequence = (CharSequence) obj3;
                    formattedText = aVar.b;
                    if (formattedText == null) {
                        this.L$0 = tseVar;
                        this.L$1 = null;
                        this.L$2 = dVar2;
                        this.L$3 = fefVar2;
                        this.L$4 = null;
                        this.L$5 = arrayList4;
                        this.L$6 = it2;
                        this.L$7 = null;
                        this.L$8 = null;
                        this.L$9 = nohVar;
                        this.L$10 = charSequence;
                        this.L$11 = collection;
                        this.label = 2;
                        obj2 = dVar2.c(formattedText, fefVar2, this);
                        if (obj2 != coroutineSingletons) {
                            Iterator it4 = it2;
                            nohVar2 = nohVar;
                            charSequence3 = charSequence;
                            fefVar3 = fefVar2;
                            arrayList3 = arrayList4;
                            it3 = it4;
                            charSequence2 = (CharSequence) obj2;
                            fef fefVar4 = fefVar3;
                            charSequence = charSequence3;
                            nohVar = nohVar2;
                            it2 = it3;
                            arrayList2 = arrayList3;
                            fefVar2 = fefVar4;
                            if (nohVar != null) {
                                this.L$0 = tseVar;
                                this.L$1 = null;
                                this.L$2 = dVar2;
                                this.L$3 = fefVar2;
                                this.L$4 = null;
                                this.L$5 = arrayList2;
                                this.L$6 = it2;
                                this.L$7 = null;
                                this.L$8 = null;
                                this.L$9 = null;
                                this.L$10 = charSequence;
                                this.L$11 = charSequence2;
                                this.L$12 = collection;
                                this.label = 3;
                                k = nohVar.k(this);
                                arrayList5 = arrayList2;
                            } else {
                                bitmapDrawable = null;
                                arrayList6 = arrayList2;
                                collection.add(new o86(charSequence, charSequence2, bitmapDrawable));
                                it = it2;
                                arrayList = arrayList6;
                                fefVar = fefVar2;
                                dVar = dVar2;
                                if (!it.hasNext()) {
                                }
                            }
                        }
                    } else {
                        charSequence2 = null;
                        arrayList2 = arrayList4;
                        if (nohVar != null) {
                        }
                    }
                }
                return coroutineSingletons;
            }
            collection = (Collection) this.L$11;
            charSequence3 = (CharSequence) this.L$10;
            noh nohVar3 = (noh) this.L$9;
            Iterator it5 = (Iterator) this.L$6;
            ?? r113 = (Collection) this.L$5;
            fef fefVar5 = (fef) this.L$3;
            d dVar5 = (d) this.L$2;
            kotlin.b.b(obj);
            dVar2 = dVar5;
            fefVar3 = fefVar5;
            arrayList3 = r113;
            it3 = it5;
            nohVar2 = nohVar3;
            obj2 = obj;
            charSequence2 = (CharSequence) obj2;
            fef fefVar42 = fefVar3;
            charSequence = charSequence3;
            nohVar = nohVar2;
            it2 = it3;
            arrayList2 = arrayList3;
            fefVar2 = fefVar42;
            if (nohVar != null) {
            }
        }
    }
}
