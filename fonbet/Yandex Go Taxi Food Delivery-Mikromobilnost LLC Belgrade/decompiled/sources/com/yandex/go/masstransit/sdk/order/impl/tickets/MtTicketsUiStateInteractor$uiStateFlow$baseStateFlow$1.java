package com.yandex.go.masstransit.sdk.order.impl.tickets;

import defpackage.avj0;
import defpackage.cyh0;
import defpackage.d940;
import defpackage.f310;
import defpackage.g310;
import defpackage.h310;
import defpackage.i310;
import defpackage.jl40;
import defpackage.k940;
import defpackage.l940;
import defpackage.q6o;
import defpackage.w511;
import defpackage.zls;
import defpackage.zrm;
import defpackage.zuj0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class MtTicketsUiStateInteractor$uiStateFlow$baseStateFlow$1 extends FunctionReferenceImpl implements zls {
    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        i310 i310Var = (i310) obj;
        Map map = (Map) obj2;
        Continuation continuation = (Continuation) obj3;
        m mVar = (m) this.receiver;
        zuj0 zuj0Var = mVar.b;
        if (jl40.l(i310Var, g310.a)) {
            return new l940(((avj0) zuj0Var).h(cyh0.mt_sdk_loading_popup_title));
        }
        if (i310Var instanceof h310) {
            h310 h310Var = (h310) i310Var;
            return mVar.e(h310Var.a, h310Var.c, map, h310Var.b, continuation);
        }
        if (!(i310Var instanceof f310)) {
            w511.b();
            return null;
        }
        String str = ((f310) i310Var).a;
        avj0 avj0Var = (avj0) zuj0Var;
        return new k940(str, new q6o(mVar.g, avj0Var.h(cyh0.mt_sdk_error_popup_title), avj0Var.h(cyh0.mt_sdk_error_popup_subtitle), new zrm(11, avj0Var.h(cyh0.mt_sdk_error_popup_button_text), new d940(str == null ? "" : str))));
    }
}
