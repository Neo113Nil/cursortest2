package com.vkontakte.android.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vkontakte.android.R;

/* loaded from: classes7.dex */
public class EmptyView extends LinearLayout {
    public static final /* synthetic */ int b = 0;

    public EmptyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setButtonText(CharSequence charSequence) {
        ((TextView) findViewById(R.id.empty_button)).setText(charSequence);
    }

    public void setButtonVisible(boolean z) {
        findViewById(R.id.empty_button).setVisibility(z ? 0 : 8);
    }

    public void setOnBtnClickListener(View.OnClickListener onClickListener) {
        findViewById(R.id.empty_button).setOnClickListener(onClickListener);
    }

    public void setText(CharSequence charSequence) {
        ((TextView) findViewById(R.id.empty_text)).setText(charSequence);
    }

    public void setButtonText(int i) {
        ((TextView) findViewById(R.id.empty_button)).setText(i);
    }

    public void setText(int i) {
        ((TextView) findViewById(R.id.empty_text)).setText(i);
    }
}
