package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.avatar.api.VKAvatarView;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.Peer;
import com.vk.dto.user.ImageStatus;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.DialogMember;
import com.vk.im.ui.formatters.DisplayNameFormatter;
import com.vk.im.ui.views.avatars.ImAvatarView;
import com.vk.im.ui.views.avatars.a;
import com.vk.imageloader.view.VKImageView;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.yyb;
import xsna.yyb.a;

/* compiled from: VhBaseMembersItem.kt */
/* loaded from: classes2.dex */
public abstract class lqr0<T extends yyb.a> extends kqr0<T> {
    public final jj0 l;
    public final ImAvatarView m;
    public final ImageView n;
    public final TextView o;
    public final VKImageView p;
    public final ImageView q;
    public final ImageView r;
    public final ImageView s;
    public final TextView t;
    public final View u;
    public final DisplayNameFormatter v;
    public T w;

    public lqr0(jj0 jj0Var, ViewGroup viewGroup, int i) {
        super(i, viewGroup);
        this.l = jj0Var;
        this.m = (ImAvatarView) this.itemView.findViewById(R.id.avatar);
        this.n = (ImageView) this.itemView.findViewById(R.id.online);
        this.o = (TextView) this.itemView.findViewById(R.id.title);
        this.p = (VKImageView) this.itemView.findViewById(R.id.status);
        this.q = (ImageView) this.itemView.findViewById(R.id.verified_status);
        this.r = (ImageView) this.itemView.findViewById(R.id.muted_status);
        this.s = (ImageView) this.itemView.findViewById(R.id.admin_status);
        this.t = (TextView) this.itemView.findViewById(R.id.subtitle);
        View findViewById = this.itemView.findViewById(R.id.actions);
        this.u = findViewById;
        this.v = new DisplayNameFormatter(null, 3, null);
        bwt0.i0(this.itemView, new bjm0(this, 6));
        bwt0.i0(findViewById, new ksg0(this, 17));
    }

    @Override // xsna.kqr0
    /* renamed from: i6, reason: merged with bridge method [inline-methods] */
    public final void W5(T t) {
        Drawable drawable;
        Drawable mutate;
        Drawable drawable2;
        Drawable mutate2;
        int color;
        this.w = t;
        DialogMember c = t.c();
        ProfilesInfo e = t.e();
        boolean zb = c.zb();
        String str = c.g;
        Peer peer = c.b;
        ImAvatarView imAvatarView = this.m;
        if (zb) {
            String str2 = str == null ? "" : str;
            imAvatarView.getClass();
            VKAvatarView.Z0(imAvatarView, null, new com.vk.im.ui.views.avatars.a(imAvatarView.getContext(), new a.b.C1179b(str2), 2), null, null, 12);
        } else {
            imAvatarView.s1(e.Bb(peer));
        }
        ImageView imageView = this.n;
        if (imageView == null || peer == null || e == null || !peer.Ab(Peer.Type.USER)) {
            fp80.a(imageView, null);
        } else {
            fp80.a(imageView, e.Bb(peer));
        }
        boolean zb2 = c.zb();
        TextView textView = this.o;
        if (zb2) {
            textView.setText(str);
        } else {
            ImFeatures imFeatures = ImFeatures.FEATURE_CHAT_MEMBER_NAME_ORDER;
            imFeatures.getClass();
            boolean a = com.vk.toggle.b.A.a(imFeatures);
            DisplayNameFormatter displayNameFormatter = this.v;
            if (a && o25.b(o25.a())) {
                textView.setText(displayNameFormatter.a(peer, e, DisplayNameFormatter.NameOrder.START_WITH_LASTNAME));
            } else {
                qcy<Object>[] qcyVarArr = DisplayNameFormatter.d;
                textView.setText(displayNameFormatter.a(peer, e, DisplayNameFormatter.NameOrder.START_WITH_FIRSTNAME));
            }
        }
        int i = 8;
        this.u.setVisibility(t.a() ? 0 : 8);
        qtd0 Bb = e.Bb(peer);
        ImageStatus E5 = Bb != null ? Bb.E5() : null;
        VKImageView vKImageView = this.p;
        if (E5 != null) {
            ImageSize Ab = E5.d.Ab(iah0.a(20), false);
            vKImageView.load(Ab != null ? Ab.d.d : null);
        }
        vKImageView.setVisibility(E5 != null ? 0 : 8);
        qtd0 Bb2 = e.Bb(peer);
        b25 a2 = o25.a();
        ImageView imageView2 = this.q;
        if (Bb2 != null && o25.b(a2) && Bb2.t1() && Bb2.q9().b) {
            dhr0.a.l0(imageView2, R.drawable.vk_icon_education_16, R.attr.vk_ui_icon_accent);
            i = 0;
        }
        imageView2.setVisibility(i);
        bwt0.p0(this.r, c.j);
        boolean g = t.g();
        ImageView imageView3 = this.s;
        if (g) {
            if (imageView3 != null) {
                bwt0.p0(imageView3, true);
            }
            if (imageView3 != null && (drawable2 = imageView3.getDrawable()) != null && (mutate2 = drawable2.mutate()) != null) {
                if (BuildInfo.t()) {
                    color = dhr0.t.c(R.attr.vk_ui_icon_accent);
                } else {
                    Context context = this.itemView.getContext();
                    e3m.a aVar = e3m.a;
                    color = context.getColor(R.color.vk_azure_300);
                }
                mutate2.setTint(color);
            }
        } else if (t.f()) {
            if (imageView3 != null) {
                bwt0.p0(imageView3, true);
            }
            if (imageView3 != null && (drawable = imageView3.getDrawable()) != null && (mutate = drawable.mutate()) != null) {
                Context context2 = this.itemView.getContext();
                e3m.a aVar2 = e3m.a;
                mutate.setTint(context2.getColor(R.color.vk_steel_gray_150));
            }
        } else if (imageView3 != null) {
            bwt0.p0(imageView3, false);
        }
        if (qv20.k(e.Bb(peer))) {
            ImAvatarView.x1(imAvatarView, dhr0.t.a(R.drawable.ic_cake_circle_fill_purple_composite_26));
        } else {
            ImAvatarView.x1(imAvatarView, null);
        }
        j6(t, this.t);
    }

    public abstract void j6(T t, TextView textView);
}
