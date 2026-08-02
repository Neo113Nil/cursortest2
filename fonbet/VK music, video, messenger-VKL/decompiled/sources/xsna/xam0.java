package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.vk.core.view.components.segmented.control.VkSegmentedControl;
import com.vk.medianative.MediaNative;
import com.vk.stories.design.view.ReactionView;
import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;
import com.vk.stories.viewer.reactions.api.di.StoryReactionsComponent;
import com.vkontakte.android.R;
import xsna.vam0;

/* compiled from: StoryReactionEditorDialog.kt */
/* loaded from: classes16.dex */
public final class xam0 extends tyl0<Object> {
    public final vam0.a f;
    public final iz8 g;
    public final ReactionView h;
    public final u2f0 i;
    public final yam0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xam0(StickersDrawingViewGroup stickersDrawingViewGroup, vam0.a aVar, iz8 iz8Var, Boolean bool, px0 px0Var, y0f0 y0f0Var, v3l0 v3l0Var) {
        super(LayoutInflater.from(stickersDrawingViewGroup.getContext()).inflate(R.layout.story_reaction_edit_dialog, (ViewGroup) null), true, v3l0Var);
        Bitmap bitmap = null;
        boolean z = true;
        this.f = aVar;
        this.g = iz8Var;
        ReactionView reactionView = (ReactionView) this.c.findViewById(R.id.selected_reaction);
        if (bool == null || bool.booleanValue()) {
            reactionView.setBubbleBackground(ReactionView.Background.BLACK);
        } else {
            reactionView.setBubbleBackground(ReactionView.Background.WHITE);
        }
        this.h = reactionView;
        RecyclerView recyclerView = (RecyclerView) this.c.findViewById(R.id.reactions);
        u2f0 u2f0Var = new u2f0(getContext(), new b3m0(this, 1));
        this.i = u2f0Var;
        Context context = getContext();
        bpn0 bpn0Var = enj.a;
        this.j = new yam0(this, aVar, ((StoryReactionsComponent) m7m.a(e3m.h(context)).mo408a(fpf0.a(StoryReactionsComponent.class))).b(), y0f0Var, bool);
        bwt0.i0((ImageView) this.c.findViewById(R.id.story_repost_close), new z6f0(this, 16));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        int b = cn70.b(8);
        int b2 = cn70.b(8);
        recyclerView.addItemDecoration(new v98(b, b2, b2, true));
        recyclerView.setAdapter(u2f0Var);
        ImageView imageView = (ImageView) this.c.findViewById(R.id.background);
        Bitmap bitmap2 = (Bitmap) px0Var.invoke();
        if (bitmap2 == null) {
            int measuredWidth = stickersDrawingViewGroup.getMeasuredWidth();
            measuredWidth = measuredWidth == 0 ? iah0.z(stickersDrawingViewGroup.getContext()) : measuredWidth;
            int measuredHeight = stickersDrawingViewGroup.getMeasuredHeight();
            bitmap2 = kd7.d(measuredWidth, measuredHeight == 0 ? iah0.p(stickersDrawingViewGroup.getContext()) : measuredHeight);
            if (bitmap2 != null) {
                bitmap2.eraseColor(0);
                stickersDrawingViewGroup.getStickersState().d(new Canvas(bitmap2), -1, false);
                MediaNative.blurBitmap(bitmap2, bitmap2.getWidth() / 4);
            }
            imageView.setImageBitmap(bitmap);
            imageView.setClipToOutline(true);
            imageView.setOutlineProvider(new t0w0(6, cn70.c(16), false, false));
            VkSegmentedControl vkSegmentedControl = (VkSegmentedControl) findViewById(R.id.type_tabs);
            dhr0.a.getClass();
            Context y = dhr0.y();
            vkSegmentedControl.setSegmentSize(VkSegmentedControl.SegmentSize.Large);
            vkSegmentedControl.setCustomTabContent(new wam0(y, 0));
            TabLayout.g p = vkSegmentedControl.p();
            p.m(dhr0.w(R.drawable.ic_black_circle_24, y));
            p.k("");
            p.h.setPadding(0, 0, 0, 0);
            if (bool != null && !bool.booleanValue()) {
                z = false;
            }
            vkSegmentedControl.i(p, z);
            TabLayout.g p2 = vkSegmentedControl.p();
            p2.m(dhr0.w(R.drawable.ic_white_circle_24, y));
            p2.k("");
            p2.h.setPadding(cn70.b(8), 0, 0, 0);
            vkSegmentedControl.i(p2, epx.f(bool, Boolean.FALSE));
            vkSegmentedControl.setTabMode(2);
            vkSegmentedControl.setOnSelectTabPosition(new aq1(23, vkSegmentedControl, this));
        }
        bitmap = bitmap2;
        imageView.setImageBitmap(bitmap);
        imageView.setClipToOutline(true);
        imageView.setOutlineProvider(new t0w0(6, cn70.c(16), false, false));
        VkSegmentedControl vkSegmentedControl2 = (VkSegmentedControl) findViewById(R.id.type_tabs);
        dhr0.a.getClass();
        Context y2 = dhr0.y();
        vkSegmentedControl2.setSegmentSize(VkSegmentedControl.SegmentSize.Large);
        vkSegmentedControl2.setCustomTabContent(new wam0(y2, 0));
        TabLayout.g p3 = vkSegmentedControl2.p();
        p3.m(dhr0.w(R.drawable.ic_black_circle_24, y2));
        p3.k("");
        p3.h.setPadding(0, 0, 0, 0);
        if (bool != null) {
            z = false;
        }
        vkSegmentedControl2.i(p3, z);
        TabLayout.g p22 = vkSegmentedControl2.p();
        p22.m(dhr0.w(R.drawable.ic_white_circle_24, y2));
        p22.k("");
        p22.h.setPadding(cn70.b(8), 0, 0, 0);
        vkSegmentedControl2.i(p22, epx.f(bool, Boolean.FALSE));
        vkSegmentedControl2.setTabMode(2);
        vkSegmentedControl2.setOnSelectTabPosition(new aq1(23, vkSegmentedControl2, this));
    }

    @Override // xsna.dc6
    public final cc6 getPresenter() {
        return this.j;
    }

    @Override // android.app.Dialog
    @ozl
    public final void onBackPressed() {
        this.f.a();
        yam0 yam0Var = this.j;
        if (yam0Var != null) {
            yam0Var.b.dismiss();
        }
    }
}
