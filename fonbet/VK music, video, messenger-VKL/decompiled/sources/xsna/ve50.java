package xsna;

import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;
import com.vk.music.bottomsheets.domain.model.MixData;
import com.vk.music.bottomsheets.settings.presentation.LoadMixSettingsStateValue;
import com.vk.music.mix.MixSettingsComponent;
import com.vk.music.model.di.AudioModelsComponent;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.dw20;
import xsna.gm50;
import xsna.mk50;
import xsna.ue50;
import xsna.xn50;

/* compiled from: MusicVkMixSettingsBottomSheet.kt */
/* loaded from: classes3.dex */
public final class ve50 extends tl50<we50, df50, ue50> {
    public static final /* synthetic */ int j1 = 0;
    public bf50 i1;

    /* compiled from: MusicVkMixSettingsBottomSheet.kt */
    public static final class a extends dw20.b {
        public final Bundle e;

        public a(ContextWrapper contextWrapper, MixData mixData, MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint, boolean z) {
            super(contextWrapper, tzp0.a(null, 3));
            this.e = yfb.b(new Pair("KEY_MIX_DATA", mixData), new Pair("LAUNCH_POINT", musicBottomSheetLaunchPoint), new Pair("KEY_FORCE_DARK_THEME", Boolean.valueOf(z)));
            N0();
            C(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            ve50 ve50Var = new ve50();
            ve50Var.setArguments(this.e);
            return ve50Var;
        }
    }

    /* compiled from: MusicVkMixSettingsBottomSheet.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<ue50, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(ue50 ue50Var) {
            ve50 ve50Var = (ve50) this.receiver;
            ve50Var.getClass();
            xn50.a.c(ve50Var, ue50Var);
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
        this.i1 = new bf50(requireArguments().getBoolean("KEY_FORCE_DARK_THEME", false) ? bwt0.u(requireContext()) : requireContext(), this, new b(1, this, ve50.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0));
        bf50 bf50Var = this.i1;
        if (bf50Var == null) {
            bf50Var = null;
        }
        this.e0 = new jgj(bf50Var.d, 0, cn70.b(375), 42);
        bf50 bf50Var2 = this.i1;
        return new mk50.c((bf50Var2 != null ? bf50Var2 : null).d);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        df50 df50Var = (df50) ao50Var;
        gm50.a.b(this, df50Var.a, new nt10(this, 8));
        gm50.a.b(this, df50Var.c, new t440(this, 4));
        gm50.a.b(this, df50Var.b, new mi10(this, 7));
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((we50) vk50Var).h.a(new xd40(this, 3), this);
    }

    public final MixData co() {
        Parcelable parcelable;
        Object parcelable2;
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = arguments.getParcelable("KEY_MIX_DATA", MixData.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable3 = arguments.getParcelable("KEY_MIX_DATA");
                if (!(parcelable3 instanceof MixData)) {
                    parcelable3 = null;
                }
                parcelable = (MixData) parcelable3;
            }
            MixData mixData = (MixData) parcelable;
            if (mixData != null) {
                return mixData;
            }
        }
        return new MixData("", "", "", "", false, null);
    }

    @Override // xsna.dw20, xsna.dh6, androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        xn50.a.c(this, ue50.b.b);
        super.onDismiss(dialogInterface);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new we50(new ze50(new cf50(LoadMixSettingsStateValue.COMPLETED, co().b, co().g, bo(bundle))), new ue50.c(co(), bo(bundle)), ((AudioModelsComponent) m7m.d(this).a(fpf0.a(AudioModelsComponent.class))).r(), ((MixSettingsComponent) m7m.d(this).a(fpf0.a(MixSettingsComponent.class))).af());
    }
}
