package androidx.transition;

import android.view.View;
import defpackage.oyr;
import java.util.ArrayList;
import java.util.HashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public class TransitionValues {
    public View b;
    public final HashMap a = new HashMap();
    public final ArrayList c = new ArrayList();

    public TransitionValues(View view) {
        this.b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TransitionValues)) {
            return false;
        }
        TransitionValues transitionValues = (TransitionValues) obj;
        return this.b == transitionValues.b && this.a.equals(transitionValues.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder v = oyr.v("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        v.append(this.b);
        v.append("\n");
        String concat = v.toString().concat("    values:");
        HashMap hashMap = this.a;
        for (String str : hashMap.keySet()) {
            concat = concat + Extension.TAB_CHAR + str + Extension.COLON_SPACE + hashMap.get(str) + "\n";
        }
        return concat;
    }

    @Deprecated
    public TransitionValues() {
    }
}
