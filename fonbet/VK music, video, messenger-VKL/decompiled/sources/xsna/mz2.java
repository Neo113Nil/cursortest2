package xsna;

import com.vk.clips.design.view.camera.ClipsTimerTimeSelectorWrap;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class mz2 implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ mz2(byte b, int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return v11.b(1, (Integer) obj);
            case 1:
                ((Integer) obj2).getClass();
                v8c.f(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 2:
                int i = ClipsTimerTimeSelectorWrap.d;
                return y8g0.f(R.string.clips_camera_timer_recording_descr, (String) obj, (String) obj2);
            case 3:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(226901279, intValue, -1, "com.vk.biometrics.lock.impl.presentation.base.view.ComposableSingletons$BiometricsLockPlaceholderKt.lambda$226901279.<anonymous> (BiometricsLockPlaceholder.kt:23)");
                    }
                    a87.b(null, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 4:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1728778618, intValue2, -1, "com.vk.music.stickyplayer.presentation.components.audiobook.ComposableSingletons$KidsAudioBookBigPlayerControlsKt.lambda$-1728778618.<anonymous> (KidsAudioBookBigPlayerControls.kt:40)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 5:
                return obj;
            case 6:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar3.K(-1574773155);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1574773155, intValue3, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:235)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar3.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.U0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar3.j();
                return frv0Var;
            default:
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken2 = VkTypographyToken.DisplayTitle1;
                aVar4.K(-1594314277);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1594314277, intValue4, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:215)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var2 = (wuv0) aVar4.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var2 = wuv0Var2.A0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar4.j();
                return frv0Var2;
        }
    }
}
