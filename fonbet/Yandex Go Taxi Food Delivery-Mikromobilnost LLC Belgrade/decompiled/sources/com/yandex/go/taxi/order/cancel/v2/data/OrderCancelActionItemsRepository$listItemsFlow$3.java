package com.yandex.go.taxi.order.cancel.v2.data;

import defpackage.bvf0;
import defpackage.fd60;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.ok70;
import defpackage.ol70;
import defpackage.sdc;
import defpackage.tcc;
import defpackage.tse;
import defpackage.vpr;
import defpackage.wls;
import defpackage.wt11;
import defpackage.yu0;
import defpackage.zls;
import defpackage.zp7;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00050\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lvpr;", "Lok70;", "Lkotlin/Pair;", "", "Lol70;", "Lru/yandex/taxi/theme/ThemeType;", "<destruct>", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Pair;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.cancel.v2.data.OrderCancelActionItemsRepository$listItemsFlow$3", f = "OrderCancelActionItemsRepository.kt", l = {42, 48}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderCancelActionItemsRepository$listItemsFlow$3 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.order.cancel.v2.data.OrderCancelActionItemsRepository$listItemsFlow$3$1", f = "OrderCancelActionItemsRepository.kt", l = {60, 65}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.order.cancel.v2.data.OrderCancelActionItemsRepository$listItemsFlow$3$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ vpr $$this$transformLatest;
        final /* synthetic */ ThemeType $currentTheme;
        final /* synthetic */ List<ol70> $withoutImage;
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
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b bVar, List list, ThemeType themeType, vpr vprVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bVar;
            this.$withoutImage = list;
            this.$currentTheme = themeType;
            this.$$this$transformLatest = vprVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$withoutImage, this.$currentTheme, this.$$this$transformLatest, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0129, code lost:
        
            if (r2.emit(r15, r14) != r1) goto L35;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0131  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x00c4  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x00ef -> B:6:0x012c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x00f5 -> B:6:0x012c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0129 -> B:6:0x012c). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            b bVar;
            vpr vprVar;
            Iterator it;
            b bVar2;
            vpr vprVar2;
            Iterator it2;
            ol70 ol70Var;
            UiStateDrawableWrapper uiStateDrawableWrapper;
            String tag;
            tse tseVar = (tse) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                this.this$0.c.entrySet().removeIf(new sdc(13, new fd60(18)));
                List<ol70> list = this.$withoutImage;
                b bVar3 = this.this$0;
                ThemeType themeType = this.$currentTheme;
                ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                for (ol70 ol70Var2 : list) {
                    LinkedHashMap linkedHashMap = bVar3.c;
                    UiStateDrawableWrapper uiStateDrawableWrapper2 = ol70Var2.a;
                    String tag2 = uiStateDrawableWrapper2 != null ? uiStateDrawableWrapper2.getTag() : null;
                    if (tag2 == null) {
                        tag2 = "";
                    }
                    arrayList.add((noh) linkedHashMap.computeIfAbsent(tag2, new yu0(12, new a(tseVar, bVar3, ol70Var2, themeType))));
                }
                bVar = this.this$0;
                vprVar = this.$$this$transformLatest;
                it = arrayList.iterator();
                if (!it.hasNext()) {
                }
            } else if (i == 1) {
                it2 = (Iterator) this.L$4;
                vprVar2 = (vpr) this.L$3;
                bVar2 = (b) this.L$2;
                kotlin.b.b(obj);
                ol70Var = (ol70) obj;
                uiStateDrawableWrapper = ol70Var.a;
                if (uiStateDrawableWrapper != null) {
                    LinkedHashMap linkedHashMap2 = bVar2.c;
                    ArrayList arrayList2 = bVar2.d;
                    linkedHashMap2.remove(tag);
                    arrayList2.replaceAll(new zp7(4, ol70Var));
                    ok70 ok70Var = new ok70(kotlin.collections.a.J0(arrayList2));
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = bVar2;
                    this.L$3 = vprVar2;
                    this.L$4 = it2;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.L$8 = null;
                    this.label = 2;
                }
                vpr vprVar3 = vprVar2;
                it = it2;
                vprVar = vprVar3;
                bVar = bVar2;
                if (!it.hasNext()) {
                }
            } else {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                it2 = (Iterator) this.L$4;
                vprVar2 = (vpr) this.L$3;
                bVar2 = (b) this.L$2;
                kotlin.b.b(obj);
                vpr vprVar32 = vprVar2;
                it = it2;
                vprVar = vprVar32;
                bVar = bVar2;
                if (!it.hasNext()) {
                    noh nohVar = (noh) it.next();
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = bVar;
                    this.L$3 = vprVar;
                    this.L$4 = it;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.L$8 = null;
                    this.label = 1;
                    Object k = nohVar.k(this);
                    if (k != coroutineSingletons) {
                        bVar2 = bVar;
                        obj = k;
                        Iterator it3 = it;
                        vprVar2 = vprVar;
                        it2 = it3;
                        ol70Var = (ol70) obj;
                        uiStateDrawableWrapper = ol70Var.a;
                        if (uiStateDrawableWrapper != null && (tag = uiStateDrawableWrapper.getTag()) != null) {
                            LinkedHashMap linkedHashMap22 = bVar2.c;
                            ArrayList arrayList22 = bVar2.d;
                            linkedHashMap22.remove(tag);
                            arrayList22.replaceAll(new zp7(4, ol70Var));
                            ok70 ok70Var2 = new ok70(kotlin.collections.a.J0(arrayList22));
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = bVar2;
                            this.L$3 = vprVar2;
                            this.L$4 = it2;
                            this.L$5 = null;
                            this.L$6 = null;
                            this.L$7 = null;
                            this.L$8 = null;
                            this.label = 2;
                        }
                        vpr vprVar322 = vprVar2;
                        it = it2;
                        vprVar = vprVar322;
                        bVar = bVar2;
                        if (!it.hasNext()) {
                            return zy11.a;
                        }
                    }
                    return coroutineSingletons;
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderCancelActionItemsRepository$listItemsFlow$3(b bVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = bVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        OrderCancelActionItemsRepository$listItemsFlow$3 orderCancelActionItemsRepository$listItemsFlow$3 = new OrderCancelActionItemsRepository$listItemsFlow$3(this.this$0, (Continuation) obj3);
        orderCancelActionItemsRepository$listItemsFlow$3.L$0 = (vpr) obj;
        orderCancelActionItemsRepository$listItemsFlow$3.L$1 = (Pair) obj2;
        return orderCancelActionItemsRepository$listItemsFlow$3.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b1, code lost:
    
        if (r5.emit(r0, r12) == r7) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ThemeType themeType;
        ArrayList arrayList;
        vpr vprVar = (vpr) this.L$0;
        Pair pair = (Pair) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            List list = (List) pair.getFirst();
            themeType = (ThemeType) pair.getSecond();
            this.this$0.d.clear();
            this.this$0.d.addAll(list);
            arrayList = new ArrayList();
            for (Object obj2 : list) {
                UiStateDrawableWrapper uiStateDrawableWrapper = ((ol70) obj2).a;
                if (uiStateDrawableWrapper != null && (uiStateDrawableWrapper.getCompareInfo() instanceof wt11) && (!uiStateDrawableWrapper.getHasDrawable() || ((wt11) uiStateDrawableWrapper.getCompareInfo()).b != themeType)) {
                    arrayList.add(obj2);
                }
            }
            ok70 ok70Var = new ok70(list);
            this.L$0 = vprVar;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = themeType;
            this.L$4 = arrayList;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11Var;
            }
            ?? r0 = (List) this.L$4;
            themeType = (ThemeType) this.L$3;
            kotlin.b.b(obj);
            arrayList = r0;
        }
        ThemeType themeType2 = themeType;
        if (!arrayList.isEmpty()) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, arrayList, themeType2, vprVar, null);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 2;
            if (bvf0.n(anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11Var;
    }
}
