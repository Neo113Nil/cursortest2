package xsna;

import android.graphics.RectF;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.im.Image;
import com.vk.dto.photo.Photo;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class o520 implements izs {
    public final /* synthetic */ Photo b;
    public final /* synthetic */ ImageSize c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ RectF e;

    public /* synthetic */ o520(Photo photo, ImageSize imageSize, boolean z, RectF rectF) {
        this.b = photo;
        this.c = imageSize;
        this.d = z;
        this.e = rectF;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String Cb = this.b.Cb();
        bha0 bha0Var = new bha0("photos.setPhotoAsOwnerPhoto");
        RectF rectF = this.e;
        float f = rectF.left;
        Image image = this.c.d;
        float f2 = image.b;
        int i = (int) (f * f2);
        float f3 = rectF.top;
        float f4 = image.c;
        int i2 = (int) ((rectF.right - f) * f2);
        int i3 = (int) ((rectF.bottom - f3) * f4);
        bha0Var.K("photo", Cb);
        bha0Var.R("skip_post", !this.d);
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(',');
        sb.append((int) (f3 * f4));
        sb.append(',');
        sb.append(i2);
        sb.append(',');
        sb.append(i3);
        bha0Var.K("full_crop", sb.toString());
        bha0Var.C(0, "rotate");
        return rsg0.w0(bha0Var);
    }
}
