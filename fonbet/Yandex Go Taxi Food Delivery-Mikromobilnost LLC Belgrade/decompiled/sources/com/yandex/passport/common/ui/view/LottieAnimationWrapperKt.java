package com.yandex.passport.common.ui.view;

import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import defpackage.kp31;
import defpackage.lzx;
import defpackage.tls;
import defpackage.wj91;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aU\u0010\u000b\u001a\u00020\n*\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00012\b\b\u0003\u0010\u0003\u001a\u00020\u00012\b\b\u0003\u0010\u0004\u001a\u00020\u00012\b\b\u0003\u0010\u0005\u001a\u00020\u00012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\r"}, d2 = {"Lkp31;", "", "id", "themeRes", "styleAttr", "styleRes", "Lkotlin/Function1;", "Lcom/yandex/passport/common/ui/view/LottieAnimationViewBuilder;", "Lzy11;", "init", "Lcom/airbnb/lottie/LottieAnimationView;", "lottieProgressBar", "(Lkp31;IIIILtls;)Lcom/airbnb/lottie/LottieAnimationView;", "passport-common_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LottieAnimationWrapperKt {
    public static final LottieAnimationView lottieProgressBar(kp31 kp31Var, int i, int i2, int i3, int i4, tls tlsVar) {
        View view = (View) LottieAnimationWrapperKt$lottieProgressBar$$inlined$view$1.b.invoke(wj91.e(i2, kp31Var.getCtx()), Integer.valueOf(i3), Integer.valueOf(i4));
        if (i != -1) {
            view.setId(i);
        }
        if (kp31Var instanceof lzx) {
            ((lzx) kp31Var).addToParent(view);
        }
        tlsVar.invoke(view);
        return (LottieAnimationView) view;
    }
}
