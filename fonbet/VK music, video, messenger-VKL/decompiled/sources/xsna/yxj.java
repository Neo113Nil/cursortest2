package xsna;

import android.content.Context;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* compiled from: CounterView.java */
/* loaded from: classes16.dex */
public final class yxj extends FrameLayout implements kxj {
    public final int b;
    public final ArrayList<String> c;
    public VkText d;
    public jxj e;
    public final VkButton f;

    /* compiled from: CounterView.java */
    public class a implements io.reactivex.rxjava3.functions.f<Long> {
        public a() {
        }

        @Override // io.reactivex.rxjava3.functions.f
        public final void accept(Long l) throws Throwable {
            Long l2 = l;
            yxj yxjVar = yxj.this;
            VkText vkText = yxjVar.d;
            ArrayList<String> arrayList = yxjVar.c;
            if (vkText != null) {
                vkText.animate().translationY(160.0f).setDuration(320L).setInterpolator(new AccelerateInterpolator()).start();
                vkText.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(80L).setStartDelay(240L).start();
            }
            if (l2.longValue() >= arrayList.size()) {
                yxjVar.f.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(300L).start();
                return;
            }
            String str = arrayList.get(l2.intValue());
            VkText vkText2 = new VkText(yxjVar.getContext(), null, 6, 0);
            vkText2.setText(str);
            vkText2.setTextColor(-1);
            vkText2.setTextSize(1, 32.0f);
            vkText2.setGravity(17);
            vkText2.setShadowLayer(yxjVar.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -16777216);
            yxjVar.d = vkText2;
            yxjVar.addView(vkText2);
            VkText vkText3 = yxjVar.d;
            vkText3.setTranslationY(-160.0f);
            vkText3.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            vkText3.animate().translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(640L).setInterpolator(new BounceInterpolator()).start();
            vkText3.animate().alpha(1.0f).setDuration(160L).start();
        }
    }

    public yxj(Context context) {
        super(context, null, R.attr.popupWindowStyle);
        this.b = iah0.a(3.0f);
        ArrayList<String> arrayList = new ArrayList<>();
        this.c = arrayList;
        arrayList.add("3");
        arrayList.add("2");
        arrayList.add("1");
        arrayList.add(getContext().getString(R.string.live_broadcast_start_live_now));
        VkButton vkButton = new VkButton(getContext(), null, 6, 0);
        this.f = vkButton;
        vkButton.setText(getContext().getString(R.string.live_broadcast_start_cancel));
        vkButton.setAppearance(VkButton.Appearance.Neutral);
        vkButton.setSize(VkButton.Size.Medium);
        vkButton.setMode(VkButton.Mode.Tertiary);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, iah0.a(68.0f));
        layoutParams.gravity = 80;
        vkButton.setLayoutParams(layoutParams);
        vkButton.setOnClickListener(new xxj(this));
        addView(vkButton);
    }

    @Override // xsna.rr6
    public Context getViewContext() {
        return getContext();
    }

    @Override // xsna.kxj
    public final io.reactivex.rxjava3.core.q<Long> i4() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        io.reactivex.rxjava3.internal.operators.observable.w2 B0 = io.reactivex.rxjava3.core.q.B0(320L, timeUnit);
        asu0 asu0Var = asu0.a;
        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = B0.r0(asu0Var.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b());
        io.reactivex.rxjava3.internal.operators.observable.m1 a02 = io.reactivex.rxjava3.core.q.S(0L, this.c.size() + 1, 100L, 1000L, timeUnit).r0(asu0Var.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b());
        a aVar = new a();
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return io.reactivex.rxjava3.core.q.q(a02.E(aVar, lVar, kVar, kVar), a0);
    }

    @Override // xsna.rr6
    public final void pause() {
        jxj jxjVar = this.e;
        if (jxjVar != null) {
            jxjVar.pause();
        }
    }

    @Override // xsna.rr6
    public final void release() {
        jxj jxjVar = this.e;
        if (jxjVar != null) {
            jxjVar.release();
        }
    }

    @Override // xsna.rr6
    public final void resume() {
        jxj jxjVar = this.e;
        if (jxjVar != null) {
            jxjVar.resume();
        }
    }

    public void setCancelPosition(float f) {
        this.f.setTranslationY(-iah0.a(f));
    }

    @Override // xsna.rr6
    public jxj getPresenter() {
        return null;
    }

    @Override // xsna.rr6
    public void setPresenter(jxj jxjVar) {
        this.e = jxjVar;
    }

    @Override // xsna.rr6
    public View getView() {
        return this;
    }
}
