package xsna;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import com.vk.superapp.api.dto.identity.WebCity;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: VkCitiesAutocompleteAdapter.java */
/* loaded from: classes5.dex */
public final class nku0 extends BaseAdapter implements Filterable {
    public final Filter b;
    public int c = 0;
    public String d = null;
    public final ArrayList e;
    public final ArrayList f;
    public List<WebCity> g;
    public final Handler h;
    public a.RunnableC3402a i;
    public boolean j;
    public final WebCity k;
    public final b l;
    public ArrayList m;

    /* compiled from: VkCitiesAutocompleteAdapter.java */
    public class a extends Filter {

        /* compiled from: VkCitiesAutocompleteAdapter.java */
        /* renamed from: xsna.nku0$a$a, reason: collision with other inner class name */
        public class RunnableC3402a implements Runnable {
            public final /* synthetic */ String b;

            public RunnableC3402a(String str) {
                this.b = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                nku0 nku0Var = nku0.this;
                nku0Var.i = null;
                ArrayList arrayList = nku0Var.e;
                String str = this.b;
                nku0Var.d = str != null ? str.toLowerCase() : null;
                if (str == null && arrayList.size() > 0) {
                    nku0Var.g = arrayList;
                    nku0Var.notifyDataSetChanged();
                    return;
                }
                if (str != null) {
                    ArrayList arrayList2 = nku0Var.f;
                    nku0Var.g = arrayList2;
                    arrayList2.clear();
                    nku0Var.notifyDataSetChanged();
                }
                nku0Var.l.a(nku0Var.c, str).subscribe(new gz50(1, nku0Var, str));
            }
        }

        public a() {
        }

        @Override // android.widget.Filter
        public final Filter.FilterResults performFiltering(CharSequence charSequence) {
            nku0.this.d = ((Object) charSequence) + "";
            return new Filter.FilterResults();
        }

        @Override // android.widget.Filter
        public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            nku0 nku0Var = nku0.this;
            RunnableC3402a runnableC3402a = nku0Var.i;
            String str = null;
            if (runnableC3402a != null) {
                nku0Var.h.removeCallbacks(runnableC3402a);
                nku0Var.i = null;
            }
            if (charSequence != null && charSequence.length() > 0) {
                str = charSequence.toString();
            }
            Handler handler = nku0Var.h;
            RunnableC3402a runnableC3402a2 = new RunnableC3402a(str);
            nku0Var.i = runnableC3402a2;
            handler.postDelayed(runnableC3402a2, 500L);
        }
    }

    /* compiled from: VkCitiesAutocompleteAdapter.java */
    public interface b {
        io.reactivex.rxjava3.core.x<List<WebCity>> a(int i, String str);
    }

    /* compiled from: VkCitiesAutocompleteAdapter.java */
    public class c extends Filter {
        public c() {
        }

        @Override // android.widget.Filter
        public final Filter.FilterResults performFiltering(CharSequence charSequence) {
            Filter.FilterResults filterResults = new Filter.FilterResults();
            String lowerCase = TextUtils.isEmpty(charSequence) ? "" : charSequence.toString().toLowerCase();
            ArrayList arrayList = new ArrayList();
            nku0 nku0Var = nku0.this;
            if (nku0Var.j) {
                arrayList.add(nku0Var.k);
            }
            for (WebCity webCity : nku0Var.m) {
                if (webCity.c.toLowerCase().contains(lowerCase)) {
                    arrayList.add(webCity);
                }
            }
            filterResults.count = arrayList.size();
            filterResults.values = arrayList;
            return filterResults;
        }

        @Override // android.widget.Filter
        public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            List<WebCity> list = (List) filterResults.values;
            nku0 nku0Var = nku0.this;
            nku0Var.g = list;
            nku0Var.notifyDataSetChanged();
        }
    }

    public nku0(Context context, boolean z, b bVar) {
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.f = new ArrayList();
        this.g = arrayList;
        this.m = new ArrayList();
        this.h = new Handler();
        WebCity webCity = new WebCity();
        this.k = webCity;
        webCity.b = 0;
        webCity.c = context.getResources().getString(R.string.vk_not_specified);
        this.b = z ? new c() : new a();
        this.l = bVar;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.g.size();
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        return this.b;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.g.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return this.g.get(i).b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        String str;
        if (view == null) {
            view = View.inflate(viewGroup.getContext(), R.layout.vk_city_list_item, null);
        }
        WebCity webCity = this.g.get(i);
        if (this.d != null) {
            int indexOf = webCity.c.toLowerCase().indexOf(this.d);
            if (indexOf != -1) {
                Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(webCity.c);
                newSpannable.setSpan(new ForegroundColorSpan(viewGroup.getResources().getColorStateList(R.color.vk_btn_link).getDefaultColor()), indexOf, this.d.length() + indexOf, 0);
                str = newSpannable;
            } else {
                str = webCity.c;
            }
        } else {
            str = webCity.c;
        }
        ((TextView) view.findViewById(R.id.city_title)).setText(str);
        ((TextView) view.findViewById(R.id.city_title)).setTypeface(webCity.f ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        String str2 = webCity.e;
        if (str2 == null || webCity.d == null || str2.length() <= 0 || webCity.d.length() <= 0) {
            view.findViewById(R.id.city_subtitle).setVisibility(8);
            return view;
        }
        view.findViewById(R.id.city_subtitle).setVisibility(0);
        ((TextView) view.findViewById(R.id.city_subtitle)).setText(webCity.d + ", " + webCity.e);
        return view;
    }
}
