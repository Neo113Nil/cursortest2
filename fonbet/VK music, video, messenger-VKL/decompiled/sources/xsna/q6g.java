package xsna;

import androidx.recyclerview.widget.m;
import java.util.Arrays;

/* compiled from: ColorItem.kt */
/* loaded from: classes2.dex */
public final class q6g implements t1c {
    public static final a e = new a();
    public final String a;
    public final int[] b;
    public final int[] c;
    public final boolean d;

    /* compiled from: ColorItem.kt */
    public static final class a extends m.e<q6g> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(q6g q6gVar, q6g q6gVar2) {
            q6g q6gVar3 = q6gVar;
            q6g q6gVar4 = q6gVar2;
            return epx.f(q6gVar3.a, q6gVar4.a) && q6gVar3.d == q6gVar4.d;
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(q6g q6gVar, q6g q6gVar2) {
            return epx.f(q6gVar.a, q6gVar2.a);
        }
    }

    public q6g(String str, int[] iArr, int[] iArr2, boolean z) {
        this.a = str;
        this.b = iArr;
        this.c = iArr2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!q6g.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        q6g q6gVar = (q6g) obj;
        return epx.f(this.a, q6gVar.a) && Arrays.equals(this.b, q6gVar.b) && Arrays.equals(this.c, q6gVar.c) && this.d == q6gVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + dq.d(dq.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    @Override // xsna.t1c
    public final boolean isChecked() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ColorItem(id=");
        sb.append(this.a);
        sb.append(", gradient=");
        mq.f(this.b, sb, ", gradientDark=");
        mq.f(this.c, sb, ", isChecked=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
