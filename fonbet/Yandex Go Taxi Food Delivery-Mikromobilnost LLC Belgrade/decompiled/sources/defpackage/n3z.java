package defpackage;

import androidx.compose.runtime.h;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.Result;

/* loaded from: classes.dex */
public abstract class n3z {
    public static final h a;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0028, code lost:
    
        r1 = r1.invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002e, code lost:
    
        if ((r1 instanceof androidx.compose.runtime.h) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0030, code lost:
    
        r1 = (androidx.compose.runtime.h) r1;
     */
    static {
        Object failure;
        try {
            Method method = pey.class.getClassLoader().loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (annotations[i] instanceof jxi) {
                    break;
                } else {
                    i++;
                }
            }
            failure = null;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        h hVar = (h) (failure instanceof Result.Failure ? null : failure);
        if (hVar == null) {
            hVar = new a7u0(new wwx(21));
        }
        a = hVar;
    }
}
