package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.vk.core.view.ColorProgressBar;
import com.vk.im.ui.views.avatars.AvatarView;
import com.vkontakte.android.R;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.cw3;

/* compiled from: AsrRecordInProgressView.kt */
/* loaded from: classes7.dex */
public final class aw3 {
    public final l7s a;
    public final ViewGroup b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final bzb0 h;
    public final io.reactivex.rxjava3.subjects.f<bw3> i;
    public cw3 j;
    public boolean k;
    public boolean l;

    public aw3(l7s l7sVar) {
        this.a = l7sVar;
        this.b = (ViewGroup) LayoutInflater.from(l7sVar).inflate(R.layout.voip_asr_preview_extended, (ViewGroup) null, false);
        e4 e4Var = new e4(this, 4);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = msy.a(lazyThreadSafetyMode, e4Var);
        this.d = msy.a(lazyThreadSafetyMode, new il1(this, 4));
        this.e = msy.a(lazyThreadSafetyMode, new gy0(this, 5));
        this.f = msy.a(lazyThreadSafetyMode, new eu1(this, 3));
        Lazy a = msy.a(lazyThreadSafetyMode, new q(this, 4));
        this.g = a;
        this.h = new bzb0(l7sVar);
        this.i = new io.reactivex.rxjava3.subjects.f<>();
        this.k = true;
        this.l = true;
        jjc.g((View) a.getValue(), new hb(this, 5));
        a(cw3.b.a);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(cw3 cw3Var) {
        if (!this.l) {
            zmp0.a(this.b, new mk5());
        }
        boolean z = cw3Var instanceof cw3.c;
        ?? r1 = this.g;
        if (z) {
            bwt0.p0((View) r1.getValue(), ((cw3.c) cw3Var).b);
            b(false);
        } else if (cw3Var instanceof cw3.a) {
            cw3.a aVar = (cw3.a) cw3Var;
            bwt0.p0((View) r1.getValue(), aVar.d);
            b(true);
            x59.a((AvatarView) this.e.getValue(), aVar.a);
            TextView textView = (TextView) this.f.getValue();
            boolean z2 = aVar.c;
            l7s l7sVar = this.a;
            textView.setText(z2 ? l7sVar.getString(R.string.voip_asr_preview_description_my) : l7sVar.getString(R.string.voip_asr_preview_description, aVar.b));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    public final void b(boolean z) {
        awt0.v((AvatarView) this.e.getValue(), z);
        awt0.v((AppCompatImageView) this.c.getValue(), z);
        awt0.v((ColorProgressBar) this.d.getValue(), !z);
    }
}
