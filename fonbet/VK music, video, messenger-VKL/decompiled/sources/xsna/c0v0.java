package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.superapp.api.dto.identity.WebCity;
import com.vk.superapp.api.dto.identity.WebCountry;
import com.vk.superapp.api.dto.identity.WebIdentityAddress;
import com.vk.superapp.api.dto.identity.WebIdentityCard;
import com.vk.superapp.api.dto.identity.WebIdentityCardData;
import com.vk.superapp.api.dto.identity.WebIdentityEmail;
import com.vk.superapp.api.dto.identity.WebIdentityLabel;
import com.vk.superapp.api.dto.identity.WebIdentityPhone;
import com.vk.superapp.browser.internal.ui.identity.WebIdentityContext;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.dw20;

/* compiled from: VkIdentityEditView.kt */
/* loaded from: classes6.dex */
public final class c0v0 implements zzu0 {
    public final Fragment b;
    public final wzu0 c;
    public final FunctionReferenceImpl d;
    public final izs<Intent, s3q0> e;
    public WebIdentityContext f;
    public RecyclerPaginatedView g;
    public Toolbar h;
    public MenuItem i;
    public evv k;
    public jvv l;
    public WebIdentityLabel m;
    public WebCountry n;
    public WebCity o;
    public int t;
    public boolean u;
    public WebIdentityCardData v;
    public String w;
    public final gvv j = new gvv(this);
    public String p = "";
    public String q = "";
    public String r = "";
    public String s = "";

