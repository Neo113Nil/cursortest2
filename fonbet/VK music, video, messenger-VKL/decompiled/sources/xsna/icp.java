package xsna;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.vk.im.ui.components.common.LinkAction;
import com.vkontakte.android.R;
import xsna.cwb0;

/* compiled from: EmailSpan.kt */
/* loaded from: classes4.dex */
public final class icp extends qjc {
    public final String i;
    public final String j;
    public final fy2 k;

    /* compiled from: EmailSpan.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LinkAction.values().length];
            try {
                iArr[LinkAction.EMAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LinkAction.COPY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public icp(String str) {
        super(str, null);
        this.i = str;
        this.j = go9.b("mailto:", str);
        this.k = new fy2();
    }

    @Override // xsna.rku0
    public final void a(Context context, View view) {
        if (context != null) {
            fy2 fy2Var = this.k;
            bzb0 bzb0Var = (bzb0) fy2Var.b;
            if (bzb0Var == null) {
                bzb0Var = new bzb0(context);
                fy2Var.b = bzb0Var;
            }
            bzb0Var.b(new cwb0.i0(e43.l(LinkAction.EMAIL, LinkAction.COPY)), new az2(11, context, this), null);
        }
    }

    @Override // xsna.rku0
    public final void f(Context context, View view) {
        if (jjc.b()) {
            return;
        }
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse(this.j));
        if (context != null) {
            context.startActivity(Intent.createChooser(intent, context.getString(R.string.send_email)));
        }
    }
}
