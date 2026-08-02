package xsna;

import com.vk.log.L;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.collections.EmptyList;

/* compiled from: AudiobookChapterProgressRepositoryImpl.kt */
/* loaded from: classes3.dex */
public final class q05 implements p05 {
    public final yxa0 b;
    public final Object c = msy.a(LazyThreadSafetyMode.NONE, new com.vk.movika.sdk.base.ui.o0(4));

    public q05(yxa0 yxa0Var) {
        this.b = yxa0Var;
    }

    @Override // xsna.p05
    public final void a(ArrayList arrayList) {
        Object failure;
        try {
            this.b.q(arrayList);
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            L.i(a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.p05
    public final io.reactivex.rxjava3.core.q<Boolean> b(o05 o05Var) {
        return rsg0.T(yfb.x(((cl4) this.c.getValue()).a(Integer.valueOf(o05Var.b / 1000), o05Var.a, o05Var.c))).U(new c7(new am0(4), 5));
    }

    @Override // xsna.p05
    public final List<o05> c() {
        Object failure;
        try {
            failure = this.b.m();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            L.i(a);
            failure = EmptyList.b;
        }
        return (List) failure;
    }

    @Override // xsna.p05
    public final void d(o05 o05Var) {
        Object failure;
        try {
            this.b.s(o05Var);
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            L.i(a);
        }
    }
}
