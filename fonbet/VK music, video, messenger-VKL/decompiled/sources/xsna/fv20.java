package xsna;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.pnikosis.materialishprogress.ProgressWheel;
import com.unity3d.services.UnityAdsConstants;
import com.vk.auth.main.AuthModel;
import com.vk.auth.modal.base.ModalAuthHostActivity;
import com.vk.auth.modal.base.ModalAuthInfo;
import com.vk.auth.modal.base.SelectedQrUserType;
import com.vk.auth.ui.multiaccount.VkMultiAccountSelectorView;
import com.vk.core.ui.image.VKImageController;
import com.vk.core.ui.themes.VKReplacerView;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.dto.common.ImageSizeKey;
import com.vk.dto.common.id.UserId;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.superapp.multiaccount.api.f;
import com.vk.superapp.ui.toolbar.VkAuthToolbar;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.hv20;
import xsna.iv20;

/* compiled from: ModalAuthBottomSheet.kt */
/* loaded from: classes15.dex */
public abstract class fv20<P extends hv20<?>> extends dw20 implements jv20, arf0, w8i {
    public static final /* synthetic */ int C1 = 0;
    public UserId A1;
    public final b B1;
    public VKImageController<? extends View> f1;
    public VkAuthToolbar g1;
    public TextView h1;
    public VkMultiAccountSelectorView i1;
    public VkButton j1;
    public ConstraintLayout k1;
    public TextView l1;
    public VKReplacerView m1;
    public TextView n1;
    public LinearLayout o1;
    public hww p1;
    public RecyclerView q1;
    public hv20<?> r1;
    public VKImageController.b s1;
    public ProgressWheel t1;
    public ConstraintLayout u1;
    public TextView v1;
    public ImageView w1;
    public final Object x1;
    public final Object y1;
    public final Object z1;

    /* compiled from: ModalAuthBottomSheet.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<com.vk.superapp.multiaccount.api.f, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(com.vk.superapp.multiaccount.api.f fVar) {
            ((hv20) this.receiver).I2(fVar);
            return s3q0.a;
        }
    }

    /* compiled from: ModalAuthBottomSheet.kt */
    public static final class b implements nao0 {
        public final /* synthetic */ fv20<P> a;

        public b(fv20<P> fv20Var) {
            this.a = fv20Var;
        }

        @Override // xsna.nao0
        public final void U() {
            r55 r55Var = r55.a;
            Uri parse = Uri.parse(AuthModel.a.b(r55.h()));
            rex0 rex0Var = e370.j;
            if (rex0Var == null) {
                rex0Var = null;
            }
            rex0Var.b(this.a.requireContext(), parse);
        }

        @Override // xsna.nao0
        public final void j() {
            r55 r55Var = r55.a;
            Uri parse = Uri.parse(AuthModel.a.a(r55.h()));
            rex0 rex0Var = e370.j;
            if (rex0Var == null) {
                rex0Var = null;
            }
            rex0Var.b(this.a.requireContext(), parse);
        }
    }

    public fv20() {
        w4u w4uVar = new w4u(this, 12);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.x1 = msy.a(lazyThreadSafetyMode, w4uVar);
        Lazy a2 = msy.a(lazyThreadSafetyMode, new pvh(this, 16));
        this.y1 = a2;
        Lazy a3 = msy.a(lazyThreadSafetyMode, new obh(this, 18));
        this.z1 = a3;
        this.A1 = ((mui0) a2.getValue()).a();
        this.B1 = new b(this);
        ((com.vk.superapp.multiaccount.api.d) a3.getValue()).d().size();
    }

    @Override // xsna.jv20
    public final void I2(com.vk.superapp.multiaccount.api.f fVar) {
        this.A1 = fVar.a().b;
        VKImageController<? extends View> vKImageController = this.f1;
        if (vKImageController == null) {
            vKImageController = null;
        }
        String str = fVar.a().d;
        VKImageController.b bVar = this.s1;
        if (bVar == null) {
            bVar = null;
        }
        vKImageController.f(str, bVar);
        TextView textView = this.h1;
        if (textView == null) {
            textView = null;
        }
        textView.setText(fVar.a().c);
        TextView textView2 = this.l1;
        if (textView2 == null) {
            textView2 = null;
        }
        String str2 = fVar.a().e;
        textView2.setText(str2 != null ? str2.replace(ImageSizeKey.SIZE_KEY_BASE, (char) 183) : null);
    }

