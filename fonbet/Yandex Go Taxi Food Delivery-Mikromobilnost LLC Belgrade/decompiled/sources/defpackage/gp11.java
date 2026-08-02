package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class gp11 {
    public gp11() {
        new ConcurrentHashMap();
    }

    public static Font b(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : Constants.MINIMAL_ERROR_STATUS_CODE, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int e = e(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int e2 = e(fontStyle, font2.getStyle());
            if (e2 < e) {
                font = font2;
                e = e2;
            }
        }
        return font;
    }

    public static int e(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public final Typeface a(Context context, int i, List list) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily c = c((ozr[]) list.get(0), contentResolver);
            if (c == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(c);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily c2 = c((ozr[]) list.get(i2), contentResolver);
                if (c2 != null) {
                    customFallbackBuilder.addCustomFallback(c2);
                }
            }
            return customFallbackBuilder.setStyle(b(c, i).getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    public final FontFamily c(ozr[] ozrVarArr, ContentResolver contentResolver) {
        Font font;
        ParcelFileDescriptor openFileDescriptor;
        FontFamily.Builder builder = null;
        for (ozr ozrVar : ozrVarArr) {
            if (ozrVar.g()) {
                font = d(ozrVar);
            } else {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(ozrVar.c(), "r", null);
                } catch (IOException unused) {
                }
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    font = null;
                } else {
                    try {
                        Font.Builder ttcIndex = new Font.Builder(openFileDescriptor).setWeight(ozrVar.e()).setSlant(ozrVar.f() ? 1 : 0).setTtcIndex(ozrVar.b());
                        if (!TextUtils.isEmpty(ozrVar.d())) {
                            ttcIndex.setFontVariationSettings(ozrVar.d());
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

    public Font d(ozr ozrVar) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }
}
