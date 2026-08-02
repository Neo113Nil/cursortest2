package xsna;

import androidx.preference.Preference;
import com.vk.content.design.view.photo.flow.PhotoFlowToolbarView;
import com.vk.core.tips.Tooltip;
import com.vk.photos.root.selectalbum.domain.a;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.SettingsAccountInnerFragment;
import com.vkontakte.android.fragments.SettingsGeneralFragment;
import com.vkontakte.android.fragments.UnreadCounterSettingsFragment;
import java.util.List;
import xsna.g7g0;
import xsna.p8c0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class n8c0 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.c, io.reactivex.rxjava3.functions.m, PhotoFlowToolbarView.c, Preference.c, Tooltip.c {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n8c0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // com.vk.content.design.view.photo.flow.PhotoFlowToolbarView.c
    public void a0() {
        ((xd40) this.c).invoke(a.C1511a.b);
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        switch (this.b) {
            case 4:
                return (g7g0.c) ((v3l) this.c).invoke(obj, obj2);
            case 13:
                return (Boolean) ((v3l) this.c).invoke(obj, obj2);
            default:
                return (it80) ((l71) this.c).invoke(obj, obj2);
        }
    }

    @Override // com.vk.core.tips.Tooltip.c
    public void c(int i) {
        ((vtn0) this.c).b();
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        int i = this.b;
        Object obj = this.c;
        int i2 = 1;
        switch (i) {
            case 7:
                SettingsAccountInnerFragment settingsAccountInnerFragment = (SettingsAccountInnerFragment) obj;
                int i3 = SettingsAccountInnerFragment.r0;
                settingsAccountInnerFragment.getClass();
                new UnreadCounterSettingsFragment.a(UnreadCounterSettingsFragment.class, null, null).l(settingsAccountInnerFragment);
                break;
            default:
                SettingsGeneralFragment settingsGeneralFragment = (SettingsGeneralFragment) obj;
                SettingsGeneralFragment.ro("ClearMessagesCacheClicked");
                com.vk.core.view.components.spinner.c cVar = new com.vk.core.view.components.spinner.c(settingsGeneralFragment.getActivity());
                cVar.n(settingsGeneralFragment.getResources().getString(R.string.loading));
                cVar.show();
                cVar.setCancelable(false);
                settingsGeneralFragment.m0.b(new io.reactivex.rxjava3.internal.operators.observable.s0(new zkt(settingsGeneralFragment, i2)).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new g600(cVar, 23)));
                break;
        }
        return true;
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 5:
                break;
            case 16:
                break;
        }
        return ((Boolean) ((acc0) this.c).invoke(obj)).booleanValue();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (p8c0.b) ((dn20) this.c).invoke(obj);
            case 1:
                return (List) ((acc0) this.c).invoke(obj);
            case 2:
                return (gtc0) ((dn20) this.c).invoke(obj);
            case 3:
                return (io.reactivex.rxjava3.core.b0) ((dn20) this.c).invoke(obj);
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            default:
                return (io.reactivex.rxjava3.core.t) ((p6e0) this.c).invoke(obj);
            case 9:
                return (io.reactivex.rxjava3.core.t) ((twi0) this.c).invoke(obj);
            case 10:
                return (h0n0) ((acc0) this.c).invoke(obj);
            case 12:
                return (String) ((vsp) this.c).invoke(obj);
            case 14:
                return (io.reactivex.rxjava3.core.t) ((rat0) this.c).invoke(obj);
        }
    }
}
