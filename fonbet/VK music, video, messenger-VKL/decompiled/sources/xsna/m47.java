package xsna;

import javax.crypto.Cipher;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.e57;
import xsna.j47;

/* compiled from: BiometricCipherPromptCallback.kt */
/* loaded from: classes15.dex */
public final class m47 extends e57.a {
    public final n47 a;
    public final FunctionReferenceImpl b;

    /* JADX WARN: Multi-variable type inference failed */
    public m47(n47 n47Var, izs<? super Cipher, s3q0> izsVar) {
        this.a = n47Var;
        this.b = (FunctionReferenceImpl) izsVar;
    }

    @Override // xsna.e57.a
    public final void a(int i, CharSequence charSequence) {
        this.a.pd(new j47.a(charSequence.toString(), i));
    }

    @Override // xsna.e57.a
    public final void b() {
        this.a.pm();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    @Override // xsna.e57.a
    public final void c(e57.b bVar) {
        Cipher cipher;
        e57.c cVar = bVar.a;
        if (cVar == null || (cipher = cVar.b) == null) {
            return;
        }
        this.b.invoke(cipher);
    }
}
