package xsna;

import android.net.Uri;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.attaches.Attach;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.ftx0;

/* compiled from: GenericUploader.kt */
/* loaded from: classes2.dex */
public abstract class yjt<T extends Attach & ftx0, UploadServer, UploadedFile, SaveInfo> implements odq0, z2e0, m7r0 {
    public static final LinkedHashMap h = new LinkedHashMap();
    public static final ConcurrentHashMap<String, Lock> i = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, CopyOnWriteArraySet<z2e0>> j = new ConcurrentHashMap<>();
    public final w2w b;
    public final T c;
    public final ExecutorService d;
    public dh30 e;
    public float f;
    public int g;

    /* JADX WARN: Multi-variable type inference failed */
    public yjt(w2w w2wVar, Attach attach) {
        asu0.a.getClass();
        ExecutorService q = asu0.q();
        this.b = w2wVar;
        this.c = attach;
        this.d = q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.odq0
    public g2z a(Attach attach, dh30 dh30Var) {
        Future<?> future = null;
        try {
            try {
                Uri f = f();
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"GenericUploader", "UPLOAD_TRACE Uploading file for attach " + attach.xb() + ", file=" + f});
                }
                k(dh30Var);
                i(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                future = m(f);
                Object obj = future.get();
                i(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                g2z g2zVar = new g2z(n(obj));
                try {
                    return g2zVar;
                } catch (Throwable th) {
                    return g2zVar;
                }
            } catch (InterruptedException e) {
                if (future != null) {
                    future.cancel(true);
                }
                throw e;
            } catch (Exception e2) {
                throw e2;
            }
        } finally {
            try {
                b();
            } catch (Throwable th2) {
                com.vk.metrics.eventtracking.b.a.q(th2);
            }
        }
    }

    public void b() {
        Lock g = g();
        g.lock();
        try {
            g.unlock();
            g = g();
            g.lock();
            try {
                CopyOnWriteArraySet<z2e0> copyOnWriteArraySet = j.get(e());
                if (copyOnWriteArraySet != null) {
                    copyOnWriteArraySet.remove(this.e);
                }
                g.unlock();
                this.b.a1().b();
            } finally {
            }
        } finally {
        }
    }

    public abstract Uri d() throws Exception;

    public final String e() {
        String path;
        File i1 = this.c.i1();
        return (i1 == null || (path = i1.getPath()) == null) ? "" : path;
    }

    public abstract Uri f();

    public final Lock g() {
        Lock putIfAbsent;
        String e = e();
        ConcurrentHashMap<String, Lock> concurrentHashMap = i;
        Lock lock = concurrentHashMap.get(e);
        if (lock == null && (putIfAbsent = concurrentHashMap.putIfAbsent(e, (lock = new ReentrantLock()))) != null) {
            lock = putIfAbsent;
        }
        return lock;
    }

    public abstract UploadServer h();

    public final void i(float f) {
        this.g += (int) (this.f * 1000);
        onProgress(0, 1000);
        this.f = f;
    }

    public abstract SaveInfo j(UploadedFile uploadedfile);

    public final void k(dh30 dh30Var) {
        CopyOnWriteArraySet<z2e0> putIfAbsent;
        Lock g = g();
        g.lock();
        try {
            this.e = dh30Var;
            ConcurrentHashMap<String, CopyOnWriteArraySet<z2e0>> concurrentHashMap = j;
            String e = e();
            CopyOnWriteArraySet<z2e0> copyOnWriteArraySet = concurrentHashMap.get(e);
            if (copyOnWriteArraySet == null && (putIfAbsent = concurrentHashMap.putIfAbsent(e, (copyOnWriteArraySet = new CopyOnWriteArraySet<>()))) != null) {
                copyOnWriteArraySet = putIfAbsent;
            }
            copyOnWriteArraySet.add(dh30Var);
            g.unlock();
        } catch (Throwable th) {
            g.unlock();
            throw th;
        }
    }

    public abstract boolean l();

