package defpackage;

import android.content.Context;
import java.io.File;
import yads.wm0;

/* loaded from: classes7.dex */
public final class h171 {
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
    
        if (r1 != 0) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static z171 a(Context context) {
        long j;
        a081 a081Var;
        File a = rl81.a(context, "mobileads-video-cache");
        a081 a081Var2 = a081.g;
        if (a081Var2 == null) {
            synchronized (a081.f) {
                a081Var = a081.g;
                if (a081Var == null) {
                    a081Var = new a081();
                    a081.g = a081Var;
                }
            }
            a081Var2 = a081Var;
        }
        gg81 a2 = a081Var2.a(context);
        if (a2 != null) {
            j = a2.c;
        }
        j = 52428800;
        return new z171(a, new r371(gja1.a(context, 41943040L, j)), new wm0(context));
    }
}
