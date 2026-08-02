package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.im.ui.views.avatars.AvatarView;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import xsna.ai8;

/* compiled from: BroadcastPreviewExtendedView.kt */
/* loaded from: classes7.dex */
public final class yh8 {

    @SuppressLint({"InflateParams"})
    public final ViewGroup a;
    public final View b;
    public final View c;
    public final View d;
    public final ImageView e;
    public final AvatarView f;
    public final TextView g;
    public final AppCompatImageView h;
    public final View i;
    public final View j;
    public final TextView k;
    public final View l;
    public final View m;
    public final AppCompatTextView n;
    public final bzb0 o;
    public final io.reactivex.rxjava3.subjects.f<zh8> p;
    public ai8 q;
    public io.reactivex.rxjava3.disposables.c r;
    public boolean s;
    public boolean t;

    public yh8(l7s l7sVar) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(l7sVar).inflate(R.layout.voip_broadcast_preview_extended, (ViewGroup) null, false);
        this.a = viewGroup;
        View findViewById = viewGroup.findViewById(R.id.content);
        this.b = findViewById;
        this.c = viewGroup.findViewById(R.id.progress_icon);
        this.d = viewGroup.findViewById(R.id.progress_text);
        this.e = (ImageView) viewGroup.findViewById(R.id.avatar_border);
        this.f = (AvatarView) viewGroup.findViewById(R.id.avatar_icon);
        this.g = (TextView) viewGroup.findViewById(R.id.counter_text);
        this.h = (AppCompatImageView) viewGroup.findViewById(R.id.counter_icon);
        this.i = viewGroup.findViewById(R.id.divider);
        this.j = viewGroup.findViewById(R.id.spectators_count_icon);
        this.k = (TextView) viewGroup.findViewById(R.id.spectators_count_text);
        View findViewById2 = viewGroup.findViewById(R.id.share);
        this.l = findViewById2;
        View findViewById3 = viewGroup.findViewById(R.id.finish);
        this.m = findViewById3;
        AppCompatTextView appCompatTextView = (AppCompatTextView) viewGroup.findViewById(R.id.btn_record_finish);
        this.n = appCompatTextView;
        this.o = new bzb0(l7sVar);
        this.p = new io.reactivex.rxjava3.subjects.f<>();
        this.s = true;
        this.t = true;
        viewGroup.setOnClickListener(new o44(0));
        jjc.g(findViewById, new l5(this, 12));
        jjc.g(findViewById2, new po1(this, 9));
        jjc.g(findViewById3, new ix2(this, 11));
        jjc.g(appCompatTextView, new j9(this, 14));
        c(ai8.b.a);
    }

    public final void a() {
        if (!this.s) {
            throw new IllegalStateException("Instance is destroyed");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097 A[LOOP:0: B:23:0x0091->B:25:0x0097, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(ai8 ai8Var) {
        int i;
        boolean z;
        Iterator it;
        boolean z2 = ai8Var instanceof ai8.a;
        View view = this.j;
        View view2 = this.i;
        TextView textView = this.k;
        if (!z2) {
            bwt0.p0(view2, false);
            bwt0.p0(view, false);
            bwt0.p0(textView, false);
            return;
        }
        ai8.a aVar = (ai8.a) ai8Var;
        xuo0.a.getClass();
        long a = xuo0.a();
        long j = aVar.b;
        boolean z3 = aVar.d;
        long f = uzp.f(a, j);
        x59.a(this.f, aVar.a);
        boolean z4 = f < 0;
        if (z4) {
            i = R.drawable.ic_live_border_pending_32;
        } else {
            if (z4) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.drawable.ic_live_border_active_32;
        }
        this.e.setImageResource(i);
        TextView textView2 = this.g;
        Context context = textView2.getContext();
        if (z3) {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(f);
            if (0 <= seconds && seconds < 5) {
                z = true;
                bwt0.p0(this.h, !z);
                textView2.setText(!z ? context.getString(R.string.voip_broadcast_record_title) : uzp.g(context, f, true));
                boolean z5 = z3 && f >= 0;
                it = e43.l(view2, view, textView).iterator();
                while (it.hasNext()) {
                    bwt0.p0((View) it.next(), z5);
                }
                textView.setText(uqm0.f(aVar.c));
            }
        }
        z = false;
        bwt0.p0(this.h, !z);
        textView2.setText(!z ? context.getString(R.string.voip_broadcast_record_title) : uzp.g(context, f, true));
        if (z3) {
        }
        it = e43.l(view2, view, textView).iterator();
        while (it.hasNext()) {
        }
        textView.setText(uqm0.f(aVar.c));
    }

    public final void c(ai8 ai8Var) {
        if (!this.t) {
            zmp0.a(this.a, new mk5());
        }
        boolean z = ai8Var instanceof ai8.a;
        boolean z2 = z && ((ai8.a) ai8Var).d;
        boolean z3 = !z;
        this.b.setEnabled(z);
        bwt0.p0(this.c, z3);
        bwt0.p0(this.d, z3);
        bwt0.p0(this.e, z);
        bwt0.p0(this.f, z);
        bwt0.p0(this.g, z);
        bwt0.p0(this.n, z2);
        boolean z4 = true ^ z2;
        bwt0.p0(this.l, z4);
        bwt0.p0(this.m, z4);
        b(ai8Var);
        if (z) {
            this.r = io.reactivex.rxjava3.core.q.Q(500L, 500L, TimeUnit.MILLISECONDS, asu0.a.d()).subscribe(new defpackage.z(new com.vk.movika.sdk.base.data.a(this, 14), 9));
            return;
        }
        io.reactivex.rxjava3.disposables.c cVar = this.r;
        if (cVar != null) {
            cVar.dispose();
        }
        this.r = null;
    }
}
