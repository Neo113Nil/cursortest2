package com.yandex.go.flex.main_screen.interactors;

import defpackage.gw00;
import defpackage.sls;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class MainScreenDocumentQueryFactory$createDocumentQuery$2 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        String a = ((d) this.receiver).b.a();
        return a != null ? gw00.e(new Pair("superapp_session", Collections.singletonList(a))) : kotlin.collections.b.f();
    }
}
