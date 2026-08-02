package com.yandex.div.core.dagger;

import android.content.Context;
import com.yandex.div.core.dagger.Div2Component;
import defpackage.am2;
import defpackage.f0d;
import defpackage.i0d;
import defpackage.v2l;
import defpackage.xku;
import kotlin.Metadata;

@i0d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/dagger/DivKitComponent;", "", "Builder", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface DivKitComponent {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/dagger/DivKitComponent$Builder;", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @f0d
    public interface Builder {
        Builder a(Context context);

        Builder b(am2 am2Var);

        Yatagan$DivKitComponent build();
    }

    xku a();

    v2l b();

    Div2Component.Builder c();
}
