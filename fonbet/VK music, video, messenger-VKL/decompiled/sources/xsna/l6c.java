package xsna;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import java.util.ArrayList;

/* compiled from: CheckoutOnboardingPagerAdapter.kt */
/* loaded from: classes6.dex */
public final class l6c extends scs {
    public final ArrayList l;

    public l6c(FragmentActivity fragmentActivity, ArrayList arrayList) {
        super(fragmentActivity);
        this.l = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.l.size();
    }

    @Override // xsna.scs
    public final Fragment z0(int i) {
        fe80 fe80Var = (fe80) this.l.get(i);
        int i2 = fe80Var.a;
        int i3 = fe80Var.b;
        int i4 = fe80Var.c;
        int[] iArr = fe80Var.d;
        m6c m6cVar = new m6c();
        Bundle bundle = new Bundle();
        bundle.putInt("POSITION", i);
        bundle.putInt(NativeAdContent.ViewTag.AD_ICON, i2);
        bundle.putInt(NativeAdContent.ViewTag.AD_TITLE, i3);
        bundle.putInt("SUBTITLE_TEXTS", i4);
        bundle.putIntArray("SUBTITLE_ICONS", iArr);
        m6cVar.setArguments(bundle);
        return m6cVar;
    }
}
