package xsna;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import xsna.tca0;
import xsna.wcr0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class rca0 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rca0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                tca0 tca0Var = (tca0) this.c;
                Set set = (Set) this.d;
                tca0Var.b.onNext(new tca0.a.AbstractC3738a.b(set));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    tca0.d((qba0) it.next());
                }
                return;
            default:
                wcr0 wcr0Var = (wcr0) this.c;
                vni0 vni0Var = (vni0) this.d;
                zcr0 zcr0Var = wcr0Var.c;
                StringBuilder sb = new StringBuilder();
                sb.append(zcr0Var.a);
                sb.append('/');
                Uri c = rf3.c(vni0Var.c, sb);
                int i = wcr0.a.$EnumSwitchMapping$0[wcr0Var.f.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    wcr0Var.g(c);
                    return;
                }
                Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
                if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
                    Bundle bundle = new Bundle();
                    bundle.putBinder("android.support.customtabs.extra.SESSION", null);
                    intent.putExtras(bundle);
                }
                intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
                intent.putExtras(new Bundle());
                intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
                intent.setData(c);
                intent.addFlags(268435456);
                try {
                    wcr0Var.d.startActivity(intent);
                    return;
                } catch (Throwable th) {
                    wcr0Var.e.m("Can't open custom tabs.", th);
                    wcr0Var.g(c);
                    return;
                }
        }
    }
}
