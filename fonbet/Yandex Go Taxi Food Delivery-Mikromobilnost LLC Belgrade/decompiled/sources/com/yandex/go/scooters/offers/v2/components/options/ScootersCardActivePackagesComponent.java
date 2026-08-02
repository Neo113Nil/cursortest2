package com.yandex.go.scooters.offers.v2.components.options;

import android.content.Context;
import defpackage.fcl0;
import defpackage.kyh0;
import defpackage.qco0;
import defpackage.qfh0;
import defpackage.sco0;
import defpackage.sls;
import defpackage.w20;
import defpackage.x7n0;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.taxi.design.ListItemWithBadgeComponent;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/yandex/go/scooters/offers/v2/components/options/ScootersCardActivePackagesComponent;", "Lru/yandex/taxi/design/ListItemWithBadgeComponent;", "Landroid/content/Context;", "context", "Lkotlin/Function0;", "Lzy11;", "onActivePassesClickListener", "<init>", "(Landroid/content/Context;Lsls;)V", "Lsco0;", "scootersPasses", "", "multiplePassesEnabled", "setActivePasses", "(Lsco0;Z)V", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersCardActivePackagesComponent extends ListItemWithBadgeComponent {
    public static final int $stable = 8;

    public ScootersCardActivePackagesComponent(Context context, sls slsVar) {
        super(context, null, 0, 6, null);
        setId(qfh0.scooters_component_option_active_packages);
        setTrailMode(2);
        setTitle(kyh0.scooters_active_packages_item_on_scooters_card_title);
        setVisibility(8);
        setDebounceClickListener(new fcl0(4, slsVar));
        setBackgroundResource(x7n0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0023, code lost:
    
        if (r5 != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setActivePasses(sco0 scootersPasses, boolean multiplePassesEnabled) {
        boolean z;
        List list;
        qco0 qco0Var = scootersPasses instanceof qco0 ? (qco0) scootersPasses : null;
        if (qco0Var == null) {
            setVisibility(8);
            return;
        }
        w20 w20Var = qco0Var.g;
        if (w20Var != null && (list = w20Var.c) != null) {
            z = true;
            if (!list.isEmpty()) {
            }
        }
        z = false;
        setVisibility(z ? 0 : 8);
    }
}
