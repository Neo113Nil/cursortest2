package xsna;

import io.requery.android.database.sqlite.SQLiteStatement;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class ffi implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ ffi(int i) {
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
                        androidx.compose.runtime.b.f(1766471832, intValue, -1, "com.vk.draftslist.impl.ui.view.ComposableSingletons$DraftsListScreenKt.lambda$1766471832.<anonymous> (DraftsListScreen.kt:44)");
                    }
                    jeo.b(0, aVar);
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
                        androidx.compose.runtime.b.f(-1457607992, intValue2, -1, "com.vk.video.ui.upload.impl.publish.presentation.publish.compose.ComposableSingletons$PublishComposeComponentKt.lambda$-1457607992.<anonymous> (PublishComposeComponent.kt:35)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            default:
                ((SQLiteStatement) obj).bindLong(((Integer) obj3).intValue(), ((com.vk.im.engine.models.dialogs.b) obj2).H);
                break;
        }
        return s3q0.a;
    }
}
