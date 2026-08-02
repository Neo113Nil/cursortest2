package com.yandex.messaging.ui.statuses.save;

import android.app.Activity;
import android.os.Handler;
import com.yandex.messaging.views.ExpandedBottomSheetDialog;
import defpackage.b00;
import defpackage.du21;
import defpackage.i3y;
import defpackage.iik0;
import defpackage.kg9;
import defpackage.lz;
import defpackage.ny61;
import defpackage.olh0;
import defpackage.r0m0;
import defpackage.s0m0;
import defpackage.sls;
import defpackage.w0i0;
import kotlin.Metadata;
import kotlin.a;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ%\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR$\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lcom/yandex/messaging/ui/statuses/save/SavePresetActionDialog;", "Lcom/yandex/messaging/views/ExpandedBottomSheetDialog;", "Landroid/app/Activity;", "activity", "Lr0m0;", "savePresetActionBuilder", "Lb00;", "actions", "<init>", "(Landroid/app/Activity;Lr0m0;Lb00;)V", "Ldu21;", "chosenStatus", "Lzy11;", "show", "(Ldu21;)V", "()V", "goBack", "Lkg9;", "changeStatusData", "Lkotlin/Function0;", "onFail", "onDurationChosen", "(Lkg9;Lsls;)V", "onDontChangeStatus", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "Lb00;", "", "value", "completed", "Z", "getCompleted", "()Z", "Ls0m0;", "savePresetActionComponent$delegate", "Li3y;", "getSavePresetActionComponent", "()Ls0m0;", "savePresetActionComponent", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SavePresetActionDialog extends ExpandedBottomSheetDialog {
    public static final int $stable = 8;
    private final b00 actions;
    private final Activity activity;
    private boolean completed;

    /* renamed from: savePresetActionComponent$delegate, reason: from kotlin metadata */
    private final i3y savePresetActionComponent;

    public SavePresetActionDialog(Activity activity, r0m0 r0m0Var, b00 b00Var) {
        super(activity, w0i0.Messaging_Theme_RoundedBottomSheetDialog);
        this.activity = activity;
        this.actions = b00Var;
        this.savePresetActionComponent = a.a(new iik0(24, this));
        setCanceledOnTouchOutside(true);
        setContentView(olh0.msg_d_save_preset_action);
    }

    private final s0m0 getSavePresetActionComponent() {
        if (this.savePresetActionComponent.getValue() == null) {
            return null;
        }
        ny61.u();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s0m0 savePresetActionComponent_delegate$lambda$0(r0m0 r0m0Var, SavePresetActionDialog savePresetActionDialog) {
        r0m0Var.a();
        throw null;
    }

    public final Activity getActivity() {
        return this.activity;
    }

    public final boolean getCompleted() {
        return this.completed;
    }

    public void goBack() {
        dismiss();
    }

    public void onDontChangeStatus() {
        this.completed = true;
        dismiss();
    }

    public void onDurationChosen(kg9 changeStatusData, sls onFail) {
        b00 b00Var = this.actions;
        ((Handler) b00Var.a.get()).post(new lz(8, b00Var, changeStatusData, onFail));
        this.completed = true;
        dismiss();
    }

    @Override // android.app.Dialog
    public void show() {
        throw new IllegalStateException("use show(chosenStatus) instead");
    }

    public final void show(du21 chosenStatus) {
        getSavePresetActionComponent();
        throw null;
    }
}
