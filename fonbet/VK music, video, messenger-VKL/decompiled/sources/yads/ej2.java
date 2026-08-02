package yads;

import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.bhu;
import xsna.gzs;
import xsna.imi0;
import xsna.msy;

@imi0
/* loaded from: classes10.dex */
public enum ej2 {
    c,
    d;

    public static final dj2 Companion = new dj2();
    public static final Lazy b = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs() { // from class: yads.cj2
        @Override // xsna.gzs
        public final Object invoke() {
            return bhu.b("com.monetization.ads.base.model.mediation.prefetch.PrefetchedMediationResultStatus", ej2.values(), new String[]{"success", "error"}, new Annotation[][]{null, null});
        }
    });

    ej2() {
    }
}
