package xsna;

import android.content.Context;
import android.net.Uri;
import com.ironsource.X3;
import java.io.File;

/* compiled from: CompressPhpPhoto.kt */
/* loaded from: classes6.dex */
public final class cwi extends bwi {
    public final Context h;

    public cwi(Context context) {
        super(context, false);
        this.h = context;
    }

    @Override // xsna.bwi
    public final void b(Uri uri, File file) {
        String scheme;
        nco ncoVar = new nco(86);
        if (!oeq0.e(uri) && ((scheme = uri.getScheme()) == null || scheme.length() == 0)) {
            uri = uri.buildUpon().scheme(X3.i.b).build();
        }
        ncoVar.a(this.h, uri, file, null);
    }
}
