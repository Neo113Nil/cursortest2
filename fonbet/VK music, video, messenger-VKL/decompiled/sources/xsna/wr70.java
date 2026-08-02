package xsna;

import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.ds70;
import xsna.ls70;

/* compiled from: ObtainVerificationFeature.kt */
@b6l(c = "com.vk.ecomm.verifiedseller.impl.screens.obtainverification.presentation.ObtainVerificationFeature$loadData$1", f = "ObtainVerificationFeature.kt", l = {173}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class wr70 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ as70 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wr70(as70 as70Var, spj<? super wr70> spjVar) {
        super(2, spjVar);
        this.this$0 = as70Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new wr70(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((wr70) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            as70 as70Var = this.this$0;
            ks70 ks70Var = as70Var.f;
            UserId userId = as70Var.g;
            String str = as70Var.h;
            this.label = 1;
            c = ks70Var.c(userId, str, this);
            if (c == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            c = ((Result) obj).d();
        }
        as70 as70Var2 = this.this$0;
        if (!(c instanceof Result.Failure)) {
            ls70 ls70Var = (ls70) c;
            List<ls70.a> list = ls70Var.e;
            UserId userId2 = as70Var2.g;
            unr0 unr0Var = as70Var2.i;
            List<ls70.a> list2 = list;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((ls70.a) it.next()).c);
            }
            ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Boolean.valueOf(((ls70.a) it2.next()).a));
            }
            String str2 = as70Var2.h;
            if (epx.f(str2, "base")) {
                unr0Var.g(userId2.b, arrayList, arrayList2);
            } else if (epx.f(str2, "premium")) {
                unr0Var.g(userId2.b, arrayList, arrayList2);
            }
            as70Var2.T(new ds70.e(ls70Var));
        }
        as70 as70Var3 = this.this$0;
        Throwable a = Result.a(c);
        if (a != null) {
            as70Var3.T(new ds70.a(a));
        }
        return s3q0.a;
    }
}
