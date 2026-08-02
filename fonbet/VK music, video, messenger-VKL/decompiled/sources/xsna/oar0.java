package xsna;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.vk.imageloader.view.VKCircleImageView;
import com.vkontakte.android.R;
import xsna.smu0;

/* compiled from: VKBottomSheetDialog.kt */
/* loaded from: classes17.dex */
public class oar0 extends smu0 {

    /* compiled from: VKBottomSheetDialog.kt */
    public static final class b {
        public final String a;
        public final jb8 b;

        public b(String str, jb8 jb8Var) {
            this.a = str;
            this.b = jb8Var;
        }
    }

    @Override // xsna.smu0
    public final View Zn(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        View inflate = layoutInflater.inflate(R.layout.bottom_sheet_dialog_content, (ViewGroup) frameLayout, false);
        TextView textView = (TextView) inflate.findViewById(R.id.title);
        VKCircleImageView vKCircleImageView = (VKCircleImageView) inflate.findViewById(R.id.photo);
        TextView textView2 = (TextView) inflate.findViewById(R.id.subtitle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (arguments.containsKey("title_arg")) {
                textView.setText(arguments.getString("title_arg"));
            } else {
                textView.setVisibility(8);
            }
            if (arguments.containsKey("subtitle_arg")) {
                textView2.setText(arguments.getString("subtitle_arg"));
            } else {
                textView2.setVisibility(8);
            }
            if (!arguments.containsKey("image_res_arg") && !arguments.containsKey("image_url_arg")) {
                vKCircleImageView.setVisibility(8);
            }
            if (arguments.containsKey("image_res_arg")) {
                Drawable d = enj.d(arguments.getInt("image_res_arg"), R.color.vk_blue_300, requireContext());
                vKCircleImageView.setImageDrawable(d);
                ViewGroup.LayoutParams layoutParams = vKCircleImageView.getLayoutParams();
                layoutParams.height = d.getIntrinsicHeight();
                layoutParams.width = d.getIntrinsicWidth();
            }
            if (arguments.containsKey("image_url_arg")) {
                vKCircleImageView.o0(arguments.getString("image_url_arg"), null);
            }
        }
        return inflate;
    }

    @Override // xsna.smu0
    public final String ao() {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("confirm") : null;
        return string == null ? requireContext().getString(R.string.confirm) : string;
    }

    @Override // xsna.smu0
    public final boolean fo() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getBoolean("cancel_button", false);
        }
        return false;
    }

    @Override // xsna.dw20, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        dismiss();
    }

    @Override // xsna.dw20, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        try {
            Dialog dialog = this.s;
            (dialog != null ? dialog.getWindow() : null).getDecorView().setSystemUiVisibility(3332);
        } catch (Exception unused) {
        }
    }

    /* compiled from: VKBottomSheetDialog.kt */
    public static final class a {
        public String a;
        public String b;
        public Integer c;
        public b d;
        public boolean e;

        public final void a(Context context) {
            Bundle bundle = new Bundle();
            String str = this.a;
            if (str != null) {
                bundle.putString("title_arg", str);
            }
            String str2 = this.b;
            if (str2 != null) {
                bundle.putString("subtitle_arg", str2);
            }
            Integer num = this.c;
            if (num != null) {
                bundle.putInt("image_res_arg", num.intValue());
            }
            b bVar = this.d;
            if (bVar != null) {
                bundle.putString("confirm", bVar.a);
            }
            bundle.putBoolean("cancel_button", this.e);
            oar0 oar0Var = new oar0();
            oar0Var.setArguments(bundle);
            oar0Var.f1 = new C3446a();
            oar0Var.Td(((FragmentActivity) e3m.h(context)).getSupportFragmentManager(), oar0Var.getTag());
        }

        public final void b(b bVar) {
            this.d = bVar;
        }

        public final void c() {
            this.c = Integer.valueOf(R.drawable.vk_icon_download_square_outline_56);
        }

        public final void d() {
            this.e = true;
        }

        public final void e(String str) {
            this.b = str;
        }

        public final void f(String str) {
            this.a = str;
        }

        /* compiled from: VKBottomSheetDialog.kt */
        /* renamed from: xsna.oar0$a$a, reason: collision with other inner class name */
        public static final class C3446a implements smu0.a {
            public C3446a() {
            }

            @Override // xsna.smu0.a
            public final void a() {
                b bVar = a.this.d;
                if (bVar != null) {
                    bVar.b.invoke();
                }
            }

            @Override // xsna.smu0.a
            public final void b() {
            }

            @Override // xsna.smu0.a
            public final void onCancel() {
            }
        }
    }
}
