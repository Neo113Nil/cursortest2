package xsna;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.mediarouter.media.MediaTransferReceiver;
import com.huawei.hms.framework.common.BundleUtil;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;
import xsna.bx10;
import xsna.ex10;
import xsna.f7x0;
import xsna.fx10;
import xsna.h1u;
import xsna.jw10;
import xsna.kqf0;
import xsna.xta0;

/* compiled from: GlobalMediaRouter.java */
/* loaded from: classes12.dex */
public final class h1u {
    public yw10 A;
    public yw10 B;
    public int C;
    public c D;
    public MediaSessionCompat E;
    public final a F;
    public final kqf0 c;
    public fx10.h d;
    public bx10.e e;
    public fx10.e f;
    public fx10.f g;
    public final Context h;
    public final cvf0 o;
    public final e p;
    public final boolean q;
    public final boolean r;
    public jw10 s;
    public final xta0.a t;
    public final qx10 u;
    public rx10 v;
    public fx10.h w;
    public fx10.h x;
    public fx10.h y;
    public bx10.b z;
    public final b a = new b();
    public final HashMap b = new HashMap();
    public final ArrayList<WeakReference<fx10>> i = new ArrayList<>();
    public final ArrayList<fx10.h> j = new ArrayList<>();
    public final HashMap k = new HashMap();
    public final HashMap l = new HashMap();
    public final ArrayList<fx10.g> m = new ArrayList<>();
    public final ArrayList<f> n = new ArrayList<>();

    /* compiled from: GlobalMediaRouter.java */
    public class a implements bx10.b.InterfaceC2630b {
        public a() {
        }

        @Override // xsna.bx10.b.InterfaceC2630b
        public final void a(@NonNull bx10.b bVar, @Nullable vw10 vw10Var, @NonNull Collection<bx10.b.a> collection) {
            h1u h1uVar = h1u.this;
            if (bVar != h1uVar.z || vw10Var == null) {
                if (bVar == h1uVar.e) {
                    if (vw10Var != null) {
                        h1uVar.q(h1uVar.d, vw10Var);
                    }
                    fx10.d a = h1uVar.d.a();
                    if (a != null) {
                        a.p(collection);
                        return;
                    }
                    return;
                }
                return;
            }
            fx10.g gVar = h1uVar.y.a;
            String d = vw10Var.d();
            fx10.d dVar = new fx10.d(gVar, d, h1uVar.b(gVar, d));
            dVar.i(vw10Var);
            if (h1uVar.d == dVar) {
                return;
            }
            h1uVar.k(h1uVar, dVar, h1uVar.z, 3, true, h1uVar.y, collection);
            h1uVar.y = null;
            h1uVar.z = null;
        }
    }

    /* compiled from: GlobalMediaRouter.java */
    public final class b extends Handler {
        public final ArrayList<fx10.b> a = new ArrayList<>();
        public final ArrayList b = new ArrayList();

        public b() {
        }

