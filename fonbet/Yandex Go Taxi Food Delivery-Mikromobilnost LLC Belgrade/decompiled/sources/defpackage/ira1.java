package defpackage;

import android.graphics.Rect;
import androidx.compose.ui.graphics.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.logistics.sdk.cargo_form.impl.ai_widgets.ui.ai_chat.a;

/* loaded from: classes11.dex */
public abstract class ira1 {
    public static final void a(final gq1 gq1Var, final float f, final oz40 oz40Var, final tls tlsVar, final tls tlsVar2, fid fidVar, final int i) {
        int i2;
        aii0 v;
        wls wlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(145580302);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(cj6.a) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(gq1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.b(f) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.k(oz40Var) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.e(tlsVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar.e(tlsVar2) ? 131072 : 65536;
        }
        int i3 = i2;
        if (!btsVar.V(i3 & 1, (74899 & i3) != 74898)) {
            btsVar.Y();
        } else {
            if (gq1Var == null) {
                v = btsVar.v();
                if (v != null) {
                    final int i4 = 0;
                    wlsVar = new wls() { // from class: iq1
                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = i4;
                            zy11 zy11Var = zy11.a;
                            int i6 = i;
                            switch (i5) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int O = vng.O(i6 | 1);
                                    ira1.a(gq1Var, f, oz40Var, tlsVar, tlsVar2, (fid) obj, O);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int O2 = vng.O(i6 | 1);
                                    ira1.a(gq1Var, f, oz40Var, tlsVar, tlsVar2, (fid) obj, O2);
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                return;
            }
            vn1 vn1Var = gq1Var.a;
            if (vn1Var == null) {
                btsVar.e0(-933880682);
                btsVar.t(false);
            } else {
                btsVar.e0(-933880681);
                a.a(vn1Var, f, oz40Var, tlsVar, tlsVar2, btsVar, i3 & 524174);
                btsVar = btsVar;
                btsVar.t(false);
            }
            azs0 azs0Var = gq1Var.b;
            if (azs0Var == null) {
                btsVar.e0(-933593715);
                btsVar.t(false);
            } else {
                btsVar.e0(-933593714);
                int i5 = i3 >> 6;
                ru.yandex.logistics.sdk.cargo_form.impl.ai_widgets.ui.smart_camera.a.a(s1a1.g(c530.a, Float.MAX_VALUE), azs0Var, tlsVar, tlsVar2, btsVar, (i5 & 896) | 6 | (i5 & 7168));
                btsVar.t(false);
            }
        }
        v = btsVar.v();
        if (v != null) {
            final int i6 = 1;
            wlsVar = new wls() { // from class: iq1
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = i6;
                    zy11 zy11Var = zy11.a;
                    int i62 = i;
                    switch (i52) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int O = vng.O(i62 | 1);
                            ira1.a(gq1Var, f, oz40Var, tlsVar, tlsVar2, (fid) obj, O);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int O2 = vng.O(i62 | 1);
                            ira1.a(gq1Var, f, oz40Var, tlsVar, tlsVar2, (fid) obj, O2);
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r10.bottom <= r12.top) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0071, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        if (r9 == 17) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r9 != 66) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        r11 = g(r9, r10, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        if (r9 == 17) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        if (r9 == 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        if (r9 == 66) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r9 != 130) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        r9 = r12.bottom;
        r10 = r10.bottom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (r11 >= java.lang.Math.max(1, r9 - r10)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        defpackage.ny61.g("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        r9 = r12.right;
        r10 = r10.right;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        r9 = r10.top;
        r10 = r12.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        r9 = r10.left;
        r10 = r12.left;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0031, code lost:
    
        if (r10.right <= r12.left) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0038, code lost:
    
        if (r10.top >= r12.bottom) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x003f, code lost:
    
        if (r10.left >= r12.right) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean c = c(i, rect, rect2);
        if (!c(i, rect, rect3) && c) {
            if (i != 17) {
                if (i != 33) {
                    if (i != 66) {
                        if (i != 130) {
                            ny61.g("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            return false;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        ny61.g("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        if (rect2.bottom >= rect.top && rect2.top <= rect.bottom) {
            return true;
        }
    }

    public static wh d(pnt0 pnt0Var, xw91 xw91Var, kl40 kl40Var, wh whVar, Rect rect, int i) {
        Rect rect2 = new Rect(rect);
        wh whVar2 = null;
        if (i == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i == 66) {
            rect2.offset(-(rect.width() + 1), 0);
        } else {
            if (i != 130) {
                ny61.g("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return null;
            }
            rect2.offset(0, -(rect.height() + 1));
        }
        xw91Var.getClass();
        int e = pnt0Var.e();
        Rect rect3 = new Rect();
        for (int i2 = 0; i2 < e; i2++) {
            wh whVar3 = (wh) pnt0Var.f(i2);
            if (whVar3 != whVar) {
                kl40Var.getClass();
                whVar3.f(rect3);
                if (f(i, rect, rect3)) {
                    if (f(i, rect, rect2) && !b(i, rect, rect3, rect2)) {
                        if (!b(i, rect, rect2, rect3)) {
                            int g = g(i, rect, rect3);
                            int h = h(i, rect, rect3);
                            int i3 = (h * h) + (g * 13 * g);
                            int g2 = g(i, rect, rect2);
                            int h2 = h(i, rect, rect2);
                            if (i3 >= (h2 * h2) + (g2 * 13 * g2)) {
                            }
                        }
                    }
                    rect2.set(rect3);
                    whVar2 = whVar3;
                }
            }
        }
        return whVar2;
    }

    public static Object e(pnt0 pnt0Var, xw91 xw91Var, kl40 kl40Var, wh whVar, int i, boolean z) {
        xw91Var.getClass();
        int e = pnt0Var.e();
        ArrayList arrayList = new ArrayList(e);
        for (int i2 = 0; i2 < e; i2++) {
            arrayList.add((wh) pnt0Var.f(i2));
        }
        Collections.sort(arrayList, new kvr(z, kl40Var));
        if (i == 1) {
            int size = arrayList.size();
            if (whVar != null) {
                size = arrayList.indexOf(whVar);
            }
            int i3 = size - 1;
            if (i3 >= 0) {
                return arrayList.get(i3);
            }
            return null;
        }
        if (i != 2) {
            ny61.g("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
            return null;
        }
        int size2 = arrayList.size();
        int lastIndexOf = (whVar == null ? -1 : arrayList.lastIndexOf(whVar)) + 1;
        if (lastIndexOf < size2) {
            return arrayList.get(lastIndexOf);
        }
        return null;
    }

    public static boolean f(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            if ((i2 > i3 || rect.left >= i3) && rect.left > rect2.left) {
                return true;
            }
        } else if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            if ((i4 > i5 || rect.top >= i5) && rect.top > rect2.top) {
                return true;
            }
        } else if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            if ((i6 < i7 || rect.right <= i7) && rect.right < rect2.right) {
                return true;
            }
        } else {
            if (i != 130) {
                ny61.g("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            int i8 = rect.top;
            int i9 = rect2.top;
            if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
                return true;
            }
        }
        return false;
    }

    public static int g(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else {
            if (i != 130) {
                ny61.g("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return 0;
            }
            i2 = rect2.top;
            i3 = rect.bottom;
        }
        return Math.max(0, i2 - i3);
    }

    public static int h(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        ny61.g("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return 0;
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static final f530 i(f530 f530Var, float f) {
        return f == 0.0f ? f530Var : d.c(f530Var, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f, null, 524031);
    }

    public static p891 j(AbstractSafeParcelable abstractSafeParcelable) {
        return new p891(abstractSafeParcelable.getClass().getSimpleName(), 2);
    }
}
