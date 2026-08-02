package defpackage;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* loaded from: classes4.dex */
public class c710 {
    public OnBackInvokedCallback a;

    public OnBackInvokedCallback a(b710 b710Var) {
        Objects.requireNonNull(b710Var);
        return new frr(1, b710Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0005, code lost:
    
        r3 = r3.findOnBackInvokedDispatcher();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(b710 b710Var, View view, boolean z) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (this.a == null && findOnBackInvokedDispatcher != null) {
            OnBackInvokedCallback a = a(b710Var);
            this.a = a;
            findOnBackInvokedDispatcher.registerOnBackInvokedCallback(z ? 1000000 : 0, a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0005, code lost:
    
        r2 = r2.findOnBackInvokedDispatcher();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(View view) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (this.a == null || findOnBackInvokedDispatcher == null) {
            return;
        }
        findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.a);
        this.a = null;
    }
}
