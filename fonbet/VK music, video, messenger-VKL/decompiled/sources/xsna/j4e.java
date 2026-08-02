package xsna;

import com.vk.clips.favorites.impl.ui.folders.renaming.ClipsFavoritesFolderRenamingState;

/* compiled from: ClipsFavoritesFolderRenamingMapper.kt */
/* loaded from: classes16.dex */
public final class j4e {

    /* compiled from: ClipsFavoritesFolderRenamingMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipsFavoritesFolderRenamingState.SaveState.values().length];
            try {
                iArr[ClipsFavoritesFolderRenamingState.SaveState.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipsFavoritesFolderRenamingState.SaveState.Loading.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClipsFavoritesFolderRenamingState.SaveState.Success.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ClipsFavoritesFolderRenamingState.SaveState.Error.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
