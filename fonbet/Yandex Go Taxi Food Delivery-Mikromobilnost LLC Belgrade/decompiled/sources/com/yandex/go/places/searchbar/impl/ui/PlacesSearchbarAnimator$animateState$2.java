package com.yandex.go.places.searchbar.impl.ui;

import defpackage.cvw;
import defpackage.gec0;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class PlacesSearchbarAnimator$animateState$2 extends FunctionReferenceImpl implements tls {
    final /* synthetic */ gec0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesSearchbarAnimator$animateState$2(gec0 gec0Var) {
        super(1, 0, cvw.class, "animateProgress", "animateState$animateProgress(Lcom/yandex/go/places/searchbar/impl/ui/PlacesSearchbarAnimator;F)V");
        this.this$0 = gec0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        gec0.a(this.this$0, ((Number) obj).floatValue());
        return zy11.a;
    }
}
