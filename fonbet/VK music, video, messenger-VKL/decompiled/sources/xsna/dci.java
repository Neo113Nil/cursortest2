package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.SeparatorAppearance;
import com.vk.core.compose.component.defaults.SeparatorDpi;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.dialogs.ChatSettings;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.HashSet;
import xsna.cri;
import xsna.dt1;
import xsna.efu;
import xsna.hma;
import xsna.ima;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class dci implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ dci(int i) {
        this.b = i;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.b;
        Object obj4 = a.C0011a.a;
        q630.a aVar = q630.a.a;
        int i2 = 16;
        switch (i) {
            case 0:
                mma mmaVar = (mma) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar2.J(mmaVar) ? 4 : 2;
                }
                if (aVar2.t(intValue & 1, (intValue & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(734429024, intValue, -1, "com.vk.design.demo.presentation.screens.ComposableSingletons$CellButtonGroupScreenContentKt.lambda$734429024.<anonymous> (CellButtonGroupScreenContent.kt:89)");
                    }
                    for (int i3 = 0; i3 < 3; i3++) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1444042868, 54, -1, "com.vk.core.compose.component.cell.button.group.CellButtonGroupItem.Middle.Text.Companion.invoke (VkCellButtonGroupItem.kt:158)");
                        }
                        Object x = aVar2.x();
                        Object obj5 = x;
                        if (x == obj4) {
                            Object aVar3 = new ima.a();
                            aVar2.R(aVar3);
                            obj5 = aVar3;
                        }
                        ima.a aVar4 = (ima.a) obj5;
                        ((zak0) aVar4.a).setValue("Button");
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        qzu0.a.getClass();
                        lg90 h = qzu0.h(aVar2);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-520156207, 392, -1, "com.vk.core.compose.component.cell.button.group.CellButtonGroupItem.Left.Icon.Companion.invoke (VkCellButtonGroupItem.kt:123)");
                        }
                        Object x2 = aVar2.x();
                        Object obj6 = x2;
                        if (x2 == obj4) {
                            Object aVar5 = new hma.a(h);
                            aVar2.R(aVar5);
                            obj6 = aVar5;
                        }
                        hma.a aVar6 = (hma.a) obj6;
                        ((zak0) aVar6.a).setValue(h);
                        ((zak0) aVar6.b).setValue(null);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        Object x3 = aVar2.x();
                        if (x3 == obj4) {
                            x3 = new xu0(10);
                            aVar2.R(x3);
                        }
                        mmaVar.a(aVar4, (gzs) x3, null, aVar6, null, null, false, aVar2, ((intValue << 21) & 29360128) | 48, 116);
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 1:
                androidx.compose.runtime.a aVar7 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar7.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1568993448, intValue2, -1, "com.vk.video.ui.upload.impl.publish.presentation.publish.compose.screen.ComposableSingletons$LoadedKt.lambda$1568993448.<anonymous> (Loaded.kt:237)");
                    }
                    float f = 16;
                    q630 F = s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.h(aVar, f));
                    dt1.a.getClass();
                    cp10 d = ja8.d(dt1.a.f, false);
                    int hashCode = Long.hashCode(n34.n(aVar7));
                    sy90 D = aVar7.D();
                    q630 c = qri.c(aVar7, F);
                    cri.h7.getClass();
                    LayoutNode.a aVar8 = cri.a.b;
                    if (aVar7.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar7.H();
                    if (aVar7.L()) {
                        aVar7.I(aVar8);
                    } else {
                        aVar7.f();
                    }
                    k9q0.w(aVar7, d, cri.a.f);
                    k9q0.w(aVar7, D, cri.a.e);
                    k9q0.w(aVar7, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar7, cri.a.h);
                    k9q0.w(aVar7, c, cri.a.d);
                    ijv0.c(SeparatorDpi.At2x, SeparatorAppearance.Primary, null, aVar7, 54, 4);
                    aVar7.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar7.h();
                }
                return s3q0.a;
            case 2:
                androidx.compose.runtime.a aVar9 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (aVar9.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(698003396, intValue3, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.ComposableSingletons$StorefrontServicesLoadingKt.lambda$698003396.<anonymous> (StorefrontServicesLoading.kt:23)");
                    }
                    dsy a = gsy.a(0, 3, aVar9);
                    Context context = (Context) aVar9.r(AndroidCompositionLocals_androidKt.b);
                    HashSet hashSet = iah0.a;
                    int i4 = fnj.d(context) ? 3 : 2;
                    q630 f2 = txj0.f(aVar, 1.0f);
                    efu.b bVar = new efu.b(i4);
                    float f3 = 16;
                    u890 u890Var = new u890(f3, 12, f3, f3);
                    a.j g = androidx.compose.foundation.layout.a.g(0);
                    a.j g2 = androidx.compose.foundation.layout.a.g(6);
                    Object x4 = aVar9.x();
                    if (x4 == obj4) {
                        x4 = new la2(i2);
                        aVar9.R(x4);
                    }
                    uqy.b(bVar, f2, a, u890Var, g, g2, null, false, null, (izs) x4, aVar9, 102432816, 6, 656);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar9.h();
                }
                return s3q0.a;
            case 3:
                SQLiteStatement sQLiteStatement = (SQLiteStatement) obj;
                int intValue4 = ((Integer) obj3).intValue();
                ChatSettings chatSettings = ((com.vk.im.engine.models.dialogs.b) obj2).z;
                rdi.j(sQLiteStatement, intValue4, chatSettings != null ? Boolean.valueOf(chatSettings.y) : null);
                return s3q0.a;
            case 4:
                SQLiteStatement sQLiteStatement2 = (SQLiteStatement) obj;
                int intValue5 = ((Integer) obj3).intValue();
                InfoBar infoBar = ((com.vk.im.engine.models.dialogs.b) obj2).w;
                rdi.m(sQLiteStatement2, intValue5, infoBar != null ? infoBar.b : null);
                return s3q0.a;
            default:
                ((Long) obj2).longValue();
                ((Long) obj3).longValue();
                return s3q0.a;
        }
    }
}
