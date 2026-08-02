package xsna;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.auth.DefaultAuthActivity;
import com.vk.auth.screendata.LibverifyScreenData;
import com.vk.auth.ui.VkLoadingButton;
import com.vk.auth.utils.VkPhoneFormatUtils;
import com.vk.auth.verification.base.states.CodeState;
import com.vk.auth.verification.base.ui.HorizontalCountDownBar;
import com.vk.auth.verification.libverify.LibverifyPresenter;
import com.vk.dto.common.ImageSizeKey;
import com.vk.permission.PermissionHelper;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vkontakte.android.R;
import java.util.Locale;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.mcv0;
import xsna.smu0;
import xsna.ta6;
import xsna.v39;

/* compiled from: LibverifyCheckFragment.kt */
/* loaded from: classes15.dex */
public final class z2z extends ta6<x2z> implements y2z {
    public LibverifyScreenData R;
    public ut20 S;
    public v39 T;
    public th20 U;

    /* compiled from: LibverifyCheckFragment.kt */
    public static final class a {
        public static Bundle a(DefaultAuthActivity defaultAuthActivity, LibverifyScreenData libverifyScreenData) {
            return ta6.a.a(libverifyScreenData instanceof LibverifyScreenData.Auth ? ((LibverifyScreenData.Auth) libverifyScreenData).n : VkPhoneFormatUtils.a(defaultAuthActivity, libverifyScreenData.Cb(), null, VkPhoneFormatUtils.PhoneFormatterMode.RUSSIAN_SPECIFIC, 12), libverifyScreenData.Db(), libverifyScreenData.g, null, null, null, 1, false, null, false, new f1j(libverifyScreenData, 22), 952);
        }
    }

    /* compiled from: LibverifyCheckFragment.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((x2z) this.receiver).f();
            return s3q0.a;
        }
    }

    /* compiled from: LibverifyCheckFragment.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((x2z) this.receiver).L();
            return s3q0.a;
        }
    }

    /* compiled from: LibverifyCheckFragment.kt */
    public static final class d implements smu0.a {
        public final /* synthetic */ String[] b;
        public final /* synthetic */ wzh c;
        public final /* synthetic */ l1i d;

        public d(String[] strArr, wzh wzhVar, l1i l1iVar) {
            this.b = strArr;
            this.c = wzhVar;
            this.d = l1iVar;
        }

        @Override // xsna.smu0.a
        public final void a() {
            PermissionHelper.a.k(z2z.this.kn(), this.b, R.string.vk_permissions_call_log, this.c, new z8f(this.d, 23));
        }

        @Override // xsna.smu0.a
        public final void b() {
            this.d.invoke();
        }

        @Override // xsna.smu0.a
        public final void onCancel() {
            this.d.invoke();
        }
    }

    @Override // xsna.y2z
    public final void D2(String str) {
        try {
            startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:+".concat(str))));
        } catch (Exception unused) {
            wa(getString(R.string.vk_otp_method_selection_verification_methods_libverify_callin_error), null, null);
        }
    }

    @Override // xsna.y2z
    public final void Ik(String[] strArr, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2) {
        int i = mcv0.o1;
        mcv0 a2 = mcv0.a.a(R.drawable.vk_icon_phone_outline_56, requireContext().getString(R.string.vk_apps_phone_verify_auto_call_permission_title), requireContext().getString(R.string.vk_apps_phone_verify_auto_call_permission_subtitle));
        a2.j1 = R.string.vk_auth_phone_permissions_grant;
        a2.k1 = R.string.vk_auth_phone_permissions_deny;
        a2.f1 = new d(strArr, (wzh) gzsVar, (l1i) gzsVar2);
        a2.Td(getChildFragmentManager(), "phonePermissions");
    }

