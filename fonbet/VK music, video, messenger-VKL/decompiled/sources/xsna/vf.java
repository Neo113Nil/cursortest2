package xsna;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.music.player.analytics.api.mediascope.MusicMediaScopeAction;
import com.vk.music.player.analytics.impl.tracker.mediascope.MusicMediaScopeCommand;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLHandshakeException;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;
import xsna.kw40;
import xsna.xua0;

/* compiled from: AbstractMusicMediaScopeService.kt */
/* loaded from: classes3.dex */
public abstract class vf implements nn40 {
    public final bpn0 a = new bpn0(new com.vk.movika.sdk.base.ui.o0(1));
    public final ArrayList<Integer> b = new ArrayList<>();
    public final HashMap<Integer, io.reactivex.rxjava3.disposables.c> c = new HashMap<>();
    public final HashMap<Integer, io.reactivex.rxjava3.disposables.c> d = new HashMap<>();
    public final HashMap<Integer, io.reactivex.rxjava3.disposables.c> e = new HashMap<>();

    public static void e(Throwable th) {
        String message;
        if (((th instanceof ConnectException) && (message = th.getMessage()) != null && drm0.D(message, "ERR_CONNECTION_CLOSED", false)) || (th instanceof SSLHandshakeException)) {
            L.G("MusicMediaScope request was registered");
        } else if (th instanceof SocketTimeoutException) {
            L.G("MusicMediaScope request timed out");
        } else {
            L.E(th, new Object[0]);
        }
    }

    @Override // xsna.nn40
    public final void a(iwa0 iwa0Var) {
        kw40 kw40Var = iwa0Var.a;
        if (!(kw40Var instanceof kw40.b)) {
            if (kw40Var instanceof kw40.a) {
                g(MusicMediaScopeAction.PLAYER);
                return;
            } else {
                if (!(kw40Var instanceof kw40.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                g(MusicMediaScopeAction.PLAYER);
                return;
            }
        }
        MusicMediaScopeAction musicMediaScopeAction = MusicMediaScopeAction.PLAYER;
        if (!epx.f(((kw40.b) kw40Var).b, xua0.d.a)) {
            f(musicMediaScopeAction);
            return;
        }
        Integer valueOf = Integer.valueOf(musicMediaScopeAction.h());
        HashMap<Integer, io.reactivex.rxjava3.disposables.c> hashMap = this.c;
        io.reactivex.rxjava3.disposables.c cVar = hashMap.get(valueOf);
        if (cVar != null) {
            cVar.dispose();
        }
        hashMap.put(Integer.valueOf(musicMediaScopeAction.h()), d(musicMediaScopeAction, MusicMediaScopeCommand.PING));
    }

    public final io.reactivex.rxjava3.disposables.c d(final MusicMediaScopeAction musicMediaScopeAction, final MusicMediaScopeCommand musicMediaScopeCommand) {
        return io.reactivex.rxjava3.core.a.l(new io.reactivex.rxjava3.functions.a() { // from class: xsna.uf
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                L l = L.a;
                l.getClass();
                boolean m = L.m(LoggerOutputTarget.NONE);
                MusicMediaScopeCommand musicMediaScopeCommand2 = musicMediaScopeCommand;
                MusicMediaScopeAction musicMediaScopeAction2 = musicMediaScopeAction;
                if (!m) {
                    L.u(l, L.LogType.d, new Object[]{"MusicMediaScope " + musicMediaScopeAction2 + ' ' + musicMediaScopeCommand2});
                }
                ((wy2) this.a.getValue()).p(new tkv(musicMediaScopeCommand2.a(musicMediaScopeAction2.h()), false, 12));
            }
        }).q(asu0.a.c()).subscribe(io.reactivex.rxjava3.internal.functions.a.c, new tf(new oa(musicMediaScopeAction, musicMediaScopeCommand, this), 0));
    }

    public final void f(MusicMediaScopeAction musicMediaScopeAction) {
        Integer valueOf = Integer.valueOf(musicMediaScopeAction.h());
        ArrayList<Integer> arrayList = this.b;
        if (arrayList.contains(valueOf)) {
            return;
        }
        arrayList.add(Integer.valueOf(musicMediaScopeAction.h()));
        Integer valueOf2 = Integer.valueOf(musicMediaScopeAction.h());
        HashMap<Integer, io.reactivex.rxjava3.disposables.c> hashMap = this.d;
        io.reactivex.rxjava3.disposables.c cVar = hashMap.get(valueOf2);
        if (cVar != null) {
            cVar.dispose();
        }
        hashMap.put(Integer.valueOf(musicMediaScopeAction.h()), d(musicMediaScopeAction, MusicMediaScopeCommand.START));
        if (musicMediaScopeAction != MusicMediaScopeAction.PLAYER) {
            Integer valueOf3 = Integer.valueOf(musicMediaScopeAction.h());
            HashMap<Integer, io.reactivex.rxjava3.disposables.c> hashMap2 = this.c;
            io.reactivex.rxjava3.disposables.c cVar2 = hashMap2.get(valueOf3);
            if (cVar2 != null) {
                cVar2.dispose();
            }
            hashMap2.put(Integer.valueOf(musicMediaScopeAction.h()), io.reactivex.rxjava3.core.q.P(ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS, ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS, TimeUnit.MILLISECONDS).U(new c7(new b7(1, this, musicMediaScopeAction), 1)).subscribe(new qf(new pf(0), 0), new sf(new rf(this, musicMediaScopeAction), 0)));
        }
    }

    public final void g(MusicMediaScopeAction musicMediaScopeAction) {
        Integer valueOf = Integer.valueOf(musicMediaScopeAction.h());
        ArrayList<Integer> arrayList = this.b;
        if (arrayList.contains(valueOf)) {
            io.reactivex.rxjava3.disposables.c cVar = this.c.get(Integer.valueOf(musicMediaScopeAction.h()));
            if (cVar != null) {
                cVar.dispose();
            }
            Integer valueOf2 = Integer.valueOf(musicMediaScopeAction.h());
            HashMap<Integer, io.reactivex.rxjava3.disposables.c> hashMap = this.e;
            io.reactivex.rxjava3.disposables.c cVar2 = hashMap.get(valueOf2);
            if (cVar2 != null) {
                cVar2.dispose();
            }
            hashMap.put(Integer.valueOf(musicMediaScopeAction.h()), d(musicMediaScopeAction, MusicMediaScopeCommand.STOP));
            arrayList.remove(Integer.valueOf(musicMediaScopeAction.h()));
        }
    }
}
