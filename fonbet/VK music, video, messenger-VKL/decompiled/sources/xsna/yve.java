package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.base.Document;
import com.vk.api.generated.shortVideo.dto.ShortVideoFeedItemShortVideoFullDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetResponseDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.catalog2.common.dto.ui.UIBlockSearchSuggestion;
import com.vk.clips.editor.templates.api.model.TemplatesFlowScreen;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.SearchSuggestion;
import com.vk.ecomm.reviews.impl.communities.replies.CommunityRepliesFragment;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.notifications.settings.CommunityNotificationSettingsFragment;
import com.vk.photos.ui.editalbum.domain.e;
import com.vk.profile.community.creationonboarding.impl.finish.presentation.feature.CommunityCreationOnboardingFinishState;
import com.vk.profile.community.impl.ui.profile.f;
import com.vk.profile.core.content.ContentTab;
import com.vk.search.fragment.DiscoverSearchFragment;
import com.vk.search.integration.api.SearchTab;
import com.vk.search.params.api.City;
import com.vk.stat.scheme.SchemeStat$TypeClickItem;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import xsna.aqf;
import xsna.bex0;
import xsna.f0p;
import xsna.i6w;
import xsna.iax;
import xsna.qr60;
import xsna.r1q0;
import xsna.t5r;
import xsna.txp;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class yve implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yve(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Integer num = null;
        boolean z = false;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ClipsRouter.c(g620.f().a(), (FragmentActivity) obj2, Collections.singletonList(new ClipFeedTab.Playlist.FromBeginning((ClipsPlaylist) obj)), null, null, fpf0.a(ClipFeedTab.Playlist.FromBeginning.class), null, null, true, null, 1900);
                return s3q0.a;
            case 1:
                return Boolean.valueOf(((TemplatesFlowScreen) obj) == ((TemplatesFlowScreen) obj2));
            case 2:
                ((qlf) obj2).getClass();
                ShortVideoFeedItemShortVideoFullDto shortVideoFeedItemShortVideoFullDto = (ShortVideoFeedItemShortVideoFullDto) j5g.b0(0, ((ShortVideoGetResponseDto) obj).f().d());
                if (shortVideoFeedItemShortVideoFullDto == null) {
                    z = true;
                } else {
                    Boolean V0 = shortVideoFeedItemShortVideoFullDto.d().V0();
                    if (V0 != null) {
                        z = V0.booleanValue();
                    }
                }
                return Boolean.valueOf(!z);
            case 3:
                iqf iqfVar = (iqf) obj2;
                iqfVar.g.s(iqfVar.f, new aqf.b((List) obj));
                return s3q0.a;
            case 4:
                return CommunityCreationOnboardingFinishState.a((CommunityCreationOnboardingFinishState) ((com.vk.profile.community.creationonboarding.impl.finish.presentation.feature.b) obj2).b.getCurrentState(), CommunityCreationOnboardingFinishState.SubscribeStatus.SUBSCRIBED);
            case 5:
                CommunityNotificationSettingsFragment communityNotificationSettingsFragment = (CommunityNotificationSettingsFragment) obj2;
                Throwable th = (Throwable) obj;
                if (th instanceof VKApiExecutionException) {
                    int i2 = CommunityNotificationSettingsFragment.b0;
                    if (((VKApiExecutionException) th).J()) {
                        com.vk.notifications.settings.c cVar = communityNotificationSettingsFragment.V;
                        if (cVar == null) {
                            cVar = null;
                        }
                        cVar.fj(null, null);
                        cvk.u(R.string.access_error, false);
                    }
                }
                com.vk.notifications.settings.c cVar2 = communityNotificationSettingsFragment.V;
                if (cVar2 == null) {
                    cVar2 = null;
                }
                cVar2.fj(null, null);
                return s3q0.a;
            case 6:
                mfh mfhVar = (mfh) obj2;
                yj40 yj40Var = (yj40) obj;
                if ((yj40Var instanceof fa50) || (yj40Var instanceof yd50)) {
                    z = epx.f(((mb50) yj40Var).a.c, mfhVar.a);
                } else if (yj40Var instanceof a9b0) {
                    z = epx.f(((a9b0) yj40Var).a.c, mfhVar.a);
                }
                return Boolean.valueOf(z);
            case 7:
                rhh rhhVar = (rhh) obj2;
                Document document = (Document) obj;
                sun sunVar = (sun) rhhVar.t;
                if (sunVar != null) {
                    zih.a(rhhVar.E, sunVar, new ztn(document, sunVar), null, 12);
                }
                return s3q0.a;
            case 8:
                com.vk.profile.community.impl.ui.profile.f fVar = (com.vk.profile.community.impl.ui.profile.f) obj2;
                boolean z2 = fVar.i;
                euh euhVar = fVar.v;
                RecyclerView recyclerView = fVar.l;
                FrameLayout frameLayout = fVar.m;
                iax.a aVar = (iax.a) obj;
                if (aVar instanceof iax.a.C3043a) {
                    if (((iax.a.C3043a) aVar).a.length() == 0) {
                        bwt0.p0(frameLayout, false);
                        bwt0.p0(recyclerView, true);
                    } else if (fVar.E) {
                        bwt0.p0(recyclerView, false);
                        bwt0.p0(frameLayout, true);
                    } else {
                        euhVar.a(true);
                    }
                } else if (epx.f(aVar, iax.a.c.a)) {
                    bwt0.p0(frameLayout, false);
                    bwt0.p0(recyclerView, true);
                    euhVar.a(false);
                    iax iaxVar = fVar.c;
                    ContentTab contentTab = (ContentTab) fVar.g.invoke();
                    iaxVar.g(contentTab instanceof ContentTab.Video ? SearchTab.VIDEOS : contentTab instanceof ContentTab.Wall ? SearchTab.WALL : SearchTab.WALL);
                } else if (epx.f(aVar, iax.a.b.a)) {
                    fVar.d();
                    euhVar.k();
                    if (z2) {
                        bwt0.p0(recyclerView, false);
                        bwt0.p0(frameLayout, true);
                    }
                    r1q0.a.a(SchemeStat$TypeClickItem.Subtype.SEARCH_ICON);
                } else if (epx.f(aVar, iax.a.d.a)) {
                    if (euhVar.m()) {
                        euhVar.e();
                    }
                    euhVar.a(false);
                    bwt0.p0(frameLayout, false);
                    bwt0.p0(recyclerView, true);
                    fVar.E = false;
                } else if (epx.f(aVar, iax.a.e.a)) {
                    euhVar.a(false);
                    fVar.E = true;
                    bwt0.p0(recyclerView, false);
                    bwt0.p0(frameLayout, true);
                } else {
                    if (!(aVar instanceof iax.a.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    SearchTab searchTab = ((iax.a.f) aVar).a;
                    if (z2) {
                        int i3 = f.c.$EnumSwitchMapping$1[searchTab.ordinal()];
                        if (i3 == 1) {
                            num = Integer.valueOf(R.string.community_search_video);
                        } else if (i3 == 2) {
                            num = Integer.valueOf(R.string.community_search_posts);
                        }
                        if (num != null) {
                            euhVar.g(num.intValue());
                        }
                    }
                }
                return s3q0.a;
            case 9:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                e2g0 e2g0Var = ((CommunityRepliesFragment) obj2).Z;
                if (e2g0Var != null) {
                    e2g0Var.t(booleanValue);
                }
                return s3q0.a;
            case 10:
                akl aklVar = (akl) obj2;
                vqt vqtVar = (vqt) obj;
                aklVar.i.l(vqtVar.b);
                com.vk.lists.c cVar3 = aklVar.i;
                String j = cVar3.j();
                if (j == null || j.length() == 0 || vqtVar.a.isEmpty()) {
                    cVar3.r(false);
                }
                return s3q0.a;
            case 11:
                gxl gxlVar = (gxl) obj2;
                List list = (List) obj;
                dw20 dw20Var = gxlVar.e;
                (dw20Var != null ? dw20Var : null).dismiss();
                gxlVar.c.invoke(list);
                return s3q0.a;
            case 12:
                n0s n0sVar = (n0s) ((pdm) obj2).j.getValue();
                n0sVar.b.b().h(new ut6(15, Collections.singletonList((spm) obj), n0sVar));
                return s3q0.a;
            case 13:
                com.vk.im.engine.models.dialogs.b bVar = (com.vk.im.engine.models.dialogs.b) obj;
                vjm vjmVar = bVar.d;
                String valueOf = String.valueOf(vjmVar.a());
                long j2 = bVar.b;
                String[] strArr = {valueOf, String.valueOf(j2)};
                tgl0 tgl0Var = ((hpm) obj2).b;
                tgl0Var.b().execSQL("UPDATE dialogs SET sort_id_server = ? WHERE id = ?", strArr);
                tgl0Var.b().execSQL("UPDATE dialog_weight SET x_sort_id_server = ? WHERE x_dialog_id = ? AND x_folder_id = ?", new Object[]{Long.valueOf(vjmVar.a()), Long.valueOf(j2), -1});
                return s3q0.a;
            case 14:
                View view = (View) obj;
                ltm ltmVar = ((vtm) obj2).k;
                if (ltmVar.isEnabled() && view.getVisibility() != 0) {
                    ltmVar.c();
                }
                return s3q0.a;
            case 15:
                ((zvm) obj2).X0();
                return s3q0.a;
            case 16:
                DiscoverSearchFragment discoverSearchFragment = (DiscoverSearchFragment) obj2;
                int i4 = DiscoverSearchFragment.s0;
                discoverSearchFragment.fo(discoverSearchFragment.io().b((City) obj).subscribe(new t00(new t3h(discoverSearchFragment, 10), 26)));
                return s3q0.a;
            case 17:
                f4m.E((ViewGroup) ((com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.f) obj2).l.getValue(), ((Boolean) obj).booleanValue());
                return s3q0.a;
            case 18:
                ((com.vk.photos.ui.editalbum.domain.c) obj2).T(new e.j.a((String) obj));
                return s3q0.a;
            case 19:
                MusicTrack musicTrack = (MusicTrack) obj;
                f0p.a aVar2 = ((r0p) obj2).f;
                if (aVar2 != null) {
                    aVar2.Ig(R.id.audio_image, musicTrack);
                }
                return s3q0.a;
            case 20:
                ProfilesInfo profilesInfo = (ProfilesInfo) obj;
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayList) obj2).iterator();
                while (it.hasNext()) {
                    qtd0 Bb = profilesInfo.Bb((Peer) it.next());
                    if (Bb != null) {
                        arrayList.add(Bb);
                    }
                }
                return arrayList;
            case 21:
                ukq ukqVar = (ukq) obj2;
                txp txpVar = (txp) obj;
                if (txpVar instanceof txp.a) {
                    ukqVar.t.invoke();
                } else {
                    if (!(txpVar instanceof txp.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    wzs<Boolean, UserId, s3q0> wzsVar = ukqVar.u;
                    txp.b bVar2 = (txp.b) txpVar;
                    bVar2.getClass();
                    wzsVar.invoke(Boolean.FALSE, bVar2.a);
                }
                return s3q0.a;
            case 22:
                return ((gpq) obj2).b.e(new hpq((qr60.a) obj));
            case 23:
                s5r s5rVar = ((v5r) obj2).f;
                if (s5rVar != null) {
                    s5rVar.b.onNext(t5r.a.a);
                }
                return s3q0.a;
            case 24:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.r(tgi0Var, "FoldersToolbarButtonBack");
                RecyclerView recyclerView2 = ((com.vk.folders.impl.configure.h) obj2).j;
                qgi0.h(tgi0Var, (recyclerView2 != null ? recyclerView2 : null).getContext().getString(R.string.vkim_accessibility_toolbar_back_exit));
                return s3q0.a;
            case 25:
                SearchSuggestion searchSuggestion = ((UIBlockSearchSuggestion) obj2).y;
                return ((pyh0) obj).b(searchSuggestion.k, searchSuggestion.b);
            case 26:
                fyu fyuVar = (fyu) obj2;
                List<String> list2 = (List) obj;
                AtomicBoolean atomicBoolean = fyuVar.c;
                io.reactivex.rxjava3.subjects.d<List<String>> dVar = fyuVar.e;
                atomicBoolean.set(false);
                if (list2.isEmpty()) {
                    List<String> list3 = ((haf) fyuVar.a.b).b;
                    if (list3 == null) {
                        list3 = EmptyList.b;
                    }
                    dVar.onNext(list3);
                } else {
                    fyuVar.d.set(true);
                    dVar.onNext(list2);
                }
                return s3q0.a;
            case 27:
                tgi0 tgi0Var2 = (tgi0) obj;
                qgi0.h(tgi0Var2, ((Context) obj2).getString(R.string.feed_accessibility_search));
                qgi0.r(tgi0Var2, "home_fragment_top_bar_tag_search_button");
                return s3q0.a;
            case 28:
                ((p7w) obj2).d.invoke(new i6w.f(((Boolean) obj).booleanValue()));
                return s3q0.a;
            default:
                p7y p7yVar = (p7y) obj2;
                JSONObject jSONObject = new JSONObject();
                Object c = p7yVar.c();
                if (c == null) {
                    c = JSONObject.NULL;
                }
                jSONObject.put("token", c);
                bex0.a.b(p7yVar.a, JsApiMethodType.SECURE_TOKEN_GET, jSONObject, null, 12);
                return s3q0.a;
        }
    }
}