        public static void a(fx10.b bVar, int i, Object obj, int i2) {
            fx10.h hVar;
            fx10.h hVar2;
            fx10 fx10Var = bVar.a;
            fx10.a aVar = bVar.b;
            int i3 = 65280 & i;
            if (i3 != 256) {
                if (i3 != 512) {
                    if (i3 == 768 && i == 769) {
                        aVar.onRouterParamsChanged(fx10Var, (rx10) obj);
                        return;
                    }
                    return;
                }
                fx10.g gVar = (fx10.g) obj;
                switch (i) {
                    case 513:
                        aVar.onProviderAdded(fx10Var, gVar);
                        return;
                    case 514:
                        aVar.onProviderRemoved(fx10Var, gVar);
                        return;
                    case 515:
                        aVar.onProviderChanged(fx10Var, gVar);
                        return;
                    default:
                        return;
                }
            }
            if (i == 264 || i == 262) {
                i iVar = (i) obj;
                fx10.h hVar3 = iVar.b;
                hVar = iVar.a;
                hVar2 = hVar3;
            } else {
                hVar = null;
                if (i == 265 || i == 266) {
                    throw null;
                }
                hVar2 = (fx10.h) obj;
            }
            if (hVar2 != null) {
                boolean z = true;
                if ((bVar.d & 2) == 0 && !hVar2.h(bVar.c)) {
                    rx10 rx10Var = fx10.c().v;
                    z = ((rx10Var == null ? false : rx10Var.c) && hVar2.d() && i == 262 && i2 == 3 && hVar != null) ? true ^ hVar.d() : false;
                }
                if (z) {
                    switch (i) {
                        case 257:
                            aVar.onRouteAdded(fx10Var, hVar2);
                            return;
                        case 258:
                            aVar.onRouteRemoved(fx10Var, hVar2);
                            return;
                        case 259:
                            aVar.onRouteChanged(fx10Var, hVar2);
                            return;
                        case 260:
                            aVar.onRouteVolumeChanged(fx10Var, hVar2);
                            return;
                        case 261:
                            aVar.onRoutePresentationDisplayChanged(fx10Var, hVar2);
                            return;
                        case 262:
                            aVar.onRouteSelected(fx10Var, hVar2, i2, hVar2);
                            return;
                        case 263:
                            aVar.onRouteUnselected(fx10Var, hVar2, i2);
                            return;
                        case 264:
                            aVar.onRouteSelected(fx10Var, hVar2, i2, hVar);
                            return;
                        case 265:
                            aVar.onRouteConnected(fx10Var, hVar, hVar2);
                            return;
                        case 266:
                            aVar.onRouteDisconnected(fx10Var, hVar, hVar2, i2);
                            return;
                        default:
                            return;
                    }
                }
            }
        }

