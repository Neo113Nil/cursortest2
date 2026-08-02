package xsna;

import android.content.Context;
import android.util.Size;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.editor.templates.impl.views.main.ClipsTemplateEditorFragment;
import com.vk.media.player.video.view.SimpleVideoView;
import com.vkontakte.android.R;
import com.vkontakte.android.ui.widget.MenuListView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import me.grishka.appkit.views.UsableRecyclerView;
import one.video.calls.sdk_private.aF;
import ru.ok.android.externcalls.sdk.ConversationFactory;
import xsna.ikv0;
import xsna.n3q;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class ja6 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ja6(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n3q.a aVar;
        long j;
        switch (this.b) {
            case 0:
                l0c l0cVar = ((com.vk.auth.verification.base.a) this.c).p;
                (l0cVar != null ? l0cVar : null).i();
                return;
            case 1:
                ((rl9) this.c).a.o(false);
                return;
            case 2:
                ((pk) this.c).invoke();
                return;
            case 3:
                gzs gzsVar = (gzs) this.c;
                int i = ClipsTemplateEditorFragment.h0;
                gzsVar.invoke();
                return;
            case 4:
                ((ConversationFactory) this.c).lambda$requestServerTime$15();
                return;
            case 5:
                n3q n3qVar = (n3q) this.c;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                long nanos = timeUnit.toNanos(n3qVar.c.b());
                long nanos2 = timeUnit.toNanos(n3qVar.c.c());
                n3q.a aVar2 = new n3q.a(n3qVar, nanos2);
                while (!n3qVar.b.isTerminated() && !n3qVar.g) {
                    aVar2.a();
                    ReentrantLock reentrantLock = n3qVar.j;
                    reentrantLock.lock();
                    try {
                        long min = Math.min(nanos, nanos2);
                        long n = n3q.n(n3qVar.q(), nanos);
                        boolean isEmpty = n3qVar.i.isEmpty();
                        while (!isEmpty && n3qVar.q() < n) {
                            try {
                                if (n3qVar.k.awaitNanos(min) > 0) {
                                    aVar = aVar2;
                                    j = nanos;
                                } else {
                                    long q = n3qVar.q();
                                    long j2 = q - n;
                                    List r = n3q.r(n3qVar.i);
                                    if (j2 <= 0 || r.isEmpty() || n3qVar.g) {
                                        aVar = aVar2;
                                        j = nanos;
                                    } else {
                                        List<adx0> r2 = n3q.r(n3qVar.i);
                                        ArrayList arrayList = new ArrayList();
                                        for (adx0 adx0Var : r2) {
                                            aVar = aVar2;
                                            try {
                                                j = nanos;
                                            } catch (InterruptedException unused) {
                                                j = nanos;
                                                min = (n - n3qVar.q()) - 1;
                                                aVar2 = aVar;
                                                nanos = j;
                                            }
                                            try {
                                                if (q - adx0Var.c <= j) {
                                                    adx0Var = null;
                                                }
                                                if (adx0Var != null) {
                                                    arrayList.add(adx0Var);
                                                }
                                                aVar2 = aVar;
                                                nanos = j;
                                            } catch (InterruptedException unused2) {
                                                min = (n - n3qVar.q()) - 1;
                                                aVar2 = aVar;
                                                nanos = j;
                                            }
                                        }
                                        aVar = aVar2;
                                        j = nanos;
                                        if (arrayList.isEmpty()) {
                                            arrayList = null;
                                        }
                                        if (arrayList != null) {
                                            n3qVar.c.d(arrayList);
                                        }
                                    }
                                    aVar.a();
                                }
                            } catch (InterruptedException unused3) {
                                aVar = aVar2;
                            }
                            aVar2 = aVar;
                            nanos = j;
                        }
                        n3q.a aVar3 = aVar2;
                        long j3 = nanos;
                        s3q0 s3q0Var = s3q0.a;
                        reentrantLock.unlock();
                        aVar2 = aVar3;
                        nanos = j3;
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                }
                return;
            case 6:
                pbx pbxVar = (pbx) this.c;
                c63 c63Var = c63.a;
                Context b = c63.b();
                if (b == null && (b = x93.a()) == null) {
                    return;
                }
                ikv0 ikv0Var = pbxVar.b;
                if (ikv0Var != null) {
                    if (ikv0Var != null) {
                        ikv0Var.a();
                    }
                    pbxVar.b = null;
                }
                ikv0.a aVar4 = new ikv0.a(b);
                aVar4.u = new ikv0.d(new ikv0.d.c(b.getResources().getString(R.string.interactive_video_pip_info_message)), (ikv0.d.b) null, (ikv0.d.a) null, 6);
                float f = 28;
                aVar4.t = new ikv0.c.C3058c(R.drawable.vk_icon_info_circle_28, Integer.valueOf(R.attr.vk_ui_icon_accent), new Size(iah0.a(f), iah0.a(f)), 8);
                aVar4.h = new l2i(pbxVar, 19);
                pbxVar.b = pkv0.f(aVar4);
                return;
            case 7:
                MenuListView menuListView = (MenuListView) this.c;
                UsableRecyclerView usableRecyclerView = menuListView.d;
                if (usableRecyclerView == null || usableRecyclerView.getAdapter() == null) {
                    return;
                }
                menuListView.setExpansion(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return;
            case 8:
                dcl0<hfz> dcl0Var = ((gbf0) this.c).k;
                if (dcl0Var != null) {
                    dcl0Var.m();
                    return;
                }
                return;
            case 9:
                SimpleVideoView simpleVideoView = SimpleVideoView.this;
                int i2 = SimpleVideoView.V;
                simpleVideoView.u.d(simpleVideoView, simpleVideoView.y, simpleVideoView.z);
                return;
            case 10:
                xpu0 xpu0Var = (xpu0) this.c;
                if (xpu0Var.d) {
                    xpu0Var.d = false;
                    xpu0Var.a.dismiss();
                    return;
                }
                return;
            case 11:
                krw0 krw0Var = (krw0) this.c;
                krw0Var.a.invoke(krw0Var.b.invoke());
                return;
            default:
                one.video.calls.sdk_private.x xVar = ((cny0) this.c).f;
                Object[] objArr = {new fhy0(), new wgy0(2)};
                ArrayList arrayList2 = new ArrayList(2);
                for (int i3 = 0; i3 < 2; i3++) {
                    Object obj = objArr[i3];
                    Objects.requireNonNull(obj);
                    arrayList2.add(obj);
                }
                xVar.a(Collections.unmodifiableList(arrayList2), aF.a);
                return;
        }
    }
}
