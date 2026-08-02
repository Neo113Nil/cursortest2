package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.io.File;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import xsna.d6s;
import xsna.p5s;

/* compiled from: TypefaceCompatBaseImpl.java */
/* loaded from: classes.dex */
public class hup0 {

    /* compiled from: TypefaceCompatBaseImpl.java */
    /* loaded from: classes11.dex */
    public final class a {
        public final int a(Object obj) {
            return ((d6s.b) obj).c;
        }

        public final boolean b(Object obj) {
            return ((d6s.b) obj).d;
        }
    }

    public hup0() {
        new ConcurrentHashMap();
    }

    public Typeface a(Context context, p5s.b bVar, Resources resources, int i) {
        throw null;
    }

    public Typeface b(Context context, d6s.b[] bVarArr, int i) {
        throw null;
    }

    public Typeface c(int i, Context context, List list) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface d(Context context, Resources resources, int i, String str, int i2) {
        File c = iup0.c(context);
        if (c == null) {
            return null;
        }
        try {
            if (iup0.a(c, resources, i)) {
                return Typeface.createFromFile(c.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            c.delete();
        }
    }
}
