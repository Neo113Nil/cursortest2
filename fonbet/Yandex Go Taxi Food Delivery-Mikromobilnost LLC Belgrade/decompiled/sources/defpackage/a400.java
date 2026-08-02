package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.yandex.go.design.view.GoFrameLayout;
import java.util.WeakHashMap;
import ru.yandex.taxi.activity.ContentContainer$ZOrder;
import ru.yandex.taxi.banners.c;
import ru.yandex.taxi.design.NotificationStackComponent;
import ru.yandex.taxi.settings.MainMenuButton;
import ru.yandex.taxi.settings.activity.MenuRouterStateChangeListener;
import ru.yandex.taxi.statebar.a;
import ru.yandex.taxi.statebar.controller.b;

/* loaded from: classes9.dex */
public final class a400 {
    public final ViewGroup a;
    public final NotificationStackComponent b;
    public final NotificationStackComponent c;
    public final o500 d;
    public final a e;
    public final View f;

    public a400(ViewGroup viewGroup, tse tseVar, q3u0 q3u0Var, tj60 tj60Var, c cVar, tj60 tj60Var2, jc00 jc00Var, y4k0 y4k0Var, mj10 mj10Var, ffe ffeVar, MenuRouterStateChangeListener menuRouterStateChangeListener, b bVar) {
        this.a = viewGroup;
        int i = ahh0.vertical_content;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        a aVar = new a(tseVar, (ViewGroup) ((View) rp31.d(viewGroup, i)), (GoFrameLayout) ((View) rp31.d(viewGroup, ahh0.state_bar_host)), q3u0Var);
        this.e = aVar;
        View view = (View) rp31.d(viewGroup, ahh0.map_layout);
        this.f = view;
        ViewGroup viewGroup2 = (ViewGroup) ((View) rp31.d(viewGroup, ahh0.content));
        MainMenuButton mainMenuButton = (MainMenuButton) LayoutInflater.from(viewGroup2.getContext()).inflate(oph0.main_menu_button, viewGroup2, false);
        viewGroup2.addView(mainMenuButton);
        ic00 ic00Var = ((kc00) jc00Var).a;
        ic00Var.getClass();
        if (!(ic00Var instanceof hc00)) {
            mainMenuButton.setMenuIcon(dzg0.settings_hamburger);
        }
        y4k0Var.getClass();
        mainMenuButton.addOnAttachStateChangeListener(menuRouterStateChangeListener);
        ((nj10) mj10Var).a(mainMenuButton);
        bVar.b(aVar);
        View view2 = (ImageView) ((View) rp31.d(viewGroup, ahh0.background));
        View view3 = (View) rp31.d(viewGroup, fjh0.fragment_host);
        View view4 = (View) rp31.d(viewGroup, ahh0.header_container);
        ContentContainer$ZOrder contentContainer$ZOrder = ContentContainer$ZOrder.MAP;
        ffeVar.a(view, contentContainer$ZOrder);
        ffeVar.a(view2, contentContainer$ZOrder);
        ContentContainer$ZOrder contentContainer$ZOrder2 = ContentContainer$ZOrder.CONTENT;
        ffeVar.a(view3, contentContainer$ZOrder2);
        ffeVar.a(mainMenuButton, contentContainer$ZOrder2);
        ffeVar.a(view4, contentContainer$ZOrder2);
        this.d = new o500(ffeVar, mainMenuButton);
        NotificationStackComponent notificationStackComponent = (NotificationStackComponent) ((View) rp31.d(viewGroup, ahh0.notification_stack_component));
        this.b = notificationStackComponent;
        NotificationStackComponent notificationStackComponent2 = (NotificationStackComponent) ((View) rp31.d(viewGroup, ahh0.non_autohidable_notification_stack_component));
        this.c = notificationStackComponent2;
        cVar.o = notificationStackComponent;
        tj60Var2.a = notificationStackComponent;
        tj60Var.a = notificationStackComponent2;
    }
}
