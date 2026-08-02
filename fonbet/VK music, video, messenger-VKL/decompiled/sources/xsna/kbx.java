package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.stickers.api.styles.StickerColorToken;
import com.vk.stickers.api.styles.StickerCommonStyle;
import com.vk.stories.design.view.polls.VoteProgressButton;
import com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.OpinionStickerState;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.dt80;

/* compiled from: InteractiveOpinionSticker.kt */
/* loaded from: classes6.dex */
public final class kbx extends a4z {
    public static final /* synthetic */ int j = 0;
    public final n5i c;
    public final jcg d;
    public com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.f e;
    public TextView f;
    public VoteProgressButton g;
    public VkInputSelect h;
    public TextView i;

    /* compiled from: InteractiveOpinionSticker.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OpinionStickerState.OpinionPrivacy.values().length];
            try {
                iArr[OpinionStickerState.OpinionPrivacy.PUBLIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OpinionStickerState.OpinionPrivacy.HIDDEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OpinionStickerState.OpinionPrivacy.HIDDEN_EXCEPT_AUTHOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public kbx() {
        throw null;
    }

    public kbx(Context context, n5i n5iVar, jcg jcgVar) {
        super(context);
        this.c = n5iVar;
        this.d = jcgVar;
    }

    public static final void a(kbx kbxVar, com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.h hVar) {
        s3q0 s3q0Var;
        VoteProgressButton voteProgressButton;
        int i;
        kbxVar.getClass();
        dt80 dt80Var = hVar.f;
        boolean z = hVar.d;
        TextView textView = kbxVar.f;
        if (textView != null) {
            textView.setTextColor(dt80Var.e(kbxVar.getContext()));
        }
        VkInputSelect vkInputSelect = kbxVar.h;
        if (vkInputSelect != null) {
            vkInputSelect.setBackground(dt80Var.d(vkInputSelect.getContext()));
            vkInputSelect.setHintTextColor(dt80Var.c(vkInputSelect.getContext()));
            vkInputSelect.setCursorColor(dt80Var.f(vkInputSelect.getContext()));
            vkInputSelect.setTextColor(dt80Var.e(vkInputSelect.getContext()));
        }
        if (epx.f(dt80Var, dt80.d.a)) {
            VoteProgressButton voteProgressButton2 = kbxVar.g;
            if (voteProgressButton2 != null) {
                voteProgressButton2.u.getIndeterminateDrawable().setTint(-1);
                voteProgressButton2.t.setTextColor(-1);
                voteProgressButton2.setBackground(m33.a(R.drawable.interactive_poll_ripple_blue, voteProgressButton2.getContext()));
                s3q0 s3q0Var2 = s3q0.a;
            }
        } else if (epx.f(dt80Var, dt80.b.a)) {
            VoteProgressButton voteProgressButton3 = kbxVar.g;
            if (voteProgressButton3 != null) {
                voteProgressButton3.u.getIndeterminateDrawable().setTint(-16777216);
                voteProgressButton3.t.setTextColor(-16777216);
                voteProgressButton3.setBackground(m33.a(R.drawable.ripple_black, voteProgressButton3.getContext()));
                s3q0 s3q0Var3 = s3q0.a;
            }
        } else if (epx.f(dt80Var, dt80.c.a)) {
            VoteProgressButton voteProgressButton4 = kbxVar.g;
            if (voteProgressButton4 != null) {
                voteProgressButton4.u.getIndeterminateDrawable().setTint(-1);
                voteProgressButton4.t.setTextColor(-1);
                voteProgressButton4.setBackground(m33.a(R.drawable.interactive_poll_ripple_blue, voteProgressButton4.getContext()));
                s3q0 s3q0Var4 = s3q0.a;
            }
        } else {
            if (!(dt80Var instanceof dt80.a)) {
                throw new NoWhenBranchMatchedException();
            }
            dt80.a aVar = (dt80.a) dt80Var;
            Context context = kbxVar.getContext();
            aVar.getClass();
            int f = e3m.f(R.attr.vk_ui_text_contrast, context);
            int b = aVar.a.b(context, StickerCommonStyle.ACCENT, StickerColorToken.QUESTION_PRIMARY_BUTTON);
            VoteProgressButton voteProgressButton5 = kbxVar.g;
            if (voteProgressButton5 != null) {
                voteProgressButton5.u.getIndeterminateDrawable().setTint(f);
                voteProgressButton5.t.setTextColor(f);
                Drawable a2 = m33.a(R.drawable.ripple_black, voteProgressButton5.getContext());
                new baf0(a2, b);
                voteProgressButton5.setBackground(a2);
                s3q0Var = s3q0.a;
            } else {
                s3q0Var = null;
            }
            if (s3q0Var == null && (voteProgressButton = kbxVar.g) != null) {
                voteProgressButton.u.getIndeterminateDrawable().setTint(-1);
                voteProgressButton.t.setTextColor(-1);
                voteProgressButton.setBackground(m33.a(R.drawable.interactive_poll_ripple_blue, voteProgressButton.getContext()));
                s3q0 s3q0Var5 = s3q0.a;
            }
        }
        kbxVar.setBackgroundDrawable(dt80Var.a(kbxVar.getContext()));
        TextView textView2 = kbxVar.i;
        if (textView2 != null) {
            textView2.setTextColor(dt80Var.g(kbxVar.getContext()));
            textView2.setCompoundDrawableTintList(ColorStateList.valueOf(dt80Var.b(kbxVar.getContext())));
        }
        TextView textView3 = kbxVar.f;
        if (textView3 != null) {
            textView3.setText(hVar.a);
        }
        VoteProgressButton voteProgressButton6 = kbxVar.g;
        if (voteProgressButton6 != null) {
            voteProgressButton6.setEnabled(!z && hVar.b.length() > 0);
        }
        OpinionStickerState.OpinionPrivacy opinionPrivacy = hVar.c;
        int i2 = opinionPrivacy == OpinionStickerState.OpinionPrivacy.PUBLIC ? R.drawable.vk_icon_view_outline_20 : R.drawable.vk_icon_hide_outline_20;
        TextView textView4 = kbxVar.i;
        if (textView4 != null) {
            Context context2 = textView4.getContext();
            int i3 = a.$EnumSwitchMapping$0[opinionPrivacy.ordinal()];
            if (i3 == 1) {
                i = R.string.story_opinion_privacy_public;
            } else if (i3 == 2) {
                i = R.string.story_opinion_privacy_private;
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R.string.story_opinion_privacy_only_author;
            }
            textView4.setText(context2.getString(i));
            textView4.setCompoundDrawablesRelativeWithIntrinsicBounds(i2, 0, 0, 0);
            textView4.setEnabled(!z);
        }
        VoteProgressButton voteProgressButton7 = kbxVar.g;
        if (voteProgressButton7 != null) {
            ProgressBar progressBar = voteProgressButton7.u;
            if (z) {
                progressBar.setVisibility(0);
            } else {
                progressBar.setVisibility(8);
            }
        }
    }

    private final void setBackgroundDrawable(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setTint(i);
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(iah0.b(16.0f));
        setBackground(gradientDrawable);
    }
}
