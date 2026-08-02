package xsna;

import ru.ok.android.externcalls.sdk.id.ParticipantId;

/* compiled from: ConfigureSessionRoomsListItemUnassignedParticipant.kt */
/* loaded from: classes7.dex */
public final class i2j implements hfz {
    public final ParticipantId b;
    public final sew0 c;
    public final String d;

    public i2j(ParticipantId participantId, sew0 sew0Var, String str) {
        this.b = participantId;
        this.c = sew0Var;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2j)) {
            return false;
        }
        i2j i2jVar = (i2j) obj;
        return epx.f(this.b, i2jVar.b) && epx.f(this.c, i2jVar.c) && epx.f(this.d, i2jVar.d);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.b.hashCode());
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        sew0 sew0Var = this.c;
        return this.d.hashCode() + ((hashCode + (sew0Var == null ? 0 : sew0Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConfigureSessionRoomsListItemUnassignedParticipant(participantId=");
        sb.append(this.b);
        sb.append(", avatar=");
        sb.append(this.c);
        sb.append(", fullName=");
        return ho8.a(sb, this.d, ')');
    }
}
