package xsna;

import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import xsna.hz0;

/* compiled from: AdsItemOnPositionUpdateEventFilter.kt */
/* loaded from: classes17.dex */
public final class ny0 {
    public final ux0 a;
    public c b = new b();

    /* compiled from: AdsItemOnPositionUpdateEventFilter.kt */
    public static final class a implements c {
        public final ux0 a;
        public SdkClipVideoFile b;
        public hz0.a c;

        public a(ux0 ux0Var, SdkClipVideoFile sdkClipVideoFile) {
            this.a = ux0Var;
            this.b = sdkClipVideoFile;
            this.c = new hz0.a(we7.l(sdkClipVideoFile, 0L, null), we7.k(sdkClipVideoFile, 0L), we7.j(sdkClipVideoFile, 0L));
        }

        @Override // xsna.ny0.c
        public final void a(long j) {
            SdkClipVideoFile sdkClipVideoFile = this.b;
            hz0.a aVar = this.c;
            boolean l = we7.l(sdkClipVideoFile, j, null);
            boolean k = we7.k(sdkClipVideoFile, j);
            boolean j2 = we7.j(sdkClipVideoFile, j);
            if (l == aVar.a && k == aVar.b && j2 == aVar.c) {
                return;
            }
            hz0.a aVar2 = new hz0.a(l, k, j2);
            this.c = aVar2;
            this.a.a(new j01(new hz0(aVar2)));
        }
    }

    /* compiled from: AdsItemOnPositionUpdateEventFilter.kt */
    public static final class b implements c {
        public Long a;

        @Override // xsna.ny0.c
        public final void a(long j) {
            this.a = Long.valueOf(j);
        }
    }

    /* compiled from: AdsItemOnPositionUpdateEventFilter.kt */
    public interface c {
        void a(long j);
    }

    public ny0(ux0 ux0Var) {
        this.a = ux0Var;
    }
}
