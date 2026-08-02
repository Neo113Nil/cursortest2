package xsna;

import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;

/* compiled from: NewsfeedListState.kt */
/* loaded from: classes4.dex */
public final class ur60 implements lm50 {
    public static final ur60 h = new ur60(sq60.i, new qtc0(jgp.b), null, ListLoadingState.IDLE, false, false);
    public final sq60 b;
    public final qtc0 c;
    public final String d;
    public final ListLoadingState e;
    public final boolean f;
    public final boolean g;

    public ur60(sq60 sq60Var, qtc0 qtc0Var, String str, ListLoadingState listLoadingState, boolean z, boolean z2) {
        this.b = sq60Var;
        this.c = qtc0Var;
        this.d = str;
        this.e = listLoadingState;
        this.f = z;
        this.g = z2;
    }

    public static ur60 a(ur60 ur60Var, sq60 sq60Var, qtc0 qtc0Var, String str, ListLoadingState listLoadingState, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            sq60Var = ur60Var.b;
        }
        sq60 sq60Var2 = sq60Var;
        if ((i & 2) != 0) {
            qtc0Var = ur60Var.c;
        }
        qtc0 qtc0Var2 = qtc0Var;
        if ((i & 4) != 0) {
            str = ur60Var.d;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            listLoadingState = ur60Var.e;
        }
        ListLoadingState listLoadingState2 = listLoadingState;
        if ((i & 16) != 0) {
            z = ur60Var.f;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            z2 = ur60Var.g;
        }
        ur60Var.getClass();
        return new ur60(sq60Var2, qtc0Var2, str2, listLoadingState2, z3, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ur60)) {
            return false;
        }
        ur60 ur60Var = (ur60) obj;
        return epx.f(this.b, ur60Var.b) && epx.f(this.c, ur60Var.c) && epx.f(this.d, ur60Var.d) && this.e == ur60Var.e && this.f == ur60Var.f && this.g == ur60Var.g;
    }

    public final int hashCode() {
        int a = vul0.a(this.b.hashCode() * 31, 31, this.c.a);
        String str = this.d;
        return Boolean.hashCode(this.g) + qoy.b((this.e.hashCode() + ((a + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.f);
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, java.util.Map] */
    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedListState@");
        sb.append(System.identityHashCode(this));
        sb.append("(list@");
        sq60 sq60Var = this.b;
        int identityHashCode = System.identityHashCode(sq60Var.a);
        ro.d(16);
        sb.append(Integer.toString(identityHashCode, 16));
        sb.append("=NewsfeedHolderUiDto[");
        sb.append(sq60Var.a.size());
        sb.append("], activitiesSize=");
        sb.append(this.c.a.size());
        sb.append(", holderOffsets@");
        c9x c9xVar = sq60Var.c;
        int identityHashCode2 = System.identityHashCode(c9xVar);
        ro.d(16);
        sb.append(Integer.toString(identityHashCode2, 16));
        sb.append("=NewsfeedHolderOffsets[");
        sb.append(c9xVar.e);
        sb.append("], nextFrom=");
        sb.append(this.d);
        sb.append(", loadingState=");
        sb.append(this.e);
        sb.append(')');
        return sb.toString();
    }
}
