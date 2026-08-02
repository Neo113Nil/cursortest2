package xsna;

import android.app.Activity;
import android.app.Application;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.Aa;
import com.ironsource.B2;
import com.ironsource.adapters.vungle.interstitial.VungleInterstitialAdapter;
import com.vk.auth.main.b;
import com.vk.catalog2.feature.music.holders.curator.CuratorInfoVh;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.money.MoneyTransfersFragment;
import com.vk.pending.PendingVideoAttachment;
import com.vkontakte.android.ui.widget.MenuListView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import one.video.calls.sdk_private.aF;
import ru.ok.android.externcalls.analytics.internal.upload.MultiUploadHelper;
import xsna.hy70;
import xsna.l2f;
import xsna.we9;
import xsna.yx50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class g0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MotionEvent motionEvent;
        Application application;
        dcn e;
        switch (this.b) {
            case 0:
                Aa.a((Aa) this.c);
                break;
            case 1:
                h30 h30Var = (h30) this.c;
                dw20 dw20Var = h30Var.p;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                h30Var.p = null;
                break;
            case 2:
                gzs gzsVar = (gzs) this.c;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
            case 3:
                yj3 yj3Var = (yj3) this.c;
                RecyclerView.e0 e0Var = yj3Var.s;
                if (e0Var != null && (motionEvent = yj3Var.t) != null) {
                    e0Var.itemView.setPressed(true);
                    e0Var.itemView.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
                    break;
                }
                break;
            case 4:
                B2.c((B2) this.c);
                break;
            case 5:
                al6 al6Var = (al6) this.c;
                if (!al6Var.t.c) {
                    com.vk.auth.main.b bVar = al6Var.d;
                    if (bVar == null) {
                        bVar = null;
                    }
                    b.a.a(bVar, true, al6Var.A0(), null, 4);
                    break;
                }
                break;
            case 6:
                we9.c cVar = (we9.c) this.c;
                if (we9.this.e == we9.e.PENDING_OPEN) {
                    we9.this.x(false);
                    break;
                }
                break;
            case 7:
                l2f.a aVar = (l2f.a) this.c;
                WeakReference<Activity> weakReference = aVar.e;
                Activity activity = weakReference.get();
                if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
                    l2f l2fVar = aVar.f;
                    if (l2fVar != null) {
                        l2fVar.show();
                    }
                    Activity activity2 = weakReference.get();
                    if (activity2 != null && (application = activity2.getApplication()) != null) {
                        application.registerActivityLifecycleCallbacks(aVar.h);
                    }
                    aVar.i = false;
                    break;
                }
                break;
            case 8:
                VkInputSelect vkInputSelect = (VkInputSelect) this.c;
                int i = com.vk.profile.questions.impl.b.q1;
                mhy.j(vkInputSelect);
                break;
            case 9:
                CuratorInfoVh curatorInfoVh = (CuratorInfoVh) this.c;
                dcn dcnVar = curatorInfoVh.t;
                if (dcnVar != null) {
                    dcnVar.dismiss();
                }
                View view = curatorInfoVh.h;
                if (view == null) {
                    view = null;
                }
                Activity h = e3m.h(view.getContext());
                if (h != null) {
                    Rect rect = new Rect();
                    View view2 = curatorInfoVh.h;
                    (view2 != null ? view2 : null).getGlobalVisibleRect(rect);
                    e = curatorInfoVh.s.e(h, rect, "audio:curator_page", new com.vk.movika.sdk.base.model.props.d(8));
                    curatorInfoVh.t = e;
                    break;
                }
                break;
            case 10:
                kke0 kke0Var = (kke0) this.c;
                String[] strArr = DebugDevSettingsFragment.t0;
                kke0Var.a(true, null);
                cvk.w("Регистрация Firebase обновлена.", false);
                break;
            case 11:
                com.vk.upload.impl.a.e(((PendingVideoAttachment) this.c).k.o0());
                break;
            case 12:
                ((ksl) this.c).Q0();
                break;
            case 13:
                r9v r9vVar = (r9v) this.c;
                r9vVar.D = true;
                r9vVar.u();
                break;
            case 14:
                MenuListView menuListView = (MenuListView) this.c;
                MenuListView.j jVar = menuListView.e;
                jVar.c = menuListView.c();
                jVar.notifyDataSetChanged();
                break;
            case 15:
                MoneyTransfersFragment moneyTransfersFragment = (MoneyTransfersFragment) this.c;
                int i2 = MoneyTransfersFragment.b1;
                moneyTransfersFragment.Ko();
                break;
            case 16:
                ((MultiUploadHelper) this.c).scheduleNextUpload(true, 1);
                break;
            case 17:
                ((yx50.d) this.c).a();
                break;
            case 18:
                ((hy70.a) this.c).a.cancel();
                break;
            case 19:
                xop0 xop0Var = (xop0) this.c;
                dxe0 dxe0Var = xop0Var.m;
                boolean z = xop0Var.r;
                dxe0Var.d.a(z);
                dxe0Var.e.a(z);
                break;
            case 20:
                sqt0.b((sqt0) this.c);
                break;
            case 21:
                VungleInterstitialAdapter.showAd$lambda$1((VungleInterstitialAdapter) this.c);
                break;
            case 22:
                one.video.calls.sdk_private.x xVar = ((cny0) this.c).f;
                Object[] objArr = {new fhy0(), new wgy0(2)};
                ArrayList arrayList = new ArrayList(2);
                for (int i3 = 0; i3 < 2; i3++) {
                    Object obj = objArr[i3];
                    Objects.requireNonNull(obj);
                    arrayList.add(obj);
                }
                xVar.a(Collections.unmodifiableList(arrayList), aF.c);
                break;
            case 23:
                com.vungle.ads.internal.load.g.h((com.vungle.ads.internal.load.g) this.c);
                break;
            case 24:
                ((ru.mail.libverify.api.s) this.c).v();
                break;
            default:
                ((com.my.tracker.obfuscated.w1) this.c).a();
                break;
        }
    }
}
