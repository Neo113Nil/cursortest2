package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes12.dex */
public final class kgm implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ jgm b;

    public /* synthetic */ kgm(jgm jgmVar, int i) {
        this.a = i;
        this.b = jgmVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        jgm jgmVar = this.b;
        switch (i) {
            case 0:
                jgmVar.s6((hx0) obj);
                break;
            case 1:
                jgmVar.Ra((mct0) obj);
                break;
            default:
                jgmVar.b3((wi70) obj);
                break;
        }
        return zy11Var;
    }
}
