package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.storycamera.entity.attach.StoryEditorAttachPosition;
import ru.ok.media.OkmpStreamer;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class bk9 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bk9(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        s3q0 createPublisher$lambda$12;
        switch (this.b) {
            case 0:
                StoryEditorAttachPosition storyEditorAttachPosition = (StoryEditorAttachPosition) this.c;
                int intValue = ((Integer) obj).intValue();
                int intValue2 = ((Integer) obj2).intValue();
                nov novVar = (nov) obj3;
                StoryEditorAttachPosition.Type type = storyEditorAttachPosition.b;
                StoryEditorAttachPosition.Type type2 = StoryEditorAttachPosition.Type.CENTER;
                float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                float f2 = type == type2 ? (-novVar.getRealWidth()) * 0.5f : 0.0f;
                float f3 = storyEditorAttachPosition.b == type2 ? (-novVar.getRealHeight()) * 0.5f : 0.0f;
                Float f4 = storyEditorAttachPosition.c;
                float floatValue = f4 != null ? (intValue * f4.floatValue()) + f2 : 0.0f;
                Float f5 = storyEditorAttachPosition.d;
                if (f5 != null) {
                    f = (intValue2 * f5.floatValue()) + f3;
                }
                novVar.e(floatValue, f);
                break;
            case 1:
                createPublisher$lambda$12 = OkmpStreamer.createPublisher$lambda$12((OkmpStreamer) this.c, ((Integer) obj).intValue(), ((Long) obj2).longValue(), (gzs) obj3);
                break;
            case 2:
                f9d0 f9d0Var = (f9d0) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (aVar.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(756932234, intValue3, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlockServicesTileContentImpl.ProductTileSkeleton.<anonymous> (PrimaryBlockServicesTileContentImpl.kt:126)");
                    }
                    com.vk.ecomm.design.compose.tile.b.a(null, f9d0Var.c, f9d0Var.d, true, null, aVar, 3072, 17);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                jai jaiVar = (jai) this.c;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue4 & 1, (intValue4 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(496413784, intValue4, -1, "com.vk.superapp.holders.stub.SuperAppWidgetRedesignV6Holder.WidgetSkeletonCard.<anonymous>.<anonymous> (SuperAppWidgetRedesignV6Holder.kt:314)");
                    }
                    if (cq.i(0, aVar2, jaiVar)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
        }
        return s3q0.a;
    }
}
