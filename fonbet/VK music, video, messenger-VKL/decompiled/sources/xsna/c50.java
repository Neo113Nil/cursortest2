package xsna;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* compiled from: BottomActionSingleCommunityAdapter.kt */
/* loaded from: classes6.dex */
public final class c50 extends RecyclerView.e0 {
    public static final /* synthetic */ qcy<Object>[] o;
    public static final int p;
    public final TextView l;
    public final ImageView m;
    public final pgn n;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(c50.class, "loadAvatarDisposable", "getLoadAvatarDisposable()Lio/reactivex/rxjava3/disposables/Disposable;", 0);
        fpf0.a.getClass();
        o = new qcy[]{mutablePropertyReference1Impl};
        p = cn70.b(28);
    }

    public c50(ViewGroup viewGroup) {
        super(tf3.b(viewGroup, R.layout.holder_bottom_action_popup, viewGroup, false));
        TextView textView = (TextView) this.itemView.findViewById(R.id.title_action);
        textView.setMaxLines(1);
        this.l = textView;
        this.m = (ImageView) this.itemView.findViewById(R.id.img_action);
        this.n = new pgn();
    }
}
