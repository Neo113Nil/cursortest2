package xsna;

import android.os.Bundle;
import androidx.preference.Preference;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.c;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.archive.impl.ArchiveWithChannelsFragment;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.common.data.VKList;
import com.vk.libvideo.design.view.live.LiveView;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;
import com.vk.profile.core.tabs.ui.clips.Clips;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import kotlin.Pair;
import xsna.bmt;
import xsna.cwh.a;
import xsna.ihz;
import xsna.jza0;
import xsna.klz;
import xsna.nx5;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class h8 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.m, c.b, pcs, io.reactivex.rxjava3.functions.c, Preference.c, nx5.a, klz.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h8(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.nx5.a
    public void a(Object obj, Object obj2) {
        androidx.media3.exoplayer.c cVar = (androidx.media3.exoplayer.c) this.c;
        ((Integer) obj).getClass();
        Integer num = (Integer) obj2;
        final int intValue = num.intValue();
        cVar.X();
        cVar.L(1, 10, num);
        cVar.L(2, 10, num);
        cVar.n.f(21, new ihz.a() { // from class: xsna.i6q
            @Override // xsna.ihz.a
            public final void invoke(Object obj3) {
                ((jza0.b) obj3).a(intValue);
            }
        });
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        switch (this.b) {
            case 14:
                return (Pair) ((zdi) this.c).invoke(obj, obj2);
            default:
                return (VKList) ((com.vk.movika.tools.controls.seekbar.s) this.c).invoke(obj, obj2);
        }
    }

    public void b(boolean z) {
        LiveView liveView = (LiveView) this.c;
        if (liveView.p != null) {
            liveView.p.setBottomSheetParams(new ojf0(iah0.a((z && fnj.b(liveView.getContext())) ? 96 : 64), false, 2.4f, true, true, true));
        }
    }

    @Override // com.google.android.material.tabs.c.b
    public void c(TabLayout.g gVar, int i) {
        List list = (List) this.c;
        int i2 = ArchiveWithChannelsFragment.V;
        gVar.p(((Number) list.get(i)).intValue());
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        a1w a1wVar = ((DebugDevSettingsFragment) this.c).o0;
        pzv r = a1wVar.r();
        r.getClass();
        a1wVar.e(pzv.a(r, null, null, 0L, new wv0(21), null, -1, -4194305, -1), null);
        return true;
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        cwh cwhVar = (cwh) this.c;
        cwhVar.a.requireView().postDelayed(cwhVar.new a(bundle), 150L);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 2:
                return ((Boolean) ((g8) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((b810) this.c).invoke(obj)).booleanValue();
        }
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return (List) ((g8) obj2).invoke(obj);
            case 1:
                return (UsersUserFullDto) ((qb) obj2).invoke(obj);
            case 2:
            case 3:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 22:
            default:
                return (io.reactivex.rxjava3.core.b0) ((fa00) obj2).invoke(obj);
            case 4:
                return (io.reactivex.rxjava3.core.b0) ((com.vk.movika.sdk.base.observable.p) obj2).invoke(obj);
            case 5:
                return (io.reactivex.rxjava3.core.e) ((com.vk.libvideo.design.view.video.a) obj2).invoke(obj);
            case 6:
                return (it80) ((ul1) obj2).invoke(obj);
            case 7:
                return (Set) ((g8) obj2).invoke(obj);
            case 8:
                return (io.reactivex.rxjava3.core.b0) ((com.vk.libvideo.design.view.video.a) obj2).invoke(obj);
            case 9:
                return (io.reactivex.rxjava3.core.t) ((n15) obj2).invoke(obj);
            case 10:
                int i2 = CommunityAddressesFragment.E0;
                return (io.reactivex.rxjava3.core.t) ((g8) obj2).invoke(obj);
            case 11:
                return (Clips) ((com.vk.libvideo.design.view.video.a) obj2).invoke(obj);
            case 12:
                return (String) ((g8) obj2).invoke(obj);
            case 18:
                return (of3) ((m8) obj2).invoke(obj);
            case 19:
                return (Boolean) ((g8) obj2).invoke(obj);
            case 20:
                return (bmt.a) ((zkh) obj2).invoke(obj);
            case 21:
                return (Optional) ((zkh) obj2).invoke(obj);
            case 23:
                return (io.reactivex.rxjava3.core.t) ((svz) obj2).invoke(obj);
            case 24:
                return (io.reactivex.rxjava3.core.b0) ((n15) obj2).invoke(obj);
            case 25:
                return (io.reactivex.rxjava3.core.b0) ((b810) obj2).invoke(obj);
            case 26:
                return (tt70) ((svz) obj2).invoke(obj);
            case 27:
                return (String) ((svz) obj2).invoke(obj);
        }
    }
}
