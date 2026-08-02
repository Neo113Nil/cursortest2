package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes.dex */
public final class omr implements iau {
    public final HashSet a;

    /* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
    public static final class a {
        public final HashSet a = new HashSet();

        @NonNull
        public final void a(@NonNull DataType dataType) {
            String str = dataType.d;
            if (str != null) {
                this.a.add(new Scope(str));
            }
        }
    }

    @Override // xsna.iau
    @NonNull
    public final ArrayList a() {
        return new ArrayList(this.a);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof omr) {
            return this.a.equals(((omr) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}
