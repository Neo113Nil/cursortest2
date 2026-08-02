package xsna;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.widget.DatePicker;
import androidx.preference.Preference;
import com.ironsource.X3;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.im.ui.fragments.ImDialogsSelectionFragment;
import com.vk.superapp.api.dto.identity.WebCity;
import com.vk.superapp.bridges.advertisement.AdRequestEvent;
import com.vk.superapp.navigation.api.VkBridgeAnalytics;
import com.vkontakte.android.BirthdayBroadcastReceiver;
import com.vkontakte.android.fragments.DatabaseSearchFragment;
import java.util.Date;
import java.util.List;
import ru.ok.android.webrtc.participant.CallParticipants;
import ru.ok.android.webrtc.participant.talking.OwnTalkingReporter;
import ru.ok.gleffects.dto.UserInfo;
import xsna.bfz;
import xsna.bg7;
import xsna.fit;
import xsna.gob;
import xsna.ub9;
import xsna.xkh;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class mm6 implements DatabaseSearchFragment.c, io.reactivex.rxjava3.functions.l, OwnTalkingReporter.Listener, ub9.c, Preference.c, xh0, io.reactivex.rxjava3.functions.m {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mm6(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.xh0
    public void a(AdRequestEvent adRequestEvent) {
        VkBridgeAnalytics E;
        xwv0 xwv0Var = ((n1y) this.c).b;
        if (xwv0Var == null || (E = xwv0Var.E()) == null) {
            return;
        }
        E.b(adRequestEvent);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 1:
                return (bg7.c.a) ((d37) obj2).invoke(obj);
            case 2:
                return (it80) ((mo1) obj2).invoke(obj);
            case 3:
                return (io.reactivex.rxjava3.core.b0) ((hb) obj2).invoke(obj);
            case 4:
            case 5:
            case 15:
            case 21:
            default:
                return (io.reactivex.rxjava3.core.e) ((jh3) obj2).invoke(obj);
            case 6:
                return (hda) ((hb) obj2).invoke(obj);
            case 7:
                return (List) ((ll1) obj2).invoke(obj);
            case 8:
                return (io.reactivex.rxjava3.core.b0) ((jh3) obj2).invoke(obj);
            case 9:
                return (gob.a) ((iob) obj2).invoke(obj);
            case 10:
                return (UserInfo) ((hb) obj2).invoke(obj);
            case 11:
                return (io.reactivex.rxjava3.core.b0) ((whe) obj2).invoke(obj);
            case 12:
                return (List) ((xv2) obj2).invoke(obj);
            case 13:
                return ((xkh.f) obj2).invoke(obj);
            case 14:
                return (cak) ((d37) obj2).invoke(obj);
            case 16:
                return (io.reactivex.rxjava3.core.b0) ((arq) obj2).invoke(obj);
            case 17:
                return (nak) ((fit.g) obj2).invoke(obj);
            case 18:
                return (io.reactivex.rxjava3.core.b0) ((zxo) obj2).invoke(obj);
            case 19:
                return (io.reactivex.rxjava3.core.b0) ((m4g) obj2).invoke(obj);
            case 20:
                int i2 = ImDialogsSelectionFragment.n0;
                return (io.reactivex.rxjava3.core.b0) ((ll1) obj2).invoke(obj);
            case 22:
                return (bfz.a.C2608a) ((f1s) obj2).invoke(obj);
            case 23:
                return (io.reactivex.rxjava3.core.b0) ((cu4) obj2).invoke(obj);
            case 24:
                return (Integer) ((j4x) obj2).invoke(obj);
            case 25:
                return (aop0) ((j4x) obj2).invoke(obj);
            case 26:
                return (gxo) ((leq) obj2).invoke(obj);
        }
    }

    @Override // xsna.ub9.c
    public Object attachCompleter(ub9.a aVar) {
        we9 we9Var = (we9) this.c;
        we9Var.d.execute(new i(5, we9Var, aVar));
        return "Release[request=" + we9Var.n.getAndIncrement() + X3.j.e;
    }

    @Override // com.vkontakte.android.fragments.DatabaseSearchFragment.c
    public void b(Object obj) {
        om6.b((om6) this.c, (WebCity) obj);
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        final DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        Date date = new Date();
        new DatePickerDialog(debugDevSettingsFragment.getActivity(), new DatePickerDialog.OnDateSetListener() { // from class: xsna.q3l
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                String[] strArr2 = DebugDevSettingsFragment.t0;
                DebugDevSettingsFragment debugDevSettingsFragment2 = DebugDevSettingsFragment.this;
                debugDevSettingsFragment2.getClass();
                Date date2 = new Date(0L);
                date2.setDate(i3);
                date2.setMonth(i2);
                date2.setYear(i - 1900);
                Intent intent = new Intent(debugDevSettingsFragment2.getActivity(), (Class<?>) BirthdayBroadcastReceiver.class);
                intent.putExtra("force", true);
                intent.putExtra("date", date2.getTime());
                debugDevSettingsFragment2.getActivity().sendBroadcast(intent);
            }
        }, date.getYear() + 1900, date.getMonth(), date.getDate()).show();
        return true;
    }

    @Override // ru.ok.android.webrtc.participant.talking.OwnTalkingReporter.Listener
    public void onTalking(boolean z) {
        ((CallParticipants) this.c).setMeTalking(z);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 27:
                return ((Boolean) ((j4x) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((ll1) this.c).invoke(obj)).booleanValue();
        }
    }
}
