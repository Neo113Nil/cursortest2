package com.ybsdk.feature.qr.internal.screens.reader.presentation;

import defpackage.wls;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class QrReaderFragment$startQrRecognizeFlow$1 extends AdaptedFunctionReference implements wls {
    public QrReaderFragment$startQrRecognizeFlow$1(QrReaderFragment qrReaderFragment) {
        super(2, qrReaderFragment, QrReaderFragment.class, "handleRecognizeResults", "handleRecognizeResults(Ljava/util/List;)V", 4);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Object startQrRecognizeFlow$handleRecognizeResults;
        startQrRecognizeFlow$handleRecognizeResults = QrReaderFragment.startQrRecognizeFlow$handleRecognizeResults((QrReaderFragment) this.receiver, (List) obj, (Continuation) obj2);
        return startQrRecognizeFlow$handleRecognizeResults;
    }
}
