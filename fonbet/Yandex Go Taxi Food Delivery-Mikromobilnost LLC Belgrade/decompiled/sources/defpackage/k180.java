package defpackage;

import com.yandex.fintechsdk.data.payment.impl.internal.order.datasources.network.requesters.metainfo.response.SimplifiedPaymentStatus;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes12.dex */
public final class k180 {
    public static final j180 Companion = new j180();
    public static final i3y[] h;
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final SimplifiedPaymentStatus e;
    public final SimplifiedPaymentStatus f;
    public final String g;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new i3y[]{null, null, null, null, a.b(lazyThreadSafetyMode, new fs70(21)), a.b(lazyThreadSafetyMode, new fs70(22)), null};
    }

    public /* synthetic */ k180(int i, String str, String str2, String str3, boolean z, SimplifiedPaymentStatus simplifiedPaymentStatus, SimplifiedPaymentStatus simplifiedPaymentStatus2, String str4) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, i180.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = simplifiedPaymentStatus;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = simplifiedPaymentStatus2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str4;
        }
    }
}
