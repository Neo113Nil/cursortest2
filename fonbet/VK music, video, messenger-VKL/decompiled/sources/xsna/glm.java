package xsna;

import com.google.android.gms.location.ActivityTransition;
import com.vk.im.engine.models.dialogs.DialogTheme;
import com.vk.im.engine.models.dialogs.c;
import java.util.Comparator;
import java.util.List;

/* compiled from: Comparisons.kt */
/* loaded from: classes2.dex */
public final class glm implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ glm(int i) {
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
    
        if (r9 < r10) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r0 >= r3) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        return 1;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        int i;
        int i2 = 0;
        switch (this.b) {
            case 0:
                String str = ((DialogTheme) obj).b.a;
                c.g gVar = c.g.c;
                if (epx.f(str, gVar.a)) {
                    i = 0;
                } else if (epx.f(str, c.h.c.a)) {
                    i = 1;
                } else if (epx.f(str, c.C1124c.c.a)) {
                    i = 2;
                } else {
                    List<String> list = flm.k;
                    i = epx.f(str, "vk17") ? 3 : Integer.MAX_VALUE;
                }
                Integer valueOf = Integer.valueOf(i);
                String str2 = ((DialogTheme) obj2).b.a;
                if (!epx.f(str2, gVar.a)) {
                    if (epx.f(str2, c.h.c.a)) {
                        i2 = 1;
                    } else if (epx.f(str2, c.C1124c.c.a)) {
                        i2 = 2;
                    } else {
                        List<String> list2 = flm.k;
                        i2 = epx.f(str2, "vk17") ? 3 : Integer.MAX_VALUE;
                    }
                }
                return jw5.b(valueOf, Integer.valueOf(i2));
            default:
                ActivityTransition activityTransition = (ActivityTransition) obj;
                ActivityTransition activityTransition2 = (ActivityTransition) obj2;
                exc0.i(activityTransition);
                exc0.i(activityTransition2);
                int i3 = activityTransition.b;
                int i4 = activityTransition2.b;
                if (i3 == i4) {
                    int i5 = activityTransition.c;
                    int i6 = activityTransition2.c;
                    if (i5 == i6) {
                        return 0;
                    }
                }
                break;
        }
    }
}
