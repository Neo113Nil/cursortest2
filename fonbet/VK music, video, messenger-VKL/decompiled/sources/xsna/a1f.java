package xsna;

import com.vk.clips.sdk.shared.upload.badge.UploadBadgeComponent;
import com.vk.clips.sdk.shared.upload.badge.UploadBadgeComponentImpl;
import com.vk.clips.uploader.api.ClipsUploadSdkUploaderComponent;
import com.vk.di.component.DiScopedComponent;
import xsna.pa;
import xsna.sdl;

/* compiled from: ClipsRegisterComponentFactories.kt */
/* loaded from: classes7.dex */
public final class a1f implements c8m<UploadBadgeComponent, pwj0> {
    @Override // xsna.c8m
    public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
        final ClipsUploadSdkUploaderComponent clipsUploadSdkUploaderComponent = (ClipsUploadSdkUploaderComponent) g8mVar.a(fpf0.a(ClipsUploadSdkUploaderComponent.class));
        return new UploadBadgeComponentImpl(clipsUploadSdkUploaderComponent) { // from class: com.vkontakte.android.task.di.configure.ClipsRegisterComponentFactoriesKt$createUploadBadgeComponentFactory$1$createComponent$1
            public final sdl c = sdl.a;
            public final pa d;

            {
                this.d = new pa(clipsUploadSdkUploaderComponent, 11);
            }

            @Override // com.vk.clips.sdk.shared.upload.badge.UploadBadgeComponentImpl
            public final sdl Df() {
                return this.c;
            }

            @Override // com.vk.clips.sdk.shared.upload.badge.UploadBadgeComponentImpl
            public final pa Ef() {
                return this.d;
            }
        };
    }
}
