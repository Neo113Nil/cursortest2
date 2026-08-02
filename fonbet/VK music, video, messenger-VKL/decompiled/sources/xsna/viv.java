package xsna;

import java.util.ArrayList;

/* compiled from: VkReefWatcherEvent.kt */
/* loaded from: classes5.dex */
public final class viv extends ufv0 {
    public final int a;

    public viv(int i) {
        this.a = i;
    }

    @Override // xsna.ufv0
    public final boolean a(xof0 xof0Var) {
        ArrayList arrayList = xof0Var.b;
        return (arrayList.isEmpty() || arrayList.contains(Integer.valueOf(this.a))) ? false : true;
    }
}
