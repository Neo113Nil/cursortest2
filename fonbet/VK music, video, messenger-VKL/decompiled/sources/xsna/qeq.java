package xsna;

import com.vk.core.files.a;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: ExternalFileRepositoryImpl.kt */
/* loaded from: classes5.dex */
public final class qeq extends a.b.C0766b {
    public final /* synthetic */ Ref$ObjectRef<Throwable> a;

    public qeq(Ref$ObjectRef<Throwable> ref$ObjectRef) {
        this.a = ref$ObjectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.core.files.a.b.InterfaceC0765a
    public final void onError(Throwable th) {
        Ref$ObjectRef<Throwable> ref$ObjectRef = this.a;
        T t = th;
        if (th == null) {
            t = ref$ObjectRef.element;
        }
        ref$ObjectRef.element = t;
    }
}
