package com.yandex.pulse.processcpu;

import android.app.ActivityManager;
import android.content.Context;
import android.os.DeadSystemException;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import com.yandex.pulse.metrics.g;
import com.yandex.pulse.utils.WeakHandler;
import defpackage.bfh;
import defpackage.cvu0;
import defpackage.evu0;
import defpackage.ffx;
import defpackage.gw00;
import defpackage.h5f0;
import defpackage.j63;
import defpackage.jl40;
import defpackage.l5f0;
import defpackage.ooc;
import defpackage.pa10;
import defpackage.q53;
import defpackage.t53;
import defpackage.tcc;
import defpackage.u1x0;
import defpackage.u7u0;
import defpackage.u941;
import defpackage.vku;
import defpackage.w53;
import defpackage.w8u0;
import defpackage.y5f0;
import defpackage.z2u0;
import defpackage.z5f0;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/yandex/pulse/processcpu/MeasurementTask;", "", "Lu941;", "handlerCallback", "Lu941;", "l5f0", "histograms_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public class MeasurementTask {
    public static final vku j = ffx.L(49, "ApplicationProcessCount");
    public final Context a;
    public final l5f0 b;
    public final pa10 c;
    public final WeakHandler d;
    public final j63 e;
    public final w53 f;
    public final w53 g;
    public final AtomicBoolean h;
    private final u941 handlerCallback;
    public long i;

    public MeasurementTask(Context context, l5f0 l5f0Var, Set set, Map map, pa10 pa10Var) {
        this.a = context;
        this.b = l5f0Var;
        this.c = pa10Var;
        bfh bfhVar = new bfh(1, this);
        this.handlerCallback = bfhVar;
        this.d = new WeakHandler(bfhVar);
        this.e = new j63(set);
        w53 w53Var = new w53(map.size());
        w53Var.putAll(map);
        this.f = w53Var;
        this.g = new w53();
        this.h = new AtomicBoolean(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x01c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        Map f;
        u7u0 u7u0Var;
        long j2;
        BufferedReader bufferedReader;
        Matcher matcher;
        z2u0 z2u0Var;
        z2u0 z2u0Var2;
        Object systemService;
        Context context = this.a;
        try {
            systemService = context.getSystemService("activity");
        } catch (RuntimeException e) {
            if (!(e.getCause() instanceof DeadSystemException)) {
                throw e;
            }
            f = b.f();
        }
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            runningAppProcesses = EmptyList.a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : runningAppProcesses) {
            if (((ActivityManager.RunningAppProcessInfo) obj).pid != 0) {
                arrayList.add(obj);
            }
        }
        int d = gw00.d(tcc.n(arrayList, 10));
        if (d < 16) {
            d = 16;
        }
        f = new LinkedHashMap(d);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) it.next();
            Pair pair = new Pair(runningAppProcessInfo.processName, Integer.valueOf(runningAppProcessInfo.pid));
            f.put(pair.c(), pair.f());
        }
        String packageName = context.getPackageName();
        String str = packageName + ':';
        Iterator it2 = f.entrySet().iterator();
        char c = 0;
        int i = 0;
        while (it2.hasNext()) {
            String str2 = (String) ((Map.Entry) it2.next()).getKey();
            if (jl40.l(str2, packageName) || cvu0.x(str2, str, false)) {
                i++;
            }
        }
        j.b(i);
        j63 j63Var = this.e;
        boolean isEmpty = j63Var.isEmpty();
        w53 w53Var = this.f;
        if (!isEmpty) {
            for (Map.Entry entry : f.entrySet()) {
                String str3 = (String) entry.getKey();
                int intValue = ((Number) entry.getValue()).intValue();
                if (j63Var.contains(str3)) {
                    j63Var.remove(str3);
                    w53Var.put(str3, Integer.valueOf(intValue));
                }
            }
        }
        this.i = SystemClock.uptimeMillis();
        Iterator it3 = ((q53) w53Var.entrySet()).iterator();
        while (true) {
            t53 t53Var = (t53) it3;
            if (!t53Var.hasNext()) {
                return;
            }
            t53Var.next();
            String str4 = (String) t53Var.getKey();
            h5f0 h5f0Var = new h5f0(((Integer) t53Var.getValue()).intValue());
            File file = h5f0Var.a;
            if (file.isDirectory()) {
                String a = h5f0Var.a("cmdline");
                if (a == null) {
                    a = null;
                } else {
                    int G = evu0.G(a, c, c, 6);
                    if (G >= 0) {
                        a = a.substring(c, G);
                    }
                }
                if (jl40.l(str4, a)) {
                    y5f0 y5f0Var = new y5f0();
                    String a2 = h5f0Var.a("stat");
                    if (a2 != null) {
                        StringTokenizer stringTokenizer = new StringTokenizer(a2, " ");
                        int i2 = c;
                        while (true) {
                            z2u0Var = z2u0.c;
                            if (i2 >= 13) {
                                break;
                            }
                            try {
                                stringTokenizer.nextToken();
                                i2++;
                            } catch (NumberFormatException | NoSuchElementException unused) {
                                z2u0Var2 = z2u0Var;
                            }
                            if (z2u0Var != z2u0Var2) {
                                y5f0Var.a = z2u0Var2.a;
                                y5f0Var.b = z2u0Var2.b;
                            }
                        }
                        long parseLong = Long.parseLong(stringTokenizer.nextToken()) + Long.parseLong(stringTokenizer.nextToken()) + Long.parseLong(stringTokenizer.nextToken()) + Long.parseLong(stringTokenizer.nextToken());
                        stringTokenizer.nextToken();
                        stringTokenizer.nextToken();
                        z2u0Var2 = new z2u0(parseLong, Integer.parseInt(stringTokenizer.nextToken()));
                        if (z2u0Var != z2u0Var2) {
                        }
                    }
                    u7u0 u7u0Var2 = u7u0.c;
                    String a3 = h5f0Var.a("statm");
                    if (a3 != null) {
                        StringTokenizer stringTokenizer2 = new StringTokenizer(a3, " ");
                        try {
                            stringTokenizer2.nextToken();
                            long parseLong2 = Long.parseLong(stringTokenizer2.nextToken());
                            long parseLong3 = Long.parseLong(stringTokenizer2.nextToken());
                            g gVar = g.a;
                            long j3 = u1x0.a;
                            u7u0Var = new u7u0(parseLong2 * j3, parseLong3 * j3);
                        } catch (NumberFormatException | NoSuchElementException unused2) {
                            u7u0Var = u7u0Var2;
                        }
                        if (u7u0Var2 != u7u0Var) {
                            try {
                                FileReader fileReader = new FileReader(new File(file, ACSPConstants.STATUS));
                                try {
                                    Pattern pattern = w8u0.a;
                                    try {
                                        bufferedReader = new BufferedReader(fileReader);
                                    } catch (Exception unused3) {
                                    }
                                    do {
                                        try {
                                            String readLine = bufferedReader.readLine();
                                            if (readLine == null) {
                                                bufferedReader.close();
                                                j2 = 0;
                                                break;
                                            }
                                            matcher = w8u0.a.matcher(readLine);
                                        } catch (Throwable th) {
                                            try {
                                                throw th;
                                            } catch (Throwable th2) {
                                                ooc.g(bufferedReader, th);
                                                throw th2;
                                            }
                                        }
                                    } while (!matcher.find());
                                    j2 = Long.parseLong(matcher.group(1)) * PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
                                    bufferedReader.close();
                                    fileReader.close();
                                } finally {
                                }
                            } catch (Exception unused4) {
                                j2 = -1;
                            }
                            if (j2 != -1) {
                                long j4 = u7u0Var.a;
                                long j5 = u7u0Var.b;
                                y5f0Var.c = (j4 - j5) + j2;
                                y5f0Var.d = j5;
                                y5f0Var.e = j4 + j2;
                            }
                        }
                    }
                    this.g.put(str4, new z5f0(y5f0Var.a, y5f0Var.b, y5f0Var.c, y5f0Var.d, y5f0Var.e));
                    c = 0;
                }
            }
            j63Var.add(str4);
            t53Var.remove();
            c = 0;
        }
    }
}
