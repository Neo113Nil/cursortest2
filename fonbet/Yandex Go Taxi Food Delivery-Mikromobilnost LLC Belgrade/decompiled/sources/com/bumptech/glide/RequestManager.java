package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import defpackage.a6e;
import defpackage.b6e;
import defpackage.b9j0;
import defpackage.d95;
import defpackage.d9h;
import defpackage.e5j0;
import defpackage.e9h;
import defpackage.exj;
import defpackage.gdy;
import defpackage.hey;
import defpackage.i7j0;
import defpackage.iax0;
import defpackage.k7j0;
import defpackage.l7j0;
import defpackage.my01;
import defpackage.n7j0;
import defpackage.oax0;
import defpackage.p5j0;
import defpackage.pw21;
import defpackage.qke;
import defpackage.r7j0;
import defpackage.wl60;
import java.io.File;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes10.dex */
public class RequestManager implements ComponentCallbacks2, hey {
    private static final r7j0 DECODE_TYPE_BITMAP;
    private static final r7j0 DECODE_TYPE_GIF;
    private static final r7j0 DOWNLOAD_ONLY_OPTIONS;
    private final Runnable addSelfToLifecycle;
    private boolean clearOnStop;
    private final a6e connectivityMonitor;
    protected final Context context;
    private final CopyOnWriteArrayList<i7j0> defaultRequestListeners;
    protected final Glide glide;
    final gdy lifecycle;
    private boolean pauseAllRequestsOnTrimMemoryModerate;
    private r7j0 requestOptions;
    private final b9j0 requestTracker;
    private final oax0 targetTracker;
    private final n7j0 treeNode;

    static {
        r7j0 r7j0Var = (r7j0) new r7j0().d(Bitmap.class);
        r7j0Var.J = true;
        DECODE_TYPE_BITMAP = r7j0Var;
        r7j0 r7j0Var2 = (r7j0) new r7j0().d(GifDrawable.class);
        r7j0Var2.J = true;
        DECODE_TYPE_GIF = r7j0Var2;
        DOWNLOAD_ONLY_OPTIONS = (r7j0) ((r7j0) r7j0.A(exj.b).q(Priority.LOW)).v(true);
    }

    public RequestManager(Glide glide, gdy gdyVar, n7j0 n7j0Var, b9j0 b9j0Var, b6e b6eVar, Context context) {
        this.targetTracker = new oax0();
        a aVar = new a(this);
        this.addSelfToLifecycle = aVar;
        this.glide = glide;
        this.lifecycle = gdyVar;
        this.treeNode = n7j0Var;
        this.requestTracker = b9j0Var;
        this.context = context;
        Context applicationContext = context.getApplicationContext();
        l7j0 l7j0Var = new l7j0(this, b9j0Var);
        ((e9h) b6eVar).getClass();
        boolean z = qke.h(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        Log.isLoggable("ConnectivityMonitor", 3);
        a6e d9hVar = z ? new d9h(applicationContext, l7j0Var) : new wl60();
        this.connectivityMonitor = d9hVar;
        glide.registerRequestManager(this);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            gdyVar.a(this);
        } else {
            pw21.j().post(aVar);
        }
        gdyVar.a(d9hVar);
        this.defaultRequestListeners = new CopyOnWriteArrayList<>(glide.getGlideContext().getDefaultRequestListeners());
        setRequestOptions(glide.getGlideContext().getDefaultRequestOptions());
    }

