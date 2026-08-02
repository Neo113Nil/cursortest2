package xsna;

import android.view.View;
import com.vk.clips.tool.view.newsfeed.overlay.ClipEndOverlayView;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.dto.common.ClipVideoFile;

/* compiled from: ClipVideoHolder.kt */
/* loaded from: classes4.dex */
public final class afd implements ClipEndOverlayView.a {
    public final /* synthetic */ cfd a;

    public afd(cfd cfdVar) {
        this.a = cfdVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.clips.tool.view.newsfeed.overlay.ClipEndOverlayView.a
    public final void a(View view) {
        cfd cfdVar = this.a;
        ClipVideoFile N7 = cfdVar.N7();
        if (N7 != null) {
            ((ume) cfdVar.x0.getValue()).b(N7);
        }
        yg5 yg5Var = cfdVar.h0;
        if (yg5Var != null) {
            cfdVar.F7(view, yg5Var.g0(), yg5Var.V());
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.clips.tool.view.newsfeed.overlay.ClipEndOverlayView.a
    public final void b() {
        cfd cfdVar = this.a;
        ClipVideoFile N7 = cfdVar.N7();
        if (N7 != null) {
            ((ume) cfdVar.x0.getValue()).a(N7);
        }
        ClipsRouter.c(g620.f().a(), cfdVar.itemView.getContext(), g620.f().p(null), null, null, null, null, null, false, null, 2044);
    }
}
