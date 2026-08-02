package xsna;

import com.vk.video.ui.discovery.catalog.VideoDiscoveryCatalogRepository$Section;
import com.vk.video.ui.discovery.catalog.VideoDiscoveryCatalogSourceArgs;
import com.vk.video.ui.discovery.catalog.a;
import com.vk.video.ui.discovery.catalog.b;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class qfs0 implements izs {
    public final /* synthetic */ com.vk.video.ui.discovery.catalog.b b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ com.vk.lists.c d;

    public /* synthetic */ qfs0(com.vk.video.ui.discovery.catalog.b bVar, boolean z, com.vk.lists.c cVar) {
        this.b = bVar;
        this.c = z;
        this.d = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0039  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z;
        boolean z2;
        VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section;
        String str;
        b.a aVar = (b.a) obj;
        String b = aVar.b();
        com.vk.video.ui.discovery.catalog.b bVar = this.b;
        bVar.a(b);
        vhs0 vhs0Var = bVar.d;
        boolean z3 = false;
        if (!this.c) {
            b.a.C1967a c1967a = aVar instanceof b.a.C1967a ? (b.a.C1967a) aVar : null;
            if (c1967a == null || !c1967a.b) {
                z = false;
                vhs0Var.invoke(new a.b(aVar, z));
                z2 = aVar instanceof b.a.C1968b;
                if (!z2) {
                    videoDiscoveryCatalogRepository$Section = ((b.a.C1968b) aVar).c;
                } else {
                    if (!(aVar instanceof b.a.C1967a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    videoDiscoveryCatalogRepository$Section = ((b.a.C1967a) aVar).a;
                }
                bVar.h = videoDiscoveryCatalogRepository$Section;
                if (!z2) {
                    VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section2 = ((b.a.C1968b) aVar).c;
                    if (videoDiscoveryCatalogRepository$Section2 != null) {
                        str = videoDiscoveryCatalogRepository$Section2.c;
                    }
                    str = null;
                } else {
                    if (!(aVar instanceof b.a.C1967a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section3 = ((b.a.C1967a) aVar).a;
                    if (videoDiscoveryCatalogRepository$Section3 != null) {
                        str = videoDiscoveryCatalogRepository$Section3.c;
                    }
                    str = null;
                }
                if (!(bVar.f instanceof VideoDiscoveryCatalogSourceArgs.OfflineVideos)) {
                    if ((videoDiscoveryCatalogRepository$Section != null ? videoDiscoveryCatalogRepository$Section.e : null) != VideoDiscoveryCatalogRepository$Section.SectionType.MusicMix && str != null) {
                        z3 = true;
                    }
                }
                com.vk.lists.c cVar = this.d;
                cVar.r(z3);
                cVar.s(str);
                return s3q0.a;
            }
        }
        z = true;
        vhs0Var.invoke(new a.b(aVar, z));
        z2 = aVar instanceof b.a.C1968b;
        if (!z2) {
        }
        bVar.h = videoDiscoveryCatalogRepository$Section;
        if (!z2) {
        }
        if (!(bVar.f instanceof VideoDiscoveryCatalogSourceArgs.OfflineVideos)) {
        }
        com.vk.lists.c cVar2 = this.d;
        cVar2.r(z3);
        cVar2.s(str);
        return s3q0.a;
    }
}
