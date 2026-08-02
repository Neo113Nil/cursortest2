package xsna;

import xsna.jio0;
import xsna.y8g;

/* compiled from: ColorSelector.kt */
/* loaded from: classes4.dex */
public interface v7g {

    /* compiled from: ColorSelector.kt */
    public static final class a implements v7g {
        public static final a a = new a();

        @Override // xsna.v7g
        public final boolean a(lw5 lw5Var) {
            return !lw5Var.equals(lw5.i);
        }

        @Override // xsna.v7g
        public final y8g b(y8g y8gVar, jio0.a aVar, lw5 lw5Var) {
            return a(lw5Var) ? y8gVar : y8g.a.a;
        }

        @Override // xsna.v7g
        public final y8g c(y8g y8gVar, jio0.a aVar, lw5 lw5Var) {
            if (a(lw5Var)) {
                return new y8g.c(n8g.e(y8gVar.a(), -1) <= 1.5d ? -16777216 : -1);
            }
            return y8gVar;
        }
    }

    boolean a(lw5 lw5Var);

    y8g b(y8g y8gVar, jio0.a aVar, lw5 lw5Var);

    y8g c(y8g y8gVar, jio0.a aVar, lw5 lw5Var);
}
