package xsna;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.Triple;

/* compiled from: AppPickerDialog.kt */
/* loaded from: classes15.dex */
public final class b83 extends LinearLayout {
    public final List<Triple<Intent, ResolveInfo, String>> b;
    public final izs<Triple<? extends Intent, ? extends ResolveInfo, String>, s3q0> c;
    public final c83 d;

    /* compiled from: AppPickerDialog.kt */
    public static final class a extends RecyclerView.e0 {
        public final ImageView l;
        public final View m;
        public final TextView n;

        public a(ViewGroup viewGroup) {
            super(bwt0.I(R.layout.app_picker_item, viewGroup, false));
            this.l = (ImageView) this.itemView.findViewById(R.id.app_picker_item_icon);
            this.m = this.itemView.findViewById(R.id.app_picker_item_adaptive_icon);
            this.n = (TextView) this.itemView.findViewById(R.id.app_picker_item_title);
        }
    }

    public b83(Context context, List list, j6e j6eVar, c83 c83Var) {
        super(context);
        this.b = list;
        this.c = j6eVar;
        this.d = c83Var;
        bwt0.I(R.layout.app_picker_layout, this, true);
        setOrientation(1);
        setBackground(m33.a(R.drawable.bg_modern_list, context));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.app_picker_dialog_recycler_view);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(4);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new y73(gridLayoutManager));
        recyclerView.setAdapter(new a83(this, context));
        dhr0.W(this);
        Drawable background = getBackground();
        if (background != null) {
            background.setColorFilter(dhr0.t.c(R.attr.vk_ui_background_content), PorterDuff.Mode.MULTIPLY);
        }
    }
}
