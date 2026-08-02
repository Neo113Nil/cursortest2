package xsna;

import com.vk.im.ui.views.msg.MsgPartSnippetView;
import java.util.function.Predicate;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class pt30 implements Predicate {
    public final /* synthetic */ int a;

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        String str = (String) obj;
        switch (this.a) {
            case 0:
                int i = MsgPartSnippetView.w;
                return !str.isEmpty();
            default:
                return str.startsWith("CN=");
        }
    }
}
