package xsna;

import com.vk.auth.EnvironmentType;
import com.vk.core.apps.BuildInfo;
import com.vkontakte.android.VKApplication;

/* compiled from: WebAppEnvironmentProvider.kt */
/* loaded from: classes7.dex */
public final class oex0 implements fsp {
    @Override // xsna.fsp
    public final EnvironmentType a() {
        if (BuildInfo.h()) {
            return EnvironmentType.DEVELOPMENT;
        }
        VKApplication vKApplication = com.vk.core.apps.a.a;
        return BuildInfo.m() ? EnvironmentType.PRODUCTION : EnvironmentType.DEVELOPMENT;
    }
}
