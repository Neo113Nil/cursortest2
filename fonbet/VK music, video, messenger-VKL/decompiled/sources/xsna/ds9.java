package xsna;

import java.util.ArrayList;

/* compiled from: CaptureCallbackConverter.java */
/* loaded from: classes11.dex */
public final class ds9 {
    public static void a(gg9 gg9Var, ArrayList arrayList) {
        if (gg9Var instanceof hg9) {
            ((hg9) gg9Var).getClass();
            throw null;
        }
        if (gg9Var instanceof cs9) {
            arrayList.add(((cs9) gg9Var).a);
        } else {
            arrayList.add(new bs9(gg9Var));
        }
    }
}
