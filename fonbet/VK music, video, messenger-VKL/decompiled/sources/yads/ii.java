package yads;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.EmptySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.myc0;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* loaded from: classes10.dex */
public final class ii extends SuspendLambda implements wzs {
    public final /* synthetic */ Context b;
    public final /* synthetic */ jp2 c;
    public final /* synthetic */ yvj d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii(Context context, jp2 jp2Var, yvj yvjVar, spj spjVar) {
        super(2, spjVar);
        this.b = context;
        this.c = jp2Var;
        this.d = yvjVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        return new ii(this.b, this.c, this.d, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return ((ii) create((yvj) obj, (spj) obj2)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        kotlin.a.a(obj);
        try {
            if (ji.b != null) {
                return s3q0.a;
            }
            qu2 a = gx2.a().a(this.b);
            if (a != null && a.l0) {
                Set set = a.q0;
                if (set == null) {
                    set = EmptySet.b;
                }
                Integer num = a.m0;
                int intValue = num != null ? num.intValue() : 10;
                Integer num2 = a.n0;
                int intValue2 = num2 != null ? num2.intValue() : 91;
                Boolean bool = a.o0;
                boolean booleanValue = bool != null ? bool.booleanValue() : false;
                wf wfVar = new wf(set, intValue, intValue2, booleanValue);
                ei eiVar = new ei(this.b);
                fi fiVar = new fi(this.c, booleanValue);
                kf kfVar = new kf(vh1.a(this.b, "YadPreferenceFile"));
                AtomicBoolean atomicBoolean = ji.a;
                ji.b = new hi(wfVar, this.d, eiVar, fiVar, kfVar, this.c);
                hi hiVar = ji.b;
                if (hiVar != null && !hiVar.h.getAndSet(true)) {
                    myc0.h(hiVar.b, hiVar.f, null, new gi(hiVar, null), 2);
                }
            }
            ji.a.set(false);
            return s3q0.a;
        } finally {
            ji.a.set(false);
        }
    }
}
