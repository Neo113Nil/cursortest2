package xsna;

import com.vk.log.L;
import java.io.File;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ReportViewModel.kt */
@b6l(c = "com.vk.overlaymenu.feature.report.ReportViewModel$collectLogs$2", f = "ReportViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class f6g0 extends SuspendLambda implements wzs<yvj, spj<? super String>, Object> {
    int label;

    public f6g0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new f6g0(2, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super String> spjVar) {
        return ((f6g0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        L.a.getClass();
        if (!L.c) {
            l370 l370Var = x290.k;
            if (l370Var == null) {
                l370Var = null;
            }
            l370Var.I(new o2a0(6));
            return null;
        }
        z100 z100Var = L.g;
        if (z100Var == null) {
            z100Var = null;
        }
        if (!z100Var.c) {
            l370 l370Var2 = x290.k;
            if (l370Var2 == null) {
                l370Var2 = null;
            }
            l370Var2.I(new a44(29));
            return null;
        }
        String z2 = L.z();
        v7r v7rVar = L.h;
        if (v7rVar == null) {
            v7rVar = null;
        }
        File file = v7rVar.c;
        if (z2 != null && z2.length() != 0) {
            try {
                z = file.exists();
            } catch (SecurityException unused) {
                z = false;
            }
            if (z) {
                return file.getAbsolutePath();
            }
        }
        l370 l370Var3 = x290.k;
        if (l370Var3 == null) {
            l370Var3 = null;
        }
        l370Var3.I(new com.vk.movika.sdk.base.ui.k(21, z2, file));
        return null;
    }
}
