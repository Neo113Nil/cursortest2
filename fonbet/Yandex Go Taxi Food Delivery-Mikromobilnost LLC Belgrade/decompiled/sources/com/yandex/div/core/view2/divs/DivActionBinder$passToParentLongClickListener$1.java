package com.yandex.div.core.view2.divs;

import android.view.View;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class DivActionBinder$passToParentLongClickListener$1 extends FunctionReferenceImpl implements tls {
    public static final DivActionBinder$passToParentLongClickListener$1 b = new DivActionBinder$passToParentLongClickListener$1(1, 1, a.class, "performLongClickOnAncestors", "performLongClickOnAncestors(Landroid/view/View;)Z");

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return Boolean.valueOf(a.C((View) obj));
    }
}
