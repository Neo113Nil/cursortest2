package xsna;

import android.view.View;
import com.vk.dto.hints.HintId;
import com.vk.imageloader.view.VKImageView;

/* compiled from: ViewExt.kt */
/* loaded from: classes6.dex */
public final class ggy implements View.OnLayoutChangeListener {
    public final /* synthetic */ com.vk.stickers.keyboard.navigation.c b;

    public ggy(com.vk.stickers.keyboard.navigation.c cVar) {
        this.b = cVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        VKImageView vKImageView = this.b.m;
        h7v.f(pla.e().b(), vKImageView, HintId.VMOJI_KEYBOARD_ONBOARDING.getId(), new hgy(bwt0.C(vKImageView)), 8);
    }
}
