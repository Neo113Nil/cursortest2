package com.vkontakte.android.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.vkontakte.android.R;

@Deprecated
/* loaded from: classes7.dex */
public class LoadMoreCommentsView extends FrameLayout {
    public View b;
    public TextView c;

    public LoadMoreCommentsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public final void a(boolean z) {
        View view = this.b;
        if (view != null) {
            view.setVisibility(z ? 0 : 4);
        }
        TextView textView = this.c;
        if (textView != null) {
            textView.setVisibility(z ? 4 : 0);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.b = findViewById(R.id.loadmore_progress);
        this.c = (TextView) findViewById(R.id.loadmore_text);
    }

    public void setNumComments(int i) {
        TextView textView = this.c;
        if (textView != null) {
            textView.setText(getResources().getQuantityString(R.plurals.wallview_comments, i, Integer.valueOf(i)));
        }
    }

    public void setText(CharSequence charSequence) {
        TextView textView = this.c;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
