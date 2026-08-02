package defpackage;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes2.dex */
public final class cdg extends mz4 {
    public static final /* synthetic */ kgx[] n = {new PropertyReference1Impl("titleTextView", 0, "getTitleTextView()Landroid/widget/TextView;", cdg.class), b64.x(qoi0.a, cdg.class, "subtitleTextView", "getSubtitleTextView()Landroid/widget/TextView;", 0), new PropertyReference1Impl("dailyServicesView", 0, "getDailyServicesView()Lcom/yandex/plus/home/feature/panel/internalapi/shortcuts/daily/services/DailyServicesView;", cdg.class), new PropertyReference1Impl("descriptionTextView", 0, "getDescriptionTextView()Landroid/widget/TextView;", cdg.class), new PropertyReference1Impl("buttonTextView", 0, "getButtonTextView()Landroid/widget/TextView;", cdg.class), new PropertyReference1Impl("leftConfettiImageView", 0, "getLeftConfettiImageView()Lcom/google/android/material/imageview/ShapeableImageView;", cdg.class), new PropertyReference1Impl("rightConfettiImageView", 0, "getRightConfettiImageView()Lcom/google/android/material/imageview/ShapeableImageView;", cdg.class)};
    public final wv5 f;
    public final wv5 g;
    public final wv5 h;
    public final wv5 i;
    public final wv5 j;
    public final wv5 k;
    public final wv5 l;
    public final Drawable m;

    public cdg(ViewGroup viewGroup, b5d0 b5d0Var, boolean z, jse jseVar) {
        super(viewGroup, b5d0Var, z, jseVar);
        this.f = new wv5(new j6c(viewGroup, u9h0.plus_sdk_daily_bottom_view_title, 21));
        this.g = new wv5(new j6c(viewGroup, u9h0.plus_sdk_daily_bottom_view_subtitle, 22));
        this.h = new wv5(new j6c(viewGroup, u9h0.plus_sdk_daily_services_view, 23));
        this.i = new wv5(new j6c(viewGroup, u9h0.plus_sdk_daily_bottom_view_description, 24));
        this.j = new wv5(new j6c(viewGroup, u9h0.plus_sdk_daily_bottom_view_button, 25));
        this.k = new wv5(new j6c(viewGroup, u9h0.plus_sdk_daily_bottom_view_left_confetti, 26));
        this.l = new wv5(new j6c(viewGroup, u9h0.plus_sdk_daily_bottom_view_right_confetti, 27));
        this.m = vng.t(jxg0.plus_sdk_ic_daily_services_placeholder, viewGroup.getContext());
    }
}
