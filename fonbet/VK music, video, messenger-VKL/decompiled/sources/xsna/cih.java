package xsna;

import android.app.Activity;
import android.view.View;
import com.vk.api.base.Document;
import com.vk.api.generated.market.dto.MarketItemLabelActionDto;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.articles.Article;
import com.vk.dto.common.Good;
import com.vk.dto.common.GoodAlbum;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupChat;
import com.vk.dto.group.GroupContentTabSetting;
import com.vk.dto.group.GroupContentTabType;
import com.vk.dto.hints.HintId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.user.UserProfile;
import com.vk.dto.video.VideoAlbum;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.profile.community.impl.ui.profile.actions.d;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileState;
import com.vk.profile.community.impl.ui.profile.state.Services;
import com.vk.profile.core.content.ContentTab;
import com.vk.profile.core.tabs.state.CommunityProfileContent;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.profile.core.tabs.ui.clips.Clips;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeTabContentType;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeTabItemClick;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.CommonVideoStat$TypeScreenMode;
import com.vk.stat.scheme.CommonVideoStat$TypeVideoCardEvent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsGroupsStat$TabEvent;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.toggle.features.ComFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.cvd0;
import xsna.sst0;

/* compiled from: CommunityProfileContentFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class cih {
    public final bpn0 A;
    public final bpn0 B;
    public final UserId a;
    public final io.reactivex.rxjava3.disposables.b b;
    public final bw6 c;
    public final p99 d;
    public final boolean e;
    public final ynh f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final bpn0 n;
    public final bpn0 o;
    public final bpn0 p;
    public final bpn0 q;
    public final bpn0 r;
    public final bpn0 s;
    public final Object t;
    public final bpn0 u;
    public final bpn0 v;
    public final bpn0 w;
    public final bpn0 x;
    public final bpn0 y;
    public final bpn0 z;

    /* compiled from: CommunityProfileContentFeatureDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GroupContentTabType.values().length];
            try {
                iArr[GroupContentTabType.WALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GroupContentTabType.DONUT_WALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GroupContentTabType.MAIN_WALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GroupContentTabType.PHOTOS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[GroupContentTabType.PHOTOS_ALBUMS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[GroupContentTabType.VIDEOS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[GroupContentTabType.VIDEOS_PLAYLISTS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[GroupContentTabType.DISCUSSIONS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[GroupContentTabType.NARRATIVES.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[GroupContentTabType.AUDIOS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[GroupContentTabType.AUDIOS_PLAYLISTS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[GroupContentTabType.CHATS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[GroupContentTabType.SHORT_VIDEOS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[GroupContentTabType.SHORT_VIDEOS_PLAYLISTS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[GroupContentTabType.PODCASTS.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[GroupContentTabType.FILES.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[GroupContentTabType.ARTICLES.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[GroupContentTabType.MARKET_ALBUMS.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[GroupContentTabType.MARKET.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[GroupContentTabType.SERVICES.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[GroupContentTabType.EVENTS.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public cih(UserId userId, io.reactivex.rxjava3.disposables.b bVar, po5 po5Var, bw6 bw6Var, p99 p99Var, ynh ynhVar, boolean z) {
        this.a = userId;
        this.b = bVar;
        this.c = bw6Var;
        this.d = p99Var;
        this.e = z;
        this.f = ynhVar;
        sk4 sk4Var = new sk4(6);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.g = msy.a(lazyThreadSafetyMode, sk4Var);
        this.h = msy.a(lazyThreadSafetyMode, new ca(this, 29));
        this.i = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.ui.v(13));
        this.j = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.interactor.b(this, 25));
        this.k = msy.a(lazyThreadSafetyMode, new v6(this, 22));
        this.l = msy.a(lazyThreadSafetyMode, new bih(this, 0));
        this.m = msy.a(lazyThreadSafetyMode, new rj1(this, 27));
        this.n = new bpn0(new com.vk.catalog2.common.ui.holders.b(7, this, po5Var));
        this.o = new bpn0(new wx0(6, this, po5Var));
        this.p = new bpn0(new hn9(6, this, po5Var));
        this.q = new bpn0(new com.vk.voip.a(7, this, po5Var));
        this.r = new bpn0(new rp1(7, this, po5Var));
        this.s = new bpn0(new mk(6, this, po5Var));
        this.t = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.ui.r0(9, this, po5Var));
        this.u = new bpn0(new jl4(5, this, po5Var));
        this.v = new bpn0(new t9b(5, this, po5Var));
        this.w = new bpn0(new pk(6, this, po5Var));
        this.x = new bpn0(new tbg(this, 5));
        this.y = new bpn0(new oe5(4, this, po5Var));
        this.z = new bpn0(new xg2(2, this, po5Var));
        this.A = new bpn0(new com.vk.movika.sdk.base.ui.s(6, this, po5Var));
        this.B = new bpn0(new ie3(8, this, po5Var));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0295  */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v29, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(cih cihVar, ExtendedCommunityProfile extendedCommunityProfile, ContentTab contentTab, ContentTab contentTab2, boolean z, int i) {
        Integer num;
        Integer num2;
        CommunityProfileContentItem b9x0Var;
        CommunityProfileContentItem p5oVar;
        GroupContentTabSetting.GroupContentTabTabletConfig groupContentTabTabletConfig;
        ContentTab contentTab3 = (i & 2) != 0 ? null : contentTab;
        ContentTab contentTab4 = (i & 4) != 0 ? null : contentTab2;
        boolean z2 = (i & 8) != 0 ? false : z;
        boolean z3 = contentTab3 != null;
        boolean z4 = contentTab4 != null;
        ArrayList arrayList = new ArrayList();
        List<GroupContentTabSetting> list = extendedCommunityProfile.U2;
        if (list != null) {
            for (GroupContentTabSetting groupContentTabSetting : list) {
                switch (a.$EnumSwitchMapping$0[groupContentTabSetting.b.ordinal()]) {
                    case 1:
                        b9x0Var = new b9x0(new CommunityProfileContentItem.b(R.string.wall_empty, null, null, null, null, 30), new CommunityProfileContentItem.c(R.string.community_content_wall_error), z3 ? CommunityProfileContentItem.State.RELOAD : CommunityProfileContentItem.State.LOADED, false, 24);
                        p5oVar = b9x0Var;
                        break;
                    case 2:
                        p5oVar = new p5o(new CommunityProfileContentItem.b(R.string.wall_empty, null, null, null, null, 30), new CommunityProfileContentItem.c(R.string.community_content_wall_error), z3 ? CommunityProfileContentItem.State.RELOAD : CommunityProfileContentItem.State.LOADED, false);
                        break;
                    case 3:
                        ComFeatures comFeatures = ComFeatures.COM_MAIN_TAB;
                        comFeatures.getClass();
                        if (com.vk.toggle.b.A.a(comFeatures)) {
                            b9x0Var = new lg00(new CommunityProfileContentItem.b(R.string.main_wall_empty, null, null, null, null, 30), new CommunityProfileContentItem.c(R.string.community_content_wall_error), z3 ? CommunityProfileContentItem.State.RELOAD : CommunityProfileContentItem.State.INITIAL, false, (!z4 && w2h.a(extendedCommunityProfile)) ? new CommunityProfileContentItem.e(HintId.COMMUNITY_PROFILE_MAIN_WALL_TAB_ONBOARDING.getId(), R.string.community_main_wall_tab_onboarding) : null);
                            p5oVar = b9x0Var;
                            break;
                        }
                        p5oVar = null;
                        break;
                    case 4:
                    case 5:
                        p5oVar = ((fkh) cihVar.n.getValue()).r(groupContentTabSetting, z3);
                        break;
                    case 6:
                    case 7:
                        p5oVar = ((qlh) cihVar.q.getValue()).r(groupContentTabSetting, z3);
                        break;
                    case 8:
                        p5oVar = ((chh) cihVar.s.getValue()).r(groupContentTabSetting, z3);
                        break;
                    case 9:
                        p5oVar = ((tjh) cihVar.r.getValue()).r(groupContentTabSetting, z3);
                        break;
                    case 10:
                    case 11:
                        p5oVar = ((mfh) cihVar.t.getValue()).r(groupContentTabSetting, z3);
                        break;
                    case 12:
                        p5oVar = ((ofh) cihVar.o.getValue()).r(groupContentTabSetting, z3);
                        break;
                    case 13:
                    case 14:
                        if (!cihVar.e || (groupContentTabTabletConfig = groupContentTabSetting.f) == null || groupContentTabTabletConfig.b) {
                            p5oVar = ((dgh) cihVar.p.getValue()).t(groupContentTabSetting, extendedCommunityProfile, z3);
                            break;
                        }
                        p5oVar = null;
                        break;
                    case 15:
                        okh okhVar = (okh) cihVar.u.getValue();
                        okhVar.getClass();
                        p5oVar = new xkb0(null, false, null, nfh.p(okhVar, groupContentTabSetting, R.string.community_content_podcasts_empty, null, null, 14), new CommunityProfileContentItem.c(R.string.community_content_podcasts_error), z3 ? CommunityProfileContentItem.State.RELOAD : CommunityProfileContentItem.State.INITIAL, nfh.n(okhVar, groupContentTabSetting, 0, R.string.community_profile_fab_open_podcasts, false, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE), CommunityProfileContentItem.State.INITIAL);
                        break;
                    case 16:
                        p5oVar = ((lhh) cihVar.v.getValue()).r(groupContentTabSetting, z3);
                        break;
                    case 17:
                        p5oVar = ((jfh) cihVar.w.getValue()).r(groupContentTabSetting, z3);
                        break;
                    case 18:
                    case 19:
                        p5oVar = ((fih) cihVar.z.getValue()).s(groupContentTabSetting, z3);
                        break;
                    case 20:
                        p5oVar = ((xkh) cihVar.A.getValue()).r(groupContentTabSetting, z3);
                        break;
                    case 21:
                        p5oVar = ((thh) cihVar.B.getValue()).r(groupContentTabSetting, z3);
                        break;
                    default:
                        p5oVar = null;
                        break;
                }
                if (p5oVar != null) {
                    arrayList.add(p5oVar);
                }
            }
        }
        if (contentTab3 != null) {
            Iterator it = arrayList.iterator();
            int i2 = 0;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if (i2 < 0) {
                        e43.t();
                        throw null;
                    }
                    if (!epx.f(((CommunityProfileContentItem) next).a.d(), contentTab3.d())) {
                        i2++;
                    }
                } else {
                    i2 = -1;
                }
            }
            num = i2 == -1 ? null : Integer.valueOf(i2);
        } else {
            num = null;
        }
        if (contentTab4 != null) {
            Iterator it2 = arrayList.iterator();
            int i3 = 0;
            while (true) {
                if (it2.hasNext()) {
                    Object next2 = it2.next();
                    if (i3 < 0) {
                        e43.t();
                        throw null;
                    }
                    if (!epx.f(((CommunityProfileContentItem) next2).a.d(), contentTab4.d())) {
                        i3++;
                    }
                } else {
                    i3 = -1;
                }
            }
            if (i3 != -1) {
                num2 = Integer.valueOf(i3);
                cihVar.c.invoke(new d.g(new CommunityProfileContent(cihVar.a, arrayList, (ContentTab) null, extendedCommunityProfile.a.e, (w2h.a(extendedCommunityProfile) || ((Boolean) cihVar.g.getValue()).booleanValue()) ? false : true, num, num2 == null ? new CommunityProfileContent.InitialPosition(num2.intValue(), !(contentTab4 instanceof ContentTab.Clip) ? CommunityProfileContent.InitialPosition.ScrollToContentType.BASE : CommunityProfileContent.InitialPosition.ScrollToContentType.NONE) : null, z2, extendedCommunityProfile.B1, (Pair) null, 1156)));
            }
        }
        num2 = null;
        if (num2 == null) {
        }
        cihVar.c.invoke(new d.g(new CommunityProfileContent(cihVar.a, arrayList, (ContentTab) null, extendedCommunityProfile.a.e, (w2h.a(extendedCommunityProfile) || ((Boolean) cihVar.g.getValue()).booleanValue()) ? false : true, num, num2 == null ? new CommunityProfileContent.InitialPosition(num2.intValue(), !(contentTab4 instanceof ContentTab.Clip) ? CommunityProfileContent.InitialPosition.ScrollToContentType.BASE : CommunityProfileContent.InitialPosition.ScrollToContentType.NONE) : null, z2, extendedCommunityProfile.B1, (Pair) null, 1156)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        if (r7 == null) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:153:0x06f9  */
    /* JADX WARN: Removed duplicated region for block: B:215:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(CommunityProfileAction.f fVar, CommunityProfileState communityProfileState) {
        CommunityProfileContentItem a2;
        List<CommunityProfileContentItem> list;
        Object obj;
        UserProfile userProfile;
        UserId userId;
        UserId userId2;
        UserId userId3;
        Object eVar;
        UserProfile userProfile2;
        UserId userId4;
        Integer valueOf;
        List<VideoAlbum> list2;
        List<Playlist> list3;
        List<MusicTrack> list4;
        CommonCommunitiesStat$TypeTabContentType commonCommunitiesStat$TypeTabContentType;
        CommonCommunitiesStat$TypeTabContentType commonCommunitiesStat$TypeTabContentType2;
        UserProfile userProfile3;
        UserId userId5;
        UserProfile userProfile4;
        UserId userId6;
        UserProfile userProfile5;
        UserId userId7;
        List<CommunityProfileContentItem> list5;
        Object obj2;
        int i = 0;
        ExtendedCommunityProfile extendedCommunityProfile = communityProfileState.b;
        CommunityProfileContent communityProfileContent = communityProfileState.d;
        CommunityProfileContentItem.State state = null;
        Long valueOf2 = null;
        state = null;
        state = null;
        if (communityProfileContent != null && (list5 = communityProfileContent.b) != null) {
            Iterator<T> it = list5.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                } else {
                    obj2 = it.next();
                    if (((CommunityProfileContentItem) obj2).h == fVar.a().h) {
                        break;
                    }
                }
            }
            a2 = (CommunityProfileContentItem) obj2;
        }
        a2 = fVar.a();
        jxg b = b(a2);
        boolean z = fVar instanceof CommunityProfileAction.f.o;
        p99 p99Var = this.d;
        bw6 bw6Var = this.c;
        if (z) {
            ContentTab contentTab = a2.a;
            bw6Var.invoke(new d.p(contentTab));
            if (((CommunityProfileAction.f.o) fVar).c) {
                if (b != null) {
                    b.k(fVar.b, extendedCommunityProfile);
                }
            } else if ((a2.f() == CommunityProfileContentItem.State.INITIAL || a2.f() == CommunityProfileContentItem.State.RELOAD) && b != null) {
                b.k(a2, extendedCommunityProfile);
            }
            if ((contentTab instanceof ContentTab.Wall) || (contentTab instanceof ContentTab.DonutWall)) {
                bw6Var.invoke(d.a0.b);
            }
            p99Var.invoke(new d.n(contentTab));
            return;
        }
        boolean z2 = fVar instanceof CommunityProfileAction.f.r;
        ?? r13 = this.i;
        if (z2) {
            hfh hfhVar = (hfh) r13.getValue();
            CommunityProfileContentItem communityProfileContentItem = ((CommunityProfileAction.f.r) fVar).c;
            hfhVar.getClass();
            if (extendedCommunityProfile == null || (userProfile5 = extendedCommunityProfile.a) == null || (userId7 = userProfile5.c) == null) {
                return;
            }
            hfh.b(hfh.a(communityProfileContentItem, false), MobileOfficialAppsGroupsStat$TabEvent.TabEventType.OPEN, userId7);
            return;
        }
        if (fVar instanceof CommunityProfileAction.f.l) {
            ContentTab contentTab2 = a2.a;
            if ((contentTab2 instanceof ContentTab.Wall) || (contentTab2 instanceof ContentTab.DonutWall)) {
                bw6Var.invoke(d.a0.b);
                return;
            } else {
                if ((a2.f() == CommunityProfileContentItem.State.INITIAL || a2.f() == CommunityProfileContentItem.State.RELOAD) && b != null) {
                    b.k(a2, extendedCommunityProfile);
                    return;
                }
                return;
            }
        }
        if (fVar instanceof CommunityProfileAction.f.k) {
            if (b != null) {
                b.d(a2, extendedCommunityProfile);
                return;
            }
            return;
        }
        if (fVar instanceof CommunityProfileAction.f.a) {
            if (b != null) {
                b.f(a2, extendedCommunityProfile);
                return;
            }
            return;
        }
        if (fVar instanceof CommunityProfileAction.f.j) {
            if (b != null) {
                b.i(a2, extendedCommunityProfile);
                return;
            }
            return;
        }
        if (fVar instanceof CommunityProfileAction.f.b) {
            if (b != null) {
                b.j(a2, extendedCommunityProfile);
                return;
            }
            return;
        }
        if (fVar instanceof CommunityProfileAction.f.q) {
            if (b != null) {
                b.e(a2, extendedCommunityProfile);
            }
            ((hfh) r13.getValue()).getClass();
            if (extendedCommunityProfile == null || (userProfile4 = extendedCommunityProfile.a) == null || (userId6 = userProfile4.c) == null) {
                return;
            }
            hfh.b(hfh.a(a2, false), MobileOfficialAppsGroupsStat$TabEvent.TabEventType.MORE, userId6);
            return;
        }
        if (fVar instanceof CommunityProfileAction.f.c) {
            if (b != null) {
                b.g(a2, extendedCommunityProfile);
            }
            ((hfh) r13.getValue()).getClass();
            if (extendedCommunityProfile == null || (userProfile3 = extendedCommunityProfile.a) == null || (userId5 = userProfile3.c) == null) {
                return;
            }
            CommonCommunitiesStat$TypeTabContentType a3 = hfh.a(a2, false);
            if (!(a2 instanceof p8u) || ((p8u) a2).m) {
                hfh.b(a3, MobileOfficialAppsGroupsStat$TabEvent.TabEventType.ADD, userId5);
                return;
            }
            return;
        }
        if (fVar instanceof CommunityProfileAction.f.n) {
            if (b != null) {
                b.a(a2, extendedCommunityProfile);
                return;
            }
            return;
        }
        int i2 = 2;
        if (!(fVar instanceof CommunityProfileAction.f.d)) {
            if (fVar instanceof CommunityProfileAction.f.p) {
                if (b != null) {
                    b.h(a2, extendedCommunityProfile);
                }
                ((hfh) r13.getValue()).getClass();
                if (extendedCommunityProfile == null || (userProfile = extendedCommunityProfile.a) == null || (userId = userProfile.c) == null) {
                    return;
                }
                hfh.b(hfh.a(a2, true), MobileOfficialAppsGroupsStat$TabEvent.TabEventType.MORE, userId);
                return;
            }
            if (fVar instanceof CommunityProfileAction.f.h) {
                hjh hjhVar = (hjh) this.j.getValue();
                hjhVar.getClass();
                nu50 nu50Var = ((CommunityProfileAction.f.h) fVar).c;
                if (nu50Var == null || extendedCommunityProfile == null) {
                    return;
                }
                hjhVar.a.invoke((!extendedCommunityProfile.s2 || extendedCommunityProfile.a0 < 3) ? new d.g.a.b(nu50Var.a, nu50Var.b) : new d.g.a.C1594a(nu50Var.a, nu50Var.b));
                return;
            }
            if (fVar instanceof CommunityProfileAction.f.C1586f) {
                gjh gjhVar = (gjh) this.k.getValue();
                gjhVar.getClass();
                aih<?> aihVar = ((CommunityProfileAction.f.C1586f) fVar).c;
                if (aihVar instanceof s4u) {
                    s4u s4uVar = (s4u) aihVar;
                    c63 c63Var = c63.a;
                    Activity b2 = c63.b();
                    if (b2 == null) {
                        return;
                    }
                    f5u f5uVar = s4uVar.a;
                    isq.b(gjhVar.a, b2, ao8.s(f5uVar.b), new fjh(gjhVar, f5uVar, s4uVar, i), new wd0(5, gjhVar, f5uVar), new sh3(14, gjhVar, f5uVar), false, null, null, 480);
                    return;
                }
                if (aihVar instanceof yoi0) {
                    yoi0 yoi0Var = (yoi0) aihVar;
                    c63 c63Var2 = c63.a;
                    Activity b3 = c63.b();
                    if (b3 == null) {
                        return;
                    }
                    f5u f5uVar2 = yoi0Var.a;
                    isq.b(gjhVar.a, b3, ao8.s(f5uVar2.b), new ejh(gjhVar, f5uVar2, yoi0Var, i), new sg4(i2, gjhVar, f5uVar2), new defpackage.o(16, gjhVar, f5uVar2), false, null, null, 480);
                    return;
                }
                return;
            }
            if (fVar instanceof CommunityProfileAction.f.e) {
                djh djhVar = (djh) this.l.getValue();
                djhVar.getClass();
                omh<?> omhVar = ((CommunityProfileAction.f.e) fVar).c;
                if (omhVar instanceof f4u) {
                    f4u f4uVar = (f4u) omhVar;
                    djhVar.a(f4uVar.a, f4uVar.b, f4uVar.c, CommonMarketStat$TypeRefSource.COMMUNITY_TAB_MARKET, false);
                    return;
                } else {
                    if (omhVar instanceof toi0) {
                        toi0 toi0Var = (toi0) omhVar;
                        djhVar.a(toi0Var.a, toi0Var.b, toi0Var.c, CommonMarketStat$TypeRefSource.COMMUNITY_TAB_SERVICES, true);
                        return;
                    }
                    return;
                }
            }
            if (!(fVar instanceof CommunityProfileAction.f.m)) {
                if (fVar instanceof CommunityProfileAction.f.i) {
                    p99Var.invoke(new d.j.u0(((CommunityProfileAction.f.i) fVar).c.b()));
                    return;
                }
                if (!(fVar instanceof CommunityProfileAction.f.g)) {
                    throw new NoWhenBranchMatchedException();
                }
                qih qihVar = (qih) this.m.getValue();
                qihVar.getClass();
                utb utbVar = ((CommunityProfileAction.f.g) fVar).c;
                if (utbVar != null) {
                    qihVar.a.invoke(new d.j.t((MarketItemLabelActionDto) utbVar.c));
                    return;
                }
                return;
            }
            if (communityProfileContent != null && (list = communityProfileContent.b) != null) {
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it2.next();
                        if (epx.f(((CommunityProfileContentItem) obj).a.d(), fVar.b.a.d())) {
                            break;
                        }
                    }
                }
                CommunityProfileContentItem communityProfileContentItem2 = (CommunityProfileContentItem) obj;
                if (communityProfileContentItem2 != null) {
                    state = communityProfileContentItem2.f();
                }
            }
            if (state == CommunityProfileContentItem.State.LOADING || state == CommunityProfileContentItem.State.INITIAL || b == null) {
                return;
            }
            b.c(communityProfileState);
            return;
        }
        CommunityProfileAction.f.d dVar = (CommunityProfileAction.f.d) fVar;
        wfh wfhVar = dVar.d;
        p99 p99Var2 = ((cjh) this.h.getValue()).a;
        WeakReference<View> weakReference = dVar.e;
        int i3 = dVar.f;
        boolean z3 = wfhVar instanceof t5a0;
        if (z3) {
            t5a0 t5a0Var = (t5a0) wfhVar;
            iea0 iea0Var = t5a0Var.b;
            if (extendedCommunityProfile != null && weakReference != null) {
                p99Var2.invoke(new d.j.r0.o(iea0Var, t5a0Var.a, weakReference, i3, extendedCommunityProfile));
            }
        } else if (wfhVar instanceof t4a0) {
            p99Var2.invoke(new d.j.r0.p(((t4a0) wfhVar).a));
        } else if (wfhVar instanceof u0s0) {
            p99Var2.invoke(new d.j.r0.v(((u0s0) wfhVar).a));
        } else if (wfhVar instanceof gbs0) {
            gbs0 gbs0Var = (gbs0) wfhVar;
            p99Var2.invoke(new d.j.r0.u(gbs0Var.a, gbs0Var.c));
        } else if (wfhVar instanceof jhs0) {
            p99Var2.invoke(new d.j.p0(((jhs0) wfhVar).a, extendedCommunityProfile));
        } else if (wfhVar instanceof khs0) {
            p99Var2.invoke(new d.j.o0(((khs0) wfhVar).a));
        } else if (wfhVar instanceof san) {
            san sanVar = (san) wfhVar;
            if (extendedCommunityProfile != null) {
                p99Var2.invoke(new d.j.r0.g(sanVar.a.a, extendedCommunityProfile));
            }
        } else if (wfhVar instanceof fu50) {
            fu50 fu50Var = (fu50) wfhVar;
            if (weakReference != null) {
                cvd0.b bVar = fu50Var.b.j;
                List list6 = bVar != null ? bVar.a : null;
                if (list6 == null) {
                    list6 = EmptyList.b;
                }
                p99Var2.invoke(new d.j.r0.n(list6, fu50Var.a, weakReference));
            }
        } else if (wfhVar instanceof bm4) {
            bm4 bm4Var = (bm4) wfhVar;
            if (extendedCommunityProfile != null) {
                MusicTrack musicTrack = bm4Var.a;
                UserId i4 = bwd0.i(extendedCommunityProfile);
                cvd0.a aVar = bm4Var.b.j;
                p99Var2.invoke(new d.j.r0.b(i4, musicTrack, aVar != null ? aVar.b : null));
            }
        } else if (wfhVar instanceof zb4) {
            p99Var2.invoke(new d.j.r0.c(((zb4) wfhVar).a));
        } else if (wfhVar instanceof vmb) {
            p99Var2.invoke(new d.j.r0.C1602d(((vmb) wfhVar).a));
        } else if (wfhVar instanceof dnc) {
            dnc dncVar = (dnc) wfhVar;
            Clips clips = dncVar.b;
            if (extendedCommunityProfile != null) {
                VideoFile videoFile = dncVar.a;
                String type = videoFile.getType();
                if (epx.f(type, "tab_collection_draft_dummy")) {
                    eVar = new d.j.r0.i(bwd0.i(extendedCommunityProfile));
                } else if (epx.f(type, "tab_collection_scheduled_dummy")) {
                    eVar = new d.j.r0.r(bwd0.i(extendedCommunityProfile));
                } else {
                    String r = videoFile.r();
                    if (r != null) {
                        SchemeStat$TypeClick b4 = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CATALOG_ITEM, null, null, null, r, null, 46, null), new CommonVideoStat$TypeVideoCardEvent(CommonVideoStat$TypeVideoCardEvent.EventType.CLICK, CommonVideoStat$TypeScreenMode.PREVIEW), 2);
                        UiTracker uiTracker = UiTracker.a;
                        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                        uzp0 uzp0Var = UiTracker.h;
                        uzp0Var.getClass();
                        new bjc(c, b4, uzp0Var.a).q();
                    }
                    eVar = new d.j.r0.e(clips, videoFile, weakReference, extendedCommunityProfile);
                }
                p99Var2.invoke(eVar);
            }
        } else if (wfhVar instanceof dqe) {
            p99Var2.invoke(new d.j.r0.f(((dqe) wfhVar).a));
        } else if (wfhVar instanceof pgb0) {
            pgb0 pgb0Var = (pgb0) wfhVar;
            if (extendedCommunityProfile != null) {
                p99Var2.invoke(new d.j.r0.q(bwd0.i(extendedCommunityProfile), pgb0Var.a, pgb0Var.b.j));
            }
        } else if (wfhVar instanceof ztn) {
            p99Var2.invoke(new d.j.r0.h(((ztn) wfhVar).a));
        } else if (wfhVar instanceof nn3) {
            p99Var2.invoke(new d.j.r0.a(((nn3) wfhVar).a));
        } else if (wfhVar instanceof z3u) {
            z3u z3uVar = (z3u) wfhVar;
            if (extendedCommunityProfile == null || (userId3 = bwd0.i(extendedCommunityProfile)) == null) {
                userId3 = UserId.d;
            }
            g2h g2hVar = new g2h(userId3);
            g2hVar.b = String.format("content_%d", Arrays.copyOf(new Object[]{0}, 1));
            g2hVar.d = "element";
            g2hVar.f = String.valueOf(z3uVar.a.b);
            g2hVar.a();
            p99Var2.invoke(new d.j.r0.k(z3uVar.a, CommonMarketStat$TypeRefSource.COMMUNITY_TAB_MARKET));
        } else if (wfhVar instanceof s8u) {
            p99Var2.invoke(new d.j.r0.m(((s8u) wfhVar).a));
        } else if (wfhVar instanceof ooi0) {
            ooi0 ooi0Var = (ooi0) wfhVar;
            if (extendedCommunityProfile == null || (userId2 = bwd0.i(extendedCommunityProfile)) == null) {
                userId2 = UserId.d;
            }
            g2h g2hVar2 = new g2h(userId2);
            g2hVar2.b = String.format("content_%d", Arrays.copyOf(new Object[]{0}, 1));
            g2hVar2.d = "element";
            g2hVar2.f = String.valueOf(ooi0Var.a.b);
            g2hVar2.a();
            Good good = ooi0Var.a;
            p99Var2.invoke(new d.j.r0.s(good.b, good.c, CommonMarketStat$TypeRefSource.COMMUNITY_TAB_SERVICES));
        } else if (wfhVar instanceof rri0) {
            p99Var2.invoke(new d.j.r0.t(((rri0) wfhVar).a));
        } else if (wfhVar instanceof cyp) {
            p99Var2.invoke(new d.j.r0.C1603j(((cyp) wfhVar).a));
        }
        ((hfh) r13.getValue()).getClass();
        if (extendedCommunityProfile == null || (userProfile2 = extendedCommunityProfile.a) == null || (userId4 = userProfile2.c) == null) {
            return;
        }
        boolean z4 = wfhVar instanceof nn3;
        if (z4) {
            nn3 nn3Var = (nn3) wfhVar;
            List<Article> list7 = nn3Var.b.j;
            if (list7 != null) {
                valueOf = Integer.valueOf(list7.indexOf(nn3Var.a));
            }
            valueOf = null;
        } else if (wfhVar instanceof bm4) {
            bm4 bm4Var2 = (bm4) wfhVar;
            cvd0.a aVar2 = bm4Var2.b.j;
            if (aVar2 != null && (list4 = aVar2.b) != null) {
                valueOf = Integer.valueOf(list4.indexOf(bm4Var2.a));
            }
            valueOf = null;
        } else if (wfhVar instanceof zb4) {
            zb4 zb4Var = (zb4) wfhVar;
            cvd0.a aVar3 = zb4Var.b.j;
            if (aVar3 != null && (list3 = aVar3.a) != null) {
                valueOf = Integer.valueOf(list3.indexOf(zb4Var.a));
            }
            valueOf = null;
        } else if (wfhVar instanceof vmb) {
            vmb vmbVar = (vmb) wfhVar;
            List<GroupChat> list8 = vmbVar.b.j;
            if (list8 != null) {
                valueOf = Integer.valueOf(list8.indexOf(vmbVar.a));
            }
            valueOf = null;
        } else if (wfhVar instanceof dnc) {
            dnc dncVar2 = (dnc) wfhVar;
            cvd0.f fVar2 = dncVar2.b.j;
            if (fVar2 != null) {
                valueOf = Integer.valueOf(fVar2.a.indexOf(dncVar2.a));
            }
            valueOf = null;
        } else if (wfhVar instanceof dqe) {
            dqe dqeVar = (dqe) wfhVar;
            List<ClipsPlaylist> list9 = dqeVar.b.k;
            if (list9 != null) {
                valueOf = Integer.valueOf(list9.indexOf(dqeVar.a));
            }
            valueOf = null;
        } else if (wfhVar instanceof san) {
            san sanVar2 = (san) wfhVar;
            List<ii7> list10 = sanVar2.b.j;
            if (list10 != null) {
                valueOf = Integer.valueOf(list10.indexOf(sanVar2.a));
            }
            valueOf = null;
        } else if (wfhVar instanceof ztn) {
            ztn ztnVar = (ztn) wfhVar;
            List<Document> list11 = ztnVar.b.j;
            if (list11 != null) {
                valueOf = Integer.valueOf(list11.indexOf(ztnVar.a));
            }
            valueOf = null;
        } else if (wfhVar instanceof fu50) {
            fu50 fu50Var2 = (fu50) wfhVar;
            cvd0.b bVar2 = fu50Var2.b.j;
            if (bVar2 != null) {
                valueOf = Integer.valueOf(bVar2.a.indexOf(fu50Var2.a));
            }
            valueOf = null;
        } else if (z3) {
            t5a0 t5a0Var2 = (t5a0) wfhVar;
            cvd0.d dVar2 = t5a0Var2.b.j;
            if (dVar2 != null) {
                valueOf = Integer.valueOf(dVar2.a.indexOf(t5a0Var2.a));
            }
            valueOf = null;
        } else if (wfhVar instanceof t4a0) {
            t4a0 t4a0Var = (t4a0) wfhVar;
            cvd0.c cVar = t4a0Var.b.k;
            if (cVar != null) {
                valueOf = Integer.valueOf(cVar.a.indexOf(t4a0Var.a));
            }
            valueOf = null;
        } else if (wfhVar instanceof pgb0) {
            pgb0 pgb0Var2 = (pgb0) wfhVar;
            List<MusicTrack> list12 = pgb0Var2.b.j;
            if (list12 != null) {
                valueOf = Integer.valueOf(list12.indexOf(pgb0Var2.a));
            }
            valueOf = null;
        } else if (wfhVar instanceof gbs0) {
            gbs0 gbs0Var2 = (gbs0) wfhVar;
            List<sst0.b> list13 = gbs0Var2.b.j;
            if (list13 != null) {
                Iterator<sst0.b> it3 = list13.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        i = -1;
                        break;
                    } else if (epx.f(it3.next().a, gbs0Var2.a)) {
                        break;
                    } else {
                        i++;
                    }
                }
                valueOf = Integer.valueOf(i);
            }
            valueOf = null;
        } else if (wfhVar instanceof u0s0) {
            u0s0 u0s0Var = (u0s0) wfhVar;
            cvd0.e eVar2 = u0s0Var.b.k;
            if (eVar2 != null && (list2 = eVar2.a) != null) {
                valueOf = Integer.valueOf(list2.indexOf(u0s0Var.a));
            }
            valueOf = null;
        } else if (wfhVar instanceof z3u) {
            z3u z3uVar2 = (z3u) wfhVar;
            a9u a9uVar = z3uVar2.b.j;
            if (a9uVar != null) {
                Iterator it4 = a9uVar.a.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        i = -1;
                        break;
                    } else if (epx.f(((f5u) it4.next()).b, z3uVar2.a)) {
                        break;
                    } else {
                        i++;
                    }
                }
                valueOf = Integer.valueOf(i);
            }
            valueOf = null;
        } else if (wfhVar instanceof s8u) {
            s8u s8uVar = (s8u) wfhVar;
            List<GoodAlbum> list14 = s8uVar.b.k;
            if (list14 != null) {
                valueOf = Integer.valueOf(list14.indexOf(s8uVar.a));
            }
            valueOf = null;
        } else if (wfhVar instanceof ooi0) {
            ooi0 ooi0Var2 = (ooi0) wfhVar;
            osi0 osi0Var = ooi0Var2.b.j;
            if (osi0Var != null) {
                Iterator it5 = osi0Var.a.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        i = -1;
                        break;
                    } else if (epx.f(((f5u) it5.next()).b, ooi0Var2.a)) {
                        break;
                    } else {
                        i++;
                    }
                }
                valueOf = Integer.valueOf(i);
            }
            valueOf = null;
        } else if (wfhVar instanceof rri0) {
            rri0 rri0Var = (rri0) wfhVar;
            List<GoodAlbum> list15 = rri0Var.b.k;
            if (list15 != null) {
                valueOf = Integer.valueOf(list15.indexOf(rri0Var.a));
            }
            valueOf = null;
        } else {
            if (wfhVar instanceof cyp) {
                cyp cypVar = (cyp) wfhVar;
                List<Group> list16 = cypVar.b.j;
                if (list16 != null) {
                    valueOf = Integer.valueOf(list16.indexOf(cypVar.a));
                }
            }
            valueOf = null;
        }
        if (valueOf == null) {
            return;
        }
        int intValue = valueOf.intValue();
        if (z4) {
            commonCommunitiesStat$TypeTabContentType2 = CommonCommunitiesStat$TypeTabContentType.ARTICLES;
        } else if (wfhVar instanceof bm4) {
            commonCommunitiesStat$TypeTabContentType2 = CommonCommunitiesStat$TypeTabContentType.AUDIOS;
        } else if (wfhVar instanceof zb4) {
            commonCommunitiesStat$TypeTabContentType2 = CommonCommunitiesStat$TypeTabContentType.AUDIOS_PLAYLISTS;
        } else if (wfhVar instanceof vmb) {
            commonCommunitiesStat$TypeTabContentType2 = CommonCommunitiesStat$TypeTabContentType.CHATS;
        } else if (wfhVar instanceof dnc) {
            commonCommunitiesStat$TypeTabContentType2 = CommonCommunitiesStat$TypeTabContentType.SHORT_VIDEOS;
        } else if (wfhVar instanceof dqe) {
            commonCommunitiesStat$TypeTabContentType2 = CommonCommunitiesStat$TypeTabContentType.SHORT_VIDEOS_PLAYLISTS;
        } else if (wfhVar instanceof san) {
            commonCommunitiesStat$TypeTabContentType2 = CommonCommunitiesStat$TypeTabContentType.DISCUSSIONS;
        } else if (wfhVar instanceof ztn) {
            commonCommunitiesStat$TypeTabContentType2 = CommonCommunitiesStat$TypeTabContentType.FILES;
        } else if (wfhVar instanceof z3u) {
            commonCommunitiesStat$TypeTabContentType2 = CommonCommunitiesStat$TypeTabContentType.MARKET;
        } else if (wfhVar instanceof s8u) {
            commonCommunitiesStat$TypeTabContentType2 = CommonCommunitiesStat$TypeTabContentType.MARKET_ALBUMS;
        } else if (wfhVar instanceof fu50) {
            commonCommunitiesStat$TypeTabContentType2 = CommonCommunitiesStat$TypeTabContentType.NARRATIVES;
        } else if (z3) {
            commonCommunitiesStat$TypeTabContentType2 = CommonCommunitiesStat$TypeTabContentType.PHOTOS;
        } else if (wfhVar instanceof t4a0) {
            commonCommunitiesStat$TypeTabContentType2 = CommonCommunitiesStat$TypeTabContentType.PHOTOS_ALBUMS;
        } else if (wfhVar instanceof pgb0) {
            commonCommunitiesStat$TypeTabContentType2 = CommonCommunitiesStat$TypeTabContentType.PODCASTS;
        } else if (wfhVar instanceof gbs0) {
            commonCommunitiesStat$TypeTabContentType2 = CommonCommunitiesStat$TypeTabContentType.VIDEOS;
        } else if (wfhVar instanceof u0s0) {
            commonCommunitiesStat$TypeTabContentType2 = CommonCommunitiesStat$TypeTabContentType.VIDEOS_PLAYLISTS;
        } else if (wfhVar instanceof ooi0) {
            commonCommunitiesStat$TypeTabContentType2 = CommonCommunitiesStat$TypeTabContentType.SERVICES;
        } else if (wfhVar instanceof rri0) {
            commonCommunitiesStat$TypeTabContentType2 = CommonCommunitiesStat$TypeTabContentType.SERVICES_ALBUMS;
        } else {
            if (!(wfhVar instanceof cyp)) {
                commonCommunitiesStat$TypeTabContentType = null;
                if (commonCommunitiesStat$TypeTabContentType != null) {
                    return;
                }
                if (z4) {
                    valueOf2 = Long.valueOf(((nn3) wfhVar).a.b);
                } else if (wfhVar instanceof bm4) {
                    valueOf2 = Long.valueOf(((bm4) wfhVar).a.b);
                } else if (wfhVar instanceof zb4) {
                    valueOf2 = Long.valueOf(((zb4) wfhVar).a.b);
                } else if (wfhVar instanceof vmb) {
                    valueOf2 = Long.valueOf(((vmb) wfhVar).a.b);
                } else if (wfhVar instanceof dnc) {
                    valueOf2 = Long.valueOf(((dnc) wfhVar).a.o0());
                } else if (wfhVar instanceof dqe) {
                    valueOf2 = Long.valueOf(((dqe) wfhVar).a.b);
                } else if (wfhVar instanceof san) {
                    valueOf2 = Long.valueOf(((san) wfhVar).a.a);
                } else if (wfhVar instanceof ztn) {
                    valueOf2 = Long.valueOf(((ztn) wfhVar).a.b);
                } else if (wfhVar instanceof fu50) {
                    valueOf2 = Long.valueOf(((fu50) wfhVar).a.b);
                } else if (z3) {
                    valueOf2 = Long.valueOf(((t5a0) wfhVar).a.c);
                } else if (wfhVar instanceof t4a0) {
                    valueOf2 = Long.valueOf(((t4a0) wfhVar).a.b);
                } else if (wfhVar instanceof pgb0) {
                    valueOf2 = Long.valueOf(((pgb0) wfhVar).a.b);
                } else if (wfhVar instanceof gbs0) {
                    valueOf2 = Long.valueOf(((gbs0) wfhVar).a.o0());
                } else if (wfhVar instanceof u0s0) {
                    valueOf2 = Long.valueOf(((u0s0) wfhVar).a.b);
                } else if (wfhVar instanceof z3u) {
                    valueOf2 = Long.valueOf(((z3u) wfhVar).a.b);
                } else if (wfhVar instanceof s8u) {
                    valueOf2 = Long.valueOf(((s8u) wfhVar).a.b);
                } else if (wfhVar instanceof ooi0) {
                    valueOf2 = Long.valueOf(((ooi0) wfhVar).a.b);
                } else if (wfhVar instanceof rri0) {
                    valueOf2 = Long.valueOf(((rri0) wfhVar).a.b);
                } else if (wfhVar instanceof cyp) {
                    valueOf2 = Long.valueOf(((cyp) wfhVar).a.c.b);
                }
                if (valueOf2 != null) {
                    long longValue = valueOf2.longValue();
                    if (intValue == -1) {
                        return;
                    }
                    new bjc(MobileOfficialAppsCoreNavStat$EventScreen.GROUP, SchemeStat$TypeClick.a.a(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), valueOf, new CommonCommunitiesStat$TypeTabItemClick(userId4.b, longValue, commonCommunitiesStat$TypeTabContentType, CommonCommunitiesStat$TypeTabItemClick.EventType.CLICK_ITEM))).q();
                    return;
                }
                return;
            }
            commonCommunitiesStat$TypeTabContentType2 = CommonCommunitiesStat$TypeTabContentType.EVENTS;
        }
        commonCommunitiesStat$TypeTabContentType = commonCommunitiesStat$TypeTabContentType2;
        if (commonCommunitiesStat$TypeTabContentType != null) {
        }
    }

    /* JADX WARN: Type inference failed for: r4v42, types: [java.lang.Object, kotlin.Lazy] */
    public final <T extends CommunityProfileContentItem> jxg<T> b(T t) {
        jxg<T> jxgVar;
        if (t instanceof iea0) {
            jxgVar = (fkh) this.n.getValue();
        } else if (t instanceof j15) {
            jxgVar = (mfh) this.t.getValue();
        } else if (t instanceof Clips) {
            jxgVar = (dgh) this.p.getValue();
        } else {
            boolean z = t instanceof b9x0;
            bpn0 bpn0Var = this.x;
            if (z) {
                jxgVar = (zlh) bpn0Var.getValue();
            } else if (t instanceof p5o) {
                jxgVar = (zlh) bpn0Var.getValue();
            } else if (t instanceof lg00) {
                jxgVar = (kjh) this.y.getValue();
            } else if (t instanceof sst0) {
                jxgVar = (qlh) this.q.getValue();
            } else if (t instanceof uu50) {
                jxgVar = (tjh) this.r.getValue();
            } else if (t instanceof tan) {
                jxgVar = (chh) this.s.getValue();
            } else if (t instanceof pzb) {
                jxgVar = (ofh) this.o.getValue();
            } else if (t instanceof xkb0) {
                jxgVar = (okh) this.u.getValue();
            } else if (t instanceof sun) {
                jxgVar = (lhh) this.v.getValue();
            } else if (t instanceof fq3) {
                jxgVar = (jfh) this.w.getValue();
            } else if (t instanceof p8u) {
                jxgVar = (fih) this.z.getValue();
            } else if (t instanceof Services) {
                jxgVar = (xkh) this.A.getValue();
            } else {
                if (!(t instanceof y0q)) {
                    throw new IllegalStateException("Unknown contentItem=" + t);
                }
                jxgVar = (thh) this.B.getValue();
            }
        }
        if (jxgVar != null) {
            return jxgVar;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(CommunityProfileAction.h hVar, CommunityProfileState communityProfileState) {
        List<CommunityProfileContentItem> list;
        CommunityProfileContent communityProfileContent = communityProfileState.d;
        CommunityProfileContentItem communityProfileContentItem = null;
        if (communityProfileContent != null && (list = communityProfileContent.b) != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((CommunityProfileContentItem) next).h == hVar.b) {
                    communityProfileContentItem = next;
                    break;
                }
            }
            communityProfileContentItem = communityProfileContentItem;
        }
        if (communityProfileContentItem != null) {
            jxg b = b(communityProfileContentItem);
            if (communityProfileContentItem.f() == CommunityProfileContentItem.State.LOADING || communityProfileContentItem.f() == CommunityProfileContentItem.State.INITIAL || b == null) {
                return;
            }
            b.c(communityProfileState);
        }
    }
}
