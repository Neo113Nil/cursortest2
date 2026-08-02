package xsna;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.bridges.ImageViewer;
import com.vk.dto.attaches.AttachForMediaViewer;
import com.vk.dto.common.Peer;
import com.vk.dto.messages.HistoryAttachAction;
import com.vk.dto.photo.Photo;
import com.vk.im.engine.models.attaches.HistoryAttach;
import com.vk.im.engine.models.attaches.MediaType;
import com.vk.im.engine.models.dialogs.ChatSettings;
import java.util.List;

/* compiled from: PhotoAttachesComponent.kt */
/* loaded from: classes2.dex */
public final class m5a0 extends c8v {
    public final ImageViewer t;
    public final Context u;
    public final boolean v;
    public final fpj0 w;
    public x9a0 x;

    public m5a0(ImageViewer imageViewer, a1w a1wVar, mxv mxvVar, Context context, MediaType mediaType, Peer peer, boolean z, kkm kkmVar, ChatSettings chatSettings) {
        super(context, peer, mediaType, chatSettings, kkmVar, mxvVar, a1wVar);
        this.t = imageViewer;
        this.u = context;
        this.v = z;
        this.w = new fpj0();
    }

    @Override // xsna.j8i
    public final void K0(Configuration configuration) {
        x9a0 x9a0Var = this.x;
        if (x9a0Var != null) {
            if (x9a0Var == null) {
                x9a0Var = null;
            }
            RecyclerView.o oVar = x9a0Var.s;
            GridLayoutManager gridLayoutManager = oVar instanceof GridLayoutManager ? (GridLayoutManager) oVar : null;
            if (gridLayoutManager != null) {
                int i = x9a0Var.i();
                gridLayoutManager.setSpanCount(i);
                igu iguVar = x9a0Var.r;
                if (iguVar != null) {
                    iguVar.b = i;
                }
            }
        }
    }

    @Override // xsna.c8v
    public final List<HistoryAttachAction> c1(HistoryAttach historyAttach) {
        HistoryAttachAction historyAttachAction = HistoryAttachAction.GO_TO_MSG;
        HistoryAttachAction historyAttachAction2 = HistoryAttachAction.SHARE;
        if (h1()) {
            historyAttachAction2 = null;
        }
        return rl3.I(new HistoryAttachAction[]{historyAttachAction, historyAttachAction2});
    }

    @Override // xsna.c8v
    public final l56 d1() {
        return this.w;
    }

    @Override // xsna.c8v
    public final f8v k1() {
        x9a0 x9a0Var = new x9a0(this.u, this, this.v, this.o);
        this.x = x9a0Var;
        return x9a0Var;
    }

    /* compiled from: PhotoAttachesComponent.kt */
    public final class a implements ImageViewer.a {
        public a() {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final View c(int i) {
            x9a0 x9a0Var = m5a0.this.x;
            if (x9a0Var == null) {
                x9a0Var = null;
            }
            RecyclerView recyclerView = x9a0Var.d;
            if (recyclerView == null) {
                recyclerView = null;
            }
            RecyclerView.o layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                return layoutManager.findViewByPosition(i);
            }
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Rect d(int i) {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Integer f() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Rect g() {
            x9a0 x9a0Var = m5a0.this.x;
            if (x9a0Var == null) {
                x9a0Var = null;
            }
            RecyclerView recyclerView = x9a0Var.d;
            return bwt0.C(recyclerView != null ? recyclerView : null);
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final boolean h() {
            return true;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final String i() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Context j() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final String m(int i, int i2) {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final float[] q(int i) {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final ImageViewer.d r() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final boolean s() {
            return true;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void a() {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void o() {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void onDismiss() {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void p() {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void b(int i) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void e(int i) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void n(int i) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void t(Photo photo) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void v(AttachForMediaViewer attachForMediaViewer, ImageViewer.SwipeDirection swipeDirection, boolean z) {
        }
    }
}
