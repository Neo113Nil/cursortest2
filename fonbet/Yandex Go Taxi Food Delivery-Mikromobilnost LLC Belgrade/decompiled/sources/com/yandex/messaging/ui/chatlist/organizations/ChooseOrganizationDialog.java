package com.yandex.messaging.ui.chatlist.organizations;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.View;
import android.view.Window;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import defpackage.aii0;
import defpackage.bts;
import defpackage.did;
import defpackage.dsb;
import defpackage.f530;
import defpackage.fid;
import defpackage.i3y;
import defpackage.jrb;
import defpackage.krb;
import defpackage.lrb;
import defpackage.m3u0;
import defpackage.qlb;
import defpackage.sls;
import defpackage.v4;
import defpackage.vng;
import defpackage.zf6;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.a;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\r\u001a\u00020\f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0016\u001a\u00020\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0014J\u0019\u0010\u001b\u001a\u00020\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001b\u0010\u001a\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006(²\u0006\u000e\u0010'\u001a\u0004\u0018\u00010&8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/yandex/messaging/ui/chatlist/organizations/ChooseOrganizationDialog;", "", "Landroid/content/DialogInterface$OnCancelListener;", "Landroid/app/Activity;", "activity", "Ldsb;", "viewController", "<init>", "(Landroid/app/Activity;Ldsb;)V", "Landroid/view/View;", "createComposeView", "()Landroid/view/View;", "Lf530;", "modifier", "Lkotlin/Function0;", "Lzy11;", "onDismissRequest", "DialogRoot", "(Lf530;Lsls;Lfid;II)V", "show", "()V", "action", "setOnDismiss", "(Lsls;)V", "close", "Landroid/content/DialogInterface;", "dialog", "onCancel", "(Landroid/content/DialogInterface;)V", "Landroid/app/Activity;", "Ldsb;", "onDismiss", "Lsls;", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "dialog$delegate", "Li3y;", "getDialog", "()Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "Ljrb;", "uiState", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ChooseOrganizationDialog implements DialogInterface.OnCancelListener {
    public static final int $stable = 8;
    private final Activity activity;

    /* renamed from: dialog$delegate, reason: from kotlin metadata */
    private final i3y dialog = a.a(new krb(this, 0));
    private sls onDismiss;
    private final dsb viewController;

    public ChooseOrganizationDialog(Activity activity, dsb dsbVar) {
        this.activity = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void DialogRoot(f530 f530Var, sls slsVar, fid fidVar, int i, int i2) {
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-829262233);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= btsVar.e(slsVar) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= btsVar.e(this) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && btsVar.E()) {
            btsVar.Y();
            aii0 v = btsVar.v();
            if (v != null) {
                v.d = new v4(this, f530Var, slsVar, i, i2, 8);
                return;
            }
            return;
        }
        if (i4 != 0) {
            btsVar.e0(2108845858);
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = new qlb(22);
                btsVar.o0(Q);
            }
            btsVar.t(false);
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jrb DialogRoot$lambda$6(m3u0 m3u0Var) {
        return (jrb) m3u0Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 DialogRoot$lambda$7(ChooseOrganizationDialog chooseOrganizationDialog, f530 f530Var, sls slsVar, int i, int i2, fid fidVar, int i3) {
        chooseOrganizationDialog.DialogRoot(f530Var, slsVar, fidVar, vng.O(i | 1), i2);
        return zy11.a;
    }

    public static final /* synthetic */ dsb access$getViewController$p(ChooseOrganizationDialog chooseOrganizationDialog) {
        chooseOrganizationDialog.getClass();
        return null;
    }

    private final View createComposeView() {
        ComposeView composeView = new ComposeView(this.activity, null, 0, 6, null);
        composeView.setContent(new androidx.compose.runtime.internal.a(31642232, new lrb(this, 1), true));
        return composeView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BottomSheetDialog dialog_delegate$lambda$2(ChooseOrganizationDialog chooseOrganizationDialog) {
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(chooseOrganizationDialog.activity);
        Window window = bottomSheetDialog.getWindow();
        int i = 2;
        if (window != null) {
            window.clearFlags(2);
        }
        bottomSheetDialog.setContentView(chooseOrganizationDialog.createComposeView());
        bottomSheetDialog.setOnDismissListener(new zf6(i, chooseOrganizationDialog));
        return bottomSheetDialog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dialog_delegate$lambda$2$lambda$1$lambda$0(ChooseOrganizationDialog chooseOrganizationDialog, DialogInterface dialogInterface) {
        sls slsVar = chooseOrganizationDialog.onDismiss;
        if (slsVar != null) {
            slsVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BottomSheetDialog getDialog() {
        return (BottomSheetDialog) this.dialog.getValue();
    }

    public void close() {
        getDialog().dismiss();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialog) {
        close();
    }

    public final void setOnDismiss(sls action) {
        this.onDismiss = action;
    }

    public final void show() {
        getDialog().show();
    }
}
