package xsna;

import android.os.Build;
import android.view.View;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* compiled from: MaterialBackOrchestrator.java */
/* loaded from: classes13.dex */
public final class pl10 {

    @Nullable
    public final a a;

    @NonNull
    public final nl10 b;

    @NonNull
    public final View c;

    /* compiled from: MaterialBackOrchestrator.java */
    public static class a {

        @Nullable
        public OnBackInvokedCallback a;

        public OnBackInvokedCallback a(@NonNull final nl10 nl10Var) {
            Objects.requireNonNull(nl10Var);
            return new OnBackInvokedCallback() { // from class: xsna.ol10
                public final void onBackInvoked() {
                    nl10.this.b();
                }
            };
        }

        /* JADX WARN: Code restructure failed: missing block: B:3:0x0005, code lost:
        
            r3 = r3.findOnBackInvokedDispatcher();
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void b(@NonNull nl10 nl10Var, @NonNull View view, boolean z) {
            OnBackInvokedDispatcher findOnBackInvokedDispatcher;
            if (this.a == null && findOnBackInvokedDispatcher != null) {
                OnBackInvokedCallback a = a(nl10Var);
                this.a = a;
                findOnBackInvokedDispatcher.registerOnBackInvokedCallback(z ? 1000000 : 0, a);
            }
        }

        public void c(@NonNull View view) {
            OnBackInvokedDispatcher findOnBackInvokedDispatcher;
            findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher();
            if (findOnBackInvokedDispatcher == null) {
                return;
            }
            findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.a);
            this.a = null;
        }
    }

    /* compiled from: MaterialBackOrchestrator.java */
    public static class b extends a {

        /* compiled from: MaterialBackOrchestrator.java */
        public class a implements OnBackAnimationCallback {
            public final /* synthetic */ nl10 a;

            public a(nl10 nl10Var) {
                this.a = nl10Var;
            }

            public final void onBackCancelled() {
                if (b.this.a != null) {
                    this.a.d();
                }
            }

            public final void onBackInvoked() {
                this.a.b();
            }

            public final void onBackProgressed(@NonNull BackEvent backEvent) {
                if (b.this.a != null) {
                    this.a.e(new wu5(backEvent));
                }
            }

            public final void onBackStarted(@NonNull BackEvent backEvent) {
                if (b.this.a != null) {
                    this.a.a(new wu5(backEvent));
                }
            }
        }

        @Override // xsna.pl10.a
        public final OnBackInvokedCallback a(@NonNull nl10 nl10Var) {
            return new a(nl10Var);
        }
    }

    public pl10(@NonNull nl10 nl10Var, @NonNull View view) {
        int i = Build.VERSION.SDK_INT;
        this.a = i >= 34 ? new b() : i >= 33 ? new a() : null;
        this.b = nl10Var;
        this.c = view;
    }
}
