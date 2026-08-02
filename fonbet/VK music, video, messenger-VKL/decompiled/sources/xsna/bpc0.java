package xsna;

import android.os.Build;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventBatchRequest;
import com.unity3d.services.core.di.ServiceProvider;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.story.archive.impl.di.StoryArchiveComponentImpl;
import com.vk.superapp.ui.SuperAppFragment;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.ImFeatures;
import xsna.dev0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class bpc0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ bpc0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        GetDiagnosticEventBatchRequest initialize$lambda$220$lambda$140;
        switch (this.b) {
            case 0:
                FeedFeatures feedFeatures = FeedFeatures.FEED_DS_MEDIA_PICKER;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 1:
                com.vk.registration.funnels.b.z(com.vk.registration.funnels.b.a, SchemeStatSak$EventScreen.PARTIAL_SILENT_EXPAND_PASSWORD, null, null, null, 28);
                return s3q0.a;
            case 2:
                ImFeatures imFeatures = ImFeatures.REDESIGN_DIALOG_LIST_ITEM;
                imFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(imFeatures));
            case 3:
                initialize$lambda$220$lambda$140 = ServiceProvider.initialize$lambda$220$lambda$140();
                return initialize$lambda$220$lambda$140;
            case 4:
                if (Build.VERSION.SDK_INT >= 33) {
                    try {
                        bi4.d();
                        return yto.a();
                    } catch (Exception unused) {
                    }
                }
                return null;
            case 5:
                qcy<Object>[] qcyVarArr = StoryArchiveComponentImpl.d;
                return new xpl0(0);
            case 6:
                int i = SuperAppFragment.o0;
                int i2 = y1z.a;
                LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
                return Boolean.FALSE;
            case 7:
                return new d20();
            case 8:
                return tlo0.Companion.serializer();
            case 9:
                return com.vk.core.view.components.cell.d.Companion.serializer();
            case 10:
                return new dev0.a.C2727a();
            case 11:
                return bnw0.a();
            default:
                vx2.a.getClass();
                return new ydw0(vx2.b);
        }
    }
}
