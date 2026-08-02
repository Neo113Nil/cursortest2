package xsna;

import android.view.View;
import android.view.ViewConfiguration;
import com.vk.dto.common.Attachment;
import xsna.v64;

/* compiled from: BaseHolder.kt */
/* loaded from: classes4.dex */
public abstract class de6<T extends v64<? extends Attachment>> extends g6y0 implements View.OnClickListener {
    public Attachment d;
    public T e;
    public l680 f;
    public s6o g;
    public final a50 h;
    public e6o i;
    public final long j;

    public de6(View view, int i) {
        super(view, i);
        this.h = new a50(this, 2);
        this.j = ViewConfiguration.getDoubleTapTimeout() + 250;
    }

    public abstract void b(Attachment attachment);

    public abstract void c(T t);

    public void d(s6o s6oVar) {
        this.g = s6oVar;
        this.i = new e6o(s6oVar, Long.valueOf(this.j), this.h, s6oVar.e);
    }

    public void onClick(View view) {
        e6o e6oVar = this.i;
        if (e6oVar != null) {
            e6oVar.onClick(view);
            return;
        }
        qcy<Object>[] qcyVarArr = bwt0.a;
        if (bwt0.B().b(250L)) {
            return;
        }
        this.h.onClick(view);
    }
}
