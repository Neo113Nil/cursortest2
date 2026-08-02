package xsna;

import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import io.requery.android.database.sqlite.SQLiteStatement;
import xsna.a6t0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class qdi implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ qdi(int i) {
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
                        androidx.compose.runtime.b.f(-82179392, intValue, -1, "com.vk.profile.community.impl.ui.profile.content.holders.market.ComposableSingletons$CommunityProfileContentGoodsViewHolderKt.lambda$-82179392.<anonymous> (CommunityProfileContentGoodsViewHolder.kt:331)");
                    }
                    iih.a(0, 0L, aVar, null);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                a6t0.a.C2528a c2528a = (a6t0.a.C2528a) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= aVar2.J(c2528a) ? 4 : 2;
                }
                if (aVar2.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1337436920, intValue2, -1, "com.vk.design.demo.presentation.screens.ComposableSingletons$VideoPreviewScreenContentKt.lambda$1337436920.<anonymous> (VideoPreviewScreenContent.kt:63)");
                    }
                    c2528a.a.h().c(PreviewViewState.Size.VideoMedium16x9, aVar2, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 2:
                ((SQLiteStatement) obj).bindLong(((Integer) obj3).intValue(), ((com.vk.im.engine.models.dialogs.b) obj2).o.c);
                break;
            default:
                int intValue3 = ((Integer) obj).intValue();
                ((Integer) obj2).intValue();
                nov novVar = (nov) obj3;
                novVar.e((intValue3 - f2l0.a) - novVar.getRealWidth(), f2l0.b);
                break;
        }
        return s3q0.a;
    }
}
