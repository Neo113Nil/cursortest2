package xsna;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.vk.dto.music.audiobook.AudioBookPerson;
import com.vk.music.bottomsheets.audiobook.AudioBookPersonBottomSheetLaunchPoint;
import com.vk.music.bottomsheets.audiobook.person.model.AudioBookPersonModel;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.dw20;
import xsna.gm50;
import xsna.mk50;
import xsna.uh4;
import xsna.xn50;

/* compiled from: AudioBookPersonBottomSheet.kt */
/* loaded from: classes3.dex */
public final class zh4 extends tl50<fi4, ui4, uh4> {
    public static final /* synthetic */ int k1 = 0;
    public qi4 i1;
    public final Object j1 = msy.a(LazyThreadSafetyMode.NONE, new vf0(this, 6));

    /* compiled from: AudioBookPersonBottomSheet.kt */
    public static final class a extends dw20.b {
        public final AudioBookPersonBottomSheetLaunchPoint e;
        public final List<AudioBookPerson> f;
        public final AudioBookPerson g;
        public final MusicPlaybackLaunchContext h;
        public final boolean i;

        public a(Activity activity, AudioBookPersonBottomSheetLaunchPoint audioBookPersonBottomSheetLaunchPoint, List list, AudioBookPerson audioBookPerson, MusicPlaybackLaunchContext musicPlaybackLaunchContext, boolean z) {
            super(activity, null);
            this.e = audioBookPersonBottomSheetLaunchPoint;
            this.f = list;
            this.g = audioBookPerson;
            this.h = musicPlaybackLaunchContext;
            this.i = z;
            N0();
            n0(10);
            o0(10);
            m0(10);
            p0(10);
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            zh4 zh4Var = new zh4();
            Bundle bundle = new Bundle();
            List<AudioBookPerson> list = this.f;
            if (list != null) {
                String a = i5s.a(new StringBuilder("https://"), a0a.d, "/audiobook_person");
                List<AudioBookPerson> list2 = list;
                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                for (AudioBookPerson audioBookPerson : list2) {
                    int i = audioBookPerson.b;
                    arrayList.add(new AudioBookPersonModel(i, audioBookPerson.c, a + i, jnj.j(audioBookPerson.g)));
                }
                bundle.putParcelableArrayList("SIMPLE_PERSON_LIST", p4g.q(arrayList));
            } else {
                AudioBookPerson audioBookPerson2 = this.g;
                if (audioBookPerson2 != null) {
                    String a2 = i5s.a(new StringBuilder("https://"), a0a.d, "/audiobook_person");
                    int i2 = audioBookPerson2.b;
                    bundle.putParcelable("SIMPLE_PERSON", new AudioBookPersonModel(i2, audioBookPerson2.c, a2 + i2, jnj.j(audioBookPerson2.g)));
                }
            }
            int i3 = zh4.k1;
            bundle.putParcelable("LAUNCH_SCREEN", this.e);
            bundle.putString("ref", this.h.t());
            bundle.putString("LAUNCH_ORIGIN", this.h.Gb());
            bundle.putBoolean("force_dark_theme", this.i);
            zh4Var.setArguments(bundle);
            return zh4Var;
        }
    }

    /* compiled from: AudioBookPersonBottomSheet.kt */
    public static final class b {
        public static final AudioBookPersonBottomSheetLaunchPoint a(Bundle bundle) {
            Parcelable parcelable;
            Object parcelable2;
            int i = zh4.k1;
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = bundle.getParcelable("LAUNCH_SCREEN", AudioBookPersonBottomSheetLaunchPoint.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable3 = bundle.getParcelable("LAUNCH_SCREEN");
                if (!(parcelable3 instanceof AudioBookPersonBottomSheetLaunchPoint)) {
                    parcelable3 = null;
                }
                parcelable = (AudioBookPersonBottomSheetLaunchPoint) parcelable3;
            }
            AudioBookPersonBottomSheetLaunchPoint audioBookPersonBottomSheetLaunchPoint = (AudioBookPersonBottomSheetLaunchPoint) parcelable;
            if (audioBookPersonBottomSheetLaunchPoint != null) {
                return audioBookPersonBottomSheetLaunchPoint;
            }
            throw new IllegalStateException("Need set launch point");
        }

