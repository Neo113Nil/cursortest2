package xsna;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.api.generated.wall.dto.WallGetResponseDto;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.SwitchCatalogVh;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.feature.music.api.CatalogGetAudioSearchRequestFactory;
import com.vk.clips.design.view.timeline.TimelineVoiceoverView;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.core.view.components.tile.VkTile;
import com.vk.core.view.search.RoundedSearchView;
import com.vk.dto.group.Group;
import com.vk.dto.photo.Photo;
import com.vk.dto.video.VideoAlbum;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.ui.views.avatars.VkImAvatar;
import com.vk.inappreview.InAppReviewConditionKey;
import com.vk.log.L;
import com.vk.music.offline.api.model.storage.StorageEvent;
import com.vk.newsfeed.impl.requests.WallWithCounters;
import com.vk.profile.design.compose.buttons.ProfileButtons;
import com.vk.profile.design.compose.header.AuthorHeaderConfig;
import com.vk.profile.design.compose.header.a;
import com.vk.profile.design.compose.header.sink.AuthorHeaderEvent;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.profile.user.impl.ui.b;
import com.vk.profile.user.impl.ui.f;
import com.vk.toggle.b;
import com.vk.toggle.internal.ToggleManager;
import com.vk.voip.userid.CallsUserId;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import ru.ok.android.externcalls.sdk.sessionroom.participant.SessionRoomParticipants;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.arq0;
import xsna.atq0;
import xsna.bcw0;
import xsna.dn90;
import xsna.e3m;
import xsna.f3l0;
import xsna.fxk0;
import xsna.gm50;
import xsna.h0r0;
import xsna.mp90;
import xsna.nii0;
import xsna.p9i0;
import xsna.rii0;
import xsna.sdk0;
import xsna.xo90;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class l850 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l850(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:36:0x00f8. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v31, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Group group;
        SwitchCatalogVh switchCatalogVh;
        SwitchCatalogVh.a aVar;
        CatalogViewHolder catalogViewHolder;
        UserProfileAction userProfileAction;
        la5 a;
        la5 a2;
        UserProfileAction fVar;
        UserProfileAction c1680d;
        int i = 7;
        int i2 = 10;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (this.b) {
            case 0:
                StorageEvent storageEvent = (StorageEvent) this.c;
                ((vgl0) obj).getClass();
                storageEvent.ordinal();
                return Boolean.FALSE;
            case 1:
                ((bn90) this.c).T(new dn90.c.a((Throwable) obj));
                return s3q0.a;
            case 2:
                dp90 dp90Var = (dp90) this.c;
                xo90.e eVar = dp90Var.l;
                CallsUserId callsUserId = eVar != null ? eVar.b : null;
                if (callsUserId != null && !(callsUserId instanceof CallsUserId.ContactId)) {
                    dp90Var.c.a(new mp90.b.c(callsUserId));
                }
                return s3q0.a;
            case 3:
                o7c0 o7c0Var = (o7c0) this.c;
                o7c0Var.v();
                o7c0Var.t.setImageBitmap((Bitmap) obj);
                return s3q0.a;
            case 4:
                flc0 flc0Var = (flc0) this.c;
                return ((flc0Var.g || ((group = flc0Var.r) != null && group.i)) ? fsk.c.b(InAppReviewConditionKey.ADD_POST_BY_ADMIN, jgp.b) : io.reactivex.rxjava3.internal.operators.completable.i.b).d(io.reactivex.rxjava3.core.q.T((NewsEntry) obj));
            case 5:
                Photo photo = (Photo) this.c;
                Photo photo2 = ((PhotoAttachment) obj).l;
                return Boolean.valueOf(epx.f(photo2.e, photo.e) && photo2.c == photo.c);
            case 6:
                RoundedSearchView roundedSearchView = (RoundedSearchView) this.c;
                roundedSearchView.e.dispose();
                String str = ((bcw0.a) obj).a;
                if (str != null) {
                    roundedSearchView.setQuery(str);
                }
                return s3q0.a;
            case 7:
                m1h0 m1h0Var = ((l1h0) this.c).d;
                return Boolean.valueOf(m1h0Var != null ? m1h0Var.a(obj) : true);
            case 8:
                hqh0 hqh0Var = (hqh0) this.c;
                String str2 = (String) obj;
                if (drm0.N(str2)) {
                    str2 = "";
                }
                hqh0Var.r = str2;
                boolean f = epx.f(hqh0Var.n, hqh0Var.m);
                if (!f && epx.f(hqh0Var.r, "") && hqh0Var.m == CatalogGetAudioSearchRequestFactory.SearchMusicEntrypoint.SearchInServiceKids && (switchCatalogVh = hqh0Var.j) != null && (aVar = switchCatalogVh.m) != null && aVar.a() != null && (catalogViewHolder = switchCatalogVh.c) != null) {
                    Serializer.c<UIBlockList> cVar = UIBlockList.CREATOR;
                    UIBlockList a3 = UIBlockList.a.a();
                    UIBlockList a4 = UIBlockList.a.a();
                    EmptyList emptyList = EmptyList.b;
                    catalogViewHolder.N6(new UIBlockCatalog(a3, a4, emptyList, null, "", null, null, false, emptyList, PsExtractor.AUDIO_STREAM, null));
                }
                hqh0Var.f.invoke(vyh0.a);
                String str3 = hqh0Var.r;
                if (hqh0Var.m != CatalogGetAudioSearchRequestFactory.SearchMusicEntrypoint.SearchInServiceKids) {
                    hqh0Var.c.a(str3);
                }
                hqh0Var.a().U(hqh0Var.r);
                if (!f) {
                    hqh0Var.n = hqh0Var.m;
                    hqh0Var.a().a(true, false);
                }
                return s3q0.a;
            case 9:
                ((s9i0) this.c).C(p9i0.a.b);
                return s3q0.a;
            case 10:
                ((rii0.a) this.c).l.invoke(nii0.c.b);
                return s3q0.a;
            case 11:
                io.reactivex.rxjava3.core.y yVar = (io.reactivex.rxjava3.core.y) this.c;
                List<SessionRoomParticipants> list = (List) obj;
                int e = on00.e(c5g.u(list, 10));
                if (e < 16) {
                    e = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(e);
                for (SessionRoomParticipants sessionRoomParticipants : list) {
                    Pair pair = new Pair((SessionRoomId.Room) sessionRoomParticipants.getRoomId(), sessionRoomParticipants.getParticipants());
                    linkedHashMap.put(pair.i(), pair.j());
                }
                yVar.onSuccess(linkedHashMap);
                return s3q0.a;
            case 12:
                ((ldk0) this.c).T(new sdk0.b.a((Throwable) obj));
                return s3q0.a;
            case 13:
                Cursor cursor = (Cursor) this.c;
                try {
                    if (cursor.moveToNext()) {
                        return cursor;
                    }
                    return null;
                } finally {
                    cursor.close();
                }
            case 14:
                com.vk.clips.sdk.shared.item.static_ads.c cVar2 = (com.vk.clips.sdk.shared.item.static_ads.c) this.c;
                gm50.a.a(cVar2, ((fxk0.a) obj).a, new svk0(cVar2, 0));
                return s3q0.a;
            case 15:
                s3l0 s3l0Var = (s3l0) this.c;
                s3l0Var.i = new f3l0.a.C2847a(0);
                d790 d790Var = s3l0Var.d;
                s3l0Var.z(d790Var != null ? d790Var : null, true);
                return s3q0.a;
            case 16:
                ucp.f(((i8l0) this.c).b);
                return s3q0.a;
            case 17:
                gzm0 gzm0Var = (gzm0) this.c;
                L.G(ms9.b("error: ", (Throwable) obj));
                gzm0Var.b.ko(gzm0Var.f);
                return s3q0.a;
            case 18:
                x9n0 x9n0Var = ((y9n0) this.c).b;
                View view = x9n0Var.i1;
                if (view != null) {
                    view.setVisibility(0);
                }
                RecyclerView recyclerView = x9n0Var.h1;
                if (recyclerView != null) {
                    f4m.j(recyclerView);
                }
                return s3q0.a;
            case 19:
                com.vk.lists.c cVar3 = ((com.vk.superapp.ui.a) this.c).I;
                if (cVar3 != null) {
                    cVar3.p(false);
                }
                return s3q0.a;
            case 20:
                jro0 jro0Var = (jro0) this.c;
                kro0 kro0Var = jro0Var.o;
                if (kro0Var != null) {
                    jro0Var.l.j(kro0Var.a());
                }
                return s3q0.a;
            case 21:
                return TimelineVoiceoverView.P4((TimelineVoiceoverView) this.c, (Integer) obj);
            case 22:
                ((ToggleManager) this.c).w((b.c) obj);
                return s3q0.a;
            case 23:
                zfp0 zfp0Var = (zfp0) this.c;
                ((nc50) zfp0Var.s1.getValue()).a((mc50) obj, zfp0Var.kn(), zfp0Var.requireArguments().getBoolean("FORCE_DARK_THEME", false));
                return s3q0.a;
            case 24:
                Throwable th = (Throwable) obj;
                fpq0 fpq0Var = ((jmq0) this.c).k;
                if (fpq0Var == null) {
                    fpq0Var = null;
                }
                fpq0Var.B(new f.h(new atq0.f(null, null, th, 11)));
                return s3q0.a;
            case 25:
                arq0 arq0Var = (arq0) this.c;
                wh50 wh50Var = arq0Var.s;
                AuthorHeaderEvent authorHeaderEvent = (AuthorHeaderEvent) obj;
                slq0 slq0Var = arq0Var.n;
                gwn0 gwn0Var = arq0Var.q;
                int i3 = 2;
                int i4 = 3;
                if (authorHeaderEvent instanceof AuthorHeaderEvent.a) {
                    AuthorHeaderEvent.a aVar2 = (AuthorHeaderEvent.a) authorHeaderEvent;
                    if (aVar2 instanceof AuthorHeaderEvent.a.b) {
                        AuthorHeaderEvent.a.b bVar = (AuthorHeaderEvent.a.b) aVar2;
                        ProfileButtons.ButtonType buttonType = bVar.a;
                        zhf0 zhf0Var = bVar.b;
                        switch (arq0.b.$EnumSwitchMapping$1[buttonType.ordinal()]) {
                            case 1:
                            case 2:
                                fVar = new UserProfileAction.d.c.AbstractC1678c.f(gwn0Var);
                                slq0Var.a(fVar);
                                break;
                            case 3:
                                c1680d = new UserProfileAction.d.c.AbstractC1678c.C1680d(gwn0Var, xa4.K(zhf0Var));
                                fVar = c1680d;
                                slq0Var.a(fVar);
                                break;
                            case 4:
                                fVar = new UserProfileAction.d.c.AbstractC1678c.g(gwn0Var);
                                slq0Var.a(fVar);
                                break;
                            case 5:
                                fVar = new UserProfileAction.d.c.AbstractC1678c.b(gwn0Var);
                                slq0Var.a(fVar);
                                break;
                            case 6:
                                fVar = new UserProfileAction.d.c.AbstractC1678c.a(gwn0Var);
                                slq0Var.a(fVar);
                                break;
                            case 7:
                            case 8:
                                c1680d = new UserProfileAction.d.c.AbstractC1678c.C1679c(gwn0Var, xa4.K(zhf0Var));
                                fVar = c1680d;
                                slq0Var.a(fVar);
                                break;
                            case 9:
                                fVar = new UserProfileAction.d.c.AbstractC1678c.e(gwn0Var);
                                slq0Var.a(fVar);
                                break;
                        }
                    } else if ((aVar2 instanceof AuthorHeaderEvent.a.c.C1664a) || (aVar2 instanceof AuthorHeaderEvent.a.c.b)) {
                        Rect K = xa4.K(((AuthorHeaderEvent.a.c) aVar2).a());
                        AuthorHeaderConfig authorHeaderConfig = (AuthorHeaderConfig) ((zak0) arq0Var.r).getValue();
                        if (authorHeaderConfig != null) {
                            if (authorHeaderConfig.c.a == AuthorHeaderConfig.Viewer.ViewerRole.Owner) {
                                View view2 = ((arq0) gwn0Var.c).itemView;
                                if (view2 != null) {
                                    boolean z = authorHeaderConfig.a.a instanceof a.C1660a;
                                    ja5 ja5Var = (ja5) ((zak0) wh50Var).getValue();
                                    int i5 = (ja5Var == null || (a2 = ja5Var.a()) == null) ? 0 : a2.b;
                                    boolean z2 = i5 == 0;
                                    ax0 ax0Var = new ax0(arq0Var, 7);
                                    tqq0 tqq0Var = new tqq0(ax0Var, new rtg0(arq0Var, i2));
                                    jzd jzdVar = new jzd(arq0Var, i5, r6 ? 1 : 0);
                                    tfm0 tfm0Var = new tfm0(arq0Var, 9);
                                    em00 em00Var = new em00(i5, r6 ? 1 : 0, arq0Var);
                                    qkq qkqVar = new qkq(arq0Var, i5, i3);
                                    uqq0 uqq0Var = new uqq0(z, z2, new sqq0(jzdVar, tfm0Var, em00Var, qkqVar), tqq0Var);
                                    ListBuilder e2 = e43.e();
                                    p4g.a(rqq0.ViewPhotos, e2, z);
                                    p4g.a(rqq0.EditPhoto, e2, z2);
                                    p4g.a(rqq0.SetPhotoAsAvatar, e2, z && !z2);
                                    p4g.a(rqq0.DeletePhoto, e2, z);
                                    ListBuilder g = e2.g();
                                    if (!g.isEmpty()) {
                                        if (g.size() == 1) {
                                            int i6 = vqq0.$EnumSwitchMapping$0[((rqq0) j5g.z0(g)).ordinal()];
                                            if (i6 == 1) {
                                                jzdVar.invoke();
                                            } else if (i6 == 2) {
                                                tfm0Var.invoke();
                                            } else if (i6 == 3) {
                                                em00Var.invoke();
                                            } else {
                                                if (i6 != 4) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                qkqVar.invoke();
                                            }
                                        } else {
                                            ax0Var.invoke();
                                            Context context = view2.getContext();
                                            int l = krv0.l(R.attr.vk_ui_icon_accent);
                                            view2.getContext();
                                            e.c cVar4 = new e.c(null, K, view2, l, 1);
                                            ArrayList arrayList = new ArrayList(c5g.u(g, 10));
                                            ListIterator listIterator = g.listIterator(0);
                                            while (true) {
                                                ListBuilder.a aVar3 = (ListBuilder.a) listIterator;
                                                if (aVar3.hasNext()) {
                                                    rqq0 rqq0Var = (rqq0) aVar3.next();
                                                    String string = context.getString(rqq0Var.i());
                                                    int h = rqq0Var.h();
                                                    e3m.a aVar4 = e3m.a;
                                                    arrayList.add(new VkContextMenu.a(string, m33.a(h, context), Integer.valueOf(e3m.f(R.attr.vk_ui_icon_primary, context)), false, false, new dvk0(i4, rqq0Var, uqq0Var), 24));
                                                } else {
                                                    cVar4.h(arrayList);
                                                    tqq0Var.b.invoke(cVar4.l(true));
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                ja5 ja5Var2 = (ja5) ((zak0) wh50Var).getValue();
                                slq0Var.a(new UserProfileAction.d.b.a.C1677d((ja5Var2 == null || (a = ja5Var2.a()) == null) ? 0 : a.b));
                            }
                        }
                    } else if (aVar2 instanceof com.vk.profile.design.compose.header.sink.c) {
                        int i7 = arq0.b.$EnumSwitchMapping$0[((com.vk.profile.design.compose.header.sink.c) aVar2).a.ordinal()];
                        if (i7 == 1 || i7 == 2) {
                            slq0Var.a(UserProfileAction.d.c.AbstractC1681d.b.b);
                        }
                    } else if (aVar2 instanceof com.vk.profile.design.compose.header.sink.a) {
                        slq0Var.a(UserProfileAction.d.c.AbstractC1681d.a.b);
                    } else if ((aVar2 instanceof AuthorHeaderEvent.a.InterfaceC1662a) && (((AuthorHeaderEvent.a.InterfaceC1662a) aVar2) instanceof AuthorHeaderEvent.a.InterfaceC1662a.C1663a)) {
                        slq0Var.a(UserProfileAction.d.c.b.a.b);
                    }
                } else {
                    if (!(authorHeaderEvent instanceof AuthorHeaderEvent.Info)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AuthorHeaderEvent.Info info = (AuthorHeaderEvent.Info) authorHeaderEvent;
                    if (epx.f(info, com.vk.profile.design.compose.header.sink.f.a)) {
                        userProfileAction = UserProfileAction.d.AbstractC1682d.c.b.b;
                    } else if (info instanceof com.vk.profile.design.compose.header.sink.h) {
                        userProfileAction = new UserProfileAction.d.AbstractC1682d.c.a(((com.vk.profile.design.compose.header.sink.h) info).a);
                    } else if (epx.f(info, com.vk.profile.design.compose.header.sink.e.a)) {
                        userProfileAction = UserProfileAction.d.AbstractC1682d.a.b;
                    } else if (epx.f(info, AuthorHeaderEvent.Info.SubscribersClick.a.a)) {
                        userProfileAction = UserProfileAction.d.AbstractC1682d.AbstractC1683d.a.b;
                    } else if (info instanceof AuthorHeaderEvent.Info.SubscribersClick.b) {
                        int i8 = arq0.b.$EnumSwitchMapping$2[((AuthorHeaderEvent.Info.SubscribersClick.b) info).a.ordinal()];
                        if (i8 == 1) {
                            userProfileAction = UserProfileAction.c.b;
                        } else if (i8 == 2) {
                            userProfileAction = UserProfileAction.t.b;
                        } else {
                            if (i8 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            userProfileAction = UserProfileAction.j.b;
                        }
                    } else if (info instanceof AuthorHeaderEvent.Info.SubscribersClick.d) {
                        zhf0 zhf0Var2 = ((AuthorHeaderEvent.Info.SubscribersClick.d) info).a;
                        if (zhf0Var2.g()) {
                            zhf0Var2 = null;
                        }
                        userProfileAction = new UserProfileAction.d.AbstractC1682d.AbstractC1683d.c(gwn0Var, zhf0Var2 != null ? xa4.K(zhf0Var2) : null);
                    } else if (info instanceof AuthorHeaderEvent.Info.SubscribersClick.c) {
                        userProfileAction = UserProfileAction.d.AbstractC1682d.AbstractC1683d.b.b;
                    } else if ((info instanceof AuthorHeaderEvent.Info.a) && (((AuthorHeaderEvent.Info.a) info).a instanceof AuthorHeaderConfig.Info.InfoSlotData.c.b)) {
                        userProfileAction = UserProfileAction.d.AbstractC1682d.b.a.b;
                    }
                    slq0Var.a(userProfileAction);
                }
                return s3q0.a;
            case 26:
                isq0 isq0Var = (isq0) this.c;
                WallWithCounters wallWithCounters = (WallWithCounters) obj;
                int i9 = 29;
                return new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.r(io.reactivex.rxjava3.core.x.k(wallWithCounters), new ie40(new gsq0(isq0Var, objArr2 == true ? 1 : 0), 18)).l(new je40(new hsq0(isq0Var, objArr == true ? 1 : 0), 15)), new rt10(new bl30(isq0Var, i9), 20)).l(new a0m0(new t440(wallWithCounters, i9), i));
            case 27:
                cvq0 cvq0Var = (cvq0) this.c;
                Pair pair2 = (Pair) obj;
                it80 it80Var = (it80) pair2.i();
                it80 it80Var2 = (it80) pair2.j();
                izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar = cvq0Var.c;
                if (izsVar == null) {
                    izsVar = null;
                }
                WallGetResponseDto wallGetResponseDto = (WallGetResponseDto) it80Var.a;
                izsVar.invoke(new b.o(wallGetResponseDto != null ? wallGetResponseDto.getCount() : 0));
                izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar2 = cvq0Var.c;
                izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar3 = izsVar2 != null ? izsVar2 : null;
                WallGetResponseDto wallGetResponseDto2 = (WallGetResponseDto) it80Var2.a;
                izsVar3.invoke(new b.g(wallGetResponseDto2 != null ? wallGetResponseDto2.getCount() : 0));
                return s3q0.a;
            case 28:
                VkImAvatar vkImAvatar = (VkImAvatar) obj;
                h0r0.a aVar5 = (h0r0.a) ((VkTile.h) this.c);
                Drawable drawable = aVar5.b;
                if (drawable != null) {
                    VkImAvatar.c1(vkImAvatar, null);
                    vkImAvatar.setImageDrawable(drawable);
                }
                qtd0 qtd0Var = aVar5.a;
                if (qtd0Var != null) {
                    VkImAvatar.c1(vkImAvatar, qtd0Var);
                }
                return s3q0.a;
            default:
                fxc0.B().r0(((VideoAlbum) this.c).zb());
                return s3q0.a;
        }
    }
}
