package xsna;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.vk.core.fragments.FragmentImpl;

/* compiled from: ClipFeedListFragment.kt */
/* loaded from: classes17.dex */
public final class jyc implements obs {
    public io.reactivex.rxjava3.disposables.c b;
    public final /* synthetic */ FragmentImpl c;

    public jyc(FragmentImpl fragmentImpl) {
        this.c = fragmentImpl;
    }

    @Override // xsna.obs
    public final void onCreate(Bundle bundle) {
        ucp ucpVar = ucp.a;
        this.b = ucp.a().subscribe(new ga(new com.vk.movika.sdk.base.logic.interactor.d(this.c, 26), 15));
    }

    @Override // xsna.obs
    public final void onDestroy() {
        io.reactivex.rxjava3.disposables.c cVar = this.b;
        if (cVar != null) {
            cVar.dispose();
        }
        this.b = null;
        this.c.D.d(this);
    }

    @Override // xsna.obs
    public final void b() {
    }

    @Override // xsna.obs
    public final void c() {
    }

    @Override // xsna.obs
    public final void onDestroyView() {
    }

    @Override // xsna.obs
    public final void onPause() {
    }

    @Override // xsna.obs
    public final void onResume() {
    }

    @Override // xsna.obs
    public final void onStop() {
    }

    @Override // xsna.obs
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // xsna.obs
    public final void onActivityResult(int i, int i2, Intent intent) {
    }
}
