package xsna;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.Arrays;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class ymx0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ gzs d;

    public /* synthetic */ ymx0(Object obj, gzs gzsVar, int i) {
        this.b = i;
        this.c = obj;
        this.d = gzsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Uri a;
        switch (this.b) {
            case 0:
                zmx0 zmx0Var = (zmx0) this.c;
                dv2 dv2Var = (dv2) this.d;
                j0w j0wVar = (j0w) obj;
                Context context = zmx0Var.a;
                String str = "im-dialog-" + j0wVar.a;
                if (j0wVar.e != null) {
                    fhj0 fhj0Var = fhj0.a;
                    a = Uri.parse(String.format("vk://%s/mail?community=%s&peer=%s", Arrays.copyOf(new Object[]{a0a.d, Long.valueOf(j0wVar.e.d), Long.valueOf(j0wVar.a)}, 3)));
                } else {
                    fhj0 fhj0Var2 = fhj0.a;
                    a = fhj0.a(j0wVar.a, a0a.d);
                }
                Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, a);
                intent.setPackage(context.getPackageName());
                intent.putExtra("com.vk.EXTRA_REDIRECTED", true);
                intent.addFlags(268435456);
                zgj0 zgj0Var = new zgj0();
                zgj0Var.a = context;
                zgj0Var.b = str;
                String str2 = j0wVar.b;
                zgj0Var.e = str2;
                zgj0Var.f = str2;
                PersistableBundle persistableBundle = new PersistableBundle();
                persistableBundle.putLong("creator_user_id", j0wVar.d);
                zgj0Var.n = persistableBundle;
                zgj0Var.h = IconCompat.c(j0wVar.c);
                zgj0Var.c = new Intent[]{intent};
                if (TextUtils.isEmpty(zgj0Var.e)) {
                    throw new IllegalArgumentException("Shortcut must have a non-empty label");
                }
                Intent[] intentArr = zgj0Var.c;
                if (intentArr == null || intentArr.length == 0) {
                    throw new IllegalArgumentException("Shortcut must have an intent");
                }
                bhj0.l(context, zgj0Var, null);
                dv2Var.invoke();
                return s3q0.a;
            default:
                gvw0 gvw0Var = (gvw0) this.c;
                qbc0 qbc0Var = (qbc0) this.d;
                gvw0Var.h = false;
                qbc0Var.invoke();
                return s3q0.a;
        }
    }
}
