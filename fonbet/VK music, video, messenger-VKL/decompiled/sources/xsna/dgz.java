package xsna;

/* compiled from: QuestionListItems.kt */
/* loaded from: classes16.dex */
public final class dgz implements hfz {
    public final wpe0 b;

    public dgz(wpe0 wpe0Var) {
        this.b = wpe0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dgz) && epx.f(this.b, ((dgz) obj).b);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        StringBuilder sb = new StringBuilder();
        wpe0 wpe0Var = this.b;
        sb.append(wpe0Var.a);
        sb.append('_');
        sb.append(wpe0Var.b);
        return Integer.valueOf(sb.toString().hashCode());
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "SingleSelectQuestion(question=" + this.b + ')';
    }
}
