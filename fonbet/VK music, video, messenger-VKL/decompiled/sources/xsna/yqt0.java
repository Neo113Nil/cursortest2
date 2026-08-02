package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.libvideo.ui.ScreenMode;
import com.vk.toggle.features.VideoFeatures;
import kotlin.NoWhenBranchMatchedException;
import xsna.ypj;

/* compiled from: VideoViewControlsVisibilityHandler.kt */
/* loaded from: classes3.dex */
public final class yqt0 {
    public final b25 a;
    public final etn b;
    public final hvr0 c;
    public final VideoFile d;
    public final boolean e;

    /* compiled from: VideoViewControlsVisibilityHandler.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ScreenMode.values().length];
            try {
                iArr[ScreenMode.DISCOVERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScreenMode.HORIZONTAL_FULLSCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScreenMode.VERTICAL_FULLSCREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public yqt0(b25 b25Var, etn etnVar, hvr0 hvr0Var, VideoFile videoFile) {
        this.a = b25Var;
        this.b = etnVar;
        this.c = hvr0Var;
        this.d = videoFile;
        VideoFeatures videoFeatures = VideoFeatures.NEW_FULLSCREEN_REDESIGN_DISCOVERY;
        videoFeatures.getClass();
        this.e = com.vk.toggle.b.A.a(videoFeatures);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01c6 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(ypj ypjVar) {
        boolean z = ypjVar instanceof ypj.b;
        boolean z2 = this.e;
        etn etnVar = this.b;
        VideoFile videoFile = this.d;
        if (z) {
            ypj.b bVar = (ypj.b) ypjVar;
            ScreenMode a2 = bVar.a();
            boolean z3 = bVar.b;
            int i = a.$EnumSwitchMapping$0[a2.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    if (!etnVar.g(videoFile != null ? Boolean.valueOf(videoFile.T1()) : null)) {
                        if (etnVar.h(videoFile != null ? Boolean.valueOf(videoFile.T1()) : null)) {
                        }
                    }
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (!etnVar.k(videoFile != null ? Boolean.valueOf(videoFile.T1()) : null)) {
                        return z3;
                    }
                }
            } else if (!z2 && z3) {
                return true;
            }
            return false;
        }
        if (ypjVar instanceof ypj.g) {
            if (videoFile == null || !videoFile.T1()) {
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_SMART_CAST;
                videoFeatures.getClass();
                return com.vk.toggle.b.A.a(videoFeatures);
            }
        } else if (ypjVar instanceof ypj.d) {
            ypj.d dVar = (ypj.d) ypjVar;
            ScreenMode a3 = dVar.a();
            boolean z4 = dVar.b;
            int i2 = a.$EnumSwitchMapping$0[a3.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    if (!etnVar.h(videoFile != null ? Boolean.valueOf(videoFile.T1()) : null)) {
                        if (!etnVar.g(videoFile != null ? Boolean.valueOf(videoFile.T1()) : null)) {
                            return z4;
                        }
                    } else if (!z4 || dVar.a.c) {
                    }
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (etnVar.k(videoFile != null ? Boolean.valueOf(videoFile.T1()) : null) || !z4) {
                    }
                }
            }
        } else {
            boolean z5 = ypjVar instanceof ypj.c;
            hvr0 hvr0Var = this.c;
            if (z5) {
                ypj.c cVar = (ypj.c) ypjVar;
                boolean z6 = ((Boolean) hvr0Var.invoke()).booleanValue() && this.a.b();
                int i3 = a.$EnumSwitchMapping$0[cVar.a().ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        if (etnVar.h(videoFile != null ? Boolean.valueOf(videoFile.T1()) : null) || !z6) {
                        }
                    } else {
                        if (i3 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (z6) {
                            if (!etnVar.k(videoFile != null ? Boolean.valueOf(videoFile.T1()) : null)) {
                            }
                        }
                    }
                } else if (z2 || !z6) {
                }
            } else if (ypjVar instanceof ypj.f) {
                int i4 = a.$EnumSwitchMapping$0[((ypj.f) ypjVar).a().ordinal()];
                if (i4 != 1) {
                    if (i4 != 2 && i4 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (!z2) {
                }
            } else {
                if (!(ypjVar instanceof ypj.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                boolean z7 = (((Boolean) hvr0Var.invoke()).booleanValue() || ypjVar.a.c) ? false : true;
                int i5 = a.$EnumSwitchMapping$0[ypjVar.a().ordinal()];
                if (i5 != 1) {
                    if (i5 == 2) {
                        if (etnVar.h(videoFile != null ? Boolean.valueOf(videoFile.T1()) : null)) {
                        }
                    } else {
                        if (i5 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (!etnVar.k(videoFile != null ? Boolean.valueOf(videoFile.T1()) : null)) {
                            return z7;
                        }
                    }
                } else if (z2 || !z7) {
                }
            }
        }
        return false;
    }
}
