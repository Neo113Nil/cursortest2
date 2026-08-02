package xsna;

import androidx.lifecycle.Lifecycle;
import androidx.preference.Preference;
import com.vk.debug.ui.user.DebugUserSettingsFragment;
import com.vk.dto.common.Peer;
import com.vk.dto.music.Playlist;
import com.vk.friends.impl.followers.presentation.fragments.AbsFollowersListFragment;
import com.vk.httpexecutor.api.NetworkClient;
import com.vk.movika.sdk.base.data.dto.ManifestDto;
import com.vk.movika.sdk.base.data.dto.MediaDto;
import com.vk.profile.core.tabs.ui.clips.Clips;
import com.vk.story.viewer.api.StoryViewerRouter;
import com.vk.superapp.bridges.advertisement.AdRequestEvent;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import okhttp3.p;
import xsna.e3s;
import xsna.ktt;
import xsna.mwa;
import xsna.u3s;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class pa implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.i, io.reactivex.rxjava3.functions.c, xh0, Preference.b, io.reactivex.rxjava3.functions.g, h9l, io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.s, s580, io.reactivex.rxjava3.functions.m {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pa(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        ajx0 ajx0Var = (ajx0) this.c;
        int i = DebugUserSettingsFragment.l0;
        ajx0Var.setEnabled(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // xsna.xh0
    public void a(AdRequestEvent adRequestEvent) {
        ((yu0) ((iwf) this.c).f.getValue()).b(adRequestEvent);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 1:
                return (io.reactivex.rxjava3.core.b0) ((oa) this.c).invoke(obj);
            case 2:
            case 6:
            case 7:
            case 11:
            case 12:
            case 14:
            case 18:
            case 20:
            case 21:
            case 22:
            case 25:
            default:
                return (Triple) ((u6k) this.c).invoke(obj);
            case 3:
                return (io.reactivex.rxjava3.core.b0) ((ay0) this.c).invoke(obj);
            case 4:
                return (it80) ((ay0) this.c).invoke(obj);
            case 5:
                return (hda) ((ay0) this.c).invoke(obj);
            case 8:
                return (List) ((oa) this.c).invoke(obj);
            case 9:
                ((j60) this.c).invoke(obj);
                return Boolean.FALSE;
            case 10:
                return (io.reactivex.rxjava3.core.e) ((ay0) this.c).invoke(obj);
            case 13:
                return (Clips) ((g84) this.c).invoke(obj);
            case 15:
                return (Peer) ((izs) this.c).invoke(obj);
            case 16:
                return (Playlist) ((u6k) this.c).invoke(obj);
            case 17:
                return (List) ((oa) this.c).invoke(obj);
            case 19:
                return (io.reactivex.rxjava3.core.t) ((oa) this.c).invoke(obj);
            case 23:
                return (io.reactivex.rxjava3.core.t) ((g84) this.c).invoke(obj);
            case 24:
                return (io.reactivex.rxjava3.core.t) ((xpt) this.c).invoke(obj);
            case 26:
                return (Pair) ((u6k) this.c).invoke(obj);
        }
    }

    public yg5 b() {
        xh5 xh5Var = ((com.vk.libvideo.autoplay.b) this.c).c;
        if (xh5Var != null) {
            return xh5Var.a;
        }
        return null;
    }

    public void c(u3s u3sVar) {
        AbsFollowersListFragment absFollowersListFragment = (AbsFollowersListFragment) this.c;
        int i = AbsFollowersListFragment.Y;
        if (u3sVar instanceof u3s.b) {
            e3s.c.b bVar = e3s.c.b.b;
            absFollowersListFragment.getClass();
            xn50.a.c(absFollowersListFragment, bVar);
            return;
        }
        if (u3sVar instanceof u3s.c) {
            e3s.c.a aVar = e3s.c.a.b;
            absFollowersListFragment.getClass();
            xn50.a.c(absFollowersListFragment, aVar);
        } else if (u3sVar instanceof u3s.d) {
            e3s.d.a aVar2 = e3s.d.a.b;
            absFollowersListFragment.getClass();
            xn50.a.c(absFollowersListFragment, aVar2);
        } else {
            if (!(u3sVar instanceof u3s.a)) {
                throw new NoWhenBranchMatchedException();
            }
            e3s.d.b bVar2 = e3s.d.b.b;
            absFollowersListFragment.getClass();
            xn50.a.c(absFollowersListFragment, bVar2);
        }
    }

    @Override // io.reactivex.rxjava3.functions.g
    public Object d(Object obj, Object obj2, Object obj3) {
        return (ktt.a) ((kbi) this.c).invoke(obj, obj2, obj3);
    }

    @Override // io.reactivex.rxjava3.functions.i
    public Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return (hda) ((jaa) this.c).invoke(obj, obj2, obj3, obj4, obj5);
    }

    @Override // xsna.h9l
    public g9l provide() {
        return new url0((StoryViewerRouter) this.c);
    }

    @Override // io.reactivex.rxjava3.core.a0
    public void subscribe(io.reactivex.rxjava3.core.y yVar) {
        gbx gbxVar = (gbx) this.c;
        o260 o260Var = d260.a;
        if (o260Var == null) {
            o260Var = null;
        }
        okhttp3.o oVar = new okhttp3.o(o260Var.i(NetworkClient.ClientType.CLIENT_DEFAULT));
        p.a aVar = new p.a();
        aVar.i(gbxVar.a);
        okhttp3.u execute = ((f8f0) oVar.a(aVar.b())).execute();
        if (!execute.t()) {
            if (yVar.h()) {
                return;
            }
            yVar.onError(new IllegalStateException("Error while loading manifest, response code = " + execute.e));
            return;
        }
        okhttp3.v vVar = execute.h;
        String string = vVar != null ? vVar.string() : null;
        if (string == null) {
            yVar.onError(new NoSuchElementException("Error while loading manifest, response is empty"));
            return;
        }
        j8y j8yVar = (j8y) gbxVar.b.b;
        j8yVar.getClass();
        ManifestDto manifestDto = (ManifestDto) j8yVar.a(ManifestDto.Companion.serializer(), string);
        MediaDto mediaDto = manifestDto.c;
        if (mediaDto == null) {
            yVar.onError(new IllegalStateException(new NullPointerException("Media is null")));
            return;
        }
        try {
            yVar.onSuccess(new dj00(gbxVar.c.d(manifestDto, mediaDto)));
        } catch (Throwable th) {
            yVar.onError(th);
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return ((Boolean) ((xpt) this.c).invoke(obj)).booleanValue();
    }

    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(io.reactivex.rxjava3.core.r rVar) {
        lyz lyzVar = (lyz) this.c;
        final mnk mnkVar = new mnk();
        mnkVar.b.e(Lifecycle.State.RESUMED);
        rVar.a(new io.reactivex.rxjava3.functions.e() { // from class: xsna.kyz
            @Override // io.reactivex.rxjava3.functions.e
            public final void cancel() {
                mnk.this.b.e(Lifecycle.State.DESTROYED);
            }
        });
        ((vyz) lyzVar.a.c.g()).a.a(new az2(18, mnkVar, rVar), mnkVar);
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        switch (this.b) {
            case 7:
                return (mwa.a) ((nx7) this.c).invoke(obj, obj2);
            default:
                return (Map) ((xpd) this.c).invoke(obj, obj2);
        }
    }
}
