package com.yandex.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import defpackage.abe;
import defpackage.bl7;
import defpackage.c9v;
import defpackage.ejp;
import defpackage.ffv;
import defpackage.gfv;
import defpackage.hdh;
import defpackage.ht10;
import defpackage.kav;
import defpackage.kes0;
import defpackage.pv50;
import defpackage.u3c;
import defpackage.u53;
import defpackage.v06;
import defpackage.w3i;
import defpackage.w53;
import defpackage.wjm;
import defpackage.xn50;
import defpackage.y9v;
import defpackage.ydz;
import defpackage.yqv;
import defpackage.z83;
import defpackage.zn50;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes15.dex */
public final class a {
    public final Map a = Collections.synchronizedMap(new LinkedHashMap());
    public final w53 b = new w53();
    public final WeakHashMap c = new WeakHashMap();
    public final HashSet d = new HashSet();
    public final List e = Collections.synchronizedList(new ArrayList(4));
    public final Handler f;
    public final w3i g;
    public final c9v h;
    public final wjm i;
    public final Handler j;
    public final gfv k;
    public final abe l;

    public a(Context context, abe abeVar, hdh hdhVar, w3i w3iVar, Handler handler, gfv gfvVar) {
        this.l = abeVar;
        this.g = w3iVar;
        this.j = handler;
        this.k = gfvVar;
        hdhVar.getClass();
        wjm wjmVar = new wjm(context);
        this.i = wjmVar;
        this.h = new c9v(wjmVar);
        HandlerThread handlerThread = new HandlerThread() { // from class: com.yandex.images.ImageDispatcher$ImageDispatcherThread
            private static final String DISPATCHER_THREAD_NAME = "ImageDispatcher";
            private static final int THREAD_PRIORITY_BACKGROUND = 10;
        };
        handlerThread.start();
        final Looper looper = handlerThread.getLooper();
        Handler handler2 = new Handler(looper, this) { // from class: com.yandex.images.ImageDispatcher$ImageDispatcherHandler
            private final a mImageDispatcher;

            {
                this.mImageDispatcher = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x00b3  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x00be  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x00ca  */
            @Override // android.os.Handler
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void handleMessage(Message message) {
                ffv ffvVar;
                ffv ffvVar2;
                String a;
                NetworkInfo activeNetworkInfo;
                int i;
                NetworkUtils$ConnectionStrength networkUtils$ConnectionStrength;
                kav kavVar = kav.c;
                int i2 = message.what;
                if (i2 == 0) {
                    this.mImageDispatcher.d((bl7) message.obj, true);
                    return;
                }
                boolean z = false;
                pv50 pv50Var = null;
                if (i2 == 1) {
                    bl7 bl7Var = (bl7) message.obj;
                    a aVar = this.mImageDispatcher;
                    aVar.getClass();
                    String str = bl7Var.d;
                    Map map = aVar.a;
                    v06 v06Var = (v06) map.get(str);
                    if (v06Var != null) {
                        ArrayList arrayList = v06Var.y;
                        arrayList.remove(bl7Var);
                        v06Var.G = kavVar;
                        if (arrayList.isEmpty() && (ffvVar = v06Var.B) != null && ffvVar.cancel(false)) {
                            map.remove(str);
                        }
                    }
                    if (aVar.d.contains(null)) {
                        Object d = bl7Var.d();
                        if (d == null) {
                            d = bl7Var.d;
                        }
                        aVar.c.remove(d);
                    }
                    w53 w53Var = aVar.b;
                    Object d2 = bl7Var.d();
                    if (d2 != null) {
                        bl7Var = d2;
                    }
                    w53Var.remove(bl7Var);
                    return;
                }
                if (i2 == 11) {
                    pv50 pv50Var2 = (pv50) message.obj;
                    a aVar2 = this.mImageDispatcher;
                    gfv gfvVar2 = aVar2.k;
                    if (pv50Var2 == null || !pv50Var2.a) {
                        gfvVar2.a(NetworkUtils$ConnectionStrength.UNKNOWN);
                        return;
                    }
                    w53 w53Var2 = aVar2.b;
                    if (!w53Var2.isEmpty()) {
                        Iterator it = ((u53) w53Var2.values()).iterator();
                        while (true) {
                            yqv yqvVar = (yqv) it;
                            if (!yqvVar.hasNext()) {
                                break;
                            }
                            bl7 bl7Var2 = (bl7) yqvVar.next();
                            yqvVar.remove();
                            aVar2.d(bl7Var2, false);
                        }
                    }
                    gfvVar2.a(pv50Var2.b);
                    return;
                }
                switch (i2) {
                    case 4:
                        String str2 = (String) message.obj;
                        a aVar3 = this.mImageDispatcher;
                        if (aVar3.d.add(str2)) {
                            Iterator it2 = aVar3.a.values().iterator();
                            while (it2.hasNext()) {
                                v06 v06Var2 = (v06) it2.next();
                                ArrayList arrayList2 = v06Var2.y;
                                ArrayList arrayList3 = v06Var2.y;
                                List unmodifiableList = Collections.unmodifiableList(arrayList2);
                                List list = unmodifiableList;
                                if (list != null && !list.isEmpty()) {
                                    for (int size = unmodifiableList.size() - 1; size >= 0; size--) {
                                        bl7 bl7Var3 = (bl7) unmodifiableList.get(size);
                                        bl7Var3.getClass();
                                        if (TextUtils.equals(null, str2)) {
                                            arrayList3.remove(bl7Var3);
                                            Object d3 = bl7Var3.d();
                                            if (d3 == null) {
                                                d3 = bl7Var3.d;
                                            }
                                            aVar3.c.put(d3, bl7Var3);
                                        }
                                    }
                                    v06Var2.G = kavVar;
                                    if (arrayList3.isEmpty() && (ffvVar2 = v06Var2.B) != null && ffvVar2.cancel(false)) {
                                        it2.remove();
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    case 5:
                        String str3 = (String) message.obj;
                        a aVar4 = this.mImageDispatcher;
                        if (aVar4.d.remove(str3)) {
                            Iterator it3 = aVar4.c.values().iterator();
                            ArrayList arrayList4 = null;
                            while (it3.hasNext()) {
                                bl7 bl7Var4 = (bl7) it3.next();
                                bl7Var4.getClass();
                                if (TextUtils.equals(null, str3)) {
                                    if (arrayList4 == null) {
                                        arrayList4 = new ArrayList();
                                    }
                                    arrayList4.add(bl7Var4);
                                    it3.remove();
                                }
                            }
                            if (arrayList4 != null) {
                                Handler handler3 = aVar4.j;
                                handler3.sendMessage(handler3.obtainMessage(2, arrayList4));
                                return;
                            }
                            return;
                        }
                        return;
                    case 6:
                        v06 v06Var3 = (v06) message.obj;
                        a aVar5 = this.mImageDispatcher;
                        aVar5.getClass();
                        ImageManager$From imageManager$From = v06Var3.E;
                        xn50 xn50Var = v06Var3.c;
                        Object[] objArr = imageManager$From != ImageManager$From.NETWORK;
                        ht10 ht10Var = v06Var3.z;
                        byte[] bArr = ht10Var == null ? null : (byte[]) ht10Var.c;
                        w3i w3iVar2 = aVar5.g;
                        if (bArr != null) {
                            ReentrantLock reentrantLock = (ReentrantLock) w3iVar2.b;
                            z83.d(xn50Var, null);
                            File g = w3iVar2.g(xn50Var);
                            if (g == null) {
                                z83.j("Failed to retrieve image file");
                            } else {
                                String a2 = xn50Var.a();
                                if (a2 != null) {
                                    reentrantLock.lock();
                                    try {
                                        if (g.exists()) {
                                            if (((ArrayList) w3iVar2.x).contains(a2)) {
                                            }
                                            reentrantLock.unlock();
                                        }
                                        w3iVar2.o(bArr, g, a2);
                                        reentrantLock.unlock();
                                    } catch (Throwable th) {
                                        reentrantLock.unlock();
                                        throw th;
                                    }
                                }
                            }
                            if (xn50Var.f) {
                                w3iVar2.d(xn50Var, false);
                            }
                        } else if (w3iVar2.d(xn50Var, true) == null) {
                            ht10 ht10Var2 = v06Var3.z;
                            Bitmap bitmap = ht10Var2 != null ? (Bitmap) ht10Var2.b : null;
                            z83.d(bitmap, "bitmap must not be null if bytes are");
                            if (bitmap != null && (a = xn50Var.a()) != null) {
                                w3iVar2.n(bitmap, v06Var3.w.d(), a);
                            }
                        }
                        aVar5.a.remove(v06Var3.x);
                        ImageDownloadReporter$Status imageDownloadReporter$Status = objArr != false ? ImageDownloadReporter$Status.SUCCEED_FROM_CACHE : ImageDownloadReporter$Status.SUCCEED_FROM_NETWORK;
                        if (!v06Var3.c()) {
                            aVar5.h.v(xn50Var.a, imageDownloadReporter$Status);
                        }
                        aVar5.a(v06Var3);
                        return;
                    case 7:
                        v06 v06Var4 = (v06) message.obj;
                        a aVar6 = this.mImageDispatcher;
                        gfv gfvVar3 = aVar6.k;
                        if (v06Var4.c()) {
                            return;
                        }
                        if (gfvVar3.isShutdown()) {
                            aVar6.b(v06Var4);
                            return;
                        }
                        ConnectivityManager connectivityManager = (ConnectivityManager) aVar6.l.a.getSystemService("connectivity");
                        if (connectivityManager != null) {
                            try {
                                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                            } catch (SecurityException unused) {
                            }
                            if (activeNetworkInfo != null) {
                                boolean isConnected = activeNetworkInfo.isConnected();
                                if (activeNetworkInfo.isConnectedOrConnecting()) {
                                    int type = activeNetworkInfo.getType();
                                    if (type == 0) {
                                        switch (activeNetworkInfo.getSubtype()) {
                                            case 1:
                                            case 2:
                                            case 4:
                                            case 7:
                                            case 11:
                                                networkUtils$ConnectionStrength = NetworkUtils$ConnectionStrength.MOBILE_2G;
                                                break;
                                            case 3:
                                            case 5:
                                            case 6:
                                            case 8:
                                            case 9:
                                            case 10:
                                            case 12:
                                            case 14:
                                            case 15:
                                                networkUtils$ConnectionStrength = NetworkUtils$ConnectionStrength.MOBILE_3G;
                                                break;
                                            case 13:
                                                networkUtils$ConnectionStrength = NetworkUtils$ConnectionStrength.MOBILE_4G;
                                                break;
                                            default:
                                                networkUtils$ConnectionStrength = NetworkUtils$ConnectionStrength.UNKNOWN;
                                                break;
                                        }
                                    } else {
                                        networkUtils$ConnectionStrength = (type == 1 || type == 6) ? NetworkUtils$ConnectionStrength.WIRELESS : type != 9 ? NetworkUtils$ConnectionStrength.UNKNOWN : NetworkUtils$ConnectionStrength.ETHERNET;
                                    }
                                } else {
                                    networkUtils$ConnectionStrength = NetworkUtils$ConnectionStrength.UNKNOWN;
                                }
                                pv50Var = new pv50(isConnected, networkUtils$ConnectionStrength);
                            }
                            Object[] objArr2 = pv50Var == null && pv50Var.a;
                            i = v06Var4.A;
                            if (i > 0) {
                                v06Var4.A = i - 1;
                                z = v06Var4.w.e(pv50Var);
                            }
                            if (z) {
                                if (objArr2 == true) {
                                    aVar6.b(v06Var4);
                                    return;
                                } else {
                                    aVar6.c(v06Var4);
                                    return;
                                }
                            }
                            if (objArr2 == true) {
                                v06Var4.B = (ffv) gfvVar3.submit(v06Var4);
                                return;
                            } else {
                                aVar6.c(v06Var4);
                                return;
                            }
                        }
                        activeNetworkInfo = null;
                        if (activeNetworkInfo != null) {
                        }
                        if (pv50Var == null) {
                        }
                        i = v06Var4.A;
                        if (i > 0) {
                        }
                        if (z) {
                        }
                        break;
                    case 8:
                        this.mImageDispatcher.b((v06) message.obj);
                        return;
                    case 9:
                        a aVar7 = this.mImageDispatcher;
                        aVar7.getClass();
                        List list2 = aVar7.e;
                        ArrayList arrayList5 = new ArrayList(list2);
                        list2.clear();
                        Handler handler4 = aVar7.j;
                        handler4.sendMessage(handler4.obtainMessage(10, arrayList5));
                        return;
                    default:
                        return;
                }
            }
        };
        this.f = handler2;
        if (!((AtomicBoolean) wjmVar.w).compareAndSet(false, true)) {
            z83.j("Attempted to initialize banhammer twice");
        } else {
            wjmVar.x = handler2;
            handler2.post(new ejp(28, wjmVar));
        }
    }

    public final void a(v06 v06Var) {
        if (v06Var.c()) {
            return;
        }
        ht10 ht10Var = v06Var.z;
        Bitmap bitmap = ht10Var != null ? (Bitmap) ht10Var.b : null;
        if (bitmap != null) {
            bitmap.prepareToDraw();
        }
        this.e.add(v06Var);
        Handler handler = this.f;
        if (handler.hasMessages(9)) {
            return;
        }
        handler.sendEmptyMessageDelayed(9, 200L);
    }

    public final void b(v06 v06Var) {
        this.a.remove(v06Var.x);
        if (!v06Var.c()) {
            this.h.v(v06Var.c.a, ImageDownloadReporter$Status.FAILED);
        }
        a(v06Var);
    }

    public final void c(v06 v06Var) {
        zn50 zn50Var = v06Var.w;
        zn50Var.getClass();
        boolean z = zn50Var instanceof kes0;
        this.a.remove(v06Var.x);
        this.h.v(v06Var.c.a, ImageDownloadReporter$Status.NO_CONNECTIVITY);
        if (z) {
            List unmodifiableList = Collections.unmodifiableList(v06Var.y);
            int size = unmodifiableList.size();
            for (int i = 0; i < size; i++) {
                bl7 bl7Var = (bl7) unmodifiableList.get(i);
                bl7Var.f = true;
                Object d = bl7Var.d();
                if (d == null) {
                    d = bl7Var;
                }
                this.b.put(d, bl7Var);
            }
        }
        a(v06Var);
    }

    public final void d(bl7 bl7Var, boolean z) {
        v06 v06Var;
        xn50 xn50Var = bl7Var.b;
        Object obj = bl7Var.d;
        String str = xn50Var.a;
        Long l = (Long) ((ConcurrentHashMap) this.i.c).get(str);
        if (l != null) {
            u3c.a.getClass();
            if (System.currentTimeMillis() - l.longValue() < 0) {
                Handler handler = this.j;
                handler.sendMessage(handler.obtainMessage(12, bl7Var));
                ydz.a();
                return;
            }
        }
        if (this.d.contains(null)) {
            ydz.a.a();
            Object d = bl7Var.d();
            if (d != null) {
                obj = d;
            }
            this.c.put(obj, bl7Var);
            return;
        }
        Map map = this.a;
        v06 v06Var2 = (v06) map.get(obj);
        if (v06Var2 != null) {
            v06Var2.y.add(bl7Var);
            int i = xn50Var.c;
            if (i > v06Var2.D) {
                v06Var2.D = i;
                return;
            }
            return;
        }
        gfv gfvVar = this.k;
        if (gfvVar.isShutdown()) {
            return;
        }
        y9v y9vVar = bl7Var.a.e;
        y9vVar.getClass();
        ArrayList arrayList = y9vVar.a;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            w3i w3iVar = this.g;
            if (i2 >= size) {
                v06Var = new v06(this, w3iVar, bl7Var, y9v.b);
                break;
            }
            zn50 zn50Var = (zn50) arrayList.get(i2);
            if (zn50Var.a(xn50Var)) {
                v06Var = new v06(this, w3iVar, bl7Var, zn50Var);
                break;
            }
            i2++;
        }
        v06Var.B = (ffv) gfvVar.submit(v06Var);
        map.put(obj, v06Var);
        this.h.v(str, ImageDownloadReporter$Status.ENQUEUED);
        if (z) {
            Object d2 = bl7Var.d();
            if (d2 != null) {
                bl7Var = d2;
            }
            this.b.remove(bl7Var);
        }
    }
}
