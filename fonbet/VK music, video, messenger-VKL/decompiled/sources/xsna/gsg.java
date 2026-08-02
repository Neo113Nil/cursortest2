package xsna;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListSmallVh;
import com.vk.donut.video.model.domain.action.DonutVideoAction;
import com.vk.donut.video.model.domain.analytics.source.DonutVideoClickSource;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class gsg implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gsg(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((FunctionReferenceImpl) obj2).invoke(((com.vk.catalog2.common.ui.holders.group.cell.a) obj).a);
                break;
            case 1:
                fsv fsvVar = (fsv) obj2;
                TextView textView = (TextView) obj;
                if (!jjc.b()) {
                    fsvVar.Ig(textView.getId(), 1);
                    break;
                }
                break;
            case 2:
                ((izs) obj2).invoke(((zai0) ((yai0) obj).m).a);
                break;
            case 3:
                zvk0 zvk0Var = (zvk0) obj;
                Activity L = blk.L(((hx0) obj2).b);
                if (L != null) {
                    zvk0Var.a.b(L, new iri0(zvk0Var, 2));
                    break;
                }
                break;
            default:
                VideoItemListSmallVh videoItemListSmallVh = (VideoItemListSmallVh) obj;
                Object obj3 = VideoItemListSmallVh.c0;
                DonutVideoAction donutVideoAction = ((DonutVideoUiModel.PreviewBadge) obj2).e;
                if (donutVideoAction != null) {
                    videoItemListSmallVh.j(donutVideoAction, DonutVideoClickSource.PAYWALL);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ gsg(izs izsVar, com.vk.catalog2.common.ui.holders.group.cell.a aVar) {
        this.b = 0;
        this.c = (FunctionReferenceImpl) izsVar;
        this.d = aVar;
    }
}
