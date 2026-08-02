package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import org.chromium.base.version_info.VersionConstants;
import xsna.e3m;

/* compiled from: AlbumAttachViewGroup.kt */
/* loaded from: classes4.dex */
public final class ad1 extends ViewGroup {
    public final AppCompatTextView b;
    public final AppCompatTextView c;
    public final AppCompatTextView d;
    public final View e;
    public View f;
    public final int g;

    public ad1(Context context) {
        super(context, null, 0);
        AppCompatTextView appCompatTextView = new AppCompatTextView(new ContextThemeWrapper(context, R.style.VkUiTypography_Title2Medium));
        this.b = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(new ContextThemeWrapper(context, R.style.VkUiTypography_Subhead));
        this.c = appCompatTextView2;
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(context);
        this.d = appCompatTextView3;
        View view = new View(context);
        this.e = view;
        this.g = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
        setClipToPadding(false);
        appCompatTextView.setTextColor(-1);
        appCompatTextView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        appCompatTextView.setEllipsize(truncateAt);
        e3m.a aVar = e3m.a;
        appCompatTextView2.setTextColor(l8g.g(context.getColor(R.color.vk_white), 80));
        appCompatTextView2.setSingleLine(true);
        appCompatTextView2.setEllipsize(truncateAt);
        appCompatTextView3.setTextColor(-1);
        com.vk.typography.b.k(appCompatTextView3, FontFamily.MEDIUM, Float.valueOf(12.0f), 4);
        appCompatTextView3.setIncludeFontPadding(false);
        appCompatTextView3.setCompoundDrawablePadding(cn70.b(6));
        setLabelDrawable(R.drawable.ic_photoalbum_mosaic);
        appCompatTextView3.setBackgroundResource(R.drawable.bg_video_duration_label_old);
        appCompatTextView3.setPadding(cn70.b(8), cn70.b(4), cn70.b(8), cn70.b(4));
        appCompatTextView3.setSingleLine(true);
        appCompatTextView3.setEllipsize(truncateAt);
        view.setBackground(m33.a(R.drawable.scrim_attach_bottom, context));
        addView(view);
        addView(appCompatTextView);
        addView(appCompatTextView2);
        addView(appCompatTextView3);
        bwt0.e0(appCompatTextView3, cn70.b(4), cn70.b(4), cn70.b(4), cn70.b(4));
    }

    public final int a(AppCompatTextView appCompatTextView, int i) {
        if (appCompatTextView.getVisibility() != 8) {
            if (appCompatTextView.getMeasuredHeight() > 0) {
                int paddingLeft = getPaddingLeft();
                int measuredWidth = getMeasuredWidth() - getPaddingRight();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) appCompatTextView.getLayoutParams();
                int measuredWidth2 = appCompatTextView.getMeasuredWidth();
                int measuredHeight = appCompatTextView.getMeasuredHeight();
                int a = (defpackage.j0.a(measuredWidth, paddingLeft, measuredWidth2, 2, paddingLeft) + marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin;
                int i2 = (i - measuredHeight) - marginLayoutParams.bottomMargin;
                appCompatTextView.layout(a, i2, measuredWidth2 + a, measuredHeight + i2);
                return i2 - marginLayoutParams.topMargin;
            }
            appCompatTextView.layout(0, 0, 0, 0);
        }
        return i;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view = this.f;
        if (view == null) {
            throw new IllegalStateException("contentView is not set");
        }
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        int i5 = i4 - i2;
        View view2 = this.e;
        view2.layout(0, i5 - view2.getMeasuredHeight(), view2.getMeasuredWidth(), i5);
        AppCompatTextView appCompatTextView = this.d;
        if (appCompatTextView.getVisibility() != 8) {
            if (appCompatTextView.getMeasuredHeight() > 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) appCompatTextView.getLayoutParams();
                int measuredWidth = getMeasuredWidth() - marginLayoutParams.rightMargin;
                appCompatTextView.layout(measuredWidth - appCompatTextView.getMeasuredWidth(), (getMeasuredHeight() - appCompatTextView.getMeasuredHeight()) - marginLayoutParams.bottomMargin, measuredWidth, getMeasuredHeight() - marginLayoutParams.bottomMargin);
            } else {
                appCompatTextView.layout(0, 0, 0, 0);
            }
        }
        a(this.b, a(this.c, i5 - getPaddingBottom()));
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View view = this.f;
        if (view == null) {
            throw new IllegalStateException("contentView is not set");
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        view.measure(i, i2);
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int a = gp10.a(i, suggestedMinimumWidth, measuredWidth, paddingRight);
        int a2 = gp10.a(i2, suggestedMinimumHeight, measuredHeight, paddingBottom);
        int b = cn70.b(VersionConstants.PRODUCT_MAJOR_VERSION);
        View view2 = this.e;
        AppCompatTextView appCompatTextView = this.c;
        AppCompatTextView appCompatTextView2 = this.b;
        AppCompatTextView appCompatTextView3 = this.d;
        int i3 = this.g;
        if (a < b) {
            if (appCompatTextView3.getVisibility() != 8) {
                appCompatTextView3.measure(tr.a(a, 1073741823, 0, Integer.MIN_VALUE), tr.a(a2, 1073741823, 0, Integer.MIN_VALUE));
            }
            appCompatTextView2.measure(i3, i3);
            appCompatTextView.measure(i3, i3);
            view2.measure(i3, i3);
        } else {
            appCompatTextView3.measure(i3, i3);
            if (appCompatTextView2.getVisibility() != 8) {
                appCompatTextView2.measure(tr.a(a, 1073741823, 0, Integer.MIN_VALUE), tr.a(a2, 1073741823, 0, Integer.MIN_VALUE));
            }
            if (appCompatTextView.getVisibility() != 8) {
                appCompatTextView.measure(tr.a(a, 1073741823, 0, Integer.MIN_VALUE), tr.a(a2, 1073741823, 0, Integer.MIN_VALUE));
            }
            int a3 = tr.a(measuredWidth, 1073741823, 0, 1073741824);
            Drawable background = view2.getBackground();
            view2.measure(a3, tr.a(background != null ? background.getMinimumHeight() : 0, 1073741823, 0, 1073741824));
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
    }

    public final void setContentView(View view) {
        View view2 = this.f;
        if (view2 != null) {
            removeView(view2);
        }
        addView(view, 0, new ViewGroup.LayoutParams(-1, -1));
        this.f = view;
    }

    public final void setLabel(CharSequence charSequence) {
        AppCompatTextView appCompatTextView = this.d;
        appCompatTextView.setText(charSequence);
        bwt0.p0(appCompatTextView, !(charSequence == null || charSequence.length() == 0));
    }

    public final void setLabelDrawable(int i) {
        his0.v(this.d, i, 0);
    }

    public final void setSubtitle(CharSequence charSequence) {
        AppCompatTextView appCompatTextView = this.c;
        appCompatTextView.setText(charSequence);
        bwt0.p0(appCompatTextView, !(charSequence == null || charSequence.length() == 0));
    }

    public final void setTitle(CharSequence charSequence) {
        AppCompatTextView appCompatTextView = this.b;
        appCompatTextView.setText(charSequence);
        bwt0.p0(appCompatTextView, !(charSequence == null || charSequence.length() == 0));
    }

    public final void setLabelDrawable(Drawable drawable) {
        this.d.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }
}
