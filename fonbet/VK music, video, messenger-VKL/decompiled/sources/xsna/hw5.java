package xsna;

import android.graphics.Bitmap;
import java.util.ArrayList;
import xsna.sg90;

/* compiled from: BackgroundDominantColorResolver.kt */
/* loaded from: classes16.dex */
public final class hw5 {
    /* JADX WARN: Multi-variable type inference failed */
    public static int a(Bitmap bitmap) {
        sg90.b bVar = new sg90.b(bitmap);
        ArrayList arrayList = bVar.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        v3o0 v3o0Var = v3o0.e;
        bVar.a(v3o0Var);
        bVar.d = 256;
        bVar.e = -1;
        sg90 b = bVar.b();
        sg90.d dVar = (sg90.d) b.c.get(v3o0Var);
        Integer valueOf = (dVar == null && (dVar = b.e) == null) ? null : Integer.valueOf(dVar.d);
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return -1;
    }
}
