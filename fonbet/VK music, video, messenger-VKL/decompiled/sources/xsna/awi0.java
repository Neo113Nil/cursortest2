package xsna;

import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.libvideo.minified_player.VideoMinifiedPlayerStateHolder;
import com.vk.voip.VoipCallActivity;
import com.vk.voip.ui.actions.feature.VoipActionsFeatureState;
import com.vk.voip.ui.history.past.presentation.base.fragment.VoipPastCallsFragment;
import java.util.List;
import java.util.Map;
import ru.mail.libverify.n.g;
import xsna.aig;
import xsna.s9u;
import xsna.v9w0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class awi0 implements io.reactivex.rxjava3.functions.l, s9u.d, io.reactivex.rxjava3.functions.m, SwipeDrawableRefreshLayout.g, com.mbridge.msdk.config.component.info.provider.listener.a, g.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ awi0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // com.mbridge.msdk.config.component.info.provider.listener.a
    public void a(Map map) {
        ((com.mbridge.msdk.config.component.info.provider.a) this.c).b(map);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return (io.reactivex.rxjava3.core.e) ((yhu) obj2).invoke(obj);
            case 1:
                return (Boolean) ((ha40) obj2).invoke(obj);
            case 2:
                return (s3q0) ((k7l0) obj2).invoke(obj);
            case 3:
                return (Boolean) ((ha40) obj2).invoke(obj);
            case 4:
                return (io.reactivex.rxjava3.core.t) ((hto0) obj2).invoke(obj);
            case 5:
            case 10:
            case 11:
            case 15:
            case 17:
            default:
                return (NewsEntry) ((yva) obj2).invoke(obj);
            case 6:
                return (tfs0) ((ha40) obj2).invoke(obj);
            case 7:
                return (VideoMinifiedPlayerStateHolder.State) ((com.vk.libvideo.minified_player.b) obj2).invoke(obj);
            case 8:
                return (List) ((k990) obj2).invoke(obj);
            case 9:
                return (io.reactivex.rxjava3.core.q) ((k7l0) obj2).c;
            case 12:
                return (v9w0.c.b) ((p9w0) obj2).invoke(obj);
            case 13:
                return (VoipActionsFeatureState.e) ((p9w0) obj2).invoke(obj);
            case 14:
                int i2 = VoipCallActivity.P;
                return (Boolean) ((p9w0) obj2).invoke(obj);
            case 16:
                int i3 = otw0.i1;
                return (Boolean) ((k7l0) obj2).invoke(obj);
            case 18:
                return (nex0) ((dh8) obj2).invoke(obj);
        }
    }

    @Override // com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout.g
    public void h() {
        ((VoipPastCallsFragment) this.c).T.a(aig.e.a);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 11:
                return ((Boolean) ((ha40) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((p9w0) this.c).invoke(obj)).booleanValue();
        }
    }

    @Override // ru.mail.libverify.n.g.a
    public boolean a(String str) {
        boolean f;
        f = ((ru.mail.libverify.api.s) this.c).f(str);
        return f;
    }

    @Override // xsna.s9u.d
    public void a() {
        wj00 wj00Var = ((hm00) this.c).a.l;
        if (wj00Var != null) {
            wj00Var.a();
        }
    }
}
