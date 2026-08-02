package xsna;

import com.vk.dto.newsfeed.entries.Post;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.qn60;

/* compiled from: InsertUserProfileWallPostEditorAction.kt */
/* loaded from: classes4.dex */
public final class z3x implements qn60.b {
    public final Post a;
    public final Integer b;
    public final qtc0 c;
    public final pn60 d;
    public final Object e = msy.a(LazyThreadSafetyMode.NONE, new com.vk.movika.sdk.base.model.props.d(26));

    public z3x(Post post, Integer num, qtc0 qtc0Var, pn60 pn60Var) {
        this.a = post;
        this.b = num;
        this.c = qtc0Var;
        this.d = pn60Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045 A[EDGE_INSN: B:16:0x0045->B:17:0x0045 BREAK  A[LOOP:0: B:2:0x0013->B:21:0x0042], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042 A[SYNTHETIC] */
    @Override // xsna.qn60.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(qn60.a aVar) {
        boolean z;
        fju fjuVar = new fju(this, 2);
        qn60 qn60Var = aVar.a;
        ux80<Object, List<ol60>> ux80Var = qn60Var.b;
        int size = ux80Var.c.size();
        int i = -1;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = ux80Var.c.get(i2);
            Object d = ux80Var.b.d(obj);
            if (d != null) {
                if (obj instanceof Post) {
                    int i3 = ((Post) obj).n;
                    Integer num = this.b;
                    if (num != null && i3 == num.intValue()) {
                        z = true;
                        if (z) {
                            i = i2;
                        }
                        if (!z) {
                            break;
                        }
                    }
                }
                z = false;
                if (z) {
                }
                if (!z) {
                }
            }
        }
        Post post = this.a;
        ux80Var.a(i + 1, post, fjuVar.invoke(post));
        qn60Var.c.a(post);
    }
}
