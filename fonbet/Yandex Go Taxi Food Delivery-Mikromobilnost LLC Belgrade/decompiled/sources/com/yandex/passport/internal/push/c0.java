package com.yandex.passport.internal.push;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.yandex.passport.api.PassportAccountType;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.entities.Filter;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.ui.sloth.webcard.WebCardComposeActivity;
import com.yandex.passport.internal.ui.sloth.webcard.WebCardSlothActivity;
import com.yandex.passport.sloth.data.PicturePushState;
import com.yandex.passport.sloth.data.PushType;
import com.yandex.passport.sloth.data.SlothParams;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.Result;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes8.dex */
public final class c0 {
    public final Context a;
    public final com.yandex.passport.common.common.a b;
    public final com.yandex.passport.common.analytics.d c;
    public final com.yandex.passport.internal.flags.j d;

    public c0(Context context, com.yandex.passport.common.common.a aVar, com.yandex.passport.common.analytics.d dVar, com.yandex.passport.internal.flags.j jVar) {
        this.a = context;
        this.b = aVar;
        this.c = dVar;
        this.d = jVar;
    }

    public static LoginProperties f(Uid uid) {
        PassportUidImpl A = com.yandex.passport.internal.util.p.A(uid);
        Filter.a aVar = new Filter.a();
        aVar.e(com.yandex.passport.internal.util.p.y(uid.getEnvironment()));
        aVar.b(PassportAccountType.SOCIAL);
        return new LoginProperties(null, false, null, aVar.a(), null, null, A, false, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, null, false, null, 2147483575, null);
    }

    public final PendingIntent a(int i, Intent intent) {
        intent.addFlags(268437504);
        intent.setAction("push_action_" + System.currentTimeMillis());
        return PendingIntent.getActivity(this.a, i, intent, 1140850688);
    }

    public final PendingIntent b(Uid uid, PicturePayload picturePayload, PicturePushState picturePushState) {
        String webviewUrl = picturePayload.getWebviewUrl();
        String trackId = picturePayload.getTrackId();
        int notificationId = picturePayload.getNotificationId();
        LoginProperties f = f(uid);
        com.yandex.passport.common.url.a aVar = com.yandex.passport.common.url.b.Companion;
        Uri parse = Uri.parse(webviewUrl);
        aVar.getClass();
        return a(picturePayload.hashCode() + picturePayload.getNotificationId(), d(g(f, new com.yandex.passport.sloth.data.u(trackId, picturePushState, parse.toString(), uid, com.yandex.passport.internal.properties.u.W(f.getTheme()), notificationId))));
    }

    public final PendingIntent c(Context context, int i, String str, Uid uid, String str2, String str3, String str4) {
        Intent putExtra = new Intent(context, (Class<?>) NotificationDismissedReceiver.class).setAction(NotificationDismissedReceiver.NOTIFICATION_DISMISS).putExtra(CommonUrlParts.APP_ID, ((com.yandex.passport.internal.common.e) this.b).a());
        Object i2 = com.yandex.passport.common.util.a.i(new PushIntentProvider$getDeviceId$1(this, null));
        if (i2 instanceof Result.Failure) {
            i2 = null;
        }
        com.yandex.passport.common.value.a aVar = (com.yandex.passport.common.value.a) i2;
        String str5 = aVar != null ? aVar.a : null;
        return PendingIntent.getBroadcast(context, i, putExtra.putExtra(MetaDataField.DEVICE_ID_FIELD, str5 != null ? str5 : null).putExtra("notification_message", str).putExtra("uid", com.yandex.passport.internal.ui.sloth.e.r(uid)).putExtra("push_id", str2).putExtra("track_id", str3).putExtra("push_platform", str4), 1140850688);
    }

    public final Intent d(SlothParams slothParams) {
        Intent intent = new Intent(this.a, (Class<?>) (((Boolean) this.d.b(com.yandex.passport.internal.flags.q.c0)).booleanValue() ? WebCardComposeActivity.class : WebCardSlothActivity.class));
        intent.putExtras(new Bundle[]{slothParams.toBundle()}[0]);
        intent.addFlags(SelfTester_JCP.IMITA);
        return intent;
    }

    public final SlothParams e(Uid uid, String str, PushType pushType) {
        LoginProperties f = f(uid);
        com.yandex.passport.common.url.a aVar = com.yandex.passport.common.url.b.Companion;
        Uri parse = Uri.parse(str);
        aVar.getClass();
        return g(f, new com.yandex.passport.sloth.data.b0(parse.toString(), uid, com.yandex.passport.internal.properties.u.W(f.getTheme()), pushType));
    }

    public final SlothParams g(LoginProperties loginProperties, com.yandex.passport.sloth.data.h hVar) {
        return new SlothParams(hVar, com.yandex.passport.internal.util.p.u(loginProperties.getFilter().getPrimaryEnvironment()), null, com.yandex.passport.internal.properties.u.J(loginProperties.getWebAmProperties(), ((Boolean) this.d.b(com.yandex.passport.internal.flags.q.z)).booleanValue()), 4, null);
    }
}
