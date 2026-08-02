package xsna;

import com.vk.stat.scheme.CommonAudioStat$AudioDomainEventEntity;

/* compiled from: ClickEntityParams.kt */
/* loaded from: classes3.dex */
public final class ajc {
    public final String a;
    public final String b;
    public final String c;
    public final CommonAudioStat$AudioDomainEventEntity d;
    public final int e;

    public ajc(String str, String str2, String str3, CommonAudioStat$AudioDomainEventEntity commonAudioStat$AudioDomainEventEntity, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = commonAudioStat$AudioDomainEventEntity;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajc)) {
            return false;
        }
        ajc ajcVar = (ajc) obj;
        return epx.f(this.a, ajcVar.a) && epx.f(this.b, ajcVar.b) && epx.f(this.c, ajcVar.c) && epx.f(this.d, ajcVar.d) && this.e == ajcVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + ((this.d.hashCode() + urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClickEntityParams(blockId=");
        sb.append(this.a);
        sb.append(", sectionId=");
        sb.append(this.b);
        sb.append(", trackCode=");
        sb.append(this.c);
        sb.append(", entity=");
        sb.append(this.d);
        sb.append(", posId=");
        return vu5.b(sb, this.e, ')');
    }
}
