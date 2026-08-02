package defpackage;

import android.content.Context;
import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import java.util.List;
import ru.CryptoPro.JCSP.Key.foreign.JCSP3DesKeyGenerator;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

/* loaded from: classes5.dex */
public final class bcu0 {
    public final Context a;
    public final int b;
    public final float c;
    public final float d;
    public final List e;

    public bcu0(Context context, int i, int i2) {
        this.a = context;
        this.b = i;
        String string = context.getResources().getString(nzh0.sticker_text_deliver);
        String string2 = context.getResources().getString(nzh0.sticker_text_products);
        String string3 = context.getResources().getString(nzh0.sticker_text_in_time);
        this.c = 3.0f;
        this.d = context.getResources().getDisplayMetrics().density;
        int i3 = xng0.textInvert;
        int i4 = nqg0.sticker_color_teal;
        tbu0 tbu0Var = new tbu0(0, 24, -65.0f, string, i3, false, i4, 25);
        int i5 = xng0.textMain;
        int i6 = nqg0.sticker_color_yellow;
        tbu0 tbu0Var2 = new tbu0(165, 0, -20.0f, string2, i5, true, i6, 27);
        int i7 = nqg0.sticker_color_pink;
        tbu0 tbu0Var3 = new tbu0(100, 48, 20.0f, string3, i3, false, i7, 19);
        int i8 = nqg0.sticker_color_violet;
        tbu0 tbu0Var4 = new tbu0(31, 82, -5.0f, string, i3, false, i8, 22);
        int i9 = nqg0.sticker_color_red;
        tbu0 tbu0Var5 = new tbu0(50, HProv.PP_CONTAINER_EXTENSION_DEL, 5.0f, string3, i3, true, i9, 17);
        tbu0 tbu0Var6 = new tbu0(SubsamplingScaleImageView.ORIENTATION_180, 104, 5.0f, string2, i3, false, i4, 25);
        tbu0 tbu0Var7 = new tbu0(HProv.PP_CACHE_SIZE, 195, -10.0f, string, i5, true, i6, 26);
        int i10 = nqg0.sticker_color_green_light;
        this.e = scc.g(tbu0Var, tbu0Var2, tbu0Var3, tbu0Var4, tbu0Var5, tbu0Var6, tbu0Var7, new tbu0(11, JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN, 8.0f, string2, i3, true, i10, 27), new tbu0(175, 214, 20.0f, string3, i3, true, i8, 23), new tbu0(29, MSException.ERROR_MORE_DATA, 0.0f, string3, i3, false, i4, 23), new tbu0(147, 274, 20.0f, string, i3, false, i7, 24), new tbu0(25, 288, -20.0f, string2, i3, true, i9, 27), new tbu0(111, 320, 45.0f, string3, i3, true, i10, 20));
    }

    public final float a(int i) {
        List list = this.e;
        List list2 = list;
        int i2 = 0;
        int i3 = ((tbu0) list.get(0)).b;
        for (Object obj : list2) {
            int i4 = i2 + 1;
            if (i2 < 0) {
                scc.m();
                throw null;
            }
            tbu0 tbu0Var = (tbu0) obj;
            if (i2 < i) {
                i3 = Math.max(i3, tbu0Var.b);
            }
            i2 = i4;
        }
        return b(i3 + 48.0f);
    }

    public final float b(float f) {
        float f2;
        float f3;
        float f4;
        float f5 = this.d;
        float f6 = f * f5;
        int i = this.a.getResources().getConfiguration().orientation;
        int i2 = this.b;
        if (i == 2) {
            f3 = i2;
            f2 = 360.0f * f5;
            if (f3 > f2) {
                f4 = 1.0f;
                return f6 * f4;
            }
        } else {
            f2 = 360.0f * f5;
            f3 = i2;
        }
        f4 = f3 / f2;
        return f6 * f4;
    }
}
