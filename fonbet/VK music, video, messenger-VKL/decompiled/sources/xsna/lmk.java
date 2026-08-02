package xsna;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.newsfeed.impl.fragments.PostViewFragment;
import com.vk.superapp.api.internal.requests.common.CustomApiRequest;
import java.io.IOException;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import xsna.w3s0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class lmk implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lmk(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                CustomApiRequest customApiRequest = (CustomApiRequest) obj;
                okhttp3.p e = customApiRequest.e();
                String str = customApiRequest.a;
                try {
                    try {
                        try {
                            return new JSONObject(customApiRequest.b(e));
                        } catch (VKApiExecutionException e2) {
                            xgx0.a.getClass();
                            xgx0.d(e2);
                            throw e2;
                        }
                    } catch (IOException e3) {
                        xgx0.a.getClass();
                        xgx0.d(e3);
                        throw customApiRequest.a(str, null);
                    }
                } catch (IOException e4) {
                    xgx0.a.getClass();
                    xgx0.d(e4);
                    throw customApiRequest.a(str, null);
                }
            case 1:
                String[] strArr = PostViewFragment.T0;
                RecyclerView recyclerView = ((PostViewFragment) obj).getRecyclerView();
                if (recyclerView != null) {
                    hl60 hl60Var = hl60.a;
                    hl60.j(PostViewFragment.U0, recyclerView, null, null, 28);
                }
                return s3q0.a;
            default:
                CharSequence h = hd60.a().h(((w3s0.a) obj).a);
                gpt0 gpt0Var = gpt0.a;
                CharSequence i2 = ucp.i(h);
                return !TextUtils.isEmpty(i2) ? i2 : h;
        }
    }
}