    private synchronized void clearRequests() {
        try {
            Iterator it = pw21.i(this.targetTracker.a).iterator();
            while (it.hasNext()) {
                clear((iax0) it.next());
            }
            this.targetTracker.a.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    private void untrackOrDelegate(iax0 iax0Var) {
        boolean untrack = untrack(iax0Var);
        e5j0 request = iax0Var.getRequest();
        if (untrack || this.glide.removeFromManagers(iax0Var) || request == null) {
            return;
        }
        iax0Var.setRequest(null);
        request.clear();
    }

    private synchronized void updateRequestOptions(r7j0 r7j0Var) {
        this.requestOptions = (r7j0) this.requestOptions.a(r7j0Var);
    }

    public RequestManager addDefaultRequestListener(i7j0 i7j0Var) {
        this.defaultRequestListeners.add(i7j0Var);
        return this;
    }

    public synchronized RequestManager applyDefaultRequestOptions(r7j0 r7j0Var) {
        updateRequestOptions(r7j0Var);
        return this;
    }

    public <ResourceType> p5j0 as(Class<ResourceType> cls) {
        return new p5j0(this.glide, this, cls, this.context);
    }

    public p5j0 asBitmap() {
        return as(Bitmap.class).a(DECODE_TYPE_BITMAP);
    }

    public p5j0 asDrawable() {
        return as(Drawable.class);
    }

    public p5j0 asFile() {
        return as(File.class).a(r7j0.B());
    }

    public p5j0 asGif() {
        return as(GifDrawable.class).a(DECODE_TYPE_GIF);
    }

    public void clear(View view) {
        clear(new k7j0(view));
    }

    public synchronized RequestManager clearOnStop() {
        this.clearOnStop = true;
        return this;
    }

    public p5j0 download(Object obj) {
        return downloadOnly().K(obj);
    }

    public p5j0 downloadOnly() {
        return as(File.class).a(DOWNLOAD_ONLY_OPTIONS);
    }

    public List<i7j0> getDefaultRequestListeners() {
        return this.defaultRequestListeners;
    }

    public synchronized r7j0 getDefaultRequestOptions() {
        return this.requestOptions;
    }

    public <T> my01 getDefaultTransitionOptions(Class<T> cls) {
        return this.glide.getGlideContext().getDefaultTransitionOptions(cls);
    }

    public synchronized boolean isPaused() {
        return this.requestTracker.c;
    }

    public p5j0 load(byte[] bArr) {
        p5j0 K = asDrawable().K(bArr);
        if (!d95.j(K.a, 4)) {
            K = K.a(r7j0.A(exj.a));
        }
        return !d95.j(K.a, 256) ? K.a(r7j0.B()) : K;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // defpackage.hey
    public synchronized void onDestroy() {
        this.targetTracker.onDestroy();
        clearRequests();
        b9j0 b9j0Var = this.requestTracker;
        Iterator it = pw21.i(b9j0Var.a).iterator();
        while (it.hasNext()) {
            b9j0Var.a((e5j0) it.next());
        }
        b9j0Var.b.clear();
        this.lifecycle.c(this);
        this.lifecycle.c(this.connectivityMonitor);
        pw21.j().removeCallbacks(this.addSelfToLifecycle);
        this.glide.unregisterRequestManager(this);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // defpackage.hey
    public synchronized void onStart() {
        resumeRequests();
        this.targetTracker.onStart();
    }

    @Override // defpackage.hey
    public synchronized void onStop() {
        try {
            this.targetTracker.onStop();
            if (this.clearOnStop) {
                clearRequests();
            } else {
                pauseRequests();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        if (i == 60 && this.pauseAllRequestsOnTrimMemoryModerate) {
            pauseAllRequestsRecursive();
        }
    }

    public synchronized void pauseAllRequests() {
        b9j0 b9j0Var = this.requestTracker;
        b9j0Var.c = true;
        Iterator it = pw21.i(b9j0Var.a).iterator();
        while (it.hasNext()) {
            e5j0 e5j0Var = (e5j0) it.next();
            if (e5j0Var.isRunning() || e5j0Var.b()) {
                e5j0Var.clear();
                b9j0Var.b.add(e5j0Var);
            }
        }
    }

    public synchronized void pauseAllRequestsRecursive() {
        pauseAllRequests();
        Iterator it = this.treeNode.c().iterator();
        while (it.hasNext()) {
            ((RequestManager) it.next()).pauseAllRequests();
        }
    }

    public synchronized void pauseRequests() {
        b9j0 b9j0Var = this.requestTracker;
        b9j0Var.c = true;
        Iterator it = pw21.i(b9j0Var.a).iterator();
        while (it.hasNext()) {
            e5j0 e5j0Var = (e5j0) it.next();
            if (e5j0Var.isRunning()) {
                e5j0Var.pause();
                b9j0Var.b.add(e5j0Var);
            }
        }
    }

    public synchronized void pauseRequestsRecursive() {
        pauseRequests();
        Iterator it = this.treeNode.c().iterator();
        while (it.hasNext()) {
            ((RequestManager) it.next()).pauseRequests();
        }
    }

    public synchronized void resumeRequests() {
        b9j0 b9j0Var = this.requestTracker;
        b9j0Var.c = false;
        Iterator it = pw21.i(b9j0Var.a).iterator();
        while (it.hasNext()) {
            e5j0 e5j0Var = (e5j0) it.next();
            if (!e5j0Var.b() && !e5j0Var.isRunning()) {
                e5j0Var.j();
            }
        }
        b9j0Var.b.clear();
    }

    public synchronized void resumeRequestsRecursive() {
        pw21.a();
        resumeRequests();
        Iterator it = this.treeNode.c().iterator();
        while (it.hasNext()) {
            ((RequestManager) it.next()).resumeRequests();
        }
    }

    public synchronized RequestManager setDefaultRequestOptions(r7j0 r7j0Var) {
        setRequestOptions(r7j0Var);
        return this;
    }

    public void setPauseAllRequestsOnTrimMemoryModerate(boolean z) {
        this.pauseAllRequestsOnTrimMemoryModerate = z;
    }

    public synchronized void setRequestOptions(r7j0 r7j0Var) {
        r7j0 r7j0Var2 = (r7j0) r7j0Var.clone();
        r7j0Var2.b();
        this.requestOptions = r7j0Var2;
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.requestTracker + ", treeNode=" + this.treeNode + "}";
    }

    public synchronized void track(iax0 iax0Var, e5j0 e5j0Var) {
        this.targetTracker.a.add(iax0Var);
        b9j0 b9j0Var = this.requestTracker;
        b9j0Var.a.add(e5j0Var);
        if (b9j0Var.c) {
            e5j0Var.clear();
            Log.isLoggable("RequestTracker", 2);
            b9j0Var.b.add(e5j0Var);
        } else {
            e5j0Var.j();
        }
    }

    public synchronized boolean untrack(iax0 iax0Var) {
        e5j0 request = iax0Var.getRequest();
        if (request == null) {
            return true;
        }
        if (!this.requestTracker.a(request)) {
            return false;
        }
        this.targetTracker.a.remove(iax0Var);
        iax0Var.setRequest(null);
        return true;
    }

    public void clear(iax0 iax0Var) {
        if (iax0Var == null) {
            return;
        }
        untrackOrDelegate(iax0Var);
    }

    public p5j0 load(Bitmap bitmap) {
        return asDrawable().K(bitmap).a(r7j0.A(exj.a));
    }

    public p5j0 load(Drawable drawable) {
        return asDrawable().K(drawable).a(r7j0.A(exj.a));
    }

    public p5j0 load(String str) {
        return asDrawable().K(str);
    }

    public p5j0 load(Uri uri) {
        return asDrawable().J(uri);
    }

    public p5j0 load(File file) {
        return asDrawable().K(file);
    }

    public p5j0 load(Integer num) {
        p5j0 asDrawable = asDrawable();
        return asDrawable.C(asDrawable.K(num));
    }

    @Deprecated
    public p5j0 load(URL url) {
        return asDrawable().K(url);
    }

    public p5j0 load(Object obj) {
        return asDrawable().K(obj);
    }

    public RequestManager(Glide glide, gdy gdyVar, n7j0 n7j0Var, Context context) {
        this(glide, gdyVar, n7j0Var, new b9j0(), glide.getConnectivityMonitorFactory(), context);
    }
}
