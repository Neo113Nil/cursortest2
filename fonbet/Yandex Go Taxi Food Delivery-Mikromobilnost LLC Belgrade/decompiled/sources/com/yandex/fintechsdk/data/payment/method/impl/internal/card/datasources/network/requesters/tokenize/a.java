package com.yandex.fintechsdk.data.payment.method.impl.internal.card.datasources.network.requesters.tokenize;

import com.yandex.fintechsdk.data.payment.method.impl.internal.card.datasources.network.requesters.tokenize.request.TokenizeMethodDto;
import com.ybsdk.widgets.common.MoneyInputEditView;
import defpackage.an11;
import defpackage.boz0;
import defpackage.cvu0;
import defpackage.eoz0;
import defpackage.evu0;
import defpackage.hoz0;
import defpackage.nnz0;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.phj;
import defpackage.qnz0;
import defpackage.qoi0;
import defpackage.rnz0;
import defpackage.tnz0;
import defpackage.w511;
import defpackage.wnz0;
import defpackage.xnz0;
import java.net.URI;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a extends com.yandex.fintechsdk.core.network.api.request.a {
    public final phj b;

    public a(phj phjVar) {
        super(0);
        this.b = phjVar;
    }

    @Override // com.yandex.fintechsdk.core.network.api.request.a
    public final Object a(Object obj) {
        rnz0 rnz0Var = (rnz0) obj;
        nnz0 nnz0Var = rnz0Var.c;
        URI uri = new URI(rnz0Var.a);
        String path = uri.getPath();
        String n0 = path != null ? evu0.n0(path, '/') : null;
        if (n0 == null) {
            n0 = "";
        }
        String q = oyr.q(uri.getScheme(), "://", uri.getHost(), uri.getPort() != -1 ? oyr.i(uri.getPort(), ":") : "", evu0.z(n0, '/') ? evu0.h0('/', n0, n0) : "");
        boolean z = rnz0Var.d;
        if (xnz0.a[rnz0Var.e.ordinal()] != 1) {
            w511.b();
            return null;
        }
        String value = TokenizeMethodDto.CARD.getValue();
        String v = cvu0.v(nnz0Var.c, " ", "", false);
        String str = nnz0Var.b;
        if (str.length() <= 2) {
            str = "20".concat(str);
        }
        return new tnz0(q, new wnz0(rnz0Var.b, new qnz0(nnz0Var.d, evu0.N(MoneyInputEditView.DEFAULT_VALUE, 2, nnz0Var.a), str, v), value), z);
    }

    @Override // com.yandex.fintechsdk.core.network.api.request.a
    public final Object d(Object obj) {
        boz0 boz0Var = (boz0) obj;
        eoz0 eoz0Var = boz0Var.b;
        return new hoz0(eoz0Var.a, eoz0Var.b, boz0Var.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.fintechsdk.core.network.api.request.a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(tnz0 tnz0Var, ContinuationImpl continuationImpl) {
        TokenizeRequester$executeRequest$1 tokenizeRequester$executeRequest$1;
        int i;
        if (continuationImpl instanceof TokenizeRequester$executeRequest$1) {
            tokenizeRequester$executeRequest$1 = (TokenizeRequester$executeRequest$1) continuationImpl;
            int i2 = tokenizeRequester$executeRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tokenizeRequester$executeRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = tokenizeRequester$executeRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tokenizeRequester$executeRequest$1.label;
                if (i == 0) {
                    if (i == 1) {
                        b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                an11 e = qoi0.e(boz0.class);
                tokenizeRequester$executeRequest$1.label = 1;
                com.yandex.fintechsdk.core.network.impl.internal.network.a aVar = (com.yandex.fintechsdk.core.network.impl.internal.network.a) this.b;
                aVar.getClass();
                Object d = com.yandex.fintechsdk.core.network.impl.internal.network.a.d(aVar, tnz0Var, e, tokenizeRequester$executeRequest$1);
                return d == coroutineSingletons ? coroutineSingletons : d;
            }
        }
        tokenizeRequester$executeRequest$1 = new TokenizeRequester$executeRequest$1(this, continuationImpl);
        Object obj2 = tokenizeRequester$executeRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tokenizeRequester$executeRequest$1.label;
        if (i == 0) {
        }
    }
}
