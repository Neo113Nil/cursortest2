package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lnxu0;", "", "Companion", "lxu0", "mxu0", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class nxu0 {
    public static final mxu0 Companion = new mxu0();
    public final float a;
    public final String b;

    public /* synthetic */ nxu0(String str, int i, float f) {
        this.a = (i & 1) == 0 ? 0.0f : f;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getB() {
        return this.b;
    }

    /* renamed from: b, reason: from getter */
    public final float getA() {
        return this.a;
    }

    public nxu0() {
        this.a = 0.0f;
        this.b = null;
    }
}
