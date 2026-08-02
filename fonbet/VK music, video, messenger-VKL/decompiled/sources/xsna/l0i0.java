package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.view.components.search.VkSearchView;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.HashSet;

/* compiled from: SearchViewWrapper.java */
/* loaded from: classes7.dex */
public final class l0i0 {
    public final b a;
    public z b;
    public MenuItem c;
    public boolean d;
    public boolean e;
    public c f;
    public final Activity g;
    public final VkSearchView h;
    public final j0i0 i;
    public final View j;
    public final Toolbar k;
    public boolean[] l;
    public int m;
    public final boolean n;
    public final EmptyDisposable o;

    /* compiled from: SearchViewWrapper.java */
    public class a {
        public final /* synthetic */ Menu a;
        public final /* synthetic */ MenuItem b;

        public a(Menu menu, MenuItem menuItem) {
            this.a = menu;
            this.b = menuItem;
        }
    }

    /* compiled from: SearchViewWrapper.java */
    public interface b {
        void a(String str);

        void b(String str);

        void c(String str);
    }

    /* compiled from: SearchViewWrapper.java */
    public interface c {
        void sg(boolean z);
    }

    public l0i0(FragmentActivity fragmentActivity, b bVar) {
        this((Activity) fragmentActivity, bVar);
    }

    public final void a(Menu menu, MenuInflater menuInflater) {
        j0i0 j0i0Var = this.i;
        Context context = j0i0Var.getContext();
        HashSet hashSet = iah0.a;
        menuInflater.inflate(fnj.b(context) ? R.menu.search_tablet : R.menu.search, menu);
        MenuItem findItem = menu.findItem(R.id.search);
        findItem.setIcon(dhr0.t.a(R.drawable.vk_icon_search_24));
        Drawable icon = findItem.getIcon();
        if (icon != null) {
            icon.setTint(dhr0.u.c(R.attr.toolbarIconsColor));
        }
        findItem.setShowAsAction(10);
        findItem.setActionView(j0i0Var);
        findItem.setOnMenuItemClickListener(new g0i0());
        if (this.d) {
            findItem.expandActionView();
            this.h.T4();
        }
        findItem.setOnActionExpandListener(new m720(new a(menu, findItem)));
        this.c = findItem;
    }

    public final void b(w7 w7Var) {
        this.f = w7Var;
    }

    public l0i0(final Activity activity, b bVar) {
        this.d = false;
        this.e = false;
        this.n = true;
        this.o = EmptyDisposable.INSTANCE;
        this.g = activity;
        this.a = bVar;
        j0i0 j0i0Var = new j0i0(this, activity);
        this.i = j0i0Var;
        j0i0Var.addView(View.inflate(activity, R.layout.toolbar_search_expanded, null));
        this.k = (Toolbar) awt0.l(activity.findViewById(android.R.id.content), new pqz(22));
        ((ImageView) j0i0Var.findViewById(R.id.search_done)).setVisibility(8);
        View view = new View(activity);
        this.j = view;
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        j0i0Var.addView(view);
        VkSearchView vkSearchView = (VkSearchView) j0i0Var.findViewById(R.id.search_input);
        this.h = vkSearchView;
        vkSearchView.setTag(this);
        vkSearchView.X4(false);
        orl.a(vkSearchView);
        vkSearchView.getEditView().addTextChangedListener(new k0i0(this));
        vkSearchView.setSecondaryOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: xsna.h0i0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                l0i0 l0i0Var = l0i0.this;
                VkSearchView vkSearchView2 = l0i0Var.h;
                View currentFocus = activity.getCurrentFocus();
                if (currentFocus != null) {
                    currentFocus.clearFocus();
                }
                vkSearchView2.d0();
                vkSearchView2.clearFocus();
                l0i0Var.a.b(textView.getText().toString());
                return true;
            }
        });
        vkSearchView.setOnKeyListener(new View.OnKeyListener() { // from class: xsna.i0i0
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view2, int i, KeyEvent keyEvent) {
                if (i != 4) {
                    return false;
                }
                l0i0 l0i0Var = l0i0.this;
                MenuItem menuItem = l0i0Var.c;
                if (menuItem == null) {
                    l0i0Var.d = false;
                    return true;
                }
                menuItem.collapseActionView();
                return true;
            }
        });
    }
}
