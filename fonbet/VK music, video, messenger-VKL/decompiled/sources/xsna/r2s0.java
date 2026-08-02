package xsna;

import android.app.Activity;
import android.view.LayoutInflater;
import androidx.fragment.app.FragmentActivity;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import xsna.av20;
import xsna.dw20;
import xsna.kz20;

/* compiled from: VideoAudioBottomSheet.kt */
/* loaded from: classes2.dex */
public final class r2s0 extends kq6 {
    public final Activity c;
    public final d3b0 d;
    public final ebs0 e;
    public final dz20 f;
    public final one.video.player.tracks.a g;
    public final List<one.video.player.tracks.a> h;

    /* compiled from: VideoAudioBottomSheet.kt */
    public static final class a {
        public final int a;
        public final String b;
        public final boolean c;

        public a(int i, String str, boolean z) {
            this.a = i;
            this.b = str;
            this.c = z;
        }
    }

    public r2s0(FragmentActivity fragmentActivity, d3b0 d3b0Var, ebs0 ebs0Var, kz20.b bVar, one.video.player.tracks.a aVar, List list) {
        this.c = fragmentActivity;
        this.d = d3b0Var;
        this.e = ebs0Var;
        this.f = bVar;
        this.g = aVar;
        this.h = list;
    }

    @Override // xsna.kq6
    public final dw20 a() {
        List<one.video.player.tracks.a> list = this.h;
        Activity activity = this.c;
        Set entrySet = s3t0.a(activity, list).entrySet();
        ArrayList arrayList = new ArrayList(c5g.u(entrySet, 10));
        int i = 0;
        for (Object obj : entrySet) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj;
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (str2.length() > 0) {
                str2 = ((Object) String.valueOf(str2.charAt(0)).toUpperCase(Locale.ROOT)) + str2.substring(1);
            }
            arrayList.add(new a(i, str2, epx.f(str, this.g.b)));
            i = i2;
        }
        av20.a aVar = new av20.a();
        dhr0.a.getClass();
        int i3 = dhr0.u().c;
        aVar.d(R.layout.actions_popup_item, LayoutInflater.from(new l7s(activity, dhr0.u().c)));
        aVar.d = new s2s0();
        aVar.c(new uq5(this, 4));
        av20 b = aVar.b();
        b.setItems(arrayList);
        return ((dw20.b) dw20.a.k(new dw20.b(activity, null).a0(new h6m0(this, 11)).d0(new ikk0(this, 10)), b, 4)).f0(new mdm0(this, 14)).I0("video_audio");
    }
}
