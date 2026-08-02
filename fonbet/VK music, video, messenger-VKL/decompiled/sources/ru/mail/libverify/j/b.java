package ru.mail.libverify.j;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import ru.mail.libverify.R;
import ru.mail.libverify.api.VerificationApi;
import ru.mail.libverify.j.b;
import xsna.aw5;
import xsna.tn9;

/* loaded from: classes9.dex */
public final class b extends ru.mail.libverify.j.a {
    private final int g;
    private final VerificationApi.SmsDialogChangedListener h;
    private final ArrayList<VerificationApi.SmsDialogItem> i;

    public final class a implements VerificationApi.SmsDialogChangedListener {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(b bVar) {
            b.a(bVar);
        }

        @Override // ru.mail.libverify.api.VerificationApi.SmsDialogChangedListener
        public final void onChanged(VerificationApi.SmsDialogItem smsDialogItem) {
            Handler e = b.this.e();
            final b bVar = b.this;
            e.post(new Runnable() { // from class: ru.mail.libverify.j.d
                @Override // java.lang.Runnable
                public final void run() {
                    b.a.a(b.this);
                }
            });
        }
    }

    public b(Context context, VerificationApi verificationApi, int i) {
        super(context, verificationApi);
        this.g = i;
        this.h = new a();
        this.i = new ArrayList<>();
    }

    @Override // ru.mail.libverify.j.a
    public final void a() {
        c().addSmsDialogChangedListener(this.h);
        this.i.clear();
        notifyDataSetChanged();
        if (this.i.isEmpty()) {
            i();
        }
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
        return this.i.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return this.i.get(i).getId();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        VerificationApi.SmsDialogItem smsDialogItem = this.i.get(i);
        if (view == null) {
            view = LayoutInflater.from(d()).inflate(this.g, viewGroup, false);
        }
        TextView textView = (TextView) view.findViewById(R.id.name);
        TextView textView2 = (TextView) view.findViewById(R.id.lastText);
        TextView textView3 = (TextView) view.findViewById(R.id.lastTime);
        ((ImageView) view.findViewById(R.id.image)).setColorFilter(a(smsDialogItem.getFrom()));
        textView.setText(smsDialogItem.getFrom());
        String lastText = smsDialogItem.getLastText();
        if (lastText != null && lastText.length() != 0) {
            textView2.setText(smsDialogItem.getLastText());
            textView3.setText(f().format(new Date(smsDialogItem.getLastTimestamp())));
        }
        if (smsDialogItem.hasUnread()) {
            textView.setTypeface(null, 1);
            textView2.setTypeface(null, 1);
            return view;
        }
        textView.setTypeface(null, 0);
        textView2.setTypeface(null, 0);
        return view;
    }

    @Override // ru.mail.libverify.j.a
    public final void j() {
        c().querySmsDialogs(new C2205b());
    }

    @Override // ru.mail.libverify.j.a
    public final void b() {
        c().removeSmsDialogChangedListener(this.h);
    }

    /* renamed from: ru.mail.libverify.j.b$b, reason: collision with other inner class name */
    public static final class C2205b implements VerificationApi.SmsDialogsListener {
        public C2205b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(b bVar, List list) {
            bVar.g();
            if (list.isEmpty()) {
                return;
            }
            bVar.i.addAll(list);
            bVar.notifyDataSetChanged();
        }

        @Override // ru.mail.libverify.api.VerificationApi.SmsDialogsListener
        public final void onCompleted(List<VerificationApi.SmsDialogItem> list) {
            b.this.e().post(new aw5(6, b.this, list));
        }

        @Override // ru.mail.libverify.api.VerificationApi.SmsDialogsListener
        public final void onError() {
            b.this.e().post(new tn9(b.this, 26));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(b bVar) {
            bVar.h();
        }
    }

    public static final void a(b bVar) {
        bVar.i.clear();
        bVar.notifyDataSetChanged();
    }
}
