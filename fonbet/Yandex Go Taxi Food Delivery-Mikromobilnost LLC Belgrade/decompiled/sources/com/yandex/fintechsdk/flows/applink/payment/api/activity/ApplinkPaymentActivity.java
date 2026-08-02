package com.yandex.fintechsdk.flows.applink.payment.api.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.yandex.fintechsdk.flows.applink.payment.internal.activity.args.ApplinkPaymentParseResult$RedirectHost;
import com.yandex.fintechsdk.flows.applink.payment.internal.activity.args.IntentArgs;
import com.yandex.fintechsdk.flows.applink.payment.internal.activity.paymentform.ApplinkPaymentFragment;
import com.yandex.fintechsdk.flows.applink.payment.internal.activity.redirecthost.RedirectHostFragment;
import com.yandex.pay.payment.YPayResult;
import com.yandex.payment.common.result.ResultType;
import defpackage.g8e;
import defpackage.hrw;
import defpackage.i3y;
import defpackage.ili0;
import defpackage.irw;
import defpackage.jl40;
import defpackage.jrt0;
import defpackage.k23;
import defpackage.krt0;
import defpackage.l23;
import defpackage.ly1;
import defpackage.m23;
import defpackage.o23;
import defpackage.rar;
import defpackage.say;
import defpackage.u7w;
import defpackage.w511;
import defpackage.xgh0;
import kotlin.Metadata;
import kotlin.a;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/yandex/fintechsdk/flows/applink/payment/api/activity/ApplinkPaymentActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lirw;", "<init>", "()V", "Lo23;", "parseResult", "Lzy11;", "showFragment", "(Lo23;)V", "Ll23;", ResultType.RESULT_TYPE_FAILURE, "finishWithFailure", "(Ll23;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "Lrar;", "binding", "Lrar;", "Lu7w;", "intentArgsParser$delegate", "Li3y;", "getIntentArgsParser", "()Lu7w;", "intentArgsParser", "flows-applink-payment_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ApplinkPaymentActivity extends AppCompatActivity implements irw {
    private rar binding;

    /* renamed from: intentArgsParser$delegate, reason: from kotlin metadata */
    private final i3y intentArgsParser = a.a(new ly1(26));

    private final void finishWithFailure(l23 failure) {
        Intent intent = new Intent();
        intent.putExtra("result_key", say.a(new YPayResult.Failure(failure.a().getMessage(), null)));
        setResult(1, intent);
        finish();
    }

    private final u7w getIntentArgsParser() {
        return (u7w) this.intentArgsParser.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u7w intentArgsParser_delegate$lambda$0() {
        return new u7w();
    }

    private final void showFragment(o23 parseResult) {
        Fragment a;
        if (parseResult instanceof m23) {
            k23 k23Var = ApplinkPaymentFragment.Companion;
            IntentArgs a2 = ((m23) parseResult).a();
            k23Var.getClass();
            a = k23.a(a2);
        } else {
            if (!(parseResult instanceof ApplinkPaymentParseResult$RedirectHost)) {
                if (parseResult instanceof l23) {
                    finishWithFailure((l23) parseResult);
                    return;
                } else {
                    w511.b();
                    return;
                }
            }
            RedirectHostFragment.Companion.getClass();
            a = ili0.a((ApplinkPaymentParseResult$RedirectHost) parseResult);
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a h = g8e.h(supportFragmentManager, supportFragmentManager);
        h.h(xgh0.finsdkContainer, a, null);
        h.r(a);
        h.d();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        (Build.VERSION.SDK_INT >= 31 ? new jrt0(this) : new krt0(this)).a();
        super.onCreate(savedInstanceState);
        jl40.L(getWindow(), false);
        rar p = rar.p(getLayoutInflater());
        this.binding = p;
        setContentView(p.o());
        if (savedInstanceState == null) {
            showFragment(getIntentArgsParser().a(getIntent()));
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        showFragment(getIntentArgsParser().a(intent));
    }

    @Override // defpackage.irw
    public abstract /* synthetic */ hrw provideInternalDependencies();
}
