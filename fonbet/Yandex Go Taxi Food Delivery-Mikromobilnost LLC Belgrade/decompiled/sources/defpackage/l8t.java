package defpackage;

import com.yandex.messaging.ChatRequest;

/* loaded from: classes15.dex */
public final class l8t {
    public final ChatRequest a;

    public l8t(ChatRequest chatRequest) {
        this.a = chatRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l8t) && jl40.l(this.a, ((l8t) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PreviewParams(chatRequest=" + this.a + ", doNotShowHidden=false)";
    }
}
