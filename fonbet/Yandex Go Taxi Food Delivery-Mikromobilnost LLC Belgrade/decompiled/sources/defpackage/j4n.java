package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Range;
import android.util.Size;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.impl.Timebase;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.common.collect.ImmutableList;
import com.yandex.div.core.view2.divs.a;
import com.yandex.div.json.expressions.Expression;
import com.yandex.go.due.data.api.dto.TimetableInfo;
import com.yandex.go.overdraft.api.domain.model.OverdraftContext;
import com.yandex.go.overdraft.domain.e;
import com.yandex.go.overdraft.domain.g;
import com.yandex.go.overdraft.domain.h;
import com.yandex.go.overdraft.domain.k;
import com.yandex.go.payments.domain.j0;
import com.yandex.go.yb.data.u;
import com.yandex.go.yb.domain.o;
import com.yandex.plus.core.debug.panel.api.data.DebugPanelInfoItem$LogDetails$DebugPanelLogLevel;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.CryptoPro.ssl.Alerts;
import ru.yandex.taxi.perf.b;

/* loaded from: classes10.dex */
public final class j4n implements q2v0, en, xr31 {
    public static final byte[] A = {0, 7, 8, PKIBody._CCP};
    public static final byte[] B = {0, 119, -120, -1};
    public static final byte[] C = {0, PKIBody._CANN, 34, Alerts.alert_decrypt_error, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public static final byte[] D = {0, 7, 8, PKIBody._CCP};
    public static final byte[] E = {0, 119, -120, -1};
    public static final byte[] F = {0, PKIBody._CANN, 34, Alerts.alert_decrypt_error, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public Object a;
    public Object b;
    public Object c;
    public Object w;
    public Object x;
    public Object y;
    public Object z;

    public j4n(DisplayMetrics displayMetrics, hgl hglVar, agl aglVar, Canvas canvas, rvo rvoVar) {
        Expression expression;
        this.b = displayMetrics;
        this.x = hglVar;
        this.y = aglVar;
        this.c = canvas;
        this.z = rvoVar;
        Paint paint = new Paint();
        this.a = paint;
        if (hglVar == null) {
            this.w = null;
            return;
        }
        bcl bclVar = hglVar.b;
        Expression expression2 = hglVar.a;
        float o = a.o(expression2 != null ? (Long) expression2.a(rvoVar) : null, displayMetrics);
        this.w = new float[]{o, o, o, o, o, o, o, o};
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(gwk0.I(bclVar, rvoVar, displayMetrics));
        if (bclVar == null || (expression = bclVar.a) == null) {
            return;
        }
        paint.setColor(((Number) expression.a(rvoVar)).intValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x01d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0203 A[LOOP:3: B:86:0x0156->B:98:0x0203, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ff A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void G(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
        char c;
        char c2;
        boolean z;
        int i4;
        int i5;
        int i6;
        byte[] bArr2;
        boolean z2;
        int i7;
        int g;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z3;
        int g2;
        int i12;
        Paint paint2 = paint;
        df90 df90Var = new df90(bArr, bArr.length);
        int i13 = i2;
        int i14 = i3;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        while (df90Var.b() != 0) {
            int i15 = 8;
            int g3 = df90Var.g(8);
            if (g3 != 240) {
                int i16 = 3;
                int i17 = 2;
                int i18 = 4;
                switch (g3) {
                    case 16:
                        byte[] bArr6 = i == 3 ? bArr3 == null ? B : bArr3 : i == 2 ? bArr5 == null ? A : bArr5 : null;
                        boolean z4 = false;
                        while (true) {
                            int g4 = df90Var.g(2);
                            if (g4 != 0) {
                                z = z4;
                                i4 = g4;
                                i5 = 1;
                            } else if (df90Var.f()) {
                                int g5 = df90Var.g(3) + 3;
                                z = z4;
                                i4 = df90Var.g(2);
                                i5 = g5;
                            } else {
                                if (df90Var.f()) {
                                    z = z4;
                                    i5 = 1;
                                    c = '\b';
                                    c2 = 4;
                                } else {
                                    int g6 = df90Var.g(2);
                                    if (g6 == 0) {
                                        c = '\b';
                                        c2 = 4;
                                        z = true;
                                    } else if (g6 == 1) {
                                        c = '\b';
                                        c2 = 4;
                                        z = z4;
                                        i5 = 2;
                                    } else if (g6 == 2) {
                                        c = '\b';
                                        c2 = 4;
                                        i5 = df90Var.g(4) + 12;
                                        i4 = df90Var.g(2);
                                        z = z4;
                                        if (i5 != 0) {
                                        }
                                        i6 = i13;
                                        i13 = i6 + i5;
                                        if (z) {
                                        }
                                    } else if (g6 != 3) {
                                        z = z4;
                                        c = '\b';
                                        c2 = 4;
                                    } else {
                                        c = '\b';
                                        int g7 = df90Var.g(8) + 29;
                                        i4 = df90Var.g(2);
                                        z = z4;
                                        i5 = g7;
                                        c2 = 4;
                                        if (i5 != 0 || paint2 == null) {
                                            i6 = i13;
                                        } else {
                                            if (bArr6 != 0) {
                                                i4 = bArr6[i4];
                                            }
                                            paint2.setColor(iArr[i4]);
                                            i6 = i13;
                                            canvas.drawRect(i13, i14, i13 + i5, i14 + 1, paint2);
                                        }
                                        i13 = i6 + i5;
                                        if (z) {
                                            df90Var.c();
                                            break;
                                        } else {
                                            paint2 = paint;
                                            z4 = z;
                                        }
                                    }
                                    i4 = 0;
                                    i5 = 0;
                                    if (i5 != 0) {
                                    }
                                    i6 = i13;
                                    i13 = i6 + i5;
                                    if (z) {
                                    }
                                }
                                i4 = 0;
                                if (i5 != 0) {
                                }
                                i6 = i13;
                                i13 = i6 + i5;
                                if (z) {
                                }
                            }
                            c = '\b';
                            c2 = 4;
                            if (i5 != 0) {
                            }
                            i6 = i13;
                            i13 = i6 + i5;
                            if (z) {
                            }
                        }
                    case 17:
                        if (i == 3) {
                            bArr2 = bArr4 == null ? C : bArr4;
                        } else {
                            bArr2 = null;
                        }
                        boolean z5 = false;
                        while (true) {
                            int g8 = df90Var.g(i18);
                            if (g8 != 0) {
                                z2 = z5;
                                i8 = g8;
                                i7 = 1;
                            } else if (df90Var.f()) {
                                if (df90Var.f()) {
                                    int g9 = df90Var.g(i17);
                                    if (g9 == 0) {
                                        z2 = z5;
                                        i7 = 1;
                                    } else if (g9 != 1) {
                                        if (g9 == i17) {
                                            i7 = df90Var.g(i18) + 9;
                                            g = df90Var.g(i18);
                                        } else if (g9 != i16) {
                                            z2 = z5;
                                            i7 = 0;
                                        } else {
                                            i7 = df90Var.g(i15) + 25;
                                            g = df90Var.g(i18);
                                        }
                                        i8 = g;
                                    } else {
                                        z2 = z5;
                                        i7 = i17;
                                    }
                                    i8 = 0;
                                } else {
                                    i7 = df90Var.g(i17) + 4;
                                    i8 = df90Var.g(i18);
                                }
                                z2 = z5;
                            } else {
                                int g10 = df90Var.g(i16);
                                if (g10 != 0) {
                                    i7 = g10 + 2;
                                    z2 = z5;
                                    i8 = 0;
                                } else {
                                    z2 = true;
                                    i7 = 0;
                                    i8 = 0;
                                }
                            }
                            if (i7 == 0 || paint2 == null) {
                                i9 = i13;
                                i10 = i16;
                                i11 = i17;
                            } else {
                                if (bArr2 != 0) {
                                    i8 = bArr2[i8];
                                }
                                paint2.setColor(iArr[i8]);
                                i10 = i16;
                                i11 = 2;
                                i9 = i13;
                                canvas.drawRect(i13, i14, i13 + i7, i14 + 1, paint2);
                            }
                            i13 = i9 + i7;
                            if (z2) {
                                df90Var.c();
                                break;
                            } else {
                                z5 = z2;
                                i16 = i10;
                                i17 = i11;
                                i18 = 4;
                                i15 = 8;
                            }
                        }
                    case 18:
                        boolean z6 = false;
                        while (true) {
                            int g11 = df90Var.g(8);
                            if (g11 != 0) {
                                z3 = z6;
                                g2 = 1;
                            } else if (df90Var.f()) {
                                z3 = z6;
                                g2 = df90Var.g(7);
                                g11 = df90Var.g(8);
                            } else {
                                int g12 = df90Var.g(7);
                                if (g12 != 0) {
                                    z3 = z6;
                                    g2 = g12;
                                    g11 = 0;
                                } else {
                                    z3 = true;
                                    g11 = 0;
                                    g2 = 0;
                                }
                            }
                            if (g2 == 0 || paint2 == null) {
                                i12 = i13;
                            } else {
                                paint2.setColor(iArr[g11]);
                                i12 = i13;
                                canvas.drawRect(i13, i14, i13 + g2, i14 + 1, paint2);
                            }
                            i13 = i12 + g2;
                            if (z3) {
                                break;
                            } else {
                                z6 = z3;
                            }
                        }
                        break;
                    default:
                        switch (g3) {
                            case 32:
                                bArr5 = l(4, 4, df90Var);
                                break;
                            case 33:
                                bArr3 = l(4, 8, df90Var);
                                break;
                            case 34:
                                bArr4 = l(16, 8, df90Var);
                                break;
                        }
                }
            } else {
                i14 += 2;
                i13 = i2;
            }
            paint2 = paint;
        }
    }

    public static b4n H(df90 df90Var, int i) {
        int g;
        int i2;
        int g2;
        int i3;
        int i4;
        int i5 = 8;
        int g3 = df90Var.g(8);
        df90Var.o(8);
        int i6 = 2;
        int i7 = i - 2;
        int i8 = 0;
        int[] iArr = {0, -1, ModalContentViewContainer.BASE_SHADOW_COLOR, -8421505};
        int[] v = v();
        int[] w = w();
        while (i7 > 0) {
            int g4 = df90Var.g(i5);
            int g5 = df90Var.g(i5);
            int[] iArr2 = (g5 & 128) != 0 ? iArr : (g5 & 64) != 0 ? v : w;
            if ((g5 & 1) != 0) {
                i3 = df90Var.g(i5);
                i4 = df90Var.g(i5);
                g = df90Var.g(i5);
                g2 = df90Var.g(i5);
                i2 = i7 - 6;
            } else {
                int g6 = df90Var.g(6) << i6;
                int g7 = df90Var.g(4) << 4;
                g = df90Var.g(4) << 4;
                i2 = i7 - 4;
                g2 = df90Var.g(i6) << 6;
                i3 = g6;
                i4 = g7;
            }
            if (i3 == 0) {
                i4 = i8;
                g = i4;
                g2 = 255;
            }
            double d = i3;
            double d2 = i4 - 128;
            double d3 = g - 128;
            iArr2[g4] = y((byte) (255 - (g2 & 255)), tw21.i((int) ((1.402d * d2) + d), 0, 255), tw21.i((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), tw21.i((int) ((d3 * 1.772d) + d), 0, 255));
            i7 = i2;
            i8 = 0;
            g3 = g3;
            w = w;
            i5 = 8;
            i6 = 2;
        }
        return new b4n(iArr, v, w, g3);
    }

    public static d4n I(df90 df90Var) {
        byte[] bArr;
        int g = df90Var.g(16);
        df90Var.o(4);
        int g2 = df90Var.g(2);
        boolean f = df90Var.f();
        df90Var.o(1);
        byte[] bArr2 = tw21.c;
        if (g2 == 1) {
            df90Var.o(df90Var.g(8) * 16);
        } else if (g2 == 0) {
            int g3 = df90Var.g(16);
            int g4 = df90Var.g(16);
            if (g3 > 0) {
                bArr2 = new byte[g3];
                df90Var.j(g3, bArr2);
            }
            if (g4 > 0) {
                bArr = new byte[g4];
                df90Var.j(g4, bArr);
                return new d4n(g, f, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new d4n(g, f, bArr2, bArr);
    }

    public static int a(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    public static nm61 c(uh81 uh81Var, int i) {
        int i2;
        int a;
        int i3;
        int i4;
        int i5;
        int i6 = 8;
        int a2 = uh81Var.a(8);
        uh81Var.h(8);
        int i7 = 2;
        int i8 = i - 2;
        int i9 = 4;
        int i10 = 0;
        int[] iArr = {0, -1, ModalContentViewContainer.BASE_SHADOW_COLOR, -8421505};
        int[] h = h();
        int[] i11 = i();
        while (i8 > 0) {
            int a3 = uh81Var.a(i6);
            int a4 = uh81Var.a(i6);
            int[] iArr2 = (a4 & 128) != 0 ? iArr : (a4 & 64) != 0 ? h : i11;
            if ((a4 & 1) != 0) {
                i3 = uh81Var.a(i6);
                i4 = uh81Var.a(i6);
                i5 = uh81Var.a(i6);
                a = uh81Var.a(i6);
                i2 = i8 - 6;
            } else {
                int a5 = uh81Var.a(6) << i7;
                int a6 = uh81Var.a(i9) << i9;
                int a7 = uh81Var.a(i9) << i9;
                i2 = i8 - 4;
                a = uh81Var.a(i7) << 6;
                i3 = a5;
                i4 = a6;
                i5 = a7;
            }
            if (i3 == 0) {
                a = 255;
                i4 = i10;
                i5 = i4;
            }
            int i12 = i2;
            double d = i3;
            double d2 = i4 - 128;
            double d3 = i5 - 128;
            int i13 = rf71.a;
            iArr2[a3] = a((byte) (255 - (a & 255)), Math.max(0, Math.min((int) ((1.402d * d2) + d), 255)), Math.max(0, Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255)), Math.max(0, Math.min((int) ((d3 * 1.772d) + d), 255)));
            i8 = i12;
            i10 = 0;
            iArr = iArr;
            h = h;
            i6 = 8;
            i7 = 2;
            i9 = 4;
        }
        return new nm61(iArr, h, i11, a2);
    }

    public static a171 e(uh81 uh81Var) {
        byte[] bArr;
        int a = uh81Var.a(16);
        uh81Var.h(4);
        int a2 = uh81Var.a(2);
        boolean k = uh81Var.k();
        uh81Var.h(1);
        byte[] bArr2 = rf71.f;
        if (a2 == 1) {
            uh81Var.h(uh81Var.a(8) * 16);
        } else if (a2 == 0) {
            int a3 = uh81Var.a(16);
            int a4 = uh81Var.a(16);
            if (a3 > 0) {
                bArr2 = new byte[a3];
                if (uh81Var.c != 0) {
                    ny61.k();
                    return null;
                }
                System.arraycopy(uh81Var.a, uh81Var.b, bArr2, 0, a3);
                uh81Var.b += a3;
                uh81Var.c();
            }
            if (a4 > 0) {
                bArr = new byte[a4];
                if (uh81Var.c != 0) {
                    ny61.k();
                    return null;
                }
                System.arraycopy(uh81Var.a, uh81Var.b, bArr, 0, a4);
                uh81Var.b += a4;
                uh81Var.c();
                return new a171(a, k, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new a171(a, k, bArr2, bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0217 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x022b A[LOOP:3: B:88:0x0186->B:99:0x022b, LOOP_END] */
    /* JADX WARN: Type inference failed for: r2v17, types: [int] */
    /* JADX WARN: Type inference failed for: r2v23, types: [int] */
    /* JADX WARN: Type inference failed for: r2v34, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v4, types: [int] */
    /* JADX WARN: Type inference failed for: r5v5, types: [int] */
    /* JADX WARN: Type inference failed for: r5v7, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void g(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        boolean z;
        ?? a;
        char c;
        boolean z2;
        byte b;
        int i4;
        int a2;
        byte b2;
        int i5;
        byte b3;
        boolean z3;
        int i6;
        int a3;
        byte b4;
        byte b5;
        int i7;
        int i8;
        int i9;
        int a4;
        int i10;
        Paint paint2 = paint;
        uh81 uh81Var = new uh81(bArr);
        int i11 = i2;
        int i12 = i3;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        while (uh81Var.e() != 0) {
            int a5 = uh81Var.a(8);
            if (a5 != 240) {
                int i13 = 4;
                int i14 = 2;
                int i15 = 1;
                switch (a5) {
                    case 16:
                        if (i != 3) {
                            if (i != 2) {
                                bArr2 = null;
                            } else if (bArr6 == null) {
                                bArr3 = D;
                                bArr2 = bArr3;
                            } else {
                                bArr2 = bArr6;
                            }
                            z = false;
                            while (true) {
                                a = uh81Var.a(2);
                                if (a != 0) {
                                }
                                b = b3;
                                c = 4;
                                if (i4 != 0) {
                                }
                                i5 = i11;
                                i11 = i5 + i4;
                                if (z2) {
                                }
                                paint2 = paint;
                                z = z2;
                            }
                        } else if (bArr4 == null) {
                            bArr3 = E;
                            bArr2 = bArr3;
                            z = false;
                            while (true) {
                                a = uh81Var.a(2);
                                if (a != 0) {
                                    z2 = z;
                                    i4 = 1;
                                    b3 = a;
                                } else {
                                    if (uh81Var.k()) {
                                        a2 = uh81Var.a(3) + 3;
                                        b2 = uh81Var.a(2);
                                    } else {
                                        if (uh81Var.k()) {
                                            z2 = z;
                                            i4 = 1;
                                            c = 4;
                                        } else {
                                            int a6 = uh81Var.a(2);
                                            if (a6 == 0) {
                                                c = 4;
                                                z2 = true;
                                            } else if (a6 == 1) {
                                                c = 4;
                                                z2 = z;
                                                i4 = 2;
                                            } else if (a6 == 2) {
                                                c = 4;
                                                i4 = uh81Var.a(4) + 12;
                                                z2 = z;
                                                b = uh81Var.a(2);
                                                if (i4 != 0 || paint2 == null) {
                                                    i5 = i11;
                                                } else {
                                                    if (bArr2 != null) {
                                                        b = bArr2[b];
                                                    }
                                                    paint2.setColor(iArr[b]);
                                                    i5 = i11;
                                                    canvas.drawRect(i11, i12, i11 + i4, i12 + 1, paint2);
                                                }
                                                i11 = i5 + i4;
                                                if (z2) {
                                                    paint2 = paint;
                                                    z = z2;
                                                } else if (uh81Var.c != 0) {
                                                    uh81Var.c = 0;
                                                    uh81Var.b++;
                                                    uh81Var.c();
                                                    break;
                                                }
                                            } else if (a6 != 3) {
                                                z2 = z;
                                                c = 4;
                                            } else {
                                                a2 = uh81Var.a(8) + 29;
                                                b2 = uh81Var.a(2);
                                            }
                                            b = 0;
                                            i4 = 0;
                                            if (i4 != 0) {
                                            }
                                            i5 = i11;
                                            i11 = i5 + i4;
                                            if (z2) {
                                            }
                                        }
                                        b = 0;
                                        if (i4 != 0) {
                                        }
                                        i5 = i11;
                                        i11 = i5 + i4;
                                        if (z2) {
                                        }
                                    }
                                    i4 = a2;
                                    z2 = z;
                                    b3 = b2;
                                }
                                b = b3;
                                c = 4;
                                if (i4 != 0) {
                                }
                                i5 = i11;
                                i11 = i5 + i4;
                                if (z2) {
                                }
                            }
                        } else {
                            bArr2 = bArr4;
                            z = false;
                            while (true) {
                                a = uh81Var.a(2);
                                if (a != 0) {
                                }
                                b = b3;
                                c = 4;
                                if (i4 != 0) {
                                }
                                i5 = i11;
                                i11 = i5 + i4;
                                if (z2) {
                                }
                                paint2 = paint;
                                z = z2;
                            }
                        }
                        break;
                    case 17:
                        byte[] bArr7 = i == 3 ? bArr5 == null ? F : bArr5 : null;
                        boolean z4 = false;
                        while (true) {
                            ?? a7 = uh81Var.a(i13);
                            if (a7 != 0) {
                                z3 = z4;
                                i6 = 1;
                                b5 = a7;
                            } else if (uh81Var.k()) {
                                if (uh81Var.k()) {
                                    int a8 = uh81Var.a(i14);
                                    if (a8 == 0) {
                                        z3 = z4;
                                        i6 = 1;
                                        b5 = 0;
                                    } else if (a8 == 1) {
                                        i6 = i14;
                                        z3 = z4;
                                        b5 = 0;
                                    } else if (a8 == i14) {
                                        a3 = uh81Var.a(i13) + 9;
                                        b4 = uh81Var.a(i13);
                                    } else if (a8 != 3) {
                                        z3 = z4;
                                        b5 = 0;
                                        i6 = 0;
                                    } else {
                                        a3 = uh81Var.a(8) + 25;
                                        b4 = uh81Var.a(i13);
                                    }
                                } else {
                                    a3 = uh81Var.a(i14) + i13;
                                    b4 = uh81Var.a(i13);
                                }
                                i6 = a3;
                                z3 = z4;
                                b5 = b4;
                            } else {
                                int a9 = uh81Var.a(3);
                                if (a9 != 0) {
                                    i6 = a9 + 2;
                                    z3 = z4;
                                    b5 = 0;
                                } else {
                                    z3 = true;
                                    b5 = 0;
                                    i6 = 0;
                                }
                            }
                            if (i6 == 0 || paint2 == null) {
                                i7 = i11;
                                i8 = i14;
                            } else {
                                if (bArr7 != null) {
                                    b5 = bArr7[b5];
                                }
                                paint2.setColor(iArr[b5]);
                                i7 = i11;
                                i8 = 2;
                                canvas.drawRect(i11, i12, i11 + i6, i12 + 1, paint2);
                            }
                            i11 = i7 + i6;
                            if (!z3) {
                                i14 = i8;
                                z4 = z3;
                                i13 = 4;
                            } else if (uh81Var.c != 0) {
                                uh81Var.c = 0;
                                uh81Var.b++;
                                uh81Var.c();
                                break;
                            } else {
                                continue;
                            }
                        }
                    case 18:
                        int i16 = i11;
                        int i17 = 0;
                        while (true) {
                            int a10 = uh81Var.a(8);
                            if (a10 != 0) {
                                i9 = i17;
                                a4 = i15;
                            } else if (uh81Var.k()) {
                                i9 = i17;
                                a4 = uh81Var.a(7);
                                a10 = uh81Var.a(8);
                            } else {
                                int a11 = uh81Var.a(7);
                                if (a11 != 0) {
                                    i9 = i17;
                                    a4 = a11;
                                    a10 = 0;
                                } else {
                                    i9 = i15;
                                    a10 = 0;
                                    a4 = 0;
                                }
                            }
                            if (a4 == 0 || paint2 == null) {
                                i10 = i15;
                            } else {
                                paint2.setColor(iArr[a10]);
                                i10 = i15;
                                canvas.drawRect(i16, i12, i16 + a4, i12 + 1, paint2);
                            }
                            i16 += a4;
                            if (i9 != 0) {
                                i11 = i16;
                                continue;
                            } else {
                                i15 = i10;
                                i17 = i9;
                            }
                        }
                    default:
                        switch (a5) {
                            case 32:
                                bArr6 = new byte[4];
                                for (int i18 = 0; i18 < 4; i18++) {
                                    bArr6[i18] = (byte) uh81Var.a(4);
                                }
                                break;
                            case 33:
                                bArr4 = new byte[4];
                                for (int i19 = 0; i19 < 4; i19++) {
                                    bArr4[i19] = (byte) uh81Var.a(8);
                                }
                                break;
                            case 34:
                                bArr5 = new byte[16];
                                for (int i20 = 0; i20 < 16; i20++) {
                                    bArr5[i20] = (byte) uh81Var.a(8);
                                }
                                break;
                            default:
                                continue;
                        }
                }
            } else {
                i12 += 2;
                i11 = i2;
            }
            paint2 = paint;
        }
    }

    public static int[] h() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = a(255, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                int i2 = i & 1;
                int i3 = HProv.PP_VERSION_TIMESTAMP;
                int i4 = i2 != 0 ? 127 : 0;
                int i5 = (i & 2) != 0 ? 127 : 0;
                if ((i & 4) == 0) {
                    i3 = 0;
                }
                iArr[i] = a(255, i4, i5, i3);
            }
        }
        return iArr;
    }

    public static int[] i() {
        int i;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            if (i2 < 8) {
                iArr[i2] = a(63, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) == 0 ? 0 : 255);
            } else {
                int i3 = i2 & HProv.PP_LCD_QUERY;
                int i4 = MSException.ERROR_BUSY;
                if (i3 == 0) {
                    int i5 = ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0);
                    int i6 = ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0);
                    i = (i2 & 4) == 0 ? 0 : 85;
                    if ((i2 & 64) == 0) {
                        i4 = 0;
                    }
                    iArr[i2] = a(255, i5, i6, i + i4);
                } else if (i3 == 8) {
                    int i7 = ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0);
                    int i8 = ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0);
                    i = (i2 & 4) == 0 ? 0 : 85;
                    if ((i2 & 64) == 0) {
                        i4 = 0;
                    }
                    iArr[i2] = a(HProv.PP_VERSION_TIMESTAMP, i7, i8, i + i4);
                } else if (i3 == 128) {
                    iArr[i2] = a(255, ((i2 & 1) != 0 ? 43 : 0) + HProv.PP_VERSION_TIMESTAMP + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + HProv.PP_VERSION_TIMESTAMP + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + HProv.PP_VERSION_TIMESTAMP + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i3 == 136) {
                    iArr[i2] = a(255, ((i2 & 1) != 0 ? 43 : 0) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static byte[] l(int i, int i2, df90 df90Var) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) df90Var.g(i2);
        }
        return bArr;
    }

    public static int[] v() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = y(255, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                int i2 = i & 1;
                int i3 = HProv.PP_VERSION_TIMESTAMP;
                int i4 = i2 != 0 ? 127 : 0;
                int i5 = (i & 2) != 0 ? 127 : 0;
                if ((i & 4) == 0) {
                    i3 = 0;
                }
                iArr[i] = y(255, i4, i5, i3);
            }
        }
        return iArr;
    }

    public static int[] w() {
        int i;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            if (i2 < 8) {
                iArr[i2] = y(63, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) == 0 ? 0 : 255);
            } else {
                int i3 = i2 & HProv.PP_LCD_QUERY;
                int i4 = MSException.ERROR_BUSY;
                if (i3 == 0) {
                    int i5 = ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0);
                    int i6 = ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0);
                    i = (i2 & 4) == 0 ? 0 : 85;
                    if ((i2 & 64) == 0) {
                        i4 = 0;
                    }
                    iArr[i2] = y(255, i5, i6, i + i4);
                } else if (i3 == 8) {
                    int i7 = ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0);
                    int i8 = ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0);
                    i = (i2 & 4) == 0 ? 0 : 85;
                    if ((i2 & 64) == 0) {
                        i4 = 0;
                    }
                    iArr[i2] = y(HProv.PP_VERSION_TIMESTAMP, i7, i8, i + i4);
                } else if (i3 == 128) {
                    iArr[i2] = y(255, ((i2 & 1) != 0 ? 43 : 0) + HProv.PP_VERSION_TIMESTAMP + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + HProv.PP_VERSION_TIMESTAMP + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + HProv.PP_VERSION_TIMESTAMP + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i3 == 136) {
                    iArr[i2] = y(255, ((i2 & 1) != 0 ? 43 : 0) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int y(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    public static String z() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (cvu0.x(str2, str, false)) {
            if (str2.length() <= 0) {
                return str2;
            }
            return ((Object) String.valueOf(str2.charAt(0)).toUpperCase(Locale.ROOT)) + str2.substring(1);
        }
        StringBuilder sb = new StringBuilder();
        if (str.length() > 0) {
            str = ((Object) String.valueOf(str.charAt(0)).toUpperCase(Locale.ROOT)) + str.substring(1);
        }
        sb.append(str);
        sb.append(HexString.CHAR_SPACE);
        sb.append(str2);
        return sb.toString();
    }

    public DateFormat A() {
        DateFormat timeFormat = android.text.format.DateFormat.getTimeFormat(((ole0) this.b).a);
        TimeZone d = ((dqe0) this.y).d();
        if (d == null) {
            d = TimeZone.getDefault();
        }
        timeFormat.setTimeZone(d);
        return timeFormat;
    }

    public void B(jdv jdvVar) {
        m6f0 m6f0Var;
        m6f0 m6f0Var2;
        tob1.b();
        if (((m6f0) this.a) == null) {
            Objects.toString(jdvVar);
            sgb1.g(5, "CaptureNode");
            jdvVar.close();
            return;
        }
        if (((Integer) jdvVar.G0().b().a.get(((m6f0) this.a).j)) == null) {
            sgb1.g(5, "CaptureNode");
            jdvVar.close();
            return;
        }
        tob1.b();
        w74 w74Var = (w74) this.y;
        Objects.requireNonNull(w74Var);
        w74Var.a.accept(new x74((m6f0) this.a, jdvVar));
        m6f0 m6f0Var3 = (m6f0) this.a;
        w34 w34Var = (w34) this.z;
        boolean z = w34Var != null && w34Var.h.size() > 1;
        if (z && (m6f0Var2 = (m6f0) this.a) != null) {
            m6f0Var2.b.n(jdvVar.getFormat());
        }
        if (!z || ((m6f0Var = (m6f0) this.a) != null && m6f0Var.b.l())) {
            this.a = null;
        }
        if (m6f0Var3.m != -1) {
            m6f0Var3.a(100);
        }
        n9j0 n9j0Var = m6f0Var3.i;
        n9j0Var.getClass();
        tob1.b();
        if (n9j0Var.g) {
            return;
        }
        if (!n9j0Var.h) {
            tob1.b();
            if (!n9j0Var.g && !n9j0Var.h) {
                n9j0Var.h = true;
            }
        }
        n9j0Var.e.b(null);
    }

    public void C(m6f0 m6f0Var) {
        tob1.b();
        boolean z = false;
        d6z.y("only one capture stage is supported.", m6f0Var.k.size() == 1);
        d6z.y("Too many acquire images. Close image to be able to process next.", x() > 0);
        this.a = m6f0Var;
        ni91.a(m6f0Var.l, new md6(this, m6f0Var, z, 16), geb1.b());
    }

    public yy80 D() {
        c0g c0gVar = (c0g) ((i6r) this.a);
        lx4 y1 = c0gVar.y1();
        q5z.h(y1);
        ql21 ql21Var = (ql21) c0gVar.z.I8.get();
        q5z.h(ql21Var);
        pho T1 = c0gVar.T1();
        q5z.h(T1);
        zf zfVar = new zf(T1);
        pho T12 = c0gVar.T1();
        q5z.h(T12);
        rx2 rx2Var = new rx2(T12);
        pho T13 = c0gVar.T1();
        q5z.h(T13);
        zf zfVar2 = new zf(T13);
        pho T14 = c0gVar.T1();
        q5z.h(T14);
        cug cugVar = new cug(T14);
        pho T15 = c0gVar.T1();
        q5z.h(T15);
        t61 t61Var = new t61(T15);
        pho T16 = c0gVar.T1();
        q5z.h(T16);
        jc4 jc4Var = new jc4(T16);
        pho T17 = c0gVar.T1();
        q5z.h(T17);
        rx2 rx2Var2 = new rx2(T17);
        b bVar = (b) c0gVar.z.n2.get();
        q5z.h(bVar);
        return new yy80(y1, ql21Var, zfVar, rx2Var, zfVar2, cugVar, t61Var, jc4Var, rx2Var2, bVar);
    }

    public h E() {
        c0g c0gVar = (c0g) ((i6r) this.a);
        sz80 sz80Var = (sz80) c0gVar.z.H8.get();
        q5z.h(sz80Var);
        ql21 ql21Var = (ql21) c0gVar.z.I8.get();
        q5z.h(ql21Var);
        g gVar = (g) c0gVar.z.Xo.get();
        q5z.h(gVar);
        j0 f1 = c0gVar.z.f1();
        lw90 lw90Var = (lw90) c0gVar.z.E9.get();
        c0gVar.getClass();
        return new h(sz80Var, ql21Var, gVar, f1, lw90Var, new uea0());
    }

    public k F() {
        i6r i6rVar = (i6r) this.a;
        c0g c0gVar = (c0g) i6rVar;
        tse tseVar = (tse) c0gVar.B.get();
        q5z.h(tseVar);
        sz80 sz80Var = (sz80) ((c0g) i6rVar).z.H8.get();
        q5z.h(sz80Var);
        aq80 aq80Var = new aq80(sz80Var);
        h3y a = i5m.a((e840) this.y);
        h3y a2 = i5m.a((z4g) this.x);
        com.yandex.go.overdraft.ui.g gVar = (com.yandex.go.overdraft.ui.g) c0gVar.WA.get();
        q5z.h(gVar);
        ycq0 ycq0Var = (ycq0) c0gVar.z.Xi.get();
        yy80 D2 = D();
        OverdraftContext overdraftContext = (OverdraftContext) this.c;
        yj70 yj70Var = (yj70) this.b;
        z4g z4gVar = (z4g) this.z;
        oep0 a6 = c0gVar.a6();
        q5z.h(a6);
        fvt fvtVar = (fvt) c0gVar.z.Z8.get();
        q5z.h(fvtVar);
        tt2 k = c0gVar.k();
        q5z.h(k);
        return new k(tseVar, aq80Var, a, a2, gVar, ycq0Var, D2, overdraftContext, yj70Var, z4gVar, a6, fvtVar, k);
    }

    public void J(w7x0 w7x0Var) {
        boolean z;
        tob1.b();
        m6f0 m6f0Var = (m6f0) this.a;
        if (m6f0Var == null || m6f0Var.a != w7x0Var.b()) {
            return;
        }
        m6f0 m6f0Var2 = (m6f0) this.a;
        ImageCaptureException a = w7x0Var.a();
        n9j0 n9j0Var = m6f0Var2.i;
        b8x0 b8x0Var = n9j0Var.a;
        tob1.b();
        if (n9j0Var.g) {
            return;
        }
        tob1.b();
        int i = b8x0Var.a;
        if (i > 0) {
            z = true;
            b8x0Var.a = i - 1;
        } else {
            z = false;
        }
        int i2 = 3;
        if (!z) {
            tob1.b();
            b8x0 b8x0Var2 = n9j0Var.a;
            b8x0Var2.a().execute(new y7x0(i2, b8x0Var2, a));
        }
        n9j0Var.a();
        n9j0Var.e.d(a);
        if (z) {
            z7x0 z7x0Var = n9j0Var.b;
            tob1.b();
            sgb1.g(3, "TakePictureManagerImpl");
            z7x0Var.a.addFirst(b8x0Var);
            z7x0Var.c();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void K() {
        DebugPanelInfoItem$LogDetails$DebugPanelLogLevel debugPanelInfoItem$LogDetails$DebugPanelLogLevel;
        i3y i3yVar = skd0.a;
        ReentrantLock reentrantLock = sop0.b;
        reentrantLock.lock();
        try {
            ArrayList arrayList = new ArrayList(sop0.c);
            reentrantLock.unlock();
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it = arrayList.iterator();
            int i = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i < 0) {
                    scc.m();
                    throw null;
                }
                pkd0 pkd0Var = (pkd0) next;
                String upperCase = pkd0Var.d.toUpperCase(Locale.ROOT);
                switch (upperCase.hashCode()) {
                    case 2251950:
                        if (upperCase.equals("INFO")) {
                            debugPanelInfoItem$LogDetails$DebugPanelLogLevel = DebugPanelInfoItem$LogDetails$DebugPanelLogLevel.INFO;
                            break;
                        }
                        debugPanelInfoItem$LogDetails$DebugPanelLogLevel = DebugPanelInfoItem$LogDetails$DebugPanelLogLevel.UNSPECIFIED;
                        break;
                    case 2656902:
                        if (upperCase.equals("WARN")) {
                            debugPanelInfoItem$LogDetails$DebugPanelLogLevel = DebugPanelInfoItem$LogDetails$DebugPanelLogLevel.WARN;
                            break;
                        }
                        debugPanelInfoItem$LogDetails$DebugPanelLogLevel = DebugPanelInfoItem$LogDetails$DebugPanelLogLevel.UNSPECIFIED;
                        break;
                    case 64921139:
                        if (upperCase.equals("DEBUG")) {
                            debugPanelInfoItem$LogDetails$DebugPanelLogLevel = DebugPanelInfoItem$LogDetails$DebugPanelLogLevel.DEBUG;
                            break;
                        }
                        debugPanelInfoItem$LogDetails$DebugPanelLogLevel = DebugPanelInfoItem$LogDetails$DebugPanelLogLevel.UNSPECIFIED;
                        break;
                    case 66247144:
                        if (upperCase.equals("ERROR")) {
                            debugPanelInfoItem$LogDetails$DebugPanelLogLevel = DebugPanelInfoItem$LogDetails$DebugPanelLogLevel.ERROR;
                            break;
                        }
                        debugPanelInfoItem$LogDetails$DebugPanelLogLevel = DebugPanelInfoItem$LogDetails$DebugPanelLogLevel.UNSPECIFIED;
                        break;
                    case 1069090146:
                        if (upperCase.equals("VERBOSE")) {
                            debugPanelInfoItem$LogDetails$DebugPanelLogLevel = DebugPanelInfoItem$LogDetails$DebugPanelLogLevel.VERBOSE;
                            break;
                        }
                        debugPanelInfoItem$LogDetails$DebugPanelLogLevel = DebugPanelInfoItem$LogDetails$DebugPanelLogLevel.UNSPECIFIED;
                        break;
                    default:
                        debugPanelInfoItem$LogDetails$DebugPanelLogLevel = DebugPanelInfoItem$LogDetails$DebugPanelLogLevel.UNSPECIFIED;
                        break;
                }
                arrayList2.add(new rvg(String.valueOf(i), new svg(pkd0Var.a, pkd0Var.b, pkd0Var.c, debugPanelInfoItem$LogDetails$DebugPanelLogLevel, pkd0Var.e, pkd0Var.f, pkd0Var.g, pkd0Var.h, pkd0Var.i, pkd0Var.j)));
                i = i2;
            }
            r0 r0Var = (r0) this.w;
            r0Var.getClass();
            r0Var.m(null, arrayList2);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x0261, code lost:
    
        if ((r3.b + 1) == ((android.graphics.Bitmap) r29.w).getHeight()) goto L83;
     */
    @Override // defpackage.q2v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(byte[] bArr, int i, int i2, p2v0 p2v0Var, c9e c9eVar) {
        int i3;
        tdf tdfVar;
        int i4;
        int i5;
        ArrayList arrayList;
        c4n c4nVar;
        char c;
        char c2;
        int i6;
        char c3;
        int i7;
        i4n i4nVar;
        g4n g4nVar;
        int i8;
        int i9;
        int i10;
        int i11;
        g4n g4nVar2;
        int i12;
        int i13;
        int i14;
        int i15;
        df90 df90Var = new df90(bArr, i + i2);
        df90Var.m(i);
        Paint paint = (Paint) this.b;
        Canvas canvas = (Canvas) this.c;
        i4n i4nVar2 = (i4n) this.z;
        while (df90Var.b() >= 48 && df90Var.g(8) == 15) {
            int g = df90Var.g(8);
            int i16 = 16;
            int g2 = df90Var.g(16);
            int g3 = df90Var.g(16);
            int d = df90Var.d() + g3;
            if (g3 * 8 > df90Var.b()) {
                lk91.j("Data field length exceeds limit");
                df90Var.o(df90Var.b());
            } else {
                int i17 = 4;
                switch (g) {
                    case 16:
                        if (g2 == i4nVar2.a) {
                            e4n e4nVar = (e4n) i4nVar2.i;
                            int i18 = 8;
                            df90Var.g(8);
                            int g4 = df90Var.g(4);
                            int g5 = df90Var.g(2);
                            df90Var.o(2);
                            int i19 = g3 - 2;
                            SparseArray sparseArray = new SparseArray();
                            while (i19 > 0) {
                                int g6 = df90Var.g(i18);
                                df90Var.o(i18);
                                i19 -= 6;
                                sparseArray.put(g6, new f4n(df90Var.g(16), df90Var.g(16)));
                                i18 = 8;
                            }
                            e4n e4nVar2 = new e4n(g4, g5, sparseArray);
                            if (g5 != 0) {
                                i4nVar2.i = e4nVar2;
                                ((SparseArray) i4nVar2.c).clear();
                                ((SparseArray) i4nVar2.d).clear();
                                ((SparseArray) i4nVar2.e).clear();
                                break;
                            } else if (e4nVar != null && e4nVar.a != g4) {
                                i4nVar2.i = e4nVar2;
                                break;
                            }
                        }
                        break;
                    case 17:
                        e4n e4nVar3 = (e4n) i4nVar2.i;
                        SparseArray sparseArray2 = (SparseArray) i4nVar2.c;
                        if (g2 == i4nVar2.a && e4nVar3 != null) {
                            int g7 = df90Var.g(8);
                            df90Var.o(4);
                            boolean f = df90Var.f();
                            df90Var.o(3);
                            int g8 = df90Var.g(16);
                            int g9 = df90Var.g(16);
                            df90Var.g(3);
                            int g10 = df90Var.g(3);
                            df90Var.o(2);
                            int g11 = df90Var.g(8);
                            int g12 = df90Var.g(8);
                            int g13 = df90Var.g(4);
                            int g14 = df90Var.g(2);
                            df90Var.o(2);
                            int i20 = g3 - 10;
                            SparseArray sparseArray3 = new SparseArray();
                            while (i20 > 0) {
                                int g15 = df90Var.g(i16);
                                int g16 = df90Var.g(2);
                                df90Var.g(2);
                                int g17 = df90Var.g(12);
                                df90Var.o(i17);
                                int g18 = df90Var.g(12);
                                int i21 = i20 - 6;
                                if (g16 == 1 || g16 == 2) {
                                    df90Var.g(8);
                                    df90Var.g(8);
                                    i20 -= 8;
                                } else {
                                    i20 = i21;
                                }
                                sparseArray3.put(g15, new h4n(g17, g18));
                                i17 = 4;
                                i16 = 16;
                            }
                            g4n g4nVar3 = new g4n(g7, f, g8, g9, g10, g11, g12, g13, g14, sparseArray3);
                            if (e4nVar3.b == 0 && (g4nVar2 = (g4n) sparseArray2.get(g7)) != null) {
                                SparseArray sparseArray4 = g4nVar2.j;
                                for (int i22 = 0; i22 < sparseArray4.size(); i22++) {
                                    g4nVar3.j.put(sparseArray4.keyAt(i22), (h4n) sparseArray4.valueAt(i22));
                                }
                            }
                            sparseArray2.put(g4nVar3.a, g4nVar3);
                            break;
                        }
                        break;
                    case 18:
                        if (g2 == i4nVar2.a) {
                            b4n H = H(df90Var, g3);
                            ((SparseArray) i4nVar2.d).put(H.a, H);
                            break;
                        } else if (g2 == i4nVar2.b) {
                            b4n H2 = H(df90Var, g3);
                            ((SparseArray) i4nVar2.f).put(H2.a, H2);
                            break;
                        }
                        break;
                    case 19:
                        if (g2 == i4nVar2.a) {
                            d4n I = I(df90Var);
                            ((SparseArray) i4nVar2.e).put(I.a, I);
                            break;
                        } else if (g2 == i4nVar2.b) {
                            d4n I2 = I(df90Var);
                            ((SparseArray) i4nVar2.g).put(I2.a, I2);
                            break;
                        }
                        break;
                    case 20:
                        if (g2 == i4nVar2.a) {
                            df90Var.o(4);
                            boolean f2 = df90Var.f();
                            df90Var.o(3);
                            int g19 = df90Var.g(16);
                            int g20 = df90Var.g(16);
                            if (f2) {
                                int g21 = df90Var.g(16);
                                i12 = df90Var.g(16);
                                i15 = df90Var.g(16);
                                i13 = df90Var.g(16);
                                i14 = g21;
                            } else {
                                i12 = g19;
                                i13 = g20;
                                i14 = 0;
                                i15 = 0;
                            }
                            i4nVar2.h = new c4n(g19, g20, i14, i12, i15, i13);
                            break;
                        }
                        break;
                }
                df90Var.p(d - df90Var.d());
            }
        }
        e4n e4nVar4 = (e4n) i4nVar2.i;
        if (e4nVar4 == null) {
            tdfVar = new tdf(ImmutableList.p(), -9223372036854775807L, -9223372036854775807L);
        } else {
            c4n c4nVar2 = (c4n) i4nVar2.h;
            if (c4nVar2 == null) {
                c4nVar2 = (c4n) this.x;
            }
            Bitmap bitmap = (Bitmap) this.w;
            if (bitmap != null) {
                i3 = 1;
                if (c4nVar2.a + 1 == bitmap.getWidth()) {
                }
            } else {
                i3 = 1;
            }
            Bitmap createBitmap = Bitmap.createBitmap(c4nVar2.a + i3, c4nVar2.b + i3, Bitmap.Config.ARGB_8888);
            this.w = createBitmap;
            canvas.setBitmap(createBitmap);
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray5 = e4nVar4.c;
            int i23 = 0;
            while (i23 < sparseArray5.size()) {
                canvas.save();
                f4n f4nVar = (f4n) sparseArray5.valueAt(i23);
                g4n g4nVar4 = (g4n) ((SparseArray) i4nVar2.c).get(sparseArray5.keyAt(i23));
                int i24 = f4nVar.a + c4nVar2.c;
                int i25 = f4nVar.b + c4nVar2.e;
                int i26 = g4nVar4.c;
                int i27 = g4nVar4.f;
                int i28 = g4nVar4.d;
                int i29 = i24 + i26;
                int i30 = i25 + i28;
                SparseArray sparseArray6 = sparseArray5;
                canvas.clipRect(i24, i25, Math.min(i29, c4nVar2.d), Math.min(i30, c4nVar2.f));
                b4n b4nVar = (b4n) ((SparseArray) i4nVar2.d).get(i27);
                if (b4nVar == null && (b4nVar = (b4n) ((SparseArray) i4nVar2.f).get(i27)) == null) {
                    b4nVar = (b4n) this.y;
                }
                SparseArray sparseArray7 = g4nVar4.j;
                c4n c4nVar3 = c4nVar2;
                int i31 = 0;
                while (i31 < sparseArray7.size()) {
                    int keyAt = sparseArray7.keyAt(i31);
                    int i32 = i23;
                    h4n h4nVar = (h4n) sparseArray7.valueAt(i31);
                    SparseArray sparseArray8 = sparseArray7;
                    d4n d4nVar = (d4n) ((SparseArray) i4nVar2.e).get(keyAt);
                    if (d4nVar == null) {
                        d4nVar = (d4n) ((SparseArray) i4nVar2.g).get(keyAt);
                    }
                    d4n d4nVar2 = d4nVar;
                    if (d4nVar2 != null) {
                        Paint paint2 = d4nVar2.b ? null : (Paint) this.a;
                        int i33 = i24;
                        int i34 = g4nVar4.e;
                        i4nVar = i4nVar2;
                        int i35 = i33 + h4nVar.a;
                        int i36 = h4nVar.b + i25;
                        int i37 = i28;
                        Paint paint3 = paint2;
                        g4n g4nVar5 = g4nVar4;
                        int[] iArr = i34 == 3 ? b4nVar.d : i34 == 2 ? b4nVar.c : b4nVar.b;
                        g4nVar = g4nVar5;
                        i8 = i33;
                        i10 = i31;
                        i9 = i26;
                        i11 = i37;
                        G(d4nVar2.c, iArr, i34, i35, i36, paint3, canvas);
                        G(d4nVar2.d, iArr, i34, i35, i36 + 1, paint3, canvas);
                    } else {
                        i4nVar = i4nVar2;
                        g4nVar = g4nVar4;
                        i8 = i24;
                        i9 = i26;
                        i10 = i31;
                        i11 = i28;
                    }
                    i31 = i10 + 1;
                    g4nVar4 = g4nVar;
                    i24 = i8;
                    sparseArray7 = sparseArray8;
                    i23 = i32;
                    i4nVar2 = i4nVar;
                    i26 = i9;
                    i28 = i11;
                }
                i4n i4nVar3 = i4nVar2;
                int i38 = i23;
                g4n g4nVar6 = g4nVar4;
                int i39 = i24;
                int i40 = i26;
                int i41 = i28;
                if (g4nVar6.b) {
                    int i42 = g4nVar6.e;
                    if (i42 == 3) {
                        i7 = b4nVar.d[g4nVar6.g];
                        c3 = 2;
                    } else {
                        c3 = 2;
                        i7 = i42 == 2 ? b4nVar.c[g4nVar6.h] : b4nVar.b[g4nVar6.i];
                    }
                    paint.setColor(i7);
                    i4 = i39;
                    c2 = c3;
                    c4nVar = c4nVar3;
                    i6 = 0;
                    c = 3;
                    i5 = i25;
                    arrayList = arrayList2;
                    canvas.drawRect(i4, i25, i29, i30, paint);
                } else {
                    i4 = i39;
                    i5 = i25;
                    arrayList = arrayList2;
                    c4nVar = c4nVar3;
                    c = 3;
                    c2 = 2;
                    i6 = 0;
                }
                ndf ndfVar = new ndf();
                ndfVar.b = Bitmap.createBitmap((Bitmap) this.w, i4, i5, i40, i41);
                float f3 = c4nVar.a;
                ndfVar.h = i4 / f3;
                ndfVar.i = i6;
                float f4 = i5;
                float f5 = c4nVar.b;
                ndfVar.e = f4 / f5;
                ndfVar.f = i6;
                ndfVar.g = i6;
                ndfVar.l = i40 / f3;
                ndfVar.m = i41 / f5;
                arrayList.add(ndfVar.a());
                canvas.drawColor(i6, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i23 = i38 + 1;
                c4nVar2 = c4nVar;
                arrayList2 = arrayList;
                sparseArray5 = sparseArray6;
                i4nVar2 = i4nVar3;
            }
            tdfVar = new tdf(arrayList2, -9223372036854775807L, -9223372036854775807L);
        }
        c9eVar.accept(tdfVar);
    }

    @Override // defpackage.q2v0
    public int f() {
        return 2;
    }

    public j34 j() {
        String str = ((String) this.a) == null ? " mimeType" : "";
        if (((Timebase) this.c) == null) {
            str = str.concat(" inputTimebase");
        }
        if (((Integer) this.x) == null) {
            str = str.concat(" bitrate");
        }
        if (((Integer) this.y) == null) {
            str = str.concat(" captureSampleRate");
        }
        if (((Integer) this.z) == null) {
            str = str.concat(" encodeSampleRate");
        }
        if (((Integer) this.w) == null) {
            str = str.concat(" channelCount");
        }
        if (!str.isEmpty()) {
            ny61.r("Missing required properties:".concat(str));
            return null;
        }
        String str2 = (String) this.a;
        int intValue = ((Integer) this.b).intValue();
        j34 j34Var = new j34(str2, intValue, (Timebase) this.c, ((Integer) this.x).intValue(), ((Integer) this.y).intValue(), ((Integer) this.z).intValue(), ((Integer) this.w).intValue());
        if (!Objects.equals(str2, "audio/mp4a-latm") || intValue != -1) {
            return j34Var;
        }
        ny61.g("Encoder mime set to AAC, but no AAC profile was provided.");
        return null;
    }

    public o84 k() {
        String str = ((Size) this.a) == null ? " resolution" : "";
        if (((Size) this.b) == null) {
            str = str.concat(" originalConfiguredResolution");
        }
        if (((q8n) this.c) == null) {
            str = str.concat(" dynamicRange");
        }
        if (((Integer) this.x) == null) {
            str = str.concat(" sessionType");
        }
        if (((Range) this.y) == null) {
            str = str.concat(" expectedFrameRateRange");
        }
        if (((Boolean) this.w) == null) {
            str = str.concat(" zslDisabled");
        }
        if (str.isEmpty()) {
            return new o84((Size) this.a, (Size) this.b, (q8n) this.c, ((Integer) this.x).intValue(), (Range) this.y, (szd) this.z, ((Boolean) this.w).booleanValue());
        }
        ny61.r("Missing required properties:".concat(str));
        return null;
    }

    public qwe m() {
        zwe zweVar = (zwe) this.c;
        jve jveVar = (jve) this.b;
        uxe uxeVar = (uxe) this.x;
        gwe gweVar = (gwe) this.a;
        zuj0 zuj0Var = gweVar.e;
        q5z.h(zuj0Var);
        lwe lweVar = new lwe(zweVar, jveVar, uxeVar, zuj0Var, new gyc((zwe) this.c));
        an8 an8Var = new an8(new wwe(), jveVar, (w030) this.y, (Context) this.z, this);
        hwe hweVar = (hwe) this.w;
        lx4 lx4Var = gweVar.b;
        q5z.h(lx4Var);
        pho phoVar = gweVar.c;
        q5z.h(phoVar);
        return new qwe(lweVar, an8Var, hweVar, new kwe(lx4Var, new b1(phoVar), jveVar, hweVar));
    }

    public e n() {
        c0g c0gVar = (c0g) ((i6r) this.a);
        zuj0 c = c0gVar.c();
        q5z.h(c);
        Context n0 = c0gVar.n0();
        q5z.h(n0);
        pdc F1 = c0gVar.F1();
        q5z.h(F1);
        cba0 cba0Var = (cba0) c0gVar.z.vj.get();
        xdf o1 = c0gVar.o1();
        q5z.h(o1);
        OverdraftContext overdraftContext = (OverdraftContext) this.c;
        c0gVar.getClass();
        u uVar = (u) c0gVar.z.V1.get();
        q5z.h(uVar);
        com.yandex.go.overdraft.domain.a aVar = new com.yandex.go.overdraft.domain.a(overdraftContext, uVar);
        eq51 eq51Var = (eq51) c0gVar.z.gi.get();
        q5z.h(eq51Var);
        return new e(c, n0, F1, cba0Var, o1, aVar, eq51Var, c0gVar.O5(), c0gVar.z.b1());
    }

    public f28 o() {
        i6r i6rVar = (i6r) this.a;
        c0g c0gVar = (c0g) i6rVar;
        w030 B5 = c0gVar.B5();
        q5z.h(B5);
        Context n0 = c0gVar.n0();
        q5z.h(n0);
        yj70 yj70Var = (yj70) this.b;
        h3y a = i5m.a((z4g) this.x);
        yy80 D2 = D();
        k F2 = F();
        h E2 = E();
        sz80 sz80Var = (sz80) ((c0g) i6rVar).z.H8.get();
        q5z.h(sz80Var);
        aq80 aq80Var = new aq80(sz80Var);
        o oVar = (o) c0gVar.z.H6.get();
        q5z.h(oVar);
        return new f28((Object) n0, (Object) new dug(yj70Var, a, D2, F2, E2, aq80Var, oVar, n(), (OverdraftContext) this.c), B5, (Object) c0gVar.M5(), 4);
    }

    public void p(float f, float f2, float f3, float f4, float[] fArr) {
        Canvas canvas = (Canvas) this.c;
        rvo rvoVar = (rvo) this.z;
        RectF rectF = new RectF();
        rectF.set(f, f2, f3, f4);
        agl aglVar = (agl) this.y;
        Object a = aglVar != null ? aglVar.a() : null;
        if (a instanceof wal) {
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(((Number) ((wal) a).a.a(rvoVar)).intValue());
            Path path = new Path();
            path.reset();
            if (fArr == null) {
                path.addRect(rectF, Path.Direction.CW);
            } else {
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
            }
            path.close();
            canvas.drawPath(path, paint);
        }
        hgl hglVar = (hgl) this.x;
        if ((hglVar != null ? hglVar.b : null) == null) {
            return;
        }
        RectF rectF2 = new RectF();
        float I = gwk0.I(hglVar.b, rvoVar, (DisplayMetrics) this.b) / 2.0f;
        rectF2.set(Math.max(0.0f, f + I), Math.max(0.0f, f2 + I), Math.max(0.0f, f3 - I), Math.max(0.0f, f4 - I));
        float[] fArr2 = fArr != null ? (float[]) fArr.clone() : null;
        if (fArr2 != null) {
            int length = fArr2.length;
            for (int i = 0; i < length; i++) {
                fArr2[i] = Math.max(0.0f, fArr[i] - I);
            }
        }
        Path path2 = new Path();
        path2.reset();
        if (fArr2 == null) {
            path2.addRect(rectF2, Path.Direction.CW);
        } else {
            path2.addRoundRect(rectF2, fArr2, Path.Direction.CW);
        }
        path2.close();
        canvas.drawPath(path2, (Paint) this.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0023, code lost:
    
        if (r3 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0026, code lost:
    
        r0 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0030, code lost:
    
        if (r3 != null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String q(bus0 bus0Var, String str, TimetableInfo timetableInfo, Calendar calendar) {
        String str2;
        String str3;
        String str4;
        String str5 = "";
        if (calendar == null || (str2 = r(calendar)) == null) {
            str2 = "";
        }
        if (timetableInfo == null || (str3 = timetableInfo.c) == null) {
            str3 = "";
        }
        if (bus0Var instanceof zts0) {
            str5 = ((zts0) bus0Var).c;
        } else if (bus0Var instanceof yts0) {
            if (timetableInfo != null) {
                str4 = timetableInfo.b;
            }
        } else {
            if (!(bus0Var instanceof aus0)) {
                w511.b();
                return null;
            }
            if (timetableInfo != null) {
                str4 = timetableInfo.a;
            }
        }
        return oyr.t(oyr.w(str, " ", str2, " ", str3), " ", str5);
    }

    public String r(Calendar calendar) {
        zuj0 zuj0Var = (zuj0) this.a;
        nf7 nf7Var = (nf7) this.x;
        boolean z = calendar.getTimeZone().getRawOffset() == TimeZone.getDefault().getRawOffset();
        if (z && nf7Var.c(calendar)) {
            return ((avj0) zuj0Var).h(kyh0.date_today);
        }
        if (z && nf7Var.d(calendar)) {
            return ((avj0) zuj0Var).h(kyh0.date_tomorrow);
        }
        String str = (String) this.w;
        TimeZone d = ((dqe0) this.y).d();
        if (d == null) {
            d = TimeZone.getDefault();
        }
        ((j5z) this.c).getClass();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, j5z.e());
        simpleDateFormat.setTimeZone(d);
        String format = simpleDateFormat.format(calendar.getTime());
        if (format == null) {
            format = "";
        }
        return d6z.j(format);
    }

    @Override // defpackage.q2v0
    public void reset() {
        i4n i4nVar = (i4n) this.z;
        ((SparseArray) i4nVar.c).clear();
        ((SparseArray) i4nVar.d).clear();
        ((SparseArray) i4nVar.e).clear();
        ((SparseArray) i4nVar.f).clear();
        ((SparseArray) i4nVar.g).clear();
        i4nVar.h = null;
        i4nVar.i = null;
    }

    public String s(Calendar calendar, int i) {
        zuj0 zuj0Var = (zuj0) this.a;
        if (calendar == null) {
            return ((avj0) zuj0Var).h(kyh0.due_chart_ondemand_slot);
        }
        DateFormat A2 = A();
        if (i <= 0) {
            return A2.format(calendar.getTime());
        }
        return t(i, ((avj0) zuj0Var).h(kyh0.due_chart_departure_time), "$START_TIME$", "$END_TIME$", calendar);
    }

    public String t(int i, String str, String str2, String str3, Calendar calendar) {
        DateFormat A2 = A();
        Calendar a = wf7.a(calendar);
        a.add(12, i);
        a.getTimeInMillis();
        return cvu0.v(cvu0.v(str, str2, A2.format(calendar.getTime()), false), str3, A2.format(a.getTime()), false);
    }

    public String u(Calendar calendar) {
        if (calendar != null) {
            return A().format(calendar.getTime());
        }
        return ((avj0) ((zuj0) this.a)).h(kyh0.due_chart_ondemand_slot);
    }

    public int x() {
        int l;
        tob1.b();
        d6z.y("The ImageReader is not initialized.", ((mdl0) this.b) != null);
        mdl0 mdl0Var = (mdl0) this.b;
        synchronized (mdl0Var.c) {
            l = ((pdv) mdl0Var.w).l() - mdl0Var.a;
        }
        return l;
    }

    public j4n(Context context) {
        this.w = "";
        this.a = context;
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(context, w0i0.Messaging_Theme_BottomSheetDialog);
        this.b = bottomSheetDialog;
        bottomSheetDialog.setCancelable(true);
        bottomSheetDialog.setCanceledOnTouchOutside(true);
        bottomSheetDialog.setContentView(olh0.msg_d_report_menu);
        bottomSheetDialog.setOnCancelListener(new yf6(1, this));
        TextView textView = (TextView) bottomSheetDialog.findViewById(e9h0.report_inappropriate);
        Objects.requireNonNull(textView);
        this.c = textView;
        TextView textView2 = (TextView) bottomSheetDialog.findViewById(e9h0.report_spam);
        Objects.requireNonNull(textView2);
        this.x = textView2;
        TextView textView3 = (TextView) bottomSheetDialog.findViewById(e9h0.report_abuse);
        Objects.requireNonNull(textView3);
        this.y = textView3;
        View findViewById = bottomSheetDialog.findViewById(e9h0.report_cancel);
        Objects.requireNonNull(findViewById);
        findViewById.setOnClickListener(new ci8(10, this));
    }

    public j4n(gwe gweVar, zwe zweVar, jve jveVar, uxe uxeVar, w030 w030Var, Context context, hwe hweVar) {
        this.a = gweVar;
        this.b = jveVar;
        this.c = zweVar;
        this.x = uxeVar;
        this.y = w030Var;
        this.z = context;
        this.w = hweVar;
    }

    public /* synthetic */ j4n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.x = obj4;
        this.y = obj5;
        this.z = obj6;
        this.w = obj7;
    }
}
