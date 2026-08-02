package xsna;

import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.catalog2.feature.music.dto.ui.search.UIBlockSearchHistory;
import com.vk.core.compose.component.defaults.SpinnerState;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.libvideo.videobottomsheet.api.a;
import io.requery.android.database.sqlite.SQLiteStatement;
import kotlin.collections.EmptyList;
import xsna.cri;
import xsna.dt1;
import xsna.hma;
import xsna.ima;
import xsna.kma;
import xsna.phw;
import xsna.q630;
import xsna.xkh;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class yi4 implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ yi4(int i) {
        this.b = i;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.b;
        q630.a aVar = q630.a.a;
        int i2 = 0;
        switch (i) {
            case 0:
                lg90 lg90Var = (lg90) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                aVar2.K(628016549);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(628016549, intValue, -1, "com.vk.music.stickyplayer.presentation.components.audiobook.AudioBookPlaybackQueueItem.Content.<anonymous> (AudioBookPlaybackQueueItem.kt:53)");
                }
                phw a = phw.a.a(lg90Var, null, null, null, null, aVar2, 196616 | (intValue & 14), 30);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2.j();
                return a;
            case 1:
                return new xkh.a((it80) obj2, (it80) obj3, (it80) obj);
            case 2:
                mma mmaVar = (mma) obj;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= aVar3.J(mmaVar) ? 4 : 2;
                }
                if (aVar3.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(656438753, intValue2, -1, "com.vk.design.demo.presentation.screens.ComposableSingletons$CellButtonGroupScreenContentKt.lambda$656438753.<anonymous> (CellButtonGroupScreenContent.kt:99)");
                    }
                    for (int i3 = 0; i3 < 3; i3++) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1444042868, 54, -1, "com.vk.core.compose.component.cell.button.group.CellButtonGroupItem.Middle.Text.Companion.invoke (VkCellButtonGroupItem.kt:158)");
                        }
                        Object x = aVar3.x();
                        Object obj4 = a.C0011a.a;
                        if (x == obj4) {
                            x = new ima.a();
                            aVar3.R(x);
                        }
                        ima.a aVar4 = (ima.a) x;
                        ((zak0) aVar4.a).setValue("Button");
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        qzu0.a.getClass();
                        lg90 h = qzu0.h(aVar3);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-520156207, 392, -1, "com.vk.core.compose.component.cell.button.group.CellButtonGroupItem.Left.Icon.Companion.invoke (VkCellButtonGroupItem.kt:123)");
                        }
                        Object x2 = aVar3.x();
                        if (x2 == obj4) {
                            x2 = new hma.a(h);
                            aVar3.R(x2);
                        }
                        hma.a aVar5 = (hma.a) x2;
                        ((zak0) aVar5.a).setValue(h);
                        ((zak0) aVar5.b).setValue(null);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(298050789, 48, -1, "com.vk.core.compose.component.cell.button.group.CellButtonGroupItem.Right.Dropdown.Companion.invoke (VkCellButtonGroupItem.kt:224)");
                        }
                        Object x3 = aVar3.x();
                        if (x3 == obj4) {
                            x3 = new kma.a();
                            aVar3.R(x3);
                        }
                        kma.a aVar6 = (kma.a) x3;
                        ((zak0) aVar6.a).setValue(null);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        Object x4 = aVar3.x();
                        if (x4 == obj4) {
                            x4 = new pr6(8);
                            aVar3.R(x4);
                        }
                        mmaVar.a(aVar4, (gzs) x4, null, aVar5, aVar6, null, false, aVar3, ((intValue2 << 21) & 29360128) | 48, 100);
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 3:
                androidx.compose.runtime.a aVar7 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (aVar7.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-145726602, intValue3, -1, "com.vk.clips.playlists.playlist_ui.ui.ComposableSingletons$ContentKt.lambda$-145726602.<anonymous> (Content.kt:216)");
                    }
                    q630 f = txj0.f(aVar, 1.0f);
                    dt1.a.getClass();
                    cp10 d = ja8.d(dt1.a.b, false);
                    int hashCode = Long.hashCode(n34.n(aVar7));
                    sy90 D = aVar7.D();
                    q630 c = qri.c(aVar7, f);
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
                    zfr0.f(SpinnerState.Loading, ra8.a.b(aVar, dt1.a.f), null, 0L, null, null, aVar7, 6, 60);
                    aVar7.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar7.h();
                }
                return s3q0.a;
            case 4:
                ksy ksyVar = (ksy) obj;
                androidx.compose.runtime.a aVar9 = (androidx.compose.runtime.a) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= aVar9.J(ksyVar) ? 4 : 2;
                }
                if (aVar9.t(intValue4 & 1, (intValue4 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(390710756, intValue4, -1, "com.vk.clips.attachments.impl.publish.geolocation.presentation.view.ComposableSingletons$MainContentKt.lambda$390710756.<anonymous> (MainContent.kt:89)");
                    }
                    fe00.a(ksyVar.a(aVar), aVar9, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar9.h();
                }
                return s3q0.a;
            case 5:
                androidx.compose.runtime.a aVar10 = (androidx.compose.runtime.a) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                if (aVar10.t(intValue5 & 1, (intValue5 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1170549674, intValue5, -1, "com.vk.music.bottomsheets.equalizer.ComposableSingletons$PlayerEqualizerSettingsMviViewKt.lambda$-1170549674.<anonymous> (PlayerEqualizerSettingsMviView.kt:187)");
                    }
                    if (a690.d(aVar, 24, aVar10, 6)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar10.h();
                }
                return s3q0.a;
            case 6:
                SQLiteStatement sQLiteStatement = (SQLiteStatement) obj;
                int intValue6 = ((Integer) obj3).intValue();
                ChatSettings chatSettings = ((com.vk.im.engine.models.dialogs.b) obj2).z;
                rdi.j(sQLiteStatement, intValue6, chatSettings != null ? Boolean.valueOf(chatSettings.v) : null);
                return s3q0.a;
            case 7:
                ((SQLiteStatement) obj).bindString(((Integer) obj3).intValue(), ((com.vk.im.engine.models.dialogs.b) obj2).C.a);
                return s3q0.a;
            case 8:
                ((Integer) obj2).getClass();
                x290 x290Var = x290.a;
                return Boolean.TRUE;
            default:
                b5a b5aVar = (b5a) obj2;
                UIBlockSearchHistory.UIBlockSearchHistoryVideo uIBlockSearchHistoryVideo = (UIBlockSearchHistory.UIBlockSearchHistoryVideo) obj3;
                Activity h2 = e3m.h((Context) obj);
                if (h2 != null) {
                    EmptyList emptyList = EmptyList.b;
                    new e6s0(h2, new u6s0(null, emptyList, null).a(new a.InterfaceC1255a.C1256a(uIBlockSearchHistoryVideo.A, new a.c(0, null, uIBlockSearchHistoryVideo.g, uIBlockSearchHistoryVideo.f, false, ""), null, false), new i6s0(b5aVar, uIBlockSearchHistoryVideo), new fuh0(i2)), new z6s0(emptyList).a(null, 0)).c();
                }
                return s3q0.a;
        }
    }
}
