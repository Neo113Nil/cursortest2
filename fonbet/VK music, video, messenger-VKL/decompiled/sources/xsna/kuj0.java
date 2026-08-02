package xsna;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;
import xsna.snw;

/* compiled from: SingleImageProxyBundle.java */
/* loaded from: classes11.dex */
public final class kuj0 implements blw {
    public final int a;
    public final alw b;

    public kuj0(@NonNull alw alwVar, @NonNull String str) {
        ojw B = alwVar.B();
        if (B == null) {
            throw new IllegalArgumentException("ImageProxy has no associated ImageInfo");
        }
        Integer a = B.c().a(str);
        if (a == null) {
            throw new IllegalArgumentException("ImageProxy has no associated tag");
        }
        this.a = a.intValue();
        this.b = alwVar;
    }

    @Override // xsna.blw
    @NonNull
    public final List<Integer> a() {
        return Collections.singletonList(Integer.valueOf(this.a));
    }

    @Override // xsna.blw
    @NonNull
    public final ugz<alw> b(int i) {
        return i != this.a ? new snw.a(new IllegalArgumentException("Capture id does not exist in the bundle")) : r0t.d(this.b);
    }
}
