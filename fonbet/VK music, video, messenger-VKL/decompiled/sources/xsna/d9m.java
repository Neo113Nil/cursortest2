package xsna;

import android.view.View;
import com.vk.feed.design.view.newsfeed.topbar.FeedTopBar;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class d9m implements View.OnLongClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d9m(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                e9m e9mVar = (e9m) obj;
                if (e9mVar.isVisible()) {
                    e9mVar.a(true);
                    break;
                }
                break;
            default:
                int i2 = FeedTopBar.p;
                ((FeedTopBar.a.C1056a) ((FeedTopBar.a) obj)).d.invoke();
                break;
        }
        return true;
    }
}
