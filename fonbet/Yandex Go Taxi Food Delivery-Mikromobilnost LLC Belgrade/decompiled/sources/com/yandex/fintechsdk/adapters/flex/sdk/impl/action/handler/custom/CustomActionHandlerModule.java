package com.yandex.fintechsdk.adapters.flex.sdk.impl.action.handler.custom;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.action.CustomAction;
import defpackage.dw;
import defpackage.fw;
import defpackage.jg5;
import defpackage.kg5;
import defpackage.klc;
import defpackage.kr;
import defpackage.p85;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u0012\u0012\u0006\b\u0001\u0012\u00020\u000b\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/action/handler/custom/CustomActionHandlerModule;", "Lfw;", "", "Lkg5;", "Lig5;", "actionsInfo", "Lp85;", "Landroidx/fragment/app/FragmentActivity;", "activityProvider", "<init>", "(Ljava/util/List;Lp85;)V", "Lkr;", "action", "Ldw;", "Lflex/actions/factory/handler/AnyActionHandler;", "handler", "(Lkr;)Ldw;", "Ljava/util/List;", "Lp85;", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CustomActionHandlerModule implements fw {
    private final List<kg5> actionsInfo;
    private final p85 activityProvider;

    /* JADX WARN: Multi-variable type inference failed */
    public CustomActionHandlerModule(List<? extends kg5> list, p85 p85Var) {
        this.actionsInfo = list;
        this.activityProvider = p85Var;
    }

    @Override // defpackage.fw
    public dw handler(kr action) {
        Object obj;
        if (action instanceof CustomAction) {
            Iterator<T> it = this.actionsInfo.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((kg5) obj).b().equals(((CustomAction) action).getType())) {
                    break;
                }
            }
            kg5 kg5Var = (kg5) obj;
            jg5 a = kg5Var != null ? kg5Var.a() : null;
            if (a != null) {
                return new CustomActionHandler(this.activityProvider, a);
            }
        }
        return null;
    }

    @Override // defpackage.fw
    public dw handler(kr krVar, klc klcVar) {
        return handler(krVar);
    }
}
