package defpackage;

import com.yandex.payment.sdk.flex.impl.b;

/* loaded from: classes2.dex */
public final /* synthetic */ class ghr implements nao {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ghr(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.nao
    public final mao a(l1o l1oVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                bhr bhrVar = ((b) obj).f;
                if (bhrVar == null) {
                    bhrVar = null;
                }
                jir jirVar = bhrVar.l;
                if (jirVar != null) {
                    return new ijf(l1oVar.b, jirVar);
                }
                return null;
            case 1:
                return (mqq) obj;
            case 2:
                return (mqq) obj;
            default:
                return (mao) obj;
        }
    }
}
