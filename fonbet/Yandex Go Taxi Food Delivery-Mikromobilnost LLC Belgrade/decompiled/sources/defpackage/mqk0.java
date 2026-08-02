package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.yandex.go.taxi.order.details.v1.ui.DetailsCardListItem;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class mqk0 extends oqk0 {
    public final CharSequence a;
    public final DetailsCardListItem.a b;
    public final Drawable c;
    public final ibk0 d;

    public mqk0(CharSequence charSequence, DetailsCardListItem.a aVar, BitmapDrawable bitmapDrawable, ibk0 ibk0Var) {
        this.a = charSequence;
        this.b = aVar;
        this.c = bitmapDrawable;
        this.d = ibk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mqk0)) {
            return false;
        }
        mqk0 mqk0Var = (mqk0) obj;
        return jl40.l(this.a, mqk0Var.a) && jl40.l(this.b, mqk0Var.b) && jl40.l(this.c, mqk0Var.c) && jl40.l(this.d, mqk0Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Drawable drawable = this.c;
        return this.d.hashCode() + ((hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31);
    }

    public final String toString() {
        return "Content(title=" + ((Object) this.a) + ", style=" + this.b + ", icon=" + this.c + ", action=" + this.d + Extension.C_BRAKE;
    }
}
