package xsna;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.widget.EditText;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetPlaylistsResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.auth.main.SignUpRouter;
import com.vk.auth.screendata.LibverifyScreenData;
import com.vk.auth.screendata.VerificationScreenData;
import com.vk.auth.utils.VkPhoneFormatUtils;
import com.vk.bridges.di.BridgeComponent;
import com.vk.clips.upload.ui.impl.compose.state.viewstate.TrendingHashtagUiDto;
import com.vk.core.apps.BuildInfo;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.preference.Preference;
import com.vk.core.view.components.picture.VkPicture;
import com.vk.core.view.components.picture.c;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.dto.stories.model.GetStoriesResponse;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.e;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.games.model.GamesCatalogScreenTab;
import com.vk.imageloader.view.VKImageView;
import com.vk.metrics.performance.scroll.ScrollScreenType;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.newsfeed.posting.impl.domain.model.e;
import com.vk.photo.editor.features.collage.model.stat.CollageStatEvent;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.stat.scheme.CommonCommunitiesStat$ClickEvent;
import com.vk.superapp.api.dto.auth.VkAuthValidatePhoneResult;
import com.vkontakte.android.R;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.attachments.PollAttachment;
import io.opentelemetry.api.trace.StatusCode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;
import kotlin.Pair;
import okhttp3.Interceptor;
import okhttp3.Protocol;
import okhttp3.p;
import xsna.b4;
import xsna.cve;
import xsna.dx90;
import xsna.edt;
import xsna.eqe;
import xsna.nue;
import xsna.rre;
import xsna.rtb0;
import xsna.sum0;
import xsna.sz80;
import xsna.tsb0;
import xsna.ure;
import xsna.vre;
import xsna.vyh;
import xsna.wih;
import xsna.wk50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class hn0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hn0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        String string;
        gzs<s3q0> gzsVar;
        Object obj2;
        int i = 5;
        int i2 = 10;
        str = "";
        int i3 = 2;
        Object obj3 = null;
        String str2 = null;
        switch (this.b) {
            case 0:
                EditText editText = (EditText) this.c;
                ln0 ln0Var = (ln0) this.d;
                Pattern pattern = ln0.h1;
                String obj4 = drm0.p0(editText.getText().toString()).toString();
                Bundle arguments = ln0Var.getArguments();
                if (arguments != null && (string = arguments.getString("room_link")) != null) {
                    str = string;
                }
                pn0 pn0Var = ln0Var.f1;
                kn0 kn0Var = new kn0(ln0Var, 0);
                r8 r8Var = new r8(ln0Var, 1);
                dz2 x = yfb.x(((vg20) pn0Var.a).t(obj4, str));
                ahn.D(x);
                ((io.reactivex.rxjava3.disposables.b) pn0Var.b).b(io.reactivex.rxjava3.kotlin.c.d(rsg0.Z(x).o(asu0.a.d()), new ac(kn0Var, i3), new e5(r8Var, i3)));
                return s3q0.a;
            case 1:
                b4.c.h hVar = (b4.c.h) this.c;
                q75 q75Var = (q75) this.d;
                if (hVar == null || (gzsVar = hVar.b) == null) {
                    jyr0.a(R.drawable.vk_icon_check_circle_outline_28, R.string.video_subscribed_message, q75Var.a);
                } else {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 2:
                p66 p66Var = (p66) this.c;
                String str3 = (String) this.d;
                VkAuthValidatePhoneResult vkAuthValidatePhoneResult = (VkAuthValidatePhoneResult) obj;
                sir0 sir0Var = sir0.a;
                Context context = p66Var.b;
                LibverifyScreenData b = sir0.b(sir0Var, context, str3, vkAuthValidatePhoneResult);
                if (b != null) {
                    SignUpRouter signUpRouter = p66Var.n;
                    sir0.f(sir0Var, signUpRouter != null ? signUpRouter : null, b, null, null, 12);
                } else {
                    VerificationScreenData.Phone phone = new VerificationScreenData.Phone(str3, VkPhoneFormatUtils.a(context, str3, null, null, 28), vkAuthValidatePhoneResult.b, false, vkAuthValidatePhoneResult, false, false, false, null, null, null, null, 4072, null);
                    SignUpRouter signUpRouter2 = p66Var.n;
                    sir0.f(sir0Var, signUpRouter2 != null ? signUpRouter2 : null, null, phone, null, 10);
                }
                return s3q0.a;
            case 3:
                e28 e28Var = (e28) this.c;
                c5p c5pVar = (c5p) this.d;
                e28Var.i.setSelected(true);
                e28Var.j.setSelected(false);
                e28Var.k.setSelected(false);
                e28Var.b.setVisibility(0);
                e28Var.c.setVisibility(8);
                e28Var.d.setVisibility(8);
                c5pVar.b(CollageStatEvent.h.a);
                return s3q0.a;
            case 4:
                k20 k20Var = (k20) this.c;
                pcd pcdVar = (pcd) this.d;
                VkPicture vkPicture = (VkPicture) obj;
                ImageSize Ab = k20Var.d.Ab(vkPicture.getWidth(), true);
                if (Ab == null && (Ab = (ImageSize) j5g.a0(k20Var.d.b)) == null) {
                    return s3q0.a;
                }
                String str4 = Ab.d.d;
                int width = vkPicture.getWidth();
                if (!drm0.E(str4, '?')) {
                    str = "?";
                } else if (!drm0.G(str4, '?') && !drm0.G(str4, '&')) {
                    str = "&";
                }
                pcdVar.m.setContent(new c.d(str4 + str + "cs=" + width + "x0", new eko(krv0.f(R.drawable.vk_icon_video_outline_28, R.attr.vk_ui_icon_tertiary, pcdVar.itemView.getContext()))));
                return s3q0.a;
            case 5:
                wow wowVar = (wow) this.c;
                izs izsVar = (izs) this.d;
                String str5 = (String) obj;
                Iterator it = wowVar.b.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (((TrendingHashtagUiDto) next).b.equals(str5)) {
                            obj3 = next;
                        }
                    }
                }
                TrendingHashtagUiDto trendingHashtagUiDto = (TrendingHashtagUiDto) obj3;
                if (trendingHashtagUiDto != null) {
                    izsVar.invoke(trendingHashtagUiDto);
                }
                return s3q0.a;
            case 6:
                nre nreVar = (nre) this.c;
                vre.b bVar = (vre.b) this.d;
                if (((BaseOkResponseDto) obj) == BaseOkResponseDto.OK) {
                    nreVar.T(new rre.i(false));
                    hqe hqeVar = nreVar.o;
                    if (hqeVar != null) {
                        List<VideoFile> list = bVar.f;
                        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                        Iterator<T> it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(nreVar.j.c((VideoFile) it2.next()));
                        }
                        hqeVar.b(new eqe.a(bVar.g, bVar.m, arrayList));
                    }
                } else {
                    nreVar.n.b(ure.b.a);
                }
                return s3q0.a;
            case 7:
                ((uue) this.c).T(new cve.d((ShortVideoGetPlaylistsResponseDto) obj, true, ((nue.a) this.d).b, true));
                return s3q0.a;
            case 8:
                d4h d4hVar = (d4h) this.c;
                yrg yrgVar = (yrg) this.d;
                String str6 = (String) obj;
                d3h d3hVar = (d3h) d4hVar.c.invoke();
                UserId userId = yrgVar.d;
                FragmentImpl fragmentImpl = d3hVar.a;
                Context mo2getContext = fragmentImpl.mo2getContext();
                if (mo2getContext != null) {
                    Set<String> set = p0e0.a;
                    g2h g2hVar = new g2h(userId);
                    g2hVar.b = "artist";
                    g2hVar.a();
                    wk40.d(((BridgeComponent) m7m.d(fragmentImpl).a(fpf0.a(BridgeComponent.class))).Le().g(), mo2getContext, str6, MusicPlaybackLaunchContext.l.t(), null, null, 56);
                    zah.b(d3hVar.j, userId, CommonCommunitiesStat$ClickEvent.ClickEventType.OPEN_MUSICIAN_CARD, CommonCommunitiesStat$ClickEvent.Source.BLOCK_HEADER_COMMUNITY, null, 24);
                }
                return s3q0.a;
            case 9:
                wk50.a aVar = (wk50.a) this.c;
                com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.a aVar2 = (com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.a) this.d;
                Pair pair = (Pair) obj;
                e.t tVar = (e.t) pair.d();
                Integer num = (Integer) pair.g();
                aVar.b(tVar);
                if (num != null) {
                    aVar2.b.b(new vyh.c(Integer.valueOf(num.intValue()), true, false));
                }
                return s3q0.a;
            case 10:
                wih.a aVar3 = (wih.a) this.c;
                CommunityProfileContentItem communityProfileContentItem = (CommunityProfileContentItem) this.d;
                ((Boolean) obj).getClass();
                aVar3.r.detach();
                aVar3.q.g(communityProfileContentItem);
                return s3q0.a;
            case 11:
                ((m6r) this.c).a.a(new e.a.C1421a((Set) this.d));
                return s3q0.a;
            case 12:
                kzr kzrVar = (kzr) this.c;
                CharSequence charSequence = (CharSequence) this.d;
                if (epx.f(kzrVar.e, charSequence)) {
                    kzrVar.a(charSequence);
                }
                return s3q0.a;
            case 13:
                f6s f6sVar = (f6s) this.c;
                q6s q6sVar = (q6s) this.d;
                tgi0 tgi0Var = (tgi0) obj;
                long layoutPosition = f6sVar.getLayoutPosition();
                BuildInfo.Client client = BuildInfo.a;
                VKApplication vKApplication = com.vk.core.apps.a.a;
                qgi0.r(tgi0Var, BuildInfo.h() ? defpackage.k0.a(layoutPosition, "feed_footer_root_") : "");
                int i4 = q6sVar.I;
                sgi0<Integer> sgi0Var = muu0.b;
                qcy<Object> qcyVar = muu0.a[0];
                Integer valueOf = Integer.valueOf(i4);
                sgi0Var.getClass();
                tgi0Var.a(sgi0Var, valueOf);
                return s3q0.a;
            case 14:
                qus qusVar = (qus) this.c;
                ScrollScreenType scrollScreenType = (ScrollScreenType) this.d;
                Pair pair2 = (Pair) obj;
                long longValue = ((Number) pair2.d()).longValue();
                long longValue2 = ((Number) pair2.g()).longValue();
                ((dx90) qusVar.b).getClass();
                Pair h = dx90.h(scrollScreenType);
                if (h == null) {
                    h = qus.c;
                }
                long longValue3 = ((Number) h.d()).longValue();
                long longValue4 = ((Number) h.g()).longValue();
                ((dx90) qusVar.b).getClass();
                Preference.F(longValue3 + longValue2, "performance", dx90.b.d(scrollScreenType));
                Preference.F(longValue4 + longValue, "performance", dx90.b.c(scrollScreenType));
                return s3q0.a;
            case 15:
                ((xbt) this.c).T(new edt.f.c((GamesCatalogScreenTab) this.d));
                return s3q0.a;
            case 16:
                Context context2 = (Context) this.c;
                Intent intent = (Intent) this.d;
                xgx0.a.getClass();
                xgx0.d((Throwable) obj);
                context2.startActivity(intent);
                return s3q0.a;
            case 17:
                pfy pfyVar = (pfy) this.c;
                sfy sfyVar = (sfy) this.d;
                y4l0 y4l0Var = pfyVar.l;
                if (y4l0Var != null) {
                    y4l0Var.k(sfyVar.d);
                }
                return s3q0.a;
            case 18:
                ((fb50) this.c).b.g((hyg0) obj, (ArrayList) this.d);
                return s3q0.a;
            case 19:
                ((rr50) this.c).E.a(((Integer) obj).intValue(), (NewsEntry) this.d);
                return s3q0.a;
            case 20:
                okhttp3.p pVar = (okhttp3.p) this.c;
                Interceptor.a aVar4 = (Interceptor.a) this.d;
                ohk0 ohk0Var = (ohk0) obj;
                if (ohk0Var == null) {
                    return aVar4.a(pVar);
                }
                p.a b2 = pVar.b();
                w7x0 w7x0Var = w7x0.f;
                wmj current = wmj.current();
                j8 j8Var = sz80.b;
                w7x0Var.getClass();
                w7x0.a(current, b2, j8Var);
                okhttp3.u a = aVar4.a(b2.b());
                ohk0Var.m(a.e, "http.response.status_code");
                Protocol protocol = a.c;
                int[] iArr = sz80.a.$EnumSwitchMapping$0;
                int i5 = iArr[protocol.ordinal()];
                String str7 = (i5 == 1 || i5 == 2 || i5 == 3 || i5 == 4) ? "http" : i5 != 5 ? null : "quic";
                if (str7 != null) {
                    ohk0Var.setAttribute("network.protocol.name", str7);
                }
                int i6 = iArr[protocol.ordinal()];
                if (i6 == 1) {
                    str2 = "1.0";
                } else if (i6 == 2) {
                    str2 = "1.1";
                } else if (i6 == 3 || i6 == 4) {
                    str2 = "2";
                } else if (i6 == 5) {
                    str2 = "3";
                }
                if (str2 != null) {
                    ohk0Var.setAttribute("network.protocol.version", str2);
                }
                if (a.t()) {
                    return a;
                }
                ohk0Var.l(StatusCode.ERROR);
                return a;
            case 21:
                f9a0 f9a0Var = (f9a0) this.c;
                Photo photo = (Photo) this.d;
                f9a0Var.o.b(f9a0Var.q, photo, new er0(f9a0Var, photo, (VKImageView) obj, i3));
                return s3q0.a;
            case 22:
                PollAttachment pollAttachment = (PollAttachment) this.c;
                lsb0 lsb0Var = (lsb0) this.d;
                rtb0.a aVar5 = (rtb0.a) obj;
                ysg0.b.a(new zrb0(aVar5.a));
                pollAttachment.f = aVar5.a;
                lsb0Var.U(new tsb0.a(pollAttachment));
                return s3q0.a;
            case 23:
                ((cme0) this.c).e(e43.a((rne0) this.d), false);
                return s3q0.a;
            case 24:
                wvf wvfVar = (wvf) this.c;
                cgw cgwVar = (cgw) this.d;
                uvf uvfVar = (uvf) obj;
                uvf uvfVar2 = (uvf) ((zak0) wvfVar.b).getValue();
                if (!epx.f(uvfVar2, uvfVar)) {
                    ((zak0) wvfVar.b).setValue(uvfVar);
                    ((zak0) cgwVar.b).setValue(uvfVar != null ? new aa2((Bitmap) uvfVar.r()) : null);
                    if (uvfVar2 != null) {
                        uvfVar2.close();
                    }
                }
                return s3q0.a;
            case 25:
                azl azlVar = (azl) this.c;
                wh50 wh50Var = (wh50) this.d;
                cnf cnfVar = new cnf(2, (gzs) obj);
                lfa lfaVar = new lfa(19, azlVar, wh50Var);
                sgi0<gzs<ov70>> sgi0Var2 = oc00.a;
                return new mc00(cnfVar, lfaVar, Build.VERSION.SDK_INT == 28 ? vta0.a : wta0.a);
            case 26:
                ((zbl0) this.c).b.h((hyg0) obj, (acl0) this.d);
                return s3q0.a;
            case 27:
                p9m0 p9m0Var = (p9m0) this.c;
                izs izsVar2 = (izs) this.d;
                List<UsersUserFullDto> list2 = (List) obj;
                j2r0 j2r0Var = p9m0Var.i;
                ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
                for (UsersUserFullDto usersUserFullDto : list2) {
                    j2r0Var.getClass();
                    arrayList2.add(j2r0.a(usersUserFullDto));
                }
                ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    String str8 = ((UserProfile) it3.next()).g;
                    if (str8 == null || (obj2 = js5.a(y8g0.a(R.dimen.story_photos_height), str8)) == null) {
                        obj2 = o9m0.b;
                    }
                    itj0.d((String) obj2, arrayList3);
                }
                izsVar2.invoke(arrayList3);
                return s3q0.a;
            case 28:
                hnm0 hnm0Var = (hnm0) this.c;
                StoriesContainer storiesContainer = (StoriesContainer) this.d;
                hnm0Var.d = (GetStoriesResponse) obj;
                StoriesContainer h2 = hnm0Var.h(storiesContainer.f);
                CopyOnWriteArrayList<StoryEntry> copyOnWriteArrayList = h2 != null ? h2.g : null;
                if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
                    return io.reactivex.rxjava3.core.x.k(storiesContainer);
                }
                nnm0 nnm0Var = hnm0Var.b;
                String str9 = storiesContainer.f;
                return rsg0.w0(yfb.x(zul0.h(nnm0Var.a, null, null, null, null, isl0.b, zeq0.a(), Collections.singletonList(str9 != null ? str9 : ""), hnm0Var.c.b(), true, 29199))).l(new qu50(new hv7(1, (rsl0) nnm0Var.d.getValue(), rsl0.class, "map", "map(Lcom/vk/api/generated/stories/dto/StoriesGetV5113ResponseDto;)Lcom/vk/dto/stories/model/GetStoriesResponse;", 0, 8), 12)).l(new wx40(new isb0(i, hnm0Var, storiesContainer), i2));
            default:
                izs izsVar3 = (izs) this.c;
                sum0.d dVar = (sum0.d) this.d;
                ((Boolean) obj).getClass();
                izsVar3.invoke(sum0.d.a(dVar, null, null, null, false, null, !dVar.f, null, false, 0, null, false, false, 4063));
                return s3q0.a;
        }
    }

    public /* synthetic */ hn0(okhttp3.p pVar, Interceptor.a aVar, sz80 sz80Var) {
        this.b = 20;
        this.c = pVar;
        this.d = aVar;
    }
}
