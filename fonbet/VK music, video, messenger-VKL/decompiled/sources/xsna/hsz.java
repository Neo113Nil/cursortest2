package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import com.vk.superapp.qr.web2app.data.CheckSignInOpenArguments;
import java.util.ArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.a1c;
import xsna.ksz;
import xsna.osz;

/* compiled from: LoaderScreenFeature.kt */
@b6l(c = "com.vk.superapp.qr.web2app.loader.mvi.LoaderScreenFeature$setAuthCodeStatus$1", f = "LoaderScreenFeature.kt", l = {101}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class hsz extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ jsz this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hsz(jsz jszVar, spj<? super hsz> spjVar) {
        super(2, spjVar);
        this.this$0 = jszVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new hsz(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((hsz) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            int size = this.this$0.i.d().size();
            jsz jszVar = this.this$0;
            if (size >= jszVar.j) {
                jszVar.T(ksz.a.b);
                this.this$0.l.b(osz.b.a);
                return s3q0.a;
            }
            noe0 noe0Var = jszVar.g;
            String str = jszVar.f;
            this.label = 1;
            obj = noe0Var.d(str, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        CheckSignInOpenArguments checkSignInOpenArguments = (CheckSignInOpenArguments) obj;
        Context context = this.this$0.h.a;
        while (true) {
            z = context instanceof FragmentActivity;
            if (z || !(context instanceof ContextWrapper)) {
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        FragmentActivity fragmentActivity = (FragmentActivity) (z ? (Activity) context : null);
        if (fragmentActivity != null) {
            String str2 = checkSignInOpenArguments.b;
            com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
            SchemeStatSak$EventScreen schemeStatSak$EventScreen = SchemeStatSak$EventScreen.QR_CODE_CONFIRM_WAITING;
            ArrayList arrayList = new ArrayList();
            SchemeStatSak$RegistrationFieldItem.Name name = SchemeStatSak$RegistrationFieldItem.Name.QR_CODE_ID;
            bVar.getClass();
            arrayList.add(com.vk.registration.funnels.b.d(name, str2));
            com.vk.registration.funnels.b.z(bVar, schemeStatSak$EventScreen, arrayList, null, null, 28);
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            androidx.fragment.app.a b = tk5.b(supportFragmentManager, supportFragmentManager);
            Fragment H = fragmentActivity.getSupportFragmentManager().H("LoaderFragment");
            if (H != null) {
                b.q(H);
            }
            b.f(0, new a1c.a(checkSignInOpenArguments, fragmentActivity).a(), "CheckSignInBottomSheet", 1);
            b.k(false);
        }
        return s3q0.a;
    }
}
