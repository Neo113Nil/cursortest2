package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lhxu0;", "", "Companion", "fxu0", "gxu0", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class hxu0 {
    public static final gxu0 Companion = new gxu0();
    public static final i3y[] g = {null, null, null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new bmu0(19)), null};
    public final String a;
    public final kxu0 b;
    public final String c;
    public final String d;
    public final Float[] e;
    public final float f;

    public /* synthetic */ hxu0(int i, String str, kxu0 kxu0Var, String str2, String str3, Float[] fArr, float f) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = kxu0Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = fArr;
        }
        if ((i & 32) == 0) {
            this.f = 0.0f;
        } else {
            this.f = f;
        }
    }

    /* renamed from: a, reason: from getter */
    public final Float[] getE() {
        return this.e;
    }

    /* renamed from: b, reason: from getter */
    public final float getF() {
        return this.f;
    }

    /* renamed from: c, reason: from getter */
    public final String getC() {
        return this.c;
    }

    /* renamed from: d, reason: from getter */
    public final kxu0 getB() {
        return this.b;
    }

    /* renamed from: e, reason: from getter */
    public final String getA() {
        return this.a;
    }

    /* renamed from: f, reason: from getter */
    public final String getD() {
        return this.d;
    }

    public hxu0() {
        this(null, null, 63);
    }

    public hxu0(String str, Float[] fArr, int i) {
        str = (i & 8) != 0 ? null : str;
        fArr = (i & 16) != 0 ? null : fArr;
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = str;
        this.e = fArr;
        this.f = 0.0f;
    }
}
