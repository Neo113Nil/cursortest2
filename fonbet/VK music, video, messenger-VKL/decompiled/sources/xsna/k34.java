package xsna;

import com.vk.core.files.a;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: AttachSendUtil.kt */
/* loaded from: classes2.dex */
public final class k34 extends a.b.C0766b {
    public final /* synthetic */ Ref$ObjectRef<Throwable> a;

    public k34(Ref$ObjectRef<Throwable> ref$ObjectRef) {
        this.a = ref$ObjectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.core.files.a.b.InterfaceC0765a
    public final void onError(Throwable th) {
        this.a.element = th;
    }
}
