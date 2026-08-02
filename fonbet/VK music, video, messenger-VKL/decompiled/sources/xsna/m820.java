package xsna;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.ironsource.X3;
import com.vk.catalog2.common.ui.mvp.friend.FriendsCatalogFragment;
import com.vk.catalog2.common.ui.mvp.sticker.StickersCatalogFragment;
import com.vk.clips.viewer.impl.owner.ui.fragment.ClipsOwnerSwipeFragment;
import com.vk.core.apps.BuildInfo;
import com.vk.core.fragments.FragmentEntry;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.preference.Preference;
import com.vk.debug.ui.DebugTabsFragment;
import com.vk.documents.ui.fragments.DocumentsViewFragment;
import com.vk.dto.common.id.UserId;
import com.vk.fave.entities.FaveCategory;
import com.vk.fave.entities.FaveSource;
import com.vk.fave.fragments.FavesFragment;
import com.vk.feedlikes.fragments.FeedLikesFragment;
import com.vk.friends.impl.birthdays.presentation.BirthdaysListFragment;
import com.vk.home.HomeFragment2;
import com.vk.menu.presentation.entity.MenuItemUiData;
import com.vk.menu.presentation.entity.TabMenuItemUiData;
import com.vk.menu.presentation.entity.a;
import com.vk.money.MoneyTransfersFragment;
import com.vk.music.fragment.impl.MusicCatalogFragment;
import com.vk.music.fragment.impl.MusicContainerFragment;
import com.vk.music.fragment.impl.MusicOfflineCatalogFragment;
import com.vk.navigation.NavigationDelegateActivity;
import com.vk.navigation.marked.FragmentWithGlobalSearch$EntryMethod;
import com.vk.newsfeed.impl.explore.ExploreFragment;
import com.vk.photos.ui.profile.ProfileMainPhotosFragment;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import com.vk.profile.user.impl.ui.UserProfileFragment;
import com.vk.search.fragment.DiscoverSearchFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryPublishItem;
import com.vk.stats.StatsFragment;
import com.vk.story.archive.impl.presentation.StoryArchiveFragment;
import com.vk.superapp.miniapps.api.utils.InternalVkMiniApps;
import com.vk.superapp.miniapps.impl.AppsCatalogFragment;
import com.vk.superapp.multiaccount.api.MultiAccountEntryPoint;
import com.vk.superapp.ui.SuperAppFragment;
import com.vk.superapp.ui.miniapp.EventsAppFragment;
import com.vk.video.ui.catalog.VideoCatalogFragment;
import com.vk.voip.ui.calls.presentation.base.fragment.VoipCallServiceFragment;
import com.vk.webapp.fragments.BugtrackerFragment;
import com.vk.webapp.fragments.HelpFragment;
import com.vk.webapp.fragments.VkPayFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import com.vkontakte.android.fragments.SettingsListFragment;
import java.util.HashSet;
import java.util.Locale;
import kotlin.LazyThreadSafetyMode;

/* compiled from: MenuUtils.kt */
/* loaded from: classes.dex */
public final class m820 implements w8i {
    public static final m820 b = new m820();
    public static final bpn0 c = new bpn0(new qn6(3));
    public static final Object d;
    public static final Object e;
    public static final Object f;
    public static final Object g;
    public static final Object h;
    public static final Object i;
    public static final Object j;
    public static final Object k;

