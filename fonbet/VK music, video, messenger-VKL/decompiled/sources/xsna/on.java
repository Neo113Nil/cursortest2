package xsna;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.section.CatalogSection;
import com.vk.channels.impl.channel_screen.footer.b;
import com.vk.clips.playlists.ui.picker.c;
import com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFragmentImpl;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.clips.viewer.impl.grid.ClipsGridFragment;
import com.vk.clips.viewer.impl.grid.lists.fragments.AbstractClipsGridListFragment;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.data.Subscription;
import com.vk.dto.music.MusicTrack;
import com.vk.ecomm.catalog.impl.catalog.simple.ClassifiedsCatalogSimpleRootVh;
import com.vk.music.ui.subscription.BuyMusicSubscriptionButton;
import com.vk.notifications.settings.CommunityNotificationSettingsFragment;
import com.vk.photos.root.albums.presentation.a;
import com.vk.webapp.fragments.AccountFragment;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import xsna.gm50;
import xsna.n22;
import xsna.pt2;
import xsna.uxd0;
import xsna.x7b;
import xsna.y6d;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class on implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ on(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v57, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v59, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Boolean bool = null;
        switch (this.b) {
            case 0:
                AccountFragment accountFragment = (AccountFragment) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i = AccountFragment.a0;
                Bundle arguments = accountFragment.getArguments();
                break;
            case 1:
                ((com.vk.photos.root.albums.presentation.b) this.c).C(new a.c((nda0) obj));
                break;
            case 2:
                List<MusicTrack> list = (List) obj;
                nt70 nt70Var = new nt70(((e22) this.c).b);
                nt70Var.l = list;
                mt70 a = nt70Var.a("");
                List<String> list2 = s9a.a;
                List<String> list3 = a.b.get(CatalogDataType.DATA_TYPE_MUSIC_TRACKS);
                CatalogSection catalogSection = new CatalogSection("synthetic_offline_section", null, "", null, null, null, list2, ((list3 != null ? !list3.isEmpty() ? 1 : 0 : 0) != 0 ? new n22.a() : new n22.b()).a(a), EmptyList.b, null, null, null, null, null, 15360, null);
                List<MusicTrack> list4 = list;
                HashMap hashMap = new HashMap(list4.size());
                for (MusicTrack musicTrack : list4) {
                    hashMap.put(musicTrack.Fb(), musicTrack);
                }
                break;
            case 3:
                pt2.a aVar = ((st2) this.c).A;
                if (aVar != null) {
                    pt2 pt2Var = pt2.this;
                    tax.f(pt2Var.i, pt2Var.l);
                }
                break;
            case 4:
                break;
            case 5:
                r46 r46Var = (r46) this.c;
                r46Var.k(new uxd0.s(r46Var.c.getTitle(), new mh((io.reactivex.rxjava3.disposables.c) obj, 9)));
                break;
            case 6:
                Object obj2 = ((wa6) this.c).o;
                ((p0c) (obj2 != null ? obj2 : null)).a();
                break;
            case 7:
                break;
            case 8:
                ((BuyMusicSubscriptionButton) this.c).u.invoke((Subscription) obj);
                break;
            case 9:
                break;
            case 10:
                ((m99) this.c).r();
                break;
            case 11:
                break;
            case 12:
                ((com.vk.channels.impl.channel_screen.footer.i) this.c).O(b.C0528b.b);
                break;
            case 13:
                ((s7b) this.c).i.b(x7b.b.a);
                break;
            case 14:
                break;
            case 15:
                mrb mrbVar = (mrb) obj;
                prb prbVar = ((krb) this.c).m;
                if (prbVar != null) {
                    prbVar.a(mrbVar);
                }
                break;
            case 16:
                xyb xybVar = (xyb) this.c;
                Throwable th = (Throwable) obj;
                xyb.C.a(th);
                if (xybVar.A != null) {
                    zk70.e(th);
                }
                break;
            case 17:
                ((ClassifiedsCatalogSimpleRootVh) this.c).m.b.b.c(false);
                break;
            case 18:
                o1d o1dVar = (o1d) this.c;
                gm50.a.a(o1dVar, ((y6d.a) obj).a, new s9(o1dVar, 19));
                break;
            case 19:
                ((ebd) this.c).q.C((ixe) obj);
                break;
            case 20:
                break;
            case 21:
                AbstractClipsGridListFragment abstractClipsGridListFragment = ((xde) this.c).e;
                if (abstractClipsGridListFragment != null) {
                    abstractClipsGridListFragment.lb();
                }
                break;
            case 22:
                ((com.vk.clips.playlists.ui.picker.b) this.c).T(c.b.a.b);
                break;
            case 23:
                ClipsUploadFragmentImpl clipsUploadFragmentImpl = (ClipsUploadFragmentImpl) this.c;
                String str = ClipsUploadFragmentImpl.a0;
                oap oapVar = (oap) clipsUploadFragmentImpl.R.getValue();
                Set set = (Set) clipsUploadFragmentImpl.T.getValue();
                iff fo = clipsUploadFragmentImpl.fo();
                fo.getClass();
                break;
            case 24:
                ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) this.c;
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                xuf xufVar = clipsWrapperFragment.G0;
                if (xufVar != null) {
                    Fragment jo = clipsWrapperFragment.jo();
                    ClipsGridFragment clipsGridFragment = jo instanceof ClipsGridFragment ? (ClipsGridFragment) jo : null;
                    if (clipsGridFragment != null) {
                        VkTopBar topBar = xufVar.getTopBar();
                        RectF o = zjq.o(xufVar.getTopBar().getRightExtraRect());
                        Rect rect = new Rect();
                        o.roundOut(rect);
                        clipsGridFragment.po(topBar, rect, booleanValue2, ClipsWrapperFragment.j.b);
                        s3q0 s3q0Var = s3q0.a;
                    } else {
                        r3 = false;
                    }
                    bool = Boolean.valueOf(r3);
                }
                break;
            case 25:
                ytf ytfVar = (ytf) this.c;
                ((Boolean) obj).getClass();
                ytfVar.b.b().f();
                break;
            case 26:
                break;
            case 27:
                break;
            case 28:
                d4h d4hVar = (d4h) this.c;
                ((d3h) d4hVar.c.invoke()).j(d4hVar.d, ((Boolean) obj).booleanValue());
                break;
            default:
                CommunityNotificationSettingsFragment communityNotificationSettingsFragment = (CommunityNotificationSettingsFragment) this.c;
                int i2 = CommunityNotificationSettingsFragment.b0;
                ((rj70) communityNotificationSettingsFragment.S.getValue()).b();
                communityNotificationSettingsFragment.ho(64L, new fbh(communityNotificationSettingsFragment, r4));
                break;
        }
        return s3q0.a;
    }
}
