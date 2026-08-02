package xsna;

import android.text.InputFilter;
import android.widget.EditText;
import com.vk.core.compose.generated.VkTypographyToken;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class th5 implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ th5(byte b, int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                wh5.c(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 1:
                return Boolean.valueOf(epx.f(((w5w0) obj).b(), ((w5w0) obj2).b()));
            case 2:
                long j = ((gno0) obj2).a;
                if (gno0.a(j, 8589934592L)) {
                    return 0;
                }
                if (gno0.a(j, 4294967296L)) {
                    return 1;
                }
                return Boolean.FALSE;
            case 3:
                EditText editText = (EditText) obj;
                editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(23)});
                editText.setLines(1);
                return s3q0.a;
            default:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar.K(1502277854);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1502277854, intValue, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:137)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.a;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
                return frv0Var;
        }
    }
}
