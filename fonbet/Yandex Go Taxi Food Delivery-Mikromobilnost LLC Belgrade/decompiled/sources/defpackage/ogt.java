package defpackage;

import android.util.Log;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.io.File;
import java.io.IOException;

/* loaded from: classes10.dex */
public class ogt implements vtj0 {
    @Override // defpackage.vtj0
    public final EncodeStrategy c(mg70 mg70Var) {
        return EncodeStrategy.SOURCE;
    }

    @Override // defpackage.wyn
    public final boolean e(Object obj, File file, mg70 mg70Var) {
        try {
            g77.d(((GifDrawable) ((otj0) obj).get()).getBuffer(), file);
            return true;
        } catch (IOException unused) {
            Log.isLoggable("GifEncoder", 5);
            return false;
        }
    }
}
