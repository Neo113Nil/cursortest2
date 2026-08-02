package xsna;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import androidx.core.app.NotificationCompat;
import com.vk.pushes.notifications.base.PushButton;
import com.vkontakte.android.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONObject;
import xsna.dfq0;

/* compiled from: VideoNewVideoNotification.kt */
/* loaded from: classes5.dex */
public class dys0 extends dfq0 {
    public final String A;
    public final a z;

    /* compiled from: VideoNewVideoNotification.kt */
    public static class a extends dfq0.a {
    }

    public dys0(Context context, a aVar, Bitmap bitmap, Bitmap bitmap2, File file, String str) {
        super(context, aVar, bitmap, bitmap2, file);
        this.z = aVar;
        this.A = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f2  */
    @Override // com.vk.pushes.notifications.base.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Collection<NotificationCompat.a> m() {
        Iterator it;
        ArrayList arrayList;
        String str;
        JSONObject jSONObject;
        String A;
        String str2;
        Integer valueOf;
        int hashCode;
        String str3;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.z.j;
        if (arrayList3 != null) {
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                PushButton pushButton = (PushButton) it2.next();
                PushButton.Action action = pushButton.c;
                if (action == null || (str = action.e) == null || (A = f370.A("type", (jSONObject = new JSONObject(str)))) == null || (str2 = pushButton.c.d) == null) {
                    it = it2;
                    arrayList = arrayList2;
                } else {
                    long optLong = jSONObject.optLong("group_id");
                    int optInt = jSONObject.optInt("video_id");
                    int hashCode2 = A.hashCode();
                    it = it2;
                    if (hashCode2 == -1202471303) {
                        if (A.equals("video_not_interested")) {
                            String str4 = this.A;
                            if (epx.f(str4, "unifyvideo_groups_publish")) {
                                valueOf = Integer.valueOf(R.string.video_push_action_do_not_notify);
                            } else if (epx.f(str4, "unifylive")) {
                                valueOf = Integer.valueOf(R.string.live_push_action_do_not_notify);
                            }
                            String str5 = this.A;
                            Integer num = valueOf;
                            hashCode = A.hashCode();
                            ArrayList arrayList4 = arrayList2;
                            if (hashCode != -1202471303) {
                            }
                        }
                        valueOf = null;
                        String str52 = this.A;
                        Integer num2 = valueOf;
                        hashCode = A.hashCode();
                        ArrayList arrayList42 = arrayList2;
                        if (hashCode != -1202471303) {
                        }
                    } else if (hashCode2 != -168837172) {
                        if (hashCode2 == 1980786008 && A.equals("video_watch_later")) {
                            valueOf = Integer.valueOf(R.string.video_push_action_watch_later);
                            String str522 = this.A;
                            Integer num22 = valueOf;
                            hashCode = A.hashCode();
                            ArrayList arrayList422 = arrayList2;
                            if (hashCode != -1202471303) {
                                if (A.equals("video_not_interested")) {
                                    if (epx.f(str522, "unifylive")) {
                                        str3 = "action_live_not_interested";
                                    } else if (epx.f(str522, "unifyvideo_groups_publish")) {
                                        str3 = "action_video_not_interested";
                                    }
                                    if (num22 != null) {
                                    }
                                    arrayList = arrayList422;
                                }
                                str3 = null;
                                if (num22 != null) {
                                }
                                arrayList = arrayList422;
                            } else if (hashCode != -168837172) {
                                if (hashCode == 1980786008 && A.equals("video_watch_later")) {
                                    if (epx.f(str522, "unifyvideo_groups_publish")) {
                                        str3 = "action_video_watch_later";
                                    } else if (epx.f(str522, "unifylive")) {
                                        str3 = "action_live_watch_later";
                                    }
                                    if (num22 != null || str3 == null) {
                                        arrayList = arrayList422;
                                    } else {
                                        int intValue = num22.intValue();
                                        Intent k = k(null, str3);
                                        if (str3.equals("action_live_not_interested")) {
                                            k.putExtra("url", a0a.d.concat(str2));
                                        } else {
                                            k.putExtra("url", "https://vkvideo.ru".concat(str2));
                                        }
                                        k.putExtra("video_id", optInt);
                                        k.putExtra("video_group_id", optLong);
                                        arrayList = arrayList422;
                                        arrayList.add(new NotificationCompat.a.C0022a(R.drawable.vk_icon_cancel_24, this.c.getString(intValue), l(k)).b());
                                    }
                                }
                                str3 = null;
                                if (num22 != null) {
                                }
                                arrayList = arrayList422;
                            } else {
                                if (A.equals("video_download")) {
                                    str3 = "action_video_download";
                                    if (num22 != null) {
                                    }
                                    arrayList = arrayList422;
                                }
                                str3 = null;
                                if (num22 != null) {
                                }
                                arrayList = arrayList422;
                            }
                        }
                        valueOf = null;
                        String str5222 = this.A;
                        Integer num222 = valueOf;
                        hashCode = A.hashCode();
                        ArrayList arrayList4222 = arrayList2;
                        if (hashCode != -1202471303) {
                        }
                    } else {
                        if (A.equals("video_download")) {
                            valueOf = Integer.valueOf(R.string.video_push_action_download);
                            String str52222 = this.A;
                            Integer num2222 = valueOf;
                            hashCode = A.hashCode();
                            ArrayList arrayList42222 = arrayList2;
                            if (hashCode != -1202471303) {
                            }
                        }
                        valueOf = null;
                        String str522222 = this.A;
                        Integer num22222 = valueOf;
                        hashCode = A.hashCode();
                        ArrayList arrayList422222 = arrayList2;
                        if (hashCode != -1202471303) {
                        }
                    }
                }
                arrayList2 = arrayList;
                it2 = it;
            }
        }
        return arrayList2;
    }
}
