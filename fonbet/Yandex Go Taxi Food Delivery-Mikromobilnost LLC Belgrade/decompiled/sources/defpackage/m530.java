package defpackage;

import kotlinx.serialization.KSerializer;

/* loaded from: classes2.dex */
public final class m530 implements cy {
    public final qid a;

    public m530(qid qidVar) {
        this.a = qidVar;
    }

    @Override // defpackage.dtq0
    public final KSerializer select(String str) {
        return this.a.decoder(str);
    }
}
