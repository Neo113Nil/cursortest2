package xsna;

import com.vk.clips.sdk.shared.api.analytics.ClipsBottomSheetSideEffectOptions;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ClipFeedAdsMoreMenuSideEffectsHandler.kt */
/* loaded from: classes17.dex */
public final class rvc implements nkd {
    public final pi0 a;

    /* compiled from: ClipFeedAdsMoreMenuSideEffectsHandler.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipsBottomSheetSideEffectOptions.values().length];
            try {
                iArr[ClipsBottomSheetSideEffectOptions.NOT_INTERESTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipsBottomSheetSideEffectOptions.CLIPS_AUTO_SUBTITLES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClipsBottomSheetSideEffectOptions.CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ClipsBottomSheetSideEffectOptions.REMOVE_FROM_OWNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ClipsBottomSheetSideEffectOptions.DO_NOT_SHOW_SIMILAR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ClipsBottomSheetSideEffectOptions.HIDE_THIS_AUTHOR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ClipsBottomSheetSideEffectOptions.CONFIGURE_INTERESTS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ClipsBottomSheetSideEffectOptions.EDIT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ClipsBottomSheetSideEffectOptions.EDIT_PUBLICATION_DATE_ON_CHANGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ClipsBottomSheetSideEffectOptions.EDIT_PRIVACY_CLIP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ClipsBottomSheetSideEffectOptions.REMOVE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ClipsBottomSheetSideEffectOptions.REMOVE_CLIP_COMMUNITY.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ClipsBottomSheetSideEffectOptions.TRAFFIC_SAVING.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ClipsBottomSheetSideEffectOptions.PIN.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ClipsBottomSheetSideEffectOptions.UNPIN.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ClipsBottomSheetSideEffectOptions.DELAY_CLIP_PUBLISHED_NOW.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ClipsBottomSheetSideEffectOptions.EDIT_DONE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public rvc(pi0 pi0Var) {
        this.a = pi0Var;
    }

    @Override // xsna.nkd
    public final void a(ClipsBottomSheetSideEffectOptions clipsBottomSheetSideEffectOptions, SdkVideoFile sdkVideoFile) {
        io.reactivex.rxjava3.disposables.c g;
        switch (a.$EnumSwitchMapping$0[clipsBottomSheetSideEffectOptions.ordinal()]) {
            case 1:
                ClipFeedListFragment clipFeedListFragment = (ClipFeedListFragment) this.a.c;
                io.reactivex.rxjava3.disposables.b bVar = clipFeedListFragment.r1;
                g = hg1.g(clipFeedListFragment.Hl(sdkVideoFile), new ek(29));
                hg1.e(bVar, g);
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // xsna.nkd
    public final void b(ClipsBottomSheetSideEffectOptions clipsBottomSheetSideEffectOptions, Throwable th) {
    }
}
