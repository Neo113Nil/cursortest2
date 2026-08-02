package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.compose.runtime.a;
import androidx.fragment.app.Fragment;
import com.vk.catalog.mvi.block.music.impl.entity.PlayingState;
import com.vk.catalog2.common.dto.api.CatalogFilterData;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionFilter;
import com.vk.clips.favorites.impl.ui.folders.picker.c;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.music.Playlist;
import com.vk.friends.impl.friendsandfollowers.tabbedscreen.domain.FriendsAndFollowersTabType;
import com.vk.friends.impl.friendsandfollowers.tabs.presentation.fragments.AllFriendsTabFragment;
import com.vk.friends.impl.friendsandfollowers.tabs.presentation.fragments.FollowersTabFragment;
import com.vk.friends.impl.friendsandfollowers.tabs.presentation.fragments.MutualFriendsTabFragment;
import com.vk.friends.impl.friendsandfollowers.tabs.presentation.fragments.OnlineFriendsTabFragment;
import com.vk.log.L;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.StartPlayPlaylistSource;
import com.vk.stat.scheme.CommonAudioStat$AudioListeningNavInfo;
import com.vk.stat.scheme.CommonAudioStat$LaunchOriginItem;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioDomainEventItem;
import com.vk.stat.scheme.CommonStat$TypeCommonEventItem;
import com.vk.stat.scheme.CommonStat$TypeTrackCodeItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: EventHubServiceClient.kt */
/* loaded from: classes3.dex */
public class uzp implements wq5, axp, io.reactivex.rxjava3.functions.g {
    public static final uzp b = new uzp();
    public static final uzp c = new uzp();

