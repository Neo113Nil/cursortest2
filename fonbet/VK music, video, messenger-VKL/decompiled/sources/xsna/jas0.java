package xsna;

import com.vk.catalog2.common.dto.api.CatalogCatalog;
import com.vk.catalog2.common.dto.api.section.CatalogSection;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.upload.api.VideoUploadEvent;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xsna.p4g;

/* compiled from: VideoCatalogUploadsObserveStrategyDefault.kt */
/* loaded from: classes16.dex */
public final class jas0 implements ias0 {
    public final UserId b;
    public boolean d;
    public final io.reactivex.rxjava3.disposables.b c = new io.reactivex.rxjava3.disposables.b();
    public final LinkedHashMap e = new LinkedHashMap();

    public jas0(wot0 wot0Var, UserId userId) {
        this.b = userId;
    }

    @Override // xsna.ias0
    public final void a(Object obj) {
        if (this.d) {
            return;
        }
        boolean z = obj instanceof CatalogSection;
        CatalogSection catalogSection = z ? (CatalogSection) obj : null;
        if (wot0.a(catalogSection != null ? catalogSection.f : null) || fkq0.b(this.b)) {
            CatalogSection catalogSection2 = z ? (CatalogSection) obj : null;
            if (catalogSection2 != null) {
                this.d = true;
                b(catalogSection2);
            }
            CatalogCatalog catalogCatalog = obj instanceof CatalogCatalog ? (CatalogCatalog) obj : null;
            if (catalogCatalog != null) {
                this.d = true;
                Iterator<T> it = catalogCatalog.b.iterator();
                while (it.hasNext()) {
                    b((CatalogSection) it.next());
                }
            }
        }
    }

    public final void b(CatalogSection catalogSection) {
        String str = catalogSection.f;
        if (str == null || !brm0.v(str, "/playlists", false)) {
            hg1.e(this.c, fxc0.B().E().b().U(new xq70(new qyi0(this, 18), 21)).a0(asu0.a.d()).subscribe(new s440(new defpackage.h0(28, this, catalogSection.b), 20)));
        }
    }

    @Override // xsna.ias0
    public final Map<String, List<VideoUploadEvent>> c() {
        p4g.a aVar = p4g.a;
        return Collections.unmodifiableMap(this.e);
    }
}
