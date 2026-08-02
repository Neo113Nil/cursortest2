package ru.mail.libverify.notifications;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import java.util.WeakHashMap;
import ru.mail.libverify.R;
import ru.mail.libverify.k.b;
import ru.mail.libverify.n0.e;
import ru.mail.verify.core.utils.FileLog;
import xsna.b0u0;
import xsna.bqx0;
import xsna.epx;
import xsna.h4x;
import xsna.iut0;
import xsna.lyo;
import xsna.r0j0;
import xsna.tk5;

/* loaded from: classes9.dex */
public final class SettingsActivity extends AppCompatActivity {
    public static final /* synthetic */ int a = 0;

    private static void a(View view) {
        r0j0 r0j0Var = new r0j0(0);
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        iut0.d.c(view, r0j0Var);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        lyo.b(this);
        setContentView(R.layout.activity_settings);
        a(findViewById(R.id.root_view));
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        if (getIntent() == null) {
            finish();
            return;
        }
        FileLog.v("SettingsActivity", "create with %s", e.a(getIntent().getExtras()));
        if (bundle == null) {
            if (epx.f(getIntent().getAction(), "ACTION_SHOW_DIALOGS")) {
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                androidx.fragment.app.a b = tk5.b(supportFragmentManager, supportFragmentManager);
                b.g(R.id.fragment_container, new b(), null);
                b.k(false);
                return;
            }
            ru.mail.libverify.k.a aVar = new ru.mail.libverify.k.a();
            aVar.setArguments(getIntent().getExtras());
            FragmentManager supportFragmentManager2 = getSupportFragmentManager();
            supportFragmentManager2.getClass();
            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager2);
            aVar2.g(R.id.fragment_container, aVar, null);
            aVar2.k(false);
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        getOnBackPressedDispatcher().d();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bqx0 a(View view, bqx0 bqx0Var) {
        h4x i = bqx0Var.a.i(647);
        view.setPadding(i.a, i.b, i.c, i.d);
        return bqx0.b;
    }
}
