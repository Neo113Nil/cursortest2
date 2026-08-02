package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.friends.discover.UserDiscoverState;
import com.vk.friends.discover.UsersDiscoverLayoutManager;
import com.vk.friends.discover.UsersDiscoverListView;

/* compiled from: UserDiscoverAdapterDataObserver.kt */
/* loaded from: classes13.dex */
public final class shq0 extends RecyclerView.i {
    public final UsersDiscoverListView a;

    public shq0(UsersDiscoverListView usersDiscoverListView) {
        this.a = usersDiscoverListView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void b() {
        RecyclerView.o layoutManager = this.a.getLayoutManager();
        UsersDiscoverLayoutManager usersDiscoverLayoutManager = layoutManager instanceof UsersDiscoverLayoutManager ? (UsersDiscoverLayoutManager) layoutManager : null;
        if (usersDiscoverLayoutManager != null) {
            usersDiscoverLayoutManager.f.f = 0;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void f(int i, int i2) {
        RecyclerView.o layoutManager = this.a.getLayoutManager();
        UsersDiscoverLayoutManager usersDiscoverLayoutManager = layoutManager instanceof UsersDiscoverLayoutManager ? (UsersDiscoverLayoutManager) layoutManager : null;
        if (usersDiscoverLayoutManager != null) {
            usersDiscoverLayoutManager.removeAllViews();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void g(int i, int i2) {
        RecyclerView.o layoutManager = this.a.getLayoutManager();
        UsersDiscoverLayoutManager usersDiscoverLayoutManager = layoutManager instanceof UsersDiscoverLayoutManager ? (UsersDiscoverLayoutManager) layoutManager : null;
        if (usersDiscoverLayoutManager == null) {
            return;
        }
        UserDiscoverState userDiscoverState = usersDiscoverLayoutManager.f;
        int i3 = userDiscoverState.f;
        if (usersDiscoverLayoutManager.getItemCount() == 0) {
            userDiscoverState.f = 0;
        } else if (i < i3) {
            userDiscoverState.f = Math.min(i3 - (i3 - i), usersDiscoverLayoutManager.getItemCount() - 1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void c(int i, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void e(int i, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void d(int i, int i2, Object obj) {
    }
}
