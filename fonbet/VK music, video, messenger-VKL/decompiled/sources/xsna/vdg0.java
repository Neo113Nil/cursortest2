package xsna;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import kotlin.NoWhenBranchMatchedException;
import xsna.pdg0;

/* compiled from: Result.kt */
/* loaded from: classes2.dex */
public final class vdg0 {
    public static final <T> T a(pdg0<? extends T> pdg0Var, izs<? super Throwable, ? extends T> izsVar) {
        if (pdg0Var instanceof pdg0.a) {
            return izsVar.invoke(((pdg0.a) pdg0Var).a.b);
        }
        if (pdg0Var instanceof pdg0.b) {
            return ((pdg0.b) pdg0Var).a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final <T> T b(pdg0<? extends T> pdg0Var, izs<? super Throwable, Boolean> izsVar) {
        if (pdg0Var instanceof pdg0.b) {
            return ((pdg0.b) pdg0Var).a;
        }
        if (!(pdg0Var instanceof pdg0.a)) {
            throw new NoWhenBranchMatchedException();
        }
        pdg0.a.C3506a c3506a = ((pdg0.a) pdg0Var).a;
        String str = c3506a.a;
        Throwable th = c3506a.b;
        if (!sv1.t(th) && !x19.K(th) && !x19.F(th)) {
            if (izsVar.invoke(th).booleanValue()) {
                return null;
            }
            com.vk.metrics.eventtracking.b.a.a(new IllegalStateException(str, th));
            return null;
        }
        if (th.getCause() == null) {
            L.e(str, th);
            return null;
        }
        String message = th.getMessage();
        if (message == null) {
            message = qjg.a(th);
        }
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return null;
        }
        L.u(l, L.LogType.d, new Object[]{pzl.b(message, " - ", str)});
        return null;
    }

    public static final <T> T c(pdg0<? extends T> pdg0Var) {
        if (pdg0Var instanceof pdg0.b) {
            return ((pdg0.b) pdg0Var).a;
        }
        if (pdg0Var instanceof pdg0.a) {
            throw ((pdg0.a) pdg0Var).a.b;
        }
        throw new NoWhenBranchMatchedException();
    }
}
