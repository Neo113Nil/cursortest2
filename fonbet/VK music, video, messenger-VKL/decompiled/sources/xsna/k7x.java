package xsna;

import android.content.DialogInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.vk.api.generated.adsint.dto.AdsintEventTypeDto;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.dto.stickers.bonus.StickersBonusResult;
import com.vk.instantjobs.InstantJob;
import com.vk.instantjobs.components.appstate.AppState;
import com.vk.stickers.roulette.StickersRouletteFragment;
import com.vk.voip.ui.history.past.presentation.base.fragment.VoipPastCallsFragment;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.h7u0;
import xsna.r7x;
import xsna.to90;
import xsna.xn50;
import xsna.xt0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class k7x implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ k7x(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0120, code lost:
    
        if (r5.getState() == com.vk.instantjobs.components.appstate.AppState.SUSPENDING) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        izs h6gVar;
        int i = this.b;
        boolean z = true;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                r7x r7xVar = (r7x) obj3;
                w6x w6xVar = (w6x) obj2;
                InstantJob.a.e eVar = (InstantJob.a.e) obj;
                boolean e = r7xVar.e(w6xVar);
                r93 r93Var = r7xVar.b;
                if (!e) {
                    return s3q0.a;
                }
                InstantJob instantJob = w6xVar.e;
                if (instantJob.t()) {
                    int i2 = r7x.c.$EnumSwitchMapping$0[instantJob.p().ordinal()];
                    int i3 = 2;
                    if (i2 != 1) {
                        if (i2 != 2 && i2 != 3) {
                            if (i2 == 4) {
                                z = true ^ (r93Var.getState() == AppState.FOREGROUND_UI);
                            } else {
                                if (i2 != 5) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                break;
                            }
                        }
                        h6gVar = new i5n(z, eVar, i3);
                    }
                    z = false;
                    h6gVar = new i5n(z, eVar, i3);
                } else {
                    h6gVar = new h6g(eVar, 24);
                }
                r7xVar.c(new iou(w6xVar, 6), h6gVar);
                int l = instantJob.l(r7xVar.e);
                if (r7xVar.f(l)) {
                    r7xVar.h(l);
                }
                return s3q0.a;
            case 1:
                aw50 aw50Var = (aw50) obj3;
                yv50 yv50Var = (yv50) obj2;
                gzs gzsVar = (gzs) obj;
                aw50Var.c = true;
                try {
                    aw50Var.a.a.zzn();
                    ((zc7) yv50Var.H.getValue()).b(aw50Var.a());
                    gzsVar.invoke();
                    return s3q0.a;
                } catch (RemoteException e2) {
                    throw new RuntimeRemoteException(e2);
                }
            case 2:
                String str = (String) obj3;
                String str2 = (String) obj2;
                AdsintEventTypeDto adsintEventTypeDto = AdsintEventTypeDto.MRC_CLICK;
                int layoutPosition = ((b3d0) obj).getLayoutPosition();
                return new xt0.a(adsintEventTypeDto, str, str2, layoutPosition < 0 ? xt0.c.b.a : new xt0.c.a(layoutPosition));
            case 3:
                StickersRouletteFragment stickersRouletteFragment = (StickersRouletteFragment) obj3;
                String str3 = (String) obj2;
                StickersBonusResult stickersBonusResult = (StickersBonusResult) obj;
                int i4 = StickersRouletteFragment.o0;
                ocl0 ocl0Var = (ocl0) stickersRouletteFragment.S;
                if (ocl0Var != null) {
                    ocl0Var.a5(str3);
                }
                ocl0 ocl0Var2 = (ocl0) stickersRouletteFragment.S;
                if (ocl0Var2 != null) {
                    ocl0Var2.Q0();
                }
                TextView textView = stickersRouletteFragment.U;
                if (textView != null) {
                    textView.setEnabled(true);
                }
                StickersRouletteFragment.a.a(stickersRouletteFragment.kn());
                if (stickersBonusResult != null) {
                    new gl7().a(stickersRouletteFragment.requireContext(), stickersBonusResult);
                }
                return s3q0.a;
            case 4:
                final VoipPastCallsFragment voipPastCallsFragment = (VoipPastCallsFragment) obj2;
                tlo0 tlo0Var = (tlo0) obj;
                int i5 = VoipPastCallsFragment.a0;
                VkContextMenu vkContextMenu = (VkContextMenu) ((Ref$ObjectRef) obj3).element;
                if (vkContextMenu != null) {
                    vkContextMenu.b();
                }
                int i6 = h7u0.p;
                h7u0.a c = h7u0.b.c(voipPastCallsFragment.requireContext());
                c.h0(tlo0Var.a(voipPastCallsFragment.requireContext()));
                c.c0(R.string.voip_clear, new DialogInterface.OnClickListener() { // from class: xsna.suw0
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i7) {
                        int i8 = VoipPastCallsFragment.a0;
                        VoipPastCallsFragment voipPastCallsFragment2 = VoipPastCallsFragment.this;
                        voipPastCallsFragment2.getClass();
                        xn50.a.c(voipPastCallsFragment2, to90.a.b);
                    }
                });
                c.W(R.string.cancel, new ruw0());
                c.m();
                return s3q0.a;
            default:
                return new yno0((FrameLayout) ((b5y0) obj3).F.findViewById(R.id.yandex_native_ad_body_text_container), (h170) obj, (p870) obj2);
        }
    }
}
