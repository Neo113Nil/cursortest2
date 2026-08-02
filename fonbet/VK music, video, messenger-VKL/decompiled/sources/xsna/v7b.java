package xsna;

import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.CellLeftTooltipType;
import com.vk.dto.common.id.UserId;
import kotlin.NoWhenBranchMatchedException;
import xsna.gjf;
import xsna.jun0;
import xsna.lbf;
import xsna.n7b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class v7b implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ v7b(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.invoke(n7b.f.b);
                return s3q0.a;
            case 1:
                int i = gjf.a.$EnumSwitchMapping$0[((CellLeftTooltipType) obj).ordinal()];
                izs izsVar = this.c;
                if (i == 1) {
                    izsVar.invoke(lbf.c.a.b.b);
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    izsVar.invoke(lbf.c.a.g.b);
                }
                return s3q0.a;
            case 2:
                this.c.invoke(new g7i((String) obj, 1));
                return s3q0.a;
            default:
                nvn0.o.getClass();
                this.c.invoke(new jun0.e(nvn0.r, (UserId) obj));
                return s3q0.a;
        }
    }
}
