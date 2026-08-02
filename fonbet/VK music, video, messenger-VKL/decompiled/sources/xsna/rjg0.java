package xsna;

import com.vk.camera.editor.stories.impl.di.StoryEditorComponentImpl;
import com.vk.core.preference.Preference;
import com.vk.core.view.components.button.VkButton;
import com.vk.newsfeed.impl.posting.viewpresenter.ImPostingConfig;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.ui.smartcrop.impl.di.SmartCropComponentImpl;
import com.vk.writebar.di.VkDialogDraftUpdaterComponent;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import xsna.smh0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class rjg0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ rjg0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return s3q0.a;
            case 1:
                return new smh0.c();
            case 2:
                qcy<Object>[] qcyVarArr = SmartCropComponentImpl.b;
                return new g5k0();
            case 3:
                qcy<Object>[] qcyVarArr2 = StoryEditorComponentImpl.h;
                return new v1m0();
            case 4:
                return "handleUpload()";
            case 5:
                return new mrq0();
            case 6:
                return Preference.j();
            case 7:
                return s3q0.a;
            case 8:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_NEW_SEEK_PREVIEW;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 9:
                return new bsp(VkButton.Appearance.values(), "com.vk.core.view.components.button.VkButton.Appearance");
            case 10:
                return new ImPostingConfig(true, true, true, true, "1", true);
            case 11:
                qcy<Object>[] qcyVarArr3 = VkDialogDraftUpdaterComponent.b;
                return new edm();
            case 12:
                return new Regex("login\\.(vk|vkontakte)\\.(com|ru|me)", RegexOption.IGNORE_CASE);
            case 13:
                return s3q0.a;
            default:
                return com.vk.toggle.d.G.b();
        }
    }
}
