package xsna;

import com.vk.core.apps.BuildInfo;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: IdlingScope.kt */
/* loaded from: classes17.dex */
public final class zvv {
    public static final AtomicReference<yvv> a = new AtomicReference<>();

    public static final void a(izs<? super yvv, s3q0> izsVar) {
        yvv yvvVar;
        if (BuildInfo.m() || (yvvVar = a.get()) == null) {
            return;
        }
        izsVar.invoke(yvvVar);
    }
}
