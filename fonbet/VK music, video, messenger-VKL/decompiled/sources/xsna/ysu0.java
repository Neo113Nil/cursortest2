package xsna;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.result.ActivityResult;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.auth.external.VkExternalAuthFragment;
import com.vk.auth.main.AuthActivity;
import java.io.Serializable;
import kotlin.Result;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.pgn0;

/* compiled from: VkExternalAuthRouter.kt */
/* loaded from: classes15.dex */
public final class ysu0 implements usu0 {
    public final VkExternalAuthFragment a;
    public final VkExternalAuthFragment.a b;
    public final hb0<Intent> c;

    /* compiled from: VkExternalAuthRouter.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Intent, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Intent intent) {
            ((hb0) this.receiver).a(intent);
            return s3q0.a;
        }
    }

    public ysu0(VkExternalAuthFragment vkExternalAuthFragment, VkExternalAuthFragment.a aVar) {
        this.a = vkExternalAuthFragment;
        this.b = aVar;
        this.c = vkExternalAuthFragment.registerForActivityResult(new cb0(), new ua0() { // from class: xsna.xsu0
            @Override // xsna.ua0
            public final void onActivityResult(Object obj) {
                ysu0.this.b.invoke(Boolean.valueOf(((ActivityResult) obj).b == -1));
            }
        });
    }

    @Override // xsna.usu0
    public final void a() {
        wdx0 wdx0Var = e370.f;
        if (wdx0Var == null) {
            wdx0Var = null;
        }
        a aVar = new a(1, this.c, hb0.class, "launch", "launch(Ljava/lang/Object;)V", 0);
        int i = pgn0.a.a;
        wdx0Var.getClass();
        Context mo2getContext = this.a.mo2getContext();
        r55.b();
        aVar.invoke(new Intent(mo2getContext, (Class<?>) AuthActivity.class));
    }

    @Override // xsna.usu0
    public final void b(Serializable serializable) {
        VkExternalAuthFragment vkExternalAuthFragment = this.a;
        if (vkExternalAuthFragment.isAdded()) {
            if (serializable instanceof Result.Failure) {
                serializable = null;
            }
            String str = (String) serializable;
            if (str != null) {
                try {
                    vkExternalAuthFragment.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL).setData(Uri.parse(str)).addFlags(268435456));
                } catch (ActivityNotFoundException e) {
                    par0.a.getClass();
                    par0.c("Activity to reopen the service cannot be resolved", e);
                }
            }
            vkExternalAuthFragment.kn().finishAndRemoveTask();
            return;
        }
        par0 par0Var = par0.a;
        String str2 = ysu0.class.getSimpleName() + ": fragment " + VkExternalAuthFragment.class.getSimpleName() + " isn't attached";
        par0Var.getClass();
        par0.b(str2);
    }
}
