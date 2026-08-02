package xsna;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentActivity;
import com.ironsource.O6;
import com.vk.auth.verification.base.CheckPresenterInfo;
import com.vk.auth.verification.base.states.CodeState;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.v6k0;

/* compiled from: SendSmsInboxFragment.kt */
/* loaded from: classes15.dex */
public final class mii0 extends a66<kii0> implements lii0 {
    public q6k0 A;
    public Group s;
    public Group t;
    public Group u;
    public Group v;
    public TextView w;
    public Button x;
    public Button y;
    public ProgressBar z;

    /* compiled from: SendSmsInboxFragment.kt */
    public static final class a {
        public static Bundle a(String str, CheckPresenterInfo checkPresenterInfo, CodeState.SmsInbox smsInbox) {
            Bundle bundle = new Bundle();
            bundle.putString(O6.e1, str);
            bundle.putParcelable("presenter_info", checkPresenterInfo);
            bundle.putParcelable("code_state", smsInbox);
            return bundle;
        }
    }

    /* compiled from: SendSmsInboxFragment.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<v6k0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(v6k0 v6k0Var) {
            v6k0 v6k0Var2 = v6k0Var;
            mii0 mii0Var = (mii0) this.receiver;
            if (v6k0Var2 instanceof v6k0.c) {
                Group group = mii0Var.s;
                if (group != null) {
                    group.setVisibility(0);
                }
                Group group2 = mii0Var.t;
                if (group2 != null) {
                    f4m.j(group2);
                }
                Group group3 = mii0Var.u;
                if (group3 != null) {
                    f4m.j(group3);
                }
                Group group4 = mii0Var.v;
                if (group4 != null) {
                    group4.setVisibility(0);
                }
                Button button = mii0Var.y;
                if (button != null) {
                    button.setVisibility(0);
                }
                Button button2 = mii0Var.x;
                if (button2 != null) {
                    button2.setText(R.string.vk_sms_inbox_send_sms_button);
                }
            } else if (v6k0Var2 instanceof v6k0.b) {
                Group group5 = mii0Var.s;
                if (group5 != null) {
                    f4m.j(group5);
                }
                Group group6 = mii0Var.t;
                if (group6 != null) {
                    group6.setVisibility(0);
                }
                Group group7 = mii0Var.u;
                if (group7 != null) {
                    f4m.j(group7);
                }
                Group group8 = mii0Var.v;
                if (group8 != null) {
                    f4m.j(group8);
                }
                Button button3 = mii0Var.y;
                if (button3 != null) {
                    f4m.j(button3);
                }
            } else {
                if (!(v6k0Var2 instanceof v6k0.a)) {
                    mii0Var.getClass();
                    throw new NoWhenBranchMatchedException();
                }
                Group group9 = mii0Var.s;
                if (group9 != null) {
                    f4m.j(group9);
                }
                Group group10 = mii0Var.t;
                if (group10 != null) {
                    f4m.j(group10);
                }
                Group group11 = mii0Var.u;
                if (group11 != null) {
                    group11.setVisibility(0);
                }
                TextView textView = mii0Var.w;
                if (textView != null) {
                    textView.setText(((v6k0.a) v6k0Var2).a);
                }
                Button button4 = mii0Var.x;
                if (button4 != null) {
                    button4.setText(R.string.vk_sms_inbox_error_sms_resend_button);
                }
                Group group12 = mii0Var.v;
                if (group12 != null) {
                    awt0.v(group12, !((v6k0.a) v6k0Var2).b);
                }
                Button button5 = mii0Var.y;
                if (button5 != null) {
                    button5.setVisibility(0);
                }
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.lii0
    public final void K4(String str, String str2) {
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:".concat(str)));
        intent.putExtra("sms_body", str2);
        try {
            startActivity(intent);
            Object obj = this.o;
            if (obj == null) {
                obj = null;
            }
            ((kii0) obj).B();
        } catch (Exception e) {
            par0.a.getClass();
            par0.d(e);
            Object obj2 = this.o;
            ((kii0) (obj2 != null ? obj2 : null)).q();
        }
    }

    @Override // xsna.a66, xsna.x65
    public final void S(boolean z) {
        super.S(z);
        ProgressBar progressBar = this.z;
        if (progressBar != null) {
            awt0.v(progressBar, z);
        }
    }

    @Override // xsna.lii0
    public final void e() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return wn(R.layout.vk_sms_inbox_fragment, layoutInflater, viewGroup);
    }

    @Override // xsna.a66, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        Object obj = this.o;
        if (obj == null) {
            obj = null;
        }
        ((kii0) obj).X(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.a66, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.s = (Group) view.findViewById(R.id.vk_sms_inbox_send_sms_group);
        this.t = (Group) view.findViewById(R.id.vk_sms_inbox_progress_group);
        this.z = (ProgressBar) view.findViewById(R.id.vk_sms_inbox_total_progress);
        this.u = (Group) view.findViewById(R.id.vk_sms_inbox_error_group);
        this.v = (Group) view.findViewById(R.id.vk_sms_inbox_buttons_group);
        this.w = (TextView) view.findViewById(R.id.vk_sms_inbox_error_subtitle);
        this.y = (Button) view.findViewById(R.id.vk_sms_inbox_confirm_another_way_button);
        Button button = (Button) view.findViewById(R.id.vk_sms_inbox_send_sms_button);
        this.x = button;
        if (button != null) {
            button.setOnClickListener(new sa6(this, 9));
        }
        Button button2 = this.y;
        if (button2 != null) {
            button2.setOnClickListener(new f9(this, 13));
        }
        Object obj = this.o;
        if (obj == null) {
            obj = null;
        }
        ((kii0) obj).p(this);
        Object obj2 = this.o;
        ((kii0) (obj2 != null ? obj2 : null)).X(new b(1, this, mii0.class, "renderState", "renderState(Lcom/vk/auth/verification/smsinbox/SmsInboxViewState;)V", 0));
    }

    @Override // xsna.a66
    public final kii0 tn(Bundle bundle) {
        Bundle arguments = getArguments();
        CheckPresenterInfo checkPresenterInfo = arguments != null ? (CheckPresenterInfo) arguments.getParcelable("presenter_info") : null;
        Bundle arguments2 = getArguments();
        String string = arguments2 != null ? arguments2.getString(O6.e1) : null;
        Bundle arguments3 = getArguments();
        CodeState.SmsInbox smsInbox = arguments3 != null ? (CodeState.SmsInbox) arguments3.getParcelable("code_state") : null;
        q6k0 q6k0Var = new q6k0(checkPresenterInfo);
        this.A = q6k0Var;
        if (string == null) {
            string = "";
        }
        return new s6k0(string, checkPresenterInfo, smsInbox, q6k0Var, bundle);
    }

    @Override // xsna.a66, xsna.arf0
    public final SchemeStatSak$EventScreen u5() {
        SchemeStatSak$EventScreen b2;
        q6k0 q6k0Var = this.A;
        return (q6k0Var == null || (b2 = q6k0.b(q6k0Var.b)) == null) ? SchemeStatSak$EventScreen.VERIFICATION_PHONE_VERIFY : b2;
    }

    @Override // xsna.x65
    public final void wm(boolean z) {
        Button button = this.x;
        if (button != null) {
            button.setEnabled(!z);
        }
        Button button2 = this.y;
        if (button2 != null) {
            button2.setEnabled(!z);
        }
    }
}
