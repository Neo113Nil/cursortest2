package com.yandex.go.explorer.impl.ui.map;

import com.uber.h3core.util.LatLng;
import com.yandex.mapkit.geometry.Point;
import defpackage.ah00;
import defpackage.gh00;
import defpackage.juo;
import defpackage.loj;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.tse;
import defpackage.wls;
import defpackage.xto;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.explorer.impl.ui.map.ExplorerOverlay$fadeOutUnviewedHexes$1", f = "ExplorerOverlay.kt", l = {311, 320}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ExplorerOverlay$fadeOutUnviewedHexes$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ c this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "index", "Lzy11;", "<anonymous>", "(I)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.explorer.impl.ui.map.ExplorerOverlay$fadeOutUnviewedHexes$1$1", f = "ExplorerOverlay.kt", l = {326, 328}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.explorer.impl.ui.map.ExplorerOverlay$fadeOutUnviewedHexes$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        /* synthetic */ int I$0;
        long J$0;
        Object L$0;
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(c cVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.I$0 = ((Number) obj).intValue();
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0068 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = this.I$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            zy11 zy11Var = zy11.a;
            if (i2 != 0) {
                if (i2 != 1 && i2 != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11Var;
            }
            kotlin.b.b(obj);
            Long l = (Long) kotlin.collections.a.S(i, this.this$0.D);
            if (l != null) {
                long longValue = l.longValue();
                LatLng b = xto.c().b(longValue);
                Point point = new Point(b.a, b.b);
                c cVar = this.this$0;
                if (cVar.H) {
                    this.L$0 = null;
                    this.I$0 = i;
                    this.J$0 = longValue;
                    this.label = 1;
                    if (c.Hg(cVar, point, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    this.L$0 = null;
                    this.I$0 = i;
                    this.J$0 = longValue;
                    this.label = 2;
                    if (kotlinx.coroutines.a.i(350L, this) == coroutineSingletons) {
                    }
                }
            }
            return zy11Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExplorerOverlay$fadeOutUnviewedHexes$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ExplorerOverlay$fadeOutUnviewedHexes$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ExplorerOverlay$fadeOutUnviewedHexes$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0072, code lost:
    
        if (r5.c(r6, r7, r8, r9, r10) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if (r12 == r0) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ExplorerOverlay$fadeOutUnviewedHexes$1 explorerOverlay$fadeOutUnviewedHexes$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            pzt0 pzt0Var = this.this$0.G;
            if (pzt0Var != null) {
                this.label = 1;
                obj = pzt0Var.u0(this);
            }
            if (!this.this$0.C.isEmpty()) {
                return zy11Var;
            }
            c cVar = this.this$0;
            cVar.H = true;
            ((gh00) ((ah00) cVar.b)).e(cVar.I);
            c cVar2 = this.this$0;
            com.yandex.go.explorer.impl.ui.map.animation.a aVar = cVar2.S;
            int size = cVar2.C.size();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            c cVar3 = this.this$0;
            loj lojVar = new loj(15, cVar3);
            juo juoVar = new juo(cVar3, 2);
            this.label = 2;
            explorerOverlay$fadeOutUnviewedHexes$1 = this;
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                explorerOverlay$fadeOutUnviewedHexes$1 = this;
                c cVar4 = explorerOverlay$fadeOutUnviewedHexes$1.this$0;
                ((gh00) ((ah00) cVar4.b)).u(cVar4.I);
                c cVar5 = explorerOverlay$fadeOutUnviewedHexes$1.this$0;
                cVar5.H = false;
                cVar5.Ig();
                return zy11Var;
            }
            kotlin.b.b(obj);
        }
        if (!this.this$0.C.isEmpty()) {
        }
    }
}
