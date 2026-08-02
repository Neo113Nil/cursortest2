package xsna;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.vk.dto.common.id.UserId;
import java.util.List;

/* compiled from: ClipEditSdkCoauthorsHandler.kt */
/* loaded from: classes17.dex */
public interface jsc {

    /* compiled from: ClipEditSdkCoauthorsHandler.kt */
    public static final class a {
        public final Context a;
        public final FragmentManager b;
        public final f5z c;

        public a(Context context, FragmentManager fragmentManager, f5z f5zVar) {
            this.a = context;
            this.b = fragmentManager;
            this.c = f5zVar;
        }
    }

    boolean a();

    otc b();

    void c(a aVar, List list, UserId userId, int i, fb fbVar);
}
