package xsna;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.vk.superapp.ui.uniwidgets.config.SuperappTextStylesBridge;
import com.vk.superapp.ui.uniwidgets.config.a;
import com.vk.typography.Font;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class dzg0 implements wzs {
    public final /* synthetic */ int b;

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 1:
                Context context = (Context) obj;
                int i = a.C1909a.$EnumSwitchMapping$0[((SuperappTextStylesBridge.FontWeight) obj2).ordinal()];
                if (i == 1) {
                    Typeface a = cqi.a(Font.Companion, FontFamily.LIGHT, 13.0f, context);
                    TextSizeUnit textSizeUnit = TextSizeUnit.SP;
                    return a;
                }
                if (i == 2) {
                    Typeface a2 = cqi.a(Font.Companion, FontFamily.REGULAR, 13.0f, context);
                    TextSizeUnit textSizeUnit2 = TextSizeUnit.SP;
                    return a2;
                }
                if (i == 3) {
                    Typeface a3 = cqi.a(Font.Companion, FontFamily.MEDIUM, 13.0f, context);
                    TextSizeUnit textSizeUnit3 = TextSizeUnit.SP;
                    return a3;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                Typeface a4 = cqi.a(Font.Companion, FontFamily.BOLD, 13.0f, context);
                TextSizeUnit textSizeUnit4 = TextSizeUnit.SP;
                return a4;
            default:
                return new AppCompatImageView((Context) obj, (AttributeSet) obj2);
        }
    }
}
