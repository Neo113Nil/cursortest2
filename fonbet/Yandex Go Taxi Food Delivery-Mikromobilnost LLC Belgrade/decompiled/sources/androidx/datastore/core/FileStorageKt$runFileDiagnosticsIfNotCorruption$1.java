package androidx.datastore.core;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "androidx.datastore.core.FileStorageKt", f = "FileStorage.kt", l = {224}, m = "runFileDiagnosticsIfNotCorruption", v = 1)
/* loaded from: classes.dex */
final class FileStorageKt$runFileDiagnosticsIfNotCorruption$1<T> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return h.a(null, null, this);
    }
}
