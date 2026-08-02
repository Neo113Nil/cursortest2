package xsna;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.superapp.api.dto.identity.WebCity;
import com.vk.superapp.api.dto.identity.WebCountry;
import com.vk.superapp.api.dto.identity.WebIdentityCard;
import com.vk.superapp.api.dto.identity.WebIdentityLabel;
import com.vk.superapp.browser.internal.ui.identity.fragments.VkIdentityActivity;
import com.vk.superapp.core.ui.VkDelegatingActivity;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: VkIdentityEditFragment.kt */
/* loaded from: classes6.dex */
public final class a0v0 extends gi6<Object> implements zzu0 {
    public final c0v0 i;

    /* compiled from: VkIdentityEditFragment.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Integer, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Integer num) {
            int intValue = num.intValue();
            a0v0 a0v0Var = (a0v0) this.receiver;
            a0v0Var.getClass();
            int i = VkDelegatingActivity.f;
            Bundle bundle = new Bundle();
            bundle.putBoolean("from_builder", true);
            bundle.putInt("country", intValue);
            bundle.putString("hint", a0v0Var.getResources().getString(R.string.vk_discover_search_city));
            VkDelegatingActivity.a.a(a0v0Var, VkIdentityActivity.class, pku0.class, bundle, 747);
            return s3q0.a;
        }
    }

    public a0v0() {
        vzu0 vzu0Var = new vzu0(this);
        this.h = vzu0Var;
        this.i = new c0v0(this, vzu0Var, new a(1, this, a0v0.class, "openCityChooser", "openCityChooser(I)V", 0), new xvl0(this, 17));
    }

    @Override // xsna.zzu0
    public final void Ce(WebIdentityCard webIdentityCard) {
        this.i.Ce(webIdentityCard);
    }

    @Override // xsna.zzu0
    public final void E() {
        this.i.E();
    }

    @Override // xsna.zzu0
    public final void R0(VKApiException vKApiException) {
        this.i.R0(vKApiException);
    }

    @Override // xsna.gi6, xsna.iv5
    public final boolean a0() {
        this.i.a();
        return true;
    }

    @Override // xsna.zzu0
    public final void fa(WebIdentityCard webIdentityCard) {
        this.i.fa(webIdentityCard);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        WebCity webCity;
        super.onActivityResult(i, i2, intent);
        if (i == 747 && i2 == -1) {
            c0v0 c0v0Var = this.i;
            if (intent != null) {
                c0v0Var.getClass();
                webCity = (WebCity) intent.getParcelableExtra("city");
            } else {
                webCity = null;
            }
            c0v0Var.o = webCity;
            c0v0Var.j.notifyDataSetChanged();
            if (c0v0Var.u) {
                WebCountry webCountry = c0v0Var.n;
                if (webCountry == null) {
                    c0v0Var.u = true;
                    c0v0Var.i();
                } else {
                    c0v0Var.u = false;
                    c0v0Var.d.invoke(Integer.valueOf(webCountry.b));
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.i.d(getArguments());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.i.e(layoutInflater, viewGroup, bundle);
    }

    @Override // xsna.gi6, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.i.f();
        super.onDestroyView();
    }

    @Override // xsna.zzu0
    public final void reset() {
        this.i.reset();
    }

    @Override // xsna.zzu0
    public final void vd(List<WebIdentityLabel> list) {
        this.i.vd(list);
    }
}
