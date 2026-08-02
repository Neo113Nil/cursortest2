package com.yandex.div.core.view2.divs;

import android.net.Uri;
import com.unity3d.services.core.network.model.HttpRequest;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.KLog;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.logging.Severity;
import com.yandex.div2.DivAction;
import io.reactivex.rxjava3.subjects.c;
import java.util.LinkedHashMap;
import java.util.Map;
import xsna.apn;
import xsna.aqy;
import xsna.epx;
import xsna.khi0;
import xsna.zcl;

/* compiled from: DivActionBeaconSender.kt */
/* loaded from: classes7.dex */
public class DivActionBeaconSender {
    private static final Companion Companion = new Companion(null);
    private final boolean isSwipeOutBeaconsEnabled;
    private final boolean isTapBeaconsEnabled;
    private final boolean isVisibilityBeaconsEnabled;
    private final aqy<khi0> sendBeaconManagerLazy;

    /* compiled from: DivActionBeaconSender.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public DivActionBeaconSender(aqy<khi0> aqyVar, boolean z, boolean z2, boolean z3) {
        this.sendBeaconManagerLazy = aqyVar;
        this.isTapBeaconsEnabled = z;
        this.isVisibilityBeaconsEnabled = z2;
        this.isSwipeOutBeaconsEnabled = z3;
    }

    private boolean isHttpScheme(String str) {
        return epx.f(str, "http") || epx.f(str, HttpRequest.DEFAULT_SCHEME);
    }

    private Map<String, String> toHttpHeaders(DivAction divAction, ExpressionResolver expressionResolver) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Expression<Uri> expression = divAction.g;
        if (expression != null) {
            linkedHashMap.put("Referer", expression.evaluate(expressionResolver).toString());
        }
        return linkedHashMap;
    }

    public void sendSwipeOutActionBeacon(DivAction divAction, ExpressionResolver expressionResolver) {
        Uri evaluate;
        Expression<Uri> expression = divAction.d;
        if (expression == null || (evaluate = expression.evaluate(expressionResolver)) == null) {
            return;
        }
        if (!isHttpScheme(evaluate.getScheme())) {
            KLog kLog = KLog.INSTANCE;
            if (kLog.isAtLeast(Severity.WARNING)) {
                kLog.print(5, "DivActionBeaconSender", c.c("Trying to send beacon with unsupported URL '", evaluate, '\''));
                return;
            }
            return;
        }
        if (this.isSwipeOutBeaconsEnabled) {
            khi0 khi0Var = this.sendBeaconManagerLazy.get();
            if (khi0Var != null) {
                khi0Var.a(evaluate, toHttpHeaders(divAction, expressionResolver), divAction.f);
                return;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("SendBeaconManager was not configured");
            }
        }
    }

    public void sendTapActionBeacon(DivAction divAction, ExpressionResolver expressionResolver) {
        Uri evaluate;
        Expression<Uri> expression = divAction.d;
        if (expression == null || (evaluate = expression.evaluate(expressionResolver)) == null) {
            return;
        }
        if (!isHttpScheme(evaluate.getScheme())) {
            KLog kLog = KLog.INSTANCE;
            if (kLog.isAtLeast(Severity.WARNING)) {
                kLog.print(5, "DivActionBeaconSender", c.c("Trying to send beacon with unsupported URL '", evaluate, '\''));
                return;
            }
            return;
        }
        if (this.isTapBeaconsEnabled) {
            khi0 khi0Var = this.sendBeaconManagerLazy.get();
            if (khi0Var != null) {
                khi0Var.a(evaluate, toHttpHeaders(divAction, expressionResolver), divAction.f);
                return;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("SendBeaconManager was not configured");
            }
        }
    }

    public void sendVisibilityActionBeacon(apn apnVar, ExpressionResolver expressionResolver) {
        Uri evaluate;
        Expression<Uri> url = apnVar.getUrl();
        if (url == null || (evaluate = url.evaluate(expressionResolver)) == null) {
            return;
        }
        if (!isHttpScheme(evaluate.getScheme())) {
            KLog kLog = KLog.INSTANCE;
            if (kLog.isAtLeast(Severity.WARNING)) {
                kLog.print(5, "DivActionBeaconSender", c.c("Trying to send beacon with unsupported URL '", evaluate, '\''));
                return;
            }
            return;
        }
        if (this.isVisibilityBeaconsEnabled) {
            khi0 khi0Var = this.sendBeaconManagerLazy.get();
            if (khi0Var != null) {
                khi0Var.a(evaluate, toHttpHeaders(apnVar, expressionResolver), apnVar.getPayload());
                return;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("SendBeaconManager was not configured");
            }
        }
    }

    private Map<String, String> toHttpHeaders(apn apnVar, ExpressionResolver expressionResolver) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Expression<Uri> e = apnVar.e();
        if (e != null) {
            linkedHashMap.put("Referer", e.evaluate(expressionResolver).toString());
        }
        return linkedHashMap;
    }
}
