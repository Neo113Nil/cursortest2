package xsna;

import android.database.Cursor;
import java.lang.reflect.Array;
import xsna.kuk;

/* compiled from: DataObject.java */
/* loaded from: classes7.dex */
public abstract class kuk<T extends kuk<?>> {
    public static final String[] d = {"_id"};
    public final quk<T> b;
    public long c;

    /* JADX WARN: Multi-variable type inference failed */
    public kuk(quk<? extends T> qukVar) {
        this.b = qukVar;
    }

    public static String[] a(String[] strArr, String... strArr2) {
        String[][] strArr3 = {strArr, strArr2};
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            String[] strArr4 = strArr3[i2];
            if (strArr4 != null) {
                i += strArr4.length;
            }
        }
        String[] strArr5 = new String[i];
        int i3 = 0;
        for (int i4 = 0; i4 < 2; i4++) {
            String[] strArr6 = strArr3[i4];
            if (strArr6 != null) {
                int length = Array.getLength(strArr6);
                System.arraycopy(strArr6, 0, strArr5, i3, length);
                i3 += length;
            }
        }
        return strArr5;
    }

    public void b(Cursor cursor) {
        this.c = cursor.getLong(0);
    }
}
