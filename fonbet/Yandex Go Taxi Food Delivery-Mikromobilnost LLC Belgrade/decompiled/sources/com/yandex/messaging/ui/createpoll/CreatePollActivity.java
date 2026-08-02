package com.yandex.messaging.ui.createpoll;

import android.os.Bundle;
import com.yandex.messaging.activity.MessengerActivityBase;
import defpackage.dlb1;
import defpackage.eja1;
import defpackage.fcg;
import defpackage.i3y;
import defpackage.l7f;
import defpackage.lyc;
import defpackage.mt11;
import defpackage.n1f;
import defpackage.ns11;
import defpackage.ny61;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/yandex/messaging/ui/createpoll/CreatePollActivity;", "Lcom/yandex/messaging/activity/MessengerActivityBase;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "Lns11;", "ui$delegate", "Li3y;", "getUi", "()Lns11;", "ui", "Ll7f;", "getArguments", "()Ll7f;", "arguments", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CreatePollActivity extends MessengerActivityBase {
    public static final int $stable = 8;

    /* renamed from: ui$delegate, reason: from kotlin metadata */
    private final i3y ui = kotlin.a.a(new lyc(26, this));

    /* JADX INFO: Access modifiers changed from: private */
    public final l7f getArguments() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            return (l7f) dlb1.b(extras);
        }
        ny61.g("Required value was null.");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ns11 getUi() {
        return (ns11) this.ui.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ns11 ui_delegate$lambda$0(CreatePollActivity createPollActivity) {
        return new ns11(createPollActivity);
    }

    @Override // com.yandex.messaging.activity.MessengerActivityBase, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getUi().getRoot());
        e.H(eja1.s(this), new n1f(1, ((fcg) mt11.a(this)).b().b, this));
    }
}