    public static final void b(ynr0 ynr0Var, gzs gzsVar, gzs gzsVar2, gzs gzsVar3, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1108306106);
        int i2 = (M.J(ynr0Var) ? 4 : 2) | i | (M.y(gzsVar) ? 32 : 16) | (M.y(gzsVar2) ? 256 : 128) | (M.y(gzsVar3) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1108306106, i2, -1, "com.vk.ecomm.verifiedseller.impl.screens.obtainverification.ui.modal.UnlinkBidProfileModal (UnlinkBidProfileModal.kt:50)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new p4q0(ynr0Var, gzsVar, gzsVar2, gzsVar3);
                M.R(x);
            }
            p4q0 p4q0Var = (p4q0) x;
            ((zak0) p4q0Var.a).setValue(ynr0Var);
            ((zak0) p4q0Var.b).setValue(gzsVar);
            ((zak0) p4q0Var.d).setValue(gzsVar3);
            ((zak0) p4q0Var.c).setValue(gzsVar2);
            p4q0Var.a(null, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jiy(ynr0Var, gzsVar, gzsVar2, gzsVar3, i, 1);
        }
    }

    public static io.reactivex.rxjava3.disposables.c c(TextView textView, UIBlockActionFilter uIBlockActionFilter) {
        int a = iah0.a(24);
        int a2 = iah0.a(12);
        CatalogFilterData catalogFilterData = uIBlockActionFilter.z;
        String str = catalogFilterData.d;
        Image image = catalogFilterData.f;
        if ((str != null && str.length() != 0) || image != null) {
            return j(textView.getResources(), catalogFilterData.d, image, a).subscribe(new ho1(new h7a(textView, a2, 0), 6), new cz(new n8(L.a, 1), 9));
        }
        f4m.x(textView.getPaddingEnd(), textView);
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        return EmptyDisposable.INSTANCE;
    }

    public static long f(long j, long j2) {
        long j3 = j - j2;
        if (-999 > j3 || j3 >= 1) {
            return j3;
        }
        return 0L;
    }

    public static String g(Context context, long j, boolean z) {
        long abs = Math.abs(j);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long j2 = 60;
        long seconds = timeUnit.toSeconds(abs) % j2;
        long minutes = timeUnit.toMinutes(abs) % j2;
        long hours = timeUnit.toHours(abs);
        int days = (int) timeUnit.toDays(abs);
        if (j < 0) {
            return (days <= 0 || !z) ? days > 0 ? "-".concat(enj.f(R.plurals.voip_broadcast_elapsed_time_days_short, days, context)) : hours > 0 ? String.format("-%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds)}, 3)) : String.format("-%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(minutes), Long.valueOf(seconds)}, 2)) : enj.f(R.plurals.voip_broadcast_elapsed_time_days_long, days, context);
        }
        boolean z2 = hours > 0;
        if (z2) {
            return String.format("%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds)}, 3));
        }
        if (z2) {
            throw new NoWhenBranchMatchedException();
        }
        return String.format("%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(minutes), Long.valueOf(seconds)}, 2));
    }

    public static final PlayingState h(Playlist playlist, u2b0 u2b0Var) {
        return !i(playlist, u2b0Var) ? PlayingState.PAUSED : u2b0Var.m0().h() ? PlayingState.PLAYING : PlayingState.PAUSED;
    }

    public static final boolean i(Playlist playlist, u2b0 u2b0Var) {
        return (u2b0Var.j() instanceof StartPlayPlaylistSource) && epx.f(playlist.Ib(), u2b0Var.x0().Kb());
    }

    public static io.reactivex.rxjava3.internal.operators.maybe.e0 j(final Resources resources, final String str, Image image, final int i) {
        ImageSize Ab;
        ArrayList arrayList;
        Object obj;
        String str2;
        final String str3 = null;
        if (image != null && (arrayList = image.c) != null) {
            i5g i5gVar = new i5g(arrayList);
            j7a j7aVar = new j7a();
            List B = rli0.B(i5gVar);
            g5g.L(B, j7aVar);
            Iterator it = ((ArrayList) B).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((ImageSize) obj).d.b >= i) {
                    break;
                }
            }
            ImageSize imageSize = (ImageSize) obj;
            if (imageSize != null && (str2 = imageSize.d.d) != null) {
                str3 = str2;
                return new io.reactivex.rxjava3.internal.operators.maybe.e0(new io.reactivex.rxjava3.internal.operators.maybe.p(new Callable() { // from class: xsna.i7a
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Drawable k = uzp.k(str);
                        if (k != null) {
                            return k;
                        }
                        Bitmap k2 = mcr0.k(str3);
                        if (k2 == null) {
                            return null;
                        }
                        int width = k2.getWidth();
                        int i2 = i;
                        if (width != i2) {
                            k2 = Bitmap.createScaledBitmap(k2, i2, i2, true);
                        }
                        return new BitmapDrawable(resources, k2);
                    }
                }), new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.single.v(new os2(str3, 2)), new ps2(new com.vk.movika.sdk.base.observable.i(6), 4)).l(new ju1(new v24(resources, i, 1), 8)).m(io.reactivex.rxjava3.android.schedulers.a.b()));
            }
        }
        if (image != null && (Ab = image.Ab(i, false)) != null) {
            str3 = Ab.d.d;
        }
        return new io.reactivex.rxjava3.internal.operators.maybe.e0(new io.reactivex.rxjava3.internal.operators.maybe.p(new Callable() { // from class: xsna.i7a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Drawable k = uzp.k(str);
                if (k != null) {
                    return k;
                }
                Bitmap k2 = mcr0.k(str3);
                if (k2 == null) {
                    return null;
                }
                int width = k2.getWidth();
                int i2 = i;
                if (width != i2) {
                    k2 = Bitmap.createScaledBitmap(k2, i2, i2, true);
                }
                return new BitmapDrawable(resources, k2);
            }
        }), new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.single.v(new os2(str3, 2)), new ps2(new com.vk.movika.sdk.base.observable.i(6), 4)).l(new ju1(new v24(resources, i, 1), 8)).m(io.reactivex.rxjava3.android.schedulers.a.b()));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r1.equals("music_outline_24") == false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0100, code lost:
    
        r1 = com.vkontakte.android.R.drawable.vk_icon_music_outline_24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00fc, code lost:
    
        if (r1.equals("music") == false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01a1, code lost:
    
        if (r1.equals("ball") == false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01cd, code lost:
    
        r1 = com.vkontakte.android.R.drawable.vk_icon_ball_outline_24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01c9, code lost:
    
        if (r1.equals("ball_outline_24") == false) goto L168;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0264 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x025d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Drawable k(String str) {
        int i;
        if (str != null) {
            switch (str.hashCode()) {
                case -1790517947:
                    if (str.equals("smartphone")) {
                        i = R.drawable.vk_icon_smartphone_outline_24;
                        break;
                    }
                    break;
                case -1628473860:
                    if (str.equals("horse_toy")) {
                        i = R.drawable.vk_icon_horse_toy_outline_24;
                        break;
                    }
                    break;
                case -1368035283:
                    if (str.equals("cactus")) {
                        i = R.drawable.vk_icon_cactus_outline_24;
                        break;
                    }
                    break;
                case -1268966290:
                    if (str.equals("folder")) {
                        i = R.drawable.vk_icon_folder_outline_24;
                        break;
                    }
                    break;
                case -956690987:
                    if (str.equals("book_spread_outline_24")) {
                        i = R.drawable.vk_icon_book_spread_outline_24;
                        break;
                    }
                    break;
                case -946214222:
                    if (str.equals("no_comments")) {
                        i = R.drawable.vk_icon_microphone_slash_outline_24;
                        break;
                    }
                    break;
                case -906336856:
                    if (str.equals("search")) {
                        i = R.drawable.vk_icon_search_outline_24;
                        break;
                    }
                    break;
                case -880905839:
                    if (str.equals("target")) {
                        i = R.drawable.vk_icon_target_outline_24;
                        break;
                    }
                    break;
                case -798910853:
                    if (str.equals("palette")) {
                        i = R.drawable.vk_icon_palette_outline_24;
                        break;
                    }
                    break;
                case -618265660:
                    if (str.equals("user_circle")) {
                        i = R.drawable.vk_icon_user_circle_outline_24;
                        break;
                    }
                    break;
                case -439267937:
                    break;
                case -141069343:
                    if (str.equals("clapperboard_video_outline_24")) {
                        i = R.drawable.vk_icon_clapperboard_video_outline_24;
                        break;
                    }
                    break;
                case 102720:
                    if (str.equals("gun")) {
                        i = R.drawable.vk_icon_unarchive_outline_24;
                        break;
                    }
                    break;
                case 3016191:
                    break;
                case 3165170:
                    if (str.equals("game")) {
                        i = R.drawable.vk_icon_game_outline_24;
                        break;
                    }
                    break;
                case 3321751:
                    if (str.equals("like")) {
                        i = R.drawable.vk_icon_like_outline_24;
                        break;
                    }
                    break;
                case 3322014:
                    if (str.equals("list")) {
                        i = R.drawable.vk_icon_list_24;
                        break;
                    }
                    break;
                case 3322092:
                    if (str.equals("live")) {
                        i = R.drawable.vk_icon_live_outline_24;
                        break;
                    }
                    break;
                case 3599307:
                    if (str.equals("user")) {
                        i = R.drawable.vk_icon_user_outline_24;
                        break;
                    }
                    break;
                case 94017338:
                    if (str.equals("brush")) {
                        i = R.drawable.vk_icon_brush_outline_24;
                        break;
                    }
                    break;
                case 94755854:
                    if (str.equals("clock")) {
                        i = R.drawable.vk_icon_clock_outline_24;
                        break;
                    }
                    break;
                case 94935223:
                    if (str.equals("crown")) {
                        i = R.drawable.vk_icon_crown_outline_24;
                        break;
                    }
                    break;
                case 98449901:
                    if (str.equals("globe")) {
                        i = R.drawable.vk_icon_globe_outline_24;
                        break;
                    }
                    break;
                case 102197925:
                    if (str.equals("knife")) {
                        i = R.drawable.vk_icon_knife_outline_24;
                        break;
                    }
                    break;
                case 104263205:
                    break;
                case 106748167:
                    if (str.equals("place")) {
                        i = R.drawable.vk_icon_place_outline_24;
                        break;
                    }
                    break;
                case 106748508:
                    if (str.equals("plane")) {
                        i = R.drawable.vk_icon_plane_outline_24;
                        break;
                    }
                    break;
                case 108685930:
                    if (str.equals("robot")) {
                        i = R.drawable.vk_icon_robot_outline_24;
                        break;
                    }
                    break;
                case 109508445:
                    if (str.equals("skull")) {
                        i = R.drawable.vk_icon_skull_outline_24;
                        break;
                    }
                    break;
                case 109556488:
                    if (str.equals("smile")) {
                        i = R.drawable.vk_icon_smile_outline_24;
                        break;
                    }
                    break;
                case 109757537:
                    if (str.equals("stars")) {
                        i = R.drawable.vk_icon_stars_outline_24;
                        break;
                    }
                    break;
                case 376713440:
                    if (str.equals("bowl_sticks")) {
                        i = R.drawable.vk_icon_bowl_sticks_outline_24;
                        break;
                    }
                    break;
                case 385966481:
                    if (str.equals("motorcycle")) {
                        i = R.drawable.vk_icon_motorcycle_outline_24;
                        break;
                    }
                    break;
                case 390474029:
                    if (str.equals("music_mic")) {
                        i = R.drawable.vk_icon_music_mic_outline_24;
                        break;
                    }
                    break;
                case 1228727526:
                    if (str.equals("home_heart")) {
                        i = R.drawable.vk_icon_home_heart_outline_24;
                        break;
                    }
                    break;
                case 1570547026:
                    if (str.equals("magic_wand")) {
                        i = R.drawable.vk_icon_magic_wand_outline_24;
                        break;
                    }
                    break;
                case 1702021414:
                    if (str.equals("sad_face")) {
                        i = R.drawable.vk_icon_sad_face_outline_24;
                        break;
                    }
                    break;
                case 1790429672:
                    if (str.equals("18_circle")) {
                        i = R.drawable.vk_icon_18_circle_outline_24;
                        break;
                    }
                    break;
                case 1829106105:
                    break;
                case 1949362915:
                    if (str.equals("vk_video_kids_black_32")) {
                        i = R.drawable.vk_icon_vk_video_kids_black_32;
                        break;
                    }
                    break;
                case 2006930817:
                    if (str.equals("info_circle")) {
                        i = R.drawable.vk_icon_info_circle_outline_24;
                        break;
                    }
                    break;
            }
            if (i <= 0) {
                return dhr0.t.a(i);
            }
            return null;
        }
        i = -1;
        if (i <= 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x005e, code lost:
    
        if (r0 == null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static CommonAudioStat$AudioListeningNavInfo l(ak40 ak40Var, q4b0 q4b0Var) {
        Object obj;
        String str;
        CommonStat$TypeCommonEventItem d;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = ak40Var.a;
        if (mobileOfficialAppsCoreNavStat$EventScreen == MobileOfficialAppsCoreNavStat$EventScreen.AUDIO_CATALOG || mobileOfficialAppsCoreNavStat$EventScreen == MobileOfficialAppsCoreNavStat$EventScreen.CATALOG) {
            Iterator<T> it = ak40Var.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((x8h0) obj) instanceof CommonAudioStat$TypeAudioDomainEventItem) {
                    break;
                }
            }
            CommonAudioStat$TypeAudioDomainEventItem commonAudioStat$TypeAudioDomainEventItem = obj instanceof CommonAudioStat$TypeAudioDomainEventItem ? (CommonAudioStat$TypeAudioDomainEventItem) obj : null;
            str = (commonAudioStat$TypeAudioDomainEventItem == null || (d = commonAudioStat$TypeAudioDomainEventItem.d()) == null) ? null : d.a;
            if (str == null || str.length() == 0) {
                str = null;
            }
            if (str == null) {
                SchemeStat$EventItem schemeStat$EventItem = ak40Var.c;
                if (schemeStat$EventItem != null) {
                    if (schemeStat$EventItem.d() != SchemeStat$EventItem.Type.CATALOG_ITEM) {
                        schemeStat$EventItem = null;
                    }
                    if (schemeStat$EventItem != null) {
                        str = schemeStat$EventItem.a;
                    }
                }
                str = null;
            }
        }
        str = "";
        MusicPlaybackLaunchContext musicPlaybackLaunchContext = q4b0Var.e.a;
        String string = musicPlaybackLaunchContext.b.getString("__META_CATALOG_BLOCK_ID", "");
        String str2 = string.length() != 0 ? string : null;
        if (str2 == null) {
            str2 = musicPlaybackLaunchContext.t();
        }
        CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem = new CommonStat$TypeTrackCodeItem(str2);
        int i = q4b0Var.a.V;
        ArrayList arrayList = new ArrayList();
        if (jnj.d(i)) {
            arrayList.add(CommonAudioStat$LaunchOriginItem.KIDS_SECTION);
        }
        if (jnj.e(i)) {
            arrayList.add(CommonAudioStat$LaunchOriginItem.KIDS_EDITORIAL_SECTION);
        }
        return new CommonAudioStat$AudioListeningNavInfo(str, commonStat$TypeTrackCodeItem, arrayList);
    }

    public static final FriendsAndFollowersTabType m(Fragment fragment) {
        if (fragment instanceof FollowersTabFragment) {
            return FriendsAndFollowersTabType.FOLLOWERS;
        }
        if (fragment instanceof AllFriendsTabFragment) {
            return FriendsAndFollowersTabType.ALL_FRIENDS;
        }
        if (fragment instanceof OnlineFriendsTabFragment) {
            return FriendsAndFollowersTabType.ONLINE_FRIENDS;
        }
        if (fragment instanceof MutualFriendsTabFragment) {
            return FriendsAndFollowersTabType.MUTUAL;
        }
        return null;
    }

    @Override // xsna.wq5
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void e(String str, yzs yzsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        String str2;
        yzs yzsVar2;
        int i3;
        androidx.compose.runtime.a M = aVar.M(-1747059737);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(yzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1747059737, i2, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.FriendsPart.<anonymous>.<anonymous>.<no name provided>.Content (GroupHeaderItem.kt:449)");
            }
            if (str == null) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                androidx.compose.runtime.f s = M.s();
                if (s != null) {
                    s.d = new ijl(i, 2, this, str, yzsVar);
                    return;
                }
                return;
            }
            str2 = str;
            yzsVar2 = yzsVar;
            i3 = i;
            if (as.a((i2 & 112) | 8, yzsVar2, fwu0.l(str2, null, null, null, M, i2 & 14, 62), M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            str2 = str;
            yzsVar2 = yzsVar;
            i3 = i;
            M.h();
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.d = new ty5(i3, 4, this, str2, yzsVar2);
        }
    }

    @Override // io.reactivex.rxjava3.functions.g
    public Object d(Object obj, Object obj2, Object obj3) {
        return new c.d.C0610c((u2e) obj, (List) obj2, (b4e) obj3);
    }
}
