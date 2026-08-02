package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.feature.music.dto.ui.UIBlockAudioContentCard;
import com.vk.dto.common.id.UserId;
import com.vk.dto.podcast.Podcast;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class hk40 implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ hk40(nk40 nk40Var, UserId userId, boolean z) {
        this.d = nk40Var;
        this.e = userId;
        this.c = z;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                nk40 nk40Var = (nk40) this.d;
                UserId userId = (UserId) this.e;
                UIBlockList uIBlockList = (UIBlockList) obj;
                nk40Var.getClass();
                dxh dxhVar = new dxh(userId, 28);
                final boolean z = this.c;
                edi.y(uIBlockList, dxhVar, new izs() { // from class: xsna.kk40
                    @Override // xsna.izs
                    public final Object invoke(Object obj3) {
                        UIBlock uIBlock = (UIBlock) obj3;
                        if (!(uIBlock instanceof UIBlockAudioContentCard.PodcastCard)) {
                            return uIBlock;
                        }
                        UIBlockAudioContentCard.PodcastCard podcastCard = (UIBlockAudioContentCard.PodcastCard) uIBlock;
                        return new UIBlockAudioContentCard.PodcastCard(podcastCard.y, podcastCard.z, Podcast.a(podcastCard.A, z, 7167), sua.l(uIBlock));
                    }
                });
                return uIBlockList;
            default:
                ((Integer) obj2).getClass();
                int I = ne7.I(49);
                ((w6s0) this.d).c(this.c, (jai) this.e, (androidx.compose.runtime.a) obj, I);
                return s3q0.a;
        }
    }

    public /* synthetic */ hk40(w6s0 w6s0Var, boolean z, jai jaiVar, int i) {
        this.d = w6s0Var;
        this.c = z;
        this.e = jaiVar;
    }
}
