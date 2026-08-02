package xsna;

import android.content.Context;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.uxd0;

/* compiled from: ChatProfileSnackbarEventsHandler.kt */
/* loaded from: classes2.dex */
public final class rxb {
    public final Context a;

    public rxb(Context context) {
        this.a = context;
    }

    public final void a() {
        edw edwVar = edw.a;
        edw.a();
    }

    public final void b(uxd0.q0 q0Var) {
        a();
        boolean z = q0Var instanceof uxd0.q0.a;
        Context context = this.a;
        if (z) {
            edw edwVar = edw.a;
            edw.c(context, ((uxd0.q0.a) q0Var).a);
        } else if (q0Var instanceof uxd0.q0.d) {
            edw.k(edw.a, context, R.string.vkim_dialogs_unarchived_toast);
        } else if (q0Var instanceof uxd0.q0.c) {
            edw.k(edw.a, context, R.string.vkim_chat_profile_pinned_chat_snackbar_title);
        } else if (q0Var instanceof uxd0.q0.e) {
            edw.k(edw.a, context, R.string.vkim_chat_profile_unpinned_chat_snackbar_title);
        } else if ((q0Var instanceof uxd0.q0.b) || (q0Var instanceof uxd0.q0.f)) {
            edw.k(edw.a, context, R.string.vkim_chat_profile_chat_cleared_snackbar_title);
        } else if (q0Var instanceof uxd0.q0.m) {
            edw.k(edw.a, context, R.string.vkim_chat_profile_user_added_to_blacklist_snackbar_title);
        } else if (q0Var instanceof uxd0.q0.n) {
            edw.k(edw.a, context, R.string.vkim_chat_profile_user_removed_from_blacklist_snackbar_title);
        } else if (q0Var instanceof uxd0.q0.h) {
            edw.k(edw.a, context, R.string.vkim_chat_profile_group_messages_unblocked);
        } else if (q0Var instanceof uxd0.q0.g) {
            edw.k(edw.a, context, R.string.vkim_chat_profile_group_messages_blocked);
        } else if (q0Var instanceof uxd0.q0.k) {
            edw.k(edw.a, context, R.string.vkim_chat_profile_notifications_enabled_snackbar_title);
        } else if (q0Var instanceof uxd0.q0.j) {
            edw.k(edw.a, context, R.string.vkim_chat_profile_notifications_disabled_snackbar_title);
        } else if (q0Var instanceof uxd0.q0.l) {
            edw.k(edw.a, context, R.string.vkim_chat_profile_notifications_muted_snackbar_title);
        } else {
            if (!(q0Var instanceof uxd0.q0.i)) {
                throw new NoWhenBranchMatchedException();
            }
            edw edwVar2 = edw.a;
            uxd0.q0.i iVar = (uxd0.q0.i) q0Var;
            edw.e(context, iVar.a, iVar.b);
        }
        s3q0 s3q0Var = s3q0.a;
    }
}
