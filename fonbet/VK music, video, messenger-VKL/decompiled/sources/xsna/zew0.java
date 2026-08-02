package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vkontakte.android.R;
import ru.ok.android.commons.http.Http;
import xsna.e3m;

/* compiled from: VoipBottomSheetDialog.kt */
/* loaded from: classes7.dex */
public final class zew0 extends smu0 {
    public static final a k1 = new a();
    public gzs<s3q0> j1;

    /* compiled from: VoipBottomSheetDialog.kt */
    public static final class a {
        public static b a(long j) {
            return j == 0 ? new b.a(R.string.ok) : new b.g(j);
        }

        public static zew0 b(a aVar, Context context, int i, int i2, String str, String str2, String str3, b bVar, c cVar, boolean z, int i3) {
            if ((i3 & 4) != 0) {
                i2 = -1;
            }
            if ((i3 & 16) != 0) {
                str2 = null;
            }
            if ((i3 & 32) != 0) {
                str3 = null;
            }
            if ((i3 & 128) != 0) {
                cVar = null;
            }
            if ((i3 & 256) != 0) {
                z = true;
            }
            aVar.getClass();
            Bundle bundle = new Bundle();
            bundle.putInt("arg_icon", i);
            bundle.putInt("arg_icon_color", i2);
            bundle.putString("arg_title", str);
            bundle.putString("arg_subtitle", str2);
            bundle.putString("arg_subtitle_html", str3);
            b.f fVar = bVar instanceof b.f ? (b.f) bVar : null;
            bundle.putString("arg_code", fVar != null ? fVar.b : null);
            bundle.putString("action_button_text", context.getString(bVar.a));
            if (cVar != null) {
                bundle.putString("dismiss_button_text", context.getString(cVar.a));
            }
            bundle.putBoolean("arg_dark_theme", z);
            zew0 zew0Var = new zew0();
            zew0Var.setArguments(bundle);
            zew0Var.f1 = new yew0(bVar, context, zew0Var);
            return zew0Var;
        }

        public final zew0 c(long j, Context context) {
            return b(this, context, R.drawable.vk_icon_phone_down_outline_56, R.attr.vk_ui_icon_secondary, context.getString(R.string.voip_error_not_available_title_general), context.getString(R.string.voip_error_not_available_subtitle_general), null, a(j), null, false, Http.StatusCode.RANGE_NOT_SATISFIABLE);
        }
    }

    /* compiled from: VoipBottomSheetDialog.kt */
    public static abstract class b {
        public final int a;

        /* compiled from: VoipBottomSheetDialog.kt */
        public static final class a extends b {
        }

        /* compiled from: VoipBottomSheetDialog.kt */
        /* renamed from: xsna.zew0$b$b, reason: collision with other inner class name */
        public static final class C4176b extends b {
            public static final C4176b b = new C4176b(R.string.voip_enable_your_camera_to_choose_virtual_background_button);
        }

        /* compiled from: VoipBottomSheetDialog.kt */
        public static final class c extends b {
        }

        /* compiled from: VoipBottomSheetDialog.kt */
        public static final class d extends b {
            public final CallMemberId b;

            public d(CallMemberId callMemberId) {
                super(R.string.voip_grant_admin_to_dialog_positive_button);
                this.b = callMemberId;
            }
        }

        /* compiled from: VoipBottomSheetDialog.kt */
        public static final class e extends b {
        }

        /* compiled from: VoipBottomSheetDialog.kt */
        public static final class f extends b {
            public final String b;

            public f(String str) {
                super(R.string.voip_understood);
                this.b = str;
            }
        }

        /* compiled from: VoipBottomSheetDialog.kt */
        public static final class g extends b {
            public final long b;

            public g(long j) {
                super(R.string.voip_write_message);
                this.b = j;
            }
        }

        public b(int i) {
            this.a = i;
        }
    }

    /* compiled from: VoipBottomSheetDialog.kt */
    public static final class c {
        public final int a;

        public c(int i) {
            this.a = i;
        }
    }

    @Override // xsna.smu0
    public final View Zn(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        View inflate = layoutInflater.inflate(R.layout.voip_bottom_sheet, (ViewGroup) frameLayout, false);
        ((TextView) inflate.findViewById(R.id.tv_title)).setText(io().getString("arg_title"));
        TextView textView = (TextView) inflate.findViewById(R.id.tv_subtitle);
        String string = io().getString("arg_subtitle");
        String string2 = io().getString("arg_subtitle_html");
        if (string2 != null && string2.length() != 0) {
            CharSequence fromHtml = Html.fromHtml(string2, 0);
            while (drm0.F(fromHtml, "\n")) {
                fromHtml = drm0.F(fromHtml, "\n") ? fromHtml.subSequence(0, fromHtml.length() - "\n".length()) : fromHtml.subSequence(0, fromHtml.length());
            }
            textView.setText(fromHtml);
        } else if (string == null || string.length() == 0) {
            f4m.j(textView);
        } else {
            textView.setText(string);
        }
        ImageView imageView = (ImageView) inflate.findViewById(R.id.iv_icon);
        int i = io().getInt("arg_icon");
        int i2 = io().getInt("arg_icon_color", -1);
        if (i2 != -1) {
            Context requireContext = requireContext();
            e3m.a aVar = e3m.a;
            Drawable a2 = m33.a(i, requireContext);
            if (a2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            a2.setTint(e3m.f(i2, requireContext()));
            imageView.setImageDrawable(a2);
        } else {
            imageView.setImageResource(i);
        }
        TextView textView2 = (TextView) inflate.findViewById(R.id.tv_sas_code);
        String string3 = io().getString("arg_code");
        if (string3 == null) {
            bwt0.p0(textView2, false);
            return inflate;
        }
        bwt0.p0(textView2, true);
        textView2.setText(string3);
        return inflate;
    }

    @Override // xsna.smu0
    public final String ao() {
        return io().getString("action_button_text", "");
    }

    @Override // xsna.smu0
    public final String co() {
        return io().getString("dismiss_button_text", "");
    }

    @Override // xsna.smu0
    public final boolean fo() {
        return io().containsKey("dismiss_button_text");
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: getContext */
    public final Context mo2getContext() {
        Context mo2getContext = super.mo2getContext();
        if (mo2getContext == null) {
            return null;
        }
        if (!io().getBoolean("arg_dark_theme")) {
            return mo2getContext;
        }
        dhr0.a.getClass();
        return new l7s(mo2getContext, dhr0.u().c);
    }

    public final Bundle io() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // xsna.smu0, xsna.dw20, androidx.fragment.app.d, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        gzs<s3q0> gzsVar = this.j1;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }
}
