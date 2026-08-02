package xsna;

import android.content.Context;
import android.provider.Settings;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.auth.main.SignUpRouter;
import com.vk.auth.screendata.VerificationScreenData;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.picture.c;
import com.vk.dto.common.Good;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.fave.MarketFavable;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.stickers.ugc.UGCStickerModel;
import com.vk.dto.stories.entities.stat.BackgroundInfo;
import com.vk.dto.stories.entities.stat.StoryBackgroundType;
import com.vk.ecomm.orders.impl.order.presentation.OrderFragment;
import com.vk.ecomm.orders.impl.order.presentation.mvi.OrderAction;
import com.vk.im.engine.models.events.channels.OnChannelsCacheInvalidateEvent;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.engine.models.groups.MemberStatus;
import com.vk.music.player.PlayerTrack;
import com.vk.music.view.player.holders.tracklist.MusicBigPlayerTrackListHolder;
import com.vk.photos.root.photoflow.settings.presentation.view.PhotoFlowSettingsRecyclerPaginatedView;
import com.vk.photoviewer.PhotoViewer;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryPublishItem;
import com.vk.superapp.api.dto.auth.VkAuthValidatePhoneResult;
import com.vk.voip.ui.groupcalls.GroupCallViewModel;
import com.vk.voip.ui.groupcalls.list.ListGroupCallView;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.MarketAttachment;
import com.vkontakte.android.data.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import one.video.smartcast.api.ConnectionState;
import xsna.a9a0;
import xsna.acx;
import xsna.la10;
import xsna.nn20;
import xsna.nph0;
import xsna.oea0;
import xsna.web;
import xsna.whc;
import xsna.zrz;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class w7u implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w7u(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x011c, code lost:
    
        if (r1 != 3) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0125  */
    /* JADX WARN: Type inference failed for: r1v124, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        MarketAttachment marketAttachment;
        Good good;
        Good good2;
        Object obj2;
        PlayerTrack playerTrack;
        MusicTrack musicTrack;
        MobileOfficialAppsStoriesStat$TypeStoryPublishItem.StoryType storyType;
        nov novVar;
        int i = this.b;
        int i2 = 2;
        boolean z = false;
        int i3 = 0;
        z = false;
        int i4 = 1;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                x7u x7uVar = (x7u) obj3;
                int intValue = ((Integer) obj).intValue();
                u7u u7uVar = x7uVar.o;
                if (u7uVar != null) {
                    x7uVar.l.g(intValue, u7uVar.b);
                }
                return s3q0.a;
            case 1:
                return Group.zb((Group) obj, false, false, 0L, ((MemberStatus) obj3).i(), null, 536854527);
            case 2:
                io.reactivex.rxjava3.subjects.f fVar = (io.reactivex.rxjava3.subjects.f) obj3;
                sxp sxpVar = (sxp) obj;
                if (sxpVar instanceof p680) {
                    if (((p680) sxpVar).b instanceof whc.c) {
                        fVar.onNext(web.d.a);
                    }
                } else if (sxpVar instanceof OnChannelsCacheInvalidateEvent) {
                    fVar.onNext(new web.a(((OnChannelsCacheInvalidateEvent) sxpVar).c));
                } else if (sxpVar instanceof v280) {
                    fVar.onNext(web.b.a);
                } else if (sxpVar instanceof r280) {
                    HashMap hashMap = ((r280) sxpVar).b.c;
                    HashMap hashMap2 = hashMap.isEmpty() ? null : hashMap;
                    if (hashMap2 != null) {
                        fVar.onNext(new web.c(hashMap2));
                    }
                }
                return s3q0.a;
            case 3:
                k8w k8wVar = (k8w) obj3;
                io.reactivex.rxjava3.disposables.c subscribe = k8wVar.a.a().subscribe(new jsv(new n3i(k8wVar, 29), i4));
                io.reactivex.rxjava3.disposables.b bVar = k8wVar.e;
                bVar.b(subscribe);
                bVar.b(io.reactivex.rxjava3.kotlin.c.f(2, k8wVar.c.c, null, new ee8(1, k8wVar.d, d9w.class, "error", "error(Ljava/lang/Throwable;)V", 0, 9), new f2s(k8wVar, 11)));
                k8wVar.a();
                return s3q0.a;
            case 4:
                ((d1z) obj3).k.W0((ConnectionState) obj);
                return s3q0.a;
            case 5:
                ListGroupCallView listGroupCallView = (ListGroupCallView) obj3;
                float f = ListGroupCallView.o0;
                List<kiu> list = ((GroupCallViewModel.a) obj).b;
                ListGroupCallView.b bVar2 = listGroupCallView.Q;
                bVar2.getClass();
                bVar2.d = j5g.O0(list);
                bVar2.notifyDataSetChanged();
                listGroupCallView.T4(true);
                return s3q0.a;
            case 6:
                ((whz) obj3).a(new acx.g(true, true, false));
                return s3q0.a;
            case 7:
                return ((zrz) obj3).d((zrz.a) obj, "onLoadedByNetwork");
            case 8:
                ((io.reactivex.rxjava3.core.r) obj3).onNext(new nph0.a(Collections.singletonList(new cph0((eyz) obj))));
                return s3q0.a;
            case 9:
                vz00 vz00Var = (vz00) obj3;
                gmq gmqVar = (gmq) obj;
                if (!(gmqVar instanceof MarketFavable) || ((marketAttachment = (MarketAttachment) vz00Var.C) != null && (good2 = marketAttachment.f) != null && ((MarketFavable) gmqVar).b == good2.b)) {
                    return s3q0.a;
                }
                if (marketAttachment != null && (good = marketAttachment.f) != null) {
                    z = good.J;
                }
                vz00Var.b7(z);
                return s3q0.a;
            case 10:
                f910 f910Var = (f910) obj3;
                List<? extends hfz> list2 = (List) obj;
                ((mqu) f910Var.y.getValue()).setItems(list2);
                Iterator<T> it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (((glu) obj2).e) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                glu gluVar = (glu) obj2;
                if (gluVar != null) {
                    int a = iah0.a(24);
                    VkAvatar vkAvatar = f910Var.i;
                    if (vkAvatar != null) {
                        ImageSize imageSize = (ImageSize) ixj0.c(gluVar.c.b, a, a);
                        String str = imageSize != null ? imageSize.d.d : null;
                        if (str == null) {
                            str = "";
                        }
                        vkAvatar.setContent(new c.d(str, null));
                    }
                    String str2 = gluVar.d;
                    TextView textView = f910Var.j;
                    if (textView != null) {
                        if (str2.length() > 27) {
                            str2 = erm0.D0(27, str2).concat("...");
                        }
                        textView.setText(str2);
                    }
                    TextView textView2 = f910Var.j;
                    if (textView2 != null) {
                        textView2.setTypeface(null, 1);
                    }
                    TextView textView3 = f910Var.j;
                    if (textView3 != null) {
                        textView3.setTextColor(e3m.f(R.attr.vk_ui_text_primary, f910Var.c));
                    }
                }
                la10 b = f910Var.b();
                if (b != null && (b.A instanceof la10.a.b)) {
                    b.F.g(true, false, true);
                }
                return s3q0.a;
            case 11:
                ((zak0) ((nn20.a) obj3).f).setValue((String) obj);
                return s3q0.a;
            case 12:
                ((kz20) obj3).e.Ff((String) obj);
                return s3q0.a;
            case 13:
                com.vk.im.ui.components.msg_list.a aVar = (com.vk.im.ui.components.msg_list.a) obj3;
                Throwable th = (Throwable) obj;
                aVar.getClass();
                com.vk.im.ui.components.msg_list.a.P0.a(th);
                vm30 vm30Var = aVar.o;
                if (vm30Var != null) {
                    vm30Var.H(th);
                }
                vm30 vm30Var2 = aVar.o;
                if (vm30Var2 != null) {
                    vm30Var2.e0.dismiss();
                }
                aVar.a0 = null;
                return s3q0.a;
            case 14:
                ((du30) obj3).j = (UGCStickerModel) ((n1l0) obj);
                return s3q0.a;
            case 15:
                rw30 rw30Var = (rw30) obj3;
                hy30 hy30Var = rw30Var.p;
                hy30Var.l = (List) obj;
                rw30Var.e1(hy30Var);
                return s3q0.a;
            case 16:
                ((x340) obj3).m.invoke();
                return s3q0.a;
            case 17:
                List<whp0> y0 = ((MusicBigPlayerTrackListHolder) obj3).u.y0();
                ArrayList arrayList = new ArrayList();
                Iterator it2 = ((ArrayList) y0).iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    whp0 whp0Var = (whp0) next;
                    xhp0 xhp0Var = whp0Var instanceof xhp0 ? (xhp0) whp0Var : null;
                    if (xhp0Var != null && (playerTrack = xhp0Var.a) != null && (musicTrack = playerTrack.b) != null && musicTrack.Pb()) {
                        arrayList.add(next);
                    }
                }
                return arrayList;
            case 18:
                ((p060) obj3).l.h();
                return s3q0.a;
            case 19:
                return new bfr((cfr) obj, (cfr) obj3);
            case 20:
                return new rl20((ViewGroup) obj, ((im70) obj3).j);
            case 21:
                tam0 tam0Var = (tam0) obj3;
                b.d dVar = (b.d) obj;
                boolean g = tam0Var.g();
                zcl0 zcl0Var = tam0Var.h;
                if (!g && !zcl0Var.u()) {
                    CopyOnWriteArrayList<nov> copyOnWriteArrayList = zcl0Var.a;
                    while (true) {
                        if (i3 == copyOnWriteArrayList.size()) {
                            novVar = null;
                        } else if (copyOnWriteArrayList.get(i3) instanceof air0) {
                            novVar = copyOnWriteArrayList.get(i3);
                        } else {
                            i3++;
                        }
                    }
                    if (((air0) novVar) == null) {
                        if (tam0Var.f()) {
                            storyType = MobileOfficialAppsStoriesStat$TypeStoryPublishItem.StoryType.PHOTO;
                        } else {
                            BackgroundInfo backgroundInfo = tam0Var.d;
                            storyType = (backgroundInfo != null ? backgroundInfo.c : null) == StoryBackgroundType.ANIMATED ? MobileOfficialAppsStoriesStat$TypeStoryPublishItem.StoryType.VIDEO : MobileOfficialAppsStoriesStat$TypeStoryPublishItem.StoryType.PHOTO;
                        }
                        dVar.b(storyType.toString().toLowerCase(Locale.ROOT), "story_type");
                        return s3q0.a;
                    }
                }
                storyType = MobileOfficialAppsStoriesStat$TypeStoryPublishItem.StoryType.VIDEO;
                dVar.b(storyType.toString().toLowerCase(Locale.ROOT), "story_type");
                return s3q0.a;
            case 22:
                m780 m780Var = (m780) obj3;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (!m780Var.j) {
                    return s3q0.a;
                }
                m780Var.q = false;
                if (booleanValue) {
                    m780Var.c.j(28);
                } else if (!m780Var.i) {
                    m780Var.f.f = true;
                    m780Var.g.invoke();
                }
                return s3q0.a;
            case 23:
                ((bo10) obj3).b = ((Integer) obj).intValue();
                return s3q0.a;
            case 24:
                fs80 fs80Var = (fs80) obj3;
                fs80Var.a.put((String) obj, Long.valueOf(System.nanoTime()));
                long nanoTime = System.nanoTime();
                ks80 ks80Var = fs80Var.e;
                ks80Var.f().e(new es80(fs80Var, nanoTime, ks80Var));
                return s3q0.a;
            case 25:
                qcy<Object>[] qcyVarArr = OrderFragment.Y;
                nzw nzwVar = ((OrderFragment) obj3).V;
                qcy<Object> qcyVar = OrderFragment.Y[0];
                ((ix80) nzwVar.getValue()).b((OrderAction) obj);
                return s3q0.a;
            case 26:
                uy80 uy80Var = (uy80) obj3;
                int intValue2 = ((Integer) obj).intValue();
                PhotoViewer photoViewer = uy80Var.b;
                Context context = uy80Var.a;
                if (Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation", 0) == 1) {
                    uy80Var.d = true;
                    if (uy80Var.c != intValue2) {
                        uy80Var.c = intValue2;
                        photoViewer.m(intValue2);
                    }
                } else if (uy80Var.d) {
                    uy80Var.d = false;
                    int i5 = Settings.System.getInt(context.getContentResolver(), "user_rotation", 0);
                    if (i5 != 0) {
                        if (i5 == 1) {
                            i2 = 1;
                        } else if (i5 != 2) {
                            i2 = 3;
                            break;
                        }
                        if (uy80Var.c != i2) {
                            uy80Var.c = i2;
                            photoViewer.m(i2);
                        }
                    }
                    i2 = 0;
                    if (uy80Var.c != i2) {
                    }
                }
                return s3q0.a;
            case 27:
                d3a0 d3a0Var = (d3a0) obj3;
                VkAuthValidatePhoneResult vkAuthValidatePhoneResult = (VkAuthValidatePhoneResult) obj;
                xpu0 xpu0Var = d3a0Var.A;
                if (xpu0Var != null) {
                    xpu0Var.dismiss();
                }
                VerificationScreenData.Phone phone = new VerificationScreenData.Phone("", d3a0Var.y, vkAuthValidatePhoneResult.b, false, vkAuthValidatePhoneResult, false, false, false, null, null, null, null, 4072, null);
                sir0 sir0Var = sir0.a;
                SignUpRouter signUpRouter = d3a0Var.n;
                sir0.f(sir0Var, signUpRouter != null ? signUpRouter : null, null, phone, null, 10);
                return s3q0.a;
            case 28:
                z8a0 z8a0Var = (z8a0) obj3;
                a9a0.b bVar3 = (a9a0.b) obj;
                if (bVar3.c != null) {
                    z8a0Var.h.fj(null, null);
                    return s3q0.a;
                }
                j8a0 j8a0Var = z8a0Var.g;
                PhotoFlowSettingsRecyclerPaginatedView photoFlowSettingsRecyclerPaginatedView = z8a0Var.h;
                j8a0Var.submitList(bVar3.a);
                a9a0.b.a aVar2 = bVar3.b;
                if (aVar2 instanceof a9a0.b.a.C2532a) {
                    photoFlowSettingsRecyclerPaginatedView.Fe();
                } else if (epx.f(aVar2, a9a0.b.a.C2533b.a)) {
                    photoFlowSettingsRecyclerPaginatedView.lb();
                } else {
                    if (aVar2 != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    photoFlowSettingsRecyclerPaginatedView.j();
                }
                return s3q0.a;
            default:
                oea0.a aVar3 = (oea0.a) obj;
                aha0 aha0Var = ((cda0) obj3).a;
                int i6 = aVar3.b;
                int i7 = aVar3.c;
                UserId userId = aVar3.a;
                aha0Var.getClass();
                tfx tfxVar = new tfx("photos.removeTag", new xq(27), new yq(25));
                tfx.l(tfxVar, "photo_id", i6, 0, 0, 12);
                tfx.l(tfxVar, "tag_id", i7, 0, 0, 12);
                if (userId != null) {
                    tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
                }
                return rsg0.T(yfb.x(tfxVar));
        }
    }
}
