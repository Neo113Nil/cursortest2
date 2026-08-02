package xsna;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.bridges.di.BridgeComponent;
import com.vk.camera.editor.common.di.CommonEditorComponentImpl;
import com.vk.catalog2.common.ui.mvp.holder.ComposeConfigurableHeaderVh;
import com.vk.comments.impl.marketitem.commentlist.presentation.MarketItemCommentsFragment;
import com.vk.ecomm.market.good.GoodFragment;
import com.vk.folders.impl.configure.FolderConfigurationFragment;
import com.vk.geo.impl.presentation.GeoFragment;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vk.music.fragment.impl.EditPlaylistFragment;
import com.vk.music.model.di.AudioModelsComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.presentation.discover_media.presentation.fragment.DiscoverMediaTabFragment2;
import com.vk.newsfeed.posting.impl.data.db.PostingDatabase;
import com.vk.photo.editor.ivm.EditorMessage;
import com.vk.photo.editor.markup.view.tools.SizeSeekBarView;
import com.vk.profile.community.catalog.impl.communities.CommunitiesCatalogFragment;
import com.vk.reactions.view.ElevationImageView;
import com.vk.topics.api.di.TopicsComponent;
import com.vkontakte.android.R;
import java.io.File;
import ru.ok.android.webrtc.Call;
import xsna.dzh;
import xsna.k010;
import xsna.m5u;
import xsna.s1c0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class m2g implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m2g(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Integer num = null;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((r2g) obj).e.d().a(EditorMessage.b.a);
                return s3q0.a;
            case 1:
                qcy<Object>[] qcyVarArr = CommonEditorComponentImpl.h;
                nwy nwyVar = ((CommonEditorComponentImpl) obj).a;
                qcy<Object> qcyVar = CommonEditorComponentImpl.h[0];
                return new x3l0((v3l0) nwyVar.c());
            case 2:
                int i2 = CommunitiesCatalogFragment.T;
                return ((VkClientMultiAccountComponent) m7m.d((CommunitiesCatalogFragment) obj).a(fpf0.a(VkClientMultiAccountComponent.class))).getExperiments();
            case 3:
                ((cbh) obj).j.i();
                return s3q0.a;
            case 4:
                return ((TopicsComponent) ((h7m) obj).a(fpf0.a(TopicsComponent.class))).fe();
            case 5:
                ((ryh) obj).b.c(dzh.n.b.a);
                return s3q0.a;
            case 6:
                int i3 = ComposeConfigurableHeaderVh.F;
                return (ConstraintLayout) ((ComposeConfigurableHeaderVh) obj).a().findViewById(R.id.ds_internal_group_header_root);
            case 7:
                return ((i1j) obj).c.findViewById(R.id.voip_room_participant_loading_progress);
            case 8:
                return (tcj) obj;
            case 9:
                return Boolean.valueOf(((Call) obj).isDestroyed());
            case 10:
                return new hik((gik) obj);
            case 11:
                vtm vtmVar = (vtm) obj;
                vtmVar.l.setVisibility(8);
                vtmVar.w.e(false);
                vtmVar.x.c(false);
                vtmVar.y.c(false);
                vtmVar.z.c(false);
                vtmVar.A.c(false);
                tkv tkvVar = vtmVar.D.g;
                if (tkvVar != null) {
                    hhp hhpVar = vtmVar.B;
                    hhpVar.h = tkvVar.a;
                    hhpVar.i = tkvVar.b;
                }
                vtmVar.B.c(true);
                vtmVar.n.setVisibility(4);
                vtmVar.r.submitList(vtmVar.D.a);
                return s3q0.a;
            case 12:
                DiscoverMediaTabFragment2 discoverMediaTabFragment2 = (DiscoverMediaTabFragment2) obj;
                qcy<Object>[] qcyVarArr2 = DiscoverMediaTabFragment2.C0;
                s1c0.a aVar = new s1c0.a();
                aVar.b = true;
                sf2 sf2Var = new sf2();
                sf2Var.b = discoverMediaTabFragment2.Y.get();
                aVar.s = sf2Var.a();
                aVar.J = discoverMediaTabFragment2.eo().e;
                return aVar.a();
            case 13:
                return (PostingDatabase) bhv0.a(((gfo) obj).a, "posting_db", PostingDatabase.class).b();
            case 14:
                djo djoVar = (djo) obj;
                SizeSeekBarView sizeSeekBarView = new SizeSeekBarView(djoVar.k, null, 0, 14, 0);
                sizeSeekBarView.setListener(djoVar);
                sizeSeekBarView.setAnchor(SizeSeekBarView.Anchor.End);
                sizeSeekBarView.setContentDescription(djoVar.k.getResources().getString(R.string.drawing_tool_brush_size));
                bwt0.p0(sizeSeekBarView, false);
                return sizeSeekBarView;
            case 15:
                int i4 = EditPlaylistFragment.P;
                return (AudioModelsComponent) j6i.b(m7m.d((EditPlaylistFragment) obj), AudioModelsComponent.class);
            case 16:
                return ElevationImageView.T0((ElevationImageView) obj);
            case 17:
                File file = ((iar) obj).h;
                return "Directory " + (file != null ? file : null) + " already exists";
            case 18:
                return ((apr) obj).b.getCornersStateKeeper();
            case 19:
                qcy<Object>[] qcyVarArr3 = FolderConfigurationFragment.b0;
                return ((BridgeComponent) ((k7m) m7m.f((FolderConfigurationFragment) obj)).a(fpf0.a(BridgeComponent.class))).s();
            case 20:
                ((ahs) obj).getClass();
                return null;
            case 21:
                GeoFragment geoFragment = (GeoFragment) obj;
                qcy<Object>[] qcyVarArr4 = GeoFragment.c0;
                yv50 yv50Var = new yv50(geoFragment.getFeature(), geoFragment.getViewLifecycleOwner(), geoFragment.getFeature().X(), (s6r) geoFragment.getFeature().l.getValue());
                yv50Var.l = geoFragment.go();
                return yv50Var;
            case 22:
                qcy<Object>[] qcyVarArr5 = GoodFragment.U0;
                return new rkd0(m7m.f((GoodFragment) obj));
            case 23:
                w6u w6uVar = (w6u) obj;
                sop sopVar = w6uVar.l;
                v6u v6uVar = w6uVar.p;
                k7u k7uVar = (v6uVar == null ? null : v6uVar).b;
                boolean z = (v6uVar == null ? null : v6uVar).b.a.J;
                r41 r41Var = ((n5u) w6uVar.m.c).i;
                if (r41Var != null) {
                    num = r41Var.b((v6uVar != null ? v6uVar : null).b);
                }
                sopVar.invoke(new m5u.r(k7uVar, z, true, num));
                return s3q0.a;
            case 24:
                ((bev) obj).getClass();
                return new PorterDuffColorFilter(krv0.l(R.attr.vk_ui_background_content), PorterDuff.Mode.SRC_IN);
            case 25:
                return quv.h((quv) obj);
            case 26:
                return go9.b("#stopBgSync - ", (String) obj);
            case 27:
                return ((BridgeComponent) ((k7m) m7m.f((zex) obj)).a(fpf0.a(BridgeComponent.class))).F();
            case 28:
                ((NewsFeedComponent) ((k7m) m7m.c(((z6z) obj).itemView)).a(fpf0.a(NewsFeedComponent.class))).n0();
                return iuc0.b;
            default:
                MarketItemCommentsFragment marketItemCommentsFragment = (MarketItemCommentsFragment) obj;
                int i5 = MarketItemCommentsFragment.j0;
                marketItemCommentsFragment.getClass();
                xn50.a.c(marketItemCommentsFragment, k010.d.b);
                return s3q0.a;
        }
    }
}
