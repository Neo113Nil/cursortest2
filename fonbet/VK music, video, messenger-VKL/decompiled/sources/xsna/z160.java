package xsna;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.vha;

/* compiled from: NestingCatalogUIViewTracker.kt */
/* loaded from: classes16.dex */
public class z160 extends vha {

    /* compiled from: NestingCatalogUIViewTracker.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements wzs<RecyclerView, Integer, c2q0<Object>> {
        @Override // xsna.wzs
        public final c2q0<Object> invoke(RecyclerView recyclerView, Integer num) {
            num.intValue();
            return ((z160) this.receiver).o(recyclerView);
        }
    }

    public z160() {
        super(new s1v(), (dha) null, 4);
    }

    @Override // xsna.vha
    public c2q0<Object> p(RecyclerView recyclerView) {
        return new vha.a(this, recyclerView, new a(2, this, z160.class, "createNestedUiViewedTimeChecker", "createNestedUiViewedTimeChecker(Landroidx/recyclerview/widget/RecyclerView;I)Lcom/vk/core/ui/tracking/views/recycler/viewtime/UiViewedTimeChecker;", 0), null, 8);
    }
}
