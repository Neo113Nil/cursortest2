package xsna;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.AppBarLayout;
import com.mbridge.msdk.config.dynamic.baseview.ComponentListView;
import com.mbridge.msdk.config.dynamic.baseview.cusview.SoundImageView;
import com.vk.home.HomeFragment2;
import com.vk.libvideo.design.view.live.LiveView;
import com.vk.money.MoneyTransfersFragment;
import xsna.sgh0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class e9i implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e9i(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ViewPager viewPager;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((ComponentListView) obj).a(view);
                break;
            case 1:
                q8u q8uVar = (q8u) obj;
                gzs<s3q0> gzsVar = q8uVar.h1;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                q8uVar.dismiss();
                break;
            case 2:
                sru sruVar = (sru) obj;
                qos0 qos0Var = sruVar.g1;
                if (qos0Var != null) {
                    qos0Var.b();
                }
                sruVar.n1 = true;
                sruVar.hide();
                break;
            case 3:
                ((s3v) obj).l.f();
                break;
            case 4:
                HomeFragment2 homeFragment2 = (HomeFragment2) obj;
                int i2 = HomeFragment2.x0;
                sgh0.b bVar = sgh0.b.a;
                androidx.lifecycle.f fo = homeFragment2.fo();
                boolean T5 = fo instanceof o0u0 ? ((o0u0) fo).T5() : fo instanceof qhh0 ? ((qhh0) fo).s() : false;
                ViewPager viewPager2 = homeFragment2.S;
                boolean z = viewPager2 != null && viewPager2.getCurrentItem() == 0;
                AppBarLayout appBarLayout = homeFragment2.Q;
                if (appBarLayout != null) {
                    appBarLayout.setExpanded(true);
                }
                if (!T5 && !z && (viewPager = homeFragment2.S) != null) {
                    viewPager.setCurrentItem(0, true);
                    break;
                }
                break;
            case 5:
                ((afw) obj).dismiss();
                break;
            case 6:
                ntx presenter = ((rtx) obj).getPresenter();
                if (presenter != null) {
                    presenter.p7();
                    break;
                }
                break;
            case 7:
                thu0 thu0Var = ((LiveView) obj).F;
                if (thu0Var != null) {
                    thu0Var.performClick();
                    break;
                }
                break;
            case 8:
                int i3 = MoneyTransfersFragment.b1;
                ((MoneyTransfersFragment) obj).Ko();
                break;
            case 9:
                ((SoundImageView) obj).a(view);
                break;
            case 10:
                View.OnClickListener onClickListener = ((cmm0) obj).d;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            default:
                exy0 exy0Var = (exy0) obj;
                exy0Var.getClass();
                exy0Var.a(view.getContext());
                break;
        }
    }
}
