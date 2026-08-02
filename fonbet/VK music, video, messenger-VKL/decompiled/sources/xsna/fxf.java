package xsna;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.messages.Msg;

/* compiled from: CnvMsgAddBatchLpEvent.kt */
/* loaded from: classes2.dex */
public final class fxf implements e900 {
    public final Peer a;
    public final SparseArray<? extends Msg> b;
    public final SparseIntArray c;
    public final SparseBooleanArray d;
    public final SparseBooleanArray e;
    public final Integer f;
    public final Integer g;

    public fxf() {
        throw null;
    }

    public fxf(Peer peer, SparseArray sparseArray, SparseIntArray sparseIntArray, SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2, Integer num, Integer num2, int i) {
        num = (i & 32) != 0 ? null : num;
        num2 = (i & 64) != 0 ? null : num2;
        this.a = peer;
        this.b = sparseArray;
        this.c = sparseIntArray;
        this.d = sparseBooleanArray;
        this.e = sparseBooleanArray2;
        this.f = num;
        this.g = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxf)) {
            return false;
        }
        fxf fxfVar = (fxf) obj;
        return epx.f(this.a, fxfVar.a) && epx.f(this.b, fxfVar.b) && epx.f(this.c, fxfVar.c) && epx.f(this.d, fxfVar.d) && epx.f(this.e, fxfVar.e) && epx.f(this.f, fxfVar.f) && epx.f(this.g, fxfVar.g);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a.b) * 31)) * 31)) * 31)) * 31)) * 31;
        Integer num = this.f;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.g;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "CnvMsgAddBatchLpEvent(dialog=" + this.a + ", msgs=" + zik0.d(this.b) + ')';
    }
}
