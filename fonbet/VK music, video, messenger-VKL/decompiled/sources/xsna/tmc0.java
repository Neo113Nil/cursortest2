package xsna;

import com.vk.dto.stories.model.ideas.StoryIdea;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class tmc0 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tmc0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ArrayList arrayList = (ArrayList) this.c;
                umc0 umc0Var = (umc0) this.d;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    umc0Var.f.remove((String) it.next());
                }
                break;
            default:
                hnm0 hnm0Var = (hnm0) this.c;
                hnm0Var.a.n((StoryIdea) this.d);
                break;
        }
    }
}
