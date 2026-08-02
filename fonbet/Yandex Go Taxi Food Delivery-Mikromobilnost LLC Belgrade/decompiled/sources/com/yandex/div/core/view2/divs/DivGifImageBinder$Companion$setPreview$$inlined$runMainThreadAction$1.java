package com.yandex.div.core.view2.divs;

import android.graphics.drawable.Drawable;
import com.yandex.div.core.view2.divs.widgets.DivGifImageView;
import defpackage.sls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes11.dex */
public final class DivGifImageBinder$Companion$setPreview$$inlined$runMainThreadAction$1 extends Lambda implements sls {
    final /* synthetic */ Drawable $drawable$inlined;
    final /* synthetic */ DivGifImageView $this_setPreview$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivGifImageBinder$Companion$setPreview$$inlined$runMainThreadAction$1(DivGifImageView divGifImageView, Drawable drawable) {
        super(0);
        this.$this_setPreview$inlined = divGifImageView;
        this.$drawable$inlined = drawable;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        this.$this_setPreview$inlined.setPreview(this.$drawable$inlined);
        return zy11.a;
    }
}
