package com.yandex.go.walking.navigation.impl.navigation_core.guidance;

import com.yandex.go.walking.navigation.impl.guidance.service.e;
import com.yandex.mapkit.navigation.transport.Navigation;
import defpackage.a201;
import defpackage.ehs0;
import defpackage.j241;
import defpackage.j4u;
import defpackage.m141;
import defpackage.mvg;
import defpackage.n541;
import defpackage.ncg;
import defpackage.nk91;
import defpackage.ny61;
import defpackage.tse;
import defpackage.v341;
import defpackage.wls;
import defpackage.x241;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.navigation.single_guidance_coordinator.GuidanceOwnerId;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.walking.navigation.impl.navigation_core.guidance.WalkNavGuidanceSessionInteractor$restoreSavedSession$1", f = "WalkNavGuidanceSessionInteractor.kt", l = {66, HProv.ALG_SID_GR3410_12_256, HProv.ALG_SID_SHA3_384, 82, HProv.ALG_SID_KECCAK_224}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class WalkNavGuidanceSessionInteractor$restoreSavedSession$1 extends SuspendLambda implements wls {
    final /* synthetic */ m141 $component;
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalkNavGuidanceSessionInteractor$restoreSavedSession$1(m141 m141Var, b bVar, Continuation continuation) {
        super(2, continuation);
        this.$component = m141Var;
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WalkNavGuidanceSessionInteractor$restoreSavedSession$1(this.$component, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WalkNavGuidanceSessionInteractor$restoreSavedSession$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x015e, code lost:
    
        if (r4.b(r12) != r0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009b, code lost:
    
        if (r1.b(r12) == r0) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x014c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        c cVar;
        boolean z;
        c cVar2;
        Navigation navigation;
        GuidanceOwnerId guidanceOwnerId;
        j4u j4uVar;
        Navigation navigation2;
        n541 n541Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar3 = (c) ((ncg) this.$component).b.get();
            this.L$0 = cVar3;
            this.label = 1;
            Object e = cVar3.e(this);
            if (e != coroutineSingletons) {
                cVar = cVar3;
                obj = e;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                kotlin.b.b(obj);
                this.this$0.a();
                return zy11Var;
            }
            if (i != 3) {
                if (i == 4) {
                    kotlin.b.b(obj);
                    ((a) ((ncg) this.$component).p.get()).a();
                    this.this$0.a();
                    return zy11Var;
                }
                if (i != 5) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                navigation2 = (Navigation) this.L$1;
                kotlin.b.b(obj);
                n541Var = (n541) obj;
                if (n541Var != null) {
                    this.this$0.d();
                    return zy11Var;
                }
                navigation2.resume();
                ((v341) ((ncg) this.$component).t.get()).a();
                ((j241) ((ncg) this.$component).i.get()).b(n541Var);
                ((e) ((ncg) this.$component).s.get()).b();
                ((x241) ((ncg) this.$component).n.get()).a(true);
                this.this$0.c.getClass();
                return zy11Var;
            }
            z = this.Z$0;
            cVar2 = (c) this.L$0;
            kotlin.b.b(obj);
            navigation = (Navigation) obj;
            if (navigation == null && nk91.a(navigation)) {
                this.L$0 = null;
                this.L$1 = navigation;
                this.Z$0 = z;
                this.label = 5;
                Object d = cVar2.d(this);
                if (d != coroutineSingletons) {
                    navigation2 = navigation;
                    obj = d;
                    n541Var = (n541) obj;
                    if (n541Var != null) {
                    }
                }
            } else {
                ehs0 ehs0Var = this.this$0.b;
                guidanceOwnerId = GuidanceOwnerId.WALKING_NAVIGATION;
                j4uVar = ehs0Var.a;
                if (guidanceOwnerId == (j4uVar == null ? j4uVar.getId() : null)) {
                    ehs0Var.a = null;
                }
                this.L$0 = null;
                this.L$1 = null;
                this.Z$0 = z;
                this.label = 4;
            }
            return coroutineSingletons;
        }
        cVar = (c) this.L$0;
        kotlin.b.b(obj);
        if (!((Boolean) obj).booleanValue()) {
            this.this$0.a();
            return zy11Var;
        }
        boolean b = ((a) ((ncg) this.$component).p.get()).b();
        if (b) {
            this.L$0 = null;
            this.Z$0 = b;
            this.label = 2;
        } else {
            b bVar = this.this$0;
            bVar.b.a(new a201(bVar));
            com.yandex.go.walking.navigation.impl.navigation_core.b bVar2 = (com.yandex.go.walking.navigation.impl.navigation_core.b) ((ncg) this.$component).e.get();
            this.L$0 = cVar;
            this.Z$0 = b;
            this.label = 3;
            Object b2 = bVar2.b(this);
            if (b2 != coroutineSingletons) {
                c cVar4 = cVar;
                z = b;
                obj = b2;
                cVar2 = cVar4;
                navigation = (Navigation) obj;
                if (navigation == null) {
                }
                ehs0 ehs0Var2 = this.this$0.b;
                guidanceOwnerId = GuidanceOwnerId.WALKING_NAVIGATION;
                j4uVar = ehs0Var2.a;
                if (guidanceOwnerId == (j4uVar == null ? j4uVar.getId() : null)) {
                }
                this.L$0 = null;
                this.L$1 = null;
                this.Z$0 = z;
                this.label = 4;
            }
        }
        return coroutineSingletons;
    }
}
