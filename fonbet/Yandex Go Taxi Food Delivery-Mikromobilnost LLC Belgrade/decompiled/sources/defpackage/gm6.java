package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lgm6;", "Lxl6;", "Companion", "em6", "fm6", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class gm6 extends xl6 {
    public static final fm6 Companion = new fm6();
    public final String a;
    public final Integer b;
    public final Integer c;

    public /* synthetic */ gm6(int i, Integer num, Integer num2, String str) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
    }

    /* renamed from: a, reason: from getter */
    public final Integer getC() {
        return this.c;
    }

    /* renamed from: b, reason: from getter */
    public final String getA() {
        return this.a;
    }

    /* renamed from: c, reason: from getter */
    public final Integer getB() {
        return this.b;
    }

    public gm6() {
        this.a = "";
        this.b = null;
        this.c = null;
    }
}
