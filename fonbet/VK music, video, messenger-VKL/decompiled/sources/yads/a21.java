package yads;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public final class a21 {
    public final int a;
    public final List b;
    public final int c;
    public final InputStream d;
    public final byte[] e;

    public a21(int i, ArrayList arrayList, int i2, e21 e21Var) {
        this.a = i;
        this.b = arrayList;
        this.c = i2;
        this.d = e21Var;
        this.e = null;
    }

    public a21(int i, List list, byte[] bArr) {
        this.a = i;
        this.b = list;
        this.c = bArr.length;
        this.e = bArr;
        this.d = null;
    }
}
