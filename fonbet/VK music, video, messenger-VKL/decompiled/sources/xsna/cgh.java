package xsna;

import com.vk.dto.common.im.ImageList;
import com.vk.profile.core.tabs.ui.clips.Clips;
import com.vk.profile.user.impl.ui.f;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.api.ExtendedUserProfile;
import xsna.atq0;
import xsna.fqq0;
import xsna.ggh;
import xsna.h2s0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class cgh implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ cgh(dgh dghVar, Clips clips, ExtendedCommunityProfile extendedCommunityProfile, boolean z) {
        this.d = dghVar;
        this.e = clips;
        this.f = extendedCommunityProfile;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((dgh) this.d).J(new ggh.b((Clips) this.e, (ExtendedCommunityProfile) this.f, this.c), (ggh.a) obj);
                break;
            case 1:
                fqq0.a aVar = (fqq0.a) this.d;
                fqq0 fqq0Var = (fqq0) this.e;
                ExtendedUserProfile extendedUserProfile = (ExtendedUserProfile) this.f;
                if (!((Boolean) obj).booleanValue()) {
                    break;
                } else {
                    fpq0 fpq0Var = fqq0Var.m;
                    if (fpq0Var == null) {
                        fpq0Var = null;
                    }
                    fpq0Var.B(new f.h(new atq0.d(null, fqq0Var.b.getString(this.c ? aVar.a : aVar.b, extendedUserProfile.h), null, null, 0, new z6f0(aVar, 20), null, 157)));
                    aVar.c.invoke();
                    break;
                }
            default:
                i6t0 i6t0Var = (i6t0) this.d;
                h2s0.a aVar2 = (h2s0.a) this.e;
                ImageList imageList = (ImageList) this.f;
                i6t0Var.getImageView().setVisibility(0);
                if (this.c) {
                    f4m.j(i6t0Var.getDurationView());
                    i6t0Var.getInteractiveDurationView().setVisibility(0);
                } else {
                    i6t0Var.getDurationView().setVisibility(0);
                    f4m.j(i6t0Var.getInteractiveDurationView());
                }
                f4m.j(i6t0Var.getOverlayView());
                i6t0Var.getImageView().clear();
                i6t0Var.getImageView().setPlaceholder(aVar2.o);
                i6t0Var.getImageView().setEmptyPlaceholder(aVar2.p);
                i6t0Var.getImageView().setRemoteImages(imageList.b);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ cgh(fqq0.a aVar, fqq0 fqq0Var, boolean z, ExtendedUserProfile extendedUserProfile) {
        this.d = aVar;
        this.e = fqq0Var;
        this.c = z;
        this.f = extendedUserProfile;
    }

    public /* synthetic */ cgh(i6t0 i6t0Var, boolean z, h2s0.a aVar, ImageList imageList) {
        this.d = i6t0Var;
        this.c = z;
        this.e = aVar;
        this.f = imageList;
    }
}
