package defpackage;

import android.content.Context;
import com.ybsdk.core.utils.ColorModel;

/* loaded from: classes3.dex */
public final class c8u0 {
    public final z1x0 a = new z1x0(new ColorModel.Attr(ung0.ybColor_internal_transparent), null);
    public final ColorModel.Attr b;
    public final ColorModel.Attr c;
    public final ColorModel.Attr d;
    public final ColorModel.Attr e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;

    public c8u0(Context context) {
        ColorModel.Attr attr = new ColorModel.Attr(ung0.ybColor_product_payBlack);
        this.b = attr;
        this.c = new ColorModel.Attr(ung0.ybColor_textIcon_secondaryStaticInverted);
        ColorModel.Attr attr2 = new ColorModel.Attr(ung0.ybColor_textIcon_primary);
        this.d = attr2;
        ColorModel.Attr attr3 = new ColorModel.Attr(ung0.ybColor_textIcon_primaryStaticInverted);
        this.e = attr3;
        this.f = new ColorModel.Attr(ung0.ybColor_background_primary).get(context);
        this.g = new ColorModel.Attr(ung0.ybColor_internal_transparent).get(context);
        this.h = attr.get(context);
        this.i = attr3.get(context);
        this.j = attr2.get(context);
        this.k = attr3.get(context);
    }

    public final ColorModel.Attr a() {
        return this.d;
    }

    public final ColorModel.Attr b() {
        return this.e;
    }

    public final ColorModel.Attr c() {
        return this.b;
    }

    public final ColorModel.Attr d() {
        return this.c;
    }

    public final z1x0 e() {
        return this.a;
    }
}
