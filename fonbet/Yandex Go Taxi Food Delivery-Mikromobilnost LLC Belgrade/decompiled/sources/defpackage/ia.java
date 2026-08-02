package defpackage;

import kotlinx.serialization.json.b;

/* loaded from: classes9.dex */
public abstract class ia extends y8 {
    @Override // defpackage.y8
    public final Object a(sbx sbxVar, b bVar) {
        try {
            return c(sbxVar, bVar);
        } catch (Throwable th) {
            return this.b(th);
        }
    }

    public abstract Object b(Throwable th);

    public abstract Object c(sbx sbxVar, b bVar);
}