    public final Future<?> m(final Uri uri) {
        LinkedHashMap linkedHashMap = h;
        Lock g = g();
        g.lock();
        try {
            boolean containsKey = linkedHashMap.containsKey(e());
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{"GenericUploader", "UPLOAD_TRACE startOrGetUploadTask - contains key '" + e() + "': " + containsKey + ", current uploadFutures: " + linkedHashMap.keySet()});
            }
            if (containsKey) {
                L l2 = L.a;
                l2.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l2, L.LogType.i, new Object[]{"GenericUploader", "UPLOAD_TRACE Reusing existing upload task for key '" + e() + "', file=" + uri});
                }
            } else {
                L l3 = L.a;
                l3.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l3, L.LogType.i, new Object[]{"GenericUploader", "UPLOAD_TRACE Creating new upload task for key '" + e() + "', file=" + uri});
                }
            }
            String e = e();
            Object obj = linkedHashMap.get(e);
            if (obj == null) {
                L l4 = L.a;
                l4.getClass();
                LoggerOutputTarget loggerOutputTarget = LoggerOutputTarget.NONE;
                if (!L.m(loggerOutputTarget)) {
                    L.u(l4, L.LogType.d, new Object[]{"GenericUploader", "UPLOAD_TRACE creating new future with key ".concat(e())});
                }
                FutureTask futureTask = new FutureTask(new Callable() { // from class: xsna.wjt
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r4v0, types: [T, android.net.Uri] */
                    /* JADX WARN: Type inference failed for: r4v9, types: [T, android.net.Uri] */
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        final boolean z;
                        float f;
                        final yjt yjtVar = yjt.this;
                        T t = yjtVar.c;
                        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                        ref$ObjectRef.element = uri;
                        L l5 = L.a;
                        l5.getClass();
                        LoggerOutputTarget loggerOutputTarget2 = LoggerOutputTarget.NONE;
                        if (!L.m(loggerOutputTarget2)) {
                            L.u(l5, L.LogType.d, new Object[]{"GenericUploader", "UPLOAD_TRACE do upload file with key " + yjtVar.e() + " and path " + ref$ObjectRef.element});
                        }
                        try {
                            if (!L.m(loggerOutputTarget2)) {
                                L.u(l5, L.LogType.d, new Object[]{"GenericUploader", "UPLOAD_TRACE Checking if conversion needed for attach " + t.xb()});
                            }
                            z = yjtVar.l();
                        } catch (Exception e2) {
                            L l6 = L.a;
                            l6.getClass();
                            if (!L.m(LoggerOutputTarget.NONE)) {
                                L.u(l6, L.LogType.e, new Object[]{"GenericUploader", "UPLOAD_TRACE shouldConvert() failed for attach " + t.xb() + ": " + e2.getMessage()});
                            }
                            com.vk.metrics.eventtracking.b.a.q(e2);
                            z = false;
                        }
                        if (z) {
                            try {
                                L.c("GenericUploader", new gzs() { // from class: xsna.xjt
                                    @Override // xsna.gzs
                                    public final Object invoke() {
                                        return "UPLOAD_TRACE Starting conversion for attach " + yjt.this.c.xb() + ", file=" + ref$ObjectRef.element + ", shouldConvert=" + z;
                                    }
                                });
                                yjtVar.i(0.46f);
                                ref$ObjectRef.element = yjtVar.d();
                                L l7 = L.a;
                                l7.getClass();
                                if (!L.m(LoggerOutputTarget.NONE)) {
                                    L.u(l7, L.LogType.i, new Object[]{"GenericUploader", "UPLOAD_TRACE Conversion successful for attach " + t.xb() + ", convertedFile=" + ref$ObjectRef.element});
                                }
                            } catch (InterruptedException e3) {
                                L l8 = L.a;
                                l8.getClass();
                                if (!L.m(LoggerOutputTarget.NONE)) {
                                    L.u(l8, L.LogType.w, new Object[]{"GenericUploader", "UPLOAD_TRACE Conversion interrupted for attach " + t.xb()});
                                }
                                throw e3;
                            } catch (Exception e4) {
                                L.h("GenericUploader", new com.vk.voip.a(14, yjtVar, e4));
                            }
                            f = 0.47f;
                        } else {
                            L l9 = L.a;
                            l9.getClass();
                            if (!L.m(LoggerOutputTarget.NONE)) {
                                L.u(l9, L.LogType.d, new Object[]{"GenericUploader", "UPLOAD_TRACE No conversion needed for attach " + t.xb()});
                            }
                            f = 0.93f;
                        }
                        yjtVar.i(0.05f);
                        L l10 = L.a;
                        l10.getClass();
                        LoggerOutputTarget loggerOutputTarget3 = LoggerOutputTarget.NONE;
                        if (!L.m(loggerOutputTarget3)) {
                            L.u(l10, L.LogType.d, new Object[]{"GenericUploader", "UPLOAD_TRACE Getting upload server for attach " + t.xb()});
                        }
                        Object h2 = yjtVar.h();
                        if (!L.m(loggerOutputTarget3)) {
                            L.u(l10, L.LogType.d, new Object[]{"GenericUploader", "UPLOAD_TRACE Got upload server for attach " + t.xb() + ": " + h2});
                        }
                        yjtVar.i(f);
                        if (!L.m(loggerOutputTarget3)) {
                            L.u(l10, L.LogType.d, new Object[]{"GenericUploader", "UPLOAD_TRACE Starting file upload for attach " + t.xb() + ", file=" + ref$ObjectRef.element});
                        }
                        Object o = yjtVar.o((Uri) ref$ObjectRef.element, h2);
                        if (!L.m(loggerOutputTarget3)) {
                            L.u(l10, L.LogType.d, new Object[]{"GenericUploader", "UPLOAD_TRACE File upload completed for attach " + t.xb()});
                        }
                        yjtVar.i(0.02f);
                        if (!L.m(loggerOutputTarget3)) {
                            L.u(l10, L.LogType.d, new Object[]{"GenericUploader", "UPLOAD_TRACE Saving upload results for attach " + t.xb()});
                        }
                        return yjtVar.j(o);
                    }
                });
                l4.getClass();
                if (!L.m(loggerOutputTarget)) {
                    L.u(l4, L.LogType.d, new Object[]{"GenericUploader", "UPLOAD_TRACE submitting future to executor for key ".concat(e())});
                }
                this.d.submit(futureTask);
                l4.getClass();
                if (!L.m(loggerOutputTarget)) {
                    L.u(l4, L.LogType.d, new Object[]{"GenericUploader", "UPLOAD_TRACE future submitted to executor for key ".concat(e())});
                }
                linkedHashMap.put(e, futureTask);
                obj = futureTask;
            }
            Future<?> future = (Future) obj;
            g.unlock();
            return future;
        } catch (Throwable th) {
            g.unlock();
            throw th;
        }
    }

    public abstract Attach n(SaveInfo saveinfo);

    public abstract Object o(Uri uri, Object obj);

    @Override // xsna.z2e0
    public final void onProgress(int i2, int i3) {
        float f = (i2 / i3) * this.f * 1000;
        CopyOnWriteArraySet<z2e0> copyOnWriteArraySet = j.get(e());
        if (copyOnWriteArraySet != null) {
            Iterator<T> it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                ((z2e0) it.next()).onProgress((int) (this.g + f), 1000);
            }
        }
    }
}
