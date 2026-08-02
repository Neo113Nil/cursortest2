package xsna;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import xsna.d6s;

/* compiled from: TypefaceCompatApi31Impl.java */
/* loaded from: classes.dex */
public final class gup0 extends fup0 {
    @Override // xsna.fup0
    public final Font g(d6s.b bVar) {
        Font d;
        String a = bVar.a();
        if (a != null) {
            Typeface create = Typeface.create(a, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create == null || create.equals(create2)) {
                create = null;
            }
            if (create != null && (d = aup0.d(create)) != null) {
                if (TextUtils.isEmpty(bVar.d())) {
                    return d;
                }
                try {
                    return new Font.Builder(d).setFontVariationSettings(bVar.d()).build();
                } catch (IOException unused) {
                    Log.e("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
                    return null;
                }
            }
        }
        return null;
    }
}
