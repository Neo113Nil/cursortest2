package xsna;

/* compiled from: StoryAppUpdateEvent.kt */
/* loaded from: classes6.dex */
public final class axl0 {
    public final int a;
    public final long b;

    public axl0(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axl0)) {
            return false;
        }
        axl0 axl0Var = (axl0) obj;
        return this.a == axl0Var.a && this.b == axl0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + bh10.a(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryAppUpdateEvent(storyEntryId=");
        sb.append(this.a);
        sb.append(", appStickerId=");
        return efz.b(this.b, ", hasNewInteraction=false)", sb);
    }
}
