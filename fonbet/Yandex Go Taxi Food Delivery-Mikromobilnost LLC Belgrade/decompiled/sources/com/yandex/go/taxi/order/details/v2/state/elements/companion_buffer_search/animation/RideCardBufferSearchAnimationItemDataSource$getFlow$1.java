package com.yandex.go.taxi.order.details.v2.state.elements.companion_buffer_search.animation;

import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$CompanionBufferSearch;
import defpackage.evu0;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.nsz;
import defpackage.ny61;
import defpackage.ock0;
import defpackage.tse;
import defpackage.vpr;
import defpackage.wls;
import defpackage.xuc;
import defpackage.ytz;
import defpackage.zy11;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lock0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.companion_buffer_search.animation.RideCardBufferSearchAnimationItemDataSource$getFlow$1", f = "RideCardBufferSearchAnimationItemDataSource.kt", l = {28, 37}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardBufferSearchAnimationItemDataSource$getFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ int $cursorIndex;
    final /* synthetic */ boolean $isCompanionFound;
    final /* synthetic */ String $selectedStateId;
    final /* synthetic */ List<RideCardItemDto$CompanionBufferSearch.CompanionSearchState> $states;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.companion_buffer_search.animation.RideCardBufferSearchAnimationItemDataSource$getFlow$1$1", f = "RideCardBufferSearchAnimationItemDataSource.kt", l = {48, 49, 61, 64}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.order.details.v2.state.elements.companion_buffer_search.animation.RideCardBufferSearchAnimationItemDataSource$getFlow$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ vpr $$this$flow;
        final /* synthetic */ int $cursorIndex;
        final /* synthetic */ boolean $isCompanionFound;
        final /* synthetic */ String $selectedStateId;
        final /* synthetic */ List<RideCardItemDto$CompanionBufferSearch.CompanionSearchState> $states;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        boolean Z$0;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List list, a aVar, String str, vpr vprVar, boolean z, int i, Continuation continuation) {
            super(2, continuation);
            this.$states = list;
            this.this$0 = aVar;
            this.$selectedStateId = str;
            this.$$this$flow = vprVar;
            this.$isCompanionFound = z;
            this.$cursorIndex = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$states, this.this$0, this.$selectedStateId, this.$$this$flow, this.$isCompanionFound, this.$cursorIndex, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:52:0x0234, code lost:
        
            r4 = 4;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x010b  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0178  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x01b4  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x01ef  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0244  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x01b9 -> B:11:0x023d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0227 -> B:8:0x022e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0129 -> B:11:0x023d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            a aVar;
            String str;
            vpr vprVar;
            boolean z;
            int i;
            Iterator it;
            String str2;
            vpr vprVar2;
            int i2;
            String str3;
            String str4;
            boolean z2;
            Object obj2;
            char c;
            nsz nszVar;
            char c2;
            a aVar2;
            String str5;
            Iterator it2;
            boolean z3;
            int i3;
            a aVar3;
            String str6;
            int i4;
            String str7;
            boolean z4;
            vpr vprVar3;
            Object obj3;
            nsz nszVar2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.label;
            char c3 = 4;
            char c4 = 3;
            if (i5 == 0) {
                b.b(obj);
                List<RideCardItemDto$CompanionBufferSearch.CompanionSearchState> list = this.$states;
                aVar = this.this$0;
                str = this.$selectedStateId;
                vprVar = this.$$this$flow;
                z = this.$isCompanionFound;
                i = this.$cursorIndex;
                it = list.iterator();
                if (!it.hasNext()) {
                }
            } else if (i5 == 1) {
                int i6 = this.I$0;
                boolean z5 = this.Z$0;
                String str8 = (String) this.L$9;
                Iterator it3 = (Iterator) this.L$4;
                vpr vprVar4 = (vpr) this.L$3;
                String str9 = (String) this.L$2;
                a aVar4 = (a) this.L$1;
                b.b(obj);
                obj3 = obj;
                vprVar3 = vprVar4;
                str6 = str9;
                aVar3 = aVar4;
                i4 = i6;
                str7 = str8;
                it = it3;
                z4 = z5;
                nszVar2 = (nsz) obj3;
                if (nszVar2 == null) {
                }
            } else if (i5 == 2) {
                i3 = this.I$0;
                z3 = this.Z$0;
                it2 = (Iterator) this.L$4;
                vprVar = (vpr) this.L$3;
                str5 = (String) this.L$2;
                aVar2 = (a) this.L$1;
                b.b(obj);
                a aVar5 = aVar2;
                i = i3;
                it = it2;
                str = str5;
                z = z3;
                aVar = aVar5;
                c = 3;
                c2 = 4;
                char c5 = c2;
                c4 = c;
                c3 = c5;
                if (!it.hasNext()) {
                }
            } else if (i5 == 3) {
                int i7 = this.I$0;
                boolean z6 = this.Z$0;
                String str10 = (String) this.L$9;
                str4 = (String) this.L$7;
                Iterator it4 = (Iterator) this.L$4;
                vpr vprVar5 = (vpr) this.L$3;
                String str11 = (String) this.L$2;
                a aVar6 = (a) this.L$1;
                b.b(obj);
                z2 = z6;
                aVar = aVar6;
                vprVar2 = vprVar5;
                str3 = str10;
                c = 3;
                str2 = str11;
                obj2 = obj;
                i2 = i7;
                it = it4;
                nszVar = (nsz) obj2;
                if (nszVar != null) {
                }
                c2 = 4;
                z = z2;
                i = i2;
                vprVar = vprVar2;
                str = str2;
                char c52 = c2;
                c4 = c;
                c3 = c52;
                if (!it.hasNext()) {
                }
            } else {
                if (i5 != 4) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i8 = this.I$0;
                boolean z7 = this.Z$0;
                Iterator it5 = (Iterator) this.L$4;
                vpr vprVar6 = (vpr) this.L$3;
                String str12 = (String) this.L$2;
                a aVar7 = (a) this.L$1;
                b.b(obj);
                c2 = 4;
                c = 3;
                i2 = i8;
                it = it5;
                vprVar2 = vprVar6;
                str2 = str12;
                z2 = z7;
                aVar = aVar7;
                z = z2;
                i = i2;
                vprVar = vprVar2;
                str = str2;
                char c522 = c2;
                c4 = c;
                c3 = c522;
                if (!it.hasNext()) {
                    RideCardItemDto$CompanionBufferSearch.CompanionSearchState companionSearchState = (RideCardItemDto$CompanionBufferSearch.CompanionSearchState) it.next();
                    String str13 = companionSearchState.a;
                    xuc xucVar = companionSearchState.b;
                    String str14 = xucVar != null ? xucVar.a : null;
                    String str15 = xucVar != null ? xucVar.b : null;
                    if (str15 != null && !evu0.J(str15) && !evu0.J(str13)) {
                        LinkedHashSet linkedHashSet = aVar.b;
                        ytz ytzVar = aVar.a;
                        if (kotlin.collections.a.G(linkedHashSet, str)) {
                            if (jl40.l(str, str13)) {
                                this.L$0 = null;
                                this.L$1 = aVar;
                                this.L$2 = str;
                                this.L$3 = vprVar;
                                this.L$4 = it;
                                this.L$5 = null;
                                this.L$6 = null;
                                this.L$7 = null;
                                this.L$8 = null;
                                this.L$9 = str14;
                                this.L$10 = null;
                                this.Z$0 = z;
                                this.I$0 = i;
                                this.label = 1;
                                obj3 = ((com.yandex.go.lottie_loader.a) ytzVar).a(str15, this);
                                if (obj3 != coroutineSingletons) {
                                    str6 = str;
                                    vprVar3 = vprVar;
                                    z4 = z;
                                    i4 = i;
                                    str7 = str14;
                                    aVar3 = aVar;
                                    nszVar2 = (nsz) obj3;
                                    if (nszVar2 == null) {
                                        this.L$0 = null;
                                        this.L$1 = aVar3;
                                        this.L$2 = str6;
                                        this.L$3 = vprVar3;
                                        this.L$4 = it;
                                        this.L$5 = null;
                                        this.L$6 = null;
                                        this.L$7 = null;
                                        this.L$8 = null;
                                        this.L$9 = null;
                                        this.L$10 = null;
                                        this.Z$0 = z4;
                                        this.I$0 = i4;
                                        this.label = 2;
                                        aVar3.getClass();
                                        if (vprVar3.emit(new ock0(z4, false, nszVar2, str7, i4), this) != coroutineSingletons) {
                                            vprVar = vprVar3;
                                            z3 = z4;
                                            str5 = str6;
                                            aVar2 = aVar3;
                                            it2 = it;
                                            i3 = i4;
                                            a aVar52 = aVar2;
                                            i = i3;
                                            it = it2;
                                            str = str5;
                                            z = z3;
                                            aVar = aVar52;
                                        }
                                    } else {
                                        vprVar = vprVar3;
                                        z = z4;
                                        i = i4;
                                        str = str6;
                                        aVar = aVar3;
                                    }
                                }
                            }
                            c = 3;
                            c2 = 4;
                            char c5222 = c2;
                            c4 = c;
                            c3 = c5222;
                            if (!it.hasNext()) {
                            }
                        } else {
                            this.L$0 = null;
                            this.L$1 = aVar;
                            this.L$2 = str;
                            this.L$3 = vprVar;
                            this.L$4 = it;
                            this.L$5 = null;
                            this.L$6 = null;
                            this.L$7 = str13;
                            this.L$8 = null;
                            this.L$9 = str14;
                            this.L$10 = null;
                            this.Z$0 = z;
                            this.I$0 = i;
                            c = 3;
                            this.label = 3;
                            obj2 = ((com.yandex.go.lottie_loader.a) ytzVar).a(str15, this);
                            if (obj2 != coroutineSingletons) {
                                vprVar2 = vprVar;
                                str4 = str13;
                                i2 = i;
                                str3 = str14;
                                str2 = str;
                                z2 = z;
                                nszVar = (nsz) obj2;
                                if (nszVar != null) {
                                    aVar.b.add(str4);
                                    if (jl40.l(str2, str4)) {
                                        this.L$0 = null;
                                        this.L$1 = aVar;
                                        this.L$2 = str2;
                                        this.L$3 = vprVar2;
                                        this.L$4 = it;
                                        this.L$5 = null;
                                        this.L$6 = null;
                                        this.L$7 = null;
                                        this.L$8 = null;
                                        this.L$9 = null;
                                        this.L$10 = null;
                                        this.Z$0 = z2;
                                        this.I$0 = i2;
                                        c2 = 4;
                                        this.label = 4;
                                        a aVar8 = aVar;
                                        if (vprVar2.emit(new ock0(z2, false, nszVar, str3, i2), this) != coroutineSingletons) {
                                            z7 = z2;
                                            vprVar6 = vprVar2;
                                            str12 = str2;
                                            aVar7 = aVar8;
                                            it5 = it;
                                            i8 = i2;
                                            i2 = i8;
                                            it = it5;
                                            vprVar2 = vprVar6;
                                            str2 = str12;
                                            z2 = z7;
                                            aVar = aVar7;
                                            z = z2;
                                            i = i2;
                                            vprVar = vprVar2;
                                            str = str2;
                                            char c52222 = c2;
                                            c4 = c;
                                            c3 = c52222;
                                            if (!it.hasNext()) {
                                            }
                                        }
                                    }
                                }
                                c2 = 4;
                                z = z2;
                                i = i2;
                                vprVar = vprVar2;
                                str = str2;
                                char c522222 = c2;
                                c4 = c;
                                c3 = c522222;
                                if (!it.hasNext()) {
                                }
                            }
                        }
                        return coroutineSingletons;
                    }
                    char c6 = c4;
                    c2 = c3;
                    c = c6;
                    char c5222222 = c2;
                    c4 = c;
                    c3 = c5222222;
                    if (!it.hasNext()) {
                        return zy11.a;
                    }
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardBufferSearchAnimationItemDataSource$getFlow$1(String str, a aVar, boolean z, int i, List list, Continuation continuation) {
        super(2, continuation);
        this.$selectedStateId = str;
        this.this$0 = aVar;
        this.$isCompanionFound = z;
        this.$cursorIndex = i;
        this.$states = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RideCardBufferSearchAnimationItemDataSource$getFlow$1 rideCardBufferSearchAnimationItemDataSource$getFlow$1 = new RideCardBufferSearchAnimationItemDataSource$getFlow$1(this.$selectedStateId, this.this$0, this.$isCompanionFound, this.$cursorIndex, this.$states, continuation);
        rideCardBufferSearchAnimationItemDataSource$getFlow$1.L$0 = obj;
        return rideCardBufferSearchAnimationItemDataSource$getFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardBufferSearchAnimationItemDataSource$getFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0073, code lost:
    
        if (defpackage.bvf0.n(r2, r18) == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0075, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (r6.emit(new defpackage.ock0(r13, true, null, null, r4), r18) == r1) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            String str = this.$selectedStateId;
            if (str == null || evu0.J(str) || !this.this$0.b.contains(this.$selectedStateId)) {
                a aVar = this.this$0;
                boolean z = this.$isCompanionFound;
                int i2 = this.$cursorIndex;
                this.L$0 = vprVar;
                this.label = 1;
                aVar.getClass();
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$states, this.this$0, this.$selectedStateId, vprVar, this.$isCompanionFound, this.$cursorIndex, null);
        this.L$0 = null;
        this.label = 2;
    }
}
