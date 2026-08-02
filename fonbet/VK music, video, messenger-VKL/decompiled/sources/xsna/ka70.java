package xsna;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.X3;
import com.vk.core.ui.swipes.ButtonsSwipeView;
import com.vk.dto.notifications.NotificationButton;
import com.vk.dto.notifications.NotificationItem;
import com.vk.notifications.NotificationClickHandlerImpl;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: NotificationItemHolder.kt */
/* loaded from: classes4.dex */
public final class ka70 extends RecyclerView.e0 implements phh0 {
    public final iwu l;
    public final cwm m;
    public final c970 n;
    public final ButtonsSwipeView.a o;
    public final li70 p;
    public final ArrayList<View> q;
    public NotificationItem r;
    public final ButtonsSwipeView s;

    /* JADX WARN: Multi-variable type inference failed */
    public ka70(Context context, bj70 bj70Var, cwm cwmVar, NotificationClickHandlerImpl notificationClickHandlerImpl, os8 os8Var) {
        super(new ButtonsSwipeView(context, null, 6));
        this.l = (iwu) bj70Var;
        this.m = cwmVar;
        this.n = notificationClickHandlerImpl;
        this.o = os8Var;
        li70 li70Var = new li70(bj70Var, context);
        this.p = li70Var;
        this.q = new ArrayList<>(2);
        ButtonsSwipeView buttonsSwipeView = (ButtonsSwipeView) this.itemView;
        this.s = buttonsSwipeView;
        li70Var.setNotificationClickHandler(notificationClickHandlerImpl);
        buttonsSwipeView.setContentView(li70Var);
        new com.vk.core.ui.swipes.a(context).a(buttonsSwipeView);
        if (os8Var != null) {
            buttonsSwipeView.g.add(os8Var);
        }
        bwt0.k0(buttonsSwipeView.getContainer(), new d2y(this, 12));
    }

    @Override // xsna.phh0
    public final View M4() {
        return this.itemView;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public final void V5(TextView textView, NotificationButton notificationButton) {
        int i;
        int i2;
        if (textView.getLayoutParams() == null) {
            textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        }
        textView.setText(notificationButton.b);
        String str = notificationButton.e;
        if (str != null) {
            switch (str.hashCode()) {
                case -1829997182:
                    if (str.equals("destructive")) {
                        i2 = R.attr.vk_ui_accent_red;
                        i = dhr0.t.c(i2);
                        break;
                    }
                    break;
                case -1130477118:
                    if (str.equals("affirmative")) {
                        i2 = R.attr.vk_ui_accent_green;
                        i = dhr0.t.c(i2);
                        break;
                    }
                    break;
                case -817598092:
                    if (str.equals(X3.i.Y)) {
                        i2 = R.attr.vk_ui_accent_gray;
                        i = dhr0.t.c(i2);
                        break;
                    }
                    break;
                case -314765822:
                    if (str.equals("primary")) {
                        i2 = R.attr.vk_ui_accent_blue;
                        i = dhr0.t.c(i2);
                        break;
                    }
                    break;
                case 1124446108:
                    if (str.equals("warning")) {
                        i2 = R.attr.vk_ui_accent_orange;
                        i = dhr0.t.c(i2);
                        break;
                    }
                    break;
            }
            textView.setBackgroundColor(i);
            jjc.g(textView, new ed5(this, textView, notificationButton, 2));
        }
        i = -16777216;
        textView.setBackgroundColor(i);
        jjc.g(textView, new ed5(this, textView, notificationButton, 2));
    }

    public final void W5(NotificationItem notificationItem) {
        NotificationItem.ActionButtons actionButtons = notificationItem.o;
        this.r = notificationItem;
        this.p.setItem(notificationItem);
        ButtonsSwipeView buttonsSwipeView = this.s;
        LinearLayout container = buttonsSwipeView.getContainer();
        ArrayList<View> leftViews = buttonsSwipeView.getLeftViews();
        ArrayList<View> rightViews = buttonsSwipeView.getRightViews();
        cwm cwmVar = this.m;
        if (leftViews != null) {
            int size = leftViews.size();
            for (int i = 0; i < size; i++) {
                View view = leftViews.get(i);
                container.removeView(view);
                cwmVar.d(view);
            }
        } else {
            for (View view2 : leftViews) {
                container.removeView(view2);
                cwmVar.d(view2);
            }
        }
        if (rightViews != null) {
            int size2 = rightViews.size();
            for (int i2 = 0; i2 < size2; i2++) {
                View view3 = rightViews.get(i2);
                container.removeView(view3);
                cwmVar.d(view3);
            }
        } else {
            for (View view4 : rightViews) {
                container.removeView(view4);
                cwmVar.d(view4);
            }
        }
        leftViews.clear();
        rightViews.clear();
        List<NotificationButton> list = actionButtons != null ? actionButtons.b : null;
        ArrayList<View> arrayList = this.q;
        arrayList.clear();
        if (list != null) {
            List<NotificationButton> list2 = list;
            if (list2 instanceof RandomAccess) {
                List<NotificationButton> list3 = list2;
                int size3 = list3.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    NotificationButton notificationButton = list3.get(i3);
                    TextView textView = (TextView) cwmVar.b();
                    V5(textView, notificationButton);
                    arrayList.add(textView);
                }
            } else {
                for (NotificationButton notificationButton2 : list2) {
                    TextView textView2 = (TextView) cwmVar.b();
                    V5(textView2, notificationButton2);
                    arrayList.add(textView2);
                }
            }
        }
        buttonsSwipeView.setLeftViews(arrayList);
        List<NotificationButton> list4 = actionButtons != null ? actionButtons.c : null;
        arrayList.clear();
        List<NotificationButton> list5 = list4;
        if (list5 != null && !list5.isEmpty()) {
            int size4 = list4.size();
            while (true) {
                size4--;
                if (-1 >= size4) {
                    break;
                }
                TextView textView3 = (TextView) cwmVar.b();
                V5(textView3, list4.get(size4));
                arrayList.add(textView3);
            }
        }
        buttonsSwipeView.setRightViews(arrayList);
    }

    @Override // xsna.phh0
    public final ButtonsSwipeView p3() {
        return this.s;
    }
}
