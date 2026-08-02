package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ironsource.X3;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.actions.Action;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.PromoButton;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import java.util.Random;

/* compiled from: PromoButtonHolder.kt */
/* loaded from: classes4.dex */
public final class q4e0 extends qi6<PromoButton> implements View.OnClickListener {
    public final VKImageView C;
    public final TextView D;
    public final TextView E;

    public q4e0(ViewGroup viewGroup) {
        super(R.layout.news_promo_button_item, viewGroup);
        VKImageView vKImageView = (VKImageView) this.itemView.findViewById(R.id.icon);
        this.C = vKImageView;
        this.D = (TextView) this.itemView.findViewById(R.id.title);
        this.E = (TextView) this.itemView.findViewById(R.id.description);
        this.itemView.setOnClickListener(this);
        vKImageView.setPlaceholderImage(dhr0.t.a(R.drawable.user_placeholder));
    }

    @Override // xsna.qi6
    public final void E6(PromoButton promoButton) {
        ImageSize Cb;
        PromoButton promoButton2 = promoButton;
        String str = promoButton2.j;
        Image image = promoButton2.k;
        this.C.load((image == null || (Cb = image.Cb(iah0.a(48.0f), true, false)) == null) ? null : Cb.d.d);
        String str2 = promoButton2.i;
        TextView textView = this.D;
        textView.setText(str2);
        TextView textView2 = this.E;
        if (str == null || str.length() == 0) {
            textView.setSingleLine(false);
            bwt0.p0(textView2, false);
        } else {
            textView.setSingleLine(true);
            textView2.setText(str);
            bwt0.p0(textView2, true);
        }
    }

    @Override // xsna.qi6
    public final void a6(u1c0 u1c0Var) {
        NewsEntry newsEntry = u1c0Var.b;
        if (newsEntry instanceof PromoButton) {
            PromoButton.TrackData trackData = ((PromoButton) newsEntry).n;
            trackData.b = u1c0Var.k;
            trackData.d = u1c0Var.l;
            trackData.c = pvo0.a();
        }
        super.a6(u1c0Var);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Action action;
        PromoButton q6 = q6();
        if (q6 != null) {
            PromoButton.TrackData trackData = q6.n;
            b.d dVar = new b.d("block_interaction");
            dVar.b("clicked", "action");
            dVar.b("promo_button", "type");
            dVar.b(trackData.d, "ref");
            dVar.b(q6.m, "track_code");
            dVar.b(Integer.valueOf(trackData.b), X3.i.L);
            dVar.b("2000000004_" + new Random().nextInt(), "post_id");
            dVar.e();
        }
        PromoButton q62 = q6();
        if (q62 == null || (action = q62.l) == null) {
            return;
        }
        hd60.a().v(action, this.itemView.getContext(), (r20 & 4) != 0 ? null : null, (r20 & 8) != 0 ? null : null, (r20 & 16) != 0 ? null : null, (r20 & 32) != 0 ? null : null, null, (r20 & 128) != 0 ? null : 423);
    }
}
