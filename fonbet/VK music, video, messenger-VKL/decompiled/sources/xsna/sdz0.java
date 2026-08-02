package xsna;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class sdz0 implements xmx {
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;
    public final List e;

    public sdz0(String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
        this.e = arrayList2;
    }

    @Override // xsna.xmx
    public final List Z() {
        return this.e;
    }

    @Override // xsna.xmx
    public final String a0() {
        return this.b;
    }

    @Override // xsna.xmx
    public final ArrayList b0() {
        return new ArrayList(this.d);
    }

    @Override // xsna.xmx
    public final String getText() {
        return this.c;
    }

    @Override // xsna.xmx
    public final String w() {
        return this.a;
    }
}
