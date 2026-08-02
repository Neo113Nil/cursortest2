package xsna;

import com.vk.dto.newsfeed.entries.Post;
import xsna.t5c0;

/* compiled from: PostExternalEventsMviTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class v2c0 implements bd70<Object> {
    public final /* synthetic */ w2c0 b;

    public v2c0(w2c0 w2c0Var) {
        this.b = w2c0Var;
    }

    @Override // xsna.bd70
    public final void x0(int i, int i2, Object obj) {
        if (obj instanceof Post) {
            Post post = (Post) obj;
            w2c0 w2c0Var = this.b;
            switch (i) {
                case 149:
                    w2c0Var.a(new t5c0.a.C3720a(post));
                    break;
                case 150:
                    w2c0Var.a(new t5c0.a.c(post));
                    break;
                case 151:
                    w2c0Var.a(new t5c0.a.b(post));
                    break;
            }
        }
    }
}
