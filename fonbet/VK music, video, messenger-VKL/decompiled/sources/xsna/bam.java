package xsna;

import com.vk.dto.common.Peer;

/* compiled from: DialogArchiveLpEvent.kt */
/* loaded from: classes2.dex */
public final class bam implements e900 {
    public final Peer a;
    public final boolean b;

    public bam(Peer peer, boolean z) {
        this.a = peer;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bam)) {
            return false;
        }
        bam bamVar = (bam) obj;
        return this.a.equals(bamVar.a) && this.b == bamVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogArchiveLpEvent(dialog=");
        sb.append(this.a);
        sb.append(", isArchived=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
