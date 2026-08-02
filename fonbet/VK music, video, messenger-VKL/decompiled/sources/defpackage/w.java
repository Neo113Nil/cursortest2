package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.compose.ui.node.o;
import com.vk.catalog2.common.dto.ui.UIBlockSearchAuthor;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchAuthorCellVh;
import com.vk.common.links.LaunchContext;
import com.vk.superapp.base.js.bridge.VkUiView;
import com.vk.superapp.common.js.bridge.impl.data.ShareType;
import xsna.cxo;
import xsna.ed8;
import xsna.gzs;
import xsna.izs;
import xsna.k6t;
import xsna.l6t;
import xsna.lc8;
import xsna.lgj;
import xsna.m6t;
import xsna.maz;
import xsna.mgj;
import xsna.o9t;
import xsna.q9x;
import xsna.s3q0;
import xsna.x1n0;
import xsna.xwv0;
import xsna.xzw;
import xsna.zhf0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class w implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ w(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        VkUiView view;
        switch (this.b) {
            case 0:
                l0 l0Var = (l0) this.c;
                String str = (String) this.d;
                String str2 = (String) this.e;
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", str2);
                xwv0 xwv0Var = l0Var.d;
                if (xwv0Var != null && (view = xwv0Var.getView()) != null) {
                    view.J3(intent, 268435456);
                }
                x1n0.b(l0Var.L0(), ShareType.NATIVE.h(), str);
                break;
            case 1:
                ed8 ed8Var = (ed8) this.c;
                zhf0 i2 = ed8.i2(ed8Var, (o) this.d, (lc8) this.e);
                if (i2 != null) {
                    lgj lgjVar = ed8Var.p;
                    if (q9x.b(lgjVar.w, mgj.a)) {
                        xzw.c("Expected BringIntoViewRequester to not be used before parents are placed.");
                    }
                    break;
                }
                break;
            case 2:
                ((izs) this.c).invoke(new o9t.m(m6t.a((l6t) this.d, ((k6t) this.e).c)));
                break;
            case 3:
                ((SearchAuthorCellVh) this.c).k.c((Context) this.d, (UIBlockSearchAuthor) this.e, true);
                break;
            default:
                maz.c(((cxo) this.c).a.b(), (Context) this.e, (String) this.d, LaunchContext.A, null, null, 24);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ w(cxo cxoVar, Context context, String str) {
        this.b = 4;
        this.c = cxoVar;
        this.e = context;
        this.d = str;
    }
}
