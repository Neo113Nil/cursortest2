package xsna;

import java.util.LinkedHashMap;
import one.video.exo.offline.DownloadInfo;
import xsna.v7s0;

/* compiled from: CacheRepository.kt */
/* loaded from: classes2.dex */
public final class nx8 implements v7s0.a {
    public final /* synthetic */ ay8 a;
    public final /* synthetic */ mx8 b;
    public final /* synthetic */ io.reactivex.rxjava3.core.b c;

    /* compiled from: CacheRepository.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DownloadInfo.State.values().length];
            try {
                iArr[DownloadInfo.State.STATE_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DownloadInfo.State.STATE_COMPLETED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DownloadInfo.State.STATE_QUEUED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DownloadInfo.State.STATE_REMOVING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DownloadInfo.State.STATE_DOWNLOADING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DownloadInfo.State.STATE_RESTARTING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public nx8(ay8 ay8Var, mx8 mx8Var, io.reactivex.rxjava3.core.b bVar) {
        this.a = ay8Var;
        this.b = mx8Var;
        this.c = bVar;
    }

    @Override // xsna.v7s0.a
    public final void a(LinkedHashMap linkedHashMap) {
        ay8 ay8Var = this.a;
        String str = ay8Var.d;
        DownloadInfo downloadInfo = (DownloadInfo) linkedHashMap.get(str);
        DownloadInfo.State state = downloadInfo != null ? downloadInfo.c : null;
        int i = state == null ? -1 : a.$EnumSwitchMapping$0[state.ordinal()];
        io.reactivex.rxjava3.core.b bVar = this.c;
        mx8 mx8Var = this.b;
        if (i != 1) {
            if (i == 2) {
                bVar.onComplete();
                return;
            } else {
                if (i != 3) {
                    return;
                }
                mx8Var.a.b(ay8Var);
                return;
            }
        }
        IllegalStateException illegalStateException = new IllegalStateException("failed to load " + str);
        androidx.media3.exoplayer.offline.c cVar = mx8Var.a.e(ay8Var.e).f;
        if (cVar != null) {
            cVar.f(str);
        }
        bVar.onError(illegalStateException);
    }

    @Override // xsna.v7s0.a
    public final void onInitialized() {
    }
}
