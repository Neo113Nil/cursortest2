package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lo1g0;", "Lw2g0;", "Companion", "m1g0", "n1g0", "settings"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class o1g0 implements w2g0 {
    public static final n1g0 Companion = new n1g0();
    public final String a;
    public final p8s0 b;
    public final String c;
    public final String d;

    public /* synthetic */ o1g0(int i, String str, p8s0 p8s0Var, String str2, String str3) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = new p8s0(0);
        } else {
            this.b = p8s0Var;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str3;
        }
    }

    @Override // defpackage.w2g0
    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    @Override // defpackage.w2g0
    public final String b() {
        return "system_settings";
    }

    @Override // defpackage.w2g0
    public final String c() {
        return "push_disabled_popup";
    }

    @Override // defpackage.w2g0
    /* renamed from: d, reason: from getter */
    public final p8s0 getB() {
        return this.b;
    }

    @Override // defpackage.w2g0
    /* renamed from: getSubtitle, reason: from getter */
    public final String getD() {
        return this.d;
    }

    @Override // defpackage.w2g0
    /* renamed from: getTitle, reason: from getter */
    public final String getC() {
        return this.c;
    }

    public o1g0() {
        this(0);
    }

    public o1g0(int i) {
        p8s0 p8s0Var = new p8s0(0);
        this.a = "";
        this.b = p8s0Var;
        this.c = "";
        this.d = "";
    }
}
