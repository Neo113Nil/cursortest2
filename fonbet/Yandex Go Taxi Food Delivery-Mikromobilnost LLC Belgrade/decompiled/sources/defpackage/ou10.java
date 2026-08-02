package defpackage;

import androidx.lifecycle.DefaultLifecycleObserver;
import com.yandex.messaging.internal.view.messagemenu.MessageMenuDialog;

/* loaded from: classes15.dex */
public final class ou10 implements DefaultLifecycleObserver {
    public MessageMenuDialog a;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(pey peyVar) {
        MessageMenuDialog messageMenuDialog = this.a;
        if (messageMenuDialog != null) {
            messageMenuDialog.dismiss();
        }
        this.a = null;
    }
}