        public final void b(int i, Object obj) {
            obtainMessage(i, obj).sendToTarget();
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int o;
            ArrayList<fx10.b> arrayList = this.a;
            h1u h1uVar = h1u.this;
            ArrayList<WeakReference<fx10>> arrayList2 = h1uVar.i;
            int i = message.what;
            Object obj = message.obj;
            int i2 = message.arg1;
            if (i == 259 && h1uVar.h().c.equals(((fx10.h) obj).c)) {
                h1uVar.r(true);
            }
            ArrayList arrayList3 = this.b;
            if (i == 262) {
                i iVar = (i) obj;
                fx10.h hVar = iVar.b;
                if (iVar.c) {
                    h1uVar.t.u(hVar);
                }
                if (h1uVar.w != null && hVar.d()) {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        h1uVar.t.t((fx10.h) it.next());
                    }
                    arrayList3.clear();
                }
            } else if (i != 264) {
                switch (i) {
                    case 257:
                        h1uVar.t.s((fx10.h) obj);
                        break;
                    case 258:
                        h1uVar.t.t((fx10.h) obj);
                        break;
                    case 259:
                        xta0.a aVar = h1uVar.t;
                        fx10.h hVar2 = (fx10.h) obj;
                        aVar.getClass();
                        if (hVar2.c() != aVar && (o = aVar.o(hVar2)) >= 0) {
                            xta0.b.x(aVar.s.get(o));
                            break;
                        }
                        break;
                }
            } else {
                i iVar2 = (i) obj;
                fx10.h hVar3 = iVar2.b;
                arrayList3.add(hVar3);
                h1uVar.t.s(hVar3);
                if (iVar2.c) {
                    h1uVar.t.u(hVar3);
                }
            }
            try {
                int size = arrayList2.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        Iterator<fx10.b> it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            a(it2.next(), i, obj, i2);
                        }
                        arrayList.clear();
                        return;
                    }
                    fx10 fx10Var = arrayList2.get(size).get();
                    if (fx10Var == null) {
                        arrayList2.remove(size);
                    } else {
                        arrayList.addAll(fx10Var.b);
                    }
                }
            } catch (Throwable th) {
                arrayList.clear();
                throw th;
            }
        }
    }

    /* compiled from: GlobalMediaRouter.java */
    public final class c {
        public final MediaSessionCompat a;
        public k1u b;

        public c(MediaSessionCompat mediaSessionCompat) {
            this.a = mediaSessionCompat;
        }

        public final void a() {
            this.a.setPlaybackToLocal(h1u.this.o.d);
            this.b = null;
        }
    }

    /* compiled from: GlobalMediaRouter.java */
    public final class d extends jw10.b {
        public d() {
        }
    }

    /* compiled from: GlobalMediaRouter.java */
    public final class e extends bx10.a {
        public e() {
        }
    }

    /* compiled from: GlobalMediaRouter.java */
    public final class f {
    }

    /* compiled from: GlobalMediaRouter.java */
    public static final class h {
    }

    /* compiled from: GlobalMediaRouter.java */
    public static final class i {

        @Nullable
        public final fx10.h a;

        @NonNull
        public final fx10.h b;
        public final boolean c;

        public i(fx10.h hVar, fx10.h hVar2, boolean z) {
            this.a = hVar;
            this.b = hVar2;
            this.c = z;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h1u(Context context) {
        boolean z;
        bx10 bx10Var;
        kqf0 kqf0Var;
        cvf0 cvf0Var = new cvf0();
        cvf0Var.c = 0;
        cvf0Var.d = 3;
        this.o = cvf0Var;
        this.p = new e();
        this.F = new a();
        this.h = context;
        this.q = ((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            int i3 = MediaTransferReceiver.a;
            Intent intent = new Intent(context, (Class<?>) MediaTransferReceiver.class);
            intent.setPackage(context.getPackageName());
            if (context.getPackageManager().queryBroadcastReceivers(intent, 0).size() > 0) {
                z = true;
                this.r = z;
                int i4 = drn0.a;
                Intent intent2 = new Intent(context, (Class<?>) drn0.class);
                intent2.setPackage(context.getPackageName());
                context.getPackageManager().queryBroadcastReceivers(intent2, 0).size();
                this.s = (i2 >= 30 || !z) ? null : new jw10(context, new d());
                xta0.a aVar = new xta0.a(context, this);
                this.t = aVar;
                this.u = new qx10(new w29(this, 5));
                a(aVar, true);
                bx10Var = this.s;
                if (bx10Var != null) {
                    a(bx10Var, true);
                }
                kqf0Var = new kqf0(context, this);
                this.c = kqf0Var;
                if (kqf0Var.g) {
                    kqf0Var.g = true;
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                    intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
                    intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
                    intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
                    intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
                    intentFilter.addDataScheme("package");
                    Context context2 = kqf0Var.a;
                    kqf0.a aVar2 = kqf0Var.h;
                    Handler handler = kqf0Var.c;
                    context2.registerReceiver(aVar2, intentFilter, null, handler);
                    handler.post(kqf0Var.i);
                    return;
                }
                return;
            }
        }
        z = false;
        this.r = z;
        int i42 = drn0.a;
        Intent intent22 = new Intent(context, (Class<?>) drn0.class);
        intent22.setPackage(context.getPackageName());
        context.getPackageManager().queryBroadcastReceivers(intent22, 0).size();
        this.s = (i2 >= 30 || !z) ? null : new jw10(context, new d());
        xta0.a aVar3 = new xta0.a(context, this);
        this.t = aVar3;
        this.u = new qx10(new w29(this, 5));
        a(aVar3, true);
        bx10Var = this.s;
        if (bx10Var != null) {
        }
        kqf0Var = new kqf0(context, this);
        this.c = kqf0Var;
        if (kqf0Var.g) {
        }
    }

    public final void a(@NonNull bx10 bx10Var, boolean z) {
        if (d(bx10Var) == null) {
            fx10.g gVar = new fx10.g(bx10Var, z);
            this.m.add(gVar);
            this.a.b(513, gVar);
            p(gVar, bx10Var.h);
            fx10.b();
            bx10Var.e = this.p;
            bx10Var.k(this.A);
        }
    }

    public final String b(fx10.g gVar, String str) {
        String flattenToShortString = gVar.d.a.flattenToShortString();
        boolean z = gVar.c;
        String b2 = z ? str : pzl.b(flattenToShortString, StringUtils.PROCESS_POSTFIX_DELIMITER, str);
        HashMap hashMap = this.l;
        if (!z) {
            ArrayList<fx10.h> arrayList = this.j;
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                }
                if (arrayList.get(i2).c.equals(b2)) {
                    break;
                }
                i2++;
            }
            if (i2 >= 0) {
                int i3 = 2;
                while (true) {
                    Locale locale = Locale.US;
                    String a2 = na8.a(i3, b2, BundleUtil.UNDERLINE_TAG);
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size2) {
                            i4 = -1;
                            break;
                        }
                        if (arrayList.get(i4).c.equals(a2)) {
                            break;
                        }
                        i4++;
                    }
                    if (i4 < 0) {
                        hashMap.put(new qg90(flattenToShortString, str), a2);
                        return a2;
                    }
                    i3++;
                }
            }
        }
        hashMap.put(new qg90(flattenToShortString, str), b2);
        return b2;
    }

    public final fx10.h c() {
        Iterator<fx10.h> it = this.j.iterator();
        while (it.hasNext()) {
            fx10.h next = it.next();
            if (next != this.w && next.c() == this.t && next.m("android.media.intent.category.LIVE_AUDIO") && !next.m("android.media.intent.category.LIVE_VIDEO") && next.f()) {
                return next;
            }
        }
        return this.w;
    }

    public final fx10.g d(bx10 bx10Var) {
        Iterator<fx10.g> it = this.m.iterator();
        while (it.hasNext()) {
            fx10.g next = it.next();
            if (next.a == bx10Var) {
                return next;
            }
        }
        return null;
    }

    @NonNull
    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.k.values().iterator();
        while (it.hasNext()) {
            ((g) it.next()).getClass();
        }
        return arrayList;
    }

    @Nullable
    public final g f(@NonNull fx10.d dVar) {
        Iterator it = this.k.values().iterator();
        while (it.hasNext()) {
            ((g) it.next()).getClass();
        }
        return null;
    }

    @Nullable
    public final bx10.e g(fx10.h hVar) {
        bx10.e eVar;
        if (hVar == this.d && (eVar = this.e) != null) {
            return eVar;
        }
        if (hVar instanceof fx10.d) {
            fx10.d dVar = (fx10.d) hVar;
            if (dVar.n()) {
                f(dVar);
                return null;
            }
        }
        bx10.e eVar2 = (bx10.e) this.b.get(hVar.c);
        if (eVar2 != null) {
            return eVar2;
        }
        Iterator it = this.k.values().iterator();
        if (!it.hasNext()) {
            return eVar2;
        }
        ((g) it.next()).getClass();
        throw null;
    }

    @NonNull
    public final fx10.h h() {
        fx10.h hVar = this.d;
        if (hVar != null) {
            return hVar;
        }
        throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
    }

    public final boolean i() {
        if (!this.r) {
            return false;
        }
        rx10 rx10Var = this.v;
        return rx10Var == null || rx10Var.a;
    }

    public final void j() {
        bx10.e g2;
        if (this.d.e()) {
            List<fx10.h> unmodifiableList = Collections.unmodifiableList(this.d.v);
            HashSet hashSet = new HashSet();
            Iterator it = unmodifiableList.iterator();
            while (it.hasNext()) {
                hashSet.add(((fx10.h) it.next()).c);
            }
            HashMap hashMap = this.b;
            Iterator it2 = hashMap.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet.contains(entry.getKey())) {
                    bx10.e eVar = (bx10.e) entry.getValue();
                    eVar.h(0);
                    eVar.d();
                    it2.remove();
                }
            }
            for (fx10.h hVar : unmodifiableList) {
                if (!hashMap.containsKey(hVar.c) && (g2 = hVar.c().g(hVar.b, this.d.b)) != null) {
                    g2.e();
                    hashMap.put(hVar.c, g2);
                }
            }
        }
    }

    public final void k(h1u h1uVar, fx10.h hVar, @Nullable bx10.e eVar, int i2, boolean z, @Nullable fx10.h hVar2, @Nullable Collection<bx10.b.a> collection) {
        fx10.e eVar2;
        fx10.f fVar = this.g;
        if (fVar != null) {
            fVar.a();
            this.g = null;
        }
        fx10.f fVar2 = new fx10.f(h1uVar, hVar, eVar, i2, z, hVar2, collection);
        this.g = fVar2;
        if (fVar2.b != 3 || (eVar2 = this.f) == null) {
            fVar2.b();
            return;
        }
        ugz<Void> onPrepareTransfer = eVar2.onPrepareTransfer(this.d, fVar2.e);
        if (onPrepareTransfer == null) {
            this.g.b();
            return;
        }
        fx10.f fVar3 = this.g;
        h1u h1uVar2 = fVar3.h.get();
        if (h1uVar2 == null || h1uVar2.g != fVar3) {
            fVar3.a();
            return;
        }
        if (fVar3.i != null) {
            throw new IllegalStateException("future is already set");
        }
        fVar3.i = onPrepareTransfer;
        cs2 cs2Var = new cs2(fVar3, 13);
        final b bVar = h1uVar2.a;
        Objects.requireNonNull(bVar);
        onPrepareTransfer.addListener(cs2Var, new Executor() { // from class: xsna.gx10
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                h1u.b.this.post(runnable);
            }
        });
    }

    public final void l(@NonNull fx10.h hVar, int i2, boolean z) {
        if (!this.j.contains(hVar)) {
            Objects.toString(hVar);
            return;
        }
        if (!hVar.g) {
            hVar.toString();
            return;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            bx10 c2 = hVar.c();
            jw10 jw10Var = this.s;
            if (c2 == jw10Var && this.d != hVar) {
                MediaRoute2Info l = jw10Var.l(hVar.b);
                if (l == null) {
                    return;
                }
                jw10Var.j.transferTo(l);
                return;
            }
        }
        m(hVar, i2, z);
    }

    public final void m(@NonNull fx10.h hVar, int i2, boolean z) {
        dx10 dx10Var;
        if (this.d == hVar) {
            return;
        }
        boolean z2 = hVar == this.w;
        if (this.x != null && z2) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            for (int i3 = 3; i3 < stackTrace.length; i3++) {
                StackTraceElement stackTraceElement = stackTrace[i3];
                stackTraceElement.getClassName();
                stackTraceElement.getMethodName();
                stackTraceElement.getLineNumber();
            }
            if (this.d != null) {
                Locale locale = Locale.US;
                fx10.b();
                fx10.h hVar2 = fx10.c().x;
            }
            this.h.getPackageName();
        }
        if (this.y != null) {
            this.y = null;
            bx10.b bVar = this.z;
            if (bVar != null) {
                bVar.h(3);
                this.z.d();
                this.z = null;
            }
        }
        if (i() && (dx10Var = hVar.a.e) != null && dx10Var.b) {
            bx10 c2 = hVar.c();
            String str = hVar.b;
            Bundle bundle = new Bundle();
            bundle.putString("clientPackageName", this.h.getPackageName());
            final bx10.b a2 = c2.a(str, new bx10.f(bundle));
            if (a2 != null) {
                Executor mainExecutor = this.h.getMainExecutor();
                final a aVar = this.F;
                synchronized (a2.a) {
                    try {
                        if (mainExecutor == null) {
                            throw new NullPointerException("Executor shouldn't be null");
                        }
                        if (aVar == null) {
                            throw new NullPointerException("Listener shouldn't be null");
                        }
                        a2.b = mainExecutor;
                        a2.c = aVar;
                        ArrayList arrayList = a2.e;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            final vw10 vw10Var = a2.d;
                            final ArrayList arrayList2 = a2.e;
                            a2.d = null;
                            a2.e = null;
                            a2.b.execute(new Runnable() { // from class: xsna.cx10
                                @Override // java.lang.Runnable
                                public final void run() {
                                    aVar.a(bx10.b.this, vw10Var, arrayList2);
                                }
                            });
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.y = hVar;
                this.z = a2;
                a2.e();
                return;
            }
            hVar.toString();
        }
        bx10 c3 = hVar.c();
        String str2 = hVar.b;
        Bundle bundle2 = new Bundle();
        bundle2.putString("clientPackageName", this.h.getPackageName());
        bx10.e h2 = c3.h(str2, new bx10.f(bundle2));
        if (h2 != null) {
            h2.e();
        }
        if (this.d != null) {
            k(this, hVar, h2, i2, z, null, null);
            return;
        }
        this.d = hVar;
        this.e = h2;
        b bVar2 = this.a;
        bVar2.getClass();
        Message obtainMessage = bVar2.obtainMessage(262, new i(null, hVar, z));
        obtainMessage.arg1 = i2;
        obtainMessage.sendToTarget();
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0142, code lost:
    
        if (r23.B.b() == r1) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n() {
        long j;
        ex10.a aVar;
        ArrayList<WeakReference<fx10>> arrayList;
        boolean z;
        int i2;
        ex10.a aVar2 = new ex10.a();
        qx10 qx10Var = this.u;
        long j2 = 0;
        qx10Var.c = 0L;
        int i3 = 0;
        qx10Var.e = false;
        qx10Var.d = SystemClock.elapsedRealtime();
        qx10Var.a.removeCallbacks(qx10Var.b);
        ArrayList<WeakReference<fx10>> arrayList2 = this.i;
        int size = arrayList2.size();
        int i4 = 0;
        boolean z2 = false;
        while (true) {
            size--;
            if (size < 0) {
                ex10.a aVar3 = aVar2;
                long j3 = j2;
                qx10 qx10Var2 = this.u;
                if (qx10Var2.e) {
                    long j4 = qx10Var2.c;
                    if (j4 > j3) {
                        qx10Var2.a.postDelayed(qx10Var2.b, j4);
                    }
                }
                boolean z3 = qx10Var2.e;
                this.C = i4;
                ex10 a2 = z2 ? aVar3.a() : ex10.c;
                ex10 a3 = aVar3.a();
                if (i()) {
                    yw10 yw10Var = this.B;
                    if (yw10Var != null) {
                        yw10Var.a();
                        if (yw10Var.b.equals(a3)) {
                        }
                    }
                    if (!a3.d() || z3) {
                        this.B = new yw10(a3, z3);
                    } else if (this.B != null) {
                        this.B = null;
                    }
                    this.s.k(this.B);
                }
                yw10 yw10Var2 = this.A;
                if (yw10Var2 != null) {
                    yw10Var2.a();
                    if (yw10Var2.b.equals(a2) && this.A.b() == z3) {
                        return;
                    }
                }
                if (!a2.d() || z3) {
                    this.A = new yw10(a2, z3);
                } else if (this.A == null) {
                    return;
                } else {
                    this.A = null;
                }
                Iterator<fx10.g> it = this.m.iterator();
                while (it.hasNext()) {
                    bx10 bx10Var = it.next().a;
                    if (bx10Var != this.s) {
                        bx10Var.k(this.A);
                    }
                }
                return;
            }
            fx10 fx10Var = arrayList2.get(size).get();
            if (fx10Var == null) {
                arrayList2.remove(size);
            } else {
                ArrayList<fx10.b> arrayList3 = fx10Var.b;
                int size2 = arrayList3.size();
                i4 += size2;
                int i5 = i3;
                while (i5 < size2) {
                    fx10.b bVar = arrayList3.get(i5);
                    ex10 ex10Var = bVar.c;
                    if (ex10Var == null) {
                        throw new IllegalArgumentException("selector must not be null");
                    }
                    ArrayList c2 = ex10Var.c();
                    if (!c2.isEmpty()) {
                        Iterator it2 = c2.iterator();
                        while (it2.hasNext()) {
                            String str = (String) it2.next();
                            if (str == null) {
                                throw new IllegalArgumentException("category must not be null");
                            }
                            if (aVar2.a == null) {
                                aVar2.a = new ArrayList<>();
                            }
                            if (!aVar2.a.contains(str)) {
                                aVar2.a.add(str);
                            }
                        }
                    }
                    int i6 = (bVar.d & 1) != 0 ? 1 : i3;
                    long j5 = j2;
                    long j6 = bVar.e;
                    qx10 qx10Var3 = this.u;
                    if (i6 == 0) {
                        qx10Var3.getClass();
                        j = j5;
                    } else {
                        j = j5;
                        long j7 = qx10Var3.d;
                        if (j7 - j6 < ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS) {
                            aVar = aVar2;
                            arrayList = arrayList2;
                            qx10Var3.c = Math.max(qx10Var3.c, (j6 + ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS) - j7);
                            z = true;
                            qx10Var3.e = true;
                            if (i6 != 0) {
                                z2 = z;
                            }
                            i2 = bVar.d;
                            if ((i2 & 4) != 0 && !this.q) {
                                z2 = z;
                            }
                            if ((i2 & 8) == 0) {
                                z2 = z;
                            }
                            i5++;
                            aVar2 = aVar;
                            j2 = j;
                            arrayList2 = arrayList;
                            i3 = 0;
                        }
                    }
                    aVar = aVar2;
                    arrayList = arrayList2;
                    z = true;
                    if (i6 != 0) {
                    }
                    i2 = bVar.d;
                    if ((i2 & 4) != 0) {
                        z2 = z;
                    }
                    if ((i2 & 8) == 0) {
                    }
                    i5++;
                    aVar2 = aVar;
                    j2 = j;
                    arrayList2 = arrayList;
                    i3 = 0;
                }
            }
            aVar2 = aVar2;
            j2 = j2;
            arrayList2 = arrayList2;
            i3 = 0;
        }
    }

    @SuppressLint({"NewApi"})
    public final void o() {
        MediaRouter2.RoutingController routingController;
        fx10.h hVar = this.d;
        if (hVar == null) {
            c cVar = this.D;
            if (cVar != null) {
                cVar.a();
                return;
            }
            return;
        }
        int i2 = hVar.p;
        cvf0 cvf0Var = this.o;
        cvf0Var.a = i2;
        cvf0Var.b = hVar.q;
        cvf0Var.c = (!hVar.e() || fx10.g()) ? hVar.o : 0;
        cvf0Var.d = this.d.m;
        if (i() && this.d.c() == this.s) {
            bx10.e eVar = this.e;
            cvf0Var.e = ((eVar instanceof jw10.d) && (routingController = ((jw10.d) eVar).g) != null) ? routingController.getId() : null;
        } else {
            cvf0Var.e = null;
        }
        Iterator<f> it = this.n.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw null;
        }
        c cVar2 = this.D;
        if (cVar2 != null) {
            fx10.h hVar2 = this.d;
            fx10.h hVar3 = this.w;
            if (hVar3 == null) {
                throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
            }
            if (hVar2 == hVar3 || hVar2 == this.x) {
                cVar2.a();
                return;
            }
            int i3 = cvf0Var.c == 1 ? 2 : 0;
            int i4 = cvf0Var.b;
            int i5 = cvf0Var.a;
            String str = cvf0Var.e;
            MediaSessionCompat mediaSessionCompat = cVar2.a;
            k1u k1uVar = cVar2.b;
            if (k1uVar == null || i3 != 0 || i4 != 0) {
                k1u k1uVar2 = new k1u(cVar2, i3, i4, i5, str);
                cVar2.b = k1uVar2;
                mediaSessionCompat.setPlaybackToRemote(k1uVar2);
            } else {
                k1uVar.d = i5;
                f7x0.a.a(k1uVar.a(), i5);
                f7x0.b bVar = k1uVar.e;
                if (bVar != null) {
                    bVar.onVolumeChanged(k1uVar);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r20 == r18.t.h) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0160 A[LOOP:5: B:79:0x015e->B:80:0x0160, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x017b A[LOOP:6: B:83:0x0179->B:84:0x017b, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(fx10.g gVar, dx10 dx10Var) {
        boolean z;
        int size;
        int size2;
        Iterator<vw10> it;
        dx10 dx10Var2 = gVar.e;
        ArrayList arrayList = gVar.b;
        if (dx10Var2 != dx10Var) {
            gVar.e = dx10Var;
            ArrayList<fx10.h> arrayList2 = this.j;
            int i2 = 0;
            b bVar = this.a;
            if (dx10Var != null) {
                List<vw10> list = dx10Var.a;
                int size3 = list.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    vw10 vw10Var = list.get(i3);
                    if (vw10Var != null && vw10Var.e()) {
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                Iterator<vw10> it2 = list.iterator();
                int i4 = 0;
                boolean z2 = false;
                while (it2.hasNext()) {
                    vw10 next = it2.next();
                    if (next == null || !next.e()) {
                        it = it2;
                        Objects.toString(next);
                    } else {
                        String d2 = next.d();
                        int size4 = arrayList.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= size4) {
                                i5 = -1;
                                break;
                            } else if (((fx10.h) arrayList.get(i5)).b.equals(d2)) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                        if (i5 < 0) {
                            it = it2;
                            fx10.h hVar = new fx10.h(gVar, d2, b(gVar, d2), next.a.getBoolean("isSystemRoute", false));
                            int i6 = i4 + 1;
                            arrayList.add(i4, hVar);
                            arrayList2.add(hVar);
                            if (next.c().isEmpty()) {
                                hVar.i(next);
                                bVar.b(257, hVar);
                            } else {
                                arrayList3.add(new qg90(hVar, next));
                            }
                            i4 = i6;
                        } else {
                            it = it2;
                            if (i5 < i4) {
                                next.toString();
                            } else {
                                fx10.h hVar2 = (fx10.h) arrayList.get(i5);
                                int i7 = i4 + 1;
                                Collections.swap(arrayList, i5, i4);
                                if (!next.c().isEmpty()) {
                                    arrayList4.add(new qg90(hVar2, next));
                                } else if (q(hVar2, next) != 0 && hVar2 == this.d) {
                                    i4 = i7;
                                    z2 = true;
                                }
                                i4 = i7;
                            }
                        }
                    }
                    it2 = it;
                }
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    qg90 qg90Var = (qg90) it3.next();
                    fx10.h hVar3 = (fx10.h) qg90Var.a;
                    hVar3.i((vw10) qg90Var.b);
                    bVar.b(257, hVar3);
                }
                Iterator it4 = arrayList4.iterator();
                boolean z3 = z2;
                while (it4.hasNext()) {
                    qg90 qg90Var2 = (qg90) it4.next();
                    fx10.h hVar4 = (fx10.h) qg90Var2.a;
                    if (q(hVar4, (vw10) qg90Var2.b) != 0 && hVar4 == this.d) {
                        z3 = true;
                    }
                }
                z = z3;
                i2 = i4;
                for (size = arrayList.size() - 1; size >= i2; size--) {
                    fx10.h hVar5 = (fx10.h) arrayList.get(size);
                    hVar5.i(null);
                    arrayList2.remove(hVar5);
                }
                r(z);
                for (size2 = arrayList.size() - 1; size2 >= i2; size2--) {
                    bVar.b(258, (fx10.h) arrayList.remove(size2));
                }
                bVar.b(515, gVar);
            }
            if (dx10Var != null) {
                dx10Var.toString();
            } else {
                Objects.toString(gVar.d.a);
            }
            z = false;
            while (size >= i2) {
            }
            r(z);
            while (size2 >= i2) {
            }
            bVar.b(515, gVar);
        }
    }

    public final int q(fx10.h hVar, vw10 vw10Var) {
        int i2 = hVar.i(vw10Var);
        if (i2 != 0) {
            int i3 = i2 & 1;
            b bVar = this.a;
            if (i3 != 0) {
                bVar.b(259, hVar);
            }
            if ((i2 & 2) != 0) {
                bVar.b(260, hVar);
            }
            if ((i2 & 4) != 0) {
                bVar.b(261, hVar);
            }
        }
        return i2;
    }

    public final void r(boolean z) {
        fx10.h hVar = this.w;
        if (hVar != null && !hVar.f()) {
            Objects.toString(this.w);
            this.w = null;
        }
        fx10.h hVar2 = this.w;
        ArrayList<fx10.h> arrayList = this.j;
        if (hVar2 == null) {
            Iterator<fx10.h> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                fx10.h next = it.next();
                if (next.c() == this.t && next.b.equals("DEFAULT_ROUTE") && next.f()) {
                    this.w = next;
                    Objects.toString(next);
                    break;
                }
            }
        }
        fx10.h hVar3 = this.x;
        if (hVar3 != null && !hVar3.f()) {
            Objects.toString(this.x);
            this.x = null;
        }
        if (this.x == null) {
            Iterator<fx10.h> it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                fx10.h next2 = it2.next();
                if (next2.c() == this.t && next2.m("android.media.intent.category.LIVE_AUDIO") && !next2.m("android.media.intent.category.LIVE_VIDEO") && next2.f()) {
                    this.x = next2;
                    Objects.toString(next2);
                    break;
                }
            }
        }
        fx10.h hVar4 = this.d;
        if (hVar4 == null || !hVar4.g) {
            Objects.toString(hVar4);
            m(c(), 0, true);
        } else if (z) {
            j();
            o();
        }
    }

    /* compiled from: GlobalMediaRouter.java */
    public class g implements bx10.b.InterfaceC2630b {
        @Override // xsna.bx10.b.InterfaceC2630b
        public final void a(@NonNull bx10.b bVar, @Nullable vw10 vw10Var, @NonNull Collection<bx10.b.a> collection) {
        }
    }
}
