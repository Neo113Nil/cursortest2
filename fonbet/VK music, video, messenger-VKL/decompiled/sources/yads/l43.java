package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import xsna.brm0;
import xsna.drm0;

/* loaded from: classes10.dex */
public abstract class l43 {
    public static final Set a = xsna.rl3.y0(new String[]{"com.yandex.mobile.ads", "yads", "com.monetization.ads", "com.yandex.div"});

    public static boolean a(StackTraceElement stackTraceElement, Set set) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (((cn0) obj).a == dn0.b) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (drm0.D(stackTraceElement.toString(), ((cn0) it.next()).b, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00c4, code lost:
    
        r3 = (java.lang.StackTraceElement) xsna.rl3.S(r1, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ca, code lost:
    
        if (r3 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00cc, code lost:
    
        r3 = r3.getClassName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00d0, code lost:
    
        if (r3 == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x007a, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(StackTraceElement[] stackTraceElementArr, Set set) {
        String className;
        StackTraceElement stackTraceElement;
        String className2;
        String className3;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (((cn0) obj).a == dn0.c) {
                arrayList.add(obj);
            }
        }
        boolean z = false;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (drm0.D(Arrays.toString(stackTraceElementArr), ((cn0) it.next()).b, false)) {
                    break;
                }
            }
        }
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            StackTraceElement stackTraceElement2 = stackTraceElementArr[i];
            String className4 = stackTraceElement2.getClassName();
            Set set2 = a;
            if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                Iterator it2 = set2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (brm0.B(className4, (String) it2.next(), false)) {
                        if (!a(stackTraceElement2, set)) {
                            break;
                        }
                    }
                }
            }
            i++;
        }
        if (i != -1) {
            loop4: do {
                i++;
                StackTraceElement stackTraceElement3 = (StackTraceElement) xsna.rl3.S(i, stackTraceElementArr);
                if (stackTraceElement3 != null && !a(stackTraceElement3, set) && (stackTraceElement = (StackTraceElement) xsna.rl3.S(i, stackTraceElementArr)) != null && (className2 = stackTraceElement.getClassName()) != null) {
                    Set set3 = a;
                    if ((set3 instanceof Collection) && set3.isEmpty()) {
                        break;
                    }
                    Iterator it3 = set3.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break loop4;
                        }
                        if (brm0.B(className2, (String) it3.next(), false)) {
                            break;
                        }
                    }
                } else {
                    break;
                }
            } while (!className3.equals(CallbackStackTraceMarker.class.getName()));
            StackTraceElement stackTraceElement4 = (StackTraceElement) xsna.rl3.S(i, stackTraceElementArr);
            if (stackTraceElement4 != null && (className = stackTraceElement4.getClassName()) != null && className.equals(CallbackStackTraceMarker.class.getName())) {
                z = true;
            }
            return !z;
        }
        return false;
    }
}
