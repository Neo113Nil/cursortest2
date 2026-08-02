package com.yandex.div.legacy.dagger;

import android.view.ContextThemeWrapper;
import defpackage.f0d;
import defpackage.gtk;
import defpackage.hdu;
import defpackage.i0d;
import defpackage.k9y;
import defpackage.ryk;
import defpackage.yol;

@i0d
/* loaded from: classes11.dex */
public interface DivComponent {

    @f0d
    public interface Builder {
        Builder a(ContextThemeWrapper contextThemeWrapper);

        Builder b(ryk rykVar);

        Yatagan$DivComponent build();
    }

    void a();

    k9y b();

    yol c();

    gtk d();

    void e();

    hdu getStateManager();
}
