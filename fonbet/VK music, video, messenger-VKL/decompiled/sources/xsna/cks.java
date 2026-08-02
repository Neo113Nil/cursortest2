package xsna;

import android.os.Parcel;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.vk.catalog2.common.dto.api.CatalogUserMeta;
import java.util.LinkedHashMap;

/* compiled from: FriendsAnalytics.kt */
/* loaded from: classes16.dex */
public final class cks implements ouf0 {
    public final Object b;
    public final Object c;

    public /* synthetic */ cks(fqz0 fqz0Var, ApiFeatureRequest apiFeatureRequest) {
        this.b = fqz0Var;
        this.c = apiFeatureRequest;
    }

    public void a(String str, String str2) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
        if (linkedHashMap.containsKey(str2)) {
            Object obj = linkedHashMap.get(str2);
            if (obj == null) {
                obj = 0;
            }
            int intValue = ((Number) obj).intValue() - 1;
            linkedHashMap.put(str2, Integer.valueOf(intValue));
            if (intValue <= 0) {
                linkedHashMap.remove(str2);
            }
        }
        ((w0a) this.b).a("hide_block", e43.l("blocks", pvo0.a() + "|friends|" + str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.ouf0
    public void accept(Object obj, Object obj2) {
        toz0 toz0Var = new toz0((fqz0) this.b, (TaskCompletionSource) obj2);
        doz0 doz0Var = (doz0) ((iqz0) obj).getService();
        ApiFeatureRequest apiFeatureRequest = (ApiFeatureRequest) this.c;
        Parcel zaa = doz0Var.zaa();
        com.google.android.gms.internal.base.zac.zac(zaa, toz0Var);
        com.google.android.gms.internal.base.zac.zab(zaa, apiFeatureRequest);
        doz0Var.zac(1, zaa);
    }

    public void b(CatalogUserMeta catalogUserMeta, String str) {
        if (str == null) {
            str = catalogUserMeta.l ? "friends_own" : "friends_search";
        }
        ((w0a) this.b).a("open_user", e43.l("user_ids", catalogUserMeta.c + '|' + pvo0.a() + '|' + str + '|' + catalogUserMeta.d));
    }

    public void c(CatalogUserMeta catalogUserMeta, String str) {
        if (str == null) {
            str = catalogUserMeta.l ? "friends_own" : "friends_search";
        }
        ((w0a) this.b).a("show_user_rec", e43.l("user_ids", catalogUserMeta.c + '|' + pvo0.a() + "||" + str + "||" + catalogUserMeta.d));
    }

    public void d(String str, String str2) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
        Object obj = linkedHashMap.get(str2);
        if (obj == null) {
            obj = 0;
        }
        boolean z = ((Number) obj).intValue() > 0;
        if (linkedHashMap.containsKey(str2)) {
            linkedHashMap.put(str2, Integer.valueOf(((Number) linkedHashMap.get(str2)).intValue() + 1));
        } else {
            linkedHashMap.put(str2, 1);
        }
        if (z) {
            return;
        }
        ((w0a) this.b).a("view_block", e43.l("blocks", "||" + pvo0.a() + "|friends|" + str));
    }

    public cks(w0a w0aVar) {
        this.b = w0aVar;
        this.c = new LinkedHashMap();
    }

    public cks() {
        this.b = new xa4(25);
        this.c = new m900(16);
    }
}
