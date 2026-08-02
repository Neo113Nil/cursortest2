package xsna;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Parcelable;
import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.room.a;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemAutoPlayVh;
import com.vk.catalog2.feature.music.holders.OfflineHeaderRemoveAllVh;
import com.vk.clips.design.view.filter.FiltersView;
import com.vk.community.design.view.components.catalog.CommunityCardView;
import com.vk.core.ui.VkFabBehaviour;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dialogsscreen.impl.DialogsScreenFragment;
import com.vk.dto.common.Peer;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.music.haptic.MusicHapticEvent;
import com.vk.music.stickyplayer.domain.PlayerContext;
import com.vk.onboarding.api.stat.VkOnboardingStat$Delegate;
import com.vk.photos.root.albums.presentation.a;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchCatalogRootVh;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsImStat$TypeImInvitationCardRejectAction;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.video.ui.discovery.minimizable.doc2doc.recycler.HorizontalRecyclerPaginationView;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.e8v0;
import xsna.h7u0;
import xsna.omt0;
import xsna.pg00;
import xsna.pox0;
import xsna.qg00;
import xsna.s7d0;
import xsna.sx40;
import xsna.xs3;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class km1 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ km1(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v83, types: [T, com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem$SharingChannel, java.lang.Object] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i;
        int i2;
        int i3 = this.b;
        int i4 = 16;
        int i5 = 1;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i3) {
            case 0:
                com.vk.photos.root.albums.presentation.b bVar = (com.vk.photos.root.albums.presentation.b) obj2;
                PhotoAlbum photoAlbum = (PhotoAlbum) obj;
                bVar.k.c(photoAlbum.b);
                bVar.C(new a.C1492a(photoAlbum));
                return s3q0.a;
            case 1:
                ((izs) obj2).invoke(new xs3.a(((jt3) obj).b));
                return s3q0.a;
            case 2:
                VkOnboardingStat$Delegate vkOnboardingStat$Delegate = (VkOnboardingStat$Delegate) obj2;
                yp8 yp8Var = (yp8) obj;
                if (vkOnboardingStat$Delegate != null) {
                    vkOnboardingStat$Delegate.d4(e8v0.c.b);
                }
                ((gzs) ((zak0) yp8Var.b).getValue()).invoke();
                return s3q0.a;
            case 3:
                ChatFragment.d dVar = ChatFragment.w1;
                Peer a = ((ChatFragment) obj2).ko().a();
                MobileOfficialAppsImStat$TypeImInvitationCardRejectAction.EventType eventType = MobileOfficialAppsImStat$TypeImInvitationCardRejectAction.EventType.REJECT_REQUEST_DIALOG_BACK;
                iid0 iid0Var = new iid0();
                UiTracker uiTracker = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                SchemeStat$TypeAction b = SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsImStat$TypeImInvitationCardRejectAction(a.b, ((Peer) obj).b, eventType), 3);
                iid0Var.f = c;
                iid0Var.g = b;
                iid0Var.q();
                return s3q0.a;
            case 4:
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj2;
                boolean z = !ref$BooleanRef.element;
                ref$BooleanRef.element = z;
                ((vsb) obj).a.e(z);
                return s3q0.a;
            case 5:
                ((bp50) obj2).a();
                return s3q0.a;
            case 6:
                i3i i3iVar = (i3i) obj2;
                aug augVar = (aug) obj;
                CommunityCardView communityCardView = augVar.o;
                if (i3iVar.b.j) {
                    communityCardView.P4(17);
                } else {
                    communityCardView.P4(16);
                }
                augVar.n.invoke(i3iVar.b, i3iVar.c, communityCardView.getAnchorView());
                return s3q0.a;
            case 7:
                return ((a.C0084a) obj2).open((String) obj);
            case 8:
                Collection collection = (Collection) obj2;
                com.vk.im.ui.components.contacts.b bVar2 = (com.vk.im.ui.components.contacts.b) obj;
                if (collection.isEmpty()) {
                    return s3q0.a;
                }
                Iterable iterable = (Iterable) bVar2.r;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : iterable) {
                    if (!collection.contains(Long.valueOf(((qtd0) obj3).G3()))) {
                        arrayList.add(obj3);
                    }
                }
                bVar2.r = arrayList;
                io.reactivex.rxjava3.subjects.d<s3q0> dVar2 = bVar2.q;
                s3q0 s3q0Var = s3q0.a;
                dVar2.onNext(s3q0Var);
                bVar2.o.onNext(bVar2.i(bVar2.d()));
                return s3q0Var;
            case 9:
                DialogsScreenFragment dialogsScreenFragment = (DialogsScreenFragment) obj2;
                int i6 = DialogsScreenFragment.p0;
                View findViewById = ((View) obj).findViewById(R.id.vkim_fab);
                ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                CoordinatorLayout.f fVar = layoutParams instanceof CoordinatorLayout.f ? (CoordinatorLayout.f) layoutParams : null;
                if (fVar != null) {
                    CoordinatorLayout.f fVar2 = new CoordinatorLayout.f(fVar);
                    fVar2.c(new VkFabBehaviour());
                    fVar2.d = fVar.d;
                    fVar2.b(fVar.f);
                    fVar2.c = fVar.c;
                    findViewById.setLayoutParams(fVar2);
                    f4m.q(e3m.a(R.dimen.vkim_fab_bottom_margin, findViewById.getContext()) + dialogsScreenFragment.n0 + dialogsScreenFragment.m0, findViewById);
                }
                return s3q0.a;
            case 10:
                ((FiltersView) obj2).t.i.H0(new qcl(((tcr) obj).a, 7), new egr(true));
                return s3q0.a;
            case 11:
                return new t8a(((GlobalSearchCatalogRootVh) obj2).m.b.d, fxc0.B(), ((BridgeComponent) m7m.a((Activity) obj).a(fpf0.a(BridgeComponent.class))).F());
            case 12:
                pg00.b bVar3 = (pg00.b) obj;
                ((izs) obj2).invoke(new qg00.e(bVar3.a, bVar3.d));
                return s3q0.a;
            case 13:
                ((su10) obj2).g((Context) obj);
                return s3q0.a;
            case 14:
                ((gzs) obj2).invoke();
                ((ss3) obj).invoke();
                return s3q0.a;
            case 15:
                cl40.a((View) obj2, MusicHapticEvent.LIGHT);
                ((izs) obj).invoke(sx40.r.b);
                return s3q0.a;
            case 16:
                OfflineHeaderRemoveAllVh offlineHeaderRemoveAllVh = (OfflineHeaderRemoveAllVh) obj2;
                qcy<Object>[] qcyVarArr = OfflineHeaderRemoveAllVh.j;
                String str = ((UIBlock) obj).c;
                if (str != null) {
                    Context context = offlineHeaderRemoveAllVh.a().getContext();
                    i5 i5Var = new i5(i4, offlineHeaderRemoveAllVh, str);
                    h7u0.a aVar = new h7u0.a(context, R.style.OfflineRemoveAlert, null, 4);
                    switch (str.hashCode()) {
                        case -1903268188:
                            if (str.equals("synthetic_offline_music_playlist_all")) {
                                i = R.string.music_offline_delete_playlists_title;
                                break;
                            }
                            i = R.string.music_offline_delete_tracks_title;
                            break;
                        case -330053986:
                            str.equals("synthetic_offline_tracks");
                            i = R.string.music_offline_delete_tracks_title;
                            break;
                        case 320065073:
                            if (str.equals("synthetic_offline_music_audiobook_all")) {
                                i = R.string.music_offline_delete_audio_books_title;
                                break;
                            }
                            i = R.string.music_offline_delete_tracks_title;
                            break;
                        case 1238991073:
                            if (str.equals("synthetic_offline_music_album_all")) {
                                i = R.string.music_offline_delete_albums_title;
                                break;
                            }
                            i = R.string.music_offline_delete_tracks_title;
                            break;
                        case 1389309686:
                            if (str.equals("synthetic_offline_music_podcast_all")) {
                                i = R.string.music_offline_delete_podcasts_title;
                                break;
                            }
                            i = R.string.music_offline_delete_tracks_title;
                            break;
                        default:
                            i = R.string.music_offline_delete_tracks_title;
                            break;
                    }
                    aVar.g0(i);
                    switch (str.hashCode()) {
                        case -1903268188:
                            if (str.equals("synthetic_offline_music_playlist_all")) {
                                i2 = R.string.music_offline_delete_playlists_description;
                                break;
                            }
                            i2 = R.string.music_offline_delete_tracks_description;
                            break;
                        case -330053986:
                            str.equals("synthetic_offline_tracks");
                            i2 = R.string.music_offline_delete_tracks_description;
                            break;
                        case 320065073:
                            if (str.equals("synthetic_offline_music_audiobook_all")) {
                                i2 = R.string.music_offline_delete_audio_books_description;
                                break;
                            }
                            i2 = R.string.music_offline_delete_tracks_description;
                            break;
                        case 1238991073:
                            if (str.equals("synthetic_offline_music_album_all")) {
                                i2 = R.string.music_offline_delete_albums_description;
                                break;
                            }
                            i2 = R.string.music_offline_delete_tracks_description;
                            break;
                        case 1389309686:
                            if (str.equals("synthetic_offline_music_podcast_all")) {
                                i2 = R.string.music_offline_delete_podcasts_description;
                                break;
                            }
                            i2 = R.string.music_offline_delete_tracks_description;
                            break;
                        default:
                            i2 = R.string.music_offline_delete_tracks_description;
                            break;
                    }
                    aVar.U(i2);
                    aVar.c0(R.string.delete, new w4w(i5Var, i5));
                    aVar.W(R.string.cancel, new vg00(1));
                    aVar.m();
                    offlineHeaderRemoveAllVh.i.b(hg1.c(offlineHeaderRemoveAllVh.e.a(), fi40.class, gi40.class, st1.class, tt1.class).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).y(1L, TimeUnit.SECONDS).subscribe(new tz(new sh3(19, offlineHeaderRemoveAllVh, str), 27)));
                }
                return s3q0.a;
            case 17:
                ((m8d0) obj2).g().invoke(s7d0.b.a);
                ((f030) obj).invoke();
                return s3q0.a;
            case 18:
                gzs<s3q0> gzsVar = (gzs) obj;
                HorizontalRecyclerPaginationView a2 = ((znj0) obj2).h().a();
                if (a2 != null) {
                    a2.setOnReloadRetryClickListener(gzsVar);
                }
                return s3q0.a;
            case 19:
                e1w e1wVar = (e1w) obj2;
                q5o0 q5o0Var = (q5o0) obj;
                boolean e = ndp0.e();
                if (e) {
                    ndp0.b("TaskExecutor " + e1wVar.getClass().getCanonicalName() + " on " + sv1.o(e1wVar));
                }
                try {
                    return q5o0Var.b(q5o0Var.a, e1wVar);
                } finally {
                    if (e) {
                        Trace.endSection();
                    }
                }
            case 20:
                mhy.a(((rhq0) obj2).a, "@" + ((ExtendedUserProfile) obj).A0);
                cvk.u(R.string.user_profile_short_name_copied, false);
                return s3q0.a;
            case 21:
                ((VideoItemAutoPlayVh) obj2).h((View) obj);
                return s3q0.a;
            case 22:
                ((izs) obj2).invoke(new omt0.e((BlockId) obj));
                return s3q0.a;
            case 23:
                ((vtu) obj2).a(0);
                ((b78) obj).a().invoke(new sx40.t(PlayerContext.MINI, null));
                return s3q0.a;
            case 24:
                ((izs) obj2).invoke((buv0) obj);
                return s3q0.a;
            case 25:
                JSONObject jSONObject = (JSONObject) obj;
                jbs jbsVar = new jbs(((dwv0) obj2).e);
                o0r0 e2 = xwk.e();
                boolean optBoolean = jSONObject.optBoolean("multi");
                JSONArray optJSONArray = jSONObject.optJSONArray("ids");
                Iterable L = optJSONArray != null ? f370.L(optJSONArray) : EmptyList.b;
                ArrayList arrayList2 = new ArrayList(c5g.u(L, 10));
                Iterator it = L.iterator();
                while (it.hasNext()) {
                    dq.h(((Number) it.next()).longValue(), arrayList2);
                }
                o0r0.h(e2, jbsVar, optBoolean, false, Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE, null, null, null, null, null, arrayList2, null, MobileOfficialAppsCoreNavStat$EventScreen.FRIENDS_SELECTION, null, 243672);
                return s3q0.a;
            case 26:
                oyw0 oyw0Var = (oyw0) obj;
                ?? r0 = MobileOfficialAppsCallsStat$TypeVoipCallItem.SharingChannel.EMAIL;
                ((Ref$ObjectRef) obj2).element = r0;
                oyw0Var.f.invoke(oyw0Var.b, r0);
                Context context2 = oyw0Var.a;
                Intent a3 = oyw0.a(context2, oyw0Var.c);
                List<ResolveInfo> queryIntentActivities = context2.getPackageManager().queryIntentActivities(a3, 0);
                ArrayList arrayList3 = new ArrayList();
                for (ResolveInfo resolveInfo : queryIntentActivities) {
                    String str2 = resolveInfo.activityInfo.packageName;
                    if (!rl3.G(new String[]{"com.google.android.gm", "com.my.mail", "ru.yandex.mail", "com.vk.mail", "ru.mail.mailapp", "com.microsoft.office.outlook"}, str2)) {
                        arrayList3.add(new ComponentName(str2, resolveInfo.activityInfo.name));
                    }
                }
                if (arrayList3.size() == queryIntentActivities.size()) {
                    cvk.w("No apps to share!", false);
                } else {
                    Intent createChooser = Intent.createChooser(a3, null);
                    createChooser.putExtra("android.intent.extra.EXCLUDE_COMPONENTS", (Parcelable[]) arrayList3.toArray(new ComponentName[0]));
                    s3q0 s3q0Var2 = s3q0.a;
                    context2.startActivity(createChooser);
                }
                return s3q0.a;
            default:
                izs izsVar = (izs) obj;
                String str3 = ((pox0.f.b.a) obj2).b;
                if (str3 != null) {
                    izsVar.invoke(str3);
                }
                return s3q0.a;
        }
    }
}
