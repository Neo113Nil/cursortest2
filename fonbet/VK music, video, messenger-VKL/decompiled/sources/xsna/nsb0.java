package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.vk.core.serialize.Serializer;
import com.vk.dto.polls.Poll;
import com.vk.dto.polls.PollOption;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: PollV3OptionView.kt */
/* loaded from: classes4.dex */
public final class nsb0 extends FrameLayout {
    public a b;
    public final TextView c;
    public final TextView d;
    public final AppCompatCheckBox e;
    public final ProgressBar f;
    public final rqb0 g;
    public PollOption h;

    /* compiled from: PollV3OptionView.kt */
    public interface a {
        void a(long j);
    }

    public nsb0(Context context) {
        super(context, null, 0);
        rqb0 rqb0Var = new rqb0();
        this.g = rqb0Var;
        LayoutInflater.from(context).inflate(R.layout.view_poll_option_v3, this);
        this.c = (TextView) findViewById(R.id.option_name);
        this.d = (TextView) findViewById(R.id.results);
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) findViewById(R.id.multiple_choice_checkbox);
        this.e = appCompatCheckBox;
        this.f = (ProgressBar) findViewById(R.id.progress);
        setBackground(rqb0Var);
        appCompatCheckBox.setOnClickListener(new isk(this, 5));
    }

    private final Drawable getDoneDrawable() {
        Drawable newDrawable;
        Drawable a2 = m33.a(R.drawable.vk_icon_done_16, getContext());
        Drawable drawable = null;
        if (a2 != null) {
            Drawable.ConstantState constantState = a2.getConstantState();
            if (constantState != null && (newDrawable = constantState.newDrawable()) != null) {
                drawable = newDrawable.mutate();
            }
            if (drawable != null) {
                drawable.setTint(e3m.f(R.attr.vk_ui_icon_accent, getContext()));
            }
        }
        return drawable;
    }

    public final void a(Poll poll, PollOption pollOption, boolean z) {
        String a2;
        float f = pollOption.e;
        String str = pollOption.c;
        this.h = pollOption;
        List<Long> list = poll.e;
        long j = pollOption.b;
        boolean contains = list.contains(Long.valueOf(j));
        boolean Bb = poll.Bb();
        boolean Ib = poll.Ib();
        boolean z2 = Ib && Bb && poll.x.contains(Long.valueOf(j));
        AppCompatCheckBox appCompatCheckBox = this.e;
        appCompatCheckBox.setChecked(z2);
        appCompatCheckBox.jumpDrawablesToCurrentState();
        bwt0.p0(appCompatCheckBox, Ib && Bb);
        appCompatCheckBox.setButtonTintList(new ColorStateList(new int[][]{new int[]{-16842912}, new int[]{android.R.attr.state_checked}}, new int[]{e3m.f(R.attr.vk_ui_icon_tertiary, getContext()), e3m.f(R.attr.vk_ui_icon_accent, getContext())}));
        String str2 = Bb ? str : null;
        TextView textView = this.c;
        textView.setContentDescription(str2);
        textView.setText(str);
        textView.setTextColor(e3m.f(R.attr.vk_ui_text_primary, textView.getContext()));
        if (Bb) {
            a2 = "";
        } else {
            Serializer.c<PollOption> cVar = PollOption.CREATOR;
            a2 = PollOption.a.a(f);
        }
        TextView textView2 = this.d;
        textView2.setText(a2);
        textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(contains ? getDoneDrawable() : null, (Drawable) null, (Drawable) null, (Drawable) null);
        bwt0.p0(textView2, !Bb);
        textView2.setTextColor(e3m.f(R.attr.vk_ui_text_secondary, textView2.getContext()));
        Drawable background = getBackground();
        rqb0 rqb0Var = background instanceof rqb0 ? (rqb0) background : null;
        if (rqb0Var != null) {
            rqb0Var.a(Bb ? 0 : Math.round((f / 100) * 10000), z);
            rqb0Var.b = e3m.f(R.attr.vk_ui_background_secondary, getContext());
            rqb0Var.a = l8g.f(0.2f, e3m.f(R.attr.vk_ui_background_accent_themed, getContext()));
        }
        ProgressBar progressBar = this.f;
        progressBar.setVisibility(8);
        progressBar.getIndeterminateDrawable().setColorFilter(e3m.f(R.attr.vk_ui_icon_accent, getContext()), PorterDuff.Mode.MULTIPLY);
        setForeground(Bb ? m33.a(R.drawable.poll_option_no_background_selector, getContext()) : null);
    }

    public final a getOnOptionCheckedListenerListener() {
        return this.b;
    }

    public final void setCornerRadius(float f) {
        rqb0 rqb0Var = this.g;
        rqb0Var.c = f;
        rqb0Var.invalidateSelf();
    }

    public final void setOnOptionCheckedListenerListener(a aVar) {
        this.b = aVar;
    }
}
