package xsna;

import android.content.Context;
import com.huawei.hms.hihealth.data.SampleSet;
import com.unity3d.services.UnityAdsConstants;
import com.vk.audience.api.domain.AudienceResearchSurfaceCode;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: AsrFileDownloader.kt */
/* loaded from: classes7.dex */
public final class dv3 implements cb4, cc80, cvp, rd3 {
    public final Object b;

    public /* synthetic */ dv3(Object obj) {
        this.b = obj;
    }

    @Override // xsna.rd3
    public Object a(ggh0 ggh0Var, Float f, Float f2, izs izsVar, l9k0 l9k0Var) {
        float floatValue = f.floatValue();
        float floatValue2 = f2.floatValue();
        Object b = r9k0.b(ggh0Var, Math.signum(floatValue2) * Math.abs(floatValue), floatValue, s1v.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, floatValue2, 28), (iq2) this.b, izsVar, l9k0Var);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : (eq2) b;
    }

    @Override // xsna.cb4
    public cb4 b(AudienceResearchSurfaceCode audienceResearchSurfaceCode) {
        StringBuilder sb = (StringBuilder) this.b;
        String h = audienceResearchSurfaceCode.h();
        int indexOf = sb.indexOf("{surface}");
        if (indexOf == -1) {
            return this;
        }
        sb.replace(indexOf, 9 + indexOf, h);
        return this;
    }

    @Override // xsna.cb4
    public String build() {
        return ((StringBuilder) this.b).toString();
    }

    @Override // xsna.cvp
    public void c() {
        ((com.vk.libvideo.live.impl.views.live.b) this.b).a();
    }

    public io.reactivex.rxjava3.internal.operators.single.y d(int i) {
        return rsg0.w0(yfb.x(((ots) this.b).o(30, Integer.valueOf(i)))).l(new tp1(new ci3(2), 2));
    }

    @Override // xsna.cc80
    public void onSuccess(Object obj) {
        ((lq9) this.b).resumeWith((SampleSet) obj);
    }

    public dv3(String str) {
        this.b = new StringBuilder(str);
    }

    public dv3(Context context) {
        this.b = new bpn0(new q770(context, 2));
    }
}
