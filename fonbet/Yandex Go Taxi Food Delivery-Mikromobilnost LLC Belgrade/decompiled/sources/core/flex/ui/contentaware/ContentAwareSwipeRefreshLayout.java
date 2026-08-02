package core.flex.ui.contentaware;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.bfb1;
import defpackage.fqb1;
import defpackage.gki0;
import defpackage.v8e;
import defpackage.wee;
import defpackage.xee;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001cB\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n*\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcore/flex/ui/contentaware/ContentAwareSwipeRefreshLayout;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "Lwee;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroidx/recyclerview/widget/RecyclerView;", "", "getCurrentPosition", "(Landroidx/recyclerview/widget/RecyclerView;)I", "", BackendConfig.Restrictions.ENABLED, "Lzy11;", "setEnabled", "(Z)V", "Landroid/view/View;", "view", "setContentView", "(Landroid/view/View;)V", "swipeRefreshContent", "Landroid/view/View;", "getContentView", "()Landroid/view/View;", "contentView", "Companion", "xee", "flex-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ContentAwareSwipeRefreshLayout extends SwipeRefreshLayout implements wee {
    public static final xee Companion = new xee();
    private static final int FIRST_POSITION = 0;
    private static final int UNKNOWN_POSITION = -1;
    private View swipeRefreshContent;

    public ContentAwareSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnChildScrollUpCallback(new v8e(2, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean _init_$lambda$0(ContentAwareSwipeRefreshLayout contentAwareSwipeRefreshLayout, SwipeRefreshLayout swipeRefreshLayout, View view) {
        View a;
        wee weeVar = view instanceof wee ? (wee) view : null;
        if (weeVar != null && (a = fqb1.a(weeVar)) != null) {
            view = a;
        }
        if (view instanceof RecyclerView) {
            if (contentAwareSwipeRefreshLayout.getCurrentPosition((RecyclerView) view) == 0) {
                return false;
            }
        } else {
            if (view instanceof ListView) {
                return bfb1.c((ListView) view);
            }
            if (view == 0 || !view.canScrollVertically(-1)) {
                return false;
            }
        }
        return true;
    }

    private final int getCurrentPosition(RecyclerView recyclerView) {
        Object layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).K1();
        }
        if (layoutManager instanceof gki0) {
            return ((gki0) layoutManager).a();
        }
        return -1;
    }

    @Override // defpackage.wee
    /* renamed from: getContentView, reason: from getter */
    public View getSwipeRefreshContent() {
        return this.swipeRefreshContent;
    }

    public final void setContentView(View view) {
        View view2 = this.swipeRefreshContent;
        if (view2 != null) {
            removeView(view2);
        }
        this.swipeRefreshContent = view;
        addView(view);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        setNestedScrollingEnabled(enabled);
        requestLayout();
    }

    public /* synthetic */ ContentAwareSwipeRefreshLayout(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ContentAwareSwipeRefreshLayout(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }
}
