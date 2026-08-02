package xsna;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.design.ui.themehelper.R$styleable;
import com.vkontakte.android.R;

/* compiled from: SettingsView.kt */
/* loaded from: classes17.dex */
public abstract class w3j0 extends LinearLayout implements View.OnClickListener {
    public final TextView b;
    public final CompoundButton c;
    public CompoundButton.OnCheckedChangeListener d;

    public w3j0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final boolean a() {
        CompoundButton compoundButton = this.c;
        if (compoundButton != null) {
            return compoundButton.isChecked();
        }
        return false;
    }

    public abstract int getLayoutId();

    public final float getTextSize() {
        TextView textView = this.b;
        return textView == null ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : textView.getTextSize();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CompoundButton compoundButton = this.c;
        if (compoundButton != null) {
            boolean z = !compoundButton.isChecked();
            if (compoundButton != null) {
                compoundButton.setChecked(z);
            }
            CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.d;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.onCheckedChanged(compoundButton, z);
            }
        }
    }

    public final void setButtonEnabled(boolean z) {
        TextView textView = this.b;
        if (textView != null) {
            textView.setEnabled(z);
        }
        CompoundButton compoundButton = this.c;
        if (compoundButton != null) {
            compoundButton.setEnabled(z);
        }
        setOnClickListener(z ? this : null);
    }

    public final void setChecked(boolean z) {
        CompoundButton compoundButton = this.c;
        if (compoundButton != null) {
            compoundButton.setChecked(z);
        }
    }

    public final void setOnCheckedChangesListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.d = onCheckedChangeListener;
    }

    public final void setTextSize(float f) {
        TextView textView = this.b;
        if (textView != null) {
            textView.setTextSize(0, f);
        }
    }

    public final void setTitle(CharSequence charSequence) {
        TextView textView = this.b;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final void setTitleResId(int i) {
        TextView textView = this.b;
        if (textView != null) {
            textView.setText(i);
        }
    }

    public w3j0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        CharSequence text;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.n);
        if (obtainStyledAttributes != null) {
            try {
                text = obtainStyledAttributes.getText(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            text = null;
        }
        if (obtainStyledAttributes != null) {
        }
        setLayoutParams(new ViewGroup.LayoutParams(-1, e3m.a(R.dimen.settings_view_height, context)));
        setOrientation(0);
        int dimension = (int) context.getResources().getDimension(R.dimen.standard_list_item_padding);
        setPadding(dimension, getPaddingTop(), dimension, getPaddingBottom());
        setBackground(dhr0.t.a(R.drawable.highlight));
        LayoutInflater.from(context).inflate(getLayoutId(), (ViewGroup) this, true);
        this.b = (TextView) findViewById(R.id.tv_title);
        CompoundButton compoundButton = (CompoundButton) findViewById(R.id.view_compound);
        compoundButton.setClickable(false);
        this.c = compoundButton;
        setOnClickListener(this);
        setTitle(text != null ? text.toString() : null);
    }
}
