package xsna;

import com.ironsource.C4504q2;
import com.vk.core.view.components.cell.VkCell;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoSubscribtionButtonClick;
import com.vk.toggle.b;
import com.vk.toggle.features.CoreFeatures;
import com.vk.toggle.features.StoriesFeatures;
import com.vk.video.profile.di.VideoProfileComponentImpl;
import com.vk.voip.VoipService;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class nof0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ nof0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i;
        JSONObject g;
        r1 = 0;
        int i2 = 0;
        switch (this.b) {
            case 0:
                b8h0 b8h0Var = qof0.w;
                if (b8h0Var != null) {
                    return b8h0Var;
                }
                b8h0 b8h0Var2 = (b8h0) qof0.x.invoke();
                qof0.w = b8h0Var2;
                return b8h0Var2;
            case 1:
                return s3q0.a;
            case 2:
                eqy<bek0> eqyVar = com.vk.toggle.d.a;
                b.d i3 = com.vk.toggle.b.A.i(CoreFeatures.SINGLE_PREF_FILE);
                try {
                    i = Integer.parseInt(i3 != null ? i3.c.toString() : null);
                } catch (Throwable unused) {
                    i = 0;
                }
                return Boolean.valueOf(i == 1);
            case 3:
                eqy<bek0> eqyVar2 = com.vk.toggle.d.a;
                b.d i4 = com.vk.toggle.b.A.i(StoriesFeatures.NEW_PRELOADER);
                if (i4 != null && (g = i4.g()) != null) {
                    i2 = g.optInt(C4504q2.u);
                }
                return Integer.valueOf(i2);
            case 4:
                return mvp0.a;
            case 5:
                return s3q0.a;
            case 6:
                return MobileOfficialAppsVideoStat$TypeVideoSubscribtionButtonClick.Source.VIDEO_CHANNEL;
            case 7:
                qcy<Object>[] qcyVarArr = VideoProfileComponentImpl.e;
                return new j8t0();
            case 8:
                return VkCell.Right.ExtraAction.Companion.serializer();
            default:
                Object obj = VoipService.q;
                return new e1x0(a201.b().b(), asu0.a);
        }
    }
}
