package xsna;

/* compiled from: SuperAppWidgetsSseQueueEvent.kt */
/* loaded from: classes5.dex */
public final class qen0 {
    public final String a;

    public qen0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qen0) && epx.f(this.a, ((qen0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("SuperAppWidgetsSseQueueEvent(singleQueueId="), this.a, ')');
    }
}
