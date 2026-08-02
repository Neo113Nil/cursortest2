package xsna;

import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.camera.clips.api.di.CameraClipsComponent;
import com.vk.clips.sdk.drafts.api.ClipsDraftComponent;
import com.vk.clips.uploader.api.ClipsUploadSdkUploaderComponent;
import com.vk.di.component.DiScopedWithParamsComponent;
import com.vkontakte.android.task.di.configure.ClipsRegisterComponentFactoriesKt$createSdkDraftsComponentFactory$1$createComponent$1;

/* compiled from: ClipsRegisterComponentFactories.kt */
/* loaded from: classes7.dex */
public final class z0f implements o8m<ClipsDraftComponent, pwj0, htd> {
    @Override // xsna.o8m
    public final DiScopedWithParamsComponent a(l9i l9iVar, g8m g8mVar, pwj0 pwj0Var) {
        return new ClipsRegisterComponentFactoriesKt$createSdkDraftsComponentFactory$1$createComponent$1(new tud(((AuthBridgeComponent) g8mVar.a(fpf0.a(AuthBridgeComponent.class))).s().c()), ((ClipsUploadSdkUploaderComponent) g8mVar.a(fpf0.a(ClipsUploadSdkUploaderComponent.class))).Zb(), (CameraClipsComponent) g8mVar.a(fpf0.a(CameraClipsComponent.class)));
    }
}
