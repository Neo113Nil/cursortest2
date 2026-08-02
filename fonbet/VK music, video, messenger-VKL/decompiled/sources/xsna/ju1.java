package xsna;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.preference.Preference;
import com.vk.api.base.VkPaginationList;
import com.vk.api.sdk.auth.UtilityTokens;
import com.vk.attachpicker.impl.fragment.AttachMusicFragment;
import com.vk.clips.design.view.stikers.ClipsStickersView;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.profile.PlainAddress;
import com.vk.ecomm.checklist.impl.presentation.CommunityCheckListFragment;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.log.L;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;
import com.vk.voip.ui.settings.participants_view.j;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.Pair;
import xsna.bzp0;
import xsna.ihz;
import xsna.jza0;
import xsna.mvg;
import xsna.ngl;
import xsna.wwf;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ju1 implements io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.functions.l, Toolbar.h, io.reactivex.rxjava3.functions.g, ClipsStickersView.c, wwf.b, pcs, Preference.c, ngl.a, ihz.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ju1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 1:
                int i2 = AttachMusicFragment.I0;
                return (VkPaginationList) ((v24) obj2).invoke(obj);
            case 2:
                return (lw4) ((r8) obj2).invoke(obj);
            case 3:
                return (io.reactivex.rxjava3.core.e) ((com.vk.movika.sdk.base.observable.k) obj2).invoke(obj);
            case 4:
                return (Boolean) ((yy) obj2).invoke(obj);
            case 5:
            case 6:
            case 9:
            case 11:
            case 16:
            case 17:
            case 19:
            case 23:
            case 24:
            default:
                return (io.reactivex.rxjava3.core.b0) ((x4w) obj2).invoke(obj);
            case 7:
                return (od9) ((x4) obj2).invoke(obj);
            case 8:
                return (BitmapDrawable) ((v24) obj2).invoke(obj);
            case 10:
                return (s3q0) ((x4) obj2).invoke(obj);
            case 12:
                return (io.reactivex.rxjava3.core.o) ((x4) obj2).invoke(obj);
            case 13:
                return (io.reactivex.rxjava3.core.e) ((com.vk.movika.sdk.base.observable.k) obj2).invoke(obj);
            case 14:
                return (qih0) ((x4) obj2).invoke(obj);
            case 15:
                return (ypf) ((com.vk.movika.sdk.base.observable.k) obj2).invoke(obj);
            case 18:
                return (io.reactivex.rxjava3.core.e) ((z1j) obj2).invoke(obj);
            case 20:
                return (Bitmap) ((x4) obj2).invoke(obj);
            case 21:
                return (twl) ((l2i) obj2).invoke(obj);
            case 22:
                return (Dialog) ((l2i) obj2).invoke(obj);
            case 25:
                return (Pair) ((gzn) obj2).invoke(obj);
            case 26:
                return (List) ((l9n) obj2).invoke(obj);
        }
    }

    @Override // xsna.wwf.b
    public void b(twf twfVar) {
        CommunityAddressesFragment communityAddressesFragment = (CommunityAddressesFragment) this.c;
        tqg tqgVar = (tqg) twfVar;
        int i = CommunityAddressesFragment.E0;
        PlainAddress plainAddress = tqgVar.a;
        CommunityAddressesFragment.g gVar = communityAddressesFragment.S;
        if (gVar == null) {
            gVar = null;
        }
        gVar.g(false, plainAddress);
        communityAddressesFragment.qo(tqgVar);
    }

    @Override // io.reactivex.rxjava3.functions.g
    public Object d(Object obj, Object obj2, Object obj3) {
        return (hda) ((w9a) this.c).invoke(obj, obj2, obj3);
    }

    @Override // xsna.ngl.a
    public void e(bzp0.c cVar) {
        cop copVar = (cop) ((vop) this.c).a;
        if (copVar != null) {
            copVar.m2(cVar.a);
        }
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        UtilityTokens v = o25.a().v();
        enj.r(debugDevSettingsFragment.mo2getContext(), "Result= " + v.toString(), 0);
        L.e("[VKID] show utility tokens = " + v.toString());
        return true;
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        ((jza0.b) obj).E(((androidx.media3.exoplayer.c) this.c).T);
    }

    @Override // com.vk.clips.design.view.stikers.ClipsStickersView.c
    public void onClick() {
        ((s0e) this.c).d.z();
    }

    @Override // androidx.appcompat.widget.Toolbar.h
    public boolean onMenuItemClick(MenuItem menuItem) {
        com.vk.voip.ui.settings.participants_view.c cVar = (com.vk.voip.ui.settings.participants_view.c) this.c;
        if (menuItem.getItemId() != R.id.add) {
            return true;
        }
        cVar.a(j.f.a);
        return true;
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        CommunityCheckListFragment communityCheckListFragment = (CommunityCheckListFragment) this.c;
        int i = CommunityCheckListFragment.Y;
        if (bundle.getBoolean("IS_DESCRIPTION_CHANGED", false)) {
            mvg.f fVar = mvg.f.b;
            communityCheckListFragment.getClass();
            xn50.a.c(communityCheckListFragment, fVar);
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 0:
                return ((Boolean) ((com.vk.movika.sdk.base.observable.k) this.c).invoke(obj)).booleanValue();
            case 6:
                return ((Boolean) ((com.vk.movika.sdk.base.observable.k) this.c).invoke(obj)).booleanValue();
            case 28:
                return ((Boolean) ((gzn) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((l9n) this.c).invoke(obj)).booleanValue();
        }
    }
}
