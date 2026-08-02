package com.yandex.go.taxi.order;

import android.app.Activity;
import com.yandex.go.taxi.order.models.api.objects.ReorderInfo;
import defpackage.ief;
import defpackage.kub1;
import defpackage.lit;
import defpackage.nzi0;
import defpackage.oit;
import defpackage.pit;
import defpackage.pzi0;
import defpackage.qzi0;
import defpackage.rzi0;
import defpackage.szi0;
import defpackage.xdf;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import ru.yandex.taxi.widget.dialog.AlertDialog;
import ru.yandex.taxi.widget.dialog.BaseDialog;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/go/taxi/order/ReorderDialog;", "Lru/yandex/taxi/widget/dialog/AlertDialog;", "Landroid/app/Activity;", "activity", "Lxdf;", "currencyFormatter", "Lpzi0;", Constants.KEY_DATA, "Lszi0;", "callback", "<init>", "(Landroid/app/Activity;Lxdf;Lpzi0;Lszi0;)V", "Lcom/yandex/go/taxi/order/models/api/objects/ReorderInfo;", "reorderInfo", "Lief;", "currencyRulesDto", "Lzy11;", "setupHorizontalButtons", "(Lcom/yandex/go/taxi/order/models/api/objects/ReorderInfo;Lief;)V", "setupVerticalButtons", "Lxdf;", "Lszi0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ReorderDialog extends AlertDialog {
    public static final int $stable = 8;
    private final szi0 callback;
    private final xdf currencyFormatter;

    public ReorderDialog(Activity activity, xdf xdfVar, pzi0 pzi0Var, szi0 szi0Var) {
        super(activity);
        this.currencyFormatter = xdfVar;
        this.callback = szi0Var;
        ief iefVar = pzi0Var.b;
        ReorderInfo reorderInfo = pzi0Var.a;
        if (reorderInfo.e.size() == 1) {
            setupHorizontalButtons(reorderInfo, iefVar);
        } else {
            setupVerticalButtons(reorderInfo, iefVar);
        }
    }

    private final void setupHorizontalButtons(ReorderInfo reorderInfo, ief currencyRulesDto) {
        setButtonsOrientation(BaseDialog.ButtonsOrientation.HORIZONTAL);
        int i = 0;
        ReorderInfo.ReorderOption reorderOption = (ReorderInfo.ReorderOption) reorderInfo.e.get(0);
        setMainActionButton(kub1.d(this.currencyFormatter, currencyRulesDto, reorderOption.b), new qzi0(this, reorderOption, i), (String) null);
        addButton(kub1.d(this.currencyFormatter, currencyRulesDto, reorderInfo.c), new rzi0(this, i), (String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupHorizontalButtons$lambda$0(ReorderDialog reorderDialog, ReorderInfo.ReorderOption reorderOption) {
        ((oit) reorderDialog.callback).a(reorderOption);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupHorizontalButtons$lambda$1(ReorderDialog reorderDialog) {
        oit oitVar = (oit) reorderDialog.callback;
        pit pitVar = oitVar.a;
        nzi0 nzi0Var = pitVar.a.v;
        nzi0Var.getClass();
        nzi0Var.a.a("reorder.cancel", new HashMap(), 1, new HashMap());
        ((lit) pitVar.g.b).S0(oitVar.b);
    }

    private final void setupVerticalButtons(ReorderInfo reorderInfo, ief currencyRulesDto) {
        setButtonsOrientation(BaseDialog.ButtonsOrientation.VERTICAL);
        Iterator it = reorderInfo.e.iterator();
        while (true) {
            int i = 1;
            if (!it.hasNext()) {
                setMainActionButton(kub1.d(this.currencyFormatter, currencyRulesDto, reorderInfo.c), new rzi0(this, i), (String) null);
                return;
            } else {
                ReorderInfo.ReorderOption reorderOption = (ReorderInfo.ReorderOption) it.next();
                addButton(kub1.d(this.currencyFormatter, currencyRulesDto, reorderOption.b), new qzi0(this, reorderOption, i), (String) null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupVerticalButtons$lambda$0(ReorderDialog reorderDialog, ReorderInfo.ReorderOption reorderOption) {
        ((oit) reorderDialog.callback).a(reorderOption);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupVerticalButtons$lambda$1(ReorderDialog reorderDialog) {
        oit oitVar = (oit) reorderDialog.callback;
        pit pitVar = oitVar.a;
        nzi0 nzi0Var = pitVar.a.v;
        nzi0Var.getClass();
        nzi0Var.a.a("reorder.cancel", new HashMap(), 1, new HashMap());
        ((lit) pitVar.g.b).S0(oitVar.b);
    }
}
