package xsna;

import android.graphics.Bitmap;
import android.os.SystemClock;
import com.vk.core.preference.Preference;
import com.vk.dto.notifications.settings.NotificationSettingsCategory;
import com.vk.dto.notifications.settings.NotificationsSettingsConfig;
import com.vk.music.playlist.display.domain.a;
import com.vk.pushes.NotificationUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;
import xsna.gdn;
import xsna.mat;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ih4 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ ih4(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        NotificationSettingsCategory[] notificationSettingsCategoryArr;
        ArrayList<NotificationsSettingsConfig> arrayList;
        Object obj2;
        int i = this.b;
        izs izsVar = this.c;
        switch (i) {
            case 0:
                if (((com.vk.music.playlist.display.domain.a) obj) instanceof a.b.d) {
                    izsVar.invoke(gdn.c.C2934c.b);
                }
                return s3q0.a;
            case 1:
                izsVar.invoke((Bitmap) obj);
                return s3q0.a;
            case 2:
                izsVar.invoke(new ykb((String) obj, 1));
                return s3q0.a;
            case 3:
                izsVar.invoke(new mat.e((djc) obj));
                return s3q0.a;
            case 4:
                kj70 kj70Var = (kj70) obj;
                Preference.F(SystemClock.elapsedRealtime(), "notifications_channels_update_pref", "notifications_channels_last_time_update_time");
                ca70 ca70Var = ca70.a;
                for (dk70 dk70Var : kj70Var.a) {
                    String str = dk70Var.a;
                    if ((epx.f(str, "community_channels") || epx.f(str, "messages")) && (notificationSettingsCategoryArr = dk70Var.c) != null) {
                        for (NotificationSettingsCategory notificationSettingsCategory : notificationSettingsCategoryArr) {
                            ca70 ca70Var2 = ca70.a;
                            String str2 = notificationSettingsCategory.b;
                            switch (str2.hashCode()) {
                                case -190345080:
                                    if (str2.equals("private_messages")) {
                                        ca70.h(NotificationUtils.Type.PrivateMessages, notificationSettingsCategory);
                                        break;
                                    } else {
                                        break;
                                    }
                                case 1086854747:
                                    if (str2.equals("group_chats")) {
                                        ca70.h(NotificationUtils.Type.ChatMessages, notificationSettingsCategory);
                                        break;
                                    } else {
                                        break;
                                    }
                                case 1248734217:
                                    if (str2.equals("message_reminders") && (arrayList = notificationSettingsCategory.i) != null) {
                                        Iterator<T> it = arrayList.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                obj2 = it.next();
                                                if (((NotificationsSettingsConfig) obj2).e) {
                                                }
                                            } else {
                                                obj2 = null;
                                            }
                                        }
                                        NotificationsSettingsConfig notificationsSettingsConfig = (NotificationsSettingsConfig) obj2;
                                        if (notificationsSettingsConfig == null) {
                                            break;
                                        } else {
                                            Preference.H("notifications_prefs", "message_reminders", notificationsSettingsConfig.b);
                                            Preference.I("notifications_prefs", "message_reminders".concat("_push_value"), notificationSettingsCategory.Bb());
                                            break;
                                        }
                                    }
                                    break;
                                case 1975953925:
                                    if (str2.equals("community_channels_messages")) {
                                        ca70.h(NotificationUtils.Type.CommunityChannelsMessages, notificationSettingsCategory);
                                        break;
                                    } else {
                                        break;
                                    }
                            }
                        }
                        s3q0 s3q0Var = s3q0.a;
                    }
                }
                z9w.a();
                if (izsVar != null) {
                    izsVar.invoke(kj70Var);
                }
                return s3q0.a;
            default:
                JSONObject jSONObject = (JSONObject) obj;
                izsVar.invoke(jSONObject != null ? Integer.valueOf(jSONObject.getInt("reason")) : null);
                r3y.c("VKWebAppReturnReason");
                return jSONObject;
        }
    }
}
