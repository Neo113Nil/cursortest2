package xsna;

import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.clips.design.view.component.audio.ClipsAudioToggle;
import com.vk.clips.design.view.component.description.ClipDescription;
import com.vk.clips.design.view.component.user.ClipUserView;
import com.vk.clips.design.view.feed.ClipCoauthorInvitationView;
import com.vk.clips.tool.view.viewer.feed.list.clip.ClipFeedSideControlsView;
import com.vk.clips.tool.view.viewer.feed.list.nps.LazyNpsView;
import com.vk.clips.viewer.impl.feed.view.subs.ClipsCanvasSubtitleView;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.tools.VkViewStub;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: ClipItemMainOverlayContainer.kt */
/* loaded from: classes17.dex */
public final class e1d {
    public final yof a;
    public final ConstraintLayout b;
    public final View c;
    public final ClipFeedSideControlsView d;
    public final RecyclerView e;
    public final RecyclerView f;
    public final ClipUserView g;
    public final VkText h;
    public final VkText i;
    public final VkText j;
    public final VkText k;
    public final FrameLayout l;
    public final ClipDescription m;
    public final ClipsAudioToggle n;
    public final FrameLayout o;
    public final VkViewStub p;
    public final VkViewStub q;
    public final ClipsCanvasSubtitleView r;
    public final ClipCoauthorInvitationView s;
    public final LazyNpsView t;
    public final FrameLayout u;

    public e1d(View view, int i, RecyclerView.u uVar, yof yofVar) {
        this.a = yofVar;
        this.b = (ConstraintLayout) view.findViewById(R.id.fullscreen_clip_main_overlay_container);
        this.c = view.findViewById(R.id.fullscreen_clip_description_expanded_blackout);
        this.d = (ClipFeedSideControlsView) view.findViewById(R.id.fullscreen_clip_side_controls);
        this.o = (FrameLayout) view.findViewById(R.id.fullscreen_clip_activities_container);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.fullscreen_clip_primary_badges_list);
        recyclerView.setAdapter(new gqc(yofVar));
        dhk0 dhk0Var = new dhk0(cn70.b(0), cn70.b(0), cn70.b(6), cn70.b(0));
        dhk0Var.i = false;
        recyclerView.addItemDecoration(dhk0Var);
        if (uVar != null) {
            recyclerView.setRecycledViewPool(uVar);
        }
        this.e = recyclerView;
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.fullscreen_clip_secondary_badges_list);
        recyclerView2.setAdapter(new gqc(yofVar));
        dhk0 dhk0Var2 = new dhk0(cn70.b(0), cn70.b(0), cn70.b(6), cn70.b(0));
        dhk0Var2.i = false;
        recyclerView2.addItemDecoration(dhk0Var2);
        if (uVar != null) {
            recyclerView2.setRecycledViewPool(uVar);
        }
        this.f = recyclerView2;
        this.g = (ClipUserView) view.findViewById(R.id.fullscreen_clip_owner_view);
        VkText vkText = (VkText) view.findViewById(R.id.fullscreen_clip_subscribe);
        vkText.setBackgroundTintMode(PorterDuff.Mode.DST_OVER);
        this.h = vkText;
        this.i = (VkText) view.findViewById(R.id.fullscreen_clip_subscribed_text);
        this.j = (VkText) view.findViewById(R.id.fullscreen_clip_publication_date);
        this.k = (VkText) view.findViewById(R.id.fullscreen_clip_right_title_dot_separator);
        this.l = (FrameLayout) view.findViewById(R.id.fullscreen_clip_products_container);
        this.m = (ClipDescription) view.findViewById(R.id.fullscreen_clip_description);
        this.n = (ClipsAudioToggle) view.findViewById(R.id.fullscreen_clip_mute_icon);
        this.p = (VkViewStub) view.findViewById(R.id.fullscreen_clip_primary_action_btn);
        this.q = (VkViewStub) view.findViewById(R.id.fullscreen_clip_secondary_action_btn);
        this.r = (ClipsCanvasSubtitleView) view.findViewById(R.id.fullscreen_clip_main_overlay_subtitles);
        this.s = (ClipCoauthorInvitationView) view.findViewById(R.id.fullscreen_clip_coauthor_invitations);
        this.t = (LazyNpsView) view.findViewById(R.id.fullscreen_clip_main_overlay_nps);
        this.u = (FrameLayout) view.findViewById(R.id.fullscreen_clip_banner_companion_container);
        View findViewById = view.findViewById(R.id.fullscreen_clip_bottom_gradient);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{n8g.l(-16777216, 0), n8g.l(-16777216, 13), n8g.l(-16777216, 23), n8g.l(-16777216, 41), n8g.l(-16777216, 66), n8g.l(-16777216, 97), n8g.l(-16777216, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE), n8g.l(-16777216, 128), n8g.l(-16777216, 153), n8g.l(-16777216, 179), n8g.l(-16777216, 204), n8g.l(-16777216, 230), n8g.l(-16777216, 230)});
        gradientDrawable.setAlpha(160);
        findViewById.setBackground(gradientDrawable);
        f4m.v(i, view);
    }
}
