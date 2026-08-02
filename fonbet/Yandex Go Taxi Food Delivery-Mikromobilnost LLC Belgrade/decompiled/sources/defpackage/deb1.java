package defpackage;

import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;
import com.yandex.go.design.compose.slot.SlotSize;
import ru.rt.ebs.cryptosdk.common.extensions.b;

/* loaded from: classes11.dex */
public abstract class deb1 {
    public static ICameraUpdateFactoryDelegate a;

    public static final float a(SlotSize slotSize) {
        int i = ius0.a[slotSize.ordinal()];
        if (i != 1) {
            return i != 2 ? 16.0f : 14.0f;
        }
        return 12.0f;
    }

    public static final boolean b(SlotSize slotSize) {
        return slotSize == SlotSize.S || slotSize == SlotSize.XS;
    }

    public static final void c(pey peyVar, tls tlsVar) {
        tje.N(eja1.s(peyVar), null, null, new b(peyVar, tlsVar, null), 3);
    }
}
