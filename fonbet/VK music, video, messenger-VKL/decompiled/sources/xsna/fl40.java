package xsna;

import android.view.View;
import androidx.preference.Preference;
import com.vk.catalog2.feature.music.ui.holder.MusicHidingToolbarVh;
import com.vk.dto.common.data.ApiApplication;
import com.vkontakte.android.fragments.UnreadCounterSettingsFragment;
import java.io.File;
import java.util.List;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;
import xsna.epy0;
import xsna.gbc0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class fl40 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.core.s, Preference.b, yads.wt2, epy0.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fl40(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        UnreadCounterSettingsFragment unreadCounterSettingsFragment = (UnreadCounterSettingsFragment) this.c;
        int i = UnreadCounterSettingsFragment.n0;
        boolean z = obj instanceof Boolean;
        Boolean bool = z ? (Boolean) obj : null;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            io.reactivex.rxjava3.disposables.b bVar = unreadCounterSettingsFragment.m0;
            gs gsVar = new gs();
            gsVar.K("name", "messages_counter_settings_include_mutted");
            gsVar.R("value", booleanValue);
            gsVar.n = true;
            bVar.b(hg1.m(rsg0.y0(gsVar, null, null, 3), unreadCounterSettingsFragment.kn(), 0L, false, 62).subscribe(new le50(new ceb(unreadCounterSettingsFragment, booleanValue, 2), 17), kwg0.b()));
        }
        return z;
    }

    @Override // yads.wt2
    public String a() {
        return yads.dg1.b((yads.dg1) this.c);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 1:
                return (io.reactivex.rxjava3.core.b0) ((f410) this.c).invoke(obj);
            case 2:
                return (io.reactivex.rxjava3.core.b0) ((bv5) this.c).invoke(obj);
            case 3:
            case 9:
            case 10:
            default:
                return (String) ((d230) this.c).invoke(obj);
            case 4:
                return (gbc0.a) ((d230) this.c).invoke(obj);
            case 5:
                return (sfd0) ((f410) this.c).invoke(obj);
            case 6:
                return (ApiApplication) ((d230) this.c).invoke(obj);
            case 7:
                return (List) ((q9i0) this.c).invoke(obj);
            case 8:
                return (File) ((r5i0) this.c).invoke(obj);
            case 11:
                return (List) ((d230) this.c).invoke(obj);
        }
    }

    @Override // xsna.epy0.a
    public void b() {
        ((w4z0) this.c).h();
    }

    public void c() {
        MusicHidingToolbarVh musicHidingToolbarVh = (MusicHidingToolbarVh) this.c;
        boolean z = musicHidingToolbarVh.G;
        MusicHidingToolbarVh.a aVar = musicHidingToolbarVh.x;
        if (!z || !aVar.c() || !musicHidingToolbarVh.F || !musicHidingToolbarVh.r) {
            aVar.e();
            return;
        }
        View e = musicHidingToolbarVh.e();
        if (e != null && !bwt0.K(e)) {
            aVar.e();
        }
        View e2 = musicHidingToolbarVh.e();
        if (e2 != null) {
            awt0.i(e2, new vv20(musicHidingToolbarVh, 3));
        }
    }

    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(final io.reactivex.rxjava3.core.r rVar) {
        ParticipantStatesManager participantStatesManager = (ParticipantStatesManager) this.c;
        ParticipantStatesManager.Listener listener = new ParticipantStatesManager.Listener() { // from class: xsna.zk90
            @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager.Listener
            public final void onParticipantStateChanged(ParticipantStatesManager participantStatesManager2, ParticipantStatesManager.StateChangedEvent stateChangedEvent) {
                io.reactivex.rxjava3.core.r.this.onNext(participantStatesManager2.getRaisedHandIds());
            }
        };
        participantStatesManager.addHandListener(listener);
        rVar.i(new io.reactivex.rxjava3.disposables.a(new pk8(2, participantStatesManager, listener)));
        rVar.onNext(participantStatesManager.getRaisedHandIds());
    }
}
