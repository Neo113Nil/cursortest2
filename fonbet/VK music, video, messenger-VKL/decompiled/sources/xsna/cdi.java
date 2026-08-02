package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.text.TextPaint;
import android.util.Log;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.measurement.zznn;
import com.ironsource.O6;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.viewer.impl.grid.toolbar.profile.swap.utils.shadow.GradientParams;
import com.vk.clips.viewer.impl.grid.toolbar.profile.swap.utils.shadow.GradientPointAndColorMultiplier;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.text.VkFadeText;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.im.ImageList;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.engine.models.attaches.AttachVideoMsg;
import com.vk.im.engine.models.carousel.CarouselItem;
import com.vk.im.engine.models.conversations.BotButton;
import com.vk.im.engine.models.conversations.BotKeyboard;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.log.L;
import com.vk.music.bottomsheets.domain.model.mixsettings.MixCategory;
import com.vk.music.bottomsheets.domain.model.mixsettings.MixOption;
import com.vk.music.bottomsheets.domain.model.mixsettings.MixSettings;
import com.vk.music.mixsettings.MixCategoryEntity;
import com.vk.music.mixsettings.MixCategoryType;
import com.vk.music.mixsettings.MixOptionEntity;
import com.vk.music.mixsettings.MixSettingsEntity;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.ShitAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Triple;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.vk.oneevent.AppStartsEventDeviceAdsIdType;
import ru.vk.oneevent.AppStartsEventPreferredSystemContentSize;
import ru.vk.oneevent.AppStartsEventStartMethod;
import ru.vk.oneevent.AppStartsEventStartType;
import ru.vk.oneevent.AppStartsEventStoreRegion;
import ru.vk.oneevent.AppStartsEventSystemTheme;
import xsna.lw5;
import xsna.u9p;

/* compiled from: CollageOnboardingBottomSheet.kt */
/* loaded from: classes15.dex */
public final class cdi implements znj, umv, q701, gn60, i100, rgq {
    public static final jai b = new jai(1363194043, new bb9(2), false);
    public static final jai c = new jai(659797786, new x7c(2), false);
    public static final jai d = new jai(1766471832, new ffi(0), false);
    public static final jai e = new jai(168750651, new x7c(3), false);
    public static final cdi f = new cdi();
    public static final cdi g = new cdi();
    public static final /* synthetic */ cdi h = new cdi();

