package xsna;

import android.widget.EditText;
import android.widget.TextView;
import com.vk.clips.sdk.shared.item.clip.subtitles.SdkSubtitlesConfigurationMode;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.core.preference.Preference;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.stickers.StickerStockItem;
import xsna.ei3;
import xsna.s1d;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class zh3 implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ zh3(int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ei3.a aVar = (ei3.a) obj2;
                return new ei3.a(aVar.b, ((Boolean) obj).booleanValue() || aVar.a, aVar.c);
            case 1:
                int i = s1d.v;
                return s1d.a.a((y0r) obj, (SdkSubtitlesConfigurationMode) obj2);
            case 2:
                EditText editText = (EditText) obj;
                String[] strArr = DebugDevSettingsFragment.t0;
                editText.setInputType(2);
                editText.setHint("0 - без ограничений");
                o2l.a.getClass();
                editText.setText(Integer.toString(Preference.j().getInt("__dbg_api_max_length", 0)));
                editText.addTextChangedListener(new x4l((TextView) obj2));
                return null;
            case 3:
                ((Integer) obj2).getClass();
                t8s.f(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 4:
                zk10 zk10Var = (zk10) obj;
                return ((Object) zk10Var.b().get(1)) + "\"" + ((String) obj2) + "\"" + ((Object) zk10Var.b().get(2));
            case 5:
                return ((kge0) obj2).a.d();
            case 6:
                return Integer.valueOf(((pdo0) obj2).a);
            case 7:
                ((Integer) obj2).getClass();
                soj0.b(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 8:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar2.K(1322744003);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1322744003, intValue, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:218)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.D0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2.j();
                return frv0Var;
            case 9:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken2 = VkTypographyToken.DisplayTitle1;
                aVar3.K(887876064);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(887876064, intValue2, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:199)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var2 = (wuv0) aVar3.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var2 = wuv0Var2.k0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar3.j();
                return frv0Var2;
            default:
                ysg0.b.a(new htm0((StickerStockItem) obj, (StickerStockItem) obj2));
                return s3q0.a;
        }
    }
}
