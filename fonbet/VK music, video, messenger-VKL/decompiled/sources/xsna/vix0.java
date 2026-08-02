package xsna;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* compiled from: WebViewGlueCommunicator.java */
/* loaded from: classes12.dex */
public final class vix0 {

    /* compiled from: WebViewGlueCommunicator.java */
    public static class a {
        public static final mjx0 a = new mjx0(b.a.getWebkitToCompatConverter());
    }

    /* compiled from: WebViewGlueCommunicator.java */
    public static class b {
        public static final hjx0 a;

        static {
            hjx0 ine0Var;
            try {
                ine0Var = new q1t((WebViewProviderFactoryBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebViewProviderFactoryBoundaryInterface.class, vix0.a()));
            } catch (ClassNotFoundException unused) {
                ine0Var = new ine0();
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (NoSuchMethodException e2) {
                throw new RuntimeException(e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3);
            }
            a = ine0Var;
        }
    }

    public static InvocationHandler a() throws IllegalAccessException, InvocationTargetException, ClassNotFoundException, NoSuchMethodException {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, py2.b()).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }
}
