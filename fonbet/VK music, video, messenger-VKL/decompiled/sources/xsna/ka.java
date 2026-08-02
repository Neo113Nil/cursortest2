package xsna;

import android.database.Cursor;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Trace;
import android.util.Size;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import com.ironsource.B5;
import com.vk.biometric.auth.api.domain.model.AuthMode;
import com.vk.biometrics.lock.impl.presentation.base.mvi.setup.BiometricsLockSecuritySetupFragment;
import com.vk.biometrics.lock.impl.presentation.base.mvi.setup.a;
import com.vk.biometrics.lock.impl.presentation.base.mvi.setup.f;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.channels.api.Channel;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListFragment;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListViewState;
import com.vk.clips.playlists.ui.picker.f;
import com.vk.clips.sdk.shared.item.clip.events.ClipItemViewEvent;
import com.vk.core.preference.Preference;
import com.vk.core.ui.floating_view.FloatingViewGesturesHelper;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.dto.group.AdminLeaveAction;
import com.vk.dto.im.MsgType;
import com.vk.dto.polls.Poll;
import com.vk.dto.profile.Address;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.onlinebooking.impl.edit.ui.BookingEditScreenFragment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.friends.impl.followers.presentation.fragments.AbsFollowersListFragment;
import com.vk.im.engine.internal.storage.delegates.channel_messages.ChannelMessageHistoryMetaColumn;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.ui.views.RestrictionVKEnhancedImageView;
import com.vk.libvideo.live.impl.views.chat.a;
import com.vk.log.L;
import com.vk.metrics.logging.PerfLogger;
import com.vk.newsfeed.api.data.NewsfeedGetResponse;
import com.vk.polls.entities.exceptions.UserAlreadyVotedException;
import com.vk.voip.ui.accessibility.AccessibilityEvents;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vungle.ads.internal.protos.Sdk;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import xsna.ikv0;
import xsna.l7x0;
import xsna.rtb0;
import xsna.s3s;
import xsna.tj50;
import xsna.wi8;
import xsna.xcw0;
import xsna.zxd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class ka implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ka(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        bm9 bm9Var;
        CatalogDataType catalogDataType;
        ArrayList<UIBlock> arrayList;
        UIBlock uIBlock;
        int i = this.b;
        int i2 = 2;
        r3 = null;
        ColorDrawable colorDrawable = null;
        boolean z = false;
        int i3 = 1;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                AbsFollowersListFragment absFollowersListFragment = (AbsFollowersListFragment) obj2;
                s3s s3sVar = (s3s) obj;
                int i4 = AbsFollowersListFragment.Y;
                if (s3sVar instanceof s3s.a) {
                    absFollowersListFragment.ho(R.string.follower_deleted_message);
                } else if (s3sVar instanceof s3s.b) {
                    UserId userId = ((s3s.b) s3sVar).a;
                    ikv0.a aVar = new ikv0.a(absFollowersListFragment.requireContext());
                    aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_filled_blue_24, (Integer) null, (Size) null, 14);
                    aVar.u = new ikv0.d(absFollowersListFragment.getString(R.string.friend_added_success_message), absFollowersListFragment.getString(R.string.friend_added_success_description), new ikv0.d.a(absFollowersListFragment.getString(R.string.friend_added_message_write_button), null, new com.vk.movika.sdk.base.ui.s0(i3, absFollowersListFragment, userId), Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE));
                    aVar.i = FloatingViewGesturesHelper.SwipeDirection.Horizontal;
                    aVar.n();
                } else {
                    if (!(s3sVar instanceof s3s.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    absFollowersListFragment.ho(R.string.started_following_message);
                }
                return s3q0.a;
            case 1:
                jf jfVar = (jf) obj2;
                Map.Entry entry = (Map.Entry) obj;
                StringBuilder sb = new StringBuilder();
                Object key = entry.getKey();
                sb.append(key == jfVar ? "(this Map)" : String.valueOf(key));
                sb.append(B5.U);
                Object value = entry.getValue();
                sb.append(value != jfVar ? String.valueOf(value) : "(this Map)");
                return sb.toString();
            case 2:
                AccessibilityEvents accessibilityEvents = (AccessibilityEvents) obj2;
                AccessibilityEvents.g gVar = (AccessibilityEvents.g) obj;
                accessibilityEvents.c("Process announce " + gVar);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                AccessibilityEvents.Event event = gVar.b;
                if (event == AccessibilityEvents.Event.REACTIONS) {
                    for (Map.Entry entry2 : gVar.e.entrySet()) {
                        linkedHashMap.put(entry2.getKey(), Integer.valueOf(((Set) entry2.getValue()).size()));
                    }
                }
                accessibilityEvents.b.invoke(event, Integer.valueOf(gVar.c.size()), gVar.d, linkedHashMap);
                accessibilityEvents.g = (gVar.a + 1) % AccessibilityEvents.Event.values().length;
                accessibilityEvents.f = System.currentTimeMillis();
                accessibilityEvents.l = false;
                if (!accessibilityEvents.e.isEmpty() || !accessibilityEvents.h.isEmpty()) {
                    accessibilityEvents.f();
                }
                return s3q0.a;
            case 3:
                pp0 pp0Var = (pp0) obj2;
                b7d0 b7d0Var = pp0Var.d;
                rtb0.a aVar2 = (rtb0.a) obj;
                boolean z2 = aVar2.b;
                Poll poll = aVar2.a;
                if (z2) {
                    b7d0Var.h7(l7x0.b.a);
                    b7d0Var.d7(poll);
                } else {
                    b7d0Var.h7(new l7x0.c(j5g.R0(pp0Var.a.a)));
                    b7d0Var.i7(new UserAlreadyVotedException("User already voted"));
                    b7d0Var.b7(poll);
                }
                return s3q0.a;
            case 4:
                return new io.reactivex.rxjava3.internal.operators.single.r(rsg0.D0(yfb.x(hx4.o((ix4) ((m22) obj2).e, (List) obj, null, 6))), new pa(new oa(4), i3));
            case 5:
                ((mp5) obj2).l.set(true);
                return s3q0.a;
            case 6:
                n96 n96Var = (n96) obj2;
                MsgType msgType = (MsgType) obj;
                if (msgType != null && (bm9Var = (bm9) n96Var.getPresenter()) != null) {
                    bm9Var.O3(msgType);
                }
                return s3q0.a;
            case 7:
                BiometricsLockSecuritySetupFragment biometricsLockSecuritySetupFragment = (BiometricsLockSecuritySetupFragment) obj2;
                ?? r0 = biometricsLockSecuritySetupFragment.R;
                ?? r2 = biometricsLockSecuritySetupFragment.S;
                com.vk.biometrics.lock.impl.presentation.base.mvi.setup.f fVar = (com.vk.biometrics.lock.impl.presentation.base.mvi.setup.f) obj;
                int i5 = BiometricsLockSecuritySetupFragment.W;
                if (fVar.equals(f.a.a)) {
                    biometricsLockSecuritySetupFragment.finish();
                } else if (fVar.equals(f.d.a)) {
                    L.G(zy60.c("BiometricsLock: before request-> is available ", " \nis available by hardware ", ((k47) r2.getValue()).c(biometricsLockSecuritySetupFragment.requireContext()), ((k47) r2.getValue()).b(biometricsLockSecuritySetupFragment.requireContext())));
                    k47 k47Var = (k47) r2.getValue();
                    t6e0 t6e0Var = new t6e0(biometricsLockSecuritySetupFragment.getString(R.string.bl_enter_by_biometrics), new s6e0(biometricsLockSecuritySetupFragment.getString(R.string.bl_cancel), false));
                    Object obj3 = r57.a;
                    k47Var.d(biometricsLockSecuritySetupFragment, t6e0Var, new vjk(AuthMode.ENCRYPTION, "biometrics_lock".getBytes(emb.b)), Preference.f("biometrics_lock"), biometricsLockSecuritySetupFragment);
                } else if (fVar instanceof f.b) {
                    biometricsLockSecuritySetupFragment.finish();
                    r57.b().b().onNext(Boolean.FALSE);
                    ((b87) r0.getValue()).a(biometricsLockSecuritySetupFragment.requireContext());
                } else if (fVar instanceof f.c) {
                    biometricsLockSecuritySetupFragment.getFeature().C(a.C0436a.b);
                    ((b87) r0.getValue()).c(biometricsLockSecuritySetupFragment.requireContext());
                } else {
                    if (!(fVar instanceof f.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    n97 n97Var = (n97) biometricsLockSecuritySetupFragment.U.getValue();
                    hsk0 hsk0Var = ((f.e) fVar).a;
                    int a = ((k47) r2.getValue()).a(biometricsLockSecuritySetupFragment.requireContext());
                    n97Var.getClass();
                    n97.a(hsk0Var, a);
                }
                return s3q0.a;
            case 8:
                qcy<Object>[] qcyVarArr = BookingEditScreenFragment.W;
                wr7.a((BookingEditScreenFragment) obj2, (as7) obj);
                return s3q0.a;
            case 9:
                final us7 us7Var = (us7) obj2;
                g47 g47Var = (g47) obj;
                g47Var.e(tci.l(us7Var), ts7.b);
                l370.n(g47Var, f9t.w(us7Var), new am0(12));
                g47Var.d(new xy() { // from class: xsna.qs7
                    @Override // xsna.xy
                    public final void a(lj50 lj50Var) {
                        us7.this.b((gs7) lj50Var);
                    }
                });
                return s3q0.a;
            case 10:
                ri8 ri8Var = (ri8) obj;
                ((pi8) obj2).T(new wi8.c(ri8Var.a, ri8Var.b, ri8Var.c, ri8Var.d));
                return s3q0.a;
            case 11:
                a89 a89Var = (a89) obj2;
                x79 x79Var = (x79) ((ycw0) ((i330) ((bpn0) a89Var.d).getValue()).c);
                if (x79Var == null) {
                    return s3q0.a;
                }
                if (x79Var.b.b) {
                    a89Var.q(xcw0.s.a);
                }
                return s3q0.a;
            case 12:
                n3a n3aVar = (n3a) obj2;
                UIBlock uIBlock2 = (UIBlock) obj;
                UIBlockList uIBlockList = uIBlock2 instanceof UIBlockList ? (UIBlockList) uIBlock2 : null;
                if (uIBlockList == null || (arrayList = uIBlockList.y) == null || (uIBlock = (UIBlock) j5g.a0(arrayList)) == null || (catalogDataType = uIBlock.e) == null) {
                    catalogDataType = uIBlock2.e;
                }
                Set<CatalogDataType> set = ((oon0) n3aVar).b;
                if (set != null && !set.contains(catalogDataType)) {
                    z = true;
                }
                return Boolean.valueOf(!z);
            case 13:
                com.vk.im.engine.internal.storage.delegates.channel_messages.a aVar3 = ((r3b) obj2).c;
                List O0 = j5g.O0((Collection) obj);
                aVar3.getClass();
                if (O0.isEmpty()) {
                    return jgp.b;
                }
                StringBuilder sb2 = new StringBuilder("\n            SELECT ");
                ChannelMessageHistoryMetaColumn channelMessageHistoryMetaColumn = ChannelMessageHistoryMetaColumn.CHANNEL_ID;
                sb2.append(channelMessageHistoryMetaColumn.getKey());
                sb2.append(", ");
                sb2.append(ChannelMessageHistoryMetaColumn.SERVER_IS_EMPTY_VALUE.getKey());
                sb2.append(", ");
                sb2.append(ChannelMessageHistoryMetaColumn.SERVER_IS_EMPTY_PHASE.getKey());
                sb2.append("\n            FROM ");
                sb2.append(aVar3.a.a);
                sb2.append("\n            WHERE ");
                sb2.append(channelMessageHistoryMetaColumn.getKey());
                sb2.append(" IN(");
                sb2.append(p4g.k(O0, StringUtils.COMMA, null));
                sb2.append(")\n            ");
                Cursor d = aVar3.b.b().d(sb2.toString(), null);
                HashMap hashMap = new HashMap(d.getCount());
                Trace.beginSection(ndp0.f("Cursor.forEach"));
                try {
                    try {
                        if (d.moveToFirst()) {
                            while (!d.isAfterLast()) {
                                ChannelMessageHistoryMetaColumn channelMessageHistoryMetaColumn2 = ChannelMessageHistoryMetaColumn.CHANNEL_ID;
                                hashMap.put(Long.valueOf(fl3.C(d, channelMessageHistoryMetaColumn2.getKey())), new yj30(fl3.A(d, ChannelMessageHistoryMetaColumn.SERVER_IS_EMPTY_PHASE.getKey()), fl3.C(d, channelMessageHistoryMetaColumn2.getKey()), fl3.x(d, ChannelMessageHistoryMetaColumn.SERVER_IS_EMPTY_VALUE.getKey())));
                                d.moveToNext();
                            }
                        }
                        return hashMap;
                    } finally {
                        d.close();
                    }
                } finally {
                    Trace.endSection();
                }
            case 14:
                Attach attach = (Attach) obj2;
                View view = (View) obj;
                RestrictionVKEnhancedImageView restrictionVKEnhancedImageView = view instanceof RestrictionVKEnhancedImageView ? (RestrictionVKEnhancedImageView) view : null;
                if (restrictionVKEnhancedImageView == null) {
                    return s3q0.a;
                }
                AttachVideo attachVideo = (AttachVideo) attach;
                restrictionVKEnhancedImageView.setLocalImage(attachVideo.f);
                restrictionVKEnhancedImageView.setRemoteImage(attachVideo.c);
                VideoRestriction O = attachVideo.b.O();
                boolean z3 = O != null ? O.d : false;
                restrictionVKEnhancedImageView.T = false;
                restrictionVKEnhancedImageView.S = z3;
                restrictionVKEnhancedImageView.e1();
                njt hierarchy = restrictionVKEnhancedImageView.getHierarchy();
                if (restrictionVKEnhancedImageView.S || (restrictionVKEnhancedImageView.V && !restrictionVKEnhancedImageView.T)) {
                    colorDrawable = restrictionVKEnhancedImageView.R;
                }
                hierarchy.r(colorDrawable, 0);
                restrictionVKEnhancedImageView.invalidate();
                return s3q0.a;
            case 15:
                w9b w9bVar = (w9b) obj2;
                int itemId = ((MenuItem) obj).getItemId();
                if (itemId == R.id.action_chat_profile_share) {
                    w9bVar.s(zxd0.s.b.a);
                } else if (itemId == R.id.action_chat_profile_settings) {
                    w9bVar.s(zxd0.t.a);
                }
                return Boolean.TRUE;
            case 16:
                ecb ecbVar = (ecb) obj2;
                ecbVar.p = ((Channel) obj).c;
                ecbVar.a1();
                return s3q0.a;
            case 17:
                ((sgb) obj2).f.c((Throwable) obj, new lk(3));
                return s3q0.a;
            case 18:
                ((a.j) obj2).invoke((AdminLeaveAction) obj);
                return s3q0.a;
            case 19:
                ((e6c) obj2).t3(true);
                return s3q0.a;
            case 20:
                s1d s1dVar = (s1d) obj2;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean z4 = s1dVar.p;
                s1dVar.p = booleanValue;
                if (booleanValue != z4) {
                    s1dVar.o.x0.a(booleanValue ? ClipItemViewEvent.OnVideoFocusChanged.FOCUSED : ClipItemViewEvent.OnVideoFocusChanged.UNFOCUSED);
                }
                return s3q0.a;
            case 21:
                ise iseVar = (ise) obj;
                List list = (List) ((mtk0) obj2).getValue();
                int size = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 < size) {
                        if (epx.f(iseVar, (ise) list.get(i6))) {
                            z = true;
                        } else {
                            i6++;
                        }
                    }
                }
                return Boolean.valueOf(!z);
            case 22:
                ClipsDraftPersistentStore clipsDraftPersistentStore = (ClipsDraftPersistentStore) obj;
                lmv clipsControls = ((atd) obj2).b.getClipsControls();
                if (clipsControls != null) {
                    if (!clipsDraftPersistentStore.n() && o25.a().b()) {
                        z = true;
                    }
                    clipsControls.B3(z);
                }
                return s3q0.a;
            case 23:
                h1e h1eVar = (h1e) obj2;
                List<cc50> list2 = (List) obj;
                h1eVar.h = list2;
                h1eVar.a.e(list2);
                return s3q0.a;
            case 24:
                ClipsFavoriteFolderContentListFragment clipsFavoriteFolderContentListFragment = (ClipsFavoriteFolderContentListFragment) obj2;
                int i7 = ClipsFavoriteFolderContentListFragment.W;
                clipsFavoriteFolderContentListFragment.go(new np5(i2, (ClipsFavoriteFolderContentListViewState.g) obj, clipsFavoriteFolderContentListFragment));
                return s3q0.a;
            case 25:
                return new f.b(((tj50.a) obj).a(new com.vk.voip.ui.menu.feature.a((com.vk.clips.playlists.ui.picker.d) obj2, 26), ao8.d));
            case 26:
                yzf yzfVar = (yzf) obj2;
                NewsfeedGetResponse newsfeedGetResponse = (NewsfeedGetResponse) obj;
                com.vk.newsfeed.common.util.j jVar = new com.vk.newsfeed.common.util.j();
                String str = newsfeedGetResponse.j() ? yzfVar.c : yzfVar.d;
                HashMap hashMap2 = new HashMap();
                Iterator<NewsEntry> it = newsfeedGetResponse.iterator();
                while (it.hasNext()) {
                    NewsEntry next = it.next();
                    ArrayList arrayList2 = new ArrayList();
                    com.vk.newsfeed.common.util.j.h(jVar, next, (s1c0) yzfVar.e.getValue(), "news", str, arrayList2, null, 96);
                    hashMap2.put(next, new k0d0(arrayList2));
                }
                new PerfLogger().a(PerfLogger.Event.NEWSFEED_CACHE_RENDERED);
                return new al60(newsfeedGetResponse, newsfeedGetResponse.i(), newsfeedGetResponse.isSmartNews, hashMap2, false);
            case 27:
                vqg vqgVar = (vqg) obj2;
                Location location = (Location) ((it80) obj).a;
                vqgVar.e = location;
                vqgVar.c.po(location);
                return s3q0.a;
            case 28:
                ((ImageView) obj2).setImageDrawable((Drawable) obj);
                return s3q0.a;
            default:
                vmh vmhVar = (vmh) obj2;
                ExtendedCommunityProfile extendedCommunityProfile = (ExtendedCommunityProfile) obj;
                Object[] objArr = extendedCommunityProfile.W1 != null;
                if (extendedCommunityProfile.Y == 1 && extendedCommunityProfile.T > 0 && myc0.f(extendedCommunityProfile.s0)) {
                    z = true;
                }
                if (objArr != true && !z) {
                    return null;
                }
                String b = x2h.b(extendedCommunityProfile, true);
                String str2 = extendedCommunityProfile.j;
                Address address = extendedCommunityProfile.W1;
                String str3 = extendedCommunityProfile.s0;
                double d2 = extendedCommunityProfile.W;
                double d3 = extendedCommunityProfile.X;
                UserProfile userProfile = extendedCommunityProfile.a;
                return new tch(new uch(b, str2, address, str3, d2, d3, userProfile != null ? userProfile.e : null, extendedCommunityProfile.Z1), new no3(vmhVar, i2));
        }
    }
}
