package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Process;
import android.util.TypedValue;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.SlotSize;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class i891 {
    public static ClassLoader a;
    public static Thread b;

    public static final void a(dge dgeVar, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1548270495);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(dgeVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            dta1.a(null, false, null, false, false, wwg.S(783502491, true, new u5(i3, dgeVar, tlsVar), btsVar), btsVar, ImageMetadata.EDGE_MODE, 31);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zyd(dgeVar, tlsVar, i, i3);
        }
    }

    public static final void b(f530 f530Var, xfh xfhVar, boolean z, wp2 wp2Var, fid fidVar, int i) {
        f530 f530Var2;
        CharSequence charSequence;
        CharSequence charSequence2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-254088947);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= btsVar.k(xfhVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.a(z) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.k(wp2Var) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            CharSequence charSequence3 = xfhVar.a;
            if (z && (charSequence2 = xfhVar.b) != null) {
                charSequence3 = charSequence2;
            }
            CharSequence charSequence4 = xfhVar.e;
            if (z && (charSequence = xfhVar.f) != null) {
                charSequence4 = charSequence;
            }
            c530 c530Var = c530.a;
            f530 m = an91.m(ljs0.c(c530Var, 1.0f), 8.0f, 0.0f, 2);
            SlotSize slotSize = SlotSize.XS;
            to5 to5Var = x4c.E;
            j6d.a.getClass();
            ydb1.a(m, j6d.b, wwg.S(707530910, true, new zfh(xfhVar, charSequence3, wp2Var), btsVar), wwg.S(-634389995, true, new ota(14, xfhVar), btsVar), wwg.S(1576591576, true, new zfh(charSequence4, xfhVar, wp2Var), btsVar), to5Var, slotSize, false, btsVar, 1797552, 128);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gi0(f530Var2, xfhVar, z, wp2Var, i, 8);
        }
    }

    public static final void c(int i, fid fidVar, f530 f530Var, CharSequence charSequence, String str) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1087368715);
        dmw0 dmw0Var = btsVar2.a;
        int i2 = i | (btsVar2.k(str) ? 32 : 16) | (btsVar2.k(charSequence) ? 256 : 128);
        if (btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
            f530 k = f530Var.k(ljs0.c);
            z910 d = pi6.d(x4c.x, false);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d2 = b.d(btsVar2, k);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar2, wlsVar, d);
            wls wlsVar2 = d.e;
            qje.W(btsVar2, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar2, wlsVar3, valueOf);
            tls tlsVar = d.h;
            qje.M(btsVar2, tlsVar);
            wls wlsVar4 = d.d;
            qje.W(btsVar2, wlsVar4, d2);
            lhl0 a2 = khl0.a(new i43(6.0f, true, new quz(11)), x4c.F, btsVar2, 54);
            int hashCode2 = Long.hashCode(btsVar2.T);
            r1b0 o2 = btsVar2.o();
            f530 d3 = b.d(btsVar2, c530.a);
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, wlsVar, a2);
            qje.W(btsVar2, wlsVar2, o2);
            vfc.v(hashCode2, btsVar2, wlsVar3, btsVar2, tlsVar);
            qje.W(btsVar2, wlsVar4, d3);
            qgy.b(str, null, null, AppColor$Palette.Text, 0L, 0L, null, 0L, 2, 1, 0, xya1.d(btsVar2).e.c, null, btsVar2, ((i2 >> 3) & 14) | 805309440, 6, 10742);
            btsVar = btsVar2;
            if (charSequence == null) {
                btsVar.e0(-1214118814);
                btsVar.t(false);
            } else {
                btsVar.e0(-1214118813);
                jeb1.f(charSequence.toString(), null, AppColor$Palette.TextMinor, 0L, 0L, rly0.d, null, 0L, 2, false, 1, 0, null, xya1.e(btsVar).g.a, btsVar, 806879616, 48, 13754);
                btsVar = btsVar;
                btsVar.t(false);
            }
            btsVar.t(true);
            btsVar.t(true);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new jq5(f530Var, str, charSequence, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000f, code lost:
    
        if (r3 == null) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final f530 d(f530 f530Var, String str) {
        f530 f530Var2;
        if (str != null) {
            f530Var2 = fnq0.b(c530.a, false, new wwb(str, 6));
        }
        f530Var2 = f530Var;
        return f530Var.k(f530Var2);
    }

    public static final int e(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        Object obj;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return 0;
        }
        String j = b64.j(context.getPackageName(), ":passport");
        Iterator<T> it = runningAppProcesses.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (cvu0.t(((ActivityManager.RunningAppProcessInfo) obj).processName, j, true)) {
                break;
            }
        }
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj;
        if (runningAppProcessInfo != null) {
            return runningAppProcessInfo.pid;
        }
        return 0;
    }

    public static final void f(Context context) {
        int e = e(context);
        if (e > 0) {
            Process.killProcess(e);
        }
    }

    public static final TypedValue g(Resources.Theme theme, int i) {
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static final boolean h(Resources.Theme theme, int i, boolean z) {
        TypedValue g = g(theme, i);
        return g != null ? g.data != 0 : z;
    }

    public static final int i(Resources.Theme theme, int i) {
        TypedValue g = g(theme, i);
        if (g != null) {
            return g.data;
        }
        kbs.g(oyr.i(i, "Theme does not contains required color "));
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x009d, code lost:
    
        if (r1 == null) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized ClassLoader j() {
        ClassLoader classLoader;
        SecurityException e;
        Thread thread;
        ThreadGroup threadGroup;
        wht whtVar;
        synchronized (i891.class) {
            if (a == null) {
                Thread thread2 = b;
                ClassLoader classLoader2 = null;
                if (thread2 == null) {
                    ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                    if (threadGroup2 == null) {
                        thread2 = null;
                    } else {
                        synchronized (Void.class) {
                            try {
                                try {
                                    int activeGroupCount = threadGroup2.activeGroupCount();
                                    ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                                    threadGroup2.enumerate(threadGroupArr);
                                    int i = 0;
                                    int i2 = 0;
                                    while (true) {
                                        if (i2 >= activeGroupCount) {
                                            threadGroup = null;
                                            break;
                                        }
                                        threadGroup = threadGroupArr[i2];
                                        if ("dynamiteLoader".equals(threadGroup.getName())) {
                                            break;
                                        }
                                        i2++;
                                    }
                                    if (threadGroup == null) {
                                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                    }
                                    int activeCount = threadGroup.activeCount();
                                    Thread[] threadArr = new Thread[activeCount];
                                    threadGroup.enumerate(threadArr);
                                    while (true) {
                                        if (i >= activeCount) {
                                            thread = null;
                                            break;
                                        }
                                        thread = threadArr[i];
                                        if ("GmsDynamite".equals(thread.getName())) {
                                            break;
                                        }
                                        i++;
                                    }
                                    if (thread == null) {
                                        try {
                                            whtVar = new wht(threadGroup, "GmsDynamite");
                                        } catch (SecurityException e2) {
                                            e = e2;
                                        }
                                        try {
                                            whtVar.setContextClassLoader(null);
                                            whtVar.start();
                                            thread = whtVar;
                                        } catch (SecurityException e3) {
                                            e = e3;
                                            thread = whtVar;
                                            new StringBuilder(String.valueOf(e.getMessage()).length() + 39);
                                            thread2 = thread;
                                            b = thread2;
                                        }
                                    }
                                } catch (SecurityException e4) {
                                    e = e4;
                                    thread = null;
                                }
                            } finally {
                            }
                        }
                        thread2 = thread;
                    }
                    b = thread2;
                }
                synchronized (thread2) {
                    try {
                        classLoader2 = b.getContextClassLoader();
                    } catch (SecurityException e5) {
                        new StringBuilder(String.valueOf(e5.getMessage()).length() + 41);
                    }
                }
                a = classLoader2;
            }
            classLoader = a;
        }
        return classLoader;
    }
}
