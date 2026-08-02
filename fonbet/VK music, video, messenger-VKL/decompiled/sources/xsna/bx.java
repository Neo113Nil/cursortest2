package xsna;

import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.dto.music.MusicTrack;
import com.vk.profile.community.members.impl.domain.MembersListBanner;
import xsna.xu;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class bx implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ bx(MembersListBanner membersListBanner, izs izsVar, izs izsVar2, q630 q630Var, int i) {
        this.e = membersListBanner;
        this.c = izsVar;
        this.f = izsVar2;
        this.d = q630Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((kx) this.e).h((xu.a) this.f, (izs) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(4097));
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                com.vk.profile.community.members.impl.ui.d.a((MembersListBanner) this.e, (izs) this.c, (izs) this.f, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            default:
                nk40 nk40Var = (nk40) this.e;
                MusicTrack musicTrack = (MusicTrack) this.f;
                String str = (String) this.c;
                MusicTrack musicTrack2 = (MusicTrack) this.d;
                UIBlockList uIBlockList = (UIBlockList) obj;
                nk40Var.getClass();
                edi.y(uIBlockList, new l14(str, nk40Var, musicTrack, 7), new ab6(str, musicTrack, musicTrack2, 9));
                return uIBlockList;
        }
    }

    public /* synthetic */ bx(kx kxVar, xu.a aVar, izs izsVar, q630 q630Var, int i) {
        this.e = kxVar;
        this.f = aVar;
        this.c = izsVar;
        this.d = q630Var;
    }

    public /* synthetic */ bx(nk40 nk40Var, MusicTrack musicTrack, String str, MusicTrack musicTrack2) {
        this.e = nk40Var;
        this.f = musicTrack;
        this.c = str;
        this.d = musicTrack2;
    }
}
