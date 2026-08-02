package xsna;

import io.requery.android.database.sqlite.SQLiteStatement;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class yji implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ yji(int i) {
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
                        androidx.compose.runtime.b.f(-1359139913, intValue, -1, "com.vk.profile.core.tabs.ui.narratives.ComposableSingletons$ProfileContentNarrativesViewHolderKt.lambda$-1359139913.<anonymous> (ProfileContentNarrativesViewHolder.kt:121)");
                    }
                    gvd0.a(0, 0, 0, 0L, aVar, null);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                ((SQLiteStatement) obj).bindLong(((Integer) obj3).intValue(), ((com.vk.im.engine.models.dialogs.b) obj2).F.j());
                break;
        }
        return s3q0.a;
    }
}
