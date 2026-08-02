package xsna;

import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.datepicker.g;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.design.view.author.a;
import com.vk.common.view.BottomSheetWebView;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.view.FutureDateTimePickerView;
import com.vk.core.view.components.formitem.VkFormField;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachWithTranscription;
import com.vk.dto.common.id.UserId;
import com.vk.im.design.view.pagination.DialogPinView;
import com.vk.money.createtransfer.people.CreatePeopleTransferFragment;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.a;
import com.vk.superapp.ui.VkTextFieldView;
import java.util.Date;
import java.util.List;
import xsna.as30;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class en9 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ en9(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        pk30 pk30Var;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                float f = CameraUIView.w1;
                bm9 presenter = ((CameraUIView) obj).getPresenter();
                if (presenter != null) {
                    presenter.v4();
                    break;
                }
                break;
            case 1:
                ((com.vk.movika.sdk.base.presenter.b) obj).invoke();
                break;
            case 2:
                ((a.InterfaceC0555a.b) ((a.InterfaceC0555a) obj)).c.invoke();
                break;
            case 3:
                int i2 = CreatePeopleTransferFragment.B0;
                Object obj2 = ((CreatePeopleTransferFragment) obj).m0;
                ((h9k) (obj2 != null ? obj2 : null)).q();
                break;
            case 4:
                gzs<s3q0> gzsVar = ((DialogPinView) obj).i;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
            case 5:
                ((com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.f) obj).d.invoke(a.d.b);
                break;
            case 6:
                FutureDateTimePickerView futureDateTimePickerView = (FutureDateTimePickerView) obj;
                int i3 = FutureDateTimePickerView.o;
                FragmentManager c = futureDateTimePickerView.c();
                if (c != null) {
                    Date date = futureDateTimePickerView.g;
                    Long valueOf = date != null ? Long.valueOf(date.getTime() + pvo0.d().getTimeZone().getOffset(date.getTime())) : null;
                    g.d<Long> b = g.d.b();
                    b.d = valueOf;
                    b.b = futureDateTimePickerView.k.invoke();
                    com.google.android.material.datepicker.g<Long> a = b.a();
                    a.Td(c, com.google.android.material.datepicker.g.class.getName());
                    final wik wikVar = new wik(futureDateTimePickerView, 9);
                    a.x.add(new lm10() { // from class: xsna.q0t
                        @Override // xsna.lm10
                        public final void a(Object obj3) {
                            int i4 = FutureDateTimePickerView.o;
                            wik.this.invoke(obj3);
                        }
                    });
                    break;
                }
                break;
            case 7:
                as30.a aVar = ((com.vk.im.video.e) obj).h;
                as30 as30Var = as30.this;
                bs30 bs30Var = as30Var.i;
                if (bs30Var != null) {
                    Attach a2 = bs30Var.c.a();
                    if ((a2 instanceof AttachWithTranscription) && (pk30Var = as30Var.h) != null) {
                        pk30Var.a0(bs30Var.b, bs30Var.d, (AttachWithTranscription) a2);
                        break;
                    }
                }
                break;
            case 8:
                q410 q410Var = (q410) obj;
                Long l = q410Var.m;
                if (l != null) {
                    long longValue = l.longValue();
                    UserId userId = q410Var.n;
                    if (userId != null) {
                        q410Var.l.invoke(Long.valueOf(longValue), userId, Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                        break;
                    }
                }
                break;
            case 9:
                y9a0 y9a0Var = (y9a0) obj;
                x64 x64Var = y9a0Var.p;
                if (x64Var != null) {
                    x64Var.c(y9a0Var.d);
                    break;
                }
                break;
            case 10:
                ((cfb0) obj).a.invoke();
                break;
            case 11:
                fft0 fft0Var = (fft0) obj;
                fft0Var.setCurrentVideoPosition(fft0Var.B);
                fft0Var.p1(true);
                break;
            case 12:
                List<Class<? extends View>> list = VkFormField.C;
                ((izs) obj).invoke(view);
                break;
            case 13:
                gzs gzsVar2 = (gzs) obj;
                int i4 = VkTextFieldView.i;
                if (gzsVar2 != null) {
                    gzsVar2.invoke();
                    break;
                }
                break;
            default:
                hix0 hix0Var = (hix0) obj;
                BottomSheetWebView bottomSheetWebView = hix0Var.g1;
                if (bottomSheetWebView != null && bottomSheetWebView.canGoBack()) {
                    BottomSheetWebView bottomSheetWebView2 = hix0Var.g1;
                    if (bottomSheetWebView2 != null) {
                        bottomSheetWebView2.goBack();
                        break;
                    }
                } else {
                    hix0Var.hide();
                    break;
                }
                break;
        }
    }
}
