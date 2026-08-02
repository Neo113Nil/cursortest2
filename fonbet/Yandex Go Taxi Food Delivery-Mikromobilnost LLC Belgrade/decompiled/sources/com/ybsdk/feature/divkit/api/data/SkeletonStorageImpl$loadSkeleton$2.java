package com.ybsdk.feature.divkit.api.data;

import com.ybsdk.core.analytics.generated.delegates.SkeletonsEvents$SkeletonsGetStatus;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.em3;
import defpackage.g3r;
import defpackage.g8e;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rr51;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.io.File;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lrr51;", "<anonymous>", "(Ltse;)Lrr51;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.divkit.api.data.SkeletonStorageImpl$loadSkeleton$2", f = "SkeletonStorageImpl.kt", l = {HProv.PP_DHOID}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SkeletonStorageImpl$loadSkeleton$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $id;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lrr51;", "<anonymous>", "()Lrr51;"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.ybsdk.feature.divkit.api.data.SkeletonStorageImpl$loadSkeleton$2$1", f = "SkeletonStorageImpl.kt", l = {106}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.feature.divkit.api.data.SkeletonStorageImpl$loadSkeleton$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements tls {
        final /* synthetic */ String $id;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, String str, Continuation continuation) {
            super(1, continuation);
            this.this$0 = aVar;
            this.$id = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$id, continuation);
        }

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            return ((AnonymousClass1) create((Continuation) obj)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                b.b(obj);
                File a = a.a(this.this$0, this.$id);
                if (!a.exists()) {
                    this.this$0.getClass();
                    a.j("Skeleton file not exist", a, null);
                    return null;
                }
                DivDataDto divDataDto = (DivDataDto) this.this$0.c.fromJson(g3r.e(a));
                if (divDataDto == null) {
                    return null;
                }
                this.label = 1;
                obj = com.ybsdk.feature.divkit.internal.a.a(divDataDto, new com.ybsdk.feature.divkit.api.domain.a(null), this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
            }
            return (rr51) obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkeletonStorageImpl$loadSkeleton$2(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$id = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SkeletonStorageImpl$loadSkeleton$2(this.this$0, this.$id, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SkeletonStorageImpl$loadSkeleton$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SkeletonStorageImpl$loadSkeleton$2 skeletonStorageImpl$loadSkeleton$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            RawSkeletonId m431boximpl = RawSkeletonId.m431boximpl(this.$id);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$id, null);
            this.label = 1;
            skeletonStorageImpl$loadSkeleton$2 = this;
            obj = a.l(aVar, "Can't get skeleton's div with id", m431boximpl, anonymousClass1, skeletonStorageImpl$loadSkeleton$2, 4);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            skeletonStorageImpl$loadSkeleton$2 = this;
        }
        a aVar2 = skeletonStorageImpl$loadSkeleton$2.this$0;
        String str = skeletonStorageImpl$loadSkeleton$2.$id;
        rr51 rr51Var = (rr51) obj;
        em3 em3Var = aVar2.b.i0;
        SkeletonsEvents$SkeletonsGetStatus skeletonsEvents$SkeletonsGetStatus = rr51Var == null ? SkeletonsEvents$SkeletonsGetStatus.ERROR : SkeletonsEvents$SkeletonsGetStatus.OK;
        LinkedHashMap w = g8e.w(2, "skeleton_id", str);
        w.put(ACSPConstants.STATUS, skeletonsEvents$SkeletonsGetStatus.getOriginalValue());
        em3Var.a.a("skeletons.get", w);
        return obj;
    }
}
