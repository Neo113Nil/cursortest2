package ru.mail.libverify.i;

import ru.mail.verify.core.utils.Gsonable;

/* loaded from: classes9.dex */
public final class j implements Gsonable {
    private final boolean viewPush;

    public j(boolean z) {
        this.viewPush = z;
    }

    public final boolean a() {
        return this.viewPush;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && this.viewPush == ((j) obj).viewPush;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.viewPush);
    }

    public final String toString() {
        return "";
    }

    public j() {
        this(false);
    }
}
