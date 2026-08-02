package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.common.links.AwayLink;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.newsfeed.ButtonAction;
import com.vk.statistic.DeprecatedStatisticPrettyCard;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PrettyCardAttachment;
import com.vkontakte.android.data.PostInteract;
import com.vkontakte.android.data.b;

/* compiled from: PrettyCardDtoHolder.kt */
/* loaded from: classes4.dex */
public final class a3d0 extends vif0<c3d0> implements View.OnClickListener {
    public static final /* synthetic */ int v = 0;
    public final ng30 n;
    public int o;
    public final int p;
    public final VkImage q;
    public final TextView r;
    public final TextView s;
    public final TextView t;
    public final VkButton u;

    public a3d0(lv0 lv0Var, ViewGroup viewGroup, s6o s6oVar, ng30 ng30Var, int i, int i2) {
        super(lv0Var, viewGroup);
        this.n = ng30Var;
        this.o = i;
        this.p = i2;
        this.q = (VkImage) lv0Var.findViewById(R.id.content_photo);
        this.r = (TextView) lv0Var.findViewById(R.id.title);
        this.s = (TextView) lv0Var.findViewById(R.id.price);
        TextView textView = (TextView) lv0Var.findViewById(R.id.old_price);
        this.t = textView;
        VkButton vkButton = (VkButton) lv0Var.findViewById(R.id.button);
        this.u = vkButton;
        ViewGroup viewGroup2 = (ViewGroup) lv0Var.findViewById(R.id.container);
        View.OnClickListener a = s6oVar != null ? s6oVar.a(this, s6oVar.e) : null;
        textView.setPaintFlags(17);
        a = a == null ? this : a;
        vkButton.setOnClickListener(a);
        viewGroup2.setOnClickListener(a);
    }

    @Override // xsna.vif0
    public final void i6(c3d0 c3d0Var) {
        String str;
        c3d0 c3d0Var2 = c3d0Var;
        PrettyCardAttachment.Card card = c3d0Var2.d;
        Image image = c3d0Var2.e;
        ImageSize Ab = image != null ? image.Ab(this.p, false) : null;
        if (Ab != null) {
            this.q.o0(Ab.d.d, null);
        }
        this.r.setText(c3d0Var2.f);
        u1u0.i(this.s, c3d0Var2.g, true);
        u1u0.i(this.t, c3d0Var2.h, true);
        int i = c3d0Var2.j;
        VkButton vkButton = this.u;
        vkButton.setVisibility(i);
        vkButton.setText(c3d0Var2.i);
        DeprecatedStatisticPrettyCard deprecatedStatisticPrettyCard = card.k;
        if (deprecatedStatisticPrettyCard != null && !TextUtils.isEmpty(deprecatedStatisticPrettyCard.f) && !TextUtils.isEmpty(deprecatedStatisticPrettyCard.g)) {
            deprecatedStatisticPrettyCard.Bb(com.vkontakte.android.data.b.z, getLayoutPosition());
        }
        PostInteract postInteract = card.l;
        if (postInteract == null || (str = postInteract.g) == null) {
            return;
        }
        this.n.b(new z2d0(c3d0Var2, str, this, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        c3d0 c3d0Var;
        PrettyCardAttachment.Card card;
        PrettyCardAttachment.Button button;
        ViewGroup viewGroup = this.l;
        int id = view.getId();
        if (id == R.id.container) {
            c3d0 c3d0Var2 = (c3d0) this.m;
            if (c3d0Var2 != null) {
                PrettyCardAttachment.Card card2 = c3d0Var2.d;
                AwayLink awayLink = card2.e;
                s6(awayLink != null ? awayLink.b : null);
                q6();
                hd60.a().w0(viewGroup.getContext(), card2);
                return;
            }
            return;
        }
        if (id != R.id.button || (c3d0Var = (c3d0) this.m) == null || (button = (card = c3d0Var.d).g) == null) {
            return;
        }
        s6(button.c.e.b);
        q6();
        gd60 a = hd60.a();
        Context context = viewGroup.getContext();
        ButtonAction buttonAction = button.c;
        PostInteract postInteract = card.l;
        Integer.valueOf(this.o);
        a.C(context, buttonAction, postInteract, (r14 & 16) != 0 ? null : null, (r14 & 32) != 0 ? null : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q6() {
        PostInteract postInteract;
        String str;
        PostInteract postInteract2;
        c3d0 c3d0Var = (c3d0) this.m;
        String str2 = (c3d0Var == null || (postInteract2 = c3d0Var.d.l) == null) ? null : postInteract2.g;
        String str3 = c3d0Var != null ? c3d0Var.d.c : null;
        if (str2 == null || str2.length() <= 0 || str3 == null || str3.length() <= 0) {
            return;
        }
        b.d dVar = new b.d("ads/click_pretty_card");
        dVar.b(str2, "ad_data");
        dVar.b(str3, "card_data");
        dVar.h();
        c3d0 c3d0Var2 = (c3d0) this.m;
        if (c3d0Var2 == null || (postInteract = c3d0Var2.d.l) == null || (str = postInteract.c) == null) {
            return;
        }
        b1d b1dVar = new b1d(str2, str, this, 4);
        ng30 ng30Var = this.n;
        ng30Var.b(b1dVar);
        ng30Var.b(new ywc(str2, str, this, 3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s6(String str) {
        PrettyCardAttachment.Card card;
        PostInteract postInteract;
        PrettyCardAttachment.Card card2;
        T t = this.m;
        c3d0 c3d0Var = (c3d0) t;
        if (c3d0Var == null || (card = c3d0Var.d) == null || (postInteract = card.l) == null) {
            return;
        }
        postInteract.f = str;
        c3d0 c3d0Var2 = (c3d0) t;
        postInteract.i = (c3d0Var2 == null || (card2 = c3d0Var2.d) == null) ? null : card2.c;
        postInteract.zb(PostInteract.Type.click_pretty_card);
    }
}
