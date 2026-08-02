package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.soloader.MinElf;
import com.vk.common.links.LaunchContext;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.dto.common.VerifyInfo;
import com.vk.imageloader.view.VKCircleImageView;
import com.vkontakte.android.R;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.o0r0;

/* compiled from: DonutSubscriptionViewHolder.kt */
/* loaded from: classes18.dex */
public final class h3o extends j0n0<f3o> implements View.OnClickListener {
    public final VKCircleImageView n;
    public final TextView o;
    public final View p;
    public final TextView q;
    public final TextView r;
    public final ImageView s;
    public final View t;

    public h3o(ViewGroup viewGroup) {
        super(viewGroup, R.layout.settings_paid_subscription_group, 0);
        this.n = (VKCircleImageView) this.itemView.findViewById(R.id.photo);
        this.o = (TextView) this.itemView.findViewById(R.id.title);
        this.p = this.itemView.findViewById(R.id.verified_icon);
        this.q = (TextView) this.itemView.findViewById(R.id.subtitle);
        this.r = (TextView) this.itemView.findViewById(R.id.subtitle2);
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.actions);
        this.s = imageView;
        this.t = this.itemView.findViewById(R.id.arrow);
        this.itemView.setOnClickListener(this);
        imageView.setOnClickListener(this);
    }

    @Override // xsna.vif0
    public final void i6(Object obj) {
        v2o v2oVar = ((f3o) obj).b;
        c1o c1oVar = v2oVar.a;
        this.o.setText(c1oVar.b);
        this.q.setText(v2oVar.b);
        bwt0.S(this.n, new com.vk.movika.sdk.base.logic.interactor.i(9, this, c1oVar));
        VerifyInfo verifyInfo = c1oVar.d;
        boolean z = (verifyInfo.b) || (verifyInfo.c);
        String str = null;
        View view = this.p;
        if (z) {
            view.setBackground(VerifyInfoHelper.h(VerifyInfoHelper.a, verifyInfo, this.l.getContext(), null, 28));
        }
        bwt0.p0(view, z);
        String o = pvo0.o(v2oVar.e, false, true);
        String str2 = v2oVar.d;
        if (str2.equals(SignalingProtocol.KEY_ACTIVE)) {
            str = h6(R.string.vk_subscription_payed, o);
        } else if (str2.equals("expiring")) {
            str = h6(R.string.donut_expiring, o);
        }
        TextView textView = this.r;
        textView.setText(str);
        bwt0.p0(textView, !(str == null || str.length() == 0));
        if (v2oVar.f) {
            return;
        }
        bwt0.p0(this.t, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        v2o v2oVar;
        v2o v2oVar2;
        if (epx.f(view, this.itemView)) {
            s6();
            return;
        }
        if (epx.f(view, this.s)) {
            int l = krv0.l(R.attr.vk_ui_icon_accent);
            view.getContext();
            e.b bVar = new e.b(view, null, null, l, 6);
            bVar.w = R.layout.ds_internal_context_menu_item;
            String str = ((f3o) this.m).b.d;
            String str2 = null;
            if (str.equals(SignalingProtocol.KEY_ACTIVE)) {
                f3o f3oVar = (f3o) this.m;
                if (f3oVar != null && (v2oVar2 = f3oVar.b) != null) {
                    str2 = v2oVar2.c;
                }
                if (!(str2 == null || str2.length() == 0)) {
                    VkContextMenu.c.c(bVar, R.string.donut_subscription_change, null, false, null, new l9h(this, 11), 30);
                }
            } else if (str.equals("expiring")) {
                f3o f3oVar2 = (f3o) this.m;
                if (f3oVar2 != null && (v2oVar = f3oVar2.b) != null) {
                    str2 = v2oVar.c;
                }
                if (!(str2 == null || str2.length() == 0)) {
                    VkContextMenu.c.c(bVar, R.string.donut_subscription_renew, null, false, null, new fgm(this, 2), 30);
                }
            }
            VkContextMenu.c.c(bVar, fkq0.b(((f3o) this.m).b.a.a) ? R.string.donut_subscription_to_community : R.string.donut_subscription_to_profile, null, false, null, new maj(this, 6), 30);
            bVar.j();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q6() {
        v2o v2oVar;
        String str;
        f3o f3oVar = (f3o) this.m;
        if (f3oVar == null || (v2oVar = f3oVar.b) == null || (str = v2oVar.c) == null) {
            return;
        }
        maz.c(xwk.d().e(), this.l.getContext(), str, LaunchContext.A, null, null, 24);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s6() {
        v2o v2oVar;
        f3o f3oVar = (f3o) this.m;
        if (f3oVar == null || (v2oVar = f3oVar.b) == null) {
            return;
        }
        xwk.e().m(this.l.getContext(), v2oVar.a.a, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
    }
}
