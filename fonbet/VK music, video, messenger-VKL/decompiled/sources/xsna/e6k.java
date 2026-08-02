package xsna;

import android.os.Looper;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.g6k;

/* compiled from: CrashlyticsWorkers.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class e6k extends FunctionReferenceImpl implements gzs<Boolean> {
    @Override // xsna.gzs
    public final Boolean invoke() {
        ((g6k.a) this.receiver).getClass();
        return Boolean.valueOf(!Looper.getMainLooper().isCurrentThread());
    }
}
