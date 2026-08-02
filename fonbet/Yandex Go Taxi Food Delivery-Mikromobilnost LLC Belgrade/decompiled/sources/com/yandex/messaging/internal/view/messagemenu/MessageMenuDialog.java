package com.yandex.messaging.internal.view.messagemenu;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.DialogInterface;
import android.os.Bundle;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.views.bottomsheet.NavigableBottomSheetDialog;
import com.yandex.messaging.views.bottomsheet.b;
import defpackage.bu10;
import defpackage.oey;
import defpackage.ou10;
import defpackage.pey;
import defpackage.ycc;
import defpackage.z83;
import java.util.LinkedList;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u001fB!\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u001f\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u000fJ\u0019\u0010\u001b\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/yandex/messaging/internal/view/messagemenu/MessageMenuDialog;", "Lcom/yandex/messaging/views/bottomsheet/NavigableBottomSheetDialog;", "Lbu10;", "Landroid/content/DialogInterface$OnCancelListener;", "Loey;", "Landroid/app/Activity;", "activity", "Lcom/yandex/messaging/internal/view/messagemenu/a;", "menuBrick", "Lcom/yandex/messaging/ui/reactions/a;", "publicReactionListBrick", "<init>", "(Landroid/app/Activity;Lcom/yandex/messaging/internal/view/messagemenu/a;Lcom/yandex/messaging/ui/reactions/a;)V", "Lzy11;", "onDialogDismissed", "()V", "close", "goBack", "Lcom/yandex/messaging/internal/ServerMessageRef;", "messageReference", "", "reactionsCount", "onPublicReactionListChosen", "(Lcom/yandex/messaging/internal/ServerMessageRef;I)V", "onExpandReactionsChoose", "Landroid/content/DialogInterface;", "dialog", "onCancel", "(Landroid/content/DialogInterface;)V", "Landroid/app/Activity;", "Lcom/yandex/messaging/ui/reactions/a;", "Lou10;", "dialogDismissLifecycleObserver", "Lou10;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MessageMenuDialog extends NavigableBottomSheetDialog implements bu10, DialogInterface.OnCancelListener, oey {
    public static final int $stable = 8;
    private final Activity activity;
    private final ou10 dialogDismissLifecycleObserver;
    private final com.yandex.messaging.ui.reactions.a publicReactionListBrick;

    /* JADX WARN: Multi-variable type inference failed */
    public MessageMenuDialog(Activity activity, a aVar, com.yandex.messaging.ui.reactions.a aVar2) {
        super(activity);
        this.activity = activity;
        this.publicReactionListBrick = aVar2;
        ou10 ou10Var = new ou10();
        ou10Var.a = this;
        this.dialogDismissLifecycleObserver = ou10Var;
        aVar.A = this;
        aVar2.y = this;
        getWindow().addFlags(131072);
        getWindow().setDimAmount(0.5f);
        if (activity instanceof pey) {
            ((pey) activity).getLifecycle().a(ou10Var);
        } else {
            z83.i();
        }
        com.yandex.messaging.views.bottomsheet.a navigator = getNavigator();
        if (!navigator.d.isEmpty()) {
            navigator.c(aVar, null);
        } else {
            navigator.b(aVar, null);
            navigator.a.a.addOnLayoutChangeListener(navigator.g);
        }
    }

    @Override // defpackage.bu10
    public void close() {
        dismiss();
    }

    @Override // defpackage.bu10
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

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialog) {
        close();
    }

    @Override // com.yandex.messaging.views.bottomsheet.NavigableBottomSheetDialog
    public void onDialogDismissed() {
        super.onDialogDismissed();
        ComponentCallbacks2 componentCallbacks2 = this.activity;
        if (componentCallbacks2 instanceof pey) {
            ((pey) componentCallbacks2).getLifecycle().d(this.dialogDismissLifecycleObserver);
        }
    }

    @Override // defpackage.bu10
    public void onExpandReactionsChoose() {
    }

    @Override // defpackage.bu10
    public void onPublicReactionListChosen(ServerMessageRef messageReference, int reactionsCount) {
        com.yandex.messaging.views.bottomsheet.a navigator = getNavigator();
        com.yandex.messaging.ui.reactions.a aVar = this.publicReactionListBrick;
        Bundle bundle = new Bundle();
        bundle.putParcelable("MESSAGE_REF_KEY", messageReference);
        bundle.putInt("REACTION_COUNT", reactionsCount);
        if (!navigator.d.isEmpty()) {
            navigator.c(aVar, bundle);
        } else {
            navigator.b(aVar, bundle);
            navigator.a.a.addOnLayoutChangeListener(navigator.g);
        }
    }
}
