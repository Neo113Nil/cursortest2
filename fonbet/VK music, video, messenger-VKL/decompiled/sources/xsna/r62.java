package xsna;

import android.net.Uri;
import com.vk.contacts.AndroidContact;

/* compiled from: AndroidContactGetByLookupUriCmd.kt */
/* loaded from: classes2.dex */
public final class r62 extends le6<it80<AndroidContact>> {
    public final Uri b;

    public r62(Uri uri) {
        this.b = uri;
    }

    @Override // xsna.le6
    public final it80<AndroidContact> e(w2w w2wVar) {
        AndroidContact Q0 = w2wVar.getConfig().l().Q0(this.b);
        it80.b.getClass();
        return new it80<>(Q0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r62) && epx.f(this.b, ((r62) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.e1w
    public final String toString() {
        return alb0.b(new StringBuilder("AndroidContactGetByLookupUriCmd(lookupUri="), this.b, ')');
    }
}
