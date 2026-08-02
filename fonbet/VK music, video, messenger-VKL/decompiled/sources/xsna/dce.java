package xsna;

import android.view.View;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.music.stats.CoachMarkAction;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class dce implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dce(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                ece eceVar = (ece) this.c;
                izs izsVar = (izs) this.d;
                if (!eceVar.c.a()) {
                    izsVar.invoke(view);
                    break;
                }
                break;
            default:
                ((diu0) this.c).b.a(new n680((UIBlockHint) this.d, CoachMarkAction.CLICK_OUTER_AREA));
                break;
        }
    }
}
