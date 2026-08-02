package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.avatar.api.VKAvatarView;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.core.view.components.button.VkButton;
import com.vkontakte.android.R;
import xsna.cq5;

/* compiled from: StoryViewGeneratedMemoriesModal.kt */
/* loaded from: classes6.dex */
public final class cmm0 extends FrameLayout {
    public final View b;
    public View.OnClickListener c;
    public View.OnClickListener d;

    public cmm0(l7s l7sVar) {
        super(l7sVar, null, 0);
        LayoutInflater.from(l7sVar).inflate(R.layout.pds_story_view_generated_modal, (ViewGroup) this, true);
        View findViewById = findViewById(R.id.iv_close_modal);
        this.b = findViewById;
        VKAvatarView vKAvatarView = (VKAvatarView) findViewById(R.id.avatar);
        VKAvatarView.c1(vKAvatarView, AvatarBorderType.CIRCLE, cq5.b.a, 4);
        vKAvatarView.setImageResource(R.drawable.stories_special_your_2024);
        ((VkButton) findViewById(R.id.open_app)).setOnClickListener(new e9i(this, 10));
        jjc.g(findViewById, new yka0(this, 12));
    }

    public final void setOnCloseClickListener(View.OnClickListener onClickListener) {
        this.c = onClickListener;
    }

    public final void setOnOpenMemoriesClickListener(View.OnClickListener onClickListener) {
        this.d = onClickListener;
    }
}
