package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.vk.core.view.PhotoStripView;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.newsfeed.common.PostActions;
import com.vkontakte.android.R;
import xsna.dsb0;
import xsna.msb0;

/* compiled from: PollV3View.kt */
/* loaded from: classes4.dex */
public final class zsb0 implements gm50 {
    public static final int v = iah0.a(8);
    public static final int w = iah0.a(12);
    public static final int x = R.attr.vk_ui_text_primary;
    public static final int y = R.attr.vk_ui_text_secondary;
    public static final int z = R.attr.vk_ui_icon_accent;
    public final Context b;
    public final msb0 c;
    public final msb0.b d;
    public final View e;
    public final TextView f;
    public final TextView g;
    public final LinearLayout h;
    public final LinearLayout i;
    public final FrameLayout j;
    public final TextView k;
    public final TextView l;
    public final TextView m;
    public final PhotoStripView n;
    public final LinearLayout o;
    public final VkButton p;
    public final ProgressBar q;
    public final View r;
    public final ImageView s;
    public final TextView t;
    public final wsb0 u;

    /* JADX WARN: Type inference failed for: r5v5, types: [xsna.wsb0] */
    public zsb0(Context context, msb0 msb0Var, msb0.b bVar) {
        this.b = context;
        this.c = msb0Var;
        this.d = bVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.poll_v3_view, (ViewGroup) null);
        this.e = inflate;
        this.f = (TextView) inflate.findViewById(R.id.poll_modal_title);
        this.g = (TextView) inflate.findViewById(R.id.poll_title);
        this.h = (LinearLayout) inflate.findViewById(R.id.poll_toolbar);
        this.i = (LinearLayout) inflate.findViewById(R.id.poll_header_container);
        this.j = (FrameLayout) inflate.findViewById(R.id.poll_footer_container);
        this.k = (TextView) inflate.findViewById(R.id.poll_info);
        this.l = (TextView) inflate.findViewById(R.id.poll_type);
        this.m = (TextView) inflate.findViewById(R.id.votes_count);
        this.n = (PhotoStripView) inflate.findViewById(R.id.photo_strip_view);
        this.o = (LinearLayout) inflate.findViewById(R.id.options_container);
        VkButton vkButton = (VkButton) inflate.findViewById(R.id.poll_vote_button);
        this.p = vkButton;
        this.q = (ProgressBar) inflate.findViewById(R.id.multiple_progress);
        View findViewById = inflate.findViewById(R.id.separator);
        this.r = findViewById;
        ImageView imageView = (ImageView) inflate.findViewById(R.id.actions);
        this.s = imageView;
        this.t = (TextView) inflate.findViewById(R.id.error_title);
        this.u = new psb0() { // from class: xsna.wsb0
            @Override // xsna.z960
            public final void g(VkContextMenu vkContextMenu, int i) {
                msb0.b bVar2 = zsb0.this.d;
                if (i == PostActions.ACTION_POLL_EDIT.h()) {
                    bVar2.invoke(dsb0.b.b);
                } else if (i == PostActions.ACTION_POLL_UNVOTE.h()) {
                    bVar2.invoke(dsb0.a.b);
                }
                if (vkContextMenu != null) {
                    vkContextMenu.b();
                }
            }
        };
        vkButton.setSize(VkButton.Size.Small);
        bwt0.d(vkButton, iah0.a(16), (r4 & 2) != 0, (r4 & 4) != 0);
        vkButton.setOnClickListener(new l44(this, 11));
        imageView.setImageDrawable(m33.a(R.drawable.vk_icon_more_vertical_28, context));
        imageView.setImageTintList(ColorStateList.valueOf(e3m.f(R.attr.vk_ui_icon_accent_themed, context)));
        findViewById.setBackgroundColor(e3m.f(R.attr.vk_ui_separator_primary2x, context));
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.c;
    }
}
