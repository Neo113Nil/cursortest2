package ru.mail.libverify.k;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.fragment.app.Fragment;
import ru.mail.libverify.R;
import ru.mail.libverify.api.VerificationFactory;
import ru.mail.libverify.i.l;
import xsna.c820;
import xsna.gzs;

/* loaded from: classes9.dex */
public abstract class d extends Fragment {
    private ru.mail.libverify.j.a a;
    private ListView b;
    private int d;
    private final b c = new b();
    private final a e = new a();

    public static final class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            ListView listView;
            super.onChanged();
            d.d(d.this);
            ru.mail.libverify.j.a aVar = d.this.a;
            if (aVar == null || (listView = d.this.b) == null) {
                return;
            }
            if (d.this.d != 0 && aVar.getCount() >= d.this.d) {
                listView.setSelection(d.this.d);
                d.this.d = 0;
            } else if (d.this.d == 0 && aVar.isEmpty()) {
                d.this.d = listView.getFirstVisiblePosition();
            }
        }
    }

    public static final void d(d dVar) {
        dVar.kn().removeMenuProvider(dVar.e);
        dVar.kn().addMenuProvider(dVar.e, dVar.getViewLifecycleOwner());
    }

    public abstract boolean a(MenuItem menuItem);

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.d = bundle.getInt("list_position");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kn().removeMenuProvider(this.e);
        kn().addMenuProvider(this.e, getViewLifecycleOwner());
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        ListView listView = this.b;
        if (listView != null) {
            listView.setAdapter((ListAdapter) null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        ru.mail.libverify.j.a aVar = this.a;
        if (aVar != null) {
            aVar.unregisterDataSetObserver(this.c);
        }
        ru.mail.libverify.j.a aVar2 = this.a;
        if (aVar2 != null) {
            aVar2.b();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ru.mail.libverify.j.a aVar = this.a;
        if (aVar != null) {
            aVar.registerDataSetObserver(this.c);
        }
        ru.mail.libverify.j.a aVar2 = this.a;
        if (aVar2 != null) {
            aVar2.a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ListView listView = this.b;
        if (listView != null) {
            int firstVisiblePosition = listView.getFirstVisiblePosition();
            this.d = firstVisiblePosition;
            bundle.putInt("list_position", firstVisiblePosition);
        }
    }

    public final void a(ListView listView, ru.mail.libverify.j.a aVar) {
        aVar.a(this.d);
        this.a = aVar;
        listView.setAdapter((ListAdapter) aVar);
        this.b = listView;
    }

    public static AlertDialog a(final Context context, final String str, final gzs gzsVar) {
        return l.a(context, new AlertDialog.Builder(context).setTitle(context.getString(R.string.notification_history_delete_confirm, str)).setNegativeButton(context.getString(R.string.notification_event_cancel), (DialogInterface.OnClickListener) null).setPositiveButton(context.getString(R.string.notification_history_delete), new DialogInterface.OnClickListener() { // from class: xsna.xny0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ru.mail.libverify.k.d.a(context, str, gzsVar, dialogInterface, i);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Context context, String str, gzs gzsVar, DialogInterface dialogInterface, int i) {
        VerificationFactory.getInstance(context).removeSmsDialog(str, null);
        gzsVar.invoke();
    }

    public static final class a implements c820 {
        public a() {
        }

        @Override // xsna.c820
        public final void onCreateMenu(Menu menu, MenuInflater menuInflater) {
            menuInflater.inflate(R.menu.sms_dialogs_menu, menu);
            MenuItem findItem = menu.findItem(R.id.history_clear);
            boolean z = (d.this.a == null || d.this.a.getCount() == 0) ? false : true;
            findItem.setEnabled(z);
            findItem.setVisible(z);
        }

        @Override // xsna.c820
        public final boolean onMenuItemSelected(MenuItem menuItem) {
            return d.this.a(menuItem);
        }

        @Override // xsna.c820
        public /* bridge */ /* synthetic */ void onMenuClosed(Menu menu) {
        }

        @Override // xsna.c820
        public /* bridge */ /* synthetic */ void onPrepareMenu(Menu menu) {
        }
    }
}
