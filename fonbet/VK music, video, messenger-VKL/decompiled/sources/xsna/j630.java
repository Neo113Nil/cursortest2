package xsna;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingRedesignDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingsSectionRedesignDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.libvideo.minified_player.VideoMinifiedPlayerStateHolder;
import com.vk.settings.impl.presentation.base.fragment.settings.RedesignNotificationSettingsFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import ru.mail.libverify.controls.VerificationController;
import ru.mail.libverify.controls.VerificationListener;
import ru.mail.libverify.n.g;
import ru.mail.libverify.utils.Optional;
import xsna.bzp0;
import xsna.kd50;
import xsna.mfg0;
import xsna.ngl;
import xsna.q1d0;
import xsna.s8z0;
import xsna.tq70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class j630 implements io.reactivex.rxjava3.functions.l, tq70.b, q1d0.a, ngl.a, pcs, io.reactivex.rxjava3.functions.m, Optional.Action, s8z0.a, yads.pq2, g.c {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j630(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // ru.mail.libverify.n.g.c
    public boolean a(String str) {
        boolean d;
        d = ((ru.mail.libverify.api.s) this.c).d(str);
        return d;
    }

    @Override // xsna.tq70.b
    public void accept(Object obj) {
        switch (this.b) {
            case 4:
                ((kd50.a) obj).a(null, (VKApiExecutionException) this.c, true);
                break;
            default:
                ((VerificationController) this.c).lambda$onVerificationSuspended$29((VerificationListener) obj);
                break;
        }
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (Pair) ((com.vk.music.playlist.f) this.c).invoke(obj);
            case 1:
                return (uk70) ((r9k) this.c).invoke(obj);
            case 2:
                return (tt70) ((rvq) this.c).invoke(obj);
            case 3:
                return (io.reactivex.rxjava3.core.t) ((com.vk.libvideo.b) this.c).invoke(obj);
            case 4:
            case 9:
            case 10:
            case 11:
            case 13:
            case 20:
            case 21:
            default:
                return (List) ((qyn0) this.c).invoke(obj);
            case 5:
                return (io.reactivex.rxjava3.core.e) ((zd60) this.c).invoke(obj);
            case 6:
                return (NewsEntry) ((b140) this.c).invoke(obj);
            case 7:
                return (io.reactivex.rxjava3.core.b0) ((b140) this.c).invoke(obj);
            case 8:
                return (Boolean) ((rvq) this.c).invoke(obj);
            case 12:
                return (Boolean) ((rvq) this.c).invoke(obj);
            case 14:
                return (mfg0.a) ((b140) this.c).c;
            case 15:
                return (com.vk.voip.ui.sessionrooms.e) ((q1) this.c).invoke(obj);
            case 16:
                return (nov) ((mu0) this.c).invoke(obj);
            case 17:
                return (ArrayList) ((xv2) this.c).invoke(obj);
            case 18:
                return (SdkVideoFile) ((y5m0) this.c).invoke(obj);
            case 19:
                return (String) ((qyn0) this.c).invoke(obj);
            case 22:
                return (VideoMinifiedPlayerStateHolder.State) ((com.vk.libvideo.minified_player.a) this.c).invoke(obj);
            case 23:
                return (io.reactivex.rxjava3.core.b0) ((gib0) this.c).invoke(obj);
        }
    }

    @Override // xsna.ngl.a
    public void e(bzp0.c cVar) {
        ((im90) this.c).b.hh(cVar.a);
    }

    @Override // xsna.q1d0.a
    public hk0 getConfig() {
        return (hk0) ((gzs) this.c).invoke();
    }

    @Override // xsna.s8z0.a
    public void i(z9z0 z9z0Var) {
        ((hhy0) this.c).L = z9z0Var;
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        Parcelable parcelable;
        Parcelable parcelable2;
        Object parcelable3;
        Object parcelable4;
        RedesignNotificationSettingsFragment redesignNotificationSettingsFragment = (RedesignNotificationSettingsFragment) this.c;
        RedesignNotificationSettingsFragment.a aVar = RedesignNotificationSettingsFragment.Y;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            parcelable4 = bundle.getParcelable("section", NotificationsNotificationSettingsSectionRedesignDto.class);
            parcelable = (Parcelable) parcelable4;
        } else {
            Parcelable parcelable5 = bundle.getParcelable("section");
            if (!(parcelable5 instanceof NotificationsNotificationSettingsSectionRedesignDto)) {
                parcelable5 = null;
            }
            parcelable = (NotificationsNotificationSettingsSectionRedesignDto) parcelable5;
        }
        NotificationsNotificationSettingsSectionRedesignDto notificationsNotificationSettingsSectionRedesignDto = (NotificationsNotificationSettingsSectionRedesignDto) parcelable;
        if (i >= 33) {
            parcelable3 = bundle.getParcelable("setting", NotificationsNotificationSettingRedesignDto.class);
            parcelable2 = (Parcelable) parcelable3;
        } else {
            Parcelable parcelable6 = bundle.getParcelable("setting");
            parcelable2 = (NotificationsNotificationSettingRedesignDto) (parcelable6 instanceof NotificationsNotificationSettingRedesignDto ? parcelable6 : null);
        }
        NotificationsNotificationSettingRedesignDto notificationsNotificationSettingRedesignDto = (NotificationsNotificationSettingRedesignDto) parcelable2;
        if (notificationsNotificationSettingRedesignDto != null) {
            redesignNotificationSettingsFragment.getFeature().C(new xf70(notificationsNotificationSettingRedesignDto));
        }
        if (notificationsNotificationSettingsSectionRedesignDto != null) {
            redesignNotificationSettingsFragment.getFeature().C(new wf70(notificationsNotificationSettingsSectionRedesignDto));
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return ((Boolean) ((qyn0) this.c).invoke(obj)).booleanValue();
    }

    public /* synthetic */ j630(nd50 nd50Var, VKApiExecutionException vKApiExecutionException) {
        this.b = 4;
        this.c = vKApiExecutionException;
    }
}
