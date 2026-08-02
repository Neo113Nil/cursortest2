package com.yandex.div.core.downloader;

import android.net.Uri;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.internal.Assert;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;
import java.util.List;
import xsna.apn;
import xsna.cjn;
import xsna.pkn;

/* compiled from: DivDownloadActionHandler.kt */
/* loaded from: classes7.dex */
public final class DivDownloadActionHandler {
    public static final DivDownloadActionHandler INSTANCE = new DivDownloadActionHandler();

    private DivDownloadActionHandler() {
    }

    public static final boolean canHandle(Uri uri, DivViewFacade divViewFacade) {
        String authority;
        if (uri == null || (authority = uri.getAuthority()) == null || !"download".equals(authority)) {
            return false;
        }
        if (uri.getQueryParameter("url") == null) {
            Assert.fail("url param is required!");
            return false;
        }
        if (divViewFacade instanceof Div2View) {
            return true;
        }
        Assert.fail("Div2View should be used!");
        return false;
    }

    private final boolean executeDownload(String str, final List<DivAction> list, final List<DivAction> list2, final Div2View div2View, final ExpressionResolver expressionResolver) {
        div2View.addLoadReference(div2View.getDiv2Component$div_release().getDivDownloader().downloadPatch(div2View, str, new DivPatchDownloadCallback() { // from class: com.yandex.div.core.downloader.DivDownloadActionHandler$executeDownload$callback$1
        }), div2View);
        return true;
    }

    public static final boolean handleAction(DivAction divAction, Div2View div2View, ExpressionResolver expressionResolver) {
        Uri evaluate;
        Expression<Uri> expression = divAction.k;
        if (expression == null || (evaluate = expression.evaluate(expressionResolver)) == null) {
            return false;
        }
        return INSTANCE.handleAction(evaluate, divAction.a, div2View, expressionResolver);
    }

    public static final boolean handleVisibilityAction(apn apnVar, Div2View div2View, ExpressionResolver expressionResolver) {
        Uri evaluate;
        Expression<Uri> url = apnVar.getUrl();
        if (url == null || (evaluate = url.evaluate(expressionResolver)) == null) {
            return false;
        }
        return INSTANCE.handleAction(evaluate, apnVar.f(), div2View, expressionResolver);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleAction(cjn cjnVar, pkn pknVar, Div2View div2View, ExpressionResolver expressionResolver) {
        List<DivAction> list;
        List<DivAction> list2;
        List<DivAction> list3;
        Uri evaluate = cjnVar.c.evaluate(expressionResolver);
        List<DivAction> list4 = cjnVar.a;
        if (list4 == null) {
            if (pknVar == null) {
                list = null;
                list2 = cjnVar.b;
                if (list2 != null) {
                    list3 = pknVar != null ? pknVar.b : null;
                } else {
                    list3 = list2;
                }
                return executeDownload(evaluate.toString(), list3, list, div2View, expressionResolver);
            }
            list4 = pknVar.a;
        }
        list = list4;
        list2 = cjnVar.b;
        if (list2 != null) {
        }
        return executeDownload(evaluate.toString(), list3, list, div2View, expressionResolver);
    }

    private final boolean handleAction(Uri uri, pkn pknVar, Div2View div2View, ExpressionResolver expressionResolver) {
        String queryParameter = uri.getQueryParameter("url");
        if (queryParameter == null) {
            return false;
        }
        return executeDownload(queryParameter, pknVar != null ? pknVar.b : null, pknVar != null ? pknVar.a : null, div2View, expressionResolver);
    }
}
