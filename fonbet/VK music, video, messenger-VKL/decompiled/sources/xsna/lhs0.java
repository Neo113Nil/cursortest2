package xsna;

import android.app.Activity;
import com.vk.clips.download.api.di.ClipsDownloadComponent;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.DownloadRestrictionReason;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetOptions;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.f520;

/* compiled from: VideoDownload.kt */
/* loaded from: classes2.dex */
public final class lhs0 extends h6s0 implements w8i {
    public static final lhs0 c;
    public static final Object d;
    public static final boolean e;
    public static final boolean f;
    public static final boolean g;
    public static final e520 h;

    /* compiled from: VideoDownload.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DownloadRestrictionReason.values().length];
            try {
                iArr[DownloadRestrictionReason.AUTHOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DownloadRestrictionReason.LICENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DownloadRestrictionReason.TECHNICAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DownloadRestrictionReason.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DownloadRestrictionReason.PROCESSING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        int ordinal = VideoBottomSheetOptions.DOWNLOAD.ordinal();
        c = new lhs0(ordinal);
        d = msy.a(LazyThreadSafetyMode.NONE, new rcs0(2));
        e = fxc0.B().J().h();
        f = fxc0.B().J().F();
        g = fxc0.B().J().a0();
        h = new e520(ordinal, R.drawable.vk_icon_download_outline_28, R.string.video_download, ordinal, false, 0, 0, false, null, 0, fxc0.B().J().R0() ? new f520.a() : null, false, 6128);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public static void e(Activity activity, VideoFile videoFile) {
        ?? r0 = d;
        if (((ClipsDownloadComponent) r0.getValue()).Q5().c(videoFile)) {
            hrc.c(((ClipsDownloadComponent) r0.getValue()).Gc(), activity, (ClipVideoFile) videoFile, false, null, 28);
        } else {
            ((ClipsDownloadComponent) r0.getValue()).Q5().a(activity, videoFile);
        }
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.h6s0
    public final e520 a(s6s0 s6s0Var) {
        pkd f2 = g620.f();
        VideoFile videoFile = s6s0Var.a;
        if (!f2.c(videoFile)) {
            int i = 0;
            boolean z = gpt0.D(videoFile) && !fxc0.B().s().k(videoFile);
            if (!z || !gpt0.x(videoFile)) {
                if (!z) {
                    return null;
                }
                DownloadRestrictionReason z2 = videoFile.z2();
                boolean z3 = f;
                int i2 = R.string.video_not_downloadable_description_title;
                boolean z4 = g;
                if (z4) {
                    int i3 = a.$EnumSwitchMapping$0[z2.ordinal()];
                    if (i3 != 1 && i3 != 2 && i3 != 3 && i3 != 4) {
                        if (i3 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i2 = R.string.processing_video_download_restriction_description_title;
                    }
                } else if (!z3) {
                    i2 = R.string.video_download;
                }
                if (e) {
                    i = R.string.video_not_downloadable_description_subtitle;
                    if (z4) {
                        int i4 = a.$EnumSwitchMapping$0[z2.ordinal()];
                        if (i4 != 1 && i4 != 2) {
                            if (i4 == 3) {
                                i = R.string.technical_video_download_restriction_description_subtitle;
                            } else if (i4 != 4) {
                                if (i4 != 5) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                i = R.string.processing_video_download_restriction_description_subtitle;
                            }
                        }
                    } else if (!z3) {
                        i = R.string.video_can_not_be_downloaded_author_rights;
                    }
                }
                return new e520(this.b, R.drawable.vk_icon_download_cancel_outline_28, i2, this.b, false, R.color.vk_gray_500, R.color.vk_gray_500, false, null, i, null, false, 7056);
            }
        } else if (!((ClipsDownloadComponent) d.getValue()).Q5().b(videoFile)) {
            return null;
        }
        return h;
    }

    @Override // xsna.h6s0
    public final void b(Activity activity, s6s0 s6s0Var, gzs gzsVar) {
        VideoFile videoFile = s6s0Var.a;
        s60 s60Var = s6s0Var.o;
        if (s60Var != null) {
            s60Var.a(videoFile, VideoBottomSheetOptions.DOWNLOAD);
        }
        if (hg10.g(s6s0Var)) {
            e(activity, videoFile);
            return;
        }
        if (gpt0.x(videoFile)) {
            g7s0.e(fxc0.B(), activity, s6s0Var.a, s6s0Var.u, s6s0Var.f, gzsVar, 48);
        } else {
            if (e) {
                return;
            }
            k78 k78Var = s6s0Var.e;
            bfs0.b(activity, videoFile, k78Var != null ? new l78(k78Var) : null);
        }
    }

    @Override // xsna.h6s0
    public final void c(Activity activity, s6s0 s6s0Var, y6s0 y6s0Var) {
        VideoFile videoFile = s6s0Var.a;
        s60 s60Var = s6s0Var.o;
        if (s60Var != null) {
            s60Var.a(videoFile, VideoBottomSheetOptions.DOWNLOAD);
        }
        if (hg10.g(s6s0Var)) {
            e(activity, videoFile);
            return;
        }
        if (gpt0.x(videoFile)) {
            g7s0.e(fxc0.B(), activity, s6s0Var.a, s6s0Var.u, s6s0Var.f, null, 112);
        } else {
            if (e) {
                return;
            }
            k78 k78Var = s6s0Var.e;
            bfs0.b(activity, videoFile, k78Var != null ? new l78(k78Var) : null);
        }
    }

    @Override // xsna.h6s0
    public final boolean d(e520 e520Var) {
        if (!e) {
            return true;
        }
        if (fxc0.B().J().R0()) {
            return false;
        }
        return e520Var.equals(h);
    }
}
