package xsna;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Lambda;

/* compiled from: InputMethodManager.android.kt */
@ozl
/* loaded from: classes11.dex */
public final class i2x {
    public final View a;
    public final Object b = msy.a(LazyThreadSafetyMode.NONE, new a());
    public final oek0 c;

    /* compiled from: InputMethodManager.android.kt */
    public static final class a extends Lambda implements gzs<InputMethodManager> {
        public a() {
            super(0);
        }

        @Override // xsna.gzs
        public final InputMethodManager invoke() {
            return (InputMethodManager) i2x.this.a.getContext().getSystemService("input_method");
        }
    }

    public i2x(View view) {
        this.a = view;
        this.c = new oek0(view);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(int i, int i2, int i3, int i4) {
        ((InputMethodManager) this.b.getValue()).updateSelection(this.a, i, i2, i3, i4);
    }
}
