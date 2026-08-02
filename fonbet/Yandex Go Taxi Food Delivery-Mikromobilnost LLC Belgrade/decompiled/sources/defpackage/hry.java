package defpackage;

/* loaded from: classes.dex */
public final class hry {
    public static oqw a(long j, Object obj) {
        oqw oqwVar = (oqw) z321.c.k(j, obj);
        if (((p9) oqwVar).a) {
            return oqwVar;
        }
        int size = oqwVar.size();
        oqw w = oqwVar.w(size == 0 ? 10 : size * 2);
        z321.p(j, obj, w);
        return w;
    }
}
