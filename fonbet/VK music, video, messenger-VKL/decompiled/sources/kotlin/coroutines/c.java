package kotlin.coroutines;

import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.mcn;
import xsna.spj;

/* compiled from: ContinuationInterceptor.kt */
/* loaded from: classes11.dex */
public interface c extends d.b {

    /* compiled from: ContinuationInterceptor.kt */
    public static final class a implements d.c<c> {
        public static final /* synthetic */ a b = new a();
    }

    mcn L(ContinuationImpl continuationImpl);

    void v(spj<?> spjVar);
}
