package xsna;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.core.apps.BuildInfo;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.stories.model.StoryQuestionEntry;
import com.vk.dto.user.UserProfile;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.val0;

/* compiled from: StickersQuestionViewHolder.kt */
/* loaded from: classes6.dex */
public final class wbl0 extends vfz<val0> {
    public val0 l;
    public final VKImageView m;
    public final TextView n;
    public final TextView o;
    public final TextView p;
    public final VkButton q;
    public final ImageView r;
    public final ImageView s;

    public wbl0(ViewGroup viewGroup, com.vk.stories.design.view.stats.tabs.stickers.mvi.e eVar) {
        super(tf3.b(viewGroup, R.layout.pds_item_story_statistics_sticker_question, viewGroup, false));
        this.m = (VKImageView) this.itemView.findViewById(R.id.iv_avatar);
        this.n = (TextView) this.itemView.findViewById(R.id.name);
        this.o = (TextView) this.itemView.findViewById(R.id.date);
        this.p = (TextView) this.itemView.findViewById(R.id.text);
        VkButton vkButton = (VkButton) this.itemView.findViewById(R.id.button);
        this.q = vkButton;
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.iv_options);
        this.r = imageView;
        this.s = (ImageView) this.itemView.findViewById(R.id.iv_selector);
        bwt0.i0(imageView, new snj0(1, eVar, this));
        bwt0.i0(vkButton, new whi0(2, eVar, this));
        this.itemView.setOnClickListener(new bxq(4, eVar, this));
        bwt0.k0(this.itemView, new k82(23, eVar, this));
        bwt0.p0(vkButton, BuildInfo.s());
        this.itemView.setLongClickable(BuildInfo.s());
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(val0 val0Var) {
        val0 val0Var2 = val0Var;
        this.l = val0Var2;
        i6(val0Var2);
        h6(val0Var2);
        StoryQuestionEntry storyQuestionEntry = val0Var2.b;
        this.o.setText(mnh0.g(storyQuestionEntry.j * 1000, b6()));
        this.p.setText(storyQuestionEntry.d);
        this.q.setMode(storyQuestionEntry.h ? VkButton.Mode.Secondary : VkButton.Mode.Primary);
        j6(val0Var2);
    }

    public final void h6(val0 val0Var) {
        StoryQuestionEntry storyQuestionEntry = val0Var.b;
        boolean z = storyQuestionEntry.e;
        VKImageView vKImageView = this.m;
        if (z && storyQuestionEntry.g == null) {
            vKImageView.setImageResource(R.drawable.vk_icon_avatar_placeholder_anonim_150);
        } else {
            UserProfile userProfile = storyQuestionEntry.g;
            vKImageView.load(userProfile != null ? userProfile.o(24) : null);
        }
    }

    public final void i6(val0 val0Var) {
        StoryQuestionEntry storyQuestionEntry = val0Var.b;
        boolean z = storyQuestionEntry.e;
        TextView textView = this.n;
        if (z && storyQuestionEntry.g == null) {
            textView.setText(b6().getString(R.string.story_statistics_stickers_question_anonymous_stub_name));
        } else {
            UserProfile userProfile = storyQuestionEntry.g;
            textView.setText(userProfile != null ? userProfile.d : null);
        }
    }

    public final void j6(val0 val0Var) {
        val0.a aVar = val0Var.c;
        boolean z = aVar instanceof val0.a.b;
        ImageView imageView = this.r;
        VkButton vkButton = this.q;
        ImageView imageView2 = this.s;
        if (z) {
            vkButton.setEnabled(true);
            bwt0.p0(imageView, true);
            bwt0.p0(imageView2, false);
        } else {
            if (!(aVar instanceof val0.a.C3878a)) {
                throw new NoWhenBranchMatchedException();
            }
            vkButton.setEnabled(false);
            bwt0.p0(imageView, false);
            bwt0.p0(imageView2, true);
            if (((val0.a.C3878a) val0Var.c).a) {
                imageView2.setImageResource(R.drawable.vk_icon_check_circle_on_24);
                imageView2.setImageTintList(e3m.c(R.attr.vk_ui_icon_accent, this.itemView.getContext()));
                imageView2.setContentDescription(this.itemView.getContext().getString(R.string.story_statistics_stickers_question_selected_accessibility));
            } else {
                imageView2.setImageResource(R.drawable.vk_icon_check_circle_off_24);
                imageView2.setImageTintList(e3m.c(R.attr.vk_ui_icon_secondary, this.itemView.getContext()));
                imageView2.setContentDescription(this.itemView.getContext().getString(R.string.story_statistics_stickers_question_not_selected_accessibility));
            }
        }
    }
}
