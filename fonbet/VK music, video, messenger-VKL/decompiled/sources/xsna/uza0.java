package xsna;

import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;

/* compiled from: PlayerBannerAdDelegate.kt */
/* loaded from: classes16.dex */
public final class uza0 implements izs {
    public static final uza0 c = new uza0(0);
    public static final uza0 d = new uza0(1);
    public final /* synthetic */ int b;

    public /* synthetic */ uza0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return null;
            default:
                return Boolean.valueOf(obj instanceof UIBlockProfile);
        }
    }
}
