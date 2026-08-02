package xsna;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.math.BigDecimal;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes.dex */
public final class ozg0 {
    public static bpn0 a;

    public static final baq0 a() {
        bpn0 bpn0Var = a;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        return (baq0) bpn0Var.getValue();
    }

    public static void b(@NonNull Parcel parcel, int i, @NonNull BigDecimal bigDecimal, boolean z) {
        if (bigDecimal == null) {
            if (z) {
                v(parcel, i, 0);
            }
        } else {
            int w = w(i, parcel);
            parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
            parcel.writeInt(bigDecimal.scale());
            x(w, parcel);
        }
    }

    public static void c(@NonNull Parcel parcel, int i, @NonNull Boolean bool) {
        if (bool == null) {
            return;
        }
        v(parcel, i, 4);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public static void d(@NonNull Parcel parcel, int i, @NonNull Bundle bundle, boolean z) {
        if (bundle == null) {
            if (z) {
                v(parcel, i, 0);
            }
        } else {
            int w = w(i, parcel);
            parcel.writeBundle(bundle);
            x(w, parcel);
        }
    }

    public static void e(@NonNull Parcel parcel, int i, @NonNull byte[] bArr, boolean z) {
        if (bArr == null) {
            if (z) {
                v(parcel, i, 0);
            }
        } else {
            int w = w(i, parcel);
            parcel.writeByteArray(bArr);
            x(w, parcel);
        }
    }

    public static void f(@NonNull Parcel parcel, int i, @NonNull Double d) {
        if (d == null) {
            return;
        }
        v(parcel, i, 8);
        parcel.writeDouble(d.doubleValue());
    }

    public static void g(@NonNull Parcel parcel, int i, @NonNull Float f) {
        if (f == null) {
            return;
        }
        v(parcel, i, 4);
        parcel.writeFloat(f.floatValue());
    }

    public static void h(@NonNull Parcel parcel, int i, @NonNull IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int w = w(i, parcel);
        parcel.writeStrongBinder(iBinder);
        x(w, parcel);
    }

    public static void i(@NonNull Parcel parcel, int i, @NonNull int[] iArr, boolean z) {
        if (iArr == null) {
            if (z) {
                v(parcel, i, 0);
            }
        } else {
            int w = w(i, parcel);
            parcel.writeIntArray(iArr);
            x(w, parcel);
        }
    }

    public static void j(@NonNull Parcel parcel, @NonNull List list, int i) {
        if (list == null) {
            return;
        }
        int w = w(i, parcel);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(((Integer) list.get(i2)).intValue());
        }
        x(w, parcel);
    }

    public static void k(@NonNull Parcel parcel, int i, @NonNull Integer num) {
        if (num == null) {
            return;
        }
        v(parcel, i, 4);
        parcel.writeInt(num.intValue());
    }

    public static void l(@NonNull Parcel parcel, @NonNull List list, int i) {
        if (list == null) {
            return;
        }
        int w = w(i, parcel);
        parcel.writeList(list);
        x(w, parcel);
    }

    public static void m(@NonNull Parcel parcel, int i, @NonNull long[] jArr, boolean z) {
        if (jArr == null) {
            if (z) {
                v(parcel, i, 0);
            }
        } else {
            int w = w(i, parcel);
            parcel.writeLongArray(jArr);
            x(w, parcel);
        }
    }

    public static void n(@NonNull Parcel parcel, @NonNull List list, int i) {
        if (list == null) {
            return;
        }
        int w = w(i, parcel);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeLong(((Long) list.get(i2)).longValue());
        }
        x(w, parcel);
    }

    public static void o(@NonNull Parcel parcel, int i, @NonNull Long l) {
        if (l == null) {
            return;
        }
        v(parcel, i, 8);
        parcel.writeLong(l.longValue());
    }

    public static void p(@NonNull Parcel parcel, int i, @NonNull Parcelable parcelable, int i2, boolean z) {
        if (parcelable == null) {
            if (z) {
                v(parcel, i, 0);
            }
        } else {
            int w = w(i, parcel);
            parcelable.writeToParcel(parcel, i2);
            x(w, parcel);
        }
    }

    public static void q(@NonNull Parcel parcel, int i, @NonNull String str, boolean z) {
        if (str == null) {
            if (z) {
                v(parcel, i, 0);
            }
        } else {
            int w = w(i, parcel);
            parcel.writeString(str);
            x(w, parcel);
        }
    }

    public static void r(@NonNull Parcel parcel, int i, @NonNull String[] strArr, boolean z) {
        if (strArr == null) {
            if (z) {
                v(parcel, i, 0);
            }
        } else {
            int w = w(i, parcel);
            parcel.writeStringArray(strArr);
            x(w, parcel);
        }
    }

    public static void s(@NonNull Parcel parcel, @NonNull List list, int i) {
        if (list == null) {
            return;
        }
        int w = w(i, parcel);
        parcel.writeStringList(list);
        x(w, parcel);
    }

    public static void t(@NonNull Parcel parcel, int i, @NonNull Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int w = w(i, parcel);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i2);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        x(w, parcel);
    }

    public static void u(@NonNull Parcel parcel, int i, @NonNull List list, boolean z) {
        if (list == null) {
            if (z) {
                v(parcel, i, 0);
                return;
            }
            return;
        }
        int w = w(i, parcel);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        x(w, parcel);
    }

    public static void v(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    public static int w(int i, Parcel parcel) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void x(int i, Parcel parcel) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }
}
