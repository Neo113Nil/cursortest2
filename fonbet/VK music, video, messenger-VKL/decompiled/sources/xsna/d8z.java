package xsna;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import com.google.android.material.R$anim;
import com.google.android.material.progressindicator.a;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import ru.ok.android.webrtc.PeerVideoSettings;
import xsna.qlo;

/* compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
/* loaded from: classes13.dex */
public final class d8z extends otw<ObjectAnimator> {
    public static final int[] k = {PeerVideoSettings.IDEAL_BITS_PER_MACROBLOCK, 567, 850, UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS};
    public static final int[] l = {1267, 1000, 333, 0};
    public static final a m = new a(Float.class, "animationFraction");
    public ObjectAnimator c;
    public ObjectAnimator d;
    public final Interpolator[] e;
    public final m8z f;
    public int g;
    public boolean h;
    public float i;
    public lf2 j;

    /* compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
    public class a extends Property<d8z, Float> {
        @Override // android.util.Property
        public final Float get(d8z d8zVar) {
            return Float.valueOf(d8zVar.i);
        }

        @Override // android.util.Property
        public final void set(d8z d8zVar, Float f) {
            d8z d8zVar2 = d8zVar;
            float floatValue = f.floatValue();
            d8zVar2.i = floatValue;
            int i = (int) (floatValue * 1800.0f);
            Interpolator[] interpolatorArr = d8zVar2.e;
            ArrayList arrayList = d8zVar2.b;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                qlo.a aVar = (qlo.a) arrayList.get(i2);
                int[] iArr = d8z.l;
                int i3 = i2 * 2;
                int i4 = iArr[i3];
                int[] iArr2 = d8z.k;
                aVar.a = xwk.a(interpolatorArr[i3].getInterpolation(otw.b(i, i4, iArr2[i3])), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                int i5 = i3 + 1;
                aVar.b = xwk.a(interpolatorArr[i5].getInterpolation(otw.b(i, iArr[i5], iArr2[i5])), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            }
            if (d8zVar2.h) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((qlo.a) it.next()).c = d8zVar2.f.c[d8zVar2.g];
                }
                d8zVar2.h = false;
            }
            d8zVar2.a.invalidateSelf();
        }
    }

    public d8z(@NonNull Context context, @NonNull m8z m8zVar) {
        super(2);
        this.g = 0;
        this.j = null;
        this.f = m8zVar;
        this.e = new Interpolator[]{AnimationUtils.loadInterpolator(context, R$anim.linear_indeterminate_line1_head_interpolator), AnimationUtils.loadInterpolator(context, R$anim.linear_indeterminate_line1_tail_interpolator), AnimationUtils.loadInterpolator(context, R$anim.linear_indeterminate_line2_head_interpolator), AnimationUtils.loadInterpolator(context, R$anim.linear_indeterminate_line2_tail_interpolator)};
    }

    @Override // xsna.otw
    public final void a() {
        ObjectAnimator objectAnimator = this.c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // xsna.otw
    public final void c() {
        h();
    }

    @Override // xsna.otw
    public final void d(@NonNull a.c cVar) {
        this.j = cVar;
    }

    @Override // xsna.otw
    public final void e() {
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        a();
        if (this.a.isVisible()) {
            this.d.setFloatValues(this.i, 1.0f);
            this.d.setDuration((long) ((1.0f - this.i) * 1800.0f));
            this.d.start();
        }
    }

    @Override // xsna.otw
    public final void f() {
        ObjectAnimator objectAnimator = this.c;
        a aVar = m;
        if (objectAnimator == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, aVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            this.c = ofFloat;
            ofFloat.setDuration(1800L);
            this.c.setInterpolator(null);
            this.c.setRepeatCount(-1);
            this.c.addListener(new b8z(this, 0));
        }
        if (this.d == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, aVar, 1.0f);
            this.d = ofFloat2;
            ofFloat2.setDuration(1800L);
            this.d.setInterpolator(null);
            this.d.addListener(new c8z(this, 0));
        }
        h();
        this.c.start();
    }

    @Override // xsna.otw
    public final void g() {
        this.j = null;
    }

    public final void h() {
        this.g = 0;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((qlo.a) it.next()).c = this.f.c[0];
        }
    }
}
