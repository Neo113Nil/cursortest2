package xsna;

import io.requery.android.database.sqlite.SQLiteStatement;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class nai implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ nai(int i) {
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
                        androidx.compose.runtime.b.f(1423982800, intValue, -1, "com.vk.video.ui.upload.impl.publish.presentation.albumchoose.compose.screen.ComposableSingletons$AlbumChooseViewKt.lambda$1423982800.<anonymous> (AlbumChooseView.kt:72)");
                    }
                    zfr0.e(txj0.f(q630.a.a, 1.0f), 0L, null, aVar, 6, 6);
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
                        androidx.compose.runtime.b.f(1474331904, intValue2, -1, "com.vk.profile.community.impl.ui.profile.content.holders.documents.ComposableSingletons$CommunityProfileContentDocumentViewHolderKt.lambda$1474331904.<anonymous> (CommunityProfileContentDocumentViewHolder.kt:86)");
                    }
                    ahh.a(null, 0, 0L, 0, false, aVar2, 0, 31);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            default:
                ((SQLiteStatement) obj).bindLong(((Integer) obj3).intValue(), ((com.vk.im.engine.models.dialogs.b) obj2).W);
                break;
        }
        return s3q0.a;
    }
}
