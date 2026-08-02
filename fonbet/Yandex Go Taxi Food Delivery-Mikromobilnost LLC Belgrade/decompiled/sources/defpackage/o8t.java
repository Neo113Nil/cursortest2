package defpackage;

import com.yandex.messaging.ChatRequest;

/* loaded from: classes15.dex */
public final class o8t {
    public final ChatRequest a;

    public o8t(ChatRequest chatRequest) {
        this.a = chatRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o8t) && jl40.l(this.a, ((o8t) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LastMessageParams(chatRequest=" + this.a + ", doNotShowHidden=false)";
    }
}
