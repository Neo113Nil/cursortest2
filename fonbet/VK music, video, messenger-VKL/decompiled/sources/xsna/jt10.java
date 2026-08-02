package xsna;

import com.vk.mediapicker.api.models.MediaPickerViewState;

/* compiled from: MediaPickerConverterExt.kt */
/* loaded from: classes15.dex */
public final /* synthetic */ class jt10 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[MediaPickerViewState.Medias.Pagination.values().length];
        try {
            iArr[MediaPickerViewState.Medias.Pagination.Loading.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MediaPickerViewState.Medias.Pagination.Error.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MediaPickerViewState.Medias.Pagination.Loaded.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
