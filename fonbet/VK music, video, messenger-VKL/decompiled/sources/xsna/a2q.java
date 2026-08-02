package xsna;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.sdk.auth.AccountProfileType;
import com.vk.auth.main.AuthStatSender;
import com.vk.auth.screendata.MultiAccountData;
import com.vk.emailactualization.api.di.EmailActualizationComponent;
import com.vk.phoneactualization.api.di.PhoneActualizationComponent;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.superapp.api.dto.auth.UserItem;
import com.vk.superapp.multiaccount.api.MultiAccountComponent;
import com.vk.superapp.ui.toolbar.VkAuthToolbar;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.m2q;
import xsna.x65;

/* compiled from: ExchangeLoginFragment2.kt */
/* loaded from: classes15.dex */
public final class a2q extends mly<c2q> implements e2q {
    public ImageView A;
    public ImageView B;
    public int C = Integer.MAX_VALUE;
    public m2q t;
    public RecyclerView u;
    public NestedScrollView v;
    public p8u0 w;
    public TextView x;
    public TextView y;
    public TextView z;

    /* compiled from: ExchangeLoginFragment2.kt */
    public static final class a {
        public static Bundle a(MultiAccountData multiAccountData) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("multiaccData", multiAccountData);
            bundle.putBoolean("showCloseButton", true);
            return bundle;
        }
    }

    /* compiled from: ExchangeLoginFragment2.kt */
    public static final class b implements m2q.a {
        public b() {
        }

        @Override // xsna.m2q.a
        public final void a() {
            Object obj = a2q.this.o;
            if (obj == null) {
                obj = null;
            }
            ((c2q) obj).E0();
        }

        @Override // xsna.m2q.a
        public final void b(UserItem userItem) {
            a2q a2qVar = a2q.this;
            Object obj = a2qVar.o;
            if (obj == null) {
                obj = null;
            }
            c2q c2qVar = (c2q) obj;
            c2qVar.getClass();
            c2q.F0(c2qVar, SchemeStatSak$TypeRegistrationItem.EventType.DROP_ACCOUNT_TAP);
            x65.a.a(a2qVar, a2qVar.getString(R.string.vk_auth_exchange_delete_dialog_title), a2qVar.getString(R.string.vk_auth_exchange_delete_dialog_subtitle), a2qVar.getString(R.string.vk_ok), new hn9(10, a2qVar, userItem), a2qVar.getString(R.string.vk_auth_exchange_delete_dialog_cancel), null, false, null, null, 480);
        }

        @Override // xsna.m2q.a
        public final void c(UserItem userItem) {
            Object obj = a2q.this.o;
            if (obj == null) {
                obj = null;
            }
            ((c2q) obj).z0(userItem, AuthStatSender.Element.AVATAR_BUTTON);
        }
    }

    @Override // xsna.pud0
    public final void Yk(int i, List list) {
        ImageView imageView;
        UserItem userItem = (UserItem) j5g.a0(list);
        if ((userItem != null ? userItem.j : null) == AccountProfileType.EDU && (imageView = this.s) != null) {
            imageView.setImageResource(R.drawable.vk_icon_logo_sferum_color_28);
        }
        if (((ArrayList) list).size() >= this.C) {
            TextView textView = this.x;
            if (textView == null) {
                textView = null;
            }
            textView.setText(R.string.vk_account_linking_extended_accounts_limit_title);
            TextView textView2 = this.y;
            if (textView2 == null) {
                textView2 = null;
            }
            textView2.setVisibility(0);
        } else {
            TextView textView3 = this.x;
            if (textView3 == null) {
                textView3 = null;
            }
            textView3.setText(R.string.vk_account_linking_extended_subtitle);
            TextView textView4 = this.y;
            if (textView4 == null) {
                textView4 = null;
            }
            f4m.j(textView4);
        }
        m2q m2qVar = this.t;
        m2q m2qVar2 = m2qVar != null ? m2qVar : null;
        ArrayList arrayList = m2qVar2.e;
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(new m2q.b.C3319b((UserItem) it.next()));
        }
        arrayList.addAll(arrayList2);
        if (arrayList.size() < m2qVar2.d) {
            arrayList.add(m2q.b.a.a);
        }
        m2qVar2.notifyDataSetChanged();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.pud0
    public final void al(UserItem userItem) {
        m2q m2qVar = this.t;
        Object obj = null;
        if (m2qVar == null) {
            m2qVar = null;
        }
        ArrayList arrayList = m2qVar.e;
        Iterator it = j5g.W0(arrayList).iterator();
        while (true) {
            ztw ztwVar = (ztw) it;
            if (!ztwVar.b.hasNext()) {
                break;
            }
            Object next = ztwVar.next();
            T t = ((xtw) next).b;
            if ((t instanceof m2q.b.C3319b) && epx.f(((m2q.b.C3319b) t).a.b, userItem.b)) {
                obj = next;
                break;
            }
        }
        xtw xtwVar = (xtw) obj;
        if (xtwVar != null) {
            int i = xtwVar.a;
            arrayList.set(i, new m2q.b.C3319b(userItem));
            m2qVar.notifyItemChanged(i);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.vk_fragment_exchange_users, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.mly, xsna.a66, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((PhoneActualizationComponent) m7m.d(this).a(fpf0.a(PhoneActualizationComponent.class))).getEntryPoint().a(getActivity());
        ((EmailActualizationComponent) m7m.d(this).a(fpf0.a(EmailActualizationComponent.class))).getEntryPoint().a(getActivity());
        this.j = (VkAuthToolbar) view.findViewById(R.id.toolbar);
        this.A = (ImageView) view.findViewById(R.id.close_icon);
        this.z = (TextView) view.findViewById(R.id.exchange_title_toolbar);
        TextView textView = (TextView) view.findViewById(R.id.exchange_title);
        r55 r55Var = r55.a;
        r55.i();
        kn();
        this.x = textView;
        this.y = (TextView) view.findViewById(R.id.exchange_description);
        ImageView imageView = (ImageView) view.findViewById(R.id.exchange_logo_toolbar);
        r55.i();
        kn();
        imageView.setVisibility(8);
        imageView.setImageDrawable(r55.i().b(kn()));
        this.B = imageView;
        this.u = (RecyclerView) view.findViewById(R.id.exchange_users);
        this.v = (NestedScrollView) view.findViewById(R.id.scroll_view);
        this.w = new p8u0(requireContext(), false, 14);
        RecyclerView recyclerView = this.u;
        if (recyclerView == null) {
            recyclerView = null;
        }
        mo2getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        RecyclerView recyclerView2 = this.u;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        recyclerView2.setItemAnimator(null);
        this.t = new m2q(new b(), this.C);
        NestedScrollView nestedScrollView = this.v;
        if (nestedScrollView == null) {
            nestedScrollView = null;
        }
        nestedScrollView.setOnScrollChangeListener(new op0(this, 13));
        Bundle arguments = getArguments();
        if (arguments != null ? arguments.getBoolean("showCloseButton") : false) {
            ImageView imageView2 = this.A;
            if (imageView2 == null) {
                imageView2 = null;
            }
            imageView2.setVisibility(0);
            ImageView imageView3 = this.A;
            if (imageView3 == null) {
                imageView3 = null;
            }
            imageView3.setOnClickListener(new z1q(this, 0));
        }
        RecyclerView recyclerView3 = this.u;
        if (recyclerView3 == null) {
            recyclerView3 = null;
        }
        m2q m2qVar = this.t;
        if (m2qVar == null) {
            m2qVar = null;
        }
        recyclerView3.setAdapter(m2qVar);
        Object obj = this.o;
        c2q c2qVar = (c2q) (obj != null ? obj : null);
        c2qVar.y0(this);
        c2qVar.N();
        yn();
    }

    @Override // xsna.a66
    public final z55 tn(Bundle bundle) {
        List list;
        MultiAccountData multiAccountData = (MultiAccountData) requireArguments().getParcelable("multiaccData");
        this.C = multiAccountData != null ? multiAccountData.e : Integer.MAX_VALUE;
        com.vk.superapp.multiaccount.api.a d = ((MultiAccountComponent) m7m.d(this).a(fpf0.a(MultiAccountComponent.class))).d();
        if (multiAccountData == null || (list = multiAccountData.b) == null) {
            list = EmptyList.b;
        }
        return new c2q(bundle, list, d);
    }

    @Override // xsna.a66, xsna.arf0
    public final SchemeStatSak$EventScreen u5() {
        return SchemeStatSak$EventScreen.MULTI_ACC_ADD_ACCOUNT;
    }

    @Override // xsna.x65
    public final void wm(boolean z) {
        if (z) {
            p8u0 p8u0Var = this.w;
            (p8u0Var != null ? p8u0Var : null).show();
        } else {
            p8u0 p8u0Var2 = this.w;
            (p8u0Var2 != null ? p8u0Var2 : null).dismiss();
        }
    }

    public final void yn() {
        TextView textView = this.z;
        if (textView == null) {
            textView = null;
        }
        Rect e = f4m.e(textView);
        TextView textView2 = this.x;
        if (textView2 == null) {
            textView2 = null;
        }
        if (f4m.e(textView2).top >= e.bottom) {
            TextView textView3 = this.z;
            if (textView3 == null) {
                textView3 = null;
            }
            textView3.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            ImageView imageView = this.B;
            (imageView != null ? imageView : null).setAlpha(1.0f);
            return;
        }
        TextView textView4 = this.z;
        if (textView4 == null) {
            textView4 = null;
        }
        float height = (e.bottom - r2.top) / textView4.getHeight();
        if (height > 1.0f) {
            height = 1.0f;
        }
        TextView textView5 = this.z;
        if (textView5 == null) {
            textView5 = null;
        }
        textView5.setAlpha(height);
        ImageView imageView2 = this.B;
        (imageView2 != null ? imageView2 : null).setAlpha(1.0f - height);
    }

    @Override // xsna.pud0
    public final void U7(int i, List list) {
    }
}
