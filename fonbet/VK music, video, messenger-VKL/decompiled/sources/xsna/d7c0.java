package xsna;

import android.view.ViewGroup;
import com.vk.channels.impl.post_settings.adapter.PostSettingType;
import com.vkontakte.android.R;

/* compiled from: PostSettingsItemAdapterDelegate.kt */
/* loaded from: classes16.dex */
public final class d7c0 extends p1u0<b7c0> {
    public final com.vk.channels.impl.post_settings.f a;

    public d7c0(com.vk.channels.impl.post_settings.f fVar) {
        this.a = fVar;
    }

    @Override // xsna.p1u0
    public final vfz<? extends b7c0> b(ViewGroup viewGroup) {
        return new f7c0(bwt0.I(R.layout.post_settings_item, viewGroup, false), this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return (hfzVar instanceof b7c0) && ((b7c0) hfzVar).b != PostSettingType.MARK_ADVERTISEMENT;
    }
}
