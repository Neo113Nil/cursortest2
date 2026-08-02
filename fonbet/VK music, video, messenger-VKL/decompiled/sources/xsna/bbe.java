package xsna;

import android.view.View;
import com.vk.clips.sdk.models.SdkImages;
import com.vk.core.view.components.picture.VkImage;
import xsna.cce;

/* compiled from: View.kt */
/* loaded from: classes17.dex */
public final class bbe implements View.OnLayoutChangeListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ cce.c.a c;
    public final /* synthetic */ abe d;

    public bbe(VkImage vkImage, cce.c.a aVar, abe abeVar) {
        this.b = vkImage;
        this.c = aVar;
        this.d = abeVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        VkImage vkImage = (VkImage) this.b;
        SdkImages sdkImages = this.c.a;
        vkImage.o0(sdkImages != null ? sdkImages.a(this.d.c.getWidth()) : null, null);
    }
}
