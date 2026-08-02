package xsna;

import android.content.Context;
import android.webkit.WebView;
import com.ironsource.C4498pe;
import com.ironsource.C4584ub;
import com.unity3d.mediation.LevelPlayInitListener;
import com.vk.im.popup.Popup;
import com.vk.im.popup.b;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class dzb0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ dzb0(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                com.vk.im.popup.b bVar = (com.vk.im.popup.b) this.c;
                Popup.c cVar = (Popup.c) this.d;
                gzs gzsVar = (gzs) this.e;
                b.C1130b c1130b = bVar.c;
                Context context = bVar.a;
                int i = cVar.b;
                CharSequence charSequence = cVar.c;
                x750 x750Var = new x750(bVar, 11);
                if (i != 0) {
                    charSequence = context.getString(i);
                }
                com.vk.core.view.components.spinner.c cVar2 = new com.vk.core.view.components.spinner.c(context);
                cVar2.n(charSequence);
                cVar2.h.setOnCancelListener(new com.vk.core.view.components.spinner.b(new zyb0(0, gzsVar), cVar2));
                cVar2.setOnDismissListener(new vu20(x750Var, 1));
                c1130b.a();
                c1130b.c = cVar2;
                cVar2.show();
                break;
            case 1:
                ((WebView) this.c).loadUrl("javascript:" + ((String) this.d) + '(' + j5g.g0((ArrayList) this.e, StringUtils.COMMA, null, null, 0, null, 62) + ')');
                break;
            case 2:
                ((com.mbridge.msdk.config.dynamic.binddata.wrapper.b) this.c).a((String) this.d, this.e);
                break;
            case 3:
                yads.bu1.a((yads.bu1) this.c, (String) this.d, (Throwable) this.e);
                break;
            default:
                C4584ub.a((C4498pe) this.c, (LevelPlayInitListener) this.d, (C4498pe) this.e);
                break;
        }
    }
}
