package xsna;

/* compiled from: StoryDialogOpenParams.kt */
/* loaded from: classes6.dex */
public final class enm0 {
    public final Integer a;

    public enm0() {
        this(null);
    }

    public final Integer a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof enm0) && epx.f(this.a, ((enm0) obj).a);
    }

    public final int hashCode() {
        Integer num = this.a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return uqi.b(new StringBuilder("StoryViewerConfig(forceLaunchPosition="), this.a, ')');
    }

    public enm0(Integer num) {
        this.a = num;
    }
}
