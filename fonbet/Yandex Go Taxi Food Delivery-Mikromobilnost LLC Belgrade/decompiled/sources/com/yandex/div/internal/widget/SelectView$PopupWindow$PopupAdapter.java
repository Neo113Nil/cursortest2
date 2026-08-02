package com.yandex.div.internal.widget;

import android.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import defpackage.veq0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"com/yandex/div/internal/widget/SelectView$PopupWindow$PopupAdapter", "Landroid/widget/BaseAdapter;", "<init>", "(Lveq0;)V", "Landroid/widget/TextView;", "createView", "()Landroid/widget/TextView;", "", "", "newItems", "Lzy11;", "setItems", "(Ljava/util/List;)V", "", "getCount", "()I", "position", "getItem", "(I)Ljava/lang/String;", "", "getItemId", "(I)J", "Landroid/view/View;", "convertView", "Landroid/view/ViewGroup;", "parent", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/widget/TextView;", "items", "Ljava/util/List;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SelectView$PopupWindow$PopupAdapter extends BaseAdapter {
    private List<String> items = EmptyList.a;
    final /* synthetic */ veq0 this$0;

    public SelectView$PopupWindow$PopupAdapter(veq0 veq0Var) {
        this.this$0 = veq0Var;
    }

    private final TextView createView() {
        TextView textView = new TextView(this.this$0.T, null, R.attr.spinnerDropDownItemStyle);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, com.yandex.div.core.view2.divs.a.p(48, textView.getResources().getDisplayMetrics())));
        textView.setTextAlignment(5);
        return textView;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.items.size();
    }

    @Override // android.widget.Adapter
    public String getItem(int position) {
        return this.items.get(position);
    }

    @Override // android.widget.Adapter
    public long getItemId(int position) {
        return position;
    }

    @Override // android.widget.Adapter
    public TextView getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = createView();
        }
        TextView textView = (TextView) convertView;
        textView.setText(getItem(position));
        return textView;
    }

    public final void setItems(List<String> newItems) {
        this.items = newItems;
        notifyDataSetChanged();
    }
}
