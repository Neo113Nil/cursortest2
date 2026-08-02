package defpackage;

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
import java.io.IOException;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.LicenseUtility;

/* loaded from: classes.dex */
public abstract class ep11 {
    public static final gp11 a;
    public static final mzz b;
    public static Paint c;

    static {
        Trace.beginSection(ffx.f0("TypefaceCompat static init"));
        if (Build.VERSION.SDK_INT >= 31) {
            a = new hp11();
        } else {
            a = new gp11();
        }
        b = new mzz(16);
        c = null;
        Trace.endSection();
    }

    public static Typeface a(Context context, ozr[] ozrVarArr, int i) {
        Trace.beginSection(ffx.f0("TypefaceCompat.createFromFontInfo"));
        try {
            gp11 gp11Var = a;
            gp11Var.getClass();
            Typeface typeface = null;
            try {
                FontFamily c2 = gp11Var.c(ozrVarArr, context.getContentResolver());
                if (c2 != null) {
                    typeface = new Typeface.CustomFallbackBuilder(c2).setStyle(gp11.b(c2, i).getStyle()).build();
                }
            } catch (Exception unused) {
            }
            return typeface;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface b(Context context, yyr yyrVar, Resources resources, int i, String str, int i2, int i3, vuj0 vuj0Var, boolean z) {
        Typeface typeface;
        FontFamily.Builder builder;
        FontFamily build;
        Typeface e;
        boolean z2 = yyrVar instanceof bzr;
        int i4 = 19;
        mzz mzzVar = b;
        Typeface typeface2 = null;
        if (z2) {
            bzr bzrVar = (bzr) yyrVar;
            ArrayList arrayList = bzrVar.a;
            String str2 = bzrVar.d;
            if (!TextUtils.isEmpty(str2) && (e = e(str2)) != null) {
                typeface2 = e;
            } else if (arrayList.size() == 1) {
                typeface2 = e(((pyr) arrayList.get(0)).f);
            } else if (Build.VERSION.SDK_INT >= 31) {
                int i5 = 0;
                while (true) {
                    if (i5 >= arrayList.size()) {
                        Typeface.CustomFallbackBuilder customFallbackBuilder = null;
                        int i6 = 0;
                        while (true) {
                            if (i6 >= arrayList.size()) {
                                break;
                            }
                            pyr pyrVar = (pyr) arrayList.get(i6);
                            if (i6 == arrayList.size() - 1 && TextUtils.isEmpty(pyrVar.g)) {
                                customFallbackBuilder.setSystemFallback(pyrVar.f);
                                break;
                            }
                            String str3 = pyrVar.f;
                            String str4 = pyrVar.g;
                            Font f = f(e(str3));
                            if (f == null) {
                                break;
                            }
                            if (TextUtils.isEmpty(str4)) {
                                try {
                                    smw0.q();
                                    build = new FontFamily.Builder(gzc0.h(f).setFontVariationSettings(str4).build()).build();
                                } catch (IOException unused) {
                                    Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                }
                            } else {
                                build = new FontFamily.Builder(f).build();
                            }
                            if (customFallbackBuilder == null) {
                                customFallbackBuilder = new Typeface.CustomFallbackBuilder(build);
                            } else {
                                customFallbackBuilder.addCustomFallback(build);
                            }
                            i6++;
                        }
                        typeface2 = customFallbackBuilder.build();
                    } else {
                        if (e(((pyr) arrayList.get(i5)).f) == null) {
                            break;
                        }
                        i5++;
                    }
                }
            }
            if (typeface2 != null) {
                if (vuj0Var != null) {
                    new Handler(Looper.getMainLooper()).post(new xmf0(i4, vuj0Var, typeface2));
                }
                mzzVar.d(d(resources, i, str, i2, i3), typeface2);
                return typeface2;
            }
            typeface = ysa1.d(context, arrayList, i3, !z ? vuj0Var != null : bzrVar.c != 0, z ? bzrVar.b : -1, new Handler(Looper.getMainLooper()), new dp11(vuj0Var));
        } else {
            zyr zyrVar = (zyr) yyrVar;
            a.getClass();
            try {
                builder = null;
                for (azr azrVar : zyrVar.a) {
                    try {
                        Font build2 = new Font.Builder(resources, azrVar.e).setWeight(azrVar.a).setSlant(azrVar.b ? 1 : 0).setTtcIndex(azrVar.d).setFontVariationSettings(azrVar.c).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build2);
                        } else {
                            builder.addFont(build2);
                        }
                    } catch (IOException unused2) {
                    }
                }
            } catch (Exception unused3) {
            }
            if (builder != null) {
                FontFamily build3 = builder.build();
                try {
                    typeface2 = new Typeface.CustomFallbackBuilder(build3).setStyle(gp11.b(build3, i3).getStyle()).build();
                } catch (Exception unused4) {
                }
                if (vuj0Var != null) {
                    if (typeface2 != null) {
                        new Handler(Looper.getMainLooper()).post(new xmf0(i4, vuj0Var, typeface2));
                    } else {
                        vuj0Var.a(-3);
                    }
                }
                typeface = typeface2;
            }
            if (vuj0Var != null) {
            }
            typeface = typeface2;
        }
        if (typeface != null) {
            mzzVar.d(d(resources, i, str, i2, i3), typeface);
        }
        return typeface;
    }

    public static Typeface c(Resources resources, int i, String str, int i2, int i3) {
        Typeface typeface;
        a.getClass();
        try {
            Font build = new Font.Builder(resources, i).build();
            typeface = new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            typeface = null;
        }
        if (typeface != null) {
            b.d(d(resources, i, str, i2, i3), typeface);
        }
        return typeface;
    }

    public static String d(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + LicenseUtility.SEPARATOR + str + LicenseUtility.SEPARATOR + i2 + LicenseUtility.SEPARATOR + i + LicenseUtility.SEPARATOR + i3;
    }

    public static Typeface e(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface create = Typeface.create(str, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create != null && !create.equals(create2)) {
                return create;
            }
        }
        return null;
    }

    public static Font f(Typeface typeface) {
        PositionedGlyphs shapeTextRun;
        int glyphCount;
        Font font;
        if (c == null) {
            c = new Paint();
        }
        c.setTextSize(10.0f);
        c.setTypeface(typeface);
        shapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, c);
        glyphCount = shapeTextRun.glyphCount();
        if (glyphCount == 0) {
            return null;
        }
        font = shapeTextRun.getFont(0);
        return font;
    }
}
