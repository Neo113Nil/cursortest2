package xsna;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.eeu0;
import xsna.h7u0;

/* compiled from: DelegateDebug.kt */
@ozl
/* loaded from: classes2.dex */
public final class ntl {
    public final Context a;

    /* compiled from: DelegateDebug.kt */
    public static final class a {
        public final String a;
        public final String b;
        public final Integer c;
        public final int d;
        public final String e;

        public a(int i, String str, Integer num, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = num;
            this.d = i;
            this.e = str3;
        }
    }

    public ntl(Context context) {
        this.a = context;
    }

    public final void a(a aVar, izs<? super String, s3q0> izsVar) {
        eeu0.a.C2801a c2801a = new eeu0.a.C2801a(new h7u0.a(this.a));
        c2801a.b = aVar.e;
        c2801a.h = aVar.a;
        c2801a.s = new w5h(aVar, 1);
        c2801a.c(R.string.vkim_accept, new yd4(izsVar, 3), true);
        c2801a.g();
    }

    /* compiled from: DelegateDebug.kt */
    public static final class b implements TextWatcher {
        public final /* synthetic */ TextView b;

        public b(TextView textView) {
            this.b = textView;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            String obj = editable != null ? editable.toString() : null;
            this.b.setEnabled(!(obj == null || obj.length() == 0));
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
