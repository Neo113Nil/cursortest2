package defpackage;

import java.util.RandomAccess;
import okio.ByteString;

/* loaded from: classes9.dex */
public final class ng70 extends k8 implements RandomAccess {
    public final ByteString[] a;
    public final int[] b;

    public ng70(ByteString[] byteStringArr, int[] iArr) {
        this.a = byteStringArr;
        this.b = iArr;
    }

    @Override // defpackage.z6, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ByteString) {
            return super.contains((ByteString) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.a[i];
    }

    @Override // defpackage.z6
    public final int getSize() {
        return this.a.length;
    }

    @Override // defpackage.k8, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ByteString) {
            return super.indexOf((ByteString) obj);
        }
        return -1;
    }

    @Override // defpackage.k8, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ByteString) {
            return super.lastIndexOf((ByteString) obj);
        }
        return -1;
    }
}
