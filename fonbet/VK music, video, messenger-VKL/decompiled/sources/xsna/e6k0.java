package xsna;

import android.text.SpannableStringBuilder;
import com.vk.core.view.components.button.VkButton;
import com.vk.editor.di.StoryEditorExtDepsComponentImpl;
import com.vk.profile.user.impl.ui.view.header.UserProfileHeaderView;
import com.vk.toggle.features.VideoFeatures;
import kotlin.text.Regex;
import kotlin.text.RegexOption;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class e6k0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ e6k0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return new com.vkontakte.android.ecomm.checkout.a();
            case 1:
                qcy<Object>[] qcyVarArr = StoryEditorExtDepsComponentImpl.r;
                return new ope0();
            case 2:
                return new u1r0();
            case 3:
                return "handleUpload: OneLogImpl.apiClient is not initialized";
            case 4:
                int i = UserProfileHeaderView.G;
                return io.reactivex.rxjava3.subjects.g.O0(1);
            case 5:
                return Boolean.valueOf(fxc0.B().J().N1());
            case 6:
                return new mht0();
            case 7:
                VideoFeatures videoFeatures = VideoFeatures.FAST_SPEED;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 8:
                return new bsp(VkButton.Size.values(), "com.vk.core.view.components.button.VkButton.Size");
            case 9:
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) " ");
                append.setSpan(new elx0(cn70.b(3)), 0, append.length(), 33);
                return append;
            case 10:
                return new Regex("id\\.vk\\.(com|ru)", RegexOption.IGNORE_CASE);
            default:
                return new ots();
        }
    }
}
