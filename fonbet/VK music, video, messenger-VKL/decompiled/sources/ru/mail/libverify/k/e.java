package ru.mail.libverify.k;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.internal.Lambda;
import ru.mail.libverify.R;
import ru.mail.libverify.api.VerificationApi;
import ru.mail.libverify.api.VerificationFactory;
import ru.mail.libverify.i.l;
import xsna.eu;
import xsna.gzs;
import xsna.s3q0;

/* loaded from: classes9.dex */
public final class e extends d {
    private Long f;
    private String g;

    public static final class a extends Lambda implements gzs<s3q0> {
        final /* synthetic */ AdapterView<?> a;
        final /* synthetic */ e b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AdapterView<?> adapterView, e eVar) {
            super(0);
            this.a = adapterView;
            this.b = eVar;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            if (this.a.getChildCount() == 1) {
                this.b.kn().getSupportFragmentManager().W();
            }
            return s3q0.a;
        }
    }

    public static final class b extends Lambda implements gzs<s3q0> {
        public b() {
            super(0);
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            e.this.kn().getSupportFragmentManager().W();
            return s3q0.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(e eVar, String str, AdapterView adapterView, View view, int i, long j) {
        a(eVar.requireContext(), str, ((VerificationApi.SmsItem) adapterView.getItemAtPosition(i)).getId(), new a(adapterView, eVar)).show();
        return true;
    }

    @Override // ru.mail.libverify.k.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        eu supportActionBar;
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.fragment_sms_list, viewGroup, false);
        final String str = this.g;
        if (str == null) {
            throw new IllegalStateException();
        }
        Long l = this.f;
        if (l == null) {
            throw new IllegalStateException();
        }
        long longValue = l.longValue();
        ListView listView = (ListView) inflate.findViewById(R.id.listview);
        ru.mail.libverify.j.c cVar = new ru.mail.libverify.j.c(requireContext(), VerificationFactory.getInstance(requireContext()), longValue, R.layout.sms_message_item);
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() { // from class: xsna.gsy0
            @Override // android.widget.AdapterView.OnItemLongClickListener
            public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
                boolean a2;
                a2 = ru.mail.libverify.k.e.a(ru.mail.libverify.k.e.this, str, adapterView, view, i, j);
                return a2;
            }
        });
        a(listView, cVar);
        kn().setTitle(str);
        FragmentActivity kn = kn();
        if ((kn instanceof AppCompatActivity) && (supportActionBar = ((AppCompatActivity) kn).getSupportActionBar()) != null) {
            supportActionBar.n(true);
        }
        ru.mail.libverify.d0.a.a(requireContext(), ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.UI_NOTIFICATION_HISTORY_OPENED, str));
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void setArguments(Bundle bundle) {
        super.setArguments(bundle);
        if (this.f == null) {
            this.f = bundle != null ? Long.valueOf(bundle.getLong("dialog_id")) : null;
        }
        if (this.g == null) {
            this.g = bundle != null ? bundle.getString("dialog_name") : null;
        }
    }

    @Override // ru.mail.libverify.k.d
    public final boolean a(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.history_clear) {
            return false;
        }
        String str = this.g;
        if (str == null) {
            return true;
        }
        d.a(kn(), str, new b()).show();
        return true;
    }

    private static AlertDialog a(final Context context, final String str, final long j, final gzs gzsVar) {
        return l.a(context, new AlertDialog.Builder(context).setTitle(context.getString(R.string.notification_history_delete_sms_confirm, str)).setNegativeButton(context.getString(R.string.notification_event_cancel), (DialogInterface.OnClickListener) null).setPositiveButton(context.getString(R.string.notification_history_delete), new DialogInterface.OnClickListener() { // from class: xsna.dsy0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ru.mail.libverify.k.e.a(context, str, j, gzsVar, dialogInterface, i);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Context context, String str, long j, gzs gzsVar, DialogInterface dialogInterface, int i) {
        VerificationFactory.getInstance(context).removeSms(str, null, j);
        gzsVar.invoke();
    }
}
