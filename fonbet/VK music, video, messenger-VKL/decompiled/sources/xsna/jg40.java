package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.podcast.Podcast;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class jg40 implements Callable {
    public final /* synthetic */ sg40 b;
    public final /* synthetic */ UserId c;
    public final /* synthetic */ Podcast d;

    public /* synthetic */ jg40(sg40 sg40Var, UserId userId, Podcast podcast) {
        this.b = sg40Var;
        this.c = userId;
        this.d = podcast;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Podcast podcast = this.d;
        UserId userId = podcast.c;
        sg40 sg40Var = this.b;
        UserId userId2 = this.c;
        ArrayList e = sg40Var.e(userId2, userId);
        whb0 whb0Var = sg40Var.i;
        whb0Var.f(userId2, userId);
        sg40Var.a.b0(podcast);
        if (whb0Var.c(userId2).isEmpty()) {
            sg40Var.d.b(tt1.a);
        }
        return e;
    }
}