    public static final String A(List list, MsgFromUser msgFromUser) {
        Object obj;
        Object obj2;
        String str;
        if (msgFromUser != null && msgFromUser.F0()) {
            List list2 = list;
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                e0l0 e0l0Var = (e0l0) obj;
                AttachVideoMsg D6 = msgFromUser.D6();
                if (D6 != null && e0l0Var.a == D6.c) {
                    break;
                }
            }
            e0l0 e0l0Var2 = (e0l0) obj;
            if (e0l0Var2 != null && (str = e0l0Var2.b) != null) {
                return str;
            }
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (((e0l0) obj2).a == 0) {
                    break;
                }
            }
            e0l0 e0l0Var3 = (e0l0) obj2;
            if (e0l0Var3 != null) {
                return e0l0Var3.b;
            }
        }
        return null;
    }

    public static String B(int i) {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        Resources resources = context.getResources();
        Calendar d2 = pvo0.d();
        d2.set(12, 0);
        d2.set(11, 0);
        d2.set(13, 0);
        d2.set(14, 0);
        d2.setTimeInMillis(i * 1000);
        String string = resources.getString(R.string.date_format_day_month, Integer.valueOf(d2.get(5)), resources.getStringArray(R.array.months_short)[Math.min(d2.get(2), 11)]);
        d2.clear();
        return string;
    }

    public static String C(int i) {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        Resources resources = context.getResources();
        Calendar d2 = pvo0.d();
        d2.set(12, 0);
        d2.set(11, 0);
        d2.set(13, 0);
        d2.set(14, 0);
        d2.setTimeInMillis(i * 1000);
        Integer valueOf = Integer.valueOf(d2.get(5));
        String[] stringArray = resources.getStringArray(R.array.months_short);
        int i2 = d2.get(2);
        String string = resources.getString(R.string.date_format_day_month_year, valueOf, stringArray[i2 <= 11 ? i2 : 11], Integer.valueOf(d2.get(1)));
        d2.clear();
        return string;
    }

    public static int D(int i, int i2, boolean z) {
        return z ? ((i2 - i) + 360) % 360 : (i2 + i) % 360;
    }

    public static MixSettings E(MixSettingsEntity mixSettingsEntity) {
        String str = mixSettingsEntity.b;
        String str2 = mixSettingsEntity.c;
        boolean z = mixSettingsEntity.d;
        List<MixCategoryEntity> list = mixSettingsEntity.e;
        int i = 10;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (MixCategoryEntity mixCategoryEntity : list) {
            String str3 = mixCategoryEntity.b;
            String str4 = mixCategoryEntity.c;
            MixCategoryType mixCategoryType = mixCategoryEntity.d;
            List<MixOptionEntity> list2 = mixCategoryEntity.e;
            ArrayList arrayList2 = new ArrayList(c5g.u(list2, i));
            for (MixOptionEntity mixOptionEntity : list2) {
                arrayList2.add(new MixOption(mixOptionEntity.b, mixOptionEntity.c, mixOptionEntity.d, mixOptionEntity.e, mixOptionEntity.f));
            }
            arrayList.add(new MixCategory(str3, str4, mixCategoryType, arrayList2));
            i = 10;
        }
        return new MixSettings(str, str2, z, arrayList);
    }

    public static final void F(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        try {
            I("music_tracks", "CREATE TABLE music_tracks (id INTEGER PRIMARY KEY AUTOINCREMENT, uid INTEGER, mid text NOT NULL, value text NULL, download_state INTEGER NOT NULL DEFAULT 0, manifest_url text DEFAULT NULL, UNIQUE(uid, mid) ON CONFLICT REPLACE)", sQLiteDatabase);
            s3q0 s3q0Var = s3q0.a;
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            sQLiteDatabase.beginTransaction();
            try {
                I("playlists", "CREATE TABLE playlists (id INTEGER PRIMARY KEY AUTOINCREMENT, uid INTEGER, pid text NOT NULL, value text NULL, download_state INTEGER NOT NULL DEFAULT 0, origin_pid text DEFAULT NULL, UNIQUE(uid, pid) ON CONFLICT REPLACE)", sQLiteDatabase);
                sQLiteDatabase.setTransactionSuccessful();
            } finally {
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ef A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList G(JSONObject jSONObject, Peer peer) {
        Peer peer2;
        JSONArray jSONArray;
        Object carouselItem;
        JSONArray jSONArray2;
        String str = null;
        if (!"carousel".equalsIgnoreCase(jSONObject != null ? jSONObject.optString("type") : null)) {
            return null;
        }
        JSONArray jSONArray3 = jSONObject.getJSONArray("elements");
        ArrayList arrayList = new ArrayList(jSONArray3.length());
        int length = jSONArray3.length();
        int i = 0;
        while (i < length) {
            JSONObject jSONObject2 = jSONArray3.getJSONObject(i);
            JSONObject optJSONObject = jSONObject2.optJSONObject("action");
            String string = optJSONObject != null ? optJSONObject.getString("type") : str;
            if (string == null || string.equals("open_link") || string.equals("open_photo")) {
                String optString = optJSONObject != null ? optJSONObject.optString("link", str) : str;
                boolean f2 = epx.f(string, "open_photo");
                JSONObject optJSONObject2 = jSONObject2.optJSONObject("photo");
                JSONArray optJSONArray = optJSONObject2 != null ? optJSONObject2.optJSONArray("sizes") : str;
                String string2 = jSONObject2.has("title") ? jSONObject2.getString("title") : "";
                String string3 = jSONObject2.has("description") ? jSONObject2.getString("description") : "";
                ImageList a = plw.a(optJSONArray, plw.a);
                if (jSONObject2.has("author_id")) {
                    Serializer.c<Peer> cVar = Peer.CREATOR;
                    peer2 = Peer.a.b(jSONObject2.getLong("author_id"));
                } else {
                    peer2 = peer;
                }
                JSONArray optJSONArray2 = jSONObject2.optJSONArray("buttons");
                if (optJSONArray2 == null) {
                    optJSONArray2 = new JSONArray();
                }
                ArrayList arrayList2 = new ArrayList();
                int length2 = optJSONArray2.length();
                int i2 = 0;
                while (i2 < length2) {
                    ArrayList arrayList3 = new ArrayList();
                    try {
                        jSONArray2 = jSONArray3;
                    } catch (Exception unused) {
                        jSONArray2 = jSONArray3;
                    }
                    try {
                        BotButton a2 = yey.a(optJSONArray2.getJSONObject(i2), true, peer2);
                        if (a2 != null) {
                            a2.Db(1);
                            arrayList3.add(a2);
                        }
                    } catch (Exception unused2) {
                        arrayList3.add(BotButton.Unsupported.g);
                        if (arrayList3.isEmpty()) {
                        }
                        i2++;
                        jSONArray3 = jSONArray2;
                    }
                    if (arrayList3.isEmpty()) {
                        arrayList2.add(arrayList3);
                    }
                    i2++;
                    jSONArray3 = jSONArray2;
                }
                jSONArray = jSONArray3;
                carouselItem = new CarouselItem(string2, string3, optString, f2, a, arrayList2.isEmpty() ? null : new BotKeyboard(peer2, false, true, 1, arrayList2));
            } else {
                jSONArray = jSONArray3;
                carouselItem = str;
            }
            if (carouselItem != null) {
                arrayList.add(carouselItem);
            }
            i++;
            jSONArray3 = jSONArray;
            str = null;
        }
        return arrayList;
    }

    public static final q630 H(q630 q630Var, wh50 wh50Var) {
        return egi.o(q630Var, new f2k(2, wh50Var));
    }

    public static final void I(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        Cursor query = sQLiteDatabase.query(str, null, null, null, null, null, null);
        try {
            String[] columnNames = query.getColumnNames();
            query.close();
            String Z = rl3.Z(columnNames, StringUtils.COMMA, null, null, null, 62);
            columnNames[rl3.U("downloaded", columnNames)] = "download_state";
            String Z2 = rl3.Z(columnNames, StringUtils.COMMA, null, null, null, 62);
            String concat = str.concat("_old");
            sQLiteDatabase.execSQL("ALTER TABLE " + str + " RENAME TO " + concat);
            sQLiteDatabase.execSQL(str2);
            StringBuilder sb = new StringBuilder("INSERT INTO ");
            sb.append(str);
            sb.append(" (");
            n6j.b(sb, Z2, ") SELECT ", Z, " FROM ");
            sb.append(concat);
            sQLiteDatabase.execSQL(sb.toString());
            sQLiteDatabase.execSQL("DROP TABLE " + concat);
        } finally {
        }
    }

    @Nullable
    public static xsp0 J(@Nullable xsp0 xsp0Var, @Nullable String[] strArr, Map map) {
        int i = 0;
        if (xsp0Var == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (xsp0) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                xsp0 xsp0Var2 = new xsp0();
                int length = strArr.length;
                while (i < length) {
                    xsp0Var2.a((xsp0) map.get(strArr[i]));
                    i++;
                }
                return xsp0Var2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                xsp0Var.a((xsp0) map.get(strArr[0]));
                return xsp0Var;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    xsp0Var.a((xsp0) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return xsp0Var;
    }

    public static int K(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 90;
        }
        if (i == 2) {
            return 180;
        }
        if (i == 3) {
            return atv0.b;
        }
        throw new IllegalArgumentException(lhg.a(i, "Unsupported surface rotation: "));
    }

    public static void M(int i) {
        boolean z = true;
        if (i != 100 && i != 102 && i != 104) {
            if (i == 105) {
                i = 105;
            } else {
                z = false;
            }
        }
        exc0.c(z, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i));
    }

    public static String N(int i) {
        if (i == 100) {
            return "HIGH_ACCURACY";
        }
        if (i == 102) {
            return "BALANCED_POWER_ACCURACY";
        }
        if (i == 104) {
            return "LOW_POWER";
        }
        if (i == 105) {
            return "PASSIVE";
        }
        throw new IllegalArgumentException();
    }

    public static final slv0 q(String str, AppStartsEventStartType appStartsEventStartType, AppStartsEventStartMethod appStartsEventStartMethod, String str2, String str3, String str4, String str5, String str6, String str7, AppStartsEventDeviceAdsIdType appStartsEventDeviceAdsIdType, String str8, String str9, Integer num, Integer num2, String str10, String str11, String str12, String str13, Boolean bool, Integer num3, String str14, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str15, AppStartsEventSystemTheme appStartsEventSystemTheme, String str16, Double d2, Double d3, Integer num4, Boolean bool6, List list, Boolean bool7, Boolean bool8, Boolean bool9, String str17, Integer num5, Integer num6, Boolean bool10, Boolean bool11, Boolean bool12, Integer num7, Integer num8, Boolean bool13, Boolean bool14, Boolean bool15, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Boolean bool16, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, List list2, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, Integer num19, Integer num20, String str28, String str29, Integer num21, String str30, Integer num22, Boolean bool17, String str31, AppStartsEventPreferredSystemContentSize appStartsEventPreferredSystemContentSize, String str32, String str33, Boolean bool18, Boolean bool19, AppStartsEventStoreRegion appStartsEventStoreRegion) {
        slv0 slv0Var;
        synchronized (slv0.f) {
            try {
                slv0Var = slv0.h;
                if (slv0Var != null) {
                    slv0.h = slv0Var.d;
                    slv0Var.d = null;
                    slv0.g--;
                } else {
                    slv0Var = new slv0();
                }
                slv0Var.a = "oneevent.events.event.app_starts.flow";
                slv0Var.b = "1.1.0";
                slv0Var.e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (str != null) {
            slv0Var.a(str, "start_time");
        }
        if (appStartsEventStartType != null) {
            slv0Var.a(appStartsEventStartType.h(), "start_type");
        }
        if (appStartsEventStartMethod != null) {
            slv0Var.a(appStartsEventStartMethod.h(), "start_method");
        }
        if (str2 != null) {
            slv0Var.a(str2, "push_type");
        }
        if (str3 != null) {
            slv0Var.a(str3, "companion_id");
        }
        if (str4 != null) {
            slv0Var.a(str4, "previous_start_time");
        }
        if (str5 != null) {
            slv0Var.a(str5, "restart_time");
        }
        if (str6 != null) {
            slv0Var.a(str6, "device_id");
        }
        if (str7 != null) {
            slv0Var.a(str7, "device_ads_id");
        }
        if (appStartsEventDeviceAdsIdType != null) {
            slv0Var.a(appStartsEventDeviceAdsIdType.h(), "device_ads_id_type");
        }
        if (str8 != null) {
            slv0Var.a(str8, "device_brand");
        }
        if (str9 != null) {
            slv0Var.a(str9, AnalyticsBaseParamsConstantsKt.DEVICE_MODEL);
        }
        if (num != null) {
            en.f(num, slv0Var, "screen_w");
        }
        if (num2 != null) {
            en.f(num2, slv0Var, "screen_h");
        }
        if (str10 != null) {
            slv0Var.a(str10, O6.F);
        }
        if (str11 != null) {
            slv0Var.a(str11, "os_version");
        }
        if (str12 != null) {
            slv0Var.a(str12, "os_language");
        }
        if (str13 != null) {
            slv0Var.a(str13, "os_country");
        }
        if (bool != null) {
            slv0Var.a(bool, CommonUrlParts.ROOT_STATUS);
        }
        if (num3 != null) {
            en.f(num3, slv0Var, "build_number");
        }
        if (str14 != null) {
            slv0Var.a(str14, "app_language");
        }
        if (bool2 != null) {
            slv0Var.a(bool2, "are_pushes_enabled");
        }
        if (bool3 != null) {
            slv0Var.a(bool3, "are_contacts_imported");
        }
        if (bool4 != null) {
            slv0Var.a(bool4, "are_contacts_synced");
        }
        if (bool5 != null) {
            slv0Var.a(bool5, "is_geo_enabled");
        }
        if (str15 != null) {
            slv0Var.a(str15, "theme");
        }
        if (appStartsEventSystemTheme != null) {
            slv0Var.a(appStartsEventSystemTheme.h(), "system_theme");
        }
        if (str16 != null) {
            slv0Var.a(str16, "geo_state");
        }
        if (d2 != null) {
            slv0Var.a(Double.valueOf(d2.doubleValue()), "geo_lat");
        }
        if (d3 != null) {
            slv0Var.a(Double.valueOf(d3.doubleValue()), "geo_lon");
        }
        if (num4 != null) {
            en.f(num4, slv0Var, "brightness");
        }
        if (bool6 != null) {
            slv0Var.a(bool6, "is_wifi");
        }
        if (list != null) {
            slv0Var.a(list, "network_operators");
        }
        if (bool7 != null) {
            slv0Var.a(bool7, "is_roaming");
        }
        if (bool8 != null) {
            slv0Var.a(bool8, "is_traffic_saver");
        }
        if (bool9 != null) {
            slv0Var.a(bool9, "is_bluetooth");
        }
        if (str17 != null) {
            slv0Var.a(str17, "bluetooth_device");
        }
        if (num5 != null) {
            en.f(num5, slv0Var, "volume");
        }
        if (num6 != null) {
            en.f(num6, slv0Var, "battery");
        }
        if (bool10 != null) {
            slv0Var.a(bool10, "is_battery_saving_mode");
        }
        if (bool11 != null) {
            slv0Var.a(bool11, "is_charging");
        }
        if (bool12 != null) {
            slv0Var.a(bool12, "is_usb_charging");
        }
        if (num7 != null) {
            en.f(num7, slv0Var, "frontal_camera_resolution");
        }
        if (num8 != null) {
            en.f(num8, slv0Var, "rear_camera_resolution");
        }
        if (bool13 != null) {
            slv0Var.a(bool13, "is_watch_paired");
        }
        if (bool14 != null) {
            slv0Var.a(bool14, "is_redesign");
        }
        if (bool15 != null) {
            slv0Var.a(bool15, "is_talk_back_enabled");
        }
        if (num9 != null) {
            en.f(num9, slv0Var, "free_space");
        }
        if (num10 != null) {
            en.f(num10, slv0Var, "start_duration");
        }
        if (num11 != null) {
            en.f(num11, slv0Var, "memory_usage");
        }
        if (num12 != null) {
            en.f(num12, slv0Var, "disk_usage_public");
        }
        if (num13 != null) {
            en.f(num13, slv0Var, "disk_usage_private");
        }
        if (bool16 != null) {
            slv0Var.a(bool16, "is_rtl");
        }
        if (str18 != null) {
            slv0Var.a(str18, "camera_photo_permission");
        }
        if (str19 != null) {
            slv0Var.a(str19, "camera_video_permission");
        }
        if (str20 != null) {
            slv0Var.a(str20, "microphone_permission");
        }
        if (str21 != null) {
            slv0Var.a(str21, "app_loading_time");
        }
        if (str22 != null) {
            slv0Var.a(str22, "app_init_time");
        }
        if (str23 != null) {
            slv0Var.a(str23, "app_first_screen_time");
        }
        if (str24 != null) {
            slv0Var.a(str24, "app_first_feed_data_time");
        }
        if (str25 != null) {
            slv0Var.a(str25, "app_first_feed_data_cache_time");
        }
        if (str26 != null) {
            slv0Var.a(str26, "app_first_feed_loader_start_time");
        }
        if (str27 != null) {
            slv0Var.a(str27, "app_first_feed_loader_end_time");
        }
        if (list2 != null) {
            slv0Var.a(list2, "app_load_warm_times");
        }
        if (num14 != null) {
            en.f(num14, slv0Var, "app_ftr_feed");
        }
        if (num15 != null) {
            en.f(num15, slv0Var, "app_ftr_discover");
        }
        if (num16 != null) {
            en.f(num16, slv0Var, "app_ftr_msg");
        }
        if (num17 != null) {
            en.f(num17, slv0Var, "app_ftr_msgs");
        }
        if (num18 != null) {
            en.f(num18, slv0Var, "app_ftr_friends");
        }
        if (num19 != null) {
            en.f(num19, slv0Var, "app_ftr_feed_video");
        }
        if (num20 != null) {
            en.f(num20, slv0Var, "disk_usage_bundle");
        }
        if (str28 != null) {
            slv0Var.a(str28, "net_usage_start");
        }
        if (str29 != null) {
            slv0Var.a(str29, "net_usage");
        }
        if (num21 != null) {
            en.f(num21, slv0Var, "net_load_api_count");
        }
        if (str30 != null) {
            slv0Var.a(str30, "net_background_traffic");
        }
        if (num22 != null) {
            en.f(num22, slv0Var, "net_error_count");
        }
        if (bool17 != null) {
            slv0Var.a(bool17, "has_app_anr");
        }
        if (str31 != null) {
            slv0Var.a(str31, "app_first_longpoll_connection");
        }
        if (appStartsEventPreferredSystemContentSize != null) {
            slv0Var.a(appStartsEventPreferredSystemContentSize.h(), "preferred_system_content_size");
        }
        if (str32 != null) {
            slv0Var.a(str32, "installation_store");
        }
        if (str33 != null) {
            slv0Var.a(str33, "network_proxy_ip");
        }
        if (bool18 != null) {
            slv0Var.a(bool18, "is_vpn");
        }
        if (bool19 != null) {
            slv0Var.a(bool19, "is_tablet");
        }
        if (appStartsEventStoreRegion != null) {
            slv0Var.a(appStartsEventStoreRegion.h(), "store_region");
        }
        return slv0Var;
    }

    public static final s5j0 r(Layout layout, lw5 lw5Var) {
        float f2;
        float f3 = dpy.a;
        Path path = new Path();
        ArrayList arrayList = new ArrayList();
        int lineCount = layout.getLineCount();
        for (int i = 0; i < lineCount; i++) {
            int lineStart = layout.getLineStart(i);
            int lineEnd = layout.getLineEnd(i);
            CharSequence text = layout.getText();
            if ((lineEnd - lineStart != 1 || text.charAt(lineStart) != '\n') && lineStart != lineEnd) {
                RectF rectF = new RectF();
                rectF.set(layout.getLineLeft(i), layout.getLineTop(i), layout.getLineRight(i), layout.getLineBottom(i));
                float f4 = rectF.left;
                lw5.a aVar = lw5Var.f;
                rectF.set(f4 - aVar.a, rectF.top - aVar.b, rectF.right + aVar.c, rectF.bottom + aVar.d);
                arrayList.add(rectF);
            }
        }
        u9p u9pVar = lw5Var.g;
        if (u9pVar instanceof u9p.b) {
            f2 = ((u9p.b) u9pVar).a;
        } else {
            if (u9pVar instanceof u9p.d) {
                ((u9p.d) u9pVar).getClass();
                throw null;
            }
            if (u9pVar instanceof u9p.a) {
                ((u9p.a) u9pVar).getClass();
                throw null;
            }
            f2 = dpy.a;
        }
        for (int h2 = e43.h(arrayList); h2 > 0; h2--) {
            RectF rectF2 = (RectF) arrayList.get(h2);
            RectF rectF3 = (RectF) arrayList.get(h2 - 1);
            float width = rectF2.width() - rectF3.width();
            if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= width && width <= f2) {
                rectF3.left = rectF2.left;
                rectF3.right = rectF2.right;
            }
            if ((-f2) <= width && width <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                rectF2.left = rectF3.left;
                rectF2.right = rectF3.right;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            path.addRect((RectF) it.next(), Path.Direction.CCW);
        }
        return new s5j0(path, new kif0(tni.j(layout), layout.getHeight()), lw5Var);
    }

    public static final Pair[] s(GradientParams gradientParams, int i) {
        int[] iArr;
        try {
            List<GradientPointAndColorMultiplier> list = gradientParams.b;
            iArr = gradientParams.c;
            GradientParams.a(list, i, iArr);
        } catch (IllegalStateException e2) {
            L.i(e2);
            iArr = new int[0];
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i2 : iArr) {
            arrayList.add(new l5g(f870.c(i2)));
        }
        float[] fArr = gradientParams.d;
        ArrayList arrayList2 = new ArrayList(fArr.length);
        int length = fArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            arrayList2.add(new Pair(Float.valueOf(fArr[i3]), arrayList.get(i4)));
            i3++;
            i4++;
        }
        return (Pair[]) arrayList2.toArray(new Pair[0]);
    }

    public static final int t(long j) {
        int i = Math.abs(Float.intBitsToFloat((int) (j >> 32))) >= 0.5f ? 1 : 0;
        return Math.abs(Float.intBitsToFloat((int) (j & 4294967295L))) >= 0.5f ? i | 2 : i;
    }

    public static void u(View view, int i, float f2) {
        d3m.a(view, view.getAlpha(), view.getTranslationY());
        view.animate().alpha(f2).setDuration(300L).start();
    }

    public static boolean v(zf zfVar, Map.Entry entry) {
        V v = zfVar.get(entry.getKey());
        Boolean valueOf = v == 0 ? null : Boolean.valueOf(v.equals(entry.getValue()));
        return valueOf == null ? entry.getValue() == null && zfVar.containsKey(entry.getKey()) : valueOf.booleanValue();
    }

    public static final void w(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS music_tracks");
        sQLiteDatabase.execSQL("CREATE TABLE music_tracks (id INTEGER PRIMARY KEY AUTOINCREMENT, uid INTEGER, mid text NOT NULL, value text NULL, download_state INTEGER NOT NULL DEFAULT 0, manifest_url text DEFAULT NULL, UNIQUE(uid, mid) ON CONFLICT REPLACE)");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS playlists");
        sQLiteDatabase.execSQL("CREATE TABLE playlists (id INTEGER PRIMARY KEY AUTOINCREMENT, uid INTEGER, pid text NOT NULL, value text NULL, download_state INTEGER NOT NULL DEFAULT 0, origin_pid text DEFAULT NULL, UNIQUE(uid, pid) ON CONFLICT REPLACE)");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS playlists_to_tracks");
        sQLiteDatabase.execSQL("CREATE TABLE playlists_to_tracks (id INTEGER PRIMARY KEY AUTOINCREMENT, uid INTEGER, music_track_id INTEGER, playlist_id INTEGER, UNIQUE(uid, music_track_id, playlist_id) ON CONFLICT REPLACE)");
    }

    public static final void y(VkFadeText vkFadeText, Canvas canvas, Layout layout) {
        float lineLeft;
        int lineEnd;
        TextPaint paint = vkFadeText.getPaint();
        paint.setColor(vkFadeText.getCurrentTextColor());
        int lineCount = layout.getLineCount();
        int i = 0;
        while (i < lineCount) {
            int i2 = i + 1;
            int lineTop = layout.getLineTop(i2) - layout.getLineDescent(i);
            int lineStart = layout.getLineStart(i);
            if (layout.getEllipsisCount(i) > 0) {
                lineEnd = layout.getEllipsisStart(i) + lineStart + 1;
                lineLeft = (layout.getWidth() - (layout.getPrimaryHorizontal(lineEnd) - layout.getPrimaryHorizontal(lineStart))) / 2;
            } else {
                lineLeft = layout.getLineLeft(i);
                lineEnd = layout.getLineEnd(i);
            }
            canvas.drawText(layout.getText(), lineStart, lineEnd, lineLeft, lineTop, paint);
            i = i2;
        }
    }

    public static final String z(Integer num, List list) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((e0l0) obj).a == (num == null ? 0 : num).intValue()) {
                break;
            }
        }
        e0l0 e0l0Var = (e0l0) obj;
        if (e0l0Var != null) {
            return e0l0Var.b;
        }
        return null;
    }

    public List L(int i, Triple triple) {
        NewsEntry newsEntry = (NewsEntry) triple.d();
        VideoAttachment videoAttachment = (VideoAttachment) triple.g();
        int intValue = ((Number) triple.h()).intValue();
        ShitAttachment shitAttachment = videoAttachment.h;
        float width = videoAttachment.k.getWidth();
        float height = videoAttachment.k.getHeight();
        VideoFile videoFile = videoAttachment.k;
        return Collections.singletonList(new hcx(newsEntry, videoAttachment, shitAttachment, videoFile, width, height, videoFile.getDuration(), videoAttachment.k.getTitle(), videoAttachment.l, videoAttachment.k.r(), videoAttachment.k.Z9(), fxc0.B().c(videoAttachment.k), videoAttachment.k.getImage(), intValue));
    }

    @Override // xsna.umv
    public String e(boolean z) {
        return "";
    }

    @Override // xsna.znj
    public void g(znj znjVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1325305185);
        int i2 = (M.J(znjVar) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1325305185, i2, -1, "com.vk.design.demo.presentation.screens.legacyMenuScopeContent.<anonymous>.<no name provided>.Content (ContextMenuScreenContent.kt:1151)");
            }
            if (oq.h(-1510011647, M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new uqc(this, znjVar, i, 3);
        }
    }

    @Override // xsna.i100
    public void j(String str, gzs gzsVar) {
    }

    @Override // xsna.i100
    public void k(gzs gzsVar) {
    }

    @Override // xsna.i100
    public void m(String str, gzs gzsVar) {
        Log.e(str, (String) gzsVar.invoke());
    }

    @Override // xsna.i100
    public void o(String str, gzs gzsVar) {
    }

    @Override // xsna.umv
    public String p() {
        return "";
    }

    @Override // xsna.rgq
    public rgp0 track(int i, int i2) {
        return new k0n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gn60
    public /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return L(0, (Triple) pair);
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return Long.valueOf(zznn.zzd());
    }

    @Override // xsna.umv
    public void d() {
    }

    @Override // xsna.rgq
    public void endTracks() {
    }

    @Override // xsna.umv
    public void i() {
    }

    @Override // xsna.umv
    public void init() {
    }

    @Override // xsna.umv
    public void onDraw() {
    }

    @Override // xsna.umv
    public void release() {
    }

    @Override // xsna.umv
    public void b(float[] fArr) {
    }

    @Override // xsna.umv
    public void c(float[] fArr) {
    }

    @Override // xsna.rgq
    public void f(n3i0 n3i0Var) {
    }

    @Override // xsna.umv
    public void h(float f2) {
    }

    @Override // xsna.umv
    public void l(int i) {
    }

    @Override // xsna.umv
    public void n(int i) {
    }

    @Override // xsna.umv
    public void a(int i, int i2) {
    }
}
