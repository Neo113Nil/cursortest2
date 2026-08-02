package defpackage;

import android.graphics.Bitmap;
import java.util.UUID;
import java.util.function.Supplier;

/* loaded from: classes6.dex */
public final class pxy extends qxy {
    public final String a;
    public volatile Bitmap b;
    public final /* synthetic */ Supplier c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pxy(Supplier supplier) {
        super(true);
        this.c = supplier;
        this.a = "loadable:" + UUID.randomUUID();
    }

    @Override // defpackage.qxy
    public final boolean a() {
        return this.b != null;
    }

    @Override // com.yandex.runtime.image.ImageProvider
    public final String getId() {
        return this.a;
    }

    @Override // com.yandex.runtime.image.ImageProvider
    public final Bitmap getImage() {
        Bitmap bitmap;
        Bitmap bitmap2 = this.b;
        if (bitmap2 != null) {
            return bitmap2;
        }
        String str = this.a;
        Supplier supplier = this.c;
        synchronized (str) {
            bitmap = this.b;
            if (bitmap == null) {
                Object obj = supplier.get();
                this.b = (Bitmap) obj;
                bitmap = (Bitmap) obj;
            }
        }
        return bitmap;
    }
}
