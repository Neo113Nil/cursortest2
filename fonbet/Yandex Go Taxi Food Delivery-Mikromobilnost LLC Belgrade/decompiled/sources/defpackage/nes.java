package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class nes extends mes {
    public long e;

    public nes(ArrayList arrayList) {
        super(arrayList);
        this.e = 0L;
    }

    @Override // defpackage.mes
    public boolean equals(Object obj) {
        return (obj instanceof nes) && super.equals(obj) && this.e == ((nes) obj).e;
    }

    @Override // defpackage.mes
    public int hashCode() {
        return Long.hashCode(this.e) + (super.hashCode() * 31);
    }

    @Override // defpackage.mes
    public String toString() {
        StringBuilder sb = new StringBuilder("FrameData(frameStartNanos=");
        sb.append(this.b);
        sb.append(", frameDurationUiNanos=");
        sb.append(this.c);
        sb.append(", frameDurationCpuNanos=");
        sb.append(this.e);
        sb.append(", isJank=");
        sb.append(this.d);
        sb.append(", states=");
        return unr0.t(sb, this.a, ')');
    }
}
