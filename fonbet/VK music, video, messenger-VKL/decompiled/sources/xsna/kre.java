package xsna;

import com.vk.api.generated.shortVideo.dto.ShortVideoGetOwnerVideosResponseDto;
import com.vk.core.serialize.Serializer;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.HashMap;
import kotlin.Pair;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class kre implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ kre(int i) {
        this.b = i;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InfoBar.Payload payload;
        lg90 a;
        r2 = null;
        byte[] bArr = null;
        switch (this.b) {
            case 0:
                return new Pair((ShortVideoGetOwnerVideosResponseDto) obj, (ShortVideoGetOwnerVideosResponseDto) obj2);
            case 1:
                PreviewViewState.p pVar = (PreviewViewState.p) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar.J(pVar) ? 4 : 2;
                }
                if (aVar.t(intValue & 1, (intValue & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1647732401, intValue, -1, "com.vk.libvideo.design.compose.base.preview.ComposableSingletons$PreviewViewKt.lambda$1647732401.<anonymous> (PreviewView.kt:169)");
                    }
                    if (pVar != null) {
                        aVar.K(414780631);
                        com.vk.libvideo.design.compose.base.preview.c.t(pVar, txj0.d(q630.a.a, 1.0f), aVar, (intValue & 14) | 48);
                    } else {
                        aVar.K(407273361);
                    }
                    aVar.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 2:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1894594723, intValue2, -1, "com.vk.core.compose.component.menu.ComposableSingletons$VkContextMenuKt.lambda$-1894594723.<anonymous> (VkContextMenu.kt:921)");
                    }
                    float f = tnu0.b;
                    aou0.c(f, f, aVar2, 54);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 3:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(940138443, intValue3, -1, "com.vk.core.compose.component.tile.ComposableSingletons$VkTileKt.lambda$940138443.<anonymous> (VkTile.kt:73)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 4:
                SQLiteStatement sQLiteStatement = (SQLiteStatement) obj;
                int intValue4 = ((Integer) obj3).intValue();
                ChatSettings chatSettings = ((com.vk.im.engine.models.dialogs.b) obj2).z;
                rdi.i(sQLiteStatement, intValue4, (chatSettings != null ? chatSettings.B : null) != null);
                return s3q0.a;
            case 5:
                SQLiteStatement sQLiteStatement2 = (SQLiteStatement) obj;
                int intValue5 = ((Integer) obj3).intValue();
                InfoBar infoBar = ((com.vk.im.engine.models.dialogs.b) obj2).w;
                if (infoBar != null && (payload = infoBar.m) != null) {
                    HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                    bArr = Serializer.b.e(payload);
                }
                rdi.h(sQLiteStatement2, intValue5, bArr);
                return s3q0.a;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                aVar4.K(-270220316);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-270220316, intValue6, -1, "com.vk.music.stickyplayer.presentation.components.TopPlayerControls.Right.RadioButtons.Content.<anonymous>.<anonymous> (TopPlayerControls.kt:747)");
                }
                if (booleanValue) {
                    aVar4.K(-1983683895);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(849846374, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Add24> (VkSdkIcons.kt:12)");
                    }
                    a = or.b(aVar4, -1058716730, R.drawable.vk_icon_add_24, aVar4, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.K(-1983683190);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(983561468, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Done24> (VkSdkIcons.kt:704)");
                    }
                    a = pg90.a(R.drawable.vk_icon_done_24, 0, aVar4);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                }
                aVar4.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar4.j();
                return a;
        }
    }
}
