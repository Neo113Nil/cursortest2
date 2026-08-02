package xsna;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.preference.Preference;
import com.vk.auth.api.models.AuthResult;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.music.Playlist;
import com.vk.ecomm.reviews.impl.allreviews.presentation.c;
import com.vk.newsfeed.impl.fave_feed.presentation.fragment.FaveFeedFragment;
import com.vk.search.params.api.City;
import com.vk.search.params.api.VkPeopleSearchParams;
import java.util.List;
import xsna.cck;
import xsna.xkh;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c8 implements io.reactivex.rxjava3.functions.l, pcs, Preference.b, ptk0, io.reactivex.rxjava3.functions.m, bc80, z960 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c8(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        o2l o2lVar = o2l.a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        o2lVar.getClass();
        o2l.h("__dbg_fresco_debug_overlay", booleanValue);
        enj.r(debugDevSettingsFragment.mo2getContext(), "Please restart the app!", 0);
        return true;
    }

    @Override // xsna.ptk0
    public void a(lm50 lm50Var) {
        ((FaveFeedFragment) this.c).V.a(s3q0.a, (erq) lm50Var);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (io.reactivex.rxjava3.core.t) ((com.vk.movika.sdk.base.observable.a) this.c).invoke(obj);
            case 1:
                return (io.reactivex.rxjava3.core.e) ((com.vk.movika.sdk.base.observable.a) this.c).invoke(obj);
            case 2:
                return (bl60) ((com.vk.movika.sdk.base.observable.a) this.c).invoke(obj);
            case 3:
                return (AuthResult) ((yy) this.c).invoke(obj);
            case 4:
                return (List) ((com.vk.movika.sdk.base.observable.a) this.c).invoke(obj);
            case 5:
                return (io.reactivex.rxjava3.core.t) ((yy) this.c).invoke(obj);
            case 6:
                return (List) ((yy) this.c).invoke(obj);
            case 7:
                return (ClipsPlaylist) ((vf4) this.c).invoke(obj);
            case 8:
                return (xkh.b) ((yy) this.c).invoke(obj);
            case 9:
            case 10:
            case 13:
            case 20:
            case 22:
            default:
                return (io.reactivex.rxjava3.core.b0) ((o3w) this.c).invoke(obj);
            case 11:
                return (sr5) ((yy) this.c).invoke(obj);
            case 12:
                return (List) ((t1e) this.c).invoke(obj);
            case 14:
                return (io.reactivex.rxjava3.core.b0) ((xnr) this.c).invoke(obj);
            case 15:
                return (ke3) ((i37) this.c).invoke(obj);
            case 16:
                return (kru) ((yy) this.c).invoke(obj);
            case 17:
                return (io.reactivex.rxjava3.core.t) ((o3w) this.c).invoke(obj);
            case 18:
                return (c.f) ((qcw) this.c).invoke(obj);
            case 19:
                return (Boolean) ((ulz) this.c).invoke(obj);
            case 21:
                return (List) ((ulz) this.c).invoke(obj);
            case 23:
                return (Playlist) ((wyg) this.c).invoke(obj);
        }
    }

    @Override // xsna.z960
    public void g(VkContextMenu vkContextMenu, int i) {
        ((nwh0) this.c).g(vkContextMenu, i);
    }

    @Override // xsna.bc80
    public void onSuccess(Object obj) {
        ((jrg0) this.c).a.a();
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        Parcelable parcelable;
        Object parcelable2;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 9:
                fck fckVar = (fck) obj;
                qcy<Object>[] qcyVarArr = fck.t1;
                if (str.hashCode() == 328508925 && str.equals("invite_friends_result")) {
                    fckVar.eo().b(cck.a.b);
                    break;
                }
                break;
            default:
                lv90 lv90Var = (lv90) obj;
                qcy<Object>[] qcyVarArr2 = ph.n1;
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = bundle.getParcelable("database_result", City.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    Parcelable parcelable3 = bundle.getParcelable("database_result");
                    if (!(parcelable3 instanceof City)) {
                        parcelable3 = null;
                    }
                    parcelable = (City) parcelable3;
                }
                City city = (City) parcelable;
                zak0 zak0Var = (zak0) lv90Var.l1;
                VkPeopleSearchParams copy = ((VkPeopleSearchParams) zak0Var.getValue()).copy();
                if (city == null || city.b <= 0) {
                    copy.b = null;
                } else {
                    copy.b = city;
                }
                zak0Var.setValue(copy);
                break;
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 20:
                return ((Boolean) ((ulz) this.c).invoke(obj)).booleanValue();
            case 21:
            case 23:
            default:
                return ((Boolean) ((ulz) this.c).invoke(obj)).booleanValue();
            case 22:
                return ((Boolean) ((j0r) this.c).invoke(obj)).booleanValue();
            case 24:
                return ((Boolean) ((o3w) this.c).invoke(obj)).booleanValue();
        }
    }
}
