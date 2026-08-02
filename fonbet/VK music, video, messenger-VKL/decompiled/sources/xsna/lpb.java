package xsna;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.vk.clips.sdk.shared.api.decoration.RecommendationDecorationPayload;
import com.vk.clips.sdk.shared.decoration.ClipsFeedDecorationPayload;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.im.chat.clips.decoration.api.models.ImChatClipsInitDecorPayload;
import com.vk.im.chat.clips.decoration.api.models.ImChatClipsPaginationDecorPayload;
import com.vk.mvi.MviViewContainer;
import com.vkontakte.android.R;
import xsna.epb;
import xsna.gm50;
import xsna.mk50;
import xsna.xn50;

/* compiled from: ChatClipsTopBarDecorationView.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class lpb extends MviViewContainer<gpb, npb, epb> implements d6e {
    public final gob f;
    public final h20 g;
    public dpb h;

    public lpb(l7s l7sVar, gob gobVar, h20 h20Var) {
        super(l7sVar, null, 4, 0);
        this.f = gobVar;
        this.g = h20Var;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.im_chat_clips_top_bar_decoration_view);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        npb npbVar = (npb) ao50Var;
        gm50.a.b(this, npbVar.b, new g20(this, 19));
        gm50.a.b(this, npbVar.c, new jm0(this, 10));
    }

    @Override // com.vk.mvi.MviViewContainer, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((gpb) vk50Var).g.a(new zx0(this, 19), getViewOwner());
    }

    @Override // xsna.d6e
    public final void d(ClipsFeedDecorationPayload clipsFeedDecorationPayload) {
        if (this.h == null) {
            dpb dpbVar = new dpb(this.f.d(), new ra0(this, 19), new com.vk.movika.sdk.base.utils.b(8));
            this.h = dpbVar;
            VkTopBar vkTopBar = (VkTopBar) findViewById(R.id.im_chat_clips_top_bar);
            dpbVar.e = vkTopBar;
            vkTopBar.setTransitionHeaderColor(VkTopBar.m.b.a);
            vkTopBar.setTransformFraction(1.0f);
            vkTopBar.setInitialMode(com.vk.core.view.components.topbar.c.a);
            vkTopBar.setBack(new VkTopBar.b(new com.vk.movika.sdk.base.ui.t(dpbVar, 18), null, null, null, null, 30));
            dpbVar.d = getContext();
            dpbVar.c = new zji0(getContext());
        }
        if (clipsFeedDecorationPayload instanceof ImChatClipsInitDecorPayload) {
            ImChatClipsInitDecorPayload imChatClipsInitDecorPayload = (ImChatClipsInitDecorPayload) clipsFeedDecorationPayload;
            xn50.a.c(this, new epb.a(imChatClipsInitDecorPayload.e, imChatClipsInitDecorPayload.b, imChatClipsInitDecorPayload.c));
        } else if (clipsFeedDecorationPayload instanceof ImChatClipsPaginationDecorPayload) {
            ImChatClipsPaginationDecorPayload imChatClipsPaginationDecorPayload = (ImChatClipsPaginationDecorPayload) clipsFeedDecorationPayload;
            xn50.a.c(this, new epb.b(imChatClipsPaginationDecorPayload.b, imChatClipsPaginationDecorPayload.c));
        } else if (clipsFeedDecorationPayload instanceof RecommendationDecorationPayload) {
            xn50.a.c(this, epb.c.b);
        } else {
            setVisibility(8);
        }
    }

    @Override // com.vk.mvi.MviViewContainer, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h = null;
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new gpb(this.f);
    }

    @Override // xsna.d6e
    public View getView() {
        return this;
    }
}
