package xsna;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.view.ViewGroup;
import android.widget.Toast;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.core.view.components.picture.VkPicture;
import com.vk.core.view.components.picture.c;
import com.vk.dto.common.AvatarSize;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.newsfeed.impl.presentation.search.presentation.fragment.NewsfeedSearchFragment;
import com.vk.newsfeed.posting.geo_picker.presentation.PlacePickerState;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.dto.VkOnboardingType;
import com.vk.profile.core.tabs.ui.clips.Clips;
import com.vk.pushes.receivers.c;
import com.vk.reefton.Reef;
import com.vk.reefton.literx.completable.CompletableDoOnError;
import com.vk.reefton.literx.completable.CompletableOnErrorComplete;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stickers.settings.b;
import com.vk.story.api.domain.preload.StoryVideoMemoryCache;
import com.vk.video.polls.entrypoint.model.UxPollEntryPoint;
import com.vk.voip.ui.asr.ui.list.PastAsrListFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.VKApplication;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.CoroutineStart;
import xsna.cvd0;
import xsna.dra0;
import xsna.e8v0;
import xsna.g9v0;
import xsna.q8a0;
import xsna.r1k0;
import xsna.ub1;
import xsna.wlp0;
import xsna.y1i0;
import xsna.y5j;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class lx60 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ lx60(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v105, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v78, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v32, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v35, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v17, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.util.ArrayList] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object c3590a;
        String str;
        Iterable iterable;
        ?? r5;
        float h;
        int i = 4;
        String str2 = null;
        switch (this.b) {
            case 0:
                final NewsfeedSearchFragment newsfeedSearchFragment = (NewsfeedSearchFragment) this.c;
                js60 js60Var = (js60) this.d;
                com.vk.mvi.binder.c cVar = (com.vk.mvi.binder.c) obj;
                qcy<Object>[] qcyVarArr = NewsfeedSearchFragment.p0;
                com.vk.mvi.binder.c.a(cVar, f9t.w(newsfeedSearchFragment.ho()), new iyp() { // from class: xsna.kx60
                    @Override // xsna.iyp
                    public final void a(pk50 pk50Var) {
                        qcy<Object>[] qcyVarArr2 = NewsfeedSearchFragment.p0;
                        NewsfeedSearchFragment newsfeedSearchFragment2 = NewsfeedSearchFragment.this;
                        newsfeedSearchFragment2.fo();
                        ex60.a(newsfeedSearchFragment2.fo(), newsfeedSearchFragment2, newsfeedSearchFragment2.getActivity(), newsfeedSearchFragment2.d0, (sx60) pk50Var);
                    }
                });
                com.vk.mvi.binder.c.b(cVar, f9t.F(f9t.z(newsfeedSearchFragment.ho()), new ehu(js60Var)), new q9(newsfeedSearchFragment, 24));
                return s3q0.a;
            case 1:
                Context context = (Context) this.c;
                Intent intent = (Intent) this.d;
                c.a aVar = com.vk.pushes.receivers.c.b;
                c.a.f(context, intent, false);
                return s3q0.a;
            case 2:
                List list = (List) this.c;
                ((nvy) obj).e(list.size(), new ze70(new oi40(5), list), new af70(new uuz(11), list), new jai(802480018, new bf70(list, list, (izs) this.d), true));
                return s3q0.a;
            case 3:
                PastAsrListFragment pastAsrListFragment = (PastAsrListFragment) this.c;
                PastAsrListFragment.b bVar = (PastAsrListFragment.b) this.d;
                qn90 qn90Var = (qn90) obj;
                pastAsrListFragment.R.setItems(qn90Var.a);
                bVar.a.setRefreshing(qn90Var.b);
                return s3q0.a;
            case 4:
                t8a0 t8a0Var = (t8a0) this.c;
                PhotoAlbum photoAlbum = (PhotoAlbum) this.d;
                return t8a0Var.f.a(photoAlbum) ? new q8a0.a.C3553a(photoAlbum, !photoAlbum.w, (String) obj) : new q8a0.a.b(photoAlbum, !photoAlbum.w);
            case 5:
                dra0 dra0Var = (dra0) this.c;
                PlacePickerState placePickerState = (PlacePickerState) this.d;
                xqa0 xqa0Var = dra0Var.b;
                String str3 = placePickerState.e;
                Location location = ((dra0.c) obj).a;
                return xqa0Var.b(str3, location, dra0Var.d, 0).l(new he40(new ihb(dra0Var, str3, location, 8), i));
            case 6:
                String str4 = (String) this.c;
                String str5 = (String) this.d;
                hyg0 hyg0Var = (hyg0) obj;
                qyg0 V0 = hyg0Var.V0("DELETE FROM podcast WHERE uid = ? AND owner_id = ?");
                try {
                    V0.D3(1, str4);
                    V0.D3(2, str5);
                    V0.step();
                    int p = sv1.p(hyg0Var);
                    V0.close();
                    return Integer.valueOf(p);
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            case 7:
                return new g920((ViewGroup) obj, (UxPollEntryPoint) this.c, (n8) this.d);
            case 8:
                yid0 yid0Var = (yid0) this.c;
                r19 r19Var = (r19) this.d;
                j2y0 j2y0Var = (j2y0) yid0Var.a.a.p0.getValue();
                Context context2 = r19Var.f;
                cxo cxoVar = yid0Var.a;
                long j = yid0Var.c;
                UserId userId = yid0Var.d;
                CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = yid0Var.b;
                j2y0Var.getClass();
                j2y0.a("", new i2y0((UserId) obj, context2, cxoVar, j, userId, commonMarketStat$TypeRefSource), context2.getString(R.string.market_chat_greetings));
                return s3q0.a;
            case 9:
                Iterator<f360> it = ((r9e0) this.c).d.iterator();
                while (it.hasNext()) {
                    it.next().getClass();
                }
                return s3q0.a;
            case 10:
                vof0 vof0Var = (vof0) this.c;
                Reef reef = (Reef) this.d;
                com.vk.reefton.trackers.l lVar = (com.vk.reefton.trackers.l) obj;
                try {
                    return new CompletableOnErrorComplete(new CompletableDoOnError(lVar.b(vof0Var), new jp5(21, reef, lVar)));
                } catch (Throwable unused) {
                    aof0 b = reef.d.b();
                    lVar.getClass();
                    b.b();
                    return new m7i();
                }
            case 11:
                y1i0.b bVar2 = (y1i0.b) this.c;
                y1i0.a aVar2 = (y1i0.a) this.d;
                VkPicture vkPicture = (VkPicture) obj;
                VkPicture vkPicture2 = bVar2.a;
                ImageSize imageSize = (ImageSize) ixj0.c(aVar2.a.b, vkPicture.getWidth(), vkPicture.getHeight());
                String str6 = imageSize != null ? imageSize.d.d : null;
                vkPicture2.setContent(new c.d(str6 != null ? str6 : "", null));
                return s3q0.a;
            case 12:
                ((k6l0) this.c).l.a.c.invoke(new b.m(((l6l0) this.d).c, !r2.d));
                return s3q0.a;
            case 13:
                StoryVideoMemoryCache storyVideoMemoryCache = (StoryVideoMemoryCache) this.c;
                x8m0 x8m0Var = (x8m0) this.d;
                sht0 sht0Var = (sht0) obj;
                if (storyVideoMemoryCache == StoryVideoMemoryCache.ONLY_DISK) {
                    x8m0Var.e.remove(sht0Var);
                    x8m0Var.d();
                }
                return s3q0.a;
            case 14:
                i8p0 i8p0Var = (i8p0) this.c;
                yps0 yps0Var = (yps0) this.d;
                wbg wbgVar = (wbg) ((Optional) obj).orElse(null);
                boolean z = yps0Var.e;
                int i2 = yps0Var.f;
                UserId userId2 = yps0Var.b;
                Owner owner = yps0Var.g;
                String str7 = yps0Var.h;
                b25 b25Var = i8p0Var.a;
                if (wbgVar != null) {
                    String str8 = wbgVar.a;
                    if (str8.length() > 0) {
                        c3590a = new r1k0.a.AbstractC3589a.b(wbgVar.b, str8, i2);
                        return Optional.ofNullable(c3590a);
                    }
                }
                if (!b25Var.b()) {
                    c3590a = new r1k0.a.AbstractC3589a.C3590a(null, i2);
                } else if (z) {
                    if ((BuildInfo.s() && ((Boolean) i8p0Var.d.getValue()).booleanValue() && fkq0.b(userId2) && owner != null && epx.f(owner.b, userId2)) ? owner.i(2) : false) {
                        if (owner == null || (str = owner.d) == null) {
                            str = owner != null ? owner.e : null;
                        }
                        String a = js5.a(AvatarSize.PHOTO_BASE.k(), str);
                        if (a != null) {
                            str7 = a;
                        }
                        if (str7 == null || str7.length() <= 0) {
                            str7 = null;
                        }
                    } else {
                        str7 = b25Var.o().c;
                    }
                    if (str7 != null) {
                        if (str7.length() > 0) {
                            str2 = str7;
                        }
                    }
                    c3590a = new r1k0.a.AbstractC3589a.C3590a(str2, i2);
                } else {
                    String str9 = b25Var.o().c;
                    if (str9 != null) {
                        if (str9.length() > 0) {
                            str2 = str9;
                        }
                    }
                    c3590a = new r1k0.a.AbstractC3589a.C3590a(str2, i2);
                }
                return Optional.ofNullable(c3590a);
            case 15:
                myc0.h((yvj) this.c, null, CoroutineStart.UNDISPATCHED, new wlp0.e((wlp0) this.d, null), 1);
                return new wlp0.f();
            case 16:
                ymq0 ymq0Var = (ymq0) this.c;
                Clips clips = (Clips) this.d;
                int i3 = dnq0.a;
                VideoFileOld c = dnq0.c((gud) obj, ymq0Var.c.a());
                Collection singletonList = c != null ? Collections.singletonList(c) : EmptyList.b;
                cvd0.f fVar = clips.j;
                if (fVar != null) {
                    ArrayList arrayList = fVar.a;
                    iterable = new ArrayList();
                    for (Object obj2 : arrayList) {
                        if (epx.f(((VideoFile) obj2).getType(), "tab_collection_scheduled_dummy")) {
                            iterable.add(obj2);
                        }
                    }
                } else {
                    iterable = EmptyList.b;
                }
                cvd0.f fVar2 = clips.j;
                if (fVar2 != null) {
                    ArrayList arrayList2 = fVar2.a;
                    r5 = new ArrayList();
                    for (Object obj3 : arrayList2) {
                        if (epx.f(((VideoFile) obj3).getType(), "short_video")) {
                            r5.add(obj3);
                        }
                    }
                } else {
                    r5 = EmptyList.b;
                }
                return Clips.i(clips, new cvd0.f(j5g.u0((Iterable) r5, j5g.u0(iterable, singletonList))), null, null, null, false, false, null, null, null, null, null, null, false, 524286);
            case 17:
                ((q7v0) ((mxq0) this.c).u.getValue()).a((VkOnboardingCampaign) this.d, VkOnboardingType.Tooltip, ((Boolean) obj).booleanValue() ? e8v0.i.b : e8v0.g.b);
                return s3q0.a;
            case 18:
                idt0 idt0Var = (idt0) this.c;
                yg5 yg5Var = (yg5) this.d;
                ub1.a aVar3 = (ub1.a) obj;
                ArrayList arrayList3 = aVar3.a;
                long j2 = aVar3.b;
                if (j2 != 0) {
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        int intValue = ((Number) it2.next()).intValue();
                        idt0Var.e.put(Integer.valueOf(intValue), Long.valueOf(j2));
                        idt0Var.f.add(Integer.valueOf(intValue));
                        Preference.F(j2, "VideoRestrictionManager", "VideoRestrictionManager.disableRestrictionUntilTime" + intValue);
                    }
                    yg5Var.E();
                    Map<String, yg5> c2 = ((com.vk.libvideo.autoplay.b) idt0Var.b.invoke()).c();
                    if (c2 != null) {
                        Iterator<Map.Entry<String, yg5>> it3 = c2.entrySet().iterator();
                        while (it3.hasNext()) {
                            it3.next().getValue().R();
                        }
                    }
                    wjs0.a(ayr0.a);
                }
                return s3q0.a;
            case 19:
                Pair pair = (Pair) this.c;
                VkTooltip$BalloonTilt vkTooltip$BalloonTilt = (VkTooltip$BalloonTilt) this.d;
                i6j i6jVar = (i6j) obj;
                float f = ((pco) pair.d()).b;
                float f2 = ((pco) pair.g()).b;
                s5j s5jVar = new s5j("anchor");
                s5j s5jVar2 = new s5j("balloon");
                int i4 = g9v0.a.$EnumSwitchMapping$3[vkTooltip$BalloonTilt.ordinal()];
                if (i4 == 1) {
                    h = e06.Far.h();
                } else {
                    if (i4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h = e06.Near.h();
                }
                y5j.b e = i6jVar.e(f / 2);
                y5j.a d = i6jVar.d(f2 - h);
                i6jVar.c(s5jVar, new gxj0(10));
                i6jVar.c(s5jVar2, new v0s0(i, e, d));
                return s3q0.a;
            default:
                Context context3 = (Context) this.c;
                WebApiApplication webApiApplication = (WebApiApplication) this.d;
                if (BuildInfo.h()) {
                    VKApplication vKApplication = com.vk.core.apps.a.a;
                    Toast.makeText(context3, context3.getResources().getString(R.string.vk_apps_loading_error, webApiApplication.c), 0).show();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ lx60(r9e0 r9e0Var, okhttp3.d dVar, okhttp3.p pVar) {
        this.b = 9;
        this.c = r9e0Var;
        this.d = dVar;
    }
}
