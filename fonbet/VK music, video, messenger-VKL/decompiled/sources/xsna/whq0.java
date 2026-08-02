package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.drawee.drawable.RoundedCornersDrawable;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.cell.VkMiniInfoCell;
import com.vk.core.view.components.userstack.VkUserStack;
import com.vk.dto.common.ImageSize;
import com.vk.dto.friends.discover.UserDiscoverItem;
import com.vk.dto.photo.CropPhoto;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.f5h0;
import xsna.tlo0;

/* compiled from: UserDiscoverCardView.kt */
/* loaded from: classes13.dex */
public final class whq0 extends au9 implements zov, View.OnClickListener {
    public static final int E = iah0.a(1.0f);
    public final ArrayList<String> A;
    public final StringBuilder B;
    public final SpannableStringBuilder C;
    public final bik D;
    public cim0 e;
    public dsf0 f;
    public UserDiscoverItem g;
    public final ViewGroup h;
    public final VKImageView i;
    public final TextView j;
    public final View k;
    public final View l;
    public final TextView m;
    public final View n;
    public final TextView o;
    public final TextView p;
    public final VkMiniInfoCell q;
    public final View r;
    public final VkUserStack s;
    public final View t;
    public final View u;
    public final View v;
    public final View w;
    public final TextView x;
    public final TextView y;
    public final View z;

    public whq0(Context context) {
        super(context, R.layout.item_user_discover_card);
        this.A = new ArrayList<>();
        this.B = new StringBuilder();
        this.C = new SpannableStringBuilder();
        this.D = new bik();
        setBackgroundResource(R.drawable.bg_user_discover_card_rounded_tint);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.user_discover_info_container);
        this.h = viewGroup;
        RoundedCornersDrawable roundedCornersDrawable = new RoundedCornersDrawable(new ieh0());
        roundedCornersDrawable.f = RoundedCornersDrawable.Type.CLIPPING;
        roundedCornersDrawable.q();
        roundedCornersDrawable.invalidateSelf();
        float a = gbg0.a(getResources(), 12.0f);
        roundedCornersDrawable.i(new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, a, a, a, a});
        roundedCornersDrawable.e(true);
        roundedCornersDrawable.setAlpha(81);
        viewGroup.setBackground(roundedCornersDrawable);
        this.i = (VKImageView) findViewById(R.id.user_discover_photo);
        TextView textView = (TextView) findViewById(R.id.user_discover_mark);
        this.j = textView;
        Drawable a2 = m33.a(R.drawable.vk_icon_stars_20, context);
        if (a2 != null) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(new baf0(a2, -1), (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding(gbg0.a(getResources(), 12.0f));
        }
        this.k = findViewById(R.id.user_discover_placeholder);
        this.l = findViewById(R.id.user_discover_placeholder_icon);
        this.m = (TextView) findViewById(R.id.user_discover_placeholder_title);
        this.o = (TextView) findViewById(R.id.user_discover_title);
        this.p = (TextView) findViewById(R.id.user_discover_subtitle);
        this.q = (VkMiniInfoCell) findViewById(R.id.user_discover_status);
        this.r = findViewById(R.id.user_discover_divider);
        this.s = (VkUserStack) findViewById(R.id.user_discover_photos_container);
        View findViewById = findViewById(R.id.user_discover_message);
        this.n = findViewById;
        this.t = findViewById(R.id.user_discover_foreground_positive);
        this.u = findViewById(R.id.user_discover_foreground_negative);
        this.v = findViewById(R.id.user_discover_foreground_positive_icon);
        this.w = findViewById(R.id.user_discover_foreground_negative_icon);
        this.x = (TextView) findViewById(R.id.user_discover_foreground_positive_title);
        this.y = (TextView) findViewById(R.id.user_discover_foreground_negative_title);
        View findViewById2 = findViewById(R.id.user_discover_clickable);
        this.z = findViewById2;
        bwt0.h0(this, findViewById);
        bwt0.h0(this, findViewById2);
    }

    public static tlo0.h b(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(-1), 0, spannableStringBuilder.length(), 0);
        tlo0.Companion.getClass();
        return new tlo0.h(spannableStringBuilder);
    }

    @Override // xsna.zov
    public View getForegroundNegative() {
        return this.u;
    }

    @Override // xsna.zov
    public View getForegroundPositive() {
        return this.t;
    }

    @Override // xsna.zov
    public View getIconNegative() {
        return this.w;
    }

    @Override // xsna.zov
    public View getIconPositive() {
        return this.v;
    }

    @Override // xsna.zov
    public TextView getTitleNegative() {
        return this.y;
    }

    @Override // xsna.zov
    public TextView getTitlePositive() {
        return this.x;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        UserDiscoverItem userDiscoverItem;
        dsf0 dsf0Var;
        cim0 cim0Var;
        if (epx.f(view, this.n)) {
            UserDiscoverItem userDiscoverItem2 = this.g;
            if (userDiscoverItem2 == null || (cim0Var = this.e) == null) {
                return;
            }
            cim0Var.invoke(userDiscoverItem2);
            return;
        }
        if (!epx.f(view, this.z) || (userDiscoverItem = this.g) == null || (dsf0Var = this.f) == null) {
            return;
        }
        dsf0Var.invoke(userDiscoverItem);
    }

    @Override // xsna.au9, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        UserDiscoverItem userDiscoverItem = this.g;
        if (userDiscoverItem == null || !userDiscoverItem.S) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        bik bikVar = this.D;
        bikVar.f(measuredWidth, measuredHeight);
        CropPhoto cropPhoto = userDiscoverItem.Q;
        VKImageView vKImageView = this.i;
        if (cropPhoto == null) {
            vKImageView.setActualScaleType(f5h0.f.a);
            vKImageView.setPostprocessor(null);
            vKImageView.load(q6x.t(userDiscoverItem, Integer.valueOf(Math.max(getMeasuredWidth(), getMeasuredHeight()))));
        } else {
            CropPhoto.Crop crop = cropPhoto.c;
            bikVar.g(crop.b, crop.d, crop.c, crop.e);
            vKImageView.setActualScaleType(f5h0.m.a);
            vKImageView.setPostprocessor(bikVar);
            ImageSize b = cropPhoto.b(getMeasuredHeight());
            vKImageView.load(b != null ? b.d.d : null);
        }
    }
}
