package xsna;

import android.content.Context;
import android.content.Intent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.core.apps.BuildInfo;
import com.vk.di.component.app.AppContextDiComponent;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.narratives.Narrative;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.music.player.PlayerTrack;
import com.vk.mvi.binder.BinderLifecycleMode;
import com.vk.permission.PermissionHelper;
import com.vk.profile.community.subscription.impl.di.CommunitySubscriptionComponentImpl;
import com.vk.repository.data.api.di.DataRepositoryComponent;
import com.vk.stat.scheme.CommonVideoStat$TypeNextVideoAnnouncement;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.video.ui.discovery.minimizable.g;
import com.vk.video.ui.discovery.minimizable.player.controllers.MiniPlayerControllersWrapper;
import com.vkontakte.android.R;
import com.vkontakte.android.VKApplication;
import java.io.File;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.externcalls.sdk.stereo.hands.StereoRoomHandsQueueImpl;
import xsna.rw40;
import xsna.sx40;
import xsna.xqs0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class q34 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ q34(com.vk.movika.sdk.base.observable.u uVar, pk50 pk50Var, BinderLifecycleMode binderLifecycleMode, iyp iypVar) {
        this.b = 1;
        this.c = pk50Var;
        this.d = binderLifecycleMode;
        this.e = iypVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v20, types: [T, com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem$SharingChannel, java.lang.Object] */
    @Override // xsna.gzs
    public final Object invoke() {
        String str;
        s3q0 loadHandsQueue$lambda$0$1;
        VideoFile videoFile;
        int i = 2;
        switch (this.b) {
            case 0:
                Context context = (Context) this.c;
                g8n0 g8n0Var = (g8n0) this.d;
                jbs jbsVar = (jbs) this.e;
                qg90 i2 = vua0.i(false);
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                intent.putExtra("output", com.vk.core.files.a.N((File) i2.b));
                if (intent.resolveActivity(context.getPackageManager()) == null) {
                    BuildInfo.Client client = BuildInfo.a;
                    VKApplication vKApplication = com.vk.core.apps.a.a;
                } else {
                    g8n0Var.invoke();
                    jbsVar.D(intent, ((Number) i2.a).intValue(), null);
                }
                return s3q0.a;
            case 1:
                ((BinderLifecycleMode) this.d).a(new fg1(i, (iyp) this.e, (pk50) this.c));
                s3q0 s3q0Var = s3q0.a;
                return s3q0.a;
            case 2:
                ((yah) this.d).b.a((Narrative) this.e, MobileOfficialAppsCoreNavStat$EventScreen.GROUP).k((Context) this.c);
                return s3q0.a;
            case 3:
                AppContextDiComponent appContextDiComponent = (AppContextDiComponent) this.c;
                BridgeComponent bridgeComponent = (BridgeComponent) this.d;
                DataRepositoryComponent dataRepositoryComponent = (DataRepositoryComponent) this.e;
                qcy<Object>[] qcyVarArr = CommunitySubscriptionComponentImpl.e;
                Context context2 = appContextDiComponent.a;
                o0r0 F = bridgeComponent.F();
                a1w a1wVar = q1w.a;
                return new j7h(context2, dataRepositoryComponent.D(), F, a1wVar != null ? a1wVar : null, null, null, null, null);
            case 4:
                rw40 rw40Var = (rw40) this.c;
                PlayerTrack playerTrack = (PlayerTrack) this.d;
                sx40 sx40Var = (sx40) this.e;
                u2b0 u2b0Var = rw40Var.y;
                int i3 = rw40.a.$EnumSwitchMapping$0[((sx40.i0) sx40Var).c.ordinal()];
                if (i3 == 1) {
                    str = "next";
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "prev";
                }
                u2b0.v0(u2b0Var, playerTrack, str, 4);
                return s3q0.a;
            case 5:
                m070 m070Var = (m070) this.c;
                return new Result(m070Var.f.f(new l1g0(((qz60) this.d).f, (k070) this.e, m070Var.g)));
            case 6:
                loadHandsQueue$lambda$0$1 = StereoRoomHandsQueueImpl.loadHandsQueue$lambda$0$1((List) this.c, (gzs) this.d, (StereoRoomHandsQueueImpl) this.e);
                return loadHandsQueue$lambda$0$1;
            case 7:
                g7s0.m(((yqs0) this.d).a, (Context) this.c, ((xqs0.a) this.e).b, UserId.d, null, null, 24);
                return s3q0.a;
            case 8:
                VideoFile videoFile2 = (VideoFile) this.c;
                com.vk.video.ui.discovery.minimizable.g gVar = (com.vk.video.ui.discovery.minimizable.g) this.d;
                com.vk.video.ui.discovery.minimizable.q qVar = (com.vk.video.ui.discovery.minimizable.q) this.e;
                if (videoFile2.O() == null) {
                    gVar.Y();
                    try {
                        MiniPlayerControllersWrapper.VideoInfo videoInfo = qVar.b;
                        if (videoInfo != null && (videoFile = videoInfo.b) != null) {
                            gVar.S.getClass();
                            r1s0.a(CommonVideoStat$TypeNextVideoAnnouncement.EventSubtype.AUTO, videoFile, videoFile2);
                        }
                        s3q0 s3q0Var2 = s3q0.a;
                    } catch (Exception e) {
                        com.vk.metrics.eventtracking.b.a.a(e);
                    }
                    VideoPipStateHolder.a.getClass();
                    if (!VideoPipStateHolder.d()) {
                        gVar.d0(qVar, g.b.AUTO);
                        gVar.Y();
                    }
                } else {
                    i4s0 i4s0Var = gVar.n;
                    ReentrantLock reentrantLock = i4s0Var.h;
                    reentrantLock.lock();
                    try {
                        i4s0Var.g = true;
                        s3q0 s3q0Var3 = s3q0.a;
                    } finally {
                        reentrantLock.unlock();
                    }
                }
                return s3q0.a;
            default:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.c;
                oyw0 oyw0Var = (oyw0) this.d;
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) this.e;
                ?? r3 = MobileOfficialAppsCallsStat$TypeVoipCallItem.SharingChannel.CALENDAR;
                ref$ObjectRef.element = r3;
                oyw0Var.f.invoke(oyw0Var.b, r3);
                j1k0 j1k0Var = new j1k0(7, oyw0Var, new yyl0(ref$ObjectRef2, 28));
                lxh0 lxh0Var = new lxh0(j1k0Var, 24);
                PermissionHelper permissionHelper = PermissionHelper.a;
                Context context3 = oyw0Var.a;
                permissionHelper.getClass();
                permissionHelper.d(context3, PermissionHelper.w, R.string.voip_schedule_call_calendar_permission_rationale, R.string.voip_schedule_call_calendar_permission_settings_rationale, j1k0Var, lxh0Var);
                return s3q0.a;
        }
    }

    public /* synthetic */ q34(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ q34(yah yahVar, Narrative narrative, Context context) {
        this.b = 2;
        this.d = yahVar;
        this.e = narrative;
        this.c = context;
    }

    public /* synthetic */ q34(yqs0 yqs0Var, Context context, xqs0.a aVar) {
        this.b = 7;
        this.d = yqs0Var;
        this.c = context;
        this.e = aVar;
    }
}
