package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.feed.design.view.newsfeed.text.BaseChipTextView;
import com.vkontakte.android.R;

/* compiled from: VkFeedInternalLinkView.kt */
/* loaded from: classes18.dex */
public final class ouu0 extends FrameLayout {
    public final BaseChipTextView b;

    public ouu0(Context context) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(R.layout.pds_internal_link, (ViewGroup) this, true);
        this.b = (BaseChipTextView) findViewById(R.id.pds_internal_link_text);
        setImportantForAccessibility(2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i) - (getPaddingRight() + getPaddingLeft());
        measureChildWithMargins(this.b, View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), 0, i2, 0);
        setMeasuredDimension(View.resolveSizeAndState(size, i, 0), View.resolveSizeAndState(Math.max(getPaddingTop() + getPaddingBottom() + this.b.getMeasuredHeight(), getSuggestedMinimumHeight()), i2, 0));
    }

    public final void setLinkContentDescription(tlo0 tlo0Var) {
        this.b.setContentDescription(tlo0Var.a(getContext()));
    }

    public final void setLinkText(tlo0 tlo0Var) {
        this.b.setText(tlo0Var.a(getContext()));
    }

    public final void setOnLinkClickListener(View.OnClickListener onClickListener) {
        this.b.setOnClickListener(onClickListener);
    }
}
