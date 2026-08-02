package xsna;

import androidx.compose.runtime.a;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.AutoRepostToStoriesData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.OnboardingDetails;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.ConditionalFeature;
import com.vk.clips.upload.vk.ui.impl.fragment.view.custom.stories.OnboardingType;
import com.vk.profile.user.impl.domain.edit.avatar.AvatarPopupChoice;
import xsna.yjq0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class rq5 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rq5(int i, Object obj, izs izsVar) {
        this.b = i;
        this.d = obj;
        this.c = izsVar;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                yjq0.b bVar = (yjq0.b) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1891184971, intValue, -1, "com.vk.profile.user.impl.ui.edit.mvi.view.main.settings.photo.avatar.AvatarContainer.<anonymous>.<anonymous>.<anonymous> (AvatarContainer.kt:88)");
                    }
                    for (AvatarPopupChoice avatarPopupChoice : (Iterable) bVar.a) {
                        vq5.b(d370.N(avatarPopupChoice.j(), 0, aVar), avatarPopupChoice.i(), new biq0(avatarPopupChoice.h()), this.c, aVar, 0);
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                ConditionalFeature conditionalFeature = (ConditionalFeature) this.d;
                q630 q630Var = (q630) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= aVar2.J(q630Var) ? 4 : 2;
                }
                if (aVar2.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1549496965, intValue2, -1, "com.vk.clips.upload.vk.ui.impl.fragment.store.ClipsUploadStateMapper.buildPostToStoryItem.<anonymous> (ClipsUploadStateMapper.kt:746)");
                    }
                    boolean z = conditionalFeature.c != ConditionalFeature.State.DISABLED;
                    AutoRepostToStoriesData autoRepostToStoriesData = (AutoRepostToStoriesData) conditionalFeature.b;
                    boolean z2 = autoRepostToStoriesData.b;
                    OnboardingDetails onboardingDetails = autoRepostToStoriesData.c;
                    int i = onboardingDetails.c;
                    OnboardingType onboardingType = onboardingDetails.b;
                    izs izsVar = this.c;
                    boolean J = aVar2.J(izsVar);
                    Object x = aVar2.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (J || x == c0012a) {
                        x = new yd1(izsVar, 4);
                        aVar2.R(x);
                    }
                    gzs gzsVar = (gzs) x;
                    boolean J2 = aVar2.J(izsVar);
                    Object x2 = aVar2.x();
                    if (J2 || x2 == c0012a) {
                        x2 = new nif(izsVar, 0);
                        aVar2.R(x2);
                    }
                    ccm0.a(q630Var, z2, onboardingType, z, i, gzsVar, (izs) x2, aVar2, intValue2 & 14);
                    if (androidx.compose.runtime.b.d()) {
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
