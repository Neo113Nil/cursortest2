package xsna;

import com.vk.im.engine.models.dialogs.Dialog;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class zib implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;

    public /* synthetic */ zib(long j, int i) {
        this.b = i;
        this.c = j;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return bdb.a((bdb) obj, 0, 0, 0, 0, 0, 0, null, null, null, false, false, null, null, 0, null, Long.valueOf(this.c), null, null, null, null, null, null, null, false, false, -524289, 7);
            default:
                Object obj2 = ((wpp) obj).c.get(Long.valueOf(this.c));
                if (obj2 != null) {
                    return (Dialog) obj2;
                }
                throw new IllegalArgumentException("Required value was null.");
        }
    }
}
