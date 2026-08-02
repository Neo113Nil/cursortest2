package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.image.VKImageController;
import com.vk.core.ui.themes.VKReplacerView;
import com.vk.dto.common.id.UserId;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.superapp.api.dto.app.WebGameLeaderboard;
import com.vk.superapp.api.dto.app.WebLeaderboardData;
import com.vk.superapp.api.dto.user.WebUserShortInfo;
import com.vkontakte.android.R;
import java.text.DecimalFormat;
import java.util.ArrayList;
import xsna.pgn0;

/* compiled from: VkLeaderboardAdapter.kt */
/* loaded from: classes6.dex */
public final class a2v0 extends RecyclerView.Adapter<RecyclerView.e0> {
    public final WebLeaderboardData c;
    public final v5n0 d;
    public final ArrayList<WebGameLeaderboard> e;

    /* compiled from: VkLeaderboardAdapter.kt */
    public static abstract class a extends RecyclerView.e0 {
        public final Context l;
        public final TextView m;
        public final TextView n;
        public final TextView o;
        public final VKReplacerView p;

        public a(ViewGroup viewGroup) {
            super(tf3.b(viewGroup, R.layout.vk_html5_game_leaderboard_item, viewGroup, false));
            this.l = this.itemView.getContext();
            this.m = (TextView) this.itemView.findViewById(R.id.leaderboard_item_name);
            this.n = (TextView) this.itemView.findViewById(R.id.leaderboard_item_points);
            this.o = (TextView) this.itemView.findViewById(R.id.leaderboard_item_place);
            this.p = (VKReplacerView) this.itemView.findViewById(R.id.leaderboard_item_user_photo);
        }
    }

    /* compiled from: VkLeaderboardAdapter.kt */
    public static final class b extends RecyclerView.e0 {
        public static final bpn0 q = new bpn0(new vqf0(13));
        public final Context l;
        public final TextView m;
        public final TextView n;
        public final VKImageController<View> o;
        public final VKImageController.b p;

        public b(ViewGroup viewGroup) {
            super(tf3.b(viewGroup, R.layout.vk_html5_game_leaderboard_header, viewGroup, false));
            Context context = this.itemView.getContext();
            this.l = context;
            this.m = (TextView) this.itemView.findViewById(R.id.leaderboard_header_title);
            this.n = (TextView) this.itemView.findViewById(R.id.leaderboard_header_subtitle);
            ifx0 ifx0Var = e370.c;
            VKImageController<View> create = (ifx0Var == null ? null : ifx0Var).b().create(context);
            this.o = create;
            this.p = new VKImageController.b(32.0f, null, false, 0, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, null, null, null, 65534);
            ((VKReplacerView) this.itemView.findViewById(R.id.leaderboard_header_icon)).a(((com.vk.core.ui.image.c) create).getView());
        }
    }

    /* compiled from: VkLeaderboardAdapter.kt */
    public static final class c extends a {
        public final gzs<s3q0> q;

        public c(ViewGroup viewGroup, v5n0 v5n0Var) {
            super(viewGroup);
            this.q = v5n0Var;
            this.m.setText(R.string.vk_games_invite_friends);
            this.n.setText(R.string.vk_games_to_compete_together);
            f4m.j(this.o);
            ImageView imageView = new ImageView(this.l);
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView.setBackground(new ShapeDrawable(new OvalShape()));
            imageView.setBackgroundTintList(ColorStateList.valueOf(e3m.f(R.attr.vk_ui_background_accent_themed, this.l)));
            imageView.setImageResource(R.drawable.vk_icon_add_24);
            imageView.setImageTintList(ColorStateList.valueOf(e3m.f(R.attr.vk_ui_text_contrast_themed, this.l)));
            this.p.a(imageView);
            this.itemView.getLayoutParams().height = iah0.a(72);
            this.itemView.setPadding(0, 0, 0, iah0.a(8));
            this.itemView.setOnClickListener(new r4(this, 14));
        }
    }

    /* compiled from: VkLeaderboardAdapter.kt */
    public static final class d extends a {
        public final int q;
        public final VKImageController<View> r;
        public final VKImageController.b s;
        public UserId t;

