package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.notifications.core.avatar.NotificationAvatarViewContainer;
import com.vkontakte.android.R;

/* compiled from: FriendRequestsHolder.kt */
/* loaded from: classes4.dex */
public final class pjs extends RecyclerView.e0 implements View.OnClickListener {
    public final yhu l;
    public final Context m;
    public final NotificationAvatarViewContainer n;
    public final TextView o;
    public final TextView p;

    public pjs(RecyclerView recyclerView, yhu yhuVar) {
        super(LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.holder_friend_requests, (ViewGroup) recyclerView, false));
        this.l = yhuVar;
        this.m = recyclerView.getContext();
        NotificationAvatarViewContainer notificationAvatarViewContainer = (NotificationAvatarViewContainer) this.itemView.findViewById(R.id.iv_avatar);
        this.n = notificationAvatarViewContainer;
        TextView textView = (TextView) this.itemView.findViewById(R.id.tv_title);
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.tv_subtitle);
        this.o = textView2;
        TextView textView3 = (TextView) this.itemView.findViewById(R.id.tv_counter);
        this.p = textView3;
        this.itemView.setOnClickListener(this);
        notificationAvatarViewContainer.setOnClickListener(this);
        textView.setOnClickListener(this);
        textView2.setOnClickListener(this);
        textView3.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        yhu yhuVar = this.l;
        if (yhuVar != null) {
            yhuVar.invoke(view);
        }
    }
}
