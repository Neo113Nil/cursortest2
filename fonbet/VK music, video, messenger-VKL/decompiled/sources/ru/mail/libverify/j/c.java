package ru.mail.libverify.j;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import ru.mail.libverify.R;
import ru.mail.libverify.api.VerificationApi;
import ru.mail.libverify.j.c;
import xsna.dbg0;
import xsna.i6k;
import xsna.sc2;
import xsna.xy9;

/* loaded from: classes9.dex */
public final class c extends ru.mail.libverify.j.a {
    private final long g;
    private final int h;
    private final ArrayList<VerificationApi.SmsItem> i;
    private final VerificationApi.SmsDialogChangedListener j;
    private int k;

    public final class a implements VerificationApi.SmsDialogChangedListener {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(c cVar) {
            c.a(cVar);
        }

        @Override // ru.mail.libverify.api.VerificationApi.SmsDialogChangedListener
        public final void onChanged(VerificationApi.SmsDialogItem smsDialogItem) {
            if (smsDialogItem == null || smsDialogItem.getId() != c.this.g) {
                return;
            }
            Handler e = c.this.e();
            final c cVar = c.this;
            e.post(new Runnable() { // from class: ru.mail.libverify.j.e
                @Override // java.lang.Runnable
                public final void run() {
                    c.a.a(c.this);
                }
            });
        }
    }

    public c(Context context, VerificationApi verificationApi, long j, int i) {
        super(context, verificationApi);
        this.g = j;
        this.h = i;
        this.i = new ArrayList<>(50);
        this.j = new a();
    }

    @Override // ru.mail.libverify.j.a
    public final void a(int i) {
        this.k = i;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        if (this.i.isEmpty()) {
            i();
        }
        return this.i.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        if (i >= this.i.size() / 2) {
            i();
        }
        return this.i.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        if (i >= this.i.size() / 2) {
            i();
        }
        return this.i.get(i).getId();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (i >= this.i.size() / 2) {
            i();
        }
        VerificationApi.SmsItem smsItem = this.i.get(i);
        if (view == null) {
            view = LayoutInflater.from(d()).inflate(this.h, viewGroup, false);
        }
        ((ImageView) view.findViewById(R.id.image)).setColorFilter(a(smsItem.getFrom()));
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.textArea);
        Resources resources = view.getResources();
        int i2 = R.drawable.sms_background;
        ThreadLocal<TypedValue> threadLocal = dbg0.a;
        Drawable drawable = resources.getDrawable(i2, null);
        if (drawable == null) {
            return null;
        }
        drawable.setTint(a(smsItem.getFrom()));
        relativeLayout.setBackground(drawable);
        TextView textView = (TextView) view.findViewById(R.id.text);
        TextView textView2 = (TextView) view.findViewById(R.id.time);
        textView.setText(smsItem.getText());
        textView2.setText(f().format(new Date(smsItem.getTimestamp())));
        return view;
    }

    @Override // ru.mail.libverify.j.a
    public final void j() {
        int i;
        VerificationApi c = c();
        Long valueOf = Long.valueOf(this.g);
        Long valueOf2 = this.i.isEmpty() ? null : Long.valueOf(((VerificationApi.SmsItem) xy9.b(1, this.i)).getId());
        int i2 = 50;
        if (this.i.isEmpty() && (i = this.k) != 0 && i > 50) {
            i2 = 50 + i;
        }
        c.querySms(null, valueOf, valueOf2, Integer.valueOf(i2), new b());
    }

    @Override // ru.mail.libverify.j.a
    public final void a() {
        c().addSmsDialogChangedListener(this.j);
        if (this.i.isEmpty()) {
            return;
        }
        this.k = this.i.size();
        this.i.clear();
        notifyDataSetChanged();
    }

    @Override // ru.mail.libverify.j.a
    public final void b() {
        c().removeSmsDialogChangedListener(this.j);
    }

    public static final class b implements VerificationApi.SmsListener {
        public b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(c cVar, List list) {
            cVar.g();
            if (list.isEmpty()) {
                return;
            }
            cVar.i.addAll(list);
            cVar.notifyDataSetChanged();
        }

        @Override // ru.mail.libverify.api.VerificationApi.SmsListener
        public final void onCompleted(List<VerificationApi.SmsItem> list) {
            c.this.e().post(new i6k(10, c.this, list));
        }

        @Override // ru.mail.libverify.api.VerificationApi.SmsListener
        public final void onError() {
            c.this.e().post(new sc2(c.this, 13));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(c cVar) {
            cVar.h();
        }
    }

    public static final void a(c cVar) {
        cVar.i.clear();
        cVar.notifyDataSetChanged();
    }
}
