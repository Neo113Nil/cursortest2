package xsna;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.vkontakte.android.R;

/* compiled from: DefaultListEmptyView.java */
/* loaded from: classes3.dex */
public class phl extends LinearLayout {
    public TextView b;
    public TextView c;

    public phl(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public void a(Context context) {
        setOrientation(1);
        setGravity(1);
        LayoutInflater.from(context).inflate(R.layout.vk_view_default_list_empty_view, (ViewGroup) this, true);
        setPaddingRelative(0, Math.round(getContext().getResources().getDisplayMetrics().density * 64.0f), 0, Math.round(getContext().getResources().getDisplayMetrics().density * 64.0f));
        this.b = (TextView) findViewById(R.id.tv_empty_list_title);
        this.c = (TextView) findViewById(R.id.tv_empty_list_button);
    }

    public void setActionButtonVisible(boolean z) {
        this.c.setVisibility(z ? 0 : 8);
    }

    public void setActionListener(View.OnClickListener onClickListener) {
        this.c.setOnClickListener(onClickListener);
    }

    public void setActionText(String str) {
        this.c.setText(str);
    }

    public void setSpaceBetweenViews(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.c.getLayoutParams();
        marginLayoutParams.topMargin = i;
        this.c.setLayoutParams(marginLayoutParams);
    }

    public void setTitle(String str) {
        this.b.setText(str);
    }

    public void setTitle(int i) {
        this.b.setText(i);
    }
}
