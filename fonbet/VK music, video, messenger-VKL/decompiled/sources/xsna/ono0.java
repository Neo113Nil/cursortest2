package xsna;

import android.widget.TextView;

/* compiled from: TextViewTextChangeEvent.kt */
/* loaded from: classes5.dex */
public final class ono0 extends pno0 {
    public final /* synthetic */ TextView a;
    public final /* synthetic */ CharSequence b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public ono0(TextView textView, CharSequence charSequence, int i, int i2, int i3) {
        this.a = textView;
        this.b = charSequence;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    @Override // xsna.pno0
    public final int a() {
        return this.d;
    }

    @Override // xsna.pno0
    public final int b() {
        return this.e;
    }

    @Override // xsna.pno0
    public final int c() {
        return this.c;
    }

    @Override // xsna.pno0
    public final CharSequence d() {
        return this.b;
    }

    @Override // xsna.pno0
    public final TextView e() {
        return this.a;
    }
}
