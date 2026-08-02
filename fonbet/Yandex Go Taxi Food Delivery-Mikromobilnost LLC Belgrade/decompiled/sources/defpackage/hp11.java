package defpackage;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;

/* loaded from: classes.dex */
public class hp11 extends gp11 {
    @Override // defpackage.gp11
    public final Font d(ozr ozrVar) {
        Font f;
        String a = ozrVar.a();
        if (a != null) {
            Typeface create = Typeface.create(a, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create == null || create.equals(create2)) {
                create = null;
            }
            if (create != null && (f = ep11.f(create)) != null) {
                if (TextUtils.isEmpty(ozrVar.d())) {
                    return f;
                }
                try {
                    return new Font.Builder(f).setFontVariationSettings(ozrVar.d()).build();
                } catch (IOException unused) {
                    Log.e("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
                    return null;
                }
            }
        }
        return null;
    }
}
