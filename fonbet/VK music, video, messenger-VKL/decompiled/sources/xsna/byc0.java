package xsna;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.datastore.core.DataStoreImpl;
import java.util.Collections;
import kotlin.collections.EmptyList;

/* compiled from: PreferenceDataStoreFactory.jvm.kt */
/* loaded from: classes.dex */
public final class byc0 implements ux1 {
    public static boolean b;
    public static kj2 c;

    public static final long b(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static xxc0 c(x0g0 x0g0Var, gzs gzsVar) {
        EmptyList emptyList = EmptyList.b;
        bdn bdnVar = bdn.a;
        return new xxc0(new xxc0(new DataStoreImpl(new yy70(tar.a, new ayc0(gzsVar)), Collections.singletonList(new guk(emptyList, null)), x0g0Var, zvj.a(wgl.c.plus(whn0.a())))));
    }

    @Override // xsna.ux1
    public void a(@Nullable Bundle bundle) {
    }
}
