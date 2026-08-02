package com.yandex.div.core.downloader;

import androidx.annotation.NonNull;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.view2.Div2View;
import xsna.jh;

/* loaded from: classes7.dex */
public interface DivDownloader {
    public static final DivDownloader STUB = new jh(12);

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ LoadReference lambda$static$0(Div2View div2View, String str, DivPatchDownloadCallback divPatchDownloadCallback) {
        throw new AssertionError("To load patch you must provide implementation of DivDownloader to your DivConfiguration. ");
    }

    LoadReference downloadPatch(@NonNull Div2View div2View, @NonNull String str, @NonNull DivPatchDownloadCallback divPatchDownloadCallback);
}