        public d(ViewGroup viewGroup, int i) {
            super(viewGroup);
            this.q = i;
            ifx0 ifx0Var = e370.c;
            VKImageController<View> create = (ifx0Var == null ? null : ifx0Var).b().create(this.l);
            this.r = create;
            this.s = new VKImageController.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, true, 0, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, null, null, null, 65531);
            this.t = UserId.d;
            this.p.a(((com.vk.core.ui.image.c) create).getView());
            this.itemView.setOnClickListener(new ci0(this, 14));
        }
    }

    public a2v0(WebLeaderboardData webLeaderboardData, v5n0 v5n0Var) {
        this.c = webLeaderboardData;
        this.d = v5n0Var;
        this.e = webLeaderboardData.c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.e.size() + 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        if (i == 0) {
            return 0;
        }
        return i == getItemCount() - 1 ? 2 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        CharSequence fromHtml;
        int i2;
        String str;
        int itemViewType = getItemViewType(i);
        if (itemViewType == 0) {
            b bVar = (b) e0Var;
            bpn0 bpn0Var = b.q;
            Context context = bVar.l;
            WebLeaderboardData webLeaderboardData = this.c;
            int i3 = webLeaderboardData.d;
            TextView textView = bVar.m;
            WebApiApplication webApiApplication = webLeaderboardData.b;
            textView.setText(webApiApplication.c);
            int i4 = webApiApplication.I;
            if (i4 != 0) {
                if (i4 == 1) {
                    fromHtml = i3 != 0 ? Html.fromHtml(context.getString(R.string.vk_htmlgame_leaderboard_you_reached_level_x, ((DecimalFormat) b.q.getValue()).format(i3))) : context.getString(R.string.vk_game_zero_level);
                } else if (i4 != 2) {
                    fromHtml = "";
                }
                bVar.n.setText(fromHtml);
                bVar.o.f(webApiApplication.d.a(iah0.a(72)).b, bVar.p);
                return;
            }
            fromHtml = Html.fromHtml(context.getResources().getQuantityString(R.plurals.vk_htmlgame_leaderboard_you_got_points, i3, ((DecimalFormat) b.q.getValue()).format(i3)));
            bVar.n.setText(fromHtml);
            bVar.o.f(webApiApplication.d.a(iah0.a(72)).b, bVar.p);
            return;
        }
        if (itemViewType != 1) {
            return;
        }
        d dVar = (d) e0Var;
        WebGameLeaderboard webGameLeaderboard = this.e.get(i - 1);
        TextView textView2 = dVar.n;
        TextView textView3 = dVar.m;
        Context context2 = dVar.l;
        int i5 = webGameLeaderboard.d;
        dVar.t = webGameLeaderboard.c;
        WebUserShortInfo webUserShortInfo = webGameLeaderboard.b;
        if (webUserShortInfo == null) {
            return;
        }
        WebImageSize e = webUserShortInfo.h.e(iah0.a(48));
        if (e != null && (str = e.b) != null) {
            dVar.r.f(str, dVar.s);
        }
        wdx0 wdx0Var = e370.f;
        if (wdx0Var == null) {
            wdx0Var = null;
        }
        int i6 = pgn0.a.a;
        boolean f = epx.f(wdx0Var.c().b, dVar.t);
        textView3.setText(webUserShortInfo.d());
        textView3.setTextColor(f ? e3m.f(R.attr.vk_ui_text_accent, context2) : e3m.f(R.attr.vk_ui_text_primary, context2));
        textView2.setText(webGameLeaderboard.f ? enj.f(R.plurals.vk_games_points, i5, context2) : (i5 == 0 && f) ? context2.getString(R.string.vk_game_zero_level) : enj.f(R.plurals.vk_games_level, i5, context2));
        textView2.setTextColor(f ? e3m.f(R.attr.vk_ui_text_accent, context2) : e3m.f(R.attr.vk_ui_text_secondary, context2));
        TextView textView4 = dVar.o;
        if (dVar.q <= 3 || (i2 = webGameLeaderboard.e) <= 0 || i2 >= 4) {
            textView4.setVisibility(8);
            return;
        }
        textView4.setVisibility(0);
        textView4.setText(String.valueOf(i2));
        if (i2 == 1) {
            textView4.setBackgroundResource(R.drawable.vk_html5_game_bg_leaderboard_1st);
        } else if (i2 == 2) {
            textView4.setBackgroundResource(R.drawable.vk_html5_game_bg_leaderboard_2nd);
        } else {
            if (i2 != 3) {
                return;
            }
            textView4.setBackgroundResource(R.drawable.vk_html5_game_bg_leaderboard_3rd);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new b(viewGroup);
        }
        if (i == 1) {
            return new d(viewGroup, this.e.size());
        }
        if (i == 2) {
            return new c(viewGroup, this.d);
        }
        throw new IllegalArgumentException(lhg.a(i, "Unknown view type: "));
    }
}
