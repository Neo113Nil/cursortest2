package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.text.Editable;
import android.util.LongSparseArray;
import android.view.View;
import androidx.camera.video.c;
import androidx.camera.video.g;
import androidx.camera.video.internal.audio.AudioSourceAccessException;
import androidx.camera.video.internal.audio.d;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.cloudwebrtc.webrtc.utils.AnyThreadResult;
import com.cloudwebrtc.webrtc.utils.AnyThreadSink;
import com.yandex.go.address.models.FavoriteAddress;
import com.yandex.go.address.models.PlaceType;
import com.yandex.go.navigator.alt_select.AltSelectModalView;
import com.yandex.go.quark.ai_assistant.impl.ui.AiAssistantModalView;
import com.yandex.go.taxi.order.communications.e;
import com.ybsdk.core.transfer.utils.AmountResizeTextWatcher;
import org.webrtc.MediaStreamTrack;
import ru.yandex.taxi.address.clarification.impl.ui.AddressAdjustmentModalView;
import ru.yandex.taxi.analytics.Events$Suggest$ZeroSuggestAdditionalTapArea;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.common_models.net.map_object.j;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.design.ListItemInputComponent;
import ru.yandex.taxi.preorder.suggested.selection.a;
import ru.yandex.taxi.sdc.presentation.AcceptEulaDialogV2;
import ru.yandex.taxi.sdc.router.b;
import ru.yandex.taxi.search.fragment.AddressMapPickerFragment;
import ru.yandex.taxi.view.AddFavoritesModalView;
import ru.yandex.taxi.widget.dialog.AlertDialogModalView;

/* loaded from: classes6.dex */
public final /* synthetic */ class hc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hc(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lr0 binding;
        int i = this.a;
        int i2 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                AcceptEulaDialogV2._init_$lambda$0((AcceptEulaDialogV2) obj2, (nzc) obj);
                return;
            case 1:
                ((b) obj2).r(new pc((bd) obj, i2));
                return;
            case 2:
                ((e) obj2).h0.a((Uri) obj, DeeplinkSource.TOTW_COMMUNICATIONS);
                return;
            case 3:
                ((md0) obj2).S.Ia((PlaceType) obj);
                return;
            case 4:
                AddFavoritesModalView.lambda$3$0((AddFavoritesModalView) obj2, (ListItemInputComponent) obj);
                return;
            case 5:
                AddFavoritesModalView.dismissModalView$lambda$0((AddFavoritesModalView) obj2, (FavoriteAddress) obj);
                return;
            case 6:
                x9v0 x9v0Var = (x9v0) obj2;
                a aVar = (a) obj;
                yn0 yn0Var = x9v0Var.D;
                if (yn0Var != null) {
                    aVar.P.Ue(yn0Var, x9v0Var.A, x9v0Var.B, Events$Suggest$ZeroSuggestAdditionalTapArea.ITEM);
                    return;
                }
                return;
            case 7:
                AddressAdjustmentModalView addressAdjustmentModalView = (AddressAdjustmentModalView) obj2;
                binding = addressAdjustmentModalView.getBinding();
                addressAdjustmentModalView.smoothScrollToCenteredPosition(binding.c, ((er0) obj).b);
                return;
            case 8:
                AddressMapPickerFragment.onUnsupportedTaxiAddress$lambda$1((AddressMapPickerFragment) obj2, (String) obj);
                return;
            case 9:
                n31 n31Var = (n31) obj2;
                n31Var.A((w71) n31Var.I.getValue(), new s71(((avj0) n31Var.D).h(kyh0.search_source_address_hint), ((l31) obj).b, true, false, true), (m31) n31Var.J.getValue());
                return;
            case 10:
                ((ax4) obj2).t((pv0) obj);
                return;
            case 11:
                ru.yandex.taxi.search.address.view.a aVar2 = (ru.yandex.taxi.search.address.view.a) obj2;
                j jVar = (j) obj;
                tls tlsVar = (tls) aVar2.j.a.get();
                if (tlsVar != null) {
                    tlsVar.invoke(jVar);
                    return;
                }
                aVar2.e.b(new n61(aVar2, jVar.d, new d4(21, aVar2), i2), Events$Zalogin$LoginContext.SUMMARY);
                return;
            case 12:
                AiAssistantModalView.animateShow$lambda$0((Runnable) obj2, (AiAssistantModalView) obj);
                return;
            case 13:
                AlertDialogModalView.setupButton$lambda$0((sls) obj2, (AlertDialogModalView) obj);
                return;
            case 14:
                AltSelectModalView.renderContentState$lambda$3((ov1) obj2, (AltSelectModalView) obj);
                return;
            case 15:
                AmountResizeTextWatcher.afterTextChanged$lambda$0((AmountResizeTextWatcher) obj2, (Editable) obj);
                return;
            case 16:
                yta1.a((AndroidContentCaptureManager) obj2, (LongSparseArray) obj);
                return;
            case 17:
                ((odv) obj).r((tis0) obj2);
                return;
            case 18:
                Runnable runnable = (Runnable) obj;
                if (((Fragment) obj2).isAdded()) {
                    runnable.run();
                    return;
                }
                return;
            case 19:
                eh2 eh2Var = (eh2) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (eh2Var.a.a.w.a(Lifecycle.State.STARTED)) {
                    runnable2.run();
                }
                eh2Var.b.a = true;
                return;
            case 20:
                View view = (View) obj;
                ((lzu0) obj2).invoke(view);
                view.animate().alpha(1.0f).setDuration(100L).start();
                return;
            case 21:
                ((AnyThreadResult) obj2).lambda$success$0(obj);
                return;
            case 22:
                ((AnyThreadSink) obj2).lambda$success$0(obj);
                return;
            case 23:
                ir2 ir2Var = (ir2) obj2;
                try {
                    ((Runnable) obj).run();
                    return;
                } finally {
                    ir2Var.a();
                }
            case 24:
                ((tls) obj2).invoke(((sls) obj).invoke());
                return;
            case 25:
                eg3.a = (AudioManager) ((Context) obj2).getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                ((cyd) obj).d();
                return;
            case 26:
                xg3 xg3Var = (xg3) ((h0w) obj2).c;
                int i3 = tw21.a;
                xg3Var.onAudioDecoderReleased((String) obj);
                return;
            case 27:
                d dVar = (d) obj2;
                fzn fznVar = (fzn) obj;
                int ordinal = dVar.g.ordinal();
                if (ordinal == 0 || ordinal == 1) {
                    if (dVar.l != fznVar) {
                        dVar.b(fznVar);
                        return;
                    }
                    return;
                } else {
                    if (ordinal != 2) {
                        return;
                    }
                    ny61.f("AudioSource is released");
                    return;
                }
            case 28:
                ((g) ((o8g0) obj).b).h0 = ((d) obj2).t;
                return;
            default:
                o8g0 o8g0Var = (o8g0) obj2;
                Throwable th = (Throwable) obj;
                o8g0Var.getClass();
                sgb1.e("Recorder", "Error occurred after audio source started.", th);
                if (th instanceof AudioSourceAccessException) {
                    ((c) o8g0Var.a).accept(th);
                    return;
                }
                return;
        }
    }
}
