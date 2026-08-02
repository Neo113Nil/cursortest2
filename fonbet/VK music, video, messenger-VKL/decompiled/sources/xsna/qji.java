package xsna;

import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import io.requery.android.database.sqlite.SQLiteStatement;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class qji implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ qji(int i) {
        this.b = i;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                PreviewViewState.d dVar = (PreviewViewState.d) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar.J(dVar) ? 4 : 2;
                }
                if (aVar.t(intValue & 1, (intValue & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-751517195, intValue, -1, "com.vk.libvideo.design.compose.base.preview.ComposableSingletons$PreviewViewKt.lambda$-751517195.<anonymous> (PreviewView.kt:148)");
                    }
                    if (dVar != null) {
                        aVar.K(1215811528);
                        com.vk.libvideo.design.compose.base.preview.c.g(dVar, null, aVar, intValue & 14);
                    } else {
                        aVar.K(1208929869);
                    }
                    aVar.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1694543374, intValue2, -1, "com.vk.core.compose.component.menu.ComposableSingletons$VkContextMenuKt.lambda$-1694543374.<anonymous> (VkContextMenu.kt:257)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 2:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1303464221, intValue3, -1, "com.vk.core.compose.component.tile.ComposableSingletons$VkTileKt.lambda$-1303464221.<anonymous> (VkTile.kt:42)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            case 3:
                SQLiteStatement sQLiteStatement = (SQLiteStatement) obj;
                int intValue4 = ((Integer) obj3).intValue();
                ChatSettings chatSettings = ((com.vk.im.engine.models.dialogs.b) obj2).z;
                rdi.j(sQLiteStatement, intValue4, chatSettings != null ? Boolean.valueOf(chatSettings.O) : null);
                break;
            default:
                rdi.i((SQLiteStatement) obj, ((Integer) obj3).intValue(), ((com.vk.im.engine.models.dialogs.b) obj2).D != null);
                break;
        }
        return s3q0.a;
    }
}
