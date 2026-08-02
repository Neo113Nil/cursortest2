package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.fresco.FrescoImageView;
import com.vk.dto.articles.ArticleDonut;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.Peer;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.attaches.AttachArticle;
import com.vk.im.ui.views.msg.TimeAndStatusView;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* compiled from: MsgPartArticleHolder.kt */
/* loaded from: classes2.dex */
public final class un30 extends hr30<AttachArticle, vn30> {
    public static final /* synthetic */ int v = 0;
    public final View d;
    public final Resources e;
    public final jwx f;
    public pk30 g;
    public final TextView h;
    public final TimeAndStatusView i;
    public final TextView j;
    public final FrescoImageView k;
    public final View l;
    public final View m;
    public final View n;
    public final Object o;
    public final Object p;
    public final Object q;
    public final Object r;
    public final ek30 s;
    public final PorterDuffColorFilter t;
    public int u;

    public un30(View view) {
        this.d = view;
        Context context = view.getContext();
        Resources resources = context.getResources();
        this.e = resources;
        this.f = new jwx(3, 7);
        this.h = (TextView) view.findViewById(R.id.title);
        this.i = (TimeAndStatusView) view.findViewById(R.id.timeAndStatus);
        this.j = (TextView) view.findViewById(R.id.read_button);
        this.k = (FrescoImageView) view.findViewById(R.id.image);
        this.l = view.findViewById(R.id.content);
        this.m = view.findViewById(R.id.blocked_layout);
        this.n = view.findViewById(R.id.deleted_layout);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.o = msy.a(lazyThreadSafetyMode, new drg(this, 27));
        this.p = msy.a(lazyThreadSafetyMode, new s6y(this, 7));
        this.q = msy.a(lazyThreadSafetyMode, new gzv(this, 13));
        this.r = msy.a(lazyThreadSafetyMode, new x4u(this, 11));
        this.s = new ek30(context, 0);
        this.t = new PorterDuffColorFilter(resources.getColor(R.color.vkim_msg_part_longread_mask), PorterDuff.Mode.SRC_ATOP);
        Serializer.c<Peer> cVar = Peer.CREATOR;
        Peer.Unknown unknown = Peer.Unknown.e;
    }

    /* JADX WARN: Type inference failed for: r10v34, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v37, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.hr30
    public final void p(vn30 vn30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        ImageList C8;
        ImageList C82;
        String str;
        vn30 vn30Var2 = vn30Var;
        qtd0 qtd0Var = vn30Var2.c;
        String str2 = vn30Var2.l;
        boolean z = vn30Var2.i;
        this.g = pk30Var;
        boolean z2 = vn30Var2.g;
        TextView textView = this.j;
        View view = this.n;
        View view2 = this.m;
        View view3 = this.l;
        if (z2 || vn30Var2.j) {
            view3.setVisibility(0);
            view2.setVisibility(8);
            view.setVisibility(8);
            TextView textView2 = this.h;
            textView2.setText(str2);
            ImageList imageList = vn30Var2.n;
            boolean Jb = imageList.Jb() ? true : (qtd0Var == null || (C8 = qtd0Var.C8()) == null) ? false : C8.Jb();
            Resources resources = this.e;
            FrescoImageView frescoImageView = this.k;
            if (Jb) {
                frescoImageView.setColorFilter(this.t);
                textView2.setTextColor(resources.getColor(R.color.vk_white));
            } else {
                frescoImageView.setColorFilter(null);
                textView2.setTextColor(resources.getColor(R.color.vk_gray_800));
            }
            if (imageList.Jb()) {
                frescoImageView.setPostprocessor(null);
                frescoImageView.setRemoteImage(imageList);
            } else if (qtd0Var == null || (C82 = qtd0Var.C8()) == null || !C82.Jb()) {
                frescoImageView.setRemoteImage((List<? extends fxj0>) EmptyList.b);
            } else {
                frescoImageView.setPostprocessor(this.f);
                frescoImageView.setRemoteImage((Image) ixj0.m(qtd0Var.C8().b));
            }
            frescoImageView.setCornerRadius(this.u);
            wng0.e(this.u, this.s);
            ArticleDonut.Placeholder placeholder = vn30Var2.m;
            if (placeholder != null) {
                LinkButton linkButton = placeholder.d;
                textView.setText(linkButton != null ? linkButton.b : null);
                his0.v(textView, R.drawable.vk_icon_star_circle_12, R.color.vk_orange);
            } else {
                textView.setText(R.string.vkim_longread_read_button);
                his0.v(textView, R.drawable.vk_icon_flash_16, 0);
            }
        } else {
            boolean z3 = vn30Var2.h;
            if (z3 || z) {
                view3.setVisibility(8);
                view2.setVisibility(0);
                view.setVisibility(8);
                ?? r11 = this.p;
                ?? r12 = this.o;
                if (z) {
                    ((ImageView) r12.getValue()).setImageResource(R.drawable.ic_article_protected_72);
                    ((TextView) r11.getValue()).setText(R.string.vkim_article_protected);
                } else if (z3) {
                    ((ImageView) r12.getValue()).setImageResource(R.drawable.ic_article_blocked_72);
                    ((TextView) r11.getValue()).setText(R.string.vkim_article_banned);
                }
            } else if (vn30Var2.k) {
                view3.setVisibility(8);
                view2.setVisibility(8);
                view.setVisibility(0);
                ((TextView) this.q.getValue()).setText(str2);
                TextView textView3 = (TextView) this.r.getValue();
                if (qtd0Var == null || (str = qtd0Var.name()) == null) {
                    str = "";
                }
                textView3.setText(str);
            }
        }
        jjc.g(textView, new sn30(this, vn30Var2, vn30Var2, vn30Var2));
        jjc.g(this.d, new tn30(this, vn30Var2, vn30Var2, vn30Var2));
        hr30.l(this.i, vn30Var2.b, true);
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ek30 ek30Var = this.s;
        FrescoImageView frescoImageView = this.k;
        frescoImageView.setPlaceholder(ek30Var);
        frescoImageView.setColorFilter(this.t);
        this.u = e3m.d(R.attr.im_msg_part_corner_radius_big, layoutInflater.getContext());
        return this.d;
    }

    @Override // xsna.hr30
    public final void r() {
        this.g = null;
    }
}
