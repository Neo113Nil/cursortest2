package defpackage;

import android.content.Context;
import android.graphics.Paint;
import com.yandex.go.places.map.ui.configs.PlacesPinLabelBitmapCreator$LabelTypeface;
import com.yandex.go.places.map.ui.configs.PlacesPinLabelBitmapCreator$TextAlignment;
import kotlin.Pair;
import kotlin.a;

/* loaded from: classes13.dex */
public final class e8c {
    public static final Paint f = new Paint(3);
    public final Context a;
    public final i3y b = a.a(new l7b(19, this));
    public final int c;
    public final int d;
    public final int e;

    public e8c(Context context) {
        this.a = context;
        this.c = tje.r(eug0.cluster_label_top_gap, context);
        this.d = context.getResources().getDimensionPixelSize(eug0.cluster_center_card_drop);
        this.e = context.getResources().getDimensionPixelSize(eug0.cluster_collision_padding);
    }

    public static Pair b(int i, int i2) {
        double radians = Math.toRadians(5.0d);
        double abs = Math.abs(Math.sin(radians));
        double abs2 = Math.abs(Math.cos(radians));
        double d = i;
        double d2 = i2;
        double a = vfc.a(d2, abs, d * abs2, 2.0d);
        double a2 = vfc.a(d2, abs2, d * abs, 2.0d);
        int ceil = (int) Math.ceil(a - (d / 2.0d));
        if (ceil < 0) {
            ceil = 0;
        }
        int ceil2 = (int) Math.ceil(a2 - (d2 / 2.0d));
        return new Pair(Integer.valueOf(ceil), Integer.valueOf(ceil2 >= 0 ? ceil2 : 0));
    }

    public final wcc0 a(CharSequence charSequence, String str) {
        if ((charSequence == null || evu0.J(charSequence)) && (str == null || evu0.J(str))) {
            return null;
        }
        ddc0 ddc0Var = (ddc0) this.b.getValue();
        PlacesPinLabelBitmapCreator$TextAlignment placesPinLabelBitmapCreator$TextAlignment = PlacesPinLabelBitmapCreator$TextAlignment.CENTER;
        xcc0 xcc0Var = new xcc0(0, 0, 0, 0);
        PlacesPinLabelBitmapCreator$LabelTypeface placesPinLabelBitmapCreator$LabelTypeface = PlacesPinLabelBitmapCreator$LabelTypeface.DisplayCondBold;
        int i = eug0.cluster_pin_label_title_size;
        PlacesPinLabelBitmapCreator$LabelTypeface placesPinLabelBitmapCreator$LabelTypeface2 = PlacesPinLabelBitmapCreator$LabelTypeface.TextMedium;
        return ddc0.d(ddc0Var, charSequence, str, placesPinLabelBitmapCreator$TextAlignment, ycc0.a, xcc0Var, 0, i, eug0.cluster_pin_label_subtitle_size, placesPinLabelBitmapCreator$LabelTypeface, placesPinLabelBitmapCreator$LabelTypeface2, xng0.textMinor, null, 0, 6176);
    }
}
