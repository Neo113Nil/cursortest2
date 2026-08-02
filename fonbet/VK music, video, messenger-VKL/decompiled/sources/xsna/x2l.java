package xsna;

import com.vk.debug.ui.dev.DebugDevImageFragment;
import com.vk.httpexecutor.api.NetworkClient;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import kotlin.collections.EmptyList;
import okhttp3.p;
import org.json.JSONArray;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class x2l implements Callable {
    public final /* synthetic */ int b = 0;

    public /* synthetic */ x2l() {
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.b) {
            case 0:
                int i = DebugDevImageFragment.U;
                o260 o260Var = d260.a;
                if (o260Var == null) {
                    o260Var = null;
                }
                o260Var.getClass();
                okhttp3.o b = o260Var.b(NetworkClient.ClientType.CLIENT_DEFAULT);
                p.a aVar = new p.a();
                aVar.d();
                aVar.i("https://gist.githubusercontent.com/fanruten/f7d0b874e64c3d19d5653823121021b7/raw/test_images.json");
                okhttp3.u execute = ((f8f0) b.a(aVar.b())).execute();
                okhttp3.v vVar = execute.h;
                String string = vVar != null ? vVar.string() : null;
                x2r0.c(execute);
                try {
                    return f370.O(new JSONArray(string));
                } catch (Exception unused) {
                    return EmptyList.b;
                }
            default:
                return q7h0.a(System.currentTimeMillis(), TimeZone.getDefault().getID(), Locale.getDefault());
        }
    }

    public /* synthetic */ x2l(q7h0 q7h0Var) {
    }
}
