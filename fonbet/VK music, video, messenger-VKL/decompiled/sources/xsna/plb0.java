package xsna;

import android.os.Build;
import android.view.MotionEvent;
import java.util.List;

/* compiled from: PointerEvent.android.kt */
/* loaded from: classes11.dex */
public final class plb0 {
    public final List<xlb0> a;
    public final rkx b;
    public final int c;
    public final int d;
    public final int e;
    public int f;

    public plb0() {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        if (r11 != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        r0 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0084, code lost:
    
        if (r11 != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008e, code lost:
    
        if (r11 != false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public plb0(List<xlb0> list, rkx rkxVar) {
        boolean z;
        boolean z2;
        int actionMasked;
        int classification;
        int classification2;
        MotionEvent a;
        this.a = list;
        this.b = rkxVar;
        int i = Build.VERSION.SDK_INT;
        int i2 = 0;
        this.c = (i < 29 || (a = a()) == null) ? 0 : a.getClassification();
        MotionEvent a2 = a();
        this.d = a2 != null ? a2.getButtonState() : 0;
        MotionEvent a3 = a();
        this.e = a3 != null ? a3.getMetaState() : 0;
        MotionEvent a4 = a();
        if (a4 != null) {
            if (i >= 29) {
                classification2 = a4.getClassification();
                if (classification2 == 3) {
                    z = true;
                    if (i >= 29) {
                        classification = a4.getClassification();
                        if (classification == 5) {
                            z2 = true;
                            actionMasked = a4.getActionMasked();
                            if (actionMasked == 0) {
                                if (!z) {
                                    if (z2) {
                                        i2 = 7;
                                    }
                                    i2 = 1;
                                }
                                i2 = 10;
                            } else if (actionMasked != 1) {
                                if (actionMasked != 2) {
                                    switch (actionMasked) {
                                        case 5:
                                            if (!z) {
                                            }
                                            i2 = 10;
                                            break;
                                        case 6:
                                            if (!z) {
                                            }
                                            i2 = 12;
                                            break;
                                        case 8:
                                            i2 = 6;
                                            break;
                                        case 9:
                                            i2 = 4;
                                            break;
                                        case 10:
                                            i2 = 5;
                                            break;
                                    }
                                }
                                if (z) {
                                    i2 = 11;
                                }
                            } else {
                                if (!z) {
                                    if (z2) {
                                        i2 = 9;
                                    }
                                    i2 = 2;
                                }
                                i2 = 12;
                            }
                        }
                    }
                    z2 = false;
                    actionMasked = a4.getActionMasked();
                    if (actionMasked == 0) {
                    }
                }
            }
            z = false;
            if (i >= 29) {
            }
            z2 = false;
            actionMasked = a4.getActionMasked();
            if (actionMasked == 0) {
            }
        } else {
            int size = list.size();
            while (i2 < size) {
                xlb0 xlb0Var = list.get(i2);
                if (fdi.o(xlb0Var)) {
                    i2 = 2;
                } else if (fdi.m(xlb0Var)) {
                    i2 = 1;
                } else {
                    i2++;
                }
            }
            i2 = 3;
        }
        this.f = i2;
    }

    public final MotionEvent a() {
        rkx rkxVar = this.b;
        if (rkxVar != null) {
            return (MotionEvent) rkxVar.b.c;
        }
        return null;
    }
}
