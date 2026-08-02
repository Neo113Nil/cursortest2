package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.log.L;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class o7j0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ o7j0(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean z;
        switch (this.b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                List list = (List) obj;
                break;
            case 7:
                View view = (View) obj;
                if (view instanceof RecyclerView) {
                    RecyclerView recyclerView = (RecyclerView) view;
                    if (recyclerView.isAttachedToWindow() && recyclerView.getWindowVisibility() == 0) {
                        z = true;
                        break;
                    }
                }
                z = false;
                break;
            case 8:
                break;
            case 9:
                int i = ((cbg) obj).c;
                break;
            case 10:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                break;
            case 11:
                break;
            case 12:
                bwr0 bwr0Var = (bwr0) obj;
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                L.E((Throwable) obj, new Object[0]);
                break;
            case 20:
                L.f("VoipViewModel", "Force call finish request failed", (Throwable) obj);
                break;
            default:
                break;
        }
        return s3q0.a;
    }
}
