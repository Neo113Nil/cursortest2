package com.yandex.go.feed_video.presentation.divkit;

import defpackage.tls;
import defpackage.x43;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes7.dex */
final /* synthetic */ class ListYandexPlayerDivFactory$makePlayerView$1 extends FunctionReferenceImpl implements tls {
    public ListYandexPlayerDivFactory$makePlayerView$1(c cVar) {
        super(1, cVar, c.class, "onViewDetached", "onViewDetached(Lcom/yandex/go/feed_video/presentation/divkit/ListYandexDivPlayerView;)V", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ListYandexDivPlayerView listYandexDivPlayerView = (ListYandexDivPlayerView) obj;
        c cVar = (c) this.receiver;
        cVar.f.remove(listYandexDivPlayerView);
        listYandexDivPlayerView.setOnDetachCallback(null);
        x43 x43Var = cVar.g;
        if (x43Var.size() < 5) {
            x43Var.addLast(listYandexDivPlayerView);
        }
        return zy11.a;
    }
}
