package ru.mail.libverify.d;

import java.util.ArrayList;
import ru.mail.verify.core.utils.Gsonable;
import xsna.epx;

/* loaded from: classes9.dex */
public final class a implements Gsonable {
    private final ArrayList<b> redirects;

    public a(ArrayList<b> arrayList) {
        this.redirects = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && epx.f(this.redirects, ((a) obj).redirects);
    }

    public final int hashCode() {
        return this.redirects.hashCode();
    }

    public final String toString() {
        return "";
    }

    public a() {
        this(new ArrayList());
    }
}
