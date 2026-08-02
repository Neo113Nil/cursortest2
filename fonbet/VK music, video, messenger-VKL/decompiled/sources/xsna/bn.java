package xsna;

import android.content.Context;
import android.content.res.Configuration;
import com.vk.auth.smartflow.api.SmartflowComponent;
import com.vk.metrics.eventtracking.Event;
import com.vk.story.impl.di.StoriesComponentImpl;
import com.vk.tabbar.settings.impl.di.TabbarSettingsComponentImpl;
import com.vk.toggle.features.VideoFeatures;
import com.vk.voip.di.VoipCallComponentImpl;
import com.vkontakte.android.VKApplication;
import xsna.ezi;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class bn implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bn(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        boolean z = false;
        Object obj = this.c;
        switch (i) {
            case 0:
                String str = ((cn) obj).b;
                return drm0.L(str, ' ', 0, 6) > -1 ? str.substring(drm0.L(str, ' ', 0, 6) + 1, str.length()) : str;
            case 1:
                return ((SmartflowComponent) m7m.a(((com.vk.auth.b) obj).a).mo408a(fpf0.a(SmartflowComponent.class))).Vd();
            case 2:
                return new qwk((Context) obj, "events.db", null, 4);
            case 3:
                return ((jq40) obj).a.W8();
            case 4:
                qcy<Object>[] qcyVarArr = StoriesComponentImpl.N;
                nwy nwyVar = ((StoriesComponentImpl) obj).H;
                qcy<Object> qcyVar = StoriesComponentImpl.N[27];
                return new o2m0((mny) nwyVar.c());
            case 5:
                TabbarSettingsComponentImpl tabbarSettingsComponentImpl = (TabbarSettingsComponentImpl) obj;
                mui0 J2 = tabbarSettingsComponentImpl.a.J2();
                wtn0 y8 = tabbarSettingsComponentImpl.c.y8();
                mun0 wc = tabbarSettingsComponentImpl.wc();
                gxh D = tabbarSettingsComponentImpl.d.D();
                nwy nwyVar2 = tabbarSettingsComponentImpl.k;
                qcy<Object>[] qcyVarArr2 = TabbarSettingsComponentImpl.p;
                qcy<Object> qcyVar2 = qcyVarArr2[4];
                hwn0 hwn0Var = (hwn0) nwyVar2.c();
                nwy nwyVar3 = tabbarSettingsComponentImpl.j;
                qcy<Object> qcyVar3 = qcyVarArr2[3];
                return new vvn0(J2, y8, wc, D, hwn0Var, (iwn0) nwyVar3.c(), tabbarSettingsComponentImpl.b.md());
            case 6:
                final VKApplication vKApplication = (VKApplication) obj;
                VKApplication.a aVar = VKApplication.c;
                asu0.a.getClass();
                asu0.o().execute(new Runnable() { // from class: xsna.hi80
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context = vKApplication;
                        Configuration configuration = context.getResources().getConfiguration();
                        String a = ezi.a.a(context);
                        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
                        el3 el3Var = Event.b;
                        Event.a b = h5s.b("UI.SETTINGS.TEXT_SIZE");
                        b.c("system_font_scale", String.valueOf(configuration.fontScale));
                        b.c("density_dpi", String.valueOf(configuration.densityDpi));
                        b.c("smallest_width", String.valueOf(configuration.smallestScreenWidthDp));
                        b.c("app_text_size", a);
                        Event.LogType logType = Event.LogType.ONCE_PER_VERSION;
                        if (b.f) {
                            throw new IllegalStateException("Already builded!");
                        }
                        b.e = logType;
                        bVar.k(b.e());
                    }
                });
                int i2 = k6r0.a;
                return s3q0.a;
            case 7:
                if (((qks0) obj).a) {
                    VideoFeatures videoFeatures = VideoFeatures.VIDEO_ANIMATION_AFTER_LIKE;
                    videoFeatures.getClass();
                    if (com.vk.toggle.b.A.a(videoFeatures)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            default:
                qcy<Object>[] qcyVarArr3 = VoipCallComponentImpl.B;
                aow0 X6 = ((VoipCallComponentImpl) obj).X6();
                com.vk.voip.ui.c.b.getClass();
                return new grw0(X6, com.vk.voip.ui.c.j0());
        }
    }
}
