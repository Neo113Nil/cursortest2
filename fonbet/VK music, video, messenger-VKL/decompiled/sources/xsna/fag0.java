package xsna;

import java.util.Objects;
import java.util.function.BiConsumer;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class fag0 implements BiConsumer {
    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        i94 i94Var = (i94) obj;
        boolean z = false;
        if (!i94Var.getKey().isEmpty()) {
            String key = i94Var.getKey();
            if (key.length() <= 255) {
                int i = 0;
                while (true) {
                    if (i >= key.length()) {
                        z = true;
                        break;
                    }
                    char charAt = key.charAt(i);
                    if (charAt < ' ' || charAt > '~') {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        myc0.c("Attribute key should be a ASCII string with a length greater than 0 and not exceed 255 characters.", z);
        Objects.requireNonNull(obj2, "Attribute value should be a ASCII string with a length not exceed 255 characters.");
    }
}