        public static final AudioBookPersonModel b(Bundle bundle) {
            Parcelable parcelable;
            Object parcelable2;
            int i = zh4.k1;
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = bundle.getParcelable("SIMPLE_PERSON", AudioBookPersonModel.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable3 = bundle.getParcelable("SIMPLE_PERSON");
                if (!(parcelable3 instanceof AudioBookPersonModel)) {
                    parcelable3 = null;
                }
                parcelable = (AudioBookPersonModel) parcelable3;
            }
            return (AudioBookPersonModel) parcelable;
        }
    }

    /* compiled from: AudioBookPersonBottomSheet.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<uh4, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(uh4 uh4Var) {
            zh4 zh4Var = (zh4) this.receiver;
            zh4Var.getClass();
            xn50.a.c(zh4Var, uh4Var);
            return s3q0.a;
        }
    }

    /* compiled from: AudioBookPersonBottomSheet.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<uh4, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(uh4 uh4Var) {
            zh4 zh4Var = (zh4) this.receiver;
            zh4Var.getClass();
            xn50.a.c(zh4Var, uh4Var);
            return s3q0.a;
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        qi4 ni4Var;
        Context u = requireArguments().getBoolean("force_dark_theme", false) ? bwt0.u(requireContext()) : requireContext();
        AudioBookPersonBottomSheetLaunchPoint a2 = b.a(requireArguments());
        if (a2.equals(AudioBookPersonBottomSheetLaunchPoint.AudioBookScreen.b) || a2.equals(AudioBookPersonBottomSheetLaunchPoint.Player.b)) {
            ni4Var = new ni4(u, this, new c(1, this, zh4.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0));
        } else {
            if (!a2.equals(AudioBookPersonBottomSheetLaunchPoint.AudioBookPersonScreen.b)) {
                throw new NoWhenBranchMatchedException();
            }
            ni4Var = new yh4(u, new d(1, this, zh4.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0), this);
        }
        this.i1 = ni4Var;
        qi4 qi4Var = this.i1;
        if (qi4Var == null) {
            qi4Var = null;
        }
        this.e0 = new jgj(qi4Var.getView(), 0, cn70.b(375), 42);
        qi4 qi4Var2 = this.i1;
        return new mk50.c((qi4Var2 != null ? qi4Var2 : null).getView());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ui4 ui4Var = (ui4) ao50Var;
        gm50.a.b(this, ui4Var.a, new yx0(this, 5));
        gm50.a.b(this, ui4Var.b, new d7(this, 4));
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((fi4) vk50Var).f.a(new com.vk.movika.sdk.base.logic.interactor.p(this, 5), this);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        ri4 ri4Var;
        AudioBookPersonBottomSheetLaunchPoint a2 = b.a(requireArguments());
        if (a2.equals(AudioBookPersonBottomSheetLaunchPoint.AudioBookScreen.b) || a2.equals(AudioBookPersonBottomSheetLaunchPoint.Player.b)) {
            Bundle requireArguments = requireArguments();
            ri4Var = new ri4(2, Build.VERSION.SDK_INT >= 33 ? requireArguments.getParcelableArrayList("SIMPLE_PERSON_LIST", AudioBookPersonModel.class) : requireArguments.getParcelableArrayList("SIMPLE_PERSON_LIST"), null);
        } else {
            if (!a2.equals(AudioBookPersonBottomSheetLaunchPoint.AudioBookPersonScreen.b)) {
                throw new NoWhenBranchMatchedException();
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new vh4(R.drawable.vk_icon_copy_outline_28, R.string.copy_link, uh4.b.b));
            arrayList.add(new vh4(R.drawable.vk_icon_share_outline_28, R.string.audio_book_share, uh4.d.b));
            ri4Var = new ri4(1, null, arrayList);
        }
        return new fi4(new pi4(ri4Var));
    }
}
