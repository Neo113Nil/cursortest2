package xsna;

import android.view.View;
import com.ironsource.C4339gg;
import com.ironsource.C4546s9;
import com.ironsource.InterfaceC4240b7;
import com.ironsource.InterfaceC4309f4;
import com.ironsource.InterfaceC4321fg;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.dto.stickers.bonus.StickersBonusRewardTerms;
import com.vk.dto.user.UserProfile;
import com.vk.profile.core.tabs.ui.clips.Clips;
import java.lang.ref.WeakReference;
import java.util.List;
import xsna.q7h0;
import xsna.wfu;
import xsna.y490;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class pi40 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.g, io.reactivex.rxjava3.functions.m, i0u0, InterfaceC4321fg, yads.ng1, InterfaceC4309f4.d {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pi40(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // com.ironsource.InterfaceC4309f4.d
    public void a(InterfaceC4240b7 interfaceC4240b7) {
        ((com.ironsource.sdk.controller.v) this.c).a(interfaceC4240b7);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (hda) ((pj1) this.c).invoke(obj);
            case 1:
                return (it80) ((f0z) this.c).invoke(obj);
            case 2:
            case 8:
            case 13:
            case 20:
            default:
                return (u6x0) ((xvl0) this.c).invoke(obj);
            case 3:
                return (Boolean) ((viu) this.c).invoke(obj);
            case 4:
                return (Boolean) ((com) this.c).invoke(obj);
            case 5:
                return (UserProfile) ((viu) this.c).invoke(obj);
            case 6:
                return (q7h0.a) ((r820) this.c).invoke(obj);
            case 7:
                return (List) ((viu) this.c).invoke(obj);
            case 9:
                return (StickersBonusRewardTerms) ((viu) this.c).invoke(obj);
            case 10:
                return (io.reactivex.rxjava3.core.e) ((viu) this.c).invoke(obj);
            case 11:
                return (s3q0) ((xvl0) this.c).invoke(obj);
            case 12:
                return (List) ((d220) this.c).invoke(obj);
            case 14:
                return (Clips) ((fo6) this.c).invoke(obj);
            case 15:
                return (String) ((jyq0) this.c).invoke(obj);
            case 16:
                return (GroupsGetByIdObjectResponseDto) ((jyq0) this.c).invoke(obj);
            case 17:
                return (hda) ((qyi0) this.c).invoke(obj);
            case 18:
                return (wia0) ((i9e) this.c).invoke(obj);
            case 19:
                return (hda) ((xvl0) this.c).invoke(obj);
            case 21:
                return (List) ((jyq0) this.c).invoke(obj);
            case 22:
                return (Integer) ((jyq0) this.c).invoke(obj);
        }
    }

    @Override // io.reactivex.rxjava3.functions.g
    public Object d(Object obj, Object obj2, Object obj3) {
        return (wfu.a.b) ((y490.d) this.c).invoke(obj, obj2, obj3);
    }

    @Override // xsna.i0u0
    public View get() {
        return (View) new WeakReference(((olq0) this.c).g).get();
    }

    @Override // yads.ng1
    public void invoke(Object obj) {
        ((yads.af) obj).getClass();
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 8:
                break;
            case 20:
                break;
        }
        return ((Boolean) ((jyq0) this.c).invoke(obj)).booleanValue();
    }

    @Override // com.ironsource.InterfaceC4321fg
    public void a(gzs gzsVar) {
        C4339gg.a((C4546s9) this.c, gzsVar);
    }
}
