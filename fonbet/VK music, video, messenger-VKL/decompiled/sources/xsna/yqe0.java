package xsna;

import com.vk.voip.ui.VoipViewModelState;

/* compiled from: AnonymousQueueDelegateSubscribeProviderImpl.kt */
/* loaded from: classes7.dex */
public final class yqe0 {
    public final s1v a;
    public final VoipViewModelState b;
    public final boolean c;

    public yqe0(s1v s1vVar, VoipViewModelState voipViewModelState, boolean z) {
        this.a = s1vVar;
        this.b = voipViewModelState;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yqe0)) {
            return false;
        }
        yqe0 yqe0Var = (yqe0) obj;
        return epx.f(this.a, yqe0Var.a) && this.b == yqe0Var.b && this.c == yqe0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QueueAnonymousInfo(secretAndAnonymIdProvider=");
        sb.append(this.a);
        sb.append(", currentCallState=");
        sb.append(this.b);
        sb.append(", forceSubscribeAnonymously=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
