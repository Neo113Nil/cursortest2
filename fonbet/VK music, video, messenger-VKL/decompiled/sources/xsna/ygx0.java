package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huawei.hms.hihealth.data.DeviceInfo;
import java.util.Objects;

/* compiled from: WebMessageCompat.java */
/* loaded from: classes12.dex */
public final class ygx0 {

    @Nullable
    public final ahx0[] a;

    @Nullable
    public final String b;
    public final int c;

    public ygx0(@Nullable String str, @Nullable ahx0[] ahx0VarArr) {
        this.b = str;
        this.a = ahx0VarArr;
        this.c = 0;
    }

    @Nullable
    public final String a() {
        int i = this.c;
        if (i == 0) {
            return this.b;
        }
        throw new IllegalStateException(tdj.a(new StringBuilder("Wrong data accessor type detected. "), i != 0 ? i != 1 ? DeviceInfo.STR_TYPE_UNKNOWN : "ArrayBuffer" : "String", " expected, but got ", "String"));
    }

    public ygx0(@NonNull byte[] bArr, @Nullable ahx0[] ahx0VarArr) {
        Objects.requireNonNull(bArr);
        this.b = null;
        this.a = ahx0VarArr;
        this.c = 1;
    }
}
