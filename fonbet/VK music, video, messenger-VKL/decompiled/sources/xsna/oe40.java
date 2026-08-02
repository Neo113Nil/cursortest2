package xsna;

import android.view.View;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.newsfeed.impl.presentation.from_notifications.presentation.fragment.PostsFromNotificationsFragment;
import com.vk.video.ui.discovery.catalog.b;
import com.vk.vmoji.character.model.VmojiStickerPacksModel;
import com.vk.voip.ui.picture_in_picture.overlay.PictureInPictureOverlayService;
import com.vk.voip.ui.sessionrooms.dialog.model.a;
import java.util.List;
import xsna.avc0;
import xsna.jgz0;
import xsna.kkz0;
import xsna.q0n0;
import xsna.qmw0;
import xsna.ydz0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class oe40 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.m, SwipeDrawableRefreshLayout.g, m6o, io.reactivex.rxjava3.functions.c, j7j, ydz0.b {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oe40(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.ydz0.b
    public void a(View view, dhz0 dhz0Var) {
        kkz0.a aVar;
        ydz0 ydz0Var = (ydz0) this.c;
        if (!view.isEnabled() || (aVar = ydz0Var.t) == null) {
            return;
        }
        ((jgz0.b) aVar).a(1, dhz0Var);
    }

    @Override // xsna.j7j
    public void accept(Object obj) {
        q0n0 q0n0Var = (q0n0) this.c;
        wkk wkkVar = (wkk) obj;
        q0n0.a aVar = new q0n0.a(wkkVar.b, tkk.a(wkkVar.a, wkkVar.c));
        q0n0Var.c.add(aVar);
        long j = q0n0Var.j;
        if (j == C.TIME_UNSET || wkkVar.d >= j) {
            q0n0Var.f(aVar);
        }
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (io.reactivex.rxjava3.core.b0) ((s62) this.c).invoke(obj);
            case 1:
            case 3:
            case 4:
            case 6:
            case 9:
            case 10:
            case 12:
            default:
                return (String) ((u5u0) this.c).invoke(obj);
            case 2:
                return (x960) ((oqu) this.c).invoke(obj);
            case 5:
                return (i5f0) ((i750) this.c).invoke(obj);
            case 7:
                return (Double) ((gqe0) this.c).invoke(obj);
            case 8:
                return (it80) ((j6e0) this.c).invoke(obj);
            case 11:
                return (List) ((j6e0) this.c).invoke(obj);
            case 13:
                return (io.reactivex.rxjava3.core.b0) ((vnb0) this.c).invoke(obj);
            case 14:
                return (Boolean) ((j6e0) this.c).invoke(obj);
            case 15:
                return (it80) ((j6e0) this.c).invoke(obj);
            case 16:
                return (b.a) ((qjl0) this.c).invoke(obj);
            case 17:
                return (io.reactivex.rxjava3.core.e) ((vnb0) this.c).invoke(obj);
            case 18:
                return (VmojiStickerPacksModel) ((j6e0) this.c).invoke(obj);
            case 19:
                return (qmw0.a) ((j6e0) this.c).invoke(obj);
            case 20:
                return (Post) ((qjl0) this.c).invoke(obj);
        }
    }

    @Override // xsna.m6o
    public double b(double d) {
        pjp0 pjp0Var = (pjp0) this.c;
        double d2 = pjp0Var.b;
        return d >= pjp0Var.e ? Math.pow((d2 * d) + pjp0Var.c, pjp0Var.a) : pjp0Var.d * d;
    }

    @Override // com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout.g
    public void h() {
        PostsFromNotificationsFragment postsFromNotificationsFragment = (PostsFromNotificationsFragment) this.c;
        qcy<Object>[] qcyVarArr = PostsFromNotificationsFragment.p0;
        vvc0 vvc0Var = (vvc0) ((luc0) postsFromNotificationsFragment.U.getValue()).a.invoke();
        if (vvc0Var != null) {
            vvc0Var.b(avc0.d.b.b);
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 1:
                return ((Boolean) ((i750) obj2).invoke(obj)).booleanValue();
            case 2:
            default:
                return ((Boolean) ((j6e0) obj2).invoke(obj)).booleanValue();
            case 3:
                int i2 = PictureInPictureOverlayService.g;
                return ((Boolean) ((oqu) obj2).invoke(obj)).booleanValue();
        }
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (a.b) ((fn7) this.c).invoke(obj, obj2);
    }
}
