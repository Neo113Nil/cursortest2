package defpackage;

import com.yandex.go.layers.api.model.params.AutoScale;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lbxu0;", "", "Companion", "xwu0", "zwu0", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class bxu0 {
    public static final zwu0 Companion = new zwu0();
    public final Integer a;
    public final hxu0 b;
    public final Float c;
    public final AutoScale d;
    public final hxu0 e;
    public final nxu0 f;

    public /* synthetic */ bxu0(int i, Integer num, hxu0 hxu0Var, Float f, AutoScale autoScale, hxu0 hxu0Var2, nxu0 nxu0Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = hxu0Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = f;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = autoScale;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = hxu0Var2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = nxu0Var;
        }
    }

    /* renamed from: a, reason: from getter */
    public final AutoScale getD() {
        return this.d;
    }

    /* renamed from: b, reason: from getter */
    public final Integer getA() {
        return this.a;
    }

    /* renamed from: c, reason: from getter */
    public final hxu0 getB() {
        return this.b;
    }

    /* renamed from: d, reason: from getter */
    public final nxu0 getF() {
        return this.f;
    }

    /* renamed from: e, reason: from getter */
    public final Float getC() {
        return this.c;
    }

    /* renamed from: f, reason: from getter */
    public final hxu0 getE() {
        return this.e;
    }

    public bxu0() {
        this(null, 63);
    }

    public bxu0(hxu0 hxu0Var, int i) {
        hxu0Var = (i & 2) != 0 ? null : hxu0Var;
        this.a = null;
        this.b = hxu0Var;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }
}
