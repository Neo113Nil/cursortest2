package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import xsna.fx10;

/* compiled from: MediaRouteDynamicChooserDialog.java */
/* loaded from: classes12.dex */
public final class zw10 extends b33 {
    public final fx10 h;
    public final c i;
    public final Context j;
    public ex10 k;
    public ArrayList l;
    public d m;
    public RecyclerView n;
    public boolean o;
    public fx10.h p;
    public final long q;
    public long r;
    public final a s;

    /* compiled from: MediaRouteDynamicChooserDialog.java */
    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            List list = (List) message.obj;
            long uptimeMillis = SystemClock.uptimeMillis();
            zw10 zw10Var = zw10.this;
            zw10Var.r = uptimeMillis;
            zw10Var.l.clear();
            zw10Var.l.addAll(list);
            zw10Var.m.x0();
        }
    }

    /* compiled from: MediaRouteDynamicChooserDialog.java */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            zw10.this.dismiss();
        }
    }

    /* compiled from: MediaRouteDynamicChooserDialog.java */
    public final class c extends fx10.a {
        public c() {
        }

        @Override // xsna.fx10.a
        public final void onRouteAdded(@NonNull fx10 fx10Var, @NonNull fx10.h hVar) {
            zw10.this.n();
        }

        @Override // xsna.fx10.a
        public final void onRouteChanged(@NonNull fx10 fx10Var, @NonNull fx10.h hVar) {
            zw10.this.n();
        }

        @Override // xsna.fx10.a
        public final void onRouteRemoved(@NonNull fx10 fx10Var, @NonNull fx10.h hVar) {
            zw10.this.n();
        }

        @Override // xsna.fx10.a
        public final void onRouteSelected(@NonNull fx10 fx10Var, @NonNull fx10.h hVar) {
            zw10.this.dismiss();
        }
    }

    /* compiled from: MediaRouteDynamicChooserDialog.java */
    public final class d extends RecyclerView.Adapter<RecyclerView.e0> {
        public final ArrayList<b> c = new ArrayList<>();
        public final LayoutInflater d;
        public final Drawable e;
        public final Drawable f;
        public final Drawable g;
        public final Drawable h;

        /* compiled from: MediaRouteDynamicChooserDialog.java */
        public class a extends RecyclerView.e0 {
            public TextView l;
        }

        /* compiled from: MediaRouteDynamicChooserDialog.java */
        public class b {
            public final Object a;
            public final int b;

            public b(Object obj) {
                this.a = obj;
                if (obj instanceof String) {
                    this.b = 1;
                } else {
                    if (!(obj instanceof fx10.h)) {
                        throw new IllegalArgumentException();
                    }
                    this.b = 2;
                }
            }
        }

        /* compiled from: MediaRouteDynamicChooserDialog.java */
        public class c extends RecyclerView.e0 {
            public final View l;
            public final ImageView m;
            public final ProgressBar n;
            public final TextView o;

            public c(View view) {
                super(view);
                this.l = view;
                this.m = (ImageView) view.findViewById(R.id.mr_picker_route_icon);
                ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_picker_route_progress_bar);
                this.n = progressBar;
                this.o = (TextView) view.findViewById(R.id.mr_picker_route_name);
                sx10.i(zw10.this.j, progressBar);
            }
        }

        public d() {
            this.d = LayoutInflater.from(zw10.this.j);
            Context context = zw10.this.j;
            this.e = sx10.d(R.attr.mediaRouteDefaultIconDrawable, context);
            this.f = sx10.d(R.attr.mediaRouteTvIconDrawable, context);
            this.g = sx10.d(R.attr.mediaRouteSpeakerIconDrawable, context);
            this.h = sx10.d(R.attr.mediaRouteSpeakerGroupIconDrawable, context);
            x0();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.c.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i) {
            return this.c.get(i).b;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
        
            if (r3 != null) goto L23;
         */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onBindViewHolder(@NonNull RecyclerView.e0 e0Var, int i) {
            Drawable createFromStream;
            int itemViewType = getItemViewType(i);
            b bVar = this.c.get(i);
            if (itemViewType == 1) {
                a aVar = (a) e0Var;
                aVar.getClass();
                aVar.l.setText(bVar.a.toString());
                return;
            }
            if (itemViewType != 2) {
                return;
            }
            c cVar = (c) e0Var;
            cVar.getClass();
            fx10.h hVar = (fx10.h) bVar.a;
            View view = cVar.l;
            view.setVisibility(0);
            cVar.n.setVisibility(4);
            view.setOnClickListener(new ax10(cVar, hVar));
            cVar.o.setText(hVar.d);
            ImageView imageView = cVar.m;
            d dVar = d.this;
            Uri uri = hVar.f;
            if (uri != null) {
                try {
                    createFromStream = Drawable.createFromStream(zw10.this.j.getContentResolver().openInputStream(uri), null);
                } catch (IOException unused) {
                    uri.toString();
                }
            }
            int i2 = hVar.n;
            createFromStream = i2 != 1 ? i2 != 2 ? hVar.e() ? dVar.h : dVar.e : dVar.g : dVar.f;
            imageView.setImageDrawable(createFromStream);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        public final RecyclerView.e0 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            LayoutInflater layoutInflater = this.d;
            if (i != 1) {
                if (i == 2) {
                    return new c(layoutInflater.inflate(R.layout.mr_picker_route_item, viewGroup, false));
                }
                throw new IllegalStateException();
            }
            View inflate = layoutInflater.inflate(R.layout.mr_picker_header_item, viewGroup, false);
            a aVar = new a(inflate);
            aVar.l = (TextView) inflate.findViewById(R.id.mr_picker_header_name);
            return aVar;
        }

        public final void x0() {
            ArrayList<b> arrayList = this.c;
            arrayList.clear();
            zw10 zw10Var = zw10.this;
            arrayList.add(new b(zw10Var.j.getString(R.string.mr_chooser_title)));
            Iterator it = zw10Var.l.iterator();
            while (it.hasNext()) {
                arrayList.add(new b((fx10.h) it.next()));
            }
            notifyDataSetChanged();
        }
    }

    /* compiled from: MediaRouteDynamicChooserDialog.java */
    public static final class e implements Comparator<fx10.h> {
        public static final e b = new e();

        @Override // java.util.Comparator
        public final int compare(fx10.h hVar, fx10.h hVar2) {
            return hVar.d.compareToIgnoreCase(hVar2.d);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zw10(@NonNull Context context) {
        super(r3, r0 == 0 ? sx10.e(r3) : r0);
        ContextThemeWrapper a2 = sx10.a(context, false);
        int g = sx10.g(R.attr.mediaRouteTheme, a2);
        this.k = ex10.c;
        this.s = new a();
        Context context2 = getContext();
        this.h = fx10.d(context2);
        this.i = new c();
        this.j = context2;
        this.q = context2.getResources().getInteger(R.integer.mr_update_routes_delay_ms);
    }

    public final void n() {
        if (this.p == null && this.o) {
            this.h.getClass();
            fx10.b();
            ArrayList arrayList = new ArrayList(fx10.c().j);
            int size = arrayList.size();
            while (true) {
                int i = size - 1;
                if (size <= 0) {
                    break;
                }
                fx10.h hVar = (fx10.h) arrayList.get(i);
                if (hVar.d() || !hVar.g || !hVar.h(this.k)) {
                    arrayList.remove(i);
                }
                size = i;
            }
            Collections.sort(arrayList, e.b);
            long uptimeMillis = SystemClock.uptimeMillis() - this.r;
            long j = this.q;
            if (uptimeMillis < j) {
                a aVar = this.s;
                aVar.removeMessages(1);
                aVar.sendMessageAtTime(aVar.obtainMessage(1, arrayList), this.r + j);
            } else {
                this.r = SystemClock.uptimeMillis();
                this.l.clear();
                this.l.addAll(arrayList);
                this.m.x0();
            }
        }
    }

    public final void o(@NonNull ex10 ex10Var) {
        if (ex10Var == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.k.equals(ex10Var)) {
            return;
        }
        this.k = ex10Var;
        if (this.o) {
            fx10 fx10Var = this.h;
            c cVar = this.i;
            fx10Var.h(cVar);
            fx10Var.a(ex10Var, cVar, 1);
        }
        n();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.o = true;
        this.h.a(this.k, this.i, 1);
        n();
    }

    @Override // xsna.b33, xsna.y8i, android.app.Dialog
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mr_picker_dialog);
        View decorView = getWindow().getDecorView();
        Context context = this.j;
        decorView.setBackgroundColor(context.getColor(sx10.h(context) ? R.color.mr_dynamic_dialog_background_light : R.color.mr_dynamic_dialog_background_dark));
        this.l = new ArrayList();
        ((ImageButton) findViewById(R.id.mr_picker_close_button)).setOnClickListener(new b());
        this.m = new d();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.mr_picker_list);
        this.n = recyclerView;
        recyclerView.setAdapter(this.m);
        this.n.setLayoutManager(new LinearLayoutManager());
        Context context2 = this.j;
        getWindow().setLayout(!context2.getResources().getBoolean(R.bool.is_tablet) ? -1 : xw10.a(context2), context2.getResources().getBoolean(R.bool.is_tablet) ? -2 : -1);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.o = false;
        this.h.h(this.i);
        this.s.removeMessages(1);
    }
}
