package xsna;

import com.google.android.material.tabs.TabLayout;
import com.vk.core.view.components.context.menu.VkContextMenu;

/* compiled from: PhotoGalleryViewer.kt */
/* loaded from: classes4.dex */
public final class t9a0 implements TabLayout.c<TabLayout.g> {
    public final /* synthetic */ com.vk.photogallery.c b;

    public t9a0(com.vk.photogallery.c cVar) {
        this.b = cVar;
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void hl(TabLayout.g gVar) {
        com.vk.photogallery.c cVar = this.b;
        VkContextMenu vkContextMenu = cVar.h;
        if (vkContextMenu != null) {
            vkContextMenu.b();
        }
        cVar.h = null;
        cVar.f.b(cVar.c.get(gVar.e).loadAlbums().subscribe(new pd40(new defpackage.s(27, cVar, gVar.e == 0 ? cVar.k : gVar.h), 7)));
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void Wd(TabLayout.g gVar) {
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void za(TabLayout.g gVar) {
    }
}
