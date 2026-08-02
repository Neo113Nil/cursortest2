package com.yandex.div.core.view2.divs.widgets;

/* compiled from: MediaReleaseViewVisitor.kt */
/* loaded from: classes7.dex */
public class MediaReleaseViewVisitor extends DivViewVisitor {
    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    public void visit(DivVideoView divVideoView) {
        divVideoView.release();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    public void visit(DivImageView divImageView) {
        divImageView.release();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    public void visit(DivGifImageView divGifImageView) {
        divGifImageView.release();
    }
}
