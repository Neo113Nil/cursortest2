package defpackage;

import com.yandex.messaging.internal.a0;

/* loaded from: classes15.dex */
public final class nft extends vds0 {
    public final a0 b;

    public nft(a0 a0Var, kse kseVar) {
        super(kseVar.b);
        this.b = a0Var;
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        mft mftVar = (mft) obj;
        return new syc(this.b.a(new oft(mftVar.a, mftVar.b)), 24);
    }

    public final tpr d(String str, boolean z) {
        return a(new mft(str, z));
    }
}
