package defpackage;

import com.ybsdk.di.modules.features.o;
import com.ybsdk.feature.redirect.url.internal.presentation.RedirectUrlParams;
import com.ybsdk.feature.redirect.url.internal.presentation.a;

/* loaded from: classes3.dex */
public final class fmi0 implements ami0 {
    public final kdd0 a;

    public fmi0(kdd0 kdd0Var) {
        this.a = kdd0Var;
    }

    public final a a(RedirectUrlParams redirectUrlParams) {
        kdd0 kdd0Var = this.a;
        return new a(redirectUrlParams, (o) ((c6g) kdd0Var.a).get(), (tfl0) ((c6g) kdd0Var.b).get(), (sue0) ((c6g) kdd0Var.c).get(), (if8) ((c6g) kdd0Var.d).get());
    }
}
