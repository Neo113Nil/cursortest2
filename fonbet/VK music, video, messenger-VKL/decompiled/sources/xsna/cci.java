package xsna;

import android.content.res.Configuration;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.SpinnerState;
import com.vk.ecomm.design.compose.tile.MarketProductTileConfig;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vungle.ads.internal.protos.Sdk;
import io.requery.android.database.sqlite.SQLiteStatement;
import xsna.cri;
import xsna.dt1;
import xsna.ima;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class cci implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ cci(int i) {
        this.b = i;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                mma mmaVar = (mma) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar.J(mmaVar) ? 4 : 2;
                }
                if (aVar.t(intValue & 1, (intValue & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1800871127, intValue, -1, "com.vk.design.demo.presentation.screens.ComposableSingletons$CellButtonGroupScreenContentKt.lambda$-1800871127.<anonymous> (CellButtonGroupScreenContent.kt:80)");
                    }
                    for (int i = 0; i < 3; i++) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1444042868, 54, -1, "com.vk.core.compose.component.cell.button.group.CellButtonGroupItem.Middle.Text.Companion.invoke (VkCellButtonGroupItem.kt:158)");
                        }
                        Object x = aVar.x();
                        Object obj4 = a.C0011a.a;
                        if (x == obj4) {
                            x = new ima.a();
                            aVar.R(x);
                        }
                        ima.a aVar2 = (ima.a) x;
                        ((zak0) aVar2.a).setValue("Button");
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        Object x2 = aVar.x();
                        if (x2 == obj4) {
                            x2 = new yv2(12);
                            aVar.R(x2);
                        }
                        mmaVar.a(aVar2, (gzs) x2, null, null, null, null, false, aVar, ((intValue << 21) & 29360128) | 48, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2077369922, intValue2, -1, "com.vk.clips.coauthors.selector.ui.ComposableSingletons$LoadedContentKt.lambda$-2077369922.<anonymous> (LoadedContent.kt:277)");
                    }
                    q630.a aVar4 = q630.a.a;
                    q630 f = txj0.f(aVar4, 1.0f);
                    dt1.a.getClass();
                    cp10 d = ja8.d(dt1.a.b, false);
                    int hashCode = Long.hashCode(n34.n(aVar3));
                    sy90 D = aVar3.D();
                    q630 c = qri.c(aVar3, f);
                    cri.h7.getClass();
                    LayoutNode.a aVar5 = cri.a.b;
                    if (aVar3.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar3.H();
                    if (aVar3.L()) {
                        aVar3.I(aVar5);
                    } else {
                        aVar3.f();
                    }
                    k9q0.w(aVar3, d, cri.a.f);
                    k9q0.w(aVar3, D, cri.a.e);
                    k9q0.w(aVar3, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar3, cri.a.h);
                    k9q0.w(aVar3, c, cri.a.d);
                    zfr0.f(SpinnerState.Loading, ra8.a.b(aVar4, dt1.a.f), null, 0L, null, null, aVar3, 6, 60);
                    aVar3.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 2:
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (aVar6.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1572563664, intValue3, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.ComposableSingletons$StorefrontServicesLoadingKt.lambda$-1572563664.<anonymous> (StorefrontServicesLoading.kt:45)");
                    }
                    com.vk.ecomm.design.compose.tile.b.a(null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true, MarketProductTileConfig.DisplayCtaButtonType.BOTTOM, aVar6, 27648, 7);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                return s3q0.a;
            case 3:
                SQLiteStatement sQLiteStatement = (SQLiteStatement) obj;
                int intValue4 = ((Integer) obj3).intValue();
                ChatSettings chatSettings = ((com.vk.im.engine.models.dialogs.b) obj2).z;
                rdi.j(sQLiteStatement, intValue4, chatSettings != null ? Boolean.valueOf(chatSettings.x) : null);
                return s3q0.a;
            case 4:
                rdi.i((SQLiteStatement) obj, ((Integer) obj3).intValue(), ((com.vk.im.engine.models.dialogs.b) obj2).w != null);
                return s3q0.a;
            default:
                q630 q630Var = (q630) obj;
                androidx.compose.runtime.a aVar7 = (androidx.compose.runtime.a) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                aVar7.K(-1837879428);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1837879428, intValue5, -1, "com.vk.video.playlist.playlistscreen.ui.view.percentWidth.<anonymous> (PlaylistButtons.kt:283)");
                }
                q630 g = q630Var.g(txj0.v(q630.a.a, ((Configuration) aVar7.r(AndroidCompositionLocals_androidKt.a)).screenWidthDp * 0.16f));
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar7.j();
                return g;
        }
    }
}
