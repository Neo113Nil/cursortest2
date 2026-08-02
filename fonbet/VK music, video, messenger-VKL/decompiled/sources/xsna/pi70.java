package xsna;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.core.ui.floating_view.FloatingViewGesturesHelper;
import com.vk.dto.notifications.FriendRequestsItem;
import com.vk.dto.notifications.NotificationItem;
import com.vk.dto.notifications.NotificationsGetResponse$NotificationsResponseItem;
import com.vk.dto.user.UserProfile;
import com.vk.lists.DefaultEmptyView;
import com.vk.lists.ListDataSet;
import com.vk.notifications.core.avatar.NotificationAvatarViewContainer;
import com.vkontakte.android.R;
import java.text.DecimalFormat;
import java.util.Arrays;
import org.json.JSONObject;
import xsna.cq5;
import xsna.ikv0;

/* compiled from: NotificationsAdapter.kt */
/* loaded from: classes4.dex */
public final class pi70 extends iwu<NotificationsGetResponse$NotificationsResponseItem> implements bj70 {
    @Override // xsna.bj70
    public final void C(JSONObject jSONObject, NotificationItem notificationItem) {
        String optString;
        xyg xygVar = new xyg(new b140(notificationItem, 7), 2);
        uuk uukVar = this.c;
        int w = ((ListDataSet) uukVar).w(xygVar);
        if (w >= 0) {
            NotificationsGetResponse$NotificationsResponseItem notificationsGetResponse$NotificationsResponseItem = (NotificationsGetResponse$NotificationsResponseItem) uukVar.c(w);
            ((ListDataSet) uukVar).A(w);
            if (notificationsGetResponse$NotificationsResponseItem == null || jSONObject == null || (optString = jSONObject.optString("snackbar_text", null)) == null) {
                return;
            }
            FloatingViewGesturesHelper.SwipeDirection swipeDirection = FloatingViewGesturesHelper.SwipeDirection.Horizontal;
            ikv0.d.c cVar = new ikv0.d.c(optString);
            ikv0.d.b bVar = new ikv0.d.b(null);
            new ug50(cVar);
            new ug50(bVar);
            new ug50(null);
            throw null;
        }
    }

    @Override // xsna.iwu, xsna.bt9.a
    public final boolean F(int i) {
        boolean F = super.F(i);
        if (F || getItemViewType(i) != 1) {
            return F;
        }
        return true;
    }

    @Override // xsna.awu
    public final int N0(int i) {
        NotificationsGetResponse$NotificationsResponseItem notificationsGetResponse$NotificationsResponseItem = (NotificationsGetResponse$NotificationsResponseItem) this.c.c(i);
        NotificationItem notificationItem = notificationsGetResponse$NotificationsResponseItem.b;
        Boolean bool = notificationsGetResponse$NotificationsResponseItem.d;
        FriendRequestsItem friendRequestsItem = notificationsGetResponse$NotificationsResponseItem.c;
        if (notificationItem != null && friendRequestsItem == null && bool == null) {
            return 0;
        }
        if (notificationItem == null && friendRequestsItem != null && bool == null) {
            return 1;
        }
        return (notificationItem == null && friendRequestsItem == null && bool != null) ? -2 : -1;
    }

