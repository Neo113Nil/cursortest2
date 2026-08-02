package xsna;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.a;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes.dex */
public final class mmz0 extends ukz0 {
    public final com.google.android.gms.common.api.b c;

    public mmz0(com.google.android.gms.common.api.b bVar) {
        this.c = bVar;
    }

    @Override // com.google.android.gms.common.api.c
    public final <A extends a.b, R extends qdg0, T extends com.google.android.gms.common.api.internal.a<R, A>> T a(@NonNull T t) {
        return (T) this.c.doRead((com.google.android.gms.common.api.b) t);
    }

    @Override // com.google.android.gms.common.api.c
    public final <A extends a.b, T extends com.google.android.gms.common.api.internal.a<? extends qdg0, A>> T b(@NonNull T t) {
        return (T) this.c.doWrite((com.google.android.gms.common.api.b) t);
    }

    @Override // com.google.android.gms.common.api.c
    public final Looper d() {
        return this.c.getLooper();
    }

    @Override // com.google.android.gms.common.api.c
    public final void j(knz0 knz0Var) {
    }

    @Override // com.google.android.gms.common.api.c
    public final void k(knz0 knz0Var) {
    }
}
