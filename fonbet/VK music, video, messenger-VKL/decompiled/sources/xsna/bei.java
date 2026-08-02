package xsna;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteStatement;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class bei implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ bei(int i) {
        this.b = i;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-981643647, intValue, -1, "com.vk.design.demo.presentation.screens.ComposableSingletons$ContextMenuScreenContentKt.lambda$-981643647.<anonymous> (ContextMenuScreenContent.kt:464)");
                    }
                    vjw.a(pg90.a(R.drawable.ds_demo_image_1, 0, aVar), null, txj0.q(q630.a.a, com.vk.design.demo.presentation.screens.a.a), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar, 440, 120);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-32438219, intValue2, -1, "com.vk.music.stickyplayer.presentation.components.podcast.ComposableSingletons$PodcastActionsPanelKt.lambda$-32438219.<anonymous> (PodcastActionsPanel.kt:90)");
                    }
                    z3r0.b(null, false, aVar2, 0, 3);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 2:
                SQLiteStatement sQLiteStatement = (SQLiteStatement) obj;
                int intValue3 = ((Integer) obj3).intValue();
                ChatSettings chatSettings = ((com.vk.im.engine.models.dialogs.b) obj2).z;
                rdi.j(sQLiteStatement, intValue3, chatSettings != null ? Boolean.valueOf(chatSettings.F) : null);
                return s3q0.a;
            case 3:
                SQLiteStatement sQLiteStatement2 = (SQLiteStatement) obj;
                int intValue4 = ((Integer) obj3).intValue();
                InfoBar infoBar = ((com.vk.im.engine.models.dialogs.b) obj2).w;
                rdi.k(sQLiteStatement2, intValue4, infoBar != null ? infoBar.g : null);
                return s3q0.a;
            default:
                q630 q630Var = (q630) obj;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                aVar3.K(875093457);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(875093457, intValue5, -1, "com.vk.catalog2.common.ui.holders.video.playlist.cover.ui.percentWidth.<anonymous> (PlaylistButtons.kt:206)");
                }
                q630 g = q630Var.g(txj0.v(q630.a.a, ((Configuration) aVar3.r(AndroidCompositionLocals_androidKt.a)).screenWidthDp * 0.16f));
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar3.j();
                return g;
        }
    }
}
