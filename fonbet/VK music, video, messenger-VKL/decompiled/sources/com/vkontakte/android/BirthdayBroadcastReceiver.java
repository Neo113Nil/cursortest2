package com.vkontakte.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.ironsource.C4243ba;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.log.L;
import com.vk.metrics.eventtracking.b;
import com.vk.toggle.anonymous.SakFeatures;
import com.vkontakte.android.ui.widget.MenuListView;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.reactivex.rxjava3.internal.operators.observable.f0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import xsna.aa7;
import xsna.de4;
import xsna.dp0;
import xsna.e43;
import xsna.j2r0;
import xsna.le50;
import xsna.r1r0;
import xsna.rsg0;
import xsna.ufx;
import xsna.ur;
import xsna.vr;
import xsna.x870;
import xsna.yfb;
import xsna.z97;

/* loaded from: classes7.dex */
public class BirthdayBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    public static void a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            UserProfile userProfile = (UserProfile) it.next();
            String str = userProfile.e;
            if (str != null && str.trim().length() != 0) {
                arrayList2.add(userProfile.e);
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        x870.a.c("default_ver2", false, new dp0(2, e43.a, arrayList2), new de4(2));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i = Preference.l().getInt("last_birthday_notify", 0);
        if (!intent.getBooleanExtra("force", false)) {
            Date date = new Date(System.currentTimeMillis());
            if (i == (date.getYear() * 10000) + (date.getMonth() * 100) + date.getDate()) {
                return;
            }
            SharedPreferences.Editor edit = Preference.l().edit();
            Date date2 = new Date(System.currentTimeMillis());
            edit.putInt("last_birthday_notify", (date2.getYear() * 10000) + (date2.getMonth() * 100) + date2.getDate()).apply();
        }
        String stringExtra = intent.getStringExtra(ApiProtocol.PARAM_UIDS);
        if (!TextUtils.isEmpty(stringExtra)) {
            ArrayList arrayList = new ArrayList();
            for (String str : stringExtra.split(StringUtils.COMMA)) {
                try {
                    arrayList.add(new UserId(Long.parseLong(str)));
                } catch (NumberFormatException e) {
                    L.f("vk", "Parse uid error", e);
                }
            }
            j2r0 j2r0Var = new j2r0();
            if (SakFeatures.Type.SAK_MIGRATION_USERS_GET_TO_ACC_GET_4.h()) {
                ArrayList arrayList2 = new ArrayList(1);
                Object obj = new Object[]{"photo_base"}[0];
                Objects.requireNonNull(obj);
                arrayList2.add(obj);
                List unmodifiableList = Collections.unmodifiableList(arrayList2);
                ufx ufxVar = new ufx("account.get", new ur(false), new vr(false));
                ufx.o(ufxVar, "user_ids", arrayList, 12);
                if (unmodifiableList != null) {
                    ufxVar.h("fields", unmodifiableList);
                }
                ufx.n(ufxVar, "name_case", C4243ba.n, 0, 12);
                f0 W = rsg0.W(yfb.x(ufxVar), 7);
                z97 z97Var = new z97();
                b bVar = b.a;
                Objects.requireNonNull(bVar);
                W.subscribe(z97Var, new le50(bVar, 25));
            } else {
                Object[] objArr = {UsersFieldsDto.PHOTO_BASE};
                ArrayList arrayList3 = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList3.add(obj2);
                f0 W2 = rsg0.W(yfb.x(r1r0.a.a(arrayList, null, Collections.unmodifiableList(arrayList3), C4243ba.n, null)), 7);
                aa7 aa7Var = new aa7(j2r0Var, 0);
                b bVar2 = b.a;
                Objects.requireNonNull(bVar2);
                W2.subscribe(aa7Var, new le50(bVar2, 25));
            }
        }
        MenuListView menuListView = MenuListView.L;
        if (menuListView != null) {
            menuListView.h();
        }
    }
}
