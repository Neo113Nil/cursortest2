package xsna;

import android.app.Activity;
import android.view.LayoutInflater;
import androidx.fragment.app.FragmentActivity;
import com.vkontakte.android.R;
import kotlin.collections.builders.ListBuilder;
import xsna.av20;
import xsna.dw20;
import xsna.kz20;

/* compiled from: VideoSpeedBottomSheet.kt */
/* loaded from: classes2.dex */
public final class xht0 extends kq6 {
    public final Activity c;
    public final d3b0 d;
    public final ebs0 e;
    public final dz20 f;
    public final float g;
    public final boolean h;

    /* compiled from: VideoSpeedBottomSheet.kt */
    public static final class a {
        public final int a;
        public final float b;
        public final boolean c;

        public a(float f, int i, boolean z) {
            this.a = i;
            this.b = f;
            this.c = z;
        }
    }

    public xht0(FragmentActivity fragmentActivity, d3b0 d3b0Var, ebs0 ebs0Var, kz20.b bVar, float f, boolean z) {
        this.c = fragmentActivity;
        this.d = d3b0Var;
        this.e = ebs0Var;
        this.f = bVar;
        this.g = f;
        this.h = z;
    }

    @Override // xsna.kq6
    public final dw20 a() {
        av20.a aVar = new av20.a();
        Activity activity = this.c;
        dhr0.a.getClass();
        int i = dhr0.u().c;
        aVar.d(R.layout.actions_popup_item, LayoutInflater.from(new l7s(activity, dhr0.u().c)));
        aVar.d = new yht0();
        aVar.e = new zht0(this);
        av20 b = aVar.b();
        ListBuilder e = e43.e();
        boolean z = this.h;
        float f = this.g;
        if (z) {
            e.add(new a(0.25f, R.string.video_playback_speed_025, f == 0.25f));
            e.add(new a(0.5f, R.string.video_playback_speed_050, f == 0.5f));
            e.add(new a(0.75f, R.string.video_playback_speed_075, f == 0.75f));
        }
        e.add(new a(1.0f, R.string.video_playback_speed_normal, f == 1.0f));
        e.add(new a(1.25f, R.string.video_playback_speed_125, f == 1.25f));
        e.add(new a(1.5f, R.string.video_playback_speed_150, f == 1.5f));
        e.add(new a(1.75f, R.string.video_playback_speed_175, f == 1.75f));
        e.add(new a(2.0f, R.string.video_playback_speed_200, f == 2.0f));
        b.setItems(j5g.y0(e.g()));
        return ((dw20.b) dw20.a.k(new dw20.b(activity, null).a0(new d3j0(this, 20)).d0(new ipq0(this, 9)), b, 4)).f0(new wgm0(this, 14)).I0("video_quality");
    }
}
