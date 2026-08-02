package xsna;

import androidx.preference.Preference;
import com.vk.api.generated.likes.dto.LikesAddResponseDto;
import com.vk.auth.api.models.AuthResult;
import com.vk.clips.sdk.shared.item.ads.events.AdsItemViewEvent;
import com.vk.common.links.AwayLink;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.fave.entities.FavePage;
import com.vk.newsfeed.common.PostActions;
import com.vk.superapp.vkhealth.permissions.api.RequestedMiniApp;
import com.vk.superapp.vkhealth.permissions.api.di.VkHealthPermissionsComponent;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.cs00;
import xsna.jnq;
import xsna.n8z0;
import xsna.qjc;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class o7 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.m, d0n0, n8z0.b, mw, Preference.c, qjc.a, z960 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o7(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.qjc.a
    public void I(AwayLink awayLink) {
        zr00 zr00Var = (zr00) this.c;
        xr00 xr00Var = zr00Var.v;
        if (xr00Var != null) {
            zr00Var.l.a(new cs00.f(xr00Var.b));
        }
    }

    @Override // xsna.mw
    public void a(boolean z) {
        ((h1d) this.c).b.a(new j3d(z));
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (List) ((r8) this.c).invoke(obj);
            case 1:
            case 2:
            case 4:
            case 5:
            case 9:
            case 12:
            case 20:
            case 24:
            case 26:
            default:
                return (x960) ((k220) this.c).invoke(obj);
            case 3:
                return (AuthResult) ((s45) this.c).invoke(obj);
            case 6:
                return (io.reactivex.rxjava3.core.t) ((zx) this.c).invoke(obj);
            case 7:
                return (io.reactivex.rxjava3.core.t) ((com.vk.im.engine.commands.messages.a) this.c).invoke(obj);
            case 8:
                return (List) ((gt) this.c).invoke(obj);
            case 10:
                return (io.reactivex.rxjava3.core.b0) ((com.vk.im.engine.commands.messages.a) this.c).invoke(obj);
            case 11:
                return (jpe) ((gt) this.c).invoke(obj);
            case 13:
                return (Integer) ((i4h) this.c).invoke(obj);
            case 14:
                return (qih0) ((i4h) this.c).invoke(obj);
            case 15:
                return (io.reactivex.rxjava3.core.e) ((i4h) this.c).invoke(obj);
            case 16:
                return (String) ((gt) this.c).invoke(obj);
            case 17:
                return (io.reactivex.rxjava3.core.t) ((pwk) this.c).invoke(obj);
            case 18:
                return (it80) ((gt) this.c).invoke(obj);
            case 19:
                return (LikesAddResponseDto) ((knt) this.c).invoke(obj);
            case 21:
                return (io.reactivex.rxjava3.core.t) ((yr00) this.c).invoke(obj);
            case 22:
                return (io.reactivex.rxjava3.core.t) ((com.vk.music.playlist.b) this.c).invoke(obj);
            case 23:
                return (io.reactivex.rxjava3.core.t) ((yr00) this.c).invoke(obj);
            case 25:
                return (io.reactivex.rxjava3.core.t) ((mf60) this.c).invoke(obj);
            case 27:
                return (lu60) ((k220) this.c).invoke(obj);
        }
    }

    @Override // xsna.d0n0
    public void b(c0n0 c0n0Var) {
        AdsItemViewEvent adsItemViewEvent;
        ux0 ux0Var = ((com.vk.clips.sdk.shared.item.ads.c) this.c).B;
        if (c0n0Var instanceof b0n0) {
            adsItemViewEvent = b01.b;
        } else {
            if (!(c0n0Var instanceof a0n0)) {
                throw new NoWhenBranchMatchedException();
            }
            adsItemViewEvent = a01.b;
        }
        ux0Var.a(adsItemViewEvent);
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        ((VkHealthPermissionsComponent) j6i.b(m7m.f(debugDevSettingsFragment), VkHealthPermissionsComponent.class)).Wb().j(debugDevSettingsFragment.requireContext(), RequestedMiniApp.VK_WORKOUT, null, new f1j(debugDevSettingsFragment, 3));
        return true;
    }

    @Override // xsna.n8z0.b
    public void f(njz0 njz0Var, xla xlaVar) {
        ((ff6) this.c).c((ikz0) njz0Var, xlaVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.z960
    public void g(VkContextMenu vkContextMenu, int i) {
        c990 c990Var = (c990) this.c;
        FavePage favePage = ((z990) c990Var.m).a;
        if (i == PostActions.ACTION_TOGGLE_FAVE.h()) {
            enq.k(c990Var.itemView.getContext(), favePage, new pqq(null, "FAVE", null, c990Var.n, 5), (r17 & 8) != 0 ? null : null, (r17 & 16) != 0 ? null : null, (r17 & 32) != 0, null, null, null);
        } else if (i == PostActions.ACTION_CUSTOMIZE_TAGS.h()) {
            int i2 = jnq.i;
            jnq.a.a(c990Var.l.getContext(), favePage, new pqq(null, "FAVE", null, c990Var.n, 5));
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 1:
                return ((Boolean) ((zx) this.c).invoke(obj)).booleanValue();
            case 5:
                return ((Boolean) ((q99) this.c).invoke(obj)).booleanValue();
            case 24:
                return ((Boolean) ((yr00) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((wo40) this.c).invoke(obj)).booleanValue();
        }
    }
}
