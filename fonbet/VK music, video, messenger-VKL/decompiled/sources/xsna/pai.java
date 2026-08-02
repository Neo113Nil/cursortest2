package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.VideoFile;
import com.vk.im.engine.models.dialogs.GroupCallInProgress;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.libvideo.tracker.VideoSimilarAnalytics;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import io.requery.android.database.sqlite.SQLiteStatement;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class pai implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ pai(int i) {
        this.b = i;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.b;
        q630.a aVar = q630.a.a;
        switch (i) {
            case 0:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar2.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1457231230, intValue, -1, "com.vk.video.ui.upload.impl.publish.presentation.albumchoose.compose.screen.ComposableSingletons$AlbumChooseViewRedesignKt.lambda$1457231230.<anonymous> (AlbumChooseViewRedesign.kt:150)");
                    }
                    zfr0.e(txj0.f(aVar, 1.0f), 0L, null, aVar2, 6, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 1:
                e8k0 e8k0Var = (e8k0) obj;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= aVar3.J(e8k0Var) ? 4 : 2;
                }
                if (aVar3.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(939725476, intValue2, -1, "androidx.compose.material.ComposableSingletons$ScaffoldKt.lambda$939725476.<anonymous> (Scaffold.kt:309)");
                    }
                    b8k0.b(e8k0Var, null, null, aVar3, intValue2 & 14);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            case 2:
                s890 s890Var = (s890) obj;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= aVar4.J(s890Var) ? 4 : 2;
                }
                if (aVar4.t(intValue3 & 1, (intValue3 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1891580286, intValue3, -1, "com.vk.ecomm.verifiedseller.impl.screens.verificationstub.ComposableSingletons$VerificationStubScreenKt.lambda$1891580286.<anonymous> (VerificationStubScreen.kt:44)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar4.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    qnr0.a(txj0.c(txj0.f(s200.F(32, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, s200.C(hr80.m(aVar, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a), s890Var)), 1.0f), 1.0f), aVar4, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                break;
            case 3:
                SQLiteStatement sQLiteStatement = (SQLiteStatement) obj;
                int intValue4 = ((Integer) obj3).intValue();
                GroupCallInProgress groupCallInProgress = ((com.vk.im.engine.models.dialogs.b) obj2).A;
                rdi.m(sQLiteStatement, intValue4, groupCallInProgress != null ? groupCallInProgress.d : null);
                break;
            default:
                int i2 = VideoMinimizableDiscoveryFragment.p1;
                VideoSimilarAnalytics.a((VideoMinimizableState) obj, (VideoFile) obj2, (VideoSimilarAnalytics.EventSource) obj3);
                break;
        }
        return s3q0.a;
    }
}
