package xsna;

import android.location.Location;
import androidx.preference.Preference;
import com.vk.clips.design.view.seek.ClipsSeekBar;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.ecomm.catalog.impl.geo.e;
import com.vk.friends.requests.impl.requests.presentation.FriendRequestsFragment;
import com.vk.superapp.api.dto.identity.WebIdentityPhone;
import com.vk.voip.miniapps.impl.picture_in_picture.overlay.MiniAppCallPiPOverlayService;
import com.yandex.div.core.view2.divs.tabs.DivTabsBinder;
import com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import xsna.fit;
import xsna.hlw;
import xsna.m99;
import xsna.mwa;
import xsna.npf;
import xsna.ub9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class mj1 implements io.reactivex.rxjava3.functions.l, ClipsSeekBar.a, io.reactivex.rxjava3.functions.c, Preference.c, BaseDivTabbedCardUi.Input, hlw.a, io.reactivex.rxjava3.functions.m {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mj1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // com.vk.clips.design.view.seek.ClipsSeekBar.a
    public void a(float f) {
        ((hyd) this.c).c.l(f);
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (ruf) ((s77) this.c).invoke((ruf) obj, obj2);
    }

    @Override // xsna.hlw.a
    public void d(hlw hlwVar) {
        ub9.a aVar = (ub9.a) this.c;
        try {
            alw c = hlwVar.c();
            if (c == null) {
                aVar.d(new IllegalStateException("Unable to acquire image"));
            } else {
                if (aVar.b(c)) {
                    return;
                }
                c.close();
            }
        } catch (IllegalStateException e) {
            aVar.d(e);
        }
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        enj.r(debugDevSettingsFragment.mo2getContext(), "Please restart the app!", 0);
        return true;
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.Input
    public List getTabs() {
        List bindAdapter$lambda$5;
        bindAdapter$lambda$5 = DivTabsBinder.bindAdapter$lambda$5((ArrayList) this.c);
        return bindAdapter$lambda$5;
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        viu viuVar = (viu) this.c;
        int i = MiniAppCallPiPOverlayService.e;
        return ((Boolean) viuVar.invoke(obj)).booleanValue();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return (wia0) ((lj1) obj2).invoke(obj);
            case 1:
                return (List) ((oj) obj2).invoke(obj);
            case 2:
                return (byte[]) ((fo6) obj2).invoke(obj);
            case 3:
                return (s3q0) ((v9) obj2).invoke(obj);
            case 4:
                return (m99.a) ((v9) obj2).invoke(obj);
            case 5:
                return (List) ((oj) obj2).invoke(obj);
            case 6:
                return (mwa.a) ((v9) obj2).invoke(obj);
            case 7:
                return (e.a.b) ((wgc) obj2).invoke(obj);
            case 8:
                return (io.reactivex.rxjava3.core.b0) ((v9) obj2).invoke(obj);
            case 9:
            case 14:
            case 15:
            case 17:
            case 25:
            default:
                return (hy30) ((kw30) obj2).invoke(obj);
            case 10:
                return (List) ((oj) obj2).invoke(obj);
            case 11:
                return ((n3f) obj2).invoke(obj);
            case 12:
                return (io.reactivex.rxjava3.core.t) ((ydf) obj2).invoke(obj);
            case 13:
                return (npf.i) ((oj) obj2).invoke(obj);
            case 16:
                return (j8n) ((f8n) obj2).invoke(obj);
            case 18:
                int i2 = FriendRequestsFragment.d0;
                return (FriendRequestsFragment.b) ((oj) obj2).invoke(obj);
            case 19:
                return (Set) ((per) obj2).invoke(obj);
            case 20:
                return (uxm0) ((fit.d) obj2).invoke(obj);
            case 21:
                return (WebIdentityPhone) ((ut6) obj2).invoke(obj);
            case 22:
                return (Boolean) ((oj) obj2).invoke(obj);
            case 23:
                return (o130) ((ozh) obj2).invoke(obj);
            case 24:
                return (Integer) ((viu) obj2).invoke(obj);
            case 26:
                return (Location) ((qxz) obj2).invoke(obj);
            case 27:
                return (n410) ((ozh) obj2).invoke(obj);
        }
    }
}
