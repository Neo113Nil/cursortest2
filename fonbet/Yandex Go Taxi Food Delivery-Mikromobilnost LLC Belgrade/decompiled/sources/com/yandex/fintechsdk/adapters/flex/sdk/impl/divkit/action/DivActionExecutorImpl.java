package com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.action;

import android.net.Uri;
import defpackage.apk;
import defpackage.fpl;
import defpackage.p6k;
import defpackage.rvo;
import defpackage.vhk;
import defpackage.w3k;
import defpackage.w6k;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.b;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001BE\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001aR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/divkit/action/DivActionExecutorImpl;", "Lp6k;", "", "", "Lw6k;", "divActionHandlers", "Lapk;", "divExpressionResolver", "Lfpl;", "divViewFacade", "Lrvo;", "expressionResolver", "Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/divkit/action/DivActionHandlerImpl;", "handler", "scopeId", "<init>", "(Ljava/util/Map;Lapk;Lfpl;Lrvo;Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/divkit/action/DivActionHandlerImpl;Ljava/lang/String;)V", "Lvhk;", "action", "", "executeAction", "(Lvhk;)Z", "Ljava/util/Map;", "Lapk;", "Lfpl;", "Lrvo;", "Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/divkit/action/DivActionHandlerImpl;", "Ljava/lang/String;", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DivActionExecutorImpl implements p6k {
    private final Map<String, w6k> divActionHandlers;
    private final apk divExpressionResolver;
    private final fpl divViewFacade;
    private final rvo expressionResolver;
    private final DivActionHandlerImpl handler;
    private final String scopeId;

    /* JADX WARN: Multi-variable type inference failed */
    public DivActionExecutorImpl(Map<String, ? extends w6k> map, apk apkVar, fpl fplVar, rvo rvoVar, DivActionHandlerImpl divActionHandlerImpl, String str) {
        this.divActionHandlers = map;
        this.divExpressionResolver = apkVar;
        this.divViewFacade = fplVar;
        this.expressionResolver = rvoVar;
        this.handler = divActionHandlerImpl;
        this.scopeId = str;
    }

    @Override // defpackage.p6k
    public boolean executeAction(vhk action) {
        Uri parse = Uri.parse(action.b);
        String host = parse.getHost();
        if (host == null || !this.divActionHandlers.containsKey(host)) {
            return this.handler.handleActionUrlWithSync(this.expressionResolver, this.scopeId, parse, this.divViewFacade);
        }
        w6k w6kVar = this.divActionHandlers.get(host);
        if (w6kVar == null) {
            return false;
        }
        Map map = action.c;
        if (map == null) {
            map = b.f();
        }
        w6kVar.a(this, new w3k(map, host), this.divExpressionResolver);
        return true;
    }
}
