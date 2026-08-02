package xsna;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.libvideo.api.quality.QualitySettingsType;
import xsna.dw20;
import xsna.iat0;
import xsna.kz20;

/* compiled from: VideoQualityNewBottomSheet.kt */
/* loaded from: classes2.dex */
public final class hat0 extends kq6 {
    public final Activity c;
    public final d3b0 d;
    public final int e;
    public final ebs0 f;
    public final dz20 g;

    /* compiled from: VideoQualityNewBottomSheet.kt */
    public static final class a implements iat0.a {

        /* compiled from: VideoQualityNewBottomSheet.kt */
        /* renamed from: xsna.hat0$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C2981a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[QualitySettingsType.values().length];
                try {
                    iArr[QualitySettingsType.OTHER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public a() {
        }

        @Override // xsna.iat0.a
        public final void a(QualitySettingsType qualitySettingsType) {
            hat0 hat0Var = hat0.this;
            d3b0 d3b0Var = hat0Var.d;
            ebs0 ebs0Var = hat0Var.f;
            if (C2981a.$EnumSwitchMapping$0[qualitySettingsType.ordinal()] == 1) {
                ebs0Var.bk(new y0t0(d3b0Var));
            } else {
                fxc0.B().h0(qualitySettingsType);
                ebs0Var.bk(new fat0(d3b0Var, qualitySettingsType));
            }
            hat0Var.dismiss();
        }

        @Override // xsna.iat0.a
        public final void b() {
            hat0 hat0Var = hat0.this;
            hat0Var.f.bk(new z0t0(hat0Var.d));
            hat0Var.dismiss();
        }
    }

    public hat0(FragmentActivity fragmentActivity, d3b0 d3b0Var, int i, ebs0 ebs0Var, kz20.b bVar) {
        this.c = fragmentActivity;
        this.d = d3b0Var;
        this.e = i;
        this.f = ebs0Var;
        this.g = bVar;
    }

    @Override // xsna.kq6
    public final dw20 a() {
        dw20.a i;
        iat0 iat0Var = new iat0(new q6s0(this, 7), new a());
        Activity activity = this.c;
        RecyclerView recyclerView = new RecyclerView(activity);
        dw20.b bVar = new dw20.b(activity, null);
        recyclerView.setAdapter(iat0Var);
        recyclerView.setLayoutManager(new LinearLayoutManager());
        dw20.b P0 = bVar.D0(recyclerView, true).P0();
        dhr0.a.getClass();
        i = P0.u0(dhr0.u().c).a0(new afl0(this, 18)).d0(new orj0(this, 23)).i(iat0Var, (r3 & 2) == 0, false);
        return ((dw20.b) i).f0(new sxl0(this, 9)).I0("video_quality_new");
    }
}
