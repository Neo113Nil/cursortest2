package xsna;

import androidx.annotation.Nullable;
import java.io.File;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes.dex */
public final class qvz0 implements j601 {
    public final j601 b;

    public qvz0(j601 j601Var) {
        this.b = j601Var;
    }

    @Override // xsna.j601
    @Nullable
    public final /* bridge */ /* synthetic */ Object zza() {
        File file = (File) this.b.zza();
        if (file == null) {
            return null;
        }
        return ytz0.a(file);
    }
}
