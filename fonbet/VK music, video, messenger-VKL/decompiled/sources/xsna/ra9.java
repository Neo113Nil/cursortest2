package xsna;

import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import com.vk.feed.core.models.news.UxPollsEntry;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class ra9 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Parcelable d;

    public /* synthetic */ ra9(Object obj, Parcelable parcelable, int i) {
        this.b = i;
        this.c = obj;
        this.d = parcelable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.b) {
            case 0:
                w5w0 d = ((va9) this.c).d((UserId) this.d);
                return d == null ? va9.r : d;
            default:
                c5r0 c5r0Var = (c5r0) this.c;
                UxPollsEntry uxPollsEntry = (UxPollsEntry) this.d;
                w5r0 w5r0Var = c5r0Var.C;
                if (w5r0Var != null) {
                    return w5r0Var.b(c5r0Var.itemView.getContext(), uxPollsEntry.i);
                }
                return null;
        }
    }
}
