package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.juk;

/* compiled from: DataMigrationInitializer.kt */
@b6l(c = "androidx.datastore.core.DataMigrationInitializer$Companion", f = "DataMigrationInitializer.kt", l = {42, 57}, m = "runMigrations")
/* loaded from: classes.dex */
public final class huk<T> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ juk.a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public huk(juk.a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return juk.a.a(this.this$0, null, null, this);
    }
}
