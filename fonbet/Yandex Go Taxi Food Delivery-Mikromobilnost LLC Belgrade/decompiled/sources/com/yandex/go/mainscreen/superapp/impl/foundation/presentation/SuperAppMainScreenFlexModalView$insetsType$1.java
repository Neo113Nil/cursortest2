package com.yandex.go.mainscreen.superapp.impl.foundation.presentation;

import android.view.View;
import defpackage.bau;
import defpackage.lbw0;
import defpackage.t1w;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* synthetic */ class SuperAppMainScreenFlexModalView$insetsType$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        View view = ((bau) ((lbw0) this.receiver).c.getValue()).a;
        int paddingTop = view.getPaddingTop();
        int i = ((t1w) obj).b;
        if (paddingTop != i) {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), view.getPaddingBottom());
        }
        return zy11.a;
    }
}
