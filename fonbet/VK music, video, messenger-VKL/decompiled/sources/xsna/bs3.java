package xsna;

import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.music.impl.artists.mix.ArtistMix$ArtistMixState;
import com.vk.catalog.mvi.block.music.impl.entity.PlayingState;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockPlayMixAction;
import com.vk.dto.common.Image;
import com.vk.music.player.StartPlaySource;
import com.vk.music.player.StartPlayVkMixSource;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class bs3 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bs3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                u2b0 u2b0Var = (u2b0) this.c;
                CatalogBlockVariant catalogBlockVariant = (CatalogBlockVariant) obj;
                UIBlock uIBlock = (UIBlock) obj2;
                if (!(uIBlock instanceof UIBlockPlayMixAction)) {
                    return null;
                }
                String w = uIBlock.w();
                UIBlockPlayMixAction uIBlockPlayMixAction = (UIBlockPlayMixAction) uIBlock;
                ArtistMix$ArtistMixState.ArtistMixPlayParams artistMixPlayParams = new ArtistMix$ArtistMixState.ArtistMixPlayParams(uIBlock.w(), uIBlock.v0(), uIBlockPlayMixAction.Vb(), uIBlockPlayMixAction.getTitle(), uIBlockPlayMixAction.getId(), uIBlockPlayMixAction.Sb(), uIBlockPlayMixAction.Wb());
                String title = uIBlockPlayMixAction.getTitle();
                String description = uIBlockPlayMixAction.getDescription();
                Image Ub = uIBlockPlayMixAction.Ub();
                Image Tb = uIBlockPlayMixAction.Tb();
                String id = uIBlockPlayMixAction.getId();
                if (id == null) {
                    id = "";
                }
                StartPlaySource j = u2b0Var.j();
                StartPlayVkMixSource startPlayVkMixSource = j instanceof StartPlayVkMixSource ? (StartPlayVkMixSource) j : null;
                return new ArtistMix$ArtistMixState(BlockId.Simple.a(w), catalogBlockVariant, artistMixPlayParams, title, !id.equals(startPlayVkMixSource != null ? startPlayVkMixSource.getId() : null) ? PlayingState.NONE : u2b0Var.m0().h() ? PlayingState.PLAYING : PlayingState.PAUSED, description, Ub, Tb, uIBlock.Jb());
            default:
                return new od9(((Boolean) obj2).booleanValue(), ((nd9) this.c).a.c(), (List) obj);
        }
    }
}
