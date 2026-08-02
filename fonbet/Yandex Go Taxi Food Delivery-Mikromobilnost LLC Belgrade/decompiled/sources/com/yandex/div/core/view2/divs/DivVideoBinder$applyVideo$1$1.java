package com.yandex.div.core.view2.divs;

import com.yandex.div.core.player.DivPlayerView;
import defpackage.aw5;
import defpackage.hi91;
import defpackage.tls;
import defpackage.wdv;
import defpackage.xdv;
import defpackage.ydv;
import defpackage.zdv;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lzdv;", "preview", "Lzy11;", "invoke", "(Lzdv;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes11.dex */
final class DivVideoBinder$applyVideo$1$1 extends Lambda implements tls {
    final /* synthetic */ aw5 $bindingContext;
    final /* synthetic */ DivPlayerView $playerView;
    final /* synthetic */ PreviewImageView $previewImageView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivVideoBinder$applyVideo$1$1(DivPlayerView divPlayerView, PreviewImageView previewImageView, aw5 aw5Var) {
        super(1);
        this.$playerView = divPlayerView;
        this.$previewImageView = previewImageView;
        this.$bindingContext = aw5Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zdv zdvVar = (zdv) obj;
        if (zdvVar != null) {
            PreviewImageView previewImageView = this.$previewImageView;
            aw5 aw5Var = this.$bindingContext;
            if (zdvVar instanceof ydv) {
                previewImageView.setImageDrawable(((ydv) zdvVar).a);
            } else if (zdvVar instanceof wdv) {
                previewImageView.setImageBitmap(((wdv) zdvVar).a);
            } else if (zdvVar instanceof xdv) {
                hi91.f(aw5Var.a, ((xdv) zdvVar).a);
            }
            previewImageView.setVisibility(0);
        }
        this.$playerView.setVisibility(0);
        return zy11.a;
    }
}
