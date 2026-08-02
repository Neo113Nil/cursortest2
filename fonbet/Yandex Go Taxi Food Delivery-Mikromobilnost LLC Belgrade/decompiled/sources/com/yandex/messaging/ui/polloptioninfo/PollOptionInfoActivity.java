package com.yandex.messaging.ui.polloptioninfo;

import android.os.Bundle;
import com.yandex.messaging.activity.MessengerActivityBase;
import defpackage.dlb1;
import defpackage.eja1;
import defpackage.fcg;
import defpackage.g720;
import defpackage.glb1;
import defpackage.i3y;
import defpackage.jqr;
import defpackage.mt11;
import defpackage.qs11;
import defpackage.qxd0;
import defpackage.r0d0;
import defpackage.vg10;
import defpackage.z83;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/yandex/messaging/ui/polloptioninfo/PollOptionInfoActivity;", "Lcom/yandex/messaging/activity/MessengerActivityBase;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "Lqs11;", "ui$delegate", "Li3y;", "getUi", "()Lqs11;", "ui", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PollOptionInfoActivity extends MessengerActivityBase {
    public static final int $stable = 8;

    /* renamed from: ui$delegate, reason: from kotlin metadata */
    private final i3y ui = kotlin.a.a(new r0d0(12, this));

    /* JADX INFO: Access modifiers changed from: private */
    public final qs11 getUi() {
        return (qs11) this.ui.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qs11 ui_delegate$lambda$0(PollOptionInfoActivity pollOptionInfoActivity) {
        return new qs11(pollOptionInfoActivity);
    }

    @Override // com.yandex.messaging.activity.MessengerActivityBase, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        Bundle extras;
        qxd0 qxd0Var;
        super.onCreate(savedInstanceState);
        setContentView(getUi().getRoot());
        if (savedInstanceState == null || (extras = savedInstanceState.getBundle(qxd0.class.getName())) == null) {
            extras = getIntent().getExtras();
        }
        if (extras != null) {
            String d = dlb1.d(extras, "Messaging.Arguments.Source");
            int i = g720.c;
            g720 b = glb1.b(d);
            String d2 = dlb1.d(extras, "message_chat_id");
            long c = dlb1.c(extras, "message_timestamp");
            String string = extras.getString("original_message_chat_id");
            Long valueOf = Long.valueOf(extras.getLong("original_message_timestamp"));
            if (!extras.keySet().contains("answer_id")) {
                vg10.d("missing required key ".concat("answer_id"));
                return;
            }
            qxd0Var = new qxd0(b, d2, c, string, valueOf, extras.getInt("answer_id"));
        } else {
            qxd0Var = null;
        }
        z83.d(qxd0Var, null);
        if (qxd0Var == null) {
            return;
        }
        e.H(eja1.s(this), new jqr(((fcg) mt11.a(this)).b().b, new PollOptionInfoActivity$onCreate$1(this, qxd0Var, null), 3));
    }
}
