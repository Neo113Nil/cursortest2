package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.im.engine.models.dialogs.GroupCallInProgress;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteStatement;
import xsna.a6t0;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class fgi implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ fgi(int i) {
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
                        androidx.compose.runtime.b.f(-255894511, intValue, -1, "com.vk.games.presentation.components.ComposableSingletons$GamesCatalogWhatInsideModalBottomSheetContentKt.lambda$-255894511.<anonymous> (GamesCatalogWhatInsideModalBottomSheetContent.kt:134)");
                    }
                    q630.a aVar2 = q630.a.a;
                    q630 d = rte0.d(txj0.q(aVar2, 16), vog0.b(8));
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    iyk0 iyk0Var = rrv0.a;
                    ylu0 ylu0Var = (ylu0) aVar.r(iyk0Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    q630 m = hr80.m(d, ylu0Var.q().e, androidx.compose.ui.graphics.e.a);
                    dt1.a.getClass();
                    cp10 d2 = ja8.d(dt1.a.f, false);
                    int hashCode = Long.hashCode(n34.n(aVar));
                    sy90 D = aVar.D();
                    q630 c = qri.c(aVar, m);
                    cri.h7.getClass();
                    LayoutNode.a aVar3 = cri.a.b;
                    if (aVar.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar.H();
                    if (aVar.L()) {
                        aVar.I(aVar3);
                    } else {
                        aVar.f();
                    }
                    k9q0.w(aVar, d2, cri.a.f);
                    k9q0.w(aVar, D, cri.a.e);
                    k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar, cri.a.h);
                    k9q0.w(aVar, c, cri.a.d);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-935654142, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Flash12> (VkSdkIcons.kt:904)");
                    }
                    lg90 b = or.b(aVar, 265374120, R.drawable.vk_icon_flash_12, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var2 = (ylu0) aVar.r(iyk0Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    pzu0.b(b, null, txj0.q(aVar2, 12), ylu0Var2.getIcon().c, aVar, 440, 0);
                    aVar.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar4.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-893980709, intValue2, -1, "com.vk.notifications.list.impl.presentation.base.view.list.ComposableSingletons$NotificationListViewKt.lambda$-893980709.<anonymous> (NotificationListView.kt:277)");
                    }
                    q630 d3 = txj0.d(q630.a.a, 1.0f);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var3 = (ylu0) aVar4.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    uov0.a(d3, null, ylu0Var3.getBackground().g, 0L, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, tii.a, aVar4, 1572870, 58);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 2:
                a6t0.a.C2528a c2528a = (a6t0.a.C2528a) obj;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= aVar5.J(c2528a) ? 4 : 2;
                }
                if (aVar5.t(intValue3 & 1, (intValue3 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-920009936, intValue3, -1, "com.vk.design.demo.presentation.screens.ComposableSingletons$VideoPreviewScreenContentKt.lambda$-920009936.<anonymous> (VideoPreviewScreenContent.kt:73)");
                    }
                    c2528a.a.h().c(PreviewViewState.Size.VideoSmall16x9, aVar5, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
            case 3:
                SQLiteStatement sQLiteStatement = (SQLiteStatement) obj;
                int intValue4 = ((Integer) obj3).intValue();
                GroupCallInProgress groupCallInProgress = ((com.vk.im.engine.models.dialogs.b) obj2).A;
                rdi.i(sQLiteStatement, intValue4, groupCallInProgress != null ? groupCallInProgress.e : false);
                return s3q0.a;
            case 4:
                ep10 ep10Var = (ep10) obj;
                o6j o6jVar = (o6j) obj3;
                tra0 N = ((zo10) obj2).N(o6j.b((o6j.i(o6jVar.a) - ep10Var.r0(8)) / 2, o6jVar.a, 0, 0, 0, 14));
                return ep10Var.Q(N.b, N.c, jgp.b, new s6k(N, 18));
            default:
                int intValue5 = ((Integer) obj).intValue();
                int intValue6 = ((Integer) obj2).intValue();
                nov novVar = (nov) obj3;
                novVar.e((intValue5 - f2l0.a) - novVar.getRealWidth(), (f2l0.b / 2.0f) + (((intValue6 / 2.0f) - (novVar.getRealHeight() / 2.0f)) - (f2l0.a(intValue6) / 2.0f)));
                return s3q0.a;
        }
    }
}
