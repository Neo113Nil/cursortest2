package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.l;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.donut.dto.DonutGetLevelsResponseDto;
import com.vk.api.generated.donut.dto.DonutLevelDto;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.camera.clips.impl.authors.selector.list.delegate.ClipsAuthorSelectorAuthorDelegate;
import com.vk.catalog.mvi.block.video.impl.video.largelist.entity.VideoLargeListState;
import com.vk.catalog.mvi.block.video.impl.video.largelisttablet.VideoLargeListTabletView;
import com.vk.channels.api.Channel;
import com.vk.content.design.view.camera.MasksWrap;
import com.vk.core.files.a;
import com.vk.dto.common.clips.ClipVideoItem;
import com.vk.dto.common.data.PrivacyRules;
import com.vk.dto.common.id.UserId;
import com.vk.dto.donut.DonutLevel;
import com.vk.dto.group.Group;
import com.vk.dto.masks.Mask;
import com.vk.dto.messages.WritePermission;
import com.vk.im.engine.models.dialogs.b;
import com.vk.libvideo.api.subtitles.SubtitlesConfigurationMode;
import com.vk.libvideo.models.autoplay.RepeatMode;
import com.vk.libvideo.models.videotracker.PlayerType;
import com.vk.libvideo.models.videotracker.ScreenType;
import com.vk.log.L;
import com.vk.music.bottomsheets.onboarding.presentation.model.OnboardingInfo;
import com.vk.newsfeed.impl.presentation.discover_media.presentation.fragment.DiscoverMediaTabFragment2;
import com.vk.photos.ui.editalbum.domain.PrivacySettingData;
import com.vk.photos.ui.editalbum.domain.a;
import com.vk.photos.ui.editalbum.domain.e;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.profile.community.impl.ui.profile.actions.c;
import com.vk.profile.community.impl.ui.profile.actions.d;
import com.vk.pushes.receivers.c;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonUnknownError;
import com.vk.superapp.common.js.bridge.impl.data.ShareType;
import com.vk.video.ui.edit.privacy.PrivacyEditVideoWatchFragment;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.x;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import kotlin.collections.builders.ListBuilder;
import kotlin.text.Regex;
import xsna.a1s;
import xsna.ad80;
import xsna.ars0;
import xsna.bfz;
import xsna.c580;
import xsna.c5g;
import xsna.ccb;
import xsna.cjx;
import xsna.cn70;
import xsna.d0d;
import xsna.d6f0;
import xsna.d9j0;
import xsna.drm0;
import xsna.dw20;
import xsna.dy2;
import xsna.e43;
import xsna.e6n;
import xsna.e7q0;
import xsna.epx;
import xsna.f5z;
import xsna.f9t;
import xsna.fkq0;
import xsna.fr40;
import xsna.he1;
import xsna.hg1;
import xsna.hhd;
import xsna.hpm;
import xsna.hs50;
import xsna.ido;
import xsna.ie1;
import xsna.ii5;
import xsna.iyp;
import xsna.izs;
import xsna.jai;
import xsna.jd5;
import xsna.k130;
import xsna.k6t0;
import xsna.kh80;
import xsna.kkm;
import xsna.kvm0;
import xsna.kzr0;
import xsna.lrf;
import xsna.m1s;
import xsna.nfd0;
import xsna.npf;
import xsna.nvy;
import xsna.oai;
import xsna.oum;
import xsna.prd0;
import xsna.psm;
import xsna.qc;
import xsna.qcy;
import xsna.qhg0;
import xsna.r870;
import xsna.rsg0;
import xsna.s2u0;
import xsna.s3q0;
import xsna.txw;
import xsna.u1s;
import xsna.u9e;
import xsna.ubb;
import xsna.ui;
import xsna.uuf;
import xsna.v1s;
import xsna.vhk0;
import xsna.vo1;
import xsna.wh50;
import xsna.wow;
import xsna.x1n0;
import xsna.xe1;
import xsna.xh80;
import xsna.xi;
import xsna.xl0;
import xsna.xyr;
import xsna.yc1;
import xsna.yfb;
import xsna.yg5;
import xsna.yo5;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class b0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0100, code lost:
    
        if (r8.intValue() != r10) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0129  */
    /* JADX WARN: Type inference failed for: r1v23, types: [xsna.e5z, xsna.xo5] */
    /* JADX WARN: Type inference failed for: r1v9, types: [com.vk.im.ui.themes.AccentColor] */
    /* JADX WARN: Type inference failed for: r2v9, types: [androidx.lifecycle.Lifecycle] */
    /* JADX WARN: Type inference failed for: r3v34, types: [java.lang.Object] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        dw20 dw20Var;
        FragmentActivity activity;
        int i = this.b;
        String str = "";
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                l0 l0Var = (l0) obj3;
                String str2 = (String) obj2;
                if (((Boolean) obj).booleanValue()) {
                    x1n0.b(l0Var.L0(), ShareType.INSTAGRAM.h(), str2);
                } else {
                    l0Var.w0().o(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNKNOWN_ERROR, null, new Responses$ReasonUnknownError(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131064, null), str2, 1, null));
                }
                return s3q0.a;
            case 1:
                ui uiVar = (ui) obj3;
                ?? r1 = ((xi) obj2).n;
                uiVar.invoke(r1 != 0 ? r1 : null);
                return s3q0.a;
            case 2:
                xe1 xe1Var = (xe1) obj3;
                nvy nvyVar = (nvy) obj;
                List list = xe1Var.d;
                wow wowVar = new wow(list);
                nvyVar.e(list.size(), null, new he1(wowVar, 0), new jai(802480018, new ie1(wowVar, (izs) obj2), true));
                if (xe1Var.c) {
                    nvy.g(nvyVar, null, null, oai.a, 3);
                }
                return s3q0.a;
            case 3:
                s2u0 s2u0Var = (s2u0) obj;
                ((izs) obj3).invoke(new yc1.b(((vo1) obj2).b, s2u0Var.b(), s2u0Var.a()));
                return s3q0.a;
            case 4:
                return ((jd5) obj3).a.e((UserId) obj2);
            case 5:
                f5z f5zVar = (f5z) obj3;
                final wh50 wh50Var = (wh50) obj2;
                ?? r12 = new l() { // from class: xsna.xo5
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // androidx.lifecycle.l
                    public final void onStateChanged(f5z f5zVar2, Lifecycle.Event event) {
                        int i2 = yo5.a.$EnumSwitchMapping$0[event.ordinal()];
                        wh50 wh50Var2 = wh50.this;
                        wh50Var2.setValue(Boolean.valueOf(i2 != 1 ? i2 != 2 ? ((Boolean) wh50Var2.getValue()).booleanValue() : false : true));
                    }
                };
                f5zVar.getLifecycle().addObserver(r12);
                return new yo5.d(f5zVar, r12);
            case 6:
                ubb ubbVar = (ubb) obj3;
                Channel channel = (Channel) obj2;
                ubbVar.getClass();
                return new ccb(channel.x && channel.o, ubbVar.m.b);
            case 7:
                ((d0d) obj3).b.remove((String) obj2);
                return s3q0.a;
            case 8:
                ((ClipsAuthorSelectorAuthorDelegate.a) obj3).l.invoke(((hhd) obj2).b);
                return s3q0.a;
            case 9:
                r870.a().c().getClass();
                L.LogType logType = L.LogType.e;
                L.a.getClass();
                L.x(logType, "LoggingTracker", null, (Throwable) obj);
                Regex regex = a.a;
                vhk0.b((File) obj3);
                return x.k((ClipVideoItem) obj2);
            case 10:
                ClipsDraftPersistentStore.r((ClipsDraftPersistentStore) obj, ((ido) obj3).a, 6);
                ((qc) obj2).invoke();
                return s3q0.a;
            case 11:
                lrf lrfVar = (lrf) obj2;
                npf z0 = ((uuf.i) obj3).z0();
                if (z0 != null) {
                    lrfVar.invoke(z0);
                }
                return s3q0.a;
            case 12:
                ((c) obj3).e.invoke(new CommunityProfileAction.e.c.C1577c(((d.j.q.e) ((d.j.q) obj2)).a, ((Boolean) obj).booleanValue()));
                return s3q0.a;
            case 13:
                k6t0 k6t0Var = (k6t0) obj3;
                if (epx.f(((nfd0.b) obj2).c, PrivacyRules.f)) {
                    DonutLevel donutLevel = k6t0Var.G.g;
                    UserId userId = k6t0Var.v;
                    if (userId != null) {
                        io.reactivex.rxjava3.disposables.c subscribe = rsg0.y0(yfb.x(dy2.c(new dy2(), userId, null, 26)), null, null, 3).subscribe(new k130(new prd0(8, k6t0Var, donutLevel), 29), new e7q0(new qhg0(k6t0Var, 23), 7));
                        WeakReference<dw20> weakReference = k6t0Var.j;
                        if (weakReference != null && (dw20Var = weakReference.get()) != null) {
                            hg1.a(subscribe, dw20Var);
                        }
                    }
                }
                return s3q0.a;
            case 14:
                ((TextView) obj).setTextColor(((Number) ((kvm0) obj3).invoke((kkm) obj2)).intValue());
                return s3q0.a;
            case 15:
                WritePermission writePermission = (WritePermission) obj2;
                ((hpm) obj3).b.b().execSQL("UPDATE dialogs SET write_permission = ?, write_restricted_till = ? WHERE id = ?", new Object[]{Integer.valueOf(writePermission.a.i()), Long.valueOf(writePermission.b), Long.valueOf(((b) obj).b)});
                return s3q0.a;
            case 16:
                bfz.a aVar = (bfz.a) obj3;
                psm psmVar = (psm) obj2;
                oum oumVar = (oum) obj;
                return aVar instanceof bfz.a.g ? psmVar.w(oum.a(oumVar, null, null, null, null, null, null, null, null, null, aVar, null, null, 3583), EmptySet.b) : psmVar.w(oum.a(oumVar, null, null, null, null, null, null, null, null, aVar, null, null, null, 3839), EmptySet.b);
            case 17:
                final DiscoverMediaTabFragment2 discoverMediaTabFragment2 = (DiscoverMediaTabFragment2) obj3;
                com.vk.mvi.binder.c cVar = (com.vk.mvi.binder.c) obj;
                qcy<Object>[] qcyVarArr = DiscoverMediaTabFragment2.C0;
                com.vk.mvi.binder.c.a(cVar, f9t.w(discoverMediaTabFragment2.ho()), new iyp() { // from class: xsna.e5n
                    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
                    @Override // xsna.iyp
                    public final void a(pk50 pk50Var) {
                        DiscoverMediaTabFragment2 discoverMediaTabFragment22 = DiscoverMediaTabFragment2.this;
                        i3n i3nVar = (i3n) discoverMediaTabFragment22.Q.getValue();
                        a3n fo = discoverMediaTabFragment22.fo();
                        FragmentActivity activity2 = discoverMediaTabFragment22.getActivity();
                        RecyclerView recyclerView = discoverMediaTabFragment22.n0;
                        i3nVar.getClass();
                        i3n.a(fo, discoverMediaTabFragment22, activity2, recyclerView, (e3n) pk50Var);
                    }
                });
                com.vk.mvi.binder.c.b(cVar, f9t.F(f9t.z(discoverMediaTabFragment2.ho()), new u9e((e6n) obj2, 3)), new xl0(discoverMediaTabFragment2, 18));
                return s3q0.a;
            case 18:
                ((com.vk.photos.ui.editalbum.domain.c) obj3).T(new e.g(new PrivacySettingData(((a.i) obj2).b, "")));
                return s3q0.a;
            case 19:
                m1s m1sVar = (m1s) obj2;
                xyr xyrVar = ((v1s) obj).a.get(Integer.valueOf(((c580) ((a1s) obj3)).b));
                if (xyrVar != null) {
                    m1sVar.n(new u1s.h(R.string.vkim_folder_edit_failed, xyrVar.getName()));
                }
                return s3q0.a;
            case 20:
                yg5 yg5Var = (yg5) obj3;
                return VideoLargeListState.a((VideoLargeListState) obj, yg5Var.A(), false, false, null, null, null, false, null, null, yg5Var, new com.vk.libvideo.autoplay.a(false, RepeatMode.BY_VIDEO_PARAMS, null, false, false, true, null, SubtitlesConfigurationMode.FROM_PERSISTENT_STORAGE, null, null, PlayerType.INLINE, ScreenType.INLINE, false, null, 289788), ii5.a(yg5Var), null, null, null, null, new kzr0(true, false, false, new txw((ars0) obj2), true), null, 0, 58261499);
            case 21:
                Throwable th = (Throwable) obj;
                int i2 = MasksWrap.e0;
                L.g("MasksWrap", th);
                ((MasksWrap) obj3).l((Mask) obj2, th);
                return s3q0.a;
            case 22:
                ((hs50) obj3).d7((View) obj, (cjx) obj2, "DEFAULT", 2);
                return s3q0.a;
            case 23:
                c.a aVar2 = com.vk.pushes.receivers.c.b;
                c.a.e((Context) obj3, (Intent) obj2, (Throwable) obj);
                return s3q0.a;
            case 24:
                fr40.b bVar = ((kh80) obj3).d;
                OnboardingInfo onboardingInfo = ((xh80) obj2).b;
                bVar.invoke(new ad80.c(onboardingInfo.b, onboardingInfo.c));
                return s3q0.a;
            case 25:
                PrivacyEditVideoWatchFragment privacyEditVideoWatchFragment = (PrivacyEditVideoWatchFragment) obj3;
                Integer num = (Integer) obj2;
                DonutGetLevelsResponseDto donutGetLevelsResponseDto = (DonutGetLevelsResponseDto) obj;
                qcy<Object>[] qcyVarArr2 = PrivacyEditVideoWatchFragment.a1;
                if (!donutGetLevelsResponseDto.e().isEmpty()) {
                    ListBuilder e = e43.e();
                    if (!epx.f(donutGetLevelsResponseDto.d(), Boolean.TRUE)) {
                        int i3 = DonutLevel.f.b;
                        if (num != null) {
                            break;
                        }
                        int h = e43.h(donutGetLevelsResponseDto.e());
                        List<DonutLevelDto> e2 = donutGetLevelsResponseDto.e();
                        ArrayList arrayList = new ArrayList(c5g.u(e2, 10));
                        int i4 = 0;
                        for (Object obj4 : e2) {
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                e43.t();
                                throw null;
                            }
                            DonutLevelDto donutLevelDto = (DonutLevelDto) obj4;
                            arrayList.add(new DonutLevel(donutLevelDto.getId(), donutLevelDto.getTitle(), donutLevelDto.d(), i4 == h));
                            i4 = i5;
                        }
                        e.addAll(arrayList);
                        privacyEditVideoWatchFragment.X0 = e.g();
                    }
                    e.add(DonutLevel.f);
                    int h2 = e43.h(donutGetLevelsResponseDto.e());
                    List<DonutLevelDto> e22 = donutGetLevelsResponseDto.e();
                    ArrayList arrayList2 = new ArrayList(c5g.u(e22, 10));
                    int i42 = 0;
                    while (r1.hasNext()) {
                    }
                    e.addAll(arrayList2);
                    privacyEditVideoWatchFragment.X0 = e.g();
                }
                if (privacyEditVideoWatchFragment.Y0 == null) {
                    ListBuilder listBuilder = privacyEditVideoWatchFragment.X0;
                    if (listBuilder != null) {
                        ListIterator listIterator = listBuilder.listIterator(0);
                        while (true) {
                            ListBuilder.a aVar3 = (ListBuilder.a) listIterator;
                            if (aVar3.hasNext()) {
                                ?? next = aVar3.next();
                                int i6 = ((DonutLevel) next).b;
                                if (num != null && i6 == num.intValue()) {
                                    r7 = next;
                                }
                            }
                        }
                        r7 = r7;
                    }
                    privacyEditVideoWatchFragment.Y0 = r7;
                }
                DonutLevel donutLevel2 = privacyEditVideoWatchFragment.Y0;
                if (donutLevel2 != null && !donutLevel2.equals(DonutLevel.f)) {
                    PrivacyRules.PredefinedSet predefinedSet = PrivacyRules.f;
                    boolean z = donutLevel2.e;
                    String str3 = donutLevel2.c;
                    if (z || drm0.N(str3) || ((activity = privacyEditVideoWatchFragment.getActivity()) != null && (str3 = activity.getString(R.string.video_donut_level_subtitle_with_higher_format, str3)) != null)) {
                        str = str3;
                    }
                    privacyEditVideoWatchFragment.To(predefinedSet, str);
                    privacyEditVideoWatchFragment.q();
                }
                return s3q0.a;
            case 26:
                FrameLayout frameLayout = (FrameLayout) obj3;
                ViewGroup viewGroup = (ViewGroup) obj2;
                int intValue = ((Integer) obj).intValue();
                if (frameLayout.getY() > (viewGroup.getHeight() - intValue) - cn70.b(3)) {
                    frameLayout.setY((viewGroup.getHeight() - intValue) - cn70.b(3));
                }
                return s3q0.a;
            case 27:
                ((d6f0) obj3).c.add((String) obj2);
                return s3q0.a;
            case 28:
                com.vk.lists.c cVar2 = (com.vk.lists.c) obj3;
                d9j0 d9j0Var = (d9j0) obj2;
                Pair pair = (Pair) obj;
                int intValue2 = ((Number) pair.d()).intValue();
                List list2 = (List) pair.g();
                cVar2.q(cVar2.k() + cVar2.i());
                cVar2.r(intValue2 > cVar2.i());
                izs<List<? extends Group>, s3q0> izsVar = d9j0Var.b;
                List<Group> list3 = list2;
                ArrayList arrayList3 = new ArrayList(c5g.u(list3, 10));
                for (Group group : list3) {
                    Group group2 = new Group(group);
                    group2.c = fkq0.e(group.c);
                    arrayList3.add(group2);
                }
                izsVar.invoke(arrayList3);
                return s3q0.a;
            default:
                s2u0 s2u0Var2 = (s2u0) obj;
                ((izs) obj3).invoke(new VideoLargeListTabletView.c.d(((VideoLargeListTabletView.d) obj2).b, s2u0Var2.a, s2u0Var2.b));
                return s3q0.a;
        }
    }
}
