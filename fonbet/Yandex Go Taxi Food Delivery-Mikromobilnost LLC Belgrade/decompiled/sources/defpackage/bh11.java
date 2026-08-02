package defpackage;

import android.animation.ValueAnimator;
import android.os.Looper;
import androidx.camera.video.i;
import androidx.camera.video.k;
import com.yandex.div.core.view2.errors.VariableMonitorView;
import com.yandex.go.account.upgrade.UpgradeAccountModalView;
import com.yandex.go.trusted_contacts.ui.TrustedContactsModalView;
import com.yandex.go.universal_qr_scanner.presentation.d;
import com.yandex.go.vault.flexsdk.descriptors.widget.view.VaultsPagerView;
import com.yandex.messaging.internal.BackendCompatibilityStatus;
import com.yandex.urbanads.internal.visibility.a;
import com.ybsdk.widgets.common.LoadableInput;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.webrtc.VideoFileRenderer;
import ru.yandex.taxi.preorder.summary.selector.ui.verticals.VerticalInternalTariffView;
import ru.yandex.taxi.provider.b;
import ru.yandex.taxi.transition.AttachableViewHolder;
import ru.yandex.taxi.transition.c;
import ru.yandex.taxi.widget.ModalView;
import ru.yandex.taxi.widget.dialog.UpdateDialog;

/* loaded from: classes14.dex */
public final /* synthetic */ class bh11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bh11(a aVar, rw31 rw31Var) {
        this.a = 29;
        this.b = rw31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sh11 sh11Var;
        sh11 sh11Var2;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                TrustedContactsModalView trustedContactsModalView = (TrustedContactsModalView) obj;
                sh11Var = trustedContactsModalView.presenter;
                o7r0 o7r0Var = (o7r0) sh11Var.z.c;
                o7r0Var.getClass();
                o7r0Var.a.a("TrustedContacts.ActionButtonTapped", new HashMap(), 1, new HashMap());
                sh11Var2 = trustedContactsModalView.presenter;
                sh11Var2.close();
                break;
            case 1:
                ((ModalView) obj).dismissWithoutAnimation();
                break;
            case 2:
                ((pw11) obj).d.b.a("negative");
                break;
            case 3:
                ((z880) ((ggi) obj).c).a();
                break;
            case 4:
                d dVar = (d) obj;
                ((a60) ((y50) ((zxa) dVar.x.b).G)).d();
                ibw0 ibw0Var = dVar.E.a;
                ibw0Var.getClass();
                HashMap hashMap = new HashMap();
                ibw0Var.a.a("SuperappMain.UniversalQR.SettingsTapped", hashMap, 1, g8e.v(hashMap, "lumos_enabled", Boolean.FALSE));
                break;
            case 5:
                o421 o421Var = (o421) obj;
                qf4 qf4Var = (qf4) o421Var.a.get();
                z83.g(null, qf4Var.a, Looper.myLooper());
                qf4Var.e = true;
                if (qf4Var.f == BackendCompatibilityStatus.OK && qf4Var.d) {
                    qf4Var.f = BackendCompatibilityStatus.PARTIALLY_OUTDATED;
                    qf4Var.a();
                }
                if (!o421Var.d) {
                    o421Var.c.reportEvent("unsupported message");
                    o421Var.d = true;
                    break;
                }
                break;
            case 6:
                ((a521) obj).b.b();
                break;
            case 7:
                ((b) obj).e = null;
                break;
            case 8:
                UpdateDialog._init_$lambda$0((z631) obj);
                break;
            case 9:
                UpgradeAccountModalView.onAttachedToWindow$lambda$0((UpgradeAccountModalView) obj);
                break;
            case 10:
                ((LoadableInput) obj).requestFocus();
                break;
            case 11:
                sp21 sp21Var = (sp21) obj;
                if (sp21Var.c == null) {
                    sp21Var.c = sp21Var.A.w.a(25L, TimeUnit.SECONDS, sp21Var);
                    sp21Var.z = null;
                    break;
                }
                break;
            case 12:
                ((qr21) ((tr21) obj)).a.invoke();
                break;
            case 13:
                au21 au21Var = (au21) obj;
                au21Var.c();
                au21Var.n = e3n.c;
                au21Var.o = "";
                break;
            case 14:
                ((hh31) obj).invoke();
                break;
            case 15:
                VariableMonitorView.updateTable$lambda$5((VariableMonitorView) obj);
                break;
            case 16:
                ((com.yandex.go.vault.di.a) obj).invoke();
                break;
            case 17:
                ((a431) obj).W();
                break;
            case 18:
                VaultsPagerView.setupBottomButtonsListeners$lambda$2((VaultsPagerView) obj);
                break;
            case 19:
                ((wp01) obj).invoke();
                break;
            case 20:
                ((VerticalInternalTariffView) obj).onSelectorCellsChanged();
                break;
            case 21:
                ((i) obj).s();
                break;
            case 22:
                ((k) obj).k.b(null);
                break;
            case 23:
                ((VideoFileRenderer) obj).lambda$release$3();
                break;
            case 24:
                ep31 ep31Var = (ep31) obj;
                if (!jl40.l(Looper.myLooper(), Looper.getMainLooper())) {
                    ny61.r("Trying attempt access to binding in background thread ");
                    break;
                } else {
                    ep31Var.c = null;
                    break;
                }
            case 25:
                ku31 ku31Var = (ku31) obj;
                if (ku31Var.b == null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.95f);
                    ofFloat.setDuration(1000L);
                    ofFloat.setRepeatCount(-1);
                    ofFloat.setRepeatMode(2);
                    ofFloat.addUpdateListener(new mxp0(27, ku31Var));
                    ofFloat.start();
                    ku31Var.b = ofFloat;
                    break;
                }
                break;
            case 26:
                lu31 lu31Var = (lu31) obj;
                if (lu31Var.b == null) {
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.95f);
                    ofFloat2.setDuration(1000L);
                    ofFloat2.setRepeatCount(-1);
                    ofFloat2.setRepeatMode(2);
                    ofFloat2.addUpdateListener(new mxp0(28, lu31Var));
                    lu31Var.b = ofFloat2;
                    ofFloat2.start();
                    break;
                }
                break;
            case 27:
                c cVar = (c) obj;
                ru.yandex.taxi.transition.b bVar = cVar.i;
                if (bVar != null) {
                    if (cVar.l) {
                        bVar.q4(AttachableViewHolder.TransitionType.DISAPPEAR);
                    }
                    cVar.i = null;
                }
                ru.yandex.taxi.transition.b bVar2 = cVar.j;
                if (bVar2 != null) {
                    if (cVar.l) {
                        bVar2.q4(AttachableViewHolder.TransitionType.APPEAR);
                    }
                    cVar.j = null;
                }
                cVar.l = false;
                break;
            case 28:
                a aVar = (a) obj;
                aVar.l = null;
                aVar.c();
                break;
            default:
                rw31 rw31Var = (rw31) obj;
                ix31 ix31Var = rw31Var.a;
                int i2 = ix31Var.c;
                if (i2 <= 0 || rw31Var.c < i2) {
                    rw31Var.c++;
                    ix31Var.d.invoke();
                }
                rw31Var.b = null;
                break;
        }
    }

    public /* synthetic */ bh11(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
