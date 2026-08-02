package defpackage;

/* loaded from: classes.dex */
public final class oes extends nes {
    public long f;
    public long g;

    @Override // defpackage.nes, defpackage.mes
    public final boolean equals(Object obj) {
        if (!(obj instanceof oes) || !super.equals(obj)) {
            return false;
        }
        oes oesVar = (oes) obj;
        return this.f == oesVar.f && this.g == oesVar.g;
    }

    @Override // defpackage.nes, defpackage.mes
    public final int hashCode() {
        return Long.hashCode(this.g) + (Long.hashCode(this.f) * 31) + (super.hashCode() * 31);
    }

    @Override // defpackage.nes, defpackage.mes
    public final String toString() {
        StringBuilder sb = new StringBuilder("FrameData(frameStartNanos=");
        sb.append(this.b);
        sb.append(", frameDurationUiNanos=");
        sb.append(this.c);
        sb.append(", frameDurationCpuNanos=");
        sb.append(this.e);
        sb.append(", frameDurationTotalNanos=");
        sb.append(this.f);
        sb.append(", frameOverrunNanos=");
        sb.append(this.g);
        sb.append(", isJank=");
        sb.append(this.d);
        sb.append(", states=");
        return unr0.t(sb, this.a, ')');
    }
}
