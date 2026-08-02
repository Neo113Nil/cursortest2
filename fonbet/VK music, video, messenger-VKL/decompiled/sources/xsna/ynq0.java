package xsna;

import android.app.Activity;
import android.view.View;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.articles.Article;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.gift.GiftItem;
import com.vk.dto.hints.HintId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.photo.Photo;
import com.vk.dto.stories.model.HighlightStoriesContainer;
import com.vk.dto.user.UserProfile;
import com.vk.dto.video.VideoAlbum;
import com.vk.profile.core.content.ContentTab;
import com.vk.profile.core.tabs.state.CommunityProfileContent;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.profile.core.tabs.ui.clips.Clips;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.profile.user.impl.ui.b;
import com.vk.profile.user.impl.ui.f;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeTabContentType;
import com.vk.stat.scheme.CommonProfileStat$ContentType;
import com.vk.stat.scheme.CommonProfileStat$WatchingContentEvent;
import com.vk.stat.scheme.CommonVideoStat$TypeScreenMode;
import com.vk.stat.scheme.CommonVideoStat$TypeVideoCardEvent;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.toggle.features.VasFeatures;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.api.ExtendedUserProfile;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.cvd0;
import xsna.nyd0;
import xsna.sst0;

/* compiled from: UserProfileContentTabsFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class ynq0 implements huq, mtl {
    public final dvq0 b;
    public final rnq0 c;
    public final loq0 d;
    public final lyd0 e;
    public final h7v f;
    public io.reactivex.rxjava3.disposables.b g;
    public fpq0 h;
    public izs<? super com.vk.profile.user.impl.ui.b, s3q0> i;
    public io.reactivex.rxjava3.disposables.c j = EmptyDisposable.INSTANCE;
    public final Object k;
    public final Object l;
    public final Object m;
    public final clj n;

    public ynq0(dvq0 dvq0Var, r0e0 r0e0Var, boolean z, rnq0 rnq0Var, loq0 loq0Var, lyd0 lyd0Var, h7v h7vVar) {
        this.b = dvq0Var;
        this.c = rnq0Var;
        this.d = loq0Var;
        this.e = lyd0Var;
        this.f = h7vVar;
        p1d0 p1d0Var = new p1d0(this, 26);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.k = msy.a(lazyThreadSafetyMode, p1d0Var);
        this.l = msy.a(lazyThreadSafetyMode, new afl0(this, 8));
        this.m = msy.a(lazyThreadSafetyMode, new orj0(this, 15));
        this.n = new clj(dvq0Var, r0e0Var, z, rnq0Var, loq0Var);
    }

    public static void c(ynq0 ynq0Var, ExtendedUserProfile extendedUserProfile, ContentTab contentTab, Integer num, int i) {
        Integer num2 = (i & 4) != 0 ? null : num;
        ynq0Var.j.dispose();
        if (ynq0Var.b.d(extendedUserProfile) || bwd0.c(extendedUserProfile)) {
            return;
        }
        if (!bwd0.d(extendedUserProfile)) {
            if (bwd0.g(extendedUserProfile)) {
                if (extendedUserProfile.d0 > 0 || extendedUserProfile.Y == 2 || extendedUserProfile.g() || bwd0.c(extendedUserProfile) || extendedUserProfile.k1 != null) {
                    return;
                }
            } else {
                if (bwd0.g(extendedUserProfile)) {
                    return;
                }
                ExtendedCommunityProfile extendedCommunityProfile = (ExtendedCommunityProfile) extendedUserProfile;
                if (extendedCommunityProfile.g()) {
                    return;
                }
                if ((extendedUserProfile.d0 <= 0 && extendedUserProfile.Y != 2) || bwd0.c(extendedUserProfile) || bwd0.f(extendedUserProfile) || bwd0.b(extendedCommunityProfile)) {
                    return;
                }
            }
        }
        io.reactivex.rxjava3.disposables.c subscribe = ynq0Var.c.b(extendedUserProfile.a.c, false).subscribe(new lw30(new ti30(2, num2, ynq0Var, contentTab, extendedUserProfile), 18));
        io.reactivex.rxjava3.disposables.b bVar = ynq0Var.g;
        (bVar != null ? bVar : null).b(subscribe);
        ynq0Var.j = subscribe;
    }

    @Override // xsna.huq
    public final void H(fpq0 fpq0Var) {
        this.h = fpq0Var;
    }

    @Override // xsna.huq
    public final void J(com.vk.profile.user.impl.ui.g gVar, UserProfileAction.a aVar) {
        Iterator<T> it = this.n.w2().iterator();
        while (it.hasNext()) {
            ((huq) it.next()).J(gVar, aVar);
        }
    }

    @Override // xsna.ruu
    public final izs<com.vk.profile.user.impl.ui.b, s3q0> L() {
        izs izsVar = this.i;
        if (izsVar != null) {
            return izsVar;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r6 == null) goto L15;
     */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(UserProfileAction.g gVar, com.vk.profile.user.impl.ui.g gVar2) {
        CommunityProfileContentItem a;
        List<CommunityProfileContentItem> list;
        Object obj;
        boolean z;
        int i;
        int i2;
        Object obj2;
        UserProfile userProfile;
        List<VideoAlbum> list2;
        Object valueOf;
        List<Playlist> list3;
        List<MusicTrack> list4;
        int i3;
        List<CommunityProfileContentItem> list5;
        Object obj3;
        ExtendedUserProfile extendedUserProfile = gVar2.j;
        CommunityProfileContent communityProfileContent = gVar2.g;
        if (communityProfileContent != null && (list5 = communityProfileContent.b) != null) {
            Iterator<T> it = list5.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj3 = null;
                    break;
                } else {
                    obj3 = it.next();
                    if (((CommunityProfileContentItem) obj3).h == gVar.a().h) {
                        break;
                    }
                }
            }
            a = (CommunityProfileContentItem) obj3;
        }
        a = gVar.a();
        wmq0<? extends CommunityProfileContentItem, ?> wmq0Var = this.n.b.get(fpf0.a(a.getClass()));
        ContentTab contentTab = a.a;
        if (gVar instanceof UserProfileAction.g.l) {
            izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar = this.i;
            if (izsVar == null) {
                izsVar = null;
            }
            izsVar.invoke(new b.t(contentTab));
            UserProfileAction.g.l lVar = (UserProfileAction.g.l) gVar;
            if (lVar.c) {
                if (wmq0Var != null) {
                    wmq0Var.h(lVar.b, extendedUserProfile);
                }
            } else if ((a.f() == CommunityProfileContentItem.State.INITIAL || a.f() == CommunityProfileContentItem.State.RELOAD) && wmq0Var != null) {
                wmq0Var.h(a, extendedUserProfile);
            }
            if ((contentTab instanceof ContentTab.Wall) || (contentTab instanceof ContentTab.DonutWall)) {
                izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar2 = this.i;
                (izsVar2 != null ? izsVar2 : null).invoke(b.d0.b);
                return;
            }
            return;
        }
        boolean z2 = gVar instanceof UserProfileAction.g.o;
        ?? r9 = this.k;
        if (z2) {
            rmq0 rmq0Var = (rmq0) r9.getValue();
            CommunityProfileContentItem communityProfileContentItem = ((UserProfileAction.g.o) gVar).c;
            rmq0Var.getClass();
            CommonProfileStat$ContentType commonProfileStat$ContentType = communityProfileContentItem instanceof b9x0 ? CommonProfileStat$ContentType.WALL : communityProfileContentItem instanceof lg00 ? CommonProfileStat$ContentType.MAIN : communityProfileContentItem instanceof sst0 ? CommonProfileStat$ContentType.VIDEO : communityProfileContentItem instanceof iea0 ? CommonProfileStat$ContentType.PHOTO : communityProfileContentItem instanceof Clips ? CommonProfileStat$ContentType.CLIPS : communityProfileContentItem instanceof j15 ? CommonProfileStat$ContentType.MUSIC : communityProfileContentItem instanceof uu50 ? CommonProfileStat$ContentType.NARRATIVE : communityProfileContentItem instanceof fq3 ? CommonProfileStat$ContentType.ARTICLES : communityProfileContentItem instanceof mzt ? CommonProfileStat$ContentType.GIFTS : communityProfileContentItem instanceof hg3 ? CommonProfileStat$ContentType.ARCHIVE_WALL : null;
            if (commonProfileStat$ContentType != null) {
                nyd0.o n = rmq0Var.a.n();
                n.getClass();
                n.a(CommonProfileStat$WatchingContentEvent.WatchingContentEventType.CLICK_TO_TAB, commonProfileStat$ContentType);
                return;
            }
            return;
        }
        if (gVar instanceof UserProfileAction.g.i) {
            if (contentTab instanceof ContentTab.Wall) {
                izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar3 = this.i;
                (izsVar3 != null ? izsVar3 : null).invoke(b.d0.b);
                return;
            } else {
                if ((a.f() == CommunityProfileContentItem.State.INITIAL || a.f() == CommunityProfileContentItem.State.RELOAD) && wmq0Var != null) {
                    wmq0Var.h(a, extendedUserProfile);
                    return;
                }
                return;
            }
        }
        if (gVar instanceof UserProfileAction.g.h) {
            if (wmq0Var != null) {
                wmq0Var.a(a, extendedUserProfile);
                return;
            }
            return;
        }
        if (gVar instanceof UserProfileAction.g.a) {
            if (wmq0Var != null) {
                wmq0Var.b(a);
                return;
            }
            return;
        }
        if (gVar instanceof UserProfileAction.g.C1687g) {
            if (wmq0Var != null) {
                wmq0Var.d(a, extendedUserProfile);
                return;
            }
            return;
        }
        if (gVar instanceof UserProfileAction.g.b) {
            if (wmq0Var != null) {
                wmq0Var.o(a);
                return;
            }
            return;
        }
        if (gVar instanceof UserProfileAction.g.n) {
            if (wmq0Var != null) {
                wmq0Var.n(a, extendedUserProfile);
            }
            rmq0 rmq0Var2 = (rmq0) r9.getValue();
            rmq0Var2.getClass();
            CommonProfileStat$ContentType a2 = rmq0.a(a);
            if (a2 == null) {
                return;
            }
            nyd0.o n2 = rmq0Var2.a.n();
            n2.getClass();
            n2.a(CommonProfileStat$WatchingContentEvent.WatchingContentEventType.CLICK_TO_MORE_CONTENT, a2);
            return;
        }
        if (gVar instanceof UserProfileAction.g.d) {
            if (wmq0Var != null) {
                wmq0Var.f(a, extendedUserProfile);
            }
            rmq0 rmq0Var3 = (rmq0) r9.getValue();
            rmq0Var3.getClass();
            CommonProfileStat$ContentType a3 = rmq0.a(a);
            if (a3 == null) {
                return;
            }
            nyd0.o n3 = rmq0Var3.a.n();
            n3.getClass();
            n3.a(CommonProfileStat$WatchingContentEvent.WatchingContentEventType.CLICK_TO_ADD_CONTENT, a3);
            return;
        }
        if (gVar instanceof UserProfileAction.g.k) {
            if (wmq0Var != null) {
                wmq0Var.g(a, extendedUserProfile);
                return;
            }
            return;
        }
        if (!(gVar instanceof UserProfileAction.g.e)) {
            if (gVar instanceof UserProfileAction.g.m) {
                if (wmq0Var != null) {
                    wmq0Var.l(a, extendedUserProfile);
                }
                rmq0 rmq0Var4 = (rmq0) r9.getValue();
                rmq0Var4.getClass();
                CommonProfileStat$ContentType a4 = rmq0.a(a);
                if (a4 == null) {
                    return;
                }
                nyd0.o n4 = rmq0Var4.a.n();
                n4.getClass();
                n4.a(CommonProfileStat$WatchingContentEvent.WatchingContentEventType.CLICK_TO_MORE_CONTENT, a4);
                return;
            }
            if (gVar instanceof UserProfileAction.g.f) {
                lnq0 lnq0Var = (lnq0) this.m.getValue();
                lnq0Var.getClass();
                nu50 nu50Var = ((UserProfileAction.g.f) gVar).c;
                if (nu50Var != null) {
                    lnq0Var.a.B(new f.e.u0(nu50Var.a, nu50Var.b));
                    return;
                }
                return;
            }
            if (!(gVar instanceof UserProfileAction.g.j)) {
                if (!(gVar instanceof UserProfileAction.g.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f.b(HintId.USER_PROFILE_MAIN_WALL_TAB_ONBOARDING.getId());
                if (wmq0Var != null) {
                    wmq0Var.e(a);
                    return;
                }
                return;
            }
            if (communityProfileContent == null || (list = communityProfileContent.b) == null) {
                return;
            }
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it2.next();
                    if (epx.f(((CommunityProfileContentItem) obj).a.d(), ((UserProfileAction.g.j) gVar).b.a.d())) {
                        break;
                    }
                }
            }
            CommunityProfileContentItem communityProfileContentItem2 = (CommunityProfileContentItem) obj;
            if (communityProfileContentItem2 == null || communityProfileContentItem2.f() == CommunityProfileContentItem.State.LOADING || communityProfileContentItem2.f() == CommunityProfileContentItem.State.INITIAL || wmq0Var == null) {
                return;
            }
            wmq0Var.c(communityProfileContentItem2, extendedUserProfile);
            return;
        }
        UserProfileAction.g.e eVar = (UserProfileAction.g.e) gVar;
        wfh wfhVar = eVar.c;
        knq0 knq0Var = (knq0) this.l.getValue();
        zuq0 zuq0Var = knq0Var.a;
        WeakReference<View> weakReference = eVar.d;
        int i4 = eVar.e;
        boolean z3 = wfhVar instanceof t5a0;
        if (z3) {
            t5a0 t5a0Var = (t5a0) wfhVar;
            iea0 iea0Var = t5a0Var.b;
            if (weakReference == null || extendedUserProfile == null) {
                z = z3;
                i = -1;
                i2 = 0;
            } else {
                Photo photo = t5a0Var.a;
                cvd0.d dVar = iea0Var.j;
                int i5 = dVar != null ? dVar.c : 0;
                List list6 = dVar != null ? dVar.a : null;
                if (list6 == null) {
                    list6 = EmptyList.b;
                }
                Iterator it3 = list6.iterator();
                int i6 = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        i3 = -1;
                        break;
                    } else {
                        if (((Photo) it3.next()).c == photo.c) {
                            i3 = i6;
                            break;
                        }
                        i6++;
                    }
                }
                if (i3 == -1) {
                    i3 = 0;
                }
                ArrayList arrayList = new ArrayList(list6);
                int i7 = i5;
                int size = list6.size();
                String str = iea0Var.p;
                List list7 = list6;
                z = z3;
                oyr oyrVar = new oyr(weakReference, 25);
                y2 y2Var = new y2(knq0Var, 9);
                i = -1;
                i2 = 0;
                zuq0Var.B(new f.e.k1(new xyd0(i3, list7, new izd0(size, str, i7, oyrVar, i4, arrayList, y2Var))));
            }
        } else {
            z = z3;
            i = -1;
            i2 = 0;
            if (wfhVar instanceof t4a0) {
                zuq0Var.B(new f.e.v0(((t4a0) wfhVar).a));
            } else if (wfhVar instanceof fu50) {
                fu50 fu50Var = (fu50) wfhVar;
                if (weakReference != null) {
                    Narrative narrative = fu50Var.a;
                    UserId userId = narrative.c;
                    String M = fsk.M(narrative.b);
                    cvd0.b bVar = fu50Var.b.j;
                    Iterable iterable = bVar != null ? bVar.a : null;
                    if (iterable == null) {
                        iterable = EmptyList.b;
                    }
                    Iterable iterable2 = iterable;
                    ArrayList arrayList2 = new ArrayList(c5g.u(iterable2, 10));
                    Iterator it4 = iterable2.iterator();
                    while (it4.hasNext()) {
                        arrayList2.add(new HighlightStoriesContainer((Narrative) it4.next(), 0, 2, null));
                    }
                    zuq0Var.B(new f.e.q(new cwl0(userId, M, arrayList2, new dnz(weakReference, 20), new vxl0(1), new f84(23), MobileOfficialAppsConStoriesStat$ViewEntryPoint.NARRATIVE_SECTION, null)));
                }
            } else if (wfhVar instanceof dnc) {
                dnc dncVar = (dnc) wfhVar;
                Clips clips = dncVar.b;
                if (weakReference != null && extendedUserProfile != null) {
                    VideoFile videoFile = dncVar.a;
                    String type = videoFile.getType();
                    if (epx.f(type, "tab_collection_draft_dummy")) {
                        zuq0Var.B(new f.e.f0(bwd0.i(extendedUserProfile)));
                    } else if (epx.f(type, "tab_collection_scheduled_dummy")) {
                        zuq0Var.B(new f.e.a1(bwd0.i(extendedUserProfile)));
                    } else {
                        String r = videoFile.r();
                        if (r != null) {
                            SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CATALOG_ITEM, null, null, null, r, null, 46, null), new CommonVideoStat$TypeVideoCardEvent(CommonVideoStat$TypeVideoCardEvent.EventType.CLICK, CommonVideoStat$TypeScreenMode.PREVIEW), 2);
                            UiTracker uiTracker = UiTracker.a;
                            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                            uzp0 uzp0Var = UiTracker.h;
                            uzp0Var.getClass();
                            new bjc(c, b, uzp0Var.a).q();
                        }
                        cvd0.f fVar = clips.j;
                        if (fVar != null) {
                            ArrayList arrayList3 = fVar.a;
                            Iterator it5 = arrayList3.iterator();
                            int i8 = 0;
                            while (true) {
                                if (!it5.hasNext()) {
                                    i8 = -1;
                                    break;
                                } else if (epx.f(((VideoFile) it5.next()).a1(), videoFile.a1())) {
                                    break;
                                } else {
                                    i8++;
                                }
                            }
                            zuq0Var.B(new f.e.d0(arrayList3, clips.p, i8 == -1 ? 0 : i8, new hi70(weakReference, 9), extendedUserProfile.a));
                        }
                    }
                }
            } else {
                if (!(wfhVar instanceof dqe)) {
                    if (wfhVar instanceof khs0) {
                        obj2 = null;
                        zuq0Var.B(new f.e.o0(null, ((khs0) wfhVar).a));
                    } else {
                        obj2 = null;
                        if (wfhVar instanceof gbs0) {
                            gbs0 gbs0Var = (gbs0) wfhVar;
                            zuq0Var.B(new f.e.e1(gbs0Var.a, gbs0Var.c));
                        } else if (wfhVar instanceof u0s0) {
                            zuq0Var.B(new f.e.f1(((u0s0) wfhVar).a));
                        } else if (wfhVar instanceof bm4) {
                            bm4 bm4Var = (bm4) wfhVar;
                            if (extendedUserProfile != null) {
                                MusicTrack musicTrack = bm4Var.a;
                                UserId i9 = bwd0.i(extendedUserProfile);
                                cvd0.a aVar = bm4Var.b.j;
                                zuq0Var.B(new f.e.b0(i9, musicTrack, aVar != null ? aVar.b : null));
                            }
                        } else if (wfhVar instanceof zb4) {
                            zuq0Var.B(new f.e.c0(((zb4) wfhVar).a));
                        } else if (wfhVar instanceof nn3) {
                            zuq0Var.B(new f.e.z(((nn3) wfhVar).a));
                        } else if ((wfhVar instanceof hzt) && extendedUserProfile != null) {
                            zuq0Var.B(new f.e.m0(extendedUserProfile));
                        }
                    }
                    ((rmq0) r9.getValue()).getClass();
                    if (extendedUserProfile != null || (userProfile = extendedUserProfile.a) == null || userProfile.c == null) {
                        return;
                    }
                    boolean z4 = wfhVar instanceof nn3;
                    if (z4) {
                        nn3 nn3Var = (nn3) wfhVar;
                        List<Article> list8 = nn3Var.b.j;
                        if (list8 != null) {
                            valueOf = Integer.valueOf(list8.indexOf(nn3Var.a));
                        }
                        valueOf = obj2;
                    } else if (wfhVar instanceof bm4) {
                        bm4 bm4Var2 = (bm4) wfhVar;
                        cvd0.a aVar2 = bm4Var2.b.j;
                        if (aVar2 != null && (list4 = aVar2.b) != null) {
                            valueOf = Integer.valueOf(list4.indexOf(bm4Var2.a));
                        }
                        valueOf = obj2;
                    } else if (wfhVar instanceof zb4) {
                        zb4 zb4Var = (zb4) wfhVar;
                        cvd0.a aVar3 = zb4Var.b.j;
                        if (aVar3 != null && (list3 = aVar3.a) != null) {
                            valueOf = Integer.valueOf(list3.indexOf(zb4Var.a));
                        }
                        valueOf = obj2;
                    } else if (wfhVar instanceof dnc) {
                        dnc dncVar2 = (dnc) wfhVar;
                        cvd0.f fVar2 = dncVar2.b.j;
                        if (fVar2 != null) {
                            valueOf = Integer.valueOf(fVar2.a.indexOf(dncVar2.a));
                        }
                        valueOf = obj2;
                    } else if (wfhVar instanceof dqe) {
                        dqe dqeVar = (dqe) wfhVar;
                        List<ClipsPlaylist> list9 = dqeVar.b.k;
                        if (list9 != null) {
                            valueOf = Integer.valueOf(list9.indexOf(dqeVar.a));
                        }
                        valueOf = obj2;
                    } else if (wfhVar instanceof fu50) {
                        fu50 fu50Var2 = (fu50) wfhVar;
                        cvd0.b bVar2 = fu50Var2.b.j;
                        if (bVar2 != null) {
                            valueOf = Integer.valueOf(bVar2.a.indexOf(fu50Var2.a));
                        }
                        valueOf = obj2;
                    } else if (z) {
                        t5a0 t5a0Var2 = (t5a0) wfhVar;
                        cvd0.d dVar2 = t5a0Var2.b.j;
                        if (dVar2 != null) {
                            valueOf = Integer.valueOf(dVar2.a.indexOf(t5a0Var2.a));
                        }
                        valueOf = obj2;
                    } else if (wfhVar instanceof t4a0) {
                        t4a0 t4a0Var = (t4a0) wfhVar;
                        cvd0.c cVar = t4a0Var.b.k;
                        if (cVar != null) {
                            valueOf = Integer.valueOf(cVar.a.indexOf(t4a0Var.a));
                        }
                        valueOf = obj2;
                    } else if (wfhVar instanceof gbs0) {
                        gbs0 gbs0Var2 = (gbs0) wfhVar;
                        List<sst0.b> list10 = gbs0Var2.b.j;
                        if (list10 != null) {
                            Iterator<sst0.b> it6 = list10.iterator();
                            int i10 = i2;
                            while (true) {
                                if (!it6.hasNext()) {
                                    i10 = i;
                                    break;
                                } else if (epx.f(it6.next().a, gbs0Var2.a)) {
                                    break;
                                } else {
                                    i10++;
                                }
                            }
                            valueOf = Integer.valueOf(i10);
                        }
                        valueOf = obj2;
                    } else {
                        if (wfhVar instanceof u0s0) {
                            u0s0 u0s0Var = (u0s0) wfhVar;
                            cvd0.e eVar2 = u0s0Var.b.k;
                            if (eVar2 != null && (list2 = eVar2.a) != null) {
                                valueOf = Integer.valueOf(list2.indexOf(u0s0Var.a));
                            }
                        }
                        valueOf = obj2;
                    }
                    if (valueOf != null) {
                        if ((z4 ? CommonCommunitiesStat$TypeTabContentType.ARTICLES : wfhVar instanceof bm4 ? CommonCommunitiesStat$TypeTabContentType.AUDIOS : wfhVar instanceof zb4 ? CommonCommunitiesStat$TypeTabContentType.AUDIOS_PLAYLISTS : wfhVar instanceof dnc ? CommonCommunitiesStat$TypeTabContentType.SHORT_VIDEOS : wfhVar instanceof dqe ? CommonCommunitiesStat$TypeTabContentType.SHORT_VIDEOS_PLAYLISTS : wfhVar instanceof fu50 ? CommonCommunitiesStat$TypeTabContentType.NARRATIVES : z ? CommonCommunitiesStat$TypeTabContentType.PHOTOS : wfhVar instanceof t4a0 ? CommonCommunitiesStat$TypeTabContentType.PHOTOS_ALBUMS : wfhVar instanceof gbs0 ? CommonCommunitiesStat$TypeTabContentType.VIDEOS : wfhVar instanceof u0s0 ? CommonCommunitiesStat$TypeTabContentType.VIDEOS_PLAYLISTS : obj2) == null) {
                            return;
                        }
                        if (z4) {
                            int i11 = ((nn3) wfhVar).a.b;
                            return;
                        }
                        if (wfhVar instanceof bm4) {
                            int i12 = ((bm4) wfhVar).a.b;
                            return;
                        }
                        if (wfhVar instanceof zb4) {
                            int i13 = ((zb4) wfhVar).a.b;
                            return;
                        }
                        if (wfhVar instanceof dnc) {
                            ((dnc) wfhVar).a.getClass();
                            return;
                        }
                        if (wfhVar instanceof dqe) {
                            int i14 = ((dqe) wfhVar).a.b;
                            return;
                        }
                        if (wfhVar instanceof fu50) {
                            int i15 = ((fu50) wfhVar).a.b;
                            return;
                        }
                        if (z) {
                            int i16 = ((t5a0) wfhVar).a.c;
                            return;
                        }
                        if (wfhVar instanceof t4a0) {
                            int i17 = ((t4a0) wfhVar).a.b;
                            return;
                        } else if (wfhVar instanceof gbs0) {
                            ((gbs0) wfhVar).a.getClass();
                            return;
                        } else {
                            if (wfhVar instanceof u0s0) {
                                int i18 = ((u0s0) wfhVar).a.b;
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                zuq0Var.B(new f.e.g0(((dqe) wfhVar).a));
            }
        }
        obj2 = null;
        ((rmq0) r9.getValue()).getClass();
        if (extendedUserProfile != null) {
        }
    }

    /* JADX WARN: Type inference failed for: r14v7, types: [java.lang.Object, kotlin.Lazy] */
    public final void b(UserProfileAction.f fVar, com.vk.profile.user.impl.ui.g gVar) {
        tfx tfxVar;
        if (fVar instanceof UserProfileAction.f.b.a) {
            Narrative narrative = ((UserProfileAction.f.b.a) fVar).b;
            io.reactivex.rxjava3.disposables.c subscribe = ((gu50) this.d.h.getValue()).i(narrative.b, narrative.c).subscribe(new d1e(new lwp0(2), 2), new cl30(new arb0(this, 29), 17));
            io.reactivex.rxjava3.disposables.b bVar = this.g;
            (bVar != null ? bVar : null).b(subscribe);
            return;
        }
        if (fVar instanceof UserProfileAction.f.c.a) {
            List<String> list = ((UserProfileAction.f.c.a) fVar).b;
            fpq0 fpq0Var = this.h;
            (fpq0Var != null ? fpq0Var : null).B(new f.e.i(this.b.h(), list));
            return;
        }
        if (!(fVar instanceof UserProfileAction.f.a.C1686a)) {
            throw new NoWhenBranchMatchedException();
        }
        GiftItem giftItem = ((UserProfileAction.f.a.C1686a) fVar).b;
        VasFeatures vasFeatures = VasFeatures.VAS_GIFTS_SERVICE_LISTS;
        vasFeatures.getClass();
        if (com.vk.toggle.b.A.a(vasFeatures)) {
            int i = giftItem.c;
            String str = giftItem.e;
            tfxVar = new tfx("gifts.deleteAlias", new vr(14), new s11(11));
            tfx.l(tfxVar, "id", i, 0, 0, 12);
            tfx.o(tfxVar, "gift_hash", str, 0, 0, 12);
        } else {
            int i2 = giftItem.c;
            String str2 = giftItem.e;
            tfx tfxVar2 = new tfx("gifts.delete", new to(15), new t11(18));
            tfx.l(tfxVar2, "id", i2, 0, 0, 12);
            tfx.o(tfxVar2, "gift_hash", str2, 0, 0, 12);
            tfxVar = tfxVar2;
        }
        io.reactivex.rxjava3.disposables.c subscribe2 = rsg0.w0(yfb.x(tfxVar)).subscribe(new nvm0(new yw5(gVar, this, giftItem, 9), 5), new bdz(new svk0(this, 13), 27));
        io.reactivex.rxjava3.disposables.b bVar2 = this.g;
        (bVar2 != null ? bVar2 : null).b(subscribe2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(com.vk.profile.user.impl.ui.g gVar) {
        List<CommunityProfileContentItem> list;
        CommunityProfileContent communityProfileContent = gVar.g;
        CommunityProfileContentItem communityProfileContentItem = null;
        if (communityProfileContent != null && (list = communityProfileContent.b) != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((CommunityProfileContentItem) next).h == 0) {
                    communityProfileContentItem = next;
                    break;
                }
            }
            communityProfileContentItem = communityProfileContentItem;
        }
        if (communityProfileContentItem != null) {
            wmq0<? extends CommunityProfileContentItem, ?> wmq0Var = this.n.b.get(fpf0.a(communityProfileContentItem.getClass()));
            if (communityProfileContentItem.f() == CommunityProfileContentItem.State.LOADING || communityProfileContentItem.f() == CommunityProfileContentItem.State.INITIAL || wmq0Var == null) {
                return;
            }
            wmq0Var.c(communityProfileContentItem, gVar.j);
        }
    }

    @Override // xsna.huq
    public final void i(io.reactivex.rxjava3.disposables.b bVar) {
        this.g = bVar;
    }

    @Override // xsna.huq
    public final void m(Activity activity) {
        Iterator<T> it = this.n.w2().iterator();
        while (it.hasNext()) {
            ((huq) it.next()).m(activity);
        }
    }

    @Override // xsna.huq
    public final void onPause() {
        Iterator<T> it = this.n.w2().iterator();
        while (it.hasNext()) {
            ((huq) it.next()).onPause();
        }
    }

    @Override // xsna.huq
    public final void onResume() {
        Iterator<T> it = this.n.w2().iterator();
        while (it.hasNext()) {
            ((huq) it.next()).onResume();
        }
    }

    @Override // xsna.ruu
    public final void r(r9c0 r9c0Var) {
        this.i = r9c0Var;
    }

    @Override // xsna.mtl
    public final List<huq> w2() {
        return this.n.w2();
    }

    @Override // xsna.huq
    public final void j() {
    }

    @Override // xsna.huq
    public final void onDestroy() {
    }

    @Override // xsna.huq
    public final void onStart() {
    }

    @Override // xsna.huq
    public final void onStop() {
    }

    @Override // xsna.huq
    public final void k(u5p0 u5p0Var) {
    }
}
