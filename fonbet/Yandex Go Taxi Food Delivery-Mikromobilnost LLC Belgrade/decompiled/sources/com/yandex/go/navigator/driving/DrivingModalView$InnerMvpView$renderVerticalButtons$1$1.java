package com.yandex.go.navigator.driving;

import com.yandex.go.navigator.analitycs.NavigatorRevealCardAnalytics$DrivingModalState;
import defpackage.ikm;
import defpackage.imm;
import defpackage.tje;
import defpackage.tls;
import defpackage.vle;
import defpackage.zjm;
import defpackage.zle;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class DrivingModalView$InnerMvpView$renderVerticalButtons$1$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zle zleVar = (zle) obj;
        ikm ikmVar = (ikm) this.receiver;
        if (zleVar instanceof vle) {
            zjm zjmVar = ikmVar.z;
            r0 r0Var = zjmVar.g;
            imm immVar = new imm(true);
            r0Var.getClass();
            r0Var.m(null, immVar);
            zjmVar.f.c(NavigatorRevealCardAnalytics$DrivingModalState.Collapsed);
        }
        tje.N(ikmVar.Jg(), null, null, new DrivingModalPresenter$handleAction$1(ikmVar, zleVar, null), 3);
        return zy11.a;
    }
}
