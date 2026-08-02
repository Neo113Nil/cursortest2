package com.monetization.ads.instream.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.app.e;
import androidx.core.app.m;
import com.yandex.mobile.ads.R$dimen;
import com.yandex.mobile.ads.R$drawable;
import com.yandex.mobile.ads.R$string;
import com.yandex.mobile.ads.R$styleable;
import defpackage.gw81;
import defpackage.hn81;
import defpackage.m5z;
import defpackage.vi81;
import defpackage.w511;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/monetization/ads/instream/view/InstreamMuteView;", "Landroid/widget/ImageView;", "Lhn81;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "muted", "Lzy11;", "setMuted", "(Z)V", "mobileads_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InstreamMuteView extends ImageView implements hn81 {
    private final vi81 a;
    private boolean b;

    public InstreamMuteView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MonetizationAdsInternalInstreamMuteView);
        int resourceId = obtainStyledAttributes.getResourceId(R$styleable.MonetizationAdsInternalInstreamMuteView_monetization_internal_sound_on, R$drawable.monetization_ads_internal_ic_sound_on_default);
        int resourceId2 = obtainStyledAttributes.getResourceId(R$styleable.MonetizationAdsInternalInstreamMuteView_monetization_internal_sound_off, R$drawable.monetization_ads_internal_ic_sound_off_default);
        int i2 = R$string.monetization_ads_internal_instream_muted;
        int i3 = R$string.monetization_ads_internal_instream_unmuted;
        obtainStyledAttributes.recycle();
        this.a = new vi81(new gw81(resourceId2, resourceId, i2, i3));
        setMuted(this.b);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        Resources resources = getResources();
        setMeasuredDimension(resources.getDimensionPixelSize(R$dimen.monetization_instream_internal_mute_width_v2), resources.getDimensionPixelSize(R$dimen.monetization_instream_internal_mute_height_v2));
    }

    public void setMuted(boolean muted) {
        int i;
        m5z a;
        this.b = muted;
        gw81 gw81Var = this.a.a;
        int i2 = muted ? gw81Var.a : gw81Var.b;
        if (muted) {
            i = gw81Var.c;
        } else {
            if (muted) {
                w511.b();
                return;
            }
            i = gw81Var.d;
        }
        setBackground(getContext().getDrawable(i2));
        Context context = getContext();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33) {
            Object systemService = context.getSystemService("locale");
            a = systemService != null ? m5z.e(m.a(systemService)) : m5z.b;
        } else {
            a = m5z.a(e.f(context));
        }
        if (i3 <= 32 && !a.c()) {
            Configuration configuration = new Configuration(context.getResources().getConfiguration());
            configuration.setLocales(a.a.a);
            context = context.createConfigurationContext(configuration);
        }
        setContentDescription(context.getString(i));
    }

    public InstreamMuteView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ InstreamMuteView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public InstreamMuteView(Context context) {
        this(context, null, 0, 6, null);
    }
}
