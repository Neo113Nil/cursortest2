package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.a;

/* loaded from: classes11.dex */
public final class cz81 implements uz81 {
    public final /* synthetic */ FrameLayout a;
    public final /* synthetic */ LayoutInflater b;
    public final /* synthetic */ ViewGroup c;
    public final /* synthetic */ Bundle d;
    public final /* synthetic */ a e;

    public cz81(a aVar, FrameLayout frameLayout, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.e = aVar;
        this.a = frameLayout;
        this.b = layoutInflater;
        this.c = viewGroup;
        this.d = bundle;
    }

    @Override // defpackage.uz81
    public final int zaa() {
        return 2;
    }

    @Override // defpackage.uz81
    public final void zab() {
        FrameLayout frameLayout = this.a;
        frameLayout.removeAllViews();
        frameLayout.addView(this.e.a.onCreateView(this.b, this.c, this.d));
    }
}
