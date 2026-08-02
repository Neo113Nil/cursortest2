package com.yandex.go.mainscreen.superapp.impl.foundation.presentation;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import defpackage.m2h0;
import defpackage.nwy0;
import defpackage.qje;
import defpackage.xng0;
import kotlin.Metadata;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/yandex/go/mainscreen/superapp/impl/foundation/presentation/UnsupportedAddressViewFactoryImpl$create$1", "Landroid/widget/ImageView;", "Lnwy0;", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "Lzy11;", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UnsupportedAddressViewFactoryImpl$create$1 extends ImageView implements nwy0 {
    public UnsupportedAddressViewFactoryImpl$create$1(Context context) {
        super(context);
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        setBackgroundColor(qje.t(xng0.bgMain, getContext()));
        if (themeType.f()) {
            setImageResource(m2h0.unsupported_address_main_screen_light);
        } else {
            setImageResource(m2h0.unsupported_address_main_screen_dark);
        }
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (View.MeasureSpec.getMode(heightMeasureSpec) == Integer.MIN_VALUE) {
            heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(heightMeasureSpec), 1073741824);
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
