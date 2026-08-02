package xsna;

import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.util.measure.ScaleType;
import com.vk.core.view.fresco.FrescoImageView;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.GoodAlbum;
import com.vk.dto.common.Image;
import com.vk.dto.photo.Photo;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.MarketAlbumAttachment;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MarketAlbumHolder.kt */
/* loaded from: classes4.dex */
public final class tr00 extends de6<sr00> implements blc0 {
    public final afu k;
    public final FrescoImageView l;
    public x64 m;
    public final nwf0 n;

    /* compiled from: MarketAlbumHolder.kt */
    public static final class a {
        public static tr00 a(ViewGroup viewGroup, boolean z, gzs gzsVar) {
            afu afuVar = new afu(viewGroup.getContext());
            afuVar.setId(R.id.container);
            FrescoImageView frescoImageView = new FrescoImageView(viewGroup.getContext(), null, 6, 0);
            frescoImageView.setId(R.id.image);
            dek0.b(frescoImageView, null, null, 6);
            frescoImageView.setWithImageDownscale(z);
            frescoImageView.setIgnoreTrafficSaverPredicate(gzsVar);
            frescoImageView.setScaleType(ScaleType.CENTER_CROP);
            if (!z) {
                frescoImageView.setFadeDuration(0);
            }
            frescoImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            afuVar.addView(frescoImageView);
            return new tr00(afuVar);
        }
    }

    public tr00(afu afuVar) {
        super(afuVar, 3);
        afu afuVar2 = (afu) afuVar.findViewById(R.id.container);
        this.k = afuVar2;
        FrescoImageView frescoImageView = (FrescoImageView) afuVar.findViewById(R.id.image);
        this.l = frescoImageView;
        afuVar2.a(m33.a(R.drawable.vk_icon_market_12, afuVar.getContext()), cn70.b(12));
        afuVar2.setLabelGap(cn70.b(6));
        afuVar2.setLabelCornerRadius(cn70.a() * 4.0f);
        afuVar2.setLabelTextSize(12.0f);
        frescoImageView.setOnClickListener(this);
        frescoImageView.setPlaceholder(new ColorDrawable(e3m.f(R.attr.vk_ui_image_placeholder, afuVar.getContext())));
        this.n = new nwf0(afuVar2, new z00(this, 7));
        afuVar.setOnClickListener(this);
    }

    @Override // xsna.blc0
    public final void D1(boolean z) {
        this.n.a(z);
    }

    @Override // xsna.blc0
    public final void Z1(x64 x64Var) {
        this.m = x64Var;
    }

    @Override // xsna.de6
    public final void b(Attachment attachment) {
        Image image;
        if (attachment instanceof MarketAlbumAttachment) {
            GoodAlbum goodAlbum = ((MarketAlbumAttachment) attachment).f;
            int i = goodAlbum.h;
            int i2 = goodAlbum.f;
            View view = this.b;
            view.setContentDescription(i == 1 ? view.getResources().getQuantityString(R.plurals.services_count, i2, Integer.valueOf(i2)) : view.getResources().getQuantityString(R.plurals.goods_count, i2, Integer.valueOf(i2)));
            this.k.setLabelText(uqm0.f(i2));
            FrescoImageView frescoImageView = this.l;
            ArrayList arrayList = null;
            frescoImageView.setLocalImage((fxj0) null);
            Photo photo = goodAlbum.e;
            if (photo != null && (image = photo.y) != null) {
                arrayList = image.b;
            }
            frescoImageView.setRemoteImage((List<? extends fxj0>) arrayList);
        }
    }

    @Override // xsna.de6
    public final void c(sr00 sr00Var) {
        sr00 sr00Var2 = sr00Var;
        View view = this.b;
        Resources resources = view.getResources();
        int i = sr00Var2.h;
        int i2 = sr00Var2.i;
        view.setContentDescription(resources.getQuantityString(i, i2, Integer.valueOf(i2)));
        this.k.setLabelText(sr00Var2.j);
        FrescoImageView frescoImageView = this.l;
        frescoImageView.setLocalImage((fxj0) null);
        frescoImageView.setRemoteImage((List<? extends fxj0>) sr00Var2.k);
    }

    @Override // xsna.de6, android.view.View.OnClickListener
    public final void onClick(View view) {
        x64 x64Var = this.m;
        if (x64Var != null) {
            x64Var.a(this.d);
        } else {
            super.onClick(view);
        }
    }

    @Override // xsna.blc0
    public final void p5() {
    }

    @Override // xsna.blc0
    public final void j1(View.OnClickListener onClickListener) {
    }
}
