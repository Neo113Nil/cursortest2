package xsna;

import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class rii implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ rii(int i) {
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
                        androidx.compose.runtime.b.f(-1660865126, intValue, -1, "com.vk.notifications.list.impl.presentation.base.view.common.ComposableSingletons$NotificationListSkeletonKt.lambda$-1660865126.<anonymous> (NotificationListSkeleton.kt:37)");
                    }
                    cc70.b(0, aVar);
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
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(867338642, intValue2, -1, "com.vk.profile.design.compose.header.header.picture.paging.page.ComposableSingletons$VideoPageKt.lambda$867338642.<anonymous> (VideoPage.kt:203)");
                }
                qka0.b(txj0.d(q630.a.a, 1.0f), aVar2, 6);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                break;
            default:
                int intValue3 = ((Integer) obj).intValue();
                int intValue4 = ((Integer) obj2).intValue();
                nov novVar = (nov) obj3;
                novVar.e((intValue3 / 2.0f) - (novVar.getRealWidth() / 2.0f), (intValue4 - novVar.getRealHeight()) - f2l0.a(intValue4));
                break;
        }
        return s3q0.a;
    }
}
