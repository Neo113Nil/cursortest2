package xsna;

import androidx.preference.Preference;
import com.vk.core.view.AdsButton;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.clips.media.ClipsEncoderParameters;
import com.vk.dto.common.data.VKList;
import com.vk.friends.impl.birthdays.presentation.BirthdaysListFragment;
import com.vk.im.itemlist.impl.presentation.fragment.ImItemListFragment;
import com.vk.newsfeed.posting.impl.domain.model.LocalMediaEntry;
import com.vk.settings.GetAccountSettingsRequest;
import com.vk.superapp.api.dto.menu.SuperAppAnimationConfig;
import com.vk.voip.ui.broadcast.fragments.config.BroadcastConfigFragment;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.fb7;
import xsna.ia7;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class np1 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.m, AdsButton.b, Preference.c, io.reactivex.rxjava3.functions.g, ptk0, h9l, io.reactivex.rxjava3.functions.b, cvp {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ np1(ImItemListFragment imItemListFragment, p7w p7wVar) {
        this.b = 23;
        this.c = p7wVar;
    }

    @Override // com.vk.core.view.AdsButton.b
    public void O2(int i) {
        ((g27) this.c).O2(i);
    }

    @Override // xsna.ptk0
    public void a(lm50 lm50Var) {
        p7w p7wVar = (p7w) this.c;
        q7w q7wVar = (q7w) lm50Var;
        qcy<Object>[] qcyVarArr = ImItemListFragment.S;
        try {
            qcy<Object>[] qcyVarArr2 = ImItemListFragment.S;
            p7wVar.l.J0(q7wVar.b, new h1(19, p7wVar, q7wVar));
            s3q0 s3q0Var = s3q0.a;
        } catch (Throwable th) {
            com.vk.metrics.eventtracking.b.a.q(th);
        }
    }

    @Override // io.reactivex.rxjava3.functions.b
    public void accept(Object obj, Object obj2) {
        ((com.vk.core.view.components.spinner.c) this.c).dismiss();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return (VKList) ((t6) obj2).invoke(obj);
            case 1:
            case 2:
            case 3:
            case 8:
            case 12:
            case 13:
            case 17:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            default:
                return (io.reactivex.rxjava3.core.b0) ((wik) obj2).invoke(obj);
            case 4:
                int i2 = BroadcastConfigFragment.U;
                return (Boolean) ((y40) obj2).invoke(obj);
            case 5:
                return (hda) ((com.vk.channels.impl.channel_screen.send_msg.e) obj2).invoke(obj);
            case 6:
                return (hda) ((na7) obj2).invoke(obj);
            case 7:
                return (hda) ((iba) obj2).invoke(obj);
            case 9:
                return (io.reactivex.rxjava3.core.b0) ((aa5) obj2).invoke(obj);
            case 10:
                return (List) ((t6) obj2).invoke(obj);
            case 11:
                return (ClipsEncoderParameters) ((na7) obj2).invoke(obj);
            case 14:
                return (com.vk.im.engine.models.dialogs.c) ((wik) obj2).invoke(obj);
            case 15:
                return (Integer) ((y40) obj2).invoke(obj);
            case 16:
                return (Boolean) ((y40) obj2).invoke(obj);
            case 18:
                return (Boolean) ((c4r) obj2).invoke(obj);
            case 19:
                return (Boolean) ((c4r) obj2).invoke(obj);
            case 27:
                return (LocalMediaEntry) ((c4r) obj2).invoke(obj);
            case 28:
                return (SuperAppAnimationConfig) ((wik) obj2).invoke(obj);
        }
    }

    public void b(fb7 fb7Var) {
        BirthdaysListFragment birthdaysListFragment = (BirthdaysListFragment) this.c;
        int i = BirthdaysListFragment.T;
        if (fb7Var instanceof fb7.c) {
            xn50.a.c(birthdaysListFragment, ia7.c.b.b);
            return;
        }
        if (fb7Var instanceof fb7.d) {
            xn50.a.c(birthdaysListFragment, ia7.c.a.b);
            return;
        }
        if (fb7Var instanceof fb7.e) {
            xn50.a.c(birthdaysListFragment, ia7.d.a.b);
            return;
        }
        if (fb7Var instanceof fb7.a) {
            xn50.a.c(birthdaysListFragment, ia7.d.b.b);
        } else {
            if (!(fb7Var instanceof fb7.b)) {
                throw new NoWhenBranchMatchedException();
            }
            fb7.b bVar = (fb7.b) fb7Var;
            xn50.a.c(birthdaysListFragment, new ia7.b(bVar.a, bVar.b));
        }
    }

    @Override // xsna.cvp
    public void c() {
        ((com.vk.libvideo.live.impl.views.live.b) this.c).a();
    }

    @Override // io.reactivex.rxjava3.functions.g
    public Object d(Object obj, Object obj2, Object obj3) {
        return (GetAccountSettingsRequest.Result) ((odi) this.c).invoke(obj, obj2, obj3);
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        ky6 j = com.vk.core.preference.Preference.j();
        wjy.a.getClass();
        uek b = wjy.b();
        asu0.a.getClass();
        asu0.n().submit(new com.vk.debug.ui.dev.c(debugDevSettingsFragment, b, j, 0));
        return true;
    }

    @Override // xsna.h9l
    public g9l provide() {
        return new kea0((oga0) this.c, o25.a());
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 1:
                break;
            case 8:
                break;
            case 12:
                break;
            case 17:
                break;
            case 21:
                break;
        }
        return ((Boolean) ((c4r) this.c).invoke(obj)).booleanValue();
    }

    public /* synthetic */ np1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
