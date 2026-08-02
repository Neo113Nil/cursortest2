package xsna;

import android.view.View;
import com.vk.dto.common.Attachment;

/* compiled from: BaseHolder.kt */
/* loaded from: classes4.dex */
public abstract class ce6 extends com.vk.movika.sdk.base.data.converter.c implements View.OnClickListener {
    public Attachment c;
    public final be6 d;

    public ce6(View view) {
        super(view);
        this.d = new be6(this, 0);
    }

    public abstract void m(Attachment attachment);

    public void onClick(View view) {
        qcy<Object>[] qcyVarArr = bwt0.a;
        if (bwt0.B().b(250L)) {
            return;
        }
        this.d.onClick(view);
    }
}
