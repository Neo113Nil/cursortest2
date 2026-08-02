package xsna;

import android.animation.PropertyValuesHolder;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.im.engine.models.dialogs.DialogsHistory;
import com.vk.libvideo.api.ad.VideoAdvertisementsRepository;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.utils.vectordrawable.AnimationTarget;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import xsna.drz;
import xsna.lyr0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class oq2 implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ oq2(byte b, int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        switch (this.b) {
            case 0:
                AnimationTarget.Property property = AnimationTarget.Property.FILL_COLOR;
                int[] q0 = rl3.q0((Integer[]) ((Object[]) obj2));
                ((PropertyValuesHolder) obj).setIntValues(Arrays.copyOf(q0, q0.length));
                return s3q0.a;
            case 1:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-151986624, intValue, -1, "com.vk.profile.community.impl.ui.profile.content.holders.documents.ComposableSingletons$CommunityProfileContentDocumentViewHolderKt.lambda$-151986624.<anonymous> (CommunityProfileContentDocumentViewHolder.kt:84)");
                    }
                    rrv0.d(null, null, null, null, mnh0.c, aVar, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 2:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1341284559, intValue2, -1, "androidx.compose.material.ComposableSingletons$ScaffoldKt.lambda$-1341284559.<anonymous> (Scaffold.kt:310)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 3:
                return Integer.valueOf(epx.g(((e7g0) obj2).b.j, ((e7g0) obj).b.j));
            case 4:
                drz.a aVar3 = (drz.a) obj;
                DialogsHistory dialogsHistory = ((xrm) aVar3.a).b;
                dialogsHistory.getClass();
                DialogsHistory dialogsHistory2 = new DialogsHistory(dialogsHistory);
                g5g.D(dialogsHistory2.k(), true, new wik((List) obj2, 8));
                xrm xrmVar = (xrm) aVar3.a;
                return drz.a.a(aVar3, new xrm(dialogsHistory2, xrmVar.c, xrmVar.d, xrmVar.e));
            case 5:
                ((Integer) obj2).getClass();
                t8s.d(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 6:
                return Integer.valueOf(((zox) obj).l0(((Integer) obj2).intValue()));
            case 7:
                VideoAdvertisementsRepository.a aVar4 = (VideoAdvertisementsRepository.a) obj;
                lyr0.a aVar5 = (lyr0.a) obj2;
                if (aVar4 instanceof VideoAdvertisementsRepository.a.c) {
                    VideoAdvertisementsRepository.a.c cVar = (VideoAdvertisementsRepository.a.c) aVar4;
                    obj3 = new AboutVideoItem.q.b(cVar.a, cVar.b, cVar.e, cVar.f, !(aVar5 instanceof lyr0.a.b));
                } else {
                    obj3 = AboutVideoItem.q.a.b;
                }
                return Collections.singletonList(obj3);
            default:
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar6.K(-367874948);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-367874948, intValue3, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:192)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar6.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.d0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar6.j();
                return frv0Var;
        }
    }

    public /* synthetic */ oq2(int i) {
        this.b = 5;
    }
}
