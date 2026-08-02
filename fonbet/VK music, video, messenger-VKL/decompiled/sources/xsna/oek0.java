package xsna;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: SoftwareKeyboardControllerCompat.java */
/* loaded from: classes11.dex */
public final class oek0 {
    public final a a;

    /* compiled from: SoftwareKeyboardControllerCompat.java */
    public static class a extends c {
        public final View a;

        public a(View view) {
            this.a = view;
        }

        public void a() {
            View view = this.a;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        }

        public void b() {
            View view;
            View view2 = this.a;
            if (view2 == null) {
                return;
            }
            if (view2.isInEditMode() || view2.onCheckIsTextEditor()) {
                view2.requestFocus();
                view = view2;
            } else {
                view = view2.getRootView().findFocus();
            }
            if (view == null) {
                view = view2.getRootView().findViewById(R.id.content);
            }
            if (view == null || !view.hasWindowFocus()) {
                return;
            }
            view.post(new n44(view, 6));
        }
    }

    /* compiled from: SoftwareKeyboardControllerCompat.java */
    public static class b extends a {
        public View b;
        public WindowInsetsController c;

        /* JADX WARN: Type inference failed for: r4v0, types: [xsna.qek0] */
        @Override // xsna.oek0.a
        public final void a() {
            int ime;
            View view = this.b;
            WindowInsetsController windowInsetsController = this.c;
            if (windowInsetsController == null) {
                windowInsetsController = view != null ? view.getWindowInsetsController() : null;
            }
            if (windowInsetsController == null) {
                super.a();
                return;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            ?? r4 = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: xsna.qek0
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i) {
                    atomicBoolean.set((i & 8) != 0);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(r4);
            if (!atomicBoolean.get() && view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(r4);
            ime = WindowInsets.Type.ime();
            windowInsetsController.hide(ime);
        }

        @Override // xsna.oek0.a
        public final void b() {
            int ime;
            View view = this.b;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = this.c;
            if (windowInsetsController == null) {
                windowInsetsController = view != null ? view.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                ime = WindowInsets.Type.ime();
                windowInsetsController.show(ime);
            }
            super.b();
        }
    }

    /* compiled from: SoftwareKeyboardControllerCompat.java */
    public static class c {
    }

    public oek0(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            this.a = new a(view);
            return;
        }
        b bVar = new b(view);
        bVar.b = view;
        this.a = bVar;
    }

    @Deprecated
    public oek0(WindowInsetsController windowInsetsController) {
        b bVar = new b(null);
        bVar.c = windowInsetsController;
        this.a = bVar;
    }
}
