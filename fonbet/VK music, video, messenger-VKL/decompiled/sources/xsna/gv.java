package xsna;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import androidx.preference.Preference;
import com.vk.clips.editor.templates.impl.player.a;
import com.vk.debug.internal.DebugCpuIntensiveTaskService;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.friends.recommendations.impl.presentation.FriendsImportFragment;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.media.player.PlayerError;
import com.vk.sharing.core.view.k;
import com.vk.sharing.im_engine_impl.BaseSharingExternalActivity;
import com.vk.stickers.views.gift.AnimatedGiftView;
import com.vk.superapp.api.dto.account.AccountCheckPasswordResponse;
import java.io.File;
import one.video.controls.view.faskseek.DownEventProcessor;
import one.video.controls.view.faskseek.FastSeekView;
import one.video.controls.view.faskseek.a;
import xsna.eqc;
import xsna.ihz;
import xsna.jza0;
import xsna.n8z0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class gv implements io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.functions.l, k.a, io.reactivex.rxjava3.functions.g, a.h, Preference.c, ihz.a, a.b, n8z0.b {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gv(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // com.vk.sharing.core.view.k.a
    public void a() {
        BaseSharingExternalActivity baseSharingExternalActivity = (BaseSharingExternalActivity) this.c;
        int i = BaseSharingExternalActivity.Z;
        baseSharingExternalActivity.H2(7);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 2:
                return (File) ((com.vk.movika.sdk.base.observable.m) obj2).invoke(obj);
            case 3:
            case 5:
            case 6:
            case 7:
            case 10:
            case 13:
            case 15:
            case 18:
            case 20:
            case 25:
            case 26:
            default:
                return (tt70) ((ye40) obj2).invoke(obj);
            case 4:
                return (io.reactivex.rxjava3.core.e) ((defpackage.c) obj2).invoke(obj);
            case 8:
                return (DialogExt) ((com.vk.movika.sdk.base.observable.m) obj2).invoke(obj);
            case 9:
                return (x25) ((n82) obj2).invoke(obj);
            case 11:
                return (eqc.a) ((defpackage.c) obj2).invoke(obj);
            case 12:
                return (fde) ((s8) obj2).invoke(obj);
            case 14:
                return (io.reactivex.rxjava3.core.t) ((o9) obj2).invoke(obj);
            case 16:
                return (io.reactivex.rxjava3.core.b0) ((myl) obj2).invoke(obj);
            case 17:
                return (io.reactivex.rxjava3.core.t) ((grp) obj2).invoke(obj);
            case 19:
                return (io.reactivex.rxjava3.core.b0) ((n82) obj2).invoke(obj);
            case 21:
                int i2 = FriendsImportFragment.a0;
                return (String) ((n82) obj2).invoke(obj);
            case 22:
                return (AccountCheckPasswordResponse) ((tw4) obj2).invoke(obj);
            case 23:
                return (BitmapDrawable) ((cqv) obj2).invoke(obj);
            case 24:
                return (io.reactivex.rxjava3.core.b0) ((cqv) obj2).invoke(obj);
            case 27:
                return (io.reactivex.rxjava3.core.b0) ((defpackage.c) obj2).invoke(obj);
            case 28:
                return (io.reactivex.rxjava3.core.t) ((com.vk.music.playlist.e) obj2).invoke(obj);
        }
    }

    @Override // com.vk.clips.editor.templates.impl.player.a.h
    public void b(PlayerError playerError, Exception exc) {
        ((y8d) this.c).a(playerError, exc);
    }

    @Override // one.video.controls.view.faskseek.a.b
    public void c() {
        FastSeekView fastSeekView = (FastSeekView) this.c;
        DownEventProcessor.a aVar = fastSeekView.g;
        if ((aVar != null ? aVar.a : null) == DownEventProcessor.Side.RIGHT) {
            DownEventProcessor downEventProcessor = fastSeekView.h;
            downEventProcessor.e = false;
            downEventProcessor.f = null;
            downEventProcessor.g = 0;
        }
        fastSeekView.b.e.setPressed(false);
    }

    @Override // io.reactivex.rxjava3.functions.g
    public Object d(Object obj, Object obj2, Object obj3) {
        return (hda) ((x9a) this.c).invoke(obj, obj2, obj3);
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        Context applicationContext = debugDevSettingsFragment.requireContext().getApplicationContext();
        applicationContext.startForegroundService(new Intent(applicationContext, (Class<?>) DebugCpuIntensiveTaskService.class));
        return true;
    }

    @Override // xsna.n8z0.b
    public void f(njz0 njz0Var, xla xlaVar) {
        ((c8x) this.c).c((rez0) njz0Var, xlaVar);
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        ((jza0.b) obj).a0((nc4) this.c);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return ((fw) obj2).g.contains(((n8o) obj).a());
            case 1:
                int i2 = AnimatedGiftView.g;
                return ((Boolean) ((com.vk.movika.sdk.base.observable.m) obj2).invoke(obj)).booleanValue();
            case 3:
                return ((Boolean) ((n82) obj2).invoke(obj)).booleanValue();
            case 6:
                return ((Boolean) ((com.vk.movika.sdk.base.observable.m) obj2).invoke(obj)).booleanValue();
            case 10:
                return ((Boolean) ((oc0) obj2).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((cqv) obj2).invoke(obj)).booleanValue();
        }
    }
}
