package xsna;

import com.vk.dto.common.Image;
import com.vk.dto.music.MusicDynamicRestriction;
import com.vk.settings.impl.presentation.base.fragment.settings.RedesignNotificationSettingsFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class nw4 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ nw4(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                MusicDynamicRestriction musicDynamicRestriction = (MusicDynamicRestriction) obj;
                ((qw4) obj2).b.getClass();
                String str = musicDynamicRestriction.b;
                String str2 = musicDynamicRestriction.d;
                String str3 = str2 == null ? "" : str2;
                Image image = musicDynamicRestriction.c;
                String str4 = musicDynamicRestriction.e;
                if (str4 == null) {
                    str4 = "";
                }
                String str5 = musicDynamicRestriction.f;
                return new lw4(this.c, str, str3, image, new fw4(str4, str5 != null ? str5 : ""));
            default:
                RedesignNotificationSettingsFragment.a aVar = RedesignNotificationSettingsFragment.Y;
                ((RedesignNotificationSettingsFragment) obj2).getFeature().C(new vf70(this.c));
                return s3q0.a;
        }
    }
}
