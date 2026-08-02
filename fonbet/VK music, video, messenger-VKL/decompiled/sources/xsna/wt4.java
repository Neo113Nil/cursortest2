package xsna;

import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;
import com.vk.music.bottomsheets.reactions.presentation.LoadReactionsStateValue;
import com.vk.music.offline.configs.api.di.AudioReactionsComponent;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.dw20;
import xsna.gm50;
import xsna.mk50;
import xsna.vt4;
import xsna.xn50;

/* compiled from: AudioReactionsBottomSheet.kt */
/* loaded from: classes3.dex */
public final class wt4 extends tl50<au4, lu4, vt4> {
    public static final /* synthetic */ int k1 = 0;
    public hu4 i1;
    public twi0 j1;

    /* compiled from: AudioReactionsBottomSheet.kt */
    public static final class a extends dw20.b {
        public final twi0 e;
        public final Bundle f;

        public a(ContextWrapper contextWrapper, String str, MusicBottomSheetLaunchPoint.Player.Full full, twi0 twi0Var) {
            super(contextWrapper, tzp0.a(null, 3));
            this.e = twi0Var;
            this.f = yfb.b(new Pair("LAUNCH_POINT", full), new Pair("KEY_FORCE_DARK_THEME", Boolean.TRUE), new Pair("KEY_SELECTED_ID", str));
            N0();
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            wt4 wt4Var = new wt4();
            wt4Var.setArguments(this.f);
            c(new ts90(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3));
            wt4Var.j1 = this.e;
            return wt4Var;
        }
    }

    /* compiled from: AudioReactionsBottomSheet.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<vt4, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(vt4 vt4Var) {
            wt4 wt4Var = (wt4) this.receiver;
            wt4Var.getClass();
            xn50.a.c(wt4Var, vt4Var);
            return s3q0.a;
        }
    }

    public static MusicBottomSheetLaunchPoint bo(Bundle bundle) {
        Parcelable parcelable;
        Object parcelable2;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = bundle.getParcelable("LAUNCH_POINT", MusicBottomSheetLaunchPoint.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = bundle.getParcelable("LAUNCH_POINT");
            if (!(parcelable3 instanceof MusicBottomSheetLaunchPoint)) {
                parcelable3 = null;
            }
            parcelable = (MusicBottomSheetLaunchPoint) parcelable3;
        }
        return (MusicBottomSheetLaunchPoint) parcelable;
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        this.i1 = new hu4(requireArguments().getBoolean("KEY_FORCE_DARK_THEME", false) ? bwt0.u(requireContext()) : requireContext(), this, new b(1, this, wt4.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0));
        hu4 hu4Var = this.i1;
        if (hu4Var == null) {
            hu4Var = null;
        }
        this.e0 = new jgj(hu4Var.d, 0, cn70.b(ApiInvocationException.ErrorCodes.GROUP_RESTRICTION), 42);
        this.K0 = true;
        this.U0 = true;
        hu4 hu4Var2 = this.i1;
        return new mk50.c((hu4Var2 != null ? hu4Var2 : null).d);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        lu4 lu4Var = (lu4) ao50Var;
        gm50.a.b(this, lu4Var.a, new sf1(this, 6));
        gm50.a.b(this, lu4Var.c, new com.vk.im.engine.internal.storage.delegates.messages.b(this, 8));
        gm50.a.b(this, lu4Var.b, new r7(this, 7));
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((au4) vk50Var).i.a(new za(this, 6), this);
    }

    @Override // xsna.dw20, xsna.dh6, androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        xn50.a.c(this, vt4.b.b);
        super.onDismiss(dialogInterface);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        LoadReactionsStateValue loadReactionsStateValue = LoadReactionsStateValue.COMPLETED;
        Bundle arguments = getArguments();
        gu4 gu4Var = new gu4(new ku4(loadReactionsStateValue, null, arguments != null ? arguments.getString("KEY_SELECTED_ID") : null, bo(bundle)));
        MusicBottomSheetLaunchPoint bo = bo(bundle);
        Bundle arguments2 = getArguments();
        return new au4(gu4Var, new vt4.c(arguments2 != null ? arguments2.getString("KEY_SELECTED_ID") : null, bo), this.j1, ((AudioReactionsComponent) m7m.d(this).a(fpf0.a(AudioReactionsComponent.class))).b());
    }
}
