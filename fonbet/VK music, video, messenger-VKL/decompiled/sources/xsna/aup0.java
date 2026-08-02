package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.ArrayList;
import xsna.d6s;
import xsna.dbg0;
import xsna.p5s;

/* compiled from: TypefaceCompat.java */
/* loaded from: classes.dex */
public final class aup0 {
    public static final hup0 a;
    public static final m900<String, Typeface> b;
    public static Paint c;

    /* compiled from: TypefaceCompat.java */
    /* loaded from: classes11.dex */
    public static class a extends d6s.c {
        public final dbg0.c a;

        public a(dbg0.c cVar) {
            this.a = cVar;
        }
    }

    static {
        Trace.beginSection(ndp0.f("TypefaceCompat static init"));
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            a = new gup0();
        } else if (i >= 29) {
            a = new fup0();
        } else {
            a = new eup0();
        }
        b = new m900<>(16);
        c = null;
        Trace.endSection();
    }

    public static Typeface a(Context context, p5s.a aVar, Resources resources, int i, String str, int i2, int i3, dbg0.c cVar, boolean z) {
        Typeface a2;
        Typeface build;
        Font.Builder fontVariationSettings;
        Font build2;
        FontFamily build3;
        boolean z2 = aVar instanceof p5s.d;
        m900<String, Typeface> m900Var = b;
        if (z2) {
            p5s.d dVar = (p5s.d) aVar;
            String c2 = dVar.c();
            if (TextUtils.isEmpty(c2) || (build = c(c2)) == null) {
                ArrayList arrayList = (ArrayList) dVar.b();
                if (arrayList.size() == 1) {
                    build = c(((j5s) arrayList.get(0)).a());
                } else {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i4 = 0;
                        while (true) {
                            if (i4 >= arrayList.size()) {
                                int i5 = 0;
                                Typeface.CustomFallbackBuilder customFallbackBuilder = null;
                                while (true) {
                                    if (i5 >= arrayList.size()) {
                                        break;
                                    }
                                    j5s j5sVar = (j5s) arrayList.get(i5);
                                    if (i5 == arrayList.size() - 1 && TextUtils.isEmpty(j5sVar.b())) {
                                        customFallbackBuilder.setSystemFallback(j5sVar.a());
                                        break;
                                    }
                                    Font d = d(c(j5sVar.a()));
                                    if (d == null) {
                                        break;
                                    }
                                    if (TextUtils.isEmpty(j5sVar.b())) {
                                        build3 = qy2.b(d).build();
                                    } else {
                                        try {
                                            ca0.c();
                                            da0.d();
                                            fontVariationSettings = sl4.a(d).setFontVariationSettings(j5sVar.b());
                                            build2 = fontVariationSettings.build();
                                            build3 = qy2.b(build2).build();
                                        } catch (IOException unused) {
                                            Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                        }
                                    }
                                    if (customFallbackBuilder == null) {
                                        customFallbackBuilder = ba0.c(build3);
                                    } else {
                                        customFallbackBuilder.addCustomFallback(build3);
                                    }
                                    i5++;
                                }
                                build = customFallbackBuilder.build();
                            } else {
                                if (c(((j5s) arrayList.get(i4)).a()) == null) {
                                    break;
                                }
                                i4++;
                            }
                        }
                    }
                    build = null;
                }
            }
            if (build != null) {
                if (cVar != null) {
                    new Handler(Looper.getMainLooper()).post(new ebg0(cVar, build));
                }
                m900Var.put(b(resources, i, str, i2, i3), build);
                return build;
            }
            a2 = d6s.a(context, dVar.b(), i3, !z ? cVar != null : dVar.a() != 0, z ? dVar.d() : -1, new Handler(Looper.getMainLooper()), new a(cVar));
        } else {
            a2 = a.a(context, (p5s.b) aVar, resources, i3);
            if (cVar != null) {
                if (a2 != null) {
                    new Handler(Looper.getMainLooper()).post(new ebg0(cVar, a2));
                } else {
                    cVar.a(-3);
                }
            }
        }
        if (a2 != null) {
            m900Var.put(b(resources, i, str, i2, i3), a2);
        }
        return a2;
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    public static Typeface c(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface create = Typeface.create(str, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create != null && !create.equals(create2)) {
                return create;
            }
        }
        return null;
    }

    public static Font d(Typeface typeface) {
        PositionedGlyphs shapeTextRun;
        int glyphCount;
        Font font;
        if (c == null) {
            c = new Paint();
        }
        c.setTextSize(10.0f);
        c.setTypeface(typeface);
        shapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, c);
        glyphCount = shapeTextRun.glyphCount();
        if (glyphCount == 0) {
            return null;
        }
        font = shapeTextRun.getFont(0);
        return font;
    }
}
