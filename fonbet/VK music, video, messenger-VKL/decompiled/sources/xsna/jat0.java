package xsna;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.libvideo.api.quality.QualitySettingsType;
import com.vkontakte.android.R;
import xsna.dw20;
import xsna.iat0;
import xsna.nzl;

/* compiled from: VideoQualityNewSettingsBottomSheet.kt */
/* loaded from: classes2.dex */
public final class jat0 extends kq6 {
    public final Activity c;
    public final d3b0 d;
    public final ebs0 e;
    public final dz20 f;

    public jat0(FragmentActivity fragmentActivity, d3b0 d3b0Var, ebs0 ebs0Var, dz20 dz20Var) {
        this.c = fragmentActivity;
        this.d = d3b0Var;
        this.e = ebs0Var;
        this.f = dz20Var;
    }

    @Override // xsna.kq6
    public final dw20 a() {
        iat0 iat0Var = new iat0(new fyd0(this, 24), new a());
        Activity activity = this.c;
        RecyclerView recyclerView = new RecyclerView(activity);
        dw20.b v0 = new dw20.b(activity, null).v0(R.string.video_quality_new_settings);
        recyclerView.setAdapter(iat0Var);
        recyclerView.setLayoutManager(new LinearLayoutManager());
        dw20.b D0 = v0.D0(recyclerView, false);
        dhr0.a.getClass();
        return D0.u0(dhr0.u().c).t().c(new us90(activity, new nzl.a(1.0f))).a0(new yqd0(this, 21)).d0(new uyq0(this, 5)).I0(null);
    }

    /* compiled from: VideoQualityNewSettingsBottomSheet.kt */
    public static final class a implements iat0.a {
        public a() {
        }

        @Override // xsna.iat0.a
        public final void a(QualitySettingsType qualitySettingsType) {
            fxc0.B().q0(qualitySettingsType);
            jat0 jat0Var = jat0.this;
            jat0Var.e.bk(new fat0(jat0Var.d, qualitySettingsType));
        }

        @Override // xsna.iat0.a
        public final void b() {
        }
    }
}
