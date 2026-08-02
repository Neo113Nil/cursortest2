package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.j6x;

/* compiled from: InstallationId.kt */
@b6l(c = "com.google.firebase.sessions.InstallationId$Companion", f = "InstallationId.kt", l = {32, 40}, m = "create")
/* loaded from: classes.dex */
public final class i6x extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ j6x.a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6x(j6x.a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
