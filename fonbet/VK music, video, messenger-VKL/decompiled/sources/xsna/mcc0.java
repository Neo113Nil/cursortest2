package xsna;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.dto.common.Attachment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.photo.editor.features.colorgrading.a;
import com.vk.photo.editor.ivm.EditorMessage;
import com.vk.superapp.bridges.dto.tapandpay.VkTokenizationNetworkName;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: PostingAttachmentsAdapter.kt */
/* loaded from: classes4.dex */
public final class mcc0 implements s980, c2a, lb80 {
    public final Object b;

    public /* synthetic */ mcc0(Object obj) {
        this.b = obj;
    }

    @Override // xsna.s980
    @ozl
    public boolean E8(Attachment attachment, NewsEntry newsEntry) {
        return true;
    }

    @Override // xsna.s980
    public void Mg(View view, u1c0 u1c0Var, NewsEntry newsEntry, Attachment attachment) {
        ((pcc0) this.b).e.a(attachment);
    }

    public void a(io.reactivex.rxjava3.disposables.c cVar) {
        ((io.reactivex.rxjava3.disposables.b) this.b).b(cVar);
    }

    @Override // xsna.lb80
    public void b() {
        ((com.vk.photo.editor.features.colorgrading.h) this.b).a();
    }

    @Override // xsna.lb80
    public void c(float f) {
        com.vk.photo.editor.features.colorgrading.h hVar = (com.vk.photo.editor.features.colorgrading.h) this.b;
        float E = sa30.E(f, new k9x(0, 100, 1), new k9x(0, 1, 1));
        hVar.j.setText(String.valueOf(an10.b(sa30.E(E, new k9x(0, 1, 1), new k9x(0, 100, 1)))));
        v3p v3pVar = hVar.a;
        com.vk.photo.editor.features.colorgrading.a b = com.vk.photo.editor.features.colorgrading.h.b(v3pVar.d());
        if (b == null) {
            return;
        }
        v3pVar.d().a(new EditorMessage.i(hVar.g ? com.vk.photo.editor.features.colorgrading.a.a(b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, a.b.a(b.k, 0, 0, E, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), 4095) : com.vk.photo.editor.features.colorgrading.a.a(b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, a.b.a(b.k, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, E, 7), 4095), EditorMessage.Source.UserInput, 4));
    }

    @Override // xsna.c2a
    public void e(on50 on50Var, ln50 ln50Var, izs izsVar) {
        ((b2a) this.b).e(on50Var, ln50Var, izsVar);
    }

