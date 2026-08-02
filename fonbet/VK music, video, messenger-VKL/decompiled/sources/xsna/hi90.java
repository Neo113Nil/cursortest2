package xsna;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.resource.bitmap.b;
import com.huawei.hms.android.SystemUtils;
import java.io.IOException;

/* compiled from: ParcelFileDescriptorBitmapDecoder.java */
/* loaded from: classes12.dex */
public final class hi90 implements mag0<ParcelFileDescriptor, Bitmap> {
    public final com.bumptech.glide.load.resource.bitmap.a a;

    public hi90(com.bumptech.glide.load.resource.bitmap.a aVar) {
        this.a = aVar;
    }

    @Override // xsna.mag0
    @Nullable
    public final hag0<Bitmap> a(@NonNull ParcelFileDescriptor parcelFileDescriptor, int i, int i2, @NonNull au80 au80Var) throws IOException {
        com.bumptech.glide.load.resource.bitmap.a aVar = this.a;
        return aVar.a(new b.c(parcelFileDescriptor, aVar.d, aVar.c), i, i2, au80Var, com.bumptech.glide.load.resource.bitmap.a.k);
    }

    @Override // xsna.mag0
    public final boolean b(@NonNull ParcelFileDescriptor parcelFileDescriptor, @NonNull au80 au80Var) throws IOException {
        ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptor;
        String str = Build.MANUFACTURER;
        return (!(SystemUtils.PRODUCT_HUAWEI.equalsIgnoreCase(str) || SystemUtils.PRODUCT_HONOR.equalsIgnoreCase(str)) || parcelFileDescriptor2.getStatSize() <= 536870912) && !"robolectric".equals(Build.FINGERPRINT);
    }
}
