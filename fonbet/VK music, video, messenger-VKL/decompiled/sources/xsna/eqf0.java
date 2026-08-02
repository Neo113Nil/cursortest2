package xsna;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.tasks.TaskCompletionSource;
import xsna.ehz;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public abstract class eqf0<A extends a.b, L> {
    public final ehz a;

    @Nullable
    public final Feature[] b;
    public final boolean c;
    public final int d;

    public eqf0(@NonNull ehz<L> ehzVar, @Nullable Feature[] featureArr, boolean z, int i) {
        this.a = ehzVar;
        this.b = featureArr;
        this.c = z;
        this.d = i;
    }

    @Nullable
    public final ehz.a<L> a() {
        return this.a.b;
    }

    @Nullable
    public final Feature[] b() {
        return this.b;
    }

    public abstract void c(@NonNull A a, @NonNull TaskCompletionSource<Void> taskCompletionSource) throws RemoteException;

    public final int d() {
        return this.d;
    }
}
