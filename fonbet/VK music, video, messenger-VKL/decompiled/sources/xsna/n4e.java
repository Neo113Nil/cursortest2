package xsna;

import com.vk.clips.favorites.api.params.ClipsFavoritesFoldersPickerParams;
import com.vk.clips.favorites.impl.ui.folders.picker.ClipsFavoritesFoldersPickerState;

/* compiled from: ClipsFavoritesFoldersPickerBottomSheetStateMapper.kt */
/* loaded from: classes16.dex */
public final class n4e {
    public final ClipsFavoritesFoldersPickerParams a;

    /* compiled from: ClipsFavoritesFoldersPickerBottomSheetStateMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ClipsFavoritesFoldersPickerState.BottomSheetVisibility.values().length];
            try {
                iArr[ClipsFavoritesFoldersPickerState.BottomSheetVisibility.HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipsFavoritesFoldersPickerState.BottomSheetVisibility.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ClipsFavoritesFoldersPickerState.Content.ListLoadingState.values().length];
            try {
                iArr2[ClipsFavoritesFoldersPickerState.Content.ListLoadingState.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ClipsFavoritesFoldersPickerState.Content.ListLoadingState.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ClipsFavoritesFoldersPickerState.Content.ListLoadingState.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public n4e(ClipsFavoritesFoldersPickerParams clipsFavoritesFoldersPickerParams) {
        this.a = clipsFavoritesFoldersPickerParams;
    }
}
