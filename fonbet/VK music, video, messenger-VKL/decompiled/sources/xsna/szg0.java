package xsna;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Modifier;

/* compiled from: SafeWindowLayoutComponentProvider.kt */
/* loaded from: classes12.dex */
public final class szg0 {
    public final ClassLoader a;
    public final p7j b;
    public final iid c;

    public szg0(ClassLoader classLoader, p7j p7jVar) {
        this.a = classLoader;
        this.b = p7jVar;
        this.c = new iid(classLoader);
    }

    public static final boolean d(szg0 szg0Var) {
        Class<?> loadClass = szg0Var.a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        return Modifier.isPublic(loadClass.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class).getModifiers()) && Modifier.isPublic(loadClass.getMethod("removeWindowLayoutInfoListener", Consumer.class).getModifiers());
    }

    public final WindowLayoutComponent a() {
        iid iidVar = this.c;
        boolean z = false;
        try {
            ((ClassLoader) iidVar.b).loadClass("androidx.window.extensions.WindowExtensionsProvider");
            if (ine0.t("WindowExtensionsProvider#getWindowExtensions is not valid", new bi80(iidVar, 12)) && ine0.t("WindowExtensions#getWindowLayoutComponent is not valid", new kr50(this, 23)) && ine0.t("FoldingFeature class is not valid", new gd40(this, 21))) {
                rdq.a.getClass();
                int a = rdq.a();
                if (a >= 1) {
                    if (a == 1) {
                        z = b();
                    } else if (a < 5) {
                        z = c();
                    } else if (c() && ine0.t("DisplayFoldFeature is not valid", new rf20(this, 24)) && ine0.t("SupportedWindowFeatures is not valid", new re40(this, 22)) && ine0.t("WindowLayoutComponent#getSupportedWindowFeatures is not valid", new hk70(this, 15))) {
                        z = true;
                    }
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        if (!z) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused2) {
            return null;
        }
    }

    public final boolean b() {
        return ine0.t("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new by20(this, 26));
    }

    public final boolean c() {
        if (!b()) {
            return false;
        }
        StringBuilder sb = new StringBuilder("WindowLayoutComponent#addWindowLayoutInfoListener(");
        sb.append(Context.class.getName());
        sb.append(", androidx.window.extensions.core.util.function.Consumer) is not valid");
        return ine0.t(sb.toString(), new b410(this, 24));
    }
}
