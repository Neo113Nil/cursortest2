package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.vkontakte.android.R;
import java.util.HashMap;
import xsna.ucp;

/* compiled from: EmojiKeyboardImageView.kt */
/* loaded from: classes18.dex */
public final class rdp extends FrameLayout implements lep {
    public static final HashMap<String, Drawable> d = new HashMap<>();
    public final AppCompatImageView b;
    public final AppCompatImageView c;

    public rdp(Context context) {
        super(context);
        int a = (int) k46.a(getContext(), 4.0f);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        this.b = appCompatImageView;
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER);
        AppCompatImageView appCompatImageView2 = this.b;
        (appCompatImageView2 == null ? null : appCompatImageView2).setFocusable(false);
        AppCompatImageView appCompatImageView3 = this.b;
        (appCompatImageView3 == null ? null : appCompatImageView3).setFocusableInTouchMode(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        View view = this.b;
        addView(view == null ? null : view, layoutParams);
        AppCompatImageView appCompatImageView4 = new AppCompatImageView(context);
        appCompatImageView4.setImageResource(R.drawable.vk_emoji_keyboard_item_variants_marker_8);
        this.c = appCompatImageView4;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 85;
        layoutParams2.bottomMargin = a;
        layoutParams2.rightMargin = a;
        View view2 = this.c;
        addView(view2 != null ? view2 : null, layoutParams2);
        setBackgroundResource(R.drawable.vk_emoji_white_ripple_bounded);
        setFocusable(false);
        setFocusableInTouchMode(false);
        setContentDescription(getContext().getString(R.string.vk_accessibility_emoji));
    }

    public final void a(String str, boolean z) {
        AppCompatImageView appCompatImageView = this.c;
        if (appCompatImageView == null) {
            appCompatImageView = null;
        }
        appCompatImageView.setVisibility(z ? 0 : 8);
        AppCompatImageView appCompatImageView2 = this.b;
        if (appCompatImageView2 == null) {
            appCompatImageView2 = null;
        }
        HashMap<String, Drawable> hashMap = d;
        Drawable drawable = hashMap.get(str);
        if (drawable == null) {
            ucp ucpVar = ucp.a;
            udp d2 = ucp.d();
            int length = str.length();
            hep hepVar = d2.a;
            gep a = hepVar != null ? hepVar.a(0, length, str) : null;
            ucp.c cVar = a != null ? new ucp.c(a, ucp.i, 0, 0) : null;
            if (cVar != null) {
                hashMap.put(str, cVar);
            }
            drawable = cVar;
        }
        appCompatImageView2.setImageDrawable(drawable);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) getResources().getDimension(R.dimen.vk_emoji_keyboard_item_width), 1073741824), View.MeasureSpec.makeMeasureSpec((int) getResources().getDimension(R.dimen.vk_emoji_keyboard_item_height), 1073741824));
    }

    @Override // xsna.lep
    public final void y() {
        AppCompatImageView appCompatImageView = this.b;
        if (appCompatImageView == null) {
            appCompatImageView = null;
        }
        appCompatImageView.invalidate();
    }
}
