package xsna;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.clips.design.view.author.ClipAuthorCellView;
import com.vk.clips.design.view.component.audio.ClipsAudioToggle;
import com.vk.clips.design.view.component.description.ClipDescription;
import com.vk.clips.design.view.feed.ClipCoauthorInvitationView;
import com.vk.clips.tool.view.viewer.feed.list.clip.ClipFeedSideControlsView;
import com.vk.clips.tool.view.viewer.feed.list.nps.LazyNpsView;
import com.vk.clips.viewer.impl.feed.view.subs.ClipsCanvasSubtitleView;
import com.vk.core.view.tools.VkViewStub;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: ClipItemMainOverlayRedesignContainer.kt */
/* loaded from: classes17.dex */
public final class g1d {
    public final yof a;
    public final ConstraintLayout b;
    public final View c;
    public final ClipFeedSideControlsView d;
    public final RecyclerView e;
    public final RecyclerView f;
    public final ClipAuthorCellView g;
    public final FrameLayout h;
    public final ClipDescription i;
    public final ClipsAudioToggle j;
    public final FrameLayout k;
    public final VkViewStub l;
    public final VkViewStub m;
    public final ClipsCanvasSubtitleView n;
    public final ClipCoauthorInvitationView o;
    public final LazyNpsView p;
    public final FrameLayout q;

    public g1d(o1d o1dVar, int i, RecyclerView.u uVar, zof zofVar) {
        this.a = zofVar;
        this.b = (ConstraintLayout) o1dVar.findViewById(R.id.fullscreen_clip_main_overlay_container);
        this.c = o1dVar.findViewById(R.id.fullscreen_clip_description_expanded_blackout);
        this.d = (ClipFeedSideControlsView) o1dVar.findViewById(R.id.fullscreen_clip_side_controls);
        this.k = (FrameLayout) o1dVar.findViewById(R.id.fullscreen_clip_activities_container);
        RecyclerView recyclerView = (RecyclerView) o1dVar.findViewById(R.id.fullscreen_clip_primary_badges_list);
        recyclerView.setAdapter(new gqc(zofVar));
        dhk0 dhk0Var = new dhk0(cn70.b(0), cn70.b(0), cn70.b(6), cn70.b(0));
        dhk0Var.i = false;
        recyclerView.addItemDecoration(dhk0Var);
        if (uVar != null) {
            recyclerView.setRecycledViewPool(uVar);
        }
        this.e = recyclerView;
        RecyclerView recyclerView2 = (RecyclerView) o1dVar.findViewById(R.id.fullscreen_clip_secondary_badges_list);
        recyclerView2.setAdapter(new gqc(zofVar));
        dhk0 dhk0Var2 = new dhk0(cn70.b(0), cn70.b(0), cn70.b(6), cn70.b(0));
        dhk0Var2.i = false;
        recyclerView2.addItemDecoration(dhk0Var2);
        if (uVar != null) {
            recyclerView2.setRecycledViewPool(uVar);
        }
        this.f = recyclerView2;
        this.g = (ClipAuthorCellView) o1dVar.findViewById(R.id.fullscreen_clip_author_cell);
        this.h = (FrameLayout) o1dVar.findViewById(R.id.fullscreen_clip_products_container);
        this.i = (ClipDescription) o1dVar.findViewById(R.id.fullscreen_clip_description);
        this.j = (ClipsAudioToggle) o1dVar.findViewById(R.id.fullscreen_clip_mute_icon);
        this.l = (VkViewStub) o1dVar.findViewById(R.id.fullscreen_clip_primary_action_btn);
        this.m = (VkViewStub) o1dVar.findViewById(R.id.fullscreen_clip_secondary_action_btn);
        this.n = (ClipsCanvasSubtitleView) o1dVar.findViewById(R.id.fullscreen_clip_main_overlay_subtitles);
        this.o = (ClipCoauthorInvitationView) o1dVar.findViewById(R.id.fullscreen_clip_coauthor_invitations);
        this.p = (LazyNpsView) o1dVar.findViewById(R.id.fullscreen_clip_main_overlay_nps);
        this.q = (FrameLayout) o1dVar.findViewById(R.id.fullscreen_clip_banner_companion_container);
        View findViewById = o1dVar.findViewById(R.id.fullscreen_clip_bottom_gradient);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{n8g.l(-16777216, 0), n8g.l(-16777216, 13), n8g.l(-16777216, 23), n8g.l(-16777216, 41), n8g.l(-16777216, 66), n8g.l(-16777216, 97), n8g.l(-16777216, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE), n8g.l(-16777216, 128), n8g.l(-16777216, 153), n8g.l(-16777216, 179), n8g.l(-16777216, 204), n8g.l(-16777216, 230), n8g.l(-16777216, 230)});
        gradientDrawable.setAlpha(160);
        findViewById.setBackground(gradientDrawable);
        f4m.v(i, o1dVar);
    }
}
