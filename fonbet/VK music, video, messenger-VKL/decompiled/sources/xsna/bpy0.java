package xsna;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.push.common.Logger;
import com.vk.push.common.messaging.ClickActionType;
import com.vk.push.common.messaging.NotificationAnalyticsPayload;
import com.vk.push.common.messaging.NotificationPayload;
import com.vk.push.common.messaging.NotificationResourceType;
import com.vk.push.core.data.imageloader.ImageDownloader;
import com.vkontakte.android.R;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutCancellationException;
import ru.rustore.sdk.pushclient.v.c;
import ru.rustore.sdk.pushclient.v.d$a;
import ru.rustore.sdk.pushclient.v.d$b;
import ru.rustore.sdk.pushclient.v.d$c;

/* loaded from: classes9.dex */
public final class bpy0 {
    public final Context a;
    public final op5 b;
    public final dd70 c;
    public final ru.rustore.sdk.pushclient.v.c d;
    public final ImageDownloader e;
    public final Logger f;

    public bpy0(Context context, op5 op5Var, dd70 dd70Var, ru.rustore.sdk.pushclient.v.c cVar, ImageDownloader imageDownloader, Logger logger) {
        this.a = context;
        this.b = op5Var;
        this.c = dd70Var;
        this.d = cVar;
        this.e = imageDownloader;
        this.f = logger.createLogger("NotificationController");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(35:0|1|(2:3|(32:5|6|(1:(1:9)(2:75|76))(2:77|(2:79|(1:81)(1:82))(27:83|11|(2:71|(1:73)(1:74))(1:17)|18|(23:22|23|24|(3:26|(1:28)|(17:30|31|(2:61|(2:63|(1:65))(1:66))(1:35)|36|(1:38)|39|(1:41)|(1:43)|(1:45)(1:60)|46|(1:48)(1:(6:59|50|51|52|53|54))|49|50|51|52|53|54))|67|31|(1:33)|61|(0)(0)|36|(0)|39|(0)|(0)|(0)(0)|46|(0)(0)|49|50|51|52|53|54)|70|24|(0)|67|31|(0)|61|(0)(0)|36|(0)|39|(0)|(0)|(0)(0)|46|(0)(0)|49|50|51|52|53|54))|10|11|(1:13)|71|(0)(0)|18|(24:20|22|23|24|(0)|67|31|(0)|61|(0)(0)|36|(0)|39|(0)|(0)|(0)(0)|46|(0)(0)|49|50|51|52|53|54)|70|24|(0)|67|31|(0)|61|(0)(0)|36|(0)|39|(0)|(0)|(0)(0)|46|(0)(0)|49|50|51|52|53|54))|84|6|(0)(0)|10|11|(0)|71|(0)(0)|18|(0)|70|24|(0)|67|31|(0)|61|(0)(0)|36|(0)|39|(0)|(0)|(0)(0)|46|(0)(0)|49|50|51|52|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x021f, code lost:
    
        com.vk.push.common.Logger.DefaultImpls.warn$default(r3, "Post notification permission is missing", null, 2, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(NotificationPayload notificationPayload, int i, Pair pair, NotificationAnalyticsPayload notificationAnalyticsPayload, ContinuationImpl continuationImpl) {
        d$c d_c;
        int i2;
        NotificationPayload notificationPayload2;
        int i3;
        Pair pair2;
        NotificationAnalyticsPayload notificationAnalyticsPayload2;
        bpy0 bpy0Var;
        Bitmap bitmap;
        String icon;
        Pair pair3;
        String color;
        Pair pair4;
        String body;
        Integer num;
        String clickAction;
        String str;
        ClickActionType clickActionType;
        String str2;
        Intent intent;
        boolean z;
        int identifier;
        if (continuationImpl instanceof d$c) {
            d_c = (d$c) continuationImpl;
            int i4 = d_c.h;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                d_c.h = i4 - Integer.MIN_VALUE;
                Object obj = d_c.f;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = d_c.h;
                if (i2 != 0) {
                    kotlin.a.a(obj);
                    Logger.DefaultImpls.info$default(this.f, "Show notification requested", null, 2, null);
                    String image = notificationPayload.getImage();
                    if (image == null) {
                        notificationPayload2 = notificationPayload;
                        i3 = i;
                        pair2 = pair;
                        notificationAnalyticsPayload2 = notificationAnalyticsPayload;
                        bpy0Var = this;
                        bitmap = null;
                        bpy0Var.getClass();
                        Logger logger = bpy0Var.f;
                        bpn0 bpn0Var = bpy0Var.d.b;
                        Context context = bpy0Var.a;
                        icon = notificationPayload2.getIcon();
                        if (icon != null || drm0.N(icon) || (identifier = context.getResources().getIdentifier(notificationPayload2.getIcon(), "drawable", context.getPackageName())) == 0) {
                            Integer num2 = ((c.a) bpn0Var.getValue()).a;
                            pair3 = num2 != null ? new Pair(num2, NotificationResourceType.MANIFEST) : new Pair(Integer.valueOf(R.drawable.vkpns_default_notification_icon), NotificationResourceType.DEFAULT_SDK);
                        } else {
                            pair3 = new Pair(Integer.valueOf(identifier), NotificationResourceType.PAYLOAD);
                        }
                        color = notificationPayload2.getColor();
                        if (color != null && !drm0.N(color)) {
                            try {
                                pair4 = new Pair(Integer.valueOf(Color.parseColor(notificationPayload2.getColor())), NotificationResourceType.PAYLOAD);
                            } catch (IllegalArgumentException unused) {
                                Logger.DefaultImpls.error$default(logger, "Could not parse color: " + notificationPayload2.getColor(), null, 2, null);
                            }
                            op5 op5Var = bpy0Var.b;
                            String title = notificationPayload2.getTitle();
                            body = notificationPayload2.getBody();
                            int intValue = ((Number) pair3.i()).intValue();
                            num = (Integer) pair4.i();
                            clickAction = notificationPayload2.getClickAction();
                            if (clickAction != null) {
                                if (drm0.N(clickAction)) {
                                    clickAction = null;
                                }
                                if (clickAction != null) {
                                    str = clickAction;
                                    clickActionType = notificationPayload2.getClickActionType();
                                    String str3 = (String) pair2.i();
                                    Context context2 = (Context) op5Var.b;
                                    NotificationCompat.h hVar = new NotificationCompat.h(context2, str3);
                                    hVar.k(title);
                                    hVar.j(body);
                                    if (clickActionType == ClickActionType.DEEP_LINK || str.length() <= 0) {
                                        str2 = str;
                                        if (str2.equals("android.intent.action.MAIN")) {
                                            intent = new Intent(str2);
                                        } else {
                                            intent = context2.getPackageManager().getLaunchIntentForPackage(context2.getPackageName());
                                            if (intent == null) {
                                                intent = new Intent(str2);
                                            }
                                        }
                                    } else {
                                        intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str));
                                    }
                                    intent.putExtra("vkpns.click_event_marker", "");
                                    intent.putExtra("vkpns.click_event_marker.request_code", i3);
                                    if (notificationAnalyticsPayload2 != null) {
                                        intent.putExtra("vkpns.analytics_payload.push_token_part", notificationAnalyticsPayload2.getPushTokenPart());
                                        intent.putExtra("vkpns.analytics_payload.message_id", notificationAnalyticsPayload2.getMessageId());
                                    }
                                    intent.setPackage(context2.getPackageName());
                                    intent.setFlags(335544320);
                                    hVar.g = PendingIntent.getActivity(context2, i3, intent, 201326592);
                                    hVar.I.icon = intValue;
                                    if (num != null) {
                                        hVar.w = num.intValue();
                                    }
                                    if (bitmap != null) {
                                        hVar.q(bitmap);
                                    }
                                    if ((body == null ? body.length() : 0) < 35) {
                                        NotificationCompat.f fVar = new NotificationCompat.f();
                                        fVar.e = NotificationCompat.h.d(body);
                                        hVar.B(fVar);
                                    } else if (bitmap != null) {
                                        NotificationCompat.e eVar = new NotificationCompat.e();
                                        eVar.e = IconCompat.c(bitmap);
                                        eVar.f = null;
                                        z = true;
                                        eVar.g = true;
                                        hVar.B(eVar);
                                        hVar.e(z);
                                        bpy0Var.c.a(hVar.c(), i3);
                                        return s3q0.a;
                                    }
                                    z = true;
                                    hVar.e(z);
                                    bpy0Var.c.a(hVar.c(), i3);
                                    return s3q0.a;
                                }
                            }
                            str = "android.intent.action.MAIN";
                            clickActionType = notificationPayload2.getClickActionType();
                            String str32 = (String) pair2.i();
                            Context context22 = (Context) op5Var.b;
                            NotificationCompat.h hVar2 = new NotificationCompat.h(context22, str32);
                            hVar2.k(title);
                            hVar2.j(body);
                            if (clickActionType == ClickActionType.DEEP_LINK) {
                            }
                            str2 = str;
                            if (str2.equals("android.intent.action.MAIN")) {
                            }
                            intent.putExtra("vkpns.click_event_marker", "");
                            intent.putExtra("vkpns.click_event_marker.request_code", i3);
                            if (notificationAnalyticsPayload2 != null) {
                            }
                            intent.setPackage(context22.getPackageName());
                            intent.setFlags(335544320);
                            hVar2.g = PendingIntent.getActivity(context22, i3, intent, 201326592);
                            hVar2.I.icon = intValue;
                            if (num != null) {
                            }
                            if (bitmap != null) {
                            }
                            if ((body == null ? body.length() : 0) < 35) {
                            }
                            z = true;
                            hVar2.e(z);
                            bpy0Var.c.a(hVar2.c(), i3);
                            return s3q0.a;
                        }
                        pair4 = new Pair(((c.a) bpn0Var.getValue()).b, NotificationResourceType.MANIFEST);
                        op5 op5Var2 = bpy0Var.b;
                        String title2 = notificationPayload2.getTitle();
                        body = notificationPayload2.getBody();
                        int intValue2 = ((Number) pair3.i()).intValue();
                        num = (Integer) pair4.i();
                        clickAction = notificationPayload2.getClickAction();
                        if (clickAction != null) {
                        }
                        str = "android.intent.action.MAIN";
                        clickActionType = notificationPayload2.getClickActionType();
                        String str322 = (String) pair2.i();
                        Context context222 = (Context) op5Var2.b;
                        NotificationCompat.h hVar22 = new NotificationCompat.h(context222, str322);
                        hVar22.k(title2);
                        hVar22.j(body);
                        if (clickActionType == ClickActionType.DEEP_LINK) {
                        }
                        str2 = str;
                        if (str2.equals("android.intent.action.MAIN")) {
                        }
                        intent.putExtra("vkpns.click_event_marker", "");
                        intent.putExtra("vkpns.click_event_marker.request_code", i3);
                        if (notificationAnalyticsPayload2 != null) {
                        }
                        intent.setPackage(context222.getPackageName());
                        intent.setFlags(335544320);
                        hVar22.g = PendingIntent.getActivity(context222, i3, intent, 201326592);
                        hVar22.I.icon = intValue2;
                        if (num != null) {
                        }
                        if (bitmap != null) {
                        }
                        if ((body == null ? body.length() : 0) < 35) {
                        }
                        z = true;
                        hVar22.e(z);
                        bpy0Var.c.a(hVar22.c(), i3);
                        return s3q0.a;
                    }
                    d_c.a = this;
                    notificationPayload2 = notificationPayload;
                    d_c.b = notificationPayload2;
                    pair2 = pair;
                    d_c.c = pair2;
                    notificationAnalyticsPayload2 = notificationAnalyticsPayload;
                    d_c.d = notificationAnalyticsPayload2;
                    i3 = i;
                    d_c.e = i3;
                    d_c.h = 1;
                    obj = b(image, d_c);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    bpy0Var = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = d_c.e;
                    NotificationAnalyticsPayload notificationAnalyticsPayload3 = d_c.d;
                    pair2 = d_c.c;
                    NotificationPayload notificationPayload3 = d_c.b;
                    bpy0Var = d_c.a;
                    kotlin.a.a(obj);
                    notificationAnalyticsPayload2 = notificationAnalyticsPayload3;
                    notificationPayload2 = notificationPayload3;
                    i3 = i5;
                }
                bitmap = (Bitmap) obj;
                bpy0Var.getClass();
                Logger logger2 = bpy0Var.f;
                bpn0 bpn0Var2 = bpy0Var.d.b;
                Context context3 = bpy0Var.a;
                icon = notificationPayload2.getIcon();
                if (icon != null) {
                }
                Integer num22 = ((c.a) bpn0Var2.getValue()).a;
                if (num22 != null) {
                }
                color = notificationPayload2.getColor();
                if (color != null) {
                    pair4 = new Pair(Integer.valueOf(Color.parseColor(notificationPayload2.getColor())), NotificationResourceType.PAYLOAD);
                    op5 op5Var22 = bpy0Var.b;
                    String title22 = notificationPayload2.getTitle();
                    body = notificationPayload2.getBody();
                    int intValue22 = ((Number) pair3.i()).intValue();
                    num = (Integer) pair4.i();
                    clickAction = notificationPayload2.getClickAction();
                    if (clickAction != null) {
                    }
                    str = "android.intent.action.MAIN";
                    clickActionType = notificationPayload2.getClickActionType();
                    String str3222 = (String) pair2.i();
                    Context context2222 = (Context) op5Var22.b;
                    NotificationCompat.h hVar222 = new NotificationCompat.h(context2222, str3222);
                    hVar222.k(title22);
                    hVar222.j(body);
                    if (clickActionType == ClickActionType.DEEP_LINK) {
                    }
                    str2 = str;
                    if (str2.equals("android.intent.action.MAIN")) {
                    }
                    intent.putExtra("vkpns.click_event_marker", "");
                    intent.putExtra("vkpns.click_event_marker.request_code", i3);
                    if (notificationAnalyticsPayload2 != null) {
                    }
                    intent.setPackage(context2222.getPackageName());
                    intent.setFlags(335544320);
                    hVar222.g = PendingIntent.getActivity(context2222, i3, intent, 201326592);
                    hVar222.I.icon = intValue22;
                    if (num != null) {
                    }
                    if (bitmap != null) {
                    }
                    if ((body == null ? body.length() : 0) < 35) {
                    }
                    z = true;
                    hVar222.e(z);
                    bpy0Var.c.a(hVar222.c(), i3);
                    return s3q0.a;
                }
                pair4 = new Pair(((c.a) bpn0Var2.getValue()).b, NotificationResourceType.MANIFEST);
                op5 op5Var222 = bpy0Var.b;
                String title222 = notificationPayload2.getTitle();
                body = notificationPayload2.getBody();
                int intValue222 = ((Number) pair3.i()).intValue();
                num = (Integer) pair4.i();
                clickAction = notificationPayload2.getClickAction();
                if (clickAction != null) {
                }
                str = "android.intent.action.MAIN";
                clickActionType = notificationPayload2.getClickActionType();
                String str32222 = (String) pair2.i();
                Context context22222 = (Context) op5Var222.b;
                NotificationCompat.h hVar2222 = new NotificationCompat.h(context22222, str32222);
                hVar2222.k(title222);
                hVar2222.j(body);
                if (clickActionType == ClickActionType.DEEP_LINK) {
                }
                str2 = str;
                if (str2.equals("android.intent.action.MAIN")) {
                }
                intent.putExtra("vkpns.click_event_marker", "");
                intent.putExtra("vkpns.click_event_marker.request_code", i3);
                if (notificationAnalyticsPayload2 != null) {
                }
                intent.setPackage(context22222.getPackageName());
                intent.setFlags(335544320);
                hVar2222.g = PendingIntent.getActivity(context22222, i3, intent, 201326592);
                hVar2222.I.icon = intValue222;
                if (num != null) {
                }
                if (bitmap != null) {
                }
                if ((body == null ? body.length() : 0) < 35) {
                }
                z = true;
                hVar2222.e(z);
                bpy0Var.c.a(hVar2222.c(), i3);
                return s3q0.a;
            }
        }
        d_c = new d$c(this, continuationImpl);
        Object obj2 = d_c.f;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = d_c.h;
        if (i2 != 0) {
        }
        bitmap = (Bitmap) obj2;
        bpy0Var.getClass();
        Logger logger22 = bpy0Var.f;
        bpn0 bpn0Var22 = bpy0Var.d.b;
        Context context32 = bpy0Var.a;
        icon = notificationPayload2.getIcon();
        if (icon != null) {
        }
        Integer num222 = ((c.a) bpn0Var22.getValue()).a;
        if (num222 != null) {
        }
        color = notificationPayload2.getColor();
        if (color != null) {
        }
        pair4 = new Pair(((c.a) bpn0Var22.getValue()).b, NotificationResourceType.MANIFEST);
        op5 op5Var2222 = bpy0Var.b;
        String title2222 = notificationPayload2.getTitle();
        body = notificationPayload2.getBody();
        int intValue2222 = ((Number) pair3.i()).intValue();
        num = (Integer) pair4.i();
        clickAction = notificationPayload2.getClickAction();
        if (clickAction != null) {
        }
        str = "android.intent.action.MAIN";
        clickActionType = notificationPayload2.getClickActionType();
        String str322222 = (String) pair2.i();
        Context context222222 = (Context) op5Var2222.b;
        NotificationCompat.h hVar22222 = new NotificationCompat.h(context222222, str322222);
        hVar22222.k(title2222);
        hVar22222.j(body);
        if (clickActionType == ClickActionType.DEEP_LINK) {
        }
        str2 = str;
        if (str2.equals("android.intent.action.MAIN")) {
        }
        intent.putExtra("vkpns.click_event_marker", "");
        intent.putExtra("vkpns.click_event_marker.request_code", i3);
        if (notificationAnalyticsPayload2 != null) {
        }
        intent.setPackage(context222222.getPackageName());
        intent.setFlags(335544320);
        hVar22222.g = PendingIntent.getActivity(context222222, i3, intent, 201326592);
        hVar22222.I.icon = intValue2222;
        if (num != null) {
        }
        if (bitmap != null) {
        }
        if ((body == null ? body.length() : 0) < 35) {
        }
        z = true;
        hVar22222.e(z);
        bpy0Var.c.a(hVar22222.c(), i3);
        return s3q0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        d$a d_a;
        int i;
        bpy0 bpy0Var;
        if (continuationImpl instanceof d$a) {
            d_a = (d$a) continuationImpl;
            int i2 = d_a.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d_a.d = i2 - Integer.MIN_VALUE;
                Object obj = d_a.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = d_a.d;
                if (i != 0) {
                    kotlin.a.a(obj);
                    try {
                        d$b d_b = new d$b(this, str, null);
                        d_a.a = this;
                        d_a.d = 1;
                        obj = oxo0.b(5000L, d_b, d_a);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        bpy0Var = this;
                    } catch (TimeoutCancellationException unused) {
                        bpy0Var = this;
                        Logger.DefaultImpls.warn$default(bpy0Var.f, "Unable to download image for 5000 ms", null, 2, null);
                        return null;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bpy0Var = d_a.a;
                    try {
                        kotlin.a.a(obj);
                    } catch (TimeoutCancellationException unused2) {
                        Logger.DefaultImpls.warn$default(bpy0Var.f, "Unable to download image for 5000 ms", null, 2, null);
                        return null;
                    }
                }
                return (Bitmap) obj;
            }
        }
        d_a = new d$a(this, continuationImpl);
        Object obj2 = d_a.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = d_a.d;
        if (i != 0) {
        }
        return (Bitmap) obj2;
    }
}
