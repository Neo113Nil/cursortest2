package xsna;

import android.os.Looper;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.apps.BuildInfo;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;

/* compiled from: MusicCatalogBlockPresenter.kt */
/* loaded from: classes16.dex */
public final class zc40 {
    public final gda a;
    public final jda b;
    public final q3a c;
    public final io.reactivex.rxjava3.disposables.b d = new io.reactivex.rxjava3.disposables.b();

    public zc40(gda gdaVar, jda jdaVar, q3a q3aVar) {
        this.a = gdaVar;
        this.b = jdaVar;
        this.c = q3aVar;
    }

    public static void b() {
        if (epx.f(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            return;
        }
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.e, new Object[]{"MusicCatalogBlockPresenter operations must run on the main thread."});
        }
        if (BuildInfo.h()) {
            throw new IllegalStateException("MusicCatalogBlockPresenter operations must run on the main thread.");
        }
    }

    public final void a(CatalogViewHolder catalogViewHolder, UIBlock uIBlock) {
        b();
        io.reactivex.rxjava3.disposables.b bVar = this.d;
        if (bVar.g() > 0) {
            return;
        }
        bVar.b(this.c.a().subscribe(new wnt(new bwg(uIBlock, this, catalogViewHolder, 2), 6)));
    }
}
