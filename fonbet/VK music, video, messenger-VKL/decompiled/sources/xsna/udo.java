package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Size;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.vk.ads.easypromote.api.domain.model.EasyPromoteSettings;
import com.vk.ads.easypromote.impl.domain.model.FaqSource;
import com.vk.ads.easypromote.impl.presentation.EasyPromoteSettingsFragment;
import com.vk.ads.easypromote.impl.presentation.a;
import com.vk.ads.easypromote.impl.presentation.b;
import com.vk.api.generated.audio.dto.AudioArtistDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.friends.dto.FriendsGetFieldsResponseDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.catalog.mvi.section.domain.CatalogFilterOptionDo;
import com.vk.draftslist.impl.ui.DraftsListFragment;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Artist;
import com.vk.ecomm.market.album.MarketAlbumImagePickerView;
import com.vk.ecomm.market.good.GoodFragment;
import com.vk.ecomm.reviews.impl.allreviews.presentation.e;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.design.view.placeholder.ImPlaceholder;
import com.vk.im.design.view.placeholder.a;
import com.vk.im.ui.fragments.ImCreateChatFastFragment;
import com.vk.im.ui.fragments.ImSelectContactsFragment;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.im.ui.utils.EduMaxTransitionTracker;
import com.vk.log.L;
import com.vk.media.ok.b;
import com.vk.narratives.impl.highlights.HighlightEditFragment;
import com.vk.newsfeed.api.data.NewsfeedGetResponse;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.upload.impl.UploadNotification;
import com.vkontakte.android.R;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import xsna.c910;
import xsna.cp20;
import xsna.dug0;
import xsna.f3t;
import xsna.ikv0;
import xsna.orx;
import xsna.p4p;
import xsna.tj50;
import xsna.tlo0;
import xsna.x65;
import xsna.x6k;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class udo implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ udo(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        UserId userId;
        int i = 7;
        int i2 = 8;
        boolean z = false;
        int i3 = 1;
        switch (this.b) {
            case 0:
                DraftsListFragment draftsListFragment = (DraftsListFragment) this.c;
                g47 g47Var = (g47) obj;
                qcy<Object>[] qcyVarArr = DraftsListFragment.Q;
                g47Var.e(tci.l(draftsListFragment.fo()), new bfo());
                g47Var.a(tci.k(draftsListFragment.fo()));
                g47Var.d(new wff(draftsListFragment.fo(), i3));
                return s3q0.a;
            case 1:
                EasyPromoteSettingsFragment easyPromoteSettingsFragment = (EasyPromoteSettingsFragment) this.c;
                com.vk.ads.easypromote.impl.presentation.a aVar = (com.vk.ads.easypromote.impl.presentation.a) obj;
                qcy<Object>[] qcyVarArr2 = EasyPromoteSettingsFragment.S;
                if (aVar instanceof a.c) {
                    b.a aVar2 = com.vk.ads.easypromote.impl.presentation.b.k1;
                    FaqSource faqSource = ((a.c) aVar).a;
                    aVar2.getClass();
                    com.vk.ads.easypromote.impl.presentation.b bVar = new com.vk.ads.easypromote.impl.presentation.b();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("key_faq_source", faqSource);
                    bVar.setArguments(bundle);
                    bVar.Wn(easyPromoteSettingsFragment.getChildFragmentManager(), "faq_bottom_sheet");
                } else if (aVar instanceof a.b) {
                    FragmentActivity activity = easyPromoteSettingsFragment.getActivity();
                    if (activity != null) {
                        activity.onNavigateUp();
                    }
                } else {
                    if (!(aVar instanceof a.C0373a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Bundle bundle2 = new Bundle();
                    a.C0373a c0373a = (a.C0373a) aVar;
                    Long l = c0373a.c;
                    int i4 = c0373a.b;
                    int i5 = c0373a.a;
                    bundle2.putParcelable("key_result_settings", new EasyPromoteSettings(i5, i4, l, true));
                    ((kwo) easyPromoteSettingsFragment.Q.getValue()).a(new EasyPromoteSettings(i5, i4, l, true));
                    easyPromoteSettingsFragment.getParentFragmentManager().k0(bundle2, "key_request_settings");
                    FragmentActivity activity2 = easyPromoteSettingsFragment.getActivity();
                    if (activity2 != null) {
                        activity2.onNavigateUp();
                    }
                }
                return s3q0.a;
            case 2:
                q4p q4pVar = (q4p) obj;
                return q4pVar instanceof p4p.a ? ((p4p.a) q4pVar).a.a() : q4pVar instanceof p4p ? zr.a("pipeline(", j5g.g0(((p4p) q4pVar).a, ", ", null, null, 0, new udo((p4p) this.c, 2), 30), ")") : q4pVar.toString();
            case 3:
                f6p f6pVar = (f6p) this.c;
                String str2 = f6pVar.i;
                if (str2 != null) {
                    ChatFragment chatFragment = (ChatFragment) f6pVar.c.c;
                    chatFragment.r0.k().b(chatFragment.requireContext(), str2);
                    EduMaxTransitionTracker.a(EduMaxTransitionTracker.BannerType.BANNER_COUNTER);
                }
                return s3q0.a;
            case 4:
                xmp xmpVar = (xmp) this.c;
                vgg vggVar = (vgg) obj;
                Throwable th = vggVar.a;
                if ((th instanceof VKApiExecutionException) && ((VKApiExecutionException) th).s() == 3615) {
                    Context context = xmpVar.b;
                    xmpVar.z.getClass();
                    com.vk.registration.funnels.b.a.getClass();
                    RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                    frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.EMAIL_DID_NOT_SEND_ALERT, null, null, null, null, null, null, 254);
                    vmp vmpVar = (vmp) xmpVar.a;
                    if (vmpVar != null) {
                        x65.a.a(vmpVar, context.getString(R.string.vk_auth_enter_email_error_alert_title), context.getString(R.string.vk_auth_enter_email_error_alert_subtitle), context.getString(R.string.vk_auth_enter_email_error_alert_retry_text), new l1i(xmpVar, i2), context.getString(R.string.vk_auth_enter_email_error_alert_dismiss_text), new ecm(xmpVar, i), false, null, null, 448);
                    }
                } else {
                    vggVar.c();
                }
                return s3q0.a;
            case 5:
                NewsEntry newsEntry = (NewsEntry) this.c;
                u1c0 u1c0Var = (u1c0) obj;
                if (u1c0Var.c == 303 && (epx.f(u1c0Var.b, newsEntry) || epx.f(u1c0Var.a, newsEntry))) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 6:
                ((vkq) this.c).i = true;
                return s3q0.a;
            case 7:
                mfr mfrVar = (mfr) this.c;
                mfrVar.h1.invoke((CatalogFilterOptionDo) obj);
                mfrVar.dismiss();
                return s3q0.a;
            case 8:
                dqs dqsVar = (dqs) this.c;
                FriendsGetFieldsResponseDto friendsGetFieldsResponseDto = (FriendsGetFieldsResponseDto) obj;
                dqsVar.d = friendsGetFieldsResponseDto.getCount();
                dqsVar.e = friendsGetFieldsResponseDto.d().size() + dqsVar.e;
                return s3q0.a;
            case 9:
                h7r0 h7r0Var = (h7r0) this.c;
                r55 r55Var = r55.a;
                c2r0 j = r55.j();
                Context context2 = e43.a;
                ((yui) j).i(context2 != null ? context2 : null, h7r0Var.e);
                return s3q0.a;
            case 10:
                f3t.b bVar2 = (f3t.b) this.c;
                CircularProgressIndicator circularProgressIndicator = bVar2.p;
                dug0.c cVar = (dug0.c) obj;
                if (cVar.c()) {
                    circularProgressIndicator.b(100, false);
                    File file = cVar.c;
                    f3t f3tVar = f3t.this;
                    f3tVar.n = false;
                    szj0 szj0Var = f3tVar.i;
                    f4m.j(circularProgressIndicator);
                    circularProgressIndicator.b(0, false);
                    bVar2.m.setVisibility(0);
                    if (szj0Var.a(file).exists()) {
                        File a = szj0Var.a(file);
                        b.f fVar = f3tVar.k;
                        if (fVar != null) {
                            fVar.a(-1, a.getAbsolutePath());
                        }
                    } else if (szj0Var.b(file).exists()) {
                        f3tVar.J0(szj0Var.b(file).getAbsolutePath());
                    } else {
                        cvk.u(R.string.masks_file_error, false);
                    }
                } else if (cVar.d()) {
                    circularProgressIndicator.b((int) (100 * cVar.b), true);
                }
                return s3q0.a;
            case 11:
                com.vk.channels.impl.channel_screen.send_msg.c cVar2 = (com.vk.channels.impl.channel_screen.send_msg.c) this.c;
                List<AudioArtistDto> list = (List) obj;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (AudioArtistDto audioArtistDto : list) {
                    cVar2.getClass();
                    arrayList.add(sp.n(audioArtistDto, true));
                }
                cVar2.getClass();
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Artist artist = (Artist) it.next();
                    arrayList2.add(new yq3(artist.b, artist.c, artist.f, artist.m));
                }
                return arrayList2;
            case 12:
                j3u j3uVar = (j3u) this.c;
                NewsfeedGetResponse newsfeedGetResponse = (NewsfeedGetResponse) obj;
                com.vk.newsfeed.common.util.j jVar = new com.vk.newsfeed.common.util.j();
                String str3 = newsfeedGetResponse.j() ? j3uVar.b : j3uVar.c;
                HashMap hashMap = new HashMap();
                Iterator<NewsEntry> it2 = newsfeedGetResponse.iterator();
                while (it2.hasNext()) {
                    NewsEntry next = it2.next();
                    ArrayList arrayList3 = new ArrayList();
                    try {
                        com.vk.newsfeed.common.util.j.h(jVar, next, (s1c0) j3uVar.e.getValue(), "news", str3, arrayList3, null, 96);
                    } catch (Throwable th2) {
                        L.i(th2);
                    }
                    hashMap.put(next, new k0d0(arrayList3));
                }
                return new bl60(newsfeedGetResponse, newsfeedGetResponse.i(), newsfeedGetResponse.isSmartNews, newsfeedGetResponse.lists, hashMap, newsfeedGetResponse.reactionSets);
            case 13:
                GoodFragment goodFragment = (GoodFragment) this.c;
                BaseOkResponseDto baseOkResponseDto = (BaseOkResponseDto) obj;
                qcy<Object>[] qcyVarArr3 = GoodFragment.U0;
                if (baseOkResponseDto == BaseOkResponseDto.OK) {
                    goodFragment.finish();
                }
                return s3q0.a;
            case 14:
                HighlightEditFragment highlightEditFragment = (HighlightEditFragment) this.c;
                wh50<tho0> wh50Var = highlightEditFragment.a0;
                tho0 tho0Var = (tho0) obj;
                int i6 = HighlightEditFragment.h0;
                if (tho0Var.a.c.length() <= 23) {
                    ((zak0) wh50Var).setValue(tho0Var);
                    highlightEditFragment.jo(!drm0.N(((tho0) ((zak0) wh50Var).getValue()).a.c));
                }
                return s3q0.a;
            case 15:
                ((rg50) this.c).C((int) (((tny) obj).a() & 4294967295L));
                return s3q0.a;
            case 16:
                ImCreateChatFastFragment imCreateChatFastFragment = (ImCreateChatFastFragment) this.c;
                x6k.a aVar3 = (x6k.a) obj;
                int i7 = ImCreateChatFastFragment.y0;
                Peer peer = aVar3.a;
                Bundle arguments = imCreateChatFastFragment.getArguments();
                String string = arguments != null ? arguments.getString("entry_point") : null;
                if (string != null) {
                    imCreateChatFastFragment.x0.c(peer, string);
                }
                Intent intent = new Intent();
                intent.putExtra("dialog_id", aVar3.a);
                s3q0 s3q0Var = s3q0.a;
                imCreateChatFastFragment.Mf(-1, intent);
                return s3q0.a;
            case 17:
                a.C1102a c1102a = (a.C1102a) this.c;
                int i8 = ImPlaceholder.t;
                c1102a.b.invoke();
                return s3q0.a;
            case 18:
                ((ImSelectContactsFragment) this.c).s0.setValue(((tho0) obj).a.c);
                return s3q0.a;
            case 19:
                ((orx.d.C3468d) this.c).getClass();
                return uyh0.a((uyh0) obj, false, false, null, null, 13);
            case 20:
                ((p7y) this.c).a.z(JsApiMethodType.CAN_ADD_VIRTUAL_CARD_EVENT_NAME, (Throwable) obj);
                return s3q0.a;
            case 21:
                ((ArrayList) this.c).addAll((List) obj);
                return s3q0.a;
            case 22:
                ei00 ei00Var = (ei00) obj;
                return Optional.of(new spm(((Integer) this.c).intValue(), ei00Var.a, ei00Var.b - ei00Var.c));
            case 23:
                return MarketAlbumImagePickerView.b((MarketAlbumImagePickerView) this.c, (UploadNotification.b) obj);
            case 24:
                return new e.c(((tj50.a) obj).a(new eqq((com.vk.ecomm.reviews.impl.allreviews.presentation.d) this.c, 14), ao8.d));
            case 25:
                return new bye0((ViewGroup) obj, ((n310) this.c).j, false, 0, 28);
            case 26:
                r410 r410Var = (r410) this.c;
                x410 x410Var = (x410) obj;
                Map<UserId, big0> map = x410Var.C;
                s410 s410Var = x410Var.B;
                big0 big0Var = map.get(s410Var.c);
                UserId userId2 = s410Var.c;
                r410Var.getClass();
                if (big0Var == null || (userId = big0Var.a) == null || !fkq0.c(userId) || (str = big0Var.d) == null) {
                    str = "";
                }
                String str4 = big0Var != null ? big0Var.f : null;
                return new o4g0(userId2, false, str, str4 != null ? str4 : "");
            case 27:
                return new c910.c(((tj50.a) obj).a(new ept((u810) this.c, i), ao8.d));
            case 28:
                vo20 vo20Var = (vo20) this.c;
                cp20.c cVar3 = cp20.c.a;
                if (vo20Var.r) {
                    vo20Var.p.onNext(cVar3);
                }
                return s3q0.a;
            default:
                com.vk.im.ui.components.msg_list.a aVar4 = (com.vk.im.ui.components.msg_list.a) this.c;
                if (!((Boolean) obj).booleanValue()) {
                    Context context3 = aVar4.k;
                    tlo0.f h = tq.h(tlo0.Companion, R.string.vkim_msg_request_conversation_failed);
                    ikv0.a aVar5 = new ikv0.a(context3);
                    float f = 28;
                    aVar5.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_triangle_outline_56, Integer.valueOf(R.attr.vk_ui_icon_negative), new Size(iah0.a(f), iah0.a(f)), 8);
                    aVar5.u = new ikv0.d(new ikv0.d.c(tlo0.b.a(h, context3).toString()), (ikv0.d.b) null, (ikv0.d.a) null, 6);
                    aVar5.n();
                }
                return s3q0.a;
        }
    }
}
