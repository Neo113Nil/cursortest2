package xsna;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.preference.Preference;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.abt.AbtException;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.clips.design.view.stikers.ClipsStickersView;
import com.vk.clips.editor.templates.impl.player.a;
import com.vk.clips.editor.templates.impl.views.main.ClipsTemplateEditorFragment;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.music.Playlist;
import com.vk.ecomm.checklist.impl.presentation.CommunityCheckListFragment;
import com.vk.ecomm.reviews.impl.allreviews.presentation.c;
import com.vk.superapp.miniapps.picker.AppsPickerFragment;
import com.vk.toggle.debug.BaseDebugTogglesFragment;
import com.vk.voip.ui.asr.ui.start.AsrRecordStartFragment;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONException;
import xsna.eeu0;
import xsna.h7u0;
import xsna.huv;
import xsna.ihz;
import xsna.jza0;
import xsna.mvg;
import xsna.n8z0;
import xsna.v240;
import xsna.xn50;
import xsna.y6u;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class kf3 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.m, ClipsStickersView.d, a.l, pcs, Preference.c, ihz.a, Continuation, io.reactivex.rxjava3.functions.c, n8z0.b, r1y0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kf3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (huv.a) ((pue) this.c).invoke(obj, obj2);
    }

    @Override // xsna.r1y0
    public void c() {
        ((kz30) this.c).N();
    }

    @Override // com.vk.clips.design.view.stikers.ClipsStickersView.d
    public void d(MotionEvent motionEvent) {
        ClipsTemplateEditorFragment clipsTemplateEditorFragment = (ClipsTemplateEditorFragment) this.c;
        int i = ClipsTemplateEditorFragment.h0;
        j6f eo = clipsTemplateEditorFragment.eo();
        View view = clipsTemplateEditorFragment.d0;
        if (view == null) {
            view = null;
        }
        eo.d(view, motionEvent);
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        o2l.a.getClass();
        String c = o2l.c("__dbg_vkid_suspicious_auth_test", "");
        eeu0.a.C2801a c2801a = new eeu0.a.C2801a(new h7u0.a(debugDevSettingsFragment.requireContext()));
        c2801a.b = "Set wereaction";
        int i = 3;
        c2801a.s = new u70(c, i);
        c2801a.c(R.string.ok, new aza(debugDevSettingsFragment, i), true);
        c2801a.g();
        return true;
    }

    @Override // xsna.n8z0.b
    public void f(njz0 njz0Var, xla xlaVar) {
        ((g8x) this.c).c((rez0) njz0Var, xlaVar);
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        ((jza0.b) obj).onIsPlayingChanged(((fwa0) this.c).m());
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        CommunityCheckListFragment communityCheckListFragment = (CommunityCheckListFragment) this.c;
        int i = CommunityCheckListFragment.Y;
        if (bundle.getBoolean("IS_SHORTNAME_CHANGED", false)) {
            mvg.f fVar = mvg.f.b;
            communityCheckListFragment.getClass();
            xn50.a.c(communityCheckListFragment, fVar);
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 7:
                return ((Boolean) ((mo1) this.c).invoke(obj)).booleanValue();
            case 8:
                return ((Boolean) ((mo1) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((xsq) this.c).invoke(obj)).booleanValue();
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean z;
        zjr zjrVar = (zjr) this.c;
        if (task.isSuccessful()) {
            ixi ixiVar = zjrVar.c;
            synchronized (ixiVar) {
                ixiVar.c = Tasks.forResult(null);
            }
            uxi uxiVar = ixiVar.b;
            synchronized (uxiVar) {
                uxiVar.a.deleteFile(uxiVar.b);
            }
            if (task.getResult() != null) {
                JSONArray jSONArray = ((com.google.firebase.remoteconfig.internal.a) task.getResult()).d;
                shr shrVar = zjrVar.a;
                if (shrVar != null) {
                    try {
                        shrVar.a(zjr.e(jSONArray));
                    } catch (AbtException unused) {
                    } catch (JSONException e) {
                        Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e);
                    }
                }
            } else {
                Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            }
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                bpn0 bpn0Var = AppsPickerFragment.V;
                return (List) ((o82) obj2).invoke(obj);
            case 1:
                int i2 = AsrRecordStartFragment.U;
                return (it80) ((com.vk.movika.sdk.base.observable.m) obj2).invoke(obj);
            case 2:
                return (io.reactivex.rxjava3.core.b0) ((cq3) obj2).invoke(obj);
            case 3:
                int i3 = BaseDebugTogglesFragment.X;
                return (Pair) ((com.vk.movika.sdk.base.observable.o) obj2).invoke(obj);
            case 4:
                ((mo1) obj2).invoke(obj);
                return 0L;
            case 5:
                return (io.reactivex.rxjava3.core.o) ((com.vk.movika.sdk.base.observable.o) obj2).invoke(obj);
            case 6:
                return (ltb) ((com.vk.movika.sdk.base.observable.o) obj2).invoke(obj);
            case 7:
            case 8:
            case 11:
            case 12:
            case 13:
            case 15:
            case 16:
            case 18:
            case 22:
            case 23:
            case 24:
            case 27:
            default:
                return (List) ((xsq) obj2).invoke(obj);
            case 9:
                return (io.reactivex.rxjava3.core.b0) ((com.vk.movika.sdk.base.observable.o) obj2).invoke(obj);
            case 10:
                return (UsersUserFullDto) ((mo1) obj2).invoke(obj);
            case 14:
                return (List) ((mo1) obj2).invoke(obj);
            case 17:
                return (io.reactivex.rxjava3.core.t) ((kdn) obj2).invoke(obj);
            case 19:
                return (Boolean) ((xsq) obj2).invoke(obj);
            case 20:
                return (wmt) ((kdn) obj2).invoke(obj);
            case 21:
                return (y6u.d.c) ((xsq) obj2).invoke(obj);
            case 25:
                return (c.e) ((xsq) obj2).invoke(obj);
            case 26:
                return (Playlist) ((kdn) obj2).invoke(obj);
            case 28:
                return (lsf0) ((v240.a) obj2).invoke(obj);
        }
    }
}
