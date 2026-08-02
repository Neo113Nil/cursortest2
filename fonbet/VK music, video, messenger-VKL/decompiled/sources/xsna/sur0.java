package xsna;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.im.ui.views.avatars.StackAvatarView;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: VhOnboarding.kt */
/* loaded from: classes2.dex */
public final class sur0 extends RecyclerView.e0 {
    public static final /* synthetic */ int r = 0;
    public final TextView l;
    public final TextView m;
    public final View n;
    public final StackAvatarView o;
    public final View p;
    public final TextView q;

    public sur0(View view) {
        super(view);
        this.l = (TextView) view.findViewById(R.id.title);
        this.m = (TextView) view.findViewById(R.id.description);
        this.n = view.findViewById(R.id.friends_empty);
        this.o = (StackAvatarView) view.findViewById(R.id.friends_list);
        this.p = view.findViewById(R.id.primary_button);
        this.q = (TextView) view.findViewById(R.id.secondary_button);
    }

    public final void V5(List<? extends qtd0> list, boolean z, boolean z2, izs<? super msm, s3q0> izsVar) {
        StackAvatarView stackAvatarView = this.o;
        View view = this.n;
        TextView textView = this.q;
        View view2 = this.p;
        TextView textView2 = this.m;
        TextView textView3 = this.l;
        if (z2) {
            textView3.setText(R.string.vkim_empty_dialogs_list_title);
            textView2.setText(R.string.vkim_empty_dialogs_list_description);
            view2.setOnClickListener(null);
            bwt0.i0(textView, new wd30(izsVar, 1));
            bwt0.p0(view, true);
            bwt0.p0(stackAvatarView, false);
            bwt0.p0(view2, false);
            bwt0.p0(textView, true);
            textView.setText(R.string.vkim_create_chat);
            return;
        }
        textView3.setText(R.string.vkim_onboarding_friends_title);
        textView2.setText(R.string.vkim_onboarding_friends_subtitle);
        bwt0.i0(view2, new pc5(izsVar, 4));
        bwt0.i0(textView, new p0(izsVar, 8));
        bwt0.p0(view, list.isEmpty());
        bwt0.p0(stackAvatarView, !r8.isEmpty());
        bwt0.p0(view2, true);
        bwt0.p0(textView, z);
        textView.setText(R.string.vkim_onboarding_friends_find_friends);
        stackAvatarView.f(list);
    }
}
