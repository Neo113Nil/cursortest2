package xsna;

import com.vk.core.view.components.tooltip.VkTooltip;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.dto.VkOnboardingType;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.storycamera.picker.ui.StoryMediaPickerFragment;
import com.vk.storycamera.picker.ui.c;
import com.vk.voip.ui.calls.presentation.base.fragment.VoipCallServiceFragment;
import java.util.LinkedHashMap;
import kotlin.collections.EmptyList;
import xsna.bjw0;
import xsna.e8v0;
import xsna.gm50;
import xsna.k840;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class g6m0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g6m0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                StoryMediaPickerFragment storyMediaPickerFragment = (StoryMediaPickerFragment) obj3;
                int i2 = StoryMediaPickerFragment.d0;
                gm50.a.a(storyMediaPickerFragment, ((c.a) obj).a, new dnh0(3, storyMediaPickerFragment, (StoryMediaPickerFragment.b) obj2));
                break;
            case 1:
                ((zak0) ((e6p0) obj3).m).setValue((VkTooltip.Appearance) ((LinkedHashMap) obj2).get((String) obj));
                break;
            case 2:
                ((vmq0) obj3).z(j15.i((j15) obj2, null, null, null, false, false, false, null, null, null, CommunityProfileContentItem.State.ERROR, 28671));
                break;
            case 3:
                ((q7v0) ((wwq0) obj3).c.getValue()).a((VkOnboardingCampaign) obj2, VkOnboardingType.Tooltip, ((Boolean) obj).booleanValue() ? e8v0.i.b : e8v0.g.b);
                break;
            case 4:
                nht0 nht0Var = (nht0) obj3;
                nht0Var.f = null;
                nht0Var.b.getClass();
                s3q0 s3q0Var = s3q0.a;
                ((cd80) obj2).getClass();
                break;
            case 5:
                WebApiApplication webApiApplication = (WebApiApplication) obj3;
                ezu0 ezu0Var = (ezu0) obj2;
                if (((Boolean) obj).booleanValue()) {
                    webApiApplication.r = true;
                    ((fzu0) ezu0Var.a).G9(webApiApplication);
                }
                break;
            case 6:
                h4v0 h4v0Var = (h4v0) obj3;
                izs izsVar = (izs) obj2;
                Throwable th = (Throwable) obj;
                r5v0 r5v0Var = k840.a.h;
                (r5v0Var != null ? r5v0Var : null).b(new xs20(h4v0Var.f.e));
                bn40.d("Tracks fetching failed for VkMix");
                bn40.c(th, new Object[0]);
                h4v0Var.s(th);
                izsVar.invoke(EmptyList.b);
                break;
            case 7:
                tho0 tho0Var = (tho0) obj3;
                tho0 tho0Var2 = (tho0) obj2;
                com.vk.core.compose.component.datetime.b bVar = (com.vk.core.compose.component.datetime.b) obj;
                long j = tho0Var.b;
                us2 us2Var = tho0Var.a;
                if (qko0.d(j) == 0) {
                    us2 us2Var2 = tho0Var2.a;
                    long j2 = tho0Var2.b;
                    String str = us2Var2.c;
                    String str2 = us2Var2.c;
                    if (str.length() > us2Var.c.length()) {
                        bVar.e(str2.subSequence((int) (j >> 32), (int) (j2 >> 32)));
                    } else if (str2.length() < us2Var.c.length()) {
                        bVar.f();
                    } else {
                        bVar.d((int) (j2 >> 32), (int) (j2 & 4294967295L));
                    }
                } else {
                    long j3 = tho0Var2.b;
                    us2 us2Var3 = tho0Var2.a;
                    if (qko0.d(j3) != 0 || epx.f(us2Var3.c, us2Var.c)) {
                        bVar.d((int) (j3 >> 32), (int) (j3 & 4294967295L));
                    } else {
                        bVar.e(us2Var3.c.subSequence((int) (j >> 32), (int) (j3 >> 32)));
                    }
                }
                break;
            case 8:
                VoipCallServiceFragment.c cVar = (VoipCallServiceFragment.c) obj3;
                VoipCallServiceFragment voipCallServiceFragment = (VoipCallServiceFragment) obj2;
                int i3 = VoipCallServiceFragment.Y;
                sp.g(cVar.a, 4);
                gm50.a.a(voipCallServiceFragment, ((bjw0.c) obj).a, new hto0(8, voipCallServiceFragment, cVar));
                break;
            default:
                gzs gzsVar = (gzs) obj2;
                ((gvw0) obj3).h = false;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                break;
        }
        return s3q0.a;
    }
}
