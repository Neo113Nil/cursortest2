package xsna;

import android.view.View;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.preference.Preference;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.clips.design.view.floatingbutton.model.FloatingButtonAnalyticsEvent;
import com.vk.clips.sdk.shared.feed.analytics.ClipViewerAnalyticsEvent;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.music.Playlist;
import com.vk.friends.recommendations.impl.presentation.FriendsImportFragment;
import com.vk.im.engine.models.ImBgSyncState;
import com.vk.im.ui.fragments.dialogtheme.ImSettingsDialogThemeFragment;
import com.vk.libvideo.design.view.live.LiveView;
import com.vk.log.L;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.superapp.multiaccount.api.SimpleDate;
import com.vkontakte.android.fragments.debug.NetworkImagesStatTestFragment;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.protocol.RtcCommand;
import ru.ok.android.webrtc.protocol.RtcCommandOnSuccessListener;
import ru.ok.android.webrtc.protocol.RtcResponse;
import ru.ok.android.webrtc.protocol.commands.UpdateDisplayLayoutV2Command;
import ru.ok.android.webrtc.protocol.commands.UpdateDisplayLayoutV2Response;
import ru.ok.android.webrtc.topology.server.layout.DiffDisplayLayouts;
import ru.ok.face.entity.FaceFigure;
import ru.ok.face.pipeline_frugal.FrugalKeypointPipeline;
import ru.ok.tensorflow.entity.Detection;
import ru.ok.tensorflow.util.Function2;
import xsna.dgh;
import xsna.dug0;
import xsna.fdp0;
import xsna.fit;
import xsna.ihz;
import xsna.jza0;
import xsna.k840;
import xsna.q96;
import xsna.t24;
import xsna.ub9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class lh3 implements io.reactivex.rxjava3.functions.m, t24.e, q96.c, io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.core.d, Preference.c, ub9.c, RtcCommandOnSuccessListener, ihz.a, Function2, io.reactivex.rxjava3.functions.h, fdp0.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lh3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.fdp0.a
    public boolean a(View view) {
        LiveView liveView = (LiveView) this.c;
        int i = LiveView.p0;
        liveView.getClass();
        return view.getId() == liveView.v.getId();
    }

    @Override // ru.ok.tensorflow.util.Function2
    public Object apply(Object obj, Object obj2) {
        FaceFigure lambda$process$7;
        lambda$process$7 = ((FrugalKeypointPipeline) this.c).lambda$process$7((Detection) obj, (FaceFigure) obj2);
        return lambda$process$7;
    }

    @Override // xsna.ub9.c
    public Object attachCompleter(ub9.a aVar) {
        DeferrableSurface deferrableSurface = (DeferrableSurface) this.c;
        synchronized (deferrableSurface.a) {
            deferrableSurface.d = aVar;
        }
        return "DeferrableSurface-termination(" + deferrableSurface + ")";
    }

    public void b(String str, FloatingButtonAnalyticsEvent floatingButtonAnalyticsEvent) {
        ClipViewerAnalyticsEvent.FloatingButtonEvent.EventType eventType;
        o85 o85Var = (o85) this.c;
        int i = izc.$EnumSwitchMapping$0[floatingButtonAnalyticsEvent.ordinal()];
        if (i == 1) {
            eventType = ClipViewerAnalyticsEvent.FloatingButtonEvent.EventType.BUTTON_SHOW;
        } else if (i == 2) {
            eventType = ClipViewerAnalyticsEvent.FloatingButtonEvent.EventType.BUTTON_CLICK;
        } else if (i == 3) {
            eventType = ClipViewerAnalyticsEvent.FloatingButtonEvent.EventType.BUTTON_CLOSE;
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            eventType = ClipViewerAnalyticsEvent.FloatingButtonEvent.EventType.MODAL_CARD_CTA_BUTTON_CLICK;
        }
        o85Var.invoke(str, eventType);
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 9:
                String[] strArr = DebugDevSettingsFragment.t0;
                k840.a.c.f().P(new Long[0]);
                ((Preference) obj).I("Обнулено");
                break;
            default:
                DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) obj;
                String[] strArr2 = DebugDevSettingsFragment.t0;
                debugDevSettingsFragment.getClass();
                mcr0.a();
                new oz50(NetworkImagesStatTestFragment.class, null, null).k(debugDevSettingsFragment.getActivity());
                break;
        }
        return true;
    }

    @Override // io.reactivex.rxjava3.functions.h
    public Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        return (e6u) ((j6u) this.c).invoke(obj, obj2, obj3, obj4);
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        fwa0 fwa0Var = (fwa0) this.c;
        ((jza0.b) obj).onPlayWhenReadyChanged(fwa0Var.l, fwa0Var.m);
    }

    @Override // xsna.t24.e
    public void onClick() {
        ((t24) this.c).yn();
    }

    @Override // ru.ok.android.webrtc.protocol.RtcCommandOnSuccessListener
    public void onRtcCommandSuccess(RtcCommand rtcCommand, RtcResponse rtcResponse) {
        ((DiffDisplayLayouts) this.c).a((UpdateDisplayLayoutV2Command) rtcCommand, (UpdateDisplayLayoutV2Response) rtcResponse);
    }

    @Override // io.reactivex.rxjava3.core.d
    public void subscribe(io.reactivex.rxjava3.core.b bVar) {
        String str = (String) this.c;
        ClipsDraftPersistentStore clipsDraftPersistentStore = ClipsDraftPersistentStore.b;
        k82 k82Var = new k82(2, str, bVar);
        clipsDraftPersistentStore.getClass();
        ClipsDraftPersistentStore.o(k82Var);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return ((Boolean) ((dz) obj2).invoke(obj)).booleanValue();
            default:
                int i2 = ImSettingsDialogThemeFragment.c0;
                return ((Boolean) ((azt) obj2).invoke(obj)).booleanValue();
        }
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        boolean z;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 3:
                return (hda) ((zf1) obj2).invoke(obj);
            case 4:
                return (io.reactivex.rxjava3.core.b0) ((kob) obj2).invoke(obj);
            case 5:
            case 6:
            case 9:
            case 10:
            case 11:
            case 14:
            case 16:
            case 18:
            case 20:
            case 22:
            case 23:
            default:
                return (Boolean) ((svz) obj2).invoke(obj);
            case 7:
                return (NewsComment) ((o15) obj2).invoke(obj);
            case 8:
                return ((dgh.a) obj2).invoke(obj);
            case 12:
                return (io.reactivex.rxjava3.core.b0) ((m1k) obj2).invoke(obj);
            case 13:
                return (HashSet) ((dz) obj2).invoke(obj);
            case 15:
                kpp kppVar = opp.T;
                return (SimpleDate) ((dz) obj2).invoke(obj);
            case 17:
                int i2 = FriendsImportFragment.a0;
                return (FriendsImportFragment.c) ((dz) obj2).invoke(obj);
            case 19:
                return ((fit.r) obj2).invoke(obj);
            case 21:
                return (ImBgSyncState) ((azt) obj2).invoke(obj);
            case 24:
                File file = (File) obj2;
                dug0.c cVar = (dug0.c) obj;
                boolean c = cVar.c();
                File file2 = cVar.c;
                if (c) {
                    try {
                        z = hpk.a(file2, file);
                    } catch (Throwable th) {
                        L.g("Can't prepare folder as resource", th);
                        z = false;
                    } finally {
                    }
                    if (!z) {
                        throw new IOException("Can't create resource");
                    }
                    cVar = dug0.c.a(file);
                }
                return cVar;
            case 25:
                return (Playlist) ((m1k) obj2).c;
            case 26:
                return (List) ((bws) obj2).invoke(obj);
            case 27:
                return (f500) ((azt) obj2).invoke(obj);
            case 28:
                return (iu80) ((q69) obj2).invoke(obj);
        }
    }
}
