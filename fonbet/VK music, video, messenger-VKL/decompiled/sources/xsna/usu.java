package xsna;

import android.graphics.Bitmap;
import java.util.LinkedHashMap;
import xsna.sg90;

/* compiled from: HalfTileBackgroundPostprocessor.kt */
/* loaded from: classes6.dex */
public final class usu extends mk6 {
    public static final LinkedHashMap f = new LinkedHashMap();
    public String c;
    public int d;
    public int e;

    @Override // xsna.mk6, xsna.ktc0
    public final ww8 a() {
        return new ppj0("HalfTileBackgroundIconTransform " + this.d + ' ' + this.e + ' ' + this.c);
    }

    @Override // xsna.mk6
    public final void d(Bitmap bitmap) {
        String str = this.c;
        LinkedHashMap linkedHashMap = f;
        if (linkedHashMap.get(str) != null) {
            return;
        }
        sg90.d dVar = new sg90.b(bitmap).b().e;
        linkedHashMap.put(str, Boolean.valueOf(n8g.f(dVar != null ? dVar.d : 0) <= 0.5d));
    }

    @Override // xsna.mk6, xsna.ktc0
    public final String getName() {
        return "HalfTileBackgroundIconTransform";
    }
}
