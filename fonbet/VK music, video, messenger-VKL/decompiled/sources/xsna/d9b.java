package xsna;

import com.vk.dto.newsfeed.entries.Post;
import com.vkontakte.android.R;
import java.util.Collections;
import xsna.tsb0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class d9b implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d9b(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                i9b i9bVar = (i9b) obj;
                i9bVar.i.c(i9bVar.f.getString(R.string.vkim_channel_was_hidden_from_all_folder), new d7k0(R.string.vkim_channels_return_channel_in_all_folder_action, new vl1(i9bVar, 16)));
                break;
            case 1:
                rtm rtmVar = (rtm) obj;
                if (rtmVar.f.decrementAndGet() == 0) {
                    rtmVar.e.e();
                    break;
                }
                break;
            case 2:
                ((lsb0) obj).U(tsb0.b.a);
                break;
            default:
                Post post = (Post) obj;
                ce60.b.getClass();
                p870.f().e(150, post);
                iuc0 iuc0Var = iuc0.b;
                iuc0.k0(Collections.singletonList(post));
                break;
        }
    }
}
