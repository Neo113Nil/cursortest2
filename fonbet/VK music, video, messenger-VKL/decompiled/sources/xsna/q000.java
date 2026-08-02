package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import java.util.List;
import xsna.hn5;

/* compiled from: LogRequest.java */
/* loaded from: classes.dex */
public abstract class q000 {

    /* compiled from: LogRequest.java */
    /* loaded from: classes12.dex */
    public static abstract class a {
        @NonNull
        public final void a(int i) {
            ((hn5.a) this).d = Integer.valueOf(i);
        }

        @NonNull
        public final void b(@NonNull String str) {
            ((hn5.a) this).e = str;
        }
    }

    @Nullable
    public abstract ClientInfo a();

    @Nullable
    public abstract List<f000> b();

    @Nullable
    public abstract Integer c();

    @Nullable
    public abstract String d();

    @Nullable
    public abstract QosTier e();

    public abstract long f();

    public abstract long g();
}
