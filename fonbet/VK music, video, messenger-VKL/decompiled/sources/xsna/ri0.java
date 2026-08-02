package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.location.Location;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.catalog2.common.dto.ui.UIBlockSearchAuthor;
import com.vk.catalog2.common.ui.holders.sticker.StickerPackVerticalListItemVh;
import com.vk.catalog2.common.ui.mvp.friend.FriendsCatalogFragment;
import com.vk.catalog2.feature.music.ui.holder.MusicHidingToolbarVh;
import com.vk.clips.clipsaudio.views.ClipsAudioFragment;
import com.vk.clips.sdk.stats.pixels.models.AdStatPixel;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.search.SearchAuthorItem;
import com.vk.dto.stickers.StickerPackPreviewModel;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.user.UserProfile;
import com.vk.dto.video.VideoAlbum;
import com.vk.ecomm.reviews.impl.allreviews.presentation.a;
import com.vk.ecomm.reviews.impl.allreviews.presentation.c;
import com.vk.feed.core.models.feedback.ButtonsFeedback;
import com.vk.feed.core.models.feedback.StarsFeedback;
import com.vk.folders.impl.configure.g;
import com.vk.friends.impl.cleanup.presentation.fragment.FriendsCleanupFragment;
import com.vk.im.engine.internal.merge.messages.ChannelMsgHistoryFromServerMergeTask;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogsHistory;
import com.vk.im.engine.models.messages.Msg;
import com.vk.log.L;
import com.vk.onboarding.api.dto.VkOnboardingType;
import com.vk.profile.community.creationonboarding.impl.tasks.presentation.feature.SnackBar;
import com.vk.stickers.keyboard.StickersView;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.location.js.bridge.api.events.GetGeodata$Measurement;
import com.vk.superapp.location.js.bridge.api.events.GetGeodata$Parameters;
import com.vk.superapp.location.js.bridge.api.events.GetGeodata$Response;
import com.vk.topics.impl.fragments.BoardTopicViewFragment;
import com.vk.topics.impl.fragments.BoardTopicsFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.SetBuilder;
import kotlin.jvm.internal.Ref$IntRef;
import ru.ok.android.webrtc.opengl.CallOpenGLContext;
import ru.ok.android.webrtc.opengl.CallOpenGLDrawer;
import ru.ok.android.webrtc.opengl.CallOpenGLRenderer;
import xsna.c090;
import xsna.cck;
import xsna.drz;
import xsna.e8v0;
import xsna.h2g0;
import xsna.i1s;
import xsna.ikv0;
import xsna.j7d0;
import xsna.li7;
import xsna.nlh;
import xsna.num;
import xsna.oap;
import xsna.qms;
import xsna.tra0;
import xsna.uns;
import xsna.uzr;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ri0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ri0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v94, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        oap bVar;
        UserId userId;
        int i = this.b;
        int i2 = 15;
        int i3 = 16;
        int i4 = 3;
        char c = 1;
        int i5 = 0;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ti0 ti0Var = (ti0) obj3;
                AdStatPixel adStatPixel = (AdStatPixel) obj2;
                ConcurrentHashMap concurrentHashMap = ti0Var.d;
                Integer num = (Integer) concurrentHashMap.get(adStatPixel);
                int intValue = num != null ? num.intValue() : 0;
                if (intValue < 3) {
                    int i6 = intValue + 1;
                    io.reactivex.rxjava3.schedulers.a.c().d(new si0(i5, ti0Var, adStatPixel), i6 * 5000, TimeUnit.MILLISECONDS);
                    concurrentHashMap.put(adStatPixel, Integer.valueOf(i6));
                } else {
                    concurrentHashMap.remove(adStatPixel);
                }
                return s3q0.a;
            case 1:
                gzs gzsVar = (gzs) obj2;
                ((com.vk.music.player.a) obj3).d = (lqk0) obj;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 2:
                mg6 mg6Var = (mg6) obj3;
                GetGeodata$Parameters getGeodata$Parameters = (GetGeodata$Parameters) obj2;
                Location location = (Location) obj;
                mg6Var.getClass();
                String c2 = getGeodata$Parameters != null ? getGeodata$Parameters.c() : null;
                if (((int) location.getLatitude()) == 0 && ((int) location.getLongitude()) == 0) {
                    mg6Var.j(c2);
                } else {
                    GetGeodata$Measurement getGeodata$Measurement = new GetGeodata$Measurement(location.hasAltitude(), Float.valueOf((float) location.getAltitude()), Boolean.valueOf(mg6Var.h() ? location.hasVerticalAccuracy() : false), mg6Var.h() ? Float.valueOf(location.getVerticalAccuracyMeters()) : null, mg6Var.h() ? Boolean.valueOf(!location.hasVerticalAccuracy()) : null);
                    GetGeodata$Measurement getGeodata$Measurement2 = new GetGeodata$Measurement(location.hasSpeed(), Float.valueOf(location.getSpeed()), Boolean.valueOf(mg6Var.h() ? location.hasSpeedAccuracy() : false), mg6Var.h() ? Float.valueOf(location.getSpeedAccuracyMetersPerSecond()) : null, mg6Var.h() ? Boolean.valueOf(!location.hasSpeedAccuracy()) : null);
                    GetGeodata$Measurement getGeodata$Measurement3 = new GetGeodata$Measurement(location.hasBearing(), Float.valueOf(location.getBearing()), Boolean.valueOf(mg6Var.h() ? location.hasBearingAccuracy() : false), mg6Var.h() ? Float.valueOf(location.getBearingAccuracyDegrees()) : null, mg6Var.h() ? Boolean.valueOf(!location.hasBearingAccuracy()) : null);
                    d2n0 d2n0Var = (d2n0) ((bpn0) mg6Var.e).getValue();
                    d2n0Var.getClass();
                    List l = e43.l(getGeodata$Measurement.a(), getGeodata$Measurement2.a(), getGeodata$Measurement3.a());
                    List V = j5g.V(l);
                    if (!V.isEmpty()) {
                        Iterator it = V.iterator();
                        while (it.hasNext()) {
                            if (((Boolean) it.next()).booleanValue() && (i5 = i5 + 1) < 0) {
                                e43.s();
                                throw null;
                            }
                        }
                    }
                    String str = c2;
                    com.vk.superapp.base.js.bridge.b.p(d2n0Var.a, new JsMethod("VKWebAppGetGeodata"), new GetGeodata$Response(null, new GetGeodata$Response.Data(true, Float.valueOf((float) location.getLatitude()), Float.valueOf((float) location.getLongitude()), Float.valueOf(location.getAccuracy()), Boolean.valueOf(!location.hasAccuracy()), i5 == 0 ? GetGeodata$Response.Data.MeasurementQuality.OK : i5 == l.size() ? GetGeodata$Response.Data.MeasurementQuality.BAD : GetGeodata$Response.Data.MeasurementQuality.WARNING, getGeodata$Measurement, getGeodata$Measurement2, getGeodata$Measurement3, str), str, 1, null), null, null, false, null, 52);
                }
                return s3q0.a;
            case 3:
                BoardTopicsFragment boardTopicsFragment = (BoardTopicsFragment) obj3;
                int i7 = BoardTopicsFragment.S0;
                ((ysg0) boardTopicsFragment.P0.getValue()).a(new li7.a(boardTopicsFragment.No()));
                new BoardTopicViewFragment.a(((Integer) obj).intValue(), boardTopicsFragment.No(), (String) obj2).k(boardTopicsFragment.getActivity());
                return s3q0.a;
            case 4:
                ((ds8) obj3).T6((ButtonsFeedback) obj2);
                return s3q0.a;
            case 5:
                return CallOpenGLRenderer.a((CallOpenGLRenderer) obj3, (CallOpenGLDrawer) obj2, (CallOpenGLContext) obj);
            case 6:
                y4b y4bVar = (y4b) obj3;
                zt90 zt90Var = (zt90) obj2;
                ChannelMsgHistoryFromServerMergeTask channelMsgHistoryFromServerMergeTask = new ChannelMsgHistoryFromServerMergeTask(zt90Var.a.a, zt90Var.f, zt90Var.b, ChannelMsgHistoryFromServerMergeTask.HistorySource.API, y4bVar.c, !zt90Var.d, !zt90Var.e, 384);
                w2w w2wVar = y4bVar.b;
                channelMsgHistoryFromServerMergeTask.o(w2wVar);
                ProfilesSimpleInfo profilesSimpleInfo = zt90Var.c;
                if (profilesSimpleInfo.Gb()) {
                    xuo0.a.getClass();
                    new h1e0(profilesSimpleInfo, xuo0.a(), true).o(w2wVar);
                }
                return s3q0.a;
            case 7:
                VkImageSimple vkImageSimple = ((ClipsAudioFragment.b) obj2).f;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                xk80 xk80Var = ((ClipsAudioFragment) obj3).U;
                if (xk80Var != null) {
                    if (booleanValue) {
                        xk80Var.pause();
                        vkImageSimple.setVisibility(0);
                    } else {
                        xk80Var.resume();
                        vkImageSimple.setVisibility(8);
                    }
                }
                return s3q0.a;
            case 8:
                ytg ytgVar = (ytg) obj3;
                return new bug(((ViewGroup) obj).getContext(), ytgVar.i, ytgVar.j, ytgVar.k, (Size) obj2);
            case 9:
                ((nlh.b) obj3).o.invoke((VideoAlbum) obj2);
                return s3q0.a;
            case 10:
                jwh jwhVar = (jwh) obj3;
                jwhVar.Z(false, (vwh) obj2);
                jwhVar.k.b(new h2g0.f(zwp.a((Throwable) obj)));
                return s3q0.a;
            case 11:
                return xck.a((xck) ((wck) obj3).b.getCurrentState(), ((cck.g) ((cck) obj2)).b, null, SnackBar.STORY_CREATED, 95);
            case 12:
                psm psmVar = (psm) obj3;
                oum oumVar = (oum) obj;
                ProfilesInfo profilesInfo = oumVar.c;
                psmVar.n(num.b.a);
                htm htmVar = psmVar.j;
                xrm xrmVar = (xrm) ((drz.a) obj2).a;
                if (!xrmVar.e.isEmpty()) {
                    profilesInfo.Hb(xrmVar.e);
                }
                htmVar.f(profilesInfo);
                DialogsHistory dialogsHistory = xrmVar.b;
                Set<Long> set = xrmVar.c;
                ArrayList arrayList = new ArrayList();
                Iterator<Dialog> it2 = dialogsHistory.iterator();
                while (it2.hasNext()) {
                    Dialog next = it2.next();
                    if (set.contains(next.Sb())) {
                        arrayList.add(next);
                    }
                }
                Map<Long, Msg> s = dialogsHistory.s();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<Long, Msg> entry : s.entrySet()) {
                    if (set.contains(entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Collection values = linkedHashMap.values();
                f1e0 f1e0Var = new f1e0();
                if ((values instanceof List) && (values instanceof RandomAccess)) {
                    List list = (List) values;
                    int size = list.size();
                    while (i5 < size) {
                        lv30.b((Msg) list.get(i5), f1e0Var);
                        i5++;
                    }
                } else {
                    Iterator it3 = values.iterator();
                    while (it3.hasNext()) {
                        lv30.b((Msg) it3.next(), f1e0Var);
                    }
                }
                f1e0 f1e0Var2 = new f1e0();
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    ijm.b((Dialog) it4.next(), f1e0Var2);
                }
                SetBuilder setBuilder = new SetBuilder();
                setBuilder.addAll(f1e0Var.h());
                setBuilder.addAll(f1e0Var2.h());
                htmVar.a(setBuilder.d());
                psmVar.u(oumVar.b);
                List<Dialog> k = dialogsHistory.k();
                if (!(k instanceof Collection) || !k.isEmpty()) {
                    Iterator<T> it5 = k.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            if (((Dialog) it5.next()).wc()) {
                                psmVar.m.x(new x380());
                            }
                        }
                    }
                }
                return psmVar.w(oum.a(oumVar, null, xrmVar.b, profilesInfo, null, null, null, null, null, null, null, null, null, 4089), set);
            case 13:
                com.vk.folders.impl.configure.d dVar = (com.vk.folders.impl.configure.d) obj3;
                g.j jVar = (g.j) obj2;
                ayr ayrVar = (ayr) obj;
                String str2 = jVar.b;
                boolean z = ayrVar.c;
                Map<Long, wt90> map = ayrVar.e;
                Map<Long, wt90> map2 = ayrVar.f;
                Set<Long> set2 = ayrVar.i;
                Set<Long> set3 = ayrVar.h;
                ayr a = ayr.a(ayrVar, null, dVar.s(str2, z, com.vk.folders.impl.configure.d.u(map, map2, set2, set3), com.vk.folders.impl.configure.d.v(set3, set2)), false, str2, null, null, null, null, null, null, false, 16373);
                boolean z2 = !(defpackage.b.e(jVar.b) <= 16);
                boolean z3 = a.c;
                Set<Long> set4 = a.h;
                Set<Long> set5 = a.i;
                List<hfz> list2 = a.a;
                if (z3 == z2) {
                    return a;
                }
                ArrayList arrayList2 = new ArrayList(list2);
                Iterator<hfz> it6 = list2.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        i5 = -1;
                    } else if (!(it6.next() instanceof xxr)) {
                        i5++;
                    }
                }
                if (i5 == -1) {
                    throw new RuntimeException("No FolderConfigurationNameInputItem found but expected");
                }
                xxr xxrVar = (xxr) list2.get(i5);
                arrayList2.set(i5, new xxr(xxrVar.b, xxrVar.c, z2, xxrVar.e, xxrVar.f));
                return ayr.a(a, arrayList2, dVar.s(a.d, z2, com.vk.folders.impl.configure.d.u(a.e, a.f, set5, set4), com.vk.folders.impl.configure.d.v(set4, set5)), z2, null, null, null, null, null, null, null, false, 16376);
            case 14:
                pzr pzrVar = (pzr) obj3;
                drz.a aVar = (drz.a) obj2;
                vzr vzrVar = (vzr) obj;
                pzrVar.n(uzr.a.a);
                xrm xrmVar2 = (xrm) aVar.a;
                DialogsHistory dialogsHistory2 = xrmVar2.b;
                Set<Long> set6 = xrmVar2.c;
                ArrayList arrayList3 = new ArrayList();
                Iterator<Dialog> it7 = dialogsHistory2.iterator();
                while (it7.hasNext()) {
                    Dialog next2 = it7.next();
                    if (set6.contains(next2.Sb())) {
                        arrayList3.add(next2);
                    }
                }
                f1e0 f1e0Var3 = new f1e0();
                Iterator it8 = arrayList3.iterator();
                while (it8.hasNext()) {
                    ijm.b((Dialog) it8.next(), f1e0Var3);
                }
                pzrVar.k.a(f1e0Var3.h());
                LinkedHashMap A = pzr.A(vzrVar, xrmVar2.b.k(), set6);
                return vzr.a(vzrVar, A, pzr.u(A, aVar.b, false), null, null, null, false, null, null, null, null, 8188);
            case 15:
                ((etv0) obj).b(false);
                ((i1s) obj3).k.a(((i1s.c) obj2).a, VkOnboardingType.Tooltip, e8v0.f.b);
                return s3q0.a;
            case 16:
                xms xmsVar = (xms) obj3;
                uns unsVar = (uns) obj;
                int i8 = FriendsCleanupFragment.W;
                Context requireContext = ((FriendsCleanupFragment) obj2).requireContext();
                if (unsVar instanceof uns.a) {
                    tms tmsVar = xmsVar.g;
                    uns.a aVar2 = (uns.a) unsVar;
                    tmsVar.getClass();
                    if (aVar2 instanceof uns.a.b) {
                        uns.a.b bVar2 = (uns.a.b) aVar2;
                        Resources resources = requireContext.getResources();
                        int i9 = bVar2.a;
                        qms qmsVar = new qms(requireContext, resources.getQuantityString(R.plurals.friends_cleanup_delete_all_suggested_friends_dialog, i9, Integer.valueOf(i9)));
                        if (bVar2.b) {
                            qmsVar.g = new qms.b(requireContext.getString(R.string.friends_cleanup_dialog_delete), new u3k(tmsVar, 13));
                        } else {
                            qmsVar.f = new qms.b(requireContext.getString(R.string.friends_cleanup_dialog_keep_in_followers), new w8q(tmsVar, 4));
                            qmsVar.g = new qms.b(requireContext.getString(R.string.friends_cleanup_dialog_delete_completely), new n5i(tmsVar, i2));
                        }
                        qmsVar.S0();
                    } else if (aVar2 instanceof uns.a.d) {
                        uns.a.d dVar2 = (uns.a.d) aVar2;
                        qms qmsVar2 = new qms(requireContext, requireContext.getString(R.string.friends_cleanup_delete_friend_dialog, dVar2.b));
                        if (dVar2.c) {
                            qmsVar2.g = new qms.b(requireContext.getString(R.string.friends_cleanup_dialog_delete), new dy0(14, tmsVar, dVar2));
                        } else {
                            qmsVar2.f = new qms.b(requireContext.getString(R.string.friends_cleanup_dialog_keep_in_followers), new com.vk.movika.tools.controls.seekbar.f(9, tmsVar, dVar2));
                            qmsVar2.g = new qms.b(requireContext.getString(R.string.friends_cleanup_dialog_delete_completely), new com.vk.movika.tools.controls.seekbar.g(7, tmsVar, dVar2));
                        }
                        qmsVar2.S0();
                    } else if (aVar2 instanceof uns.a.C3811a) {
                        new fns(requireContext, R.layout.friends_successful_action_alert).m();
                    } else {
                        if (!(aVar2 instanceof uns.a.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        new fns(requireContext, R.layout.friends_cleanup_all_friends_deletion_error_alert).m();
                    }
                } else if (unsVar instanceof uns.b) {
                    gns gnsVar = xmsVar.h;
                    uns.b bVar3 = (uns.b) unsVar;
                    gnsVar.getClass();
                    if (bVar3 instanceof uns.b.a) {
                        uns.b.a aVar3 = (uns.b.a) bVar3;
                        boolean z4 = aVar3.a;
                        FriendsCleanupFragment friendsCleanupFragment = gnsVar.b;
                        if (friendsCleanupFragment.Nn()) {
                            friendsCleanupFragment.Mf(z4 ? 1 : 0, null);
                        } else if (aVar3.b) {
                            h3p0.b(friendsCleanupFragment);
                        } else {
                            FriendsCatalogFragment.a aVar4 = new FriendsCatalogFragment.a();
                            if (z4) {
                                aVar4.j.putBoolean("friends_cleanup_completed", true);
                            }
                            aVar4.k(requireContext);
                        }
                    } else {
                        if (!(bVar3 instanceof uns.b.C3812b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        gnsVar.a.b(requireContext, ((uns.b.C3812b) bVar3).a);
                    }
                } else {
                    if (!(unsVar instanceof uns.c)) {
                        xmsVar.getClass();
                        throw new NoWhenBranchMatchedException();
                    }
                    vns vnsVar = xmsVar.f;
                    uns.c cVar = (uns.c) unsVar;
                    vnsVar.getClass();
                    if (cVar instanceof uns.c.a) {
                        String g = j03.g(requireContext, ((uns.c.a) cVar).a, R.string.error);
                        ikv0.a aVar5 = new ikv0.a(requireContext);
                        aVar5.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_circle_24, Integer.valueOf(R.attr.vk_ui_background_negative), (Size) null, 12);
                        aVar5.u = new ikv0.d(g, (String) null, (ikv0.d.a) null, 6);
                        aVar5.n();
                    } else if (cVar instanceof uns.c.b) {
                        uns.c.b bVar4 = (uns.c.b) cVar;
                        boolean z5 = bVar4.b;
                        String str3 = bVar4.a;
                        if (bVar4.c) {
                            if (z5) {
                                vns.a(requireContext, requireContext.getString(R.string.friends_cleanup_friend_remaining_follower_snackbar_f, str3));
                            } else {
                                vns.a(requireContext, requireContext.getString(R.string.friends_cleanup_friend_remaining_follower_snackbar_m, str3));
                            }
                        } else if (z5) {
                            vns.a(requireContext, requireContext.getString(R.string.friends_cleanup_friend_deleted_snackbar_f, str3));
                        } else {
                            vns.a(requireContext, requireContext.getString(R.string.friends_cleanup_friend_deleted_snackbar_m, str3));
                        }
                    } else {
                        if (!(cVar instanceof uns.c.C3813c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        zvm0.k((zvm0) vnsVar.a.getValue(), requireContext, null, ((uns.c.C3813c) cVar).a, false, 10);
                    }
                }
                return s3q0.a;
            case 17:
                utb utbVar = (utb) ((bmt) obj3).f.h.b;
                AtomicReference<Location> atomicReference = oxz.a;
                return new io.reactivex.rxjava3.internal.operators.single.d0(kzz.d((Context) utbVar.b).K().l(new com.vk.movika.sdk.base.ui.j(new fj1(29), i3)), new gq(18), null).l(new dg1(new qd1(i2, (blt) obj2, (Boolean) obj), 22));
            case 18:
                agy agyVar = (agy) obj2;
                y4l0 y4l0Var = ((zfy) obj3).l;
                if (y4l0Var != null) {
                    y4l0Var.g(agyVar.f, agyVar.d);
                }
                return s3q0.a;
            case 19:
                a.j.d dVar3 = (a.j.d) obj2;
                List<df10> list3 = ((ft00) obj3).h;
                ArrayList arrayList4 = new ArrayList(c5g.u(list3, 10));
                for (df10 df10Var : list3) {
                    if (epx.f(df10Var.d, dVar3.b)) {
                        df10Var = df10.a(df10Var, false, false, 524287);
                    }
                    arrayList4.add(df10Var);
                }
                return new c.m(arrayList4);
            case 20:
                MusicHidingToolbarVh musicHidingToolbarVh = (MusicHidingToolbarVh) obj3;
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj2;
                w4v0 w4v0Var = (w4v0) obj;
                if (!musicHidingToolbarVh.q) {
                    return s3q0.a;
                }
                boolean z6 = musicHidingToolbarVh.s;
                boolean z7 = w4v0Var.c;
                int i10 = w4v0Var.a;
                boolean z8 = w4v0Var.b;
                if (z6 != z7) {
                    musicHidingToolbarVh.s = z7;
                    if (z7) {
                        io.reactivex.rxjava3.disposables.c cVar2 = musicHidingToolbarVh.w;
                        if (cVar2 != null) {
                            cVar2.dispose();
                        }
                    } else {
                        musicHidingToolbarVh.g();
                    }
                    musicHidingToolbarVh.j();
                    AppBarLayout appBarLayout = musicHidingToolbarVh.f;
                    if (appBarLayout != null) {
                        musicHidingToolbarVh.k(appBarLayout.getTop(), appBarLayout.getBottom(), appBarLayout.getContext());
                    }
                    ref$IntRef.element = 0;
                }
                musicHidingToolbarVh.u = z8;
                ref$IntRef.element = Math.max(ref$IntRef.element, i10);
                View e = musicHidingToolbarVh.e();
                if (e != null) {
                    f4m.E(e, !z8 && musicHidingToolbarVh.q && musicHidingToolbarVh.x.c());
                }
                float f = -(ref$IntRef.element - i10);
                View e2 = musicHidingToolbarVh.e();
                if (e2 != null) {
                    e2.setTranslationY(f);
                }
                View view = musicHidingToolbarVh.J;
                if (view != null) {
                    view.setTranslationY(f);
                }
                return s3q0.a;
            case 21:
                CatalogBlock catalogBlock = (CatalogBlock) obj3;
                bi20 bi20Var = (bi20) obj2;
                if (obj instanceof UserProfile) {
                    bVar = new oap.a(obj);
                } else {
                    if (!(obj instanceof Group)) {
                        return null;
                    }
                    bVar = new oap.b(obj);
                }
                oap oapVar = bVar;
                if (oapVar instanceof oap.b) {
                    userId = ((Group) ((oap.b) oapVar).a).c;
                } else {
                    if (!(oapVar instanceof oap.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    userId = ((UserProfile) ((oap.a) oapVar).a).c;
                }
                UserId userId2 = userId;
                Object zb = catalogBlock.m.zb(obj instanceof Group ? fkq0.e(userId2) : userId2);
                SearchAuthorItem searchAuthorItem = zb instanceof SearchAuthorItem ? (SearchAuthorItem) zb : null;
                String str4 = bi20Var.a;
                CatalogViewType catalogViewType = bi20Var.d;
                CatalogDataType catalogDataType = bi20Var.c;
                String str5 = bi20Var.k;
                List<String> list4 = bi20Var.j;
                Set<UIBlockDragDropAction> set7 = bi20Var.m;
                UIBlockHint uIBlockHint = bi20Var.o;
                String str6 = searchAuthorItem != null ? searchAuthorItem.c : null;
                UIBlockSearchAuthor.AuthorType.a aVar6 = UIBlockSearchAuthor.AuthorType.Companion;
                String str7 = searchAuthorItem != null ? searchAuthorItem.d : null;
                aVar6.getClass();
                return new UIBlockSearchAuthor(str4, catalogViewType, catalogDataType, str5, userId2, list4, set7, uIBlockHint, new UIBlockSearchAuthor.a(str6, oapVar, UIBlockSearchAuthor.AuthorType.a.a(str7), searchAuthorItem != null ? searchAuthorItem.e : null, searchAuthorItem != null ? searchAuthorItem.f : null));
            case 22:
                yv70 yv70Var = (yv70) obj3;
                tra0 tra0Var = (tra0) obj2;
                tra0.a aVar7 = (tra0.a) obj;
                long j = yv70Var.p.invoke(aVar7).a;
                if (yv70Var.q) {
                    tra0.a.z(aVar7, tra0Var, (int) (j >> 32), (int) (j & 4294967295L));
                } else {
                    tra0.a.K(aVar7, tra0Var, (int) (j >> 32), (int) (j & 4294967295L), null, 12);
                }
                return s3q0.a;
            case 23:
                ((c090.a.C2632a) obj3).q6((k7u) obj2, true);
                return s3q0.a;
            case 24:
                m8d0 m8d0Var = (m8d0) obj3;
                wh50 wh50Var = (wh50) obj2;
                aoj aojVar = (aoj) obj;
                j7d0.c.b.a aVar8 = (j7d0.c.b.a) ((zak0) m8d0Var.d).getValue();
                if (aVar8 == null) {
                    return s3q0.a;
                }
                if (aVar8.a) {
                    aojVar.a(new k8d0(m8d0Var, new p8s(2, wh50Var)));
                }
                if (aVar8.b) {
                    aojVar.a(new j8d0(m8d0Var, new f030(c == true ? 1 : 0, wh50Var)));
                }
                if (aVar8.c) {
                    aojVar.a(new l8d0(m8d0Var, new qd00(i4, wh50Var)));
                }
                return s3q0.a;
            case 25:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.h(tgi0Var, (String) obj3);
                qgi0.i(tgi0Var, (List) obj2);
                return s3q0.a;
            case 26:
                Throwable th = (Throwable) obj;
                L.i(th);
                ((n8j0) obj3).e.invoke(th, new lxz((com.vk.lists.c) obj2, 28));
                return s3q0.a;
            case 27:
                ((npk0) obj3).U6((StarsFeedback) obj2);
                return s3q0.a;
            case 28:
                StickerPackVerticalListItemVh stickerPackVerticalListItemVh = (StickerPackVerticalListItemVh) obj3;
                StickerStockItem stickerStockItem = (StickerStockItem) obj2;
                f9l0 f9l0Var = stickerPackVerticalListItemVh.c;
                Context context = stickerPackVerticalListItemVh.i;
                f9l0Var.a(context != null ? context : null, stickerStockItem, stickerPackVerticalListItemVh.d, stickerPackVerticalListItemVh.e.b);
                return s3q0.a;
            default:
                int i11 = kwg0.a;
                h03.b((Throwable) obj);
                StickersView.e((StickersView) obj3, ((StickerPackPreviewModel) obj2).e(), false);
                return s3q0.a;
        }
    }

    public /* synthetic */ ri0(CatalogBlock catalogBlock, w060 w060Var, bi20 bi20Var) {
        this.b = 21;
        this.c = catalogBlock;
        this.d = bi20Var;
    }
}
