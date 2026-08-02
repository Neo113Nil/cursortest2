package xsna;

import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog.mvi.block.video.impl.di.CatalogVideoViewComponentImpl;
import com.vk.core.preference.Preference;
import com.vk.di.component.app.AppContextDiComponent;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.music.model.di.AudioModelsComponentImpl;
import com.vk.story.impl.di.StoriesComponentImpl;
import com.vk.superapp.multiaccount.api.MultiAccountComponent;
import com.vk.superapp.sessionmanagment.impl.di.SessionManagementComponentImpl;
import com.vk.toggle.internal.ToggleManager;
import com.vk.trustedhash.di.TrustedHashComponentImpl;
import com.vk.voip.api.di.VoipCallComponent;
import com.vk.voip.di.VoipCallComponentImpl;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.task.di.components.AuthBridgeComponentImpl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class er4 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ er4(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                AudioModelsComponentImpl audioModelsComponentImpl = (AudioModelsComponentImpl) this.c;
                qcy<Object>[] qcyVarArr = AudioModelsComponentImpl.f;
                return new ia40(audioModelsComponentImpl.r());
            case 1:
                return ((MultiAccountComponent) ((AuthBridgeComponentImpl) this.c).c.getValue()).c();
            case 2:
                ?? r0 = this.c;
                qcy<Object>[] qcyVarArr2 = CatalogVideoViewComponentImpl.y;
                return ((BridgeComponent) r0.getValue()).h8();
            case 3:
                return ((VoipCallComponent) ((k7m) m7m.f((png) this.c)).a(fpf0.a(VoipCallComponent.class))).Fd();
            case 4:
                SessionManagementComponentImpl sessionManagementComponentImpl = (SessionManagementComponentImpl) this.c;
                qcy<Object>[] qcyVarArr3 = SessionManagementComponentImpl.k;
                return ((fui0) sessionManagementComponentImpl.h.getValue()).b;
            case 5:
                StoriesComponentImpl storiesComponentImpl = (StoriesComponentImpl) this.c;
                qcy<Object>[] qcyVarArr4 = StoriesComponentImpl.N;
                return storiesComponentImpl.Ef().a;
            case 6:
                ToggleManager toggleManager = (ToggleManager) this.c;
                long currentTimeMillis = System.currentTimeMillis();
                toggleManager.m();
                toggleManager.i.a.clear();
                toggleManager.s.clear();
                toggleManager.h.h(new n0p0(toggleManager), true);
                toggleManager.y = true;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"toggles init time=" + (System.currentTimeMillis() - currentTimeMillis) + " ms"});
                }
                return s3q0.a;
            case 7:
                AppContextDiComponent appContextDiComponent = (AppContextDiComponent) this.c;
                qcy<Object>[] qcyVarArr5 = TrustedHashComponentImpl.b;
                return new isp0(Preference.h(appContextDiComponent.a, 0, "trusted_hashes"));
            case 8:
                VKApplication vKApplication = (VKApplication) this.c;
                VKApplication.a aVar = VKApplication.c;
                if (o25.a().b()) {
                    yk60.a.e(vKApplication);
                }
                return s3q0.a;
            default:
                return new v99(((VoipCallComponentImpl) this.c).c.getValue());
        }
    }
}
