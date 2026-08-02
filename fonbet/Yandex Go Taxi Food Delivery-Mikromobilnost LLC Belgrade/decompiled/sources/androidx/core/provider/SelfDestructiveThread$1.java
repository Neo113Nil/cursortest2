package androidx.core.provider;

import android.os.Handler;
import android.os.Message;
import defpackage.wmq0;

/* loaded from: classes10.dex */
class SelfDestructiveThread$1 implements Handler.Callback {
    final /* synthetic */ wmq0 this$0;

    public SelfDestructiveThread$1(wmq0 wmq0Var) {
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            throw null;
        }
        if (i != 1) {
            return true;
        }
        throw null;
    }
}
