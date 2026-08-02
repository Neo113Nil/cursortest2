package com.yandex.passport.internal.push;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.RingtoneManager;
import android.net.Uri;
import android.widget.RemoteViews;
import com.yandex.passport.R;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.sloth.data.PicturePushState;
import com.yandex.passport.sloth.data.PushType;
import defpackage.evu0;
import defpackage.j73;
import defpackage.ny61;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class i {
    public final Context a;
    public final z b;
    public final c0 c;

    public i(Context context, z zVar, c0 c0Var) {
        this.a = context;
        this.b = zVar;
        this.c = c0Var;
    }

    public static void b(RemoteViews remoteViews, List list) {
        remoteViews.setImageViewBitmap(R.id.picture_1, (Bitmap) list.get(0));
        remoteViews.setImageViewBitmap(R.id.picture_2, (Bitmap) list.get(1));
        remoteViews.setImageViewBitmap(R.id.picture_3, (Bitmap) list.get(2));
        remoteViews.setImageViewBitmap(R.id.picture_4, (Bitmap) list.get(3));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(2:3|(4:5|6|7|(1:(8:10|11|12|13|(1:15)|16|17|(2:19|(1:21)(6:23|13|(0)|16|17|(2:24|(1:26)(11:27|(4:30|(3:32|33|34)(1:36)|35|28)|37|38|(1:40)|41|42|43|(2:45|(1:47))|48|(1:52)(2:50|51)))(0)))(0))(2:54|55))(4:56|57|17|(0)(0))))|60|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0047, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0244, code lost:
    
        r8 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0097 A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:11:0x003e, B:13:0x0093, B:15:0x0097, B:17:0x0068, B:19:0x006e, B:24:0x009c, B:27:0x00a6, B:28:0x00c4, B:30:0x00ca, B:33:0x00d7, B:38:0x00db, B:41:0x00ef, B:57:0x0053), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006e A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:11:0x003e, B:13:0x0093, B:15:0x0097, B:17:0x0068, B:19:0x006e, B:24:0x009c, B:27:0x00a6, B:28:0x00c4, B:30:0x00ca, B:33:0x00d7, B:38:0x00db, B:41:0x00ef, B:57:0x0053), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009c A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:11:0x003e, B:13:0x0093, B:15:0x0097, B:17:0x0068, B:19:0x006e, B:24:0x009c, B:27:0x00a6, B:28:0x00c4, B:30:0x00ca, B:33:0x00d7, B:38:0x00db, B:41:0x00ef, B:57:0x0053), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v18, types: [androidx.core.app.v] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0091 -> B:13:0x0093). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PicturePayload picturePayload, Uid uid, ContinuationImpl continuationImpl) {
        NotificationPictureBuilder$buildNotification$1 notificationPictureBuilder$buildNotification$1;
        i iVar;
        int i;
        Uid uid2;
        ArrayList arrayList;
        Iterator it;
        PicturePayload picturePayload2;
        if (continuationImpl instanceof NotificationPictureBuilder$buildNotification$1) {
            notificationPictureBuilder$buildNotification$1 = (NotificationPictureBuilder$buildNotification$1) continuationImpl;
            int i2 = notificationPictureBuilder$buildNotification$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                notificationPictureBuilder$buildNotification$1.label = i2 - Integer.MIN_VALUE;
                iVar = this;
                Object obj = notificationPictureBuilder$buildNotification$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = notificationPictureBuilder$buildNotification$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List<Integer> pictures = picturePayload.getPictures();
                    uid2 = uid;
                    arrayList = new ArrayList();
                    it = pictures.iterator();
                    picturePayload2 = picturePayload;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Iterator it2 = (Iterator) notificationPictureBuilder$buildNotification$1.L$4;
                    ?? r4 = (Collection) notificationPictureBuilder$buildNotification$1.L$3;
                    i iVar2 = (i) notificationPictureBuilder$buildNotification$1.L$2;
                    Uid uid3 = (Uid) notificationPictureBuilder$buildNotification$1.L$1;
                    PicturePayload picturePayload3 = (PicturePayload) notificationPictureBuilder$buildNotification$1.L$0;
                    kotlin.b.b(obj);
                    it = it2;
                    iVar = iVar2;
                    arrayList = r4;
                    uid2 = uid3;
                    Bitmap bitmap = (Bitmap) obj;
                    if (bitmap != null) {
                        arrayList.add(bitmap);
                    }
                    picturePayload2 = picturePayload3;
                    if (it.hasNext()) {
                        int intValue = ((Number) it.next()).intValue();
                        z zVar = iVar.b;
                        Environment environment = uid2.getEnvironment();
                        notificationPictureBuilder$buildNotification$1.L$0 = picturePayload2;
                        notificationPictureBuilder$buildNotification$1.L$1 = uid2;
                        notificationPictureBuilder$buildNotification$1.L$2 = iVar;
                        notificationPictureBuilder$buildNotification$1.L$3 = arrayList;
                        notificationPictureBuilder$buildNotification$1.L$4 = it;
                        notificationPictureBuilder$buildNotification$1.label = 1;
                        Object b = zVar.b(environment, intValue, notificationPictureBuilder$buildNotification$1);
                        if (b == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        picturePayload3 = picturePayload2;
                        obj = b;
                        Bitmap bitmap2 = (Bitmap) obj;
                        if (bitmap2 != null) {
                        }
                        picturePayload2 = picturePayload3;
                        if (it.hasNext()) {
                            ArrayList arrayList2 = arrayList;
                            if (arrayList2.size() != 4) {
                                return null;
                            }
                            String city = picturePayload2.getCity();
                            String operatingSystem = picturePayload2.getOperatingSystem();
                            iVar.getClass();
                            List A = j73.A(new String[]{city, operatingSystem});
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it3 = ((ArrayList) A).iterator();
                            while (it3.hasNext()) {
                                Object next = it3.next();
                                if (!evu0.J((String) next)) {
                                    arrayList3.add(next);
                                }
                            }
                            String X = kotlin.collections.a.X(arrayList3, Extension.FIX_SPACE, null, null, null, 62);
                            if (X.length() == 0) {
                                X = "";
                            }
                            Context context = iVar.a;
                            c0 c0Var = iVar.c;
                            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.passport_picture_notification);
                            b(remoteViews, arrayList2);
                            remoteViews.setOnClickPendingIntent(R.id.picture_1, c0Var.b(uid2, picturePayload2, new PicturePushState.Picture(picturePayload2.getPictures().get(0).intValue())));
                            remoteViews.setOnClickPendingIntent(R.id.picture_2, c0Var.b(uid2, picturePayload2, new PicturePushState.Picture(picturePayload2.getPictures().get(1).intValue())));
                            remoteViews.setOnClickPendingIntent(R.id.picture_3, c0Var.b(uid2, picturePayload2, new PicturePushState.Picture(picturePayload2.getPictures().get(2).intValue())));
                            remoteViews.setOnClickPendingIntent(R.id.picture_4, c0Var.b(uid2, picturePayload2, new PicturePushState.Picture(picturePayload2.getPictures().get(3).intValue())));
                            remoteViews.setOnClickPendingIntent(R.id.not_me, c0Var.b(uid2, picturePayload2, PicturePushState.PictureNotMe.INSTANCE));
                            remoteViews.setOnClickPendingIntent(R.id.about_device, c0Var.b(uid2, picturePayload2, PicturePushState.PictureAboutDevice.INSTANCE));
                            String str = picturePayload2.getTitle() + '\n' + X;
                            remoteViews.setTextViewText(R.id.notification_title, str);
                            Uri defaultUri = RingtoneManager.getDefaultUri(2);
                            ?? vVar = new androidx.core.app.v(context, context.getPackageName());
                            Notification notification = vVar.K;
                            vVar.m = 2;
                            notification.icon = R.drawable.passport_id_notification;
                            vVar.k(defaultUri);
                            vVar.h(16, true);
                            vVar.v = true;
                            vVar.w = true;
                            vVar.z = context.getColor(R.color.passport_logout_brand_background);
                            notification.when = picturePayload2.getTimestamp();
                            notification.deleteIntent = iVar.c.c(iVar.a, picturePayload2.getNotificationId(), picturePayload2.getTitle(), uid2, picturePayload2.getPushId(), picturePayload2.getTrackId(), picturePayload2.getPlatform());
                            vVar.h = c0Var.a(picturePayload2.getNotificationId(), c0Var.d(c0Var.e(uid2, picturePayload2.getWebviewUrl(), PushType.Unknown)));
                            vVar.e = androidx.core.app.v.d(picturePayload2.getTitle());
                            vVar.f = androidx.core.app.v.d(context.getString(R.string.passport_notification_pictures_text));
                            Notification b2 = vVar.b();
                            vVar.e = androidx.core.app.v.d(str);
                            vVar.f = androidx.core.app.v.d(context.getString(R.string.passport_notification_pictures_text));
                            vVar.D = remoteViews;
                            vVar.B = b2;
                            Result.Failure failure = vVar;
                            Throwable a = Result.a(failure);
                            if (a != null) {
                                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Something go wrong: " + a, 8);
                                }
                            }
                            if (failure instanceof Result.Failure) {
                                return null;
                            }
                            return failure;
                        }
                    }
                }
            }
        }
        iVar = this;
        notificationPictureBuilder$buildNotification$1 = new NotificationPictureBuilder$buildNotification$1(iVar, continuationImpl);
        Object obj2 = notificationPictureBuilder$buildNotification$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = notificationPictureBuilder$buildNotification$1.label;
        if (i != 0) {
        }
    }
}
