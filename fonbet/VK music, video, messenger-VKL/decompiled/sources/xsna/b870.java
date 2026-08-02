package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.notifications.NotificationAction;
import com.vk.dto.notifications.NotificationButton;
import com.vk.dto.notifications.NotificationItem;
import com.vk.notifications.NotificationClickHandlerImpl;
import com.vkontakte.android.R;

/* compiled from: NotificationBottomActionsAdapter.kt */
/* loaded from: classes4.dex */
public final class b870 extends zoj0<NotificationButton, vif0<NotificationButton>> {
    public final bj70 e;
    public final NotificationItem f;
    public final NotificationClickHandlerImpl g;
    public dw20 h;

    /* compiled from: NotificationBottomActionsAdapter.kt */
    public final class a extends vif0<NotificationButton> implements View.OnClickListener {
        public final TextView n;

        public a(ViewGroup viewGroup) {
            super(viewGroup, R.layout.item_action_sheet, 0);
            View view = this.itemView;
            this.n = (TextView) view;
            jjc.f(this, view);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException
         */
        @Override // xsna.vif0
        public final void i6(NotificationButton notificationButton) {
            int i;
            NotificationButton notificationButton2 = notificationButton;
            String str = notificationButton2.d;
            if (str != null) {
                switch (str.hashCode()) {
                    case -2051748129:
                        if (str.equals("do_not_disturb")) {
                            i = R.drawable.vk_icon_block_outline_28;
                            break;
                        }
                        break;
                    case -1335458389:
                        if (str.equals("delete")) {
                            i = R.drawable.vk_icon_delete_outline_28;
                            break;
                        }
                        break;
                    case -934918565:
                        if (str.equals("recent")) {
                            i = R.drawable.vk_icon_recent_outline_28;
                            break;
                        }
                        break;
                    case -934521548:
                        if (str.equals("report")) {
                            i = R.drawable.vk_icon_report_outline_28;
                            break;
                        }
                        break;
                    case 3202370:
                        if (str.equals("hide")) {
                            i = R.drawable.vk_icon_hide_outline_28;
                            break;
                        }
                        break;
                }
                TextView textView = this.n;
                his0.w(textView, i, R.attr.vk_ui_icon_secondary);
                textView.setText(notificationButton2.b);
            }
            i = R.drawable.vk_icon_new_logo_vk_outline_28;
            TextView textView2 = this.n;
            his0.w(textView2, i, R.attr.vk_ui_icon_secondary);
            textView2.setText(notificationButton2.b);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Context context;
            NotificationButton notificationButton;
            NotificationAction notificationAction;
            ViewGroup viewGroup = this.l;
            if (viewGroup == null || (context = viewGroup.getContext()) == null || (notificationButton = (NotificationButton) this.m) == null || (notificationAction = notificationButton.f) == null) {
                return;
            }
            b870 b870Var = b870.this;
            NotificationClickHandlerImpl notificationClickHandlerImpl = b870Var.g;
            if (notificationClickHandlerImpl != null) {
                notificationClickHandlerImpl.c(context, null, notificationAction, b870Var.f, b870Var.e);
            }
            dw20 dw20Var = b870Var.h;
            if (dw20Var != null) {
                dw20Var.dismiss();
            }
        }
    }

    public b870(bj70 bj70Var, NotificationItem notificationItem, NotificationClickHandlerImpl notificationClickHandlerImpl) {
        this.e = bj70Var;
        this.f = notificationItem;
        this.g = notificationClickHandlerImpl;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        vif0 vif0Var = (vif0) e0Var;
        NotificationButton notificationButton = (NotificationButton) this.c.c(i);
        if (notificationButton != null) {
            vif0Var.V5(notificationButton);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(viewGroup);
    }
}
