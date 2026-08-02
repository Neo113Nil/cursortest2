package com.yandex.go.safety.center;

import com.yandex.go.safety.center.api.SafetyCenterConfig;
import com.yandex.go.safety.center.api.TrustedContacts;
import defpackage.jst;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;
import ru.yandex.video.m3.ott.data.net.impl.ConcurrencyArbiterApiImpl;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.safety.center.SafetyCenterProvider$loadContacts$2", f = "SafetyCenterProvider.kt", l = {417, ConcurrencyArbiterApiImpl.RESPONSE_CODE_418, 431}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SafetyCenterProvider$loadContacts$2 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyCenterProvider$loadContacts$2(j jVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SafetyCenterProvider$loadContacts$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SafetyCenterProvider$loadContacts$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ac, code lost:
    
        if (r1.emit(r9, r8) == r0) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        j jVar;
        j jVar2;
        j jVar3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        j jVar4 = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.k(th, "Can not load trusted contacts");
            jVar4.t = true;
            ArrayList arrayList = jVar4.s;
            SafetyCenterConfig d = jVar4.d();
            TrustedContacts trustedContacts = d != null ? (TrustedContacts) d.d.getValue() : null;
            if (arrayList != null) {
                n0 n0Var = jVar4.u;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 3;
            } else if (trustedContacts != null) {
                jVar4.g(trustedContacts);
            }
        }
        if (jVar4 == 0) {
            kotlin.b.b(obj);
            j jVar5 = this.this$0;
            ru.yandex.taxi.launch.c cVar = jVar5.e;
            this.L$0 = jVar5;
            this.L$1 = jVar5;
            this.label = 1;
            if (cVar.d(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            jVar = jVar5;
            jVar2 = jVar5;
        } else {
            if (jVar4 != 1) {
                if (jVar4 == 2) {
                    j jVar6 = (j) this.L$1;
                    jVar3 = (j) this.L$0;
                    kotlin.b.b(obj);
                    jVar4 = jVar6;
                    jVar3.t = false;
                    jVar3.g((TrustedContacts) obj);
                    return zy11.a;
                }
                if (jVar4 != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            j jVar7 = (j) this.L$1;
            jVar = (j) this.L$0;
            kotlin.b.b(obj);
            jVar2 = jVar7;
        }
        jVar.j.getClass();
        sjh sjhVar = uyj.a;
        mdh mdhVar = mdh.b;
        SafetyCenterProvider$loadContacts$2$1$trustedContacts$1 safetyCenterProvider$loadContacts$2$1$trustedContacts$1 = new SafetyCenterProvider$loadContacts$2$1$trustedContacts$1(jVar, null);
        this.L$0 = jVar;
        this.L$1 = jVar2;
        this.label = 2;
        obj = tje.k0(mdhVar, safetyCenterProvider$loadContacts$2$1$trustedContacts$1, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        jVar3 = jVar;
        jVar4 = jVar2;
        jVar3.t = false;
        jVar3.g((TrustedContacts) obj);
        return zy11.a;
    }
}
