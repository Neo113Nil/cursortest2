package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.common.ImageSize;
import com.vk.dto.newsfeed.ButtonAction;
import com.vk.statistic.DeprecatedStatisticPrettyCard;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PrettyCardAttachment;
import com.vkontakte.android.data.PostInteract;
import com.vkontakte.android.data.b;

/* compiled from: PrettyCardHolder.kt */
/* loaded from: classes4.dex */
public final class b3d0 extends vif0<PrettyCardAttachment.Card> implements View.OnClickListener {
    public static final /* synthetic */ int v = 0;
    public final ng30 n;
    public final int o;
    public final int p;
    public final VkImage q;
    public final TextView r;
    public final TextView s;
    public final TextView t;
    public final VkButton u;

    public b3d0(lv0 lv0Var, ViewGroup viewGroup, s6o s6oVar, ng30 ng30Var, int i, int i2) {
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
    public final void i6(PrettyCardAttachment.Card card) {
        String str;
        PrettyCardAttachment.Card card2 = card;
        PrettyCardAttachment.Button button = card2.g;
        ImageSize Ab = card2.h.Ab(this.p, false);
        if (Ab != null) {
            this.q.o0(Ab.d.d, null);
        }
        this.r.setText(card2.f);
        u1u0.i(this.s, card2.i, true);
        u1u0.i(this.t, card2.j, true);
        VkButton vkButton = this.u;
        if (button != null) {
            vkButton.setVisibility(0);
            vkButton.setText(button.b);
        } else {
            vkButton.setVisibility(8);
        }
        DeprecatedStatisticPrettyCard deprecatedStatisticPrettyCard = card2.k;
        if (deprecatedStatisticPrettyCard != null && !TextUtils.isEmpty(deprecatedStatisticPrettyCard.f) && !TextUtils.isEmpty(deprecatedStatisticPrettyCard.g)) {
            deprecatedStatisticPrettyCard.Bb(com.vkontakte.android.data.b.z, getLayoutPosition());
        }
        PostInteract postInteract = card2.l;
        if (postInteract == null || (str = postInteract.g) == null) {
            return;
        }
        this.n.b(new vx(card2, str, this, 5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ViewGroup viewGroup = this.l;
        int id = view.getId();
        if (id == R.id.container) {
            T t = this.m;
            String str = ((PrettyCardAttachment.Card) t).e.b;
            PrettyCardAttachment.Card card = (PrettyCardAttachment.Card) t;
            PostInteract postInteract = card.l;
            if (postInteract != null) {
                postInteract.f = str;
                postInteract.i = card.c;
                postInteract.zb(PostInteract.Type.click_pretty_card);
            }
            q6();
            hd60.a().w0(viewGroup.getContext(), (PrettyCardAttachment.Card) this.m);
            return;
        }
        if (id == R.id.button) {
            T t2 = this.m;
            PrettyCardAttachment.Button button = ((PrettyCardAttachment.Card) t2).g;
            if (button == null) {
                return;
            }
            String str2 = button.c.e.b;
            PrettyCardAttachment.Card card2 = (PrettyCardAttachment.Card) t2;
            PostInteract postInteract2 = card2.l;
            if (postInteract2 != null) {
                postInteract2.f = str2;
                postInteract2.i = card2.c;
                postInteract2.zb(PostInteract.Type.click_pretty_card);
            }
            q6();
            gd60 a = hd60.a();
            Context context = viewGroup.getContext();
            PrettyCardAttachment.Card card3 = (PrettyCardAttachment.Card) this.m;
            ButtonAction buttonAction = card3.g.c;
            PostInteract postInteract3 = card3.l;
            Integer.valueOf(this.o);
            a.C(context, buttonAction, postInteract3, (r14 & 16) != 0 ? null : null, (r14 & 32) != 0 ? null : null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q6() {
        String str;
        PrettyCardAttachment.Card card = (PrettyCardAttachment.Card) this.m;
        PostInteract postInteract = card.l;
        String str2 = postInteract != null ? postInteract.g : null;
        String str3 = card.c;
        if (str2 == null || str2.length() <= 0 || str3 == null || str3.length() <= 0) {
            return;
        }
        b.d dVar = new b.d("ads/click_pretty_card");
        dVar.b(str2, "ad_data");
        dVar.b(str3, "card_data");
        dVar.h();
        PostInteract postInteract2 = ((PrettyCardAttachment.Card) this.m).l;
        if (postInteract2 == null || (str = postInteract2.c) == null) {
            return;
        }
        k7x k7xVar = new k7x(str2, str, this, 2);
        ng30 ng30Var = this.n;
        ng30Var.b(k7xVar);
        ng30Var.b(new yb3(str2, str, this, 7));
    }
}
