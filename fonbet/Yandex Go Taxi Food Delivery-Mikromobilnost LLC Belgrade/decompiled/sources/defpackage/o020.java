package defpackage;

import com.yandex.messaging.activity.calls.MessengerCallFeedbackActivity;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes15.dex */
public final /* synthetic */ class o020 implements jms {
    public final /* synthetic */ MessengerCallFeedbackActivity a;

    public o020(MessengerCallFeedbackActivity messengerCallFeedbackActivity) {
        this.a = messengerCallFeedbackActivity;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o020) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(0, this.a, MessengerCallFeedbackActivity.class, "finish", "finish()V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
