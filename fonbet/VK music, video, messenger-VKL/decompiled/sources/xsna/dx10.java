package xsna;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: MediaRouteProviderDescriptor.java */
/* loaded from: classes12.dex */
public final class dx10 {
    public final List<vw10> a;
    public final boolean b;

    public dx10(@NonNull ArrayList arrayList, boolean z) {
        if (arrayList.isEmpty()) {
            this.a = Collections.EMPTY_LIST;
        } else {
            this.a = Collections.unmodifiableList(new ArrayList(arrayList));
        }
        this.b = z;
    }

    @Nullable
    public static dx10 a(@Nullable Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        if (parcelableArrayList != null) {
            for (int i = 0; i < parcelableArrayList.size(); i++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i);
                arrayList.add(bundle2 != null ? new vw10(bundle2) : null);
            }
        }
        return new dx10(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaRouteProviderDescriptor{ routes=");
        List<vw10> list = this.a;
        sb.append(Arrays.toString(list.toArray()));
        sb.append(", isValid=");
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < size) {
                vw10 vw10Var = list.get(i);
                if (vw10Var == null || !vw10Var.e()) {
                    break;
                }
                i++;
            } else {
                z = true;
                break;
            }
        }
        return n23.b(sb, z, " }");
    }
}
