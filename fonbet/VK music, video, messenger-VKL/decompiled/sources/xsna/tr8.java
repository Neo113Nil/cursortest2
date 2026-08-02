package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.common.Attachment;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.Arrays;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.eno0;
import xsna.tlo0;

/* compiled from: ButtonUnderMediaHolder.kt */
/* loaded from: classes4.dex */
public final class tr8 extends rp6<ur8, NewsEntry> implements View.OnClickListener {
    public final y6u0 E;
    public final Object F;
    public io.reactivex.rxjava3.disposables.c G;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public tr8(ViewGroup viewGroup) {
        super(r1, viewGroup);
        y6u0 y6u0Var = new y6u0(viewGroup.getContext());
        y6u0Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        y6u0 y6u0Var2 = (y6u0) this.itemView;
        y6u0Var2.setOnClickListener(this);
        this.E = y6u0Var2;
        this.F = msy.a(LazyThreadSafetyMode.NONE, new com.vk.movika.sdk.base.model.props.c(6));
    }

    @Override // xsna.qi6
    public final void I6() {
        super.I6();
        io.reactivex.rxjava3.disposables.c cVar = this.G;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // xsna.rp6
    public final void R6(ur8 ur8Var) {
        String string;
        ur8 ur8Var2 = ur8Var;
        Uri uri = ur8Var2.k;
        eno0 eno0Var = ur8Var2.h;
        if (eno0Var instanceof eno0.b) {
            string = ((eno0.b) eno0Var).a;
        } else {
            if (!(eno0Var instanceof eno0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            Context context = this.itemView.getContext();
            eno0.a aVar = (eno0.a) eno0Var;
            int i = aVar.a;
            Object[] array = aVar.b.toArray(new Object[0]);
            string = context.getString(i, Arrays.copyOf(array, array.length));
        }
        tlo0.Companion.getClass();
        tlo0.h hVar = new tlo0.h(string);
        y6u0 y6u0Var = this.E;
        y6u0Var.setText(hVar);
        if (!ur8Var2.j || uri == null) {
            y6u0Var.b.setBackgroundColor(y6u0Var.j);
            y6u0Var.f.setTextColor(y6u0Var.k);
            y6u0Var.g.setColorFilter(y6u0Var.l);
            f4m.j(y6u0Var.h);
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        io.reactivex.rxjava3.disposables.c cVar = this.G;
        if (cVar != null) {
            cVar.dispose();
        }
        io.reactivex.rxjava3.core.q<Bitmap> h = mcr0.h(uri);
        asu0 asu0Var = asu0.a;
        this.G = new io.reactivex.rxjava3.internal.operators.observable.c0(h.r0(asu0Var.c()).a0(asu0Var.d()), new com.vk.im.ui.components.dialogs_list.b(new g60(this, 13), 7), io.reactivex.rxjava3.internal.functions.a.c).subscribe(new eu0(new wg3(this, elapsedRealtime, 1), 5), new fu0(new sr8(this, elapsedRealtime, 0), 5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.vk.feed.core.models.news.NewsEntry] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Attachment attachment;
        s980 s980Var;
        ur8 ur8Var = (ur8) this.C;
        if (ur8Var == null || (attachment = ur8Var.i) == null || (s980Var = this.y) == 0) {
            return;
        }
        s980Var.Hh(view, J0(), q6(), attachment);
    }
}