    /* compiled from: VkIdentityEditView.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<WebCountry, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(WebCountry webCountry) {
            FragmentManager supportFragmentManager;
            WebCountry webCountry2 = webCountry;
            c0v0 c0v0Var = (c0v0) this.receiver;
            FragmentActivity activity = c0v0Var.b.getActivity();
            if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                Fragment H = supportFragmentManager.H("identity_dialog_country");
                if (H instanceof androidx.fragment.app.d) {
                    ((androidx.fragment.app.d) H).dismiss();
                }
            }
            c0v0Var.n = webCountry2;
            c0v0Var.o = null;
            c0v0Var.j.notifyDataSetChanged();
            c0v0Var.c();
            return s3q0.a;
        }
    }

    /* compiled from: VkIdentityEditView.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<WebIdentityLabel, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(WebIdentityLabel webIdentityLabel) {
            FragmentManager supportFragmentManager;
            WebIdentityLabel webIdentityLabel2 = webIdentityLabel;
            c0v0 c0v0Var = (c0v0) this.receiver;
            Fragment fragment = c0v0Var.b;
            FragmentActivity activity = fragment.getActivity();
            if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                Fragment H = supportFragmentManager.H("identity_dialog_label");
                if (H instanceof androidx.fragment.app.d) {
                    ((androidx.fragment.app.d) H).dismiss();
                }
            }
            c0v0Var.m = webIdentityLabel2;
            gvv gvvVar = c0v0Var.j;
            Context requireContext = fragment.requireContext();
            if (webIdentityLabel2.zb()) {
                drm0.N(webIdentityLabel2.c);
            }
            gvvVar.K0(requireContext);
            c0v0Var.c();
            return s3q0.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c0v0(Fragment fragment, wzu0 wzu0Var, izs<? super Integer, s3q0> izsVar, izs<? super Intent, s3q0> izsVar2) {
        this.b = fragment;
        this.c = wzu0Var;
        this.d = (FunctionReferenceImpl) izsVar;
        this.e = izsVar2;
    }

    @Override // xsna.zzu0
    public final void Ce(WebIdentityCard webIdentityCard) {
        WebIdentityCardData webIdentityCardData = this.v;
        if (webIdentityCardData != null) {
            String str = this.w;
            if (str == null) {
                str = null;
            }
            WebIdentityCard Ab = webIdentityCardData.Ab(this.t, str);
            if (Ab != null) {
                webIdentityCardData.Jb(webIdentityCardData.Gb(Ab), Ab.getType());
            }
        }
        a();
    }

    @Override // xsna.zzu0
    public final void E() {
        RecyclerPaginatedView recyclerPaginatedView = this.g;
        if (recyclerPaginatedView != null) {
            recyclerPaginatedView.e0();
        }
        MenuItem menuItem = this.i;
        if (menuItem != null) {
            menuItem.setVisible(false);
        }
    }

    @Override // xsna.zzu0
    public final void R0(VKApiException vKApiException) {
        RecyclerPaginatedView recyclerPaginatedView = this.g;
        if (recyclerPaginatedView != null) {
            recyclerPaginatedView.r(vKApiException);
        }
        MenuItem menuItem = this.i;
        if (menuItem != null) {
            menuItem.setVisible(false);
        }
    }

    public final void a() {
        mhy.b(this.b.requireContext());
        WebIdentityCardData webIdentityCardData = this.v;
        if (webIdentityCardData != null) {
            WebCity webCity = this.o;
            if (webCity != null) {
                List<WebCity> list = webIdentityCardData.f;
                if (list.indexOf(webCity) == -1) {
                    list.add(webCity);
                }
            }
            WebCountry webCountry = this.n;
            if (webCountry != null) {
                List<WebCountry> list2 = webIdentityCardData.e;
                if (list2.indexOf(webCountry) == -1) {
                    list2.add(webCountry);
                }
            }
            Intent intent = new Intent();
            intent.putExtra("arg_identity_card", webIdentityCardData);
            WebIdentityContext webIdentityContext = this.f;
            if (webIdentityContext != null) {
                intent.putExtra("arg_identity_context", new WebIdentityContext(webIdentityContext.b, webIdentityCardData, webIdentityContext.d, webIdentityContext.e, webIdentityContext.f));
            }
            int i = this.t;
            if (i != 0) {
                intent.putExtra("arg_identity_id", i);
            }
            this.e.invoke(intent);
        }
    }

    public final String b(String str) {
        WebCity webCity;
        WebCountry webCountry;
        WebIdentityLabel webIdentityLabel;
        if (str.equals("custom_label") && (webIdentityLabel = this.m) != null && webIdentityLabel.zb()) {
            return this.m.c;
        }
        if (str.equals("country") && (webCountry = this.n) != null) {
            return webCountry.c;
        }
        if (str.equals("city") && (webCity = this.o) != null) {
            return webCity.c;
        }
        if (str.equals(RTCStatsConstants.KEY_ADDRESS)) {
            return this.q;
        }
        if (str.equals("postcode")) {
            return this.p;
        }
        if (str.equals("phone_number")) {
            return this.s;
        }
        if (str.equals("email")) {
            return this.r;
        }
        str.equals("label");
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        boolean z;
        WebIdentityLabel webIdentityLabel = this.m;
        String str = webIdentityLabel != null ? webIdentityLabel.c : null;
        boolean z2 = false;
        if (str != null && !drm0.N(str)) {
            String str2 = this.w;
            String str3 = str2 != null ? str2 : null;
            int hashCode = str3.hashCode();
            if (hashCode == -1147692044) {
                if (str3.equals(RTCStatsConstants.KEY_ADDRESS)) {
                    z = (drm0.N(this.q) || this.o == null || this.n == null) ? false : true;
                    if (z) {
                    }
                }
                throw new IllegalStateException("Not found card type");
            }
            if (hashCode == 96619420) {
                if (str3.equals("email")) {
                    z = Patterns.EMAIL_ADDRESS.matcher(this.r).matches();
                    if (z) {
                    }
                }
                throw new IllegalStateException("Not found card type");
            }
            if (hashCode == 106642798 && str3.equals("phone")) {
                z = Patterns.PHONE.matcher(this.s).matches();
                if (z) {
                    z2 = true;
                }
            }
            throw new IllegalStateException("Not found card type");
        }
        h(z2);
    }

    public final void d(Bundle bundle) {
        String string;
        if (bundle != null) {
            this.w = bundle.getString("arg_type");
            this.v = (WebIdentityCardData) bundle.getParcelable("arg_identity_card");
            if (bundle.containsKey("arg_identity_context")) {
                this.f = (WebIdentityContext) bundle.getParcelable("arg_identity_context");
            }
            if (bundle.containsKey("arg_identity_id")) {
                int i = bundle.getInt("arg_identity_id");
                this.t = i;
                WebIdentityCardData webIdentityCardData = this.v;
                String str = this.w;
                if (str == null) {
                    str = null;
                }
                WebIdentityCard Ab = webIdentityCardData.Ab(i, str);
                if (Ab != null) {
                    this.m = Ab.Ab();
                    if (Ab instanceof WebIdentityPhone) {
                        this.s = ((WebIdentityPhone) Ab).Db();
                    } else if (Ab instanceof WebIdentityEmail) {
                        this.r = ((WebIdentityEmail) Ab).c;
                    } else if (Ab instanceof WebIdentityAddress) {
                        WebIdentityAddress webIdentityAddress = (WebIdentityAddress) Ab;
                        this.q = webIdentityAddress.e;
                        this.p = webIdentityAddress.d;
                        this.n = this.v.Cb(webIdentityAddress.h);
                        this.o = this.v.Bb(webIdentityAddress.g);
                    }
                }
            }
            Fragment fragment = this.b;
            this.k = new evv(fragment.requireContext(), new a(1, this, c0v0.class, "setCountry", "setCountry(Lcom/vk/superapp/api/dto/identity/WebCountry;)V", 0));
            Context requireContext = fragment.requireContext();
            String str2 = this.w;
            String str3 = str2 != null ? str2 : null;
            boolean z = this.t != 0;
            ArrayList arrayList = new ArrayList();
            arrayList.add(new vuv(2));
            arrayList.add(new zuv("label", requireContext.getString(R.string.vk_identity_label), R.layout.vk_identity_card_item));
            int hashCode = str3.hashCode();
            if (hashCode != -1147692044) {
                if (hashCode != 96619420) {
                    if (hashCode == 106642798 && str3.equals("phone")) {
                        arrayList.add(new zuv("phone_number", requireContext.getString(R.string.vk_identity_phone), R.layout.vk_identity_textfield));
                    }
                } else if (str3.equals("email")) {
                    arrayList.add(new zuv("email", requireContext.getString(R.string.vk_email_placeholder), R.layout.vk_identity_textfield));
                }
            } else if (str3.equals(RTCStatsConstants.KEY_ADDRESS)) {
                arrayList.add(new zuv("country", requireContext.getString(R.string.vk_identity_country), R.layout.vk_identity_card_item));
                arrayList.add(new zuv("city", requireContext.getString(R.string.vk_identity_city), R.layout.vk_identity_card_item));
                arrayList.add(new zuv(RTCStatsConstants.KEY_ADDRESS, requireContext.getString(R.string.vk_identity_address), R.layout.vk_identity_textfield));
                arrayList.add(new zuv("postcode", requireContext.getString(R.string.vk_identity_post_index), R.layout.vk_identity_textfield));
            }
            arrayList.add(new vuv(2));
            if (z) {
                arrayList.add(new vuv(0));
                int hashCode2 = str3.hashCode();
                if (hashCode2 == -1147692044) {
                    if (str3.equals(RTCStatsConstants.KEY_ADDRESS)) {
                        string = requireContext.getString(R.string.vk_identity_remove_address);
                        arrayList.add(new xuv(string, R.layout.vk_material_list_button_red));
                    }
                    throw new IllegalStateException(str3.concat(" not supported"));
                }
                if (hashCode2 == 96619420) {
                    if (str3.equals("email")) {
                        string = requireContext.getString(R.string.vk_identity_remove_email);
                        arrayList.add(new xuv(string, R.layout.vk_material_list_button_red));
                    }
                    throw new IllegalStateException(str3.concat(" not supported"));
                }
                if (hashCode2 == 106642798 && str3.equals("phone")) {
                    string = requireContext.getString(R.string.vk_identity_remove_phone);
                    arrayList.add(new xuv(string, R.layout.vk_material_list_button_red));
                }
                throw new IllegalStateException(str3.concat(" not supported"));
            }
            gvv gvvVar = this.j;
            gvvVar.setItems(arrayList);
            gvvVar.K0(fragment.requireContext());
        }
    }

    public final View e(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Menu menu;
        String string;
        View inflate = layoutInflater.inflate(R.layout.vk_layout_list_fragment, viewGroup, false);
        this.h = (Toolbar) inflate.findViewById(R.id.toolbar);
        RecyclerPaginatedView recyclerPaginatedView = (RecyclerPaginatedView) inflate.findViewById(R.id.vk_rpb_list);
        this.g = recyclerPaginatedView;
        if (recyclerPaginatedView != null) {
            recyclerPaginatedView.setOnReloadRetryClickListener(new rmu0(this, 1));
        }
        Toolbar toolbar = this.h;
        if (toolbar != null) {
            Fragment fragment = this.b;
            toolbar.setNavigationIcon(krv0.f(R.drawable.vk_icon_arrow_left_outline_28, R.attr.vk_ui_text_accent_themed, fragment.requireContext()));
            Context requireContext = fragment.requireContext();
            String str = this.w;
            if (str == null) {
                str = null;
            }
            int hashCode = str.hashCode();
            if (hashCode == -1147692044) {
                if (str.equals(RTCStatsConstants.KEY_ADDRESS)) {
                    string = requireContext.getString(R.string.vk_identity_address);
                    toolbar.setTitle(string);
                    toolbar.setNavigationOnClickListener(new c98(this, 16));
                }
                throw new IllegalStateException(str.concat(" not supported"));
            }
            if (hashCode == 96619420) {
                if (str.equals("email")) {
                    string = requireContext.getString(R.string.vk_identity_email);
                    toolbar.setTitle(string);
                    toolbar.setNavigationOnClickListener(new c98(this, 16));
                }
                throw new IllegalStateException(str.concat(" not supported"));
            }
            if (hashCode == 106642798 && str.equals("phone")) {
                string = requireContext.getString(R.string.vk_identity_phone);
                toolbar.setTitle(string);
                toolbar.setNavigationOnClickListener(new c98(this, 16));
            }
            throw new IllegalStateException(str.concat(" not supported"));
        }
        Toolbar toolbar2 = this.h;
        MenuItem add = (toolbar2 == null || (menu = toolbar2.getMenu()) == null) ? null : menu.add(0, R.id.vk_done, 0, R.string.vk_save);
        this.i = add;
        if (add != null) {
            add.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: xsna.b0v0
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    c0v0 c0v0Var = c0v0.this;
                    wzu0 wzu0Var = c0v0Var.c;
                    WebIdentityLabel webIdentityLabel = c0v0Var.m;
                    if (webIdentityLabel == null) {
                        return true;
                    }
                    String str2 = c0v0Var.w;
                    if (str2 == null) {
                        str2 = null;
                    }
                    int hashCode2 = str2.hashCode();
                    if (hashCode2 == -1147692044) {
                        if (!str2.equals(RTCStatsConstants.KEY_ADDRESS)) {
                            return true;
                        }
                        c0v0Var.c.h1(webIdentityLabel, c0v0Var.q, c0v0Var.n.b, c0v0Var.o.b, c0v0Var.p, c0v0Var.t);
                        return true;
                    }
                    if (hashCode2 == 96619420) {
                        if (!str2.equals("email")) {
                            return true;
                        }
                        wzu0Var.x4(webIdentityLabel, c0v0Var.r, c0v0Var.t);
                        return true;
                    }
                    if (hashCode2 != 106642798 || !str2.equals("phone")) {
                        return true;
                    }
                    wzu0Var.N3(webIdentityLabel, c0v0Var.s, c0v0Var.t);
                    return true;
                }
            });
            add.setShowAsAction(2);
            h(false);
        }
        RecyclerPaginatedView recyclerPaginatedView2 = this.g;
        if (recyclerPaginatedView2 != null) {
            recyclerPaginatedView2.setSwipeRefreshEnabled(false);
            new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.LINEAR, recyclerPaginatedView2).a();
            RecyclerView recyclerView = recyclerPaginatedView2.getRecyclerView();
            if (recyclerView != null) {
                recyclerView.setItemAnimator(null);
            }
        }
        g();
        return inflate;
    }

    public final void f() {
        FragmentManager supportFragmentManager;
        FragmentActivity activity = this.b.getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            Fragment H = supportFragmentManager.H("identity_dialog_country");
            if (H instanceof androidx.fragment.app.d) {
                ((androidx.fragment.app.d) H).dismiss();
            }
            Fragment H2 = supportFragmentManager.H("identity_dialog_label");
            if (H2 instanceof androidx.fragment.app.d) {
                ((androidx.fragment.app.d) H2).dismiss();
            }
        }
        this.f = null;
        this.g = null;
        this.h = null;
        this.l = null;
        this.n = null;
        this.v = null;
        this.i = null;
    }

    @Override // xsna.zzu0
    public final void fa(WebIdentityCard webIdentityCard) {
        WebIdentityCardData webIdentityCardData = this.v;
        if (webIdentityCardData != null) {
            List<WebIdentityAddress> list = webIdentityCardData.d;
            List<WebIdentityEmail> list2 = webIdentityCardData.c;
            List<WebIdentityPhone> list3 = webIdentityCardData.b;
            int Gb = webIdentityCardData.Gb(webIdentityCard);
            if (Gb != -1) {
                webIdentityCardData.Jb(Gb, webIdentityCard.getType());
            }
            String type = webIdentityCard.getType();
            int hashCode = type.hashCode();
            if (hashCode != -1147692044) {
                if (hashCode != 96619420) {
                    if (hashCode == 106642798 && type.equals("phone")) {
                        if (Gb == -1) {
                            list3.add((WebIdentityPhone) webIdentityCard);
                        } else {
                            list3.add(Gb, (WebIdentityPhone) webIdentityCard);
                        }
                    }
                } else if (type.equals("email")) {
                    if (Gb == -1) {
                        list2.add((WebIdentityEmail) webIdentityCard);
                    } else {
                        list2.add(Gb, (WebIdentityEmail) webIdentityCard);
                    }
                }
            } else if (type.equals(RTCStatsConstants.KEY_ADDRESS)) {
                if (Gb == -1) {
                    list.add((WebIdentityAddress) webIdentityCard);
                } else {
                    list.add(Gb, (WebIdentityAddress) webIdentityCard);
                }
            }
            a();
        }
    }

    public final void g() {
        String str = this.w;
        String str2 = str == null ? null : str;
        WebIdentityCardData webIdentityCardData = this.v;
        if (str == null) {
            str = null;
        }
        HashMap<String, ArrayList<WebIdentityLabel>> hashMap = webIdentityCardData.h;
        this.c.d0(str2, hashMap.containsKey(str) ? hashMap.get(str) : new ArrayList<>());
        E();
    }

    @Override // xsna.zzu0
    public final Context getContext() {
        return this.b.requireContext();
    }

    public final void h(boolean z) {
        MenuItem menuItem = this.i;
        if (menuItem != null) {
            menuItem.setEnabled(z);
            Fragment fragment = this.b;
            if (z) {
                menuItem.setIcon(krv0.f(R.drawable.vk_icon_done_24, R.attr.vk_ui_text_accent_themed, fragment.requireContext()));
            } else {
                menuItem.setIcon(krv0.f(R.drawable.vk_icon_done_24, R.attr.vk_ui_icon_secondary, fragment.requireContext()));
            }
        }
    }

    public final void i() {
        dw20.a c;
        dw20.a i;
        evv evvVar = this.k;
        if (evvVar != null) {
            WebCountry webCountry = this.n;
            evvVar.e = webCountry != null ? Integer.valueOf(webCountry.b) : null;
            c = new dw20.b(this.b.kn(), null).v0(R.string.vk_identity_country).c(new ts90(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3));
            i = c.i(evvVar, (r3 & 2) == 0, false);
            ((dw20.b) i).I0("identity_dialog_country");
        }
    }

    @Override // xsna.zzu0
    public final void reset() {
        RecyclerPaginatedView recyclerPaginatedView = this.g;
        if (recyclerPaginatedView != null) {
            recyclerPaginatedView.f0();
        }
    }

    @Override // xsna.zzu0
    public final void vd(List<WebIdentityLabel> list) {
        this.l = new jvv(list, new b(1, this, c0v0.class, "setLabel", "setLabel(Lcom/vk/superapp/api/dto/identity/WebIdentityLabel;)V", 0));
        MenuItem menuItem = this.i;
        if (menuItem != null) {
            menuItem.setVisible(true);
        }
        RecyclerPaginatedView recyclerPaginatedView = this.g;
        if (recyclerPaginatedView != null) {
            recyclerPaginatedView.setAdapter(this.j);
            gjf0.b(recyclerPaginatedView);
            recyclerPaginatedView.f0();
        }
        c();
    }
}
