package defpackage;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import yads.tm0;

/* loaded from: classes7.dex */
public abstract class kl71 {
    public static final Set a = j73.f0(new String[]{"com.yandex.mobile.ads", "yads", "com.monetization.ads", "com.yandex.div"});

    public static boolean a(StackTraceElement stackTraceElement, Set set) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (((uc81) obj).a == tm0.b) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (evu0.y(stackTraceElement.toString(), ((uc81) it.next()).b, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00c2, code lost:
    
        r3 = (java.lang.StackTraceElement) defpackage.j73.G(r1, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00c8, code lost:
    
        if (r3 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00ca, code lost:
    
        r3 = r3.getClassName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00ce, code lost:
    
        if (r3 == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x007a, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(StackTraceElement[] stackTraceElementArr, Set set) {
        Set set2;
        String className;
        StackTraceElement stackTraceElement;
        String className2;
        String className3;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (((uc81) obj).a == tm0.c) {
                arrayList.add(obj);
            }
        }
        boolean z = false;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (evu0.y(Arrays.toString(stackTraceElementArr), ((uc81) it.next()).b, false)) {
                    break;
                }
            }
        }
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            set2 = a;
            if (i >= length) {
                i = -1;
                break;
            }
            StackTraceElement stackTraceElement2 = stackTraceElementArr[i];
            String className4 = stackTraceElement2.getClassName();
            if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                Iterator it2 = set2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (cvu0.x(className4, (String) it2.next(), false)) {
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
                StackTraceElement stackTraceElement3 = (StackTraceElement) j73.G(i, stackTraceElementArr);
                if (stackTraceElement3 == null || a(stackTraceElement3, set) || (stackTraceElement = (StackTraceElement) j73.G(i, stackTraceElementArr)) == null || (className2 = stackTraceElement.getClassName()) == null || ((set2 instanceof Collection) && set2.isEmpty())) {
                    break;
                }
                Iterator it3 = set2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break loop4;
                    }
                    if (cvu0.x(className2, (String) it3.next(), false)) {
                        break;
                    }
                }
            } while (!className3.equals(CallbackStackTraceMarker.class.getName()));
            StackTraceElement stackTraceElement4 = (StackTraceElement) j73.G(i, stackTraceElementArr);
            if (stackTraceElement4 != null && (className = stackTraceElement4.getClassName()) != null && className.equals(CallbackStackTraceMarker.class.getName())) {
                z = true;
            }
            return !z;
        }
        return false;
    }
}
