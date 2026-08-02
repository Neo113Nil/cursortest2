package xsna;

import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import com.vk.dto.common.ImageSize;
import com.vk.newsfeed.common.recycler.holders.zhukov.CropableImageContainer;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.List;
import xsna.qik;

/* compiled from: BlurredImagePostingHolderStrategyNew.kt */
/* loaded from: classes4.dex */
public final class oh7 implements nh7 {
    public final mh7 a;
    public final CropableImageContainer b;
    public final qik c;
    public final io.reactivex.rxjava3.disposables.b d;
    public boolean e;

    public oh7(qik.a aVar, mh7 mh7Var, View view) {
        this.a = mh7Var;
        CropableImageContainer cropableImageContainer = (CropableImageContainer) view.findViewById(R.id.cropContainer);
        this.b = cropableImageContainer;
        qik imageLayer = cropableImageContainer.getImageLayer();
        this.c = imageLayer;
        this.d = new io.reactivex.rxjava3.disposables.b();
        if (aVar != null) {
            imageLayer.setCallback(aVar);
        }
        imageLayer.setOnDetachListener(new j1(this, 12));
    }

    @Override // xsna.nh7
    public final void a(PhotoAttachment photoAttachment) {
        this.c.setPhotoAttachment(photoAttachment);
    }

    @Override // xsna.nh7
    public final void b(ImageSize imageSize) {
        d(Uri.parse(imageSize.d.d), new l00(this, 7));
    }

    @Override // xsna.nh7
    public final void c(List<ImageSize> list) {
        this.a.Y2(true);
        ImageSize imageSize = (ImageSize) ixj0.b(list);
        if (imageSize != null) {
            d(Uri.parse(imageSize.d.d), new k00(this, 9));
        }
    }

    public final void d(Uri uri, izs<? super Bitmap, s3q0> izsVar) {
        io.reactivex.rxjava3.core.q<Bitmap> h = mcr0.h(uri);
        asu0 asu0Var = asu0.a;
        this.d.b(h.r0(asu0Var.c()).a0(asu0Var.d()).subscribe(new defpackage.i0(new ih4(izsVar, 1), 7), new cp0(new dj1(2), 6)));
    }

    @Override // xsna.nh7
    public final void init() {
    }
}
