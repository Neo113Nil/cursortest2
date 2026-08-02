package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.vk.dto.polls.PollOption;
import com.vkontakte.android.R;

/* compiled from: PollAnswerView.kt */
/* loaded from: classes4.dex */
public final class smb0 extends FrameLayout {
    public static final float j = iah0.a(48);
    public rv2 b;
    public tmb0 c;
    public final rmb0 d;
    public final TextView e;
    public final TextView f;
    public final AppCompatCheckBox g;
    public final ProgressBar h;
    public final rqb0 i;

    /* compiled from: PollAnswerView.kt */
    public static final class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            smb0 smb0Var = smb0.this;
            tmb0 tmb0Var = smb0Var.c;
            if (tmb0Var == null) {
                return;
            }
            rv2 rv2Var = smb0Var.b;
            if (rv2Var != null) {
                rv2Var.b(tmb0Var.a, z);
            }
            Drawable background = smb0Var.getBackground();
            if (background instanceof rqb0) {
                rqb0 rqb0Var = (rqb0) background;
                rqb0Var.a = tmb0Var.m;
                rqb0Var.setLevel(z ? 10000 : 0);
                rqb0Var.invalidateSelf();
            }
        }
    }

    public smb0(Context context) {
        super(context);
        this.d = new rmb0();
        rqb0 rqb0Var = new rqb0();
        rqb0Var.c = cn70.a() * 6.0f;
        this.i = rqb0Var;
        a aVar = new a();
        LayoutInflater.from(getContext()).inflate(R.layout.view_poll_option, this);
        this.e = (TextView) findViewById(R.id.option_name);
        this.f = (TextView) findViewById(R.id.results);
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) findViewById(R.id.multiple_choice_checkbox);
        this.g = appCompatCheckBox;
        this.h = (ProgressBar) findViewById(R.id.progress);
        setBackground(rqb0Var);
        appCompatCheckBox.setOnCheckedChangeListener(aVar);
    }

    public final PollOption getAnswerRaw() {
        tmb0 tmb0Var = this.c;
        if (tmb0Var != null) {
            return tmb0Var.b;
        }
        return null;
    }

    public final void setAnswerUiDto(tmb0 tmb0Var) {
        this.c = tmb0Var;
    }

    public final void setMultipleChoiceAnimationEnabled(boolean z) {
        if (z) {
            return;
        }
        this.g.jumpDrawablesToCurrentState();
    }

    public final void setMultipleChoiceClickable(boolean z) {
        this.g.setClickable(z);
    }

    public final void setMultipleChoiceVisibility(int i) {
        this.g.setVisibility(i);
    }

    public final void setMupltipleChoiceChecked(boolean z) {
        this.g.setChecked(z);
    }

    public final void setOnAnswerCheckedListener(rv2 rv2Var) {
        this.b = rv2Var;
    }
}
