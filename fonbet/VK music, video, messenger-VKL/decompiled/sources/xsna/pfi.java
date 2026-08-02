package xsna;

import io.requery.android.database.sqlite.SQLiteStatement;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class pfi implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ pfi(int i) {
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
                        androidx.compose.runtime.b.f(1217302554, intValue, -1, "com.vk.design.demo.presentation.screens.feed.ComposableSingletons$FeedAvatarAnimatedStackScreenContentKt.lambda$1217302554.<anonymous> (FeedAvatarAnimatedStackScreenContent.kt:121)");
                    }
                    f9t.e(txj0.q(q630.a.a, 32), aVar, 6);
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
                        androidx.compose.runtime.b.f(926007213, intValue2, -1, "com.vk.core.compose.component.ComposableSingletons$VkScaffoldKt.lambda$926007213.<anonymous> (VkScaffold.kt:53)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            default:
                rdi.i((SQLiteStatement) obj, ((Integer) obj3).intValue(), ((com.vk.im.engine.models.dialogs.b) obj2).N);
                break;
        }
        return s3q0.a;
    }
}
