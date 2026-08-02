package xsna;

/* compiled from: PlayerControlsViewConfiguration.kt */
@ozl
/* loaded from: classes8.dex */
public abstract class u0b0 {

    /* compiled from: PlayerControlsViewConfiguration.kt */
    public static final class a extends u0b0 {
        public static final a a = new a();

        @Override // xsna.u0b0
        public final void a(sqj sqjVar, u0b0 u0b0Var) {
            if (u0b0Var instanceof a) {
                return;
            }
            sqjVar.a().removeAllViews();
            sqjVar.b();
        }
    }

    public abstract void a(sqj sqjVar, u0b0 u0b0Var);
}
