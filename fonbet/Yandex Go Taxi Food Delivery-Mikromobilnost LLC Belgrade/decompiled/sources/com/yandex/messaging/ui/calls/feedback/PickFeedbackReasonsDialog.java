package com.yandex.messaging.ui.calls.feedback;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.yandex.messaging.internal.entities.feedback.CallFeedbackReason;
import defpackage.duq;
import defpackage.e9h0;
import defpackage.fx00;
import defpackage.i4b0;
import defpackage.olh0;
import defpackage.tls;
import defpackage.w0i0;
import defpackage.zy11;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u001c\u0010\f\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0004\u0012\u00020\n0\tj\u0002`\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/yandex/messaging/ui/calls/feedback/PickFeedbackReasonsDialog;", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "Landroid/content/Context;", "context", "", "Lcom/yandex/messaging/internal/entities/feedback/CallFeedbackReason;", "allReasons", "", "selectedReasons", "Lkotlin/Function1;", "Lzy11;", "Lcom/yandex/messaging/ui/calls/feedback/OnReasonsPickedListener;", "onReasonsPickedListener", "<init>", "(Landroid/content/Context;Ljava/util/List;Ljava/util/Set;Ltls;)V", "", "Ljava/util/Set;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PickFeedbackReasonsDialog extends BottomSheetDialog {
    public static final int $stable = 8;
    private final Set<CallFeedbackReason> selectedReasons;

    public PickFeedbackReasonsDialog(Context context, List<? extends CallFeedbackReason> list, Set<? extends CallFeedbackReason> set, tls tlsVar) {
        super(context, w0i0.Messaging_Theme_BottomSheetDialog);
        Set<CallFeedbackReason> M0 = kotlin.collections.a.M0(set);
        this.selectedReasons = M0;
        setContentView(olh0.msg_d_call_feedback_reasons);
        ((RecyclerView) findViewById(e9h0.all_reasons_list)).setAdapter(new duq(context, list, M0, new i4b0(10, this)));
        findViewById(e9h0.done).setOnClickListener(new fx00(22, tlsVar, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$0(PickFeedbackReasonsDialog pickFeedbackReasonsDialog, CallFeedbackReason callFeedbackReason) {
        boolean contains = pickFeedbackReasonsDialog.selectedReasons.contains(callFeedbackReason);
        Set<CallFeedbackReason> set = pickFeedbackReasonsDialog.selectedReasons;
        if (contains) {
            set.remove(callFeedbackReason);
        } else {
            set.add(callFeedbackReason);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(tls tlsVar, PickFeedbackReasonsDialog pickFeedbackReasonsDialog, View view) {
        tlsVar.invoke(kotlin.collections.a.N0(pickFeedbackReasonsDialog.selectedReasons));
        pickFeedbackReasonsDialog.dismiss();
    }
}
