package defpackage;

import android.net.Uri;
import android.nfc.tech.IsoDep;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.view.View;
import androidx.camera.core.ImageCaptureException;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.view.fragment.NavHostFragment;
import com.bumptech.glide.load.resource.bitmap.h;
import com.yandex.go.payments.cards.domain.exception.TooManyRequestsException;
import com.yandex.payment.sdk.nfcscanner.tools.ownimpl.exceptions.CommunicationException;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.kyc.internal.screens.photo.b;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;
import org.bouncycastle.operator.OperatorCreationException;
import org.json.JSONException;
import org.json.JSONObject;
import ru.yandex.taxi.exception.HttpRetryAfterException;
import ru.yandex.taxi.maas.impl.account.a;
import ru.yandex.taxi.network.api.models.GoApiHttpException;

/* loaded from: classes15.dex */
public final class h2t implements trq0, iqs, cpg, mjj, to7, el7, ca20, fkz, ma41, fb10 {
    public Object a;

    public h2t(InputStream inputStream, g63 g63Var) {
        h hVar = new h(inputStream, g63Var);
        this.a = hVar;
        hVar.mark(5242880);
    }

    @Override // defpackage.ma41
    public void a(rwq0 rwq0Var) {
        a200 a200Var = ((a) this.a).H;
        n0 n0Var = a200Var.a.a;
        zy11 zy11Var = zy11.a;
        n0Var.g(zy11Var);
        a200Var.b.a.g(zy11Var);
    }

