package xsna;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.graphics.BlendModeCompat;
import com.vk.superapp.ui.widgets.tile.TileBackgroundImage;
import com.vk.superapp.ui.widgets.tile.TileImageSubIcon;
import com.vk.superapp.ui.widgets.tile.TileImageSubIconType;
import com.vk.superapp.ui.widgets.tile.TileStyle;

/* compiled from: TileWidgetSubIconDelegate.kt */
/* loaded from: classes6.dex */
public final class kto0 {

    /* compiled from: TileWidgetSubIconDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TileImageSubIconType.values().length];
            try {
                iArr[TileImageSubIconType.VERIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TileImageSubIconType.TEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static void a(TileBackgroundImage tileBackgroundImage, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, gzs gzsVar) {
        TileStyle tileStyle = tileBackgroundImage != null ? tileBackgroundImage.c : null;
        TileImageSubIcon tileImageSubIcon = tileBackgroundImage != null ? tileBackgroundImage.d : null;
        if (tileImageSubIcon == null) {
            f4m.j(appCompatTextView);
            bwt0.p0(appCompatImageView, tileStyle != null ? tileStyle.c : false);
            appCompatImageView.setBackground((Drawable) gzsVar.invoke());
            return;
        }
        int i = a.$EnumSwitchMapping$0[tileImageSubIcon.b.ordinal()];
        if (i == 1) {
            appCompatImageView.setBackground((Drawable) gzsVar.invoke());
            appCompatImageView.setVisibility(0);
            f4m.j(appCompatTextView);
            return;
        }
        if (i != 2) {
            f4m.j(appCompatImageView);
            f4m.j(appCompatTextView);
            return;
        }
        f4m.j(appCompatImageView);
        String str = tileImageSubIcon.d;
        String str2 = tileImageSubIcon.e;
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            f4m.j(appCompatTextView);
            return;
        }
        appCompatTextView.setText(str);
        appCompatTextView.getBackground().setColorFilter(pe7.a(Color.parseColor(str2), BlendModeCompat.SRC_ATOP));
        appCompatTextView.setVisibility(0);
    }
}
