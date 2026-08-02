package xsna;

import com.vk.community.design.view.components.compose.CommunityCardMode;
import com.vk.community.design.view.components.compose.CommunityCardTitle$Text;
import com.vk.ecomm.design.compose.tile.MarketProductTileConfig;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class xc10 implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ q630 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ xc10(CommunityCardTitle$Text communityCardTitle$Text, q630 q630Var, com.vk.community.design.view.components.compose.b bVar, dtg dtgVar, com.vk.community.design.view.components.compose.a aVar, etg etgVar, CommunityCardMode communityCardMode, k9q0 k9q0Var, int i, int i2) {
        this.f = communityCardTitle$Text;
        this.c = q630Var;
        this.g = bVar;
        this.h = aVar;
        this.i = etgVar;
        this.j = communityCardMode;
        this.d = i;
        this.e = i2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                com.vk.ecomm.design.compose.tile.a.a((MarketProductTileConfig) this.f, this.c, (pco) this.g, (izs) this.h, (izs) this.i, (izs) this.j, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1), this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                emu0.c((CommunityCardTitle$Text) this.f, this.c, (com.vk.community.design.view.components.compose.b) this.g, null, (com.vk.community.design.view.components.compose.a) this.h, (etg) this.i, (CommunityCardMode) this.j, null, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1), this.e);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ xc10(MarketProductTileConfig marketProductTileConfig, q630 q630Var, pco pcoVar, izs izsVar, izs izsVar2, izs izsVar3, int i, int i2) {
        this.f = marketProductTileConfig;
        this.c = q630Var;
        this.g = pcoVar;
        this.h = izsVar;
        this.i = izsVar2;
        this.j = izsVar3;
        this.d = i;
        this.e = i2;
    }
}
