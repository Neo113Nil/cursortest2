package xsna;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.Result;

/* compiled from: LocalSavedStateRegistryOwner.android.kt */
/* loaded from: classes12.dex */
public final class vvz {
    public static final androidx.compose.runtime.e<z1h0> a;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0028, code lost:
    
        r1 = r1.invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002e, code lost:
    
        if ((r1 instanceof androidx.compose.runtime.e) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0030, code lost:
    
        r1 = (androidx.compose.runtime.e) r1;
     */
    static {
        Object failure;
        try {
            Method method = z1h0.class.getClassLoader().loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalSavedStateRegistryOwner", null);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (annotations[i] instanceof ozl) {
                    break;
                } else {
                    i++;
                }
            }
            failure = null;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        androidx.compose.runtime.e<z1h0> eVar = (androidx.compose.runtime.e) (failure instanceof Result.Failure ? null : failure);
        if (eVar == null) {
            eVar = new iyk0(new xu0(19));
        }
        a = eVar;
    }
}
