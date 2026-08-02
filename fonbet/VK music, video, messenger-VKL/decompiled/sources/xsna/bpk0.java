package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.huawei.hms.adapter.internal.CommonCode;
import com.vk.superapp.vkpay.checkout.api.dto.model.VkCheckoutPayMethod;
import com.vkontakte.android.R;
import java.io.Serializable;

/* compiled from: StandaloneLoaderFragment.kt */
/* loaded from: classes6.dex */
public final class bpk0 extends gi6<apk0> {
    @Override // xsna.gi6, androidx.fragment.app.Fragment
    /* renamed from: getContext */
    public final Context mo2getContext() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return hnj.a(activity);
        }
        return null;
    }

    @Override // xsna.uhv0, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        Serializable serializable = requireArguments().getSerializable("method");
        VkCheckoutPayMethod vkCheckoutPayMethod = serializable instanceof VkCheckoutPayMethod ? (VkCheckoutPayMethod) serializable : null;
        String string = requireArguments().getString(CommonCode.MapKey.TRANSACTION_ID);
        String string2 = requireArguments().getString("backstack_tag");
        if (vkCheckoutPayMethod == null || string == null) {
            throw new IllegalArgumentException("Method and transaction id must be not null");
        }
        this.h = new cpk0(this, vkCheckoutPayMethod, string, string2);
        qro0.e(200L, new wmd0(this, 8));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.vk_pay_checkout_standalone_loader_fragment, viewGroup, false);
        czs.a(inflate);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return eoy.a(LayoutInflater.from(mo2getContext()));
    }
}
