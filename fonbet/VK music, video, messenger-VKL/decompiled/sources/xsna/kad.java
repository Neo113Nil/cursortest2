package xsna;

import com.vk.ads.externalsdkstat.api.ExternalSdk;
import com.vk.ads.externalsdkstat.api.di.AdsSdkStatTrackerComponent;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vk.googleump.api.di.GoogleUMPComponent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.superapp.bridges.dto.VkAlertData;
import com.vk.unitylevelplay.impl.UnityLevelPlayFeatureImpl;
import com.vk.unitylevelplay.impl.di.UnityLevelPlayAdsSdkComponentImpl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.lgj;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class kad implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ kad(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.util.ArrayList] */
    @Override // xsna.gzs
    public final Object invoke() {
        dw20 dw20Var;
        lgj lgjVar;
        boolean k2;
        ?? r7;
        int i = this.b;
        int i2 = 0;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                nad nadVar = (nad) obj3;
                List list = (List) obj2;
                List list2 = (List) obj;
                WeakReference<dw20> weakReference = nadVar.g;
                if (weakReference != null && (dw20Var = weakReference.get()) != null) {
                    dw20Var.hide();
                }
                Object obj4 = ywe.a;
                PrivacySetting privacySetting = nadVar.p;
                if (privacySetting == null) {
                    privacySetting = nadVar.m;
                }
                PostingVisibilityMode f = ywe.f(privacySetting);
                if (f != null) {
                    gd60.j(hd60.a(), nadVar.e, f, new com.vk.im.engine.internal.storage.delegates.messages.b(nadVar, 27), new com.vk.movika.sdk.base.model.props.d(13), MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_PRIVACY_COMMON_SETTINGS, list, list2, String.valueOf(nadVar.f.o0()), nadVar.o, 256);
                }
                return s3q0.a;
            case 1:
                ((iqd) obj3).a((String) obj2, ((mqd) obj).getUnformattedText());
                return s3q0.a;
            case 2:
                lgj lgjVar2 = (lgj) obj3;
                o7q0 o7q0Var = (o7q0) obj2;
                fd8 fd8Var = (fd8) obj;
                xc8 xc8Var = lgjVar2.u;
                while (true) {
                    ci50<lgj.a> ci50Var = xc8Var.a;
                    int i3 = ci50Var.d;
                    if (i3 == 0) {
                        lgjVar = lgjVar2;
                    } else {
                        if (i3 == 0) {
                            throw new NoSuchElementException("MutableVector is empty.");
                        }
                        zhf0 zhf0Var = (zhf0) ci50Var.b[i3 - 1].a.invoke();
                        if (zhf0Var == null) {
                            lgjVar = lgjVar2;
                            k2 = true;
                        } else {
                            lgjVar = lgjVar2;
                            k2 = lgj.k2(lgjVar, zhf0Var, 0L, 0L, 3);
                        }
                        if (k2) {
                            ci50<lgj.a> ci50Var2 = xc8Var.a;
                            ci50Var2.k(ci50Var2.d - 1).b.resumeWith(s3q0.a);
                            lgjVar2 = lgjVar;
                        }
                    }
                }
                if (lgjVar.v) {
                    zhf0 zhf0Var2 = (zhf0) lgjVar.t.invoke();
                    if (zhf0Var2 != null && lgj.k2(lgjVar, zhf0Var2, 0L, 0L, 3)) {
                        lgjVar.v = false;
                    }
                }
                o7q0Var.e = lgj.i2(lgjVar, fd8Var, 0L);
                return s3q0.a;
            case 3:
                qcy<Object>[] qcyVarArr = UnityLevelPlayAdsSdkComponentImpl.b;
                m11 J8 = ((AdsSdkStatTrackerComponent) obj3).J8(ExternalSdk.UNITY_LEVEL_PLAY);
                lau P4 = ((GoogleUMPComponent) obj2).P4();
                P4.d(J8);
                return new UnityLevelPlayFeatureImpl(P4, ((AuthBridgeComponent) obj).s(), J8);
            default:
                JSONObject jSONObject = (JSONObject) obj2;
                rgx0 rgx0Var = (rgx0) obj;
                pnx pnxVar = ((qgx0) obj3).c;
                String optString = jSONObject.optString("title");
                String optString2 = jSONObject.optString("message");
                JSONArray optJSONArray = jSONObject.optJSONArray("actions");
                if (optJSONArray != null) {
                    r7 = new ArrayList(optJSONArray.length());
                    int length = optJSONArray.length();
                    for (int i4 = 0; i4 < length; i4++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i4);
                        String optString3 = jSONObject2.optString("title");
                        JSONObject optJSONObject = jSONObject2.optJSONObject("handler");
                        if (optJSONObject == null) {
                            optJSONObject = new JSONObject();
                        }
                        r7.add(new VkAlertData.a(optString3, optJSONObject));
                    }
                } else {
                    r7 = EmptyList.b;
                }
                VkAlertData.a aVar = null;
                VkAlertData.a aVar2 = null;
                VkAlertData.a aVar3 = null;
                for (Object obj5 : (Iterable) r7) {
                    int i5 = i2 + 1;
                    if (i2 < 0) {
                        e43.t();
                        throw null;
                    }
                    VkAlertData.a aVar4 = (VkAlertData.a) obj5;
                    if (i2 == 0) {
                        aVar = aVar4;
                    } else if (i2 == 1) {
                        aVar2 = aVar4;
                    } else if (i2 == 2) {
                        aVar3 = aVar4;
                    }
                    i2 = i5;
                }
                pnxVar.c(new VkAlertData.b(optString, optString2, VkAlertData.DialogType.NOWHERE, aVar, aVar2, aVar3), rgx0Var);
                return s3q0.a;
        }
    }
}
