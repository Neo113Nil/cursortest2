package defpackage;

import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.os.Build;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.yandex.go.yb.api.domain.model.YbScreenSource;
import com.yandex.go.yb.c;
import com.yandex.go.yb.data.h;
import com.ybsdk.widgets.common.FrameLayoutAddViewAware;
import io.appmetrica.analytics.blewrapper.impl.f;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.UUID;
import yads.aa2;
import yads.bj1;
import yads.c01;
import yads.ck;
import yads.d83;
import yads.e01;
import yads.ek;
import yads.fj1;
import yads.it0;
import yads.jc2;
import yads.jk3;
import yads.kk0;
import yads.lk0;
import yads.nz2;
import yads.o83;
import yads.t31;
import yads.wk2;
import yads.zm0;

/* loaded from: classes7.dex */
public final /* synthetic */ class gs51 implements bx60, lh51, wf81, FunctionWithThrowable, zq81, m071, ly71, ov71 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gs51(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0068  */
    @Override // defpackage.m071
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wk2 a(int i, tu71 tu71Var, int[] iArr) {
        zu81 zu81Var;
        boolean z;
        int i2;
        int i3;
        zu81 zu81Var2;
        int i4;
        int i5;
        int i6;
        Point point;
        int i7;
        int i8;
        tu71 tu71Var2 = tu71Var;
        int i9 = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i9) {
            case 7:
                zu81 zu81Var3 = (zu81) obj2;
                String str = (String) obj;
                p481 p481Var = t31.b;
                ela1.a(4, "initialCapacity");
                Object[] objArr = new Object[4];
                int i10 = 0;
                int i11 = 0;
                while (i10 < tu71Var2.a) {
                    lp61 lp61Var = new lp61(i, tu71Var2, i10, zu81Var3, iArr[i10], str);
                    int i12 = i11 + 1;
                    if (objArr.length < i12) {
                        objArr = Arrays.copyOf(objArr, jr71.a(objArr.length, i12));
                    }
                    objArr[i11] = lp61Var;
                    i10++;
                    tu71Var2 = tu71Var;
                    i11 = i12;
                }
                return t31.p(i11, objArr);
            default:
                qd81[] qd81VarArr = tu71Var2.w;
                int i13 = tu71Var2.a;
                zu81 zu81Var4 = (zu81) obj2;
                int i14 = ((int[]) obj)[i];
                int i15 = zu81Var4.B;
                int i16 = zu81Var4.C;
                boolean z2 = zu81Var4.D;
                if (i15 == Integer.MAX_VALUE || i16 == Integer.MAX_VALUE) {
                    zu81Var = zu81Var4;
                    z = true;
                    i2 = Integer.MAX_VALUE;
                } else {
                    i2 = Integer.MAX_VALUE;
                    int i17 = 0;
                    while (i17 < i13) {
                        qd81 qd81Var = qd81VarArr[i17];
                        int i18 = qd81Var.J;
                        int i19 = qd81Var.K;
                        if (i18 <= 0 || i19 <= 0) {
                            zu81Var2 = zu81Var4;
                            i4 = i15;
                        } else {
                            if (z2) {
                                if ((i18 > i19) != (i15 > i16)) {
                                    i6 = i15;
                                    i5 = i16;
                                    zu81Var2 = zu81Var4;
                                    i4 = i15;
                                    if (i18 * i6 < i19 * i5) {
                                        int i20 = rf71.a;
                                        point = new Point(i5, ((r1 + i18) - 1) / i18);
                                    } else {
                                        int i21 = rf71.a;
                                        point = new Point(((r0 + i19) - 1) / i19, i6);
                                    }
                                    i7 = qd81Var.J;
                                    i8 = i7 * i19;
                                    if (i7 >= ((int) (point.x * 0.98f)) && i19 >= ((int) (point.y * 0.98f)) && i8 < i2) {
                                        i2 = i8;
                                    }
                                }
                            }
                            i5 = i15;
                            i6 = i16;
                            zu81Var2 = zu81Var4;
                            i4 = i15;
                            if (i18 * i6 < i19 * i5) {
                            }
                            i7 = qd81Var.J;
                            i8 = i7 * i19;
                            if (i7 >= ((int) (point.x * 0.98f))) {
                                i2 = i8;
                            }
                        }
                        i17++;
                        zu81Var4 = zu81Var2;
                        i15 = i4;
                    }
                    zu81Var = zu81Var4;
                    z = true;
                }
                p481 p481Var2 = t31.b;
                ela1.a(4, "initialCapacity");
                Object[] objArr2 = new Object[4];
                int i22 = 0;
                int i23 = 0;
                while (i22 < i13) {
                    qd81 qd81Var2 = qd81VarArr[i22];
                    int i24 = qd81Var2.J;
                    int i25 = (i24 == -1 || (i3 = qd81Var2.K) == -1) ? -1 : i24 * i3;
                    s671 s671Var = new s671(i, tu71Var2, i22, zu81Var, iArr[i22], i14, (i2 == Integer.MAX_VALUE || (i25 != -1 && i25 <= i2)) ? z : false);
                    int i26 = i23 + 1;
                    if (objArr2.length < i26) {
                        objArr2 = Arrays.copyOf(objArr2, jr71.a(objArr2.length, i26));
                    }
                    objArr2[i23] = s671Var;
                    i22++;
                    i23 = i26;
                }
                return t31.p(i23, objArr2);
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    /* renamed from: apply */
    public Object mo489apply(Object obj) {
        return f.a((f) this.c, (tls) this.b, (BluetoothManager) obj);
    }

    @Override // defpackage.lh51
    public void b() {
        c cVar = (c) this.c;
        YbScreenSource a = ((ew51) this.b).a();
        h hVar = cVar.G.i;
        hVar.b = a;
        hVar.a.g(zy11.a);
        cVar.r(new qu(9));
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x06df  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x071b A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0604  */
    @Override // defpackage.ly71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(Object obj, hh71 hh71Var) {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        i6z0 i6z0Var;
        i6z0 i6z0Var2;
        int i7;
        int i8;
        i6z0 i6z0Var3;
        PlaybackErrorEvent.Builder timeSinceCreatedMillis;
        PlaybackErrorEvent.Builder errorCode;
        PlaybackErrorEvent.Builder subErrorCode;
        PlaybackErrorEvent.Builder exception;
        PlaybackErrorEvent build;
        int i9;
        int i10;
        int i11;
        ek71 ek71Var;
        int i12;
        b171 b171Var;
        PlaybackStateEvent.Builder state;
        PlaybackStateEvent.Builder timeSinceCreatedMillis2;
        PlaybackStateEvent build2;
        NetworkEvent.Builder networkType;
        NetworkEvent.Builder timeSinceCreatedMillis3;
        NetworkEvent build3;
        int i13;
        int i14;
        kk0 kk0Var;
        int i15;
        ep71 ep71Var = (ep71) this.c;
        fi81 fi81Var = (fi81) this.b;
        b171 b171Var2 = (b171) obj;
        SparseArray sparseArray = ep71Var.x;
        SparseArray sparseArray2 = new SparseArray(hh71Var.a.size());
        for (int i16 = 0; i16 < hh71Var.a.size(); i16++) {
            int a = hh71Var.a(i16);
            wc71 wc71Var = (wc71) sparseArray.get(a);
            wc71Var.getClass();
            sparseArray2.append(a, wc71Var);
        }
        b171Var2.getClass();
        if (hh71Var.a.size() == 0) {
            return;
        }
        for (int i17 = 0; i17 < hh71Var.a.size(); i17++) {
            int a2 = hh71Var.a(i17);
            wc71 wc71Var2 = (wc71) sparseArray2.get(a2);
            wc71Var2.getClass();
            x971 x971Var = b171Var2.b;
            if (a2 == 0) {
                synchronized (x971Var) {
                    try {
                        x971Var.d.getClass();
                        yn81 yn81Var = x971Var.e;
                        x971Var.e = wc71Var2.b;
                        Iterator it = x971Var.c.values().iterator();
                        while (it.hasNext()) {
                            q671 q671Var = (q671) it.next();
                            yn81 yn81Var2 = x971Var.e;
                            int i18 = q671Var.b;
                            if (i18 >= yn81Var.b()) {
                                if (i18 < yn81Var2.b()) {
                                }
                                i18 = -1;
                            } else {
                                yn81Var.a(i18, q671Var.g.a, 0L);
                                for (int i19 = q671Var.g.a.G; i19 <= q671Var.g.a.H; i19++) {
                                    int a3 = yn81Var2.a(yn81Var.a(i19));
                                    if (a3 != -1) {
                                        i18 = yn81Var2.a(a3, q671Var.g.b, false).c;
                                        break;
                                    }
                                }
                                i18 = -1;
                            }
                            q671Var.b = i18;
                            if (i18 != -1) {
                                v281 v281Var = q671Var.d;
                                if (v281Var != null && yn81Var2.a(v281Var.a) == -1) {
                                }
                                if (q671Var.a(wc71Var2)) {
                                }
                            }
                            it.remove();
                            if (q671Var.e) {
                                if (q671Var.a.equals(x971Var.f)) {
                                    x971Var.f = null;
                                }
                                x971Var.d.e(wc71Var2, q671Var.a);
                            }
                        }
                        x971Var.b(wc71Var2);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (a2 == 11) {
                synchronized (x971Var) {
                    try {
                        x971Var.d.getClass();
                        Iterator it2 = x971Var.c.values().iterator();
                        while (it2.hasNext()) {
                            q671 q671Var2 = (q671) it2.next();
                            if (q671Var2.a(wc71Var2)) {
                                it2.remove();
                                if (q671Var2.e) {
                                    if (q671Var2.a.equals(x971Var.f)) {
                                        x971Var.f = null;
                                    }
                                    x971Var.d.e(wc71Var2, q671Var2.a);
                                }
                            }
                        }
                        x971Var.b(wc71Var2);
                    } finally {
                    }
                }
            } else {
                x971Var.c(wc71Var2);
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (hh71Var.a.get(0)) {
            wc71 wc71Var3 = (wc71) sparseArray2.get(0);
            wc71Var3.getClass();
            if (b171Var2.j != null) {
                b171Var2.c(wc71Var3.b, wc71Var3.d);
            }
        }
        if (hh71Var.a.get(2) && b171Var2.j != null) {
            ek71 ek71Var2 = (ek71) fi81Var;
            ek71Var2.v();
            p481 listIterator = ek71Var2.b0.i.d.a.listIterator(0);
            loop5: while (true) {
                if (!listIterator.hasNext()) {
                    kk0Var = null;
                    break;
                }
                le81 le81Var = (le81) listIterator.next();
                for (int i20 = 0; i20 < le81Var.a; i20++) {
                    if (le81Var.x[i20] && (kk0Var = le81Var.b.w[i20].H) != null) {
                        break loop5;
                    }
                }
            }
            if (kk0Var != null) {
                PlaybackMetrics.Builder builder = b171Var2.j;
                int i21 = rf71.a;
                int i22 = 0;
                while (true) {
                    if (i22 >= kk0Var.e) {
                        i15 = 1;
                        break;
                    }
                    UUID uuid = kk0Var.b[i22].c;
                    if (uuid.equals(sm81.d)) {
                        i15 = 3;
                        break;
                    } else if (uuid.equals(sm81.e)) {
                        i15 = 2;
                        break;
                    } else {
                        if (uuid.equals(sm81.c)) {
                            i15 = 6;
                            break;
                        }
                        i22++;
                    }
                }
                builder.setDrmType(i15);
            }
        }
        if (hh71Var.a.get(1011)) {
            b171Var2.y++;
        }
        jc2 jc2Var = b171Var2.m;
        if (jc2Var == null) {
            i4 = 13;
            i5 = 7;
            i6 = 8;
            i2 = 6;
            i3 = 9;
        } else {
            Context context = b171Var2.a;
            boolean z2 = b171Var2.u == 4;
            if (jc2Var.b == 1001) {
                i6z0Var = new i6z0(20, 0, 14);
            } else {
                if (jc2Var instanceof zm0) {
                    zm0 zm0Var = (zm0) jc2Var;
                    z = zm0Var.d == 1;
                    i = zm0Var.h;
                } else {
                    i = 0;
                    z = false;
                }
                Throwable cause = jc2Var.getCause();
                cause.getClass();
                int i23 = 27;
                if (cause instanceof IOException) {
                    if (cause instanceof e01) {
                        i6z0Var3 = new i6z0(5, ((e01) cause).e, 14);
                    } else if (cause instanceof aa2) {
                        i6z0Var = new i6z0(z2 ? 10 : 11, 0, 14);
                    } else {
                        boolean z3 = cause instanceof c01;
                        if (z3 || (cause instanceof d83)) {
                            i7 = 9;
                            if (hl61.b(context).a() == 1) {
                                i6z0Var = new i6z0(3, 0, 14);
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    i8 = 6;
                                    i6z0Var = new i6z0(6, 0, 14);
                                } else {
                                    i8 = 6;
                                    if (cause2 instanceof SocketTimeoutException) {
                                        i6z0Var = new i6z0(7, 0, 14);
                                        i5 = 7;
                                        i3 = 9;
                                        i2 = 6;
                                        i4 = 13;
                                    } else {
                                        if (z3 && ((c01) cause).d == 1) {
                                            i6z0Var = new i6z0(4, 0, 14);
                                        }
                                        i6 = 8;
                                        i6z0Var = new i6z0(8, 0, 14);
                                        i3 = 9;
                                        i2 = 6;
                                        i4 = 13;
                                        i5 = 7;
                                        PlaybackSession playbackSession = b171Var2.c;
                                        timeSinceCreatedMillis = te10.e().setTimeSinceCreatedMillis(elapsedRealtime - b171Var2.d);
                                        errorCode = timeSinceCreatedMillis.setErrorCode(i6z0Var.b);
                                        subErrorCode = errorCode.setSubErrorCode(i6z0Var.c);
                                        exception = subErrorCode.setException(jc2Var);
                                        build = exception.build();
                                        playbackSession.reportPlaybackErrorEvent(build);
                                        b171Var2.z = true;
                                        b171Var2.m = null;
                                    }
                                }
                                i3 = 9;
                                i2 = i8;
                                i4 = 13;
                                i5 = 7;
                            }
                        } else if (jc2Var.b == 1002) {
                            i6z0Var = new i6z0(21, 0, 14);
                        } else if (cause instanceof lk0) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            int i24 = rf71.a;
                            if (i24 < 21 || !(cause3 instanceof MediaDrm.MediaDrmStateException)) {
                                i6z0Var = (i24 < 23 || !(cause3 instanceof MediaDrmResetException)) ? (i24 < 18 || !(cause3 instanceof NotProvisionedException)) ? (i24 < 18 || !(cause3 instanceof DeniedByServerException)) ? cause3 instanceof o83 ? new i6z0(23, 0, 14) : new i6z0(30, 0, 14) : new i6z0(29, 0, 14) : new i6z0(24, 0, 14) : new i6z0(27, 0, 14);
                            } else {
                                int d = rf71.d(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                if (d != 2 && d != 4) {
                                    if (d != 10) {
                                        if (d != 7) {
                                            if (d != 8) {
                                                switch (d) {
                                                    case 15:
                                                        break;
                                                    case 16:
                                                    case 18:
                                                        break;
                                                    case 17:
                                                    case 19:
                                                    case 20:
                                                    case 21:
                                                    case 22:
                                                        break;
                                                    default:
                                                        switch (d) {
                                                            case 24:
                                                            case 25:
                                                            case 26:
                                                            case 27:
                                                            case 28:
                                                                i23 = 24;
                                                                break;
                                                        }
                                                }
                                                i6z0Var3 = new i6z0(i23, d, 14);
                                            }
                                            i23 = 28;
                                            i6z0Var3 = new i6z0(i23, d, 14);
                                        }
                                    }
                                    i23 = 25;
                                    i6z0Var3 = new i6z0(i23, d, 14);
                                }
                                i23 = 26;
                                i6z0Var3 = new i6z0(i23, d, 14);
                            }
                        } else if ((cause instanceof it0) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            i6z0Var = (rf71.a >= 21 && (cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new i6z0(32, 0, 14) : new i6z0(31, 0, 14);
                        } else {
                            i7 = 9;
                            i6z0Var = new i6z0(9, 0, 14);
                        }
                        i3 = i7;
                        i4 = 13;
                        i5 = 7;
                        i6 = 8;
                        i2 = 6;
                        PlaybackSession playbackSession2 = b171Var2.c;
                        timeSinceCreatedMillis = te10.e().setTimeSinceCreatedMillis(elapsedRealtime - b171Var2.d);
                        errorCode = timeSinceCreatedMillis.setErrorCode(i6z0Var.b);
                        subErrorCode = errorCode.setSubErrorCode(i6z0Var.c);
                        exception = subErrorCode.setException(jc2Var);
                        build = exception.build();
                        playbackSession2.reportPlaybackErrorEvent(build);
                        b171Var2.z = true;
                        b171Var2.m = null;
                    }
                    i6z0Var = i6z0Var3;
                } else {
                    int i25 = 24;
                    i2 = 6;
                    i3 = 9;
                    if (z && (i == 0 || i == 1)) {
                        i6z0Var = new i6z0(35, 0, 14);
                    } else if (z && i == 3) {
                        i6z0Var = new i6z0(15, 0, 14);
                    } else if (z && i == 2) {
                        i6z0Var = new i6z0(23, 0, 14);
                    } else {
                        if (cause instanceof fj1) {
                            i4 = 13;
                            i6z0Var2 = new i6z0(13, rf71.d(((fj1) cause).e), 14);
                        } else {
                            i4 = 13;
                            if (cause instanceof bj1) {
                                i6z0Var2 = new i6z0(14, rf71.d(((bj1) cause).b), 14);
                            } else if (cause instanceof OutOfMemoryError) {
                                i6z0Var = new i6z0(14, 0, 14);
                                i5 = 7;
                            } else if (cause instanceof ck) {
                                i6z0Var2 = new i6z0(17, ((ck) cause).b, 14);
                            } else if (cause instanceof ek) {
                                i6z0Var2 = new i6z0(18, ((ek) cause).b, 14);
                            } else {
                                if (rf71.a < 16 || !(cause instanceof MediaCodec.CryptoException)) {
                                    i5 = 7;
                                    i6 = 8;
                                    i6z0Var = new i6z0(22, 0, 14);
                                } else {
                                    int errorCode2 = ((MediaCodec.CryptoException) cause).getErrorCode();
                                    if (errorCode2 == 2 || errorCode2 == 4) {
                                        i5 = 7;
                                        i6 = 8;
                                    } else {
                                        if (errorCode2 != 10) {
                                            i5 = 7;
                                            i6 = 8;
                                            if (errorCode2 != 7) {
                                                if (errorCode2 != 8) {
                                                    switch (errorCode2) {
                                                        case 15:
                                                            break;
                                                        case 16:
                                                        case 18:
                                                            break;
                                                        case 17:
                                                        case 19:
                                                        case 20:
                                                        case 21:
                                                        case 22:
                                                            break;
                                                        default:
                                                            switch (errorCode2) {
                                                                case 24:
                                                                case 25:
                                                                case 26:
                                                                case 27:
                                                                case 28:
                                                                    break;
                                                                default:
                                                                    i25 = 27;
                                                                    break;
                                                            }
                                                    }
                                                    i6z0Var = new i6z0(i25, errorCode2, 14);
                                                }
                                                i25 = 28;
                                                i6z0Var = new i6z0(i25, errorCode2, 14);
                                            }
                                        } else {
                                            i5 = 7;
                                            i6 = 8;
                                        }
                                        i25 = 25;
                                        i6z0Var = new i6z0(i25, errorCode2, 14);
                                    }
                                    i25 = 26;
                                    i6z0Var = new i6z0(i25, errorCode2, 14);
                                }
                                PlaybackSession playbackSession22 = b171Var2.c;
                                timeSinceCreatedMillis = te10.e().setTimeSinceCreatedMillis(elapsedRealtime - b171Var2.d);
                                errorCode = timeSinceCreatedMillis.setErrorCode(i6z0Var.b);
                                subErrorCode = errorCode.setSubErrorCode(i6z0Var.c);
                                exception = subErrorCode.setException(jc2Var);
                                build = exception.build();
                                playbackSession22.reportPlaybackErrorEvent(build);
                                b171Var2.z = true;
                                b171Var2.m = null;
                            }
                        }
                        i6z0Var = i6z0Var2;
                        i5 = 7;
                    }
                    i4 = 13;
                    i5 = 7;
                }
                i6 = 8;
                PlaybackSession playbackSession222 = b171Var2.c;
                timeSinceCreatedMillis = te10.e().setTimeSinceCreatedMillis(elapsedRealtime - b171Var2.d);
                errorCode = timeSinceCreatedMillis.setErrorCode(i6z0Var.b);
                subErrorCode = errorCode.setSubErrorCode(i6z0Var.c);
                exception = subErrorCode.setException(jc2Var);
                build = exception.build();
                playbackSession222.reportPlaybackErrorEvent(build);
                b171Var2.z = true;
                b171Var2.m = null;
            }
            i4 = 13;
            i5 = 7;
            i6 = 8;
            i2 = 6;
            i3 = 9;
            PlaybackSession playbackSession2222 = b171Var2.c;
            timeSinceCreatedMillis = te10.e().setTimeSinceCreatedMillis(elapsedRealtime - b171Var2.d);
            errorCode = timeSinceCreatedMillis.setErrorCode(i6z0Var.b);
            subErrorCode = errorCode.setSubErrorCode(i6z0Var.c);
            exception = subErrorCode.setException(jc2Var);
            build = exception.build();
            playbackSession2222.reportPlaybackErrorEvent(build);
            b171Var2.z = true;
            b171Var2.m = null;
        }
        if (hh71Var.a.get(2)) {
            ek71 ek71Var3 = (ek71) fi81Var;
            ek71Var3.v();
            ph81 ph81Var = ek71Var3.b0.i.d;
            boolean a4 = ph81Var.a(2);
            boolean a5 = ph81Var.a(1);
            boolean a6 = ph81Var.a(3);
            if (a4 || a5 || a6) {
                if (a4) {
                    i9 = 5;
                } else {
                    if (!rf71.o(b171Var2.q, null)) {
                        if (b171Var2.q == null) {
                            i13 = 5;
                            i14 = 1;
                        } else {
                            i13 = 5;
                            i14 = 0;
                        }
                        b171Var2.q = null;
                        i9 = i13;
                        i10 = i6;
                        b171Var2.b(1, elapsedRealtime, null, i14);
                        if (!a5 && !rf71.o(b171Var2.r, null)) {
                            int i26 = b171Var2.r != null ? 1 : 0;
                            b171Var2.r = null;
                            b171Var2.b(0, elapsedRealtime, null, i26);
                        }
                        if (!a6 && !rf71.o(b171Var2.s, null)) {
                            int i27 = b171Var2.s != null ? 1 : 0;
                            b171Var2.s = null;
                            b171Var2.b(2, elapsedRealtime, null, i27);
                        }
                        if (b171Var2.d(b171Var2.n)) {
                            o3 o3Var = b171Var2.n;
                            qd81 qd81Var = (qd81) o3Var.w;
                            if (qd81Var.K != -1) {
                                int i28 = o3Var.b;
                                if (!rf71.o(b171Var2.q, qd81Var)) {
                                    int i29 = (b171Var2.q == null && i28 == 0) ? 1 : i28;
                                    b171Var2.q = qd81Var;
                                    b171Var2.b(1, elapsedRealtime, qd81Var, i29);
                                }
                                b171Var2.n = null;
                            }
                        }
                        if (b171Var2.d(b171Var2.o)) {
                            o3 o3Var2 = b171Var2.o;
                            qd81 qd81Var2 = (qd81) o3Var2.w;
                            int i30 = o3Var2.b;
                            if (!rf71.o(b171Var2.r, qd81Var2)) {
                                int i31 = (b171Var2.r == null && i30 == 0) ? 1 : i30;
                                b171Var2.r = qd81Var2;
                                b171Var2.b(0, elapsedRealtime, qd81Var2, i31);
                            }
                            b171Var2.o = null;
                        }
                        if (b171Var2.d(b171Var2.p)) {
                            o3 o3Var3 = b171Var2.p;
                            qd81 qd81Var3 = (qd81) o3Var3.w;
                            int i32 = o3Var3.b;
                            if (!rf71.o(b171Var2.s, qd81Var3)) {
                                int i33 = (b171Var2.s == null && i32 == 0) ? 1 : i32;
                                b171Var2.s = qd81Var3;
                                b171Var2.b(2, elapsedRealtime, qd81Var3, i33);
                            }
                            b171Var2.p = null;
                        }
                        switch (hl61.b(b171Var2.a).a()) {
                            case 0:
                                i11 = 0;
                                break;
                            case 1:
                                i11 = i3;
                                break;
                            case 2:
                                i11 = 2;
                                break;
                            case 3:
                                i11 = 4;
                                break;
                            case 4:
                                i11 = i9;
                                break;
                            case 5:
                                i11 = i2;
                                break;
                            case 6:
                            case 8:
                            default:
                                i11 = 1;
                                break;
                            case 7:
                                i11 = 3;
                                break;
                            case 9:
                                i11 = i10;
                                break;
                            case 10:
                                i11 = i5;
                                break;
                        }
                        if (i11 != b171Var2.l) {
                            b171Var2.l = i11;
                            PlaybackSession playbackSession3 = b171Var2.c;
                            networkType = te10.d().setNetworkType(i11);
                            timeSinceCreatedMillis3 = networkType.setTimeSinceCreatedMillis(elapsedRealtime - b171Var2.d);
                            build3 = timeSinceCreatedMillis3.build();
                            playbackSession3.reportNetworkEvent(build3);
                        }
                        ek71Var = (ek71) fi81Var;
                        ek71Var.v();
                        if (ek71Var.b0.e != 2) {
                            b171Var2.t = false;
                        }
                        ek71Var.v();
                        if (ek71Var.b0.f == null) {
                            b171Var2.v = false;
                            i12 = 10;
                        } else {
                            i12 = 10;
                            if (hh71Var.a.get(10)) {
                                b171Var2.v = true;
                            }
                        }
                        ek71Var.v();
                        int i34 = ek71Var.b0.e;
                        if (b171Var2.t) {
                            i4 = i9;
                        } else if (!b171Var2.v) {
                            if (i34 == 4) {
                                i4 = 11;
                            } else {
                                int i35 = 2;
                                if (i34 == 2) {
                                    int i36 = b171Var2.k;
                                    if (i36 != 0 && i36 != 2) {
                                        ek71Var.v();
                                        if (ek71Var.b0.l) {
                                            ek71Var.v();
                                            i4 = ek71Var.b0.m != 0 ? i12 : i2;
                                        } else {
                                            i4 = i5;
                                        }
                                    }
                                    i4 = i35;
                                } else {
                                    i35 = 3;
                                    if (i34 == 3) {
                                        ek71Var.v();
                                        if (ek71Var.b0.l) {
                                            ek71Var.v();
                                            if (ek71Var.b0.m != 0) {
                                                i4 = i3;
                                            }
                                            i4 = i35;
                                        } else {
                                            i4 = 4;
                                        }
                                    } else {
                                        i4 = (i34 != 1 || b171Var2.k == 0) ? b171Var2.k : 12;
                                    }
                                }
                            }
                        }
                        if (b171Var2.k != i4) {
                            b171Var2.k = i4;
                            b171Var2.z = true;
                            PlaybackSession playbackSession4 = b171Var2.c;
                            state = te10.f().setState(b171Var2.k);
                            timeSinceCreatedMillis2 = state.setTimeSinceCreatedMillis(elapsedRealtime - b171Var2.d);
                            build2 = timeSinceCreatedMillis2.build();
                            playbackSession4.reportPlaybackStateEvent(build2);
                        }
                        if (hh71Var.a.get(1028)) {
                            x971 x971Var2 = b171Var2.b;
                            wc71 wc71Var4 = (wc71) sparseArray2.get(1028);
                            wc71Var4.getClass();
                            synchronized (x971Var2) {
                                x971Var2.f = null;
                                Iterator it3 = x971Var2.c.values().iterator();
                                while (it3.hasNext()) {
                                    q671 q671Var3 = (q671) it3.next();
                                    it3.remove();
                                    if (q671Var3.e && (b171Var = x971Var2.d) != null) {
                                        b171Var.e(wc71Var4, q671Var3.a);
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    }
                    i9 = 5;
                }
                i10 = i6;
                if (!a5) {
                    if (b171Var2.r != null) {
                    }
                    b171Var2.r = null;
                    b171Var2.b(0, elapsedRealtime, null, i26);
                }
                if (!a6) {
                    if (b171Var2.s != null) {
                    }
                    b171Var2.s = null;
                    b171Var2.b(2, elapsedRealtime, null, i27);
                }
                if (b171Var2.d(b171Var2.n)) {
                }
                if (b171Var2.d(b171Var2.o)) {
                }
                if (b171Var2.d(b171Var2.p)) {
                }
                switch (hl61.b(b171Var2.a).a()) {
                }
                if (i11 != b171Var2.l) {
                }
                ek71Var = (ek71) fi81Var;
                ek71Var.v();
                if (ek71Var.b0.e != 2) {
                }
                ek71Var.v();
                if (ek71Var.b0.f == null) {
                }
                ek71Var.v();
                int i342 = ek71Var.b0.e;
                if (b171Var2.t) {
                }
                if (b171Var2.k != i4) {
                }
                if (hh71Var.a.get(1028)) {
                }
            }
        }
        i9 = 5;
        i10 = i6;
        if (b171Var2.d(b171Var2.n)) {
        }
        if (b171Var2.d(b171Var2.o)) {
        }
        if (b171Var2.d(b171Var2.p)) {
        }
        switch (hl61.b(b171Var2.a).a()) {
        }
        if (i11 != b171Var2.l) {
        }
        ek71Var = (ek71) fi81Var;
        ek71Var.v();
        if (ek71Var.b0.e != 2) {
        }
        ek71Var.v();
        if (ek71Var.b0.f == null) {
        }
        ek71Var.v();
        int i3422 = ek71Var.b0.e;
        if (b171Var2.t) {
        }
        if (b171Var2.k != i4) {
        }
        if (hh71Var.a.get(1028)) {
        }
    }

    @Override // defpackage.zq81
    public void d(Drawable drawable) {
        ImageView imageView;
        v871 v871Var = (v871) this.c;
        cu81 cu81Var = (cu81) this.b;
        if (drawable == null || (imageView = (ImageView) v871Var.d()) == null) {
            return;
        }
        if (cu81Var.e == null) {
            imageView.setImageDrawable(drawable);
            return;
        }
        br71 br71Var = v871Var.e;
        nz2 nz2Var = new nz2(br71Var.b, br71Var.c, br71Var.a, cu81Var, drawable);
        br71Var.d = nz2Var;
        imageView.addOnLayoutChangeListener(nz2Var);
        if (imageView.getLayoutParams().width == -1 || imageView.getLayoutParams().height == -1 || imageView.getLayoutParams().width == -2 || imageView.getLayoutParams().height == -2) {
            imageView.setImageDrawable(drawable);
        }
    }

    public void e(Bitmap bitmap) {
        ((zq81) this.c).d(bitmap != null ? new BitmapDrawable((Resources) ((no6) this.b).y, bitmap) : null);
    }

    @Override // defpackage.ov71
    public void invoke(Object obj) {
        String str;
        wc71 wc71Var = (wc71) this.c;
        pil0 pil0Var = (pil0) this.b;
        b171 b171Var = (b171) obj;
        b171Var.getClass();
        if (wc71Var.d == null) {
            return;
        }
        qd81 qd81Var = (qd81) pil0Var.f;
        qd81Var.getClass();
        int i = pil0Var.c;
        x971 x971Var = b171Var.b;
        yn81 yn81Var = wc71Var.b;
        v281 v281Var = wc71Var.d;
        v281Var.getClass();
        synchronized (x971Var) {
            str = x971Var.a(yn81Var.a(v281Var.a, x971Var.b).c, v281Var).a;
        }
        o3 o3Var = new o3(qd81Var, i, str, 20);
        int i2 = pil0Var.b;
        if (i2 != 0) {
            if (i2 == 1) {
                b171Var.o = o3Var;
                return;
            } else if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                b171Var.p = o3Var;
                return;
            }
        }
        b171Var.n = o3Var;
    }

    @Override // defpackage.wf81
    public void j(jk3 jk3Var) {
        w071 w071Var = (w071) this.c;
        String str = (String) this.b;
        ki61 ki61Var = (ki61) w071Var.d.remove(str);
        if (ki61Var == null) {
            return;
        }
        w071Var.a(str, ki61Var, null, jk3Var);
    }

    @Override // defpackage.bx60
    public n751 onApplyWindowInsets(View view, n751 n751Var) {
        int i;
        int i2;
        int i3 = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i3) {
            case 0:
                s861 s861Var = (s861) obj2;
                hs51 hs51Var = (hs51) obj;
                ImageView imageView = s861Var.e;
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMargins(marginLayoutParams.leftMargin, hs51Var.e + p7b1.f(n751Var).b, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                    imageView.setLayoutParams(marginLayoutParams);
                    if (hs51Var.c) {
                        return n751Var;
                    }
                    FrameLayoutAddViewAware frameLayoutAddViewAware = s861Var.g;
                    ViewGroup.LayoutParams layoutParams2 = frameLayoutAddViewAware.getLayoutParams();
                    if (layoutParams2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, p7b1.f(n751Var).d);
                        frameLayoutAddViewAware.setLayoutParams(marginLayoutParams2);
                        return n751Var;
                    }
                    ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                } else {
                    ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                return null;
            default:
                k751 k751Var = n751Var.a;
                v40 v40Var = (Fragment) obj2;
                hs51 hs51Var2 = (hs51) obj;
                p5t0 p5t0Var = v40Var instanceof p5t0 ? (p5t0) v40Var : null;
                boolean needIgnoreKeyboard = p5t0Var != null ? p5t0Var.getNeedIgnoreKeyboard() : false;
                int i4 = hs51Var2.d;
                boolean z = hs51Var2.a;
                int i5 = z ? i4 : k751Var.g(519).b;
                if (needIgnoreKeyboard) {
                    i = k751Var.g(519).d;
                } else {
                    i = p7b1.e(n751Var).d;
                    int i6 = k751Var.g(519).d;
                    if (i < i6) {
                        i = i6;
                    }
                }
                u1w c = u1w.c(k751Var.g(519).a, i5, k751Var.g(519).c, i);
                if (!z) {
                    i4 = p7b1.f(n751Var).b;
                }
                if (needIgnoreKeyboard) {
                    i2 = p7b1.f(n751Var).d;
                } else {
                    i2 = p7b1.e(n751Var).d;
                    int i7 = p7b1.f(n751Var).d;
                    if (i2 < i7) {
                        i2 = i7;
                    }
                }
                u1w c2 = u1w.c(p7b1.f(n751Var).a, i4, p7b1.f(n751Var).c, i2);
                y651 y651Var = new x651(n751Var).a;
                y651Var.b(519, c);
                y651Var.c(519, c2);
                if (Build.VERSION.SDK_INT < 30) {
                    y651Var.f(c);
                    y651Var.j(c2);
                }
                return ((zjf) v40Var).onApplyInsets(y651Var.h());
        }
    }
}
