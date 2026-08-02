package com.yandex.go.superapp.searchbar.impl.ui;

import defpackage.cvw;
import defpackage.edw0;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class SuperappSearchbarAnimator$animateMode$2 extends FunctionReferenceImpl implements tls {
    final /* synthetic */ edw0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappSearchbarAnimator$animateMode$2(edw0 edw0Var) {
        super(1, 0, cvw.class, "animateProgress", "animateMode$animateProgress(Lcom/yandex/go/superapp/searchbar/impl/ui/SuperappSearchbarAnimator;F)V");
        this.this$0 = edw0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        edw0.a(this.this$0, ((Number) obj).floatValue());
        return zy11.a;
    }
}
