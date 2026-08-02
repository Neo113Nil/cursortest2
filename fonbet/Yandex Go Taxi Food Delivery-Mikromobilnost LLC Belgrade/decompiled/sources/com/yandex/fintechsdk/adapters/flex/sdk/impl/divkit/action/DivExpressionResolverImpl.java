package com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.action;

import android.net.Uri;
import com.yandex.div.json.expressions.a;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.expression.BduiExpressionResolverImpl;
import defpackage.apk;
import defpackage.dxf0;
import defpackage.eg90;
import defpackage.lhj;
import defpackage.rms;
import defpackage.rvo;
import defpackage.ums;
import defpackage.wm11;
import defpackage.z3k;
import kotlin.Metadata;
import kotlin.Result;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000bJ%\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/divkit/action/DivExpressionResolverImpl;", "Lapk;", "Lrvo;", "expressionResolver", "<init>", "(Lrvo;)V", "", BduiExpressionResolverImpl.EXPRESSION_KEY, "expressionKey", "Lkotlin/Result;", "resolveString-gIAlu-s", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "resolveString", "", "resolveColor-gIAlu-s", "resolveColor", "Landroid/net/Uri;", "resolveUrl-gIAlu-s", "resolveUrl", "Lrvo;", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DivExpressionResolverImpl implements apk {
    private final rvo expressionResolver;

    public DivExpressionResolverImpl(rvo rvoVar) {
        this.expressionResolver = rvoVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean resolveColor_gIAlu_s$lambda$5$lambda$3(int i) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean resolveString_gIAlu_s$lambda$2$lambda$0(String str) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resolveString_gIAlu_s$lambda$2$lambda$1(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean resolveUrl_gIAlu_s$lambda$8$lambda$6(Uri uri) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Uri resolveUrl_gIAlu_s$lambda$8$lambda$7(Uri uri) {
        return uri;
    }

    /* renamed from: resolveColor-gIAlu-s, reason: not valid java name */
    public Object m149resolveColorgIAlus(String expression, String expressionKey) {
        try {
            z3k z3kVar = new z3k(16);
            rms rmsVar = wm11.f;
            return Integer.valueOf(((Number) new a(expressionKey, expression, new lhj(17), z3kVar, eg90.b, rmsVar, null).a(this.expressionResolver)).intValue());
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
    }

    @Override // defpackage.apk
    /* renamed from: resolveString-gIAlu-s */
    public Object mo102resolveStringgIAlus(String expression, String expressionKey) {
        try {
            z3k z3kVar = new z3k(15);
            ums umsVar = wm11.c;
            return (String) new a(expressionKey, expression, new lhj(16), z3kVar, eg90.b, umsVar, null).a(this.expressionResolver);
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
    }

    /* renamed from: resolveUrl-gIAlu-s, reason: not valid java name */
    public Object m150resolveUrlgIAlus(String expression, String expressionKey) {
        try {
            z3k z3kVar = new z3k(13);
            dxf0 dxf0Var = wm11.e;
            return (Uri) new a(expressionKey, expression, new lhj(14), z3kVar, eg90.b, dxf0Var, null).a(this.expressionResolver);
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
    }
}
