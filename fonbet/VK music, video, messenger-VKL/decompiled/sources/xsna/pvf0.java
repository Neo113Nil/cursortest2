package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.mlkit_common.zzaa;
import com.google.mlkit.common.sdkinternal.model.BaseModel;
import java.util.Arrays;
import java.util.EnumMap;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes13.dex */
public abstract class pvf0 {

    @NonNull
    public static final EnumMap a;

    static {
        new EnumMap(BaseModel.class);
        a = new EnumMap(BaseModel.class);
    }

    @NonNull
    public static String a() {
        return "COM.GOOGLE.BASE_".concat(String.valueOf((String) a.get(null)));
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pvf0)) {
            return false;
        }
        ((pvf0) obj).getClass();
        return dq70.b(null, null) && dq70.b(null, null) && dq70.b(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, null, null});
    }

    @NonNull
    public final String toString() {
        com.google.android.gms.internal.mlkit_common.zzz zzb = zzaa.zzb("RemoteModel");
        zzb.zza("modelName", null);
        zzb.zza("baseModel", null);
        zzb.zza("modelType", null);
        return zzb.toString();
    }
}
