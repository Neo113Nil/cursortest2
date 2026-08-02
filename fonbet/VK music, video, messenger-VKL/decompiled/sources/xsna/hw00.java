package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Good;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.imageloader.view.VKImageView;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.MarketAttachment;

/* compiled from: MarketCompactHolder.kt */
/* loaded from: classes4.dex */
public final class hw00 extends ikg<MarketAttachment> implements f530 {
    public static final int O = iah0.a(40);
    public final q530 L;
    public final sz00 M;
    public final p530 N;

    public hw00(ViewGroup viewGroup, q530 q530Var, sz00 sz00Var) {
        super(viewGroup);
        this.L = q530Var;
        this.M = sz00Var;
        View view = this.itemView;
        VKImageView vKImageView = this.D;
        this.N = new p530(view, vKImageView == null ? null : vKImageView, this.E, this.F, (TextView) null, (View) null);
    }

    @Override // xsna.m56
    public final void T6(Attachment attachment) {
        Good good = ((MarketAttachment) attachment).f;
        q530 q530Var = this.L;
        if (q530Var != null) {
            q530Var.c(e530.b(good, null), this, new z410(3));
        } else {
            o1(null);
        }
        dz5.J(good, this.E);
        mt00.d(Long.valueOf(good.b), Long.valueOf(good.c.b), null, CommonMarketStat$TypeRefSource.POST, null, null, null, null, null, null, null, null, null, null, 32756);
    }

    @Override // xsna.f530
    public final p530 k1(Integer num) {
        return this.N;
    }

    @Override // xsna.f530
    public final void o1(Integer num) {
        Good good;
        ImageSize Cb;
        MarketAttachment marketAttachment = (MarketAttachment) this.C;
        if (marketAttachment == null || (good = marketAttachment.f) == null) {
            return;
        }
        this.E.setText(good.d);
        this.F.setText(good.h.e);
        this.itemView.setOnClickListener(this);
        Image image = good.n;
        String str = (image == null || (Cb = image.Cb(O, true, false)) == null) ? null : Cb.d.d;
        VKImageView vKImageView = this.D;
        if (str != null) {
            vKImageView.load(str);
            vKImageView.setClipToOutline(true);
            vKImageView.setOutlineProvider(new t0w0(6, cn70.a() * 8.0f, false, false));
        } else {
            qcy<Object>[] qcyVarArr = bwt0.a;
            dhr0.f0(R.drawable.white_oval, R.attr.vk_ui_background_secondary, vKImageView);
            omw.d(vKImageView, R.drawable.vk_icon_market_24, R.attr.vk_ui_icon_medium);
            vKImageView.setOutlineProvider(null);
            vKImageView.setClipToOutline(false);
        }
    }

    @Override // xsna.m56, android.view.View.OnClickListener
    public final void onClick(View view) {
        MarketAttachment marketAttachment;
        if (jjc.b() || (marketAttachment = (MarketAttachment) this.C) == null) {
            return;
        }
        Context context = this.itemView.getContext();
        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = MarketAttachment.g;
        Good good = marketAttachment.f;
        this.M.d(context, new qz00(good.b, good.c, commonMarketStat$TypeRefSource, null, null, null, null, this.v, Boolean.valueOf(good.V), null, null, null, null, 1045496));
    }
}
