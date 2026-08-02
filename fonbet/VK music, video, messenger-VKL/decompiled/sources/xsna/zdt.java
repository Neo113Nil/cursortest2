package xsna;

import com.vk.core.view.components.avatar.badge.VkAvatarBadge;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class zdt implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ zdt(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                qgi0.h((tgi0) obj, this.c);
                return s3q0.a;
            default:
                return Boolean.valueOf(epx.f(((VkAvatarBadge) obj).getTag(), this.c));
        }
    }
}
