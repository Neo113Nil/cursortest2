package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class ov10 {
    public final TextView a;
    public final View b;
    public final TextView c;
    public final ImageView d;
    public final ImageView e;

    public ov10(TextView textView, View view, TextView textView2, ImageView imageView, ImageView imageView2) {
        this.a = textView;
        this.b = view;
        this.c = textView2;
        this.d = imageView;
        this.e = imageView2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ov10)) {
            return false;
        }
        ov10 ov10Var = (ov10) obj;
        return this.a.equals(ov10Var.a) && this.b.equals(ov10Var.b) && this.c.equals(ov10Var.c) && this.d.equals(ov10Var.d) && this.e.equals(ov10Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ViewHolder(replyAuthor=" + this.a + ", replyLine=" + this.b + ", replyText=" + this.c + ", replyImage=" + this.d + ", replyQuoteIcon=" + this.e + Extension.C_BRAKE;
    }
}
