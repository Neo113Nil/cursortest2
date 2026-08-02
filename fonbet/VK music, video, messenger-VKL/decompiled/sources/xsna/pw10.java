package xsna;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vkontakte.android.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import xsna.fx10;

/* compiled from: MediaRouteChooserDialog.java */
/* loaded from: classes12.dex */
public final class pw10 extends b33 {
    public final fx10 h;
    public final b i;
    public ex10 j;
    public ArrayList<fx10.h> k;
    public TextView l;
    public TextView m;
    public RelativeLayout n;
    public TextView o;
    public TextView p;
    public LinearLayout q;
    public Button r;
    public ProgressBar s;
    public ListView t;
    public c u;
    public final e v;
    public boolean w;
    public long x;
    public final a y;

    /* compiled from: MediaRouteChooserDialog.java */
    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            pw10 pw10Var = pw10.this;
            a aVar = pw10Var.y;
            int i = message.what;
            if (i == 1) {
                pw10Var.n((List) message.obj);
                return;
            }
            if (i == 2) {
                if (pw10Var.k.isEmpty()) {
                    pw10Var.q(2);
                    aVar.removeMessages(2);
                    aVar.removeMessages(3);
                    aVar.sendMessageDelayed(aVar.obtainMessage(3), 15000L);
                    return;
                }
                return;
            }
            if (i == 3 && pw10Var.k.isEmpty()) {
                pw10Var.q(3);
                aVar.removeMessages(2);
                aVar.removeMessages(3);
                aVar.removeMessages(1);
                pw10Var.h.h(pw10Var.i);
            }
        }
    }

    /* compiled from: MediaRouteChooserDialog.java */
    public final class b extends fx10.a {
        public b() {
        }

        @Override // xsna.fx10.a
        public final void onRouteAdded(@NonNull fx10 fx10Var, @NonNull fx10.h hVar) {
            pw10.this.o();
        }

        @Override // xsna.fx10.a
        public final void onRouteChanged(@NonNull fx10 fx10Var, @NonNull fx10.h hVar) {
            pw10.this.o();
        }

        @Override // xsna.fx10.a
        public final void onRouteRemoved(@NonNull fx10 fx10Var, @NonNull fx10.h hVar) {
            pw10.this.o();
        }

        @Override // xsna.fx10.a
        public final void onRouteSelected(@NonNull fx10 fx10Var, @NonNull fx10.h hVar) {
            pw10.this.dismiss();
        }
    }

    /* compiled from: MediaRouteChooserDialog.java */
    public static final class c extends ArrayAdapter<fx10.h> implements AdapterView.OnItemClickListener {
        public final LayoutInflater b;
        public final Drawable c;
        public final Drawable d;
        public final Drawable e;
        public final Drawable f;

        public c(Context context, ArrayList arrayList) {
            super(context, 0, arrayList);
            this.b = LayoutInflater.from(context);
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.mediaRouteDefaultIconDrawable, R.attr.mediaRouteTvIconDrawable, R.attr.mediaRouteSpeakerIconDrawable, R.attr.mediaRouteSpeakerGroupIconDrawable});
            this.c = m33.a(obtainStyledAttributes.getResourceId(0, 0), context);
            this.d = m33.a(obtainStyledAttributes.getResourceId(1, 0), context);
            this.e = m33.a(obtainStyledAttributes.getResourceId(2, 0), context);
            this.f = m33.a(obtainStyledAttributes.getResourceId(3, 0), context);
            obtainStyledAttributes.recycle();
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public final boolean areAllItemsEnabled() {
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
        
            if (r0 != null) goto L30;
         */
        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        @NonNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final View getView(int i, View view, @NonNull ViewGroup viewGroup) {
            Drawable createFromStream;
            if (view == null) {
                view = this.b.inflate(R.layout.mr_chooser_list_item, viewGroup, false);
            }
            fx10.h item = getItem(i);
            TextView textView = (TextView) view.findViewById(R.id.mr_chooser_route_name);
            TextView textView2 = (TextView) view.findViewById(R.id.mr_chooser_route_desc);
            textView.setText(item.d);
            String str = item.e;
            int i2 = item.i;
            if ((i2 == 2 || i2 == 1) && !TextUtils.isEmpty(str)) {
                textView.setGravity(80);
                textView2.setVisibility(0);
                textView2.setText(str);
            } else {
                textView.setGravity(16);
                textView2.setVisibility(8);
                textView2.setText("");
            }
            view.setEnabled(item.g);
            ImageView imageView = (ImageView) view.findViewById(R.id.mr_chooser_route_icon);
            if (imageView != null) {
                Uri uri = item.f;
                if (uri != null) {
                    try {
                        createFromStream = Drawable.createFromStream(getContext().getContentResolver().openInputStream(uri), null);
                    } catch (IOException unused) {
                        uri.toString();
                    }
                }
                int i3 = item.n;
                createFromStream = i3 != 1 ? i3 != 2 ? item.e() ? this.f : this.c : this.e : this.d;
                imageView.setImageDrawable(createFromStream);
            }
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public final boolean isEnabled(int i) {
            return getItem(i).g;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            fx10.h item = getItem(i);
            ImageView imageView = (ImageView) view.findViewById(R.id.mr_chooser_route_icon);
            ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_chooser_route_progress_bar);
            if (imageView != null && progressBar != null) {
                imageView.setVisibility(8);
                progressBar.setVisibility(0);
            }
            item.l(true);
        }
    }

    /* compiled from: MediaRouteChooserDialog.java */
    public static final class d implements Comparator<fx10.h> {
        public static final d b = new d();

        @Override // java.util.Comparator
        public final int compare(fx10.h hVar, fx10.h hVar2) {
            return hVar.d.compareToIgnoreCase(hVar2.d);
        }
    }

    /* compiled from: MediaRouteChooserDialog.java */
    public final class e extends BroadcastReceiver {
        public e() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                pw10.this.dismiss();
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public pw10(@NonNull Context context) {
        super(r2, r0 == 0 ? sx10.e(r2) : r0);
        ContextThemeWrapper a2 = sx10.a(context, false);
        int g = sx10.g(R.attr.mediaRouteTheme, a2);
        this.j = ex10.c;
        this.y = new a();
        this.h = fx10.d(getContext());
        this.i = new b();
        this.v = new e();
    }

    @Override // xsna.b33, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        try {
            getContext().unregisterReceiver(this.v);
        } catch (IllegalArgumentException unused) {
        }
        super.dismiss();
    }

    public final void n(List<fx10.h> list) {
        this.x = SystemClock.uptimeMillis();
        this.k.clear();
        this.k.addAll(list);
        this.u.notifyDataSetChanged();
        a aVar = this.y;
        aVar.removeMessages(3);
        aVar.removeMessages(2);
        if (!list.isEmpty()) {
            q(1);
        } else {
            q(0);
            aVar.sendMessageDelayed(aVar.obtainMessage(2), 5000L);
        }
    }

    public final void o() {
        if (this.w) {
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
                if (hVar.d() || !hVar.g || !hVar.h(this.j)) {
                    arrayList.remove(i);
                }
                size = i;
            }
            Collections.sort(arrayList, d.b);
            if (SystemClock.uptimeMillis() - this.x >= 300) {
                n(arrayList);
                return;
            }
            a aVar = this.y;
            aVar.removeMessages(1);
            aVar.sendMessageAtTime(aVar.obtainMessage(1, arrayList), this.x + 300);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.w = true;
        this.h.a(this.j, this.i, 1);
        o();
        a aVar = this.y;
        aVar.removeMessages(2);
        aVar.removeMessages(3);
        aVar.removeMessages(1);
        aVar.sendMessageDelayed(aVar.obtainMessage(2), 5000L);
    }

    @Override // xsna.b33, xsna.y8i, android.app.Dialog
    public final void onCreate(@Nullable Bundle bundle) {
        String string;
        boolean z;
        super.onCreate(bundle);
        setContentView(R.layout.mr_chooser_dialog);
        this.k = new ArrayList<>();
        this.u = new c(getContext(), this.k);
        this.l = (TextView) findViewById(R.id.mr_chooser_title);
        this.m = (TextView) findViewById(R.id.mr_chooser_searching);
        this.n = (RelativeLayout) findViewById(R.id.mr_chooser_wifi_warning_container);
        this.o = (TextView) findViewById(R.id.mr_chooser_wifi_warning_description);
        this.p = (TextView) findViewById(R.id.mr_chooser_wifi_learn_more);
        this.q = (LinearLayout) findViewById(R.id.mr_chooser_ok_button_container);
        this.r = (Button) findViewById(R.id.mr_chooser_ok_button);
        this.s = (ProgressBar) findViewById(R.id.mr_chooser_search_progress_bar);
        Context context = getContext();
        boolean z2 = false;
        if (y6m.a == null) {
            if (!y6m.b(context)) {
                PackageManager packageManager = context.getPackageManager();
                if (y6m.e == null) {
                    y6m.e = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
                }
                if (!y6m.e.booleanValue()) {
                    PackageManager packageManager2 = context.getPackageManager();
                    if (y6m.f == null) {
                        y6m.f = Boolean.valueOf(packageManager2.hasSystemFeature("android.hardware.type.automotive"));
                    }
                    if (!y6m.f.booleanValue() && !y6m.c(context)) {
                        z = true;
                        y6m.a = Boolean.valueOf(z);
                    }
                }
            }
            z = false;
            y6m.a = Boolean.valueOf(z);
        }
        if (!y6m.a.booleanValue()) {
            if (y6m.c == null) {
                SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
                if (Build.VERSION.SDK_INT >= 30 && sensorManager != null && sensorManager.getDefaultSensor(36) != null) {
                    z2 = true;
                }
                y6m.c = Boolean.valueOf(z2);
            }
            if (!y6m.c.booleanValue()) {
                if (y6m.b(context) || y6m.a(context.getResources())) {
                    string = context.getString(R.string.mr_chooser_wifi_warning_description_tablet);
                } else if (y6m.c(context)) {
                    string = context.getString(R.string.mr_chooser_wifi_warning_description_tv);
                } else {
                    PackageManager packageManager3 = context.getPackageManager();
                    if (y6m.e == null) {
                        y6m.e = Boolean.valueOf(packageManager3.hasSystemFeature("android.hardware.type.watch"));
                    }
                    if (y6m.e.booleanValue()) {
                        string = context.getString(R.string.mr_chooser_wifi_warning_description_watch);
                    } else {
                        PackageManager packageManager4 = context.getPackageManager();
                        if (y6m.f == null) {
                            y6m.f = Boolean.valueOf(packageManager4.hasSystemFeature("android.hardware.type.automotive"));
                        }
                        string = y6m.f.booleanValue() ? context.getString(R.string.mr_chooser_wifi_warning_description_car) : context.getString(R.string.mr_chooser_wifi_warning_description_unknown);
                    }
                }
                this.o.setText(string);
                this.p.setMovementMethod(LinkMovementMethod.getInstance());
                this.r.setOnClickListener(new i1f(this, 1));
                ListView listView = (ListView) findViewById(R.id.mr_chooser_list);
                this.t = listView;
                listView.setAdapter((ListAdapter) this.u);
                this.t.setOnItemClickListener(this.u);
                this.t.setEmptyView(findViewById(android.R.id.empty));
                getWindow().setLayout(xw10.a(getContext()), -2);
                getContext().registerReceiver(this.v, new IntentFilter("android.intent.action.SCREEN_OFF"));
            }
        }
        string = context.getString(R.string.mr_chooser_wifi_warning_description_phone);
        this.o.setText(string);
        this.p.setMovementMethod(LinkMovementMethod.getInstance());
        this.r.setOnClickListener(new i1f(this, 1));
        ListView listView2 = (ListView) findViewById(R.id.mr_chooser_list);
        this.t = listView2;
        listView2.setAdapter((ListAdapter) this.u);
        this.t.setOnItemClickListener(this.u);
        this.t.setEmptyView(findViewById(android.R.id.empty));
        getWindow().setLayout(xw10.a(getContext()), -2);
        getContext().registerReceiver(this.v, new IntentFilter("android.intent.action.SCREEN_OFF"));
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.w = false;
        this.h.h(this.i);
        a aVar = this.y;
        aVar.removeMessages(1);
        aVar.removeMessages(2);
        aVar.removeMessages(3);
        super.onDetachedFromWindow();
    }

    public final void p(@NonNull ex10 ex10Var) {
        if (ex10Var == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.j.equals(ex10Var)) {
            return;
        }
        this.j = ex10Var;
        if (this.w) {
            fx10 fx10Var = this.h;
            b bVar = this.i;
            fx10Var.h(bVar);
            fx10Var.a(ex10Var, bVar, 1);
        }
        o();
    }

    public final void q(int i) {
        if (i == 0) {
            setTitle(R.string.mr_chooser_title);
            this.t.setVisibility(8);
            this.m.setVisibility(0);
            this.s.setVisibility(0);
            this.q.setVisibility(8);
            this.r.setVisibility(8);
            this.p.setVisibility(8);
            this.n.setVisibility(8);
            return;
        }
        if (i == 1) {
            setTitle(R.string.mr_chooser_title);
            this.t.setVisibility(0);
            this.m.setVisibility(8);
            this.s.setVisibility(8);
            this.q.setVisibility(8);
            this.r.setVisibility(8);
            this.p.setVisibility(8);
            this.n.setVisibility(8);
            return;
        }
        if (i == 2) {
            setTitle(R.string.mr_chooser_title);
            this.t.setVisibility(8);
            this.m.setVisibility(8);
            this.s.setVisibility(0);
            this.q.setVisibility(8);
            this.r.setVisibility(8);
            this.p.setVisibility(4);
            this.n.setVisibility(0);
            return;
        }
        if (i != 3) {
            return;
        }
        setTitle(R.string.mr_chooser_zero_routes_found_title);
        this.t.setVisibility(8);
        this.m.setVisibility(8);
        this.s.setVisibility(8);
        this.q.setVisibility(0);
        this.r.setVisibility(0);
        this.p.setVisibility(0);
        this.n.setVisibility(0);
    }

    @Override // xsna.b33, android.app.Dialog
    public final void setTitle(@Nullable CharSequence charSequence) {
        this.l.setText(charSequence);
    }

    @Override // xsna.b33, android.app.Dialog
    public final void setTitle(int i) {
        this.l.setText(i);
    }
}
