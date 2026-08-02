package xsna;

import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.user.UserProfile;
import com.vk.dto.video.VideoListWithTotalCount;
import com.vk.dto.video.VideoNotificationsStatus;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: VideoDiscover.kt */
@ozl
/* loaded from: classes15.dex */
public final class dfs0 extends rsg0<VideoListWithTotalCount> {
    public dfs0(int i, int i2, UserId userId, String str, String str2) {
        super("video.getVideoDiscover");
        C(i, "video_id");
        F(userId, "owner_id");
        C(0, SignalingProtocol.KEY_OFFSET);
        C(i2, "count");
        K("ref", str);
        K("track_code", str2);
        K("fields", "photo_base,friend_status,member_status,verified,trending,is_nft,members_count,video_notifications_status,followers_count");
        ahn.D(this);
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        int i;
        VideoNotificationsStatus videoNotificationsStatus;
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject2 = jSONObject.getJSONObject("response");
        JSONArray jSONArray = jSONObject2.getJSONArray("items");
        JSONArray optJSONArray = jSONObject2.optJSONArray("profiles");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("groups");
        int optInt = jSONObject2.optInt("count");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        float b = vx2.d.b();
        boolean z = z230.a;
        if (optJSONArray != null) {
            int i2 = 0;
            for (int length = optJSONArray.length(); i2 < length; length = length) {
                JSONObject jSONObject3 = optJSONArray.getJSONObject(i2);
                UserProfile userProfile = new UserProfile();
                userProfile.c = new UserId(jSONObject3.getLong("id"));
                userProfile.d = jSONObject3.getString("first_name");
                userProfile.f = jSONObject3.getString("last_name");
                userProfile.B.Bb(jSONObject3);
                userProfile.e = userProfile.d + ' ' + userProfile.f;
                userProfile.g = jSONObject3.optString("photo_base");
                userProfile.h = we7.q(jSONObject3, b, z);
                userProfile.Y = jSONObject3.optBoolean("is_nft");
                userProfile.K = jSONObject3.optInt("followers_count");
                linkedHashMap.put(userProfile.c, userProfile);
                i2++;
            }
        }
        if (optJSONArray2 != null) {
            int length2 = optJSONArray2.length();
            int i3 = 0;
            while (i3 < length2) {
                JSONObject jSONObject4 = optJSONArray2.getJSONObject(i3);
                UserProfile userProfile2 = new UserProfile();
                JSONArray jSONArray2 = optJSONArray2;
                userProfile2.c = new UserId(-jSONObject4.getLong("id"));
                userProfile2.e = jSONObject4.getString("name");
                userProfile2.g = jSONObject4.optString("photo_base");
                userProfile2.h = we7.q(jSONObject4, b, z);
                userProfile2.B.Bb(jSONObject4);
                int optInt2 = jSONObject4.optInt("is_member", 0);
                if (optInt2 != 0) {
                    i = 1;
                    if (optInt2 != 1) {
                        i = -1;
                    }
                } else {
                    i = 0;
                }
                userProfile2.v = i;
                userProfile2.K = jSONObject4.optInt("members_count");
                String A = f370.A("video_notifications_status", jSONObject4);
                if (A != null) {
                    VideoNotificationsStatus[] values = VideoNotificationsStatus.values();
                    int length3 = values.length;
                    int i4 = 0;
                    while (i4 < length3) {
                        VideoNotificationsStatus videoNotificationsStatus2 = values[i4];
                        int i5 = i4;
                        if (epx.f(videoNotificationsStatus2.i(), A)) {
                            videoNotificationsStatus = videoNotificationsStatus2;
                            break;
                        }
                        i4 = i5 + 1;
                    }
                }
                videoNotificationsStatus = null;
                linkedHashMap2.put(userProfile2.c, videoNotificationsStatus);
                linkedHashMap.put(userProfile2.c, userProfile2);
                i3++;
                optJSONArray2 = jSONArray2;
            }
        }
        j9x it = swe0.q(0, jSONArray.length()).iterator();
        while (it.d) {
            VideoFileOld b2 = com.vk.dto.common.c.b(jSONArray.getJSONObject(it.nextInt()));
            UserProfile userProfile3 = (UserProfile) linkedHashMap.get(b2.b);
            if (userProfile3 != null) {
                Owner l0 = userProfile3.l0();
                VideoNotificationsStatus videoNotificationsStatus3 = (VideoNotificationsStatus) linkedHashMap2.get(b2.b);
                if (videoNotificationsStatus3 != null) {
                    b2.u0 = videoNotificationsStatus3;
                }
                b2.f1(l0);
            }
            arrayList.add(b2);
        }
        return new VideoListWithTotalCount(arrayList, optInt, -1);
    }
}
