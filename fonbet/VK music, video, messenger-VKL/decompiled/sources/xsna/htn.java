package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
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

/* compiled from: DocAttachesComponent.kt */
/* loaded from: classes2.dex */
public final class htn extends c8v {
    public final FragmentActivity t;
    public final ImageViewer u;
    public final fpj0 v;
    public jtn w;

    public htn(a1w a1wVar, mxv mxvVar, FragmentActivity fragmentActivity, ImageViewer imageViewer, MediaType mediaType, Peer peer, kkm kkmVar, ChatSettings chatSettings) {
        super(fragmentActivity, peer, mediaType, chatSettings, kkmVar, mxvVar, a1wVar);
        this.t = fragmentActivity;
        this.u = imageViewer;
        this.v = new fpj0();
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
        return this.v;
    }

    @Override // xsna.c8v
    public final f8v k1() {
        jtn jtnVar = new jtn(this.t, this, this.o);
        this.w = jtnVar;
        return jtnVar;
    }

    /* compiled from: DocAttachesComponent.kt */
    public final class a implements ImageViewer.a {
        public final z3i a;

        public a(z3i z3iVar) {
            this.a = z3iVar;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final View c(int i) {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Rect d(int i) {
            return (Rect) this.a.invoke();
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Integer f() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Rect g() {
            jtn jtnVar = htn.this.w;
            if (jtnVar == null) {
                jtnVar = null;
            }
            RecyclerView recyclerView = jtnVar.d;
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