    @Override // xsna.jv20
    public final void L0() {
        VkMultiAccountSelectorView vkMultiAccountSelectorView = this.i1;
        if (vkMultiAccountSelectorView == null) {
            vkMultiAccountSelectorView = null;
        }
        UserId userId = this.A1;
        hv20<?> hv20Var = this.r1;
        vkMultiAccountSelectorView.P4(userId, new a(1, hv20Var != null ? hv20Var : null, hv20.class, "selectUser", "selectUser(Lcom/vk/superapp/multiaccount/api/MultiAccountUser;)V", 0));
    }

    @Override // xsna.jv20
    public final void W8(iv20 iv20Var) {
        String string;
        if (!(iv20Var instanceof iv20.b)) {
            if (iv20Var instanceof iv20.a) {
                ProgressWheel progressWheel = this.t1;
                if (progressWheel == null) {
                    progressWheel = null;
                }
                progressWheel.setVisibility(0);
                VKImageController<? extends View> vKImageController = this.f1;
                if (vKImageController == null) {
                    vKImageController = null;
                }
                vKImageController.getView().setVisibility(4);
                hww hwwVar = this.p1;
                hww hwwVar2 = hwwVar != null ? hwwVar : null;
                hwwVar2.d = true;
                hwwVar2.notifyDataSetChanged();
                return;
            }
            if (!(iv20Var instanceof iv20.c)) {
                throw new NoWhenBranchMatchedException();
            }
            VkButton vkButton = this.j1;
            if (vkButton == null) {
                vkButton = null;
            }
            vkButton.setLoading(false);
            ProgressWheel progressWheel2 = this.t1;
            if (progressWheel2 == null) {
                progressWheel2 = null;
            }
            progressWheel2.setVisibility(4);
            VKImageController<? extends View> vKImageController2 = this.f1;
            (vKImageController2 != null ? vKImageController2 : null).getView().setVisibility(0);
            return;
        }
        hww hwwVar3 = this.p1;
        if (hwwVar3 == null) {
            hwwVar3 = null;
        }
        iv20.b bVar = (iv20.b) iv20Var;
        String str = bVar.a;
        ArrayList arrayList = bVar.d;
        ArrayList arrayList2 = hwwVar3.c;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        hwwVar3.d = false;
        hwwVar3.notifyDataSetChanged();
        TextView textView = this.h1;
        if (textView == null) {
            textView = null;
        }
        Integer Zn = Zn();
        if (Zn == null || (string = getString(Zn.intValue())) == null) {
            string = (str == null || str.length() == 0) ? getString(R.string.vk_auth_account_continue) : getString(R.string.vk_auth_account_continue_as, str);
        }
        textView.setText(string);
        TextView textView2 = this.l1;
        if (textView2 == null) {
            textView2 = null;
        }
        String str2 = bVar.c;
        ey2.i(textView2, str2 != null ? str2.replace(ImageSizeKey.SIZE_KEY_BASE, (char) 183) : null);
        VKImageController<? extends View> vKImageController3 = this.f1;
        if (vKImageController3 == null) {
            vKImageController3 = null;
        }
        String str3 = bVar.b;
        VKImageController.b bVar2 = this.s1;
        if (bVar2 == null) {
            bVar2 = null;
        }
        vKImageController3.f(str3, bVar2);
        ProgressWheel progressWheel3 = this.t1;
        if (progressWheel3 == null) {
            progressWheel3 = null;
        }
        progressWheel3.setVisibility(4);
        VKReplacerView vKReplacerView = this.m1;
        if (vKReplacerView == null) {
            vKReplacerView = null;
        }
        VKImageController<? extends View> vKImageController4 = this.f1;
        if (vKImageController4 == null) {
            vKImageController4 = null;
        }
        vKReplacerView.a(vKImageController4.getView());
        VKImageController<? extends View> vKImageController5 = this.f1;
        if (vKImageController5 == null) {
            vKImageController5 = null;
        }
        vKImageController5.getView().setVisibility(0);
        go(bVar.g);
        LinearLayout linearLayout = this.o1;
        awt0.v(linearLayout != null ? linearLayout : null, !bVar.k);
    }

    public int Yn() {
        return R.drawable.vk_bg_content_elevation_8;
    }

    public Integer Zn() {
        return null;
    }

    public int ao() {
        return R.string.vk_auth_continue;
    }

