package xsna;

import com.vk.core.apps.BuildInfo;
import com.vk.core.utils.newtork.NetworkState;
import com.vk.dto.common.AppState;
import com.vk.toggle.anonymous.SakFeatures;
import com.vk.toggle.features.CoreFeatures;
import com.vk.toggle.internal.ToggleManager;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class haj implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ haj(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                boolean z = ((yqw) obj).a;
                kaj.b(!z, z, AppState.FOREGROUND, false);
                return s3q0.a;
            case 1:
                return Boolean.valueOf(((NetworkState) obj).d);
            case 2:
                return Boolean.valueOf(((ToggleManager.Sync) obj) == ToggleManager.Sync.Done);
            default:
                if (BuildInfo.s()) {
                    hjv hjvVar = hjv.a;
                    if (!SakFeatures.Type.CORE_SWITCH_VK_RU_DOMAIN_ANON.h()) {
                        CoreFeatures coreFeatures = CoreFeatures.SWITCH_VK_RU_DOMAIN;
                        coreFeatures.getClass();
                        if (!com.vk.toggle.b.A.a(coreFeatures)) {
                            r1 = false;
                        }
                    }
                    hjvVar.getClass();
                    hjv.b(r1);
                } else if (BuildInfo.t() || BuildInfo.g()) {
                    hjv hjvVar2 = gjv.a;
                    if (!SakFeatures.Type.CORE_SWITCH_VK_RU_DOMAIN_ANON.h()) {
                        CoreFeatures coreFeatures2 = CoreFeatures.SWITCH_VK_RU_DOMAIN;
                        coreFeatures2.getClass();
                        com.vk.toggle.b.A.a(coreFeatures2);
                    }
                    throw null;
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ haj(kaj kajVar) {
        this.b = 0;
    }
}
