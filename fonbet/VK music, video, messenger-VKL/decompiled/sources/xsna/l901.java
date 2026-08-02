package xsna;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzaw;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class l901 {

    @NonNull
    public final String a;

    @NonNull
    public final String b;
    public final long c;

    @NonNull
    public final Bundle d;

    public l901(@NonNull String str, @NonNull String str2, @Nullable Bundle bundle, long j) {
        this.a = str;
        this.b = str2;
        this.d = bundle;
        this.c = j;
    }

    public static l901 b(zzaw zzawVar) {
        return new l901(zzawVar.b, zzawVar.d, zzawVar.c.i(), zzawVar.e);
    }

    public final zzaw a() {
        return new zzaw(this.a, new zzau(new Bundle(this.d)), this.b, this.c);
    }

    public final String toString() {
        String obj = this.d.toString();
        StringBuilder a = xe9.a("origin=", this.b, ",name=", this.a, ",params=");
        a.append(obj);
        return a.toString();
    }
}
