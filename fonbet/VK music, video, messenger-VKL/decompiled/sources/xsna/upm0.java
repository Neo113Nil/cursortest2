package xsna;

import android.net.TrafficStats;
import android.os.Build;
import android.os.StrictMode;
import android.os.strictmode.InstanceCountViolation;
import android.os.strictmode.Violation;
import com.vk.core.apps.BuildInfo;
import com.vkontakte.android.VKApplication;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.ExecutorService;
import xsna.vpm0;

/* compiled from: StrictModeHelper.kt */
/* loaded from: classes.dex */
public final class upm0 {
    public static final upm0 a = new upm0();
    public static final vpm0 b = new vpm0();
    public static final boolean c;
    public static volatile boolean d;

    /* compiled from: StrictModeHelper.kt */
    /* loaded from: classes17.dex */
    public static final class a extends RuntimeException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(Violation violation) {
            super(j5g.g0(r1, ": ", null, null, 0, null, 62), violation.getCause());
            String a = qjg.a(violation);
            String message = violation.getMessage();
            String[] strArr = {a, message == null ? "" : message, "To resolve this, please use instructions at the link https://jira.vk.team/browse/ANDC-17500"};
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 3; i++) {
                String str = strArr[i];
                if (!drm0.N(str)) {
                    arrayList.add(str);
                }
            }
        }
    }

    static {
        boolean z;
        if (!BuildInfo.h()) {
            VKApplication vKApplication = com.vk.core.apps.a.a;
            if (BuildInfo.m() || !((Boolean) com.vk.core.apps.a.k.getValue()).booleanValue()) {
                z = false;
                c = z;
            }
        }
        z = true;
        c = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x009f, code lost:
    
        if (r1 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00cb, code lost:
    
        r1 = r1.getCause();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(Violation violation) {
        boolean z;
        if (d) {
            vpm0 vpm0Var = b;
            vpm0Var.getClass();
            Class<?> cls = violation.getClass();
            vpm0.a aVar = (vpm0.a) ((HashMap) vpm0Var.a.getValue()).get(cls);
            boolean z2 = false;
            if (aVar != null) {
                if (!(aVar instanceof vpm0.a.b)) {
                    if (cls.equals(InstanceCountViolation.class) && (aVar instanceof vpm0.a.c)) {
                        List<String> b2 = ((vpm0.a.c) aVar).b();
                        if (!b2.isEmpty()) {
                            Iterator<T> it = b2.iterator();
                            while (it.hasNext()) {
                                if (drm0.D(violation.toString(), (String) it.next(), false)) {
                                }
                            }
                        }
                    } else {
                        if (31 <= Build.VERSION.SDK_INT && cls.equals(ahj.a()) && (aVar instanceof vpm0.a.c)) {
                            List<String> b3 = ((vpm0.a.c) aVar).b();
                            if (!b3.isEmpty()) {
                                for (String str : b3) {
                                    String localizedMessage = violation.getLocalizedMessage();
                                    if (localizedMessage != null ? drm0.D(localizedMessage, str, false) : false) {
                                        z = true;
                                        break;
                                    }
                                }
                            }
                            z = false;
                        }
                        Throwable th = violation;
                        loop2: while (th != null) {
                            StackTraceElement[] stackTrace = th.getStackTrace();
                            int i = 0;
                            while (true) {
                                if (i < stackTrace.length) {
                                    int i2 = i + 1;
                                    try {
                                        if (aVar.a(stackTrace[i])) {
                                            break loop2;
                                        } else {
                                            i = i2;
                                        }
                                    } catch (ArrayIndexOutOfBoundsException e) {
                                        throw new NoSuchElementException(e.getMessage());
                                    }
                                }
                            }
                        }
                    }
                }
                z2 = true;
                break loop2;
            }
            if (z2) {
                return;
            }
            a aVar2 = new a(violation);
            aVar2.setStackTrace(violation.getStackTrace());
            com.vk.metrics.eventtracking.b.a.q(aVar2);
        }
    }

    public static void b() {
        ExecutorService b2;
        if (c) {
            d = true;
            b2 = asu0.a.b((r5 & 2) != 0 ? 1 : 5, (r5 & 4) != 0 ? 0L : 1000L, "vk-strict-mode");
            StrictMode.ThreadPolicy.Builder builder = new StrictMode.ThreadPolicy.Builder();
            builder.detectDiskReads();
            builder.detectDiskWrites();
            builder.detectNetwork();
            builder.penaltyDeathOnNetwork();
            builder.detectUnbufferedIo();
            builder.detectCustomSlowCalls();
            builder.detectResourceMismatches();
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                builder.detectExplicitGc();
            }
            StrictMode.ThreadPolicy.Builder penaltyListener = builder.penaltyLog().penaltyListener(b2, new spm0());
            StrictMode.VmPolicy.Builder builder2 = new StrictMode.VmPolicy.Builder();
            builder2.detectLeakedSqlLiteObjects();
            builder2.detectActivityLeaks();
            builder2.detectLeakedClosableObjects();
            builder2.detectLeakedRegistrationObjects();
            builder2.detectFileUriExposure();
            builder2.detectContentUriWithoutPermission();
            if (i >= 29) {
                builder2.detectCredentialProtectedWhileLocked();
            }
            if (i >= 31) {
                builder2.detectUnsafeIntentLaunch();
            }
            StrictMode.VmPolicy.Builder penaltyListener2 = builder2.penaltyLog().penaltyListener(b2, new tpm0());
            StrictMode.setThreadPolicy(penaltyListener.build());
            StrictMode.setVmPolicy(penaltyListener2.build());
            TrafficStats.setThreadStatsTag(1);
        }
    }
}
