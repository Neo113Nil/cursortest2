package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes11.dex */
public final class bw00 extends tw01 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bw00(Iterator it, int i) {
        super(it, 0);
        this.c = i;
    }

    @Override // defpackage.tw01
    public final Object a(Object obj) {
        switch (this.c) {
            case 0:
                return ((Map.Entry) obj).getKey();
            default:
                return ((Map.Entry) obj).getValue();
        }
    }
}
