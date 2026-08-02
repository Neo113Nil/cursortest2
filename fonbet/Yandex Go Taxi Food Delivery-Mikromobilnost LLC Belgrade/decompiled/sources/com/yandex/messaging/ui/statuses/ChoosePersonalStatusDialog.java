package com.yandex.messaging.ui.statuses;

import android.app.Activity;
import android.os.Handler;
import android.widget.Toast;
import com.yandex.messaging.domain.statuses.StatusAvailability;
import com.yandex.messaging.views.bottomsheet.NavigableBottomSheetDialog;
import com.yandex.messaging.views.bottomsheet.b;
import defpackage.b00;
import defpackage.du21;
import defpackage.e3n;
import defpackage.eu21;
import defpackage.gu21;
import defpackage.k5e;
import defpackage.kg9;
import defpackage.l7b;
import defpackage.lz;
import defpackage.o430;
import defpackage.o5e;
import defpackage.onn;
import defpackage.oyh0;
import defpackage.sfl0;
import defpackage.sls;
import defpackage.t620;
import defpackage.t7b0;
import defpackage.u7b0;
import defpackage.ycc;
import defpackage.zy11;
import java.util.LinkedList;
import kotlin.Metadata;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/yandex/messaging/ui/statuses/ChoosePersonalStatusDialog;", "Lcom/yandex/messaging/views/bottomsheet/NavigableBottomSheetDialog;", "Landroid/app/Activity;", "activity", "Lt7b0;", "personalStatusComponentBuilder", "Lb00;", "actions", "Lo5e;", "connectionStatusHolder", "Lsfl0;", "router", "<init>", "(Landroid/app/Activity;Lt7b0;Lb00;Lo5e;Lsfl0;)V", "Ldu21;", "customStatus", "Lzy11;", "onAddStatus", "(Ldu21;)V", "onTelemostSettings", "()V", "goBack", "Lgu21;", ACSPConstants.STATUS, "onUserStatusChosen", "(Lgu21;)V", "Lkg9;", "changeStatusData", "Lkotlin/Function0;", "onFail", "onDurationChosen", "(Lkg9;Lsls;)V", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "Lb00;", "Lo5e;", "Lsfl0;", "Lu7b0;", "personalStatusComponent", "Lu7b0;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ChoosePersonalStatusDialog extends NavigableBottomSheetDialog {
    public static final int $stable = 8;
    private final b00 actions;
    private final Activity activity;
    private final o5e connectionStatusHolder;
    private final u7b0 personalStatusComponent;
    private final sfl0 router;

    public ChoosePersonalStatusDialog(Activity activity, t7b0 t7b0Var, b00 b00Var, o5e o5eVar, sfl0 sfl0Var) {
        super(activity);
        this.activity = activity;
        this.actions = b00Var;
        this.connectionStatusHolder = o5eVar;
        this.router = sfl0Var;
        t7b0Var.a();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onUserStatusChosen$lambda$0(ChoosePersonalStatusDialog choosePersonalStatusDialog) {
        Toast.makeText(choosePersonalStatusDialog.activity, oyh0.set_status_server_error_toast, 0).show();
        return zy11.a;
    }

    public final Activity getActivity() {
        return this.activity;
    }

    public void goBack() {
        com.yandex.messaging.views.bottomsheet.a navigator = getNavigator();
        LinkedList linkedList = navigator.d;
        ycc.A(linkedList);
        b bVar = (b) linkedList.pollLast();
        if (bVar == null) {
            navigator.c.cancel();
        } else {
            navigator.c(bVar, null);
        }
    }

    public void onAddStatus(du21 customStatus) {
        dismiss();
        sfl0 sfl0Var = this.router;
        new onn(t620.d, customStatus);
        sfl0Var.getClass();
    }

    public void onDurationChosen(kg9 changeStatusData, sls onFail) {
        if (this.connectionStatusHolder.a().equals(k5e.g) || this.connectionStatusHolder.a().equals(k5e.h)) {
            Activity activity = this.activity;
            Toast.makeText(activity, activity.getResources().getString(oyh0.set_status_error_toast), 0).show();
            dismiss();
        } else {
            b00 b00Var = this.actions;
            ((Handler) b00Var.a.get()).post(new lz(8, b00Var, changeStatusData, onFail));
            dismiss();
        }
    }

    public void onTelemostSettings() {
        getNavigator();
        throw null;
    }

    public void onUserStatusChosen(gu21 status) {
        if (!(status instanceof eu21)) {
            getNavigator();
            throw null;
        }
        b00 b00Var = this.actions;
        StatusAvailability statusAvailability = status.a;
        o430 o430Var = e3n.b;
        ((Handler) b00Var.a.get()).post(new lz(8, b00Var, new kg9(statusAvailability), new l7b(13, this)));
        dismiss();
    }
}
