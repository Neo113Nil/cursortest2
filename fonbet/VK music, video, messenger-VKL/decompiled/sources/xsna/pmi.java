package xsna;

import com.vk.im.engine.models.conversations.PushSettings;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import io.requery.android.database.sqlite.SQLiteStatement;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.a6t0;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class pmi implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ pmi(int i) {
        this.b = i;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                a6t0.a.C2528a c2528a = (a6t0.a.C2528a) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar.J(c2528a) ? 4 : 2;
                }
                if (aVar.t(intValue & 1, (intValue & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1430985455, intValue, -1, "com.vk.design.demo.presentation.screens.ComposableSingletons$VideoPreviewScreenContentKt.lambda$1430985455.<anonymous> (VideoPreviewScreenContent.kt:68)");
                    }
                    c2528a.a.h().c(PreviewViewState.Size.VideoMedium16x9, aVar, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                SQLiteStatement sQLiteStatement = (SQLiteStatement) obj;
                int intValue2 = ((Integer) obj3).intValue();
                PushSettings pushSettings = ((com.vk.im.engine.models.dialogs.b) obj2).p;
                rdi.j(sQLiteStatement, intValue2, pushSettings != null ? Boolean.valueOf(pushSettings.b) : null);
                break;
            case 2:
                String str = (String) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= aVar2.J(str) ? 4 : 2;
                }
                if (aVar2.t(intValue3 & 1, (intValue3 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1627062903, intValue3, -1, "com.vk.music.stickyplayer.presentation.components.PodcastMiddle.<anonymous>.<anonymous>.<anonymous> (MusicStandaloneBottomPlayer.kt:302)");
                    }
                    q630 E = ahn.E(q630.a.a, "title");
                    if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                        szw.a("invalid weight; must be greater than zero");
                    }
                    q630 d = defpackage.j0.d(1.0f, E, false);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    frv0 frv0Var = wuv0Var.J;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c(str, d, ylu0Var.getText().m, null, null, 0, 0, null, 2, false, 0, 1, null, frv0Var, aVar2, (intValue3 & 14) | 100663296, 48, 5880);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            default:
                int intValue4 = ((Integer) obj).intValue();
                int intValue5 = ((Integer) obj2).intValue();
                nov novVar = (nov) obj3;
                novVar.e((intValue4 / 2.0f) - (novVar.getRealWidth() / 2.0f), (f2l0.b / 2.0f) + (((intValue5 / 2.0f) - (novVar.getRealHeight() / 2.0f)) - (f2l0.a(intValue5) / 2.0f)));
                break;
        }
        return s3q0.a;
    }
}