    @Override // xsna.ta6, com.vk.auth.verification.base.c
    public final void Ud(CodeState codeState, int i) {
        View view;
        View view2;
        View view3;
        VkLoadingButton vkLoadingButton;
        Context context;
        if (codeState instanceof CodeState.LibverifyMobileId) {
            ut20 ut20Var = this.S;
            if (ut20Var != null) {
                ut20Var.a(((CodeState.LibverifyMobileId) codeState).e);
            }
        } else {
            ut20 ut20Var2 = this.S;
            if (ut20Var2 != null && (view = ut20Var2.b) != null) {
                view.setVisibility(8);
            }
        }
        super.Ud(codeState, i);
        if (codeState instanceof CodeState.CallInWait) {
            v39 v39Var = this.T;
            if (v39Var != null) {
                CodeState.CallInWait callInWait = (CodeState.CallInWait) codeState;
                v39Var.a(requireContext(), new v39.a(callInWait.e, callInWait.f, callInWait.g), callInWait.i, callInWait.j);
            }
            bpn0 bpn0Var = t65.a;
            mhy.b(requireContext());
        } else {
            v39 v39Var2 = this.T;
            if (v39Var2 != null) {
                View view4 = v39Var2.e;
                if (view4 != null) {
                    f4m.j(view4);
                }
                View view5 = v39Var2.f;
                if (view5 != null) {
                    f4m.j(view5);
                }
            }
        }
        if (!(codeState instanceof CodeState.MessengerRegistration)) {
            th20 th20Var = this.U;
            if (th20Var != null && (view3 = th20Var.d) != null && view3.getVisibility() == 0 && (vkLoadingButton = this.k) != null) {
                jjc.g(vkLoadingButton, new dhh(this, 29));
            }
            th20 th20Var2 = this.U;
            if (th20Var2 == null || (view2 = th20Var2.d) == null) {
                return;
            }
            view2.setVisibility(8);
            return;
        }
        th20 th20Var3 = this.U;
        if (th20Var3 != null) {
            CodeState.MessengerRegistration messengerRegistration = (CodeState.MessengerRegistration) codeState;
            String str = this.s;
            if (str == null) {
                str = null;
            }
            if (!th20Var3.c) {
                th20Var3.c = true;
                View inflate = th20Var3.a.inflate();
                th20Var3.d = inflate;
                th20Var3.e = inflate != null ? (ImageView) inflate.findViewById(R.id.icon_registration) : null;
                View view6 = th20Var3.d;
                th20Var3.f = view6 != null ? (TextView) view6.findViewById(R.id.title_registration) : null;
                View view7 = th20Var3.d;
                th20Var3.g = view7 != null ? (TextView) view7.findViewById(R.id.first_subtitle_registration) : null;
                View view8 = th20Var3.d;
                th20Var3.h = view8 != null ? view8.findViewById(R.id.messenger_register_button) : null;
            }
            View view9 = th20Var3.d;
            if (view9 != null) {
                view9.setVisibility(0);
            }
            View view10 = th20Var3.d;
            if (view10 != null && (context = view10.getContext()) != null) {
                Integer num = messengerRegistration.f;
                String str2 = messengerRegistration.e;
                if (num == null || num.intValue() == -1) {
                    num = null;
                }
                ImageView imageView = th20Var3.e;
                if (imageView != null) {
                    imageView.setVisibility(num != null ? 0 : 8);
                }
                if (num != null) {
                    ImageView imageView2 = th20Var3.e;
                    if (imageView2 != null) {
                        imageView2.setImageResource(num.intValue());
                    }
                    ImageView imageView3 = th20Var3.e;
                    if (imageView3 != null) {
                        imageView3.setContentDescription(str2);
                    }
                }
                TextView textView = th20Var3.f;
                if (textView != null) {
                    textView.setText(context.getString(R.string.vk_messengers_registration_title_format, str2));
                }
                String replace = str != null ? str.replace(ImageSizeKey.SIZE_KEY_BASE, (char) 183) : null;
                if (replace != null) {
                    String replace2 = replace.replace(' ', (char) 160);
                    String string = context.getString(R.string.vk_messengers_registration_subtitle_format, replace2);
                    TextView textView2 = th20Var3.g;
                    if (textView2 != null) {
                        textView2.setText(jgz.t(context, string, replace2));
                    }
                }
            }
            View view11 = th20Var3.h;
            if (view11 != null) {
                jjc.g(view11, new b810(th20Var3, 2));
            }
        }
        VkLoadingButton vkLoadingButton2 = this.k;
        if (vkLoadingButton2 != null) {
            jjc.g(vkLoadingButton2, new lrk(this, 23));
        }
        bpn0 bpn0Var2 = t65.a;
        mhy.b(requireContext());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004c  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.y2z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void be(String str, inr0 inr0Var) {
        boolean z;
        Context mo2getContext = mo2getContext();
        if (mo2getContext == null) {
            return;
        }
        ?? r1 = eh20.a;
        Locale locale = Locale.ROOT;
        String str2 = (String) r1.get(str.toLowerCase(locale));
        boolean z2 = false;
        if (str2 != null) {
            Intent launchIntentForPackage = mo2getContext.getPackageManager().getLaunchIntentForPackage(str2);
            if (launchIntentForPackage != null) {
                launchIntentForPackage.addFlags(268435456);
                z = eh20.a(mo2getContext, launchIntentForPackage);
            } else {
                Intent launchIntentForPackage2 = mo2getContext.getPackageManager().getLaunchIntentForPackage("org.telegram.messenger.web");
                if (str.equals("telegram") && launchIntentForPackage2 != null) {
                    launchIntentForPackage2.addFlags(268435456);
                    z = eh20.a(mo2getContext, launchIntentForPackage2);
                }
            }
            if (!z) {
                inr0Var.e();
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.MESSENGER_APP_OPENED, null, null, null, null, null, null, 254);
                return;
            }
            Context mo2getContext2 = mo2getContext();
            if (mo2getContext2 == null) {
                return;
            }
            String str3 = (String) r1.get(str.toLowerCase(locale));
            if (str3 != null) {
                z2 = true;
                if (!eh20.a(mo2getContext2, new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("market://details?id=".concat(str3))).addFlags(268435456)) && (!xhr0.b(mo2getContext2, "ru.vk.store") || !eh20.a(mo2getContext2, new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("https://www.rustore.ru/catalog/app/".concat(str3))).addFlags(268435456)))) {
                    z2 = eh20.a(mo2getContext2, new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("https://play.google.com/store/apps/details?id=".concat(str3))).addFlags(268435456));
                }
            }
            if (z2) {
                inr0Var.e();
                RegistrationFunnelScreenStack registrationFunnelScreenStack2 = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.MESSENGER_STORE_OPENED, null, null, null, null, null, null, 254);
                return;
            }
            return;
        }
        z = false;
        if (!z) {
        }
    }

    @Override // com.vk.auth.verification.base.c
    public final void e() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    @Override // xsna.ta6, xsna.a66, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.S = null;
        this.T = null;
        this.U = null;
    }

    @Override // xsna.ta6, xsna.a66, androidx.fragment.app.Fragment
    public final void onStart() {
        HorizontalCountDownBar horizontalCountDownBar;
        super.onStart();
        v39 v39Var = this.T;
        if (v39Var == null || (horizontalCountDownBar = v39Var.j) == null) {
            return;
        }
        horizontalCountDownBar.c();
    }

    @Override // xsna.ta6, xsna.a66, androidx.fragment.app.Fragment
    public final void onStop() {
        HorizontalCountDownBar horizontalCountDownBar;
        super.onStop();
        v39 v39Var = this.T;
        if (v39Var == null || (horizontalCountDownBar = v39Var.j) == null) {
            return;
        }
        ValueAnimator valueAnimator = horizontalCountDownBar.j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        horizontalCountDownBar.j = null;
    }

    @Override // xsna.ta6, xsna.a66, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.S = new ut20((ViewStub) view.findViewById(R.id.mobile_id_stub));
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.libverify_callin_top_stub);
        ViewStub viewStub2 = (ViewStub) view.findViewById(R.id.libverify_callin_bottom_stub);
        Object obj = this.o;
        this.T = new v39(viewStub, viewStub2, new b(0, obj != null ? obj : null, x2z.class, "onMakeCallClicked", "onMakeCallClicked()V", 0));
        ViewStub viewStub3 = (ViewStub) view.findViewById(R.id.messenger_registration_stub);
        Object obj2 = this.o;
        this.U = new th20(viewStub3, new c(0, obj2 != null ? obj2 : null, x2z.class, "onRegisterInMessengerClicked", "onRegisterInMessengerClicked()V", 0));
    }

    @Override // xsna.a66
    public final z55 tn(Bundle bundle) {
        CodeState codeState = this.w;
        LibverifyScreenData libverifyScreenData = this.R;
        if (libverifyScreenData == null) {
            libverifyScreenData = null;
        }
        return new LibverifyPresenter(codeState, bundle, libverifyScreenData);
    }

    @Override // xsna.ta6
    public final void yn() {
        Object obj = this.o;
        if (obj == null) {
            obj = null;
        }
        ((x2z) obj).y0(this);
    }

    @Override // xsna.ta6
    public final void zn() {
        super.zn();
        this.R = (LibverifyScreenData) requireArguments().getParcelable("screenData");
    }
}
