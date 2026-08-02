package defpackage;

import android.app.Activity;
import android.graphics.Rect;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/* loaded from: classes10.dex */
public final /* synthetic */ class fpl0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ gpl0 b;

    public /* synthetic */ fpl0(gpl0 gpl0Var, int i) {
        this.a = i;
        this.b = gpl0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0086, code lost:
    
        if (r0.getReturnType().equals(r9.loadClass("androidx.window.extensions.layout.SupportedWindowFeatures")) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00eb, code lost:
    
        if (r9.getReturnType().equals(r1) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01a1, code lost:
    
        if (java.lang.reflect.Modifier.isPublic(r9.getModifiers()) != false) goto L67;
     */
    @Override // defpackage.sls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        int i = this.a;
        Class cls = Integer.TYPE;
        Class<?> cls2 = null;
        boolean z = false;
        gpl0 gpl0Var = this.b;
        switch (i) {
            case 0:
                Method method = ((ClassLoader) gpl0Var.c.b).loadClass("androidx.window.extensions.WindowExtensions").getMethod("getWindowLayoutComponent", null);
                return Boolean.valueOf(Modifier.isPublic(method.getModifiers()) && method.getReturnType().equals(gpl0Var.a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent")));
            case 1:
                Class<?> loadClass = gpl0Var.a.loadClass("androidx.window.extensions.layout.FoldingFeature");
                Method method2 = loadClass.getMethod("getBounds", null);
                Method method3 = loadClass.getMethod("getType", null);
                Method method4 = loadClass.getMethod("getState", null);
                if (method2.getReturnType().equals(qoi0.a(Rect.class).a()) && Modifier.isPublic(method2.getModifiers())) {
                    if (method3.getReturnType().equals(qoi0.a(cls).a()) && Modifier.isPublic(method3.getModifiers())) {
                        if (method4.getReturnType().equals(qoi0.a(cls).a())) {
                            break;
                        }
                    }
                }
                r6 = false;
                return Boolean.valueOf(r6);
            case 2:
                ClassLoader classLoader = gpl0Var.a;
                Method method5 = classLoader.loadClass("androidx.window.extensions.layout.SupportedWindowFeatures").getMethod("getDisplayFoldFeatures", null);
                return Boolean.valueOf(Modifier.isPublic(method5.getModifiers()) && method5.getReturnType().equals(List.class) && ((Class) ((ParameterizedType) method5.getGenericReturnType()).getActualTypeArguments()[0]).equals(classLoader.loadClass("androidx.window.extensions.layout.DisplayFoldFeature")));
            case 3:
                Class<?> loadClass2 = gpl0Var.a.loadClass("androidx.window.extensions.layout.DisplayFoldFeature");
                Method method6 = loadClass2.getMethod("getType", null);
                Method method7 = loadClass2.getMethod("hasProperty", cls);
                Method method8 = loadClass2.getMethod("hasProperties", int[].class);
                if (Modifier.isPublic(method6.getModifiers()) && method6.getReturnType().equals(cls) && Modifier.isPublic(method7.getModifiers())) {
                    Class<?> returnType = method7.getReturnType();
                    Class cls3 = Boolean.TYPE;
                    if (returnType.equals(cls3)) {
                        if (Modifier.isPublic(method8.getModifiers())) {
                            break;
                        }
                    }
                }
                r6 = false;
                return Boolean.valueOf(r6);
            case 4:
                ClassLoader classLoader2 = gpl0Var.a;
                Method method9 = classLoader2.loadClass("androidx.window.extensions.layout.WindowLayoutComponent").getMethod("getSupportedWindowFeatures", null);
                if (Modifier.isPublic(method9.getModifiers())) {
                    break;
                }
                r6 = false;
                return Boolean.valueOf(r6);
            case 5:
                try {
                    cls2 = ((ClassLoader) gpl0Var.b.a).loadClass("java.util.function.Consumer");
                } catch (ClassNotFoundException unused) {
                }
                if (cls2 != null) {
                    Class<?> loadClass3 = gpl0Var.a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                    z = Modifier.isPublic(loadClass3.getMethod("addWindowLayoutInfoListener", Activity.class, cls2).getModifiers()) && Modifier.isPublic(loadClass3.getMethod("removeWindowLayoutInfoListener", cls2).getModifiers());
                }
                return Boolean.valueOf(z);
            default:
                return Boolean.valueOf(gpl0.d(gpl0Var));
        }
    }
}
