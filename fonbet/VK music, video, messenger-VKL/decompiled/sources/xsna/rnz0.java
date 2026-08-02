package xsna;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class rnz0 implements loz0 {
    public final /* synthetic */ FrameLayout a;
    public final /* synthetic */ LayoutInflater b;
    public final /* synthetic */ ViewGroup c;
    public final /* synthetic */ Bundle d;
    public final /* synthetic */ esl e;

    public rnz0(esl eslVar, FrameLayout frameLayout, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.a = frameLayout;
        this.b = layoutInflater;
        this.c = viewGroup;
        this.d = bundle;
        Objects.requireNonNull(eslVar);
        this.e = eslVar;
    }

    @Override // xsna.loz0
    public final void a() {
        FrameLayout frameLayout = this.a;
        frameLayout.removeAllViews();
        frameLayout.addView(this.e.a.c(this.b, this.c, this.d));
    }

    @Override // xsna.loz0
    public final int m() {
        return 2;
    }
}
