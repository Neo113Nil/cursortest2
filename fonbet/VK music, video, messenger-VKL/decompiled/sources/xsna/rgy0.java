package xsna;

import java.util.Objects;
import one.video.calls.sdk_private.ap$a;
import one.video.calls.sdk_private.bJ;

/* compiled from: FramesCheckFilter.java */
/* loaded from: classes8.dex */
public final class rgy0 extends mgy0 {
    @Override // xsna.hly0
    public final void a(tly0 tly0Var, com.vk.movika.sdk.base.data.converter.c cVar) throws bJ {
        if (!(tly0Var instanceof uly0) && !(tly0Var instanceof amy0) && tly0Var.c.isEmpty()) {
            Objects.toString(tly0Var);
            throw new bJ(ap$a.PROTOCOL_VIOLATION, "packet must contain at least one frame");
        }
        if (tly0Var instanceof cly0) {
            cly0 cly0Var = (cly0) tly0Var;
            if (!cly0Var.c.stream().allMatch(new jnz(1))) {
                Objects.toString(cly0Var);
                throw new bJ(ap$a.PROTOCOL_VIOLATION, "packet contains frame type that is not permitted");
            }
        } else if (tly0Var instanceof aly0) {
            aly0 aly0Var = (aly0) tly0Var;
            if (!aly0Var.c.stream().allMatch(new pgy0())) {
                Objects.toString(aly0Var);
                throw new bJ(ap$a.PROTOCOL_VIOLATION, "packet contains frame type that is not permitted");
            }
        } else if (tly0Var instanceof hmy0) {
            hmy0 hmy0Var = (hmy0) tly0Var;
            if (hmy0Var.c.stream().anyMatch(new qgy0())) {
                Objects.toString(hmy0Var);
                throw new bJ(ap$a.PROTOCOL_VIOLATION, "packet contains frame type that is not permitted");
            }
        }
        b(tly0Var, cVar);
    }
}
