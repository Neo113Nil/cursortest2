package xsna;

import android.os.LocaleList;

/* compiled from: LocaleListPlatformWrapper.java */
/* loaded from: classes.dex */
public final class owz implements nwz {
    public final LocaleList a;

    public owz(LocaleList localeList) {
        this.a = localeList;
    }

    public final boolean equals(Object obj) {
        return this.a.equals(((nwz) obj).getLocaleList());
    }

    @Override // xsna.nwz
    public final Object getLocaleList() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
