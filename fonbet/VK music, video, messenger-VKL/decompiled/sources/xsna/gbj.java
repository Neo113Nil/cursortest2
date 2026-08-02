package xsna;

import android.content.Context;
import android.text.TextPaint;
import com.vk.bridges.di.BridgeComponent;
import com.vk.bridges.di.CameraComponent;
import com.vk.catalog2.common.ui.holders.group.cell.GroupCellVh;
import com.vk.catalog2.feature.music.ui.holder.MusicCatalogRootVh;
import com.vk.core.tool.view.FrameLayoutSwiped;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.dialogslist.impl.list.adapter.DialogsListAdapter;
import com.vk.donut.price.api.di.DonutPriceComponent;
import com.vk.ecomm.reviews.impl.marketitem.createreview.presentation.CreateMarketItemReviewFragment;
import com.vk.fave.fragments.FavesFragment;
import com.vk.friends.recommendations.impl.presentation.FriendsImportFragment;
import com.vk.geo.impl.presentation.e;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.fave_feed.presentation.fragment.FaveFeedFragment;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vkontakte.android.R;
import java.util.concurrent.CancellationException;
import xsna.whz;
import xsna.xn50;
import xsna.z710;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class gbj implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gbj(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x013c, code lost:
    
        if ((r1.getSize() + r1.getOffset()) > r0.j().h()) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        boolean z = false;
        switch (this.b) {
            case 0:
                ((io.reactivex.rxjava3.core.y) this.c).onError(new CancellationException("Contacts sync permission request dismissed"));
                return s3q0.a;
            case 1:
                ((ddj) this.c).f();
                return s3q0.a;
            case 2:
                CreateMarketItemReviewFragment createMarketItemReviewFragment = (CreateMarketItemReviewFragment) this.c;
                int i = CreateMarketItemReviewFragment.U;
                return ((CameraComponent) m7m.d(createMarketItemReviewFragment).a(fpf0.a(CameraComponent.class))).ka();
            case 3:
                ((wh50) this.c).setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                return s3q0.a;
            case 4:
                hrl hrlVar = (hrl) this.c;
                hrlVar.d = true;
                hrlVar.a.c();
                return s3q0.a;
            case 5:
                return new DialogsListAdapter((fum) this.c);
            case 6:
                return ((DonutPriceComponent) ((k7m) m7m.c(((p1o) this.c).itemView)).a(fpf0.a(DonutPriceComponent.class))).kf();
            case 7:
                return ((BridgeComponent) ((k7m) m7m.f((com.vk.attachpicker.screen.h) this.c)).a(fpf0.a(BridgeComponent.class))).t().b();
            case 8:
                m7q m7qVar = ((a6q) this.c).z;
                if (m7qVar != null) {
                    return m7qVar.a;
                }
                return null;
            case 9:
                return ((FaveFeedFragment) this.c).b0;
            case 10:
                FavesFragment favesFragment = (FavesFragment) this.c;
                int i2 = FavesFragment.j0;
                return (NewsFeedComponent) m7m.d(favesFragment).a(fpf0.a(NewsFeedComponent.class));
            case 11:
                ((NewsFeedComponent) ((k7m) m7m.f((com.vk.newsfeed.common.recycler.holders.a) this.c)).a(fpf0.a(NewsFeedComponent.class))).n0();
                return iuc0.b;
            case 12:
                return ((FrameLayoutSwiped) this.c).findViewById(R.id.container);
            case 13:
                FriendsImportFragment friendsImportFragment = (FriendsImportFragment) this.c;
                int i3 = FriendsImportFragment.a0;
                h3p0.b(friendsImportFragment);
                return s3q0.a;
            case 14:
                ((com.vk.geo.impl.presentation.b) this.c).T(e.a.b.b);
                return s3q0.a;
            case 15:
                return ((y4u) this.c).i.bd();
            case 16:
                ((zau) this.c).a.getClass();
                return Integer.valueOf(dhr0.E().getColor(R.color.vk_white));
            case 17:
                return ((BridgeComponent) ((k7m) m7m.f((gfu) this.c)).a(fpf0.a(BridgeComponent.class))).ob();
            case 18:
                com.vk.catalog2.common.ui.holders.group.a aVar = ((GroupCellVh) this.c).o;
                if (aVar != null) {
                    com.vk.catalog2.common.ui.holders.group.a.d(aVar, true, null, null, 6);
                }
                return s3q0.a;
            case 19:
                xvy xvyVar = ((fxu) this.c).b;
                xuy xuyVar = (xuy) j5g.k0(xvyVar.j().f());
                if (xuyVar != null) {
                    if (xuyVar.getIndex() >= xvyVar.j().d() - 1) {
                        break;
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case 20:
                m5v m5vVar = (m5v) this.c;
                m5vVar.n.E4(m5vVar.q6());
                return s3q0.a;
            case 21:
                return new n5y((x6y) this.c);
            case 22:
                whz whzVar = (whz) this.c;
                VkImageSimple vkImageSimple = (VkImageSimple) whzVar.getView().findViewById(R.id.sound_button);
                bwt0.i0(vkImageSimple, new whz.a(1, whzVar, whz.class, "onVolumeClick", "onVolumeClick(Landroid/view/View;)V", 0));
                vkImageSimple.setVisibility(0);
                return vkImageSimple;
            case 23:
                kp00 kp00Var = (kp00) this.c;
                return new b1r(kp00Var.c.p(), kp00Var.c.F());
            case 24:
                j210 j210Var = (j210) this.c;
                h210 h210Var = j210Var.n;
                if (h210Var != null) {
                    j210Var.l.c(new f210(h210Var.d, h210Var.b, h210Var.c, h210Var.g.c.a.toString(), h210Var.h, h210Var.i, h210Var.j));
                }
                return s3q0.a;
            case 25:
                xn50.a.c(((f910) this.c).d, z710.j.b);
                return s3q0.a;
            case 26:
                ((g130) this.c).n.b();
                return s3q0.a;
            case 27:
                hk30 hk30Var = (hk30) this.c;
                TextPaint textPaint = new TextPaint();
                com.vk.typography.b.c(textPaint, hk30Var.a, FontFamily.MEDIUM, Float.valueOf(12.0f), TextSizeUnit.SP);
                return textPaint;
            case 28:
                Context context = ((uu30) this.c).d;
                return (context != null ? context : null).getString(R.string.vkim_msg_list_wall_reply_title_secondary);
            default:
                MusicCatalogRootVh musicCatalogRootVh = (MusicCatalogRootVh) this.c;
                vtk0.d().d(musicCatalogRootVh.R(), new v450(new i2u(musicCatalogRootVh, 1), new ou1(musicCatalogRootVh, 5)));
                w950 w950Var = (w950) musicCatalogRootVh.q.getValue();
                if (w950Var != null) {
                    w950Var.I(musicCatalogRootVh.z.b, true);
                }
                return s3q0.a;
        }
    }
}
