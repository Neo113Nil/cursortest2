package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class j350 implements r800 {
    public final /* synthetic */ com.vk.music.onboarding.impl.b a;
    public final /* synthetic */ FunctionReferenceImpl b;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ j350(com.vk.music.onboarding.impl.b bVar, gzs gzsVar) {
        this.a = bVar;
        this.b = (FunctionReferenceImpl) gzsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    @Override // xsna.r800
    public final void onResult(Object obj) {
        bn40.c((Throwable) obj, new Object[0]);
        this.a.b(this.b);
    }
}
