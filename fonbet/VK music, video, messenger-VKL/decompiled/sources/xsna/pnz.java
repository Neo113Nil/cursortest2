package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.NonBouncedAppBarLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.button.VkButton;
import com.vk.profile.questions.impl.QuestionsListFragment;
import java.util.Iterator;
import xsna.ye0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class pnz implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ pnz(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                nnz nnzVar = (nnz) obj3;
                ye0.a aVar = (ye0.a) obj2;
                com.vk.libvideo.api.ad.a aVar2 = (com.vk.libvideo.api.ad.a) obj;
                nnzVar.f();
                oiz presenter = nnzVar.b.getPresenter();
                if (presenter != null) {
                    presenter.g(aVar2, aVar);
                    break;
                }
                break;
            case 1:
                RecyclerView.e0 e0Var = (RecyclerView.e0) obj2;
                ol60 ol60Var = (ol60) obj;
                Iterator<zjf0<ol60>> it = ((ci60) obj3).c.iterator();
                while (it.hasNext()) {
                    it.next().d(e0Var, ol60Var);
                }
                break;
            default:
                final VkButton vkButton = (VkButton) obj3;
                NonBouncedAppBarLayout nonBouncedAppBarLayout = (NonBouncedAppBarLayout) obj;
                int i2 = QuestionsListFragment.f0;
                final float y = vkButton.getY();
                final float height = ((QuestionsListFragment) obj2).V != null ? r2.getHeight() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                final float f = y - height;
                nonBouncedAppBarLayout.a(new NonBouncedAppBarLayout.d() { // from class: xsna.nqe0
                    @Override // com.google.android.material.appbar.NonBouncedAppBarLayout.d
                    public final void a(NonBouncedAppBarLayout nonBouncedAppBarLayout2, int i3) {
                        int i4 = QuestionsListFragment.f0;
                        vkButton.setAlpha(swe0.f(((y + i3) - height) / f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
                    }
                });
                break;
        }
    }
}
