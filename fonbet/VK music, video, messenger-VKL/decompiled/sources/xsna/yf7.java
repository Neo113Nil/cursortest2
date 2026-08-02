package xsna;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.gms.auth.blockstore.StoreBytesData;
import com.vk.api.sdk.auth.AccountProfileType;
import com.vk.attachpicker.adapter.PhotoSmallAdapter;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionClearRecent;
import com.vk.catalog2.common.ui.holders.HeaderClearBlocksVh;
import com.vk.dto.common.id.UserId;
import com.vk.lists.ListDataSet;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.upload.impl.UploadNotification;
import com.vkontakte.android.R;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONObject;
import xsna.awg0;
import xsna.bex0;
import xsna.bg7;
import xsna.c2r0;
import xsna.qgx0;
import xsna.saj;
import xsna.vyh;
import xsna.wk50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class yf7 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ yf7(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                c2r0.b bVar = (c2r0.b) this.c;
                wf7 wf7Var = (wf7) this.d;
                bg7 bg7Var = (bg7) this.e;
                Boolean bool = (Boolean) obj;
                if (!bool.booleanValue()) {
                    return io.reactivex.rxjava3.core.x.i(new bg7.a("isEncryptionAvailable=" + bool));
                }
                UserId userId = bVar.a;
                String str = bVar.g;
                AccountProfileType accountProfileType = bVar.i;
                String str2 = bVar.b;
                String valueOf = String.valueOf(userId.b);
                exc0.g(valueOf, "key cannot be null or empty");
                return m4s.F(wf7Var.storeBytes(new StoreBytesData(valueOf, (str + ';' + String.valueOf(accountProfileType.h()) + ';' + str2).getBytes(emb.b), false)), bg7Var.c);
            case 1:
                com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.b bVar2 = (com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.b) this.c;
                com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.b.d((wk50.a) this.d, false, (vzh) this.e);
                bVar2.b.b(new vyh.f(tq.h(tlo0.Companion, R.string.default_network_error)));
                return s3q0.a;
            case 2:
                saj sajVar = (saj) this.c;
                LayoutInflater layoutInflater = (LayoutInflater) this.d;
                saj.a aVar = (saj.a) this.e;
                ViewGroup viewGroup = (ViewGroup) obj;
                return sajVar.i ? new g8g0(layoutInflater.inflate(R.layout.vkim_contacts_request_permission_vh, viewGroup, false), aVar) : new h8g0(layoutInflater.inflate(R.layout.vkim_contacts_request_permission_vh_old, viewGroup, false), aVar);
            case 3:
                WeakReference weakReference = (WeakReference) this.c;
                p9k p9kVar = (p9k) this.d;
                String str3 = (String) this.e;
                io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) obj;
                Activity activity = (Activity) weakReference.get();
                if (activity != null) {
                    szv.a(p9kVar.b, activity, null, new l9k(weakReference, p9kVar, str3, cVar, 0), new com.vk.movika.sdk.base.logic.processor.h(p9kVar, 28), new tbh(p9kVar, 5), 2);
                } else {
                    p9kVar.e.onError(new IllegalStateException("Caller Activity is disposed :("));
                }
                return s3q0.a;
            case 4:
                Long l = (Long) this.c;
                Long l2 = (Long) this.d;
                wzs wzsVar = (wzs) this.e;
                Long l3 = (Long) obj;
                long longValue = l3.longValue();
                u890 u890Var = x0l.a;
                if ((l == null && l2 == null) || !(l == null || l2 == null)) {
                    wzsVar.invoke(l3, null);
                } else if (l == null || longValue < l.longValue()) {
                    wzsVar.invoke(l3, null);
                } else {
                    wzsVar.invoke(l, l3);
                }
                return s3q0.a;
            case 5:
                PhotoSmallAdapter photoSmallAdapter = (PhotoSmallAdapter) this.c;
                com.vk.attachpicker.fragment.gallery.c cVar2 = (com.vk.attachpicker.fragment.gallery.c) this.d;
                com.vk.attachpicker.b bVar3 = (com.vk.attachpicker.b) this.e;
                photoSmallAdapter.notifyItemChanged(photoSmallAdapter.K0() + ((Integer) obj).intValue(), Boolean.TRUE);
                izs<List<? extends MediaStoreEntry>, s3q0> izsVar = cVar2.i;
                z4f z4fVar = cVar2.c;
                if (izsVar != null) {
                    izsVar.invoke(bVar3.b());
                }
                if (bVar3.k() < 2) {
                    AbstractList abstractList = ((ListDataSet) photoSmallAdapter.c).d;
                    for (int i = 0; i < abstractList.size(); i++) {
                        abstractList.get(i);
                        if (photoSmallAdapter.getItemViewType(i) == 1) {
                            photoSmallAdapter.notifyItemChanged(i);
                        }
                        s3q0 s3q0Var = s3q0.a;
                    }
                }
                if (bVar3.k() > 0 && !((Boolean) z4fVar.invoke()).booleanValue()) {
                    return s3q0.a;
                }
                if (bVar3.k() == 0 && ((Boolean) z4fVar.invoke()).booleanValue()) {
                    return s3q0.a;
                }
                u3p0 u3p0Var = cVar2.f;
                if (u3p0Var != null) {
                    z4fVar.invoke();
                    u3p0Var.a.getClass();
                }
                return s3q0.a;
            case 6:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.c;
                HeaderClearBlocksVh headerClearBlocksVh = (HeaderClearBlocksVh) this.d;
                UIBlockActionClearRecent uIBlockActionClearRecent = (UIBlockActionClearRecent) this.e;
                dw20 dw20Var = (dw20) ref$ObjectRef.element;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                headerClearBlocksVh.b(uIBlockActionClearRecent);
                return s3q0.a;
            case 7:
                ((x7y) this.c).L0().e((String) this.d, (String) this.e, (Throwable) obj);
                return s3q0.a;
            case 8:
                return awg0.a.a((awg0) obj, ((lq40) ((wu70) this.c).a.a).N((UserId) this.d), null, new ahe((el50) this.e, 3), 1);
            default:
                com.vk.upload.impl.tasks.h hVar = (com.vk.upload.impl.tasks.h) this.c;
                qgx0 qgx0Var = (qgx0) this.d;
                File file = (File) this.e;
                int i2 = qgx0.a.$EnumSwitchMapping$0[((UploadNotification.b) obj).b.ordinal()];
                if (i2 == 1 || i2 == 2) {
                    String str4 = hVar.q;
                    if (str4 == null) {
                        str4 = "";
                    }
                    bex0.a.b(qgx0Var.a, JsApiMethodType.GET_CLIENT_LOGS, new JSONObject().put("upload_response", str4), null, 12);
                    file.delete();
                }
                return s3q0.a;
        }
    }
}
