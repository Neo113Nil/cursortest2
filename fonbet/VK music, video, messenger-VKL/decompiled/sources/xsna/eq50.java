package xsna;

import android.app.Activity;
import com.vk.superapp.advertisement.api.dto.FullscreenAdFormat;
import xsna.cxs;

/* compiled from: MyTargetFullscreenAd.kt */
/* loaded from: classes6.dex */
public final class eq50 implements cxs {
    public cxs.a a;
    public ff6 b;
    public gzs<s3q0> c;

    /* compiled from: MyTargetFullscreenAd.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FullscreenAdFormat.values().length];
            try {
                iArr[FullscreenAdFormat.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FullscreenAdFormat.MULTI_INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FullscreenAdFormat.REWARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.cxs
    public final void a() {
        ff6 ff6Var = this.b;
        ff6Var.h = null;
        this.a = null;
        ff6Var.d();
    }

    @Override // xsna.cxs
    public final void b(gzs<s3q0> gzsVar) {
        this.c = gzsVar;
    }

    @Override // xsna.cxs
    public final void c(cxs.a aVar) {
        this.a = aVar;
    }

    @Override // xsna.cxs
    public final boolean isValid() {
        return true;
    }

    @Override // xsna.cxs
    public final void load() {
        this.b.e();
    }

    @Override // xsna.cxs
    public final void show(Activity activity) {
        this.b.f();
        gzs<s3q0> gzsVar = this.c;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
        this.c = null;
    }
}
