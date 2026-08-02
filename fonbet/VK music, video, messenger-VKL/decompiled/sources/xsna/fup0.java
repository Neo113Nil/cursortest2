package xsna;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.List;
import xsna.d6s;
import xsna.p5s;

/* compiled from: TypefaceCompatApi29Impl.java */
/* loaded from: classes.dex */
public class fup0 extends hup0 {
    public static Font e(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int h = h(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int h2 = h(fontStyle, font2.getStyle());
            if (h2 < h) {
                font = font2;
                h = h2;
            }
        }
        return font;
    }

    public static int h(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // xsna.hup0
    public final Typeface a(Context context, p5s.b bVar, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (p5s.c cVar : bVar.a()) {
                try {
                    Font build = new Font.Builder(resources, cVar.a()).setWeight(cVar.d()).setSlant(cVar.e() ? 1 : 0).setTtcIndex(cVar.b()).setFontVariationSettings(cVar.c()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(e(build2, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // xsna.hup0
    public final Typeface b(Context context, d6s.b[] bVarArr, int i) {
        try {
            FontFamily f = f(bVarArr, context.getContentResolver());
            if (f == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(f).setStyle(e(f, i).getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // xsna.hup0
    public final Typeface c(int i, Context context, List list) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily f = f((d6s.b[]) list.get(0), contentResolver);
            if (f == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(f);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily f2 = f((d6s.b[]) list.get(i2), contentResolver);
                if (f2 != null) {
                    customFallbackBuilder.addCustomFallback(f2);
                }
            }
            return customFallbackBuilder.setStyle(e(f, i).getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // xsna.hup0
    public final Typeface d(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    public final FontFamily f(d6s.b[] bVarArr, ContentResolver contentResolver) {
        Font font;
        ParcelFileDescriptor openFileDescriptor;
        FontFamily.Builder builder = null;
        for (d6s.b bVar : bVarArr) {
            if (bVar.g()) {
                font = g(bVar);
            } else {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(bVar.c(), "r", null);
                } catch (IOException unused) {
                }
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    font = null;
                } else {
                    try {
                        Font.Builder ttcIndex = new Font.Builder(openFileDescriptor).setWeight(bVar.e()).setSlant(bVar.f() ? 1 : 0).setTtcIndex(bVar.b());
                        if (!TextUtils.isEmpty(bVar.d())) {
                            ttcIndex.setFontVariationSettings(bVar.d());
                        }
                        font = ttcIndex.build();
                        openFileDescriptor.close();
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }
            if (font != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(font);
                } else {
                    builder.addFont(font);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public Font g(d6s.b bVar) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }
}
