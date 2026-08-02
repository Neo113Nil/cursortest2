package xsna;

import android.app.Activity;
import android.view.LayoutInflater;
import androidx.fragment.app.FragmentActivity;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import xsna.av20;
import xsna.dw20;
import xsna.kz20;

/* compiled from: VideoSubtitlesBottomSheet.kt */
/* loaded from: classes2.dex */
public final class yit0 extends kq6 {
    public final Activity c;
    public final d3b0 d;
    public final ebs0 e;
    public final dz20 f;
    public final one.video.player.tracks.b g;
    public final List<one.video.player.tracks.b> h;

    /* compiled from: VideoSubtitlesBottomSheet.kt */
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

    public yit0(FragmentActivity fragmentActivity, d3b0 d3b0Var, ebs0 ebs0Var, kz20.b bVar, one.video.player.tracks.b bVar2, List list) {
        this.c = fragmentActivity;
        this.d = d3b0Var;
        this.e = ebs0Var;
        this.f = bVar;
        this.g = bVar2;
        this.h = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.kq6
    public final dw20 a() {
        ArrayList arrayList = new ArrayList();
        Activity activity = this.c;
        String string = activity.getString(R.string.video_playback_subtitles_off);
        one.video.player.tracks.b bVar = this.g;
        arrayList.add(new a(R.id.video_subtitles_off, string, bVar == null));
        Iterator it = j5g.W0(this.h).iterator();
        while (true) {
            ztw ztwVar = (ztw) it;
            String str = null;
            if (!ztwVar.b.hasNext()) {
                av20.a aVar = new av20.a();
                dhr0.a.getClass();
                int i = dhr0.u().c;
                aVar.d(R.layout.actions_popup_item, LayoutInflater.from(new l7s(activity, dhr0.u().c)));
                aVar.d = new zit0();
                aVar.c(new coj(this, 6));
                av20 b = aVar.b();
                b.setItems(arrayList);
                return ((dw20.b) dw20.a.k(new dw20.b(activity, null).a0(new dck0(this, 17)).d0(new mqe0(this, 29)), b, 4)).f0(new gqq0(this, 2)).I0("video_subtitles");
            }
            xtw xtwVar = (xtw) ztwVar.next();
            int i2 = xtwVar.a;
            one.video.player.tracks.b bVar2 = (one.video.player.tracks.b) xtwVar.b;
            String str2 = ((who0) bVar2.c).c;
            if (str2 == null) {
                str2 = "";
            }
            String displayLanguage = new Locale(str2, "").getDisplayLanguage();
            if (displayLanguage.length() > 0) {
                displayLanguage = displayLanguage.substring(0, 1).toUpperCase(Locale.ROOT).concat(displayLanguage.substring(1));
            }
            if (bVar2.d) {
                StringBuilder b2 = v1v.b(displayLanguage, ' ');
                b2.append(activity.getString(R.string.video_subtitle_auto_suffix));
                displayLanguage = b2.toString();
            }
            String str3 = bVar2.b;
            if (bVar != null) {
                str = bVar.b;
            }
            arrayList.add(new a(i2, displayLanguage, epx.f(str3, str)));
        }
    }
}
