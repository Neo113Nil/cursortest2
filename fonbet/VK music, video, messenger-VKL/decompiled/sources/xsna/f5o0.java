package xsna;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes.dex */
public abstract class f5o0<A extends a.b, ResultT> {

    @Nullable
    public final Feature[] a;
    public final boolean b;
    public final int c;

    /* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
    public static class a<A extends a.b, ResultT> {
        public ouf0 a;
        public boolean b;
        public boolean c;
        public Feature[] d;
        public int e;

        @NonNull
        public final inz0 a() {
            boolean z = true;
            exc0.a("execute parameter required", this.a != null);
            if (!this.c) {
                Feature[] featureArr = this.d;
                if (featureArr != null && (featureArr.length) != 0) {
                    for (Feature feature : featureArr) {
                        if (feature.e) {
                        }
                    }
                    this.b = z;
                }
                z = false;
                this.b = z;
            }
            return new inz0(this, this.d, this.b, this.e);
        }
    }

    @Deprecated
    public f5o0() {
        this.a = null;
        this.b = false;
        this.c = 0;
    }

    @NonNull
    public static <A extends a.b, ResultT> a<A, ResultT> a() {
        a<A, ResultT> aVar = new a<>();
        aVar.b = false;
        aVar.c = false;
        aVar.e = 0;
        return aVar;
    }

    public abstract void b(@NonNull A a2, @NonNull TaskCompletionSource<ResultT> taskCompletionSource) throws RemoteException;

    public f5o0(@Nullable Feature[] featureArr, boolean z, int i) {
        this.a = featureArr;
        boolean z2 = false;
        if (featureArr != null && z) {
            z2 = true;
        }
        this.b = z2;
        this.c = i;
    }
}