    @Override // xsna.lb80
    public void g() {
        ((com.vk.photo.editor.features.colorgrading.h) this.b).a();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0103 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public cwm h(JSONObject jSONObject) {
        gaz0 gaz0Var;
        String string;
        e5z0 a = e5z0.a(giy0.d, null);
        xhz0 xhz0Var = new xhz0((jkz0) this.b);
        boolean has = jSONObject.has("statistics");
        if (has) {
            xhz0Var.b(a, jSONObject, -1.0f);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("items");
        if (optJSONArray == null) {
            gu8.c(null, "ShoppableAdsDataParser: can't parse – ShoppableAdItems'");
            return null;
        }
        int length = optJSONArray.length();
        if (length == 0) {
            gu8.c(null, "ShoppableAdsDataParser: can't parse – shoppableAdItems size is 0");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                gu8.c(null, "ShoppableAdsDataParser: can't parse – hasn't shoppableItemJson");
            } else {
                try {
                    string = optJSONObject.getString("url");
                } catch (Throwable th) {
                    eb3.a(null, new StringBuilder("ShoppableAdsDataParser: can't parse ShoppableAdsItem – "), th);
                }
                if (TextUtils.isEmpty(string)) {
                    gu8.c(null, "ShoppableAdsDataParser: can't parse ShoppableAdsItem – hasn't url");
                } else {
                    String string2 = optJSONObject.getString("id");
                    if (TextUtils.isEmpty(string2)) {
                        gu8.c(null, "ShoppableAdsDataParser: can't parse ShoppableAdsItem – hasn't id");
                    } else {
                        String string3 = optJSONObject.getString("picture");
                        if (TextUtils.isEmpty(string3)) {
                            gu8.c(null, "ShoppableAdsDataParser: can't parse ShoppableAdsItem – hasn't picture");
                        } else {
                            String string4 = optJSONObject.getString("text");
                            if (TextUtils.isEmpty(string4)) {
                                gu8.c(null, "ShoppableAdsDataParser: can't parse ShoppableAdsItem – hasn't text");
                            } else {
                                String string5 = optJSONObject.has("oldPrice") ? optJSONObject.getString("oldPrice") : null;
                                String string6 = optJSONObject.has("price") ? optJSONObject.getString("price") : null;
                                String string7 = optJSONObject.has("deeplink") ? optJSONObject.getString("deeplink") : null;
                                String string8 = optJSONObject.has("deeplink_fallback_url") ? optJSONObject.getString("deeplink_fallback_url") : null;
                                e5z0 a2 = e5z0.a(giy0.d, null);
                                xhz0Var.b(a2, optJSONObject, -1.0f);
                                gaz0Var = new gaz0(string, string2, string3, string4, string6, string5, string7, string8, a2);
                                if (gaz0Var != null) {
                                    gu8.c(null, "ShoppableAdsDataParser: can't parse shoppableAdsItem");
                                    return null;
                                }
                                arrayList.add(gaz0Var);
                            }
                        }
                    }
                }
                gaz0Var = null;
                if (gaz0Var != null) {
                }
            }
        }
        if (arrayList.size() == 0) {
            gu8.c(null, "ShoppableAdsDataParser: can't parse – no one valid shoppableAdItem");
            return null;
        }
        if (!has || a.o("shoppableAdsItemShow") || a.o("show")) {
            return new cwm(arrayList, a);
        }
        gu8.c(null, "ShoppableAdsDataParser: hasn't show stat'");
        return null;
    }

    public void i(fcc fccVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
        long[] jArr = fccVar.e;
        if (jArr.length <= 0 || linkedHashMap.containsKey(Long.valueOf(jArr[0]))) {
            return;
        }
        linkedHashMap.put(Long.valueOf(fccVar.e[0]), fccVar);
    }

    public void j(Activity activity, osv0 osv0Var) {
        int[] iArr;
        int i;
        int i2;
        nsv0 nsv0Var = osv0Var.a;
        String str = nsv0Var.b;
        VkTokenizationNetworkName vkTokenizationNetworkName = nsv0Var.c;
        int[] iArr2 = zbv0.$EnumSwitchMapping$0;
        int i3 = iArr2[vkTokenizationNetworkName.ordinal()];
        if (i3 == 1) {
            iArr = iArr2;
            i = 3;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iArr = iArr2;
            i = 4;
        }
        int i4 = iArr[vkTokenizationNetworkName.ordinal()];
        if (i4 == 1) {
            i2 = 3;
        } else {
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = 4;
        }
        PushTokenizeRequest pushTokenizeRequest = new PushTokenizeRequest(i, i2, osv0Var.b, str, nsv0Var.a, null, false);
        y2o0 y2o0Var = (y2o0) this.b;
        y2o0Var.a.pushTokenize(y2o0Var.asGoogleApiClient(), activity, pushTokenizeRequest, 10051);
    }

    public io.reactivex.rxjava3.internal.operators.observable.i2 k(String[] strArr, VkTokenizationNetworkName vkTokenizationNetworkName) {
        io.reactivex.rxjava3.core.t r;
        y2o0 y2o0Var = (y2o0) this.b;
        if (strArr.length == 0) {
            r = io.reactivex.rxjava3.core.q.T(Boolean.TRUE);
        } else {
            io.reactivex.rxjava3.core.q<R> L = io.reactivex.rxjava3.core.q.O(rl3.u0(strArr)).L(new cxd0(new vnb0(10, y2o0Var, vkTokenizationNetworkName), 20), false);
            gsi0 gsi0Var = new gsi0(8);
            L.getClass();
            r = new io.reactivex.rxjava3.internal.operators.maybe.u(new io.reactivex.rxjava3.internal.operators.observable.u1(L, gsi0Var), new r2v(new epj0(16), 27)).r();
        }
        return io.reactivex.rxjava3.core.x.j(r);
    }

    public void m() {
        ((b2a) this.b).j();
    }

    public CatalogBlockState n() {
        return ((b2a) this.b).getCurrentState();
    }

    public io.reactivex.rxjava3.internal.operators.single.y o() {
        return new io.reactivex.rxjava3.internal.operators.single.v(new ica((y2o0) this.b, 2)).l(new oe40(new u5u0(5), 21));
    }

    public io.reactivex.rxjava3.internal.operators.single.y p() {
        return new io.reactivex.rxjava3.internal.operators.single.v(new nd60((y2o0) this.b, 1)).l(new hl30(new n0m0(20), 26));
    }

    public void q(String str) {
        ((b2a) this.b).k(str);
    }

    public void r(String str, izs izsVar, v1a v1aVar) {
        ((b2a) this.b).g(str, izsVar, v1aVar);
    }

    public void s(izs izsVar) {
        ((b2a) this.b).h(new com.vk.libvideo.b(7, izsVar, this));
    }

    public void t() {
        ((b2a) this.b).c();
    }

    public void u() {
        ((b2a) this.b).b();
    }

    @Override // xsna.s980
    @ozl
    public boolean u9(View view, u1c0 u1c0Var, NewsEntry newsEntry, Attachment attachment) {
        return false;
    }

    public void v(List list) {
        ((b2a) this.b).f(list);
    }

    public void w(r1a r1aVar) {
        ((b2a) this.b).l(r1aVar);
    }

    public void x(t0a t0aVar) {
        ((b2a) this.b).a(t0aVar);
    }

    public mcc0(u6z0 u6z0Var, jkz0 jkz0Var) {
        this.b = jkz0Var;
    }

    public mcc0(int i) {
        switch (i) {
            case 3:
                this.b = new LinkedHashMap();
                break;
            case 7:
                this.b = new edi(9);
                break;
            default:
                this.b = new io.reactivex.rxjava3.disposables.b();
                break;
        }
    }

    public mcc0(Context context) {
        this.b = new y2o0(context);
    }

    @Override // xsna.s980
    public void r8(NewsEntry newsEntry) {
    }

    @Override // xsna.hi60
    public void sa(NewsfeedExternalAction newsfeedExternalAction) {
    }

    @Override // xsna.s980
    public void U5(NewsEntry newsEntry, boolean z, int i) {
    }

    @Override // xsna.s980
    @ozl
    public void Hh(View view, u1c0 u1c0Var, NewsEntry newsEntry, Attachment attachment) {
    }

    @Override // xsna.s980
    @ozl
    public void d9(NewsEntry newsEntry, NewsEntry newsEntry2, int i, int i2) {
    }
}
