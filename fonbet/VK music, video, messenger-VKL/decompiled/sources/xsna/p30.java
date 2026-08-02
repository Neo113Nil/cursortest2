package xsna;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.vk.catalog2.common.ui.core.analytics.tracking.SearchAuthorAnalyticsInfo;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoNotificationsStatus;
import com.vk.newsfeed.impl.data.database.entity.action.ActionWithOfflineSupportTypeEntity;
import com.vk.newsfeed.impl.data.database.entity.action.SyncStatusEntity;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.oem0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class p30 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ p30(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        SearchAuthorAnalyticsInfo.ClickTarget clickTarget;
        int i = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                x60 x60Var = (x60) obj2;
                y60 b = ((v30) obj3).b();
                long j = x60Var.a;
                SyncStatusEntity syncStatusEntity = SyncStatusEntity.NOT_SYNCED;
                ActionWithOfflineSupportTypeEntity b2 = cn00.b(x60Var.c);
                int i2 = x60Var.e + 1;
                g00 a = b.a(b2);
                SQLiteDatabase sQLiteDatabase = b.a;
                ContentValues contentValues = new ContentValues(3);
                contentValues.put("sync_status", syncStatusEntity.h());
                a.c(obj);
                contentValues.put("last_sync_error", (byte[]) null);
                contentValues.put("sync_attempt_count", Integer.valueOf(i2));
                s3q0 s3q0Var = s3q0.a;
                sQLiteDatabase.update("actions_with_offline_support", contentValues, "_id = ?", new String[]{String.valueOf(j)});
                return;
            case 1:
                com.vk.catalog2.common.ui.holders.c cVar = (com.vk.catalog2.common.ui.holders.c) obj3;
                UserId userId = (UserId) obj2;
                VideoNotificationsStatus videoNotificationsStatus = (VideoNotificationsStatus) obj;
                cVar.a.b(new buz(12, new d230(8), new zd0(userId, videoNotificationsStatus, cVar)), false);
                io.reactivex.rxjava3.subjects.f<Pair<UserId, VideoNotificationsStatus>> fVar = tys0.a;
                tys0.a.onNext(new Pair<>(fkq0.e(userId), videoNotificationsStatus));
                ?? r0 = cVar.c;
                int i3 = ymh0.$EnumSwitchMapping$0[videoNotificationsStatus.ordinal()];
                if (i3 == 1) {
                    clickTarget = SearchAuthorAnalyticsInfo.ClickTarget.SetNotificationAll;
                } else if (i3 == 2) {
                    clickTarget = SearchAuthorAnalyticsInfo.ClickTarget.SetNotificationNone;
                } else {
                    if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    clickTarget = SearchAuthorAnalyticsInfo.ClickTarget.SetNotificationPreferred;
                }
                r0.invoke(clickTarget);
                return;
            default:
                zgm0 zgm0Var = (zgm0) obj2;
                rqe0 rqe0Var = (rqe0) obj;
                if (((VKList) obj3).k() == 0) {
                    zgm0Var.d.a(new oem0.a.b(rqe0Var.b));
                    return;
                }
                return;
        }
    }
}
