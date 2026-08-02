package xsna;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import com.vk.dto.stories.entities.StoryCameraTarget;

/* compiled from: EditorBottomControlPanel.kt */
/* loaded from: classes16.dex */
public interface q3p {
    void T(StoryCameraTarget storyCameraTarget);

    void a();

    void b(int i);

    void c(StoryCameraTarget storyCameraTarget);

    boolean d();

    boolean e();

    void f();

    void g(StoryPrivacyType storyPrivacyType, StoryPrivacyType storyPrivacyType2, q9m0 q9m0Var, vn7 vn7Var);

    int getBottomMargin();

    View getPrivacyButtonView();

    Rect getSendButtonRect();

    void h(boolean z, boolean z2);

    void i(ImageView imageView);

    void j(f640 f640Var, androidx.recyclerview.widget.r rVar);

    ey0 k(Throwable th, izs izsVar);

    void setInstantSendEnabled(boolean z);

    void setIsMultiStories(boolean z);

    void setLoading(boolean z);

    void setPresenter(u76 u76Var);

    void setPrivacy(StoryPrivacyType storyPrivacyType);

    void setSelectRecipientsEnabled(boolean z);

    void setSendButtonAlpha(float f);

    void setSendButtonAvatar(String str);

    void setStoryActionsPanelVisible(boolean z);
}
