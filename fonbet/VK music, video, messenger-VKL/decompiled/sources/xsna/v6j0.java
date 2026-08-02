package xsna;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.VideoFile;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.video.ui.share.api.StatsArguments;
import com.vk.video.ui.share.api.VideoShareArguments;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.mk50;
import xsna.tzp0;

/* compiled from: ShareBottomSheet.kt */
/* loaded from: classes7.dex */
public final class v6j0 extends tl50<l7j0, t9j0, t6j0> {
    public static final c p1;
    public static final /* synthetic */ qcy<Object>[] q1;
    public static final tzp0.c.a r1;
    public boolean j1;
    public v7j0 k1;
    public VideoShareArguments l1;
    public VideoFile m1;
    public final nf3 i1 = new nf3();
    public final bpn0 n1 = new bpn0(new ye80(this, 15));
    public final bpn0 o1 = new bpn0(new akd0(this, 9));

    /* compiled from: ShareBottomSheet.kt */
    public static final class a extends wpi {
        public VideoShareArguments g;
        public VideoFile h;

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            v6j0 v6j0Var = new v6j0();
            v6j0Var.setArguments(yfb.b(new Pair("SHARE_ARGUMENTS", this.g), new Pair("VIDEO_FILE", this.h)));
            return v6j0Var;
        }
    }

    /* compiled from: ShareBottomSheet.kt */
    public static final class b implements m0q0 {
        @Override // xsna.m0q0
        public final void y(UiTrackingScreen uiTrackingScreen) {
            uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.SHARE;
        }
    }

    /* compiled from: ShareBottomSheet.kt */
    public static final class c {
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(v6j0.class, "contentView", "getContentView()Lcom/vk/video/ui/share/impl/presentation/views/ShareBottomSheetView;", 0);
        fpf0.a.getClass();
        q1 = new qcy[]{mutablePropertyReference1Impl};
        p1 = new c();
        r1 = new tzp0.c.a(new b(), false);
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        f7j0 f7j0Var = new f7j0(requireContext(), this, this.j1);
        qcy<Object>[] qcyVarArr = q1;
        qcy<Object> qcyVar = qcyVarArr[0];
        nf3 nf3Var = this.i1;
        nf3Var.c = f7j0Var;
        this.e0 = new jgj(((f7j0) nf3Var.getValue(this, qcyVarArr[0])).c(), 0, 0, 62);
        return new mk50.c(((f7j0) nf3Var.getValue(this, qcyVarArr[0])).c());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ((f7j0) this.i1.getValue(this, q1[0])).f((t9j0) ao50Var, new sec(1, this, v6j0.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 8));
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((l7j0) vk50Var).f.a(new nt10(this, 23), this);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Parcelable parcelable;
        Parcelable parcelable2;
        Object parcelable3;
        Object parcelable4;
        Bundle requireArguments = requireArguments();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            parcelable4 = requireArguments.getParcelable("SHARE_ARGUMENTS", VideoShareArguments.class);
            parcelable = (Parcelable) parcelable4;
        } else {
            Parcelable parcelable5 = requireArguments.getParcelable("SHARE_ARGUMENTS");
            if (!(parcelable5 instanceof VideoShareArguments)) {
                parcelable5 = null;
            }
            parcelable = (VideoShareArguments) parcelable5;
        }
        this.l1 = (VideoShareArguments) parcelable;
        Bundle requireArguments2 = requireArguments();
        if (i >= 33) {
            parcelable3 = requireArguments2.getParcelable("VIDEO_FILE", VideoFile.class);
            parcelable2 = (Parcelable) parcelable3;
        } else {
            Parcelable parcelable6 = requireArguments2.getParcelable("VIDEO_FILE");
            if (!(parcelable6 instanceof VideoFile)) {
                parcelable6 = null;
            }
            parcelable2 = (VideoFile) parcelable6;
        }
        this.m1 = (VideoFile) parcelable2;
        VideoShareArguments videoShareArguments = this.l1;
        this.j1 = (videoShareArguments == null ? null : videoShareArguments).d;
        StatsArguments statsArguments = (videoShareArguments == null ? null : videoShareArguments).e;
        if (videoShareArguments == null) {
            videoShareArguments = null;
        }
        this.k1 = new v7j0(statsArguments, videoShareArguments.c);
        VideoFile videoFile = this.m1;
        VideoShareArguments videoShareArguments2 = this.l1;
        if (videoShareArguments2 == null) {
            videoShareArguments2 = null;
        }
        String str = videoShareArguments2.b;
        ArrayList arrayList = new ArrayList();
        Context mo2getContext = mo2getContext();
        if (mo2getContext != null) {
            try {
                try {
                    mo2getContext.getPackageManager().getPackageInfo("org.telegram.messenger", 1);
                    arrayList.add(new n9j0(R.string.video_share_dialog_tg, R.drawable.vk_icon_logo_telegram_color_56, "org.telegram.messenger"));
                } catch (Exception unused) {
                    mo2getContext.getPackageManager().getPackageInfo("org.telegram.messenger.web", 1);
                    arrayList.add(new n9j0(R.string.video_share_dialog_tg, R.drawable.vk_icon_logo_telegram_color_56, "org.telegram.messenger.web"));
                }
            } catch (Exception unused2) {
            }
            try {
                mo2getContext.getPackageManager().getPackageInfo("com.whatsapp", 1);
                arrayList.add(new n9j0(R.string.video_share_dialog_wa, R.drawable.vk_icon_logo_whatsapp_color_56, "com.whatsapp"));
            } catch (Exception unused3) {
            }
            arrayList.add(new n9j0(R.string.video_share_dialog_vk, R.drawable.vk_icon_vk_logo_monochrome_circle_blue_56, "com.vkontakte.android"));
            try {
                mo2getContext.getPackageManager().getPackageInfo("ru.oneme.app", 1);
                arrayList.add(new n9j0(R.string.video_share_dialog_max, R.drawable.vk_icon_logo_max_circle_color_56, "ru.oneme.app"));
            } catch (Exception unused4) {
            }
        }
        VideoShareArguments videoShareArguments3 = this.l1;
        if (videoShareArguments3 == null) {
            videoShareArguments3 = null;
        }
        return new l7j0(new s7j0(new u7j0(videoFile, str, arrayList, videoShareArguments3.c, true)));
    }
}
