package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.CounterAppearance;
import com.vk.core.compose.component.defaults.CounterMode;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteStatement;
import xsna.fma;
import xsna.hma;
import xsna.ima;
import xsna.kma;
import xsna.q630;
import xsna.zra0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class eci implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ eci(int i) {
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
                        androidx.compose.runtime.b.f(578448482, intValue, -1, "com.vk.design.demo.presentation.screens.ComposableSingletons$CellButtonGroupScreenContentKt.lambda$578448482.<anonymous> (CellButtonGroupScreenContent.kt:110)");
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
                        qzu0.a.getClass();
                        lg90 h = qzu0.h(aVar);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-520156207, 392, -1, "com.vk.core.compose.component.cell.button.group.CellButtonGroupItem.Left.Icon.Companion.invoke (VkCellButtonGroupItem.kt:123)");
                        }
                        Object x2 = aVar.x();
                        if (x2 == obj4) {
                            x2 = new hma.a(h);
                            aVar.R(x2);
                        }
                        hma.a aVar3 = (hma.a) x2;
                        ((zak0) aVar3.a).setValue(h);
                        ((zak0) aVar3.b).setValue(null);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(298050789, 48, -1, "com.vk.core.compose.component.cell.button.group.CellButtonGroupItem.Right.Dropdown.Companion.invoke (VkCellButtonGroupItem.kt:224)");
                        }
                        Object x3 = aVar.x();
                        if (x3 == obj4) {
                            x3 = new kma.a();
                            aVar.R(x3);
                        }
                        kma.a aVar4 = (kma.a) x3;
                        ((zak0) aVar4.a).setValue(null);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        fma.a a = fma.a.C2884a.a(CounterMode.Tertiary, CounterAppearance.Design.Neutral, aVar);
                        Object x4 = aVar.x();
                        if (x4 == obj4) {
                            x4 = new cj4(13);
                            aVar.R(x4);
                        }
                        mmaVar.a(aVar2, (gzs) x4, null, aVar3, aVar4, a, false, aVar, ((intValue << 21) & 29360128) | 48, 68);
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar5.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-514088905, intValue2, -1, "com.vk.games.presentation.components.ComposableSingletons$MapDetailItemsToViewKt.lambda$-514088905.<anonymous> (MapDetailItemsToView.kt:34)");
                    }
                    u7t.a(s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.r, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), aVar5, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                break;
            case 2:
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (aVar6.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-660872638, intValue3, -1, "com.vk.music.playlist.framework.presentation.screen.ComposableSingletons$PlaylistListContentKt.lambda$-660872638.<anonymous> (PlaylistListContent.kt:46)");
                    }
                    if (a690.d(q630.a.a, tab0.d, aVar6, 6)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                break;
            case 3:
                androidx.compose.runtime.a aVar7 = (androidx.compose.runtime.a) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if (aVar7.t(intValue4 & 1, (intValue4 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-756205327, intValue4, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.ComposableSingletons$StorefrontServicesPlaceholderKt.lambda$-756205327.<anonymous> (StorefrontServicesPlaceholder.kt:160)");
                    }
                    q630 m = hr80.m(p490.D(txj0.d(q630.a.a, 1.0f), p490.x(aVar7), 14), wlb0.h(aVar7).getBackground().g, androidx.compose.ui.graphics.e.a);
                    qzu0.a.getClass();
                    lg90 e = qzu0.e(aVar7);
                    long j = wlb0.h(aVar7).s() ? vcl0.a(aVar7, -863834149, aVar7).a : vcl0.a(aVar7, -863832995, aVar7).c;
                    aVar7.j();
                    ldv0.d(m, csa0.a(e, j, 0L, null, null, aVar7, 199688, 20), zra0.a.a(d370.N(R.string.storefront_category_placeholder_title, 0, aVar7), null, d370.N(R.string.storefront_category_placeholder_description, 0, aVar7), null, aVar7, 196608, 26), null, null, null, false, aVar7, 0, 120);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar7.h();
                }
                break;
            case 4:
                SQLiteStatement sQLiteStatement = (SQLiteStatement) obj;
                int intValue5 = ((Integer) obj3).intValue();
                ChatSettings chatSettings = ((com.vk.im.engine.models.dialogs.b) obj2).z;
                rdi.j(sQLiteStatement, intValue5, chatSettings != null ? Boolean.valueOf(chatSettings.w) : null);
                break;
            default:
                SQLiteStatement sQLiteStatement2 = (SQLiteStatement) obj;
                int intValue6 = ((Integer) obj3).intValue();
                InfoBar infoBar = ((com.vk.im.engine.models.dialogs.b) obj2).w;
                rdi.m(sQLiteStatement2, intValue6, infoBar != null ? infoBar.c : null);
                break;
        }
        return s3q0.a;
    }
}
