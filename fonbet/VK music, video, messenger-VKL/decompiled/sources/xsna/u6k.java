package xsna;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Size;
import android.widget.ViewFlipper;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.catalog2.common.dto.api.music.CatalogMusicTrackLocalState;
import com.vk.catalog2.common.dto.ui.UIBlockGroupsCollection;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicTrack;
import com.vk.catalog2.feature.music.holders.MusicDownloadsInProgressVh;
import com.vk.catalog2.feature.music.holders.MusicTrackCellVh;
import com.vk.catalog2.feature.music.ui.holder.MusicMyAudiosCatalogRootVh;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.market.MarketItemType;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.identity.fragments.IdentityListFragment;
import com.vk.im.engine.models.groups.ManagedGroup;
import com.vk.inappreview.InAppReviewConditionKey;
import com.vk.managed_groups.impl.list.a;
import com.vk.music.snippet.player.analytics.model.MusicLongtapExitType;
import com.vk.newsfeed.impl.postmodal.reactions.donut.e;
import com.vk.onetimedonut.api.events.OneTimeDonutEventStatus;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import xsna.a510;
import xsna.gxg;
import xsna.ikv0;
import xsna.io8;
import xsna.m2s;
import xsna.s2s;
import xsna.s8k;
import xsna.sg90;
import xsna.t6k;
import xsna.tlo0;
import xsna.tra0;
import xsna.wy30;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class u6k implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u6k(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008d  */
    /* JADX WARN: Type inference failed for: r3v37, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v38, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v39, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Boolean] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        ImageSize Cb;
        a510 a510Var;
        Iterator it;
        char c;
        char c2;
        s3q0 s3q0Var;
        Iterator it2;
        char c3;
        a510 a510Var2;
        ?? r3;
        boolean z;
        Object obj2;
        zf40 zf40Var;
        boolean c4;
        UIBlockMusicTrack uIBlockMusicTrack;
        zf40 zf40Var2;
        boolean c5;
        se50<MusicTrack> se50Var;
        zf40 zf40Var3;
        int i = this.b;
        int i2 = 10;
        Integer num = null;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((t6k.b) obj3).l.g();
                break;
            case 1:
                ((p8k) obj3).T(new s8k.d((a8k) obj));
                break;
            case 2:
                t4m t4mVar = (t4m) obj3;
                CharSequence charSequence = (CharSequence) obj;
                t4mVar.d.setDescription(charSequence);
                t4mVar.i = charSequence;
                break;
            case 3:
                io8 io8Var = (io8) obj3;
                pwm pwmVar = (pwm) obj;
                if (io8Var instanceof io8.b) {
                    break;
                } else {
                    break;
                }
            case 4:
                w7o w7oVar = (w7o) obj3;
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList.add(oc4.d((AudioAudioDto) it3.next()));
                }
                String string = w7oVar.a.getString(R.string.music_offline_downloads_history_title);
                List<MusicTrack> d = w7oVar.b.d(arrayList);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : d) {
                    if (!epx.f(((MusicTrack) obj4).J, DownloadingState.Downloaded.b)) {
                        arrayList2.add(obj4);
                    }
                }
                break;
            case 5:
                kzo kzoVar = (kzo) obj3;
                String str = (String) obj;
                if (String.valueOf(kzoVar.i.getText()).length() == 0) {
                    kzoVar.i.setText(str);
                }
                kzoVar.j.setText(str.length() + " / 512");
                break;
            case 6:
                vgg vggVar = (vgg) obj;
                Throwable th = vggVar.a;
                par0.a.getClass();
                par0.d(th);
                cpp cppVar = (cpp) ((com.vk.auth.enterphone.a) obj3).a;
                if (cppVar != null) {
                    cppVar.setChooseCountryEnable(true);
                }
                vggVar.c();
                break;
            case 7:
                boolean z2 = false;
                NewsEntry newsEntry = (NewsEntry) obj3;
                u1c0 u1c0Var = (u1c0) obj;
                if (u1c0Var.c == 242 && u1c0Var.a == newsEntry) {
                    z2 = true;
                }
                break;
            case 8:
                i2s i2sVar = (i2s) obj3;
                if (((t2s) obj).c.size() >= 15) {
                    i2sVar.n(new s2s.c(R.string.vkim_folder_limit_reached, 15));
                } else {
                    i2sVar.m(m2s.b.a);
                }
                break;
            case 9:
                ViewFlipper viewFlipper = ((uhu) obj3).Y0().g;
                sp.g(viewFlipper == null ? null : viewFlipper, 1);
                break;
            case 10:
                gxg gxgVar = (gxg) obj;
                Image image = ((UIBlockGroupsCollection) obj3).J;
                String str2 = (image == null || (Cb = image.Cb(gxgVar.getWidth(), true, false)) == null) ? null : Cb.d.d;
                if (str2 == null) {
                    str2 = "";
                }
                gxgVar.setCardImage(new gxg.a(str2));
                break;
            case 11:
                sgz sgzVar = (sgz) obj;
                ((c8v) obj3).f1().s(sgzVar.a, sgzVar.b);
                break;
            case 12:
                jlv jlvVar = (jlv) obj3;
                r100.a(jlvVar.e, "Fake condition action is triggered");
                com.vk.inappreview.impl.fake.a aVar = new com.vk.inappreview.impl.fake.a();
                Bundle bundle = new Bundle();
                bundle.putString("condition_key", ((InAppReviewConditionKey) obj).h());
                aVar.setArguments(bundle);
                aVar.Td(jlvVar.a.getSupportFragmentManager(), "FakeIar");
                break;
            case 13:
                int i3 = IdentityListFragment.U;
                ((IdentityListFragment) obj3).Mf(-1, (Intent) obj);
                break;
            case 14:
                zdw zdwVar = (zdw) obj3;
                break;
            case 15:
                tra0.a.y((tra0.a) obj, (tra0) obj3, 0L);
                break;
            case 16:
                com.vk.managed_groups.impl.list.c cVar = (com.vk.managed_groups.impl.list.c) obj3;
                List list2 = (List) obj;
                ArrayList arrayList3 = new ArrayList(c5g.u(list2, 10));
                Iterator it4 = list2.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(new xh00((ManagedGroup) it4.next()));
                }
                cVar.C(new a.c(arrayList3));
                break;
            case 17:
                Bitmap bitmap = (Bitmap) obj;
                su suVar = ((uo00) obj3).b;
                Bitmap b = suVar.b(bitmap);
                sg90 b2 = new sg90.b(b).b();
                if (!b.equals(bitmap)) {
                    b.recycle();
                }
                break;
            case 18:
                wr00 wr00Var = (wr00) obj3;
                break;
            case 19:
                x410 x410Var = (x410) obj;
                a510 a510Var3 = ((r410) obj3).d;
                a510Var3.getClass();
                ListBuilder e = e43.e();
                Float f = x410Var.j;
                s410 s410Var = x410Var.B;
                char c6 = 2;
                char c7 = 14;
                if (f != null) {
                    e.add(new k410(new mig0(oq.d(tlo0.Companion, x410Var.h), x410Var.F, f.floatValue(), x410Var.f, x410Var.E), m4s.v(s410Var, null, null, 14)));
                    if (x410Var.D) {
                        int i4 = a510.a.$EnumSwitchMapping$0[x410Var.x.ordinal()];
                        e.add(new aye0(i4 != 1 ? i4 != 2 ? i4 != 3 ? new tlo0.f(R.string.community_reviews_filter_item_lowest_mark) : new tlo0.f(R.string.community_reviews_filter_item_highest_mark) : new tlo0.f(R.string.community_reviews_filter_item_with_photos) : new tlo0.f(R.string.community_reviews_filter_item_newest), m4s.v(s410Var, null, null, 14)));
                    }
                }
                Collection<n210> values = x410Var.k.values();
                ArrayList arrayList4 = new ArrayList(c5g.u(values, 10));
                Iterator it5 = values.iterator();
                while (it5.hasNext()) {
                    n210 n210Var = (n210) it5.next();
                    boolean v = m4s.v(s410Var, Integer.valueOf(n210Var.a), num, i2);
                    if (n210Var.m) {
                        int i5 = n210Var.a;
                        long j = n210Var.b;
                        big0 big0Var = n210Var.d;
                        e.add(new g210(big0Var.a, big0Var.b, i5, v, j));
                        a510Var = a510Var3;
                        it = it5;
                        s3q0Var = Boolean.TRUE;
                        c = c6;
                        c2 = c7;
                    } else {
                        e.add(k210.a(n210Var, x410Var.f, v, x410Var.p == MarketItemType.OZON || x410Var.q != null));
                        List<k4g0> list3 = n210Var.n;
                        long j2 = n210Var.b;
                        int i6 = n210Var.a;
                        List<k4g0> list4 = list3;
                        if (list4.isEmpty()) {
                            a510Var = a510Var3;
                            it = it5;
                            c = c6;
                            c2 = c7;
                        } else {
                            for (k4g0 k4g0Var : list3) {
                                e210 e210Var = new e210(j2);
                                boolean z3 = k4g0Var.h;
                                int i7 = k4g0Var.a;
                                if (z3) {
                                    it2 = it5;
                                    c3 = 2;
                                    e.add(hpt0.n(k4g0Var, m4s.v(s410Var, Integer.valueOf(i6), Integer.valueOf(i7), 2), e210Var));
                                    a510Var2 = a510Var3;
                                } else {
                                    it2 = it5;
                                    c3 = 2;
                                    a510Var2 = a510Var3;
                                    e.add(gcd0.q(k4g0Var, m4s.v(s410Var, Integer.valueOf(i6), Integer.valueOf(i7), 2), a510Var3.a, e210Var));
                                }
                                c6 = c3;
                                it5 = it2;
                                a510Var3 = a510Var2;
                            }
                            a510Var = a510Var3;
                            it = it5;
                            c = c6;
                            if (n210Var.p > list4.size()) {
                                c2 = 14;
                                e.add(new sij0(i6, m4s.v(s410Var, null, null, 14), new e210(j2)));
                            } else {
                                c2 = 14;
                            }
                        }
                        s3q0Var = s3q0.a;
                    }
                    arrayList4.add(s3q0Var);
                    c6 = c;
                    c7 = c2;
                    it5 = it;
                    a510Var3 = a510Var;
                    i2 = 10;
                    num = null;
                }
                if (x410Var.t) {
                    e.add(hig0.b);
                }
                if (x410Var.w != null) {
                    e.add(new he90());
                }
                break;
            case 20:
                ((vb20) obj3).a.b1();
                break;
            case 21:
                com.vk.newsfeed.impl.postmodal.reactions.donut.b bVar = (com.vk.newsfeed.impl.postmodal.reactions.donut.b) obj3;
                if (((i9x0) obj).r() == OneTimeDonutEventStatus.SUCCESS) {
                    bVar.h.b(e.a.a);
                    bVar.e.b(hg1.i(bVar.i.a(bVar.f), new oqu(i2)));
                }
                break;
            case 22:
                com.vk.im.ui.components.msg_list.a aVar2 = (com.vk.im.ui.components.msg_list.a) obj3;
                Throwable th2 = (Throwable) obj;
                aVar2.getClass();
                com.vk.im.ui.components.msg_list.a.P0.a(th2);
                vm30 vm30Var = aVar2.o;
                if (vm30Var != null) {
                    vm30Var.H(th2);
                }
                vm30 vm30Var2 = aVar2.o;
                if (vm30Var2 != null) {
                    vm30Var2.e0.dismiss();
                }
                aVar2.c0 = null;
                break;
            case 23:
                zt30 zt30Var = (zt30) obj3;
                au30 au30Var = zt30Var.f;
                if (au30Var != null) {
                    int i8 = au30Var.h;
                    pk30 pk30Var = zt30Var.e;
                    if (pk30Var != null) {
                        pk30Var.g(i8);
                    }
                }
                break;
            case 24:
                ArrayList arrayList5 = (ArrayList) obj3;
                wy30.a aVar3 = (wy30.a) obj;
                aVar3.c = SystemClock.uptimeMillis();
                aVar3.h = true;
                wy30 wy30Var = wy30.a;
                aVar3.n = wy30.n(arrayList5);
                aVar3.p = arrayList5.size();
                aVar3.g = "unknown";
                break;
            case 25:
                ((vh40) obj3).d.i0((List) obj);
                break;
            case 26:
                MusicDownloadsInProgressVh musicDownloadsInProgressVh = (MusicDownloadsInProgressVh) obj3;
                List list5 = (List) obj;
                if (musicDownloadsInProgressVh.a().getItemCount() > list5.size()) {
                    List<Playlist> y0 = musicDownloadsInProgressVh.a().y0();
                    r3 = new ArrayList();
                    Iterator it6 = ((ArrayList) y0).iterator();
                    while (it6.hasNext()) {
                        Object next = it6.next();
                        Playlist playlist = (Playlist) next;
                        Iterator it7 = list5.iterator();
                        while (true) {
                            if (it7.hasNext()) {
                                obj2 = it7.next();
                                if (playlist.b == ((Playlist) obj2).b) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        if (obj2 == null) {
                            r3.add(next);
                        }
                    }
                } else {
                    r3 = EmptyList.b;
                }
                if (r3.isEmpty()) {
                    Iterable g = e43.g(musicDownloadsInProgressVh.a().y0());
                    if (!(g instanceof Collection) || !((Collection) g).isEmpty()) {
                        j9x it8 = g.iterator();
                        while (it8.d) {
                            int nextInt = it8.nextInt();
                            if (((Playlist) ((ArrayList) musicDownloadsInProgressVh.a().y0()).get(nextInt)).b != ((Playlist) list5.get(nextInt)).b) {
                                z = true;
                                break;
                            }
                        }
                    }
                }
                z = false;
                break;
            case 27:
                MusicMyAudiosCatalogRootVh musicMyAudiosCatalogRootVh = (MusicMyAudiosCatalogRootVh) obj3;
                UIBlockList uIBlockList = musicMyAudiosCatalogRootVh.J;
                if (uIBlockList != null) {
                    musicMyAudiosCatalogRootVh.m.b.e.b(new non0(uIBlockList), true);
                }
                break;
            case 28:
                z550 z550Var = (z550) obj3;
                Activity activity = z550Var.h;
                ikv0.a aVar4 = new ikv0.a(activity.getApplicationContext());
                aVar4.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_accent), (Size) null, 12);
                aVar4.u = new ikv0.d(activity.getString(R.string.music_snippet_add_snackbar), (String) null, (ikv0.d.a) null, 6);
                aVar4.n();
                z550Var.n().a(((Integer) obj).intValue());
                z550Var.n().b(MusicLongtapExitType.ADD_TRACK);
                z550Var.dismiss();
                break;
            default:
                MusicTrackCellVh musicTrackCellVh = (MusicTrackCellVh) obj3;
                boolean z4 = musicTrackCellVh.j;
                Set<String> set = MusicTrackCellVh.A;
                UIBlockMusicTrack uIBlockMusicTrack2 = musicTrackCellVh.p;
                if (uIBlockMusicTrack2 != null) {
                    boolean contains = set.contains(uIBlockMusicTrack2.f);
                    if (!uIBlockMusicTrack2.z.Vb() && !contains && (!uIBlockMusicTrack2.Ob() || z4)) {
                        CatalogMusicTrackLocalState catalogMusicTrackLocalState = uIBlockMusicTrack2.C;
                        if (catalogMusicTrackLocalState.b && !catalogMusicTrackLocalState.c && (zf40Var = musicTrackCellVh.z) != null) {
                            c4 = zf40Var.c();
                            uIBlockMusicTrack = musicTrackCellVh.p;
                            if (uIBlockMusicTrack != null && uIBlockMusicTrack.u == 1 && musicTrackCellVh.x) {
                                boolean contains2 = set.contains(uIBlockMusicTrack.f);
                                if (!uIBlockMusicTrack.z.Vb() && !contains2 && ((!uIBlockMusicTrack.Ob() || z4) && (zf40Var2 = musicTrackCellVh.y) != null)) {
                                    c5 = zf40Var2.c();
                                    se50Var = musicTrackCellVh.q;
                                    if (se50Var == null) {
                                        se50Var = null;
                                    }
                                    if (e3m.h(se50Var.itemView.getContext()) != null) {
                                        Rect rect = new Rect();
                                        if (c5) {
                                            se50<MusicTrack> se50Var2 = musicTrackCellVh.q;
                                            if (se50Var2 == null) {
                                                se50Var2 = null;
                                            }
                                            if (se50Var2.itemView.getGlobalVisibleRect(rect) && (zf40Var3 = musicTrackCellVh.y) != null) {
                                                zf40Var3.a(rect, null);
                                            }
                                        } else if (c4) {
                                            myc0.h(musicTrackCellVh.t, null, null, new sa50(musicTrackCellVh, null), 3);
                                        }
                                    }
                                    musicTrackCellVh.r.b(null);
                                    break;
                                }
                            }
                            c5 = false;
                            se50Var = musicTrackCellVh.q;
                            if (se50Var == null) {
                            }
                            if (e3m.h(se50Var.itemView.getContext()) != null) {
                            }
                            musicTrackCellVh.r.b(null);
                        }
                    }
                }
                c4 = false;
                uIBlockMusicTrack = musicTrackCellVh.p;
                if (uIBlockMusicTrack != null) {
                    boolean contains22 = set.contains(uIBlockMusicTrack.f);
                    if (!uIBlockMusicTrack.z.Vb()) {
                        c5 = zf40Var2.c();
                        se50Var = musicTrackCellVh.q;
                        if (se50Var == null) {
                        }
                        if (e3m.h(se50Var.itemView.getContext()) != null) {
                        }
                        musicTrackCellVh.r.b(null);
                    }
                }
                c5 = false;
                se50Var = musicTrackCellVh.q;
                if (se50Var == null) {
                }
                if (e3m.h(se50Var.itemView.getContext()) != null) {
                }
                musicTrackCellVh.r.b(null);
                break;
        }
        return s3q0.a;
    }
}
