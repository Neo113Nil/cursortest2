package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.LazyThreadSafetyMode;

/* compiled from: LockedOrientationDelegate.kt */
/* loaded from: classes7.dex */
public interface zzz {
    public static final a a = a.a;

    void b(j6m j6mVar);

    float c();

    void d(j6m j6mVar);

    boolean isHorizontal();

    /* compiled from: LockedOrientationDelegate.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final Object b = msy.a(LazyThreadSafetyMode.NONE, new gc(15));

        /* compiled from: LockedOrientationDelegate.kt */
        /* renamed from: xsna.zzz$a$a, reason: collision with other inner class name */
        public static final class C4213a implements zzz {
            @Override // xsna.zzz
            public final float c() {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }

            @Override // xsna.zzz
            public final boolean isHorizontal() {
                return false;
            }

            @Override // xsna.zzz
            public final void b(j6m j6mVar) {
            }

            @Override // xsna.zzz
            public final void d(j6m j6mVar) {
            }
        }
    }
}
