package xsna;

import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.floating_view.FloatingViewGesturesHelper;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;

/* compiled from: FloatingSuggestView.kt */
/* loaded from: classes4.dex */
public final class gsr extends FrameLayout implements View.OnClickListener, dc6 {
    public fsr b;
    public TextView c;
    public TextView d;
    public ImageView e;
    public View f;
    public VKImageView g;
    public VKImageView h;
    public FloatingViewGesturesHelper i;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == R.id.floating_placeholder_close_button) {
            fsr presenter = getPresenter();
            if (presenter != null) {
                presenter.o();
                return;
            }
            return;
        }
        fsr presenter2 = getPresenter();
        if (presenter2 != null) {
            presenter2.C1();
        }
    }

    public void setActionText(String str) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setActionTextColor(int i) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public void setBackgroundViewColor(int i) {
        setBackgroundResource(R.drawable.bg_floating_placeholder);
        getBackground().setColorFilter(i, PorterDuff.Mode.SRC_IN);
    }

    public void setCloseButtonColor(int i) {
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setColorFilter(i, PorterDuff.Mode.SRC_IN);
        }
    }

    public void setIsVisible(boolean z) {
        FloatingViewGesturesHelper floatingViewGesturesHelper;
        bwt0.p0(this, z);
        if (!z || (floatingViewGesturesHelper = this.i) == null) {
            return;
        }
        floatingViewGesturesHelper.b.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public void setTitleText(String str) {
        TextView textView = this.c;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setTitleTextColor(int i) {
        TextView textView = this.c;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    @Override // xsna.dc6
    public fsr getPresenter() {
        return this.b;
    }

    @Override // xsna.dc6
    public void setPresenter(fsr fsrVar) {
        this.b = fsrVar;
    }
}
