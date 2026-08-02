package xsna;

import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import android.widget.TextView;
import androidx.media3.exoplayer.audio.b;
import com.ironsource.C4602vb;
import com.vk.feed.tool.view.posting.zoomimage.ZoomImageView;
import com.vk.imageloader.view.VKImageView;
import com.vk.log.L;
import com.vk.menu.presentation.entity.TabMenuItemUiData;
import com.vk.navigation.NavigationDelegateActivity;
import com.vk.newsfeed.impl.presentation.suggested.presentation.fragment.SuggestedPostsFragment;
import com.vk.newsfeed.posting.market_picker.presentation.base.view.e;
import com.vk.newsfeed.posting.market_picker.presentation.base.view.h;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Result;
import ru.mail.libverify.api.VerificationApi;
import ru.ok.gleffects.impl.EffectNativeSink;
import xsna.dob;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class hc3 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hc3(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    public final void run() {
        View view;
        NavigationDelegateActivity navigationDelegateActivity;
        Object failure;
        switch (this.b) {
            case 0:
                jc3 jc3Var = (jc3) this.c;
                Object findContainingViewHolder = jc3Var.a.findContainingViewHolder((View) this.d);
                if (findContainingViewHolder instanceof w160) {
                    w160 w160Var = (w160) findContainingViewHolder;
                    w160Var.v4().addOnScrollListener(jc3Var.i);
                    jc3Var.j.add(w160Var.v4());
                    return;
                }
                return;
            case 1:
                TextView textView = (TextView) this.c;
                String str = (String) this.d;
                bpn0 bpn0Var = cqm0.a;
                textView.setText(str.concat("…"));
                return;
            case 2:
                b.a aVar = (b.a) this.c;
                Exception exc = (Exception) this.d;
                androidx.media3.exoplayer.audio.b bVar = aVar.b;
                String str2 = y2r0.a;
                bVar.q(exc);
                return;
            case 3:
                gzs gzsVar = (gzs) this.c;
                hu5 hu5Var = (hu5) this.d;
                gzsVar.invoke();
                ReentrantLock reentrantLock = hu5Var.b;
                reentrantLock.lock();
                try {
                    hu5Var.d = false;
                    hu5Var.c.signalAll();
                    s3q0 s3q0Var = s3q0.a;
                    return;
                } finally {
                    reentrantLock.unlock();
                }
            case 4:
                Surface surface = (Surface) this.c;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.d;
                surface.release();
                surfaceTexture.release();
                return;
            case 5:
                ynb ynbVar = (ynb) this.c;
                dob.h hVar = (dob.h) this.d;
                oob oobVar = ynbVar.l;
                if (oobVar != null) {
                    oobVar.u(hVar.a);
                    return;
                }
                return;
            case 6:
                ((EffectNativeSink) this.c).lambda$setMusicById$11((String) this.d);
                return;
            case 7:
                mjw mjwVar = (mjw) this.c;
                com.vk.newsfeed.posting.market_picker.presentation.base.view.d dVar = (com.vk.newsfeed.posting.market_picker.presentation.base.view.d) this.d;
                ZoomImageView zoomImageView = dVar.k;
                if (mjwVar != null) {
                    e.b bVar2 = dVar.c;
                    int i = bVar2.h;
                    int i2 = bVar2.i;
                    q6y0 q6y0Var = zoomImageView.m;
                    if (q6y0Var != null) {
                        q6y0Var.q = i;
                        q6y0Var.p = i2;
                        if (i != -1 || i2 != -1) {
                            q6y0Var.o.reset();
                            q6y0Var.c();
                            VKImageView g = q6y0Var.g();
                            if (g != null) {
                                g.invalidate();
                            }
                        }
                    }
                }
                h.b bVar3 = dVar.d;
                int i3 = dVar.b;
                com.vk.newsfeed.posting.market_picker.presentation.base.view.e eVar = com.vk.newsfeed.posting.market_picker.presentation.base.view.h.this.e;
                if (eVar.h == null || eVar.m != i3) {
                    zoomImageView.setZoomable(true);
                    dVar.a.setAlpha(1.0f);
                    return;
                }
                return;
            case 8:
                nx50 nx50Var = (nx50) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                if (nx50Var.L0 == null) {
                    r7v r7vVar = nx50Var.a0;
                    r7vVar.getClass();
                    if (arrayList.isEmpty() || r7vVar.g || (view = r7vVar.h) == null || (navigationDelegateActivity = r7vVar.i) == null) {
                        return;
                    }
                    View findViewById = view.findViewById(TabMenuItemUiData.HUB.h());
                    RectF G = findViewById != null ? bwt0.G(findViewById) : null;
                    View findViewById2 = view.findViewById(TabMenuItemUiData.HOME.h());
                    RectF G2 = findViewById2 != null ? bwt0.G(findViewById2) : null;
                    androidx.lifecycle.f fVar = r7vVar.j;
                    aes aesVar = fVar instanceof aes ? (aes) fVar : null;
                    r7vVar.a.a(navigationDelegateActivity, G, G2, aesVar != null ? aesVar.p1() : null, arrayList);
                    return;
                }
                return;
            case 9:
                try {
                    ((fq80) this.c).x((mdz) this.d);
                    failure = s3q0.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    L.j(a, "Failed to send analytics event");
                    return;
                }
                return;
            case 10:
                SuggestedPostsFragment suggestedPostsFragment = (SuggestedPostsFragment) this.c;
                sq60 sq60Var = (sq60) this.d;
                qcy<Object>[] qcyVarArr = SuggestedPostsFragment.r0;
                if (!suggestedPostsFragment.eo().c().A0(sq60Var.a)) {
                    suggestedPostsFragment.p0.d(sq60Var, (tc60) suggestedPostsFragment.eo().q.getValue(), suggestedPostsFragment.O.get());
                }
                suggestedPostsFragment.eo().d().l();
                return;
            case 11:
                ru.mail.libverify.notifications.a.a((ru.mail.libverify.notifications.a) this.c, (ru.mail.libverify.i.k) this.d);
                return;
            case 12:
                ((com.my.tracker.obfuscated.e0) this.c).a((List) this.d);
                return;
            case 13:
                ((ru.mail.libverify.api.q) this.c).a((VerificationApi.SmsCodeNotificationListener) this.d);
                return;
            default:
                C4602vb.a((C4602vb) this.c, (Runnable) this.d);
                return;
        }
    }
}
