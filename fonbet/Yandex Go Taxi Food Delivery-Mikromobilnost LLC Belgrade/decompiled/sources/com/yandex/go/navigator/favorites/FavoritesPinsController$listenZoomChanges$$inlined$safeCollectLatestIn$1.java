package com.yandex.go.navigator.favorites;

import android.util.Range;
import com.yandex.mapkit.map.PlacemarkMapObject;
import defpackage.a4c0;
import defpackage.f4c0;
import defpackage.iw00;
import defpackage.jl40;
import defpackage.mub0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s5r;
import defpackage.tpr;
import defpackage.tse;
import defpackage.ugp;
import defpackage.wls;
import defpackage.zip;
import defpackage.zls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.favorites.FavoritesPinsController$listenZoomChanges$$inlined$safeCollectLatestIn$1", f = "FavoritesPinsController.kt", l = {32}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class FavoritesPinsController$listenZoomChanges$$inlined$safeCollectLatestIn$1 extends SuspendLambda implements wls {
    final /* synthetic */ tpr $this_safeCollectLatestIn;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ f this$0;

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lvpr;", "", "cause", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.navigator.favorites.FavoritesPinsController$listenZoomChanges$$inlined$safeCollectLatestIn$1$1", f = "FavoritesPinsController.kt", l = {28}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.navigator.favorites.FavoritesPinsController$listenZoomChanges$$inlined$safeCollectLatestIn$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements zls {
        final /* synthetic */ wls $onError;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(wls wlsVar, Continuation continuation) {
            super(3, continuation);
            this.$onError = wlsVar;
        }

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onError, (Continuation) obj3);
            anonymousClass1.L$0 = (Throwable) obj2;
            return anonymousClass1.invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th = (Throwable) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                wls wlsVar = this.$onError;
                this.L$0 = null;
                this.label = 1;
                if (wlsVar.invoke(th, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            return zy11.a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n"}, d2 = {"T", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.navigator.favorites.FavoritesPinsController$listenZoomChanges$$inlined$safeCollectLatestIn$1$2", f = "FavoritesPinsController.kt", l = {32, 45}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.navigator.favorites.FavoritesPinsController$listenZoomChanges$$inlined$safeCollectLatestIn$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements wls {
        float F$0;
        /* synthetic */ Object L$0;
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
        final /* synthetic */ f this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(f fVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create(obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:45:0x0069, code lost:
        
            if (com.yandex.go.navigator.favorites.f.a(r13, r12) == r1) goto L33;
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x008b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0114 -> B:6:0x0116). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            float floatValue;
            Iterator s5rVar;
            Object obj2;
            Object obj3 = this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                floatValue = ((Number) obj3).floatValue();
                f fVar = this.this$0;
                this.L$0 = null;
                this.L$1 = null;
                this.F$0 = floatValue;
                this.label = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    floatValue = this.F$0;
                    f4c0 f4c0Var = (f4c0) this.L$12;
                    a4c0 a4c0Var = (a4c0) this.L$10;
                    a4c0 a4c0Var2 = (a4c0) this.L$9;
                    mub0 mub0Var = (mub0) this.L$8;
                    Map map = (Map) this.L$7;
                    ugp ugpVar = (ugp) this.L$5;
                    s5rVar = (Iterator) this.L$3;
                    kotlin.b.b(obj);
                    ((PlacemarkMapObject) f4c0Var.g).setText((String) obj);
                    a4c0Var.a.x(mub0Var.a);
                    map.put(ugpVar, a4c0Var2);
                    while (s5rVar.hasNext()) {
                        Map.Entry entry = (Map.Entry) s5rVar.next();
                        ugpVar = (ugp) entry.getKey();
                        a4c0 a4c0Var3 = (a4c0) entry.getValue();
                        this.this$0.getClass();
                        Iterator it = a4c0Var3.c.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            if (((mub0) obj2).c.contains((Range) Float.valueOf(floatValue))) {
                                break;
                            }
                        }
                        mub0Var = (mub0) obj2;
                        if (mub0Var != null) {
                            Range range = mub0Var.c;
                            if (!jl40.l(a4c0Var3.b, range)) {
                                map = this.this$0.l;
                                f4c0 f4c0Var2 = a4c0Var3.a;
                                a4c0Var2 = new a4c0(f4c0Var2, range, a4c0Var3.c);
                                String title = mub0Var.b ? ugpVar.getTitle() : "";
                                f fVar2 = this.this$0;
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = s5rVar;
                                this.L$4 = null;
                                this.L$5 = ugpVar;
                                this.L$6 = null;
                                this.L$7 = map;
                                this.L$8 = mub0Var;
                                this.L$9 = a4c0Var2;
                                this.L$10 = a4c0Var2;
                                this.L$11 = null;
                                this.L$12 = f4c0Var2;
                                this.F$0 = floatValue;
                                this.label = 2;
                                obj = fVar2.h(title, this);
                                if (obj != coroutineSingletons) {
                                    f4c0Var = f4c0Var2;
                                    a4c0Var = a4c0Var2;
                                    ((PlacemarkMapObject) f4c0Var.g).setText((String) obj);
                                    a4c0Var.a.x(mub0Var.a);
                                    map.put(ugpVar, a4c0Var2);
                                    while (s5rVar.hasNext()) {
                                    }
                                }
                                return coroutineSingletons;
                            }
                        }
                    }
                    return zy11.a;
                }
                floatValue = this.F$0;
                kotlin.b.b(obj);
            }
            s5rVar = new s5r(kotlin.sequences.b.g(iw00.w(this.this$0.l), new zip(floatValue, 0)));
            while (s5rVar.hasNext()) {
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavoritesPinsController$listenZoomChanges$$inlined$safeCollectLatestIn$1(tpr tprVar, Continuation continuation, f fVar) {
        super(2, continuation);
        this.$this_safeCollectLatestIn = tprVar;
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FavoritesPinsController$listenZoomChanges$$inlined$safeCollectLatestIn$1(this.$this_safeCollectLatestIn, continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FavoritesPinsController$listenZoomChanges$$inlined$safeCollectLatestIn$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            o oVar = new o(this.$this_safeCollectLatestIn, new AnonymousClass1(com.yandex.go.coroutines.b.e(), null));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.k(oVar, anonymousClass2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
