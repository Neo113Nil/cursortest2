package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.vk.auth.verification.base.states.CodeState;
import com.vk.auth.verification.libverify.mobile.id.MobileIdScreenType;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: MobileIdController.kt */
/* loaded from: classes15.dex */
public final class ut20 {
    public final ViewStub a;
    public View b;
    public boolean c;
    public final bpn0 d = new bpn0(new com.vk.movika.sdk.base.ui.v(23));

    /* compiled from: MobileIdController.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MobileIdScreenType.values().length];
            try {
                iArr[MobileIdScreenType.AUTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MobileIdScreenType.SIGN_UP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ut20(ViewStub viewStub) {
        this.a = viewStub;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.CharSequence] */
    public final void a(MobileIdScreenType mobileIdScreenType) {
        View view;
        int i;
        String str;
        if (!this.c) {
            this.c = true;
            this.b = this.a.inflate();
        }
        if (mobileIdScreenType != null && (view = this.b) != null) {
            TextView textView = (TextView) view.findViewById(R.id.mobile_id_text_view);
            Context context = view.getContext();
            int i2 = a.$EnumSwitchMapping$0[mobileIdScreenType.ordinal()];
            if (i2 == 1) {
                i = R.string.vk_auth_libverify_mobile_id_loader_title_auth;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R.string.vk_auth_libverify_mobile_id_loader_title_sign_up;
            }
            String string = context.getString(i);
            pou0 pou0Var = (pou0) this.d.getValue();
            if (pou0Var != null) {
                textView.getContext();
                new CodeState.LibverifyMobileId(mobileIdScreenType);
                str = pou0Var.g();
            } else {
                str = null;
            }
            if (str != null) {
                string = str;
            }
            textView.setText(string);
        }
        View view2 = this.b;
        if (view2 != null) {
            view2.setVisibility(0);
        }
    }
}
