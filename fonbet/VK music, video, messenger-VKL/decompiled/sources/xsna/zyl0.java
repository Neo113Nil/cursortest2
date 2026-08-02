package xsna;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoUploadVh;
import com.vk.catalog2.common.ui.mvp.holder.video.playlist.VideoPlaylistToolbarVh;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vk.core.view.links.LinkedTextView;
import com.vk.core.voip.VoipCallSource;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.data.VKList;
import com.vk.dto.group.Group;
import com.vk.dto.hints.Hint;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.video.VideoAlbum;
import com.vk.im.ui.components.contact.vc.UserProfileView;
import com.vk.libvideo.ui.VideoAuthorView;
import com.vk.mediastore.system.MediaStoreVideoEntry;
import com.vk.newsfeed.impl.fragments.video.tree.VideoCommentsTreeInPlayerFragment;
import com.vk.profile.core.tabs.ui.clips.Clips;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stories.StorySettingsActivity;
import com.vk.superapp.api.dto.app.WebSubscriptionInfo;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.edit.fragments.VideoAlbumEditorFragment;
import com.vk.voip.ui.hint.a;
import com.vk.voip.ui.history.friends.ui.b;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import ru.ok.android.externcalls.sdk.dev.MediaDumpManager;
import xsna.cvd0;
import xsna.ejm0;
import xsna.h7u0;
import xsna.it80;
import xsna.izw0;
import xsna.mmo0;
import xsna.mot0;
import xsna.nak;
import xsna.nrw0;
import xsna.r4n0;
import xsna.tj50;
import xsna.tlw0;
import xsna.whg;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class zyl0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zyl0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v17, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v25, types: [java.util.ArrayList] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Uri uri;
        Map<String, String> map;
        boolean z;
        ?? r6;
        int i = this.b;
        int i2 = 1;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                azl0 azl0Var = (azl0) obj2;
                azl0Var.h.i(azl0Var);
                return s3q0.a;
            case 1:
                com.vk.storycamera.picker.feature.c cVar = (com.vk.storycamera.picker.feature.c) obj2;
                Intent intent = (Intent) obj;
                if (intent == null) {
                    return s3q0.a;
                }
                Bundle bundleExtra = intent.getBundleExtra("result_attachments");
                if (bundleExtra == null) {
                    return s3q0.a;
                }
                ArrayList parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? bundleExtra.getParcelableArrayList("result_files", Uri.class) : bundleExtra.getParcelableArrayList("result_files");
                if (parcelableArrayList == null || (uri = (Uri) j5g.a0(parcelableArrayList)) == null) {
                    return s3q0.a;
                }
                Bundle c = com.vk.storycamera.picker.feature.c.c(Collections.singletonList(new MediaStoreVideoEntry(0, uri, System.currentTimeMillis(), 0, 0, System.currentTimeMillis(), 0L, 0L)));
                Intent intent2 = new Intent();
                intent2.putExtra("result_attachments", c);
                cVar.b(intent2);
                return s3q0.a;
            case 2:
                Drawable drawable = (Drawable) obj2;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                drawable.setAlpha(booleanValue ? 255 : 128);
                drawable.setTint(e43.a.getColor(booleanValue ? R.color.vk_azure_300 : R.color.vk_steel_gray_300));
                return s3q0.a;
            case 3:
                StorySettingsActivity storySettingsActivity = (StorySettingsActivity) obj2;
                storySettingsActivity.v.getClass();
                LinkedHashSet<String> linkedHashSet = dam0.d;
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayList) obj).iterator();
                while (it.hasNext()) {
                    Iterator<PrivacySetting> it2 = ((ked0) it.next()).b.iterator();
                    while (it2.hasNext()) {
                        PrivacySetting next = it2.next();
                        if (linkedHashSet.contains(next.b)) {
                            arrayList.add(storySettingsActivity.Y1(next));
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    return io.reactivex.rxjava3.core.a.m(arrayList);
                }
                VkGroupHeader vkGroupHeader = storySettingsActivity.E;
                (vkGroupHeader != null ? vkGroupHeader : null).setVisibility(8);
                return io.reactivex.rxjava3.internal.operators.completable.i.b;
            case 4:
                rjm0 rjm0Var = (rjm0) obj2;
                h7v h7vVar = rjm0Var.b;
                if (!((Boolean) obj).booleanValue()) {
                    it80.b.getClass();
                    return it80.a.a();
                }
                String str = rjm0Var.c;
                if (!h7vVar.a(str)) {
                    it80.b.getClass();
                    return it80.a.a();
                }
                Hint p = h7vVar.p(str);
                if (p == null || (map = p.e) == null) {
                    it80.b.getClass();
                    return it80.a.a();
                }
                String str2 = map.get("memories_banner_title");
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = map.get("memories_banner_subtitle");
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = map.get("memories_banner_button");
                if (str4 == null) {
                    str4 = "";
                }
                String str5 = map.get("memories_banner_image");
                ejm0.b bVar = new ejm0.b(str2, str3, str4, str5 != null ? str5 : "");
                it80.b.getClass();
                return new it80(bVar);
            case 5:
                long j = ((gzm0) obj2).d.o;
                WebSubscriptionInfo webSubscriptionInfo = ((nak.a) obj).b;
                vdx0 vdx0Var = e370.e;
                zen0 d = (vdx0Var != null ? vdx0Var : null).d();
                int i3 = webSubscriptionInfo.b;
                String str6 = webSubscriptionInfo.l;
                return d.a(i3, str6 == null ? "" : str6, null, j);
            case 6:
                o3n0 o3n0Var = (o3n0) obj2;
                Post q6 = o3n0Var.q6();
                if (q6 != null) {
                    t6g0 t6g0Var = t6g0.b;
                    Group C0 = t6g0.b().C0(fkq0.e(q6.m));
                    if (C0 != null) {
                        o3n0Var.C.r(o3n0Var.itemView.getContext(), q6, C0);
                    }
                }
                return s3q0.a;
            case 7:
                r4n0.b bVar2 = (r4n0.b) obj2;
                r4n0.b.a(bVar2, new p1d0(r4n0.this, 20));
                return s3q0.a;
            case 8:
                mmo0 mmo0Var = (mmo0) obj2;
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                mmo0.a aVar = mmo0Var.B;
                if (aVar == null) {
                    z = false;
                } else {
                    aVar.c = booleanValue2;
                    itl.f(mmo0Var).R();
                    itl.f(mmo0Var).Q();
                    mio.a(mmo0Var);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 9:
                niq0 niq0Var = (niq0) obj2;
                io.reactivex.rxjava3.internal.operators.observable.b0 o = niq0Var.f.o(true);
                ow40 ow40Var = new ow40(new eci0(7, (List) obj, niq0Var), 23);
                a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                return o.E(ow40Var, lVar, kVar, kVar).m0().h(new pw40(new ap30(niq0Var, 25), 13));
            case 10:
                Clips clips = (Clips) obj2;
                VKList vKList = (VKList) obj;
                cvd0.f fVar = clips.j;
                if (fVar != null) {
                    ArrayList arrayList2 = fVar.a;
                    r6 = new ArrayList();
                    for (Object obj3 : arrayList2) {
                        if (!epx.f(((VideoFile) obj3).getType(), "short_video")) {
                            r6.add(obj3);
                        }
                    }
                } else {
                    r6 = EmptyList.b;
                }
                return Clips.i(clips, new cvd0.f(j5g.u0(vKList, (Collection) r6)), null, null, null, myc0.f(vKList.j()) && !vKList.isEmpty(), false, vKList.j(), null, null, null, null, null, false, 524206);
            case 11:
                int i4 = UserProfileView.N;
                ((UserProfileView) obj2).getClass();
                return s3q0.a;
            case 12:
                nvr0 nvr0Var = (nvr0) obj2;
                mkr0 mkr0Var = nvr0Var.m;
                uwm0 uwm0Var = nvr0Var.n;
                mkr0Var.B((uwm0Var != null ? uwm0Var : null).b, false);
                return s3q0.a;
            case 13:
                int i5 = VideoAlbumEditorFragment.l0;
                new w0s0(((ww50) obj).b).a((VideoAlbum) obj2);
                return s3q0.a;
            case 14:
                ((VideoAuthorView) obj2).e.invoke(VideoAuthorView.Action.OpenDonut);
                return s3q0.a;
            case 15:
                w3s0 w3s0Var = (w3s0) obj2;
                w3s0Var.B0 = null;
                LinkedTextView linkedTextView = w3s0Var.y0;
                linkedTextView.setText((CharSequence) obj);
                linkedTextView.setVisibility(0);
                return s3q0.a;
            case 16:
                VideoCommentsTreeInPlayerFragment videoCommentsTreeInPlayerFragment = (VideoCommentsTreeInPlayerFragment) obj2;
                v5t0 v5t0Var = videoCommentsTreeInPlayerFragment.O;
                if (v5t0Var != null) {
                    v5t0Var.S1(videoCommentsTreeInPlayerFragment.getArguments());
                }
                return s3q0.a;
            case 17:
                int intValue = ((Integer) obj).intValue();
                kfs0 kfs0Var = ((VideoMinimizableDiscoveryFragment) obj2).G0;
                if (kfs0Var != null) {
                    return kfs0Var.h.f.get(intValue);
                }
                return null;
            case 18:
                Context context = (Context) obj;
                VideoAlbum videoAlbum = ((VideoPlaylistToolbarVh) obj2).o;
                VideoAlbum videoAlbum2 = videoAlbum != null ? videoAlbum : null;
                mot0.b(mot0.a.a, context, videoAlbum2.c, videoAlbum2.b, null, 24);
                return s3q0.a;
            case 19:
                qcy<Object>[] qcyVarArr = VideoUploadVh.w;
                ((VideoUploadVh) obj2).g();
                return s3q0.a;
            case 20:
                ggu0 ggu0Var = (ggu0) obj2;
                ggu0Var.z = true;
                ggu0Var.y();
                return s3q0.a;
            case 21:
                Throwable th = (Throwable) obj;
                r6y r6yVar = ((jwv0) obj2).b;
                if (r6yVar != null) {
                    r6yVar.z(JsApiMethodType.GET_PHONE_NUMBER, th);
                }
                return s3q0.a;
            case 22:
                wyv0 wyv0Var = (wyv0) obj2;
                Throwable th2 = (Throwable) obj;
                VKApiExecutionException vKApiExecutionException = th2 instanceof VKApiExecutionException ? (VKApiExecutionException) th2 : null;
                if (vKApiExecutionException == null || vKApiExecutionException.s() != 8201) {
                    com.vk.superapp.verification.account.d dVar = wyv0Var.e;
                    if (dVar != null) {
                        dVar.Gn();
                    }
                    r55 r55Var = r55.a;
                    wyv0Var.i(wbu0.a(r55.a(), th2, true));
                } else {
                    com.vk.superapp.verification.account.d dVar2 = wyv0Var.e;
                    if (dVar2 != null) {
                        dVar2.Hn();
                    }
                }
                return s3q0.a;
            case 23:
                ((i330) ((bpn0) ((e41) obj2).d).getValue()).b((ycw0) obj);
                return s3q0.a;
            case 24:
                com.vk.voip.ui.hint.a aVar2 = (com.vk.voip.ui.hint.a) obj2;
                whr0 whr0Var = (whr0) ((it80) obj).a;
                if (whr0Var == null) {
                    return s3q0.a;
                }
                int i6 = whr0Var.c ? R.string.voip_hint_started_screen_share_f : R.string.voip_hint_started_screen_share;
                String str7 = whr0Var.q;
                if (str7 == null) {
                    str7 = whr0Var.e();
                }
                aVar2.l(aVar2.a.getContext().getString(i6, rte0.r(str7)), null, a.EnumC2056a.ScreenShareStarted, 3000L);
                return s3q0.a;
            case 25:
                ((zhw0) obj2).k.b(new whg.q((t49) obj, false, new VoipCallSource(MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.CALLS_SERVICES, MobileOfficialAppsCoreNavStat$EventScreen.CALLS)));
                return s3q0.a;
            case 26:
                int i7 = ylw0.x1;
                xn50.a.c((ylw0) obj2, new tlw0.a.b((String) obj));
                return s3q0.a;
            case 27:
                return new b.a(((tj50.a) obj).a(new upw0(1, ((vpw0) obj2).d, ppw0.class, "toViewState", "toViewState(Lcom/vk/voip/ui/history/friends/feature/VoipHistoryFriendsState$Content;)Lcom/vk/voip/ui/history/friends/ui/VoipHistoryFriendsViewState$FriendsList;", 0), ao8.d));
            case 28:
                Context context2 = ((View) obj).getContext();
                List l = e43.l(MediaDumpManager.Source.IN_ENTER_PROCESSING, MediaDumpManager.Source.OUT_ENTER_PROCESSING);
                int i8 = h7u0.p;
                h7u0.a c2 = h7u0.b.c(context2);
                c2.R(new nrw0.f(context2, l), new tff(i2, (nrw0) obj2, l));
                c2.g0(R.string.voip_dump_dialog_title);
                c2.c = true;
                c2.m();
                return Boolean.TRUE;
            default:
                com.vk.voip.ui.watchmovie.selectsource.tabs.fragments.a aVar3 = (com.vk.voip.ui.watchmovie.selectsource.tabs.fragments.a) obj2;
                int i9 = com.vk.voip.ui.watchmovie.selectsource.tabs.fragments.a.l1;
                if (!((izw0) obj).equals(izw0.a.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar3.hide();
                aVar3.getParentFragmentManager().k0(new Bundle(), "PLAYLIST_VIDEO_SELECTED");
                return s3q0.a;
        }
    }
}
