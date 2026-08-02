package xsna;

import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.vk.catalog2.common.dto.api.section.CatalogSection;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.clips.coauthors.list.common.mvi.entity.viewstate.ClipCoauthorListVS;
import com.vk.clips.interests.impl.ui.ClipsInterestsFragment;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.viewer.impl.grid.ClipsGridFragment;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.polls.Poll;
import com.vk.ecomm.design.compose.tile.MarketProductTileConfig;
import com.vk.ecomm.onlinebooking.impl.preloader.ui.BookingPreloaderFragment;
import com.vk.ecomm.reviews.impl.communities.reviews.data.storage.ConnectYClientsData;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.e;
import com.vk.mediastore.system.AlbumEntry;
import com.vk.newsfeed.posting.impl.domain.model.LocalAlbum;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$MediaPicker$Album$LocalAlbumsChanged;
import com.vk.polls.entities.exceptions.UserAlreadyVotedException;
import com.vkontakte.android.R;
import com.vkontakte.android.actionlinks.views.fragments.add.AddLinkPresenter;
import com.vungle.ads.internal.protos.Sdk;
import io.reactivex.rxjava3.internal.functions.a;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.aiq0;
import xsna.b4;
import xsna.c22;
import xsna.f29;
import xsna.fz8;
import xsna.ghe;
import xsna.ir5;
import xsna.is7;
import xsna.l2f;
import xsna.l7x0;
import xsna.le4;
import xsna.mwa;
import xsna.pta;
import xsna.q29;
import xsna.qv4;
import xsna.rtb0;
import xsna.t5a;
import xsna.ta7;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class s6 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s6(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int indexOf;
        boolean z;
        LocalDate plusDays;
        int i = 3;
        boolean z2 = true;
        r5 = null;
        LocalDate localDate = null;
        Object obj2 = null;
        switch (this.b) {
            case 0:
                ((com.vk.libvideo.bottomsheet.about.delegate.g) this.c).a.d(b4.t.a);
                return s3q0.a;
            case 1:
                cm0 cm0Var = ((AddLinkPresenter) this.c).e;
                (cm0Var != null ? cm0Var : null).h(R.string.action_link_general_error_description);
                return s3q0.a;
            case 2:
                np0 np0Var = (np0) this.c;
                rtb0.a aVar = (rtb0.a) obj;
                boolean z3 = aVar.b;
                Poll poll = aVar.a;
                if (z3) {
                    np0Var.d.h7(l7x0.b.a);
                    np0Var.d.d7(poll);
                } else {
                    b7d0 b7d0Var = np0Var.d;
                    b7d0Var.h7(l7x0.b.a);
                    b7d0Var.i7(new UserAlreadyVotedException("User already voted"));
                    b7d0Var.b7(poll);
                }
                return s3q0.a;
            case 3:
                qj1 qj1Var = (qj1) this.c;
                List<AlbumEntry> list = (List) obj;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (AlbumEntry albumEntry : list) {
                    qj1Var.getClass();
                    arrayList.add(new LocalAlbum(albumEntry.b, albumEntry.f, epx.f(albumEntry.g, DomExceptionUtils.SEPARATOR) ? LocalAlbum.CatalogType.Root.b : new LocalAlbum.CatalogType.Folder(albumEntry.c)));
                }
                qj1Var.a.d(new PostingAction$MediaPicker$Album$LocalAlbumsChanged(arrayList));
                return s3q0.a;
            case 4:
                us1 us1Var = (us1) this.c;
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((zak0) us1Var.e).setValue(bool);
                return s3q0.a;
            case 5:
                com.vk.catalog2.common.ui.mvp.auto.a aVar2 = (com.vk.catalog2.common.ui.mvp.auto.a) this.c;
                bn40.d("Failed to load curator's popular tracks");
                aVar2.c(aVar2.a, "net_error");
                return s3q0.a;
            case 6:
                io.reactivex.rxjava3.core.a b = ((ua4) this.c).b();
                a.x xVar = io.reactivex.rxjava3.internal.functions.a.g;
                b.getClass();
                return new io.reactivex.rxjava3.internal.operators.completable.v(b, xVar).q(io.reactivex.rxjava3.schedulers.a.b());
            case 7:
                qe4 qe4Var = (qe4) this.c;
                g47 g47Var = (g47) obj;
                l370.o(g47Var, new ca(qe4Var, 7), f9t.z(qe4Var), new c2(i));
                l370.m(g47Var, f9t.w(qe4Var));
                g47Var.d(new le4.a(qe4Var));
                return s3q0.a;
            case 8:
                pv4 pv4Var = (pv4) this.c;
                qv4.b bVar = (qv4.b) obj;
                long j = bVar.e;
                boolean z4 = bVar.g;
                AppCompatImageView appCompatImageView = pv4Var.p;
                Context context = pv4Var.a;
                if (appCompatImageView == null) {
                    appCompatImageView = null;
                }
                appCompatImageView.setImageResource(z4 ? R.drawable.vk_icon_stop_24 : R.drawable.vk_icon_play_24);
                View view = pv4Var.o;
                if (view == null) {
                    view = null;
                }
                view.setContentDescription(context.getString(z4 ? R.string.vkim_accessibility_stop : R.string.vkim_accessibility_play));
                if (!z4) {
                    TextView textView = pv4Var.m;
                    if (textView == null) {
                        textView = null;
                    }
                    long j2 = 60;
                    textView.setText(String.format(Locale.ENGLISH, "%d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j / j2), Long.valueOf(j % j2)}, 2)));
                    TextView textView2 = pv4Var.m;
                    (textView2 != null ? textView2 : null).setContentDescription(new coo(context).c((int) j));
                }
                return s3q0.a;
            case 9:
                mp5 mp5Var = (mp5) this.c;
                mp5Var.e2(new aiq0.d.a(new pta.a.C3530a((ir5.b) obj)));
                mp5Var.e2(aiq0.l.a.b);
                mp5Var.l.set(false);
                return s3q0.a;
            case 10:
                ((ma7) this.c).T(new ta7.a.C3732a((Throwable) obj));
                return s3q0.a;
            case 11:
                ((zak0) ((gp7) this.c).h).setValue((tny) obj);
                return s3q0.a;
            case 12:
                BookingPreloaderFragment bookingPreloaderFragment = (BookingPreloaderFragment) this.c;
                is7 is7Var = (is7) obj;
                ((js7) bookingPreloaderFragment.R.getValue()).getClass();
                if (is7Var instanceof is7.a) {
                    wr7.a(bookingPreloaderFragment, ((is7.a) is7Var).a);
                } else {
                    if (!(is7Var instanceof is7.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    rwp.a(bookingPreloaderFragment.requireContext(), ((is7.b) is7Var).a, false);
                }
                return s3q0.a;
            case 13:
                androidx.appcompat.app.d dVar = (androidx.appcompat.app.d) this.c;
                if (dVar != null) {
                    dVar.dismiss();
                }
                return s3q0.a;
            case 14:
                fz8 fz8Var = (fz8) this.c;
                MusicTrack musicTrack = ((ib50) obj).a;
                fz8.a aVar3 = (fz8.a) fz8Var.d.get(musicTrack.Fb());
                if (aVar3 != null) {
                    t5a<MusicTrack> t5aVar = fz8Var.c;
                    String str = aVar3.a;
                    String str2 = aVar3.b;
                    List list2 = (List) t5aVar.a.get(str);
                    if (list2 != null) {
                        Iterator it = list2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                if (((t5a.a) next).a.equals(str2)) {
                                    obj2 = next;
                                }
                            }
                        }
                        t5a.a aVar4 = (t5a.a) obj2;
                        if (aVar4 != null && (indexOf = aVar4.b.indexOf(musicTrack)) > -1) {
                            ArrayList arrayList2 = new ArrayList(aVar4.b);
                            arrayList2.set(indexOf, musicTrack);
                            aVar4.b = arrayList2;
                        }
                    }
                }
                return s3q0.a;
            case 15:
                ((z19) this.c).T(new f29.f(((q29.c) obj).a));
                return s3q0.a;
            case 16:
                com.vk.catalog2.common.ui.mvp.auto.d dVar2 = (com.vk.catalog2.common.ui.mvp.auto.d) this.c;
                Pair pair = (Pair) obj;
                List<? extends UIBlock> list3 = (List) pair.d();
                CatalogSection catalogSection = (CatalogSection) pair.g();
                String str3 = catalogSection != null ? catalogSection.b : null;
                String str4 = catalogSection != null ? catalogSection.e : null;
                if (str3 != null && str3.length() != 0 && str4 != null && str4.length() != 0 && !com.vk.catalog2.common.ui.mvp.auto.d.b(list3)) {
                    return dVar2.c(new c22.c(str3, str4), list3);
                }
                if (list3.size() > 220) {
                    list3 = j5g.H0(list3, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE);
                }
                return io.reactivex.rxjava3.core.q.T(list3);
            case 17:
                ((mwa) this.c).d = (mwa.a) obj;
                return s3q0.a;
            case 18:
                qgi0.r((tgi0) obj, "ClipsCoauthorsSubscribeButton" + ((ClipCoauthorListVS.Owner.a.b) ((ClipCoauthorListVS.Owner) this.c).d).a);
                return s3q0.a;
            case 19:
                und undVar = (und) this.c;
                undVar.f = 0;
                undVar.i.r(true);
                return s3q0.a;
            case 20:
                com.vk.clips.editor.voiceover.impl.a aVar5 = (com.vk.clips.editor.voiceover.impl.a) this.c;
                Throwable th = (Throwable) obj;
                StringBuilder sb = new StringBuilder("error cancel state=");
                a1e a1eVar = aVar5.l;
                sb.append(a1eVar != null ? a1eVar : null);
                sb.append(' ');
                lyd.a.a("ClipsEditorVoiceoverDelegateImpl", new Exception(sb.toString(), th));
                return s3q0.a;
            case 21:
                ClipsGridFragment clipsGridFragment = (ClipsGridFragment) this.c;
                qcy<Object>[] qcyVarArr = ClipsGridFragment.H0;
                clipsGridFragment.s();
                return s3q0.a;
            case 22:
                ClipsInterestsFragment clipsInterestsFragment = (ClipsInterestsFragment) this.c;
                int i2 = ClipsInterestsFragment.Y;
                if (!(((ghe) obj) instanceof ghe.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                clipsInterestsFragment.fo(0);
                return s3q0.a;
            case 23:
                qie qieVar = (qie) this.c;
                List<SdkVideoFile> list4 = (List) obj;
                wmi0.a.m("clips_feed_items_cache", list4);
                qieVar.h.onNext(list4);
                return s3q0.a;
            case 24:
                qgi0.r((tgi0) obj, "priority_block_community_item_".concat(((MarketProductTileConfig) this.c).a));
                return s3q0.a;
            case 25:
                com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.d dVar3 = (com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.d) this.c;
                rzh rzhVar = (rzh) obj;
                if (rzhVar.m) {
                    ConnectYClientsData a = dVar3.j.a();
                    if (a != null) {
                        LocalDate now = LocalDate.now();
                        String b2 = a.b();
                        if (b2 != null && !drm0.N(b2)) {
                            localDate = LocalDate.parse(b2);
                        }
                        if (localDate != null && (plusDays = localDate.plusDays(30L)) != null && (now.compareTo((ChronoLocalDate) plusDays) < 0 || a.a() >= 3)) {
                            z2 = false;
                        }
                    }
                    z = z2;
                } else {
                    z = false;
                }
                return new e.h(rzhVar.a, rzhVar.b, rzhVar.c, rzhVar.e, rzhVar.d, rzhVar.g, rzhVar.f, rzhVar.h, rzhVar.i, rzhVar.j, rzhVar.k, rzhVar.l, z);
            case 26:
                ((l2f.a) this.c).a(Boolean.FALSE);
                return s3q0.a;
            case 27:
                final mm50 mm50Var = (mm50) this.c;
                g47 g47Var2 = (g47) obj;
                g47Var2.e(tci.l(mm50Var), nkj.b);
                l370.n(g47Var2, f9t.w(mm50Var), new wh6(20));
                g47Var2.d(new xy() { // from class: xsna.mjj
                    @Override // xsna.xy
                    public final void a(lj50 lj50Var) {
                        mm50.this.b((xij) lj50Var);
                    }
                });
                return s3q0.a;
            case 28:
                return new h9x((0 << 32) | (((Number) ((mtk0) this.c).getValue()).intValue() & 4294967295L));
            default:
                zik zikVar = (zik) this.c;
                gzs gzsVar = (gzs) obj;
                AnimatorSet animatorSet = zikVar.e;
                if (animatorSet != null && zikVar.f) {
                    gzsVar.invoke();
                    return s3q0.a;
                }
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                zikVar.f = true;
                zikVar.a(true);
                AnimatorSet animatorSet2 = new AnimatorSet();
                zikVar.e = animatorSet2;
                we2.a(animatorSet2, new yik(0, gzsVar));
                AnimatorSet animatorSet3 = zikVar.e;
                if (animatorSet3 != null) {
                    zikVar.c(animatorSet3);
                }
                return s3q0.a;
        }
    }
}
