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
import androidx.fragment.app.FragmentManager;
import ru.mail.libverify.R;
import ru.mail.libverify.api.VerificationApi;
import ru.mail.libverify.api.VerificationFactory;
import ru.mail.libverify.i.l;
import ru.mail.libverify.notifications.SettingsActivity;
import xsna.epd;
import xsna.eu;

/* loaded from: classes9.dex */
public final class b extends d {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(b bVar, AdapterView adapterView, View view, int i, long j) {
        VerificationApi.SmsDialogItem smsDialogItem = (VerificationApi.SmsDialogItem) adapterView.getItemAtPosition(i);
        FragmentActivity activity = bVar.getActivity();
        long id = smsDialogItem.getId();
        String from = smsDialogItem.getFrom();
        if (activity instanceof SettingsActivity) {
            SettingsActivity settingsActivity = (SettingsActivity) activity;
            settingsActivity.getClass();
            e eVar = new e();
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", id);
            bundle.putString("dialog_name", from);
            eVar.setArguments(bundle);
            FragmentManager supportFragmentManager = settingsActivity.getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
            aVar.g(R.id.fragment_container, eVar, null);
            aVar.d("history_" + from);
            aVar.k(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(b bVar, AdapterView adapterView, View view, int i, long j) {
        d.a(bVar.requireContext(), ((VerificationApi.SmsDialogItem) adapterView.getItemAtPosition(i)).getFrom(), c.a).show();
        return true;
    }

    @Override // ru.mail.libverify.k.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.fragment_sms_list, viewGroup, false);
        ListView listView = (ListView) inflate.findViewById(R.id.listview);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: xsna.mey0
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                ru.mail.libverify.k.b.a(ru.mail.libverify.k.b.this, adapterView, view, i, j);
            }
        });
        ru.mail.libverify.j.b bVar = new ru.mail.libverify.j.b(requireContext(), VerificationFactory.getInstance(requireContext()), R.layout.sms_dialog_item);
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() { // from class: xsna.pey0
            @Override // android.widget.AdapterView.OnItemLongClickListener
            public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
                boolean b;
                b = ru.mail.libverify.k.b.b(ru.mail.libverify.k.b.this, adapterView, view, i, j);
                return b;
            }
        });
        a(listView, bVar);
        ru.mail.libverify.d0.a.a(requireContext(), ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.UI_NOTIFICATION_HISTORY_OPENED, (Object) null));
        return inflate;
    }

    @Override // ru.mail.libverify.k.d, androidx.fragment.app.Fragment
    public final void onResume() {
        eu supportActionBar;
        super.onResume();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setTitle(getString(R.string.notification_history_text));
        }
        FragmentActivity kn = kn();
        if ((kn instanceof AppCompatActivity) && (supportActionBar = ((AppCompatActivity) kn).getSupportActionBar()) != null) {
            supportActionBar.n(true);
        }
    }

    @Override // ru.mail.libverify.k.d
    public final boolean a(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.history_clear) {
            return false;
        }
        a(kn()).show();
        return true;
    }

    private static AlertDialog a(FragmentActivity fragmentActivity) {
        return l.a(fragmentActivity, new AlertDialog.Builder(fragmentActivity).setTitle(fragmentActivity.getString(R.string.notification_history_delete_all_confirm)).setNegativeButton(fragmentActivity.getString(R.string.notification_event_cancel), (DialogInterface.OnClickListener) null).setPositiveButton(fragmentActivity.getString(R.string.notification_history_delete), new epd(fragmentActivity, 2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Context context, DialogInterface dialogInterface, int i) {
        VerificationFactory.getInstance(context).clearSmsDialogs();
    }
}
