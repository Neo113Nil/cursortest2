package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.imageloader.ImageScreenSize;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: Adapter.kt */
/* loaded from: classes4.dex */
public final class ej0 extends RecyclerView.Adapter<RecyclerView.e0> {
    public final rei0 c;
    public final ImageScreenSize d;
    public final LayoutInflater e;
    public boolean f;
    public List<? extends q4t> g = EmptyList.b;
    public boolean h;
    public izs<? super Integer, Integer> i;

    /* compiled from: Adapter.kt */
    public static final class a extends RecyclerView.e0 {
    }

    /* compiled from: Adapter.kt */
    public final class b extends RecyclerView.e0 implements otx0 {
        public final VKImageView l;
        public final AppCompatTextView m;
        public final View n;
        public final View o;

        public b(View view) {
            super(view);
            this.l = (VKImageView) view.findViewById(R.id.lg_image);
            this.m = (AppCompatTextView) view.findViewById(R.id.lg_counter);
            this.n = view.findViewById(R.id.lg_counter_container);
            this.o = view.findViewById(R.id.lg_video_marker);
        }

        @Override // xsna.jsx0
        public final boolean H4() {
            return true;
        }

        @Override // xsna.otx0
        public final Rect X1(Rect rect) {
            this.n.getGlobalVisibleRect(rect);
            return rect;
        }
    }

    public ej0(Context context, rei0 rei0Var, ImageScreenSize imageScreenSize, izs<? super Integer, Integer> izsVar) {
        this.c = rei0Var;
        this.d = imageScreenSize;
        this.e = LayoutInflater.from(context);
        this.i = izsVar;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.g.size() + (this.h ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        if (i == getItemCount() - 1 && this.h) {
            return Long.MAX_VALUE;
        }
        return this.g.get(i).c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return (i == getItemCount() - 1 && this.h) ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        onBindViewHolder(e0Var, i, new ArrayList());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = this.e;
        return i == 0 ? new b(layoutInflater.inflate(R.layout.lg_item_photo, viewGroup, false)) : new a(layoutInflater.inflate(R.layout.lg_item_loading, viewGroup, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i, List<Object> list) {
        Boolean bool;
        if (getItemViewType(i) == 0) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    bool = 0;
                    break;
                } else {
                    bool = it.next();
                    if (bool instanceof Boolean) {
                        break;
                    }
                }
            }
            Boolean bool2 = bool instanceof Boolean ? bool : null;
            boolean booleanValue = bool2 != null ? bool2.booleanValue() : false;
            b bVar = (b) e0Var;
            q4t q4tVar = this.g.get(i);
            VKImageView vKImageView = bVar.l;
            bwt0.p0(bVar.o, q4tVar instanceof fwz);
            ej0 ej0Var = ej0.this;
            rei0 rei0Var = ej0Var.c;
            boolean c = rei0Var.c(q4tVar);
            AppCompatTextView appCompatTextView = bVar.m;
            appCompatTextView.setText(String.valueOf(rei0Var.b(q4tVar) + 1));
            boolean z = booleanValue;
            xo2.d(28, booleanValue ? 100L : 0L, appCompatTextView);
            bwt0.p0(appCompatTextView, ej0Var.f && c);
            appCompatTextView.setSupportBackgroundTintList(ColorStateList.valueOf(ej0Var.i.invoke(Integer.valueOf(R.attr.vk_legacy_accent)).intValue()));
            bwt0.p0(bVar.n, ej0Var.f);
            vKImageView.animate().scaleX(c ? 0.75f : 1.0f).scaleY(c ? 0.75f : 1.0f).setDuration(z ? 100L : 0L).start();
            vKImageView.O0(q4tVar.d(), ej0Var.d);
        }
    }
}
