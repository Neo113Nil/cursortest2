package defpackage;

import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes10.dex */
public abstract class nq41 {
    public static final os41 a;

    static {
        os41 gqvVar;
        try {
            gqvVar = new ji41(6, (WebViewProviderFactoryBoundaryInterface) ei6.a(WebViewProviderFactoryBoundaryInterface.class, im91.f()));
        } catch (ClassNotFoundException unused) {
            gqvVar = new gqv();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            ny61.j(e);
            return;
        }
        a = gqvVar;
    }
}
