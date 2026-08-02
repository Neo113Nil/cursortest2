package xsna;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.dto.music.MusicTrack;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import xsna.e3m;

/* compiled from: PlaylistTracksVC.kt */
/* loaded from: classes2.dex */
public final class ueb0 {
    public ghp0 a;
    public ghp0 b;
    public ghp0 c;
    public final Object d = msy.a(LazyThreadSafetyMode.NONE, new k7z(this, 21));

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(List<MusicTrack> list) {
        ghp0 ghp0Var = this.a;
        if (ghp0Var == null) {
            ghp0Var = null;
        }
        int w = iah0.w(ghp0Var.b.getContext());
        int a = iah0.a(360);
        ?? r3 = this.d;
        if (w < a) {
            Iterator it = ((List) r3.getValue()).iterator();
            while (it.hasNext()) {
                f4m.j(((ghp0) it.next()).b);
            }
            return;
        }
        List list2 = (List) r3.getValue();
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            arrayList.add(new Pair((ghp0) obj, j5g.b0(i, list)));
            i = i2;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            ghp0 ghp0Var2 = (ghp0) pair.d();
            MusicTrack musicTrack = (MusicTrack) pair.g();
            if (musicTrack != null) {
                View view = ghp0Var2.b;
                view.setVisibility(0);
                ghp0Var2.g = musicTrack;
                TextView textView = ghp0Var2.c;
                if (textView == null) {
                    textView = null;
                }
                textView.setText(ob50.f(musicTrack));
                TextView textView2 = ghp0Var2.d;
                if (textView2 == null) {
                    textView2 = null;
                }
                textView2.setText(ob50.a(musicTrack));
                ImageView imageView = ghp0Var2.e;
                if (imageView == null) {
                    imageView = null;
                }
                Context context = view.getContext();
                e3m.a aVar = e3m.a;
                imageView.setImageDrawable(m33.a(R.drawable.vk_icon_error_circle_fill_gray_12, context));
                ImageView imageView2 = ghp0Var2.e;
                if (imageView2 == null) {
                    imageView2 = null;
                }
                awt0.v(imageView2, musicTrack.Lb());
            } else {
                f4m.j(ghp0Var2.b);
            }
        }
    }
}
