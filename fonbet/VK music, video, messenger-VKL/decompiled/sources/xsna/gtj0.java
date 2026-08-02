package xsna;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.util.measure.ScaleType;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.im.Image;
import com.vk.dto.photo.Photo;
import com.vk.feed.tool.view.newsfeed.image.FixedSizeFrescoImageViewLegacy;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.AlbumAttachment;
import com.vkontakte.android.attachments.ShitAttachment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import xsna.qi6;

/* compiled from: SingleAlbumHolder.kt */
@ozl
/* loaded from: classes4.dex */
public final class gtj0 extends m56<AlbumAttachment> implements View.OnClickListener, blc0 {
    public static final /* synthetic */ int I = 0;
    public final ad1 D;
    public final FixedSizeFrescoImageViewLegacy E;
    public x64 F;
    public final nwf0 G;
    public e6o H;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gtj0(ViewGroup viewGroup) {
        super(r0);
        wk10 wk10Var = new wk10(viewGroup.getContext());
        f4m.y(cn70.b(6), wk10Var);
        ad1 ad1Var = new ad1(viewGroup.getContext());
        ad1Var.setId(R.id.attach);
        int b = cn70.b(16);
        ad1Var.setPadding(b, b, b, b);
        FixedSizeFrescoImageViewLegacy fixedSizeFrescoImageViewLegacy = new FixedSizeFrescoImageViewLegacy(viewGroup.getContext(), null, 6);
        fixedSizeFrescoImageViewLegacy.setId(R.id.image_view);
        fixedSizeFrescoImageViewLegacy.setScaleType(ScaleType.CENTER_CROP);
        fixedSizeFrescoImageViewLegacy.setPlaceholder(new ColorDrawable(dhr0.t.c(R.attr.vk_ui_image_placeholder)));
        fixedSizeFrescoImageViewLegacy.setHorizontal(true);
        fixedSizeFrescoImageViewLegacy.setImportantForAccessibility(2);
        ad1Var.setContentView(fixedSizeFrescoImageViewLegacy);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 1;
        s3q0 s3q0Var = s3q0.a;
        wk10Var.addView(ad1Var, layoutParams);
        this.D = (ad1) this.itemView.findViewById(R.id.attach);
        this.E = (FixedSizeFrescoImageViewLegacy) this.itemView.findViewById(R.id.image_view);
        this.G = new nwf0((ViewGroup) this.itemView, new oa6(this, 11));
    }

    @Override // xsna.blc0
    public final void D1(boolean z) {
        this.G.a(z);
    }

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        this.H = s6oVar.a(this, s6oVar.e);
        boolean z = q6() instanceof ShitAttachment;
        FixedSizeFrescoImageViewLegacy fixedSizeFrescoImageViewLegacy = this.E;
        if (z) {
            fixedSizeFrescoImageViewLegacy.setOnClickListener(null);
            return;
        }
        View.OnClickListener onClickListener = this.H;
        if (onClickListener == null) {
            onClickListener = this;
        }
        fixedSizeFrescoImageViewLegacy.setOnClickListener(onClickListener);
    }

    @Override // xsna.m56
    public final void T6(AlbumAttachment albumAttachment) {
        AlbumAttachment albumAttachment2 = albumAttachment;
        boolean z = q6() instanceof ShitAttachment;
        FixedSizeFrescoImageViewLegacy fixedSizeFrescoImageViewLegacy = this.E;
        if (z) {
            fixedSizeFrescoImageViewLegacy.setOnClickListener(null);
        } else {
            View.OnClickListener onClickListener = this.H;
            if (onClickListener == null) {
                onClickListener = this;
            }
            fixedSizeFrescoImageViewLegacy.setOnClickListener(onClickListener);
        }
        String str = albumAttachment2.m;
        ad1 ad1Var = this.D;
        ad1Var.setTitle(str);
        int i = albumAttachment2.y;
        ad1Var.setSubtitle(s6(R.plurals.photos_count, i, Integer.valueOf(i)));
        ad1Var.setLabel(String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)));
        int a = qi6.a.a(this.itemView.getContext());
        Photo photo = albumAttachment2.l;
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
        fixedSizeFrescoImageViewLegacy.setWrapContent(albumAttachment2.b);
        if (y != null) {
            Image image = y.d;
            fixedSizeFrescoImageViewLegacy.r(image.b, image.c);
        } else {
            fixedSizeFrescoImageViewLegacy.r(135, 100);
        }
        fixedSizeFrescoImageViewLegacy.setIgnoreTrafficSaverPredicate(new z24(0, new ftj0(0, this, gtj0.class, "isAdvertisement", "isAdvertisement()Z", 0), mcy.class, "get", "get()Ljava/lang/Object;", 0, 5));
        int i2 = dek0.a;
        dek0.b(fixedSizeFrescoImageViewLegacy, null, null, 14);
        fixedSizeFrescoImageViewLegacy.setLocalImage((fxj0) null);
        fixedSizeFrescoImageViewLegacy.setRemoteImage((List<? extends fxj0>) arrayList2);
    }

    @Override // xsna.blc0
    public final void Z1(x64 x64Var) {
        this.F = x64Var;
    }

    @Override // xsna.blc0
    public final void p5() {
    }

    @Override // xsna.blc0
    public final void j1(View.OnClickListener onClickListener) {
    }
}
