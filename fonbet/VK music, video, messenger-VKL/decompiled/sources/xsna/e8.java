package xsna;

import android.database.sqlite.SQLiteFullException;
import android.os.Bundle;
import android.util.Size;
import androidx.media3.exoplayer.offline.d;
import androidx.preference.Preference;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.c;
import com.vk.clips.design.view.stikers.ClipsStickersView;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.content.design.view.photo.flow.PhotoFlowToolbarView;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.music.MusicTrack;
import com.vk.libvideo.live.impl.broadcast_settings.BroadcastSettingsFragment;
import com.vk.money.MoneyTransferPagerFragment;
import com.vk.music.offline.configs.api.domain.model.ReactionsConfig;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;
import com.vk.profile.core.tabs.ui.clips.Clips;
import java.util.List;
import kotlin.Pair;
import ru.ok.android.sdk.api.login.LoginRequest;
import ru.ok.android.webrtc.participant.talking.OwnTalkingReporter;
import ru.ok.android.webrtc.participant.talking.VoiceAudioLevelListener;
import xsna.dy8;
import xsna.fit;
import xsna.kd50;
import xsna.ki8;
import xsna.no90;
import xsna.q1d0;
import xsna.tq70;
import xsna.ub9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class e8 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.c, PhotoFlowToolbarView.d, SwipeDrawableRefreshLayout.g, VoiceAudioLevelListener.Listener, ub9.c, ClipsStickersView.c, Preference.c, c.b, io.reactivex.rxjava3.functions.m, tq70.b, q1d0.e, pcs, dy8.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e8(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.dy8.a
    public void a(long j, long j2, long j3) {
        androidx.media3.exoplayer.offline.e eVar = (androidx.media3.exoplayer.offline.e) this.c;
        if (eVar.f == null) {
            return;
        }
        float W = (j == -1 || j == 0) ? -1.0f : y2r0.W(j2, j);
        d.a aVar = eVar.f;
        aVar.getClass();
        aVar.b(j, j2, W);
    }

    @Override // xsna.tq70.b
    public void accept(Object obj) {
        ((kd50.a) obj).a((MusicTrack) this.c, null, true);
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        switch (this.b) {
            case 1:
                return (Pair) ((i60) this.c).invoke(obj, obj2);
            case 21:
                return (List) ((i60) this.c).invoke((List) obj, obj2);
            default:
                return (Integer) ((i60) this.c).invoke(obj, obj2);
        }
    }

    @Override // xsna.ub9.c
    public Object attachCompleter(ub9.a aVar) {
        fl9 fl9Var = (fl9) this.c;
        synchronized (fl9Var.a) {
            fl9Var.e = aVar;
        }
        return "CameraRepository-deinit";
    }

    @Override // com.google.android.material.tabs.c.b
    public void c(TabLayout.g gVar, int i) {
        gVar.q((CharSequence) ((MoneyTransferPagerFragment) this.c).s0.get(i));
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        debugDevSettingsFragment.o0.x(new y580(rsr.x("Test", new SQLiteFullException()), LoginRequest.CLIENT_NAME, true));
        return true;
    }

    @Override // xsna.q1d0.e
    public Size f() {
        return (Size) ((gzs) this.c).invoke();
    }

    @Override // com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout.g
    public void h() {
        ((BroadcastSettingsFragment.b) this.c).invoke(ki8.g.b);
    }

    @Override // com.vk.content.design.view.photo.flow.PhotoFlowToolbarView.d
    public void onClick() {
        switch (this.b) {
            case 2:
                ((com.vk.photos.root.albumdetails.presentation.c) this.c).j.smoothScrollToPosition(0);
                break;
            default:
                ((s0e) this.c).d.u();
                break;
        }
    }

    @Override // ru.ok.android.webrtc.participant.talking.VoiceAudioLevelListener.Listener
    public void onVoiceDetected() {
        ((OwnTalkingReporter) this.c).onVoiceDetected();
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        PostingFragment postingFragment = (PostingFragment) this.c;
        int i = PostingFragment.L0;
        postingFragment.finish();
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return ((Boolean) ((ha40) this.c).invoke(obj)).booleanValue();
    }

    public /* synthetic */ e8(nd50 nd50Var, MusicTrack musicTrack) {
        this.b = 24;
        this.c = musicTrack;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return (List) ((p8) obj2).invoke(obj);
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 12:
            case 16:
            default:
                return (no90.a.b) ((ha40) obj2).invoke(obj);
            case 3:
                return (ReactionsConfig) ((com.vk.movika.sdk.base.observable.c) obj2).invoke(obj);
            case 8:
                return (Boolean) ((oc0) obj2).invoke(obj);
            case 9:
                return (List) ((fh1) obj2).invoke(obj);
            case 10:
                return ((qqc) obj2).invoke(obj);
            case 11:
                return (Boolean) ((com.vk.movika.sdk.base.observable.c) obj2).invoke(obj);
            case 13:
                return (e2f) ((qr0) obj2).invoke(obj);
            case 14:
                int i2 = CommunityAddressesFragment.E0;
                return (io.reactivex.rxjava3.core.t) ((oc0) obj2).invoke(obj);
            case 15:
                return (Clips) ((ml1) obj2).invoke(obj);
            case 17:
                return (io8) ((oc0) obj2).invoke(obj);
            case 18:
                return (rts) ((wze) obj2).invoke(obj);
            case 19:
                return (nak) ((fit.i) obj2).invoke(obj);
            case 20:
                return (Boolean) ((oc0) obj2).invoke(obj);
        }
    }
}
