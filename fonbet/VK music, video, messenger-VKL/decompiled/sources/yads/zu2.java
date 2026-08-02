package yads;

/* loaded from: classes10.dex */
public abstract class zu2 {
    public static av2 a() {
        av2 av2Var;
        av2 av2Var2 = av2.c;
        if (av2Var2 != null) {
            return av2Var2;
        }
        synchronized (av2.b) {
            av2Var = av2.c;
            if (av2Var == null) {
                av2Var = new av2();
                av2.c = av2Var;
            }
        }
        return av2Var;
    }
}
