package xsna;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class lbz0 implements wmx {
    public final String a;
    public final int b;
    public final String c;
    public final List d;

    public lbz0(int i, String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = arrayList;
    }

    @Override // xsna.wmx
    public final List a() {
        return this.d;
    }

    @Override // xsna.wmx
    public final String getId() {
        return this.a;
    }

    @Override // xsna.wmx
    public final String getText() {
        return this.c;
    }

    @Override // xsna.wmx
    public final int getType() {
        return this.b;
    }
}