    @Override // xsna.awu
    public final void O0(RecyclerView.e0 e0Var, int i) {
        String format;
        boolean z = e0Var instanceof ka70;
        uuk uukVar = this.c;
        if (z) {
            ((ka70) e0Var).W5(((NotificationsGetResponse$NotificationsResponseItem) uukVar.c(i)).b);
            return;
        }
        if (e0Var instanceof pjs) {
            pjs pjsVar = (pjs) e0Var;
            FriendRequestsItem friendRequestsItem = ((NotificationsGetResponse$NotificationsResponseItem) uukVar.c(i)).c;
            TextView textView = pjsVar.p;
            NotificationAvatarViewContainer notificationAvatarViewContainer = pjsVar.n;
            TextView textView2 = pjsVar.o;
            UserProfile userProfile = friendRequestsItem.b;
            Integer num = friendRequestsItem.c;
            if (userProfile != null) {
                notificationAvatarViewContainer.a(userProfile.h, AvatarBorderType.CIRCLE, cq5.b.a);
                if (friendRequestsItem.W5() <= 1) {
                    textView2.setText(userProfile.e);
                } else {
                    textView2.setText(pjsVar.m.getResources().getQuantityString(R.plurals.not_name_and_n_more_people, ((num == null || num.intValue() == 0) ? 0 : num.intValue()) - 1, userProfile.d, Integer.valueOf(((num == null || num.intValue() == 0) ? 0 : num.intValue()) - 1)));
                }
            } else {
                notificationAvatarViewContainer.clear();
                textView2.setText("");
            }
            Integer num2 = friendRequestsItem.d;
            if (num2 != null && num2.intValue() == 0) {
                textView.setVisibility(8);
                return;
            }
            textView.setVisibility(0);
            DecimalFormat decimalFormat = xpm0.a;
            int W5 = friendRequestsItem.W5();
            if (W5 < 1000) {
                format = String.valueOf(W5);
            } else if (W5 < 1000000) {
                float f = W5 / 1000;
                int i2 = W5 / 1000;
                if (f - i2 < 0.1d) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(i2);
                    sb.append('k');
                    format = sb.toString();
                } else {
                    format = String.format("%.1fk", Arrays.copyOf(new Object[]{Float.valueOf(f - 0.05f)}, 1));
                }
            } else {
                float f2 = W5 / 1000000;
                int i3 = W5 / 1000000;
                if (f2 - i3 < 0.1d) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i3);
                    sb2.append('m');
                    format = sb2.toString();
                } else {
                    format = String.format("%.1fm", Arrays.copyOf(new Object[]{Float.valueOf(f2 - 0.05f)}, 1));
                }
            }
            textView.setText(format);
        }
    }

    @Override // xsna.awu
    public final RecyclerView.e0 P0(int i, ViewGroup viewGroup) {
        if (i != -2) {
            if (i == 0) {
                return new ka70(viewGroup.getContext(), this, null, null, null);
            }
            if (i == 1) {
                return new pjs((RecyclerView) viewGroup, new yhu(viewGroup, 14));
            }
            View view = new View(viewGroup.getContext());
            view.setLayoutParams(new ViewGroup.LayoutParams(-1, iah0.a(8)));
            return new jop0(view);
        }
        Context context = viewGroup.getContext();
        DefaultEmptyView defaultEmptyView = new DefaultEmptyView(context);
        defaultEmptyView.d = 0;
        defaultEmptyView.e = 0;
        defaultEmptyView.f = R.string.liblists_empty_list;
        defaultEmptyView.g = 0;
        defaultEmptyView.h = null;
        defaultEmptyView.i = true;
        defaultEmptyView.b(context);
        defaultEmptyView.setImage(R.drawable.placeholder_notifications_160);
        defaultEmptyView.setText(R.string.not_empty_desc_reactions);
        defaultEmptyView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        int applyDimension = (int) TypedValue.applyDimension(1, 32, context.getResources().getDisplayMetrics());
        int applyDimension2 = (int) TypedValue.applyDimension(1, 60, context.getResources().getDisplayMetrics());
        defaultEmptyView.setPadding(applyDimension, applyDimension2, applyDimension, applyDimension2);
        return new cel(defaultEmptyView);
    }

    @Override // xsna.bj70
    public final void Q(NotificationItem notificationItem) {
        ((cj70) this.c).Q(notificationItem);
    }

    @Override // xsna.awu
    public final void Q0() {
        NotificationsGetResponse$NotificationsResponseItem notificationsGetResponse$NotificationsResponseItem;
        if (E0() == 1 && (notificationsGetResponse$NotificationsResponseItem = (NotificationsGetResponse$NotificationsResponseItem) this.c.c(0)) != null && notificationsGetResponse$NotificationsResponseItem.b == null && notificationsGetResponse$NotificationsResponseItem.c != null && notificationsGetResponse$NotificationsResponseItem.d == null) {
            x0(new NotificationsGetResponse$NotificationsResponseItem(null, null, Boolean.TRUE));
        }
    }

    @Override // xsna.iwu
    public final int U0() {
        return 42;
    }
}
