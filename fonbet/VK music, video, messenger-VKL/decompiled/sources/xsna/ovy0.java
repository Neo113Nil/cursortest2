package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import xsna.fxy0;
import xsna.igz0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class ovy0 extends RecyclerView {
    public final xty0 b;
    public final androidx.recyclerview.widget.w c;
    public List d;
    public fxy0.a e;
    public final a f;
    public boolean g;
    public boolean h;
    public final b i;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class a implements c {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.ovy0.c
        public final void a(View view, dhz0 dhz0Var) {
            List list;
            ViewParent viewParent = view.getParent();
            while (viewParent != 0 && !(viewParent instanceof xfz0)) {
                viewParent = viewParent.getParent();
            }
            ovy0 ovy0Var = ovy0.this;
            fxy0.a aVar = ovy0Var.e;
            if (aVar == null || (list = ovy0Var.d) == null || viewParent == 0) {
                return;
            }
            wfy0 wfy0Var = (wfy0) list.get(ovy0Var.getCardLayoutManager().getPosition((View) viewParent));
            sgy0 sgy0Var = sgy0.this;
            igz0.a aVar2 = sgy0Var.c;
            if (aVar2 != null) {
                aVar2.b(wfy0Var, null, 2, wn4.d(dhz0Var), sgy0Var.a.getView().getContext());
            }
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class b implements c {
        public b() {
        }

        @Override // xsna.ovy0.c
        public final void a(View view, dhz0 dhz0Var) {
            View findContainingItemView;
            fxy0.a aVar;
            List list;
            ovy0 ovy0Var = ovy0.this;
            if (ovy0Var.g || (findContainingItemView = ovy0Var.getCardLayoutManager().findContainingItemView(view)) == null) {
                return;
            }
            xty0 cardLayoutManager = ovy0Var.getCardLayoutManager();
            int s = cardLayoutManager.s();
            int position = cardLayoutManager.getPosition(findContainingItemView);
            int w = cardLayoutManager.w();
            if ((s > position || position > w) && !ovy0Var.h) {
                ovy0Var.smoothScrollBy(ovy0Var.c.calculateDistanceToFinalSnap(ovy0Var.getCardLayoutManager(), findContainingItemView)[0], 0);
                return;
            }
            if (!view.isClickable() || (aVar = ovy0Var.e) == null || (list = ovy0Var.d) == null) {
                return;
            }
            wfy0 wfy0Var = (wfy0) list.get(ovy0Var.getCardLayoutManager().getPosition(findContainingItemView));
            sgy0 sgy0Var = sgy0.this;
            igz0.a aVar2 = sgy0Var.c;
            if (aVar2 != null) {
                aVar2.b(wfy0Var, null, 1, wn4.d(dhz0Var), sgy0Var.a.getView().getContext());
            }
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public interface c {
        void a(View view, dhz0 dhz0Var);
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static class d extends RecyclerView.Adapter {
        public final Context c;
        public final List d;
        public final ArrayList e = new ArrayList();
        public final boolean f;
        public b g;
        public a h;

        public d(List list, Context context) {
            this.d = list;
            this.c = context;
            this.f = (context.getResources().getConfiguration().screenLayout & 15) >= 3;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.d.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i) {
            if (i == 0) {
                return 1;
            }
            return i == this.d.size() - 1 ? 2 : 0;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0083, code lost:
        
            if (r4.equals(com.ironsource.X3.i.U) == false) goto L10;
         */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
            xfz0 xfz0Var = ((e) e0Var).l;
            wfy0 wfy0Var = (wfy0) this.d.get(i);
            ArrayList arrayList = this.e;
            char c = 1;
            if (!arrayList.contains(wfy0Var)) {
                arrayList.add(wfy0Var);
                h8z0.e(wfy0Var.a, "render", 1, null);
            }
            kiw kiwVar = wfy0Var.t;
            if (kiwVar != null) {
                whz0 smartImageView = xfz0Var.getSmartImageView();
                int i2 = kiwVar.b;
                int i3 = kiwVar.c;
                smartImageView.e = i2;
                smartImageView.d = i3;
                o2z0.e(kiwVar, smartImageView, null);
            }
            xfz0Var.getTitleTextView().setText(wfy0Var.f);
            xfz0Var.getDescriptionTextView().setText(wfy0Var.c);
            xfz0Var.getCtaButtonView().setText(wfy0Var.n());
            xfz0Var.setIsHitMapEnabled(wfy0Var.T.c);
            TextView domainTextView = xfz0Var.getDomainTextView();
            String str = wfy0Var.o;
            qpk0 ratingView = xfz0Var.getRatingView();
            String str2 = wfy0Var.p;
            str2.getClass();
            switch (str2.hashCode()) {
                case 117588:
                    if (str2.equals("web")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 109770977:
                    break;
                case 1223953944:
                    if (str2.equals("webform")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 2:
                    ratingView.setVisibility(8);
                    domainTextView.setVisibility(0);
                    domainTextView.setText(str);
                    break;
                case 1:
                    domainTextView.setVisibility(8);
                    float c2 = wfy0Var.c();
                    if (c2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        ratingView.setVisibility(8);
                        break;
                    } else {
                        ratingView.setVisibility(0);
                        ratingView.setRating(c2);
                        break;
                    }
            }
            xfz0Var.a(this.g, wfy0Var.v, this.h);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new e(new xfz0(this.c, this.f));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onViewRecycled(RecyclerView.e0 e0Var) {
            ((e) e0Var).l.a(null, null, null);
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static class e extends RecyclerView.e0 {
        public final xfz0 l;

        public e(xfz0 xfz0Var) {
            super(xfz0Var);
            this.l = xfz0Var;
        }
    }

    public ovy0(Context context) {
        super(context, null, 0);
        this.f = new a();
        this.i = new b();
        setOverScrollMode(2);
        this.b = new xty0(context);
        androidx.recyclerview.widget.w wVar = new androidx.recyclerview.widget.w();
        this.c = wVar;
        wVar.attachToRecyclerView(this);
    }

    @NonNull
    private List<wfy0> getVisibleCards() {
        int s;
        int w;
        ArrayList arrayList = new ArrayList();
        if (this.d != null && (s = getCardLayoutManager().s()) <= (w = getCardLayoutManager().w()) && s >= 0 && w < this.d.size()) {
            while (s <= w) {
                arrayList.add((wfy0) this.d.get(s));
                s++;
            }
        }
        return arrayList;
    }

    private void setCardLayoutManager(@NonNull xty0 xty0Var) {
        xty0Var.t = new bj50(this, 25);
        super.setLayoutManager(xty0Var);
    }

    public final void a(List list) {
        d dVar = new d(list, getContext());
        this.d = list;
        dVar.g = this.i;
        dVar.h = this.f;
        setCardLayoutManager(this.b);
        setAdapter(dVar);
    }

    public final void c() {
        fxy0.a aVar = this.e;
        if (aVar != null) {
            List<wfy0> visibleCards = getVisibleCards();
            sgy0 sgy0Var = sgy0.this;
            fxy0 fxy0Var = sgy0Var.a;
            ArrayList arrayList = sgy0Var.b;
            String t = c1z0.t(fxy0Var.getView().getContext());
            for (wfy0 wfy0Var : visibleCards) {
                if (!arrayList.contains(wfy0Var)) {
                    arrayList.add(wfy0Var);
                    e5z0 e5z0Var = wfy0Var.a;
                    if (t != null) {
                        h8z0.d(e5z0Var, t);
                    }
                    h8z0.d(e5z0Var, "show");
                }
            }
        }
    }

    @NonNull
    public xty0 getCardLayoutManager() {
        return this.b;
    }

    @NonNull
    public androidx.recyclerview.widget.w getSnapHelper() {
        return this.c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (i3 > i4) {
            this.h = true;
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void onScrollStateChanged(int i) {
        super.onScrollStateChanged(i);
        boolean z = i != 0;
        this.g = z;
        if (z) {
            return;
        }
        c();
    }

    public void setCarouselListener(@Nullable fxy0.a aVar) {
        this.e = aVar;
    }

    public void setSideSlidesMargins(int i) {
        getCardLayoutManager().s = i;
    }
}
