package xsna;

import android.util.LongSparseArray;
import com.vk.dto.user.UserProfile;
import org.json.JSONObject;
import xsna.ii7;

/* compiled from: BoardTopics.kt */
/* loaded from: classes18.dex */
public final class ej7 extends aay<ii7> {
    public final /* synthetic */ zj a;
    public final /* synthetic */ ak b;
    public final /* synthetic */ CharSequence c;
    public final /* synthetic */ LongSparseArray<UserProfile> d;

    public ej7(zj zjVar, ak akVar, CharSequence charSequence, LongSparseArray longSparseArray) {
        this.a = zjVar;
        this.b = akVar;
        this.c = charSequence;
        this.d = longSparseArray;
    }

    @Override // xsna.aay
    public final ii7 a(JSONObject jSONObject) {
        ii7 a = ii7.a.a(jSONObject, this.a, this.b, this.c);
        long j = jSONObject.getLong("updated_by");
        LongSparseArray<UserProfile> longSparseArray = this.d;
        UserProfile userProfile = longSparseArray.get(j);
        a.j = userProfile;
        if (userProfile == null) {
            a.j = longSparseArray.get(jSONObject.optLong("created_by"));
        }
        return a;
    }
}
