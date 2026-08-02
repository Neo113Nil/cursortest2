package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import com.yandex.images.ImageManager$From;
import com.yandex.images.b;
import java.io.IOException;
import java.util.List;

/* loaded from: classes15.dex */
public final class bbv extends t150 {
    public final /* synthetic */ v06 c;
    public final /* synthetic */ List w;
    public final /* synthetic */ Uri x;
    public final /* synthetic */ ImageManager$From y;
    public final /* synthetic */ b z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbv(b bVar, v06 v06Var, List list, Uri uri, ImageManager$From imageManager$From) {
        super(0, "ImageManager-complete");
        this.c = v06Var;
        this.w = list;
        this.x = uri;
        this.y = imageManager$From;
        this.z = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
    @Override // defpackage.t150
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        Bitmap bitmap;
        v06 v06Var = this.c;
        ht10 ht10Var = v06Var.z;
        if (ht10Var != null) {
            bitmap = (Bitmap) ht10Var.b;
            if (bitmap == null) {
                try {
                    byte[] bArr = (byte[]) ht10Var.c;
                    xn50 xn50Var = v06Var.c;
                    bitmap = xn50Var.g ? d5b1.f(xn50Var.i, xn50Var.j, bArr) : d5b1.g(bArr, null);
                } catch (IOException e) {
                    v06Var.G = mav.a(e);
                    ydz.c("[Y:BitmapHunter]", "Bitmap file wasn't decoded", e);
                    z83.j("Bitmap file wasn't decoded");
                }
            }
            ht10 ht10Var2 = v06Var.z;
            this.z.a.post(new ue5(bitmap, this.w, v06Var, ht10Var2 != null ? (byte[]) ht10Var2.c : null, this.x, this.y));
        }
        bitmap = null;
        ht10 ht10Var22 = v06Var.z;
        this.z.a.post(new ue5(bitmap, this.w, v06Var, ht10Var22 != null ? (byte[]) ht10Var22.c : null, this.x, this.y));
    }
}
