package xsna;

import android.view.ViewGroup;
import com.vkontakte.android.R;
import xsna.b7c0;

/* compiled from: PostSettingsMarkAdsAdapterDelegate.kt */
/* loaded from: classes16.dex */
public final class g7c0 extends p1u0<b7c0.d> {
    public final com.vk.channels.impl.post_settings.f a;

    public g7c0(com.vk.channels.impl.post_settings.f fVar) {
        this.a = fVar;
    }

    @Override // xsna.p1u0
    public final vfz<? extends b7c0.d> b(ViewGroup viewGroup) {
        return new i7c0(bwt0.I(R.layout.post_settings_mark_addvertisement, viewGroup, false), this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof b7c0.d;
    }
}
