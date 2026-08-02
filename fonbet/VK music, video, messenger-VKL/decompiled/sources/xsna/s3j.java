package xsna;

import java.util.ArrayList;

/* compiled from: ConnectedQuestionsPage.kt */
/* loaded from: classes6.dex */
public final class s3j implements hfz {
    public final int b;
    public final ArrayList c;
    public final ArrayList d;

    public s3j(int i, ArrayList arrayList, ArrayList arrayList2) {
        this.b = i;
        this.c = arrayList;
        this.d = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s3j)) {
            return false;
        }
        s3j s3jVar = (s3j) obj;
        return this.b == s3jVar.b && this.c.equals(s3jVar.c) && this.d.equals(s3jVar.d);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return this.d.hashCode() + qr.a(this.c, Integer.hashCode(this.b) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConnectedQuestionsPage(number=");
        sb.append(this.b);
        sb.append(", questions=");
        sb.append(this.c);
        sb.append(", uiStates=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.d);
    }
}
