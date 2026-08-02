package xsna;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.auth.ui.VkLoadingButton;
import com.vk.auth.ui.carousel.UserCarouselView;
import com.vk.emailactualization.api.di.EmailActualizationComponent;
import com.vk.phoneactualization.api.di.PhoneActualizationComponent;
import com.vk.superapp.api.dto.auth.UserItem;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.oud0;

/* compiled from: BaseProfileCarouselFragment.kt */
/* loaded from: classes15.dex */
public abstract class zk6<P extends oud0<?>> extends mly<P> implements pud0 {
    public UserCarouselView t;
    public final boolean u = true;

    @Override // xsna.pud0
    public final void U7(int i, List list) {
        zn(i, list);
    }

    @Override // xsna.pud0
    public final void Yk(int i, List list) {
        UserCarouselView userCarouselView = this.t;
        if (userCarouselView == null) {
            userCarouselView = null;
        }
        mgq0 mgq0Var = userCarouselView.b;
        mgq0 mgq0Var2 = mgq0Var != null ? mgq0Var : null;
        ArrayList<UserItem> arrayList = mgq0Var2.f;
        arrayList.clear();
        arrayList.addAll(list);
        mgq0Var2.g = i;
        mgq0Var2.notifyDataSetChanged();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.pud0
    public final void al(UserItem userItem) {
        UserCarouselView userCarouselView = this.t;
        Object obj = null;
        if (userCarouselView == null) {
            userCarouselView = null;
        }
        mgq0 mgq0Var = userCarouselView.b;
        if (mgq0Var == null) {
            mgq0Var = null;
        }
        ArrayList<UserItem> arrayList = mgq0Var.f;
        Iterator it = j5g.W0(arrayList).iterator();
        while (true) {
            ztw ztwVar = (ztw) it;
            if (!ztwVar.b.hasNext()) {
                break;
            }
            Object next = ztwVar.next();
            if (epx.f(((UserItem) ((xtw) next).b).b, userItem.b)) {
                obj = next;
                break;
            }
        }
        xtw xtwVar = (xtw) obj;
        if (xtwVar != null) {
            int i = xtwVar.a;
            arrayList.set(i, userItem);
            mgq0Var.notifyItemChanged(i);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.vk_auth_base_profile_carousel_fragment, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.a66, androidx.fragment.app.Fragment
    public void onDestroyView() {
        VkLoadingButton vkLoadingButton = this.k;
        if (vkLoadingButton != null) {
            vkLoadingButton.setOnClickListener(null);
        }
        UserCarouselView userCarouselView = this.t;
        if (userCarouselView == null) {
            userCarouselView = null;
        }
        ngq0 ngq0Var = userCarouselView.c;
        if (ngq0Var == null) {
            ngq0Var = null;
        }
        userCarouselView.removeItemDecoration(ngq0Var);
        Object obj = this.o;
        ((oud0) (obj != null ? obj : null)).e();
        super.onDestroyView();
    }

    @Override // xsna.mly, xsna.a66, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((PhoneActualizationComponent) m7m.d(this).a(fpf0.a(PhoneActualizationComponent.class))).getEntryPoint().a(getActivity());
        ((EmailActualizationComponent) m7m.d(this).a(fpf0.a(EmailActualizationComponent.class))).getEntryPoint().a(getActivity());
        bpn0 bpn0Var = t65.a;
        mhy.b(view.getContext());
        UserCarouselView userCarouselView = (UserCarouselView) view.findViewById(R.id.user_carousel);
        int i = 1;
        com.vk.movika.tools.controls.seekbar.w wVar = new com.vk.movika.tools.controls.seekbar.w(this, i);
        xk6 xk6Var = new xk6(this, 0);
        userCarouselView.getClass();
        mgq0 mgq0Var = new mgq0(new com.vk.movika.tools.controls.seekbar.m(wVar, 14), new om9(xk6Var, 18), this.u);
        userCarouselView.setAdapter(mgq0Var);
        userCarouselView.b = mgq0Var;
        userCarouselView.getContext();
        userCarouselView.setLayoutManager(new LinearLayoutManager(0, false));
        RecyclerView.l itemAnimator = userCarouselView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.t();
        }
        ngq0 ngq0Var = new ngq0(userCarouselView);
        userCarouselView.addItemDecoration(ngq0Var);
        userCarouselView.c = ngq0Var;
        this.t = userCarouselView;
        VkLoadingButton vkLoadingButton = this.k;
        if (vkLoadingButton != null) {
            jjc.g(vkLoadingButton, new mb(this, 9));
            vkLoadingButton.setMaxLines(1);
            vkLoadingButton.setEllipsize(TextUtils.TruncateAt.END);
        }
        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
        if (superappUiRouterBridge == null) {
            superappUiRouterBridge = null;
        }
        new xpu0(superappUiRouterBridge.u(kn(), false));
        View findViewById = view.findViewById(R.id.help_button);
        if (findViewById != null) {
            un().getClass();
            findViewById.setVisibility(otu0.a() ? 0 : 8);
            findViewById.setOnClickListener(new v16(this, i));
        }
        yn();
    }

    public void wm(boolean z) {
        UserCarouselView userCarouselView = this.t;
        if (userCarouselView == null) {
            userCarouselView = null;
        }
        mgq0 mgq0Var = userCarouselView.b;
        mgq0 mgq0Var2 = mgq0Var != null ? mgq0Var : null;
        mgq0Var2.h = z;
        mgq0Var2.notifyDataSetChanged();
    }

    public abstract void yn();

    public void zn(int i, List list) {
        VkLoadingButton vkLoadingButton = this.k;
        if (vkLoadingButton != null) {
            vkLoadingButton.setText(getString(R.string.vk_auth_account_continue_as, ((UserItem) list.get(i)).d));
        }
    }
}
