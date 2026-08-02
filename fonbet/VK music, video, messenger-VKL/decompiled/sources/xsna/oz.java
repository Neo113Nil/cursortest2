package xsna;

import android.app.Notification;
import com.vk.biometrics.lock.impl.presentation.base.mvi.pin.BiometricsLockPinFragment;
import com.vk.channels.impl.list.g;
import com.vk.clips.design.view.timeline.MultiVideoTimelineView;
import com.vk.clips.entrypoints.ui.ClipsEntryPointDraftsFragment;
import com.vk.ecomm.cart.impl.cart.ui.emptycart.EmptyCartRootViewHolder;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.metrics.eventtracking.Event;
import com.vk.music.playerservice.impl.PlayerService;
import xsna.drz;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class oz implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oz(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((ui) obj2).invoke(obj);
                break;
            case 1:
                ((e5) obj2).invoke(obj);
                break;
            case 2:
                ((e5) obj2).invoke(obj);
                break;
            case 3:
                ((e5) obj2).invoke(obj);
                break;
            case 4:
                int i2 = BiometricsLockPinFragment.c0;
                ((po1) obj2).invoke(obj);
                break;
            case 5:
                ((e5) obj2).invoke(obj);
                break;
            case 6:
                com.vk.channels.impl.list.b bVar = (com.vk.channels.impl.list.b) obj2;
                Throwable th = (Throwable) obj;
                bVar.s().b(th, new nh0(3));
                bVar.n(new g.b(th));
                break;
            case 7:
                ChatFragment.d dVar = ChatFragment.w1;
                ((oqb) obj2).invoke(obj);
                break;
            case 8:
                ((rd1) obj2).invoke(obj);
                break;
            case 9:
                ((vw4) obj2).invoke(obj);
                break;
            case 10:
                int i3 = ClipsEntryPointDraftsFragment.Y;
                ((defpackage.y) obj2).invoke(obj);
                break;
            case 11:
                ((no1) obj2).invoke(obj);
                break;
            case 12:
                ((wje) obj2).invoke(obj);
                break;
            case 13:
                ((wje) obj2).invoke(obj);
                break;
            case 14:
                ((EmptyCartRootViewHolder.a) obj2).invoke(obj);
                break;
            case 15:
                ((nm1) obj2).invoke(obj);
                break;
            case 16:
                com.vk.folders.impl.configure.d dVar2 = (com.vk.folders.impl.configure.d) obj2;
                dVar2.q(new tn0(13, (drz.a) obj, dVar2));
                break;
            case 17:
                ((gwg) obj2).invoke(obj);
                break;
            case 18:
                ((bmt) obj2).e((dmt) obj);
                break;
            case 19:
                ((wje) obj2).invoke(obj);
                break;
            case 20:
                ((com.vk.update.core.b) obj2).invoke(obj);
                break;
            case 21:
                ((wje) obj2).invoke(obj);
                break;
            case 22:
                ((bgy) obj2).invoke(obj);
                break;
            case 23:
                int i4 = MultiVideoTimelineView.y0;
                ((bgy) obj2).invoke(obj);
                break;
            case 24:
                Notification notification = (Notification) obj;
                zoi0 zoi0Var = ((mp40) obj2).a;
                boolean h = zoi0Var.a.getState().h();
                boolean S = zoi0Var.e.S();
                boolean a = gz80.a(26);
                PlayerService playerService = zoi0Var.b;
                jp40 jp40Var = kvf.b;
                if (jp40Var == null) {
                    jp40Var = null;
                }
                boolean z = a && jp40Var.c(playerService, "audio_playback_channel");
                if (a) {
                    bn40.f(zhy0.a("ServiceNotificationHelper channel: audio_playback_channel, isExist = ", z));
                }
                com.vk.metrics.eventtracking.b bVar2 = com.vk.metrics.eventtracking.b.a;
                el3 el3Var = Event.b;
                Event.a b = h5s.b("update_notification");
                b.a(Boolean.valueOf(h), "is_play_state");
                b.a(Boolean.valueOf(S), "paused_by_transient_focusLost");
                b.a(Boolean.valueOf(z), "has_notification_channel");
                b.f();
                b.i("FirebaseTracker");
                bVar2.k(b.e());
                int b2 = zoi0Var.d.b();
                bn40.f("PlayerService startForeground");
                if (gz80.a(29)) {
                    playerService.startForeground(b2, notification, 2);
                } else {
                    playerService.startForeground(b2, notification);
                }
                playerService.m();
                break;
            case 25:
                ((bgy) obj2).invoke(obj);
                break;
            case 26:
                ((bgy) obj2).invoke(obj);
                break;
            case 27:
                ((bgy) obj2).invoke(obj);
                break;
            case 28:
                ((pb00) obj2).invoke(obj);
                break;
            default:
                ((mmm) obj2).invoke(obj);
                break;
        }
    }
}
