package xsna;

import xsna.fi20;

/* compiled from: AppInfoTable.java */
/* loaded from: classes12.dex */
public final class m53 implements fi20.a {
    public final int a;
    public final String b;

    public m53(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ait(controlCode=");
        sb.append(this.a);
        sb.append(",url=");
        return i5s.a(sb, this.b, ")");
    }
}
