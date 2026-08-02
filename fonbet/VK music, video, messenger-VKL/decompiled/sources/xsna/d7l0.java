package xsna;

import android.content.Context;
import android.graphics.Typeface;
import android.location.Location;
import android.view.ViewGroup;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.vk.clips.sdk.models.SdkImages;
import com.vk.clips.sdk.models.SdkOwner;
import com.vk.clips.sdk.models.ads.SdkAdsChoices;
import com.vk.clips.sdk.models.ads.SdkAdsChoicesOptions;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoAdInfo;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoAdsType;
import com.vk.clips.viewer.impl.adapters.VideoFileAdapter;
import com.vk.dto.common.AdsChoices;
import com.vk.dto.common.AdsChoicesOptions;
import com.vk.dto.common.Image;
import com.vk.dto.common.VideoAdInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.video.VideoNotificationsStatus;
import com.vk.libvideo.RangeCollection;
import com.vk.libvideo.storage.CachedVideoViewedSegments;
import com.vk.log.L;
import com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem;
import com.vk.superapp.ui.SuperAppFragment;
import com.vk.typography.Font;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vk.video.ui.discovery.minimizable.fullscreen_lock.FullscreenLockState;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import com.vk.voip.ui.calls.presentation.base.fragment.VoipCallServiceFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.webrtc.media_options.MediaOptionState;
import ru.ok.android.webrtc.media_options.MediaOptions;
import xsna.f9k0;
import xsna.fys;
import xsna.irt0;
import xsna.ivw0;
import xsna.sx40;
import xsna.z1x0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class d7l0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ d7l0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        JSONArray jSONArray;
        SdkVideoAdsType sdkVideoAdsType;
        SdkAdsChoices sdkAdsChoices;
        Object cVar;
        switch (this.b) {
            case 0:
                return new mki0((ViewGroup) obj);
            case 1:
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("response");
                if (optJSONObject == null || (jSONArray = optJSONObject.getJSONArray("items")) == null) {
                    return EmptyList.b;
                }
                ArrayList arrayList = new ArrayList(jSONArray.length());
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    arrayList.add(new UserId(jSONArray.getLong(i)));
                }
                return arrayList;
            case 2:
                o0m0 o0m0Var = o0m0.b;
                return -1;
            case 3:
                return ((io.reactivex.rxjava3.core.q) obj).L(new q9f0(new nl30(asu0.a.d(), 22), 1), false);
            case 4:
                b420 b420Var = (b420) obj;
                StringBuilder sb = new StringBuilder("@");
                Pattern pattern = n420.a;
                String str = b420Var.e;
                if (pattern.matcher(str).matches()) {
                    str = b420Var.b;
                }
                sb.append(str);
                return sb.toString();
            case 5:
                Typeface a = cqi.a(Font.Companion, FontFamily.MEDIUM, 13.0f, (Context) obj);
                TextSizeUnit textSizeUnit = TextSizeUnit.SP;
                return a;
            case 6:
                int i2 = SuperAppFragment.o0;
                qgi0.r((tgi0) obj, "SuperAppHeaderContentInfoIcon");
                return s3q0.a;
            case 7:
                return Boolean.valueOf(((sx40) obj) instanceof sx40.r0);
            case 8:
                List c0 = drm0.c0((String) obj, new String[]{DomExceptionUtils.SEPARATOR}, 0, 6);
                if (c0.size() != 2 || drm0.N((CharSequence) c0.get(0))) {
                    c0 = null;
                }
                if (c0 != null) {
                    return (String) c0.get(0);
                }
                return null;
            case 9:
                return Boolean.valueOf(((UserProfileAdapterItem) obj) instanceof UserProfileAdapterItem.b);
            case 10:
                return PublishState.a((PublishState) obj, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, false, null, null, false, false, null, false, false, f9k0.a.a, false, false, false, false, -1, 2015);
            case 11:
                VideoAdInfo videoAdInfo = (VideoAdInfo) obj;
                qcy<Object>[] qcyVarArr = VideoFileAdapter.l;
                if (videoAdInfo == null) {
                    return null;
                }
                String str2 = videoAdInfo.b;
                String str3 = videoAdInfo.c;
                String str4 = videoAdInfo.d;
                UserId userId = videoAdInfo.e;
                Owner owner = videoAdInfo.f;
                SdkOwner a2 = owner != null ? o490.a(owner) : null;
                String str5 = videoAdInfo.g;
                switch (p0s0.$EnumSwitchMapping$0[videoAdInfo.h.ordinal()]) {
                    case 1:
                        sdkVideoAdsType = SdkVideoAdsType.VK_SHORT_VIDEO;
                        break;
                    case 2:
                        sdkVideoAdsType = SdkVideoAdsType.MAIL_SHORT_VIDEO;
                        break;
                    case 3:
                        sdkVideoAdsType = SdkVideoAdsType.MAIL_SHORT_VIDEO_KNOWN_OWNER;
                        break;
                    case 4:
                        sdkVideoAdsType = SdkVideoAdsType.MAIL_PROMOTED_SHORT_VIDEO;
                        break;
                    case 5:
                        sdkVideoAdsType = SdkVideoAdsType.MY_TARGET_VIDEO;
                        break;
                    case 6:
                        sdkVideoAdsType = SdkVideoAdsType.UNKNOWN;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                SdkVideoAdsType sdkVideoAdsType2 = sdkVideoAdsType;
                boolean z = videoAdInfo.i;
                String str6 = videoAdInfo.j;
                String str7 = videoAdInfo.k;
                String str8 = videoAdInfo.l;
                Image image = videoAdInfo.m;
                SdkImages C = image != null ? fz5.C(image) : null;
                AdsChoices adsChoices = videoAdInfo.n;
                if (adsChoices != null) {
                    List<AdsChoicesOptions> list = adsChoices.f;
                    ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
                    for (Iterator it = list.iterator(); it.hasNext(); it = it) {
                        AdsChoicesOptions adsChoicesOptions = (AdsChoicesOptions) it.next();
                        arrayList2.add(new SdkAdsChoicesOptions(adsChoicesOptions.b, adsChoicesOptions.c, adsChoicesOptions.d, adsChoicesOptions.e, adsChoicesOptions.f, adsChoicesOptions.g, adsChoicesOptions.h));
                    }
                    sdkAdsChoices = new SdkAdsChoices(adsChoices.b, adsChoices.c, adsChoices.d, adsChoices.e, arrayList2);
                } else {
                    sdkAdsChoices = null;
                }
                return new SdkVideoAdInfo(str2, str3, str4, userId, a2, str5, sdkVideoAdsType2, z, str6, str7, str8, C, sdkAdsChoices);
            case 12:
                FullscreenLockState fullscreenLockState = (FullscreenLockState) obj;
                if (fullscreenLockState.equals(FullscreenLockState.AnimatingToUnlock.b)) {
                    return fys.a.a;
                }
                if (fullscreenLockState instanceof FullscreenLockState.Locked) {
                    FullscreenLockState.Locked locked = (FullscreenLockState.Locked) fullscreenLockState;
                    cVar = new fys.b(locked.c, locked.d, locked.b.c);
                } else {
                    if (fullscreenLockState.equals(FullscreenLockState.Unlocked.b)) {
                        return fys.d.a;
                    }
                    if (!(fullscreenLockState instanceof FullscreenLockState.TemporarilyUnlocked)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    FullscreenLockState.TemporarilyUnlocked temporarilyUnlocked = (FullscreenLockState.TemporarilyUnlocked) fullscreenLockState;
                    if (!temporarilyUnlocked.c) {
                        return fys.d.a;
                    }
                    cVar = new fys.c(temporarilyUnlocked.b.c);
                }
                return cVar;
            case 13:
                return (VideoNotificationsStatus) ((Pair) obj).g();
            case 14:
                List<CachedVideoViewedSegments> list2 = ((irt0.a) obj).a;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : list2) {
                    RangeCollection rangeCollection = ((CachedVideoViewedSegments) obj2).e;
                    if (rangeCollection.b != null || !rangeCollection.d.isEmpty() || !rangeCollection.c.isEmpty()) {
                        arrayList3.add(obj2);
                    }
                }
                return arrayList3;
            case 15:
                return s3q0.a;
            case 16:
                n730 n730Var = (n730) obj;
                return Boolean.valueOf(!epx.f(n730Var, z7x0.a) && (n730Var instanceof fux0));
            case 17:
                return nfv0.e((Location) obj);
            case 18:
                return Boolean.valueOf(((MediaOptions) obj).getVideoState() != MediaOptionState.MUTED_PERMANENT);
            case 19:
                ((ivw0.a.C3084a) obj).getClass();
                return Boolean.TRUE;
            case 20:
                int i3 = VoipCallServiceFragment.Y;
                return ((pno0) obj).d().toString();
            case 21:
                int i4 = wmw0.i1;
                L.C("VoipConfirmAddUsersToCallModalDialog", (Throwable) obj);
                return s3q0.a;
            case 22:
                return ((z1x0.a) obj).c;
            default:
                return s3q0.a;
        }
    }

    public /* synthetic */ d7l0(nfv0 nfv0Var) {
        this.b = 17;
    }
}
