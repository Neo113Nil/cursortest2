package xsna;

import android.content.Context;
import android.graphics.Point;
import android.util.Size;
import android.view.View;
import android.widget.FrameLayout;
import com.vk.voip.ui.groupcalls.GroupCallViewModel;
import kotlin.Pair;
import ru.ok.android.externcalls.sdk.layout.ConversationDisplayLayoutItem;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;
import ru.ok.android.externcalls.sdk.ui.TextureViewRenderer;
import ru.ok.android.webrtc.layout.VideoDisplayLayout;

/* compiled from: ScreenCaptureFullscreenRenderHelper.kt */
/* loaded from: classes7.dex */
public final class nah0 extends yk90 {
    public final View l;
    public final boolean m;
    public final oah0 n;
    public final gb9 o;
    public final ahn p;
    public final io.reactivex.rxjava3.disposables.c q;
    public final mah0 r;

    public nah0(View view, zzz zzzVar, FrameLayout frameLayout, rct0 rct0Var, wly wlyVar, k490 k490Var) {
        super(zzzVar, frameLayout, rct0Var, wlyVar, k490Var);
        this.l = view;
        this.m = true;
        this.n = new oah0(zzzVar);
        gb9 gb9Var = new gb9(frameLayout);
        gb9Var.x = false;
        gb9Var.y = true;
        this.o = gb9Var;
        this.p = new ahn();
        mah0 mah0Var = new mah0(this);
        this.r = mah0Var;
        view.setOnTouchListener(new qe2(this, 1));
        GroupCallViewModel.b.getClass();
        this.q = GroupCallViewModel.i().subscribe(new wnt(new yka0(this, 10), 29));
        zzzVar.d(mah0Var);
    }

    @Override // xsna.yk90
    public final void b(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey) {
        super.b(conversationVideoTrackParticipantKey);
        if (conversationVideoTrackParticipantKey.equals(this.k)) {
            return;
        }
        this.o.c(false);
    }

    @Override // xsna.yk90
    public final void c(TextureViewRenderer textureViewRenderer) {
        super.c(textureViewRenderer);
        this.o.d(textureViewRenderer);
    }

    @Override // xsna.yk90
    public final FrameLayout.LayoutParams e() {
        if (!this.m) {
            return super.e();
        }
        Context context = this.b.getContext();
        this.p.getClass();
        Point j = iah0.j(context);
        int max = (int) (Math.max(j.x, j.y) * 1.35d);
        if (max > 4096) {
            max = 4096;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(max, max);
        layoutParams.gravity = 17;
        return layoutParams;
    }

    @Override // xsna.yk90
    public final void f() {
        super.f();
        this.o.d(null);
        this.q.dispose();
        this.a.b(this.r);
    }

    public final ConversationDisplayLayoutItem g() {
        VideoDisplayLayout videoDisplayLayout;
        ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey = this.k;
        if (conversationVideoTrackParticipantKey != null) {
            FrameLayout frameLayout = this.b;
            Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
            oah0 oah0Var = this.n;
            oah0Var.getClass();
            Pair pair = new Pair(Integer.valueOf(size.getWidth() * 2), Integer.valueOf((int) (size.getHeight() * 1.25f)));
            int intValue = ((Number) pair.d()).intValue();
            int intValue2 = ((Number) pair.g()).intValue();
            if (intValue <= 0 || intValue2 <= 0) {
                videoDisplayLayout = null;
            } else {
                if (oah0Var.a.isHorizontal()) {
                    intValue2 = intValue;
                    intValue = intValue2;
                }
                videoDisplayLayout = new VideoDisplayLayout.Builder().setFit(VideoDisplayLayout.Fit.COVER).setWidth(intValue).setHeight(intValue2).build();
            }
            if (videoDisplayLayout != null) {
                return new ConversationDisplayLayoutItem(conversationVideoTrackParticipantKey, videoDisplayLayout);
            }
        }
        return null;
    }
}
