package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.eeu0;
import xsna.h7u0;

/* compiled from: CopyrightPostingController.kt */
/* loaded from: classes4.dex */
public final class ptj {
    public final qtj a;
    public androidx.appcompat.app.d c;
    public TextView d;
    public final io.reactivex.rxjava3.disposables.b b = new io.reactivex.rxjava3.disposables.b();
    public final b e = new b();
    public final a f = new a();

    /* compiled from: CopyrightPostingController.kt */
    public static final class a implements wzs<DialogInterface, CharSequence, s3q0> {
        public a() {
        }

        @Override // xsna.wzs
        public final s3q0 invoke(DialogInterface dialogInterface, CharSequence charSequence) {
            Context context;
            String obj = charSequence.toString();
            io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(new qn(obj), null, null, 3);
            ptj ptjVar = ptj.this;
            TextView textView = ptjVar.d;
            if (textView != null && (context = textView.getContext()) != null) {
                ptjVar.b.b(hg1.m(y0, context, 0L, false, 62).subscribe(new ji3(new com.vk.movika.sdk.base.logic.processor.d(7, obj, (Object) ptjVar), 20), new np3(new n6f(ptjVar, 8), 14)));
            }
            return s3q0.a;
        }
    }

    public ptj(qtj qtjVar) {
        this.a = qtjVar;
    }

    public final void a(Context context, String str) {
        int i = (str == null || str.length() == 0) ? R.string.add : R.string.posting_settings_source_save;
        int i2 = (str == null || str.length() == 0) ? R.string.posting_settings_source_adding : R.string.posting_settings_source_changing;
        int i3 = h7u0.p;
        h7u0.a a2 = h7u0.b.a(context);
        eeu0.a.C2801a c2801a = new eeu0.a.C2801a(a2);
        c2801a.f(i2);
        c2801a.d = a2.getContext().getString(R.string.posting_settings_source_adding_subtitle);
        c2801a.s = new e3(8, this, str);
        if (str == null) {
            str = "";
        }
        c2801a.g = str;
        c2801a.c(i, this.f, false);
        this.c = c2801a.g();
    }

    /* compiled from: CopyrightPostingController.kt */
    public static final class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            String str;
            TextView textView = ptj.this.d;
            if (textView != null) {
                if (charSequence == null || (str = charSequence.toString()) == null) {
                    str = "";
                }
                textView.setEnabled(str.length() > 0);
            }
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
