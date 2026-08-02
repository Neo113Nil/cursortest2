package xsna;

import io.requery.android.database.sqlite.SQLiteStatement;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class yhi implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ yhi(int i) {
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
                        androidx.compose.runtime.b.f(-645800435, intValue, -1, "com.vk.music.stickyplayer.presentation.components.music.ComposableSingletons$MusicActionsPanelKt.lambda$-645800435.<anonymous> (MusicActionsPanel.kt:251)");
                    }
                    z3r0.b(null, false, aVar, 0, 3);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                ((SQLiteStatement) obj).bindLong(((Integer) obj3).intValue(), ((com.vk.im.engine.models.dialogs.b) obj2).G.d);
                break;
        }
        return s3q0.a;
    }
}
