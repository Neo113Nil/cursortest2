package xsna;

import android.content.Context;
import android.view.ViewGroup;
import com.vk.api.base.Document;
import com.vk.auth.enterphone.choosecountry.Country;
import com.vk.catalog2.common.ui.mvp.holder.ActionSortVh;
import com.vk.channels.api.CommentsHistory;
import com.vk.clips.design.view.BroadcastFriendsView;
import com.vk.clips.editor.state.model.ClipsEditorAudioItem;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListFragment;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListViewState;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.spinner.VkScreenSpinner;
import com.vk.core.view.components.spinner.VkSpinnerContent;
import com.vk.documents.impl.SearchDocumentsListFragment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.dto.posting.DonutPostingSettings;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.log.L;
import com.vk.newsfeed.impl.posting.profilefriendslists.MoreItemsType;
import com.vk.newsfeed.impl.posting.profilefriendslists.a;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.dto.VkOnboardingType;
import com.vk.photos.root.albums.presentation.AlbumsFragment;
import com.vk.photos.root.albums.presentation.g;
import com.vk.photos.root.albums.presentation.views.AlbumsRecyclerPaginatedView;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.stories.design.view.editor.SideControlPanelView;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.api.NameHistoryItemType;
import com.vungle.ads.internal.protos.Sdk;
import io.michaelrocks.libphonenumber.android.PhoneNumberUtil;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Ref$ObjectRef;
import one.video.transform.TransformController;
import one.video.view.OneVideoPlayerView;
import ru.ok.android.webrtc.sessionroom.CallSessionRoomsManager;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import ru.ok.android.webrtc.signaling.participant.model.SignalingParticipantListChunk;
import xsna.cqc0;
import xsna.cwb0;
import xsna.dw20;
import xsna.e8v0;
import xsna.f0r;
import xsna.f360;
import xsna.gm50;
import xsna.gva;
import xsna.kn1;
import xsna.mwa;
import xsna.oap;
import xsna.tmh;
import xsna.vfh;
import xsna.wk50;
import xsna.xn60;
import xsna.xtn;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class d50 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d50(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        List singletonList;
        String str;
        int i;
        ArrayList<com.vkontakte.android.api.a> arrayList;
        String str2;
        NameHistoryItemType nameHistoryItemType;
        String str3;
        int i2;
        int i3 = 8;
        int i4 = 15;
        int i5 = 10;
        Object obj2 = null;
        int i6 = 1;
        int i7 = 0;
        switch (this.b) {
            case 0:
                ActionSortVh actionSortVh = (ActionSortVh) this.c;
                Context context = (Context) this.d;
                String str4 = (String) obj;
                k5a.d(str4, actionSortVh.f);
                actionSortVh.a();
                actionSortVh.d = eda.c(actionSortVh.b, str4, new oap.a(context), null, 12);
                return s3q0.a;
            case 1:
                AlbumsFragment albumsFragment = (AlbumsFragment) this.c;
                AlbumsRecyclerPaginatedView albumsRecyclerPaginatedView = (AlbumsRecyclerPaginatedView) this.d;
                g.b bVar = (g.b) obj;
                int i8 = AlbumsFragment.j0;
                String str5 = bVar.d;
                boolean z = bVar.e;
                String str6 = bVar.d;
                g.d dVar = bVar.b;
                List singletonList2 = (str5 != null || dVar.a.isEmpty()) ? Collections.singletonList(null) : Collections.singletonList(new kn1.c(dVar.a, dVar.b));
                if (str6 != null || (dVar.a.isEmpty() && dVar.c.isEmpty())) {
                    singletonList = Collections.singletonList(null);
                } else if (dVar.c.isEmpty()) {
                    singletonList = Collections.singletonList(new kn1.b(z));
                } else {
                    List<PhotoAlbum> list = dVar.c;
                    ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new kn1.a((PhotoAlbum) it.next()));
                    }
                    singletonList = arrayList2;
                }
                ((ln1) albumsFragment.d0.getValue()).submitList(j5g.V(c5g.v(e43.l(singletonList2, singletonList))));
                boolean z2 = !dVar.a.isEmpty();
                albumsFragment.e0 = z2;
                albumsFragment.fo(albumsRecyclerPaginatedView, z2);
                g.b.a aVar = bVar.c;
                if (aVar instanceof g.b.a.C1498a) {
                    albumsRecyclerPaginatedView.Fe();
                } else if (epx.f(aVar, g.b.a.C1499b.a)) {
                    albumsRecyclerPaginatedView.lb();
                } else {
                    if (aVar != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    albumsRecyclerPaginatedView.j();
                }
                s3q0 s3q0Var = s3q0.a;
                if (bVar.a) {
                    albumsRecyclerPaginatedView.K9();
                } else {
                    albumsRecyclerPaginatedView.Mk();
                    albumsRecyclerPaginatedView.setSwipeRefreshEnabled(bVar.f);
                }
                if (str6 != null) {
                    albumsRecyclerPaginatedView.z();
                } else if (dVar.a.isEmpty() && dVar.c.isEmpty()) {
                    albumsRecyclerPaginatedView.x();
                    albumsRecyclerPaginatedView.getAlbumsEmptyView().h0(z);
                } else {
                    albumsRecyclerPaginatedView.A();
                }
                return s3q0Var;
            case 2:
                List list2 = (List) this.c;
                Integer num = (Integer) this.d;
                rzq0 rzq0Var = (rzq0) obj;
                int i9 = BroadcastFriendsView.d;
                rzq0Var.b(list2, vua0.b);
                if (num != null) {
                    rzq0Var.a(new jg8(num, list2));
                }
                return s3q0.a;
            case 3:
                return CallSessionRoomsManager.a((CallSessionRoomsManager) this.c, (SessionRoomId) this.d, (SignalingParticipantListChunk) obj);
            case 4:
                mwa mwaVar = (mwa) this.c;
                Integer num2 = (Integer) this.d;
                gva.a aVar2 = (gva.a) obj;
                mwa.a a = mwaVar.a();
                CommentsHistory commentsHistory = a.b;
                if (num2 == null) {
                    CommentsHistory.Order order = commentsHistory.d;
                    if (order != CommentsHistory.Order.ASC) {
                        return mwaVar.d(order).l(new ai3(new kf1(aVar2, i5), 6));
                    }
                    mwa.a a2 = mwaVar.a();
                    CommentsHistory commentsHistory2 = a2.b;
                    if (commentsHistory2.g == null && (str = commentsHistory2.e) != null && str.length() != 0) {
                        return mwaVar.c().l(new com.vk.movika.sdk.base.ui.p0(new com.vk.voip.ui.menu.feature.a(aVar2, i4), i3));
                    }
                    hag hagVar = aVar2.b;
                    return hagVar == null ? sn.b("New comment result can't be null") : io.reactivex.rxjava3.core.x.k(new Pair(Integer.valueOf(aVar2.a), mwa.a.a(a2, CommentsHistory.a(commentsHistory2, j5g.v0(hagVar, commentsHistory2.a), 0, commentsHistory2.c + 1, null, null, null, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE), a2.c.Ib(aVar2.c), 1)));
                }
                int intValue = num2.intValue();
                hag hagVar2 = aVar2.b;
                if (hagVar2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                List<hag> list3 = commentsHistory.a;
                hag a3 = rbg.a(list3, num2, true);
                if (a3 != null) {
                    intValue = a3.a;
                }
                List<hag> list4 = list3;
                ArrayList arrayList3 = new ArrayList(c5g.u(list4, 10));
                for (hag hagVar3 : list4) {
                    int i10 = hagVar3.a;
                    CommentsHistory commentsHistory3 = hagVar3.f;
                    if (i10 == intValue) {
                        ArrayList arrayList4 = new ArrayList(commentsHistory3.a);
                        i = i6;
                        arrayList4.add(hag.a(hagVar2, null, false, null, false, 16383));
                        hagVar3 = hag.a(hagVar3, CommentsHistory.a(commentsHistory3, arrayList4, 0, commentsHistory3.c + 1, null, null, null, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE), false, null, false, 32735);
                    } else {
                        i = i6;
                    }
                    arrayList3.add(hagVar3);
                    i6 = i;
                }
                return io.reactivex.rxjava3.core.x.k(new Pair(Integer.valueOf(aVar2.a), mwa.a.a(a, CommentsHistory.a(commentsHistory, arrayList3, 0, commentsHistory.c + 1, null, null, null, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE), a.c.Ib(aVar2.c), i6)));
            case 5:
                ((a6b) this.c).a.a((VkOnboardingCampaign) this.d, VkOnboardingType.Tooltip, e8v0.m.b);
                return s3q0.a;
            case 6:
                gpb gpbVar = (gpb) this.c;
                epb epbVar = (epb) this.d;
                ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
                com.vk.mvi.core.internal.executors.a.b(new bfb(gpbVar, (DialogExt) obj, epbVar, i6));
                return s3q0.a;
            case 7:
                ClipsFavoriteFolderContentListFragment.b bVar2 = (ClipsFavoriteFolderContentListFragment.b) this.c;
                ClipsFavoriteFolderContentListFragment clipsFavoriteFolderContentListFragment = (ClipsFavoriteFolderContentListFragment) this.d;
                int i11 = ClipsFavoriteFolderContentListFragment.W;
                bVar2.c.setVisibility(8);
                bVar2.f.setVisibility(8);
                bVar2.g.setVisibility(8);
                bVar2.h.setVisibility(0);
                gm50.a.a(clipsFavoriteFolderContentListFragment, ((ClipsFavoriteFolderContentListViewState.c) obj).a, new com.vk.movika.sdk.base.logic.interactor.e(clipsFavoriteFolderContentListFragment, 17));
                return s3q0.a;
            case 8:
                Context context2 = (Context) this.d;
                u1h u1hVar = new u1h(0, (vmh) this.c, tmh.a.class, "openHistoryAction", "openHistoryAction()V", 0);
                st50 st50Var = ((ExtendedCommunityProfile) obj).F2;
                if (st50Var == null || (arrayList = st50Var.b) == null || arrayList.isEmpty()) {
                    return null;
                }
                ListBuilder e = e43.e();
                e.add(new wr9(context2.getString(R.string.group_history), null, context2.getString(R.string.group_history_show_all), st50Var.a ? new b010(u1hVar, 13) : null, 2));
                for (com.vkontakte.android.api.a aVar3 : arrayList) {
                    NameHistoryItemType nameHistoryItemType2 = aVar3.c;
                    String str7 = aVar3.a;
                    int i12 = nameHistoryItemType2 == null ? -1 : vt50.$EnumSwitchMapping$0[nameHistoryItemType2.ordinal()];
                    if (i12 == -1) {
                        str2 = null;
                    } else if (i12 == 1) {
                        str2 = context2.getString(R.string.group_history_title_rename, str7);
                    } else if (i12 == 2) {
                        str2 = context2.getString(R.string.community_name_history_title_created_no_title);
                    } else {
                        if (i12 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (str7 == null) {
                            str7 = "";
                        }
                        Integer g = cqm0.g(str7);
                        str2 = context2.getString(R.string.group_history_title_collapse, context2.getResources().getQuantityString(R.plurals.community_name_history_times, g != null ? g.intValue() : 1, str7));
                    }
                    Long l = aVar3.b;
                    if (l != null) {
                        nameHistoryItemType = nameHistoryItemType2;
                        Date date = new Date(l.longValue() * 1000);
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTime(date);
                        Date date2 = new Date();
                        Calendar calendar2 = Calendar.getInstance();
                        calendar2.setTime(date2);
                        if (c09.c(calendar2, calendar)) {
                            str3 = context2.getString(R.string.community_name_history_description_today);
                        } else {
                            Calendar calendar3 = Calendar.getInstance();
                            calendar3.setTime(date);
                            Date date3 = new Date();
                            Calendar calendar4 = Calendar.getInstance();
                            calendar4.setTime(date3);
                            str3 = c09.f(calendar4, calendar3) ? context2.getString(R.string.community_name_history_description_yesterday) : context2.getString(R.string.community_name_history_date_with_year_letter, new SimpleDateFormat("d MMMM yyyy", Locale.getDefault()).format(date));
                        }
                    } else {
                        nameHistoryItemType = nameHistoryItemType2;
                        str3 = null;
                    }
                    int i13 = nameHistoryItemType == null ? -1 : vt50.$EnumSwitchMapping$0[nameHistoryItemType.ordinal()];
                    if (i13 == -1) {
                        str3 = null;
                    } else if (i13 != 1 && i13 != 2) {
                        if (i13 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str3 = context2.getString(R.string.group_history_description_collapse, str3);
                    }
                    int i14 = nameHistoryItemType == null ? -1 : vt50.$EnumSwitchMapping$0[nameHistoryItemType.ordinal()];
                    if (i14 != -1) {
                        if (i14 != 1) {
                            if (i14 == 2) {
                                i2 = R.drawable.vk_icon_flapper_20;
                            } else if (i14 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                        i2 = R.drawable.vk_icon_history_backward_outline_20;
                    } else {
                        i2 = 0;
                    }
                    e.add(new tt50(str2, str3, i2));
                }
                return e.g();
            case 9:
                ((izs) this.c).invoke(((vfh.a) this.d).m);
                return s3q0.a;
            case 10:
                mtk0 mtk0Var = (mtk0) this.c;
                izs izsVar = (izs) this.d;
                List list5 = (List) mtk0Var.getValue();
                ((nvy) obj).e(list5.size(), new ozi(i7, list5, new com.vk.movika.sdk.base.logic.interactor.f(i4)), new pzi(list5, i7), new jai(802480018, new qzi(i7, izsVar, list5), true));
                return s3q0.a;
            case 11:
                ((asm) this.c).e().c(new cwb0.g0((DialogExt) this.d), new fgm((io.reactivex.rxjava3.disposables.c) obj, i6));
                return s3q0.a;
            case 12:
                ((yd6) this.c).invoke(Integer.valueOf(((DonutPostingSettings.Duration) this.d).b));
                return s3q0.a;
            case 13:
                ((wfo) this.c).e(this.d);
                return s3q0.a;
            case 14:
                String str8 = (String) this.c;
                com.vk.auth.enterphone.a aVar4 = (com.vk.auth.enterphone.a) this.d;
                String q = PhoneNumberUtil.q(str8);
                ArrayList arrayList5 = new ArrayList();
                for (Object obj3 : (List) obj) {
                    if (brm0.B(q, ((Country) obj3).c, false)) {
                        arrayList5.add(obj3);
                    }
                }
                Iterator it2 = arrayList5.iterator();
                if (it2.hasNext()) {
                    obj2 = it2.next();
                    if (it2.hasNext()) {
                        int length = ((Country) obj2).c.length();
                        do {
                            Object next = it2.next();
                            int length2 = ((Country) next).c.length();
                            if (length < length2) {
                                obj2 = next;
                                length = length2;
                            }
                        } while (it2.hasNext());
                    }
                }
                Country country = (Country) obj2;
                if (country != null) {
                    q = q.substring(country.c.length());
                }
                Pair pair = new Pair(country, q);
                Country country2 = (Country) pair.i();
                String str9 = (String) pair.j();
                if (country2 != null) {
                    aVar4.C = country2;
                    com.vk.registration.funnels.b bVar3 = com.vk.registration.funnels.b.a;
                    String valueOf = String.valueOf(country2.b);
                    bVar3.getClass();
                    com.vk.registration.funnels.b.u(valueOf);
                    cpp cppVar = (cpp) aVar4.a;
                    if (cppVar != null) {
                        cppVar.bj(country2);
                    }
                }
                aVar4.D = str9;
                cpp cppVar2 = (cpp) aVar4.a;
                if (cppVar2 != null) {
                    cppVar2.xl(str9);
                }
                if (country2 != null && str9.length() > 0) {
                    com.vk.registration.funnels.b.a.getClass();
                    RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                    frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.GOOGLE_PHONE_HINT_ADDED, null, null, null, null, null, null, 254);
                    aVar4.z0(country2, str9);
                }
                return s3q0.a;
            case 15:
                String str10 = (String) this.c;
                String str11 = (String) this.d;
                hyg0 hyg0Var = (hyg0) obj;
                qyg0 V0 = hyg0Var.V0("DELETE FROM episode WHERE uid = ? AND mid = ?");
                try {
                    V0.D3(1, str10);
                    V0.D3(2, str11);
                    V0.step();
                    int p = sv1.p(hyg0Var);
                    V0.close();
                    return Integer.valueOf(p);
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            case 16:
                ((f0r.l) this.c).h((wk50.a) this.d, (Throwable) obj);
                return s3q0.a;
            case 17:
                ((wo60) this.c).a.a(new xn60.b.a((UserId) obj, ((yo60.e.h) this.d).a));
                return s3q0.a;
            case 18:
                cqc0 cqc0Var = (cqc0) this.c;
                cqc0.c cVar = (cqc0.c) this.d;
                cqc0Var.V0();
                dw20.b h0 = new dw20.b(cVar.a, null).M(R.drawable.vk_icon_lock_outline_56, Integer.valueOf(R.attr.vk_ui_icon_accent)).h0(R.string.clips_privacy_modal_bottomsheet_make_open, new wp40(cVar, 16));
                dhr0.a.getClass();
                dw20.a.Q(h0.u0(dhr0.u().c).v0(R.string.clips_privacy_modal_bottomsheet_title), R.string.clips_privacy_modal_bottomsheet_description).I0(null);
                return s3q0.a;
            case 19:
                yid0 yid0Var = (yid0) this.c;
                Context context3 = (Context) this.d;
                Throwable th2 = (Throwable) obj;
                L.i(th2);
                if (!yid0Var.f.a(context3, th2)) {
                    enj.q(R.string.product_error_change_amount, 0, vx2.d.getContext());
                }
                return s3q0.a;
            case 20:
                return new kxd0((ViewGroup) obj, (a.InterfaceC1385a) this.c, (MoreItemsType) this.d);
            case 21:
                r9e0 r9e0Var = (r9e0) this.c;
                okhttp3.d dVar2 = (okhttp3.d) this.d;
                f360.a aVar5 = (f360.a) obj;
                Iterator<f360> it3 = r9e0Var.d.iterator();
                while (it3.hasNext()) {
                    it3.next().q(dVar2, aVar5);
                }
                return s3q0.a;
            case 22:
                ((zak0) ((ii50) this.c).a).setValue(new r2q((umr) this.d, (zpx0) obj));
                return s3q0.a;
            case 23:
                SearchDocumentsListFragment searchDocumentsListFragment = (SearchDocumentsListFragment) this.c;
                com.vk.lists.c cVar2 = (com.vk.lists.c) this.d;
                xtn.a aVar6 = (xtn.a) obj;
                if (!epx.f(searchDocumentsListFragment.a0, aVar6.d)) {
                    return s3q0.a;
                }
                List<Document> list6 = aVar6.a;
                wun wunVar = searchDocumentsListFragment.S;
                if (wunVar != null) {
                    wunVar.n0(list6);
                }
                wun wunVar2 = searchDocumentsListFragment.S;
                if (wunVar2 != null) {
                    wunVar2.K0(wunVar2.k);
                }
                if (cVar2.i() == 0) {
                    searchDocumentsListFragment.io(aVar6.b);
                }
                cVar2.l(aVar6.e);
                return s3q0.a;
            case 24:
                ((izs) this.c).invoke(((z9i0) this.d).m);
                return s3q0.a;
            case 25:
                SideControlPanelView sideControlPanelView = (SideControlPanelView) this.c;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.d;
                n930 n930Var = (n930) obj;
                u76 u76Var = sideControlPanelView.u;
                if (u76Var != null) {
                    u76Var.b3(n930Var);
                }
                VkContextMenu vkContextMenu = (VkContextMenu) ref$ObjectRef.element;
                if (vkContextMenu != null) {
                    vkContextMenu.b();
                }
                return s3q0.a;
            case 26:
                guj0 guj0Var = (guj0) this.c;
                kyd kydVar = (kyd) this.d;
                ClipsEditorAudioItem clipsEditorAudioItem = (ClipsEditorAudioItem) obj;
                huj0 huj0Var = guj0Var.c;
                return (ClipsEditorAudioItem) (huj0Var != null ? huj0Var : null).a(kydVar, clipsEditorAudioItem);
            case 27:
                y4k0 y4k0Var = (y4k0) this.c;
                TransformController transformController = (TransformController) this.d;
                ((OneVideoPlayerView) obj).setPlayer(y4k0Var.a);
                transformController.e(y4k0Var.a);
                return s3q0.a;
            case 28:
                return qkk0.m((qkk0) this.c, (Context) obj, VkSpinnerContent.SpinnerState.Loading, (VkScreenSpinner.SpinnerMode) this.d, "Subtitle", 8);
            default:
                return new tgo0((wh50) this.c, (sg50) this.d);
        }
    }

    public /* synthetic */ d50(Context context, vmh vmhVar) {
        this.b = 8;
        this.d = context;
        this.c = vmhVar;
    }

    public /* synthetic */ d50(r9e0 r9e0Var, okhttp3.d dVar, okhttp3.j jVar) {
        this.b = 21;
        this.c = r9e0Var;
        this.d = dVar;
    }
}
