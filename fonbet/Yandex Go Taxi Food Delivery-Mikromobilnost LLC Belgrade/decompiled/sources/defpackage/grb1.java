package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.g;
import androidx.compose.ui.node.s;
import com.ybsdk.deeplink.generated.TooltipAction;
import java.util.Objects;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes11.dex */
public abstract class grb1 {
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0177, code lost:
    
        r31 = r5;
        r32 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0183, code lost:
    
        if (r37.h(r12 - 1, r31 - 1) == false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0185, code lost:
    
        r12 = r12 - 1;
        r5 = r31 - 1;
        r11 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0190, code lost:
    
        r30[r20 + r32] = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0194, code lost:
    
        if (r28 == 0) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0196, code lost:
    
        r5 = r23 - r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0198, code lost:
    
        if (r5 < r10) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x019a, code lost:
    
        if (r5 > r4) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01a0, code lost:
    
        if (r24[r20 + r5] < r12) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01a2, code lost:
    
        r33[r17] = r12;
        r21 = 1;
        r33[1] = r31;
        r33[r16] = r26;
        r33[3] = r29;
        r33[4] = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0234, code lost:
    
        r11 = r32 + 2;
        r5 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x018c, code lost:
    
        r31 = r5;
        r32 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0167, code lost:
    
        r31 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0160, code lost:
    
        r29 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x014e, code lost:
    
        r5 = r30[(r11 + 1) + r20];
        r12 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0141, code lost:
    
        r28 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x014c, code lost:
    
        r28 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x023a, code lost:
    
        r4 = r4 + 1;
        r10 = r24;
        r5 = r25;
        r11 = r30;
        r12 = r33;
        r21 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0127, code lost:
    
        r5 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a1, code lost:
    
        if (r24[(r5 + 1) + r20] > r24[(r29 - 1) + r20]) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x011d, code lost:
    
        r30 = r11;
        r33 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0123, code lost:
    
        if ((r23 & 1) != 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0125, code lost:
    
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0129, code lost:
    
        r11 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x012a, code lost:
    
        if (r11 > r4) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x012c, code lost:
    
        if (r11 == r10) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x012e, code lost:
    
        if (r11 == r4) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0130, code lost:
    
        r28 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x013e, code lost:
    
        if (r30[(r11 + 1) + r20] >= r30[(r11 - 1) + r20]) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0143, code lost:
    
        r5 = r30[(r11 - 1) + r20];
        r12 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0155, code lost:
    
        r26 = r6 - ((r14 - r12) - r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x015b, code lost:
    
        if (r4 == 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x015d, code lost:
    
        r29 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0162, code lost:
    
        if (r12 != r5) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0164, code lost:
    
        r31 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0169, code lost:
    
        r29 = r26 + (r29 & r31);
        r26 = r5;
        r5 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0173, code lost:
    
        if (r12 <= r13) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0175, code lost:
    
        if (r5 <= r9) goto L174;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(int i, int i2, qz40 qz40Var) {
        int i3;
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        char c;
        int i4;
        int i5;
        int i6;
        int i7;
        t300 t300Var = (t300) qz40Var.f;
        int i8 = 1;
        char c2 = 2;
        int i9 = ((i + i2) + 1) / 2;
        l6w l6wVar = new l6w(i9 * 3);
        l6w l6wVar2 = new l6w(i9 * 4);
        int i10 = 0;
        l6wVar2.g(0, i, 0, i2);
        int i11 = (i9 * 2) + 1;
        int[] iArr4 = new int[i11];
        int[] iArr5 = new int[i11];
        int[] iArr6 = new int[5];
        while (true) {
            int i12 = l6wVar2.c;
            if (i12 == 0) {
                break;
            }
            int[] iArr7 = l6wVar2.b;
            char c3 = c2;
            int i13 = i12 - 1;
            l6wVar2.c = i13;
            int i14 = iArr7[i13];
            int i15 = i10;
            int i16 = i12 - 2;
            l6wVar2.c = i16;
            int i17 = iArr7[i16];
            int i18 = i12 - 3;
            l6wVar2.c = i18;
            int i19 = iArr7[i18];
            int i20 = i12 - 4;
            l6wVar2.c = i20;
            int i21 = iArr7[i20];
            int i22 = i19 - i21;
            int i23 = i11;
            int i24 = i14 - i17;
            if (i22 >= i8 && i24 >= i8) {
                int i25 = i8;
                int i26 = ((i22 + i24) + 1) / 2;
                int i27 = i23 / 2;
                int i28 = i27 + 1;
                iArr4[i28] = i21;
                iArr5[i28] = i19;
                int i29 = i15;
                while (i29 < i26) {
                    int i30 = i22 - i24;
                    int i31 = i26;
                    iArr = iArr4;
                    int i32 = -i29;
                    int i33 = (Math.abs(i30) & 1) == i25 ? 1 : i15;
                    int i34 = i32;
                    while (true) {
                        if (i34 > i29) {
                            break;
                        }
                        if (i34 != i32) {
                            if (i34 != i29) {
                                i4 = i34;
                                iArr2 = iArr5;
                            } else {
                                i4 = i34;
                                iArr2 = iArr5;
                            }
                            i5 = iArr[(i4 - 1) + i27];
                            i6 = i5 + 1;
                            int i35 = ((i6 - i21) + i17) - i4;
                            int i36 = i35 - ((i29 == 0 ? 1 : i15) & (i6 != i5 ? 1 : i15));
                            int i37 = i5;
                            i7 = i35;
                            while (i6 < i19 && i7 < i14 && qz40Var.h(i6, i7)) {
                                i6++;
                                i7++;
                            }
                            iArr[i27 + i4] = i6;
                            if (i33 == 0) {
                                int i38 = i7;
                                int i39 = i30 - i4;
                                iArr3 = iArr6;
                                if (i39 >= i32 + 1 && i39 <= i29 - 1 && iArr2[i27 + i39] <= i6) {
                                    iArr3[i15] = i37;
                                    iArr3[1] = i36;
                                    iArr3[c3] = i6;
                                    iArr3[3] = i38;
                                    iArr3[4] = i15;
                                    c = 1;
                                    break;
                                }
                            } else {
                                iArr3 = iArr6;
                            }
                            i34 = i4 + 2;
                            iArr5 = iArr2;
                            iArr6 = iArr3;
                        } else {
                            i4 = i34;
                            iArr2 = iArr5;
                        }
                        i5 = iArr[i4 + 1 + i27];
                        i6 = i5;
                        int i352 = ((i6 - i21) + i17) - i4;
                        int i362 = i352 - ((i29 == 0 ? 1 : i15) & (i6 != i5 ? 1 : i15));
                        int i372 = i5;
                        i7 = i352;
                        while (i6 < i19) {
                            i6++;
                            i7++;
                        }
                        iArr[i27 + i4] = i6;
                        if (i33 == 0) {
                        }
                        i34 = i4 + 2;
                        iArr5 = iArr2;
                        iArr6 = iArr3;
                    }
                    if (Math.min(iArr3[c3] - iArr3[i15], iArr3[3] - iArr3[c]) > 0) {
                        int i40 = iArr3[i15];
                        int i41 = iArr3[c];
                        int i42 = iArr3[3] - i41;
                        int i43 = iArr3[c3] - i40;
                        if (i42 != i43) {
                            i43 = Math.min(i43, i42);
                            int i44 = iArr3[4];
                            int i45 = i44 != 0 ? 1 : i15;
                            int i46 = iArr3[3];
                            c = 1;
                            int i47 = iArr3[1];
                            int i48 = i46 - i47;
                            int i49 = iArr3[c3];
                            int i50 = iArr3[i15];
                            i40 += ((i48 > i49 - i50 ? 1 : i15) | i45) ^ 1;
                            i41 += ((i44 != 0 ? 1 : i15) | ((i46 - i47 > i49 - i50 ? 1 : i15) ^ 1)) ^ 1;
                        } else {
                            c = 1;
                        }
                        l6wVar.f(i40, i41, i43);
                    }
                    l6wVar2.g(i21, iArr3[i15], i17, iArr3[c]);
                    l6wVar2.g(iArr3[c3], i19, iArr3[3], i14);
                    c2 = c3;
                    i10 = i15;
                    i11 = i23;
                    iArr4 = iArr;
                    iArr5 = iArr2;
                    iArr6 = iArr3;
                    i8 = 1;
                }
            }
            iArr = iArr4;
            iArr2 = iArr5;
            iArr3 = iArr6;
            c2 = c3;
            i10 = i15;
            i11 = i23;
            iArr4 = iArr;
            iArr5 = iArr2;
            iArr6 = iArr3;
            i8 = 1;
        }
        int i51 = i10;
        int i52 = l6wVar.c;
        if (i52 % 3 != 0) {
            ixv.b("Array size not a multiple of 3");
        }
        if (i52 > 3) {
            i3 = i51;
            l6wVar.h(i3, i52 - 3);
        } else {
            i3 = i51;
        }
        l6wVar.f(i, i2, i3);
        int i53 = i3;
        int i54 = i53;
        while (i54 < l6wVar.c) {
            int[] iArr8 = l6wVar.b;
            int i55 = iArr8[i54];
            int i56 = iArr8[i54 + 2];
            int i57 = i55 - i56;
            int i58 = iArr8[i54 + 1] - i56;
            i54 += 3;
            while (i3 < i57) {
                e530 child$ui = ((e530) qz40Var.c).getChild$ui();
                if ((child$ui.getKindSet$ui() & 2) != 0) {
                    s coordinator$ui = child$ui.getCoordinator$ui();
                    s sVar = coordinator$ui.K;
                    s sVar2 = coordinator$ui.J;
                    if (sVar != null) {
                        sVar.J = sVar2;
                    }
                    sVar2.K = sVar;
                    t300.a(t300Var, (e530) qz40Var.c, sVar2);
                }
                qz40Var.c = t300.d(child$ui);
                i3++;
            }
            while (i53 < i58) {
                e530 b = t300.b((d530) ((wz40) qz40Var.e).a[qz40Var.a + i53], (e530) qz40Var.c);
                qz40Var.c = b;
                if (qz40Var.b) {
                    s coordinator$ui2 = b.getChild$ui().getCoordinator$ui();
                    v0y d = qje.d((e530) qz40Var.c);
                    if (d != null) {
                        g gVar = new g((LayoutNode) t300Var.b, d);
                        ((e530) qz40Var.c).updateCoordinator$ui(gVar);
                        t300.a(t300Var, (e530) qz40Var.c, gVar);
                        gVar.K = coordinator$ui2.K;
                        gVar.J = coordinator$ui2;
                        coordinator$ui2.K = gVar;
                    } else {
                        ((e530) qz40Var.c).updateCoordinator$ui(coordinator$ui2);
                    }
                    ((e530) qz40Var.c).markAsAttached$ui();
                    ((e530) qz40Var.c).runAttachLifecycle$ui();
                    ce60.a((e530) qz40Var.c);
                } else {
                    b.setInsertedNodeAwaitingAttachForInvalidation$ui(true);
                }
                i53++;
            }
            while (true) {
                int i59 = i56 - 1;
                if (i56 > 0) {
                    qz40Var.c = ((e530) qz40Var.c).getChild$ui();
                    wz40 wz40Var = (wz40) qz40Var.d;
                    int i60 = qz40Var.a;
                    d530 d530Var = (d530) wz40Var.a[i60 + i3];
                    d530 d530Var2 = (d530) ((wz40) qz40Var.e).a[i60 + i53];
                    if (!jl40.l(d530Var, d530Var2)) {
                        t300.i(d530Var, d530Var2, (e530) qz40Var.c);
                    }
                    i3++;
                    i53++;
                    i56 = i59;
                }
            }
        }
    }

    public static Context b(Context context) {
        int d;
        Context applicationContext = context.getApplicationContext();
        int i = Build.VERSION.SDK_INT;
        if (i >= 34 && (d = sg.d(context)) != sg.d(applicationContext)) {
            applicationContext = sg.a(d, applicationContext);
        }
        if (i >= 30) {
            String d2 = qr6.d(context);
            if (!Objects.equals(d2, qr6.d(applicationContext))) {
                return qr6.a(applicationContext, d2);
            }
        }
        return applicationContext;
    }

    public static TooltipAction c(Uri uri) {
        Integer l;
        Integer l2;
        String queryParameter = uri.getQueryParameter(RemoteBioParameters.X);
        if (queryParameter != null && (l = bvu0.l(10, queryParameter)) != null) {
            int intValue = l.intValue();
            String queryParameter2 = uri.getQueryParameter(RemoteBioParameters.Y);
            if (queryParameter2 != null && (l2 = bvu0.l(10, queryParameter2)) != null) {
                int intValue2 = l2.intValue();
                String queryParameter3 = uri.getQueryParameter("gravity");
                if (queryParameter3 == null) {
                    queryParameter3 = "top";
                }
                String str = queryParameter3;
                String queryParameter4 = uri.getQueryParameter("title");
                String queryParameter5 = uri.getQueryParameter("subtitle");
                String queryParameter6 = uri.getQueryParameter("duration");
                return new TooltipAction(intValue, intValue2, str, queryParameter4, queryParameter5, queryParameter6 != null ? bvu0.l(10, queryParameter6) : null);
            }
        }
        return null;
    }
}
