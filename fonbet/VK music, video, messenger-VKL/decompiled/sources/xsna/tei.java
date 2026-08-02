package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteStatement;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class tei implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ tei(int i) {
        this.b = i;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String O;
        switch (this.b) {
            case 0:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(264355168, intValue, -1, "com.vk.debug.design.ComposableSingletons$DebugFileManagerScreenKt.lambda$264355168.<anonymous> (DebugFileManagerScreen.kt:170)");
                    }
                    yqv0.c("Загрузка...", s200.D(q630.a.a, 16), 0L, null, null, 0, 0, null, 0, false, 0, 0, null, null, aVar, 54, 0, 16380);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                short shortValue = ((Short) obj).shortValue();
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= aVar2.m(shortValue) ? 4 : 2;
                }
                if (aVar2.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1758998806, intValue2, -1, "com.vk.music.design.compose.equalizer.ComposableSingletons$VkMusicEqualizerKt.lambda$-1758998806.<anonymous> (VkMusicEqualizer.kt:64)");
                    }
                    q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, 1, q630.a.a);
                    int i = intValue2 & 14;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(2142432847, i, -1, "com.vk.music.design.compose.equalizer.formatAsDb (VkMusicEqualizer.kt:129)");
                    }
                    if (shortValue > 0) {
                        aVar2.K(2003006678);
                        O = "+" + d370.O(R.string.equalizer_band_value_label_dB, new Object[]{Integer.valueOf(shortValue / 100)}, aVar2);
                        aVar2.j();
                    } else {
                        aVar2.K(2003104700);
                        O = d370.O(R.string.equalizer_band_value_label_dB, new Object[]{Integer.valueOf(shortValue / 100)}, aVar2);
                        aVar2.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j = ylu0Var.getText().a;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c(O, F, j, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.v0.b(aVar2), aVar2, 48, 0, 8184);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 2:
                ((SQLiteStatement) obj).bindLong(((Integer) obj3).intValue(), ((com.vk.im.engine.models.dialogs.b) obj2).k);
                break;
            default:
                SQLiteStatement sQLiteStatement = (SQLiteStatement) obj;
                int intValue3 = ((Integer) obj3).intValue();
                ChatSettings chatSettings = ((com.vk.im.engine.models.dialogs.b) obj2).z;
                rdi.k(sQLiteStatement, intValue3, chatSettings != null ? Integer.valueOf(chatSettings.f) : null);
                break;
        }
        return s3q0.a;
    }
}
