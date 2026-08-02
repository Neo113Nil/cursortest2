package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class vws0 {

    @NonNull
    public final xvu a;

    @NonNull
    public final ArrayList b;

    @Nullable
    public final m0n c;

    public vws0(@NonNull xvu xvuVar, @NonNull ArrayList arrayList, @Nullable m0n m0nVar) {
        this.a = xvuVar;
        this.b = arrayList;
        this.c = m0nVar;
    }

    @NonNull
    public final String toString() {
        return "VideoMotionData{header=" + this.a + ", videoMotionItemList=" + this.b + ", disclaimer=" + this.c + '}';
    }
}