    public abstract hv20 bo(Context context, fv20 fv20Var);

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if ((r0 != null ? r0.getBoolean("need_finish_activity", true) : true) != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void co() {
        boolean z;
        if (getActivity() instanceof ModalAuthHostActivity) {
            hv20<?> hv20Var = this.r1;
            if (hv20Var == null) {
                hv20Var = null;
            }
            if (hv20Var.J2()) {
                Bundle arguments = getArguments();
                z = true;
            }
        }
        z = false;
        if (z) {
            kn().finish();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final SelectedQrUserType eo() {
        Object obj;
        Iterator<T> it = ((com.vk.superapp.multiaccount.api.d) this.z1.getValue()).d().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((com.vk.superapp.multiaccount.api.f) obj).a().b.b == this.A1.b) {
                break;
            }
        }
        com.vk.superapp.multiaccount.api.f fVar = (com.vk.superapp.multiaccount.api.f) obj;
        if (fVar == null) {
            return SelectedQrUserType.NORMAL;
        }
        if (fVar instanceof f.a) {
            return SelectedQrUserType.NORMAL;
        }
        if (fVar instanceof f.c.a) {
            return SelectedQrUserType.BANNED;
        }
        if (fVar instanceof f.c.C1893c) {
            return SelectedQrUserType.UNAVAILABLE;
        }
        if (fVar instanceof f.c.b) {
            return SelectedQrUserType.DELETED;
        }
        throw new NoWhenBranchMatchedException();
    }

    public abstract ModalAuthInfo fo();

    public void go(String str) {
        if (str == null || drm0.N(str)) {
            ConstraintLayout constraintLayout = this.u1;
            f4m.j(constraintLayout != null ? constraintLayout : null);
            return;
        }
        ConstraintLayout constraintLayout2 = this.u1;
        if (constraintLayout2 == null) {
            constraintLayout2 = null;
        }
        constraintLayout2.setVisibility(0);
        String string = getString(R.string.vk_modal_auth_attention_text, str);
        SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) string);
        append.setSpan(new ForegroundColorSpan(krv0.l(R.attr.vk_ui_text_primary)), string.length() - str.length(), append.length(), 33);
        TextView textView = this.v1;
        (textView != null ? textView : null).setText(append);
    }

    public boolean ho() {
        return false;
    }

    public abstract int io();

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        hv20<?> hv20Var = this.r1;
        if (hv20Var == null) {
            hv20Var = null;
        }
        hv20Var.onDestroy();
    }

    @Override // xsna.dw20, xsna.dh6, androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        co();
    }

    @Override // xsna.jv20
    public final void vc(String str, String str2, String str3, String str4, String str5) {
        boolean z = u5() == SchemeStatSak$EventScreen.QR_CODE_ASK_CONFIRM;
        c030 c030Var = new c030();
        Bundle bundle = new Bundle(6);
        bundle.putString("map_url", str3);
        bundle.putString("location_name", str2);
        bundle.putString("ip_address", str);
        bundle.putBoolean("is_qr_flow", z);
        bundle.putString("auth_id", str4);
        bundle.putString("app_id", str5);
        c030Var.setArguments(bundle);
        c030Var.Td(kn().getSupportFragmentManager(), "qr_map_bottom_sheet");
    }

    @Override // xsna.dw20, androidx.fragment.app.d
    public final int vn() {
        return R.style.VkIdBModalBottomSheetTheme;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        String string;
        q0o0 q0o0Var = this instanceof q0o0 ? (q0o0) this : null;
        prw.h(this, q0o0Var != null ? q0o0Var.tag() : "VkSdkDialogFragment", null);
        View inflate = LayoutInflater.from(new lpj(requireContext(), R.style.VkIdBModalBottomSheetTheme)).inflate(R.layout.vk_fragment_qr_auth, (ViewGroup) null, false);
        dw20.Rn(this, inflate, 4);
        this.s1 = new VKImageController.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, true, 0, null, null, null, null, 0.5f, e3m.f(R.attr.vk_ui_image_border_alpha, inflate.getContext()), null, null, null, 63995);
        ifx0 ifx0Var = e370.c;
        if (ifx0Var == null) {
            ifx0Var = null;
        }
        this.f1 = ifx0Var.b().create(inflate.getContext());
        this.g1 = (VkAuthToolbar) inflate.findViewById(R.id.toolbar);
        this.h1 = (TextView) inflate.findViewById(R.id.qr_login_btn_first_line);
        this.l1 = (TextView) inflate.findViewById(R.id.qr_login_btn_second_line);
        ((TextView) inflate.findViewById(R.id.title)).setText(getString(io()));
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate.findViewById(R.id.modal_auth_attention_view);
        constraintLayout.setBackgroundResource(Yn());
        this.u1 = constraintLayout;
        this.v1 = (TextView) inflate.findViewById(R.id.vk_modal_auth_text);
        this.w1 = (ImageView) inflate.findViewById(R.id.vk_modal_auth_icon);
        this.m1 = (VKReplacerView) inflate.findViewById(R.id.qr_btn_end_icon);
        this.n1 = (TextView) inflate.findViewById(R.id.vk_terms);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.vk_terms_more);
        this.o1 = linearLayout;
        linearLayout.setOnClickListener(new i1f(this, 2));
        this.k1 = (ConstraintLayout) inflate.findViewById(R.id.qr_login_btn_content);
        this.t1 = (ProgressWheel) inflate.findViewById(R.id.qr_btn_progress_wheel);
        VkMultiAccountSelectorView vkMultiAccountSelectorView = (VkMultiAccountSelectorView) inflate.findViewById(R.id.selector);
        this.i1 = vkMultiAccountSelectorView;
        vkMultiAccountSelectorView.setOnClickListener(new rg0(this, 5));
        int f = e3m.f(R.attr.vk_ui_text_subhead, requireContext());
        TextView textView = this.n1;
        mg6 mg6Var = new mg6(this.B1, textView == null ? null : textView, getString(R.string.vk_auth_log_in), f, null, 96);
        String string2 = getString(R.string.vk_auth_log_in);
        izs izsVar = (izs) mg6Var.c;
        if (izsVar == null || (string = (String) izsVar.invoke(string2)) == null) {
            string = ((Context) mg6Var.d).getString(R.string.vk_auth_sign_up_terms_new, string2);
        }
        ((oao0) mg6Var.e).d(string);
        VkAuthToolbar vkAuthToolbar = this.g1;
        if (vkAuthToolbar == null) {
            vkAuthToolbar = null;
        }
        r55 r55Var = r55.a;
        vkAuthToolbar.setPicture(r55.i().b(requireContext()));
        this.q1 = (RecyclerView) inflate.findViewById(R.id.consent_items);
        this.p1 = new hww();
        RecyclerView recyclerView = this.q1;
        if (recyclerView == null) {
            recyclerView = null;
        }
        mo2getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        RecyclerView recyclerView2 = this.q1;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        hww hwwVar = this.p1;
        if (hwwVar == null) {
            hwwVar = null;
        }
        recyclerView2.setAdapter(hwwVar);
        RecyclerView recyclerView3 = this.q1;
        if (recyclerView3 == null) {
            recyclerView3 = null;
        }
        recyclerView3.setVisibility(0);
        hv20<?> bo = bo(requireContext(), this);
        this.r1 = bo;
        if (bo == null) {
            bo = null;
        }
        bo.M2(fo());
        ConstraintLayout constraintLayout2 = this.k1;
        if (constraintLayout2 == null) {
            constraintLayout2 = null;
        }
        constraintLayout2.setOnClickListener(new sg0(this, 12));
        VkButton vkButton = (VkButton) inflate.findViewById(R.id.vk_modal_qr_continue_button);
        vkButton.setText(ao());
        jjc.g(vkButton, new f2s(this, 24));
        this.j1 = vkButton;
        if (coe0.c) {
            VkMultiAccountSelectorView vkMultiAccountSelectorView2 = this.i1;
            if (vkMultiAccountSelectorView2 == null) {
                vkMultiAccountSelectorView2 = null;
            }
            vkMultiAccountSelectorView2.setVisibility(0);
            ConstraintLayout constraintLayout3 = this.k1;
            if (constraintLayout3 == null) {
                constraintLayout3 = null;
            }
            f4m.j(constraintLayout3);
            VkButton vkButton2 = this.j1;
            (vkButton2 != null ? vkButton2 : null).setVisibility(0);
        } else {
            ConstraintLayout constraintLayout4 = this.u1;
            if (constraintLayout4 == null) {
                constraintLayout4 = null;
            }
            constraintLayout4.setBackgroundResource(R.drawable.vk_bg_secondary_attention_background);
            LinearLayout linearLayout2 = this.o1;
            f4m.j(linearLayout2 != null ? linearLayout2 : null);
        }
        VkSimpleButton vkSimpleButton = (VkSimpleButton) inflate.findViewById(R.id.vk_modal_qr_secondary_button);
        vkSimpleButton.setVisibility(ho() ? 0 : 8);
        vkSimpleButton.setOnClickListener(new q3(this, 7));
        return super.yn(bundle);
    }
}
