package xsna;

import com.vk.comments.core.BoardComment;
import java.util.function.Function;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class wi7 implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wi7(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return (BoardComment) ((ol) this.b).invoke(obj);
            default:
                return ((mky0) this.b).h(((Integer) obj).intValue());
        }
    }
}
