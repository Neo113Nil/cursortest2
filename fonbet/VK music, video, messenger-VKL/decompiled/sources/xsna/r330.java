package xsna;

import android.content.ContentValues;
import com.vk.api.generated.account.dto.AccountModelDto;
import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.dto.common.id.UserId;
import com.vk.ml.MLFeatures;
import com.vk.superapp.api.internal.oauthrequests.AuthByExchangeTokenInitiator;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.Iterator;
import java.util.List;
import kotlin.text.Regex;
import xsna.c2r0;
import xsna.x140;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class r330 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ r330(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        SQLiteDatabase h;
        String str;
        Object obj2;
        String str2;
        switch (this.b) {
            case 0:
                com.vk.ml.b bVar = (com.vk.ml.b) this.c;
                MLFeatures.MLFeature mLFeature = (MLFeatures.MLFeature) this.d;
                String str3 = (String) this.e;
                AccountModelDto accountModelDto = (AccountModelDto) this.f;
                String str4 = (String) obj;
                j330 j330Var = bVar.d;
                if (j330Var == null) {
                    return s3q0.a;
                }
                if (j330Var.d("feature_name = ?", new String[]{mLFeature.name()}).isEmpty()) {
                    j330Var.a(new zb00(accountModelDto.i(), accountModelDto.g(), str4, "", accountModelDto.d(), 0));
                } else {
                    int i = accountModelDto.i();
                    zb00 b = j330Var.b(str3);
                    if (b != null && (str = b.b) != null && !str4.equals(str)) {
                        Regex regex = com.vk.core.files.a.a;
                        vhk0.c(str);
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("model_path", str4);
                    contentValues.put("model_version", Integer.valueOf(i));
                    x330 x330Var = (x330) j330Var.a.getValue();
                    if (x330Var != null && (h = x330Var.h(new m130(x330Var, 1))) != null) {
                        h.update("models", contentValues, "feature_name = ?", new String[]{str3});
                    }
                }
                return s3q0.a;
            default:
                x140 x140Var = (x140) this.c;
                UserId userId = (UserId) this.d;
                com.vk.superapp.multiaccount.api.f fVar = (com.vk.superapp.multiaccount.api.f) this.e;
                com.vk.superapp.multiaccount.api.f fVar2 = (com.vk.superapp.multiaccount.api.f) this.f;
                Iterator it = ((List) obj).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (epx.f(((c2r0.b) obj2).a, userId)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                c2r0.b bVar2 = (c2r0.b) obj2;
                return (bVar2 == null || (str2 = bVar2.g) == null) ? io.reactivex.rxjava3.core.q.H(new x140.a()) : l55.e(l55.a, x140Var.a, str2, userId, VkAuthMetaInfo.h, AuthByExchangeTokenInitiator.SILENT_AUTHORIZATION).F(new l8w(new x4c(x140Var, fVar, fVar2, 4), 6)).U(new ca6(new j5n(13), 25));
        }
    }
}
