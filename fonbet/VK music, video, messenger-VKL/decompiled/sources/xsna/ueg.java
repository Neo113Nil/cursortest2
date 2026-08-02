package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;

/* compiled from: CommentsInteractorFactory.kt */
/* loaded from: classes17.dex */
public interface ueg {

    /* compiled from: CommentsInteractorFactory.kt */
    public static final class a {
        public final UserId a;
        public final String b;
        public final long c;
        public final Context d;
        public final pvn e;
        public final com.vk.comments.impl.a f;
        public final sd9 g;
        public final n3g0 h;

        public a(UserId userId, String str, long j, Context context, pvn pvnVar, com.vk.comments.impl.a aVar, sd9 sd9Var, f3g0 f3g0Var) {
            this.a = userId;
            this.b = str;
            this.c = j;
            this.d = context;
            this.e = pvnVar;
            this.f = aVar;
            this.g = sd9Var;
            this.h = f3g0Var;
        }
    }

    xeg a(a aVar);
}
