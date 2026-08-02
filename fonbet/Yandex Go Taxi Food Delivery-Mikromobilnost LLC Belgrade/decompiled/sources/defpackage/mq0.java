package defpackage;

import android.text.BidiFormatter;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.design.AddressAutofitHelper$ExtraSuffixType;
import ru.yandex.taxi.design.AddressInputComponent;
import ru.yandex.taxi.widget.b;

/* loaded from: classes6.dex */
public final class mq0 {
    public final b a;
    public final AddressInputComponent b;
    public final lq0 c;
    public sls d;
    public String e;
    public boolean f;
    public String g;
    public String h;
    public int i;
    public String j;
    public String k;
    public String l;

    public mq0(b bVar, AddressInputComponent addressInputComponent) {
        this.a = bVar;
        this.b = addressInputComponent;
        lq0 lq0Var = new lq0(this);
        this.c = lq0Var;
        this.d = new pn0(2);
        if (bVar.k == null) {
            bVar.k = new ArrayList();
        }
        ArrayList arrayList = bVar.k;
        if (arrayList != null) {
            arrayList.add(lq0Var);
        }
    }

    public final CharSequence a(boolean z) {
        String str = this.h;
        if (str == null || str.length() == 0) {
            return "";
        }
        kq0 kq0Var = (kq0) this.d.invoke();
        CharSequence charSequence = kq0Var.a;
        AddressAutofitHelper$ExtraSuffixType addressAutofitHelper$ExtraSuffixType = kq0Var.b;
        String str2 = this.k;
        if (str2 != null) {
            charSequence = str2;
        }
        if (charSequence.length() == 0) {
            return str;
        }
        String str3 = z ? addressAutofitHelper$ExtraSuffixType == AddressAutofitHelper$ExtraSuffixType.BUBBLE ? "  " : " • " : "\n";
        BidiFormatter bidiFormatter = BidiFormatter.getInstance();
        int i = xng0.textMinor;
        AddressInputComponent addressInputComponent = this.b;
        int t = qje.t(i, addressInputComponent.getContext());
        float f = addressAutofitHelper$ExtraSuffixType == AddressAutofitHelper$ExtraSuffixType.BUBBLE ? 1.0f : 0.824f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (xw31.n(addressInputComponent.getContext())) {
            spannableStringBuilder.append(charSequence).append((CharSequence) str3);
            return new SpannableStringBuilder(qeb1.f(spannableStringBuilder, t, f)).append((CharSequence) bidiFormatter.unicodeWrap(str));
        }
        spannableStringBuilder.append((CharSequence) str3).append(charSequence);
        return new SpannableStringBuilder(bidiFormatter.unicodeWrap(str)).append((CharSequence) qeb1.f(spannableStringBuilder, t, f));
    }

    public final void b() {
        int i = this.i;
        AddressInputComponent addressInputComponent = this.b;
        if (i == 0) {
            addressInputComponent.setAddress("");
            c("");
        } else {
            this.f = true;
            c(this.j);
            addressInputComponent.setAddress(a(true));
        }
    }

    public final void c(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder();
        String str = this.g;
        if (str != null && str.length() != 0) {
            charSequence = str + Extension.FIX_SPACE + ((Object) charSequence);
        }
        sb.append(charSequence);
        CharSequence charSequence2 = ((kq0) this.d.invoke()).a;
        if (charSequence2.length() > 0) {
            sb.append(" ");
            sb.append(this.e + Extension.FIX_SPACE + ((Object) charSequence2));
        }
        this.b.setContentDescription(sb.toString());
    }
}
