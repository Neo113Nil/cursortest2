package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.friends.dto.FriendsGetRecommendationsResponseDto;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachDoc;
import com.vk.dto.narratives.HighlightCover;
import com.vk.dto.newsfeed.entries.ProfilesRecommendations;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.dto.stories.entities.PromoInfo;
import com.vk.dto.stories.model.HighlightStoriesContainer;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.dto.user.UserProfile;
import com.vk.feed.design.view.newsfeed.reaction.FeedAnimatedView;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.events.OnCacheInvalidateEvent;
import com.vk.im.ui.components.msg_list.b;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.log.L;
import com.vk.newsfeed.api.NewsfeedDeduplicator;
import com.vk.newsfeed.impl.fragments.ModalReactionsFragment;
import com.vk.newsfeed.posting.impl.presentation.model.DonutLevel;
import com.vk.newsfeed.posting.privacy_picker.presentation.donut_levels.DonutLevelsFragment;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.toggle.features.StoriesFeatures;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$LongRef;
import xsna.e8v0;
import xsna.ev00;
import xsna.gan;
import xsna.lzh;
import xsna.p810;
import xsna.qn60;
import xsna.tj50;
import xsna.tra0;
import xsna.z740;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class r3h implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r3h(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:167:0x0353, code lost:
    
        if (r11 != r5.intValue()) goto L184;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        UserProfile userProfile;
        PromoInfo promoInfo;
        UserProfile userProfile2;
        UserProfile userProfile3;
        e6f0 e6f0Var;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        b9w b9wVar;
        int i = this.b;
        int i2 = 16;
        int i3 = 10;
        int i4 = 14;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((d4h) obj2).i.invoke(new CommunityProfileAction.e.g.a(((Boolean) obj).booleanValue() ? e8v0.i.b : e8v0.g.b));
                return s3q0.a;
            case 1:
                com.vk.profile.community.impl.ui.profile.f fVar = (com.vk.profile.community.impl.ui.profile.f) obj2;
                if (((Boolean) obj).booleanValue()) {
                    Iterator<we6> it = fVar.q.d.iterator();
                    int i5 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            we6 next = it.next();
                            if (i5 < 0) {
                                e43.t();
                                throw null;
                            }
                            if (!(next instanceof wih)) {
                                i5++;
                            }
                        } else {
                            i5 = -1;
                        }
                    }
                    Integer valueOf = i5 == -1 ? null : Integer.valueOf(i5);
                    if (valueOf != null) {
                        fVar.l.postDelayed(new hvh(fVar, valueOf.intValue()), 1500L);
                    }
                }
                return s3q0.a;
            case 2:
                ((lzh) ((lzh.a) obj2).m).h.invoke();
                return s3q0.a;
            case 3:
                ((tij) obj2).i1();
                return s3q0.a;
            case 4:
                return lak.l((lak) obj2, ((Boolean) obj).booleanValue());
            case 5:
                gik gikVar = (gik) obj2;
                v3p v3pVar = gikVar.c;
                gikVar.J(new tnt(v3pVar.j().getMeasuredWidth(), v3pVar.j().getMeasuredHeight()), gikVar.e);
                return s3q0.a;
            case 6:
                sxp sxpVar = (sxp) obj;
                long j = ((uhm) obj2).b;
                return Boolean.valueOf(!(sxpVar instanceof l980) ? !(!(sxpVar instanceof e980) ? !(!(sxpVar instanceof p980) ? !((sxpVar instanceof y080) || (sxpVar instanceof OnCacheInvalidateEvent)) : ((p980) sxpVar).d.get(Long.valueOf(j)) == null) : ((e980) sxpVar).d != j) : ((l980) sxpVar).c != j);
            case 7:
                ((psm) obj2).u(((oum) obj).b);
                return s3q0.a;
            case 8:
                x960 x960Var = (x960) obj;
                a5n a5nVar = ((e4n) obj2).f;
                return new io.reactivex.rxjava3.internal.operators.single.b(new d4n(a5nVar.b, new qn60.b[]{new xc3(x960Var.a().c, null, a5nVar.c, (NewsfeedDeduplicator) a5nVar.f.getValue(), null, false, null)})).l(new k7(new jm0(x960Var, 29), i2));
            case 9:
                int i6 = DonutLevelsFragment.R;
                hf8.a(new Intent("com.vk.newsfeed.posting.BROADCAST_DONUT_LEVELS").putExtra("com.vk.newsfeed.posting.BROADCAST_DONUT_LEVELS_SELECTED_LEVEL", (DonutLevel) obj).putExtra("com.vk.newsfeed.posting.BROADCAST_POSTING_SCREEN_UNIQUE_ID", (UUID) ((DonutLevelsFragment) obj2).P.getValue()));
                return s3q0.a;
            case 10:
                djo djoVar = (djo) obj2;
                RecyclerView recyclerView = djoVar.m;
                if (recyclerView != null) {
                    lkf0.d(recyclerView, 0);
                }
                ((b96) djoVar.f.b).b(new krh(djoVar, i3));
                return s3q0.a;
            case 11:
                io.reactivex.rxjava3.internal.operators.observable.m1 m1Var = (io.reactivex.rxjava3.internal.operators.observable.m1) obj2;
                int i7 = FeedAnimatedView.y;
                return m1Var;
            case 12:
                n5r n5rVar = (n5r) obj2;
                n5rVar.C.e(100, n5rVar.q6());
                return s3q0.a;
            case 13:
                atu atuVar = ((q7r) obj2).x0;
                StoryEntry currentStory = atuVar.a.i0.getCurrentStory();
                if (currentStory != null) {
                    Context context = atuVar.a.i0.getContext();
                    dhr0.a.getClass();
                    or1 or1Var = new or1(new ContextThemeWrapper(context, dhr0.u().c));
                    skm0 skm0Var = atuVar.e;
                    StoriesContainer storiesContainer = atuVar.a.i0.getStoriesContainer();
                    MobileOfficialAppsConStoriesStat$ViewEntryPoint viewEntryPoint = atuVar.a.i0.getViewEntryPoint();
                    mkm0 mkm0Var = atuVar.a.j0;
                    skm0Var.getClass();
                    String str = currentStory.S;
                    int i8 = 13;
                    if (str != null && str.length() != 0 && storiesContainer.j) {
                        or1Var.b(new ou5(mkm0Var, i8), str);
                    }
                    PromoInfo promoInfo2 = currentStory.t;
                    int i9 = 15;
                    if (promoInfo2 == null || !promoInfo2.e) {
                        or1Var.a(R.string.menu_settings, new io.reactivex.rxjava3.android.a(mkm0Var, i9));
                    }
                    int i10 = 17;
                    if (o25.a().a(currentStory.d) && currentStory.o0) {
                        or1Var.a(R.string.story_change_privacy, new cs2(mkm0Var, i10));
                    }
                    StoryOwner storyOwner = currentStory.l0;
                    StoryOwner.User zb = storyOwner != null ? storyOwner.zb() : null;
                    int i11 = 11;
                    if ((zb != null && (userProfile3 = zb.c) != null && userProfile3.U) || (zb != null && (userProfile = zb.c) != null && userProfile.V)) {
                        or1Var.a((zb == null || (userProfile2 = zb.c) == null || !userProfile2.V) ? R.string.subscribe_to_stories : R.string.unsubscribe_from_stories, new kv2(mkm0Var, i11));
                    }
                    if (xg5.a().e(currentStory.d) && currentStory.m0 == null) {
                        if (xg5.a().e(currentStory.d) && currentStory.m0 == null && currentStory.o0 && !(storiesContainer instanceof HighlightStoriesContainer)) {
                            or1Var.a(R.string.highlight_add_story_into_highlight, new w29(mkm0Var, 10));
                        }
                        boolean z = storiesContainer instanceof HighlightStoriesContainer;
                        if (z) {
                            HighlightCover highlightCover = ((HighlightStoriesContainer) storiesContainer).o.e;
                            if (highlightCover != null) {
                                int i12 = currentStory.c;
                                Integer o = up2.o(highlightCover);
                                if (o != null) {
                                    break;
                                }
                            }
                            or1Var.a(R.string.highlight_make_story_cover, new fs2(mkm0Var, i4));
                        }
                        if (!currentStory.b && ((currentStory.Ib(iah0.v()) != null || currentStory.n != null) && !currentStory.Mb() && currentStory.Ab() == null)) {
                            or1Var.a(R.string.save, new gs2(mkm0Var, i2));
                        }
                        String str2 = currentStory.t0;
                        if (str2 != null && str2.length() != 0) {
                            or1Var.a(R.string.story_show_advertiser_info, new gv2(mkm0Var, i8));
                        }
                        String str3 = currentStory.u0;
                        if (str3 != null && str3.length() != 0) {
                            Context context2 = e43.a;
                            if (context2 == null) {
                                context2 = null;
                            }
                            or1Var.b(new a72(mkm0Var, 18), context2.getString(R.string.ad_marker_template, currentStory.u0));
                        }
                        if (skm0Var.a.n(currentStory.c) && !currentStory.B) {
                            if (z) {
                                or1Var.a(R.string.highlight_delete_story_from_highlight, new hod(mkm0Var, 15));
                            } else if (currentStory.Mb()) {
                                or1Var.a(R.string.delete_live_finished_story, new c0(6, mkm0Var, currentStory));
                            } else {
                                or1Var.a(R.string.delete_story, new h73(7, mkm0Var, currentStory));
                            }
                        }
                    } else {
                        if (currentStory.m0 == null) {
                            or1Var.a(R.string.report_content, new kv3(mkm0Var, 22));
                        }
                        if (o25.a().a(currentStory.P)) {
                            or1Var.a(R.string.story_hide_from_replies, new wk(mkm0Var, 17));
                        }
                        String str4 = currentStory.t0;
                        if (str4 != null && str4.length() != 0) {
                            or1Var.a(R.string.story_show_advertiser_info, new gv2(mkm0Var, i8));
                        }
                        String str5 = currentStory.u0;
                        if (str5 != null && str5.length() != 0) {
                            Context context3 = e43.a;
                            if (context3 == null) {
                                context3 = null;
                            }
                            or1Var.b(new a72(mkm0Var, 18), context3.getString(R.string.ad_marker_template, currentStory.u0));
                        }
                    }
                    boolean z2 = !o25.a().a(currentStory.d) && (viewEntryPoint == MobileOfficialAppsConStoriesStat$ViewEntryPoint.LIST || viewEntryPoint == MobileOfficialAppsConStoriesStat$ViewEntryPoint.DISCOVER) && (promoInfo = currentStory.t) == null && ((promoInfo == null || !promoInfo.e) && currentStory.G);
                    if (z2) {
                        or1Var.a(R.string.hide_from_stories, new hv2(mkm0Var, i4));
                    }
                    if (currentStory.F) {
                        or1Var.a(R.string.story_not_interesting_ad, new z27(mkm0Var, i8));
                    } else if (z2) {
                        or1Var.a(R.string.story_not_interesting, new z27(mkm0Var, i8));
                    }
                    switch (gan.a.$EnumSwitchMapping$0[viewEntryPoint.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            StoriesFeatures storiesFeatures = StoriesFeatures.REMOVE_HIDE_DISCOVER;
                            storiesFeatures.getClass();
                            if (!com.vk.toggle.b.A.a(storiesFeatures)) {
                                or1Var.a(R.string.stories_discover_hide_discover, new vk9(mkm0Var, 11));
                                break;
                            }
                            break;
                    }
                    atuVar.b.e(or1Var.d(), null);
                }
                return s3q0.a;
            case 14:
                return new k2s((ViewGroup) obj, ((a0s) obj2).h);
            case 15:
                return new uos((ProfilesRecommendations) obj2).a((FriendsGetRecommendationsResponseDto) obj);
            case 16:
                evs evsVar = (evs) obj2;
                evsVar.K.b(true, evsVar.E.G, new m2j(evsVar, i4), new qbj(evsVar, i3));
                return s3q0.a;
            case 17:
                j05 j05Var = (j05) obj2;
                bpn0 bpn0Var = iz10.a;
                Context context4 = e43.a;
                return iz10.a(context4 != null ? context4 : null).d(j05Var.a, -2, 0, 25).l(new mj1(new per(2), 19));
            case 18:
                l4w l4wVar = (l4w) obj2;
                j4w j4wVar = l4wVar.K;
                if (j4wVar == null) {
                    j4wVar = null;
                }
                if (!j4wVar.s()) {
                    ConstraintLayout constraintLayout = l4wVar.c;
                    if (constraintLayout == null) {
                        constraintLayout = null;
                    }
                    Activity b = enj.b(constraintLayout);
                    if (b != null) {
                        fh5 fh5Var = l4wVar.A;
                        (fh5Var == null ? null : fh5Var).j0(b);
                    }
                }
                return s3q0.a;
            case 19:
                ((r6y) obj2).z(JsApiMethodType.GET_PERSONAL_CARD, (Throwable) obj);
                return s3q0.a;
            case 20:
                ((tra0.a) obj).q((tra0) obj2, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return s3q0.a;
            case 21:
                ((nxz) obj2).k.g(true);
                return s3q0.a;
            case 22:
                ((mv00) obj2).C(new ev00.c((vv00) obj));
                return s3q0.a;
            case 23:
                ((f810) obj2).T((p810.o) obj);
                return s3q0.a;
            case 24:
                ((toy) obj2).s1();
                return s3q0.a;
            case 25:
                ((zak0) ((dr20) obj2).j).setValue((String) obj);
                return s3q0.a;
            case 26:
                Ref$LongRef ref$LongRef = (Ref$LongRef) obj2;
                long currentTimeMillis = System.currentTimeMillis();
                L.e("MlEnhanceDebug", "Write time: " + (currentTimeMillis - ref$LongRef.element));
                ref$LongRef.element = currentTimeMillis;
                return s3q0.a;
            case 27:
                ModalReactionsFragment modalReactionsFragment = (ModalReactionsFragment) obj2;
                ReactionMeta reactionMeta = (ReactionMeta) obj;
                Integer num = modalReactionsFragment.x0;
                tw3 tw3Var = modalReactionsFragment.A0;
                Handler handler = modalReactionsFragment.u0;
                int id = reactionMeta.getId();
                if (num != null && num.intValue() == id) {
                    reactionMeta = null;
                }
                FragmentActivity activity = modalReactionsFragment.getActivity();
                if (activity != null && (e6f0Var = modalReactionsFragment.T) != null) {
                    Parcelable parcelable = e6f0Var.n;
                    c6z c6zVar = parcelable instanceof c6z ? (c6z) parcelable : null;
                    if (c6zVar != null) {
                        switch (t6f0.$EnumSwitchMapping$0[e6f0Var.c.ordinal()]) {
                            case 1:
                                mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.LIKES_LIST_PHOTO;
                                break;
                            case 2:
                                mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.LIKES_LIST_VIDEO;
                                break;
                            case 3:
                                mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.LIKES_LIST_NOTE;
                                break;
                            case 4:
                                mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.LIKES_LIST_TOPIC;
                                break;
                            case 5:
                                mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.LIKES_LIST_MARKET;
                                break;
                            case 6:
                                mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.LIKES_LIST_COMMENT;
                                break;
                            case 7:
                                mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.LIKES_LIST_POST_ADS;
                                break;
                            default:
                                mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.POST_LIKES_LIST;
                                break;
                        }
                        vtk0.c().e(c6zVar, reactionMeta, activity, com.vk.stat.scheme.t0.a(mobileOfficialAppsCoreNavStat$EventScreen));
                    }
                }
                if (reactionMeta != null) {
                    handler.removeCallbacks(tw3Var);
                    handler.postDelayed(tw3Var, 100L);
                }
                return s3q0.a;
            case 28:
                com.vk.im.ui.components.msg_list.a aVar = (com.vk.im.ui.components.msg_list.a) obj2;
                com.vk.im.ui.components.msg_list.b bVar = (com.vk.im.ui.components.msg_list.b) obj;
                if (bVar instanceof b.a) {
                    Attach attach = ((b.a) bVar).a;
                    if (((attach instanceof AttachVideo) || ((attach instanceof AttachDoc) && ((AttachDoc) attach).x5())) && (b9wVar = (b9w) aVar.F.getValue()) != null) {
                        b9wVar.a();
                    }
                } else if (bVar instanceof b.C1149b) {
                    aVar.J1(((b.C1149b) bVar).a);
                } else if (bVar instanceof b.d) {
                    b.d dVar = (b.d) bVar;
                    aVar.R.d(dVar.b, dVar.a);
                    aVar.l2();
                } else if (bVar instanceof b.f) {
                    ChatFragment.j jVar = aVar.s;
                    if (jVar != null) {
                        jVar.a(((b.f) bVar).a);
                    }
                } else if (!(bVar instanceof b.e)) {
                    if (!(bVar instanceof b.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    vm30 vm30Var = aVar.o;
                    if (vm30Var != null) {
                        vm30Var.H(((b.c) bVar).a);
                    }
                }
                return s3q0.a;
            default:
                return new z740.a.C4159a(((tj50.a) obj).a(new zl20((r740) obj2, 5), ao8.d));
        }
    }
}
