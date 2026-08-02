package xsna;

import com.vk.core.preference.Preference;

/* compiled from: PreferenceDelegates.kt */
/* loaded from: classes.dex */
public final class hn70 implements p7f0<Object, Long> {
    public final String b;
    public final String c;
    public final long d;

    public /* synthetic */ hn70(String str, String str2) {
        this(str, str2, 0L);
    }

    public final Long a() {
        return Long.valueOf(Preference.m(this.d, this.b, this.c));
    }

    public final void b(long j) {
        Preference.F(j, this.b, this.c);
    }

    @Override // xsna.i7f0
    public final /* bridge */ /* synthetic */ Object getValue(Object obj, qcy qcyVar) {
        return a();
    }

    @Override // xsna.p7f0
    public final /* bridge */ /* synthetic */ void setValue(Object obj, qcy qcyVar, Long l) {
        b(l.longValue());
    }

    public hn70(String str, String str2, long j) {
        this.b = str;
        this.c = str2;
        this.d = j;
    }
}
