package xsna;

import one.video.player.error.OneVideoPlaybackException;

/* compiled from: ErrorResolver.kt */
/* loaded from: classes8.dex */
public final class nwp {
    public final n9m0 a;
    public final dgk0 b;
    public final xyf0 c;

    /* compiled from: ErrorResolver.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OneVideoPlaybackException.Type.values().length];
            try {
                iArr[OneVideoPlaybackException.Type.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OneVideoPlaybackException.Type.RENDERER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OneVideoPlaybackException.Type.UNEXPECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OneVideoPlaybackException.Type.REMOTE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OneVideoPlaybackException.Type.UNRESOLVED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public nwp(vw3 vw3Var, boolean z, n9m0 n9m0Var) {
        this.a = n9m0Var;
        this.b = new dgk0(vw3Var, z);
        this.c = new xyf0(vw3Var);
    }
}
