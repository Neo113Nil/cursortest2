package xsna;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.a;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.music.bottomsheets.audiobook.AudioBookChapterBottomSheetLaunchPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.dh6;
import xsna.pe4;
import xsna.tzp0;

/* compiled from: AudioBookChapterBottomSheet.kt */
/* loaded from: classes3.dex */
public final class zd4 extends vpi {
    public static final /* synthetic */ int g1 = 0;

    /* compiled from: AudioBookChapterBottomSheet.kt */
    public static final class a extends wpi {
        public final AudioBookChapterBottomSheetLaunchPoint.RemoveDownload g;

        public a(Context context, AudioBookChapterBottomSheetLaunchPoint.RemoveDownload removeDownload) {
            super(context, new d());
            this.g = removeDownload;
            F0(true);
            J();
            n0(0);
            o0(0);
            p0(0);
            m0(0);
            N0();
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            zd4 zd4Var = new zd4();
            Bundle bundle = new Bundle();
            bundle.putParcelable("launch_screen", this.g);
            zd4Var.setArguments(bundle);
            return zd4Var;
        }
    }

    /* compiled from: AudioBookChapterBottomSheet.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<pe4, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(pe4 pe4Var) {
            zd4 zd4Var = (zd4) this.receiver;
            int i = zd4.g1;
            zd4Var.getClass();
            if (!epx.f(pe4Var, pe4.a.a)) {
                throw new NoWhenBranchMatchedException();
            }
            zd4Var.dismiss();
            return s3q0.a;
        }
    }

    /* compiled from: AudioBookChapterBottomSheet.kt */
    public static final class c implements m0q0 {
        public final MobileOfficialAppsCoreNavStat$EventScreen b;

        public c(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
            this.b = mobileOfficialAppsCoreNavStat$EventScreen;
        }

        @Override // xsna.m0q0
        public final void y(UiTrackingScreen uiTrackingScreen) {
            uiTrackingScreen.a = this.b;
        }
    }

    /* compiled from: AudioBookChapterBottomSheet.kt */
    public static final class d implements dh6.a {
        public final /* synthetic */ tzp0.c.a b = new tzp0.c.a(new c(MobileOfficialAppsCoreNavStat$EventScreen.DIALOG_MODAL), false);

        @Override // xsna.dh6.a
        public final void a() {
            this.b.d();
        }

        @Override // xsna.dh6.a
        public final void b() {
            this.b.c();
        }
    }

    @Override // xsna.vpi
    public final void Zn(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-863432689);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-863432689, i2, -1, "com.vk.music.bottomsheets.audiobook.chapter.presentation.fragment.AudioBookChapterBottomSheet.Content (AudioBookChapterBottomSheet.kt:25)");
            }
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new com.vk.movika.sdk.base.ui.g(this, 10);
                M.R(x);
            }
            qe4 qe4Var = (qe4) qeg0.a(String.valueOf(n34.m(M)), (gzs) x, M, 0);
            boolean z2 = i3 == 4;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new b(1, this, zd4.class, "handleEvent", "handleEvent(Lcom/vk/music/bottomsheets/audiobook/chapter/presentation/feature/AudioBookChapterMviEvent;)V", 0);
                M.R(x2);
            }
            new le4((izs) ((fcy) x2)).a(qe4Var, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new yd4(this, i, 0);
        }
    }
}