    /* compiled from: MenuUtils.kt */
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InternalVkMiniApps.values().length];
            try {
                iArr[InternalVkMiniApps.WISHLIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        t0f t0fVar = new t0f(4);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        d = msy.a(lazyThreadSafetyMode, t0fVar);
        e = msy.a(lazyThreadSafetyMode, new ps0(4));
        f = msy.a(lazyThreadSafetyMode, new u0f(1));
        int i2 = 6;
        g = msy.a(lazyThreadSafetyMode, new zg9(i2));
        h = msy.a(lazyThreadSafetyMode, new b63(i2));
        i = msy.a(lazyThreadSafetyMode, new v0f(3));
        j = msy.a(lazyThreadSafetyMode, new u35(6));
        k = msy.a(lazyThreadSafetyMode, new w0f(3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        if (r6 == null) goto L13;
     */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Class<? extends FragmentImpl> a(int i2, Bundle bundle) {
        UserId userId;
        Parcelable parcelable;
        Object parcelable2;
        if (bundle != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = bundle.getParcelable("community_id_arg", UserId.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable3 = bundle.getParcelable("community_id_arg");
                if (!(parcelable3 instanceof UserId)) {
                    parcelable3 = null;
                }
                parcelable = (UserId) parcelable3;
            }
            userId = (UserId) parcelable;
        }
        userId = UserId.d;
        if (i2 == TabMenuItemUiData.HOME.h()) {
            return HomeFragment2.class;
        }
        if (i2 == TabMenuItemUiData.HUB.h()) {
            return SuperAppFragment.class;
        }
        if (i2 == TabMenuItemUiData.IM.h()) {
            return ((qqm) g.getValue()).a();
        }
        if (i2 == TabMenuItemUiData.CLIPS.h()) {
            return ClipsOwnerSwipeFragment.class;
        }
        if (i2 == TabMenuItemUiData.FRIENDS.h()) {
            return FriendsCatalogFragment.class;
        }
        if (i2 == TabMenuItemUiData.GROUPS.h()) {
            return (Class) k.getValue();
        }
        if (i2 == TabMenuItemUiData.MUSIC.h()) {
            return MusicContainerFragment.class;
        }
        if (i2 == TabMenuItemUiData.PROFILE.h()) {
            return UserProfileFragment.class;
        }
        if (i2 == TabMenuItemUiData.FEEDBACK.h()) {
            return ((ib70) h.getValue()).a();
        }
        if (i2 == TabMenuItemUiData.VIDEO.h()) {
            return VideoCatalogFragment.class;
        }
        if (i2 == TabMenuItemUiData.GAMES.h()) {
            return ((qct) i.getValue()).a();
        }
        if (i2 == TabMenuItemUiData.OVERVIEW.h()) {
            return ExploreFragment.class;
        }
        if (i2 == TabMenuItemUiData.MANAGED_GROUP.h()) {
            ProfileFragmentProviderComponent profileFragmentProviderComponent = (ProfileFragmentProviderComponent) j.getValue();
            ProfileFragmentProviderComponent.Companion companion = ProfileFragmentProviderComponent.Companion;
            return profileFragmentProviderComponent.ye(userId, null).G("TAB_BAR".toLowerCase(Locale.ROOT)).f().getClass();
        }
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        String b2 = gbg0.b(context.getResources(), i2);
        com.vk.metrics.eventtracking.b.a.a(new IllegalArgumentException("Unknown tabs item id: '" + b2 + "' (" + i2 + ')'));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0168 A[RETURN] */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v29, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean b(int i2, Context context, boolean z) {
        Context context2;
        if (i2 == R.id.menu_notifications) {
            return !zqn0.a.f();
        }
        if (i2 != R.id.menu_events) {
            if (i2 != R.id.menu_feedback) {
                if (i2 == R.id.menu_statistics) {
                    if (q6r0.f().c(m6r0.R0, 0) >= 100) {
                    }
                } else if (i2 == R.id.menu_photos) {
                    HashSet hashSet = iah0.a;
                    if (!fnj.d(context)) {
                    }
                } else {
                    if (i2 == R.id.menu_expert_card) {
                        return q6r0.f().e(m6r0.Y0);
                    }
                    if (i2 == R.id.menu_friends) {
                        HashSet hashSet2 = iah0.a;
                        if (!fnj.b(context)) {
                            return z;
                        }
                    } else if (i2 == R.id.menu_groups) {
                        HashSet hashSet3 = iah0.a;
                        if (fnj.b(context)) {
                        }
                    } else if (i2 == R.id.menu_market_orders) {
                        if (((hy80) e.getValue()).d() == null || !q6r0.f().e(m6r0.O0)) {
                        }
                    } else if (i2 == R.id.menu_market) {
                        if (((dhc) f.getValue()).b() != null) {
                        }
                    } else if (i2 == R.id.menu_ads_easy_promote) {
                        if (q6r0.f().q().b() || z) {
                        }
                    } else if (i2 == R.id.menu_games) {
                        if (!BuildInfo.l(context, "amazon")) {
                        }
                    } else {
                        if (i2 == R.id.menu_lives) {
                            return q6r0.f().e(m6r0.b0);
                        }
                        if (i2 == R.id.menu_podcasts) {
                            return q6r0.f().e(m6r0.h0);
                        }
                        if (i2 == R.id.menu_payments) {
                            return q6r0.f().e(m6r0.E);
                        }
                        if (i2 == R.id.menu_vk_pay) {
                            return q6r0.f().e(m6r0.V);
                        }
                        if (i2 != R.id.menu_show_more) {
                            if (i2 == R.id.menu_bugs) {
                                return o25.a().i().O;
                            }
                            if (i2 == R.id.menu_debug) {
                                o2l.a.getClass();
                                return o2l.e();
                            }
                            if (i2 == R.id.menu_superapp) {
                                Context context3 = e43.a;
                                context2 = context3 != null ? context3 : null;
                                HashSet hashSet4 = iah0.a;
                                return fnj.b(context2);
                            }
                            if (i2 == R.id.menu_vk_apps) {
                                if (!z) {
                                    Context context4 = e43.a;
                                    context2 = context4 != null ? context4 : null;
                                    HashSet hashSet5 = iah0.a;
                                    if (!fnj.b(context2)) {
                                    }
                                }
                            } else if (i2 == R.id.menu_qr_scanner) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        HashSet hashSet6 = iah0.a;
        if (fnj.b(context)) {
            com.vk.menu.presentation.entity.a aVar = com.vk.menu.presentation.entity.a.a;
            k720 k720Var = k720.a;
            return false;
        }
        return true;
    }

    public static final Class<? extends FragmentImpl> c(ww50<?> ww50Var, int i2, boolean z) {
        return d(ww50Var, i2, z, null, 40);
    }

    /* JADX WARN: Type inference failed for: r10v26, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v41, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v46, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v54, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v63, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v68, types: [java.lang.Object, kotlin.Lazy] */
    public static Class d(ww50 ww50Var, int i2, boolean z, Bundle bundle, int i3) {
        Class<? extends FragmentImpl> cls;
        Class b2;
        Class<? extends FragmentImpl> a2;
        boolean z2 = (i3 & 8) == 0;
        if ((i3 & 16) != 0) {
            z = false;
        }
        if ((i3 & 32) != 0) {
            bundle = new Bundle();
        }
        com.vk.menu.presentation.entity.a aVar = com.vk.menu.presentation.entity.a.a;
        Preference.I("menu_prefs", "menu_item_just_clicked", true);
        if (i2 == R.id.menu_profile) {
            h(i2, MenuItemUiData.PROFILE.i());
            cls = UserProfileFragment.class;
        } else if (i2 == R.id.menu_friends) {
            h(i2, MenuItemUiData.FRIENDS.i());
            cls = FriendsCatalogFragment.class;
        } else if (i2 == R.id.menu_calls) {
            h(i2, MenuItemUiData.VK_CALLS.i());
            cls = VoipCallServiceFragment.class;
        } else if (i2 == R.id.menu_photos) {
            bundle.putBoolean("show_friends_feed", false);
            bundle.putString("source", "menu");
            bundle.putLong("uid", q6r0.f().y().b);
            bundle.putBoolean("show_new_tags", true);
            h(i2, MenuItemUiData.PHOTOS.i());
            cls = ProfileMainPhotosFragment.class;
        } else {
            Class<? extends FragmentImpl> cls2 = VideoCatalogFragment.class;
            if (i2 == R.id.menu_videos) {
                h(i2, MenuItemUiData.VIDEOS.i());
            } else if (i2 == R.id.menu_lives) {
                bundle.putString("key_url", "https://vkvideo.ru/lives");
                h(i2, MenuItemUiData.LIVES.i());
            } else {
                cls2 = MusicCatalogFragment.class;
                if (i2 == R.id.menu_audios) {
                    bundle.putString("ref", "menu");
                    com.vk.core.utils.newtork.b.a.getClass();
                    b2 = com.vk.core.utils.newtork.b.d() ? cls2 : MusicOfflineCatalogFragment.class;
                    h(i2, MenuItemUiData.AUDIOS.i());
                } else if (i2 == R.id.menu_vk_apps) {
                    h(i2, MenuItemUiData.VK_APPS.i());
                    cls = AppsCatalogFragment.class;
                } else {
                    if (i2 == R.id.menu_groups) {
                        String i4 = MenuItemUiData.GROUPS.i();
                        a2 = (Class) k.getValue();
                        h(i2, i4);
                    } else if (i2 == R.id.menu_clips) {
                        h(i2, MenuItemUiData.CLIPS.i());
                        cls = ClipsOwnerSwipeFragment.class;
                    } else if (i2 == R.id.menu_games) {
                        String i5 = MenuItemUiData.GAMES.i();
                        a2 = ((qct) i.getValue()).a();
                        h(i2, i5);
                    } else if (i2 == R.id.menu_fave) {
                        com.vk.menu.presentation.entity.a aVar2 = com.vk.menu.presentation.entity.a.a;
                        if (com.vk.menu.presentation.entity.a.g(R.id.menu_fave) == 0) {
                            enq.a.getClass();
                            FaveCategory d2 = enq.d();
                            int i6 = FavesFragment.a.m;
                            FavesFragment.a.C1025a.a(bundle, d2, FaveSource.MENU);
                        }
                        h(i2, MenuItemUiData.FAVES.i());
                        cls = FavesFragment.class;
                    } else if (i2 == R.id.menu_feed_likes) {
                        h(i2, MenuItemUiData.FEED_LIKES.i());
                        cls = FeedLikesFragment.class;
                    } else if (i2 == R.id.menu_payments) {
                        bundle.putBoolean("show_toolbar", true);
                        h(i2, MenuItemUiData.PAYMENTS.i());
                        cls = MoneyTransfersFragment.class;
                    } else if (i2 == R.id.menu_support) {
                        int i7 = HelpFragment.a0;
                        bundle.putString("key_url", HelpFragment.b.c(null));
                        h(i2, MenuItemUiData.SUPPORT.i());
                        cls = HelpFragment.class;
                    } else if (i2 == R.id.menu_vk_pay) {
                        int i8 = VkPayFragment.g0;
                        FragmentEntry j2 = VkPayFragment.b.b(null).j();
                        bundle.putAll(j2.c);
                        String i9 = MenuItemUiData.VK_PAY.i();
                        b2 = j2.b;
                        h(i2, i9);
                    } else if (i2 == R.id.menu_documents) {
                        h(i2, MenuItemUiData.DOCUMENTS.i());
                        cls = DocumentsViewFragment.class;
                    } else if (i2 == R.id.menu_podcasts) {
                        bundle.putString("ref", "menu");
                        bundle.putString("key_url", "https://" + a0a.d + "/?section=podcasts");
                        bundle.putString("audio_section", "podcasts");
                        h(i2, MenuItemUiData.PODCASTS.i());
                    } else {
                        if (i2 == R.id.menu_show_more) {
                            h(i2, MenuItemUiData.MORE.i());
                        } else if (i2 == R.id.menu_bugs) {
                            int i10 = BugtrackerFragment.a0;
                            BugtrackerFragment.b.a(ww50Var.b, null);
                            h(i2, MenuItemUiData.BUGS.i());
                        } else if (i2 == R.id.menu_market_orders) {
                            b2 = ((hy80) e.getValue()).d();
                            if (b2 != null) {
                                h(i2, MenuItemUiData.ORDERS.i());
                            }
                        } else if (i2 == R.id.menu_wishlist) {
                            h(i2, "wishlist");
                            f(ww50Var, InternalVkMiniApps.WISHLIST, z2);
                        } else if (i2 == R.id.menu_stickers) {
                            bundle.putString("referrer", "discover_menu");
                            h(i2, MenuItemUiData.STICKERS.i());
                            cls = StickersCatalogFragment.class;
                        } else if (i2 == R.id.menu_messages) {
                            b2 = ((qqm) g.getValue()).a();
                            h(i2, "messages");
                        } else if (i2 == R.id.menu_newsfeed) {
                            h(i2, "news");
                            cls = HomeFragment2.class;
                        } else if (i2 == R.id.menu_feedback) {
                            b2 = ((ib70) h.getValue()).a();
                            h(i2, "feedback");
                        } else if (i2 == R.id.menu_search) {
                            h(i2, "discover");
                            DiscoverSearchFragment.a aVar3 = new DiscoverSearchFragment.a();
                            aVar3.A(FragmentWithGlobalSearch$EntryMethod.LeftTabletMenuSearchIconClick);
                            aVar3.k(ww50Var.b);
                        } else if (i2 == R.id.menu_settings) {
                            h(i2, "settings");
                            cls = SettingsListFragment.class;
                        } else if (i2 == R.id.menu_events) {
                            bundle.putString("ref", com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.SUPER_APP));
                            h(i2, MenuItemUiData.EVENTS.i());
                            cls = EventsAppFragment.class;
                        } else if (i2 == R.id.menu_birthdays) {
                            cls = BirthdaysListFragment.class;
                        } else if (i2 == R.id.menu_notifications) {
                            h(i2, "notifications_settings");
                            ((mh70) d.getValue()).c(ww50Var.b);
                        } else {
                            if (i2 == R.id.menu_statistics) {
                                h(i2, "statistics");
                                int i11 = StatsFragment.a0;
                                StatsFragment.b.a(7, null, null).k(ww50Var.b);
                                return null;
                            }
                            if (i2 == R.id.menu_archive) {
                                h(i2, "stories_archive");
                                cls = StoryArchiveFragment.class;
                            } else if (i2 == R.id.menu_memories) {
                                h(i2, "memories");
                                Preference.I("menu_prefs", "menu_memories_opened", true);
                                f(ww50Var, InternalVkMiniApps.MEMORIES, z2);
                            } else if (i2 == R.id.menu_expert_card) {
                                h(i2, "expert_card");
                                f(ww50Var, InternalVkMiniApps.EXPERT_CARD, z2);
                            } else if (i2 == R.id.menu_ads_easy_promote) {
                                h(i2, MenuItemUiData.ADS_EASY_PROMOTE.i());
                                jgr0 f2 = bis.f(new bis(), yv0.c(Uri.parse(z ? i5s.a(new StringBuilder("https://"), a0a.d, "/ads_easy_promote?from=discovery_menu") : q6r0.f().q().a()).getQuery()), InternalVkMiniApps.ADS_EASY_PROMOTE.h().a, 10);
                                e(ww50Var, f2.j().b, f2.j().c, z2);
                            } else if (i2 == R.id.menu_market) {
                                b2 = ((dhc) f.getValue()).b();
                                if (b2 != null) {
                                    h(i2, MenuItemUiData.MARKET.i());
                                }
                            } else if (i2 == R.id.menu_explore) {
                                h(i2, MenuItemUiData.SEARCH.i());
                                DiscoverSearchFragment.a aVar4 = new DiscoverSearchFragment.a();
                                aVar4.y();
                                aVar4.k(ww50Var.b);
                            } else if (i2 == R.id.menu_debug) {
                                h(i2, MenuItemUiData.DEBUG.i());
                                cls = DebugTabsFragment.class;
                            } else if (i2 == R.id.menu_superapp) {
                                cls = SuperAppFragment.class;
                            } else if (i2 == R.id.menu_add_account || i2 == R.id.menu_switch_account) {
                                FragmentImpl u = ww50Var.u();
                                if (u != null) {
                                    ww50Var.n();
                                    ((jlu0) c.getValue()).e(u, MultiAccountEntryPoint.SuperappMenu.d);
                                }
                            } else if (i2 == R.id.menu_qr_scanner && ww50Var.u() != null) {
                                ww50Var.n();
                                com.vk.storycamera.builder.a aVar5 = new com.vk.storycamera.builder.a(MobileOfficialAppsCoreNavStat$EventScreen.SUPER_APP, MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint.NAVIGATION_BUTTON);
                                aVar5.s();
                                aVar5.t();
                                aVar5.C(ww50Var.b);
                            }
                        }
                        cls = null;
                    }
                    cls = a2;
                }
                cls = b2;
            }
            cls = cls2;
        }
        if (cls == null) {
            return null;
        }
        e(ww50Var, cls, bundle, z2);
        return cls;
    }

    public static void e(ww50 ww50Var, Class cls, Bundle bundle, boolean z) {
        if (z) {
            new oz50(cls, null, bundle).k(ww50Var.b);
        } else {
            ww50Var.t(cls, bundle, false);
        }
    }

    public static void f(ww50 ww50Var, InternalVkMiniApps internalVkMiniApps, boolean z) {
        Uri parse = Uri.parse(a.$EnumSwitchMapping$0[internalVkMiniApps.ordinal()] == 1 ? dfx0.a() : f870.v(internalVkMiniApps.h()));
        String w = f870.w(internalVkMiniApps.h());
        NavigationDelegateActivity navigationDelegateActivity = ww50Var.b;
        itg0.a(navigationDelegateActivity, com.vk.common.links.c.e(navigationDelegateActivity, w, parse, new n820(navigationDelegateActivity, parse), new dws(ww50Var, z, 2)));
    }

    public static final void g(int i2, String str) {
        b.d dVar = new b.d("user_action");
        dVar.b("menu_click", "action_type");
        dVar.b(str, "action_param");
        if (i2 != -1) {
            dVar.b(Integer.valueOf(i2), X3.i.L);
        }
        dVar.e();
    }

    public static void h(int i2, String str) {
        a.InterfaceC1268a interfaceC1268a = com.vk.menu.presentation.entity.a.b;
        g(interfaceC1268a != null ? interfaceC1268a.M(i2) : -1, str);
    }
}
