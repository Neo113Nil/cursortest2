package xsna;

import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.util.Base64;
import androidx.preference.Preference;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.api.generated.vkMaps.dto.VkMapsGeoSuggestFieldsDto;
import com.vk.api.photos.PhotosGetAlbums;
import com.vk.bridges.ImageViewer;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.placeholder.VkPlaceholder;
import com.vk.core.view.shimmer.ThemableShimmer;
import com.vk.dto.common.DialogBackground;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.dto.privacy.ListFriends;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.VmojiAvatarModel;
import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;
import com.vk.feed.settings.impl.presentation.filtered.NewsfeedFilteredSourcesFragment;
import com.vk.feed.settings.impl.presentation.filtered.a;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.libvideo.exceptions.CacheException;
import com.vk.log.L;
import com.vk.newsfeed.api.friendslists.FriendsListParams;
import com.vk.newsfeed.api.posting.listsfriends.ListsFriendsDefaultList;
import com.vk.newsfeed.impl.fragments.PostViewFragment;
import com.vk.prefui.views.VkSwitchItemPreference;
import com.vk.reefton.Reef;
import com.vk.reefton.c;
import com.vk.reefton.utils.ReefNetworkUtil;
import com.vk.stickers.settings.StickerSettingsCheckItem;
import com.vk.stickers.settings.i;
import com.vk.story.viewer.impl.presentation.stories.util.audio.StoryAudioHandler;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.player.controllers.MiniPlayerControllersWrapper;
import com.vk.video.ui.discovery.minimizable.s;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.NewsfeedSettingsFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.a7f0;
import xsna.a9a0;
import xsna.c5f0;
import xsna.caa0;
import xsna.cor;
import xsna.ctb0;
import xsna.eeu0;
import xsna.ez60;
import xsna.gxd0;
import xsna.h1p0;
import xsna.h7u0;
import xsna.ijx;
import xsna.k840;
import xsna.kmh0;
import xsna.lpe0;
import xsna.n6n0;
import xsna.o360;
import xsna.qn60;
import xsna.tj50;
import xsna.tlo0;
import xsna.w7t0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class m360 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m360(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.vk.core.compose.component.semantics.a, com.vk.core.view.components.placeholder.VkPlaceholder$a$a] */
    /* JADX WARN: Type inference failed for: r11v1, types: [androidx.preference.Preference, androidx.preference.TwoStatePreference] */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v52, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v55, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v58, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ImageViewer.c<?> g;
        char c;
        EmptyList emptyList;
        ReefNetworkUtil.NetworkType networkType;
        boolean z;
        boolean z2;
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        boolean z3;
        char c2 = 2;
        int i = 11;
        int i2 = 7;
        int i3 = 23;
        int i4 = 5;
        int i5 = 10;
        int i6 = 0;
        r10 = false;
        boolean z4 = false;
        ArrayList arrayList = null;
        int i7 = 1;
        switch (this.b) {
            case 0:
                o360 o360Var = (o360) this.c;
                String str = (String) obj;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                List<o360.b> d = o360Var.c.d(str);
                if (d != null) {
                    Iterator it = d.iterator();
                    while (it.hasNext()) {
                        ((o360.b) it.next()).a(elapsedRealtime);
                    }
                }
                return new o360.c(str, elapsedRealtime);
            case 1:
                NewsfeedFilteredSourcesFragment newsfeedFilteredSourcesFragment = (NewsfeedFilteredSourcesFragment) this.c;
                mzp0 mzp0Var = newsfeedFilteredSourcesFragment.Z;
                ez60 ez60Var = (ez60) obj;
                int i8 = NewsfeedFilteredSourcesFragment.a0;
                if (ez60Var instanceof ez60.a) {
                    ez60.a aVar = (ez60.a) ez60Var;
                    newsfeedFilteredSourcesFragment.getFeature().C(new a.b(aVar.a, aVar.b));
                } else if (ez60Var instanceof ez60.b.a) {
                    mzp0Var.d(null);
                    newsfeedFilteredSourcesFragment.On().a();
                } else {
                    if (!epx.f(ez60Var, ez60.b.C2842b.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    mzp0Var.h();
                    newsfeedFilteredSourcesFragment.On().c();
                }
                return s3q0.a;
            case 2:
                NewsfeedSettingsFragment newsfeedSettingsFragment = (NewsfeedSettingsFragment) this.c;
                hsl0 hsl0Var = (hsl0) obj;
                int i9 = NewsfeedSettingsFragment.v0;
                newsfeedSettingsFragment.jo(true);
                Preference findPreference = newsfeedSettingsFragment.findPreference("discover");
                r11 = findPreference instanceof VkSwitchItemPreference ? (VkSwitchItemPreference) findPreference : 0;
                if (r11 != 0) {
                    r11.O(hsl0Var.a);
                    r11.f = new nit(newsfeedSettingsFragment, 12);
                }
                return s3q0.a;
            case 3:
                Context context = (Context) this.c;
                ri6 ri6Var = (ri6) obj;
                L.e("[Push]: notification = " + ri6Var);
                ca70 ca70Var = ca70.a;
                ri6Var.g((NotificationManager) context.getSystemService("notification"));
                return s3q0.a;
            case 4:
                ((com.vk.superapp.miniapps.picker.h) this.c).l.h();
                return s3q0.a;
            case 5:
                tj50.a aVar2 = (tj50.a) obj;
                v8a0 v8a0Var = new v8a0(1, (w8a0) this.c, w8a0.class, "buildAlbumsListState", "buildAlbumsListState(Lcom/vk/photos/root/photoflow/settings/domain/PhotoFlowSettingsState;)Lcom/vk/photos/root/photoflow/settings/domain/PhotoFlowSettingsViewState$ListState;", 0);
                ao8 ao8Var = ao8.d;
                return new a9a0.a(aVar2.a(v8a0Var, ao8Var), aVar2.a(new d0k(19), ao8Var));
            case 6:
                caa0 caa0Var = (caa0) this.c;
                if (caa0Var.p != null) {
                    return s3q0.a;
                }
                Photo photo = (Photo) caa0Var.m;
                List<Photo> y0 = caa0Var.n.y0();
                int indexOf = ((ArrayList) y0).indexOf(photo);
                if (indexOf < 0) {
                    y0 = Collections.singletonList(photo);
                }
                g = myc0.d().g(indexOf >= 0 ? indexOf : 0, y0, caa0Var.itemView.getContext(), (caa0.a) caa0Var.q.getValue(), o25.a().c());
                caa0Var.p = g;
                return s3q0.a;
            case 7:
                androidx.lifecycle.f fVar = ((lha0) this.c).c;
                ((hha0) fVar).P((PhotosGetAlbums.a) obj);
                ((hha0) fVar).q();
                return s3q0.a;
            case 8:
                j7b0 j7b0Var = (j7b0) this.c;
                r5v0 r5v0Var = k840.a.h;
                (r5v0Var != null ? r5v0Var : null).b(new z8b0(R.string.music_player_snack_bar_common_error, j7b0Var.c));
                return s3q0.a;
            case 9:
                return new ctb0.a(((tj50.a) obj).a(new erb0(1, ((frb0) this.c).d, dtb0.class, "toViewState", "toViewState(Lcom/vk/video/polls/ui/root/feature/PollState;)Lcom/vk/video/polls/ui/root/feature/PollViewState$ScreenState;", 0), ao8.d));
            case 10:
                PostViewFragment postViewFragment = (PostViewFragment) this.c;
                c9c0 Co = postViewFragment.Co();
                if (Co != null) {
                    ((com.vk.newsfeed.impl.presenters.b) Co).S1(postViewFragment.getArguments());
                }
                return s3q0.a;
            case 11:
                exd0 exd0Var = (exd0) this.c;
                kqs kqsVar = (kqs) obj;
                Set<Integer> set = exd0Var.l.b;
                Set<Integer> set2 = exd0Var.l.c;
                int i10 = exd0Var.l.m;
                FriendsListParams friendsListParams = exd0Var.d;
                List<Integer> list = exd0Var.g;
                ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    kq.d((Number) it2.next(), arrayList2);
                }
                Set S0 = j5g.S0(arrayList2);
                List<UserId> list2 = exd0Var.f;
                ArrayList arrayList3 = new ArrayList(c5g.u(list2, 10));
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(String.valueOf(((UserId) it3.next()).b));
                }
                gxd0 a = gxd0.a.a(friendsListParams, S0, j5g.S0(arrayList3), o25.a().c(), kqsVar, i10);
                for (ListFriends listFriends : exd0Var.l.a) {
                    ListsFriendsDefaultList.a aVar3 = ListsFriendsDefaultList.Companion;
                    int i11 = listFriends.b;
                    aVar3.getClass();
                    if (ListsFriendsDefaultList.a.a(i11)) {
                        exd0Var.n.add(Integer.valueOf(listFriends.b));
                    } else {
                        exd0Var.o.add(Integer.valueOf(listFriends.b));
                    }
                }
                exd0Var.l = new gxd0(a.a, set, set2, a.d, a.e, a.f, a.g, a.h, a.i, a.j, a.k, a.l, a.m);
                return s3q0.a;
            case 12:
                aqe0 aqe0Var = (aqe0) this.c;
                lpe0 lpe0Var = (lpe0) obj;
                int i12 = aqe0.m1;
                if (lpe0Var instanceof lpe0.a) {
                    xn50.a.c(aqe0Var, ijx.a.b);
                } else {
                    if (!(lpe0Var instanceof lpe0.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    xn50.a.c(aqe0Var, new ijx.c(((lpe0.b) lpe0Var).a));
                }
                return s3q0.a;
            case 13:
                j4f0 j4f0Var = (j4f0) this.c;
                krt krtVar = (krt) obj;
                h5f0 h5f0Var = j4f0Var.f;
                h5f0Var.b.a();
                qn60 qn60Var = h5f0Var.a;
                pn60 pn60Var = h5f0Var.b;
                aic aicVar = new aic();
                List<Photo> list3 = krtVar.b;
                ArrayList arrayList4 = krtVar.a;
                if (list3 != null) {
                    List<Photo> list4 = list3;
                    ?? arrayList5 = new ArrayList(c5g.u(list4, 10));
                    for (Photo photo2 : list4) {
                        arrayList5.add(new c5f0.a(photo2, photo2.L));
                        c2 = c2;
                    }
                    c = c2;
                    emptyList = arrayList5;
                } else {
                    c = 2;
                    emptyList = EmptyList.b;
                }
                djj0 djj0Var = new djj0(new c5f0(emptyList), pn60Var);
                cjj0 cjj0Var = new cjj0(pn60Var);
                xc3 xc3Var = new xc3(arrayList4, null, pn60Var, j4f0Var.g, null, true, null);
                ejj0 ejj0Var = new ejj0(arrayList4, krtVar.c, pn60Var);
                qn60.b[] bVarArr = new qn60.b[5];
                bVarArr[0] = aicVar;
                bVarArr[1] = djj0Var;
                bVarArr[c] = cjj0Var;
                bVarArr[3] = xc3Var;
                bVarArr[4] = ejj0Var;
                return odq.c(qn60Var, bVarArr).l(new oe40(new i750(krtVar, i3), i4));
            case 14:
                anf0 anf0Var = (anf0) this.c;
                ArrayList arrayList6 = new ArrayList();
                int i13 = 0;
                for (Pair pair : (List) obj) {
                    arrayList6.add(pair.i());
                    i13 += ((Number) pair.j()).intValue();
                }
                StringBuilder sb = new StringBuilder();
                Iterator it4 = arrayList6.iterator();
                while (it4.hasNext()) {
                    sb.append("data[]=" + Base64.encodeToString((byte[]) it4.next(), 11) + "&");
                }
                if (!anf0Var.b(sb.toString())) {
                    AtomicInteger atomicInteger = Reef.i;
                    com.vk.reefton.c cVar = Reef.j;
                    if (cVar != null) {
                        long j = i13;
                        cVar.d.addAndGet(j);
                        ReefNetworkUtil c3 = cVar.a.c();
                        ConnectivityManager connectivityManager = c3.d;
                        TelephonyManager telephonyManager = c3.e;
                        if (telephonyManager != null && telephonyManager.getDataState() == 2) {
                            if (c3.b.a() >= 23) {
                                if (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
                                    z = false;
                                    z2 = false;
                                } else {
                                    z2 = networkCapabilities.hasTransport(0);
                                    z = networkCapabilities.hasTransport(1);
                                }
                                if (!z2 && !z) {
                                    networkType = ReefNetworkUtil.NetworkType.OTHER;
                                } else if (z) {
                                    networkType = ReefNetworkUtil.NetworkType.WIFI;
                                }
                            }
                            try {
                                i6 = telephonyManager.getDataNetworkType();
                            } catch (SecurityException unused) {
                            }
                            if (i6 != 0) {
                                switch (i6) {
                                    case 1:
                                    case 2:
                                    case 4:
                                    case 7:
                                    case 11:
                                    case 16:
                                        networkType = ReefNetworkUtil.NetworkType.CELLULAR_2G;
                                        break;
                                    case 3:
                                    case 5:
                                    case 6:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 12:
                                    case 14:
                                    case 15:
                                    case 17:
                                        networkType = ReefNetworkUtil.NetworkType.CELLULAR_3G;
                                        break;
                                    case 13:
                                    case 18:
                                    case 19:
                                        networkType = ReefNetworkUtil.NetworkType.CELLULAR_4G;
                                        break;
                                    default:
                                        networkType = ReefNetworkUtil.NetworkType.CELLULAR_UNKNOWN;
                                        break;
                                }
                            } else {
                                NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
                                int type = activeNetworkInfo != null ? activeNetworkInfo.getType() : -1;
                                int subtype = activeNetworkInfo != null ? activeNetworkInfo.getSubtype() : -1;
                                if (type != 1) {
                                    switch (subtype) {
                                        case 1:
                                        case 2:
                                        case 4:
                                        case 7:
                                        case 11:
                                        case 16:
                                            networkType = ReefNetworkUtil.NetworkType.CELLULAR_2G;
                                            break;
                                        case 3:
                                        case 5:
                                        case 6:
                                        case 8:
                                        case 9:
                                        case 10:
                                        case 12:
                                        case 14:
                                        case 15:
                                        case 17:
                                            networkType = ReefNetworkUtil.NetworkType.CELLULAR_3G;
                                            break;
                                        case 13:
                                        case 18:
                                        case 19:
                                            networkType = ReefNetworkUtil.NetworkType.CELLULAR_4G;
                                            break;
                                        default:
                                            networkType = ReefNetworkUtil.NetworkType.CELLULAR_UNKNOWN;
                                            break;
                                    }
                                } else {
                                    networkType = ReefNetworkUtil.NetworkType.WIFI;
                                }
                            }
                        } else {
                            networkType = ReefNetworkUtil.NetworkType.OFFLINE;
                        }
                        switch (c.a.$EnumSwitchMapping$0[networkType.ordinal()]) {
                            case 1:
                                cVar.e.addAndGet(j);
                                break;
                            case 2:
                                cVar.f.addAndGet(j);
                                break;
                            case 3:
                                cVar.g.addAndGet(j);
                                break;
                            case 4:
                                cVar.h.addAndGet(j);
                                break;
                            case 5:
                                cVar.i.addAndGet(j);
                                break;
                            case 6:
                                cVar.j.addAndGet(j);
                                break;
                            case 7:
                                cVar.k.addAndGet(j);
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    }
                }
                return s3q0.a;
            case 15:
                dmh0 dmh0Var = (dmh0) this.c;
                jpe0 jpe0Var = (jpe0) obj;
                if (znk0.D(jpe0Var.a)) {
                    dmh0Var.T(kmh0.b.b);
                    io.reactivex.rxjava3.disposables.c cVar2 = dmh0Var.h;
                    if (cVar2 != null) {
                        cVar2.dispose();
                    }
                    rov0 rov0Var = dmh0Var.g;
                    String str2 = jpe0Var.a;
                    Coordinates coordinates = jpe0Var.b;
                    x1o0 x1o0Var = rov0Var.a;
                    List l = coordinates != null ? e43.l(String.valueOf(coordinates.b), String.valueOf(coordinates.c)) : null;
                    List l2 = e43.l(VkMapsGeoSuggestFieldsDto.ADDRESS, VkMapsGeoSuggestFieldsDto.ADDRESS_DETAILS, VkMapsGeoSuggestFieldsDto.REF, VkMapsGeoSuggestFieldsDto.TYPE);
                    x1o0Var.getClass();
                    tfx tfxVar = new tfx("vkMaps.geoSuggest", new igj0(i5), new b690(i));
                    tfx.o(tfxVar, CampaignEx.JSON_KEY_AD_Q, str2, 0, 0, 12);
                    if (l2 != null) {
                        List list5 = l2;
                        arrayList = new ArrayList(c5g.u(list5, 10));
                        Iterator it5 = list5.iterator();
                        while (it5.hasNext()) {
                            arrayList.add(((VkMapsGeoSuggestFieldsDto) it5.next()).i());
                        }
                    }
                    if (arrayList != null) {
                        tfxVar.i("fields", arrayList);
                    }
                    if (l != null) {
                        tfxVar.i("location", l);
                    }
                    tfxVar.f(5, 1, 100, SignalingProtocol.KEY_LIMIT);
                    tfxVar.j("show_country", true);
                    tfx.o(tfxVar, "isocode", "RU", 0, 0, 12);
                    dmh0Var.h = a7f0.a.f(dmh0Var, rsg0.w0(yfb.x(tfxVar)).l(new i630(new l9v0(rov0Var, i7), i3)), new hsc0(dmh0Var, 7), new i0b0(dmh0Var, 8), 1);
                } else {
                    dmh0Var.T(new kmh0.c(new n6n0.b(EmptyList.b)));
                }
                return s3q0.a;
            case 16:
                xlb0 xlb0Var = (xlb0) obj;
                ((zdo0) this.c).d(fdi.E(xlb0Var, false));
                xlb0Var.a();
                return s3q0.a;
            case 17:
                ((wak0) this.c).C(((Integer) obj).intValue());
                return s3q0.a;
            case 18:
                s3l0 s3l0Var = (s3l0) this.c;
                d790 d790Var = s3l0Var.d;
                s3l0Var.z(d790Var != null ? d790Var : null, true);
                return s3q0.a;
            case 19:
                com.vk.stickers.settings.i iVar = (com.vk.stickers.settings.i) this.c;
                p6l0 p6l0Var = (p6l0) obj;
                bwt0.p0(iVar.e, true);
                bwt0.p0(iVar.f, false);
                i.a aVar4 = iVar.g;
                List<StickerStockItem> list6 = p6l0Var.a;
                List<StickerStockItem> list7 = p6l0Var.b;
                VmojiAvatarModel vmojiAvatarModel = p6l0Var.c.a;
                boolean z5 = p6l0Var.d;
                boolean z6 = p6l0Var.f;
                boolean z7 = p6l0Var.e;
                aVar4.getClass();
                aVar4.i = list6.size() > 1;
                ArrayList arrayList7 = new ArrayList();
                arrayList7.add(new f6l0(R.string.sticker_settings_group_caption));
                arrayList7.add(new StickerSettingsCheckItem(R.string.sticker_settings_autosuggest_title, Integer.valueOf(R.string.sticker_settings_autosuggest_subtitle), z7, false, StickerSettingsCheckItem.Setting.SUGGESTS, 8));
                if (z5) {
                    z3 = z6;
                    arrayList7.add(new StickerSettingsCheckItem(R.string.sticker_settings_animation_title, Integer.valueOf(R.string.sticker_settings_animation_subtitle), z6, false, StickerSettingsCheckItem.Setting.ANIMATIONS, 8));
                } else {
                    z3 = z6;
                }
                r6l0 r6l0Var = r6l0.c;
                arrayList7.add(r6l0Var);
                arrayList7.add(new n6l0(z3));
                arrayList7.add(r6l0Var);
                t6g0 t6g0Var = t6g0.b;
                if (t6g0.d().Y0()) {
                    if (vmojiAvatarModel != null) {
                        arrayList7.add(new v6l0(vmojiAvatarModel, vmojiAvatarModel.b.Cb()));
                    } else {
                        arrayList7.add(t6l0.c);
                    }
                }
                List<StickerStockItem> list8 = list6;
                if (!list8.isEmpty() || !list7.isEmpty()) {
                    arrayList7.add(r6l0Var);
                }
                if (!list8.isEmpty()) {
                    arrayList7.add(new f6l0(R.string.sticker_settings_active));
                    Iterator it6 = list6.iterator();
                    while (it6.hasNext()) {
                        arrayList7.add(new l6l0((StickerStockItem) it6.next(), true));
                    }
                }
                if (!list7.isEmpty()) {
                    arrayList7.add(new f6l0(R.string.sticker_settings_inactive));
                    Iterator it7 = list7.iterator();
                    while (it7.hasNext()) {
                        arrayList7.add(new l6l0((StickerStockItem) it7.next(), false));
                    }
                }
                t6g0 t6g0Var2 = t6g0.b;
                if (!t6g0.d().q0()) {
                    arrayList7.add(new o6l0(t6g0.d().d()));
                }
                aVar4.setItems(arrayList7);
                return s3q0.a;
            case 20:
                StoryAudioHandler storyAudioHandler = (StoryAudioHandler) this.c;
                Context context2 = e43.a;
                Context context3 = context2 != null ? context2 : null;
                synchronized (storyAudioHandler) {
                    if (storyAudioHandler.f) {
                        storyAudioHandler.g = true;
                        storyAudioHandler.b(context3, true);
                    }
                }
                return s3q0.a;
            case 21:
                gxs0 gxs0Var = (gxs0) this.c;
                Bitmap bitmap = (Bitmap) obj;
                gxs0Var.e = bitmap;
                gxs0Var.c.setBackgroundBitmap(bitmap);
                return s3q0.a;
            case 22:
                g0o0 g0o0Var = (g0o0) this.c;
                g0o0Var.R6();
                g620.x(g620.h - 1);
                hd60.a().g1(g0o0Var.itemView.getContext());
                return s3q0.a;
            case 23:
                ((com.vk.im.ui.components.theme_chooser.b) this.c).b1(new z8l0((DialogBackground) obj, i2));
                return s3q0.a;
            case 24:
                ((vzb0) this.c).b.invoke(obj);
                return s3q0.a;
            case 25:
                h1p0.b bVar = (h1p0.b) this.c;
                eeu0.a.C2801a c2801a = new eeu0.a.C2801a(new h7u0.a(bVar.itemView.getContext()));
                c2801a.h = "User id";
                c2801a.r = 20;
                c2801a.n = true;
                c2801a.m = 8;
                i1p0 i1p0Var = new i1p0(bVar);
                c2801a.k = "Apply toggles";
                c2801a.t = i1p0Var;
                j1p0 j1p0Var = new j1p0();
                c2801a.l = "Cancel";
                c2801a.u = j1p0Var;
                c2801a.g();
                return s3q0.a;
            case 26:
                Throwable th = (Throwable) obj;
                return th instanceof CacheException ? io.reactivex.rxjava3.core.x.k(new VideoAutoPlay.e((VideoFile) this.c, m7q.a(((CacheException) th).d(), null, null, null, 0, false, false, null, 0L, null, null, false, 125829119))) : io.reactivex.rxjava3.core.x.i(th);
            case 27:
                VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = (VideoMinimizableDiscoveryFragment) this.c;
                s.e eVar = (s.e) obj;
                int i14 = VideoMinimizableDiscoveryFragment.p1;
                List<hfz> list9 = eVar.b;
                List<hfz> list10 = eVar.c;
                List<hfz> list11 = videoMinimizableDiscoveryFragment.s0.e ? list10 : list9;
                ArrayList arrayList8 = new ArrayList();
                for (Object obj2 : list11) {
                    if (obj2 instanceof AboutVideoItem.SimilarVideoRedesign) {
                        arrayList8.add(obj2);
                    }
                }
                ArrayList arrayList9 = new ArrayList(c5g.u(arrayList8, 10));
                Iterator it8 = arrayList8.iterator();
                while (it8.hasNext()) {
                    arrayList9.add(((AboutVideoItem.SimilarVideoRedesign) it8.next()).b.a.getImage());
                }
                MiniPlayerControllersWrapper miniPlayerControllersWrapper = videoMinimizableDiscoveryFragment.X;
                if (miniPlayerControllersWrapper != null) {
                    miniPlayerControllersWrapper.g1(arrayList9);
                }
                com.vk.video.ui.discovery.minimizable.m mVar = videoMinimizableDiscoveryFragment.J0;
                if (mVar != null) {
                    mVar.l = !arrayList9.isEmpty();
                }
                com.vk.video.ui.discovery.minimizable.r rVar = (com.vk.video.ui.discovery.minimizable.r) videoMinimizableDiscoveryFragment.p0.getValue();
                if (rVar != null) {
                    s.e eVar2 = rVar.o;
                    rVar.o = eVar;
                    if (!eVar.equals(eVar2)) {
                        rVar.a();
                    }
                }
                com.vk.video.ui.discovery.minimizable.t tVar = (com.vk.video.ui.discovery.minimizable.t) videoMinimizableDiscoveryFragment.q0.getValue();
                if (tVar != null) {
                    s.e eVar3 = tVar.n;
                    tVar.n = eVar;
                    if (!eVar.equals(eVar3)) {
                        tVar.a();
                    }
                }
                com.vk.video.ui.discovery.minimizable.a aVar5 = (com.vk.video.ui.discovery.minimizable.a) videoMinimizableDiscoveryFragment.r0.getValue();
                if (aVar5 != null) {
                    s.e eVar4 = aVar5.i;
                    aVar5.i = eVar;
                    if (!eVar.equals(eVar4)) {
                        s.e eVar5 = aVar5.i;
                        if (eVar5 == null) {
                            EmptyList emptyList2 = EmptyList.b;
                            eVar5 = new s.e(emptyList2, emptyList2, emptyList2);
                        }
                        znj0 a2 = aVar5.a();
                        if (a2 != null) {
                            a2.e(eVar5);
                        }
                    }
                }
                Object a3 = videoMinimizableDiscoveryFragment.ko().Hf().a();
                if ((a3 instanceof a4 ? (a4) a3 : null) != null) {
                    List<hfz> list12 = eVar.a;
                    ArrayList arrayList10 = new ArrayList();
                    for (Object obj3 : list12) {
                        if (obj3 instanceof AboutVideoItem.i) {
                            arrayList10.add(obj3);
                        }
                    }
                    if (((AboutVideoItem.i) j5g.a0(arrayList10)) != null) {
                        throw null;
                    }
                    ArrayList arrayList11 = new ArrayList();
                    for (Object obj4 : list12) {
                        if (obj4 instanceof AboutVideoItem.d) {
                            arrayList11.add(obj4);
                        }
                    }
                    AboutVideoItem.d dVar = (AboutVideoItem.d) j5g.a0(arrayList11);
                    if (dVar != null) {
                        Uri uri = dVar.g;
                        if (uri != null) {
                            uri.toString();
                        }
                        if (!dVar.i) {
                            throw null;
                        }
                        com.vk.toggle.b.A.a(VideoFeatures.VIDEO_HELPER_CODEGEN_API);
                        throw null;
                    }
                }
                com.vk.video.ui.discovery.minimizable.m mVar2 = videoMinimizableDiscoveryFragment.J0;
                if (mVar2 != null) {
                    if (!gsi0.b().e) {
                        cor.a aVar6 = new cor.a(rli0.x(new i5g(list9), new i5g(list10)));
                        while (true) {
                            if (aVar6.hasNext()) {
                                if (((hfz) aVar6.next()) instanceof AboutVideoItem.w.b.C1217b) {
                                    z4 = true;
                                }
                            }
                        }
                    }
                    mVar2.k = z4;
                }
                return s3q0.a;
            case 28:
                cys0 cys0Var = (cys0) this.c;
                w7t0 w7t0Var = (w7t0) obj;
                VkPlaceholder vkPlaceholder = cys0Var.n0;
                if (epx.f(w7t0Var, w7t0.a.a)) {
                    f4m.j(vkPlaceholder);
                } else {
                    if (!(w7t0Var instanceof w7t0.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (dhr0.C().b) {
                        cys0Var.q0 = true;
                        cys0Var.q();
                    }
                    w7t0.b bVar2 = (w7t0.b) w7t0Var;
                    vkPlaceholder.setMiddle(new VkPlaceholder.b(u11.f(tlo0.Companion, bVar2.a), new tlo0.h(bVar2.b), (com.vk.core.compose.component.semantics.a) r11, i5));
                    if (bVar2.c) {
                        vkPlaceholder.setBottom(new VkPlaceholder.a(new VkPlaceholder.a.C0854a(new tlo0.f(R.string.video_error_retry), new rme0(cys0Var, 18), null, null, null, VkButton.Mode.Tertiary, null, false, null, 1916), (VkPlaceholder.a.C0854a) r11, 6));
                    } else {
                        vkPlaceholder.setBottom((VkPlaceholder.a) null);
                    }
                    vkPlaceholder.setVisibility(0);
                }
                return s3q0.a;
            default:
                ((vjv0) obj).setShimmer((ThemableShimmer) this.c);
                return s3q0.a;
        }
    }
}
