package xsna;

import com.vk.geo.impl.model.BoundingBox;
import java.util.List;
import xsna.luu;

/* compiled from: Group.kt */
/* loaded from: classes2.dex */
public final class wgu<T extends luu> implements luu {
    public final List<T> b;
    public final BoundingBox c;
    public final BoundingBox d;

    /* JADX WARN: Multi-variable type inference failed */
    public wgu(List<? extends T> list) {
        this.b = list;
        BoundingBox a = w2r0.a(list);
        this.c = a;
        this.d = a;
    }

    @Override // xsna.luu, xsna.ktx0
    public final lif0 d() {
        return this.c;
    }

    @Override // xsna.luu
    public final snt n() {
        return this.d;
    }
}
