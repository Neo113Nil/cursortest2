package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes9.dex */
public final class amw0 {
    public static final zlw0 Companion = new zlw0();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new xlw0(0))};
    public final List a;

    public /* synthetic */ amw0(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            qje.Z(i, 1, ylw0.a.getDescriptor());
            throw null;
        }
    }

    public amw0(ArrayList arrayList) {
        this.a = arrayList;
    }
}
