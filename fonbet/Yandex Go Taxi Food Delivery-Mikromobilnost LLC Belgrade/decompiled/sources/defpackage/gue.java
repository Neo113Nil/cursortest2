package defpackage;

import android.graphics.drawable.Drawable;
import com.yandex.go.payments.shared.antifraud.experiments.CorpAntiFraudExperiment;

/* loaded from: classes13.dex */
public final class gue {
    public static final gue g = new gue(0);
    public final String a;
    public final CharSequence b;
    public final String c;
    public final String d;
    public final CorpAntiFraudExperiment.ClientInfoParams e;
    public final Drawable f;

    public /* synthetic */ gue(int i) {
        this("", "", "", "", new CorpAntiFraudExperiment.ClientInfoParams(0), null);
    }

    public gue(String str, CharSequence charSequence, String str2, String str3, CorpAntiFraudExperiment.ClientInfoParams clientInfoParams, Drawable drawable) {
        this.a = str;
        this.b = charSequence;
        this.c = str2;
        this.d = str3;
        this.e = clientInfoParams;
        this.f = drawable;
    }

    public gue() {
        this(0);
    }
}
