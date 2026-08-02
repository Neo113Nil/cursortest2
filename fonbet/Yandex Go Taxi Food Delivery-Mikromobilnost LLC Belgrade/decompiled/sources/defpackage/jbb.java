package defpackage;

import kotlin.Pair;

/* loaded from: classes15.dex */
public final class jbb extends kbb {
    public final /* synthetic */ int w;
    public final /* synthetic */ lbb x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jbb(lbb lbbVar, cxy cxyVar, int i) {
        super(lbbVar, cxyVar);
        this.w = i;
        this.x = lbbVar;
    }

    @Override // defpackage.kbb
    public final Pair c() {
        int i = this.w;
        lbb lbbVar = this.x;
        switch (i) {
            case 0:
                return new Pair(lbbVar.d.d(), null);
            default:
                return new Pair(lbbVar.d.c(), null);
        }
    }
}
