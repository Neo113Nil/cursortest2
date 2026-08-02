package xsna;

import android.content.Context;
import android.os.Trace;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.nativecode.ImagePipelineNativeLoader;
import com.facebook.soloader.ExternalSoMapping;
import com.facebook.soloader.SoLoader;
import com.vk.log.L;
import com.vk.toggle.features.CoreFeatures;
import java.util.concurrent.locks.ReentrantLock;
import xsna.clo;
import xsna.lhs;
import xsna.tkw;
import xsna.vkw;

/* compiled from: FrescoWrapper.kt */
/* loaded from: classes.dex */
public final class rhs {
    public static final ReentrantLock a = new ReentrantLock();
    public static volatile ncr0 b;

    /* compiled from: FrescoWrapper.kt */
    public static final class a implements lhs.a {
        @Override // xsna.lhs.a
        public final void a(String str) {
            if (ndp0.e()) {
                ndp0.b("FrescoSystrace ".concat(str));
            }
        }

        @Override // xsna.lhs.a
        public final void b() {
            if (ndp0.e()) {
                Trace.endSection();
            }
        }

        @Override // xsna.lhs.a
        public final boolean isTracing() {
            return ndp0.e();
        }
    }

    public static mpa0 a() {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        ReentrantLock reentrantLock = a;
        Trace.beginSection(ndp0.f("FrescoWrapper.withLock"));
        try {
            reentrantLock.lock();
            try {
                d(context);
                return vgs.a;
            } finally {
                reentrantLock.unlock();
            }
        } finally {
            Trace.endSection();
        }
    }

    public static skw b() {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        ReentrantLock reentrantLock = a;
        Trace.beginSection(ndp0.f("FrescoWrapper.withLock"));
        try {
            reentrantLock.lock();
            try {
                d(context);
                return wkw.f().e();
            } finally {
                reentrantLock.unlock();
            }
        } finally {
            Trace.endSection();
        }
    }

    public static wkw c() {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        ReentrantLock reentrantLock = a;
        Trace.beginSection(ndp0.f("FrescoWrapper.withLock"));
        try {
            reentrantLock.lock();
            try {
                d(context);
                return wkw.f();
            } finally {
                reentrantLock.unlock();
            }
        } finally {
            Trace.endSection();
        }
    }

    public static void d(Context context) {
        tkw tkwVar;
        clo cloVar;
        tkw tkwVar2;
        if (vgs.b) {
            return;
        }
        lhs.b = new a();
        CoreFeatures coreFeatures = CoreFeatures.ENABLE_SOLOADER;
        coreFeatures.getClass();
        if (com.vk.toggle.b.A.a(coreFeatures)) {
            SoLoader.init(context, new b());
        }
        ncr0 ncr0Var = b;
        if (ncr0Var != null) {
            tkw.a aVar = (tkw.a) ncr0Var.a.getValue();
            aVar.getClass();
            tkwVar = new tkw(aVar);
        } else {
            tkwVar = null;
        }
        ncr0 ncr0Var2 = b;
        if (ncr0Var2 == null || !ncr0Var2.b.a) {
            cloVar = null;
        } else {
            clo.a b2 = clo.b();
            b2.b();
            cloVar = b2.a();
        }
        vgs.a(context, tkwVar, cloVar);
        try {
            ImagePipelineNativeLoader.load();
        } catch (UnsatisfiedLinkError e) {
            L.g("Couldn't load imagepipeline.so switch off native mode.", e);
            vgs.a = null;
            SimpleDraweeView.j = null;
            synchronized (wkw.class) {
                wkw wkwVar = wkw.p;
                if (wkwVar != null) {
                    wkwVar.c().f(f9t.f());
                    wkw.p.d().f(f9t.f());
                    wkw.p = null;
                }
                ncr0 ncr0Var3 = b;
                if (ncr0Var3 != null) {
                    bpn0 bpn0Var = ncr0Var3.a;
                    vkw.a aVar2 = ((tkw.a) bpn0Var.getValue()).q;
                    aVar2.getClass();
                    new gbh(aVar2, 27).invoke();
                    tkw.a aVar3 = (tkw.a) bpn0Var.getValue();
                    aVar3.getClass();
                    tkwVar2 = new tkw(aVar3);
                } else {
                    tkwVar2 = null;
                }
                vgs.a(context, tkwVar2, null);
            }
        }
    }

    public static lpa0 e() {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        ReentrantLock reentrantLock = a;
        Trace.beginSection(ndp0.f("FrescoWrapper.withLock"));
        try {
            reentrantLock.lock();
            try {
                d(context);
                return vgs.a.get();
            } finally {
                reentrantLock.unlock();
            }
        } finally {
            Trace.endSection();
        }
    }

    /* compiled from: FrescoWrapper.kt */
    /* loaded from: classes2.dex */
    public static final class b implements ExternalSoMapping {
        @Override // com.facebook.soloader.ExternalSoMapping
        public final String mapLibName(String str) {
            return null;
        }

        @Override // com.facebook.soloader.ExternalSoMapping
        public final void invokeJniOnload(String str) {
        }
    }
}
