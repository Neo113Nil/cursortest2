package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes9.dex */
public interface lu00 {
    Object executeRequest(vu00 vu00Var, yu00 yu00Var, ku00 ku00Var, Continuation continuation);

    default Object executeRequest(vu00 vu00Var, yu00 yu00Var, ku00 ku00Var, v5j0 v5j0Var, Continuation continuation) {
        return executeRequest(vu00Var, yu00Var, ku00Var, continuation);
    }
}
