package xsna;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.vk.music.bottomsheets.audiobook.AudioBookBottomSheetLaunchPoint;
import com.vk.music.bottomsheets.audiobook.presentation.model.AudioBookModel;
import com.vk.music.bottomsheets.di.AudioBookBottomSheetComponent;
import com.vk.music.common.MusicPlaybackLaunchContext;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.dw20;
import xsna.gm50;
import xsna.k840;
import xsna.mk50;
import xsna.xn50;

/* compiled from: AudioBookModalBottomSheet.kt */
/* loaded from: classes3.dex */
public final class nh4 extends tl50<ng4, xd4, od4> {
    public static final /* synthetic */ int n1 = 0;
    public vd4 i1;
    public final bpn0 j1 = new bpn0(new kd(this, 8));
    public final Object k1;
    public final Object l1;
    public final Object m1;

    /* compiled from: AudioBookModalBottomSheet.kt */
    public static final class a extends dw20.b {
        public final AudioBookModel e;
        public final AudioBookBottomSheetLaunchPoint f;
        public final MusicPlaybackLaunchContext g;
        public final boolean h;

        public a(Activity activity, AudioBookModel audioBookModel, AudioBookBottomSheetLaunchPoint audioBookBottomSheetLaunchPoint, MusicPlaybackLaunchContext musicPlaybackLaunchContext, boolean z) {
            super(activity, null);
            this.e = audioBookModel;
            this.f = audioBookBottomSheetLaunchPoint;
            this.g = musicPlaybackLaunchContext;
            this.h = z;
            N0();
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            nh4 nh4Var = new nh4();
            Bundle bundle = new Bundle();
            bundle.putParcelable("audio_book", this.e);
            bundle.putParcelable("launch_screen", this.f);
            MusicPlaybackLaunchContext musicPlaybackLaunchContext = this.g;
            bundle.putString("ref", musicPlaybackLaunchContext.t());
            bundle.putString("launch_origin", musicPlaybackLaunchContext.Gb());
            bundle.putBoolean("force_dark_theme", this.h);
            nh4Var.setArguments(bundle);
            return nh4Var;
        }
    }

    /* compiled from: AudioBookModalBottomSheet.kt */
    public static final class b {
        public static final AudioBookModel a(Bundle bundle) {
            Parcelable parcelable;
            Object parcelable2;
            int i = nh4.n1;
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = bundle.getParcelable("audio_book", AudioBookModel.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable3 = bundle.getParcelable("audio_book");
                if (!(parcelable3 instanceof AudioBookModel)) {
                    parcelable3 = null;
                }
                parcelable = (AudioBookModel) parcelable3;
            }
            AudioBookModel audioBookModel = (AudioBookModel) parcelable;
            if (audioBookModel != null) {
                return audioBookModel;
            }
            throw new IllegalStateException("Need set audiobook before open AudioBookBottomSheet");
        }
    }

    /* compiled from: AudioBookModalBottomSheet.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<od4, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(od4 od4Var) {
            nh4 nh4Var = (nh4) this.receiver;
            nh4Var.getClass();
            xn50.a.c(nh4Var, od4Var);
            return s3q0.a;
        }
    }

    public nh4() {
        ld ldVar = new ld(this, 6);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.k1 = msy.a(lazyThreadSafetyMode, ldVar);
        this.l1 = msy.a(lazyThreadSafetyMode, new h6(this, 7));
        this.m1 = msy.a(lazyThreadSafetyMode, new l63(2));
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        this.i1 = new vd4(requireArguments().getBoolean("force_dark_theme", false) ? bwt0.u(requireContext()) : requireContext(), this, new c(1, this, nh4.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0));
        vd4 vd4Var = this.i1;
        if (vd4Var == null) {
            vd4Var = null;
        }
        this.e0 = new jgj(vd4Var.d, 0, cn70.b(375), 42);
        vd4 vd4Var2 = this.i1;
        return new mk50.c((vd4Var2 != null ? vd4Var2 : null).d);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        gm50.a.b(this, ((xd4) ao50Var).a, new v9(this, 4));
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ng4 ng4Var = (ng4) vk50Var;
        ng4Var.j.a(new mh4(0, this, ng4Var), this);
    }

    /* JADX WARN: Type inference failed for: r10v15, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Parcelable parcelable;
        Object parcelable2;
        Bundle requireArguments = requireArguments();
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = requireArguments.getParcelable("launch_screen", AudioBookBottomSheetLaunchPoint.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = requireArguments.getParcelable("launch_screen");
            if (!(parcelable3 instanceof AudioBookBottomSheetLaunchPoint)) {
                parcelable3 = null;
            }
            parcelable = (AudioBookBottomSheetLaunchPoint) parcelable3;
        }
        AudioBookBottomSheetLaunchPoint audioBookBottomSheetLaunchPoint = (AudioBookBottomSheetLaunchPoint) parcelable;
        if (audioBookBottomSheetLaunchPoint == null) {
            throw new IllegalStateException("Need set launchPoint before open AudioBookBottomSheet");
        }
        ch4 Ie = ((AudioBookBottomSheetComponent) m7m.d(this).mo408a(fpf0.a(AudioBookBottomSheetComponent.class))).Ie();
        u2b0 u2b0Var = (u2b0) this.j1.getValue();
        AudioBookModel a2 = b.a(requireArguments());
        s750 s750Var = k840.a.e;
        return new ng4(audioBookBottomSheetLaunchPoint, Ie, a2, u2b0Var, s750Var != null ? s750Var : null, (xl40) this.l1.getValue());
    }
}
