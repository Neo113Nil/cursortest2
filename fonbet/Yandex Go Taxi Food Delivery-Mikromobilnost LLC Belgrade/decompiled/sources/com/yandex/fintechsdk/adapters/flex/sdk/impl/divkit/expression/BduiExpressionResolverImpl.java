package com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.expression;

import android.graphics.Color;
import android.net.Uri;
import com.yandex.div.json.expressions.a;
import defpackage.avu0;
import defpackage.dg90;
import defpackage.dxf0;
import defpackage.eg90;
import defpackage.eja1;
import defpackage.j24;
import defpackage.jdo;
import defpackage.l75;
import defpackage.quz;
import defpackage.rms;
import defpackage.rvo;
import defpackage.sls;
import defpackage.sms;
import defpackage.tg5;
import defpackage.ums;
import defpackage.wm11;
import defpackage.yg5;
import defpackage.zg5;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\nJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0015\u001a\u00020\u00062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/divkit/expression/BduiExpressionResolverImpl;", "Lyg5;", "Lrvo;", "expressionResolver", "<init>", "(Lrvo;)V", "", "colorString", "", "parseColor", "(Ljava/lang/String;)Ljava/lang/Integer;", BduiExpressionResolverImpl.EXPRESSION_KEY, "resolveString", "(Ljava/lang/String;)Ljava/lang/String;", "resolveColor", "", "resolveDouble", "(Ljava/lang/String;)Ljava/lang/Double;", "Landroid/net/Uri;", "resolveUrl", "(Ljava/lang/String;)Landroid/net/Uri;", "rawExpression", "Lkotlin/Function0;", "Lzy11;", "listener", "Ltg5;", "subscribeToExpression", "(Ljava/lang/String;Lsls;)Ltg5;", "Lrvo;", "Companion", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class BduiExpressionResolverImpl implements yg5 {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String EXPRESSION_KEY = "expression";
    private final rvo expressionResolver;

    public BduiExpressionResolverImpl(rvo rvoVar) {
        this.expressionResolver = rvoVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer parseColor(String colorString) {
        try {
            return Integer.valueOf(Color.parseColor(colorString));
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean resolveColor$lambda$2(int i) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean resolveDouble$lambda$4(double d) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Double resolveDouble$lambda$5(Object obj) {
        Number number = obj instanceof Number ? (Number) obj : null;
        if (number != null) {
            return Double.valueOf(number.doubleValue());
        }
        String str = obj instanceof String ? (String) obj : null;
        if (str != null) {
            return avu0.i(str);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean resolveString$lambda$0(String str) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resolveString$lambda$1(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean resolveUrl$lambda$6(Uri uri) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Uri resolveUrl$lambda$7(Uri uri) {
        return uri;
    }

    @Override // defpackage.yg5
    public Integer resolveColor(String expression) {
        try {
            rvo rvoVar = this.expressionResolver;
            quz quzVar = new quz(22);
            rms rmsVar = wm11.f;
            dg90 dg90Var = eg90.b;
            Set set = jdo.c;
            return (Integer) rvoVar.b(EXPRESSION_KEY, expression, eja1.z(expression), new j24(18, this), quzVar, rmsVar, dg90Var);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // defpackage.yg5
    public Double resolveDouble(String expression) {
        try {
            rvo rvoVar = this.expressionResolver;
            quz quzVar = new quz(21);
            sms smsVar = wm11.d;
            dg90 dg90Var = eg90.b;
            Set set = jdo.c;
            return (Double) rvoVar.b(EXPRESSION_KEY, expression, eja1.z(expression), new l75(11), quzVar, smsVar, dg90Var);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // defpackage.yg5
    public String resolveString(String expression) {
        try {
            quz quzVar = new quz(20);
            ums umsVar = wm11.c;
            return (String) new a(EXPRESSION_KEY, expression, new l75(10), quzVar, eg90.b, umsVar, null).a(this.expressionResolver);
        } catch (Exception unused) {
            return null;
        }
    }

    public Uri resolveUrl(String expression) {
        try {
            quz quzVar = new quz(23);
            dxf0 dxf0Var = wm11.e;
            return (Uri) new a(EXPRESSION_KEY, expression, new l75(12), quzVar, eg90.b, dxf0Var, null).a(this.expressionResolver);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // defpackage.yg5
    public tg5 subscribeToExpression(String rawExpression, sls listener) {
        try {
            Set set = jdo.c;
            return new zg5(this.expressionResolver.a(rawExpression, eja1.z(rawExpression).c(), listener));
        } catch (Exception unused) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/divkit/expression/BduiExpressionResolverImpl$Companion;", "", "<init>", "()V", "EXPRESSION_KEY", "", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
