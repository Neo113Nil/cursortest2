package com.yandex.passport.internal.social;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.yandex.passport.R;
import com.yandex.passport.internal.properties.u;
import defpackage.ngz;
import defpackage.w53;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.yandex.video.m3.player.ugc_live.UgcLiveVideoData;

/* loaded from: classes15.dex */
public class VkNativeSocialAuthActivity extends AppCompatActivity {
    private static final Map<String, Integer> PACKAGE_NAME_TO_APPLICATION_ID;
    private static final int REQUEST_ID_LOGIN = 1;
    private static final List<String> SCOPES = Collections.singletonList(UgcLiveVideoData.UgcLiveStatus.OFFLINE);
    private Integer vkontakteApplicationId;

    static {
        w53 w53Var = new w53();
        PACKAGE_NAME_TO_APPLICATION_ID = w53Var;
        w53Var.put("com.yandex.browser", 4168423);
        w53Var.put("com.yandex.mobile.drive", 6266343);
        w53Var.put("com.yandex.yamb", 6223342);
        w53Var.put("com.yandex.zen", 6407405);
        w53Var.put("com.yandex.zen.logged", 6451395);
        w53Var.put("com.yandex.zen.logged.debug", 6451404);
        w53Var.put("ru.yandex.direct", 6223332);
        w53Var.put("ru.yandex.disk", 5396931);
        w53Var.put("ru.yandex.mail", 6222625);
        w53Var.put("ru.yandex.market", 5205642);
        w53Var.put("ru.yandex.med", 6119393);
        w53Var.put("ru.yandex.mobile.avia", 6222647);
        w53Var.put("ru.yandex.mobile.metrica", 5785050);
        w53Var.put("ru.yandex.money", 5707554);
        w53Var.put("ru.yandex.music", 4579733);
        w53Var.put("ru.yandex.parking", 4878344);
        w53Var.put("ru.yandex.radio", 4944202);
        w53Var.put("ru.yandex.rasp", 6222636);
        w53Var.put("ru.yandex.searchplugin", 6222615);
        w53Var.put("ru.yandex.taxi", 6223320);
        w53Var.put("ru.yandex.translate", 6222643);
        w53Var.put("ru.yandex.weatherplugin", 6125442);
        w53Var.put("ru.yandex.yandexbus", 6222472);
        w53Var.put("ru.yandex.yandexmaps", 6222456);
        w53Var.put("ru.yandex.yandexnavi", 6222075);
        w53Var.put("ru.yandex.market.fulfillment", 6362460);
        w53Var.put("com.yandex.passport.testapp1", 6044616);
        w53Var.put("ru.yandex.auth.client", 5743171);
    }

    public static Integer getVkApplicationId(Context context) {
        try {
            return Integer.valueOf(context.getResources().getInteger(R.integer.passport_vk_application_id));
        } catch (Resources.NotFoundException unused) {
            return PACKAGE_NAME_TO_APPLICATION_ID.get(context.getPackageName());
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        HashMap hashMap;
        super.onActivityResult(i, i2, intent);
        if (i != 1 || i2 != -1 || intent == null) {
            NativeSocialHelper.onCancel(this);
            return;
        }
        if (intent.getExtras() != null) {
            hashMap = new HashMap();
            for (String str : intent.getExtras().keySet()) {
                hashMap.put(str, String.valueOf(intent.getExtras().get(str)));
            }
        } else {
            hashMap = null;
        }
        String str2 = hashMap != null ? (String) hashMap.get("access_token") : null;
        if (str2 != null) {
            NativeSocialHelper.onTokenReceived(this, str2, Integer.toString(this.vkontakteApplicationId.intValue()));
            return;
        }
        ngz ngzVar = new ngz();
        ngzVar.b = -101;
        ngzVar.d = (String) hashMap.get("error_reason");
        String decode = Uri.decode((String) hashMap.get("error_description"));
        ngzVar.c = decode;
        if (hashMap.containsKey("fail")) {
            ngzVar.d = "Action failed";
        }
        if (hashMap.containsKey("cancel")) {
            ngzVar.b = -102;
            ngzVar.d = "User canceled request";
        }
        if (decode != null || ngzVar.d != null) {
            ngzVar = new ngz();
            ngzVar.b = -102;
        }
        if (ngzVar.b == -102) {
            NativeSocialHelper.onCancel(this);
        } else {
            NativeSocialHelper.onFailure(this, new Exception(ngzVar.c));
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Integer vkApplicationId = getVkApplicationId(this);
        this.vkontakteApplicationId = vkApplicationId;
        if (vkApplicationId == null) {
            com.yandex.passport.legacy.a.a("Native authorization not available: vk application ID for you application not found . Please contact with library developers");
            NativeSocialHelper.onNativeNotSupported(this);
            return;
        }
        if (bundle == null) {
            Iterator<ResolveInfo> it = getPackageManager().queryIntentActivities(new Intent("com.vkontakte.android.action.SDK_AUTH", (Uri) null), 0).iterator();
            while (it.hasNext()) {
                if (it.next().activityInfo.enabled) {
                    try {
                        startActivityForResult(u.n(this.vkontakteApplicationId.intValue(), SCOPES), 1);
                        return;
                    } catch (Exception e) {
                        com.yandex.passport.legacy.a.d(e);
                        NativeSocialHelper.onNativeNotSupported(this);
                        return;
                    }
                }
            }
            NativeSocialHelper.onNativeNotSupported(this);
        }
    }
}
