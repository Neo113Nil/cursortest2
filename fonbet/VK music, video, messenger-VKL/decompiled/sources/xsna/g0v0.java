package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.superapp.api.dto.identity.WebIdentityAddress;
import com.vk.superapp.api.dto.identity.WebIdentityCardData;
import com.vk.superapp.api.dto.identity.WebIdentityEmail;
import com.vk.superapp.api.dto.identity.WebIdentityPhone;
import com.vk.superapp.browser.internal.ui.identity.WebIdentityContext;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;

/* compiled from: VkIdentityListView.kt */
/* loaded from: classes6.dex */
public final class g0v0 implements e0v0 {
    public final Fragment b;
    public final g4f0 c;
    public final kvv d;
    public final izs<Intent, s3q0> e;
    public Toolbar f;
    public RecyclerPaginatedView g;
    public WebIdentityContext h;
    public WebIdentityCardData i;

    /* JADX WARN: Multi-variable type inference failed */
    public g0v0(Fragment fragment, g4f0 g4f0Var, kvv kvvVar, izs<? super Intent, s3q0> izsVar) {
        this.b = fragment;
        this.c = g4f0Var;
        this.d = kvvVar;
        this.e = izsVar;
    }

    @Override // xsna.e0v0
    public final void I6(WebIdentityCardData webIdentityCardData) {
        c(webIdentityCardData);
    }

    @Override // xsna.e0v0
    public final void R0(VKApiException vKApiException) {
        RecyclerPaginatedView recyclerPaginatedView = this.g;
        if (recyclerPaginatedView != null) {
            recyclerPaginatedView.r(vKApiException);
        }
    }

    public final void a(int i, int i2, Intent intent) {
        if (i2 != -1) {
            return;
        }
        if (i == 109) {
            this.h = intent != null ? (WebIdentityContext) intent.getParcelableExtra("arg_identity_context") : null;
            d();
        } else {
            if (i != 110) {
                return;
            }
            c(intent != null ? (WebIdentityCardData) intent.getParcelableExtra("arg_identity_card") : null);
        }
    }

    public final void b(View view, Bundle bundle) {
        this.f = (Toolbar) view.findViewById(R.id.toolbar);
        RecyclerPaginatedView recyclerPaginatedView = (RecyclerPaginatedView) view.findViewById(R.id.vk_rpb_list);
        this.g = recyclerPaginatedView;
        if (recyclerPaginatedView != null) {
            recyclerPaginatedView.setOnReloadRetryClickListener(new fem0(this, 13));
        }
        Toolbar toolbar = this.f;
        if (toolbar != null) {
            Fragment fragment = this.b;
            toolbar.setNavigationIcon(krv0.f(R.drawable.vk_icon_arrow_left_outline_28, R.attr.vk_ui_text_accent_themed, fragment.requireContext()));
            toolbar.setTitle(fragment.getResources().getString(R.string.vk_contacts));
            toolbar.setNavigationOnClickListener(new d27(this, 11));
        }
        RecyclerPaginatedView recyclerPaginatedView2 = this.g;
        if (recyclerPaginatedView2 != null) {
            recyclerPaginatedView2.setAdapter(this.d);
            recyclerPaginatedView2.setSwipeRefreshEnabled(false);
            new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.LINEAR, recyclerPaginatedView2).a();
            RecyclerView recyclerView = recyclerPaginatedView2.getRecyclerView();
            if (recyclerView != null) {
                recyclerView.setItemAnimator(null);
            }
            gjf0.b(recyclerPaginatedView2);
        }
    }

    public final void c(WebIdentityCardData webIdentityCardData) {
        if (webIdentityCardData == null) {
            RecyclerPaginatedView recyclerPaginatedView = this.g;
            if (recyclerPaginatedView != null) {
                recyclerPaginatedView.qg(null);
            }
        } else {
            Context requireContext = this.b.requireContext();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new vuv(R.layout.vk_identity_desc));
            arrayList.add(new vuv(0));
            arrayList.add(new bvv(pgx0.b(requireContext, "phone")));
            Iterator<T> it = webIdentityCardData.b.iterator();
            while (it.hasNext()) {
                arrayList.add(new yuv((WebIdentityPhone) it.next()));
            }
            arrayList.add(!webIdentityCardData.Ib("phone") ? new xuv("phone", R.layout.vk_material_list_button_blue) : new cvv("phone"));
            arrayList.add(new vuv(0));
            arrayList.add(new bvv(pgx0.b(requireContext, "email")));
            Iterator<T> it2 = webIdentityCardData.c.iterator();
            while (it2.hasNext()) {
                arrayList.add(new yuv((WebIdentityEmail) it2.next()));
            }
            arrayList.add(!webIdentityCardData.Ib("email") ? new xuv("email", R.layout.vk_material_list_button_blue) : new cvv("email"));
            arrayList.add(new vuv(0));
            arrayList.add(new bvv(pgx0.b(requireContext, RTCStatsConstants.KEY_ADDRESS)));
            Iterator<T> it3 = webIdentityCardData.d.iterator();
            while (it3.hasNext()) {
                arrayList.add(new yuv((WebIdentityAddress) it3.next()));
            }
            arrayList.add(!webIdentityCardData.Ib(RTCStatsConstants.KEY_ADDRESS) ? new xuv(RTCStatsConstants.KEY_ADDRESS, R.layout.vk_material_list_button_blue) : new cvv(RTCStatsConstants.KEY_ADDRESS));
            this.d.setItems(arrayList);
            RecyclerPaginatedView recyclerPaginatedView2 = this.g;
            if (recyclerPaginatedView2 != null) {
                recyclerPaginatedView2.f0();
            }
        }
        this.i = webIdentityCardData;
    }

    public final void d() {
        Intent intent = new Intent();
        WebIdentityContext webIdentityContext = this.h;
        if (webIdentityContext != null) {
            intent.putExtra("arg_identity_context", webIdentityContext);
        }
        intent.putExtra("arg_identity_card", this.i);
        this.e.invoke(intent);
    }
}
