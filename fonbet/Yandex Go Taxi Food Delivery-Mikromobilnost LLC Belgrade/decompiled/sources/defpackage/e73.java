package defpackage;

import java.util.RandomAccess;

/* loaded from: classes11.dex */
public final class e73 extends k8 implements RandomAccess {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e73(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.z6, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                if (!(obj instanceof Byte)) {
                    return false;
                }
                byte byteValue = ((Number) obj).byteValue();
                byte[] bArr = (byte[]) obj2;
                int length = bArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        i2 = -1;
                    } else if (byteValue != bArr[i2]) {
                        i2++;
                    }
                }
                return i2 >= 0;
            default:
                if (obj instanceof Integer) {
                    return j73.w(((Number) obj).intValue(), (int[]) obj2);
                }
                return false;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                return Byte.valueOf(((byte[]) obj)[i]);
            default:
                return Integer.valueOf(((int[]) obj)[i]);
        }
    }

    @Override // defpackage.z6
    public final int getSize() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((byte[]) obj).length;
            default:
                return ((int[]) obj).length;
        }
    }

    @Override // defpackage.k8, java.util.List
    public final int indexOf(Object obj) {
        int i = this.a;
        int i2 = 0;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                if (obj instanceof Byte) {
                    byte byteValue = ((Number) obj).byteValue();
                    byte[] bArr = (byte[]) obj2;
                    int length = bArr.length;
                    while (i2 < length) {
                        if (byteValue == bArr[i2]) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    break;
                }
                break;
            default:
                if (obj instanceof Integer) {
                    int intValue = ((Number) obj).intValue();
                    int[] iArr = (int[]) obj2;
                    int length2 = iArr.length;
                    while (i2 < length2) {
                        if (intValue == iArr[i2]) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    break;
                }
                break;
        }
        return i2;
    }

    @Override // defpackage.z6, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                if (((byte[]) obj).length == 0) {
                    break;
                }
                break;
            default:
                if (((int[]) obj).length == 0) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // defpackage.k8, java.util.List
    public final int lastIndexOf(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                if (obj instanceof Byte) {
                    byte byteValue = ((Number) obj).byteValue();
                    byte[] bArr = (byte[]) obj2;
                    int length = bArr.length - 1;
                    if (length >= 0) {
                        while (true) {
                            int i2 = length - 1;
                            if (byteValue == bArr[length]) {
                                break;
                            } else if (i2 < 0) {
                                break;
                            } else {
                                length = i2;
                            }
                        }
                    }
                }
                break;
            default:
                if (obj instanceof Integer) {
                    int intValue = ((Number) obj).intValue();
                    int[] iArr = (int[]) obj2;
                    int length2 = iArr.length - 1;
                    if (length2 >= 0) {
                        while (true) {
                            int i3 = length2 - 1;
                            if (intValue == iArr[length2]) {
                                break;
                            } else if (i3 < 0) {
                                break;
                            } else {
                                length2 = i3;
                            }
                        }
                    }
                }
                break;
        }
        return -1;
    }
}
