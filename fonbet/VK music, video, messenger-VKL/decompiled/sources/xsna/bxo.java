package xsna;

import com.vk.dto.common.Good;
import xsna.asl0;

/* compiled from: _Sequences.kt */
/* loaded from: classes16.dex */
public final class bxo implements izs {
    public static final bxo c = new bxo(0);
    public static final bxo d = new bxo(1);
    public final /* synthetic */ int b;

    public /* synthetic */ bxo(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(obj instanceof Good);
            default:
                return Boolean.valueOf(obj instanceof asl0.a);
        }
    }
}
