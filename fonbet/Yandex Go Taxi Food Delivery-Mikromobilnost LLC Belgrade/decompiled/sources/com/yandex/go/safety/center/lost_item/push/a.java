package com.yandex.go.safety.center.lost_item.push;

import android.graphics.Bitmap;
import android.net.Uri;
import com.adjust.sdk.Constants;
import defpackage.bvu0;
import defpackage.e3n;
import defpackage.jst;
import defpackage.n3h;
import defpackage.ny61;
import defpackage.r85;
import defpackage.u2h;
import defpackage.wnt;
import defpackage.xby;
import defpackage.xk60;
import defpackage.xww0;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.deeplinks.f;
import ru.yandex.taxi.notifications.c;
import ru.yandex.taxi.notifications.push.model.NotificationShareData;
import ru.yandex.taxi.ui.MainUiAvailabilityMonitor;
import ru.yandex.taxi.vendor_api.google.push.FcmNotificationService;

/* loaded from: classes6.dex */
public final class a implements xww0 {
    public final f a;
    public final xk60 b;
    public final c c;
    public final wnt d;
    public final n3h e;
    public final MainUiAvailabilityMonitor f;
    public final com.yandex.go.safety.center.lost_item.data.a g;

    public a(f fVar, xk60 xk60Var, c cVar, wnt wntVar, n3h n3hVar, MainUiAvailabilityMonitor mainUiAvailabilityMonitor, com.yandex.go.safety.center.lost_item.data.a aVar) {
        this.a = fVar;
        this.b = xk60Var;
        this.c = cVar;
        this.d = wntVar;
        this.e = n3hVar;
        this.f = mainUiAvailabilityMonitor;
        this.g = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.xww0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Map map, ContinuationImpl continuationImpl) {
        LostItemsPushHandler$handle$1 lostItemsPushHandler$handle$1;
        int i;
        Uri a;
        int hashCode;
        Object a2;
        String str;
        String str2;
        Object obj;
        long j;
        Long m;
        if (continuationImpl instanceof LostItemsPushHandler$handle$1) {
            lostItemsPushHandler$handle$1 = (LostItemsPushHandler$handle$1) continuationImpl;
            int i2 = lostItemsPushHandler$handle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lostItemsPushHandler$handle$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = lostItemsPushHandler$handle$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lostItemsPushHandler$handle$1.label;
                if (i != 0) {
                    b.b(obj2);
                    String str3 = (String) map.get(Constants.DEEPLINK);
                    if (str3 == null) {
                        return Boolean.FALSE;
                    }
                    Uri parse = Uri.parse(str3);
                    a = this.a.a(parse);
                    if ("lostitems".equals(a.getHost()) && parse.getQueryParameter("order_id") != null) {
                        if (this.f.a) {
                            this.e.a(a, DeeplinkSource.UNSPECIFIED);
                            return Boolean.TRUE;
                        }
                        hashCode = (a.toString() + System.currentTimeMillis()).hashCode();
                        this.g.b.p(hashCode, a.toString());
                        String str4 = (String) map.get("local_channel_id");
                        if (str4 == null) {
                            xby.l(jst.e, "PUSH_ACK:ERROR:NO_CHANNEL_ID", null, null, "No channel id", 2);
                            return Boolean.TRUE;
                        }
                        String str5 = (String) map.get("image_tag");
                        lostItemsPushHandler$handle$1.L$0 = map;
                        lostItemsPushHandler$handle$1.L$1 = null;
                        lostItemsPushHandler$handle$1.L$2 = null;
                        lostItemsPushHandler$handle$1.L$3 = a;
                        lostItemsPushHandler$handle$1.L$4 = null;
                        lostItemsPushHandler$handle$1.L$5 = null;
                        lostItemsPushHandler$handle$1.L$6 = null;
                        lostItemsPushHandler$handle$1.L$7 = str4;
                        lostItemsPushHandler$handle$1.I$0 = hashCode;
                        lostItemsPushHandler$handle$1.label = 1;
                        a2 = this.c.a(e3n.c, str5, lostItemsPushHandler$handle$1);
                        if (a2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        str = str4;
                    }
                    return Boolean.FALSE;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i3 = lostItemsPushHandler$handle$1.I$0;
                String str6 = (String) lostItemsPushHandler$handle$1.L$7;
                a = (Uri) lostItemsPushHandler$handle$1.L$3;
                Map map2 = (Map) lostItemsPushHandler$handle$1.L$0;
                b.b(obj2);
                hashCode = i3;
                map = map2;
                a2 = obj2;
                str = str6;
                Uri uri = a;
                Bitmap bitmap = (Bitmap) a2;
                NotificationShareData.a a3 = r85.a(this.d, map);
                a3.a = hashCode;
                String str7 = (String) map.get(FcmNotificationService.KEY_TITLE);
                str2 = (String) map.get("msg");
                if (str2 == null) {
                    str2 = "";
                }
                String str8 = str2;
                Integer num = new Integer(hashCode);
                String str9 = (String) map.get("collapse_id");
                obj = map.get("expiration_interval");
                if (obj instanceof Number) {
                    j = 0;
                    if ((obj instanceof String) && (m = bvu0.m(10, (String) obj)) != null) {
                        j = m.longValue();
                    }
                } else {
                    j = ((Number) obj).longValue();
                }
                this.b.n(new u2h(num, str7, str8, uri, bitmap, str, str9, TimeUnit.SECONDS.toMillis(j)), a3, (String) map.get("notification_group"));
                return Boolean.TRUE;
            }
        }
        lostItemsPushHandler$handle$1 = new LostItemsPushHandler$handle$1(this, continuationImpl);
        Object obj22 = lostItemsPushHandler$handle$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lostItemsPushHandler$handle$1.label;
        if (i != 0) {
        }
        Uri uri2 = a;
        Bitmap bitmap2 = (Bitmap) a2;
        NotificationShareData.a a32 = r85.a(this.d, map);
        a32.a = hashCode;
        String str72 = (String) map.get(FcmNotificationService.KEY_TITLE);
        str2 = (String) map.get("msg");
        if (str2 == null) {
        }
        String str82 = str2;
        Integer num2 = new Integer(hashCode);
        String str92 = (String) map.get("collapse_id");
        obj = map.get("expiration_interval");
        if (obj instanceof Number) {
        }
        this.b.n(new u2h(num2, str72, str82, uri2, bitmap2, str, str92, TimeUnit.SECONDS.toMillis(j)), a32, (String) map.get("notification_group"));
        return Boolean.TRUE;
    }
}
