package xsna;

import android.content.res.Resources;
import kotlin.jvm.internal.Lambda;

/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
/* loaded from: classes11.dex */
public final class e62 extends Lambda implements izs<igi0, Boolean> {
    final /* synthetic */ Resources $resources;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e62(Resources resources) {
        super(1);
        this.$resources = resources;
    }

    @Override // xsna.izs
    public final Boolean invoke(igi0 igi0Var) {
        return Boolean.valueOf(b62.b(igi0Var, this.$resources));
    }
}
