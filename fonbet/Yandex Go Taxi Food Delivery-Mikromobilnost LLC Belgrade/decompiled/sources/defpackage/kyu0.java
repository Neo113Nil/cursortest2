package defpackage;

import java.util.HashMap;

/* loaded from: classes4.dex */
public final /* synthetic */ class kyu0 implements lyu0 {
    public final /* synthetic */ myu0 a;
    public final /* synthetic */ int b;

    public /* synthetic */ kyu0(myu0 myu0Var, int i) {
        this.a = myu0Var;
        this.b = i;
    }

    public final void a() {
        eys eysVar;
        myu0 myu0Var = this.a;
        HashMap hashMap = myu0Var.a;
        if (((lyu0) hashMap.remove(Integer.valueOf(this.b))) == null || (eysVar = myu0Var.b) == null) {
            return;
        }
        if (!hashMap.isEmpty()) {
            eysVar = null;
        }
        if (eysVar != null) {
            cys cysVar = eysVar.a;
            o530 o530Var = eysVar.b;
            ryh ryhVar = eysVar.c;
            tg2 tg2Var = cysVar.g;
            if (tg2Var != null) {
                o530Var.p(tg2Var, ryhVar);
            }
        }
    }
}
