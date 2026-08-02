package xsna;

import android.view.View;
import java.util.WeakHashMap;

/* compiled from: PlatformHapticFeedback.android.kt */
/* loaded from: classes11.dex */
public final class nta0 implements vtu {
    public final View a;

    public nta0(View view) {
        this.a = view;
    }

    @Override // xsna.vtu
    public final void a(int i) {
        int i2 = 16;
        if (i != 16) {
            i2 = 6;
            if (i != 6) {
                i2 = 13;
                if (i != 13) {
                    i2 = 23;
                    if (i != 23) {
                        i2 = 3;
                        if (i != 3) {
                            if (i == 0) {
                                i2 = 0;
                            } else {
                                i2 = 17;
                                if (i != 17) {
                                    i2 = 27;
                                    if (i != 27) {
                                        i2 = 26;
                                        if (i != 26) {
                                            i2 = 9;
                                            if (i != 9) {
                                                i2 = 22;
                                                if (i != 22) {
                                                    i2 = 21;
                                                    if (i != 21) {
                                                        i2 = 1;
                                                        if (i != 1) {
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
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        int a = wtu.a(i2);
        if (a == -1) {
            return;
        }
        this.a.performHapticFeedback(a);
    }
}
