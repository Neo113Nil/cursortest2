package xsna;

import com.vk.core.preference.Preference;

/* compiled from: PreferenceDelegates.kt */
/* loaded from: classes.dex */
public final class f18 implements p7f0<Object, Boolean> {
    public final String b;
    public final String c;
    public final boolean d;

    public f18(String str, String str2, boolean z) {
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final Boolean a() {
        return Boolean.valueOf(Preference.d(this.b, this.c, this.d));
    }

    public final void b(boolean z) {
        Preference.I(this.b, this.c, z);
    }

    @Override // xsna.i7f0
    public final /* bridge */ /* synthetic */ Object getValue(Object obj, qcy qcyVar) {
        return a();
    }

    @Override // xsna.p7f0
    public final /* bridge */ /* synthetic */ void setValue(Object obj, qcy qcyVar, Boolean bool) {
        b(bool.booleanValue());
    }
}
