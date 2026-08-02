package com.yandex.div.internal.widget.menu;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.view.menu.i;
import com.yandex.div.R$dimen;
import com.yandex.div.R$drawable;
import xsna.bn1;
import xsna.cxb0;

/* loaded from: classes7.dex */
public class OverflowMenuWrapper {
    private int mButtonResourceId;

    @NonNull
    private final Context mContext;

    @Nullable
    private View[] mHorizontallyCompetingViews;

    @Nullable
    private Listener mListener;
    private int mMenuGravity;
    private final int mMenuHorizontalMargin;
    private final int mMenuVerticalMargin;
    private int mOverflowAlpha;
    private int mOverflowColor;
    private int mOverflowGravity;

    @Nullable
    private final ViewGroup mParentView;

    @Nullable
    private cxb0 mPopupMenu;
    private boolean mValid;

    @Nullable
    private View[] mVerticallyCompetingViews;

    @NonNull
    private final View mWrappedView;

    public OverflowMenuWrapper(@NonNull Context context, @NonNull View view, @Nullable ViewGroup viewGroup) {
        this(context, view, viewGroup, R$dimen.overflow_menu_margin_horizontal, R$dimen.overflow_menu_margin_vertical);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$getOnMenuClickListener$0(View view) {
        cxb0 cxb0Var = new cxb0(view.getContext(), view, this.mMenuGravity);
        Listener listener = this.mListener;
        if (listener != null) {
            listener.onMenuCreated(cxb0Var);
        }
        i iVar = cxb0Var.c;
        if (!iVar.b()) {
            if (iVar.e == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            iVar.d(0, 0, false, false);
        }
        Listener listener2 = this.mListener;
        if (listener2 != null) {
            listener2.onPopupShown();
        }
        this.mPopupMenu = cxb0Var;
    }

    public View.OnClickListener getOnMenuClickListener() {
        return new bn1(this, 10);
    }

    @NonNull
    public OverflowMenuWrapper listener(@NonNull Listener listener) {
        this.mListener = listener;
        return this;
    }

    @NonNull
    public OverflowMenuWrapper overflowGravity(int i) {
        this.mOverflowGravity = i;
        return this;
    }

    public OverflowMenuWrapper(@NonNull Context context, @NonNull View view, @Nullable ViewGroup viewGroup, int i, int i2) {
        this.mOverflowGravity = 51;
        this.mOverflowColor = -1;
        this.mOverflowAlpha = 255;
        this.mMenuGravity = 83;
        this.mButtonResourceId = R$drawable.ic_more_vert_white_24dp;
        this.mHorizontallyCompetingViews = null;
        this.mVerticallyCompetingViews = null;
        this.mValid = false;
        this.mContext = context;
        this.mWrappedView = view;
        this.mParentView = viewGroup;
        this.mMenuHorizontalMargin = i;
        this.mMenuVerticalMargin = i2;
    }

    public interface Listener {
        void onMenuCreated(@NonNull cxb0 cxb0Var);

        void onPopupShown();

        public static class Simple implements Listener {
            @Override // com.yandex.div.internal.widget.menu.OverflowMenuWrapper.Listener
            public void onPopupShown() {
            }
        }
    }
}
