package xsna;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.io.IOException;

/* compiled from: GifFrameResourceDecoder.java */
/* loaded from: classes12.dex */
public final class lyt implements mag0<fyt, Bitmap> {
    public final tc7 a;

    public lyt(tc7 tc7Var) {
        this.a = tc7Var;
    }

    @Override // xsna.mag0
    public final hag0<Bitmap> a(@NonNull fyt fytVar, int i, int i2, @NonNull au80 au80Var) throws IOException {
        return wc7.c(fytVar.getNextFrame(), this.a);
    }

    @Override // xsna.mag0
    public final /* bridge */ /* synthetic */ boolean b(@NonNull fyt fytVar, @NonNull au80 au80Var) throws IOException {
        return true;
    }
}
