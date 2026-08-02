package xsna;

import android.graphics.RectF;
import com.vk.photoviewer.PhotoViewer;

/* compiled from: VkAppCallback.kt */
/* loaded from: classes6.dex */
public final class b9u0 implements eea0 {
    public final /* synthetic */ PhotoViewer.q a;

    public b9u0(PhotoViewer.q qVar) {
        this.a = qVar;
    }

    @Override // xsna.eea0
    public final RectF a() {
        return this.a.a();
    }

    public final Float b() {
        PhotoViewer.q qVar = this.a;
        ggs ggsVar = PhotoViewer.this.q.k.get(qVar.b);
        fnw fnwVar = ggsVar instanceof fnw ? (fnw) ggsVar : null;
        if (fnwVar != null) {
            return Float.valueOf(fnwVar.getScale());
        }
        return null;
    }
}
