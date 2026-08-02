package xsna;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.video.dto.VideoSearchResponseDto;
import com.vk.attachpicker.stickers.post.attach.StoryAttachImageView;
import com.vk.auth.external.a;
import com.vk.catalog.mvi.block.video.impl.video.list.VideosListView$State;
import com.vk.catalog2.common.ui.holders.search.FilterParameters;
import com.vk.catalog2.common.ui.holders.search.SearchFilterVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.AttachmentWithMedia;
import com.vk.dto.common.Image;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.photo.Photo;
import com.vk.dto.user.UserProfile;
import com.vk.dto.uxpolls.UxPoll;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.search.model.VideoSearchFiltersImpl;
import com.vk.stickers.bottomsheets.StickersBottomSheetDialog;
import com.vk.stickers.settings.b;
import com.vk.story.viewer.impl.presentation.stories.view.storyview.a;
import com.vk.story.viewer.impl.presentation.stories.view.storyview.b;
import com.vk.subscription.api.SubscribeStatus;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.js.bridge.events.AddToCommunity$Error;
import com.vk.superapp.js.bridge.events.EventNames;
import com.vk.video.ad.a;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.functions.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.acs0;
import xsna.d4c0;
import xsna.dis0;
import xsna.h1p0;
import xsna.i7j0;
import xsna.r2t0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class u2k0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u2k0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v5, types: [com.vk.story.viewer.impl.presentation.stories.view.storyview.a$b$a$a] */
    /* JADX WARN: Type inference failed for: r11v6, types: [com.vk.story.viewer.impl.presentation.stories.view.storyview.a$b$a$b] */
    /* JADX WARN: Type inference failed for: r11v7, types: [com.vk.story.viewer.impl.presentation.stories.view.storyview.a$b$a$d] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        long j;
        String str2;
        String Db;
        a.b.InterfaceC1839a.c cVar;
        String str3;
        long j2;
        String str4;
        String Db2;
        String str5;
        long j3;
        String str6;
        String Db3;
        String str7;
        long j4;
        String str8;
        String str9;
        String Db4;
        RecyclerPaginatedView recyclerPaginatedView;
        RecyclerView recyclerView;
        int i = this.b;
        int i2 = 3;
        int i3 = 8;
        int i4 = 6;
        boolean z = false;
        int i5 = 1;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return Integer.valueOf(((v2k0) obj2).a0(sdi.d(((ic30) obj).e)));
            case 1:
                ((vak0) obj2).g(((Float) obj).floatValue());
                return s3q0.a;
            case 2:
                ((com.vk.stickers.settings.i) obj2).c.invoke(b.a.b);
                return s3q0.a;
            case 3:
                int i6 = StickersBottomSheetDialog.a0;
                ((StickersBottomSheetDialog) obj2).fo();
                return s3q0.a;
            case 4:
                return mol0.a((mol0) obj, null, null, null, (wyh0) obj2, null, null, 239);
            case 5:
                int i7 = StoryAttachImageView.t;
                ((StoryAttachImageView) obj2).W();
                return s3q0.a;
            case 6:
                com.vk.story.viewer.impl.presentation.stories.view.storyview.b bVar = (com.vk.story.viewer.impl.presentation.stories.view.storyview.b) obj2;
                i7j0.a aVar = (i7j0.a) obj;
                List<Dialog> S = j5g.S(aVar.a, 1);
                ArrayList arrayList = new ArrayList();
                for (Dialog dialog : S) {
                    bVar.getClass();
                    int i8 = b.a.$EnumSwitchMapping$0[dialog.bc().ordinal()];
                    if (i8 == 1) {
                        long longValue = dialog.Sb().longValue();
                        String e = bVar.e(dialog, aVar);
                        if (e == null) {
                            e = "";
                        }
                        ImageList d = com.vk.story.viewer.impl.presentation.stories.view.storyview.b.d(dialog, aVar);
                        if (d == null || (Db = d.Db()) == null) {
                            String str10 = e;
                            str = "";
                            j = longValue;
                            str2 = str10;
                        } else {
                            j = longValue;
                            str2 = e;
                            str = Db;
                        }
                        cVar = new a.b.InterfaceC1839a.c(j, str2, str, dialog);
                    } else if (i8 == 2) {
                        long longValue2 = dialog.Sb().longValue();
                        String e2 = bVar.e(dialog, aVar);
                        if (e2 == null) {
                            e2 = "";
                        }
                        ImageList d2 = com.vk.story.viewer.impl.presentation.stories.view.storyview.b.d(dialog, aVar);
                        if (d2 == null || (Db2 = d2.Db()) == null) {
                            String str11 = e2;
                            str3 = "";
                            j2 = longValue2;
                            str4 = str11;
                        } else {
                            j2 = longValue2;
                            str4 = e2;
                            str3 = Db2;
                        }
                        cVar = new a.b.InterfaceC1839a.C1840a(j2, str4, str3, dialog);
                    } else if (i8 == 3) {
                        long longValue3 = dialog.Sb().longValue();
                        String e3 = bVar.e(dialog, aVar);
                        if (e3 == null) {
                            e3 = "";
                        }
                        ImageList d3 = com.vk.story.viewer.impl.presentation.stories.view.storyview.b.d(dialog, aVar);
                        if (d3 == null || (Db3 = d3.Db()) == null) {
                            String str12 = e3;
                            str5 = "";
                            j3 = longValue3;
                            str6 = str12;
                        } else {
                            j3 = longValue3;
                            str6 = e3;
                            str5 = Db3;
                        }
                        cVar = new a.b.InterfaceC1839a.C1841b(j3, str6, str5, dialog);
                    } else if (i8 != 4) {
                        cVar = null;
                    } else {
                        long longValue4 = dialog.Sb().longValue();
                        String e4 = bVar.e(dialog, aVar);
                        if (e4 == null) {
                            e4 = "";
                        }
                        String e5 = bVar.e(dialog, aVar);
                        if (e5 == null) {
                            e5 = "";
                        }
                        ImageList d4 = com.vk.story.viewer.impl.presentation.stories.view.storyview.b.d(dialog, aVar);
                        if (d4 == null || (Db4 = d4.Db()) == null) {
                            String str13 = e5;
                            str7 = "";
                            j4 = longValue4;
                            str8 = e4;
                            str9 = str13;
                        } else {
                            j4 = longValue4;
                            str8 = e4;
                            str9 = e5;
                            str7 = Db4;
                        }
                        cVar = new a.b.InterfaceC1839a.d(j4, str8, str9, str7, dialog);
                    }
                    if (cVar != null) {
                        arrayList.add(cVar);
                    }
                }
                return j5g.H0(arrayList, 4);
            case 7:
                ((jam0) obj2).d.setItems((List) obj);
                return s3q0.a;
            case 8:
                yzm0 yzm0Var = (yzm0) obj2;
                Boolean bool = (Boolean) obj;
                yzm0Var.a.g(4, bool.booleanValue());
                if (bool.booleanValue()) {
                    xwk.e().T().m().b(new kym0(SubscribeStatus.MEMBER_STATUS_MEMBER, yzm0Var.a.b, null, null, 12));
                }
                return s3q0.a;
            case 9:
                final bdn0 bdn0Var = (bdn0) obj2;
                nvy.c((nvy) obj, 5, null, new jai(157008937, new zzs() { // from class: xsna.zcn0
                    @Override // xsna.zzs
                    public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                        ((Integer) obj4).getClass();
                        androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj5;
                        int intValue = ((Integer) obj6).intValue();
                        if (aVar2.t(intValue & 1, (intValue & 129) != 128)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(157008937, intValue, -1, "com.vk.superapp.holders.stub.SuperAppWidgetRedesignV6Holder.ScrollStub.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SuperAppWidgetRedesignV6Holder.kt:88)");
                            }
                            bdn0.this.m6(0, aVar2);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar2.h();
                        }
                        return s3q0.a;
                    }
                }, true), 6);
                return s3q0.a;
            case 10:
                xgx0.a.getClass();
                xgx0.d((Throwable) obj);
                wo6 wo6Var = ((ihn0) obj2).d;
                if (wo6Var != null) {
                    wo6Var.g0();
                }
                return s3q0.a;
            case 11:
                xgo0 xgo0Var = (xgo0) obj2;
                float floatValue = ((Float) obj).floatValue();
                kg50 kg50Var = xgo0Var.a;
                vak0 vak0Var = (vak0) kg50Var;
                float floatValue2 = vak0Var.getFloatValue() + floatValue;
                vak0 vak0Var2 = (vak0) xgo0Var.b;
                if (floatValue2 > vak0Var2.getFloatValue()) {
                    floatValue = vak0Var2.getFloatValue() - vak0Var.getFloatValue();
                } else if (floatValue2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    floatValue = -vak0Var.getFloatValue();
                }
                ((vak0) kg50Var).g(vak0Var.getFloatValue() + floatValue);
                return Float.valueOf(floatValue);
            case 12:
                h1p0.b bVar2 = (h1p0.b) obj2;
                d0r0 d0r0Var = bVar2.l;
                d0r0Var.getClass();
                itg0.b(bVar2.itemView, hg1.l(io.reactivex.rxjava3.core.a.l(new u30(d0r0Var, i3)).q(io.reactivex.rxjava3.schedulers.a.a()).o(io.reactivex.rxjava3.android.schedulers.a.b()), bVar2.itemView.getContext(), 62).subscribe(new re4(bVar2, i4), new uu60(new g2h0(7), 25)));
                return s3q0.a;
            case 13:
                tgi0 tgi0Var = (tgi0) obj2;
                Boolean a = ((xbr) obj).a();
                if (a != null) {
                    qgi0.t(tgi0Var, jgz.d(a.booleanValue()));
                    z = true;
                }
                return Boolean.valueOf(z);
            case 14:
                ((w4r0) obj2).d.putIfAbsent(1355, (UxPoll) obj);
                return s3q0.a;
            case 15:
                kfr0 kfr0Var = (kfr0) obj2;
                List list = (List) obj;
                if (list.isEmpty()) {
                    SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                    if (superappUiRouterBridge == null) {
                        superappUiRouterBridge = null;
                    }
                    superappUiRouterBridge.j(((ggu0) kfr0Var.f.c).b.getString(R.string.vk_apps_empty_admin_communities));
                    mfu0 mfu0Var = kfr0Var.c;
                    EventNames eventNames = EventNames.AddToCommunity;
                    mfu0Var.x(eventNames, new AddToCommunity$Error(false ? 1 : 0, uyp.b(eventNames, mfu0Var, null), i5, false ? 1 : 0));
                }
                if (!list.isEmpty()) {
                    SuperappUiRouterBridge superappUiRouterBridge2 = e370.d;
                    (superappUiRouterBridge2 != null ? superappUiRouterBridge2 : null).H(list);
                }
                return s3q0.a;
            case 16:
                ((com.vk.video.ad.e) obj2).b.invoke(a.C1947a.b);
                return s3q0.a;
            case 17:
                VideoSearchResponseDto videoSearchResponseDto = (VideoSearchResponseDto) obj;
                return ((com.vk.libvideo.a) obj2).h(videoSearchResponseDto.getCount(), videoSearchResponseDto.d());
            case 18:
                VideoCatalogRootVh videoCatalogRootVh = (VideoCatalogRootVh) obj2;
                l3a l3aVar = (l3a) obj;
                int i9 = VideoCatalogRootVh.M0;
                if ((l3aVar instanceof SearchFilterVh.a.C0488a ? (SearchFilterVh.a.C0488a) l3aVar : null) != null) {
                    String str14 = ((SearchFilterVh.a.C0488a) l3aVar).a;
                    VideoSearchFiltersImpl videoSearchFiltersImpl = videoCatalogRootVh.e0;
                    FilterParameters.Companion.getClass();
                    int i10 = VideoCatalogRootVh.b.$EnumSwitchMapping$1[FilterParameters.a.a(str14).ordinal()];
                    if (i10 == 1) {
                        videoSearchFiltersImpl.j = null;
                        videoCatalogRootVh.t0();
                        videoCatalogRootVh.f0.n(videoSearchFiltersImpl);
                    } else if (i10 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return s3q0.a;
            case 19:
                acs0.c cVar2 = ((acs0) obj2).p;
                if (cVar2 != null && (recyclerPaginatedView = cVar2.c) != null && (recyclerView = recyclerPaginatedView.getRecyclerView()) != null) {
                    recyclerView.scrollToPosition(0);
                }
                return s3q0.a;
            case 20:
                dis0 dis0Var = (dis0) obj2;
                Activity h = e3m.h(dis0Var.getContext());
                if (h == null) {
                    c63 c63Var = c63.a;
                    h = c63.b();
                    if (h == null) {
                        return s3q0.a;
                    }
                }
                Activity activity = h;
                Object obj3 = dis0.t;
                VideoFile videoFile = dis0Var.h;
                dis0Var.i = dis0.a.b(videoFile == null ? null : videoFile, activity, false, dis0Var.j, false, 20);
                return s3q0.a;
            case 21:
                ((cys0) obj2).n((k7t0) obj);
                return s3q0.a;
            case 22:
                ((l2t0) obj2).T(new r2t0.a.C3595a(new fwp((Throwable) obj)));
                return s3q0.a;
            case 23:
                r4t0 r4t0Var = (r4t0) obj2;
                ((zak0) r4t0Var.m).setValue(q4t0.a(r4t0Var.getViewState().getValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, false, null, ((Boolean) obj).booleanValue(), false, false, false, false, null, 2015));
                return s3q0.a;
            case 24:
                xnt0 xnt0Var = (xnt0) obj2;
                if (((Boolean) obj).booleanValue()) {
                    Iterator it = xnt0Var.l.iterator();
                    while (it.hasNext()) {
                        rn10 rn10Var = (rn10) ((io.reactivex.rxjava3.subjects.d) ((Pair) it.next()).d()).P0();
                        if (rn10Var != null) {
                            rn10Var.b();
                        }
                    }
                    return io.reactivex.rxjava3.internal.operators.observable.g0.b;
                }
                io.reactivex.rxjava3.subjects.d<Rect> dVar = xnt0Var.g;
                io.reactivex.rxjava3.subjects.d<View> dVar2 = xnt0Var.j;
                dVar2.getClass();
                a.q qVar = io.reactivex.rxjava3.internal.functions.a.a;
                b.a aVar2 = io.reactivex.rxjava3.internal.functions.b.a;
                io.reactivex.rxjava3.core.q s0 = new io.reactivex.rxjava3.internal.operators.observable.y(dVar2, qVar, aVar2).s0(new vii0(new ltl0(11), i3));
                s0.getClass();
                io.reactivex.rxjava3.internal.operators.observable.y yVar = new io.reactivex.rxjava3.internal.operators.observable.y(s0, qVar, aVar2);
                io.reactivex.rxjava3.subjects.d<View> dVar3 = xnt0Var.k;
                dVar3.getClass();
                io.reactivex.rxjava3.core.q s02 = new io.reactivex.rxjava3.internal.operators.observable.y(dVar3, qVar, aVar2).s0(new wii0(new kbq0(i2), 13));
                s02.getClass();
                io.reactivex.rxjava3.core.q l = io.reactivex.rxjava3.core.q.l(dVar, yVar, new io.reactivex.rxjava3.internal.operators.observable.y(s02, qVar, aVar2), new p5w(new u0r(xnt0Var, i4), 24));
                l.getClass();
                return new io.reactivex.rxjava3.internal.operators.observable.y(l, qVar, aVar2);
            case 25:
                return VideosListView$State.a((VideosListView$State) obj, (VideoFile) obj2, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS);
            case 26:
                z8u0 z8u0Var = (z8u0) obj2;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (UserProfile userProfile : (List) obj) {
                    linkedHashMap.put(userProfile.c, userProfile.l0());
                    linkedHashMap2.put(userProfile.c, userProfile);
                }
                ArrayList arrayList2 = z8u0Var.s;
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (((AttachmentWithMedia) next).s() == null) {
                        arrayList3.add(next);
                    }
                }
                ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    AttachmentWithMedia attachmentWithMedia = (AttachmentWithMedia) it3.next();
                    attachmentWithMedia.f1((Owner) linkedHashMap.get(attachmentWithMedia.q()));
                    if (attachmentWithMedia instanceof PhotoAttachment) {
                        Photo photo = ((PhotoAttachment) attachmentWithMedia).l;
                        if (photo.B == null) {
                            photo.B = (UserProfile) linkedHashMap2.get(photo.f);
                        }
                    }
                    arrayList4.add(s3q0.a);
                }
                return s3q0.a;
            case 27:
                zku0 zku0Var = (zku0) obj2;
                for (UsersUserFullDto usersUserFullDto : (List) obj) {
                    if (qr.f(usersUserFullDto.s1())) {
                        L l2 = L.a;
                        l2.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.u(l2, L.LogType.d, new Object[]{"Current user (" + usersUserFullDto.s1() + ") updated in multiaccount, updating avatar."});
                        }
                        Serializer.c<Image> cVar3 = Image.CREATOR;
                        Image a2 = Image.b.a(usersUserFullDto.r2());
                        String r2 = usersUserFullDto.r2();
                        String a3 = r2 != null ? js5.a(iah0.f().density > 1.0f ? 100 : 50, r2) : iah0.f().density > 1.0f ? usersUserFullDto.X1() : usersUserFullDto.o2();
                        cn o = o25.a().o();
                        if (!epx.f(o.c, usersUserFullDto.r2()) || !Boolean.valueOf(o.j).equals(usersUserFullDto.h3())) {
                            zku0Var.a.a(new tr5(a3, a2, epx.f(usersUserFullDto.h3(), Boolean.TRUE)));
                        }
                    }
                    bq0 bq0Var = zku0Var.b;
                    UserId s1 = usersUserFullDto.s1();
                    boolean f = epx.f(usersUserFullDto.h3(), Boolean.TRUE);
                    SharedPreferences.Editor edit = ((SharedPreferences) bq0Var.a.getValue()).edit();
                    edit.putBoolean(bq0.a(s1), f);
                    edit.apply();
                }
                return s3q0.a;
            case 28:
                com.vk.auth.external.b bVar3 = (com.vk.auth.external.b) obj2;
                a.C0400a c0400a = new a.C0400a(wbu0.a(bVar3.a, (Throwable) obj, false).a);
                bVar3.e = c0400a;
                bVar3.f = c0400a;
                bVar3.b.tn(c0400a);
                return s3q0.a;
            default:
                l1k0 l1k0Var = (l1k0) obj2;
                d4c0.a aVar3 = (d4c0.a) obj;
                int i11 = aVar3.a;
                boolean z2 = aVar3.d;
                VideoFile videoFile2 = (VideoFile) l1k0Var.c;
                gzs gzsVar = (gzs) l1k0Var.d;
                wjs0.a(videoFile2.O9() ? new hxr0(videoFile2, z2) : new dyr0(videoFile2));
                if (gzsVar != null) {
                    return (s3q0) gzsVar.invoke();
                }
                return null;
        }
    }
}
