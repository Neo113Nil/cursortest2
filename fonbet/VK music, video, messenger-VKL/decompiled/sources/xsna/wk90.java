package xsna;

import ru.ok.android.externcalls.sdk.id.ParticipantId;

/* compiled from: ParticipantPreview.kt */
/* loaded from: classes7.dex */
public final class wk90 {
    public final ParticipantId a;
    public final String b;
    public final sew0 c;
    public final boolean d;

    public wk90(ParticipantId participantId, String str, sew0 sew0Var, boolean z) {
        this.a = participantId;
        this.b = str;
        this.c = sew0Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wk90)) {
            return false;
        }
        wk90 wk90Var = (wk90) obj;
        return epx.f(this.a, wk90Var.a) && epx.f(this.b, wk90Var.b) && epx.f(this.c, wk90Var.c) && this.d == wk90Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParticipantPreview(id=");
        sb.append(this.a);
        sb.append(", fullName=");
        sb.append(this.b);
        sb.append(", avatar=");
        sb.append(this.c);
        sb.append(", isFemale=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
