package com.yandex.div.core;

import com.yandex.div.core.images.DivImageDownloadCallback;
import com.yandex.div.core.view2.Div2View;

/* compiled from: DivIdLoggingImageDownloadCallback.kt */
/* loaded from: classes7.dex */
public class DivIdLoggingImageDownloadCallback extends DivImageDownloadCallback {
    private final String divId;

    public DivIdLoggingImageDownloadCallback(String str) {
        this.divId = str;
    }

    public DivIdLoggingImageDownloadCallback(Div2View div2View) {
        this(div2View.getLogId());
    }
}
