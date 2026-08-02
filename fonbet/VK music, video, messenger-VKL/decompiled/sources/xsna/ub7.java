package xsna;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import java.io.IOException;

/* compiled from: BitmapDrawableDecoder.java */
/* loaded from: classes12.dex */
public final class ub7<DataType> implements mag0<DataType, BitmapDrawable> {
    public final mag0<DataType, Bitmap> a;
    public final Resources b;

    public ub7(@NonNull Resources resources, @NonNull mag0<DataType, Bitmap> mag0Var) {
        this.b = resources;
        this.a = mag0Var;
    }

    @Override // xsna.mag0
    public final hag0<BitmapDrawable> a(@NonNull DataType datatype, int i, int i2, @NonNull au80 au80Var) throws IOException {
        hag0<Bitmap> a = this.a.a(datatype, i, i2, au80Var);
        if (a == null) {
            return null;
        }
        return new dqy(this.b, a);
    }

    @Override // xsna.mag0
    public final boolean b(@NonNull DataType datatype, @NonNull au80 au80Var) throws IOException {
        return this.a.b(datatype, au80Var);
    }
}
