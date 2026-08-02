package xsna;

import android.view.View;
import android.widget.AdapterView;
import me.grishka.appkit.fragments.AppKitFragment;

/* compiled from: AppKitFragment.java */
/* loaded from: classes8.dex */
public final class x53 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ AppKitFragment b;

    public x53(AppKitFragment appKitFragment) {
        this.b = appKitFragment;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        this.b.fo(i);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
