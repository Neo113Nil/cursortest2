package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import com.adjust.sdk.OnDeeplinkResolvedListener;
import com.yandex.payment.sdk.nfcscanner.NfcResult;
import com.yandex.payment.sdk.nfcscanner.NfcScannerFragment;
import ru.yandex.taxi.fragment.favorites.edit.FavoriteEditFragment;
import ru.yandex.taxi.search.view.a;
import yads.jk3;

/* loaded from: classes15.dex */
public final /* synthetic */ class nb1 implements OnDeeplinkResolvedListener, zf5, t070, dx4, dly, kds, wf81 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;

    public /* synthetic */ nb1(String str, tls tlsVar) {
        this.a = 12;
        this.b = tlsVar;
    }

    @Override // defpackage.zf5
    public void a(int i) {
        this.b.invoke(Integer.valueOf(i));
    }

    @Override // defpackage.wf81
    public void j(jk3 jk3Var) {
        this.b.invoke(null);
    }

    @Override // defpackage.dly
    public boolean n(ClickableSpan clickableSpan) {
        int i = this.a;
        tls tlsVar = this.b;
        switch (i) {
            case 9:
                if (!(clickableSpan instanceof URLSpan)) {
                    break;
                } else {
                    tlsVar.invoke(((URLSpan) clickableSpan).getURL());
                    break;
                }
            default:
                if (!(clickableSpan instanceof URLSpan)) {
                    break;
                } else {
                    tlsVar.invoke(((URLSpan) clickableSpan).getURL());
                    break;
                }
        }
        return true;
    }

    @Override // defpackage.dx4
    public void o(a aVar, pv0 pv0Var) {
        FavoriteEditFragment.searchAddress$lambda$0(this.b, aVar, pv0Var);
    }

    @Override // com.adjust.sdk.OnDeeplinkResolvedListener
    public void onDeeplinkResolved(String str) {
        qb1.a(this.b, str);
    }

    @Override // defpackage.t070
    public void onSuccess(Object obj) {
        int i = this.a;
        tls tlsVar = this.b;
        switch (i) {
            case 2:
                tlsVar.invoke(obj);
                break;
            case 3:
                tlsVar.invoke(obj);
                break;
            case 4:
            default:
                tlsVar.invoke(obj);
                break;
            case 5:
                tlsVar.invoke(obj);
                break;
            case 6:
                tlsVar.invoke(obj);
                break;
            case 7:
                tlsVar.invoke(obj);
                break;
        }
    }

    @Override // defpackage.kds
    public void s(Bundle bundle, String str) {
        tls tlsVar = this.b;
        try {
            NfcResult nfcResult = (NfcResult) bundle.getParcelable(NfcScannerFragment.NFC_FRAGMENT_BUNDLE_KEY);
            if (nfcResult != null) {
                tlsVar.invoke(nfcResult);
            }
        } catch (Throwable unused) {
        }
    }

    public /* synthetic */ nb1(int i, tls tlsVar) {
        this.a = i;
        this.b = tlsVar;
    }
}
