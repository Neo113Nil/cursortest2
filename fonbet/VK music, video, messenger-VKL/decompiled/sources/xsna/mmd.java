package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import xsna.coc;
import xsna.mat;
import xsna.q0j0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class mmd implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ mmd(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.invoke(new coc.e((UserId) obj));
                return s3q0.a;
            case 1:
                this.c.invoke(new mat.a((uet) obj));
                return s3q0.a;
            case 2:
                this.c.invoke((tho0) obj);
                return s3q0.a;
            case 3:
                View inflate = LayoutInflater.from((Context) obj).inflate(R.layout.posting_step2_preview_text, (ViewGroup) null, false);
                inflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                inflate.setOnClickListener(new a50(this.c, 6));
                return inflate;
            default:
                this.c.invoke(new q0j0.j(((Boolean) obj).booleanValue()));
                return s3q0.a;
        }
    }
}
