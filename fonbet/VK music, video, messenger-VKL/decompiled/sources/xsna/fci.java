package xsna;

import androidx.compose.runtime.a;
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

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class fci implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ fci(int i) {
        this.b = i;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        lg90 a;
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
                        androidx.compose.runtime.b.f(500458211, intValue, -1, "com.vk.design.demo.presentation.screens.ComposableSingletons$CellButtonGroupScreenContentKt.lambda$500458211.<anonymous> (CellButtonGroupScreenContent.kt:122)");
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
                        fma.a a2 = fma.a.C2884a.a(CounterMode.Primary, CounterAppearance.Design.Accent, aVar);
                        Object x4 = aVar.x();
                        if (x4 == obj4) {
                            x4 = new bv0(11);
                            aVar.R(x4);
                        }
                        mmaVar.a(aVar2, (gzs) x4, null, aVar3, aVar4, a2, false, aVar, ((intValue << 21) & 29360128) | 48, 68);
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar5.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1476333543, intValue2, -1, "com.vk.music.bottomsheets.playlist.redesigned.presentation.ComposableSingletons$PlaylistMenuContentViewKt.lambda$1476333543.<anonymous> (PlaylistMenuContentView.kt:215)");
                    }
                    Object x5 = aVar5.x();
                    if (x5 == a.C0011a.a) {
                        x5 = new dz(14);
                        aVar5.R(x5);
                    }
                    w9q.a(0, 2, aVar5, egi0.b(q630.a.a, false, (izs) x5));
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
            case 2:
                SQLiteStatement sQLiteStatement = (SQLiteStatement) obj;
                int intValue3 = ((Integer) obj3).intValue();
                ChatSettings chatSettings = ((com.vk.im.engine.models.dialogs.b) obj2).z;
                rdi.j(sQLiteStatement, intValue3, chatSettings != null ? Boolean.valueOf(chatSettings.z) : null);
                return s3q0.a;
            case 3:
                SQLiteStatement sQLiteStatement2 = (SQLiteStatement) obj;
                int intValue4 = ((Integer) obj3).intValue();
                InfoBar infoBar = ((com.vk.im.engine.models.dialogs.b) obj2).w;
                rdi.m(sQLiteStatement2, intValue4, infoBar != null ? infoBar.d : null);
                return s3q0.a;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                aVar6.K(826890106);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(826890106, intValue5, -1, "com.vk.music.stickyplayer.presentation.components.TopPlayerControls.Right.MusicButtons.Content.<anonymous>.<anonymous> (TopPlayerControls.kt:432)");
                }
                if (booleanValue) {
                    aVar6.K(72444127);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(849846374, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Add24> (VkSdkIcons.kt:12)");
                    }
                    a = or.b(aVar6, -1058716730, R.drawable.vk_icon_add_24, aVar6, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.K(72444832);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(983561468, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Done24> (VkSdkIcons.kt:704)");
                    }
                    a = pg90.a(R.drawable.vk_icon_done_24, 0, aVar6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                }
                aVar6.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar6.j();
                return a;
        }
    }
}
