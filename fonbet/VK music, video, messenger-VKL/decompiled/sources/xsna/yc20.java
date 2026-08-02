package xsna;

/* compiled from: MessageViewsUserItem.kt */
/* loaded from: classes2.dex */
public final class yc20 implements hfz {
    public final qtd0 b;

    public yc20(qtd0 qtd0Var) {
        this.b = qtd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yc20) && epx.f(this.b, ((yc20) obj).b);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Long.valueOf(this.b.id());
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return qq.f(new StringBuilder("MessageViewsUserItem(profile="), this.b, ')');
    }
}
