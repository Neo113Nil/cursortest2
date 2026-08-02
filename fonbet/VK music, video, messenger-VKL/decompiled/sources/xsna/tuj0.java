package xsna;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.util.measure.ScaleType;
import com.vk.dto.common.GoodAlbum;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.im.Image;
import com.vk.dto.photo.Photo;
import com.vk.feed.tool.view.newsfeed.image.FixedSizeFrescoImageViewLegacy;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.MarketAlbumAttachment;
import com.vkontakte.android.attachments.ShitAttachment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import xsna.qi6;

/* compiled from: SingleMarketAlbumHolder.kt */
/* loaded from: classes4.dex */
public final class tuj0 extends m56<MarketAlbumAttachment> implements View.OnClickListener {
    public static final /* synthetic */ int G = 0;
    public final ad1 D;
    public final FixedSizeFrescoImageViewLegacy E;
    public e6o F;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public tuj0(ViewGroup viewGroup) {
        super(r0);
        wk10 wk10Var = new wk10(viewGroup.getContext());
        f4m.y(cn70.b(6), wk10Var);
        ad1 ad1Var = new ad1(viewGroup.getContext());
        ad1Var.setId(R.id.attach);
        int b = cn70.b(16);
        ad1Var.setPadding(b, b, b, b);
        ad1Var.setLabelDrawable(enj.c(R.drawable.vk_icon_market_12, -1, viewGroup.getContext()));
        FixedSizeFrescoImageViewLegacy fixedSizeFrescoImageViewLegacy = new FixedSizeFrescoImageViewLegacy(viewGroup.getContext(), null, 6);
        fixedSizeFrescoImageViewLegacy.setId(R.id.image_view);
        fixedSizeFrescoImageViewLegacy.setScaleType(ScaleType.CENTER_CROP);
        fixedSizeFrescoImageViewLegacy.setPlaceholder(new ColorDrawable(dhr0.t.c(R.attr.vk_ui_image_placeholder)));
        fixedSizeFrescoImageViewLegacy.setImportantForAccessibility(2);
        fixedSizeFrescoImageViewLegacy.setHorizontal(true);
        ad1Var.setContentView(fixedSizeFrescoImageViewLegacy);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 1;
        s3q0 s3q0Var = s3q0.a;
        wk10Var.addView(ad1Var, layoutParams);
        this.D = (ad1) this.itemView.findViewById(R.id.attach);
        this.E = (FixedSizeFrescoImageViewLegacy) this.itemView.findViewById(R.id.image_view);
    }

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        this.F = s6oVar.a(this, s6oVar.e);
        boolean z = q6() instanceof ShitAttachment;
        FixedSizeFrescoImageViewLegacy fixedSizeFrescoImageViewLegacy = this.E;
        if (z) {
            fixedSizeFrescoImageViewLegacy.setOnClickListener(null);
            return;
        }
        View.OnClickListener onClickListener = this.F;
        if (onClickListener == null) {
            onClickListener = this;
        }
        fixedSizeFrescoImageViewLegacy.setOnClickListener(onClickListener);
    }

    @Override // xsna.m56
    public final void T6(MarketAlbumAttachment marketAlbumAttachment) {
        MarketAlbumAttachment marketAlbumAttachment2 = marketAlbumAttachment;
        boolean z = q6() instanceof ShitAttachment;
        FixedSizeFrescoImageViewLegacy fixedSizeFrescoImageViewLegacy = this.E;
        if (z) {
            fixedSizeFrescoImageViewLegacy.setOnClickListener(null);
        } else {
            View.OnClickListener onClickListener = this.F;
            if (onClickListener == null) {
                onClickListener = this;
            }
            fixedSizeFrescoImageViewLegacy.setOnClickListener(onClickListener);
        }
        GoodAlbum goodAlbum = marketAlbumAttachment2.f;
        String str = goodAlbum.d;
        int i = goodAlbum.f;
        ad1 ad1Var = this.D;
        ad1Var.setTitle(str);
        ad1Var.setSubtitle(goodAlbum.h == 1 ? s6(R.plurals.services_count, i, Integer.valueOf(i)) : s6(R.plurals.goods_count, i, Integer.valueOf(i)));
        ad1Var.setLabel(String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)));
        Photo photo = goodAlbum.e;
        int a = qi6.a.a(this.itemView.getContext());
        ArrayList arrayList = photo.y.b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (ImageSize.j.contains(Character.valueOf(((ImageSize) next).b))) {
                arrayList2.add(next);
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = photo.y.b;
        }
        ImageSize y = nr2.y(a, arrayList2);
        fixedSizeFrescoImageViewLegacy.setWrapContent(marketAlbumAttachment2.b);
        if (y != null) {
            Image image = y.d;
            fixedSizeFrescoImageViewLegacy.r(image.b, image.c);
        } else {
            fixedSizeFrescoImageViewLegacy.r(135, 100);
        }
        int i2 = dek0.a;
        dek0.b(fixedSizeFrescoImageViewLegacy, null, null, 14);
        fixedSizeFrescoImageViewLegacy.setIgnoreTrafficSaverPredicate(new kt4(0, new lt4(0, this, tuj0.class, "isAdvertisement", "isAdvertisement()Z", 1), mcy.class, "get", "get()Ljava/lang/Object;", 0, 3));
        fixedSizeFrescoImageViewLegacy.setLocalImage((fxj0) null);
        fixedSizeFrescoImageViewLegacy.setRemoteImage((List<? extends fxj0>) arrayList2);
    }
}
