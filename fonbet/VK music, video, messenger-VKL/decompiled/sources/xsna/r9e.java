package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.google.android.gms.common.GoogleApiAvailability;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.core.view.components.spinner.VkScreenSpinner;
import com.vk.core.view.components.spinner.VkSpinnerContent;
import com.vk.profile.community.details.api.invitelink.data.dto.CommunityInviteLink;
import com.vk.profile.community.details.impl.invitelink.CommunityInviteLinkFragment;
import com.vk.qrcode.d;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonCustom;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import xsna.aa30;
import xsna.l3e0;
import xsna.n1j;
import xsna.rv9;
import xsna.wk50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class r9e implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ r9e(Activity activity, com.vk.qrcode.c cVar, d.b bVar, cme0 cme0Var) {
        this.b = 6;
        this.c = activity;
        this.d = cVar;
        this.e = bVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        PrivateFiles.a b;
        int i = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                s9e s9eVar = (s9e) obj4;
                Context context = (Context) obj3;
                l3e0.a aVar = (l3e0.a) obj2;
                List list = (List) obj;
                ((nk9) s9eVar.d.getValue()).a();
                bpn0 bpn0Var = s9eVar.c;
                lbk lbkVar = (lbk) bpn0Var.getValue();
                List list2 = list;
                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((lr10) it.next()).a.toString());
                }
                lbkVar.c(arrayList);
                cmf cmfVar = new cmf();
                cxd cxdVar = new cxd(s9eVar.a, new bpn0(new com.vk.movika.sdk.base.logic.interactor.j(s9eVar, 22)));
                b = e8r.a.b(r7, PrivateSubdir.CLIPS_VIDEO.h(), true);
                File file = b.a;
                fsk0 fsk0Var = qsk0.a;
                kbk context2 = ((lbk) bpn0Var.getValue()).getContext();
                return new m9e(cmfVar, cxdVar, file, context, fsk0Var, context2 != null ? Integer.valueOf(context2.b) : null).c(list, aVar);
            case 1:
                ((cpg) obj4).c((wk50.a) obj3, ((rv9.a.f) obj2).b);
                return s3q0.a;
            case 2:
                int i2 = CommunityInviteLinkFragment.e0;
                kbj0.c((kbj0) obj4, ((CommunityInviteLinkFragment) obj3).requireContext(), ((CommunityInviteLink) obj2).e, false, null, null, false, 120);
                return s3q0.a;
            case 3:
                o1j o1jVar = (o1j) obj3;
                int i3 = n1j.k1;
                ((n1j) obj4).bo(o1jVar, n1j.a.IDLE);
                o1jVar.setContentView((View) obj2);
                return s3q0.a;
            case 4:
                String str = (String) obj2;
                Context context3 = (Context) obj3;
                wvp wvpVar = ((mxt) obj4).d;
                JSONObject put = new JSONObject().put("extra_native_description", ((Throwable) obj).getMessage()).put("google_fit_version", x1w0.a(context3, "com.google.android.apps.fitness"));
                if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context3) == 0) {
                    put.put("gms_version", x1w0.a(context3, "com.google.android.gms"));
                }
                wvpVar.e(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_CUSTOM, null, null, null, null, null, null, null, null, null, null, null, null, null, new Responses$ReasonCustom(0, put.toString(), 1, null), null, null, 114686, null), str, 1, null));
                return s3q0.a;
            case 5:
                za30 za30Var = (za30) obj4;
                vmp0 vmp0Var = (vmp0) obj3;
                nb30 nb30Var = (nb30) obj2;
                float floatValue = ((Float) obj).floatValue();
                za30Var.c(floatValue == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? new aa30.a(vmp0Var.a.b) : floatValue == 1.0f ? new aa30.a(vmp0Var.a.c) : new aa30.b(vmp0Var.a, floatValue, nb30Var, 4));
                return s3q0.a;
            case 6:
                com.vk.qrcode.d.b.e((Activity) obj4, (com.vk.qrcode.c) obj3, (d.b) obj2);
                com.vk.qrcode.d.l = false;
                return s3q0.a;
            default:
                Context context4 = (Context) obj;
                VkScreenSpinner m = qkk0.m((qkk0) obj4, context4, VkSpinnerContent.SpinnerState.Loading, VkScreenSpinner.SpinnerMode.Shadow, "Динамический цвет", 40);
                m.setColor(context4.getColor(((Number) ((List) obj3).get(((rg50) obj2).getIntValue())).intValue()));
                return m;
        }
    }

    public /* synthetic */ r9e(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ r9e(mxt mxtVar, String str, Context context) {
        this.b = 4;
        this.c = mxtVar;
        this.e = str;
        this.d = context;
    }
}