    @Override // defpackage.to7
    public void b(Exception exc) {
        r0 r0Var;
        Object value;
        b bVar = (b) this.a;
        x4c.g("[KYC_Online] Failed to init camera", exc, null, null, 12);
        em3 em3Var = bVar.I.F;
        em3Var.a.a("kyc_online.error.photo.no_camera.open", new LinkedHashMap(1));
        pz40 Y = bVar.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, onx.a((onx) value, new hnx(exc), null, null, null, false, 0, false, 254)));
    }

    @Override // defpackage.to7
    public void c() {
        r0 r0Var;
        Object value;
        pz40 Y = ((b) this.a).Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, onx.a((onx) value, null, null, null, null, false, 0, false, 247)));
    }

    @Override // defpackage.cpg
    public void cleanup() {
        ((h) this.a).c();
    }

    @Override // defpackage.cpg
    public Object d() {
        h hVar = (h) this.a;
        hVar.reset();
        return hVar;
    }

    @Override // defpackage.to7
    public void e(ImageCaptureException imageCaptureException) {
        b bVar = (b) this.a;
        x4c.g("[KYC_Online] Failed to take picture", imageCaptureException, null, null, 12);
        bVar.I.F.a.a("kyc_online.error.photo.saving_failed", null);
        bVar.Z(new cpx(gao.e(null, null, imageCaptureException, 3)));
    }

    @Override // defpackage.to7
    public void f(Uri uri) {
        b bVar = (b) this.a;
        AppAnalyticsReporter appAnalyticsReporter = bVar.I;
        spx spxVar = ((onx) bVar.X()).e;
        tnx tnxVar = spxVar != null ? spxVar.c : null;
        if (jl40.l(tnxVar, qnx.b)) {
            appAnalyticsReporter.F.a.a("kyc_online.photo.ready_first_photo", null);
        } else if (jl40.l(tnxVar, snx.b)) {
            appAnalyticsReporter.F.a.a("kyc_online.photo.ready_third_photo", null);
        } else if (jl40.l(tnxVar, rnx.b)) {
            appAnalyticsReporter.F.a.a("kyc_online.photo.ready_second_photo", null);
        } else if (tnxVar != null && !(tnxVar instanceof pnx)) {
            w511.b();
            return;
        }
        bVar.Z(new bpx(false));
        if (uri == null) {
            x4c.g("[KYC_Online] Photo is saved but uri is missing", null, null, null, 14);
            return;
        }
        pz40 Y = bVar.Y();
        while (true) {
            r0 r0Var = (r0) Y;
            Object value = r0Var.getValue();
            Uri uri2 = uri;
            if (r0Var.k(value, onx.a((onx) value, null, null, uri2, null, false, 0, false, 251))) {
                return;
            } else {
                uri = uri2;
            }
        }
    }

    public void g(GoApiHttpException goApiHttpException, m831 m831Var) {
        if (goApiHttpException.getCode() != 429) {
            return;
        }
        oeu headers = goApiHttpException.getHeaders();
        keu keuVar = new keu();
        for (Map.Entry entry : headers.a.entrySet()) {
            String str = (String) entry.getKey();
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                keuVar.a(str, (String) it.next());
            }
        }
        meu d = keuVar.d();
        HttpRetryAfterException httpRetryAfterException = new HttpRetryAfterException(goApiHttpException.getCode(), d);
        int a = httpRetryAfterException.a();
        if (a <= 0) {
            jst.e.a(10, null, httpRetryAfterException, null);
            return;
        }
        ((dvu) this.a).k(a, m831Var);
        Calendar calendar = Calendar.getInstance();
        long timeInMillis = calendar.getTimeInMillis();
        String a2 = d.a("Date");
        Date a3 = a2 != null ? brg.a(a2) : null;
        calendar.setTimeInMillis(timeInMillis + (a3 != null ? a3.getTime() - System.currentTimeMillis() : 0L));
        calendar.add(14, a);
        throw new TooManyRequestsException(calendar);
    }

    @Override // defpackage.mjj
    public ljj get(xr1 xr1Var) {
        try {
            MessageDigest a = ((a8x) this.a).a.a(xr1Var);
            xp6 xp6Var = new xp6(1);
            xp6Var.b = a;
            return new z7x(xr1Var, xp6Var);
        } catch (GeneralSecurityException e) {
            throw new OperatorCreationException("exception on setup: " + e, e);
        }
    }

    public void h(String str, List list, Bundle bundle, Bundle bundle2) {
        Bundle bundle3 = new Bundle();
        bundle3.putString("data_media_item_id", str);
        bundle3.putBundle("data_options", bundle);
        bundle3.putBundle("data_notify_children_changed_options", bundle2);
        if (list != null) {
            bundle3.putParcelableArrayList("data_media_item_list", list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
        }
        k(3, bundle3);
    }

    public void i() {
        mnu mnuVar = (mnu) this.a;
        int i = mnuVar.K - 1;
        mnuVar.K = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (hou houVar : mnuVar.M) {
            houVar.q();
            i2 += houVar.d0.a;
        }
        xzz0[] xzz0VarArr = new xzz0[i2];
        int i3 = 0;
        for (hou houVar2 : mnuVar.M) {
            houVar2.q();
            int i4 = houVar2.d0.a;
            int i5 = 0;
            while (i5 < i4) {
                houVar2.q();
                xzz0VarArr[i3] = houVar2.d0.a(i5);
                i5++;
                i3++;
            }
        }
        mnuVar.L = new yzz0(xzz0VarArr);
        mnuVar.J.onPrepared(mnuVar);
    }

    @Override // defpackage.el7
    public Object j(androidx.concurrent.futures.b bVar) {
        lry lryVar = (lry) this.a;
        d6z.y("The result can only set once!", lryVar.y == null);
        lryVar.y = bVar;
        return "ListFuture[" + this + "]";
    }

    public void k(int i, Bundle bundle) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.arg1 = 2;
        obtain.setData(bundle);
        ((Messenger) this.a).send(obtain);
    }

    public void l(FragmentManager fragmentManager) {
        View view;
        l2w l2wVar = (l2w) this.a;
        Fragment E = fragmentManager.E(l2wVar.c.getId());
        NavHostFragment navHostFragment = E instanceof NavHostFragment ? (NavHostFragment) E : null;
        if (navHostFragment == null || (view = navHostFragment.getView()) == null) {
            return;
        }
        l2wVar.a(view);
    }

    public byte[] m(byte[] bArr) {
        try {
            byte[] transceive = ((IsoDep) this.a).transceive(bArr);
            if (transceive.length > 2) {
                byte[] bArr2 = new byte[transceive.length - 2];
                int length = transceive.length - 2;
                for (int i = 0; i < length; i++) {
                    bArr2[i] = 0;
                }
                System.arraycopy(transceive, 0, bArr2, 0, transceive.length - 2);
            }
            return transceive;
        } catch (Exception e) {
            throw new CommunicationException(e.getMessage());
        }
    }

    @Override // defpackage.trq0
    public void onContinueLoadingRequested(urq0 urq0Var) {
        mnu mnuVar = (mnu) this.a;
        mnuVar.J.onContinueLoadingRequested(mnuVar);
    }

    @Override // defpackage.iqs
    public void onFailure(Throwable th) {
        ((jdv) this.a).close();
    }

    @Override // defpackage.ca20
    public void onMethodCall(x920 x920Var, da20 da20Var) {
        hdu hduVar = (hdu) this.a;
        if (((i4u) hduVar.b) == null) {
            return;
        }
        String str = x920Var.a;
        str.getClass();
        if (!str.equals("Localization.getStringResource")) {
            ((ba20) da20Var).notImplemented();
            return;
        }
        JSONObject jSONObject = (JSONObject) x920Var.b;
        try {
            ((ba20) da20Var).success(((i4u) hduVar.b).e(jSONObject.getString("key"), jSONObject.has("locale") ? jSONObject.getString("locale") : null));
        } catch (JSONException e) {
            ((ba20) da20Var).error("error", e.getMessage(), null);
        }
    }

    @Override // defpackage.iqs
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
    }

    public /* synthetic */ h2t(Object obj) {
        this.a = obj;
    }
}
