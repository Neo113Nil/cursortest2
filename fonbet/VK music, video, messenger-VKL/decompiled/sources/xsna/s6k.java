package xsna;

import android.database.Cursor;
import android.os.Bundle;
import android.os.Trace;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedDzenBlockItemDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedGetDzenBlockResponseDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.catalog2.common.ui.holders.search.SearchResultsVh;
import com.vk.catalog2.common.ui.mvp.holder.friends.FriendsCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.header.FriendsSearchQueryVh;
import com.vk.catalog2.feature.search.holders.SearchSpellcheckVh;
import com.vk.clips.design.view.timeline.FragmentActionsView;
import com.vk.clips.playlists.ui.modal.EmptyPlaylistBottomSheet;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.DzenArticleBlockItem;
import com.vk.dto.common.Peer;
import com.vk.dto.newsfeed.entries.DzenArticlesBlock;
import com.vk.feed.core.models.NewsfeedResearch;
import com.vk.feed.core.models.cache.CachedNewsEntry;
import com.vk.games.presentation.fragments.GameUnavailableFragment;
import com.vk.newsfeed.api.data.discover.a;
import com.vk.onboardingscreens.impl.georequest.presentation.fragment.GeoRequestFragment;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchGroupsCatalogRootVh;
import com.vk.stat.scheme.SchemeStat$TypeRegistrationItem;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.toggle.anonymous.SakFeatures;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import xsna.cse;
import xsna.e3n;
import xsna.ei3;
import xsna.g0v;
import xsna.h8n;
import xsna.pdg0;
import xsna.t6k;
import xsna.tra0;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class s6k implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s6k(DzenArticlesBlock dzenArticlesBlock, hto htoVar) {
        this.b = 9;
        this.c = dzenArticlesBlock;
    }

    /* JADX WARN: Type inference failed for: r2v56, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Iterator it;
        String str;
        Object obj2;
        List<VKApiExecutionException> v;
        VKApiExecutionException vKApiExecutionException;
        int i = this.b;
        int i2 = 10;
        String str2 = null;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                LayoutInflater layoutInflater = ((t6k) obj3).j;
                ViewGroup viewGroup = (ViewGroup) obj;
                ImFeatures imFeatures = ImFeatures.IM_START_CHAT_REDESIGN;
                imFeatures.getClass();
                return com.vk.toggle.b.A.a(imFeatures) ? new o470(layoutInflater.inflate(R.layout.vkim_new_chat_no_users_info_vh, viewGroup, false)) : new t6k.f(layoutInflater.inflate(R.layout.vkim_new_chat_no_users_info_vh_old, viewGroup, false));
            case 1:
                t4m t4mVar = (t4m) obj3;
                if (((io.reactivex.rxjava3.core.p) obj).a != null) {
                    t4mVar.e.clear();
                    t4mVar.f = null;
                }
                return s3q0.a;
            case 2:
                ((iem) obj3).X0((chu) obj);
                return s3q0.a;
            case 3:
                efm efmVar = ((cfm) obj3).e;
                if (efmVar != null) {
                    efmVar.z();
                }
                return s3q0.a;
            case 4:
                return com.vk.im.engine.models.dialogs.b.a((com.vk.im.engine.models.dialogs.b) obj, null, null, (gkx0) obj3, 0, 0, 0, 0, 0, 0, false, null, null, null, null, null, false, null, false, null, null, null, false, null, null, null, null, 0, false, false, null, null, 0, null, 0, -17, 2097151);
            case 5:
                ei3.a aVar = (ei3.a) obj3;
                return pwm.a((pwm) obj, aVar.a, aVar.b, aVar.c, null, false, 0, null, null, false, 32711);
            case 6:
                List list = (List) obj;
                y2n y2nVar = ((q1n) obj3).a;
                int i3 = y2nVar.b;
                ArrayList arrayList = new ArrayList();
                int size = list.size();
                for (int i4 = 0; i4 < size && arrayList.size() < i3; i4++) {
                    CachedNewsEntry cachedNewsEntry = (CachedNewsEntry) list.get(i4);
                    if (!y2nVar.a || !cachedNewsEntry.b.Cb().f) {
                        arrayList.add(cachedNewsEntry.b);
                    }
                }
                return io.reactivex.rxjava3.core.q.T(new w960(arrayList, (!arrayList.isEmpty() || list.isEmpty()) ? a.C1366a.a : a.b.a));
            case 7:
                e4n e4nVar = (e4n) obj3;
                Throwable th = (Throwable) obj;
                if (!((t4n) e4nVar.b.getCurrentState()).b.b.a.isEmpty()) {
                    e4nVar.c(new e3n.a(new yo60.g.a(th)));
                }
                return s3q0.a;
            case 8:
                ((h8n.a) obj3).a();
                return s3q0.a;
            case 9:
                DzenArticlesBlock dzenArticlesBlock = (DzenArticlesBlock) obj3;
                List<NewsfeedDzenBlockItemDto> d = ((NewsfeedGetDzenBlockResponseDto) obj).d();
                ArrayList arrayList2 = new ArrayList(c5g.u(d, 10));
                Iterator it2 = d.iterator();
                while (it2.hasNext()) {
                    NewsfeedDzenBlockItemDto newsfeedDzenBlockItemDto = (NewsfeedDzenBlockItemDto) it2.next();
                    String e = newsfeedDzenBlockItemDto.e();
                    String title = newsfeedDzenBlockItemDto.getTitle();
                    String r = newsfeedDzenBlockItemDto.r();
                    List<BaseImageDto> f = newsfeedDzenBlockItemDto.f();
                    int size2 = f.size();
                    String str3 = str2;
                    String str4 = str3;
                    int i5 = 0;
                    while (true) {
                        if (i5 < size2) {
                            str = f.get(i5).getUrl();
                            it = it2;
                            if (!drm0.D(str, "scale_600", false)) {
                                if (drm0.D(str, "scale_1200", false)) {
                                    str3 = str;
                                } else if (drm0.D(str, "orig", false)) {
                                    str4 = str;
                                }
                                i5++;
                                it2 = it;
                            }
                        } else {
                            it = it2;
                            str = null;
                        }
                    }
                    String str5 = str == null ? str3 == null ? str4 : str3 : str;
                    BaseLinkButtonDto d2 = newsfeedDzenBlockItemDto.d();
                    String title2 = d2 != null ? d2.getTitle() : null;
                    EmptyList emptyList = EmptyList.b;
                    arrayList2.add(new DzenArticleBlockItem(e, title, r, str5, title2, new NewsfeedResearch(emptyList, emptyList)));
                    it2 = it;
                    str2 = null;
                }
                DzenArticlesBlock dzenArticlesBlock2 = new DzenArticlesBlock(dzenArticlesBlock.i, dzenArticlesBlock.j, new ArrayList(arrayList2), dzenArticlesBlock.l);
                dzenArticlesBlock2.c = dzenArticlesBlock.c;
                dzenArticlesBlock2.g = dzenArticlesBlock.g;
                dzenArticlesBlock2.h = dzenArticlesBlock.h;
                return dzenArticlesBlock2;
            case 10:
                kzo kzoVar = (kzo) obj3;
                String str6 = (String) obj;
                if (String.valueOf(kzoVar.g.getText()).length() == 0) {
                    kzoVar.g.setText(str6);
                }
                kzoVar.h.setText(str6.length() + " / 128");
                return s3q0.a;
            case 11:
                cwn cwnVar = (cwn) obj3;
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                cwnVar.d = false;
                cwnVar.c = booleanValue;
                ux40 ux40Var = cwnVar.e;
                if (ux40Var != null) {
                    ux40Var.invoke(bool);
                }
                return s3q0.a;
            case 12:
                ClipsPlaylist clipsPlaylist = ((cse.a.C2680a) obj).a;
                int i6 = clipsPlaylist.b;
                ClipsPlaylist clipsPlaylist2 = ((EmptyPlaylistBottomSheet) obj3).i.b;
                return Boolean.valueOf(i6 == clipsPlaylist2.b && epx.f(clipsPlaylist.f, clipsPlaylist2.f));
            case 13:
                List list2 = (List) obj;
                cpp cppVar = (cpp) ((com.vk.auth.enterphone.a) obj3).a;
                if (cppVar != null) {
                    cppVar.setChooseCountryEnable(list2.size() > 1);
                }
                return s3q0.a;
            case 14:
                ((bq60) obj3).a(new yo60.e.f((io.reactivex.rxjava3.disposables.c) obj));
                return s3q0.a;
            case 15:
                qyr qyrVar = (qyr) obj3;
                zsm zsmVar = (zsm) obj;
                io.reactivex.rxjava3.subjects.f<zsm> fVar = qyrVar.h;
                if (epx.f(zsmVar, npx.a)) {
                    fVar.onNext(zsmVar);
                } else if (zsmVar instanceof tpx) {
                    tpx tpxVar = (tpx) zsmVar;
                    gkx0 gkx0Var = tpxVar.a;
                    Pair<Integer, Integer> pair = lmm.a;
                    long j = gkx0Var.b;
                    long j2 = gkx0Var.b;
                    fVar.onNext(new tpx(tpxVar.b, lmm.b(0, (int) xo9.j(j2, lmm.c), (int) xo9.j(j2, lmm.d), xo9.j(j, lmm.b) != 0)));
                } else if (zsmVar instanceof n580) {
                    n580 n580Var = (n580) zsmVar;
                    pdg0 n = qyrVar.d.n(qyrVar, new fu90(qyrVar.c));
                    if (n instanceof pdg0.a) {
                        obj2 = EmptySet.b;
                    } else {
                        if (!(n instanceof pdg0.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        obj2 = ((pdg0.b) n).a;
                    }
                    Set set = (Set) obj2;
                    ArrayList arrayList3 = n580Var.a;
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj4 : arrayList3) {
                        if (set.contains(Long.valueOf(((Number) obj4).longValue()))) {
                            arrayList4.add(obj4);
                        }
                    }
                    if (!arrayList4.isEmpty()) {
                        fVar.onNext(new n580(arrayList4));
                    }
                } else if (zsmVar instanceof o580) {
                    fVar.onNext(zsmVar);
                } else {
                    if (!(zsmVar instanceof h980)) {
                        if (zsmVar instanceof o980) {
                            fVar.onNext(zsmVar);
                        }
                        return s3q0.a;
                    }
                    fVar.onNext(zsmVar);
                }
                qyrVar.e.b(new h20(zsmVar, 28));
                return s3q0.a;
            case 16:
                las lasVar = (las) obj;
                izs<las, s3q0> onActionListener = ((FragmentActionsView) obj3).getOnActionListener();
                if (onActionListener != null) {
                    onActionListener.invoke(lasVar);
                }
                return s3q0.a;
            case 17:
                FriendsCatalogRootVh friendsCatalogRootVh = (FriendsCatalogRootVh) obj3;
                FriendsSearchQueryVh friendsSearchQueryVh = friendsCatalogRootVh.C;
                l3a l3aVar = (l3a) obj;
                if (l3aVar instanceof SearchSpellcheckVh.a.C0525a) {
                    FriendsSearchQueryVh.b(friendsSearchQueryVh, ((SearchSpellcheckVh.a.C0525a) l3aVar).a);
                } else if (l3aVar instanceof SearchSpellcheckVh.a.b) {
                    SearchSpellcheckVh.a.b bVar = (SearchSpellcheckVh.a.b) l3aVar;
                    FriendsSearchQueryVh.b(friendsSearchQueryVh, bVar.a);
                    SearchResultsVh.cb(friendsCatalogRootVh.u, bVar.a, null, friendsCatalogRootVh.v, true, null, false, 50);
                }
                return s3q0.a;
            case 18:
                tra0.a.x((tra0.a) obj, (tra0) obj3, 0, 0);
                return s3q0.a;
            case 19:
                GameUnavailableFragment gameUnavailableFragment = (GameUnavailableFragment) obj3;
                RecyclerView recyclerView = (RecyclerView) obj;
                qcy<Object>[] qcyVarArr = GameUnavailableFragment.W;
                recyclerView.setHasFixedSize(true);
                gameUnavailableFragment.requireContext();
                recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
                recyclerView.setAdapter((hp5) gameUnavailableFragment.U.getValue());
                return s3q0.a;
            case 20:
                int i7 = GeoRequestFragment.O;
                GeoRequestFragment.eo(SchemeStat$TypeRegistrationItem.EventType.SCREEN_SKIP);
                ((GeoRequestFragment) obj3).Mf(-1, null);
                return s3q0.a;
            case 21:
                xxt xxtVar = (xxt) obj3;
                g0v g0vVar = ((iyu0) obj).f;
                if (epx.f(g0vVar, g0v.b.a)) {
                    FragmentActivity fragmentActivity = (FragmentActivity) xxtVar.c.invoke();
                    if (fragmentActivity != null) {
                        xxtVar.d(fragmentActivity);
                    }
                } else {
                    if (!(g0vVar instanceof g0v.a) && !(g0vVar instanceof g0v.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    xxtVar.h();
                }
                return s3q0.a;
            case 22:
                GlobalSearchGroupsCatalogRootVh globalSearchGroupsCatalogRootVh = (GlobalSearchGroupsCatalogRootVh) obj3;
                globalSearchGroupsCatalogRootVh.D.b(rsg0.y0(yfb.x(globalSearchGroupsCatalogRootVh.E.d(Collections.singletonList(((ap0) obj).a))), null, null, 3).subscribe(new mp0(new rl2(26), 25), new b2u(new x90(23), 0)));
                return s3q0.a;
            case 23:
                gru gruVar = (gru) obj3;
                Collection collection = (Collection) obj;
                if (collection.isEmpty()) {
                    return jgp.b;
                }
                Cursor d3 = gruVar.b.b().d(air.b(')', "SELECT * FROM groups_can_send_pending WHERE group_id IN(", p4g.k(collection, StringUtils.COMMA, null)), null);
                HashMap hashMap = new HashMap(d3.getCount());
                Trace.beginSection(ndp0.f("Cursor.forEach"));
                try {
                    try {
                        if (d3.moveToFirst()) {
                            while (!d3.isAfterLast()) {
                                Long valueOf = Long.valueOf(fl3.C(d3, "group_id"));
                                Serializer.c<Peer> cVar = Peer.CREATOR;
                                hashMap.put(valueOf, new yiu(Peer.a.a(fl3.C(d3, "group_id"), Peer.Type.GROUP), fl3.x(d3, "can_send_msg_to_me"), fl3.x(d3, "can_send_notify_to_me")));
                                d3.moveToNext();
                            }
                        }
                        return hashMap;
                    } finally {
                        d3.close();
                    }
                } finally {
                    Trace.endSection();
                }
            case 24:
                return Boolean.valueOf(((btx0) obj).getId().equals((Long) obj3));
            case 25:
                rhv rhvVar = (rhv) obj3;
                Throwable th2 = (Throwable) obj;
                if (th2 instanceof VKApiExecutionException) {
                    VKApiExecutionException vKApiExecutionException2 = (VKApiExecutionException) th2;
                    if (vKApiExecutionException2.J() || !((v = vKApiExecutionException2.v()) == null || (vKApiExecutionException = (VKApiExecutionException) j5g.a0(v)) == null || !vKApiExecutionException.J())) {
                        cvk.u(R.string.access_error, false);
                    } else if (vKApiExecutionException2.T() && SakFeatures.Type.NEW_GEOBLOCK_ERROR.h()) {
                        Bundle w = vKApiExecutionException2.w();
                        long j3 = w != null ? w.getLong("owner_id") : 0L;
                        if (j3 != 0) {
                            ProfileFragmentProviderComponent profileFragmentProviderComponent = rhvVar.a;
                            ProfileFragmentProviderComponent.Companion companion = ProfileFragmentProviderComponent.Companion;
                            profileFragmentProviderComponent.E7(j3).k(rhvVar.b.c);
                            s3q0 s3q0Var = s3q0.a;
                        }
                    }
                }
                return s3q0.a;
            case 26:
                ((r2y) obj3).a.z(JsApiMethodType.CALL_START, (Throwable) obj);
                return s3q0.a;
            case 27:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                ((com.vk.newsfeed.common.recycler.holders.b) obj3).z = false;
                return s3q0.a;
            case 28:
                eqz eqzVar = (eqz) obj3;
                odq.d(new com.vk.movika.sdk.base.ui.l(i2, eqzVar.b, eqzVar.c), eqzVar.d);
                return s3q0.a;
            default:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                int i8 = jyz.r1;
                TextView Kn = ((jyz) obj3).Kn();
                if (Kn != null) {
                    Kn.setEnabled(booleanValue2);
                    Kn.setAlpha(booleanValue2 ? 1.0f : 0.64f);
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ s6k(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
