package xsna;

import android.view.View;
import com.vk.core.view.components.context.menu.VkContextMenu;
import xsna.av20;

/* compiled from: PhotoGalleryViewer.kt */
/* loaded from: classes4.dex */
public final class q9a0 implements av20.b<wc1> {
    public final /* synthetic */ com.vk.photogallery.c a;

    public q9a0(com.vk.photogallery.c cVar) {
        this.a = cVar;
    }

    @Override // xsna.av20.b
    public final void a(View view, Object obj, int i, wmg wmgVar) {
        wc1 wc1Var = (wc1) obj;
        com.vk.photogallery.c cVar = this.a;
        VkContextMenu vkContextMenu = cVar.h;
        if (vkContextMenu != null) {
            vkContextMenu.b();
        }
        cVar.h = null;
        j9a0 j9a0Var = cVar.l.j.e;
        if (j9a0Var != null) {
            j9a0Var.a.onAlbumSelected(wc1Var);
            uut0 uut0Var = j9a0Var.f;
            k5t k5tVar = uut0Var.j;
            wc1 wc1Var2 = k5tVar.c;
            if (wc1Var2 == null || wc1Var2.b != wc1Var.b) {
                if (k5tVar.b.containsKey(wc1Var)) {
                    k5tVar.c = wc1Var;
                    uut0Var.a.a(k5tVar);
                    uut0Var.d.d(k5tVar.a());
                } else {
                    uut0Var.a(wc1Var, 0);
                }
            }
        }
        com.vk.photogallery.c.a(cVar, wc1Var.a);
    }
}
