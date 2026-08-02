package xsna;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Toast;
import com.vk.im.ui.components.common.LinkAction;
import com.vkontakte.android.R;
import xsna.cwb0;

/* compiled from: PhoneSpan.kt */
/* loaded from: classes4.dex */
public final class s3a0 extends qjc {
    public final String i;
    public final String j;
    public final fy2 k;

    /* compiled from: PhoneSpan.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LinkAction.values().length];
            try {
                iArr[LinkAction.CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LinkAction.COPY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public s3a0(String str) {
        super(str, null);
        this.i = str;
        this.j = go9.b("tel:", str);
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
            bzb0Var.b(new cwb0.i0(e43.l(LinkAction.CALL, LinkAction.COPY)), new ue40(4, context, this), null);
        }
    }

    @Override // xsna.rku0
    public final void f(Context context, View view) {
        if (jjc.b() || context == null) {
            return;
        }
        Uri parse = Uri.parse(this.j);
        if (epx.f(parse.getScheme(), "tel")) {
            Intent intent = new Intent("android.intent.action.DIAL", parse);
            if (!context.getPackageManager().hasSystemFeature("android.hardware.telephony") || intent.resolveActivity(context.getPackageManager()) == null) {
                Toast.makeText(context, R.string.tel_link_cant_be_opened, 0).show();
            } else {
                context.startActivity(intent);
            }
        }
    }
}
