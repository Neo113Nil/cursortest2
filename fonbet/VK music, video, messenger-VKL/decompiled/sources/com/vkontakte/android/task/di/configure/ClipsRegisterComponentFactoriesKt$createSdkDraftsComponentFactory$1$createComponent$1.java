package com.vkontakte.android.task.di.configure;

import com.vk.camera.clips.api.di.CameraClipsComponent;
import com.vk.clips.sdk.drafts.impl.ClipsDraftComponentBase;
import xsna.aud;
import xsna.eef;
import xsna.hqu0;
import xsna.mtd;
import xsna.na;
import xsna.tud;
import xsna.x2f;

/* compiled from: ClipsRegisterComponentFactories.kt */
/* loaded from: classes7.dex */
public final class ClipsRegisterComponentFactoriesKt$createSdkDraftsComponentFactory$1$createComponent$1 extends ClipsDraftComponentBase {
    public final x2f e;
    public final aud f;
    public final na g;

    public ClipsRegisterComponentFactoriesKt$createSdkDraftsComponentFactory$1$createComponent$1(tud tudVar, eef eefVar, CameraClipsComponent cameraClipsComponent) {
        this.e = new x2f(tudVar, eefVar);
        this.f = new aud(cameraClipsComponent.getLogger(), hqu0.a());
        this.g = new na(tudVar, 28);
    }

    @Override // com.vk.clips.sdk.drafts.api.ClipsDraftComponent
    public final mtd getProvider() {
        return this.e;
    }
}
