package xsna;

import com.vk.clips.sdk.shared.api.analytics.ClipsBottomSheetSideEffectOptions;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.viewer.impl.grid.lists.fragments.AbstractClipsGridUploadListFragment;

/* compiled from: AbstractClipsGridUploadListFragment.kt */
/* loaded from: classes17.dex */
public final class od implements nkd {
    public final /* synthetic */ Integer a;
    public final /* synthetic */ AbstractClipsGridUploadListFragment b;

    /* compiled from: AbstractClipsGridUploadListFragment.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipsBottomSheetSideEffectOptions.values().length];
            try {
                iArr[ClipsBottomSheetSideEffectOptions.REMOVE_FROM_OWNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public od(Integer num, AbstractClipsGridUploadListFragment abstractClipsGridUploadListFragment) {
        this.a = num;
        this.b = abstractClipsGridUploadListFragment;
    }

    @Override // xsna.nkd
    public final void a(ClipsBottomSheetSideEffectOptions clipsBottomSheetSideEffectOptions, SdkVideoFile sdkVideoFile) {
        c(clipsBottomSheetSideEffectOptions, this.a);
    }

    @Override // xsna.nkd
    public final void b(ClipsBottomSheetSideEffectOptions clipsBottomSheetSideEffectOptions, Throwable th) {
        c(clipsBottomSheetSideEffectOptions, this.a);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
    public final void c(ClipsBottomSheetSideEffectOptions clipsBottomSheetSideEffectOptions, Integer num) {
        if (a.$EnumSwitchMapping$0[clipsBottomSheetSideEffectOptions.ordinal()] != 1 || num == null) {
            return;
        }
        int intValue = num.intValue();
        AbstractClipsGridUploadListFragment abstractClipsGridUploadListFragment = this.b;
        if (((mhd) abstractClipsGridUploadListFragment.g0.getValue()).k()) {
            ((eef) abstractClipsGridUploadListFragment.h0.getValue()).d(intValue);
        } else {
            ((ylf) abstractClipsGridUploadListFragment.f0.getValue()).d(intValue, "clips_deleted_by_menu_remove");
        }
    }
}
