package defpackage;

import com.yandex.xplat.payment.sdk.YBCardType;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class laa0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final ArrayList g;

    public laa0() {
        this(true, true, true, true, true, true, true, scc.i(YBCardType.YB_PLUS_CARD, YBCardType.YB_CREDIT_LIMIT_CARD, YBCardType.YB_PRO_CARD));
    }

    public laa0(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, ArrayList arrayList) {
        this.a = z;
        this.b = z3;
        this.c = z4;
        this.d = z5;
        this.e = z6;
        this.f = z7;
        this.g = arrayList;
    }
}
