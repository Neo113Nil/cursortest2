package com.yandex.div.internal.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.ListPopupWindow;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.reuse.InputFocusTracker;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.izs;
import xsna.ne3;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: SelectView.kt */
/* loaded from: classes7.dex */
public class SelectView extends EllipsizedTextView {
    private InputFocusTracker focusTracker;
    private izs<? super Integer, s3q0> onItemSelectedListener;

    @SuppressLint({"RestrictedApi"})
    private final PopupWindow popupWindow;

    /* compiled from: SelectView.kt */
    public static class PopupWindow extends ListPopupWindow {
        private final PopupAdapter adapter;
        private final Context context;

        /* compiled from: SelectView.kt */
        public final class PopupAdapter extends BaseAdapter {
            private List<String> items = EmptyList.b;

            public PopupAdapter() {
            }

            private final TextView createView() {
                TextView textView = new TextView(PopupWindow.this.context, null, R.attr.spinnerDropDownItemStyle);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setSingleLine(true);
                textView.setLayoutParams(new ViewGroup.LayoutParams(-1, BaseDivViewExtensionsKt.dpToPx(48, textView.getResources().getDisplayMetrics())));
                textView.setTextAlignment(5);
                return textView;
            }

            @Override // android.widget.Adapter
            public int getCount() {
                return this.items.size();
            }

            @Override // android.widget.Adapter
            public long getItemId(int i) {
                return i;
            }

            public final void setItems(List<String> list) {
                this.items = list;
                notifyDataSetChanged();
            }

            @Override // android.widget.Adapter
            public String getItem(int i) {
                return this.items.get(i);
            }

            @Override // android.widget.Adapter
            public TextView getView(int i, View view, ViewGroup viewGroup) {
                if (view == null) {
                    view = createView();
                }
                TextView textView = (TextView) view;
                textView.setText(getItem(i));
                return textView;
            }
        }

        public /* synthetic */ PopupWindow(Context context, AttributeSet attributeSet, int i, int i2, zcl zclVar) {
            this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? com.vkontakte.android.R.attr.listPopupWindowStyle : i);
        }

        public PopupAdapter getAdapter() {
            return this.adapter;
        }

        public void resetPosition() {
            ListView listView = getListView();
            if (listView != null) {
                listView.setSelectionAfterHeaderView();
            }
        }

        @Override // androidx.appcompat.widget.ListPopupWindow, xsna.sjj0
        public void show() {
            if (getListView() == null) {
                super.show();
                ListView listView = getListView();
                if (listView != null) {
                    listView.setChoiceMode(1);
                }
            }
            super.show();
        }

        public PopupWindow(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.context = context;
            this.adapter = new PopupAdapter();
        }
    }

    public SelectView(Context context) {
        super(context, null, 0, 6, null);
        setOnClickListener(new ne3(this, 9));
        final PopupWindow popupWindow = new PopupWindow(context, null, 0, 6, null);
        popupWindow.setModal(true);
        popupWindow.setAnchorView(this);
        popupWindow.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.yandex.div.internal.widget.a
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                SelectView.popupWindow$lambda$3$lambda$2(SelectView.this, popupWindow, adapterView, view, i, j);
            }
        });
        popupWindow.setOverlapAnchor(true);
        popupWindow.setBackgroundDrawable(new ColorDrawable(-1));
        popupWindow.setAdapter(popupWindow.getAdapter());
        this.popupWindow = popupWindow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(SelectView selectView, View view) {
        InputFocusTracker inputFocusTracker = selectView.focusTracker;
        if (inputFocusTracker != null) {
            BaseDivViewExtensionsKt.clearFocusOnClick(selectView, inputFocusTracker);
        }
        selectView.popupWindow.resetPosition();
        selectView.popupWindow.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void popupWindow$lambda$3$lambda$2(SelectView selectView, PopupWindow popupWindow, AdapterView adapterView, View view, int i, long j) {
        selectView.sendAccessibilityEvent(4);
        izs<? super Integer, s3q0> izsVar = selectView.onItemSelectedListener;
        if (izsVar != null) {
            izsVar.invoke(Integer.valueOf(i));
        }
        popupWindow.dismiss();
    }

    public final InputFocusTracker getFocusTracker() {
        return this.focusTracker;
    }

    public final izs<Integer, s3q0> getOnItemSelectedListener() {
        return this.onItemSelectedListener;
    }

    @Override // com.yandex.div.internal.widget.EllipsizedTextView, androidx.appcompat.widget.AppCompatTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.popupWindow.isShowing()) {
            this.popupWindow.dismiss();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCanOpenPopup(true);
        accessibilityNodeInfo.setText(getText());
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z && this.popupWindow.isShowing()) {
            this.popupWindow.show();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0 || !this.popupWindow.isShowing()) {
            return;
        }
        this.popupWindow.dismiss();
    }

    public final void setFocusTracker(InputFocusTracker inputFocusTracker) {
        this.focusTracker = inputFocusTracker;
    }

    public final void setItems(List<String> list) {
        this.popupWindow.getAdapter().setItems(list);
    }

    public final void setOnItemSelectedListener(izs<? super Integer, s3q0> izsVar) {
        this.onItemSelectedListener = izsVar;
    }

    @Override // android.widget.TextView, android.view.View
    public String getAccessibilityClassName() {
        return "android.widget.Spinner";
    }
}
