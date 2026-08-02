package com.yandex.plus.home.feature.webviews.internal.simple;

import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.home.feature.webviews.internal.container.b;
import com.yandex.plus.webview.core.resource.WebViewNavigationReason;
import defpackage.nzg;
import defpackage.ozg;
import defpackage.pzg;
import defpackage.qzg;
import defpackage.rzg;
import defpackage.skd0;
import defpackage.srd0;
import defpackage.szg;
import defpackage.tje;
import defpackage.tzg;
import defpackage.urd0;
import defpackage.vzg;
import defpackage.w511;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* synthetic */ class SimpleWebViewLayout$webViewController$2$4 extends FunctionReferenceImpl implements wls {
    public final Boolean i(urd0 urd0Var) {
        boolean z;
        a aVar = (a) this.receiver;
        aVar.getClass();
        if (urd0Var instanceof srd0) {
            srd0 srd0Var = (srd0) urd0Var;
            if (srd0Var.c != WebViewNavigationReason.REDIRECT) {
                Object j = aVar.l.j(srd0Var.a);
                Throwable a = Result.a(j);
                z = true;
                if (a == null) {
                    vzg vzgVar = (vzg) j;
                    if ((vzgVar instanceof ozg) || (vzgVar instanceof rzg) || (vzgVar instanceof szg) || (vzgVar instanceof nzg) || (vzgVar instanceof tzg) || (vzgVar instanceof pzg)) {
                        b.b(aVar.k, vzgVar, true, null, null, null, null, 60);
                    } else {
                        if (!(vzgVar instanceof qzg)) {
                            w511.b();
                            return null;
                        }
                        tje.N(aVar.e(), null, null, new SimpleWebViewLayoutPresenter$handleUrlLoading$1$1(vzgVar, aVar, null), 3);
                    }
                } else {
                    skd0.c(PlusLogTag.UI, "handleUrlLoading(" + urd0Var + ") error", a);
                }
                return Boolean.valueOf(z);
            }
        }
        aVar.t = urd0Var.getUri().toString();
        z = false;
        return Boolean.valueOf(z);
    }

    @Override // defpackage.wls
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return i((urd0) obj2);
    }
}
