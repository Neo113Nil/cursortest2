package xsna;

import android.content.Context;
import android.graphics.PointF;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.SystemClock;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.view.LayoutInflater;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.di.ServicesRegistry;
import com.vk.api.generated.groups.dto.GroupsGetRecommendedGroupsResponseDto;
import com.vk.api.generated.groups.dto.GroupsSuggestionDto;
import com.vk.core.utils.newtork.NetworkType;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.GroupsSuggestions;
import com.vk.dto.common.Image;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Thumb;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.metrics.trackers.my.event.SingleEvent;
import com.vk.music.offline.impl.sync.MusicOfflineSyncServiceHelper;
import com.vk.narratives.impl.highlights.HighlightEditFragment;
import com.vk.onetimedonut.api.events.OneTimeDonutEventStatus;
import com.vk.voip.ui.VoipViewModelState;
import com.vk.voip.ui.picture_in_picture.overlay.PictureInPictureOverlayService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import xsna.f5h0;
import xsna.fm70;
import xsna.tj50;
import xsna.tth0;
import xsna.wy30;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class gvs implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ gvs(int i) {
        this.b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x012d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0151  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        OneTimeDonutEventStatus oneTimeDonutEventStatus;
        String optString;
        s3q0 initialize$lambda$220;
        ArrayList<CellInfo> arrayList = null;
        czi r3uVar = null;
        int i = 0;
        r5 = false;
        boolean z = false;
        i = 0;
        i = 0;
        i = 0;
        i = 0;
        i = 0;
        switch (this.b) {
            case 0:
                Throwable th = (Throwable) obj;
                com.vk.metrics.eventtracking.b.a.a(th);
                xgx0.a.getClass();
                xgx0.c("An error occurred on FullLogoutDelegate.loadExchangeDataOnLogout", th);
                return s3q0.a;
            case 1:
                GroupsGetRecommendedGroupsResponseDto groupsGetRecommendedGroupsResponseDto = (GroupsGetRecommendedGroupsResponseDto) obj;
                String title = groupsGetRecommendedGroupsResponseDto.getTitle();
                String e = groupsGetRecommendedGroupsResponseDto.e();
                List<GroupsSuggestionDto> d = groupsGetRecommendedGroupsResponseDto.d();
                ArrayList arrayList2 = new ArrayList(c5g.u(d, 10));
                Iterator<T> it = d.iterator();
                while (it.hasNext()) {
                    arrayList2.add(hru.a((GroupsSuggestionDto) it.next()));
                }
                return new GroupsSuggestions("recommended_groups", title, e, p4g.q(arrayList2), null, null);
            case 2:
                int i2 = HighlightEditFragment.h0;
                qgi0.r((tgi0) obj, "edit_close_button");
                return s3q0.a;
            case 3:
                return new a38(LayoutInflater.from((Context) obj));
            case 4:
                x410 x410Var = (x410) obj;
                return new k7p0(x410Var.d, x410Var.e);
            case 5:
                return new tfu(n34.a(3));
            case 6:
                return j5g.D0(new si8(1), ((y810) obj).f);
            case 7:
                io.reactivex.rxjava3.internal.operators.observable.j1 U = wmi0.a.e("mentionProfiles").U(new bk1(new nk(27), 22));
                com.vk.newsfeed.impl.util.b bVar = new com.vk.newsfeed.impl.util.b((b420) obj);
                int i3 = kwg0.a;
                U.subscribe(bVar, new iwg0());
                return s3q0.a;
            case 8:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((zak0) co20.j).setValue(bool);
                return s3q0.a;
            case 9:
                com.vk.im.ui.components.msg_list.a.P0.a((Throwable) obj);
                return s3q0.a;
            case 10:
                wy30.a aVar = (wy30.a) obj;
                aVar.j = SystemClock.uptimeMillis();
                r6m.a.getClass();
                aVar.r = r6m.f();
                aVar.s = r6m.d();
                NetworkInfo e2 = r6m.e();
                if ((e2 != null ? e2.getType() : -1) == 1) {
                    Context context = e43.a;
                    if (context == null) {
                        context = null;
                    }
                    if (enj.m(context, "android.permission.ACCESS_WIFI_STATE", "android.permission.ACCESS_FINE_LOCATION")) {
                        Context context2 = r6m.e;
                        WifiInfo connectionInfo = ((WifiManager) (context2 != null ? context2 : null).getApplicationContext().getSystemService("wifi")).getConnectionInfo();
                        if (connectionInfo != null) {
                            i = WifiManager.calculateSignalLevel(connectionInfo.getRssi(), 5);
                        }
                        aVar.v = i;
                        return s3q0.a;
                    }
                    i = -1;
                    aVar.v = i;
                    return s3q0.a;
                }
                NetworkInfo e3 = r6m.e();
                int type = e3 != null ? e3.getType() : -1;
                if (type == 0 || type == 4 || type == 5 || type == 2 || type == 3) {
                    NetworkInfo e4 = r6m.e();
                    if (e4 != null) {
                        e4.getSubtype();
                    }
                    Context context3 = r6m.e;
                    if (context3 == null) {
                        context3 = null;
                    }
                    if (enj.m(context3, "android.permission.ACCESS_FINE_LOCATION")) {
                        List<CellInfo> allCellInfo = r6m.g().getAllCellInfo();
                        if (allCellInfo != null) {
                            arrayList = new ArrayList();
                            for (Object obj2 : allCellInfo) {
                                if (((CellInfo) obj2).isRegistered()) {
                                    arrayList.add(obj2);
                                }
                            }
                        }
                        NetworkType d2 = com.vk.core.utils.newtork.b.c().d();
                        if (d2 != NetworkType.UNKNOWN && arrayList != null && !arrayList.isEmpty()) {
                            HashMap hashMap = new HashMap();
                            for (CellInfo cellInfo : arrayList) {
                                if (cellInfo instanceof CellInfoGsm) {
                                    hashMap.put(NetworkType.MOBILE_2G, Integer.valueOf(((CellInfoGsm) cellInfo).getCellSignalStrength().getLevel()));
                                } else if (cellInfo instanceof CellInfoCdma) {
                                    hashMap.put(NetworkType.MOBILE_3G, Integer.valueOf(((CellInfoCdma) cellInfo).getCellSignalStrength().getLevel()));
                                } else if (cellInfo instanceof CellInfoWcdma) {
                                    hashMap.put(NetworkType.MOBILE_3G, Integer.valueOf(((CellInfoWcdma) cellInfo).getCellSignalStrength().getLevel()));
                                } else if (cellInfo instanceof CellInfoLte) {
                                    hashMap.put(NetworkType.MOBILE_4G, Integer.valueOf(((CellInfoLte) cellInfo).getCellSignalStrength().getLevel()));
                                }
                            }
                            Integer num = (Integer) hashMap.get(d2);
                            if (num != null || (num = (Integer) j5g.Z(hashMap.values())) != null) {
                                i = num.intValue();
                            }
                        }
                    }
                    i = -1;
                } else {
                    NetworkInfo e5 = r6m.e();
                    if ((e5 != null ? e5.getType() : -1) == 9) {
                        i = 4;
                    }
                }
                aVar.v = i;
                return s3q0.a;
            case 11:
                Image image = ((AudioBook) obj).j;
                if (image != null) {
                    return new Thumb(image);
                }
                return null;
            case 12:
                qgi0.r((tgi0) obj, "vk_top_bar_edit_btn");
                return s3q0.a;
            case 13:
                MusicTrack musicTrack = ((ib50) obj).a;
                if (musicTrack.Vb() && !(musicTrack.J instanceof DownloadingState.Downloading)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 14:
                MusicOfflineSyncServiceHelper.h("audio.getAudioRestrictions", (Throwable) obj);
                return s3q0.a;
            case 15:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.r(tgi0Var, "musicImage");
                rgi0.a(tgi0Var);
                return s3q0.a;
            case 16:
                return fpf0.a(((fm70.a) obj).getClass());
            case 17:
                qgi0.r((tgi0) obj, "offlineEpisodesCountAndDuration");
                return s3q0.a;
            case 18:
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject != null) {
                    OneTimeDonutEventStatus.a aVar2 = OneTimeDonutEventStatus.Companion;
                    String optString2 = jSONObject.optString("status");
                    aVar2.getClass();
                    int hashCode = optString2.hashCode();
                    if (hashCode == -1867169789) {
                        if (optString2.equals("success")) {
                            oneTimeDonutEventStatus = OneTimeDonutEventStatus.SUCCESS;
                            optString = jSONObject.optString("type");
                            JSONObject optJSONObject = jSONObject.optJSONObject("data");
                            if (!drm0.N(optString)) {
                            }
                        }
                        oneTimeDonutEventStatus = null;
                        optString = jSONObject.optString("type");
                        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
                        if (!drm0.N(optString)) {
                        }
                    } else if (hashCode != 96784904) {
                        if (hashCode == 422194963 && optString2.equals("processing")) {
                            oneTimeDonutEventStatus = OneTimeDonutEventStatus.PROCESSING;
                            optString = jSONObject.optString("type");
                            JSONObject optJSONObject22 = jSONObject.optJSONObject("data");
                            if (!drm0.N(optString) && optJSONObject22 != null && oneTimeDonutEventStatus != null) {
                                if (!optString.equals("donut_badges")) {
                                    r3uVar = new i9x0(oneTimeDonutEventStatus, optJSONObject22.optJSONObject("object_info").optInt("id"), optJSONObject22.optString("animation_url"));
                                } else if (optString.equals("goal")) {
                                    r3uVar = new r3u(oneTimeDonutEventStatus);
                                }
                                if (r3uVar != null) {
                                    rj80.a.onNext(r3uVar);
                                }
                            }
                        }
                        oneTimeDonutEventStatus = null;
                        optString = jSONObject.optString("type");
                        JSONObject optJSONObject222 = jSONObject.optJSONObject("data");
                        if (!drm0.N(optString)) {
                            if (!optString.equals("donut_badges")) {
                            }
                            if (r3uVar != null) {
                            }
                        }
                    } else {
                        if (optString2.equals("error")) {
                            oneTimeDonutEventStatus = OneTimeDonutEventStatus.ERROR;
                            optString = jSONObject.optString("type");
                            JSONObject optJSONObject2222 = jSONObject.optJSONObject("data");
                            if (!drm0.N(optString)) {
                            }
                        }
                        oneTimeDonutEventStatus = null;
                        optString = jSONObject.optString("type");
                        JSONObject optJSONObject22222 = jSONObject.optJSONObject("data");
                        if (!drm0.N(optString)) {
                        }
                    }
                }
                return jSONObject;
            case 19:
                return s3q0.a;
            case 20:
                Integer num2 = (Integer) obj;
                if (num2 != null && num2.intValue() == 0) {
                    throw new RuntimeException("Move photos failed");
                }
                return s3q0.a;
            case 21:
                VoipViewModelState voipViewModelState = (VoipViewModelState) obj;
                int i4 = PictureInPictureOverlayService.g;
                return Boolean.valueOf(voipViewModelState == VoipViewModelState.Idle);
            case 22:
                ojt ojtVar = (ojt) obj;
                ojtVar.l = f5h0.o.a;
                ojtVar.m = new PointF(0.5f, 0.1f);
                return s3q0.a;
            case 23:
                return Boolean.valueOf(((u1c0) obj).c == 74);
            case 24:
                if (!((Post) obj).pc()) {
                    ConcurrentHashMap.KeySetView<Object, Boolean> keySetView = jt50.a;
                    jt50.a(SingleEvent.POST);
                }
                return s3q0.a;
            case 25:
                GroupsGetRecommendedGroupsResponseDto groupsGetRecommendedGroupsResponseDto2 = (GroupsGetRecommendedGroupsResponseDto) obj;
                String title2 = groupsGetRecommendedGroupsResponseDto2.getTitle();
                String e6 = groupsGetRecommendedGroupsResponseDto2.e();
                List<GroupsSuggestionDto> d3 = groupsGetRecommendedGroupsResponseDto2.d();
                ArrayList arrayList3 = new ArrayList(c5g.u(d3, 10));
                Iterator<T> it2 = d3.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(hru.a((GroupsSuggestionDto) it2.next()));
                }
                return new GroupsSuggestions("recommended_groups", title2, e6, p4g.q(arrayList3), null, null);
            case 26:
                return s3q0.a;
            case 27:
                return new tth0.a(tj50.a.d((tj50.a) obj, oth0.b, pth0.b, new whd(5)));
            case 28:
                return Boolean.valueOf(((com.vk.photos.root.selectalbum.domain.g) obj).e != null);
            default:
                initialize$lambda$220 = ServiceProvider.initialize$lambda$220((ServicesRegistry) obj);
                return initialize$lambda$220;
        }
    }

    public /* synthetic */ gvs(MusicOfflineSyncServiceHelper musicOfflineSyncServiceHelper) {
        this.b = 14;
    }
}
