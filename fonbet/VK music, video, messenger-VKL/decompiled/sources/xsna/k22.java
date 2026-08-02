package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.location.Location;
import android.net.Uri;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.catalog.mvi.block.video.impl.p002short.ClipListView;
import com.vk.catalog2.common.dto.api.music.CatalogMusicTrackLocalState;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.mvp.holder.group.GroupCardItemVh;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicTrack;
import com.vk.catalog2.feature.music.dto.ui.search.UIBlockSearchHistory;
import com.vk.core.ui.modal.VkModal;
import com.vk.core.ui.modal.b;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.AdminLeaveAction;
import com.vk.dto.group.Group;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.photo.Photo;
import com.vk.dto.user.UserProfile;
import com.vk.imageloader.view.VKImageView;
import com.vk.log.L;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.ShuffleMode;
import com.vk.newsfeed.posting.geo_picker.presentation.PlacePickerState;
import com.vk.newsfeed.posting.geo_picker.presentation.g;
import com.vk.pushes.receivers.c;
import com.vk.stickers.api.models.photo.PhotoStickerStyle;
import com.vk.superapp.ui.widgets.menu.ExpandableMenuState;
import com.vk.video.ui.upload.impl.publish.domain.model.PrivacyDo;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.friends.FriendsFragment;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.awr0;
import xsna.c5v0;
import xsna.chd;
import xsna.dai;
import xsna.dqe0;
import xsna.dra0;
import xsna.dra0.a;
import xsna.dvv;
import xsna.edl0;
import xsna.efb;
import xsna.fh8;
import xsna.gh8;
import xsna.h1p0;
import xsna.hzf0;
import xsna.ij20;
import xsna.k840;
import xsna.mr70;
import xsna.o4q0;
import xsna.t8s;
import xsna.tlo0;
import xsna.xdg0.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class k22 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k22(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02e6  */
    /* JADX WARN: Type inference failed for: r8v0, types: [xsna.c5v0$a$a] */
    /* JADX WARN: Type inference failed for: r8v2 */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        gzs qe3Var;
        Object uIBlockSearchHistoryTrack;
        ppk0 ppk0Var;
        VKImageView vKImageView;
        com.vk.clips.tool.view.nps.internal.moreless.a aVar;
        VKImageView vKImageView2;
        int i;
        int i2;
        List list;
        int i3 = 10;
        int i4 = 12;
        int i5 = 6;
        int i6 = 2;
        int i7 = 1;
        r8 = null;
        r3a r3aVar = null;
        Object obj2 = null;
        switch (this.b) {
            case 0:
                String str = (String) this.c;
                com.vk.catalog2.common.ui.mvp.auto.a aVar2 = (com.vk.catalog2.common.ui.mvp.auto.a) this.d;
                VKList vKList = (VKList) obj;
                MusicTrack musicTrack = (MusicTrack) j5g.a0(vKList);
                bn40.f("Search tracks successfully loaded, query:", str, "count:", Integer.valueOf(vKList.size()));
                aVar2.f(MusicPlaybackLaunchContext.H, musicTrack, vKList, UUID.randomUUID().toString(), PlayRequestTrigger.FAST_PLAY_SINGLE_AUDIO, ShuffleMode.SHUFFLE_AUTO);
                return s3q0.a;
            case 1:
                lgb lgbVar = (lgb) this.c;
                j0b j0bVar = ((n0b) this.d).n;
                lgbVar.x(j0bVar != null ? j0bVar : 0);
                return s3q0.a;
            case 2:
                l7r0 l7r0Var = (l7r0) this.c;
                efb efbVar = (efb) this.d;
                ij20.a aVar3 = new ij20.a();
                aVar3.d = l7r0Var.a.g;
                aVar3.c = "channels.getById";
                aVar3.b("channel_ids", p4g.k((List) obj, StringUtils.COMMA, new z90(11)));
                if (efbVar.d) {
                    Integer num = 1;
                    aVar3.f.put("extended", num.toString());
                    aVar3.b("fields", ky2.d + ", " + ky2.b);
                }
                aVar3.i = efbVar.c;
                ij20 ij20Var = new ij20(aVar3);
                efb.a aVar4 = new efb.a();
                return (efb.b) bz2.k(ij20Var, aVar4, new ax5(l7r0Var, ij20Var, aVar4, i7));
            case 3:
                ClipListView.c cVar = (ClipListView.c) this.c;
                dai.c cVar2 = (dai.c) this.d;
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.r(tgi0Var, "mvi_catalog_short_video_card_test_tag");
                boolean z = cVar.d;
                sgi0<Boolean> sgi0Var = bgi0.i;
                qcy<Object> qcyVar = bgi0.a[7];
                Boolean valueOf = Boolean.valueOf(z);
                sgi0Var.getClass();
                tgi0Var.a(sgi0Var, valueOf);
                if (cVar2 == null || (qe3Var = cVar2.c) == null) {
                    qe3Var = new qe3(9);
                }
                bgi0.c(tgi0Var, qe3Var);
                String str2 = cVar.c;
                if (str2 == null) {
                    str2 = "";
                }
                bgi0.e(tgi0Var, str2);
                return s3q0.a;
            case 4:
                thd thdVar = (thd) this.c;
                UserId userId = (UserId) this.d;
                List list2 = (List) obj;
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    xg5.a().D().h0((Group) it.next());
                }
                Iterator it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        if (Math.abs(((Group) next).c.b) == Math.abs(userId.b)) {
                            obj2 = next;
                        }
                    }
                }
                Group group = (Group) obj2;
                if (group != null) {
                    thdVar.h(new chd.b(group.c, group.d), false);
                } else {
                    L.l("ClipsAuthorsInteractorImpl", b4q.b(userId, "Created channel not found in groups list: "));
                }
                return s3q0.a;
            case 5:
                wh50 wh50Var = (wh50) this.c;
                wh50 wh50Var2 = (wh50) this.d;
                k8s k8sVar = (k8s) obj;
                k8sVar.a(new t8s.a(wh50Var));
                k8sVar.a(new t8s.b(wh50Var2));
                return s3q0.a;
            case 6:
                ArrayList arrayList = (ArrayList) this.c;
                FriendsFragment friendsFragment = (FriendsFragment) this.d;
                int i8 = FriendsFragment.q0;
                Intent intent = new Intent();
                intent.putExtra("result_file", (Uri) obj);
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(Long.valueOf(((UserProfile) it3.next()).c.b));
                }
                intent.putExtra("result_ids", j5g.P0(arrayList2));
                friendsFragment.Mf(-1, intent);
                return s3q0.a;
            case 7:
                Image image = (Image) this.c;
                GroupCardItemVh groupCardItemVh = (GroupCardItemVh) this.d;
                ImageSize Cb = image.Cb(((View) obj).getWidth(), true, true);
                String str3 = Cb != null ? Cb.d.d : null;
                if (str3 != null) {
                    VKImageView vKImageView3 = groupCardItemVh.i;
                    (vKImageView3 != null ? vKImageView3 : null).load(str3);
                }
                return s3q0.a;
            case 8:
                dvv dvvVar = (dvv) this.c;
                dvvVar.d.invoke(dvvVar.c, ((avv) dvvVar.e.get(((dvv.c) this.d).getAdapterPosition())).b.getType());
                return s3q0.a;
            case 9:
                l2y l2yVar = (l2y) this.c;
                kp5 kp5Var = (kp5) this.d;
                l2yVar.i.e();
                kp5Var.invoke(Boolean.FALSE);
                return s3q0.a;
            case 10:
                gdj0 gdj0Var = (gdj0) this.c;
                if2 if2Var = (if2) this.d;
                tdu tduVar = (tdu) obj;
                float floatValue = ((vak0) gdj0Var.d.j).getFloatValue();
                float intBitsToFloat = Float.intBitsToFloat((int) (tduVar.d() & 4294967295L));
                if (!Float.isNaN(floatValue) && !Float.isNaN(intBitsToFloat) && intBitsToFloat != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    float floatValue2 = ((Number) if2Var.d()).floatValue();
                    tduVar.A(sx20.d(tduVar, floatValue2));
                    tduVar.B(sx20.e(tduVar, floatValue2));
                    tduVar.Y0(f370.i(0.5f, (floatValue + intBitsToFloat) / intBitsToFloat));
                }
                return s3q0.a;
            case 11:
                MusicTrack musicTrack2 = (MusicTrack) this.c;
                Playlist playlist = (Playlist) this.d;
                Pair pair = (Pair) obj;
                bn40.g("addMusicToPlaylist", pair.j());
                MusicTrack Ab = musicTrack2.Ab();
                Integer N = rl3.N((int[]) pair.i());
                if (N != null) {
                    int intValue = N.intValue();
                    Ab.c = o25.a().c();
                    Ab.b = intValue;
                }
                r5v0 r5v0Var = k840.a.h;
                if (r5v0Var == null) {
                    r5v0Var = null;
                }
                r5v0Var.b(new bb50(playlist.Ib()));
                r5v0 r5v0Var2 = k840.a.h;
                (r5v0Var2 != null ? r5v0Var2 : null).b(new reb0((Playlist) pair.j(), Collections.singletonList(Ab)));
                return s3q0.a;
            case 12:
                MusicTrack musicTrack3 = (MusicTrack) this.c;
                MusicTrack musicTrack4 = (MusicTrack) this.d;
                UIBlock uIBlock = (UIBlock) obj;
                if (uIBlock instanceof UIBlockMusicTrack) {
                    UIBlockMusicTrack uIBlockMusicTrack = (UIBlockMusicTrack) uIBlock;
                    if (!epx.f(uIBlockMusicTrack.z.Z, musicTrack3.Fb()) || musicTrack4.W == null) {
                        return new UIBlockMusicTrack(uIBlockMusicTrack, musicTrack3, null, null, 12, null);
                    }
                    uIBlockSearchHistoryTrack = new UIBlockMusicTrack(uIBlockMusicTrack, MusicTrack.zb(uIBlockMusicTrack.z, 0, null, 0, 0, null, false, null, musicTrack3.J, false, false, null, null, null, -1, 1015803), null, null, 12, null);
                } else {
                    if (!(uIBlock instanceof UIBlockSearchHistory.UIBlockSearchHistoryTrack)) {
                        return uIBlock;
                    }
                    UIBlockSearchHistory.UIBlockSearchHistoryTrack uIBlockSearchHistoryTrack2 = (UIBlockSearchHistory.UIBlockSearchHistoryTrack) uIBlock;
                    if (!epx.f(uIBlockSearchHistoryTrack2.A.Z, musicTrack3.Fb()) || musicTrack4.W == null) {
                        return new UIBlockSearchHistory.UIBlockSearchHistoryTrack(uIBlockSearchHistoryTrack2, musicTrack3, (CatalogMusicTrackLocalState) null, 4, (zcl) null);
                    }
                    uIBlockSearchHistoryTrack = new UIBlockSearchHistory.UIBlockSearchHistoryTrack(uIBlockSearchHistoryTrack2, MusicTrack.zb(uIBlockSearchHistoryTrack2.A, 0, null, 0, 0, null, false, null, musicTrack3.J, false, false, null, null, null, -1, 1015803), (CatalogMusicTrackLocalState) null, 4, (zcl) null);
                }
                return uIBlockSearchHistoryTrack;
            case 13:
                Context context = (Context) this.c;
                Intent intent2 = (Intent) this.d;
                c.a aVar5 = com.vk.pushes.receivers.c.b;
                c.a.f(context, intent2, false);
                return s3q0.a;
            case 14:
                izs izsVar = (izs) this.c;
                nr70 nr70Var = (nr70) this.d;
                String str4 = (String) obj;
                Object obj3 = naz.a;
                if (drm0.D(str4, "bid.".concat(a0a.d) + "/?action=need_verify", false)) {
                    izsVar.invoke(mr70.j.b);
                } else {
                    izsVar.invoke(new mr70.f(str4, nr70Var.a));
                }
                return s3q0.a;
            case 15:
                PlacePickerState placePickerState = (PlacePickerState) this.c;
                dra0 dra0Var = (dra0) this.d;
                Location location = ((dra0.c) obj).a;
                return (location != null || placePickerState.e.length() > 0) ? io.reactivex.rxjava3.core.x.x(dra0Var.new a().b(dra0Var.b.b(placePickerState.e, location, dra0Var.d, placePickerState.d))).l(new xw70(new v63(dra0Var, placePickerState.e, location, i3), i6)) : io.reactivex.rxjava3.core.x.k(new g.C1416g(placePickerState.e, location, EmptyList.b, 0, 0, true));
            case 16:
                qhb0 qhb0Var = (qhb0) this.c;
                UserId userId2 = (UserId) this.d;
                if (((BaseBoolIntDto) obj) != BaseBoolIntDto.YES) {
                    return io.reactivex.rxjava3.core.a.k(new VKApiException("Can`t subscribe to podcast"));
                }
                qhb0Var.b.b(new ljb0(userId2));
                return io.reactivex.rxjava3.internal.operators.completable.i.b;
            case 17:
                PublishState publishState = (PublishState) obj;
                return PublishState.a(publishState, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, null, PrivacyDo.a(publishState.r, ((kbe0) this.d).b.e, null, (String) this.c, 2), null, null, null, null, null, false, false, false, null, null, null, null, false, null, null, false, false, null, false, false, null, false, false, false, false, -65537, 2047);
            case 18:
                aqe0 aqe0Var = (aqe0) this.c;
                FrameLayout frameLayout = (FrameLayout) this.d;
                dqe0 dqe0Var = (dqe0) obj;
                int i9 = aqe0.m1;
                if (dqe0Var instanceof dqe0.a) {
                    dqe0.a aVar6 = (dqe0.a) dqe0Var;
                    if (frameLayout.getChildCount() == 1) {
                        View childAt = frameLayout.getChildAt(0);
                        if (childAt instanceof r3a) {
                            r3aVar = (r3a) childAt;
                        }
                    }
                    if (r3aVar == null) {
                        r3aVar = new r3a(aqe0Var.requireContext());
                        p2u0.a(frameLayout, r3aVar);
                    }
                    r3aVar.U4(aVar6);
                    aqe0Var.sj(aVar6.a().a(aqe0Var.requireContext()).toString());
                    r3aVar.setActionListener(new m360(aqe0Var, i4));
                } else if (dqe0Var instanceof dqe0.c) {
                    dqe0.c cVar3 = (dqe0.c) dqe0Var;
                    tlo0.h hVar = cVar3.b;
                    if (frameLayout.getChildCount() == 1) {
                        View childAt2 = frameLayout.getChildAt(0);
                        if (childAt2 instanceof com.vk.clips.tool.view.nps.internal.moreless.a) {
                            aVar = (com.vk.clips.tool.view.nps.internal.moreless.a) childAt2;
                            if (aVar == null) {
                                aVar = new com.vk.clips.tool.view.nps.internal.moreless.a(aqe0Var.requireContext());
                                p2u0.a(frameLayout, aVar);
                            }
                            vKImageView2 = aVar.t;
                            if (vKImageView2.getMeasuredWidth() != 0 || vKImageView2.getMeasuredHeight() == 0) {
                                vKImageView2.addOnLayoutChangeListener(new w830(aVar, cVar3));
                            } else {
                                ImageSize Cb2 = cVar3.a.Cb(vKImageView2.getWidth(), true, false);
                                vKImageView2.load(Cb2 != null ? Cb2.d.d : null);
                            }
                            aVar.v.setText(tlo0.b.a(hVar, aVar.getContext()));
                            aqe0Var.sj(tlo0.b.a(hVar, aqe0Var.requireContext()).toString());
                            aVar.setFeedbackObserver(new hsc0(aqe0Var, i6));
                        }
                    }
                    aVar = null;
                    if (aVar == null) {
                    }
                    vKImageView2 = aVar.t;
                    if (vKImageView2.getMeasuredWidth() != 0) {
                    }
                    vKImageView2.addOnLayoutChangeListener(new w830(aVar, cVar3));
                    aVar.v.setText(tlo0.b.a(hVar, aVar.getContext()));
                    aqe0Var.sj(tlo0.b.a(hVar, aqe0Var.requireContext()).toString());
                    aVar.setFeedbackObserver(new hsc0(aqe0Var, i6));
                } else if (dqe0Var instanceof dqe0.f) {
                    dqe0.f fVar = (dqe0.f) dqe0Var;
                    tlo0.h hVar2 = fVar.b;
                    if (frameLayout.getChildCount() == 1) {
                        View childAt3 = frameLayout.getChildAt(0);
                        if (childAt3 instanceof ppk0) {
                            ppk0Var = (ppk0) childAt3;
                            if (ppk0Var == null) {
                                ppk0Var = new ppk0(aqe0Var.requireContext());
                                p2u0.a(frameLayout, ppk0Var);
                            }
                            vKImageView = ppk0Var.t;
                            if (vKImageView.getMeasuredWidth() != 0 || vKImageView.getMeasuredHeight() == 0) {
                                vKImageView.addOnLayoutChangeListener(new opk0(ppk0Var, fVar));
                            } else {
                                ImageSize Cb3 = fVar.a.Cb(vKImageView.getWidth(), true, false);
                                vKImageView.load(Cb3 != null ? Cb3.d.d : null);
                            }
                            ppk0Var.v.setText(tlo0.b.a(hVar2, ppk0Var.getContext()));
                            aqe0Var.sj(tlo0.b.a(hVar2, aqe0Var.requireContext()).toString());
                            ppk0Var.setFeedbackObserver(new el30(aqe0Var, 24));
                        }
                    }
                    ppk0Var = null;
                    if (ppk0Var == null) {
                    }
                    vKImageView = ppk0Var.t;
                    if (vKImageView.getMeasuredWidth() != 0) {
                    }
                    vKImageView.addOnLayoutChangeListener(new opk0(ppk0Var, fVar));
                    ppk0Var.v.setText(tlo0.b.a(hVar2, ppk0Var.getContext()));
                    aqe0Var.sj(tlo0.b.a(hVar2, aqe0Var.requireContext()).toString());
                    ppk0Var.setFeedbackObserver(new el30(aqe0Var, 24));
                } else {
                    if (!(dqe0Var instanceof dqe0.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    frameLayout.removeAllViews();
                }
                return s3q0.a;
            case 19:
                Handler handler = (Handler) this.c;
                final hzf0.a aVar7 = (hzf0.a) this.d;
                final long longValue = ((Long) obj).longValue();
                handler.post(new Runnable() { // from class: xsna.gzf0
                    @Override // java.lang.Runnable
                    public final void run() {
                        hzf0.a.this.b(longValue);
                    }
                });
                return s3q0.a;
            case 20:
                xdg0 xdg0Var = (xdg0) this.c;
                wh50 wh50Var3 = xdg0Var.a;
                Context context2 = (Context) this.d;
                VkModal.Mode mode = VkModal.Mode.Card;
                if (((Boolean) ((zak0) xdg0Var.b).getValue()).booleanValue()) {
                    i = R.drawable.vk_icon_check_circle_outline_56;
                    i2 = R.attr.vk_ui_icon_accent;
                } else {
                    i = R.drawable.vk_icon_info_outline_56;
                    i2 = R.attr.vk_ui_icon_secondary;
                }
                c5v0.c.b bVar = new c5v0.c.b(new gko(i), new x7g(i2), null, 12);
                c5v0.b bVar2 = new c5v0.b(i4, oq.d(tlo0.Companion, ((o4q0.a) ((zak0) wh50Var3).getValue()).a), new tlo0.h(((o4q0.a) ((zak0) wh50Var3).getValue()).b));
                String str5 = ((o4q0.a) ((zak0) wh50Var3).getValue()).c;
                ((zak0) xdg0Var.e).setValue(new VkModal(mode, new b.a.C0790b(bVar, bVar2, null, str5 == null ? null : new c5v0.a(new c5v0.a.C2643a(new tlo0.h(str5), new lo10(xdg0Var, 29), null, null, null, false, IronSourceError.ERROR_CODE_INIT_FAILED), (c5v0.a.C2643a) r8, i5), 52), new wf40(xdg0Var, 23), false, 20).b(context2, null));
                return xdg0Var.new a();
            case 21:
                Uri uri = (Uri) this.c;
                dfi0 dfi0Var = (dfi0) this.d;
                PhotoStickerStyle.Companion.getClass();
                list = PhotoStickerStyle.patterns;
                c8m0 c8m0Var = new c8m0((Bitmap) obj, (PhotoStickerStyle) j5g.Y(list), true, true);
                c8m0Var.n = uri.toString();
                dfi0Var.b.a(c8m0Var);
                return s3q0.a;
            case 22:
                clj0 clj0Var = (clj0) this.c;
                gh8.d.a aVar8 = (gh8.d.a) this.d;
                clj0Var.e.invoke(new fh8.h.b(aVar8.a, aVar8.b));
                return s3q0.a;
            case 23:
                ((edl0.b) this.c).m.a(((z690) this.d).b);
                return s3q0.a;
            case 24:
                ((agm0) this.c).b.g((hyg0) obj, (ArrayList) this.d);
                return s3q0.a;
            case 25:
                yzm0 yzm0Var = (yzm0) this.c;
                Activity activity = (Activity) this.d;
                yzm0Var.getClass();
                yzm0Var.b.b(bug0.d(o0r0.e(xwk.e(), yzm0Var.a.b, null, null, (AdminLeaveAction) obj, 6).a0(io.reactivex.rxjava3.android.schedulers.a.b()), activity, null, 6).subscribe(new eiy(new hsc0(yzm0Var, 17), 21)));
                return s3q0.a;
            case 26:
                ((a8n0) this.c).q.h1((j8q) this.d, ExpandableMenuState.EXPANDED);
                return s3q0.a;
            case 27:
                return new h1p0.b((ViewGroup) obj, (d0r0) this.c, (nc6) this.d);
            case 28:
                s2u0 s2u0Var = (s2u0) obj;
                ((izs) this.c).invoke(new awr0.g(((dqt0) this.d).b, s2u0Var.a, s2u0Var.b));
                return s3q0.a;
            default:
                ((z8u0) this.c).I.add(Integer.valueOf(((Photo) this.d).c));
                return s3q0.a;
        }
    }

    public /* synthetic */ k22(kbe0 kbe0Var, String str) {
        this.b = 17;
        this.d = kbe0Var;
        this.c = str;
    }
}
