package defpackage;

import android.view.View;
import androidx.core.view.b;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class lvc0 implements w6u {
    public final View a;

    public lvc0(View view) {
        this.a = view;
    }

    public final void a(int i) {
        int i2 = 16;
        if (!z6u.a(i, 16)) {
            i2 = 6;
            if (!z6u.a(i, 6)) {
                i2 = 13;
                if (!z6u.a(i, 13)) {
                    i2 = 23;
                    if (!z6u.a(i, 23)) {
                        i2 = 3;
                        if (!z6u.a(i, 3)) {
                            i2 = 0;
                            if (!z6u.a(i, 0)) {
                                i2 = 17;
                                if (!z6u.a(i, 17)) {
                                    i2 = 27;
                                    if (!z6u.a(i, 27)) {
                                        i2 = 26;
                                        if (!z6u.a(i, 26)) {
                                            i2 = 9;
                                            if (!z6u.a(i, 9)) {
                                                i2 = 22;
                                                if (!z6u.a(i, 22)) {
                                                    i2 = 21;
                                                    if (!z6u.a(i, 21)) {
                                                        i2 = 1;
                                                        if (!z6u.a(i, 1)) {
                                                            i2 = -1;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        WeakHashMap weakHashMap = b.a;
        int a = mza1.a(i2);
        if (a == -1) {
            return;
        }
        this.a.performHapticFeedback(a);
    }
}
