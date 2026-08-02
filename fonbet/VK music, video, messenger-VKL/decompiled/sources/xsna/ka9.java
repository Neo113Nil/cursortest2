package xsna;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class ka9 {
    public final String a;
    public final Integer b;
    public final Integer c;
    public final String d;
    public final kiw e;
    public final mnh0 f;

    public ka9(String str, Integer num, Integer num2, String str2, kiw kiwVar, mnh0 mnh0Var) {
        this.a = str;
        this.b = num;
        this.c = num2;
        this.d = str2;
        this.e = kiwVar;
        this.f = mnh0Var;
    }

    @NonNull
    public final String toString() {
        return "CallToActionData{buttonText=" + this.a + ", buttonColor=" + this.b + ", textColor=" + this.c + ", additionalText=" + this.d + ", qrCta=" + this.f + '}';
    }
}
