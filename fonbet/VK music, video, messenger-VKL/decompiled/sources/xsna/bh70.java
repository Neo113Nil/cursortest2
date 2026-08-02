package xsna;

/* compiled from: NotificationSettingsPatch.kt */
/* loaded from: classes5.dex */
public final class bh70 implements ug70 {
    public final Integer b;

    public bh70(Integer num) {
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bh70) && epx.f(this.b, ((bh70) obj).b);
    }

    public final int hashCode() {
        Integer num = this.b;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return uqi.b(new StringBuilder("DndUntilChanged(dndUntil="), this.b, ')');
    }
}
