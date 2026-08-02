package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Modifier;

/* loaded from: classes10.dex */
public final class gpl0 {
    public final ClassLoader a;
    public final yfa b;
    public final ndl0 c;

    public gpl0(ClassLoader classLoader, yfa yfaVar) {
        this.a = classLoader;
        this.b = yfaVar;
        this.c = new ndl0(2, classLoader);
    }

    public static final boolean d(gpl0 gpl0Var) {
        Class<?> loadClass = gpl0Var.a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        return Modifier.isPublic(loadClass.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class).getModifiers()) && Modifier.isPublic(loadClass.getMethod("removeWindowLayoutInfoListener", Consumer.class).getModifiers());
    }

    public final WindowLayoutComponent a() {
        int a;
        ndl0 ndl0Var = this.c;
        boolean z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        try {
            ((ClassLoader) ndl0Var.b).loadClass("androidx.window.extensions.WindowExtensionsProvider");
            if (mia1.e(new iik0(18, ndl0Var), "WindowExtensionsProvider#getWindowExtensions is not valid") && mia1.e(new fpl0(this, z ? 1 : 0), "WindowExtensions#getWindowLayoutComponent is not valid") && mia1.e(new fpl0(this, 1), "FoldingFeature class is not valid") && (a = uzo.a()) >= 1) {
                if (a == 1) {
                    z = b();
                } else if (a < 5) {
                    z = c();
                } else if (c() && mia1.e(new fpl0(this, 3), "DisplayFoldFeature is not valid") && mia1.e(new fpl0(this, 2), "SupportedWindowFeatures is not valid") && mia1.e(new fpl0(this, 4), "WindowLayoutComponent#getSupportedWindowFeatures is not valid")) {
                    z = true;
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
        return mia1.e(new fpl0(this, 5), "WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid");
    }

    public final boolean c() {
        if (!b()) {
            return false;
        }
        StringBuilder sb = new StringBuilder("WindowLayoutComponent#addWindowLayoutInfoListener(");
        sb.append(Context.class.getName());
        sb.append(", androidx.window.extensions.core.util.function.Consumer) is not valid");
        return mia1.e(new fpl0(this, 6), sb.toString());
    }
}
