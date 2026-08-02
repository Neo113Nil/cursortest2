package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: DBUtil.android.kt */
@b6l(c = "androidx.room.util.DBUtil__DBUtil_androidKt", f = "DBUtil.android.kt", l = {249, 251, 251}, m = "performSuspending")
/* loaded from: classes.dex */
public final class vrk<R> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    boolean Z$0;
    boolean Z$1;
    int label;
    /* synthetic */ Object result;

    public vrk() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return u370.g(null, this, null, false, false);
    }
}
