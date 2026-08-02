package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lmcv;", "", "Companion", "jcv", "kcv", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class mcv {
    public static final kcv Companion = new kcv();
    public static final i3y[] f = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new syu(18)), null, null, null};
    public final String a;
    public final Float[] b;
    public final Boolean c;
    public final bxu0 d;
    public final bxu0 e;

    public /* synthetic */ mcv(int i, String str, Float[] fArr, Boolean bool, bxu0 bxu0Var, bxu0 bxu0Var2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = fArr;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bool;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bxu0Var;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = bxu0Var2;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final Float[] getB() {
        return this.b;
    }

    public mcv() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }
}
