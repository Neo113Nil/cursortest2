package defpackage;

import com.yandex.plus.log.api.LogPriority;

/* loaded from: classes8.dex */
public interface mdd0 extends pgz {
    static void c(mdd0 mdd0Var, ht90 ht90Var, String str) {
        mdd0Var.getClass();
        ((ndd0) mdd0Var).b(LogPriority.DEBUG, qke.a(ht90Var), str, null);
    }

    static void d(mdd0 mdd0Var, ht90 ht90Var, String str) {
        mdd0Var.getClass();
        ((ndd0) mdd0Var).b(LogPriority.INFO, qke.a(ht90Var), str, null);
    }

    static /* synthetic */ void g(mdd0 mdd0Var, ht90 ht90Var, String str, Throwable th, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            th = null;
        }
        mdd0Var.f(ht90Var, str, th, null);
    }

    default void f(ht90 ht90Var, String str, Throwable th, String str2) {
        LogPriority logPriority = LogPriority.ERROR;
        String a = qke.a(ht90Var);
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        ((ndd0) this).b(logPriority, a, unr0.r(sb, str, ";requestId=", str2), th);
    }
}
