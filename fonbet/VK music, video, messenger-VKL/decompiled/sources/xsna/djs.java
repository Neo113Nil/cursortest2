package xsna;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.vk.dto.push.FriendRequestInfo;
import com.vkontakte.android.R;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import xsna.fjs;
import xsna.n770;

/* compiled from: FriendRequestLargeNotification.kt */
/* loaded from: classes5.dex */
public final class djs extends fjs {
    public final a A;
    public final Bitmap B;
    public final Bitmap C;
    public final Object D;

    /* compiled from: FriendRequestLargeNotification.kt */
    public static final class a extends fjs.a {
        public final FriendRequestInfo p;

        public a(Map<String, String> map, FriendRequestInfo friendRequestInfo) {
            super(map);
            this.p = friendRequestInfo;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public djs(Context context, Map<String, String> map, Bitmap bitmap, Bitmap bitmap2, FriendRequestInfo friendRequestInfo) {
        super(context, r2, null, null, null);
        a aVar = new a(map, friendRequestInfo);
        this.A = aVar;
        this.B = bitmap;
        this.C = bitmap2;
        this.D = msy.a(LazyThreadSafetyMode.NONE, new x0(13));
    }

    @Override // com.vk.pushes.notifications.base.a
    public final Intent k(Bundle bundle, String str) {
        Set<String> set = n770.a;
        a aVar = this.A;
        return n770.a.b(this.c, new n770.b(str, this.l, aVar.a("type"), aVar.a(AndroidDynamicDeviceInfoDataSource.KEY_STAT_CONTENT), aVar.a("need_track_interaction"), null, 64));
    }

    @Override // xsna.dfq0, com.vk.pushes.notifications.base.a
    public final void o(NotificationCompat.h hVar) {
        Context context = this.c;
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.friend_request_notification_layout);
        a aVar = this.A;
        FriendRequestInfo friendRequestInfo = aVar.p;
        String str = aVar.g;
        String str2 = aVar.e;
        remoteViews.setTextViewText(R.id.friend_request_notification_title, friendRequestInfo.c);
        FriendRequestInfo friendRequestInfo2 = aVar.p;
        String str3 = friendRequestInfo2.c;
        if (str3 == null) {
            str3 = "";
        }
        remoteViews.setTextViewText(R.id.friend_request_notification_title, String.format("%s %s", Arrays.copyOf(new Object[]{str3, friendRequestInfo2.d}, 2)));
        FriendRequestInfo.MutualFriends mutualFriends = friendRequestInfo2.e;
        String str4 = mutualFriends != null ? mutualFriends.b : null;
        if (str4 == null || str4.length() == 0) {
            remoteViews.setViewVisibility(R.id.friend_request_notification_mutual_text, 8);
        } else {
            remoteViews.setViewVisibility(R.id.friend_request_notification_mutual_text, 0);
            remoteViews.setTextViewText(R.id.friend_request_notification_mutual_text, str4);
        }
        Bitmap bitmap = this.C;
        if (bitmap == null || bitmap.getWidth() <= 0) {
            remoteViews.setViewVisibility(R.id.friend_request_notification_mutual_photo, 8);
        } else {
            remoteViews.setViewVisibility(R.id.friend_request_notification_mutual_photo, 0);
            remoteViews.setImageViewBitmap(R.id.friend_request_notification_mutual_photo, bitmap);
        }
        RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), R.layout.friend_request_notification_layout_compact);
        if (str2 == null || str2.length() == 0) {
            remoteViews2.setViewVisibility(R.id.friend_request_notification_title, 8);
        } else {
            remoteViews2.setViewVisibility(R.id.friend_request_notification_title, 0);
            remoteViews2.setTextViewText(R.id.friend_request_notification_title, str2);
        }
        if (str == null || str.length() == 0) {
            remoteViews2.setViewVisibility(R.id.friend_request_notification_subtitle, 8);
        } else {
            remoteViews2.setViewVisibility(R.id.friend_request_notification_subtitle, 0);
            remoteViews2.setTextViewText(R.id.friend_request_notification_subtitle, str);
        }
        Bitmap bitmap2 = this.B;
        if (bitmap2 != null) {
            remoteViews.setImageViewBitmap(R.id.friend_request_notification_photo, bitmap2);
            remoteViews2.setImageViewBitmap(R.id.friend_request_notification_photo, bitmap2);
        }
        hVar.z = remoteViews2;
        hVar.A = remoteViews;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.pushes.notifications.base.a
    public final void p(NotificationCompat.n nVar) {
        Bitmap bitmap = this.B;
        if (bitmap != null) {
            nVar.d = bitmap;
        }
        nVar.a.addAll(j5g.O0((Collection) this.q.getValue()));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.pushes.notifications.base.a
    public final NotificationCompat.m x() {
        return (NotificationCompat.m) this.D.getValue();
    }
}
