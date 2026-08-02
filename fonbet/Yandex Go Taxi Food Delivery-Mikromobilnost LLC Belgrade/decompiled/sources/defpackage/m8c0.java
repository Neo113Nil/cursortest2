package defpackage;

import kotlinx.serialization.json.b;

/* loaded from: classes13.dex */
public final class m8c0 extends fnr0 {
    public final String a;
    public final String b;
    public final /* synthetic */ e9c0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8c0(e9c0 e9c0Var) {
        super(0);
        this.c = e9c0Var;
        this.a = e9c0Var.c();
        this.b = e9c0Var.a();
    }

    @Override // defpackage.fnr0
    public final String getJsonKey() {
        return this.a;
    }

    @Override // defpackage.fnr0
    public final String getSharedDataParserType() {
        return this.b;
    }

    @Override // defpackage.fnr0
    public final bnr0 tryParse(sbx sbxVar, b bVar) {
        e9c0 e9c0Var = this.c;
        try {
            Object a = sbxVar.a(e9c0Var.d(), bVar);
            if (a == null) {
                return null;
            }
            e9c0Var.b(a);
            return null;
        } catch (Throwable th) {
            jst.e.j(th);
            return null;
        }
    }
}
