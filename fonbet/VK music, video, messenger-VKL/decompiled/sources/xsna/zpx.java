package xsna;

import android.view.View;

/* compiled from: InvisibilityStrategy.kt */
/* loaded from: classes2.dex */
public interface zpx {

    /* compiled from: InvisibilityStrategy.kt */
    public static final class a implements zpx {
        public static final a a = new a();

        @Override // xsna.zpx
        public final void a(View view) {
            f4m.j(view);
        }
    }

    /* compiled from: InvisibilityStrategy.kt */
    public static final class b implements zpx {
        public static final b a = new b();

        @Override // xsna.zpx
        public final void a(View view) {
            view.setVisibility(4);
        }
    }

    void a(View view);
}
