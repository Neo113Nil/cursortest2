package defpackage;

import android.graphics.Bitmap;
import com.yandex.images.ImageManager$From;
import com.yandex.images.b;
import java.io.File;

/* loaded from: classes15.dex */
public final class abv extends t150 {
    public final /* synthetic */ int c;
    public final /* synthetic */ String w;
    public final /* synthetic */ b x;
    public final /* synthetic */ Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ abv(b bVar, String str, Object obj, int i) {
        super(0, "store_image_on_disk");
        this.c = i;
        this.w = str;
        this.y = obj;
        this.x = bVar;
    }

    @Override // defpackage.t150
    public final void a() {
        File file;
        int i = this.c;
        Object obj = this.y;
        String str = this.w;
        b bVar = this.x;
        switch (i) {
            case 0:
                bVar.b.n((Bitmap) obj, false, str);
                break;
            default:
                w3i w3iVar = bVar.b;
                String str2 = (String) obj;
                w3iVar.getClass();
                z83.i();
                a2z f = w3iVar.f(str);
                ad7 ad7Var = null;
                if (f != null) {
                    ad7Var = new ad7(f.a, null, null, ImageManager$From.MEMORY);
                } else {
                    File file2 = (File) w3iVar.z;
                    if (file2 == null) {
                        file2 = w3iVar.i();
                    }
                    if (file2 == null) {
                        file = null;
                    } else {
                        z83.i();
                        file = new File(file2, str);
                    }
                    if (file != null) {
                        ad7Var = w3iVar.e(file, str);
                    }
                }
                if (ad7Var != null) {
                    w3iVar.n(ad7Var.a, false, str2);
                    break;
                } else {
                    ydz.b("[Y:ImageCache]", "There are no source image in cache - cannot copy");
                    break;
                }
        }
    }
}
