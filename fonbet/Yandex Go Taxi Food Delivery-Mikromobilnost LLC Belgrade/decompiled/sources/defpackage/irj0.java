package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.yandex.div.core.images.BitmapSource;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes.dex */
public final class irj0 extends h7 {
    public static final Map c = b.i(new Pair("Icon_24_ArrowLeft", Integer.valueOf(dzg0.ic_arrow_left)), new Pair("Icon_24_CrossOutline", Integer.valueOf(dzg0.ic_cross_close)), new Pair("Icon_24_ChevronRight", Integer.valueOf(f1h0.ic_chevron_right_24)), new Pair("Icon_16_ChevronRightFill", Integer.valueOf(f1h0.ic_chevron_right_fill_s)), new Pair("Icon_16_YandexPlusFill", Integer.valueOf(n0h0.ic_plus_glyph_badge_small)), new Pair("Icon_24_Verified", Integer.valueOf(f1h0.ic_verified_always_blue_24)), new Pair("superapp_favorites_error_icon", Integer.valueOf(g2h0.error_placeholder_icon)));
    public final Context b;

    public irj0(Context context) {
        super("load_by_res");
        this.b = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    @Override // defpackage.h7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hgv b(Uri uri) {
        uhk uhkVar;
        ngd0 ngd0Var = ngd0.A;
        String queryParameter = uri.getQueryParameter("res");
        if (queryParameter == null || evu0.J(queryParameter)) {
            hst hstVar = jst.e;
            uri.toString();
            hstVar.getClass();
            return ngd0Var;
        }
        Integer num = (Integer) c.get(queryParameter);
        if (num != null) {
            Drawable c0 = tje.c0(num.intValue(), this.b);
            if (c0 != null) {
                uhkVar = new uhk(c0, BitmapSource.DISK);
                if (uhkVar == null) {
                    return new ggv(uhkVar);
                }
                hst hstVar2 = jst.e;
                uri.toString();
                hstVar2.getClass();
                return ngd0Var;
            }
        }
        uhkVar = null;
        if (uhkVar == null) {
        }
    }
}
