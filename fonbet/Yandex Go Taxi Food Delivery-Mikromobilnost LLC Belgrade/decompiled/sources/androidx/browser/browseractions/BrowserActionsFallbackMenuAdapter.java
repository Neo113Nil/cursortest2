package androidx.browser.browseractions;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import defpackage.dsh0;
import defpackage.fl6;
import defpackage.gl6;
import defpackage.ny61;
import defpackage.sgh0;
import java.util.List;

@Deprecated
/* loaded from: classes10.dex */
class BrowserActionsFallbackMenuAdapter extends BaseAdapter {
    private final Context mContext;
    private final List<fl6> mMenuItems;

    public BrowserActionsFallbackMenuAdapter(List<fl6> list, Context context) {
        this.mMenuItems = list;
        this.mContext = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.mMenuItems.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.mMenuItems.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        gl6 gl6Var;
        fl6 fl6Var = this.mMenuItems.get(i);
        if (view == null) {
            view = LayoutInflater.from(this.mContext).inflate(dsh0.browser_actions_context_menu_row, (ViewGroup) null);
            ImageView imageView = (ImageView) view.findViewById(sgh0.browser_actions_menu_item_icon);
            TextView textView = (TextView) view.findViewById(sgh0.browser_actions_menu_item_text);
            if (imageView == null || textView == null) {
                ny61.r("Browser Actions fallback UI does not contain necessary Views.");
                return null;
            }
            gl6Var = new gl6(imageView, textView);
            view.setTag(gl6Var);
        } else {
            gl6Var = (gl6) view.getTag();
        }
        String str = fl6Var.a;
        TextView textView2 = gl6Var.b;
        ImageView imageView2 = gl6Var.a;
        textView2.setText(str);
        imageView2.setImageBitmap(null);
        imageView2.setVisibility(4);
        return view;
    }
}
