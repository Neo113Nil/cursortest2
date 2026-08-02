package xsna;

import android.database.sqlite.SQLiteDatabase;
import com.ironsource.sdk.controller.v;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.autoplay.b;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.stat.scheme.CommonVideoStat$TypeVideoNextVideoStartAction;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.idsync.internal.model.RequestConfig;
import java.util.List;
import ru.ok.gleffects.EffectHolder;
import ru.ok.gleffects.dto.UserInfo;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class x8p implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x8p(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((EffectHolder) obj2).lambda$setUserData$18((UserInfo) obj);
                return;
            case 1:
                ((v940) obj2).b((ax1) obj);
                return;
            case 2:
                List list = (List) obj;
                yxa0 yxa0Var = ((rxa0) obj2).b;
                SQLiteDatabase writableDatabase = yxa0Var.getWritableDatabase();
                writableDatabase.beginTransaction();
                try {
                    String B = f870.B(list, StringUtils.COMMA, new f6w(16));
                    writableDatabase.execSQL("DELETE FROM original_tracks_order WHERE uuid IN(" + B + ") AND user_id = " + yxa0.o() + "  AND COL_QUEUE_TYPE = " + yxa0Var.n());
                    writableDatabase.execSQL("DELETE FROM actual_tracks_order WHERE uuid IN(" + B + ") AND user_id = " + yxa0.o() + "  AND COL_QUEUE_TYPE = " + yxa0Var.n());
                    s3q0 s3q0Var = s3q0.a;
                    writableDatabase.setTransactionSuccessful();
                    return;
                } finally {
                    writableDatabase.endTransaction();
                }
            case 3:
                VideoFile videoFile = (VideoFile) obj;
                ((e4s0) obj2).getClass();
                bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                yg5 e = b.C1208b.a().e(videoFile, null);
                VideoAutoPlay videoAutoPlay = e instanceof VideoAutoPlay ? (VideoAutoPlay) e : null;
                String str = videoAutoPlay != null ? videoAutoPlay.K : null;
                if (str != null && str.length() != 0) {
                    iid0 iid0Var = new iid0();
                    UiTracker uiTracker = UiTracker.a;
                    MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                    SchemeStat$TypeAction b = SchemeStat$TypeAction.a.b(null, null, new CommonVideoStat$TypeVideoNextVideoStartAction(videoFile.I0().b, videoFile.o0(), str, CommonVideoStat$TypeVideoNextVideoStartAction.EventType.NEXT_VIDEO_START_AUTO), 3);
                    iid0Var.f = c;
                    iid0Var.g = b;
                    iid0Var.q();
                    return;
                }
                L l = L.a;
                l.getClass();
                if (L.m(LoggerOutputTarget.NONE)) {
                    return;
                }
                L.u(l, L.LogType.w, new Object[]{"Failed to track autoplay for " + videoFile.a1() + " because vsid is null"});
                return;
            case 4:
                io.appmetrica.analytics.idsync.impl.n.a((io.appmetrica.analytics.idsync.impl.n) obj2, (RequestConfig) obj);
                return;
            default:
                ((v.s) obj2).q((String) obj);
                return;
        }
    }
}
