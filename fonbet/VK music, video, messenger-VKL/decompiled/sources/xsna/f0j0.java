package xsna;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.preference.Preference;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.vk.dto.common.id.UserId;
import com.vk.media.player.video.view.SimpleVideoView;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.vmoji.character.model.RecommendationsBlockModel;
import com.vk.voip.ui.actions.feature.VoipActionsFeatureState;
import com.vk.voip.ui.call_by_link.feature.a;
import com.vk.voip.ui.call_by_link.ui.VoipCallByLinkFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.audio.file.StorageType;
import com.vkontakte.android.fragments.NewsfeedSettingsFragment;
import com.vkontakte.android.fragments.SettingsAccountInnerFragment;
import com.vkontakte.android.fragments.SettingsGeneralFragment;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.Pair;
import kotlin.Triple;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class f0j0 implements Preference.c, Preference.b, io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.functions.g, io.reactivex.rxjava3.functions.l, Continuation, io.reactivex.rxjava3.core.d, SimpleVideoView.k, io.reactivex.rxjava3.functions.c, pcs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f0j0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        SettingsGeneralFragment settingsGeneralFragment = (SettingsGeneralFragment) this.c;
        if (!obj.equals(settingsGeneralFragment.l0.nameForPreference)) {
            StorageType storageType = settingsGeneralFragment.l0;
            StorageType a = StorageType.a((String) obj);
            ox40.l(new PlaybackActionMeta(32, SystemClock.elapsedRealtime()), null);
            ner0 ner0Var = new ner0(settingsGeneralFragment.getActivity());
            ner0Var.setProgressStyle(1);
            ner0Var.setMessage(settingsGeneralFragment.getString(R.string.moving_audio_cache));
            ner0Var.setCancelable(false);
            ner0Var.show();
            f2j0 f2j0Var = new f2j0(settingsGeneralFragment, ner0Var);
            asu0.a.getClass();
            asu0.h().execute(new jx60(settingsGeneralFragment, storageType, a, f2j0Var, ner0Var, 1));
        }
        return true;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 4:
                return (List) ((wo40) this.c).invoke(obj);
            case 5:
            case 7:
            case 8:
            case 9:
            default:
                return (List) ((hcs0) this.c).invoke(obj);
            case 6:
                return (io.reactivex.rxjava3.core.t) ((z8l0) this.c).invoke(obj);
            case 10:
                return (List) ((wo40) this.c).invoke(obj);
            case 11:
                return (xpp) ((z8l0) this.c).invoke(obj);
            case 12:
                return (RecommendationsBlockModel) ((wo40) this.c).invoke(obj);
        }
    }

    @Override // io.reactivex.rxjava3.functions.g
    public Object d(Object obj, Object obj2, Object obj3) {
        return (Triple) ((smi) this.c).invoke(obj, obj2, obj3);
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        SettingsAccountInnerFragment settingsAccountInnerFragment = (SettingsAccountInnerFragment) this.c;
        int i = SettingsAccountInnerFragment.r0;
        settingsAccountInnerFragment.getClass();
        new NewsfeedSettingsFragment.a().l(settingsAccountInnerFragment);
        return true;
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        VoipCallByLinkFragment voipCallByLinkFragment = (VoipCallByLinkFragment) this.c;
        int i = VoipCallByLinkFragment.T;
        if (str.hashCode() == -1297138205 && str.equals("REQUEST_KEY_CALL_AS")) {
            UserId userId = (UserId) bundle.getParcelable("result_key_group_id");
            if (userId == null || userId.b <= 0) {
                xn50.a.c(voipCallByLinkFragment, a.b.C2015a.b);
            } else {
                xn50.a.c(voipCallByLinkFragment, new a.b.C2016b(userId));
            }
        }
    }

    @Override // com.vk.media.player.video.view.SimpleVideoView.k
    public void p0(Integer num) {
        grt0.o((grt0) this.c);
    }

    @Override // io.reactivex.rxjava3.core.d
    public void subscribe(final io.reactivex.rxjava3.core.b bVar) {
        View view = (View) this.c;
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: xsna.tkt0
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                io.reactivex.rxjava3.core.b.this.onComplete();
            }
        };
        view.getViewTreeObserver().addOnScrollChangedListener(onScrollChangedListener);
        bVar.a(new ukt0(0, view, onScrollChangedListener));
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 2:
                return ((Boolean) ((ebx) this.c).invoke(obj)).booleanValue();
            case 7:
                return ((Boolean) ((wqp) this.c).invoke(obj)).booleanValue();
            case 16:
                return ((Boolean) ((wo40) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((z8l0) this.c).invoke(obj)).booleanValue();
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        ((CountDownLatch) this.c).countDown();
        return null;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        switch (this.b) {
            case 13:
                return (VoipActionsFeatureState.a) ((z2) this.c).invoke(obj, obj2);
            default:
                return (Pair) ((z2) this.c).invoke(obj, obj2);
        }
    }
}
