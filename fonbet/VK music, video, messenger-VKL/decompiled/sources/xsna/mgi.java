package xsna;

import io.requery.android.database.sqlite.SQLiteStatement;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class mgi implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ mgi(int i) {
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
                        androidx.compose.runtime.b.f(482619377, intValue, -1, "com.vk.clips.viewer.impl.grid.toolbar.profile.swap.modal.picking.ComposableSingletons$GroupPickerBottomSheetContentKt.lambda$482619377.<anonymous> (GroupPickerBottomSheetContent.kt:71)");
                    }
                    f9t.e(txj0.v(q630.a.a, 8), aVar, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                ((SQLiteStatement) obj).bindLong(((Integer) obj3).intValue(), ((com.vk.im.engine.models.dialogs.b) obj2).c);
                break;
            default:
                nov novVar = (nov) obj3;
                novVar.e((((Integer) obj).intValue() / 2.0f) - (novVar.getOriginalWidth() / 2.0f), (((Integer) obj2).intValue() / 2.0f) - (novVar.getOriginalHeight() / 2.0f));
                break;
        }
        return s3q0.a;
    }
}
